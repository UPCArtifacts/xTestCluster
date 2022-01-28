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
        double[] doubleArray2 = new double[] { 1, (byte) 10 };
        double[] doubleArray5 = new double[] { 1, (byte) 10 };
        double[] doubleArray8 = new double[] { 1, (byte) 10 };
        double[] doubleArray11 = new double[] { 1, (byte) 10 };
        double[] doubleArray14 = new double[] { 1, (byte) 10 };
        double[] doubleArray17 = new double[] { 1, (byte) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl21 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        java.math.BigDecimal[][] bigDecimalArray22 = bigMatrixImpl21.getData();
        org.apache.commons.math.linear.BigMatrix bigMatrix24 = bigMatrixImpl21.getColumnMatrix((int) (short) 1);
        double[] doubleArray27 = new double[] { 1, (byte) 10 };
        double[] doubleArray30 = new double[] { 1, (byte) 10 };
        double[] doubleArray33 = new double[] { 1, (byte) 10 };
        double[] doubleArray36 = new double[] { 1, (byte) 10 };
        double[] doubleArray39 = new double[] { 1, (byte) 10 };
        double[] doubleArray42 = new double[] { 1, (byte) 10 };
        double[][] doubleArray43 = new double[][] { doubleArray27, doubleArray30, doubleArray33, doubleArray36, doubleArray39, doubleArray42 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl44 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray43);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl45 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray43);
        java.math.BigDecimal bigDecimal48 = bigMatrixImpl45.getEntry(0, (int) (short) 0);
        boolean boolean49 = bigMatrixImpl45.isSingular();
        boolean boolean50 = bigMatrixImpl45.isSingular();
        org.apache.commons.math.linear.BigMatrix bigMatrix51 = bigMatrixImpl21.add((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl45);
        double[] doubleArray54 = new double[] { 1, (byte) 10 };
        double[] doubleArray57 = new double[] { 1, (byte) 10 };
        double[] doubleArray60 = new double[] { 1, (byte) 10 };
        double[] doubleArray63 = new double[] { 1, (byte) 10 };
        double[] doubleArray66 = new double[] { 1, (byte) 10 };
        double[] doubleArray69 = new double[] { 1, (byte) 10 };
        double[][] doubleArray70 = new double[][] { doubleArray54, doubleArray57, doubleArray60, doubleArray63, doubleArray66, doubleArray69 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl71 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray70);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl72 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray70);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl73 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray70);
        java.math.BigDecimal[][] bigDecimalArray74 = bigMatrixImpl73.getData();
        org.apache.commons.math.linear.BigMatrix bigMatrix76 = bigMatrixImpl73.getColumnMatrix((int) (short) 1);
        org.apache.commons.math.linear.BigMatrix bigMatrix78 = bigMatrixImpl73.getRowMatrix(4);
        org.apache.commons.math.linear.BigMatrix bigMatrix80 = bigMatrixImpl73.getRowMatrix((int) (short) 0);
        org.apache.commons.math.linear.BigMatrix bigMatrix81 = bigMatrixImpl45.add((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl73);
        boolean boolean82 = bigMatrixImpl45.isSquare();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(bigDecimalArray22);
        org.junit.Assert.assertNotNull(bigMatrix24);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertNotNull(bigDecimal48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(bigMatrix51);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertNotNull(bigDecimalArray74);
        org.junit.Assert.assertNotNull(bigMatrix76);
        org.junit.Assert.assertNotNull(bigMatrix78);
        org.junit.Assert.assertNotNull(bigMatrix80);
        org.junit.Assert.assertNotNull(bigMatrix81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        double[] doubleArray2 = new double[] { 1, (byte) 10 };
        double[] doubleArray5 = new double[] { 1, (byte) 10 };
        double[] doubleArray8 = new double[] { 1, (byte) 10 };
        double[] doubleArray11 = new double[] { 1, (byte) 10 };
        double[] doubleArray14 = new double[] { 1, (byte) 10 };
        double[] doubleArray17 = new double[] { 1, (byte) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        java.math.BigDecimal bigDecimal23 = bigMatrixImpl20.getEntry(0, (int) (short) 0);
        java.math.BigDecimal[][] bigDecimalArray24 = bigMatrixImpl20.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl26 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray24, false);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl28 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray24, true);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl29 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray24);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl31 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray24, false);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl32 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray24);
        double[] doubleArray35 = new double[] { 1, (byte) 10 };
        double[] doubleArray38 = new double[] { 1, (byte) 10 };
        double[] doubleArray41 = new double[] { 1, (byte) 10 };
        double[] doubleArray44 = new double[] { 1, (byte) 10 };
        double[] doubleArray47 = new double[] { 1, (byte) 10 };
        double[] doubleArray50 = new double[] { 1, (byte) 10 };
        double[][] doubleArray51 = new double[][] { doubleArray35, doubleArray38, doubleArray41, doubleArray44, doubleArray47, doubleArray50 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl52 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray51);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl53 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray51);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl54 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray51);
        int int55 = bigMatrixImpl54.getRoundingMode();
        int int56 = bigMatrixImpl54.getScale();
        org.apache.commons.math.linear.BigMatrix bigMatrix57 = bigMatrixImpl54.transpose();
        double[] doubleArray59 = bigMatrixImpl54.getColumnAsDoubleArray(1);
        double[] doubleArray62 = new double[] { 1, (byte) 10 };
        double[] doubleArray65 = new double[] { 1, (byte) 10 };
        double[] doubleArray68 = new double[] { 1, (byte) 10 };
        double[] doubleArray71 = new double[] { 1, (byte) 10 };
        double[] doubleArray74 = new double[] { 1, (byte) 10 };
        double[] doubleArray77 = new double[] { 1, (byte) 10 };
        double[][] doubleArray78 = new double[][] { doubleArray62, doubleArray65, doubleArray68, doubleArray71, doubleArray74, doubleArray77 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl79 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray78);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl80 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray78);
        boolean boolean81 = bigMatrixImpl80.isSquare();
        java.math.BigDecimal[][] bigDecimalArray82 = bigMatrixImpl80.getDataRef();
        java.math.BigDecimal bigDecimal85 = bigMatrixImpl80.getEntry(1, (int) (short) 1);
        org.apache.commons.math.linear.BigMatrix bigMatrix86 = bigMatrixImpl54.scalarAdd(bigDecimal85);
        org.apache.commons.math.linear.BigMatrix bigMatrix87 = bigMatrixImpl32.scalarAdd(bigDecimal85);
        java.lang.String str88 = bigMatrixImpl32.toString();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertNotNull(bigDecimalArray24);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 4 + "'", int55 == 4);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 64 + "'", int56 == 64);
        org.junit.Assert.assertNotNull(bigMatrix57);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[10.0, 10.0, 10.0, 10.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(bigDecimalArray82);
        org.junit.Assert.assertNotNull(bigDecimal85);
        org.junit.Assert.assertNotNull(bigMatrix86);
        org.junit.Assert.assertNotNull(bigMatrix87);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "BigMatrixImpl{{1,10},{1,10},{1,10},{1,10},{1,10},{1,10}}" + "'", str88, "BigMatrixImpl{{1,10},{1,10},{1,10},{1,10},{1,10},{1,10}}");
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) '4', 100);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        double[] doubleArray2 = new double[] { 1, (byte) 10 };
        double[] doubleArray5 = new double[] { 1, (byte) 10 };
        double[] doubleArray8 = new double[] { 1, (byte) 10 };
        double[] doubleArray11 = new double[] { 1, (byte) 10 };
        double[] doubleArray14 = new double[] { 1, (byte) 10 };
        double[] doubleArray17 = new double[] { 1, (byte) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl21 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        int int22 = bigMatrixImpl21.getRoundingMode();
        int int23 = bigMatrixImpl21.getScale();
        int int24 = bigMatrixImpl21.getScale();
        int int25 = bigMatrixImpl21.getColumnDimension();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 64 + "'", int23 == 64);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 64 + "'", int24 == 64);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        double[] doubleArray2 = new double[] { 1, (byte) 10 };
        double[] doubleArray5 = new double[] { 1, (byte) 10 };
        double[] doubleArray8 = new double[] { 1, (byte) 10 };
        double[] doubleArray11 = new double[] { 1, (byte) 10 };
        double[] doubleArray14 = new double[] { 1, (byte) 10 };
        double[] doubleArray17 = new double[] { 1, (byte) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        int int21 = bigMatrixImpl20.getScale();
        java.math.BigDecimal[][] bigDecimalArray22 = bigMatrixImpl20.getData();
        java.math.BigDecimal[][] bigDecimalArray23 = bigMatrixImpl20.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl25 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray23, true);
        double[] doubleArray28 = new double[] { 1, (byte) 10 };
        double[] doubleArray31 = new double[] { 1, (byte) 10 };
        double[] doubleArray34 = new double[] { 1, (byte) 10 };
        double[] doubleArray37 = new double[] { 1, (byte) 10 };
        double[] doubleArray40 = new double[] { 1, (byte) 10 };
        double[] doubleArray43 = new double[] { 1, (byte) 10 };
        double[][] doubleArray44 = new double[][] { doubleArray28, doubleArray31, doubleArray34, doubleArray37, doubleArray40, doubleArray43 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl45 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray44);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl46 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray44);
        double[] doubleArray49 = new double[] { 1, (byte) 10 };
        double[] doubleArray52 = new double[] { 1, (byte) 10 };
        double[] doubleArray55 = new double[] { 1, (byte) 10 };
        double[] doubleArray58 = new double[] { 1, (byte) 10 };
        double[] doubleArray61 = new double[] { 1, (byte) 10 };
        double[] doubleArray64 = new double[] { 1, (byte) 10 };
        double[][] doubleArray65 = new double[][] { doubleArray49, doubleArray52, doubleArray55, doubleArray58, doubleArray61, doubleArray64 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl66 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray65);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl67 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray65);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl68 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray65);
        int int69 = bigMatrixImpl68.getColumnDimension();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl70 = bigMatrixImpl46.add(bigMatrixImpl68);
        java.lang.String str71 = bigMatrixImpl46.toString();
        int int72 = bigMatrixImpl46.getRoundingMode();
        java.math.BigDecimal[][] bigDecimalArray73 = bigMatrixImpl46.getDataRef();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl74 = bigMatrixImpl25.subtract(bigMatrixImpl46);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 64 + "'", int21 == 64);
        org.junit.Assert.assertNotNull(bigDecimalArray22);
        org.junit.Assert.assertNotNull(bigDecimalArray23);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 2 + "'", int69 == 2);
        org.junit.Assert.assertNotNull(bigMatrixImpl70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "BigMatrixImpl{{1,10},{1,10},{1,10},{1,10},{1,10},{1,10}}" + "'", str71, "BigMatrixImpl{{1,10},{1,10},{1,10},{1,10},{1,10},{1,10}}");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 4 + "'", int72 == 4);
        org.junit.Assert.assertNotNull(bigDecimalArray73);
        org.junit.Assert.assertNotNull(bigMatrixImpl74);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl5 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl6 = realMatrixImpl2.add(realMatrixImpl5);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl9 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = realMatrixImpl9.add(realMatrixImpl12);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl14 = realMatrixImpl2.add(realMatrixImpl12);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = realMatrixImpl2.scalarAdd((double) (byte) 1);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl23 = realMatrixImpl19.add(realMatrixImpl22);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrixImpl22.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        boolean boolean28 = realMatrixImpl22.isSquare();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix35 = realMatrixImpl31.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl34);
        int int36 = realMatrixImpl34.getRowDimension();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl37 = realMatrixImpl22.subtract(realMatrixImpl34);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl38 = realMatrixImpl2.add(realMatrixImpl34);
        double[][] doubleArray39 = realMatrixImpl38.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl42 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl45 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl46 = realMatrixImpl42.add(realMatrixImpl45);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl49 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl52 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl53 = realMatrixImpl49.add(realMatrixImpl52);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl54 = realMatrixImpl42.add(realMatrixImpl52);
        org.apache.commons.math.linear.RealMatrix realMatrix56 = realMatrixImpl42.getColumnMatrix((int) ' ');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl59 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl62 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl63 = realMatrixImpl59.add(realMatrixImpl62);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl66 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix67 = realMatrixImpl62.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl66);
        org.apache.commons.math.linear.RealMatrix realMatrix68 = realMatrixImpl42.add(realMatrix67);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl69 = realMatrixImpl38.subtract(realMatrixImpl42);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl72 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix74 = realMatrixImpl72.scalarAdd((double) 2);
        int int75 = realMatrixImpl72.getRowDimension();
        double double78 = realMatrixImpl72.getEntry((int) (short) 1, 6);
        double double81 = realMatrixImpl72.getEntry(1, (int) (byte) 10);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl84 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl87 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix88 = realMatrixImpl84.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl87);
        int int89 = realMatrixImpl87.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix90 = realMatrixImpl72.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl87);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl91 = realMatrixImpl42.subtract(realMatrixImpl72);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix92 = realMatrixImpl91.inverse();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.InvalidMatrixException; message: coefficient matrix is not square");
        } catch (org.apache.commons.math.linear.InvalidMatrixException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrixImpl6);
        org.junit.Assert.assertNotNull(realMatrixImpl13);
        org.junit.Assert.assertNotNull(realMatrixImpl14);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrixImpl23);
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(realMatrix35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertNotNull(realMatrixImpl37);
        org.junit.Assert.assertNotNull(realMatrixImpl38);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertNotNull(realMatrixImpl46);
        org.junit.Assert.assertNotNull(realMatrixImpl53);
        org.junit.Assert.assertNotNull(realMatrixImpl54);
        org.junit.Assert.assertNotNull(realMatrix56);
        org.junit.Assert.assertNotNull(realMatrixImpl63);
        org.junit.Assert.assertNotNull(realMatrix67);
        org.junit.Assert.assertNotNull(realMatrix68);
        org.junit.Assert.assertNotNull(realMatrixImpl69);
        org.junit.Assert.assertNotNull(realMatrix74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 10 + "'", int75 == 10);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 0.0d + "'", double78 == 0.0d);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 0.0d + "'", double81 == 0.0d);
        org.junit.Assert.assertNotNull(realMatrix88);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 10 + "'", int89 == 10);
        org.junit.Assert.assertNotNull(realMatrix90);
        org.junit.Assert.assertNotNull(realMatrixImpl91);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl5 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix6 = realMatrixImpl2.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl5);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl9 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = realMatrixImpl9.add(realMatrixImpl12);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        boolean boolean18 = realMatrixImpl5.equals((java.lang.Object) realMatrixImpl16);
        double[] doubleArray20 = realMatrixImpl16.getRow((int) (byte) 0);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrixImpl13);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl5 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl6 = realMatrixImpl2.add(realMatrixImpl5);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl9 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = realMatrixImpl9.add(realMatrixImpl12);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl14 = realMatrixImpl2.add(realMatrixImpl12);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = realMatrixImpl2.scalarAdd((double) (byte) 1);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl23 = realMatrixImpl19.add(realMatrixImpl22);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrixImpl22.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        boolean boolean28 = realMatrixImpl22.isSquare();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix35 = realMatrixImpl31.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl34);
        int int36 = realMatrixImpl34.getRowDimension();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl37 = realMatrixImpl22.subtract(realMatrixImpl34);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl38 = realMatrixImpl2.add(realMatrixImpl34);
        org.apache.commons.math.linear.RealMatrix realMatrix39 = realMatrixImpl2.copy();
        boolean boolean40 = realMatrixImpl2.isSquare();
        int int41 = realMatrixImpl2.getColumnDimension();
        org.junit.Assert.assertNotNull(realMatrixImpl6);
        org.junit.Assert.assertNotNull(realMatrixImpl13);
        org.junit.Assert.assertNotNull(realMatrixImpl14);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrixImpl23);
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(realMatrix35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertNotNull(realMatrixImpl37);
        org.junit.Assert.assertNotNull(realMatrixImpl38);
        org.junit.Assert.assertNotNull(realMatrix39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 35 + "'", int41 == 35);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        double[] doubleArray2 = new double[] { 1, (byte) 10 };
        double[] doubleArray5 = new double[] { 1, (byte) 10 };
        double[] doubleArray8 = new double[] { 1, (byte) 10 };
        double[] doubleArray11 = new double[] { 1, (byte) 10 };
        double[] doubleArray14 = new double[] { 1, (byte) 10 };
        double[] doubleArray17 = new double[] { 1, (byte) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        double[] doubleArray23 = new double[] { 1, (byte) 10 };
        double[] doubleArray26 = new double[] { 1, (byte) 10 };
        double[] doubleArray29 = new double[] { 1, (byte) 10 };
        double[] doubleArray32 = new double[] { 1, (byte) 10 };
        double[] doubleArray35 = new double[] { 1, (byte) 10 };
        double[] doubleArray38 = new double[] { 1, (byte) 10 };
        double[][] doubleArray39 = new double[][] { doubleArray23, doubleArray26, doubleArray29, doubleArray32, doubleArray35, doubleArray38 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl40 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray39);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl41 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray39);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl42 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray39);
        int int43 = bigMatrixImpl42.getColumnDimension();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl44 = bigMatrixImpl20.add(bigMatrixImpl42);
        java.math.BigDecimal bigDecimal45 = bigMatrixImpl44.getNorm();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertNotNull(bigMatrixImpl44);
        org.junit.Assert.assertNotNull(bigDecimal45);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl5 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl6 = realMatrixImpl2.add(realMatrixImpl5);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl9 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = realMatrixImpl9.add(realMatrixImpl12);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl14 = realMatrixImpl2.add(realMatrixImpl12);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = realMatrixImpl12.scalarMultiply(1.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = realMatrixImpl12.getEntry((int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: matrix entry does not exist");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrixImpl6);
        org.junit.Assert.assertNotNull(realMatrixImpl13);
        org.junit.Assert.assertNotNull(realMatrixImpl14);
        org.junit.Assert.assertNotNull(realMatrix16);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl5 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl6 = realMatrixImpl2.add(realMatrixImpl5);
        double[] doubleArray8 = realMatrixImpl5.getColumn((int) (byte) 0);
        double[][] doubleArray9 = realMatrixImpl5.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl10 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray9);
        org.junit.Assert.assertNotNull(realMatrixImpl6);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        java.math.BigDecimal bigDecimal0 = null;
        java.math.BigDecimal[] bigDecimalArray1 = new java.math.BigDecimal[] { bigDecimal0 };
        java.math.BigDecimal bigDecimal2 = null;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = null;
        java.math.BigDecimal[] bigDecimalArray5 = new java.math.BigDecimal[] { bigDecimal4 };
        java.math.BigDecimal bigDecimal6 = null;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = null;
        java.math.BigDecimal[] bigDecimalArray9 = new java.math.BigDecimal[] { bigDecimal8 };
        java.math.BigDecimal[][] bigDecimalArray10 = new java.math.BigDecimal[][] { bigDecimalArray1, bigDecimalArray3, bigDecimalArray5, bigDecimalArray7, bigDecimalArray9 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl12 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray10, true);
        bigMatrixImpl12.setRoundingMode((int) (short) 100);
        int int15 = bigMatrixImpl12.getRoundingMode();
        org.junit.Assert.assertNotNull(bigDecimalArray1);
        org.junit.Assert.assertNotNull(bigDecimalArray3);
        org.junit.Assert.assertNotNull(bigDecimalArray5);
        org.junit.Assert.assertNotNull(bigDecimalArray7);
        org.junit.Assert.assertNotNull(bigDecimalArray9);
        org.junit.Assert.assertNotNull(bigDecimalArray10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        double[] doubleArray2 = new double[] { 1, (byte) 10 };
        double[] doubleArray5 = new double[] { 1, (byte) 10 };
        double[] doubleArray8 = new double[] { 1, (byte) 10 };
        double[] doubleArray11 = new double[] { 1, (byte) 10 };
        double[] doubleArray14 = new double[] { 1, (byte) 10 };
        double[] doubleArray17 = new double[] { 1, (byte) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl21 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        java.math.BigDecimal[][] bigDecimalArray22 = bigMatrixImpl21.getData();
        org.apache.commons.math.linear.BigMatrix bigMatrix24 = bigMatrixImpl21.getColumnMatrix((int) (short) 1);
        double[] doubleArray27 = new double[] { 1, (byte) 10 };
        double[] doubleArray30 = new double[] { 1, (byte) 10 };
        double[] doubleArray33 = new double[] { 1, (byte) 10 };
        double[] doubleArray36 = new double[] { 1, (byte) 10 };
        double[] doubleArray39 = new double[] { 1, (byte) 10 };
        double[] doubleArray42 = new double[] { 1, (byte) 10 };
        double[][] doubleArray43 = new double[][] { doubleArray27, doubleArray30, doubleArray33, doubleArray36, doubleArray39, doubleArray42 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl44 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray43);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl45 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray43);
        java.math.BigDecimal bigDecimal48 = bigMatrixImpl45.getEntry(0, (int) (short) 0);
        boolean boolean49 = bigMatrixImpl45.isSingular();
        boolean boolean50 = bigMatrixImpl45.isSingular();
        org.apache.commons.math.linear.BigMatrix bigMatrix51 = bigMatrixImpl21.add((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl45);
        java.math.BigDecimal[] bigDecimalArray53 = bigMatrixImpl21.getColumn((int) (short) 0);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl56 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl59 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl60 = realMatrixImpl56.add(realMatrixImpl59);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl63 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl66 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl67 = realMatrixImpl63.add(realMatrixImpl66);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl68 = realMatrixImpl56.add(realMatrixImpl66);
        org.apache.commons.math.linear.RealMatrix realMatrix70 = realMatrixImpl66.scalarMultiply(1.0d);
        boolean boolean71 = realMatrixImpl66.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix72 = realMatrixImpl66.copy();
        boolean boolean73 = bigMatrixImpl21.equals((java.lang.Object) realMatrix72);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal74 = bigMatrixImpl21.getDeterminant();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.InvalidMatrixException; message: matrix is not square");
        } catch (org.apache.commons.math.linear.InvalidMatrixException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(bigDecimalArray22);
        org.junit.Assert.assertNotNull(bigMatrix24);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertNotNull(bigDecimal48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(bigMatrix51);
        org.junit.Assert.assertNotNull(bigDecimalArray53);
        org.junit.Assert.assertNotNull(realMatrixImpl60);
        org.junit.Assert.assertNotNull(realMatrixImpl67);
        org.junit.Assert.assertNotNull(realMatrixImpl68);
        org.junit.Assert.assertNotNull(realMatrix70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(realMatrix72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        double[] doubleArray2 = new double[] { 1, (byte) 10 };
        double[] doubleArray5 = new double[] { 1, (byte) 10 };
        double[] doubleArray8 = new double[] { 1, (byte) 10 };
        double[] doubleArray11 = new double[] { 1, (byte) 10 };
        double[] doubleArray14 = new double[] { 1, (byte) 10 };
        double[] doubleArray17 = new double[] { 1, (byte) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl21 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        java.math.BigDecimal[][] bigDecimalArray22 = bigMatrixImpl21.getData();
        org.apache.commons.math.linear.BigMatrix bigMatrix24 = bigMatrixImpl21.getColumnMatrix((int) (short) 1);
        org.apache.commons.math.linear.BigMatrix bigMatrix26 = bigMatrixImpl21.getRowMatrix(4);
        double[] doubleArray29 = new double[] { 1, (byte) 10 };
        double[] doubleArray32 = new double[] { 1, (byte) 10 };
        double[] doubleArray35 = new double[] { 1, (byte) 10 };
        double[] doubleArray38 = new double[] { 1, (byte) 10 };
        double[] doubleArray41 = new double[] { 1, (byte) 10 };
        double[] doubleArray44 = new double[] { 1, (byte) 10 };
        double[][] doubleArray45 = new double[][] { doubleArray29, doubleArray32, doubleArray35, doubleArray38, doubleArray41, doubleArray44 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl46 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray45);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl47 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray45);
        double[] doubleArray50 = new double[] { 1, (byte) 10 };
        double[] doubleArray53 = new double[] { 1, (byte) 10 };
        double[] doubleArray56 = new double[] { 1, (byte) 10 };
        double[] doubleArray59 = new double[] { 1, (byte) 10 };
        double[] doubleArray62 = new double[] { 1, (byte) 10 };
        double[] doubleArray65 = new double[] { 1, (byte) 10 };
        double[][] doubleArray66 = new double[][] { doubleArray50, doubleArray53, doubleArray56, doubleArray59, doubleArray62, doubleArray65 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl67 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray66);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl68 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray66);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl69 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray66);
        int int70 = bigMatrixImpl69.getColumnDimension();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl71 = bigMatrixImpl47.add(bigMatrixImpl69);
        java.math.BigDecimal bigDecimal72 = bigMatrixImpl69.getNorm();
        org.apache.commons.math.linear.BigMatrix bigMatrix73 = bigMatrixImpl21.scalarAdd(bigDecimal72);
        int int74 = bigMatrixImpl21.getScale();
        java.math.BigDecimal[][] bigDecimalArray75 = bigMatrixImpl21.getDataRef();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl76 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray75);
        bigMatrixImpl76.setRoundingMode(0);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(bigDecimalArray22);
        org.junit.Assert.assertNotNull(bigMatrix24);
        org.junit.Assert.assertNotNull(bigMatrix26);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 2 + "'", int70 == 2);
        org.junit.Assert.assertNotNull(bigMatrixImpl71);
        org.junit.Assert.assertNotNull(bigDecimal72);
        org.junit.Assert.assertNotNull(bigMatrix73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 64 + "'", int74 == 64);
        org.junit.Assert.assertNotNull(bigDecimalArray75);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        double[] doubleArray2 = new double[] { 1, (byte) 10 };
        double[] doubleArray5 = new double[] { 1, (byte) 10 };
        double[] doubleArray8 = new double[] { 1, (byte) 10 };
        double[] doubleArray11 = new double[] { 1, (byte) 10 };
        double[] doubleArray14 = new double[] { 1, (byte) 10 };
        double[] doubleArray17 = new double[] { 1, (byte) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        java.math.BigDecimal bigDecimal23 = bigMatrixImpl20.getEntry(0, (int) (short) 0);
        java.math.BigDecimal[][] bigDecimalArray24 = bigMatrixImpl20.getData();
        double[] doubleArray27 = new double[] { 1, (byte) 10 };
        double[] doubleArray30 = new double[] { 1, (byte) 10 };
        double[] doubleArray33 = new double[] { 1, (byte) 10 };
        double[] doubleArray36 = new double[] { 1, (byte) 10 };
        double[] doubleArray39 = new double[] { 1, (byte) 10 };
        double[] doubleArray42 = new double[] { 1, (byte) 10 };
        double[][] doubleArray43 = new double[][] { doubleArray27, doubleArray30, doubleArray33, doubleArray36, doubleArray39, doubleArray42 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl44 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray43);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl45 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray43);
        java.math.BigDecimal bigDecimal48 = bigMatrixImpl45.getEntry(0, (int) (short) 0);
        org.apache.commons.math.linear.BigMatrix bigMatrix49 = bigMatrixImpl20.scalarMultiply(bigDecimal48);
        java.math.BigDecimal[] bigDecimalArray51 = bigMatrixImpl20.getRow(2);
        java.lang.String str52 = bigMatrixImpl20.toString();
        java.math.BigDecimal[][] bigDecimalArray53 = bigMatrixImpl20.getDataRef();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl54 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray53);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertNotNull(bigDecimalArray24);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertNotNull(bigDecimal48);
        org.junit.Assert.assertNotNull(bigMatrix49);
        org.junit.Assert.assertNotNull(bigDecimalArray51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "BigMatrixImpl{{1,10},{1,10},{1,10},{1,10},{1,10},{1,10}}" + "'", str52, "BigMatrixImpl{{1,10},{1,10},{1,10},{1,10},{1,10},{1,10}}");
        org.junit.Assert.assertNotNull(bigDecimalArray53);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl5 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl6 = realMatrixImpl2.add(realMatrixImpl5);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl9 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix10 = realMatrixImpl5.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl9);
        boolean boolean11 = realMatrixImpl5.isSquare();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl14 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl17 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl14.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl17);
        int int19 = realMatrixImpl17.getRowDimension();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = realMatrixImpl5.subtract(realMatrixImpl17);
        double[][] doubleArray21 = realMatrixImpl17.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl23 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21, true);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl25 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21, true);
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrixImpl25.scalarAdd((double) (short) 1);
        boolean boolean28 = realMatrixImpl25.isSquare();
        org.junit.Assert.assertNotNull(realMatrixImpl6);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(realMatrixImpl20);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl5 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl6 = realMatrixImpl2.add(realMatrixImpl5);
        double[] doubleArray8 = realMatrixImpl5.getColumn((int) (byte) 0);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl9 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray8);
        double[][] doubleArray10 = realMatrixImpl9.getData();
        double[][] doubleArray11 = realMatrixImpl9.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix13 = realMatrixImpl9.getRowMatrix(0);
        org.junit.Assert.assertNotNull(realMatrixImpl6);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertNotNull(realMatrix13);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        double[] doubleArray2 = new double[] { 1, (byte) 10 };
        double[] doubleArray5 = new double[] { 1, (byte) 10 };
        double[] doubleArray8 = new double[] { 1, (byte) 10 };
        double[] doubleArray11 = new double[] { 1, (byte) 10 };
        double[] doubleArray14 = new double[] { 1, (byte) 10 };
        double[] doubleArray17 = new double[] { 1, (byte) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        int int21 = bigMatrixImpl20.getScale();
        java.math.BigDecimal[][] bigDecimalArray22 = bigMatrixImpl20.getData();
        org.apache.commons.math.linear.BigMatrix bigMatrix23 = bigMatrixImpl20.copy();
        double[] doubleArray26 = new double[] { 1, (byte) 10 };
        double[] doubleArray29 = new double[] { 1, (byte) 10 };
        double[] doubleArray32 = new double[] { 1, (byte) 10 };
        double[] doubleArray35 = new double[] { 1, (byte) 10 };
        double[] doubleArray38 = new double[] { 1, (byte) 10 };
        double[] doubleArray41 = new double[] { 1, (byte) 10 };
        double[][] doubleArray42 = new double[][] { doubleArray26, doubleArray29, doubleArray32, doubleArray35, doubleArray38, doubleArray41 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl43 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray42);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl44 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray42);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl45 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray42);
        java.math.BigDecimal[][] bigDecimalArray46 = bigMatrixImpl45.getData();
        int int47 = bigMatrixImpl45.getRowDimension();
        org.apache.commons.math.linear.BigMatrix bigMatrix48 = bigMatrixImpl20.subtract((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl45);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal49 = bigMatrixImpl45.getDeterminant();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.InvalidMatrixException; message: matrix is not square");
        } catch (org.apache.commons.math.linear.InvalidMatrixException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 64 + "'", int21 == 64);
        org.junit.Assert.assertNotNull(bigDecimalArray22);
        org.junit.Assert.assertNotNull(bigMatrix23);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertNotNull(bigDecimalArray46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 6 + "'", int47 == 6);
        org.junit.Assert.assertNotNull(bigMatrix48);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl5 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl6 = realMatrixImpl2.add(realMatrixImpl5);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl9 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix10 = realMatrixImpl5.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl9);
        boolean boolean11 = realMatrixImpl5.isSquare();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl14 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl17 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl14.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl17);
        int int19 = realMatrixImpl17.getRowDimension();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = realMatrixImpl5.subtract(realMatrixImpl17);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl23 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl27 = realMatrixImpl23.add(realMatrixImpl26);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl30 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = realMatrixImpl30.add(realMatrixImpl33);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl35 = realMatrixImpl23.add(realMatrixImpl33);
        org.apache.commons.math.linear.RealMatrix realMatrix37 = realMatrixImpl23.scalarAdd((double) (byte) 1);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl40 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl43 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl44 = realMatrixImpl40.add(realMatrixImpl43);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl47 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix48 = realMatrixImpl43.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl47);
        boolean boolean49 = realMatrixImpl43.isSquare();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl52 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl55 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix56 = realMatrixImpl52.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl55);
        int int57 = realMatrixImpl55.getRowDimension();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl58 = realMatrixImpl43.subtract(realMatrixImpl55);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl59 = realMatrixImpl23.add(realMatrixImpl55);
        double[][] doubleArray60 = realMatrixImpl59.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl63 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl66 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl67 = realMatrixImpl63.add(realMatrixImpl66);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl70 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl73 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl74 = realMatrixImpl70.add(realMatrixImpl73);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl75 = realMatrixImpl63.add(realMatrixImpl73);
        org.apache.commons.math.linear.RealMatrix realMatrix77 = realMatrixImpl63.getColumnMatrix((int) ' ');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl80 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl83 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl84 = realMatrixImpl80.add(realMatrixImpl83);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl87 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix88 = realMatrixImpl83.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl87);
        org.apache.commons.math.linear.RealMatrix realMatrix89 = realMatrixImpl63.add(realMatrix88);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl90 = realMatrixImpl59.subtract(realMatrixImpl63);
        double[] doubleArray92 = realMatrixImpl90.getRow(4);
        double[] doubleArray93 = realMatrixImpl17.operate(doubleArray92);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl94 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray92);
        org.apache.commons.math.linear.RealMatrix realMatrix95 = realMatrixImpl94.transpose();
        org.junit.Assert.assertNotNull(realMatrixImpl6);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(realMatrixImpl20);
        org.junit.Assert.assertNotNull(realMatrixImpl27);
        org.junit.Assert.assertNotNull(realMatrixImpl34);
        org.junit.Assert.assertNotNull(realMatrixImpl35);
        org.junit.Assert.assertNotNull(realMatrix37);
        org.junit.Assert.assertNotNull(realMatrixImpl44);
        org.junit.Assert.assertNotNull(realMatrix48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(realMatrix56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 10 + "'", int57 == 10);
        org.junit.Assert.assertNotNull(realMatrixImpl58);
        org.junit.Assert.assertNotNull(realMatrixImpl59);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertNotNull(realMatrixImpl67);
        org.junit.Assert.assertNotNull(realMatrixImpl74);
        org.junit.Assert.assertNotNull(realMatrixImpl75);
        org.junit.Assert.assertNotNull(realMatrix77);
        org.junit.Assert.assertNotNull(realMatrixImpl84);
        org.junit.Assert.assertNotNull(realMatrix88);
        org.junit.Assert.assertNotNull(realMatrix89);
        org.junit.Assert.assertNotNull(realMatrixImpl90);
        org.junit.Assert.assertNotNull(doubleArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray92), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray93), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(realMatrix95);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        double[] doubleArray2 = new double[] { 1, (byte) 10 };
        double[] doubleArray5 = new double[] { 1, (byte) 10 };
        double[] doubleArray8 = new double[] { 1, (byte) 10 };
        double[] doubleArray11 = new double[] { 1, (byte) 10 };
        double[] doubleArray14 = new double[] { 1, (byte) 10 };
        double[] doubleArray17 = new double[] { 1, (byte) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl21 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        int int22 = bigMatrixImpl21.getRoundingMode();
        int int23 = bigMatrixImpl21.getScale();
        int int24 = bigMatrixImpl21.getScale();
        java.math.BigDecimal[][] bigDecimalArray25 = bigMatrixImpl21.getDataRef();
        double[] doubleArray28 = new double[] { 1, (byte) 10 };
        double[] doubleArray31 = new double[] { 1, (byte) 10 };
        double[] doubleArray34 = new double[] { 1, (byte) 10 };
        double[] doubleArray37 = new double[] { 1, (byte) 10 };
        double[] doubleArray40 = new double[] { 1, (byte) 10 };
        double[] doubleArray43 = new double[] { 1, (byte) 10 };
        double[][] doubleArray44 = new double[][] { doubleArray28, doubleArray31, doubleArray34, doubleArray37, doubleArray40, doubleArray43 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl45 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray44);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl46 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray44);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl47 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray44);
        int int48 = bigMatrixImpl47.getScale();
        int int49 = bigMatrixImpl47.getRowDimension();
        java.math.BigDecimal[] bigDecimalArray51 = bigMatrixImpl47.getRow(2);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal[] bigDecimalArray52 = bigMatrixImpl21.preMultiply(bigDecimalArray51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: vector has wrong length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 64 + "'", int23 == 64);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 64 + "'", int24 == 64);
        org.junit.Assert.assertNotNull(bigDecimalArray25);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 64 + "'", int48 == 64);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 6 + "'", int49 == 6);
        org.junit.Assert.assertNotNull(bigDecimalArray51);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        double[] doubleArray2 = new double[] { 1, (byte) 10 };
        double[] doubleArray5 = new double[] { 1, (byte) 10 };
        double[] doubleArray8 = new double[] { 1, (byte) 10 };
        double[] doubleArray11 = new double[] { 1, (byte) 10 };
        double[] doubleArray14 = new double[] { 1, (byte) 10 };
        double[] doubleArray17 = new double[] { 1, (byte) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        java.math.BigDecimal bigDecimal23 = bigMatrixImpl20.getEntry(0, (int) (short) 0);
        java.math.BigDecimal[][] bigDecimalArray24 = bigMatrixImpl20.getData();
        org.apache.commons.math.linear.BigMatrix bigMatrix26 = bigMatrixImpl20.getRowMatrix(1);
        java.math.BigDecimal[][] bigDecimalArray27 = bigMatrixImpl20.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl29 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray27, true);
        double[] doubleArray32 = new double[] { 1, (byte) 10 };
        double[] doubleArray35 = new double[] { 1, (byte) 10 };
        double[] doubleArray38 = new double[] { 1, (byte) 10 };
        double[] doubleArray41 = new double[] { 1, (byte) 10 };
        double[] doubleArray44 = new double[] { 1, (byte) 10 };
        double[] doubleArray47 = new double[] { 1, (byte) 10 };
        double[][] doubleArray48 = new double[][] { doubleArray32, doubleArray35, doubleArray38, doubleArray41, doubleArray44, doubleArray47 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl49 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray48);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl50 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray48);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl51 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray48);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl52 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray48);
        double[] doubleArray55 = new double[] { 1, (byte) 10 };
        double[] doubleArray58 = new double[] { 1, (byte) 10 };
        double[] doubleArray61 = new double[] { 1, (byte) 10 };
        double[] doubleArray64 = new double[] { 1, (byte) 10 };
        double[] doubleArray67 = new double[] { 1, (byte) 10 };
        double[] doubleArray70 = new double[] { 1, (byte) 10 };
        double[][] doubleArray71 = new double[][] { doubleArray55, doubleArray58, doubleArray61, doubleArray64, doubleArray67, doubleArray70 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl72 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray71);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl73 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray71);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl74 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray71);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl75 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray71);
        org.apache.commons.math.linear.BigMatrix bigMatrix76 = bigMatrixImpl75.transpose();
        org.apache.commons.math.linear.BigMatrix bigMatrix77 = bigMatrixImpl52.add((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl75);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl78 = bigMatrixImpl29.subtract(bigMatrixImpl75);
        int int79 = bigMatrixImpl29.getRowDimension();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertNotNull(bigDecimalArray24);
        org.junit.Assert.assertNotNull(bigMatrix26);
        org.junit.Assert.assertNotNull(bigDecimalArray27);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertNotNull(bigMatrix76);
        org.junit.Assert.assertNotNull(bigMatrix77);
        org.junit.Assert.assertNotNull(bigMatrixImpl78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 6 + "'", int79 == 6);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (short) 1, (int) 'a');
        double[][] doubleArray3 = realMatrixImpl2.getData();
        double[] doubleArray5 = realMatrixImpl2.getColumn(0);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[0.0]");
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl5 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix6 = realMatrixImpl2.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl5);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl5.getColumnMatrix((int) (short) 1);
        boolean boolean9 = realMatrixImpl5.isSingular();
        int int10 = realMatrixImpl5.getRowDimension();
        int int11 = realMatrixImpl5.getColumnDimension();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl14 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl17 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = realMatrixImpl14.add(realMatrixImpl17);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl21 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl25 = realMatrixImpl21.add(realMatrixImpl24);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = realMatrixImpl14.add(realMatrixImpl24);
        org.apache.commons.math.linear.RealMatrix realMatrix28 = realMatrixImpl14.scalarAdd((double) (byte) 1);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl35 = realMatrixImpl31.add(realMatrixImpl34);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl38 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix39 = realMatrixImpl34.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl38);
        boolean boolean40 = realMatrixImpl34.isSquare();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl43 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl46 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix47 = realMatrixImpl43.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl46);
        int int48 = realMatrixImpl46.getRowDimension();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl49 = realMatrixImpl34.subtract(realMatrixImpl46);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl50 = realMatrixImpl14.add(realMatrixImpl46);
        double[][] doubleArray51 = realMatrixImpl50.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl54 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl57 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl58 = realMatrixImpl54.add(realMatrixImpl57);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl61 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl64 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl65 = realMatrixImpl61.add(realMatrixImpl64);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl66 = realMatrixImpl54.add(realMatrixImpl64);
        org.apache.commons.math.linear.RealMatrix realMatrix68 = realMatrixImpl54.getColumnMatrix((int) ' ');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl71 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl74 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl75 = realMatrixImpl71.add(realMatrixImpl74);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl78 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix79 = realMatrixImpl74.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl78);
        org.apache.commons.math.linear.RealMatrix realMatrix80 = realMatrixImpl54.add(realMatrix79);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl81 = realMatrixImpl50.subtract(realMatrixImpl54);
        org.apache.commons.math.linear.RealMatrix realMatrix83 = realMatrixImpl54.scalarAdd((double) 1L);
        org.apache.commons.math.linear.RealMatrix realMatrix84 = realMatrixImpl5.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl54);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl87 = new org.apache.commons.math.linear.RealMatrixImpl((int) (short) 1, (int) 'a');
        double[][] doubleArray88 = realMatrixImpl87.getData();
        double[][] doubleArray89 = realMatrixImpl87.getDataRef();
        // The following exception was thrown during execution in test generation
        try {
            realMatrixImpl5.setSubMatrix(doubleArray89, 97, 35);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: invalid row or column index selection");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertNotNull(realMatrixImpl18);
        org.junit.Assert.assertNotNull(realMatrixImpl25);
        org.junit.Assert.assertNotNull(realMatrixImpl26);
        org.junit.Assert.assertNotNull(realMatrix28);
        org.junit.Assert.assertNotNull(realMatrixImpl35);
        org.junit.Assert.assertNotNull(realMatrix39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(realMatrix47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 10 + "'", int48 == 10);
        org.junit.Assert.assertNotNull(realMatrixImpl49);
        org.junit.Assert.assertNotNull(realMatrixImpl50);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertNotNull(realMatrixImpl58);
        org.junit.Assert.assertNotNull(realMatrixImpl65);
        org.junit.Assert.assertNotNull(realMatrixImpl66);
        org.junit.Assert.assertNotNull(realMatrix68);
        org.junit.Assert.assertNotNull(realMatrixImpl75);
        org.junit.Assert.assertNotNull(realMatrix79);
        org.junit.Assert.assertNotNull(realMatrix80);
        org.junit.Assert.assertNotNull(realMatrixImpl81);
        org.junit.Assert.assertNotNull(realMatrix83);
        org.junit.Assert.assertNotNull(realMatrix84);
        org.junit.Assert.assertNotNull(doubleArray88);
        org.junit.Assert.assertNotNull(doubleArray89);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (short) 1, (int) 'a');
        double[][] doubleArray3 = realMatrixImpl2.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl4 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) (short) 100, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix3 = bigMatrixImpl2.inverse();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.InvalidMatrixException; message: coefficient matrix is not square");
        } catch (org.apache.commons.math.linear.InvalidMatrixException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        double[] doubleArray2 = new double[] { 1, (byte) 10 };
        double[] doubleArray5 = new double[] { 1, (byte) 10 };
        double[] doubleArray8 = new double[] { 1, (byte) 10 };
        double[] doubleArray11 = new double[] { 1, (byte) 10 };
        double[] doubleArray14 = new double[] { 1, (byte) 10 };
        double[] doubleArray17 = new double[] { 1, (byte) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        java.math.BigDecimal bigDecimal23 = bigMatrixImpl20.getEntry(0, (int) (short) 0);
        java.math.BigDecimal[][] bigDecimalArray24 = bigMatrixImpl20.getData();
        org.apache.commons.math.linear.BigMatrix bigMatrix26 = bigMatrixImpl20.getRowMatrix(1);
        java.math.BigDecimal[][] bigDecimalArray27 = bigMatrixImpl20.getData();
        int int28 = bigMatrixImpl20.getRowDimension();
        java.math.BigDecimal[] bigDecimalArray30 = bigMatrixImpl20.getRow(0);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertNotNull(bigDecimalArray24);
        org.junit.Assert.assertNotNull(bigMatrix26);
        org.junit.Assert.assertNotNull(bigDecimalArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 6 + "'", int28 == 6);
        org.junit.Assert.assertNotNull(bigDecimalArray30);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        double[] doubleArray2 = new double[] { 1, (byte) 10 };
        double[] doubleArray5 = new double[] { 1, (byte) 10 };
        double[] doubleArray8 = new double[] { 1, (byte) 10 };
        double[] doubleArray11 = new double[] { 1, (byte) 10 };
        double[] doubleArray14 = new double[] { 1, (byte) 10 };
        double[] doubleArray17 = new double[] { 1, (byte) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl21 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        java.math.BigDecimal[][] bigDecimalArray22 = bigMatrixImpl21.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl24 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray22, false);
        boolean boolean25 = bigMatrixImpl24.isSingular();
        org.apache.commons.math.linear.BigMatrix bigMatrix26 = bigMatrixImpl24.copy();
        java.math.BigDecimal[] bigDecimalArray28 = bigMatrixImpl24.getColumn((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double31 = bigMatrixImpl24.getEntryAsDouble(10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: matrix entry does not exist");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(bigDecimalArray22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(bigMatrix26);
        org.junit.Assert.assertNotNull(bigDecimalArray28);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        java.math.BigDecimal bigDecimal0 = null;
        java.math.BigDecimal[] bigDecimalArray1 = new java.math.BigDecimal[] { bigDecimal0 };
        java.math.BigDecimal bigDecimal2 = null;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = null;
        java.math.BigDecimal[] bigDecimalArray5 = new java.math.BigDecimal[] { bigDecimal4 };
        java.math.BigDecimal bigDecimal6 = null;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = null;
        java.math.BigDecimal[] bigDecimalArray9 = new java.math.BigDecimal[] { bigDecimal8 };
        java.math.BigDecimal[][] bigDecimalArray10 = new java.math.BigDecimal[][] { bigDecimalArray1, bigDecimalArray3, bigDecimalArray5, bigDecimalArray7, bigDecimalArray9 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl12 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray10, true);
        bigMatrixImpl12.setScale((int) (short) 0);
        bigMatrixImpl12.setRoundingMode(0);
        bigMatrixImpl12.setScale((int) '4');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl21 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl25 = realMatrixImpl21.add(realMatrixImpl24);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl28 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl32 = realMatrixImpl28.add(realMatrixImpl31);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl35 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix36 = realMatrixImpl31.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl35);
        boolean boolean37 = realMatrixImpl31.isSquare();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl40 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl43 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix44 = realMatrixImpl40.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl43);
        int int45 = realMatrixImpl43.getRowDimension();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl46 = realMatrixImpl31.subtract(realMatrixImpl43);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl47 = realMatrixImpl24.subtract(realMatrixImpl46);
        boolean boolean48 = bigMatrixImpl12.equals((java.lang.Object) realMatrixImpl46);
        double[] doubleArray51 = new double[] { 1, (byte) 10 };
        double[] doubleArray54 = new double[] { 1, (byte) 10 };
        double[] doubleArray57 = new double[] { 1, (byte) 10 };
        double[] doubleArray60 = new double[] { 1, (byte) 10 };
        double[] doubleArray63 = new double[] { 1, (byte) 10 };
        double[] doubleArray66 = new double[] { 1, (byte) 10 };
        double[][] doubleArray67 = new double[][] { doubleArray51, doubleArray54, doubleArray57, doubleArray60, doubleArray63, doubleArray66 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl68 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray67);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl69 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray67);
        java.math.BigDecimal bigDecimal72 = bigMatrixImpl69.getEntry(0, (int) (short) 0);
        java.math.BigDecimal[][] bigDecimalArray73 = bigMatrixImpl69.getData();
        org.apache.commons.math.linear.BigMatrix bigMatrix75 = bigMatrixImpl69.getRowMatrix(1);
        java.math.BigDecimal[][] bigDecimalArray76 = bigMatrixImpl69.getData();
        int int77 = bigMatrixImpl69.getRowDimension();
        boolean boolean78 = bigMatrixImpl69.isSingular();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl79 = bigMatrixImpl12.add(bigMatrixImpl69);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: matrix dimension mismatch");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimalArray1);
        org.junit.Assert.assertNotNull(bigDecimalArray3);
        org.junit.Assert.assertNotNull(bigDecimalArray5);
        org.junit.Assert.assertNotNull(bigDecimalArray7);
        org.junit.Assert.assertNotNull(bigDecimalArray9);
        org.junit.Assert.assertNotNull(bigDecimalArray10);
        org.junit.Assert.assertNotNull(realMatrixImpl25);
        org.junit.Assert.assertNotNull(realMatrixImpl32);
        org.junit.Assert.assertNotNull(realMatrix36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(realMatrix44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
        org.junit.Assert.assertNotNull(realMatrixImpl46);
        org.junit.Assert.assertNotNull(realMatrixImpl47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertNotNull(bigDecimal72);
        org.junit.Assert.assertNotNull(bigDecimalArray73);
        org.junit.Assert.assertNotNull(bigMatrix75);
        org.junit.Assert.assertNotNull(bigDecimalArray76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 6 + "'", int77 == 6);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        double[] doubleArray2 = new double[] { 1, (byte) 10 };
        double[] doubleArray5 = new double[] { 1, (byte) 10 };
        double[] doubleArray8 = new double[] { 1, (byte) 10 };
        double[] doubleArray11 = new double[] { 1, (byte) 10 };
        double[] doubleArray14 = new double[] { 1, (byte) 10 };
        double[] doubleArray17 = new double[] { 1, (byte) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        boolean boolean21 = bigMatrixImpl20.isSquare();
        java.math.BigDecimal[][] bigDecimalArray22 = bigMatrixImpl20.getDataRef();
        java.math.BigDecimal[][] bigDecimalArray23 = bigMatrixImpl20.getData();
        double[] doubleArray26 = new double[] { 1, (byte) 10 };
        double[] doubleArray29 = new double[] { 1, (byte) 10 };
        double[] doubleArray32 = new double[] { 1, (byte) 10 };
        double[] doubleArray35 = new double[] { 1, (byte) 10 };
        double[] doubleArray38 = new double[] { 1, (byte) 10 };
        double[] doubleArray41 = new double[] { 1, (byte) 10 };
        double[][] doubleArray42 = new double[][] { doubleArray26, doubleArray29, doubleArray32, doubleArray35, doubleArray38, doubleArray41 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl43 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray42);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl44 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray42);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl45 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray42);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl46 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray42);
        org.apache.commons.math.linear.BigMatrix bigMatrix47 = bigMatrixImpl46.copy();
        boolean boolean48 = bigMatrixImpl20.equals((java.lang.Object) bigMatrixImpl46);
        bigMatrixImpl20.setScale((-1));
        java.math.BigDecimal[] bigDecimalArray52 = bigMatrixImpl20.getColumn((int) (short) 0);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(bigDecimalArray22);
        org.junit.Assert.assertNotNull(bigDecimalArray23);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertNotNull(bigMatrix47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(bigDecimalArray52);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl5 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl6 = realMatrixImpl2.add(realMatrixImpl5);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl9 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = realMatrixImpl9.add(realMatrixImpl12);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        boolean boolean18 = realMatrixImpl12.isSquare();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl21 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix25 = realMatrixImpl21.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl24);
        int int26 = realMatrixImpl24.getRowDimension();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl27 = realMatrixImpl12.subtract(realMatrixImpl24);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl28 = realMatrixImpl5.subtract(realMatrixImpl27);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl35 = realMatrixImpl31.add(realMatrixImpl34);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl38 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix39 = realMatrixImpl34.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl38);
        org.apache.commons.math.linear.RealMatrix realMatrix40 = realMatrixImpl28.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl34);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl43 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl46 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl47 = realMatrixImpl43.add(realMatrixImpl46);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl50 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl53 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl54 = realMatrixImpl50.add(realMatrixImpl53);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl57 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix58 = realMatrixImpl53.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl57);
        boolean boolean59 = realMatrixImpl53.isSquare();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl62 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl65 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix66 = realMatrixImpl62.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl65);
        int int67 = realMatrixImpl65.getRowDimension();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl68 = realMatrixImpl53.subtract(realMatrixImpl65);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl69 = realMatrixImpl46.subtract(realMatrixImpl68);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl72 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl75 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl76 = realMatrixImpl72.add(realMatrixImpl75);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl79 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix80 = realMatrixImpl75.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl79);
        org.apache.commons.math.linear.RealMatrix realMatrix81 = realMatrixImpl69.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl75);
        org.apache.commons.math.linear.RealMatrix realMatrix82 = realMatrixImpl34.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl75);
        double[][] doubleArray83 = realMatrixImpl75.getDataRef();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix85 = realMatrixImpl75.getRowMatrix((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: illegal row argument");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrixImpl6);
        org.junit.Assert.assertNotNull(realMatrixImpl13);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(realMatrix25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertNotNull(realMatrixImpl27);
        org.junit.Assert.assertNotNull(realMatrixImpl28);
        org.junit.Assert.assertNotNull(realMatrixImpl35);
        org.junit.Assert.assertNotNull(realMatrix39);
        org.junit.Assert.assertNotNull(realMatrix40);
        org.junit.Assert.assertNotNull(realMatrixImpl47);
        org.junit.Assert.assertNotNull(realMatrixImpl54);
        org.junit.Assert.assertNotNull(realMatrix58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(realMatrix66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 10 + "'", int67 == 10);
        org.junit.Assert.assertNotNull(realMatrixImpl68);
        org.junit.Assert.assertNotNull(realMatrixImpl69);
        org.junit.Assert.assertNotNull(realMatrixImpl76);
        org.junit.Assert.assertNotNull(realMatrix80);
        org.junit.Assert.assertNotNull(realMatrix81);
        org.junit.Assert.assertNotNull(realMatrix82);
        org.junit.Assert.assertNotNull(doubleArray83);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        double[] doubleArray2 = new double[] { 1, (byte) 10 };
        double[] doubleArray5 = new double[] { 1, (byte) 10 };
        double[] doubleArray8 = new double[] { 1, (byte) 10 };
        double[] doubleArray11 = new double[] { 1, (byte) 10 };
        double[] doubleArray14 = new double[] { 1, (byte) 10 };
        double[] doubleArray17 = new double[] { 1, (byte) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        int int21 = bigMatrixImpl20.getScale();
        java.math.BigDecimal[][] bigDecimalArray22 = bigMatrixImpl20.getData();
        org.apache.commons.math.linear.BigMatrix bigMatrix23 = bigMatrixImpl20.copy();
        int int24 = bigMatrixImpl20.getRowDimension();
        java.math.BigDecimal[][] bigDecimalArray25 = bigMatrixImpl20.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl26 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray25);
        double[] doubleArray29 = new double[] { 1, (byte) 10 };
        double[] doubleArray32 = new double[] { 1, (byte) 10 };
        double[] doubleArray35 = new double[] { 1, (byte) 10 };
        double[] doubleArray38 = new double[] { 1, (byte) 10 };
        double[] doubleArray41 = new double[] { 1, (byte) 10 };
        double[] doubleArray44 = new double[] { 1, (byte) 10 };
        double[][] doubleArray45 = new double[][] { doubleArray29, doubleArray32, doubleArray35, doubleArray38, doubleArray41, doubleArray44 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl46 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray45);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl47 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray45);
        java.math.BigDecimal bigDecimal50 = bigMatrixImpl47.getEntry(0, (int) (short) 0);
        java.math.BigDecimal[][] bigDecimalArray51 = bigMatrixImpl47.getData();
        double[] doubleArray54 = new double[] { 1, (byte) 10 };
        double[] doubleArray57 = new double[] { 1, (byte) 10 };
        double[] doubleArray60 = new double[] { 1, (byte) 10 };
        double[] doubleArray63 = new double[] { 1, (byte) 10 };
        double[] doubleArray66 = new double[] { 1, (byte) 10 };
        double[] doubleArray69 = new double[] { 1, (byte) 10 };
        double[][] doubleArray70 = new double[][] { doubleArray54, doubleArray57, doubleArray60, doubleArray63, doubleArray66, doubleArray69 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl71 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray70);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl72 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray70);
        java.math.BigDecimal bigDecimal75 = bigMatrixImpl72.getEntry(0, (int) (short) 0);
        org.apache.commons.math.linear.BigMatrix bigMatrix76 = bigMatrixImpl47.scalarMultiply(bigDecimal75);
        java.math.BigDecimal[] bigDecimalArray78 = bigMatrixImpl47.getRow(2);
        java.math.BigDecimal[] bigDecimalArray79 = bigMatrixImpl26.operate(bigDecimalArray78);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl80 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray78);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal[] bigDecimalArray82 = bigMatrixImpl80.getColumn((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: illegal column argument");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 64 + "'", int21 == 64);
        org.junit.Assert.assertNotNull(bigDecimalArray22);
        org.junit.Assert.assertNotNull(bigMatrix23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertNotNull(bigDecimalArray25);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertNotNull(bigDecimal50);
        org.junit.Assert.assertNotNull(bigDecimalArray51);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertNotNull(bigDecimal75);
        org.junit.Assert.assertNotNull(bigMatrix76);
        org.junit.Assert.assertNotNull(bigDecimalArray78);
        org.junit.Assert.assertNotNull(bigDecimalArray79);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        double[] doubleArray2 = new double[] { 1, (byte) 10 };
        double[] doubleArray5 = new double[] { 1, (byte) 10 };
        double[] doubleArray8 = new double[] { 1, (byte) 10 };
        double[] doubleArray11 = new double[] { 1, (byte) 10 };
        double[] doubleArray14 = new double[] { 1, (byte) 10 };
        double[] doubleArray17 = new double[] { 1, (byte) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        double[] doubleArray23 = new double[] { 1, (byte) 10 };
        double[] doubleArray26 = new double[] { 1, (byte) 10 };
        double[] doubleArray29 = new double[] { 1, (byte) 10 };
        double[] doubleArray32 = new double[] { 1, (byte) 10 };
        double[] doubleArray35 = new double[] { 1, (byte) 10 };
        double[] doubleArray38 = new double[] { 1, (byte) 10 };
        double[][] doubleArray39 = new double[][] { doubleArray23, doubleArray26, doubleArray29, doubleArray32, doubleArray35, doubleArray38 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl40 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray39);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl41 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray39);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl42 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray39);
        int int43 = bigMatrixImpl42.getColumnDimension();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl44 = bigMatrixImpl20.add(bigMatrixImpl42);
        java.math.BigDecimal bigDecimal45 = bigMatrixImpl42.getNorm();
        double[] doubleArray48 = new double[] { 1, (byte) 10 };
        double[] doubleArray51 = new double[] { 1, (byte) 10 };
        double[] doubleArray54 = new double[] { 1, (byte) 10 };
        double[] doubleArray57 = new double[] { 1, (byte) 10 };
        double[] doubleArray60 = new double[] { 1, (byte) 10 };
        double[] doubleArray63 = new double[] { 1, (byte) 10 };
        double[][] doubleArray64 = new double[][] { doubleArray48, doubleArray51, doubleArray54, doubleArray57, doubleArray60, doubleArray63 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl65 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray64);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl66 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray64);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl67 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray64);
        int int68 = bigMatrixImpl67.getColumnDimension();
        int int69 = bigMatrixImpl67.getScale();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl70 = bigMatrixImpl42.subtract(bigMatrixImpl67);
        bigMatrixImpl70.setRoundingMode(97);
        double[] doubleArray73 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal[] bigDecimalArray74 = bigMatrixImpl70.solve(doubleArray73);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertNotNull(bigMatrixImpl44);
        org.junit.Assert.assertNotNull(bigDecimal45);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 2 + "'", int68 == 2);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 64 + "'", int69 == 64);
        org.junit.Assert.assertNotNull(bigMatrixImpl70);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        double[] doubleArray2 = new double[] { 1, (byte) 10 };
        double[] doubleArray5 = new double[] { 1, (byte) 10 };
        double[] doubleArray8 = new double[] { 1, (byte) 10 };
        double[] doubleArray11 = new double[] { 1, (byte) 10 };
        double[] doubleArray14 = new double[] { 1, (byte) 10 };
        double[] doubleArray17 = new double[] { 1, (byte) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        double[] doubleArray23 = new double[] { 1, (byte) 10 };
        double[] doubleArray26 = new double[] { 1, (byte) 10 };
        double[] doubleArray29 = new double[] { 1, (byte) 10 };
        double[] doubleArray32 = new double[] { 1, (byte) 10 };
        double[] doubleArray35 = new double[] { 1, (byte) 10 };
        double[] doubleArray38 = new double[] { 1, (byte) 10 };
        double[][] doubleArray39 = new double[][] { doubleArray23, doubleArray26, doubleArray29, doubleArray32, doubleArray35, doubleArray38 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl40 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray39);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl41 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray39);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl42 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray39);
        int int43 = bigMatrixImpl42.getColumnDimension();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl44 = bigMatrixImpl20.add(bigMatrixImpl42);
        boolean boolean45 = bigMatrixImpl44.isSquare();
        org.apache.commons.math.linear.BigMatrix bigMatrix46 = bigMatrixImpl44.transpose();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix51 = bigMatrixImpl44.getSubMatrix((int) (short) -1, 4, 0, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: invalid row or column index selection");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertNotNull(bigMatrixImpl44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(bigMatrix46);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        double[] doubleArray2 = new double[] { 1, (byte) 10 };
        double[] doubleArray5 = new double[] { 1, (byte) 10 };
        double[] doubleArray8 = new double[] { 1, (byte) 10 };
        double[] doubleArray11 = new double[] { 1, (byte) 10 };
        double[] doubleArray14 = new double[] { 1, (byte) 10 };
        double[] doubleArray17 = new double[] { 1, (byte) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        java.math.BigDecimal bigDecimal23 = bigMatrixImpl20.getEntry(0, (int) (short) 0);
        java.math.BigDecimal[][] bigDecimalArray24 = bigMatrixImpl20.getData();
        org.apache.commons.math.linear.BigMatrix bigMatrix26 = bigMatrixImpl20.getRowMatrix(1);
        int int27 = bigMatrixImpl20.getColumnDimension();
        int int28 = bigMatrixImpl20.getScale();
        java.math.BigDecimal[][] bigDecimalArray29 = bigMatrixImpl20.getData();
        java.lang.String str30 = bigMatrixImpl20.toString();
        bigMatrixImpl20.setRoundingMode((int) (short) 1);
        double[][] doubleArray33 = bigMatrixImpl20.getDataAsDoubleArray();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl35 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray33, true);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertNotNull(bigDecimalArray24);
        org.junit.Assert.assertNotNull(bigMatrix26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 64 + "'", int28 == 64);
        org.junit.Assert.assertNotNull(bigDecimalArray29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "BigMatrixImpl{{1,10},{1,10},{1,10},{1,10},{1,10},{1,10}}" + "'", str30, "BigMatrixImpl{{1,10},{1,10},{1,10},{1,10},{1,10},{1,10}}");
        org.junit.Assert.assertNotNull(doubleArray33);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl5 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix6 = realMatrixImpl2.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl5);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl9 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = realMatrixImpl9.add(realMatrixImpl12);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        boolean boolean18 = realMatrixImpl5.equals((java.lang.Object) realMatrixImpl16);
        boolean boolean20 = realMatrixImpl5.equals((java.lang.Object) 0.0d);
        int int21 = realMatrixImpl5.getColumnDimension();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl27 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl28 = realMatrixImpl24.add(realMatrixImpl27);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl35 = realMatrixImpl31.add(realMatrixImpl34);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl38 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl41 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl42 = realMatrixImpl38.add(realMatrixImpl41);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl43 = realMatrixImpl31.add(realMatrixImpl41);
        org.apache.commons.math.linear.RealMatrix realMatrix45 = realMatrixImpl31.scalarAdd((double) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix46 = realMatrixImpl28.add(realMatrix45);
        int int47 = realMatrixImpl28.getRowDimension();
        double[][] doubleArray48 = realMatrixImpl28.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl51 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl54 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl55 = realMatrixImpl51.add(realMatrixImpl54);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl58 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl61 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl62 = realMatrixImpl58.add(realMatrixImpl61);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl63 = realMatrixImpl51.add(realMatrixImpl61);
        org.apache.commons.math.linear.RealMatrix realMatrix65 = realMatrixImpl61.scalarMultiply(1.0d);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl68 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl71 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl72 = realMatrixImpl68.add(realMatrixImpl71);
        double[] doubleArray74 = realMatrixImpl71.getColumn((int) (byte) 0);
        boolean boolean76 = realMatrixImpl71.equals((java.lang.Object) 6);
        org.apache.commons.math.linear.RealMatrix realMatrix78 = realMatrixImpl71.getRowMatrix(5);
        double[] doubleArray80 = realMatrixImpl71.getColumn(0);
        double[] doubleArray81 = realMatrixImpl61.preMultiply(doubleArray80);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl82 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray80);
        double[] doubleArray83 = realMatrixImpl28.preMultiply(doubleArray80);
        double[] doubleArray84 = realMatrixImpl5.operate(doubleArray83);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl85 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray83);
        // The following exception was thrown during execution in test generation
        try {
            double double86 = realMatrixImpl85.getDeterminant();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.InvalidMatrixException; message: matrix is not square");
        } catch (org.apache.commons.math.linear.InvalidMatrixException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrixImpl13);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertNotNull(realMatrixImpl28);
        org.junit.Assert.assertNotNull(realMatrixImpl35);
        org.junit.Assert.assertNotNull(realMatrixImpl42);
        org.junit.Assert.assertNotNull(realMatrixImpl43);
        org.junit.Assert.assertNotNull(realMatrix45);
        org.junit.Assert.assertNotNull(realMatrix46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 10 + "'", int47 == 10);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertNotNull(realMatrixImpl55);
        org.junit.Assert.assertNotNull(realMatrixImpl62);
        org.junit.Assert.assertNotNull(realMatrixImpl63);
        org.junit.Assert.assertNotNull(realMatrix65);
        org.junit.Assert.assertNotNull(realMatrixImpl72);
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(realMatrix78);
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray81), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray84), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        double[] doubleArray2 = new double[] { 1, (byte) 10 };
        double[] doubleArray5 = new double[] { 1, (byte) 10 };
        double[] doubleArray8 = new double[] { 1, (byte) 10 };
        double[] doubleArray11 = new double[] { 1, (byte) 10 };
        double[] doubleArray14 = new double[] { 1, (byte) 10 };
        double[] doubleArray17 = new double[] { 1, (byte) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl21 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrix bigMatrix22 = bigMatrixImpl21.transpose();
        double[] doubleArray25 = new double[] { 1, (byte) 10 };
        double[] doubleArray28 = new double[] { 1, (byte) 10 };
        double[] doubleArray31 = new double[] { 1, (byte) 10 };
        double[] doubleArray34 = new double[] { 1, (byte) 10 };
        double[] doubleArray37 = new double[] { 1, (byte) 10 };
        double[] doubleArray40 = new double[] { 1, (byte) 10 };
        double[][] doubleArray41 = new double[][] { doubleArray25, doubleArray28, doubleArray31, doubleArray34, doubleArray37, doubleArray40 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl42 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray41);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl43 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray41);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl44 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray41);
        int int45 = bigMatrixImpl44.getColumnDimension();
        java.math.BigDecimal[][] bigDecimalArray46 = bigMatrixImpl44.getDataRef();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl47 = bigMatrixImpl21.subtract(bigMatrixImpl44);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(bigMatrix22);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2 + "'", int45 == 2);
        org.junit.Assert.assertNotNull(bigDecimalArray46);
        org.junit.Assert.assertNotNull(bigMatrixImpl47);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl5 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl6 = realMatrixImpl2.add(realMatrixImpl5);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl9 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix10 = realMatrixImpl5.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl9);
        boolean boolean11 = realMatrixImpl5.isSquare();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl14 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl17 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl14.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl17);
        int int19 = realMatrixImpl17.getRowDimension();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = realMatrixImpl5.subtract(realMatrixImpl17);
        double[][] doubleArray21 = realMatrixImpl17.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl23 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21, true);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl25 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21, true);
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrixImpl25.scalarAdd((double) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix29 = realMatrixImpl25.scalarAdd(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            realMatrixImpl25.luDecompose();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.InvalidMatrixException; message: LU decomposition requires that the matrix be square.");
        } catch (org.apache.commons.math.linear.InvalidMatrixException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrixImpl6);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(realMatrixImpl20);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertNotNull(realMatrix29);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl5 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl6 = realMatrixImpl2.add(realMatrixImpl5);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl9 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = realMatrixImpl9.add(realMatrixImpl12);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl14 = realMatrixImpl2.add(realMatrixImpl12);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = realMatrixImpl2.copy();
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl2.scalarMultiply((double) (short) -1);
        double[][] doubleArray18 = realMatrixImpl2.getData();
        double[][] doubleArray19 = realMatrixImpl2.getDataRef();
        boolean boolean20 = realMatrixImpl2.isSquare();
        org.junit.Assert.assertNotNull(realMatrixImpl6);
        org.junit.Assert.assertNotNull(realMatrixImpl13);
        org.junit.Assert.assertNotNull(realMatrixImpl14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        double[] doubleArray2 = new double[] { 1, (byte) 10 };
        double[] doubleArray5 = new double[] { 1, (byte) 10 };
        double[] doubleArray8 = new double[] { 1, (byte) 10 };
        double[] doubleArray11 = new double[] { 1, (byte) 10 };
        double[] doubleArray14 = new double[] { 1, (byte) 10 };
        double[] doubleArray17 = new double[] { 1, (byte) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        double[] doubleArray23 = new double[] { 1, (byte) 10 };
        double[] doubleArray26 = new double[] { 1, (byte) 10 };
        double[] doubleArray29 = new double[] { 1, (byte) 10 };
        double[] doubleArray32 = new double[] { 1, (byte) 10 };
        double[] doubleArray35 = new double[] { 1, (byte) 10 };
        double[] doubleArray38 = new double[] { 1, (byte) 10 };
        double[][] doubleArray39 = new double[][] { doubleArray23, doubleArray26, doubleArray29, doubleArray32, doubleArray35, doubleArray38 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl40 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray39);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl41 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray39);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl42 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray39);
        int int43 = bigMatrixImpl42.getColumnDimension();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl44 = bigMatrixImpl20.add(bigMatrixImpl42);
        boolean boolean45 = bigMatrixImpl44.isSquare();
        int int46 = bigMatrixImpl44.getScale();
        org.apache.commons.math.linear.BigMatrix bigMatrix47 = bigMatrixImpl44.copy();
        java.math.BigDecimal[] bigDecimalArray49 = bigMatrixImpl44.getRow(0);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl50 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray49);
        java.math.BigDecimal bigDecimal51 = null;
        java.math.BigDecimal[] bigDecimalArray52 = new java.math.BigDecimal[] { bigDecimal51 };
        java.math.BigDecimal bigDecimal53 = null;
        java.math.BigDecimal[] bigDecimalArray54 = new java.math.BigDecimal[] { bigDecimal53 };
        java.math.BigDecimal bigDecimal55 = null;
        java.math.BigDecimal[] bigDecimalArray56 = new java.math.BigDecimal[] { bigDecimal55 };
        java.math.BigDecimal bigDecimal57 = null;
        java.math.BigDecimal[] bigDecimalArray58 = new java.math.BigDecimal[] { bigDecimal57 };
        java.math.BigDecimal bigDecimal59 = null;
        java.math.BigDecimal[] bigDecimalArray60 = new java.math.BigDecimal[] { bigDecimal59 };
        java.math.BigDecimal[][] bigDecimalArray61 = new java.math.BigDecimal[][] { bigDecimalArray52, bigDecimalArray54, bigDecimalArray56, bigDecimalArray58, bigDecimalArray60 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl63 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray61, true);
        int int64 = bigMatrixImpl63.getRoundingMode();
        bigMatrixImpl63.setScale((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl67 = bigMatrixImpl50.subtract(bigMatrixImpl63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: matrix dimension mismatch");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertNotNull(bigMatrixImpl44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 64 + "'", int46 == 64);
        org.junit.Assert.assertNotNull(bigMatrix47);
        org.junit.Assert.assertNotNull(bigDecimalArray49);
        org.junit.Assert.assertNotNull(bigDecimalArray52);
        org.junit.Assert.assertNotNull(bigDecimalArray54);
        org.junit.Assert.assertNotNull(bigDecimalArray56);
        org.junit.Assert.assertNotNull(bigDecimalArray58);
        org.junit.Assert.assertNotNull(bigDecimalArray60);
        org.junit.Assert.assertNotNull(bigDecimalArray61);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 4 + "'", int64 == 4);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl5 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl6 = realMatrixImpl2.add(realMatrixImpl5);
        double[] doubleArray8 = realMatrixImpl5.getColumn((int) (byte) 0);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl5.copy();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl15 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = realMatrixImpl12.add(realMatrixImpl15);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl23 = realMatrixImpl19.add(realMatrixImpl22);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = realMatrixImpl12.add(realMatrixImpl22);
        org.apache.commons.math.linear.RealMatrix realMatrix26 = realMatrixImpl12.scalarAdd((double) (byte) 1);
        double[] doubleArray28 = realMatrixImpl12.getColumn((int) (short) 10);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl29 = realMatrixImpl5.add(realMatrixImpl12);
        org.apache.commons.math.linear.RealMatrix realMatrix31 = realMatrixImpl29.getColumnMatrix((int) (short) 0);
        double double32 = realMatrixImpl29.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix33 = realMatrixImpl29.transpose();
        org.junit.Assert.assertNotNull(realMatrixImpl6);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrixImpl16);
        org.junit.Assert.assertNotNull(realMatrixImpl23);
        org.junit.Assert.assertNotNull(realMatrixImpl24);
        org.junit.Assert.assertNotNull(realMatrix26);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(realMatrixImpl29);
        org.junit.Assert.assertNotNull(realMatrix31);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertNotNull(realMatrix33);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        double[] doubleArray2 = new double[] { 1, (byte) 10 };
        double[] doubleArray5 = new double[] { 1, (byte) 10 };
        double[] doubleArray8 = new double[] { 1, (byte) 10 };
        double[] doubleArray11 = new double[] { 1, (byte) 10 };
        double[] doubleArray14 = new double[] { 1, (byte) 10 };
        double[] doubleArray17 = new double[] { 1, (byte) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        int int21 = bigMatrixImpl20.getScale();
        java.math.BigDecimal[][] bigDecimalArray22 = bigMatrixImpl20.getData();
        org.apache.commons.math.linear.BigMatrix bigMatrix23 = bigMatrixImpl20.copy();
        int int24 = bigMatrixImpl20.getRowDimension();
        boolean boolean25 = bigMatrixImpl20.isSingular();
        java.math.BigDecimal[][] bigDecimalArray26 = bigMatrixImpl20.getDataRef();
        bigMatrixImpl20.setRoundingMode((int) ' ');
        java.math.BigDecimal[][] bigDecimalArray29 = bigMatrixImpl20.getDataRef();
        double[] doubleArray32 = new double[] { 1, (byte) 10 };
        double[] doubleArray35 = new double[] { 1, (byte) 10 };
        double[] doubleArray38 = new double[] { 1, (byte) 10 };
        double[] doubleArray41 = new double[] { 1, (byte) 10 };
        double[] doubleArray44 = new double[] { 1, (byte) 10 };
        double[] doubleArray47 = new double[] { 1, (byte) 10 };
        double[][] doubleArray48 = new double[][] { doubleArray32, doubleArray35, doubleArray38, doubleArray41, doubleArray44, doubleArray47 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl49 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray48);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl50 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray48);
        int int51 = bigMatrixImpl50.getScale();
        java.math.BigDecimal[][] bigDecimalArray52 = bigMatrixImpl50.getData();
        org.apache.commons.math.linear.BigMatrix bigMatrix53 = bigMatrixImpl50.copy();
        int int54 = bigMatrixImpl50.getRowDimension();
        java.math.BigDecimal[][] bigDecimalArray55 = bigMatrixImpl50.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl56 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray55);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl57 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray55);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl58 = bigMatrixImpl20.subtract(bigMatrixImpl57);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal59 = bigMatrixImpl20.getTrace();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: matrix is not square");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 64 + "'", int21 == 64);
        org.junit.Assert.assertNotNull(bigDecimalArray22);
        org.junit.Assert.assertNotNull(bigMatrix23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(bigDecimalArray26);
        org.junit.Assert.assertNotNull(bigDecimalArray29);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 64 + "'", int51 == 64);
        org.junit.Assert.assertNotNull(bigDecimalArray52);
        org.junit.Assert.assertNotNull(bigMatrix53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 6 + "'", int54 == 6);
        org.junit.Assert.assertNotNull(bigDecimalArray55);
        org.junit.Assert.assertNotNull(bigMatrixImpl58);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl5 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl6 = realMatrixImpl2.add(realMatrixImpl5);
        double[] doubleArray8 = realMatrixImpl5.getColumn((int) (byte) 0);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl9 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray8);
        double[][] doubleArray10 = realMatrixImpl9.getData();
        double double11 = realMatrixImpl9.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix13 = realMatrixImpl9.scalarMultiply((double) 100.0f);
        double[] doubleArray16 = new double[] { 1, (byte) 10 };
        double[] doubleArray19 = new double[] { 1, (byte) 10 };
        double[] doubleArray22 = new double[] { 1, (byte) 10 };
        double[] doubleArray25 = new double[] { 1, (byte) 10 };
        double[] doubleArray28 = new double[] { 1, (byte) 10 };
        double[] doubleArray31 = new double[] { 1, (byte) 10 };
        double[][] doubleArray32 = new double[][] { doubleArray16, doubleArray19, doubleArray22, doubleArray25, doubleArray28, doubleArray31 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl33 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray32);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl34 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray32);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl35 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray32);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl36 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray32);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl38 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32, false);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl39 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        // The following exception was thrown during execution in test generation
        try {
            realMatrixImpl9.setSubMatrix(doubleArray32, (int) ' ', 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: invalid row or column index selection");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrixImpl6);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl5 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl6 = realMatrixImpl2.add(realMatrixImpl5);
        boolean boolean7 = realMatrixImpl6.isSquare();
        int int8 = realMatrixImpl6.getRowDimension();
        double[][] doubleArray9 = realMatrixImpl6.getDataRef();
        double[] doubleArray11 = realMatrixImpl6.getColumn(0);
        org.junit.Assert.assertNotNull(realMatrixImpl6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        double[] doubleArray2 = new double[] { 1, (byte) 10 };
        double[] doubleArray5 = new double[] { 1, (byte) 10 };
        double[] doubleArray8 = new double[] { 1, (byte) 10 };
        double[] doubleArray11 = new double[] { 1, (byte) 10 };
        double[] doubleArray14 = new double[] { 1, (byte) 10 };
        double[] doubleArray17 = new double[] { 1, (byte) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        double[] doubleArray23 = new double[] { 1, (byte) 10 };
        double[] doubleArray26 = new double[] { 1, (byte) 10 };
        double[] doubleArray29 = new double[] { 1, (byte) 10 };
        double[] doubleArray32 = new double[] { 1, (byte) 10 };
        double[] doubleArray35 = new double[] { 1, (byte) 10 };
        double[] doubleArray38 = new double[] { 1, (byte) 10 };
        double[][] doubleArray39 = new double[][] { doubleArray23, doubleArray26, doubleArray29, doubleArray32, doubleArray35, doubleArray38 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl40 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray39);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl41 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray39);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl42 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray39);
        int int43 = bigMatrixImpl42.getColumnDimension();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl44 = bigMatrixImpl20.add(bigMatrixImpl42);
        org.apache.commons.math.linear.BigMatrix bigMatrix45 = bigMatrixImpl44.copy();
        java.lang.Class<?> wildcardClass46 = bigMatrix45.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertNotNull(bigMatrixImpl44);
        org.junit.Assert.assertNotNull(bigMatrix45);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        double[] doubleArray2 = new double[] { 1, (byte) 10 };
        double[] doubleArray5 = new double[] { 1, (byte) 10 };
        double[] doubleArray8 = new double[] { 1, (byte) 10 };
        double[] doubleArray11 = new double[] { 1, (byte) 10 };
        double[] doubleArray14 = new double[] { 1, (byte) 10 };
        double[] doubleArray17 = new double[] { 1, (byte) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl21 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        int int22 = bigMatrixImpl21.getColumnDimension();
        int int23 = bigMatrixImpl21.getScale();
        bigMatrixImpl21.setRoundingMode((int) '#');
        double[] doubleArray28 = new double[] { 1, (byte) 10 };
        double[] doubleArray31 = new double[] { 1, (byte) 10 };
        double[] doubleArray34 = new double[] { 1, (byte) 10 };
        double[] doubleArray37 = new double[] { 1, (byte) 10 };
        double[] doubleArray40 = new double[] { 1, (byte) 10 };
        double[] doubleArray43 = new double[] { 1, (byte) 10 };
        double[][] doubleArray44 = new double[][] { doubleArray28, doubleArray31, doubleArray34, doubleArray37, doubleArray40, doubleArray43 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl45 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray44);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl46 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray44);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl47 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray44);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl48 = bigMatrixImpl21.add(bigMatrixImpl47);
        double[] doubleArray51 = new double[] { 1, (byte) 10 };
        double[] doubleArray54 = new double[] { 1, (byte) 10 };
        double[] doubleArray57 = new double[] { 1, (byte) 10 };
        double[] doubleArray60 = new double[] { 1, (byte) 10 };
        double[] doubleArray63 = new double[] { 1, (byte) 10 };
        double[] doubleArray66 = new double[] { 1, (byte) 10 };
        double[][] doubleArray67 = new double[][] { doubleArray51, doubleArray54, doubleArray57, doubleArray60, doubleArray63, doubleArray66 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl68 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray67);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl69 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray67);
        java.math.BigDecimal bigDecimal72 = bigMatrixImpl69.getEntry(0, (int) (short) 0);
        java.math.BigDecimal[][] bigDecimalArray73 = bigMatrixImpl69.getData();
        org.apache.commons.math.linear.BigMatrix bigMatrix75 = bigMatrixImpl69.getRowMatrix(1);
        java.math.BigDecimal[][] bigDecimalArray76 = bigMatrixImpl69.getDataRef();
        java.math.BigDecimal[] bigDecimalArray78 = bigMatrixImpl69.getColumn((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal[] bigDecimalArray79 = bigMatrixImpl21.operate(bigDecimalArray78);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: vector has wrong length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 64 + "'", int23 == 64);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertNotNull(bigMatrixImpl48);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertNotNull(bigDecimal72);
        org.junit.Assert.assertNotNull(bigDecimalArray73);
        org.junit.Assert.assertNotNull(bigMatrix75);
        org.junit.Assert.assertNotNull(bigDecimalArray76);
        org.junit.Assert.assertNotNull(bigDecimalArray78);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        double[] doubleArray2 = new double[] { 1, (byte) 10 };
        double[] doubleArray5 = new double[] { 1, (byte) 10 };
        double[] doubleArray8 = new double[] { 1, (byte) 10 };
        double[] doubleArray11 = new double[] { 1, (byte) 10 };
        double[] doubleArray14 = new double[] { 1, (byte) 10 };
        double[] doubleArray17 = new double[] { 1, (byte) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        java.math.BigDecimal bigDecimal23 = bigMatrixImpl20.getEntry(0, (int) (short) 0);
        java.math.BigDecimal[][] bigDecimalArray24 = bigMatrixImpl20.getData();
        org.apache.commons.math.linear.BigMatrix bigMatrix26 = bigMatrixImpl20.getRowMatrix(1);
        int int27 = bigMatrixImpl20.getColumnDimension();
        int int28 = bigMatrixImpl20.getScale();
        java.math.BigDecimal[][] bigDecimalArray29 = bigMatrixImpl20.getDataRef();
        java.math.BigDecimal[][] bigDecimalArray30 = null;
        // The following exception was thrown during execution in test generation
        try {
            bigMatrixImpl20.setSubMatrix(bigDecimalArray30, 52, (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: invalid row or column index selection");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertNotNull(bigDecimalArray24);
        org.junit.Assert.assertNotNull(bigMatrix26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 64 + "'", int28 == 64);
        org.junit.Assert.assertNotNull(bigDecimalArray29);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        double[] doubleArray2 = new double[] { 1, (byte) 10 };
        double[] doubleArray5 = new double[] { 1, (byte) 10 };
        double[] doubleArray8 = new double[] { 1, (byte) 10 };
        double[] doubleArray11 = new double[] { 1, (byte) 10 };
        double[] doubleArray14 = new double[] { 1, (byte) 10 };
        double[] doubleArray17 = new double[] { 1, (byte) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        int int21 = bigMatrixImpl20.getScale();
        java.math.BigDecimal[][] bigDecimalArray22 = bigMatrixImpl20.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl24 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray22, false);
        java.math.BigDecimal[][] bigDecimalArray25 = bigMatrixImpl24.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl28 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix32 = realMatrixImpl28.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl31);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl31.getColumnMatrix((int) (short) 1);
        boolean boolean35 = realMatrixImpl31.isSingular();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl38 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl41 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl42 = realMatrixImpl38.add(realMatrixImpl41);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl45 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl48 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl49 = realMatrixImpl45.add(realMatrixImpl48);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl50 = realMatrixImpl38.add(realMatrixImpl48);
        org.apache.commons.math.linear.RealMatrix realMatrix51 = realMatrixImpl31.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl48);
        double[][] doubleArray52 = realMatrixImpl48.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl54 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray52, false);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl57 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl60 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl61 = realMatrixImpl57.add(realMatrixImpl60);
        double[] doubleArray63 = realMatrixImpl60.getColumn((int) (byte) 0);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl64 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray63);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl65 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray63);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl66 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray63);
        double[] doubleArray67 = realMatrixImpl54.preMultiply(doubleArray63);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal[] bigDecimalArray68 = bigMatrixImpl24.solve(doubleArray63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: constant vector has wrong length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 64 + "'", int21 == 64);
        org.junit.Assert.assertNotNull(bigDecimalArray22);
        org.junit.Assert.assertNotNull(bigDecimalArray25);
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(realMatrix34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(realMatrixImpl42);
        org.junit.Assert.assertNotNull(realMatrixImpl49);
        org.junit.Assert.assertNotNull(realMatrixImpl50);
        org.junit.Assert.assertNotNull(realMatrix51);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertNotNull(realMatrixImpl61);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl5 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl6 = realMatrixImpl2.add(realMatrixImpl5);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl9 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = realMatrixImpl9.add(realMatrixImpl12);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        boolean boolean18 = realMatrixImpl12.isSquare();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl21 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix25 = realMatrixImpl21.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl24);
        int int26 = realMatrixImpl24.getRowDimension();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl27 = realMatrixImpl12.subtract(realMatrixImpl24);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl28 = realMatrixImpl5.subtract(realMatrixImpl27);
        boolean boolean29 = realMatrixImpl28.isSquare();
        double[][] doubleArray30 = realMatrixImpl28.getDataRef();
        org.apache.commons.math.linear.RealMatrix realMatrix32 = realMatrixImpl28.getRowMatrix(2);
        double double33 = realMatrixImpl28.getNorm();
        org.junit.Assert.assertNotNull(realMatrixImpl6);
        org.junit.Assert.assertNotNull(realMatrixImpl13);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(realMatrix25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertNotNull(realMatrixImpl27);
        org.junit.Assert.assertNotNull(realMatrixImpl28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        double[] doubleArray2 = new double[] { 1, (byte) 10 };
        double[] doubleArray5 = new double[] { 1, (byte) 10 };
        double[] doubleArray8 = new double[] { 1, (byte) 10 };
        double[] doubleArray11 = new double[] { 1, (byte) 10 };
        double[] doubleArray14 = new double[] { 1, (byte) 10 };
        double[] doubleArray17 = new double[] { 1, (byte) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl21 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray18, true);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl25 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl28 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix32 = realMatrixImpl28.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl31);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl31.getColumnMatrix((int) (short) 1);
        boolean boolean35 = realMatrixImpl31.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix37 = realMatrixImpl31.getColumnMatrix((int) (byte) 10);
        org.apache.commons.math.linear.RealMatrix realMatrix39 = realMatrixImpl31.scalarMultiply((double) 'a');
        double double40 = realMatrixImpl31.getNorm();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl43 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl46 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl47 = realMatrixImpl43.add(realMatrixImpl46);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl50 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl53 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl54 = realMatrixImpl50.add(realMatrixImpl53);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl55 = realMatrixImpl43.add(realMatrixImpl53);
        org.apache.commons.math.linear.RealMatrix realMatrix57 = realMatrixImpl43.scalarAdd((double) (byte) 1);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl60 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl63 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl64 = realMatrixImpl60.add(realMatrixImpl63);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl67 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix68 = realMatrixImpl63.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl67);
        boolean boolean69 = realMatrixImpl63.isSquare();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl72 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl75 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix76 = realMatrixImpl72.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl75);
        int int77 = realMatrixImpl75.getRowDimension();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl78 = realMatrixImpl63.subtract(realMatrixImpl75);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl79 = realMatrixImpl43.add(realMatrixImpl75);
        double[][] doubleArray80 = realMatrixImpl79.getData();
        double[][] doubleArray81 = realMatrixImpl79.getData();
        boolean boolean82 = realMatrixImpl31.equals((java.lang.Object) realMatrixImpl79);
        int int83 = realMatrixImpl79.getRowDimension();
        boolean boolean84 = realMatrixImpl79.isSquare();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl85 = realMatrixImpl25.subtract(realMatrixImpl79);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: matrix dimension mismatch");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(realMatrix34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(realMatrix37);
        org.junit.Assert.assertNotNull(realMatrix39);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertNotNull(realMatrixImpl47);
        org.junit.Assert.assertNotNull(realMatrixImpl54);
        org.junit.Assert.assertNotNull(realMatrixImpl55);
        org.junit.Assert.assertNotNull(realMatrix57);
        org.junit.Assert.assertNotNull(realMatrixImpl64);
        org.junit.Assert.assertNotNull(realMatrix68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(realMatrix76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 10 + "'", int77 == 10);
        org.junit.Assert.assertNotNull(realMatrixImpl78);
        org.junit.Assert.assertNotNull(realMatrixImpl79);
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 10 + "'", int83 == 10);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        double[] doubleArray2 = new double[] { 1, (byte) 10 };
        double[] doubleArray5 = new double[] { 1, (byte) 10 };
        double[] doubleArray8 = new double[] { 1, (byte) 10 };
        double[] doubleArray11 = new double[] { 1, (byte) 10 };
        double[] doubleArray14 = new double[] { 1, (byte) 10 };
        double[] doubleArray17 = new double[] { 1, (byte) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        double[] doubleArray23 = new double[] { 1, (byte) 10 };
        double[] doubleArray26 = new double[] { 1, (byte) 10 };
        double[] doubleArray29 = new double[] { 1, (byte) 10 };
        double[] doubleArray32 = new double[] { 1, (byte) 10 };
        double[] doubleArray35 = new double[] { 1, (byte) 10 };
        double[] doubleArray38 = new double[] { 1, (byte) 10 };
        double[][] doubleArray39 = new double[][] { doubleArray23, doubleArray26, doubleArray29, doubleArray32, doubleArray35, doubleArray38 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl40 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray39);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl41 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray39);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl42 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray39);
        int int43 = bigMatrixImpl42.getColumnDimension();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl44 = bigMatrixImpl20.add(bigMatrixImpl42);
        org.apache.commons.math.linear.BigMatrix bigMatrix46 = bigMatrixImpl20.getColumnMatrix(0);
        java.math.BigDecimal[][] bigDecimalArray47 = bigMatrixImpl20.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl49 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray47, true);
        bigMatrixImpl49.setRoundingMode((int) '4');
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertNotNull(bigMatrixImpl44);
        org.junit.Assert.assertNotNull(bigMatrix46);
        org.junit.Assert.assertNotNull(bigDecimalArray47);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        double[] doubleArray2 = new double[] { 1, (byte) 10 };
        double[] doubleArray5 = new double[] { 1, (byte) 10 };
        double[] doubleArray8 = new double[] { 1, (byte) 10 };
        double[] doubleArray11 = new double[] { 1, (byte) 10 };
        double[] doubleArray14 = new double[] { 1, (byte) 10 };
        double[] doubleArray17 = new double[] { 1, (byte) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray18, false);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = realMatrixImpl22.scalarAdd((double) (byte) 10);
        double[][] doubleArray25 = realMatrixImpl22.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl29 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl32 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = realMatrixImpl29.add(realMatrixImpl32);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl36 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl39 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl40 = realMatrixImpl36.add(realMatrixImpl39);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl43 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl46 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl47 = realMatrixImpl43.add(realMatrixImpl46);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl48 = realMatrixImpl36.add(realMatrixImpl46);
        org.apache.commons.math.linear.RealMatrix realMatrix50 = realMatrixImpl36.scalarAdd((double) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix51 = realMatrixImpl33.add(realMatrix50);
        double[] doubleArray53 = realMatrixImpl33.getRow((int) (byte) 1);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl56 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl59 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl60 = realMatrixImpl56.add(realMatrixImpl59);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl63 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl66 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl67 = realMatrixImpl63.add(realMatrixImpl66);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl68 = realMatrixImpl56.add(realMatrixImpl66);
        org.apache.commons.math.linear.RealMatrix realMatrix70 = realMatrixImpl56.scalarAdd((double) (byte) 1);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl73 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl76 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl77 = realMatrixImpl73.add(realMatrixImpl76);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl80 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix81 = realMatrixImpl76.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl80);
        boolean boolean82 = realMatrixImpl76.isSquare();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl85 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl88 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix89 = realMatrixImpl85.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl88);
        int int90 = realMatrixImpl88.getRowDimension();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl91 = realMatrixImpl76.subtract(realMatrixImpl88);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl92 = realMatrixImpl56.add(realMatrixImpl88);
        org.apache.commons.math.linear.RealMatrix realMatrix93 = realMatrixImpl56.copy();
        boolean boolean94 = realMatrixImpl56.isSquare();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl95 = realMatrixImpl33.subtract(realMatrixImpl56);
        double double96 = realMatrixImpl56.getNorm();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix97 = realMatrixImpl26.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Matrices are not multiplication compatible.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertNotNull(realMatrixImpl33);
        org.junit.Assert.assertNotNull(realMatrixImpl40);
        org.junit.Assert.assertNotNull(realMatrixImpl47);
        org.junit.Assert.assertNotNull(realMatrixImpl48);
        org.junit.Assert.assertNotNull(realMatrix50);
        org.junit.Assert.assertNotNull(realMatrix51);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(realMatrixImpl60);
        org.junit.Assert.assertNotNull(realMatrixImpl67);
        org.junit.Assert.assertNotNull(realMatrixImpl68);
        org.junit.Assert.assertNotNull(realMatrix70);
        org.junit.Assert.assertNotNull(realMatrixImpl77);
        org.junit.Assert.assertNotNull(realMatrix81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(realMatrix89);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 10 + "'", int90 == 10);
        org.junit.Assert.assertNotNull(realMatrixImpl91);
        org.junit.Assert.assertNotNull(realMatrixImpl92);
        org.junit.Assert.assertNotNull(realMatrix93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(realMatrixImpl95);
        org.junit.Assert.assertTrue("'" + double96 + "' != '" + 0.0d + "'", double96 == 0.0d);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (short) 1, (int) 'a');
        double[][] doubleArray3 = realMatrixImpl2.getData();
        double[][] doubleArray4 = realMatrixImpl2.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl6 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray4, false);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray4);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        double[] doubleArray2 = new double[] { 1, (byte) 10 };
        double[] doubleArray5 = new double[] { 1, (byte) 10 };
        double[] doubleArray8 = new double[] { 1, (byte) 10 };
        double[] doubleArray11 = new double[] { 1, (byte) 10 };
        double[] doubleArray14 = new double[] { 1, (byte) 10 };
        double[] doubleArray17 = new double[] { 1, (byte) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl21 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        java.math.BigDecimal[][] bigDecimalArray22 = bigMatrixImpl21.getData();
        org.apache.commons.math.linear.BigMatrix bigMatrix24 = bigMatrixImpl21.getColumnMatrix((int) (short) 1);
        org.apache.commons.math.linear.BigMatrix bigMatrix26 = bigMatrixImpl21.getRowMatrix(4);
        double[] doubleArray29 = new double[] { 1, (byte) 10 };
        double[] doubleArray32 = new double[] { 1, (byte) 10 };
        double[] doubleArray35 = new double[] { 1, (byte) 10 };
        double[] doubleArray38 = new double[] { 1, (byte) 10 };
        double[] doubleArray41 = new double[] { 1, (byte) 10 };
        double[] doubleArray44 = new double[] { 1, (byte) 10 };
        double[][] doubleArray45 = new double[][] { doubleArray29, doubleArray32, doubleArray35, doubleArray38, doubleArray41, doubleArray44 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl46 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray45);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl47 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray45);
        double[] doubleArray50 = new double[] { 1, (byte) 10 };
        double[] doubleArray53 = new double[] { 1, (byte) 10 };
        double[] doubleArray56 = new double[] { 1, (byte) 10 };
        double[] doubleArray59 = new double[] { 1, (byte) 10 };
        double[] doubleArray62 = new double[] { 1, (byte) 10 };
        double[] doubleArray65 = new double[] { 1, (byte) 10 };
        double[][] doubleArray66 = new double[][] { doubleArray50, doubleArray53, doubleArray56, doubleArray59, doubleArray62, doubleArray65 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl67 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray66);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl68 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray66);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl69 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray66);
        int int70 = bigMatrixImpl69.getColumnDimension();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl71 = bigMatrixImpl47.add(bigMatrixImpl69);
        java.math.BigDecimal bigDecimal72 = bigMatrixImpl69.getNorm();
        org.apache.commons.math.linear.BigMatrix bigMatrix73 = bigMatrixImpl21.scalarAdd(bigDecimal72);
        int int74 = bigMatrixImpl21.getScale();
        org.apache.commons.math.linear.BigMatrix bigMatrix75 = bigMatrixImpl21.copy();
        bigMatrixImpl21.setRoundingMode((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double80 = bigMatrixImpl21.getEntryAsDouble((int) 'a', (int) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: matrix entry does not exist");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(bigDecimalArray22);
        org.junit.Assert.assertNotNull(bigMatrix24);
        org.junit.Assert.assertNotNull(bigMatrix26);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 2 + "'", int70 == 2);
        org.junit.Assert.assertNotNull(bigMatrixImpl71);
        org.junit.Assert.assertNotNull(bigDecimal72);
        org.junit.Assert.assertNotNull(bigMatrix73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 64 + "'", int74 == 64);
        org.junit.Assert.assertNotNull(bigMatrix75);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl5 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl6 = realMatrixImpl2.add(realMatrixImpl5);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = realMatrixImpl6.copy();
        boolean boolean8 = realMatrixImpl6.isSingular();
        double[] doubleArray10 = realMatrixImpl6.getRow(1);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = realMatrixImpl6.getTrace();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: matrix is not square");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrixImpl6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        double[] doubleArray2 = new double[] { 1, (byte) 10 };
        double[] doubleArray5 = new double[] { 1, (byte) 10 };
        double[] doubleArray8 = new double[] { 1, (byte) 10 };
        double[] doubleArray11 = new double[] { 1, (byte) 10 };
        double[] doubleArray14 = new double[] { 1, (byte) 10 };
        double[] doubleArray17 = new double[] { 1, (byte) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        java.math.BigDecimal bigDecimal23 = bigMatrixImpl20.getEntry(0, (int) (short) 0);
        java.math.BigDecimal[][] bigDecimalArray24 = bigMatrixImpl20.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl26 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray24, false);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl28 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray24, true);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl29 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray24);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl31 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray24, false);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl32 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray24);
        java.lang.String str33 = bigMatrixImpl32.toString();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertNotNull(bigDecimalArray24);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "BigMatrixImpl{{1,10},{1,10},{1,10},{1,10},{1,10},{1,10}}" + "'", str33, "BigMatrixImpl{{1,10},{1,10},{1,10},{1,10},{1,10},{1,10}}");
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        double[] doubleArray2 = new double[] { 1, (byte) 10 };
        double[] doubleArray5 = new double[] { 1, (byte) 10 };
        double[] doubleArray8 = new double[] { 1, (byte) 10 };
        double[] doubleArray11 = new double[] { 1, (byte) 10 };
        double[] doubleArray14 = new double[] { 1, (byte) 10 };
        double[] doubleArray17 = new double[] { 1, (byte) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        java.math.BigDecimal bigDecimal20 = bigMatrixImpl19.getNorm();
        java.math.BigDecimal[] bigDecimalArray21 = new java.math.BigDecimal[] { bigDecimal20 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl22 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray21);
        java.math.BigDecimal[] bigDecimalArray24 = bigMatrixImpl22.getRow(0);
        java.lang.Class<?> wildcardClass25 = bigMatrixImpl22.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(bigDecimal20);
        org.junit.Assert.assertNotNull(bigDecimalArray21);
        org.junit.Assert.assertNotNull(bigDecimalArray24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        java.math.BigDecimal bigDecimal0 = null;
        java.math.BigDecimal[] bigDecimalArray1 = new java.math.BigDecimal[] { bigDecimal0 };
        java.math.BigDecimal bigDecimal2 = null;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = null;
        java.math.BigDecimal[] bigDecimalArray5 = new java.math.BigDecimal[] { bigDecimal4 };
        java.math.BigDecimal bigDecimal6 = null;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = null;
        java.math.BigDecimal[] bigDecimalArray9 = new java.math.BigDecimal[] { bigDecimal8 };
        java.math.BigDecimal[][] bigDecimalArray10 = new java.math.BigDecimal[][] { bigDecimalArray1, bigDecimalArray3, bigDecimalArray5, bigDecimalArray7, bigDecimalArray9 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl12 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray10, true);
        int int13 = bigMatrixImpl12.getScale();
        boolean boolean14 = bigMatrixImpl12.isSingular();
        int int15 = bigMatrixImpl12.getColumnDimension();
        java.math.BigDecimal[][] bigDecimalArray16 = bigMatrixImpl12.getData();
        int int17 = bigMatrixImpl12.getRoundingMode();
        org.junit.Assert.assertNotNull(bigDecimalArray1);
        org.junit.Assert.assertNotNull(bigDecimalArray3);
        org.junit.Assert.assertNotNull(bigDecimalArray5);
        org.junit.Assert.assertNotNull(bigDecimalArray7);
        org.junit.Assert.assertNotNull(bigDecimalArray9);
        org.junit.Assert.assertNotNull(bigDecimalArray10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(bigDecimalArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) (short) 100);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl5 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl8 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl9 = realMatrixImpl5.add(realMatrixImpl8);
        double[] doubleArray11 = realMatrixImpl8.getColumn((int) (byte) 0);
        double[][] doubleArray12 = realMatrixImpl8.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl15 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = realMatrixImpl15.add(realMatrixImpl18);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl25 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = realMatrixImpl22.add(realMatrixImpl25);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl29 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix30 = realMatrixImpl25.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl29);
        boolean boolean31 = realMatrixImpl25.isSquare();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl37 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix38 = realMatrixImpl34.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl37);
        int int39 = realMatrixImpl37.getRowDimension();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl40 = realMatrixImpl25.subtract(realMatrixImpl37);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl41 = realMatrixImpl18.subtract(realMatrixImpl40);
        boolean boolean42 = realMatrixImpl41.isSingular();
        int[] intArray44 = new int[] { 4 };
        int[] intArray46 = new int[] { (byte) 0 };
        org.apache.commons.math.linear.RealMatrix realMatrix47 = realMatrixImpl41.getSubMatrix(intArray44, intArray46);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl50 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl53 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl54 = realMatrixImpl50.add(realMatrixImpl53);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl57 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl60 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl61 = realMatrixImpl57.add(realMatrixImpl60);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl64 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix65 = realMatrixImpl60.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl64);
        boolean boolean66 = realMatrixImpl60.isSquare();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl69 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl72 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix73 = realMatrixImpl69.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl72);
        int int74 = realMatrixImpl72.getRowDimension();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl75 = realMatrixImpl60.subtract(realMatrixImpl72);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl76 = realMatrixImpl53.subtract(realMatrixImpl75);
        boolean boolean77 = realMatrixImpl76.isSingular();
        int[] intArray79 = new int[] { 4 };
        int[] intArray81 = new int[] { (byte) 0 };
        org.apache.commons.math.linear.RealMatrix realMatrix82 = realMatrixImpl76.getSubMatrix(intArray79, intArray81);
        org.apache.commons.math.linear.RealMatrix realMatrix83 = realMatrixImpl8.getSubMatrix(intArray46, intArray81);
        int[] intArray84 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix85 = realMatrixImpl2.getSubMatrix(intArray46, intArray84);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrixImpl9);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(realMatrixImpl19);
        org.junit.Assert.assertNotNull(realMatrixImpl26);
        org.junit.Assert.assertNotNull(realMatrix30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(realMatrix38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
        org.junit.Assert.assertNotNull(realMatrixImpl40);
        org.junit.Assert.assertNotNull(realMatrixImpl41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[4]");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[0]");
        org.junit.Assert.assertNotNull(realMatrix47);
        org.junit.Assert.assertNotNull(realMatrixImpl54);
        org.junit.Assert.assertNotNull(realMatrixImpl61);
        org.junit.Assert.assertNotNull(realMatrix65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(realMatrix73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 10 + "'", int74 == 10);
        org.junit.Assert.assertNotNull(realMatrixImpl75);
        org.junit.Assert.assertNotNull(realMatrixImpl76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray79), "[4]");
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray81), "[0]");
        org.junit.Assert.assertNotNull(realMatrix82);
        org.junit.Assert.assertNotNull(realMatrix83);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl5 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl6 = realMatrixImpl2.add(realMatrixImpl5);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl9 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix10 = realMatrixImpl5.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl9);
        boolean boolean11 = realMatrixImpl5.isSquare();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl14 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl17 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl14.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl17);
        int int19 = realMatrixImpl17.getRowDimension();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = realMatrixImpl5.subtract(realMatrixImpl17);
        double[][] doubleArray21 = realMatrixImpl17.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl23 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21, true);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl25 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21, true);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl28 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix32 = realMatrixImpl28.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl31);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl35 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl38 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl39 = realMatrixImpl35.add(realMatrixImpl38);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl42 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix43 = realMatrixImpl38.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl42);
        boolean boolean44 = realMatrixImpl31.equals((java.lang.Object) realMatrixImpl42);
        org.apache.commons.math.linear.RealMatrix realMatrix45 = realMatrixImpl31.copy();
        org.apache.commons.math.linear.RealMatrix realMatrix47 = realMatrixImpl31.scalarAdd((double) 97);
        boolean boolean48 = realMatrixImpl25.equals((java.lang.Object) realMatrixImpl31);
        double[][] doubleArray49 = realMatrixImpl31.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl50 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray49);
        org.junit.Assert.assertNotNull(realMatrixImpl6);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(realMatrixImpl20);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(realMatrixImpl39);
        org.junit.Assert.assertNotNull(realMatrix43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(realMatrix45);
        org.junit.Assert.assertNotNull(realMatrix47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(doubleArray49);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        double[] doubleArray2 = new double[] { 1, (byte) 10 };
        double[] doubleArray5 = new double[] { 1, (byte) 10 };
        double[] doubleArray8 = new double[] { 1, (byte) 10 };
        double[] doubleArray11 = new double[] { 1, (byte) 10 };
        double[] doubleArray14 = new double[] { 1, (byte) 10 };
        double[] doubleArray17 = new double[] { 1, (byte) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl21 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl22 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        int int23 = bigMatrixImpl22.getRowDimension();
        int int24 = bigMatrixImpl22.getScale();
        double[] doubleArray27 = new double[] { 1, (byte) 10 };
        double[] doubleArray30 = new double[] { 1, (byte) 10 };
        double[] doubleArray33 = new double[] { 1, (byte) 10 };
        double[] doubleArray36 = new double[] { 1, (byte) 10 };
        double[] doubleArray39 = new double[] { 1, (byte) 10 };
        double[] doubleArray42 = new double[] { 1, (byte) 10 };
        double[][] doubleArray43 = new double[][] { doubleArray27, doubleArray30, doubleArray33, doubleArray36, doubleArray39, doubleArray42 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl44 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray43);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl45 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray43);
        int int46 = bigMatrixImpl45.getScale();
        java.math.BigDecimal[][] bigDecimalArray47 = bigMatrixImpl45.getData();
        int int48 = bigMatrixImpl45.getRoundingMode();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl49 = bigMatrixImpl22.add(bigMatrixImpl45);
        java.math.BigDecimal bigDecimal50 = null;
        java.math.BigDecimal[] bigDecimalArray51 = new java.math.BigDecimal[] { bigDecimal50 };
        java.math.BigDecimal bigDecimal52 = null;
        java.math.BigDecimal[] bigDecimalArray53 = new java.math.BigDecimal[] { bigDecimal52 };
        java.math.BigDecimal bigDecimal54 = null;
        java.math.BigDecimal[] bigDecimalArray55 = new java.math.BigDecimal[] { bigDecimal54 };
        java.math.BigDecimal bigDecimal56 = null;
        java.math.BigDecimal[] bigDecimalArray57 = new java.math.BigDecimal[] { bigDecimal56 };
        java.math.BigDecimal bigDecimal58 = null;
        java.math.BigDecimal[] bigDecimalArray59 = new java.math.BigDecimal[] { bigDecimal58 };
        java.math.BigDecimal[][] bigDecimalArray60 = new java.math.BigDecimal[][] { bigDecimalArray51, bigDecimalArray53, bigDecimalArray55, bigDecimalArray57, bigDecimalArray59 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl62 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray60, true);
        bigMatrixImpl62.setScale((int) (short) 0);
        int int65 = bigMatrixImpl62.getRoundingMode();
        int int66 = bigMatrixImpl62.getRowDimension();
        int int67 = bigMatrixImpl62.getRoundingMode();
        int int68 = bigMatrixImpl62.getColumnDimension();
        java.math.BigDecimal[][] bigDecimalArray69 = bigMatrixImpl62.getData();
        // The following exception was thrown during execution in test generation
        try {
            bigMatrixImpl22.setSubMatrix(bigDecimalArray69, (int) (short) -1, 52);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: invalid row or column index selection");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 6 + "'", int23 == 6);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 64 + "'", int24 == 64);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 64 + "'", int46 == 64);
        org.junit.Assert.assertNotNull(bigDecimalArray47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 4 + "'", int48 == 4);
        org.junit.Assert.assertNotNull(bigMatrixImpl49);
        org.junit.Assert.assertNotNull(bigDecimalArray51);
        org.junit.Assert.assertNotNull(bigDecimalArray53);
        org.junit.Assert.assertNotNull(bigDecimalArray55);
        org.junit.Assert.assertNotNull(bigDecimalArray57);
        org.junit.Assert.assertNotNull(bigDecimalArray59);
        org.junit.Assert.assertNotNull(bigDecimalArray60);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 4 + "'", int65 == 4);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 5 + "'", int66 == 5);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 4 + "'", int67 == 4);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
        org.junit.Assert.assertNotNull(bigDecimalArray69);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        double[] doubleArray2 = new double[] { 1, (byte) 10 };
        double[] doubleArray5 = new double[] { 1, (byte) 10 };
        double[] doubleArray8 = new double[] { 1, (byte) 10 };
        double[] doubleArray11 = new double[] { 1, (byte) 10 };
        double[] doubleArray14 = new double[] { 1, (byte) 10 };
        double[] doubleArray17 = new double[] { 1, (byte) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        java.math.BigDecimal bigDecimal23 = bigMatrixImpl20.getEntry(0, (int) (short) 0);
        java.math.BigDecimal[][] bigDecimalArray24 = bigMatrixImpl20.getData();
        double[] doubleArray27 = new double[] { 1, (byte) 10 };
        double[] doubleArray30 = new double[] { 1, (byte) 10 };
        double[] doubleArray33 = new double[] { 1, (byte) 10 };
        double[] doubleArray36 = new double[] { 1, (byte) 10 };
        double[] doubleArray39 = new double[] { 1, (byte) 10 };
        double[] doubleArray42 = new double[] { 1, (byte) 10 };
        double[][] doubleArray43 = new double[][] { doubleArray27, doubleArray30, doubleArray33, doubleArray36, doubleArray39, doubleArray42 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl44 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray43);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl45 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray43);
        java.math.BigDecimal bigDecimal48 = bigMatrixImpl45.getEntry(0, (int) (short) 0);
        org.apache.commons.math.linear.BigMatrix bigMatrix49 = bigMatrixImpl20.scalarMultiply(bigDecimal48);
        java.math.BigDecimal[] bigDecimalArray51 = bigMatrixImpl20.getRow(2);
        java.lang.String str52 = bigMatrixImpl20.toString();
        boolean boolean53 = bigMatrixImpl20.isSquare();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertNotNull(bigDecimalArray24);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertNotNull(bigDecimal48);
        org.junit.Assert.assertNotNull(bigMatrix49);
        org.junit.Assert.assertNotNull(bigDecimalArray51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "BigMatrixImpl{{1,10},{1,10},{1,10},{1,10},{1,10},{1,10}}" + "'", str52, "BigMatrixImpl{{1,10},{1,10},{1,10},{1,10},{1,10},{1,10}}");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        double[] doubleArray2 = new double[] { 1, (byte) 10 };
        double[] doubleArray5 = new double[] { 1, (byte) 10 };
        double[] doubleArray8 = new double[] { 1, (byte) 10 };
        double[] doubleArray11 = new double[] { 1, (byte) 10 };
        double[] doubleArray14 = new double[] { 1, (byte) 10 };
        double[] doubleArray17 = new double[] { 1, (byte) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        java.math.BigDecimal bigDecimal23 = bigMatrixImpl20.getEntry(0, (int) (short) 0);
        org.apache.commons.math.linear.BigMatrix bigMatrix24 = bigMatrixImpl20.copy();
        int int25 = bigMatrixImpl20.getRoundingMode();
        double[] doubleArray28 = new double[] { 1, (byte) 10 };
        double[] doubleArray31 = new double[] { 1, (byte) 10 };
        double[] doubleArray34 = new double[] { 1, (byte) 10 };
        double[] doubleArray37 = new double[] { 1, (byte) 10 };
        double[] doubleArray40 = new double[] { 1, (byte) 10 };
        double[] doubleArray43 = new double[] { 1, (byte) 10 };
        double[][] doubleArray44 = new double[][] { doubleArray28, doubleArray31, doubleArray34, doubleArray37, doubleArray40, doubleArray43 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl45 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray44);
        java.math.BigDecimal bigDecimal46 = bigMatrixImpl45.getNorm();
        java.math.BigDecimal[] bigDecimalArray47 = new java.math.BigDecimal[] { bigDecimal46 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl48 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray47);
        java.math.BigDecimal[] bigDecimalArray50 = bigMatrixImpl48.getRow(0);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl53 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl56 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix57 = realMatrixImpl53.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl56);
        org.apache.commons.math.linear.RealMatrix realMatrix59 = realMatrixImpl56.getColumnMatrix((int) (short) 1);
        boolean boolean60 = realMatrixImpl56.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix62 = realMatrixImpl56.getColumnMatrix((int) (byte) 10);
        boolean boolean63 = bigMatrixImpl48.equals((java.lang.Object) (byte) 10);
        double[] doubleArray66 = new double[] { 1, (byte) 10 };
        double[] doubleArray69 = new double[] { 1, (byte) 10 };
        double[] doubleArray72 = new double[] { 1, (byte) 10 };
        double[] doubleArray75 = new double[] { 1, (byte) 10 };
        double[] doubleArray78 = new double[] { 1, (byte) 10 };
        double[] doubleArray81 = new double[] { 1, (byte) 10 };
        double[][] doubleArray82 = new double[][] { doubleArray66, doubleArray69, doubleArray72, doubleArray75, doubleArray78, doubleArray81 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl83 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray82);
        java.math.BigDecimal bigDecimal84 = bigMatrixImpl83.getNorm();
        org.apache.commons.math.linear.BigMatrix bigMatrix85 = bigMatrixImpl48.scalarAdd(bigDecimal84);
        org.apache.commons.math.linear.BigMatrix bigMatrix86 = bigMatrixImpl48.transpose();
        bigMatrixImpl48.setScale(64);
        boolean boolean89 = bigMatrixImpl20.equals((java.lang.Object) bigMatrixImpl48);
        double[] doubleArray91 = bigMatrixImpl20.getRowAsDoubleArray(4);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertNotNull(bigMatrix24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertNotNull(bigDecimal46);
        org.junit.Assert.assertNotNull(bigDecimalArray47);
        org.junit.Assert.assertNotNull(bigDecimalArray50);
        org.junit.Assert.assertNotNull(realMatrix57);
        org.junit.Assert.assertNotNull(realMatrix59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(realMatrix62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray81), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertNotNull(bigDecimal84);
        org.junit.Assert.assertNotNull(bigMatrix85);
        org.junit.Assert.assertNotNull(bigMatrix86);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(doubleArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray91), "[1.0, 10.0]");
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        double[] doubleArray2 = new double[] { 1, (byte) 10 };
        double[] doubleArray5 = new double[] { 1, (byte) 10 };
        double[] doubleArray8 = new double[] { 1, (byte) 10 };
        double[] doubleArray11 = new double[] { 1, (byte) 10 };
        double[] doubleArray14 = new double[] { 1, (byte) 10 };
        double[] doubleArray17 = new double[] { 1, (byte) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        java.math.BigDecimal bigDecimal23 = bigMatrixImpl20.getEntry(0, (int) (short) 0);
        boolean boolean24 = bigMatrixImpl20.isSquare();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix29 = bigMatrixImpl20.getSubMatrix((int) (byte) 10, 0, (int) (short) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: invalid row or column index selection");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        double[] doubleArray2 = new double[] { 1, (byte) 10 };
        double[] doubleArray5 = new double[] { 1, (byte) 10 };
        double[] doubleArray8 = new double[] { 1, (byte) 10 };
        double[] doubleArray11 = new double[] { 1, (byte) 10 };
        double[] doubleArray14 = new double[] { 1, (byte) 10 };
        double[] doubleArray17 = new double[] { 1, (byte) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        java.math.BigDecimal bigDecimal23 = bigMatrixImpl20.getEntry(0, (int) (short) 0);
        org.apache.commons.math.linear.BigMatrix bigMatrix24 = bigMatrixImpl20.copy();
        bigMatrixImpl20.setRoundingMode(5);
        org.apache.commons.math.linear.BigMatrix bigMatrix27 = bigMatrixImpl20.transpose();
        java.math.BigDecimal bigDecimal28 = null;
        java.math.BigDecimal[] bigDecimalArray29 = new java.math.BigDecimal[] { bigDecimal28 };
        java.math.BigDecimal bigDecimal30 = null;
        java.math.BigDecimal[] bigDecimalArray31 = new java.math.BigDecimal[] { bigDecimal30 };
        java.math.BigDecimal bigDecimal32 = null;
        java.math.BigDecimal[] bigDecimalArray33 = new java.math.BigDecimal[] { bigDecimal32 };
        java.math.BigDecimal bigDecimal34 = null;
        java.math.BigDecimal[] bigDecimalArray35 = new java.math.BigDecimal[] { bigDecimal34 };
        java.math.BigDecimal bigDecimal36 = null;
        java.math.BigDecimal[] bigDecimalArray37 = new java.math.BigDecimal[] { bigDecimal36 };
        java.math.BigDecimal[][] bigDecimalArray38 = new java.math.BigDecimal[][] { bigDecimalArray29, bigDecimalArray31, bigDecimalArray33, bigDecimalArray35, bigDecimalArray37 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl40 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray38, true);
        bigMatrixImpl40.setScale((int) (short) 0);
        bigMatrixImpl40.setRoundingMode(0);
        boolean boolean45 = bigMatrixImpl40.isSquare();
        bigMatrixImpl40.setRoundingMode(97);
        int int48 = bigMatrixImpl40.getRowDimension();
        java.math.BigDecimal[] bigDecimalArray50 = bigMatrixImpl40.getRow((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal[] bigDecimalArray51 = bigMatrixImpl20.operate(bigDecimalArray50);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: vector has wrong length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertNotNull(bigMatrix24);
        org.junit.Assert.assertNotNull(bigMatrix27);
        org.junit.Assert.assertNotNull(bigDecimalArray29);
        org.junit.Assert.assertNotNull(bigDecimalArray31);
        org.junit.Assert.assertNotNull(bigDecimalArray33);
        org.junit.Assert.assertNotNull(bigDecimalArray35);
        org.junit.Assert.assertNotNull(bigDecimalArray37);
        org.junit.Assert.assertNotNull(bigDecimalArray38);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 5 + "'", int48 == 5);
        org.junit.Assert.assertNotNull(bigDecimalArray50);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        double[] doubleArray2 = new double[] { 1, (byte) 10 };
        double[] doubleArray5 = new double[] { 1, (byte) 10 };
        double[] doubleArray8 = new double[] { 1, (byte) 10 };
        double[] doubleArray11 = new double[] { 1, (byte) 10 };
        double[] doubleArray14 = new double[] { 1, (byte) 10 };
        double[] doubleArray17 = new double[] { 1, (byte) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        double[] doubleArray23 = new double[] { 1, (byte) 10 };
        double[] doubleArray26 = new double[] { 1, (byte) 10 };
        double[] doubleArray29 = new double[] { 1, (byte) 10 };
        double[] doubleArray32 = new double[] { 1, (byte) 10 };
        double[] doubleArray35 = new double[] { 1, (byte) 10 };
        double[] doubleArray38 = new double[] { 1, (byte) 10 };
        double[][] doubleArray39 = new double[][] { doubleArray23, doubleArray26, doubleArray29, doubleArray32, doubleArray35, doubleArray38 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl40 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray39);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl41 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray39);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl42 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray39);
        int int43 = bigMatrixImpl42.getColumnDimension();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl44 = bigMatrixImpl20.add(bigMatrixImpl42);
        boolean boolean46 = bigMatrixImpl20.equals((java.lang.Object) (-1));
        double[] doubleArray49 = new double[] { 1, (byte) 10 };
        double[] doubleArray52 = new double[] { 1, (byte) 10 };
        double[] doubleArray55 = new double[] { 1, (byte) 10 };
        double[] doubleArray58 = new double[] { 1, (byte) 10 };
        double[] doubleArray61 = new double[] { 1, (byte) 10 };
        double[] doubleArray64 = new double[] { 1, (byte) 10 };
        double[][] doubleArray65 = new double[][] { doubleArray49, doubleArray52, doubleArray55, doubleArray58, doubleArray61, doubleArray64 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl66 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray65);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl67 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray65);
        double[] doubleArray70 = new double[] { 1, (byte) 10 };
        double[] doubleArray73 = new double[] { 1, (byte) 10 };
        double[] doubleArray76 = new double[] { 1, (byte) 10 };
        double[] doubleArray79 = new double[] { 1, (byte) 10 };
        double[] doubleArray82 = new double[] { 1, (byte) 10 };
        double[] doubleArray85 = new double[] { 1, (byte) 10 };
        double[][] doubleArray86 = new double[][] { doubleArray70, doubleArray73, doubleArray76, doubleArray79, doubleArray82, doubleArray85 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl87 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray86);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl88 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray86);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl89 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray86);
        int int90 = bigMatrixImpl89.getColumnDimension();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl91 = bigMatrixImpl67.add(bigMatrixImpl89);
        java.math.BigDecimal bigDecimal92 = bigMatrixImpl89.getNorm();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl93 = bigMatrixImpl20.subtract(bigMatrixImpl89);
        org.apache.commons.math.linear.BigMatrix bigMatrix94 = bigMatrixImpl20.transpose();
        java.lang.String str95 = bigMatrixImpl20.toString();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl98 = new org.apache.commons.math.linear.BigMatrixImpl((int) (byte) 10, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix99 = bigMatrixImpl20.preMultiply((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl98);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Matrices are not multiplication compatible.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertNotNull(bigMatrixImpl44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray79), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray85), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 2 + "'", int90 == 2);
        org.junit.Assert.assertNotNull(bigMatrixImpl91);
        org.junit.Assert.assertNotNull(bigDecimal92);
        org.junit.Assert.assertNotNull(bigMatrixImpl93);
        org.junit.Assert.assertNotNull(bigMatrix94);
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "BigMatrixImpl{{1,10},{1,10},{1,10},{1,10},{1,10},{1,10}}" + "'", str95, "BigMatrixImpl{{1,10},{1,10},{1,10},{1,10},{1,10},{1,10}}");
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl5 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl6 = realMatrixImpl2.add(realMatrixImpl5);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl9 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = realMatrixImpl9.add(realMatrixImpl12);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        boolean boolean18 = realMatrixImpl12.isSquare();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl21 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix25 = realMatrixImpl21.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl24);
        int int26 = realMatrixImpl24.getRowDimension();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl27 = realMatrixImpl12.subtract(realMatrixImpl24);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl28 = realMatrixImpl5.subtract(realMatrixImpl27);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl35 = realMatrixImpl31.add(realMatrixImpl34);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl38 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix39 = realMatrixImpl34.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl38);
        org.apache.commons.math.linear.RealMatrix realMatrix40 = realMatrixImpl28.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl34);
        double[][] doubleArray41 = realMatrixImpl34.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl43 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray41, true);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl45 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray41, false);
        org.apache.commons.math.linear.RealMatrix realMatrix47 = realMatrixImpl45.getRowMatrix(6);
        org.junit.Assert.assertNotNull(realMatrixImpl6);
        org.junit.Assert.assertNotNull(realMatrixImpl13);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(realMatrix25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertNotNull(realMatrixImpl27);
        org.junit.Assert.assertNotNull(realMatrixImpl28);
        org.junit.Assert.assertNotNull(realMatrixImpl35);
        org.junit.Assert.assertNotNull(realMatrix39);
        org.junit.Assert.assertNotNull(realMatrix40);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertNotNull(realMatrix47);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        double[] doubleArray2 = new double[] { 1, (byte) 10 };
        double[] doubleArray5 = new double[] { 1, (byte) 10 };
        double[] doubleArray8 = new double[] { 1, (byte) 10 };
        double[] doubleArray11 = new double[] { 1, (byte) 10 };
        double[] doubleArray14 = new double[] { 1, (byte) 10 };
        double[] doubleArray17 = new double[] { 1, (byte) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        java.math.BigDecimal bigDecimal23 = bigMatrixImpl20.getEntry(0, (int) (short) 0);
        java.math.BigDecimal[][] bigDecimalArray24 = bigMatrixImpl20.getData();
        double[] doubleArray27 = new double[] { 1, (byte) 10 };
        double[] doubleArray30 = new double[] { 1, (byte) 10 };
        double[] doubleArray33 = new double[] { 1, (byte) 10 };
        double[] doubleArray36 = new double[] { 1, (byte) 10 };
        double[] doubleArray39 = new double[] { 1, (byte) 10 };
        double[] doubleArray42 = new double[] { 1, (byte) 10 };
        double[][] doubleArray43 = new double[][] { doubleArray27, doubleArray30, doubleArray33, doubleArray36, doubleArray39, doubleArray42 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl44 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray43);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl45 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray43);
        java.math.BigDecimal bigDecimal48 = bigMatrixImpl45.getEntry(0, (int) (short) 0);
        org.apache.commons.math.linear.BigMatrix bigMatrix49 = bigMatrixImpl20.scalarMultiply(bigDecimal48);
        java.math.BigDecimal[] bigDecimalArray51 = bigMatrixImpl20.getRow(2);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl52 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray51);
        double[] doubleArray55 = new double[] { 1, (byte) 10 };
        double[] doubleArray58 = new double[] { 1, (byte) 10 };
        double[] doubleArray61 = new double[] { 1, (byte) 10 };
        double[] doubleArray64 = new double[] { 1, (byte) 10 };
        double[] doubleArray67 = new double[] { 1, (byte) 10 };
        double[] doubleArray70 = new double[] { 1, (byte) 10 };
        double[][] doubleArray71 = new double[][] { doubleArray55, doubleArray58, doubleArray61, doubleArray64, doubleArray67, doubleArray70 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl72 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray71);
        java.math.BigDecimal bigDecimal73 = bigMatrixImpl72.getNorm();
        java.math.BigDecimal[] bigDecimalArray74 = new java.math.BigDecimal[] { bigDecimal73 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl75 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray74);
        org.apache.commons.math.linear.BigMatrix bigMatrix76 = bigMatrixImpl75.transpose();
        boolean boolean77 = bigMatrixImpl52.equals((java.lang.Object) bigMatrix76);
        java.math.BigDecimal[][] bigDecimalArray78 = bigMatrixImpl52.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl80 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray78, false);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertNotNull(bigDecimalArray24);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertNotNull(bigDecimal48);
        org.junit.Assert.assertNotNull(bigMatrix49);
        org.junit.Assert.assertNotNull(bigDecimalArray51);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertNotNull(bigDecimal73);
        org.junit.Assert.assertNotNull(bigDecimalArray74);
        org.junit.Assert.assertNotNull(bigMatrix76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(bigDecimalArray78);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (short) 100, (int) (byte) 10);
        double[] doubleArray5 = new double[] { 1, (byte) 10 };
        double[] doubleArray8 = new double[] { 1, (byte) 10 };
        double[] doubleArray11 = new double[] { 1, (byte) 10 };
        double[] doubleArray14 = new double[] { 1, (byte) 10 };
        double[] doubleArray17 = new double[] { 1, (byte) 10 };
        double[] doubleArray20 = new double[] { 1, (byte) 10 };
        double[][] doubleArray21 = new double[][] { doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17, doubleArray20 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl22 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray21);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl23 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray21);
        int int24 = bigMatrixImpl23.getScale();
        java.math.BigDecimal[][] bigDecimalArray25 = bigMatrixImpl23.getData();
        org.apache.commons.math.linear.BigMatrix bigMatrix26 = bigMatrixImpl23.copy();
        double[] doubleArray28 = bigMatrixImpl23.getRowAsDoubleArray(1);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl29 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray28);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray30 = realMatrixImpl2.preMultiply(doubleArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: vector has wrong length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 64 + "'", int24 == 64);
        org.junit.Assert.assertNotNull(bigDecimalArray25);
        org.junit.Assert.assertNotNull(bigMatrix26);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[1.0, 10.0]");
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl5 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix6 = realMatrixImpl2.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl5);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl5.getColumnMatrix((int) (short) 1);
        boolean boolean9 = realMatrixImpl5.isSingular();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl15 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = realMatrixImpl12.add(realMatrixImpl15);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl23 = realMatrixImpl19.add(realMatrixImpl22);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = realMatrixImpl12.add(realMatrixImpl22);
        org.apache.commons.math.linear.RealMatrix realMatrix25 = realMatrixImpl5.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl22);
        double[] doubleArray27 = realMatrixImpl5.getColumn((int) (byte) 0);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(realMatrixImpl16);
        org.junit.Assert.assertNotNull(realMatrixImpl23);
        org.junit.Assert.assertNotNull(realMatrixImpl24);
        org.junit.Assert.assertNotNull(realMatrix25);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        double[] doubleArray2 = new double[] { 1, (byte) 10 };
        double[] doubleArray5 = new double[] { 1, (byte) 10 };
        double[] doubleArray8 = new double[] { 1, (byte) 10 };
        double[] doubleArray11 = new double[] { 1, (byte) 10 };
        double[] doubleArray14 = new double[] { 1, (byte) 10 };
        double[] doubleArray17 = new double[] { 1, (byte) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        boolean boolean21 = bigMatrixImpl20.isSquare();
        java.math.BigDecimal[][] bigDecimalArray22 = bigMatrixImpl20.getDataRef();
        java.math.BigDecimal[][] bigDecimalArray23 = bigMatrixImpl20.getData();
        double[] doubleArray26 = new double[] { 1, (byte) 10 };
        double[] doubleArray29 = new double[] { 1, (byte) 10 };
        double[] doubleArray32 = new double[] { 1, (byte) 10 };
        double[] doubleArray35 = new double[] { 1, (byte) 10 };
        double[] doubleArray38 = new double[] { 1, (byte) 10 };
        double[] doubleArray41 = new double[] { 1, (byte) 10 };
        double[][] doubleArray42 = new double[][] { doubleArray26, doubleArray29, doubleArray32, doubleArray35, doubleArray38, doubleArray41 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl43 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray42);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl44 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray42);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl45 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray42);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl46 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray42);
        org.apache.commons.math.linear.BigMatrix bigMatrix47 = bigMatrixImpl46.copy();
        boolean boolean48 = bigMatrixImpl20.equals((java.lang.Object) bigMatrixImpl46);
        java.lang.String str49 = bigMatrixImpl20.toString();
        bigMatrixImpl20.setRoundingMode((int) (byte) 10);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(bigDecimalArray22);
        org.junit.Assert.assertNotNull(bigDecimalArray23);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertNotNull(bigMatrix47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "BigMatrixImpl{{1,10},{1,10},{1,10},{1,10},{1,10},{1,10}}" + "'", str49, "BigMatrixImpl{{1,10},{1,10},{1,10},{1,10},{1,10},{1,10}}");
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl5 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl6 = realMatrixImpl2.add(realMatrixImpl5);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl9 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix10 = realMatrixImpl5.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl9);
        boolean boolean11 = realMatrixImpl5.isSquare();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl14 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl17 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl14.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl17);
        int int19 = realMatrixImpl17.getRowDimension();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = realMatrixImpl5.subtract(realMatrixImpl17);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl23 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl27 = realMatrixImpl23.add(realMatrixImpl26);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl30 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = realMatrixImpl30.add(realMatrixImpl33);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl35 = realMatrixImpl23.add(realMatrixImpl33);
        org.apache.commons.math.linear.RealMatrix realMatrix36 = realMatrixImpl23.copy();
        org.apache.commons.math.linear.RealMatrix realMatrix37 = realMatrixImpl17.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl23);
        int int38 = realMatrixImpl23.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix40 = realMatrixImpl23.getColumnMatrix(0);
        // The following exception was thrown during execution in test generation
        try {
            realMatrixImpl23.luDecompose();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.InvalidMatrixException; message: LU decomposition requires that the matrix be square.");
        } catch (org.apache.commons.math.linear.InvalidMatrixException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrixImpl6);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(realMatrixImpl20);
        org.junit.Assert.assertNotNull(realMatrixImpl27);
        org.junit.Assert.assertNotNull(realMatrixImpl34);
        org.junit.Assert.assertNotNull(realMatrixImpl35);
        org.junit.Assert.assertNotNull(realMatrix36);
        org.junit.Assert.assertNotNull(realMatrix37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 35 + "'", int38 == 35);
        org.junit.Assert.assertNotNull(realMatrix40);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl5 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl6 = realMatrixImpl2.add(realMatrixImpl5);
        double[] doubleArray8 = realMatrixImpl5.getColumn((int) (byte) 0);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl5.copy();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl15 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = realMatrixImpl12.add(realMatrixImpl15);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl23 = realMatrixImpl19.add(realMatrixImpl22);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = realMatrixImpl12.add(realMatrixImpl22);
        org.apache.commons.math.linear.RealMatrix realMatrix26 = realMatrixImpl12.scalarAdd((double) (byte) 1);
        double[] doubleArray28 = realMatrixImpl12.getColumn((int) (short) 10);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl29 = realMatrixImpl5.add(realMatrixImpl12);
        org.apache.commons.math.linear.RealMatrix realMatrix31 = realMatrixImpl5.scalarMultiply(0.0d);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        boolean boolean35 = realMatrixImpl34.isSquare();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix36 = realMatrixImpl5.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Matrices are not multiplication compatible.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrixImpl6);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrixImpl16);
        org.junit.Assert.assertNotNull(realMatrixImpl23);
        org.junit.Assert.assertNotNull(realMatrixImpl24);
        org.junit.Assert.assertNotNull(realMatrix26);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(realMatrixImpl29);
        org.junit.Assert.assertNotNull(realMatrix31);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        double[] doubleArray2 = new double[] { 1, (byte) 10 };
        double[] doubleArray5 = new double[] { 1, (byte) 10 };
        double[] doubleArray8 = new double[] { 1, (byte) 10 };
        double[] doubleArray11 = new double[] { 1, (byte) 10 };
        double[] doubleArray14 = new double[] { 1, (byte) 10 };
        double[] doubleArray17 = new double[] { 1, (byte) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray18, false);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = realMatrixImpl22.scalarAdd((double) (byte) 10);
        double[][] doubleArray25 = realMatrixImpl22.getDataRef();
        double[] doubleArray27 = realMatrixImpl22.getColumn(0);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl28 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray27);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl29 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray27);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        double[] doubleArray2 = new double[] { 1, (byte) 10 };
        double[] doubleArray5 = new double[] { 1, (byte) 10 };
        double[] doubleArray8 = new double[] { 1, (byte) 10 };
        double[] doubleArray11 = new double[] { 1, (byte) 10 };
        double[] doubleArray14 = new double[] { 1, (byte) 10 };
        double[] doubleArray17 = new double[] { 1, (byte) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl21 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        java.math.BigDecimal[][] bigDecimalArray22 = bigMatrixImpl21.getData();
        org.apache.commons.math.linear.BigMatrix bigMatrix24 = bigMatrixImpl21.getColumnMatrix((int) (short) 1);
        org.apache.commons.math.linear.BigMatrix bigMatrix26 = bigMatrixImpl21.getRowMatrix(4);
        double[] doubleArray29 = new double[] { 1, (byte) 10 };
        double[] doubleArray32 = new double[] { 1, (byte) 10 };
        double[] doubleArray35 = new double[] { 1, (byte) 10 };
        double[] doubleArray38 = new double[] { 1, (byte) 10 };
        double[] doubleArray41 = new double[] { 1, (byte) 10 };
        double[] doubleArray44 = new double[] { 1, (byte) 10 };
        double[][] doubleArray45 = new double[][] { doubleArray29, doubleArray32, doubleArray35, doubleArray38, doubleArray41, doubleArray44 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl46 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray45);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl47 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray45);
        double[] doubleArray50 = new double[] { 1, (byte) 10 };
        double[] doubleArray53 = new double[] { 1, (byte) 10 };
        double[] doubleArray56 = new double[] { 1, (byte) 10 };
        double[] doubleArray59 = new double[] { 1, (byte) 10 };
        double[] doubleArray62 = new double[] { 1, (byte) 10 };
        double[] doubleArray65 = new double[] { 1, (byte) 10 };
        double[][] doubleArray66 = new double[][] { doubleArray50, doubleArray53, doubleArray56, doubleArray59, doubleArray62, doubleArray65 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl67 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray66);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl68 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray66);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl69 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray66);
        int int70 = bigMatrixImpl69.getColumnDimension();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl71 = bigMatrixImpl47.add(bigMatrixImpl69);
        java.math.BigDecimal bigDecimal72 = bigMatrixImpl69.getNorm();
        org.apache.commons.math.linear.BigMatrix bigMatrix73 = bigMatrixImpl21.scalarAdd(bigDecimal72);
        int int74 = bigMatrixImpl21.getScale();
        java.math.BigDecimal[][] bigDecimalArray75 = bigMatrixImpl21.getDataRef();
        double[][] doubleArray76 = bigMatrixImpl21.getDataAsDoubleArray();
        java.lang.String str77 = bigMatrixImpl21.toString();
        double[] doubleArray79 = bigMatrixImpl21.getColumnAsDoubleArray((int) (byte) 0);
        java.math.BigDecimal bigDecimal80 = bigMatrixImpl21.getNorm();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(bigDecimalArray22);
        org.junit.Assert.assertNotNull(bigMatrix24);
        org.junit.Assert.assertNotNull(bigMatrix26);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 2 + "'", int70 == 2);
        org.junit.Assert.assertNotNull(bigMatrixImpl71);
        org.junit.Assert.assertNotNull(bigDecimal72);
        org.junit.Assert.assertNotNull(bigMatrix73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 64 + "'", int74 == 64);
        org.junit.Assert.assertNotNull(bigDecimalArray75);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "BigMatrixImpl{{1,10},{1,10},{1,10},{1,10},{1,10},{1,10}}" + "'", str77, "BigMatrixImpl{{1,10},{1,10},{1,10},{1,10},{1,10},{1,10}}");
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray79), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(bigDecimal80);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl5 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl6 = realMatrixImpl2.add(realMatrixImpl5);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl9 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix10 = realMatrixImpl5.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl9);
        boolean boolean11 = realMatrixImpl5.isSquare();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl14 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl17 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl14.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl17);
        int int19 = realMatrixImpl17.getRowDimension();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = realMatrixImpl5.subtract(realMatrixImpl17);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl23 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl27 = realMatrixImpl23.add(realMatrixImpl26);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl30 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = realMatrixImpl30.add(realMatrixImpl33);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl35 = realMatrixImpl23.add(realMatrixImpl33);
        org.apache.commons.math.linear.RealMatrix realMatrix36 = realMatrixImpl23.copy();
        org.apache.commons.math.linear.RealMatrix realMatrix37 = realMatrixImpl17.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl23);
        double double38 = realMatrixImpl17.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix40 = realMatrixImpl17.scalarAdd((double) (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix41 = realMatrixImpl17.inverse();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.InvalidMatrixException; message: coefficient matrix is not square");
        } catch (org.apache.commons.math.linear.InvalidMatrixException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrixImpl6);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(realMatrixImpl20);
        org.junit.Assert.assertNotNull(realMatrixImpl27);
        org.junit.Assert.assertNotNull(realMatrixImpl34);
        org.junit.Assert.assertNotNull(realMatrixImpl35);
        org.junit.Assert.assertNotNull(realMatrix36);
        org.junit.Assert.assertNotNull(realMatrix37);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertNotNull(realMatrix40);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        double[] doubleArray2 = new double[] { 1, (byte) 10 };
        double[] doubleArray5 = new double[] { 1, (byte) 10 };
        double[] doubleArray8 = new double[] { 1, (byte) 10 };
        double[] doubleArray11 = new double[] { 1, (byte) 10 };
        double[] doubleArray14 = new double[] { 1, (byte) 10 };
        double[] doubleArray17 = new double[] { 1, (byte) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl21 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        int int22 = bigMatrixImpl21.getColumnDimension();
        double[] doubleArray25 = new double[] { 1, (byte) 10 };
        double[] doubleArray28 = new double[] { 1, (byte) 10 };
        double[] doubleArray31 = new double[] { 1, (byte) 10 };
        double[] doubleArray34 = new double[] { 1, (byte) 10 };
        double[] doubleArray37 = new double[] { 1, (byte) 10 };
        double[] doubleArray40 = new double[] { 1, (byte) 10 };
        double[][] doubleArray41 = new double[][] { doubleArray25, doubleArray28, doubleArray31, doubleArray34, doubleArray37, doubleArray40 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl42 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray41);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl43 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray41);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl44 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray41);
        java.math.BigDecimal[][] bigDecimalArray45 = bigMatrixImpl44.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl47 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray45, false);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl49 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray45, true);
        org.apache.commons.math.linear.BigMatrix bigMatrix50 = bigMatrixImpl21.add((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl49);
        int int51 = bigMatrixImpl49.getRoundingMode();
        org.apache.commons.math.linear.BigMatrix bigMatrix53 = bigMatrixImpl49.getRowMatrix(4);
        bigMatrixImpl49.setScale(5);
        double[] doubleArray58 = new double[] { 1, (byte) 10 };
        double[] doubleArray61 = new double[] { 1, (byte) 10 };
        double[] doubleArray64 = new double[] { 1, (byte) 10 };
        double[] doubleArray67 = new double[] { 1, (byte) 10 };
        double[] doubleArray70 = new double[] { 1, (byte) 10 };
        double[] doubleArray73 = new double[] { 1, (byte) 10 };
        double[][] doubleArray74 = new double[][] { doubleArray58, doubleArray61, doubleArray64, doubleArray67, doubleArray70, doubleArray73 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl75 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray74);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl76 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray74);
        int int77 = bigMatrixImpl76.getRowDimension();
        bigMatrixImpl76.setRoundingMode(5);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl80 = bigMatrixImpl49.add(bigMatrixImpl76);
        int int81 = bigMatrixImpl76.getRoundingMode();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertNotNull(bigDecimalArray45);
        org.junit.Assert.assertNotNull(bigMatrix50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 4 + "'", int51 == 4);
        org.junit.Assert.assertNotNull(bigMatrix53);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 6 + "'", int77 == 6);
        org.junit.Assert.assertNotNull(bigMatrixImpl80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 5 + "'", int81 == 5);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl5 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl6 = realMatrixImpl2.add(realMatrixImpl5);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl9 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = realMatrixImpl9.add(realMatrixImpl12);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl14 = realMatrixImpl2.add(realMatrixImpl12);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = realMatrixImpl2.scalarAdd((double) (byte) 1);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl23 = realMatrixImpl19.add(realMatrixImpl22);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrixImpl22.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        boolean boolean28 = realMatrixImpl22.isSquare();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix35 = realMatrixImpl31.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl34);
        int int36 = realMatrixImpl34.getRowDimension();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl37 = realMatrixImpl22.subtract(realMatrixImpl34);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl38 = realMatrixImpl2.add(realMatrixImpl34);
        int int39 = realMatrixImpl38.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix41 = realMatrixImpl38.scalarMultiply((double) 10);
        org.junit.Assert.assertNotNull(realMatrixImpl6);
        org.junit.Assert.assertNotNull(realMatrixImpl13);
        org.junit.Assert.assertNotNull(realMatrixImpl14);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrixImpl23);
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(realMatrix35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertNotNull(realMatrixImpl37);
        org.junit.Assert.assertNotNull(realMatrixImpl38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 35 + "'", int39 == 35);
        org.junit.Assert.assertNotNull(realMatrix41);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl5 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl6 = realMatrixImpl2.add(realMatrixImpl5);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl9 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix10 = realMatrixImpl5.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl9);
        boolean boolean11 = realMatrixImpl5.isSquare();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl14 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl17 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl14.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl17);
        int int19 = realMatrixImpl17.getRowDimension();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = realMatrixImpl5.subtract(realMatrixImpl17);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl23 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl27 = realMatrixImpl23.add(realMatrixImpl26);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl30 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = realMatrixImpl30.add(realMatrixImpl33);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl35 = realMatrixImpl23.add(realMatrixImpl33);
        org.apache.commons.math.linear.RealMatrix realMatrix36 = realMatrixImpl23.copy();
        org.apache.commons.math.linear.RealMatrix realMatrix37 = realMatrixImpl17.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl23);
        double double38 = realMatrixImpl23.getNorm();
        double double39 = realMatrixImpl23.getNorm();
        int int40 = realMatrixImpl23.getColumnDimension();
        org.junit.Assert.assertNotNull(realMatrixImpl6);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(realMatrixImpl20);
        org.junit.Assert.assertNotNull(realMatrixImpl27);
        org.junit.Assert.assertNotNull(realMatrixImpl34);
        org.junit.Assert.assertNotNull(realMatrixImpl35);
        org.junit.Assert.assertNotNull(realMatrix36);
        org.junit.Assert.assertNotNull(realMatrix37);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 35 + "'", int40 == 35);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        double[] doubleArray2 = new double[] { 1, (byte) 10 };
        double[] doubleArray5 = new double[] { 1, (byte) 10 };
        double[] doubleArray8 = new double[] { 1, (byte) 10 };
        double[] doubleArray11 = new double[] { 1, (byte) 10 };
        double[] doubleArray14 = new double[] { 1, (byte) 10 };
        double[] doubleArray17 = new double[] { 1, (byte) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        double[] doubleArray23 = new double[] { 1, (byte) 10 };
        double[] doubleArray26 = new double[] { 1, (byte) 10 };
        double[] doubleArray29 = new double[] { 1, (byte) 10 };
        double[] doubleArray32 = new double[] { 1, (byte) 10 };
        double[] doubleArray35 = new double[] { 1, (byte) 10 };
        double[] doubleArray38 = new double[] { 1, (byte) 10 };
        double[][] doubleArray39 = new double[][] { doubleArray23, doubleArray26, doubleArray29, doubleArray32, doubleArray35, doubleArray38 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl40 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray39);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl41 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray39);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl42 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray39);
        int int43 = bigMatrixImpl42.getColumnDimension();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl44 = bigMatrixImpl20.add(bigMatrixImpl42);
        java.math.BigDecimal bigDecimal45 = bigMatrixImpl42.getNorm();
        double[] doubleArray48 = new double[] { 1, (byte) 10 };
        double[] doubleArray51 = new double[] { 1, (byte) 10 };
        double[] doubleArray54 = new double[] { 1, (byte) 10 };
        double[] doubleArray57 = new double[] { 1, (byte) 10 };
        double[] doubleArray60 = new double[] { 1, (byte) 10 };
        double[] doubleArray63 = new double[] { 1, (byte) 10 };
        double[][] doubleArray64 = new double[][] { doubleArray48, doubleArray51, doubleArray54, doubleArray57, doubleArray60, doubleArray63 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl65 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray64);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl66 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray64);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl67 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray64);
        int int68 = bigMatrixImpl67.getColumnDimension();
        int int69 = bigMatrixImpl67.getScale();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl70 = bigMatrixImpl42.subtract(bigMatrixImpl67);
        bigMatrixImpl70.setRoundingMode(97);
        bigMatrixImpl70.setRoundingMode((int) (byte) 1);
        double[] doubleArray76 = bigMatrixImpl70.getRowAsDoubleArray(1);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl77 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray76);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix78 = realMatrixImpl77.inverse();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.InvalidMatrixException; message: coefficient matrix is not square");
        } catch (org.apache.commons.math.linear.InvalidMatrixException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertNotNull(bigMatrixImpl44);
        org.junit.Assert.assertNotNull(bigDecimal45);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 2 + "'", int68 == 2);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 64 + "'", int69 == 64);
        org.junit.Assert.assertNotNull(bigMatrixImpl70);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[0.0, 0.0]");
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl5 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl6 = realMatrixImpl2.add(realMatrixImpl5);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl9 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix10 = realMatrixImpl5.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl9);
        boolean boolean11 = realMatrixImpl5.isSquare();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl14 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl17 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl14.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl17);
        int int19 = realMatrixImpl17.getRowDimension();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = realMatrixImpl5.subtract(realMatrixImpl17);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl23 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrixImpl23.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl30 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = realMatrixImpl30.add(realMatrixImpl33);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl37 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix38 = realMatrixImpl33.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl37);
        boolean boolean39 = realMatrixImpl26.equals((java.lang.Object) realMatrixImpl37);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl40 = realMatrixImpl5.add(realMatrixImpl37);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl43 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl46 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix47 = realMatrixImpl43.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl46);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl50 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl53 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl54 = realMatrixImpl50.add(realMatrixImpl53);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl57 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix58 = realMatrixImpl53.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl57);
        boolean boolean59 = realMatrixImpl46.equals((java.lang.Object) realMatrixImpl57);
        boolean boolean60 = realMatrixImpl46.isSquare();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl61 = realMatrixImpl37.add(realMatrixImpl46);
        org.apache.commons.math.linear.RealMatrix realMatrix62 = realMatrixImpl61.transpose();
        org.junit.Assert.assertNotNull(realMatrixImpl6);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(realMatrixImpl20);
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertNotNull(realMatrixImpl34);
        org.junit.Assert.assertNotNull(realMatrix38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(realMatrixImpl40);
        org.junit.Assert.assertNotNull(realMatrix47);
        org.junit.Assert.assertNotNull(realMatrixImpl54);
        org.junit.Assert.assertNotNull(realMatrix58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(realMatrixImpl61);
        org.junit.Assert.assertNotNull(realMatrix62);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (short) 10, (int) 'a');
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        java.math.BigDecimal bigDecimal0 = null;
        java.math.BigDecimal[] bigDecimalArray1 = new java.math.BigDecimal[] { bigDecimal0 };
        java.math.BigDecimal bigDecimal2 = null;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = null;
        java.math.BigDecimal[] bigDecimalArray5 = new java.math.BigDecimal[] { bigDecimal4 };
        java.math.BigDecimal bigDecimal6 = null;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = null;
        java.math.BigDecimal[] bigDecimalArray9 = new java.math.BigDecimal[] { bigDecimal8 };
        java.math.BigDecimal[][] bigDecimalArray10 = new java.math.BigDecimal[][] { bigDecimalArray1, bigDecimalArray3, bigDecimalArray5, bigDecimalArray7, bigDecimalArray9 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl12 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray10, true);
        bigMatrixImpl12.setScale((int) (short) 0);
        bigMatrixImpl12.setRoundingMode(0);
        bigMatrixImpl12.setScale((int) '4');
        java.lang.String str19 = bigMatrixImpl12.toString();
        java.math.BigDecimal[][] bigDecimalArray20 = bigMatrixImpl12.getData();
        boolean boolean21 = bigMatrixImpl12.isSquare();
        boolean boolean22 = bigMatrixImpl12.isSingular();
        // The following exception was thrown during execution in test generation
        try {
            double double25 = bigMatrixImpl12.getEntryAsDouble((int) (short) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: matrix entry does not exist");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimalArray1);
        org.junit.Assert.assertNotNull(bigDecimalArray3);
        org.junit.Assert.assertNotNull(bigDecimalArray5);
        org.junit.Assert.assertNotNull(bigDecimalArray7);
        org.junit.Assert.assertNotNull(bigDecimalArray9);
        org.junit.Assert.assertNotNull(bigDecimalArray10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "BigMatrixImpl{{null},{null},{null},{null},{null}}" + "'", str19, "BigMatrixImpl{{null},{null},{null},{null},{null}}");
        org.junit.Assert.assertNotNull(bigDecimalArray20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        double[] doubleArray2 = new double[] { 1, (byte) 10 };
        double[] doubleArray5 = new double[] { 1, (byte) 10 };
        double[] doubleArray8 = new double[] { 1, (byte) 10 };
        double[] doubleArray11 = new double[] { 1, (byte) 10 };
        double[] doubleArray14 = new double[] { 1, (byte) 10 };
        double[] doubleArray17 = new double[] { 1, (byte) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl21 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray18, true);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl25 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.RealMatrix realMatrix26 = realMatrixImpl25.copy();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(realMatrix26);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix4 = realMatrixImpl2.scalarAdd((double) 2);
        int int5 = realMatrixImpl2.getRowDimension();
        double double8 = realMatrixImpl2.getEntry((int) (short) 1, 6);
        double double11 = realMatrixImpl2.getEntry(1, (int) (byte) 10);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl14 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl17 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl14.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl17);
        int int19 = realMatrixImpl17.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix20 = realMatrixImpl2.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl17);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl23 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl27 = realMatrixImpl23.add(realMatrixImpl26);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl30 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = realMatrixImpl30.add(realMatrixImpl33);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl35 = realMatrixImpl23.add(realMatrixImpl33);
        org.apache.commons.math.linear.RealMatrix realMatrix37 = realMatrixImpl23.scalarAdd((double) (byte) 1);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl40 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl43 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl44 = realMatrixImpl40.add(realMatrixImpl43);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl47 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix48 = realMatrixImpl43.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl47);
        boolean boolean49 = realMatrixImpl43.isSquare();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl52 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl55 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix56 = realMatrixImpl52.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl55);
        int int57 = realMatrixImpl55.getRowDimension();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl58 = realMatrixImpl43.subtract(realMatrixImpl55);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl59 = realMatrixImpl23.add(realMatrixImpl55);
        org.apache.commons.math.linear.RealMatrix realMatrix60 = realMatrixImpl23.copy();
        boolean boolean61 = realMatrixImpl23.isSquare();
        double[][] doubleArray62 = realMatrixImpl23.getDataRef();
        org.apache.commons.math.linear.RealMatrix realMatrix63 = realMatrixImpl2.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl23);
        org.apache.commons.math.linear.RealMatrix realMatrix65 = realMatrixImpl23.getRowMatrix((int) (byte) 0);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl68 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl71 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix72 = realMatrixImpl68.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl71);
        org.apache.commons.math.linear.RealMatrix realMatrix74 = realMatrixImpl71.getColumnMatrix((int) (short) 1);
        double[][] doubleArray75 = realMatrixImpl71.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix76 = realMatrixImpl23.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl71);
        double double79 = realMatrixImpl71.getEntry(0, 5);
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(realMatrixImpl27);
        org.junit.Assert.assertNotNull(realMatrixImpl34);
        org.junit.Assert.assertNotNull(realMatrixImpl35);
        org.junit.Assert.assertNotNull(realMatrix37);
        org.junit.Assert.assertNotNull(realMatrixImpl44);
        org.junit.Assert.assertNotNull(realMatrix48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(realMatrix56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 10 + "'", int57 == 10);
        org.junit.Assert.assertNotNull(realMatrixImpl58);
        org.junit.Assert.assertNotNull(realMatrixImpl59);
        org.junit.Assert.assertNotNull(realMatrix60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertNotNull(realMatrix63);
        org.junit.Assert.assertNotNull(realMatrix65);
        org.junit.Assert.assertNotNull(realMatrix72);
        org.junit.Assert.assertNotNull(realMatrix74);
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertNotNull(realMatrix76);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 0.0d + "'", double79 == 0.0d);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl5 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix6 = realMatrixImpl2.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl5);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl5.getColumnMatrix((int) (short) 1);
        boolean boolean9 = realMatrixImpl5.isSingular();
        int int10 = realMatrixImpl5.getRowDimension();
        double[][] doubleArray11 = realMatrixImpl5.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11, false);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = realMatrixImpl13.getDeterminant();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.InvalidMatrixException; message: matrix is not square");
        } catch (org.apache.commons.math.linear.InvalidMatrixException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(doubleArray11);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        double[] doubleArray2 = new double[] { 1, (byte) 10 };
        double[] doubleArray5 = new double[] { 1, (byte) 10 };
        double[] doubleArray8 = new double[] { 1, (byte) 10 };
        double[] doubleArray11 = new double[] { 1, (byte) 10 };
        double[] doubleArray14 = new double[] { 1, (byte) 10 };
        double[] doubleArray17 = new double[] { 1, (byte) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        java.math.BigDecimal bigDecimal23 = bigMatrixImpl20.getEntry(0, (int) (short) 0);
        double[][] doubleArray24 = bigMatrixImpl20.getDataAsDoubleArray();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl25 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray24);
        int int26 = realMatrixImpl25.getColumnDimension();
        double double27 = realMatrixImpl25.getNorm();
        // The following exception was thrown during execution in test generation
        try {
            realMatrixImpl25.luDecompose();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.InvalidMatrixException; message: LU decomposition requires that the matrix be square.");
        } catch (org.apache.commons.math.linear.InvalidMatrixException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 60.0d + "'", double27 == 60.0d);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl5 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix6 = realMatrixImpl2.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl5);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl9 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = realMatrixImpl9.add(realMatrixImpl12);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        boolean boolean18 = realMatrixImpl5.equals((java.lang.Object) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix19 = realMatrixImpl5.copy();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl25 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = realMatrixImpl22.add(realMatrixImpl25);
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrixImpl26.copy();
        org.apache.commons.math.linear.RealMatrix realMatrix28 = realMatrixImpl5.add(realMatrix27);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrixImpl13);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(realMatrixImpl26);
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertNotNull(realMatrix28);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        java.math.BigDecimal bigDecimal0 = null;
        java.math.BigDecimal[] bigDecimalArray1 = new java.math.BigDecimal[] { bigDecimal0 };
        java.math.BigDecimal bigDecimal2 = null;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = null;
        java.math.BigDecimal[] bigDecimalArray5 = new java.math.BigDecimal[] { bigDecimal4 };
        java.math.BigDecimal bigDecimal6 = null;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = null;
        java.math.BigDecimal[] bigDecimalArray9 = new java.math.BigDecimal[] { bigDecimal8 };
        java.math.BigDecimal[][] bigDecimalArray10 = new java.math.BigDecimal[][] { bigDecimalArray1, bigDecimalArray3, bigDecimalArray5, bigDecimalArray7, bigDecimalArray9 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl12 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray10, true);
        bigMatrixImpl12.setScale((int) (short) 0);
        int int15 = bigMatrixImpl12.getRoundingMode();
        bigMatrixImpl12.setRoundingMode((int) (byte) 100);
        boolean boolean18 = bigMatrixImpl12.isSingular();
        java.math.BigDecimal[][] bigDecimalArray19 = bigMatrixImpl12.getData();
        org.junit.Assert.assertNotNull(bigDecimalArray1);
        org.junit.Assert.assertNotNull(bigDecimalArray3);
        org.junit.Assert.assertNotNull(bigDecimalArray5);
        org.junit.Assert.assertNotNull(bigDecimalArray7);
        org.junit.Assert.assertNotNull(bigDecimalArray9);
        org.junit.Assert.assertNotNull(bigDecimalArray10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(bigDecimalArray19);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        double[] doubleArray2 = new double[] { 1, (byte) 10 };
        double[] doubleArray5 = new double[] { 1, (byte) 10 };
        double[] doubleArray8 = new double[] { 1, (byte) 10 };
        double[] doubleArray11 = new double[] { 1, (byte) 10 };
        double[] doubleArray14 = new double[] { 1, (byte) 10 };
        double[] doubleArray17 = new double[] { 1, (byte) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        double[] doubleArray23 = new double[] { 1, (byte) 10 };
        double[] doubleArray26 = new double[] { 1, (byte) 10 };
        double[] doubleArray29 = new double[] { 1, (byte) 10 };
        double[] doubleArray32 = new double[] { 1, (byte) 10 };
        double[] doubleArray35 = new double[] { 1, (byte) 10 };
        double[] doubleArray38 = new double[] { 1, (byte) 10 };
        double[][] doubleArray39 = new double[][] { doubleArray23, doubleArray26, doubleArray29, doubleArray32, doubleArray35, doubleArray38 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl40 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray39);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl41 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray39);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl42 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray39);
        int int43 = bigMatrixImpl42.getColumnDimension();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl44 = bigMatrixImpl20.add(bigMatrixImpl42);
        java.math.BigDecimal bigDecimal45 = bigMatrixImpl42.getNorm();
        double[] doubleArray48 = new double[] { 1, (byte) 10 };
        double[] doubleArray51 = new double[] { 1, (byte) 10 };
        double[] doubleArray54 = new double[] { 1, (byte) 10 };
        double[] doubleArray57 = new double[] { 1, (byte) 10 };
        double[] doubleArray60 = new double[] { 1, (byte) 10 };
        double[] doubleArray63 = new double[] { 1, (byte) 10 };
        double[][] doubleArray64 = new double[][] { doubleArray48, doubleArray51, doubleArray54, doubleArray57, doubleArray60, doubleArray63 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl65 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray64);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl66 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray64);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl67 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray64);
        int int68 = bigMatrixImpl67.getColumnDimension();
        int int69 = bigMatrixImpl67.getScale();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl70 = bigMatrixImpl42.subtract(bigMatrixImpl67);
        bigMatrixImpl70.setRoundingMode(97);
        bigMatrixImpl70.setRoundingMode((int) (byte) 1);
        double[] doubleArray76 = bigMatrixImpl70.getRowAsDoubleArray(1);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl77 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray76);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl80 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl83 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl84 = realMatrixImpl80.add(realMatrixImpl83);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl87 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl90 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl91 = realMatrixImpl87.add(realMatrixImpl90);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl92 = realMatrixImpl80.add(realMatrixImpl90);
        org.apache.commons.math.linear.RealMatrix realMatrix93 = realMatrixImpl80.copy();
        double[][] doubleArray94 = realMatrixImpl80.getData();
        boolean boolean95 = realMatrixImpl77.equals((java.lang.Object) doubleArray94);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertNotNull(bigMatrixImpl44);
        org.junit.Assert.assertNotNull(bigDecimal45);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 2 + "'", int68 == 2);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 64 + "'", int69 == 64);
        org.junit.Assert.assertNotNull(bigMatrixImpl70);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[0.0, 0.0]");
        org.junit.Assert.assertNotNull(realMatrixImpl84);
        org.junit.Assert.assertNotNull(realMatrixImpl91);
        org.junit.Assert.assertNotNull(realMatrixImpl92);
        org.junit.Assert.assertNotNull(realMatrix93);
        org.junit.Assert.assertNotNull(doubleArray94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        java.lang.String[] strArray1 = new java.lang.String[] { "BigMatrixImpl{{null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null},{null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null}}" };
        java.lang.String[] strArray3 = new java.lang.String[] { "BigMatrixImpl{{null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null},{null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null}}" };
        java.lang.String[] strArray5 = new java.lang.String[] { "BigMatrixImpl{{null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null},{null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null}}" };
        java.lang.String[] strArray7 = new java.lang.String[] { "BigMatrixImpl{{null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null},{null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null}}" };
        java.lang.String[] strArray9 = new java.lang.String[] { "BigMatrixImpl{{null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null},{null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null}}" };
        java.lang.String[] strArray11 = new java.lang.String[] { "BigMatrixImpl{{null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null},{null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null}}" };
        java.lang.String[][] strArray12 = new java.lang.String[][] { strArray1, strArray3, strArray5, strArray7, strArray9, strArray11 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        double[] doubleArray2 = new double[] { 1, (byte) 10 };
        double[] doubleArray5 = new double[] { 1, (byte) 10 };
        double[] doubleArray8 = new double[] { 1, (byte) 10 };
        double[] doubleArray11 = new double[] { 1, (byte) 10 };
        double[] doubleArray14 = new double[] { 1, (byte) 10 };
        double[] doubleArray17 = new double[] { 1, (byte) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        double[] doubleArray23 = new double[] { 1, (byte) 10 };
        double[] doubleArray26 = new double[] { 1, (byte) 10 };
        double[] doubleArray29 = new double[] { 1, (byte) 10 };
        double[] doubleArray32 = new double[] { 1, (byte) 10 };
        double[] doubleArray35 = new double[] { 1, (byte) 10 };
        double[] doubleArray38 = new double[] { 1, (byte) 10 };
        double[][] doubleArray39 = new double[][] { doubleArray23, doubleArray26, doubleArray29, doubleArray32, doubleArray35, doubleArray38 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl40 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray39);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl41 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray39);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl42 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray39);
        int int43 = bigMatrixImpl42.getColumnDimension();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl44 = bigMatrixImpl20.add(bigMatrixImpl42);
        java.math.BigDecimal bigDecimal45 = bigMatrixImpl42.getNorm();
        java.math.BigDecimal[][] bigDecimalArray46 = bigMatrixImpl42.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl49 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl52 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl53 = realMatrixImpl49.add(realMatrixImpl52);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl56 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl59 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl60 = realMatrixImpl56.add(realMatrixImpl59);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl61 = realMatrixImpl49.add(realMatrixImpl59);
        org.apache.commons.math.linear.RealMatrix realMatrix63 = realMatrixImpl49.getColumnMatrix((int) ' ');
        double[][] doubleArray64 = realMatrixImpl49.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl66 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray64, false);
        boolean boolean67 = bigMatrixImpl42.equals((java.lang.Object) false);
        java.math.BigDecimal bigDecimal68 = null;
        java.math.BigDecimal[] bigDecimalArray69 = new java.math.BigDecimal[] { bigDecimal68 };
        java.math.BigDecimal bigDecimal70 = null;
        java.math.BigDecimal[] bigDecimalArray71 = new java.math.BigDecimal[] { bigDecimal70 };
        java.math.BigDecimal bigDecimal72 = null;
        java.math.BigDecimal[] bigDecimalArray73 = new java.math.BigDecimal[] { bigDecimal72 };
        java.math.BigDecimal bigDecimal74 = null;
        java.math.BigDecimal[] bigDecimalArray75 = new java.math.BigDecimal[] { bigDecimal74 };
        java.math.BigDecimal bigDecimal76 = null;
        java.math.BigDecimal[] bigDecimalArray77 = new java.math.BigDecimal[] { bigDecimal76 };
        java.math.BigDecimal[][] bigDecimalArray78 = new java.math.BigDecimal[][] { bigDecimalArray69, bigDecimalArray71, bigDecimalArray73, bigDecimalArray75, bigDecimalArray77 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl80 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray78, true);
        bigMatrixImpl80.setScale((int) (short) 0);
        int int83 = bigMatrixImpl80.getRoundingMode();
        int int84 = bigMatrixImpl80.getRowDimension();
        int int85 = bigMatrixImpl80.getRoundingMode();
        int int86 = bigMatrixImpl80.getColumnDimension();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix87 = bigMatrixImpl42.solve((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl80);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect row dimension");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertNotNull(bigMatrixImpl44);
        org.junit.Assert.assertNotNull(bigDecimal45);
        org.junit.Assert.assertNotNull(bigDecimalArray46);
        org.junit.Assert.assertNotNull(realMatrixImpl53);
        org.junit.Assert.assertNotNull(realMatrixImpl60);
        org.junit.Assert.assertNotNull(realMatrixImpl61);
        org.junit.Assert.assertNotNull(realMatrix63);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(bigDecimalArray69);
        org.junit.Assert.assertNotNull(bigDecimalArray71);
        org.junit.Assert.assertNotNull(bigDecimalArray73);
        org.junit.Assert.assertNotNull(bigDecimalArray75);
        org.junit.Assert.assertNotNull(bigDecimalArray77);
        org.junit.Assert.assertNotNull(bigDecimalArray78);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 4 + "'", int83 == 4);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 5 + "'", int84 == 5);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 4 + "'", int85 == 4);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 1 + "'", int86 == 1);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl5 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl6 = realMatrixImpl2.add(realMatrixImpl5);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl9 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = realMatrixImpl9.add(realMatrixImpl12);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl14 = realMatrixImpl2.add(realMatrixImpl12);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = realMatrixImpl2.getColumnMatrix((int) ' ');
        double[][] doubleArray17 = realMatrixImpl2.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17, false);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray17);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl23 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl27 = realMatrixImpl23.add(realMatrixImpl26);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl30 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = realMatrixImpl30.add(realMatrixImpl33);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl37 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix38 = realMatrixImpl33.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl37);
        boolean boolean39 = realMatrixImpl33.isSquare();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl42 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl45 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix46 = realMatrixImpl42.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl45);
        int int47 = realMatrixImpl45.getRowDimension();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl48 = realMatrixImpl33.subtract(realMatrixImpl45);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl49 = realMatrixImpl26.subtract(realMatrixImpl48);
        double[] doubleArray51 = realMatrixImpl26.getRow(0);
        java.math.BigDecimal[] bigDecimalArray52 = bigMatrixImpl20.operate(doubleArray51);
        java.lang.String str53 = bigMatrixImpl20.toString();
        java.lang.String str54 = bigMatrixImpl20.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal55 = bigMatrixImpl20.getDeterminant();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.InvalidMatrixException; message: matrix is not square");
        } catch (org.apache.commons.math.linear.InvalidMatrixException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrixImpl6);
        org.junit.Assert.assertNotNull(realMatrixImpl13);
        org.junit.Assert.assertNotNull(realMatrixImpl14);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertNotNull(realMatrixImpl27);
        org.junit.Assert.assertNotNull(realMatrixImpl34);
        org.junit.Assert.assertNotNull(realMatrix38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(realMatrix46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 10 + "'", int47 == 10);
        org.junit.Assert.assertNotNull(realMatrixImpl48);
        org.junit.Assert.assertNotNull(realMatrixImpl49);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(bigDecimalArray52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "BigMatrixImpl{{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}}" + "'", str53, "BigMatrixImpl{{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}}");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "BigMatrixImpl{{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}}" + "'", str54, "BigMatrixImpl{{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}}");
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        double[] doubleArray2 = new double[] { 1, (byte) 10 };
        double[] doubleArray5 = new double[] { 1, (byte) 10 };
        double[] doubleArray8 = new double[] { 1, (byte) 10 };
        double[] doubleArray11 = new double[] { 1, (byte) 10 };
        double[] doubleArray14 = new double[] { 1, (byte) 10 };
        double[] doubleArray17 = new double[] { 1, (byte) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        int int21 = bigMatrixImpl20.getScale();
        double[] doubleArray24 = new double[] { 1, (byte) 10 };
        double[] doubleArray27 = new double[] { 1, (byte) 10 };
        double[] doubleArray30 = new double[] { 1, (byte) 10 };
        double[] doubleArray33 = new double[] { 1, (byte) 10 };
        double[] doubleArray36 = new double[] { 1, (byte) 10 };
        double[] doubleArray39 = new double[] { 1, (byte) 10 };
        double[][] doubleArray40 = new double[][] { doubleArray24, doubleArray27, doubleArray30, doubleArray33, doubleArray36, doubleArray39 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl41 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray40);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl42 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray40);
        double[] doubleArray45 = new double[] { 1, (byte) 10 };
        double[] doubleArray48 = new double[] { 1, (byte) 10 };
        double[] doubleArray51 = new double[] { 1, (byte) 10 };
        double[] doubleArray54 = new double[] { 1, (byte) 10 };
        double[] doubleArray57 = new double[] { 1, (byte) 10 };
        double[] doubleArray60 = new double[] { 1, (byte) 10 };
        double[][] doubleArray61 = new double[][] { doubleArray45, doubleArray48, doubleArray51, doubleArray54, doubleArray57, doubleArray60 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl62 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray61);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl63 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray61);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl64 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray61);
        int int65 = bigMatrixImpl64.getColumnDimension();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl66 = bigMatrixImpl42.add(bigMatrixImpl64);
        boolean boolean67 = bigMatrixImpl66.isSquare();
        java.math.BigDecimal bigDecimal68 = bigMatrixImpl66.getNorm();
        int int69 = bigMatrixImpl66.getRowDimension();
        org.apache.commons.math.linear.BigMatrix bigMatrix70 = bigMatrixImpl66.copy();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl71 = bigMatrixImpl20.subtract(bigMatrixImpl66);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 64 + "'", int21 == 64);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 2 + "'", int65 == 2);
        org.junit.Assert.assertNotNull(bigMatrixImpl66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(bigDecimal68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 6 + "'", int69 == 6);
        org.junit.Assert.assertNotNull(bigMatrix70);
        org.junit.Assert.assertNotNull(bigMatrixImpl71);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        double[] doubleArray2 = new double[] { 1, (byte) 10 };
        double[] doubleArray5 = new double[] { 1, (byte) 10 };
        double[] doubleArray8 = new double[] { 1, (byte) 10 };
        double[] doubleArray11 = new double[] { 1, (byte) 10 };
        double[] doubleArray14 = new double[] { 1, (byte) 10 };
        double[] doubleArray17 = new double[] { 1, (byte) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        int int21 = bigMatrixImpl20.getScale();
        java.math.BigDecimal[][] bigDecimalArray22 = bigMatrixImpl20.getData();
        org.apache.commons.math.linear.BigMatrix bigMatrix23 = bigMatrixImpl20.copy();
        double[] doubleArray26 = new double[] { 1, (byte) 10 };
        double[] doubleArray29 = new double[] { 1, (byte) 10 };
        double[] doubleArray32 = new double[] { 1, (byte) 10 };
        double[] doubleArray35 = new double[] { 1, (byte) 10 };
        double[] doubleArray38 = new double[] { 1, (byte) 10 };
        double[] doubleArray41 = new double[] { 1, (byte) 10 };
        double[][] doubleArray42 = new double[][] { doubleArray26, doubleArray29, doubleArray32, doubleArray35, doubleArray38, doubleArray41 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl43 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray42);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl44 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray42);
        int int45 = bigMatrixImpl44.getScale();
        java.math.BigDecimal[][] bigDecimalArray46 = bigMatrixImpl44.getData();
        org.apache.commons.math.linear.BigMatrix bigMatrix47 = bigMatrixImpl44.copy();
        int int48 = bigMatrixImpl44.getRowDimension();
        boolean boolean49 = bigMatrixImpl44.isSingular();
        java.math.BigDecimal[][] bigDecimalArray50 = bigMatrixImpl44.getDataRef();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl52 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray50, false);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl53 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray50);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl54 = bigMatrixImpl20.subtract(bigMatrixImpl53);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 64 + "'", int21 == 64);
        org.junit.Assert.assertNotNull(bigDecimalArray22);
        org.junit.Assert.assertNotNull(bigMatrix23);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 64 + "'", int45 == 64);
        org.junit.Assert.assertNotNull(bigDecimalArray46);
        org.junit.Assert.assertNotNull(bigMatrix47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 6 + "'", int48 == 6);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(bigDecimalArray50);
        org.junit.Assert.assertNotNull(bigMatrixImpl54);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl5 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl6 = realMatrixImpl2.add(realMatrixImpl5);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl9 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = realMatrixImpl9.add(realMatrixImpl12);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl14 = realMatrixImpl2.add(realMatrixImpl12);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = realMatrixImpl2.scalarAdd((double) (byte) 1);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl23 = realMatrixImpl19.add(realMatrixImpl22);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrixImpl22.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        boolean boolean28 = realMatrixImpl22.isSquare();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix35 = realMatrixImpl31.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl34);
        int int36 = realMatrixImpl34.getRowDimension();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl37 = realMatrixImpl22.subtract(realMatrixImpl34);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl38 = realMatrixImpl2.add(realMatrixImpl34);
        double[][] doubleArray39 = realMatrixImpl38.getData();
        double[][] doubleArray40 = realMatrixImpl38.getData();
        boolean boolean41 = realMatrixImpl38.isSingular();
        double[][] doubleArray42 = realMatrixImpl38.getData();
        int int43 = realMatrixImpl38.getColumnDimension();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl46 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl49 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl50 = realMatrixImpl46.add(realMatrixImpl49);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl53 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl56 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl57 = realMatrixImpl53.add(realMatrixImpl56);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl58 = realMatrixImpl46.add(realMatrixImpl56);
        org.apache.commons.math.linear.RealMatrix realMatrix59 = realMatrixImpl46.copy();
        boolean boolean60 = realMatrixImpl38.equals((java.lang.Object) realMatrix59);
        double[] doubleArray63 = new double[] { 1, (byte) 10 };
        double[] doubleArray66 = new double[] { 1, (byte) 10 };
        double[] doubleArray69 = new double[] { 1, (byte) 10 };
        double[] doubleArray72 = new double[] { 1, (byte) 10 };
        double[] doubleArray75 = new double[] { 1, (byte) 10 };
        double[] doubleArray78 = new double[] { 1, (byte) 10 };
        double[][] doubleArray79 = new double[][] { doubleArray63, doubleArray66, doubleArray69, doubleArray72, doubleArray75, doubleArray78 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl80 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray79);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl81 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray79);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl82 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray79);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl83 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray79);
        int int84 = realMatrixImpl83.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix86 = realMatrixImpl83.getRowMatrix(0);
        org.apache.commons.math.linear.RealMatrix realMatrix87 = realMatrixImpl83.transpose();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl88 = realMatrixImpl38.add(realMatrixImpl83);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: matrix dimension mismatch");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrixImpl6);
        org.junit.Assert.assertNotNull(realMatrixImpl13);
        org.junit.Assert.assertNotNull(realMatrixImpl14);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrixImpl23);
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(realMatrix35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertNotNull(realMatrixImpl37);
        org.junit.Assert.assertNotNull(realMatrixImpl38);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 35 + "'", int43 == 35);
        org.junit.Assert.assertNotNull(realMatrixImpl50);
        org.junit.Assert.assertNotNull(realMatrixImpl57);
        org.junit.Assert.assertNotNull(realMatrixImpl58);
        org.junit.Assert.assertNotNull(realMatrix59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 6 + "'", int84 == 6);
        org.junit.Assert.assertNotNull(realMatrix86);
        org.junit.Assert.assertNotNull(realMatrix87);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) 'a', (int) 'a');
        int int3 = realMatrixImpl2.getColumnDimension();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl5 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl6 = realMatrixImpl2.add(realMatrixImpl5);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl9 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = realMatrixImpl9.add(realMatrixImpl12);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        boolean boolean18 = realMatrixImpl12.isSquare();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl21 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix25 = realMatrixImpl21.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl24);
        int int26 = realMatrixImpl24.getRowDimension();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl27 = realMatrixImpl12.subtract(realMatrixImpl24);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl28 = realMatrixImpl5.subtract(realMatrixImpl27);
        double[] doubleArray31 = new double[] { 1, (byte) 10 };
        double[] doubleArray34 = new double[] { 1, (byte) 10 };
        double[] doubleArray37 = new double[] { 1, (byte) 10 };
        double[] doubleArray40 = new double[] { 1, (byte) 10 };
        double[] doubleArray43 = new double[] { 1, (byte) 10 };
        double[] doubleArray46 = new double[] { 1, (byte) 10 };
        double[][] doubleArray47 = new double[][] { doubleArray31, doubleArray34, doubleArray37, doubleArray40, doubleArray43, doubleArray46 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl48 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray47);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl49 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray47);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl50 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray47);
        int int51 = bigMatrixImpl50.getRoundingMode();
        int int52 = bigMatrixImpl50.getScale();
        int int53 = bigMatrixImpl50.getScale();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl56 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl59 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl60 = realMatrixImpl56.add(realMatrixImpl59);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl63 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl66 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl67 = realMatrixImpl63.add(realMatrixImpl66);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl70 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl73 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl74 = realMatrixImpl70.add(realMatrixImpl73);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl75 = realMatrixImpl63.add(realMatrixImpl73);
        org.apache.commons.math.linear.RealMatrix realMatrix77 = realMatrixImpl63.scalarAdd((double) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix78 = realMatrixImpl60.add(realMatrix77);
        double[] doubleArray80 = realMatrixImpl60.getRow((int) (byte) 1);
        boolean boolean81 = bigMatrixImpl50.equals((java.lang.Object) doubleArray80);
        double[] doubleArray82 = realMatrixImpl28.operate(doubleArray80);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl83 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray80);
        org.apache.commons.math.linear.RealMatrix realMatrix84 = realMatrixImpl83.copy();
        org.junit.Assert.assertNotNull(realMatrixImpl6);
        org.junit.Assert.assertNotNull(realMatrixImpl13);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(realMatrix25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertNotNull(realMatrixImpl27);
        org.junit.Assert.assertNotNull(realMatrixImpl28);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 4 + "'", int51 == 4);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 64 + "'", int52 == 64);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 64 + "'", int53 == 64);
        org.junit.Assert.assertNotNull(realMatrixImpl60);
        org.junit.Assert.assertNotNull(realMatrixImpl67);
        org.junit.Assert.assertNotNull(realMatrixImpl74);
        org.junit.Assert.assertNotNull(realMatrixImpl75);
        org.junit.Assert.assertNotNull(realMatrix77);
        org.junit.Assert.assertNotNull(realMatrix78);
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(realMatrix84);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        double[] doubleArray2 = new double[] { 1, (byte) 10 };
        double[] doubleArray5 = new double[] { 1, (byte) 10 };
        double[] doubleArray8 = new double[] { 1, (byte) 10 };
        double[] doubleArray11 = new double[] { 1, (byte) 10 };
        double[] doubleArray14 = new double[] { 1, (byte) 10 };
        double[] doubleArray17 = new double[] { 1, (byte) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        double[] doubleArray23 = new double[] { 1, (byte) 10 };
        double[] doubleArray26 = new double[] { 1, (byte) 10 };
        double[] doubleArray29 = new double[] { 1, (byte) 10 };
        double[] doubleArray32 = new double[] { 1, (byte) 10 };
        double[] doubleArray35 = new double[] { 1, (byte) 10 };
        double[] doubleArray38 = new double[] { 1, (byte) 10 };
        double[][] doubleArray39 = new double[][] { doubleArray23, doubleArray26, doubleArray29, doubleArray32, doubleArray35, doubleArray38 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl40 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray39);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl41 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray39);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl42 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray39);
        int int43 = bigMatrixImpl42.getColumnDimension();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl44 = bigMatrixImpl20.add(bigMatrixImpl42);
        java.math.BigDecimal bigDecimal45 = bigMatrixImpl42.getNorm();
        java.math.BigDecimal[][] bigDecimalArray46 = bigMatrixImpl42.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl49 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl52 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl53 = realMatrixImpl49.add(realMatrixImpl52);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl56 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl59 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl60 = realMatrixImpl56.add(realMatrixImpl59);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl61 = realMatrixImpl49.add(realMatrixImpl59);
        org.apache.commons.math.linear.RealMatrix realMatrix63 = realMatrixImpl49.getColumnMatrix((int) ' ');
        double[][] doubleArray64 = realMatrixImpl49.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl66 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray64, false);
        boolean boolean67 = bigMatrixImpl42.equals((java.lang.Object) false);
        double[][] doubleArray68 = bigMatrixImpl42.getDataAsDoubleArray();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertNotNull(bigMatrixImpl44);
        org.junit.Assert.assertNotNull(bigDecimal45);
        org.junit.Assert.assertNotNull(bigDecimalArray46);
        org.junit.Assert.assertNotNull(realMatrixImpl53);
        org.junit.Assert.assertNotNull(realMatrixImpl60);
        org.junit.Assert.assertNotNull(realMatrixImpl61);
        org.junit.Assert.assertNotNull(realMatrix63);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(doubleArray68);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        double[] doubleArray2 = new double[] { 1, (byte) 10 };
        double[] doubleArray5 = new double[] { 1, (byte) 10 };
        double[] doubleArray8 = new double[] { 1, (byte) 10 };
        double[] doubleArray11 = new double[] { 1, (byte) 10 };
        double[] doubleArray14 = new double[] { 1, (byte) 10 };
        double[] doubleArray17 = new double[] { 1, (byte) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        java.math.BigDecimal bigDecimal23 = bigMatrixImpl20.getEntry(0, (int) (short) 0);
        double[][] doubleArray24 = bigMatrixImpl20.getDataAsDoubleArray();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl25 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray24);
        double[][] doubleArray26 = bigMatrixImpl25.getDataAsDoubleArray();
        org.apache.commons.math.linear.BigMatrix bigMatrix27 = bigMatrixImpl25.copy();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertNotNull(bigMatrix27);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        double[] doubleArray2 = new double[] { 1, (byte) 10 };
        double[] doubleArray5 = new double[] { 1, (byte) 10 };
        double[] doubleArray8 = new double[] { 1, (byte) 10 };
        double[] doubleArray11 = new double[] { 1, (byte) 10 };
        double[] doubleArray14 = new double[] { 1, (byte) 10 };
        double[] doubleArray17 = new double[] { 1, (byte) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        double[] doubleArray23 = new double[] { 1, (byte) 10 };
        double[] doubleArray26 = new double[] { 1, (byte) 10 };
        double[] doubleArray29 = new double[] { 1, (byte) 10 };
        double[] doubleArray32 = new double[] { 1, (byte) 10 };
        double[] doubleArray35 = new double[] { 1, (byte) 10 };
        double[] doubleArray38 = new double[] { 1, (byte) 10 };
        double[][] doubleArray39 = new double[][] { doubleArray23, doubleArray26, doubleArray29, doubleArray32, doubleArray35, doubleArray38 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl40 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray39);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl41 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray39);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl42 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray39);
        int int43 = bigMatrixImpl42.getColumnDimension();
        double[] doubleArray46 = new double[] { 1, (byte) 10 };
        double[] doubleArray49 = new double[] { 1, (byte) 10 };
        double[] doubleArray52 = new double[] { 1, (byte) 10 };
        double[] doubleArray55 = new double[] { 1, (byte) 10 };
        double[] doubleArray58 = new double[] { 1, (byte) 10 };
        double[] doubleArray61 = new double[] { 1, (byte) 10 };
        double[][] doubleArray62 = new double[][] { doubleArray46, doubleArray49, doubleArray52, doubleArray55, doubleArray58, doubleArray61 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl63 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray62);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl64 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray62);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl65 = bigMatrixImpl42.subtract(bigMatrixImpl64);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl66 = bigMatrixImpl20.add(bigMatrixImpl65);
        double[] doubleArray69 = new double[] { 1, (byte) 10 };
        double[] doubleArray72 = new double[] { 1, (byte) 10 };
        double[] doubleArray75 = new double[] { 1, (byte) 10 };
        double[] doubleArray78 = new double[] { 1, (byte) 10 };
        double[] doubleArray81 = new double[] { 1, (byte) 10 };
        double[] doubleArray84 = new double[] { 1, (byte) 10 };
        double[][] doubleArray85 = new double[][] { doubleArray69, doubleArray72, doubleArray75, doubleArray78, doubleArray81, doubleArray84 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl86 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray85);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl87 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray85);
        java.math.BigDecimal bigDecimal90 = bigMatrixImpl87.getEntry(0, (int) (short) 0);
        boolean boolean91 = bigMatrixImpl87.isSingular();
        java.math.BigDecimal[][] bigDecimalArray92 = bigMatrixImpl87.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl93 = bigMatrixImpl66.subtract(bigMatrixImpl87);
        int int94 = bigMatrixImpl93.getScale();
        java.math.BigDecimal[] bigDecimalArray96 = bigMatrixImpl93.getRow(0);
        double[] doubleArray98 = bigMatrixImpl93.getRowAsDoubleArray((int) (byte) 1);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertNotNull(bigMatrixImpl65);
        org.junit.Assert.assertNotNull(bigMatrixImpl66);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray81), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray84), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertNotNull(bigDecimal90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertNotNull(bigDecimalArray92);
        org.junit.Assert.assertNotNull(bigMatrixImpl93);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 64 + "'", int94 == 64);
        org.junit.Assert.assertNotNull(bigDecimalArray96);
        org.junit.Assert.assertNotNull(doubleArray98);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray98), "[0.0, 0.0]");
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl5 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix6 = realMatrixImpl2.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl5);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl5.getColumnMatrix((int) (short) 1);
        boolean boolean9 = realMatrixImpl5.isSingular();
        int int10 = realMatrixImpl5.getRowDimension();
        boolean boolean11 = realMatrixImpl5.isSquare();
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        java.math.BigDecimal bigDecimal0 = null;
        java.math.BigDecimal[] bigDecimalArray1 = new java.math.BigDecimal[] { bigDecimal0 };
        java.math.BigDecimal bigDecimal2 = null;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = null;
        java.math.BigDecimal[] bigDecimalArray5 = new java.math.BigDecimal[] { bigDecimal4 };
        java.math.BigDecimal bigDecimal6 = null;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = null;
        java.math.BigDecimal[] bigDecimalArray9 = new java.math.BigDecimal[] { bigDecimal8 };
        java.math.BigDecimal[][] bigDecimalArray10 = new java.math.BigDecimal[][] { bigDecimalArray1, bigDecimalArray3, bigDecimalArray5, bigDecimalArray7, bigDecimalArray9 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl12 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray10, true);
        int int13 = bigMatrixImpl12.getScale();
        boolean boolean14 = bigMatrixImpl12.isSingular();
        int int15 = bigMatrixImpl12.getColumnDimension();
        boolean boolean16 = bigMatrixImpl12.isSingular();
        java.math.BigDecimal[] bigDecimalArray18 = bigMatrixImpl12.getRow(1);
        org.junit.Assert.assertNotNull(bigDecimalArray1);
        org.junit.Assert.assertNotNull(bigDecimalArray3);
        org.junit.Assert.assertNotNull(bigDecimalArray5);
        org.junit.Assert.assertNotNull(bigDecimalArray7);
        org.junit.Assert.assertNotNull(bigDecimalArray9);
        org.junit.Assert.assertNotNull(bigDecimalArray10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(bigDecimalArray18);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl5 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl6 = realMatrixImpl2.add(realMatrixImpl5);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl9 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = realMatrixImpl9.add(realMatrixImpl12);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = realMatrixImpl16.add(realMatrixImpl19);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl21 = realMatrixImpl9.add(realMatrixImpl19);
        org.apache.commons.math.linear.RealMatrix realMatrix23 = realMatrixImpl9.scalarAdd((double) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix24 = realMatrixImpl6.add(realMatrix23);
        int int25 = realMatrixImpl6.getRowDimension();
        double[][] doubleArray26 = realMatrixImpl6.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl29 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl32 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = realMatrixImpl29.add(realMatrixImpl32);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl36 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl39 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl40 = realMatrixImpl36.add(realMatrixImpl39);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl41 = realMatrixImpl29.add(realMatrixImpl39);
        org.apache.commons.math.linear.RealMatrix realMatrix43 = realMatrixImpl39.scalarMultiply(1.0d);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl46 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl49 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl50 = realMatrixImpl46.add(realMatrixImpl49);
        double[] doubleArray52 = realMatrixImpl49.getColumn((int) (byte) 0);
        boolean boolean54 = realMatrixImpl49.equals((java.lang.Object) 6);
        org.apache.commons.math.linear.RealMatrix realMatrix56 = realMatrixImpl49.getRowMatrix(5);
        double[] doubleArray58 = realMatrixImpl49.getColumn(0);
        double[] doubleArray59 = realMatrixImpl39.preMultiply(doubleArray58);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl60 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray58);
        double[] doubleArray61 = realMatrixImpl6.preMultiply(doubleArray58);
        double[][] doubleArray62 = realMatrixImpl6.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix63 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix64 = realMatrixImpl6.add(realMatrix63);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrixImpl6);
        org.junit.Assert.assertNotNull(realMatrixImpl13);
        org.junit.Assert.assertNotNull(realMatrixImpl20);
        org.junit.Assert.assertNotNull(realMatrixImpl21);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertNotNull(realMatrixImpl33);
        org.junit.Assert.assertNotNull(realMatrixImpl40);
        org.junit.Assert.assertNotNull(realMatrixImpl41);
        org.junit.Assert.assertNotNull(realMatrix43);
        org.junit.Assert.assertNotNull(realMatrixImpl50);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(realMatrix56);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray62);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        java.math.BigDecimal bigDecimal0 = null;
        java.math.BigDecimal[] bigDecimalArray1 = new java.math.BigDecimal[] { bigDecimal0 };
        java.math.BigDecimal bigDecimal2 = null;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = null;
        java.math.BigDecimal[] bigDecimalArray5 = new java.math.BigDecimal[] { bigDecimal4 };
        java.math.BigDecimal bigDecimal6 = null;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = null;
        java.math.BigDecimal[] bigDecimalArray9 = new java.math.BigDecimal[] { bigDecimal8 };
        java.math.BigDecimal[][] bigDecimalArray10 = new java.math.BigDecimal[][] { bigDecimalArray1, bigDecimalArray3, bigDecimalArray5, bigDecimalArray7, bigDecimalArray9 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl12 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray10, true);
        int int13 = bigMatrixImpl12.getScale();
        boolean boolean14 = bigMatrixImpl12.isSingular();
        int int15 = bigMatrixImpl12.getColumnDimension();
        java.math.BigDecimal[][] bigDecimalArray16 = bigMatrixImpl12.getData();
        int int17 = bigMatrixImpl12.getScale();
        double[] doubleArray20 = new double[] { 1, (byte) 10 };
        double[] doubleArray23 = new double[] { 1, (byte) 10 };
        double[] doubleArray26 = new double[] { 1, (byte) 10 };
        double[] doubleArray29 = new double[] { 1, (byte) 10 };
        double[] doubleArray32 = new double[] { 1, (byte) 10 };
        double[] doubleArray35 = new double[] { 1, (byte) 10 };
        double[][] doubleArray36 = new double[][] { doubleArray20, doubleArray23, doubleArray26, doubleArray29, doubleArray32, doubleArray35 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl37 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray36);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl38 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray36);
        double[] doubleArray41 = new double[] { 1, (byte) 10 };
        double[] doubleArray44 = new double[] { 1, (byte) 10 };
        double[] doubleArray47 = new double[] { 1, (byte) 10 };
        double[] doubleArray50 = new double[] { 1, (byte) 10 };
        double[] doubleArray53 = new double[] { 1, (byte) 10 };
        double[] doubleArray56 = new double[] { 1, (byte) 10 };
        double[][] doubleArray57 = new double[][] { doubleArray41, doubleArray44, doubleArray47, doubleArray50, doubleArray53, doubleArray56 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl58 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray57);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl59 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray57);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl60 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray57);
        int int61 = bigMatrixImpl60.getColumnDimension();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl62 = bigMatrixImpl38.add(bigMatrixImpl60);
        org.apache.commons.math.linear.BigMatrix bigMatrix64 = bigMatrixImpl38.getColumnMatrix(0);
        double[] doubleArray66 = bigMatrixImpl38.getRowAsDoubleArray((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix67 = bigMatrixImpl12.add((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: matrix dimension mismatch");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimalArray1);
        org.junit.Assert.assertNotNull(bigDecimalArray3);
        org.junit.Assert.assertNotNull(bigDecimalArray5);
        org.junit.Assert.assertNotNull(bigDecimalArray7);
        org.junit.Assert.assertNotNull(bigDecimalArray9);
        org.junit.Assert.assertNotNull(bigDecimalArray10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(bigDecimalArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 64 + "'", int17 == 64);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 2 + "'", int61 == 2);
        org.junit.Assert.assertNotNull(bigMatrixImpl62);
        org.junit.Assert.assertNotNull(bigMatrix64);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[1.0, 10.0]");
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl5 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl6 = realMatrixImpl2.add(realMatrixImpl5);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl9 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = realMatrixImpl9.add(realMatrixImpl12);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl14 = realMatrixImpl2.add(realMatrixImpl12);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = realMatrixImpl2.getColumnMatrix((int) ' ');
        double[][] doubleArray17 = realMatrixImpl2.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl23 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = realMatrixImpl20.add(realMatrixImpl23);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl27 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl30 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = realMatrixImpl27.add(realMatrixImpl30);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl32 = realMatrixImpl20.add(realMatrixImpl30);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl20.scalarAdd((double) (byte) 1);
        double[] doubleArray36 = realMatrixImpl20.getColumn((int) (short) 10);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl37 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray36);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl38 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray36);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl39 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray36);
        double[] doubleArray40 = realMatrixImpl2.preMultiply(doubleArray36);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl41 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray36);
        double[][] doubleArray42 = realMatrixImpl41.getData();
        double[][] doubleArray43 = realMatrixImpl41.getDataRef();
        org.junit.Assert.assertNotNull(realMatrixImpl6);
        org.junit.Assert.assertNotNull(realMatrixImpl13);
        org.junit.Assert.assertNotNull(realMatrixImpl14);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertNotNull(realMatrixImpl24);
        org.junit.Assert.assertNotNull(realMatrixImpl31);
        org.junit.Assert.assertNotNull(realMatrixImpl32);
        org.junit.Assert.assertNotNull(realMatrix34);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertNotNull(doubleArray43);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        double[] doubleArray2 = new double[] { 1, (byte) 10 };
        double[] doubleArray5 = new double[] { 1, (byte) 10 };
        double[] doubleArray8 = new double[] { 1, (byte) 10 };
        double[] doubleArray11 = new double[] { 1, (byte) 10 };
        double[] doubleArray14 = new double[] { 1, (byte) 10 };
        double[] doubleArray17 = new double[] { 1, (byte) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl21 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        java.math.BigDecimal[][] bigDecimalArray22 = bigMatrixImpl21.getData();
        org.apache.commons.math.linear.BigMatrix bigMatrix24 = bigMatrixImpl21.getColumnMatrix((int) (short) 1);
        org.apache.commons.math.linear.BigMatrix bigMatrix26 = bigMatrixImpl21.getRowMatrix(4);
        double[] doubleArray29 = new double[] { 1, (byte) 10 };
        double[] doubleArray32 = new double[] { 1, (byte) 10 };
        double[] doubleArray35 = new double[] { 1, (byte) 10 };
        double[] doubleArray38 = new double[] { 1, (byte) 10 };
        double[] doubleArray41 = new double[] { 1, (byte) 10 };
        double[] doubleArray44 = new double[] { 1, (byte) 10 };
        double[][] doubleArray45 = new double[][] { doubleArray29, doubleArray32, doubleArray35, doubleArray38, doubleArray41, doubleArray44 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl46 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray45);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl47 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray45);
        double[] doubleArray50 = new double[] { 1, (byte) 10 };
        double[] doubleArray53 = new double[] { 1, (byte) 10 };
        double[] doubleArray56 = new double[] { 1, (byte) 10 };
        double[] doubleArray59 = new double[] { 1, (byte) 10 };
        double[] doubleArray62 = new double[] { 1, (byte) 10 };
        double[] doubleArray65 = new double[] { 1, (byte) 10 };
        double[][] doubleArray66 = new double[][] { doubleArray50, doubleArray53, doubleArray56, doubleArray59, doubleArray62, doubleArray65 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl67 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray66);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl68 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray66);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl69 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray66);
        int int70 = bigMatrixImpl69.getColumnDimension();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl71 = bigMatrixImpl47.add(bigMatrixImpl69);
        java.math.BigDecimal bigDecimal72 = bigMatrixImpl69.getNorm();
        org.apache.commons.math.linear.BigMatrix bigMatrix73 = bigMatrixImpl21.scalarAdd(bigDecimal72);
        int int74 = bigMatrixImpl21.getScale();
        java.math.BigDecimal[][] bigDecimalArray75 = bigMatrixImpl21.getDataRef();
        double[][] doubleArray76 = bigMatrixImpl21.getDataAsDoubleArray();
        java.lang.String str77 = bigMatrixImpl21.toString();
        double[] doubleArray79 = bigMatrixImpl21.getColumnAsDoubleArray((int) (byte) 0);
        double[][] doubleArray80 = bigMatrixImpl21.getDataAsDoubleArray();
        org.apache.commons.math.linear.BigMatrix bigMatrix82 = bigMatrixImpl21.getRowMatrix(4);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(bigDecimalArray22);
        org.junit.Assert.assertNotNull(bigMatrix24);
        org.junit.Assert.assertNotNull(bigMatrix26);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 2 + "'", int70 == 2);
        org.junit.Assert.assertNotNull(bigMatrixImpl71);
        org.junit.Assert.assertNotNull(bigDecimal72);
        org.junit.Assert.assertNotNull(bigMatrix73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 64 + "'", int74 == 64);
        org.junit.Assert.assertNotNull(bigDecimalArray75);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "BigMatrixImpl{{1,10},{1,10},{1,10},{1,10},{1,10},{1,10}}" + "'", str77, "BigMatrixImpl{{1,10},{1,10},{1,10},{1,10},{1,10},{1,10}}");
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray79), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertNotNull(bigMatrix82);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        double[] doubleArray2 = new double[] { 1, (byte) 10 };
        double[] doubleArray5 = new double[] { 1, (byte) 10 };
        double[] doubleArray8 = new double[] { 1, (byte) 10 };
        double[] doubleArray11 = new double[] { 1, (byte) 10 };
        double[] doubleArray14 = new double[] { 1, (byte) 10 };
        double[] doubleArray17 = new double[] { 1, (byte) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        double[] doubleArray23 = new double[] { 1, (byte) 10 };
        double[] doubleArray26 = new double[] { 1, (byte) 10 };
        double[] doubleArray29 = new double[] { 1, (byte) 10 };
        double[] doubleArray32 = new double[] { 1, (byte) 10 };
        double[] doubleArray35 = new double[] { 1, (byte) 10 };
        double[] doubleArray38 = new double[] { 1, (byte) 10 };
        double[][] doubleArray39 = new double[][] { doubleArray23, doubleArray26, doubleArray29, doubleArray32, doubleArray35, doubleArray38 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl40 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray39);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl41 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray39);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl42 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray39);
        int int43 = bigMatrixImpl42.getColumnDimension();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl44 = bigMatrixImpl20.add(bigMatrixImpl42);
        boolean boolean46 = bigMatrixImpl20.equals((java.lang.Object) (-1));
        double[] doubleArray49 = new double[] { 1, (byte) 10 };
        double[] doubleArray52 = new double[] { 1, (byte) 10 };
        double[] doubleArray55 = new double[] { 1, (byte) 10 };
        double[] doubleArray58 = new double[] { 1, (byte) 10 };
        double[] doubleArray61 = new double[] { 1, (byte) 10 };
        double[] doubleArray64 = new double[] { 1, (byte) 10 };
        double[][] doubleArray65 = new double[][] { doubleArray49, doubleArray52, doubleArray55, doubleArray58, doubleArray61, doubleArray64 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl66 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray65);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl67 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray65);
        double[] doubleArray70 = new double[] { 1, (byte) 10 };
        double[] doubleArray73 = new double[] { 1, (byte) 10 };
        double[] doubleArray76 = new double[] { 1, (byte) 10 };
        double[] doubleArray79 = new double[] { 1, (byte) 10 };
        double[] doubleArray82 = new double[] { 1, (byte) 10 };
        double[] doubleArray85 = new double[] { 1, (byte) 10 };
        double[][] doubleArray86 = new double[][] { doubleArray70, doubleArray73, doubleArray76, doubleArray79, doubleArray82, doubleArray85 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl87 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray86);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl88 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray86);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl89 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray86);
        int int90 = bigMatrixImpl89.getColumnDimension();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl91 = bigMatrixImpl67.add(bigMatrixImpl89);
        java.math.BigDecimal bigDecimal92 = bigMatrixImpl89.getNorm();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl93 = bigMatrixImpl20.subtract(bigMatrixImpl89);
        java.math.BigDecimal[] bigDecimalArray95 = bigMatrixImpl89.getColumn((int) (short) 0);
        org.apache.commons.math.linear.BigMatrix bigMatrix96 = bigMatrixImpl89.transpose();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertNotNull(bigMatrixImpl44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray79), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray85), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 2 + "'", int90 == 2);
        org.junit.Assert.assertNotNull(bigMatrixImpl91);
        org.junit.Assert.assertNotNull(bigDecimal92);
        org.junit.Assert.assertNotNull(bigMatrixImpl93);
        org.junit.Assert.assertNotNull(bigDecimalArray95);
        org.junit.Assert.assertNotNull(bigMatrix96);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (short) 100, (int) (byte) 10);
        double double3 = realMatrixImpl2.getNorm();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl6 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl9 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl10 = realMatrixImpl6.add(realMatrixImpl9);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl17 = realMatrixImpl13.add(realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = realMatrixImpl6.add(realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = realMatrixImpl16.scalarMultiply(1.0d);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl23 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl27 = realMatrixImpl23.add(realMatrixImpl26);
        double[] doubleArray29 = realMatrixImpl26.getColumn((int) (byte) 0);
        boolean boolean31 = realMatrixImpl26.equals((java.lang.Object) 6);
        org.apache.commons.math.linear.RealMatrix realMatrix33 = realMatrixImpl26.getRowMatrix(5);
        double[] doubleArray35 = realMatrixImpl26.getColumn(0);
        double[] doubleArray36 = realMatrixImpl16.preMultiply(doubleArray35);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl37 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray35);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl38 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray35);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl39 = realMatrixImpl2.add(realMatrixImpl38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: matrix dimension mismatch");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(realMatrixImpl10);
        org.junit.Assert.assertNotNull(realMatrixImpl17);
        org.junit.Assert.assertNotNull(realMatrixImpl18);
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(realMatrixImpl27);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(realMatrix33);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl5 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix6 = realMatrixImpl2.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl5);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl5.getColumnMatrix((int) (short) 1);
        boolean boolean9 = realMatrixImpl5.isSingular();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl15 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = realMatrixImpl12.add(realMatrixImpl15);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl23 = realMatrixImpl19.add(realMatrixImpl22);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = realMatrixImpl12.add(realMatrixImpl22);
        org.apache.commons.math.linear.RealMatrix realMatrix25 = realMatrixImpl5.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl22);
        double[][] doubleArray26 = realMatrixImpl22.getData();
        boolean boolean27 = realMatrixImpl22.isSquare();
        boolean boolean28 = realMatrixImpl22.isSquare();
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(realMatrixImpl16);
        org.junit.Assert.assertNotNull(realMatrixImpl23);
        org.junit.Assert.assertNotNull(realMatrixImpl24);
        org.junit.Assert.assertNotNull(realMatrix25);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl5 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix6 = realMatrixImpl2.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl5);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl9 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = realMatrixImpl9.add(realMatrixImpl12);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        boolean boolean18 = realMatrixImpl5.equals((java.lang.Object) realMatrixImpl16);
        boolean boolean20 = realMatrixImpl5.equals((java.lang.Object) 0.0d);
        boolean boolean21 = realMatrixImpl5.isSquare();
        double[] doubleArray23 = realMatrixImpl5.getColumn(4);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrixImpl13);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl5 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix6 = realMatrixImpl2.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl5);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl9 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = realMatrixImpl9.add(realMatrixImpl12);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        boolean boolean18 = realMatrixImpl5.equals((java.lang.Object) realMatrixImpl16);
        double[] doubleArray21 = new double[] { 1, (byte) 10 };
        double[] doubleArray24 = new double[] { 1, (byte) 10 };
        double[] doubleArray27 = new double[] { 1, (byte) 10 };
        double[] doubleArray30 = new double[] { 1, (byte) 10 };
        double[] doubleArray33 = new double[] { 1, (byte) 10 };
        double[] doubleArray36 = new double[] { 1, (byte) 10 };
        double[][] doubleArray37 = new double[][] { doubleArray21, doubleArray24, doubleArray27, doubleArray30, doubleArray33, doubleArray36 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl38 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray37);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl39 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray37);
        boolean boolean40 = bigMatrixImpl39.isSquare();
        java.math.BigDecimal[][] bigDecimalArray41 = bigMatrixImpl39.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl44 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl47 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl48 = realMatrixImpl44.add(realMatrixImpl47);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl51 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl54 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl55 = realMatrixImpl51.add(realMatrixImpl54);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl56 = realMatrixImpl44.add(realMatrixImpl54);
        org.apache.commons.math.linear.RealMatrix realMatrix58 = realMatrixImpl54.scalarMultiply(1.0d);
        int int59 = realMatrixImpl54.getColumnDimension();
        boolean boolean60 = bigMatrixImpl39.equals((java.lang.Object) realMatrixImpl54);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl61 = realMatrixImpl16.subtract(realMatrixImpl54);
        // The following exception was thrown during execution in test generation
        try {
            double double64 = realMatrixImpl61.getEntry(0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: matrix entry does not exist");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrixImpl13);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(bigDecimalArray41);
        org.junit.Assert.assertNotNull(realMatrixImpl48);
        org.junit.Assert.assertNotNull(realMatrixImpl55);
        org.junit.Assert.assertNotNull(realMatrixImpl56);
        org.junit.Assert.assertNotNull(realMatrix58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 35 + "'", int59 == 35);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(realMatrixImpl61);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (short) 1, (int) 'a');
        double[][] doubleArray3 = realMatrixImpl2.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl5 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray3, false);
        double double6 = realMatrixImpl5.getNorm();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl9 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = realMatrixImpl9.add(realMatrixImpl12);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = realMatrixImpl16.add(realMatrixImpl19);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl21 = realMatrixImpl9.add(realMatrixImpl19);
        org.apache.commons.math.linear.RealMatrix realMatrix23 = realMatrixImpl9.getColumnMatrix((int) ' ');
        double[][] doubleArray24 = realMatrixImpl9.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray24, false);
        double[] doubleArray29 = new double[] { 1, (byte) 10 };
        double[] doubleArray32 = new double[] { 1, (byte) 10 };
        double[] doubleArray35 = new double[] { 1, (byte) 10 };
        double[] doubleArray38 = new double[] { 1, (byte) 10 };
        double[] doubleArray41 = new double[] { 1, (byte) 10 };
        double[] doubleArray44 = new double[] { 1, (byte) 10 };
        double[][] doubleArray45 = new double[][] { doubleArray29, doubleArray32, doubleArray35, doubleArray38, doubleArray41, doubleArray44 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl46 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray45);
        int int47 = bigMatrixImpl46.getRoundingMode();
        boolean boolean48 = bigMatrixImpl46.isSquare();
        boolean boolean49 = realMatrixImpl26.equals((java.lang.Object) bigMatrixImpl46);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix50 = realMatrixImpl5.preMultiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Matrices are not multiplication compatible.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(realMatrixImpl13);
        org.junit.Assert.assertNotNull(realMatrixImpl20);
        org.junit.Assert.assertNotNull(realMatrixImpl21);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 4 + "'", int47 == 4);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        double[] doubleArray2 = new double[] { 1, (byte) 10 };
        double[] doubleArray5 = new double[] { 1, (byte) 10 };
        double[] doubleArray8 = new double[] { 1, (byte) 10 };
        double[] doubleArray11 = new double[] { 1, (byte) 10 };
        double[] doubleArray14 = new double[] { 1, (byte) 10 };
        double[] doubleArray17 = new double[] { 1, (byte) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl21 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrix bigMatrix22 = bigMatrixImpl21.transpose();
        java.math.BigDecimal[][] bigDecimalArray23 = bigMatrixImpl21.getData();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(bigMatrix22);
        org.junit.Assert.assertNotNull(bigDecimalArray23);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) (byte) 10, (int) (short) 1);
        java.math.BigDecimal[][] bigDecimalArray3 = bigMatrixImpl2.getData();
        bigMatrixImpl2.setScale(97);
        org.junit.Assert.assertNotNull(bigDecimalArray3);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl5 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl6 = realMatrixImpl2.add(realMatrixImpl5);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl9 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix10 = realMatrixImpl5.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl9);
        boolean boolean11 = realMatrixImpl5.isSquare();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl14 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl17 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl14.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl17);
        int int19 = realMatrixImpl17.getRowDimension();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = realMatrixImpl5.subtract(realMatrixImpl17);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl23 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl27 = realMatrixImpl23.add(realMatrixImpl26);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl30 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = realMatrixImpl30.add(realMatrixImpl33);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl35 = realMatrixImpl23.add(realMatrixImpl33);
        org.apache.commons.math.linear.RealMatrix realMatrix36 = realMatrixImpl23.copy();
        org.apache.commons.math.linear.RealMatrix realMatrix37 = realMatrixImpl17.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl23);
        double double38 = realMatrixImpl17.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix40 = realMatrixImpl17.scalarAdd((double) (short) -1);
        org.apache.commons.math.linear.RealMatrix realMatrix41 = realMatrixImpl17.transpose();
        org.junit.Assert.assertNotNull(realMatrixImpl6);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(realMatrixImpl20);
        org.junit.Assert.assertNotNull(realMatrixImpl27);
        org.junit.Assert.assertNotNull(realMatrixImpl34);
        org.junit.Assert.assertNotNull(realMatrixImpl35);
        org.junit.Assert.assertNotNull(realMatrix36);
        org.junit.Assert.assertNotNull(realMatrix37);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertNotNull(realMatrix40);
        org.junit.Assert.assertNotNull(realMatrix41);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (short) 1, (int) 'a');
        boolean boolean3 = realMatrixImpl2.isSquare();
        boolean boolean4 = realMatrixImpl2.isSingular();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl10 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl11 = realMatrixImpl7.add(realMatrixImpl10);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl14 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix15 = realMatrixImpl10.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl14);
        boolean boolean16 = realMatrixImpl10.isSquare();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix23 = realMatrixImpl19.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl22);
        int int24 = realMatrixImpl22.getRowDimension();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl25 = realMatrixImpl10.subtract(realMatrixImpl22);
        double[][] doubleArray26 = realMatrixImpl22.getDataRef();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl27 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray26);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl28 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray26);
        org.apache.commons.math.linear.RealMatrix realMatrix30 = realMatrixImpl28.scalarMultiply((double) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix31 = realMatrixImpl2.preMultiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Matrices are not multiplication compatible.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(realMatrixImpl11);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNotNull(realMatrixImpl25);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertNotNull(realMatrix30);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        double[] doubleArray2 = new double[] { 1, (byte) 10 };
        double[] doubleArray5 = new double[] { 1, (byte) 10 };
        double[] doubleArray8 = new double[] { 1, (byte) 10 };
        double[] doubleArray11 = new double[] { 1, (byte) 10 };
        double[] doubleArray14 = new double[] { 1, (byte) 10 };
        double[] doubleArray17 = new double[] { 1, (byte) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        java.math.BigDecimal bigDecimal23 = bigMatrixImpl20.getEntry(0, (int) (short) 0);
        java.math.BigDecimal[][] bigDecimalArray24 = bigMatrixImpl20.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl26 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray24, false);
        double[][] doubleArray27 = bigMatrixImpl26.getDataAsDoubleArray();
        org.apache.commons.math.linear.BigMatrix bigMatrix28 = bigMatrixImpl26.transpose();
        bigMatrixImpl26.setScale(0);
        java.math.BigDecimal[][] bigDecimalArray31 = bigMatrixImpl26.getData();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertNotNull(bigDecimalArray24);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertNotNull(bigMatrix28);
        org.junit.Assert.assertNotNull(bigDecimalArray31);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        double[] doubleArray2 = new double[] { 1, (byte) 10 };
        double[] doubleArray5 = new double[] { 1, (byte) 10 };
        double[] doubleArray8 = new double[] { 1, (byte) 10 };
        double[] doubleArray11 = new double[] { 1, (byte) 10 };
        double[] doubleArray14 = new double[] { 1, (byte) 10 };
        double[] doubleArray17 = new double[] { 1, (byte) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl21 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        int int22 = bigMatrixImpl21.getRoundingMode();
        int int23 = bigMatrixImpl21.getScale();
        double[] doubleArray26 = new double[] { 1, (byte) 10 };
        double[] doubleArray29 = new double[] { 1, (byte) 10 };
        double[] doubleArray32 = new double[] { 1, (byte) 10 };
        double[] doubleArray35 = new double[] { 1, (byte) 10 };
        double[] doubleArray38 = new double[] { 1, (byte) 10 };
        double[] doubleArray41 = new double[] { 1, (byte) 10 };
        double[][] doubleArray42 = new double[][] { doubleArray26, doubleArray29, doubleArray32, doubleArray35, doubleArray38, doubleArray41 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl43 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray42);
        java.math.BigDecimal bigDecimal44 = bigMatrixImpl43.getNorm();
        java.math.BigDecimal[] bigDecimalArray45 = new java.math.BigDecimal[] { bigDecimal44 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl46 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray45);
        org.apache.commons.math.linear.BigMatrix bigMatrix47 = bigMatrixImpl46.copy();
        java.math.BigDecimal bigDecimal48 = bigMatrixImpl46.getNorm();
        boolean boolean49 = bigMatrixImpl46.isSquare();
        java.math.BigDecimal bigDecimal50 = bigMatrixImpl46.getDeterminant();
        org.apache.commons.math.linear.BigMatrix bigMatrix51 = bigMatrixImpl21.scalarAdd(bigDecimal50);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix53 = bigMatrixImpl21.getColumnMatrix((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: illegal column argument");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 64 + "'", int23 == 64);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertNotNull(bigDecimal44);
        org.junit.Assert.assertNotNull(bigDecimalArray45);
        org.junit.Assert.assertNotNull(bigMatrix47);
        org.junit.Assert.assertNotNull(bigDecimal48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(bigDecimal50);
        org.junit.Assert.assertNotNull(bigMatrix51);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        double[] doubleArray2 = new double[] { 1, (byte) 10 };
        double[] doubleArray5 = new double[] { 1, (byte) 10 };
        double[] doubleArray8 = new double[] { 1, (byte) 10 };
        double[] doubleArray11 = new double[] { 1, (byte) 10 };
        double[] doubleArray14 = new double[] { 1, (byte) 10 };
        double[] doubleArray17 = new double[] { 1, (byte) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl21 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        java.math.BigDecimal[][] bigDecimalArray22 = bigMatrixImpl21.getData();
        org.apache.commons.math.linear.BigMatrix bigMatrix24 = bigMatrixImpl21.getColumnMatrix((int) (short) 1);
        double[] doubleArray27 = new double[] { 1, (byte) 10 };
        double[] doubleArray30 = new double[] { 1, (byte) 10 };
        double[] doubleArray33 = new double[] { 1, (byte) 10 };
        double[] doubleArray36 = new double[] { 1, (byte) 10 };
        double[] doubleArray39 = new double[] { 1, (byte) 10 };
        double[] doubleArray42 = new double[] { 1, (byte) 10 };
        double[][] doubleArray43 = new double[][] { doubleArray27, doubleArray30, doubleArray33, doubleArray36, doubleArray39, doubleArray42 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl44 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray43);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl45 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray43);
        java.math.BigDecimal bigDecimal48 = bigMatrixImpl45.getEntry(0, (int) (short) 0);
        boolean boolean49 = bigMatrixImpl45.isSingular();
        boolean boolean50 = bigMatrixImpl45.isSingular();
        org.apache.commons.math.linear.BigMatrix bigMatrix51 = bigMatrixImpl21.add((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl45);
        double[] doubleArray54 = new double[] { 1, (byte) 10 };
        double[] doubleArray57 = new double[] { 1, (byte) 10 };
        double[] doubleArray60 = new double[] { 1, (byte) 10 };
        double[] doubleArray63 = new double[] { 1, (byte) 10 };
        double[] doubleArray66 = new double[] { 1, (byte) 10 };
        double[] doubleArray69 = new double[] { 1, (byte) 10 };
        double[][] doubleArray70 = new double[][] { doubleArray54, doubleArray57, doubleArray60, doubleArray63, doubleArray66, doubleArray69 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl71 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray70);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl72 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray70);
        java.math.BigDecimal bigDecimal75 = bigMatrixImpl72.getEntry(0, (int) (short) 0);
        org.apache.commons.math.linear.BigMatrix bigMatrix76 = bigMatrixImpl72.copy();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl77 = bigMatrixImpl21.add(bigMatrixImpl72);
        int int78 = bigMatrixImpl72.getScale();
        java.lang.String str79 = bigMatrixImpl72.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal82 = bigMatrixImpl72.getEntry((int) (short) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: matrix entry does not exist");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(bigDecimalArray22);
        org.junit.Assert.assertNotNull(bigMatrix24);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertNotNull(bigDecimal48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(bigMatrix51);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertNotNull(bigDecimal75);
        org.junit.Assert.assertNotNull(bigMatrix76);
        org.junit.Assert.assertNotNull(bigMatrixImpl77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 64 + "'", int78 == 64);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "BigMatrixImpl{{1,10},{1,10},{1,10},{1,10},{1,10},{1,10}}" + "'", str79, "BigMatrixImpl{{1,10},{1,10},{1,10},{1,10},{1,10},{1,10}}");
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        double[] doubleArray2 = new double[] { 1, (byte) 10 };
        double[] doubleArray5 = new double[] { 1, (byte) 10 };
        double[] doubleArray8 = new double[] { 1, (byte) 10 };
        double[] doubleArray11 = new double[] { 1, (byte) 10 };
        double[] doubleArray14 = new double[] { 1, (byte) 10 };
        double[] doubleArray17 = new double[] { 1, (byte) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        double[] doubleArray23 = new double[] { 1, (byte) 10 };
        double[] doubleArray26 = new double[] { 1, (byte) 10 };
        double[] doubleArray29 = new double[] { 1, (byte) 10 };
        double[] doubleArray32 = new double[] { 1, (byte) 10 };
        double[] doubleArray35 = new double[] { 1, (byte) 10 };
        double[] doubleArray38 = new double[] { 1, (byte) 10 };
        double[][] doubleArray39 = new double[][] { doubleArray23, doubleArray26, doubleArray29, doubleArray32, doubleArray35, doubleArray38 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl40 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray39);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl41 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray39);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl42 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray39);
        int int43 = bigMatrixImpl42.getColumnDimension();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl44 = bigMatrixImpl20.add(bigMatrixImpl42);
        java.math.BigDecimal bigDecimal45 = bigMatrixImpl42.getNorm();
        java.math.BigDecimal[][] bigDecimalArray46 = bigMatrixImpl42.getData();
        java.math.BigDecimal bigDecimal47 = bigMatrixImpl42.getNorm();
        org.apache.commons.math.linear.BigMatrix bigMatrix48 = bigMatrixImpl42.transpose();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertNotNull(bigMatrixImpl44);
        org.junit.Assert.assertNotNull(bigDecimal45);
        org.junit.Assert.assertNotNull(bigDecimalArray46);
        org.junit.Assert.assertNotNull(bigDecimal47);
        org.junit.Assert.assertNotNull(bigMatrix48);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl5 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl6 = realMatrixImpl2.add(realMatrixImpl5);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl9 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix10 = realMatrixImpl5.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl9);
        boolean boolean11 = realMatrixImpl5.isSquare();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl14 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl17 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl14.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl17);
        int int19 = realMatrixImpl17.getRowDimension();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = realMatrixImpl5.subtract(realMatrixImpl17);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl23 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl27 = realMatrixImpl23.add(realMatrixImpl26);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl30 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = realMatrixImpl30.add(realMatrixImpl33);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl35 = realMatrixImpl23.add(realMatrixImpl33);
        org.apache.commons.math.linear.RealMatrix realMatrix36 = realMatrixImpl23.copy();
        org.apache.commons.math.linear.RealMatrix realMatrix37 = realMatrixImpl17.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl23);
        double[] doubleArray39 = realMatrixImpl17.getColumn((int) (byte) 10);
        org.apache.commons.math.linear.RealMatrix realMatrix41 = realMatrixImpl17.getRowMatrix(6);
        org.junit.Assert.assertNotNull(realMatrixImpl6);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(realMatrixImpl20);
        org.junit.Assert.assertNotNull(realMatrixImpl27);
        org.junit.Assert.assertNotNull(realMatrixImpl34);
        org.junit.Assert.assertNotNull(realMatrixImpl35);
        org.junit.Assert.assertNotNull(realMatrix36);
        org.junit.Assert.assertNotNull(realMatrix37);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(realMatrix41);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl5 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl6 = realMatrixImpl2.add(realMatrixImpl5);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl9 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = realMatrixImpl9.add(realMatrixImpl12);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl14 = realMatrixImpl2.add(realMatrixImpl12);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = realMatrixImpl2.getColumnMatrix((int) ' ');
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl2.copy();
        double[][] doubleArray18 = realMatrixImpl2.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl21 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray18, false);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl22 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        double[] doubleArray25 = new double[] { 1, (byte) 10 };
        double[] doubleArray28 = new double[] { 1, (byte) 10 };
        double[] doubleArray31 = new double[] { 1, (byte) 10 };
        double[] doubleArray34 = new double[] { 1, (byte) 10 };
        double[] doubleArray37 = new double[] { 1, (byte) 10 };
        double[] doubleArray40 = new double[] { 1, (byte) 10 };
        double[][] doubleArray41 = new double[][] { doubleArray25, doubleArray28, doubleArray31, doubleArray34, doubleArray37, doubleArray40 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl42 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray41);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl43 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray41);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl44 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray41);
        int int45 = bigMatrixImpl44.getColumnDimension();
        double[] doubleArray48 = new double[] { 1, (byte) 10 };
        double[] doubleArray51 = new double[] { 1, (byte) 10 };
        double[] doubleArray54 = new double[] { 1, (byte) 10 };
        double[] doubleArray57 = new double[] { 1, (byte) 10 };
        double[] doubleArray60 = new double[] { 1, (byte) 10 };
        double[] doubleArray63 = new double[] { 1, (byte) 10 };
        double[][] doubleArray64 = new double[][] { doubleArray48, doubleArray51, doubleArray54, doubleArray57, doubleArray60, doubleArray63 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl65 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray64);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl66 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray64);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl67 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray64);
        java.math.BigDecimal[][] bigDecimalArray68 = bigMatrixImpl67.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl70 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray68, false);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl72 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray68, true);
        org.apache.commons.math.linear.BigMatrix bigMatrix73 = bigMatrixImpl44.add((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl72);
        int int74 = bigMatrixImpl72.getRoundingMode();
        double[][] doubleArray75 = bigMatrixImpl72.getDataAsDoubleArray();
        java.math.BigDecimal[][] bigDecimalArray76 = bigMatrixImpl72.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl78 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray76, false);
        // The following exception was thrown during execution in test generation
        try {
            bigMatrixImpl22.setSubMatrix(bigDecimalArray76, (int) (byte) 10, 52);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: invalid row or column index selection");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrixImpl6);
        org.junit.Assert.assertNotNull(realMatrixImpl13);
        org.junit.Assert.assertNotNull(realMatrixImpl14);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2 + "'", int45 == 2);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertNotNull(bigDecimalArray68);
        org.junit.Assert.assertNotNull(bigMatrix73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 4 + "'", int74 == 4);
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertNotNull(bigDecimalArray76);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl5 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl6 = realMatrixImpl2.add(realMatrixImpl5);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl9 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = realMatrixImpl9.add(realMatrixImpl12);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        boolean boolean18 = realMatrixImpl12.isSquare();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl21 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix25 = realMatrixImpl21.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl24);
        int int26 = realMatrixImpl24.getRowDimension();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl27 = realMatrixImpl12.subtract(realMatrixImpl24);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl28 = realMatrixImpl5.subtract(realMatrixImpl27);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl35 = realMatrixImpl31.add(realMatrixImpl34);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl38 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix39 = realMatrixImpl34.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl38);
        org.apache.commons.math.linear.RealMatrix realMatrix40 = realMatrixImpl28.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl34);
        double[][] doubleArray41 = realMatrixImpl34.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl43 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray41, true);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl45 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray41, false);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl46 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray41);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl47 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray41);
        double[] doubleArray50 = new double[] { 1, (byte) 10 };
        double[] doubleArray53 = new double[] { 1, (byte) 10 };
        double[] doubleArray56 = new double[] { 1, (byte) 10 };
        double[] doubleArray59 = new double[] { 1, (byte) 10 };
        double[] doubleArray62 = new double[] { 1, (byte) 10 };
        double[] doubleArray65 = new double[] { 1, (byte) 10 };
        double[][] doubleArray66 = new double[][] { doubleArray50, doubleArray53, doubleArray56, doubleArray59, doubleArray62, doubleArray65 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl67 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray66);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl68 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray66);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl69 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray66);
        java.math.BigDecimal[][] bigDecimalArray70 = bigMatrixImpl69.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl72 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray70, false);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl74 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray70, true);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl75 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray70);
        java.math.BigDecimal bigDecimal76 = bigMatrixImpl75.getNorm();
        java.math.BigDecimal[][] bigDecimalArray77 = bigMatrixImpl75.getData();
        // The following exception was thrown during execution in test generation
        try {
            bigMatrixImpl47.setSubMatrix(bigDecimalArray77, 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: invalid row or column index selection");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrixImpl6);
        org.junit.Assert.assertNotNull(realMatrixImpl13);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(realMatrix25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertNotNull(realMatrixImpl27);
        org.junit.Assert.assertNotNull(realMatrixImpl28);
        org.junit.Assert.assertNotNull(realMatrixImpl35);
        org.junit.Assert.assertNotNull(realMatrix39);
        org.junit.Assert.assertNotNull(realMatrix40);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertNotNull(bigDecimalArray70);
        org.junit.Assert.assertNotNull(bigDecimal76);
        org.junit.Assert.assertNotNull(bigDecimalArray77);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl5 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix6 = realMatrixImpl2.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl5);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl5.getColumnMatrix((int) (short) 1);
        boolean boolean9 = realMatrixImpl5.isSingular();
        int int10 = realMatrixImpl5.getRowDimension();
        int int11 = realMatrixImpl5.getColumnDimension();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl14 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl17 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = realMatrixImpl14.add(realMatrixImpl17);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl21 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl25 = realMatrixImpl21.add(realMatrixImpl24);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = realMatrixImpl14.add(realMatrixImpl24);
        org.apache.commons.math.linear.RealMatrix realMatrix28 = realMatrixImpl14.scalarAdd((double) (byte) 1);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl35 = realMatrixImpl31.add(realMatrixImpl34);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl38 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix39 = realMatrixImpl34.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl38);
        boolean boolean40 = realMatrixImpl34.isSquare();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl43 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl46 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix47 = realMatrixImpl43.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl46);
        int int48 = realMatrixImpl46.getRowDimension();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl49 = realMatrixImpl34.subtract(realMatrixImpl46);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl50 = realMatrixImpl14.add(realMatrixImpl46);
        double[][] doubleArray51 = realMatrixImpl50.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl54 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl57 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl58 = realMatrixImpl54.add(realMatrixImpl57);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl61 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl64 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl65 = realMatrixImpl61.add(realMatrixImpl64);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl66 = realMatrixImpl54.add(realMatrixImpl64);
        org.apache.commons.math.linear.RealMatrix realMatrix68 = realMatrixImpl54.getColumnMatrix((int) ' ');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl71 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl74 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl75 = realMatrixImpl71.add(realMatrixImpl74);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl78 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix79 = realMatrixImpl74.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl78);
        org.apache.commons.math.linear.RealMatrix realMatrix80 = realMatrixImpl54.add(realMatrix79);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl81 = realMatrixImpl50.subtract(realMatrixImpl54);
        org.apache.commons.math.linear.RealMatrix realMatrix83 = realMatrixImpl54.scalarAdd((double) 1L);
        org.apache.commons.math.linear.RealMatrix realMatrix84 = realMatrixImpl5.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl54);
        org.apache.commons.math.linear.RealMatrix realMatrix85 = realMatrixImpl54.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix87 = realMatrixImpl54.scalarMultiply((double) 'a');
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertNotNull(realMatrixImpl18);
        org.junit.Assert.assertNotNull(realMatrixImpl25);
        org.junit.Assert.assertNotNull(realMatrixImpl26);
        org.junit.Assert.assertNotNull(realMatrix28);
        org.junit.Assert.assertNotNull(realMatrixImpl35);
        org.junit.Assert.assertNotNull(realMatrix39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(realMatrix47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 10 + "'", int48 == 10);
        org.junit.Assert.assertNotNull(realMatrixImpl49);
        org.junit.Assert.assertNotNull(realMatrixImpl50);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertNotNull(realMatrixImpl58);
        org.junit.Assert.assertNotNull(realMatrixImpl65);
        org.junit.Assert.assertNotNull(realMatrixImpl66);
        org.junit.Assert.assertNotNull(realMatrix68);
        org.junit.Assert.assertNotNull(realMatrixImpl75);
        org.junit.Assert.assertNotNull(realMatrix79);
        org.junit.Assert.assertNotNull(realMatrix80);
        org.junit.Assert.assertNotNull(realMatrixImpl81);
        org.junit.Assert.assertNotNull(realMatrix83);
        org.junit.Assert.assertNotNull(realMatrix84);
        org.junit.Assert.assertNotNull(realMatrix85);
        org.junit.Assert.assertNotNull(realMatrix87);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        double[] doubleArray2 = new double[] { 1, (byte) 10 };
        double[] doubleArray5 = new double[] { 1, (byte) 10 };
        double[] doubleArray8 = new double[] { 1, (byte) 10 };
        double[] doubleArray11 = new double[] { 1, (byte) 10 };
        double[] doubleArray14 = new double[] { 1, (byte) 10 };
        double[] doubleArray17 = new double[] { 1, (byte) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl21 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        java.math.BigDecimal[][] bigDecimalArray22 = bigMatrixImpl21.getData();
        org.apache.commons.math.linear.BigMatrix bigMatrix24 = bigMatrixImpl21.getColumnMatrix((int) (short) 1);
        org.apache.commons.math.linear.BigMatrix bigMatrix26 = bigMatrixImpl21.getRowMatrix(4);
        double[] doubleArray29 = new double[] { 1, (byte) 10 };
        double[] doubleArray32 = new double[] { 1, (byte) 10 };
        double[] doubleArray35 = new double[] { 1, (byte) 10 };
        double[] doubleArray38 = new double[] { 1, (byte) 10 };
        double[] doubleArray41 = new double[] { 1, (byte) 10 };
        double[] doubleArray44 = new double[] { 1, (byte) 10 };
        double[][] doubleArray45 = new double[][] { doubleArray29, doubleArray32, doubleArray35, doubleArray38, doubleArray41, doubleArray44 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl46 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray45);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl47 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray45);
        double[] doubleArray50 = new double[] { 1, (byte) 10 };
        double[] doubleArray53 = new double[] { 1, (byte) 10 };
        double[] doubleArray56 = new double[] { 1, (byte) 10 };
        double[] doubleArray59 = new double[] { 1, (byte) 10 };
        double[] doubleArray62 = new double[] { 1, (byte) 10 };
        double[] doubleArray65 = new double[] { 1, (byte) 10 };
        double[][] doubleArray66 = new double[][] { doubleArray50, doubleArray53, doubleArray56, doubleArray59, doubleArray62, doubleArray65 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl67 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray66);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl68 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray66);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl69 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray66);
        int int70 = bigMatrixImpl69.getColumnDimension();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl71 = bigMatrixImpl47.add(bigMatrixImpl69);
        java.math.BigDecimal bigDecimal72 = bigMatrixImpl69.getNorm();
        org.apache.commons.math.linear.BigMatrix bigMatrix73 = bigMatrixImpl21.scalarAdd(bigDecimal72);
        int int74 = bigMatrixImpl21.getScale();
        double[][] doubleArray75 = bigMatrixImpl21.getDataAsDoubleArray();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl76 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray75);
        // The following exception was thrown during execution in test generation
        try {
            realMatrixImpl76.luDecompose();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.InvalidMatrixException; message: LU decomposition requires that the matrix be square.");
        } catch (org.apache.commons.math.linear.InvalidMatrixException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(bigDecimalArray22);
        org.junit.Assert.assertNotNull(bigMatrix24);
        org.junit.Assert.assertNotNull(bigMatrix26);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 2 + "'", int70 == 2);
        org.junit.Assert.assertNotNull(bigMatrixImpl71);
        org.junit.Assert.assertNotNull(bigDecimal72);
        org.junit.Assert.assertNotNull(bigMatrix73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 64 + "'", int74 == 64);
        org.junit.Assert.assertNotNull(doubleArray75);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl5 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl6 = realMatrixImpl2.add(realMatrixImpl5);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl9 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = realMatrixImpl9.add(realMatrixImpl12);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl14 = realMatrixImpl2.add(realMatrixImpl12);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = realMatrixImpl2.getColumnMatrix((int) ' ');
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl2.copy();
        double[][] doubleArray18 = realMatrixImpl2.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl21 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray18, false);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl22 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        double[] doubleArray25 = new double[] { 1, (byte) 10 };
        double[] doubleArray28 = new double[] { 1, (byte) 10 };
        double[] doubleArray31 = new double[] { 1, (byte) 10 };
        double[] doubleArray34 = new double[] { 1, (byte) 10 };
        double[] doubleArray37 = new double[] { 1, (byte) 10 };
        double[] doubleArray40 = new double[] { 1, (byte) 10 };
        double[][] doubleArray41 = new double[][] { doubleArray25, doubleArray28, doubleArray31, doubleArray34, doubleArray37, doubleArray40 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl42 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray41);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl43 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray41);
        int int44 = bigMatrixImpl43.getScale();
        java.math.BigDecimal[] bigDecimalArray46 = bigMatrixImpl43.getRow((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal[] bigDecimalArray47 = bigMatrixImpl22.solve(bigDecimalArray46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: constant vector has wrong length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrixImpl6);
        org.junit.Assert.assertNotNull(realMatrixImpl13);
        org.junit.Assert.assertNotNull(realMatrixImpl14);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 64 + "'", int44 == 64);
        org.junit.Assert.assertNotNull(bigDecimalArray46);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        double[] doubleArray2 = new double[] { 1, (byte) 10 };
        double[] doubleArray5 = new double[] { 1, (byte) 10 };
        double[] doubleArray8 = new double[] { 1, (byte) 10 };
        double[] doubleArray11 = new double[] { 1, (byte) 10 };
        double[] doubleArray14 = new double[] { 1, (byte) 10 };
        double[] doubleArray17 = new double[] { 1, (byte) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl21 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        java.math.BigDecimal[][] bigDecimalArray22 = bigMatrixImpl21.getData();
        org.apache.commons.math.linear.BigMatrix bigMatrix24 = bigMatrixImpl21.getColumnMatrix((int) (short) 1);
        bigMatrixImpl21.setScale(6);
        org.apache.commons.math.linear.BigMatrix bigMatrix28 = bigMatrixImpl21.getRowMatrix((int) (byte) 0);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(bigDecimalArray22);
        org.junit.Assert.assertNotNull(bigMatrix24);
        org.junit.Assert.assertNotNull(bigMatrix28);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        double[] doubleArray2 = new double[] { 1, (byte) 10 };
        double[] doubleArray5 = new double[] { 1, (byte) 10 };
        double[] doubleArray8 = new double[] { 1, (byte) 10 };
        double[] doubleArray11 = new double[] { 1, (byte) 10 };
        double[] doubleArray14 = new double[] { 1, (byte) 10 };
        double[] doubleArray17 = new double[] { 1, (byte) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray18, true);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl23 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl25 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray18, false);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl26 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        bigMatrixImpl26.setRoundingMode((int) (short) 10);
        int int29 = bigMatrixImpl26.getRowDimension();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 6 + "'", int29 == 6);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        double[] doubleArray2 = new double[] { 1, (byte) 10 };
        double[] doubleArray5 = new double[] { 1, (byte) 10 };
        double[] doubleArray8 = new double[] { 1, (byte) 10 };
        double[] doubleArray11 = new double[] { 1, (byte) 10 };
        double[] doubleArray14 = new double[] { 1, (byte) 10 };
        double[] doubleArray17 = new double[] { 1, (byte) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        double[] doubleArray23 = new double[] { 1, (byte) 10 };
        double[] doubleArray26 = new double[] { 1, (byte) 10 };
        double[] doubleArray29 = new double[] { 1, (byte) 10 };
        double[] doubleArray32 = new double[] { 1, (byte) 10 };
        double[] doubleArray35 = new double[] { 1, (byte) 10 };
        double[] doubleArray38 = new double[] { 1, (byte) 10 };
        double[][] doubleArray39 = new double[][] { doubleArray23, doubleArray26, doubleArray29, doubleArray32, doubleArray35, doubleArray38 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl40 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray39);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl41 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray39);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl42 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray39);
        int int43 = bigMatrixImpl42.getColumnDimension();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl44 = bigMatrixImpl20.add(bigMatrixImpl42);
        java.lang.String str45 = bigMatrixImpl44.toString();
        int int46 = bigMatrixImpl44.getColumnDimension();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix47 = bigMatrixImpl44.inverse();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.InvalidMatrixException; message: coefficient matrix is not square");
        } catch (org.apache.commons.math.linear.InvalidMatrixException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertNotNull(bigMatrixImpl44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "BigMatrixImpl{{2,20},{2,20},{2,20},{2,20},{2,20},{2,20}}" + "'", str45, "BigMatrixImpl{{2,20},{2,20},{2,20},{2,20},{2,20},{2,20}}");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2 + "'", int46 == 2);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) '4', 5);
        java.math.BigDecimal[][] bigDecimalArray3 = bigMatrixImpl2.getDataRef();
        boolean boolean4 = bigMatrixImpl2.isSquare();
        org.junit.Assert.assertNotNull(bigDecimalArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl5 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix6 = realMatrixImpl2.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl5);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl5.getColumnMatrix((int) (short) 1);
        double[][] doubleArray9 = realMatrixImpl5.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl15 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix16 = realMatrixImpl12.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl15);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl23 = realMatrixImpl19.add(realMatrixImpl22);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrixImpl22.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        boolean boolean28 = realMatrixImpl15.equals((java.lang.Object) realMatrixImpl26);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl35 = realMatrixImpl31.add(realMatrixImpl34);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl38 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl41 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl42 = realMatrixImpl38.add(realMatrixImpl41);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl43 = realMatrixImpl31.add(realMatrixImpl41);
        org.apache.commons.math.linear.RealMatrix realMatrix45 = realMatrixImpl31.scalarAdd((double) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix47 = realMatrixImpl31.getColumnMatrix((int) (short) 0);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl48 = realMatrixImpl26.subtract(realMatrixImpl31);
        double[] doubleArray50 = realMatrixImpl26.getColumn((int) (short) 10);
        double double51 = realMatrixImpl26.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix52 = realMatrixImpl5.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl55 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl58 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl59 = realMatrixImpl55.add(realMatrixImpl58);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl62 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl65 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl66 = realMatrixImpl62.add(realMatrixImpl65);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl67 = realMatrixImpl55.add(realMatrixImpl65);
        org.apache.commons.math.linear.RealMatrix realMatrix69 = realMatrixImpl65.scalarMultiply(1.0d);
        boolean boolean70 = realMatrixImpl65.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix71 = realMatrixImpl65.copy();
        org.apache.commons.math.linear.RealMatrix realMatrix72 = realMatrixImpl26.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl65);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrixImpl23);
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(realMatrixImpl35);
        org.junit.Assert.assertNotNull(realMatrixImpl42);
        org.junit.Assert.assertNotNull(realMatrixImpl43);
        org.junit.Assert.assertNotNull(realMatrix45);
        org.junit.Assert.assertNotNull(realMatrix47);
        org.junit.Assert.assertNotNull(realMatrixImpl48);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertNotNull(realMatrix52);
        org.junit.Assert.assertNotNull(realMatrixImpl59);
        org.junit.Assert.assertNotNull(realMatrixImpl66);
        org.junit.Assert.assertNotNull(realMatrixImpl67);
        org.junit.Assert.assertNotNull(realMatrix69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(realMatrix71);
        org.junit.Assert.assertNotNull(realMatrix72);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        double[] doubleArray2 = new double[] { 1, (byte) 10 };
        double[] doubleArray5 = new double[] { 1, (byte) 10 };
        double[] doubleArray8 = new double[] { 1, (byte) 10 };
        double[] doubleArray11 = new double[] { 1, (byte) 10 };
        double[] doubleArray14 = new double[] { 1, (byte) 10 };
        double[] doubleArray17 = new double[] { 1, (byte) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        double[] doubleArray23 = new double[] { 1, (byte) 10 };
        double[] doubleArray26 = new double[] { 1, (byte) 10 };
        double[] doubleArray29 = new double[] { 1, (byte) 10 };
        double[] doubleArray32 = new double[] { 1, (byte) 10 };
        double[] doubleArray35 = new double[] { 1, (byte) 10 };
        double[] doubleArray38 = new double[] { 1, (byte) 10 };
        double[][] doubleArray39 = new double[][] { doubleArray23, doubleArray26, doubleArray29, doubleArray32, doubleArray35, doubleArray38 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl40 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray39);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl41 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray39);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl42 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray39);
        int int43 = bigMatrixImpl42.getColumnDimension();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl44 = bigMatrixImpl20.add(bigMatrixImpl42);
        java.math.BigDecimal bigDecimal45 = bigMatrixImpl42.getNorm();
        double[] doubleArray48 = new double[] { 1, (byte) 10 };
        double[] doubleArray51 = new double[] { 1, (byte) 10 };
        double[] doubleArray54 = new double[] { 1, (byte) 10 };
        double[] doubleArray57 = new double[] { 1, (byte) 10 };
        double[] doubleArray60 = new double[] { 1, (byte) 10 };
        double[] doubleArray63 = new double[] { 1, (byte) 10 };
        double[][] doubleArray64 = new double[][] { doubleArray48, doubleArray51, doubleArray54, doubleArray57, doubleArray60, doubleArray63 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl65 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray64);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl66 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray64);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl67 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray64);
        int int68 = bigMatrixImpl67.getColumnDimension();
        int int69 = bigMatrixImpl67.getScale();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl70 = bigMatrixImpl42.subtract(bigMatrixImpl67);
        boolean boolean71 = bigMatrixImpl67.isSingular();
        java.math.BigDecimal[][] bigDecimalArray72 = bigMatrixImpl67.getData();
        int int73 = bigMatrixImpl67.getRowDimension();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix75 = bigMatrixImpl67.getRowMatrix((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: illegal row argument");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertNotNull(bigMatrixImpl44);
        org.junit.Assert.assertNotNull(bigDecimal45);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 2 + "'", int68 == 2);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 64 + "'", int69 == 64);
        org.junit.Assert.assertNotNull(bigMatrixImpl70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(bigDecimalArray72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 6 + "'", int73 == 6);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl5 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl6 = realMatrixImpl2.add(realMatrixImpl5);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl6.scalarMultiply((double) (byte) 0);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = realMatrixImpl6.scalarMultiply((double) (short) -1);
        int int11 = realMatrixImpl6.getRowDimension();
        boolean boolean12 = realMatrixImpl6.isSingular();
        boolean boolean13 = realMatrixImpl6.isSquare();
        org.junit.Assert.assertNotNull(realMatrixImpl6);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl5 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix6 = realMatrixImpl2.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl5);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl5.getColumnMatrix((int) (short) 1);
        boolean boolean9 = realMatrixImpl5.isSingular();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl15 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = realMatrixImpl12.add(realMatrixImpl15);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl23 = realMatrixImpl19.add(realMatrixImpl22);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = realMatrixImpl12.add(realMatrixImpl22);
        org.apache.commons.math.linear.RealMatrix realMatrix25 = realMatrixImpl5.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl22);
        org.apache.commons.math.linear.RealMatrix realMatrix26 = realMatrixImpl22.copy();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl29 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl32 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = realMatrixImpl29.add(realMatrixImpl32);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl36 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl39 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl40 = realMatrixImpl36.add(realMatrixImpl39);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl43 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix44 = realMatrixImpl39.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl43);
        boolean boolean45 = realMatrixImpl39.isSquare();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl48 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl51 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix52 = realMatrixImpl48.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl51);
        int int53 = realMatrixImpl51.getRowDimension();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl54 = realMatrixImpl39.subtract(realMatrixImpl51);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl55 = realMatrixImpl32.subtract(realMatrixImpl54);
        boolean boolean56 = realMatrixImpl55.isSingular();
        int[] intArray58 = new int[] { 4 };
        int[] intArray60 = new int[] { (byte) 0 };
        org.apache.commons.math.linear.RealMatrix realMatrix61 = realMatrixImpl55.getSubMatrix(intArray58, intArray60);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl64 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl67 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl68 = realMatrixImpl64.add(realMatrixImpl67);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl71 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl74 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl75 = realMatrixImpl71.add(realMatrixImpl74);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl78 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix79 = realMatrixImpl74.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl78);
        boolean boolean80 = realMatrixImpl74.isSquare();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl83 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl86 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix87 = realMatrixImpl83.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl86);
        int int88 = realMatrixImpl86.getRowDimension();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl89 = realMatrixImpl74.subtract(realMatrixImpl86);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl90 = realMatrixImpl67.subtract(realMatrixImpl89);
        boolean boolean91 = realMatrixImpl90.isSingular();
        int[] intArray93 = new int[] { 4 };
        int[] intArray95 = new int[] { (byte) 0 };
        org.apache.commons.math.linear.RealMatrix realMatrix96 = realMatrixImpl90.getSubMatrix(intArray93, intArray95);
        org.apache.commons.math.linear.RealMatrix realMatrix97 = realMatrixImpl22.getSubMatrix(intArray58, intArray93);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(realMatrixImpl16);
        org.junit.Assert.assertNotNull(realMatrixImpl23);
        org.junit.Assert.assertNotNull(realMatrixImpl24);
        org.junit.Assert.assertNotNull(realMatrix25);
        org.junit.Assert.assertNotNull(realMatrix26);
        org.junit.Assert.assertNotNull(realMatrixImpl33);
        org.junit.Assert.assertNotNull(realMatrixImpl40);
        org.junit.Assert.assertNotNull(realMatrix44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(realMatrix52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 10 + "'", int53 == 10);
        org.junit.Assert.assertNotNull(realMatrixImpl54);
        org.junit.Assert.assertNotNull(realMatrixImpl55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[4]");
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[0]");
        org.junit.Assert.assertNotNull(realMatrix61);
        org.junit.Assert.assertNotNull(realMatrixImpl68);
        org.junit.Assert.assertNotNull(realMatrixImpl75);
        org.junit.Assert.assertNotNull(realMatrix79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(realMatrix87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 10 + "'", int88 == 10);
        org.junit.Assert.assertNotNull(realMatrixImpl89);
        org.junit.Assert.assertNotNull(realMatrixImpl90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertNotNull(intArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray93), "[4]");
        org.junit.Assert.assertNotNull(intArray95);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray95), "[0]");
        org.junit.Assert.assertNotNull(realMatrix96);
        org.junit.Assert.assertNotNull(realMatrix97);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        double[] doubleArray2 = new double[] { 1, (byte) 10 };
        double[] doubleArray5 = new double[] { 1, (byte) 10 };
        double[] doubleArray8 = new double[] { 1, (byte) 10 };
        double[] doubleArray11 = new double[] { 1, (byte) 10 };
        double[] doubleArray14 = new double[] { 1, (byte) 10 };
        double[] doubleArray17 = new double[] { 1, (byte) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        double[] doubleArray23 = new double[] { 1, (byte) 10 };
        double[] doubleArray26 = new double[] { 1, (byte) 10 };
        double[] doubleArray29 = new double[] { 1, (byte) 10 };
        double[] doubleArray32 = new double[] { 1, (byte) 10 };
        double[] doubleArray35 = new double[] { 1, (byte) 10 };
        double[] doubleArray38 = new double[] { 1, (byte) 10 };
        double[][] doubleArray39 = new double[][] { doubleArray23, doubleArray26, doubleArray29, doubleArray32, doubleArray35, doubleArray38 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl40 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray39);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl41 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray39);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl42 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray39);
        int int43 = bigMatrixImpl42.getColumnDimension();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl44 = bigMatrixImpl20.add(bigMatrixImpl42);
        org.apache.commons.math.linear.BigMatrix bigMatrix46 = bigMatrixImpl20.getColumnMatrix(0);
        bigMatrixImpl20.setScale((int) (short) 0);
        double[] doubleArray51 = new double[] { 1, (byte) 10 };
        double[] doubleArray54 = new double[] { 1, (byte) 10 };
        double[] doubleArray57 = new double[] { 1, (byte) 10 };
        double[] doubleArray60 = new double[] { 1, (byte) 10 };
        double[] doubleArray63 = new double[] { 1, (byte) 10 };
        double[] doubleArray66 = new double[] { 1, (byte) 10 };
        double[][] doubleArray67 = new double[][] { doubleArray51, doubleArray54, doubleArray57, doubleArray60, doubleArray63, doubleArray66 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl68 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray67);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl69 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray67);
        java.math.BigDecimal bigDecimal72 = bigMatrixImpl69.getEntry(0, (int) (short) 0);
        boolean boolean73 = bigMatrixImpl69.isSingular();
        java.math.BigDecimal[][] bigDecimalArray74 = bigMatrixImpl69.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl75 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray74);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl77 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray74, true);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl79 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray74, false);
        int int80 = bigMatrixImpl79.getRoundingMode();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix81 = bigMatrixImpl20.solve((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl79);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.InvalidMatrixException; message: coefficient matrix is not square");
        } catch (org.apache.commons.math.linear.InvalidMatrixException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertNotNull(bigMatrixImpl44);
        org.junit.Assert.assertNotNull(bigMatrix46);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertNotNull(bigDecimal72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(bigDecimalArray74);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 4 + "'", int80 == 4);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl5 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl6 = realMatrixImpl2.add(realMatrixImpl5);
        boolean boolean7 = realMatrixImpl6.isSquare();
        int int8 = realMatrixImpl6.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl6.transpose();
        double[][] doubleArray10 = realMatrixImpl6.getDataRef();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix12 = realMatrixImpl6.getRowMatrix((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: illegal row argument");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrixImpl6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(doubleArray10);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl5 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl6 = realMatrixImpl2.add(realMatrixImpl5);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl9 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = realMatrixImpl9.add(realMatrixImpl12);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl14 = realMatrixImpl2.add(realMatrixImpl12);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = realMatrixImpl2.scalarAdd((double) (byte) 1);
        int int17 = realMatrixImpl2.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl2.copy();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl21 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl25 = realMatrixImpl21.add(realMatrixImpl24);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl28 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl32 = realMatrixImpl28.add(realMatrixImpl31);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl35 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix36 = realMatrixImpl31.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl35);
        boolean boolean37 = realMatrixImpl31.isSquare();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl40 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl43 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix44 = realMatrixImpl40.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl43);
        int int45 = realMatrixImpl43.getRowDimension();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl46 = realMatrixImpl31.subtract(realMatrixImpl43);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl47 = realMatrixImpl24.subtract(realMatrixImpl46);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl50 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl53 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl54 = realMatrixImpl50.add(realMatrixImpl53);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl57 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix58 = realMatrixImpl53.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl57);
        org.apache.commons.math.linear.RealMatrix realMatrix59 = realMatrixImpl47.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl53);
        double[] doubleArray61 = realMatrixImpl53.getColumn(0);
        boolean boolean62 = realMatrixImpl53.isSingular();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl63 = realMatrixImpl2.subtract(realMatrixImpl53);
        org.junit.Assert.assertNotNull(realMatrixImpl6);
        org.junit.Assert.assertNotNull(realMatrixImpl13);
        org.junit.Assert.assertNotNull(realMatrixImpl14);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(realMatrixImpl25);
        org.junit.Assert.assertNotNull(realMatrixImpl32);
        org.junit.Assert.assertNotNull(realMatrix36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(realMatrix44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
        org.junit.Assert.assertNotNull(realMatrixImpl46);
        org.junit.Assert.assertNotNull(realMatrixImpl47);
        org.junit.Assert.assertNotNull(realMatrixImpl54);
        org.junit.Assert.assertNotNull(realMatrix58);
        org.junit.Assert.assertNotNull(realMatrix59);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(realMatrixImpl63);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        double[] doubleArray2 = new double[] { 1, (byte) 10 };
        double[] doubleArray5 = new double[] { 1, (byte) 10 };
        double[] doubleArray8 = new double[] { 1, (byte) 10 };
        double[] doubleArray11 = new double[] { 1, (byte) 10 };
        double[] doubleArray14 = new double[] { 1, (byte) 10 };
        double[] doubleArray17 = new double[] { 1, (byte) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl21 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl22 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrix bigMatrix23 = bigMatrixImpl22.transpose();
        boolean boolean24 = bigMatrixImpl22.isSingular();
        double[] doubleArray27 = new double[] { 1, (byte) 10 };
        double[] doubleArray30 = new double[] { 1, (byte) 10 };
        double[] doubleArray33 = new double[] { 1, (byte) 10 };
        double[] doubleArray36 = new double[] { 1, (byte) 10 };
        double[] doubleArray39 = new double[] { 1, (byte) 10 };
        double[] doubleArray42 = new double[] { 1, (byte) 10 };
        double[][] doubleArray43 = new double[][] { doubleArray27, doubleArray30, doubleArray33, doubleArray36, doubleArray39, doubleArray42 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl44 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray43);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl45 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray43);
        java.math.BigDecimal bigDecimal48 = bigMatrixImpl45.getEntry(0, (int) (short) 0);
        java.math.BigDecimal[][] bigDecimalArray49 = bigMatrixImpl45.getData();
        org.apache.commons.math.linear.BigMatrix bigMatrix51 = bigMatrixImpl45.getRowMatrix(1);
        java.math.BigDecimal[][] bigDecimalArray52 = bigMatrixImpl45.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl54 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray52, true);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl55 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray52);
        org.apache.commons.math.linear.BigMatrix bigMatrix56 = bigMatrixImpl22.subtract((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl55);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(bigMatrix23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertNotNull(bigDecimal48);
        org.junit.Assert.assertNotNull(bigDecimalArray49);
        org.junit.Assert.assertNotNull(bigMatrix51);
        org.junit.Assert.assertNotNull(bigDecimalArray52);
        org.junit.Assert.assertNotNull(bigMatrix56);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl5 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl6 = realMatrixImpl2.add(realMatrixImpl5);
        double[][] doubleArray7 = realMatrixImpl5.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl8 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray7);
        java.math.BigDecimal bigDecimal9 = null;
        java.math.BigDecimal[] bigDecimalArray10 = new java.math.BigDecimal[] { bigDecimal9 };
        java.math.BigDecimal bigDecimal11 = null;
        java.math.BigDecimal[] bigDecimalArray12 = new java.math.BigDecimal[] { bigDecimal11 };
        java.math.BigDecimal bigDecimal13 = null;
        java.math.BigDecimal[] bigDecimalArray14 = new java.math.BigDecimal[] { bigDecimal13 };
        java.math.BigDecimal bigDecimal15 = null;
        java.math.BigDecimal[] bigDecimalArray16 = new java.math.BigDecimal[] { bigDecimal15 };
        java.math.BigDecimal bigDecimal17 = null;
        java.math.BigDecimal[] bigDecimalArray18 = new java.math.BigDecimal[] { bigDecimal17 };
        java.math.BigDecimal[][] bigDecimalArray19 = new java.math.BigDecimal[][] { bigDecimalArray10, bigDecimalArray12, bigDecimalArray14, bigDecimalArray16, bigDecimalArray18 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl21 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray19, true);
        bigMatrixImpl21.setScale((int) (short) 0);
        int int24 = bigMatrixImpl21.getRoundingMode();
        int int25 = bigMatrixImpl21.getRowDimension();
        int int26 = bigMatrixImpl21.getRoundingMode();
        int int27 = bigMatrixImpl21.getColumnDimension();
        java.math.BigDecimal[][] bigDecimalArray28 = bigMatrixImpl21.getData();
        bigMatrixImpl21.setScale(2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix31 = bigMatrixImpl8.subtract((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: matrix dimension mismatch");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrixImpl6);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(bigDecimalArray10);
        org.junit.Assert.assertNotNull(bigDecimalArray12);
        org.junit.Assert.assertNotNull(bigDecimalArray14);
        org.junit.Assert.assertNotNull(bigDecimalArray16);
        org.junit.Assert.assertNotNull(bigDecimalArray18);
        org.junit.Assert.assertNotNull(bigDecimalArray19);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 5 + "'", int25 == 5);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(bigDecimalArray28);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl5 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl6 = realMatrixImpl2.add(realMatrixImpl5);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl9 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix10 = realMatrixImpl5.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl9);
        boolean boolean11 = realMatrixImpl5.isSquare();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl14 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl17 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl14.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl17);
        int int19 = realMatrixImpl17.getRowDimension();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = realMatrixImpl5.subtract(realMatrixImpl17);
        double[][] doubleArray21 = realMatrixImpl17.getDataRef();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray23 = realMatrixImpl17.getColumn((-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: illegal column argument");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrixImpl6);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(realMatrixImpl20);
        org.junit.Assert.assertNotNull(doubleArray21);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        double[] doubleArray2 = new double[] { 1, (byte) 10 };
        double[] doubleArray5 = new double[] { 1, (byte) 10 };
        double[] doubleArray8 = new double[] { 1, (byte) 10 };
        double[] doubleArray11 = new double[] { 1, (byte) 10 };
        double[] doubleArray14 = new double[] { 1, (byte) 10 };
        double[] doubleArray17 = new double[] { 1, (byte) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl21 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        java.math.BigDecimal[][] bigDecimalArray22 = bigMatrixImpl21.getData();
        bigMatrixImpl21.setScale((int) ' ');
        java.math.BigDecimal[][] bigDecimalArray25 = bigMatrixImpl21.getData();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(bigDecimalArray22);
        org.junit.Assert.assertNotNull(bigDecimalArray25);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        java.math.BigDecimal bigDecimal0 = null;
        java.math.BigDecimal[] bigDecimalArray1 = new java.math.BigDecimal[] { bigDecimal0 };
        java.math.BigDecimal bigDecimal2 = null;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = null;
        java.math.BigDecimal[] bigDecimalArray5 = new java.math.BigDecimal[] { bigDecimal4 };
        java.math.BigDecimal bigDecimal6 = null;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = null;
        java.math.BigDecimal[] bigDecimalArray9 = new java.math.BigDecimal[] { bigDecimal8 };
        java.math.BigDecimal[][] bigDecimalArray10 = new java.math.BigDecimal[][] { bigDecimalArray1, bigDecimalArray3, bigDecimalArray5, bigDecimalArray7, bigDecimalArray9 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl12 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray10, true);
        bigMatrixImpl12.setScale((int) (short) 0);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl17 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl21 = realMatrixImpl17.add(realMatrixImpl20);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl27 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl28 = realMatrixImpl24.add(realMatrixImpl27);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl29 = realMatrixImpl17.add(realMatrixImpl27);
        org.apache.commons.math.linear.RealMatrix realMatrix30 = realMatrixImpl17.copy();
        org.apache.commons.math.linear.RealMatrix realMatrix32 = realMatrixImpl17.scalarMultiply((double) (short) -1);
        boolean boolean33 = bigMatrixImpl12.equals((java.lang.Object) (short) -1);
        boolean boolean34 = bigMatrixImpl12.isSquare();
        org.junit.Assert.assertNotNull(bigDecimalArray1);
        org.junit.Assert.assertNotNull(bigDecimalArray3);
        org.junit.Assert.assertNotNull(bigDecimalArray5);
        org.junit.Assert.assertNotNull(bigDecimalArray7);
        org.junit.Assert.assertNotNull(bigDecimalArray9);
        org.junit.Assert.assertNotNull(bigDecimalArray10);
        org.junit.Assert.assertNotNull(realMatrixImpl21);
        org.junit.Assert.assertNotNull(realMatrixImpl28);
        org.junit.Assert.assertNotNull(realMatrixImpl29);
        org.junit.Assert.assertNotNull(realMatrix30);
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl5 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl6 = realMatrixImpl2.add(realMatrixImpl5);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl9 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = realMatrixImpl9.add(realMatrixImpl12);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        boolean boolean18 = realMatrixImpl12.isSquare();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl21 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix25 = realMatrixImpl21.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl24);
        int int26 = realMatrixImpl24.getRowDimension();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl27 = realMatrixImpl12.subtract(realMatrixImpl24);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl28 = realMatrixImpl5.subtract(realMatrixImpl27);
        org.apache.commons.math.linear.RealMatrix realMatrix30 = realMatrixImpl28.getColumnMatrix(0);
        double[][] doubleArray31 = realMatrixImpl28.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl32 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray31);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray31, false);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl35 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray31);
        org.junit.Assert.assertNotNull(realMatrixImpl6);
        org.junit.Assert.assertNotNull(realMatrixImpl13);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(realMatrix25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertNotNull(realMatrixImpl27);
        org.junit.Assert.assertNotNull(realMatrixImpl28);
        org.junit.Assert.assertNotNull(realMatrix30);
        org.junit.Assert.assertNotNull(doubleArray31);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        double[] doubleArray2 = new double[] { 1, (byte) 10 };
        double[] doubleArray5 = new double[] { 1, (byte) 10 };
        double[] doubleArray8 = new double[] { 1, (byte) 10 };
        double[] doubleArray11 = new double[] { 1, (byte) 10 };
        double[] doubleArray14 = new double[] { 1, (byte) 10 };
        double[] doubleArray17 = new double[] { 1, (byte) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray18, false);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = realMatrixImpl22.scalarAdd((double) (byte) 10);
        double[][] doubleArray25 = realMatrixImpl22.getDataRef();
        java.lang.String str26 = realMatrixImpl22.toString();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "RealMatrixImpl{{1.0,10.0},{1.0,10.0},{1.0,10.0},{1.0,10.0},{1.0,10.0},{1.0,10.0}}" + "'", str26, "RealMatrixImpl{{1.0,10.0},{1.0,10.0},{1.0,10.0},{1.0,10.0},{1.0,10.0},{1.0,10.0}}");
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl5 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl6 = realMatrixImpl2.add(realMatrixImpl5);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl9 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix10 = realMatrixImpl5.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl9);
        boolean boolean11 = realMatrixImpl5.isSquare();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl14 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl17 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl14.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl17);
        int int19 = realMatrixImpl17.getRowDimension();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = realMatrixImpl5.subtract(realMatrixImpl17);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl23 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl27 = realMatrixImpl23.add(realMatrixImpl26);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl30 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = realMatrixImpl30.add(realMatrixImpl33);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl35 = realMatrixImpl23.add(realMatrixImpl33);
        org.apache.commons.math.linear.RealMatrix realMatrix36 = realMatrixImpl23.copy();
        org.apache.commons.math.linear.RealMatrix realMatrix37 = realMatrixImpl17.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl23);
        double double38 = realMatrixImpl23.getNorm();
        double double39 = realMatrixImpl23.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix41 = realMatrixImpl23.getColumnMatrix(10);
        double[] doubleArray44 = new double[] { 1, (byte) 10 };
        double[] doubleArray47 = new double[] { 1, (byte) 10 };
        double[] doubleArray50 = new double[] { 1, (byte) 10 };
        double[] doubleArray53 = new double[] { 1, (byte) 10 };
        double[] doubleArray56 = new double[] { 1, (byte) 10 };
        double[] doubleArray59 = new double[] { 1, (byte) 10 };
        double[][] doubleArray60 = new double[][] { doubleArray44, doubleArray47, doubleArray50, doubleArray53, doubleArray56, doubleArray59 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl61 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray60);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl62 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray60);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl63 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray60);
        int int64 = bigMatrixImpl63.getRoundingMode();
        int int65 = bigMatrixImpl63.getScale();
        int int66 = bigMatrixImpl63.getScale();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl69 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl72 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl73 = realMatrixImpl69.add(realMatrixImpl72);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl76 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl79 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl80 = realMatrixImpl76.add(realMatrixImpl79);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl83 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl86 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl87 = realMatrixImpl83.add(realMatrixImpl86);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl88 = realMatrixImpl76.add(realMatrixImpl86);
        org.apache.commons.math.linear.RealMatrix realMatrix90 = realMatrixImpl76.scalarAdd((double) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix91 = realMatrixImpl73.add(realMatrix90);
        double[] doubleArray93 = realMatrixImpl73.getRow((int) (byte) 1);
        boolean boolean94 = bigMatrixImpl63.equals((java.lang.Object) doubleArray93);
        double[] doubleArray95 = realMatrixImpl23.operate(doubleArray93);
        org.junit.Assert.assertNotNull(realMatrixImpl6);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(realMatrixImpl20);
        org.junit.Assert.assertNotNull(realMatrixImpl27);
        org.junit.Assert.assertNotNull(realMatrixImpl34);
        org.junit.Assert.assertNotNull(realMatrixImpl35);
        org.junit.Assert.assertNotNull(realMatrix36);
        org.junit.Assert.assertNotNull(realMatrix37);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertNotNull(realMatrix41);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 4 + "'", int64 == 4);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 64 + "'", int65 == 64);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 64 + "'", int66 == 64);
        org.junit.Assert.assertNotNull(realMatrixImpl73);
        org.junit.Assert.assertNotNull(realMatrixImpl80);
        org.junit.Assert.assertNotNull(realMatrixImpl87);
        org.junit.Assert.assertNotNull(realMatrixImpl88);
        org.junit.Assert.assertNotNull(realMatrix90);
        org.junit.Assert.assertNotNull(realMatrix91);
        org.junit.Assert.assertNotNull(doubleArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray93), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(doubleArray95);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray95), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        double[] doubleArray2 = new double[] { 1, (byte) 10 };
        double[] doubleArray5 = new double[] { 1, (byte) 10 };
        double[] doubleArray8 = new double[] { 1, (byte) 10 };
        double[] doubleArray11 = new double[] { 1, (byte) 10 };
        double[] doubleArray14 = new double[] { 1, (byte) 10 };
        double[] doubleArray17 = new double[] { 1, (byte) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl21 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        java.math.BigDecimal[][] bigDecimalArray22 = bigMatrixImpl21.getData();
        org.apache.commons.math.linear.BigMatrix bigMatrix24 = bigMatrixImpl21.getColumnMatrix((int) (short) 1);
        org.apache.commons.math.linear.BigMatrix bigMatrix26 = bigMatrixImpl21.getRowMatrix(4);
        double[] doubleArray29 = new double[] { 1, (byte) 10 };
        double[] doubleArray32 = new double[] { 1, (byte) 10 };
        double[] doubleArray35 = new double[] { 1, (byte) 10 };
        double[] doubleArray38 = new double[] { 1, (byte) 10 };
        double[] doubleArray41 = new double[] { 1, (byte) 10 };
        double[] doubleArray44 = new double[] { 1, (byte) 10 };
        double[][] doubleArray45 = new double[][] { doubleArray29, doubleArray32, doubleArray35, doubleArray38, doubleArray41, doubleArray44 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl46 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray45);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl47 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray45);
        double[] doubleArray50 = new double[] { 1, (byte) 10 };
        double[] doubleArray53 = new double[] { 1, (byte) 10 };
        double[] doubleArray56 = new double[] { 1, (byte) 10 };
        double[] doubleArray59 = new double[] { 1, (byte) 10 };
        double[] doubleArray62 = new double[] { 1, (byte) 10 };
        double[] doubleArray65 = new double[] { 1, (byte) 10 };
        double[][] doubleArray66 = new double[][] { doubleArray50, doubleArray53, doubleArray56, doubleArray59, doubleArray62, doubleArray65 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl67 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray66);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl68 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray66);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl69 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray66);
        int int70 = bigMatrixImpl69.getColumnDimension();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl71 = bigMatrixImpl47.add(bigMatrixImpl69);
        java.math.BigDecimal bigDecimal72 = bigMatrixImpl69.getNorm();
        org.apache.commons.math.linear.BigMatrix bigMatrix73 = bigMatrixImpl21.scalarAdd(bigDecimal72);
        int int74 = bigMatrixImpl21.getScale();
        org.apache.commons.math.linear.BigMatrix bigMatrix75 = bigMatrixImpl21.copy();
        bigMatrixImpl21.setRoundingMode((int) (short) 100);
        boolean boolean78 = bigMatrixImpl21.isSquare();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(bigDecimalArray22);
        org.junit.Assert.assertNotNull(bigMatrix24);
        org.junit.Assert.assertNotNull(bigMatrix26);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 2 + "'", int70 == 2);
        org.junit.Assert.assertNotNull(bigMatrixImpl71);
        org.junit.Assert.assertNotNull(bigDecimal72);
        org.junit.Assert.assertNotNull(bigMatrix73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 64 + "'", int74 == 64);
        org.junit.Assert.assertNotNull(bigMatrix75);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl5 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl6 = realMatrixImpl2.add(realMatrixImpl5);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl9 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix10 = realMatrixImpl5.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl9);
        boolean boolean11 = realMatrixImpl5.isSquare();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl14 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl17 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl14.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl17);
        int int19 = realMatrixImpl17.getRowDimension();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = realMatrixImpl5.subtract(realMatrixImpl17);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl23 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrixImpl23.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl30 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = realMatrixImpl30.add(realMatrixImpl33);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl37 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix38 = realMatrixImpl33.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl37);
        boolean boolean39 = realMatrixImpl26.equals((java.lang.Object) realMatrixImpl37);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl40 = realMatrixImpl5.add(realMatrixImpl37);
        int int41 = realMatrixImpl40.getRowDimension();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix46 = realMatrixImpl40.getSubMatrix((int) (short) -1, 64, (int) (short) 100, 5);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: invalid row or column index selection");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrixImpl6);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(realMatrixImpl20);
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertNotNull(realMatrixImpl34);
        org.junit.Assert.assertNotNull(realMatrix38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(realMatrixImpl40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl5 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix6 = realMatrixImpl2.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl5);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl9 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = realMatrixImpl9.add(realMatrixImpl12);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        boolean boolean18 = realMatrixImpl5.equals((java.lang.Object) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix19 = realMatrixImpl5.copy();
        org.apache.commons.math.linear.RealMatrix realMatrix21 = realMatrixImpl5.scalarAdd((double) 97);
        boolean boolean22 = realMatrixImpl5.isSingular();
        int int23 = realMatrixImpl5.getColumnDimension();
        int int24 = realMatrixImpl5.getColumnDimension();
        double double27 = realMatrixImpl5.getEntry(0, 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix29 = realMatrixImpl5.getColumnMatrix((int) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: illegal column argument");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrixImpl13);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl5 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl6 = realMatrixImpl2.add(realMatrixImpl5);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl9 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = realMatrixImpl9.add(realMatrixImpl12);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl14 = realMatrixImpl2.add(realMatrixImpl12);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = realMatrixImpl2.getColumnMatrix((int) ' ');
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl2.copy();
        double[][] doubleArray18 = realMatrixImpl2.getDataRef();
        boolean boolean19 = realMatrixImpl2.isSingular();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl25 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = realMatrixImpl22.add(realMatrixImpl25);
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrixImpl2.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl30 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = realMatrixImpl30.add(realMatrixImpl33);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl37 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl40 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl41 = realMatrixImpl37.add(realMatrixImpl40);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl42 = realMatrixImpl30.add(realMatrixImpl40);
        org.apache.commons.math.linear.RealMatrix realMatrix44 = realMatrixImpl40.scalarMultiply(1.0d);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl47 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl50 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl51 = realMatrixImpl47.add(realMatrixImpl50);
        double[] doubleArray53 = realMatrixImpl50.getColumn((int) (byte) 0);
        boolean boolean55 = realMatrixImpl50.equals((java.lang.Object) 6);
        org.apache.commons.math.linear.RealMatrix realMatrix57 = realMatrixImpl50.getRowMatrix(5);
        double[] doubleArray59 = realMatrixImpl50.getColumn(0);
        double[] doubleArray60 = realMatrixImpl40.preMultiply(doubleArray59);
        double[] doubleArray61 = realMatrixImpl2.preMultiply(doubleArray59);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl64 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl67 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl68 = realMatrixImpl64.add(realMatrixImpl67);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl71 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix72 = realMatrixImpl67.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl71);
        int int73 = realMatrixImpl67.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix74 = realMatrixImpl67.transpose();
        double[][] doubleArray75 = realMatrixImpl67.getDataRef();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl76 = realMatrixImpl2.multiply(realMatrixImpl67);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Matrices are not multiplication compatible.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrixImpl6);
        org.junit.Assert.assertNotNull(realMatrixImpl13);
        org.junit.Assert.assertNotNull(realMatrixImpl14);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(realMatrixImpl26);
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertNotNull(realMatrixImpl34);
        org.junit.Assert.assertNotNull(realMatrixImpl41);
        org.junit.Assert.assertNotNull(realMatrixImpl42);
        org.junit.Assert.assertNotNull(realMatrix44);
        org.junit.Assert.assertNotNull(realMatrixImpl51);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(realMatrix57);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(realMatrixImpl68);
        org.junit.Assert.assertNotNull(realMatrix72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 35 + "'", int73 == 35);
        org.junit.Assert.assertNotNull(realMatrix74);
        org.junit.Assert.assertNotNull(doubleArray75);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl5 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl6 = realMatrixImpl2.add(realMatrixImpl5);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl9 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix10 = realMatrixImpl5.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl9);
        boolean boolean11 = realMatrixImpl5.isSquare();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl14 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl17 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl14.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl17);
        int int19 = realMatrixImpl17.getRowDimension();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = realMatrixImpl5.subtract(realMatrixImpl17);
        double[][] doubleArray21 = realMatrixImpl17.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl23 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21, true);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl25 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21, true);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl28 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix32 = realMatrixImpl28.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl31);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl35 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl38 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl39 = realMatrixImpl35.add(realMatrixImpl38);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl42 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix43 = realMatrixImpl38.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl42);
        boolean boolean44 = realMatrixImpl31.equals((java.lang.Object) realMatrixImpl42);
        org.apache.commons.math.linear.RealMatrix realMatrix45 = realMatrixImpl31.copy();
        org.apache.commons.math.linear.RealMatrix realMatrix47 = realMatrixImpl31.scalarAdd((double) 97);
        boolean boolean48 = realMatrixImpl25.equals((java.lang.Object) realMatrixImpl31);
        org.apache.commons.math.linear.RealMatrix realMatrix50 = realMatrixImpl31.scalarAdd(60.0d);
        org.junit.Assert.assertNotNull(realMatrixImpl6);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(realMatrixImpl20);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(realMatrixImpl39);
        org.junit.Assert.assertNotNull(realMatrix43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(realMatrix45);
        org.junit.Assert.assertNotNull(realMatrix47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(realMatrix50);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl(4, 64);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl5 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl6 = realMatrixImpl2.add(realMatrixImpl5);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl9 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = realMatrixImpl9.add(realMatrixImpl12);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = realMatrixImpl16.add(realMatrixImpl19);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl21 = realMatrixImpl9.add(realMatrixImpl19);
        org.apache.commons.math.linear.RealMatrix realMatrix23 = realMatrixImpl9.scalarAdd((double) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix24 = realMatrixImpl6.add(realMatrix23);
        double[] doubleArray26 = realMatrixImpl6.getRow((int) (byte) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix28 = realMatrixImpl6.scalarMultiply((double) 35);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl35 = realMatrixImpl31.add(realMatrixImpl34);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl38 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix39 = realMatrixImpl34.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl38);
        boolean boolean40 = realMatrixImpl34.isSquare();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl43 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl46 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix47 = realMatrixImpl43.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl46);
        int int48 = realMatrixImpl46.getRowDimension();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl49 = realMatrixImpl34.subtract(realMatrixImpl46);
        double[][] doubleArray50 = realMatrixImpl46.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl53 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl56 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl57 = realMatrixImpl53.add(realMatrixImpl56);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl60 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl63 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl64 = realMatrixImpl60.add(realMatrixImpl63);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl65 = realMatrixImpl53.add(realMatrixImpl63);
        org.apache.commons.math.linear.RealMatrix realMatrix67 = realMatrixImpl53.scalarAdd((double) (byte) 1);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl70 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl73 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix74 = realMatrixImpl70.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl73);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl77 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl80 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl81 = realMatrixImpl77.add(realMatrixImpl80);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl84 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix85 = realMatrixImpl80.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl84);
        boolean boolean86 = realMatrixImpl73.equals((java.lang.Object) realMatrixImpl84);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl87 = realMatrixImpl53.add(realMatrixImpl73);
        org.apache.commons.math.linear.RealMatrix realMatrix89 = realMatrixImpl53.scalarMultiply((double) 0.0f);
        org.apache.commons.math.linear.RealMatrix realMatrix90 = realMatrixImpl53.copy();
        org.apache.commons.math.linear.RealMatrix realMatrix91 = realMatrixImpl46.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl53);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl92 = realMatrixImpl6.add(realMatrixImpl53);
        org.apache.commons.math.linear.RealMatrix realMatrix93 = realMatrixImpl53.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix95 = realMatrixImpl53.scalarMultiply(1.0d);
        org.apache.commons.math.linear.RealMatrix realMatrix97 = realMatrixImpl53.scalarMultiply(100.0d);
        org.junit.Assert.assertNotNull(realMatrixImpl6);
        org.junit.Assert.assertNotNull(realMatrixImpl13);
        org.junit.Assert.assertNotNull(realMatrixImpl20);
        org.junit.Assert.assertNotNull(realMatrixImpl21);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(realMatrix28);
        org.junit.Assert.assertNotNull(realMatrixImpl35);
        org.junit.Assert.assertNotNull(realMatrix39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(realMatrix47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 10 + "'", int48 == 10);
        org.junit.Assert.assertNotNull(realMatrixImpl49);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertNotNull(realMatrixImpl57);
        org.junit.Assert.assertNotNull(realMatrixImpl64);
        org.junit.Assert.assertNotNull(realMatrixImpl65);
        org.junit.Assert.assertNotNull(realMatrix67);
        org.junit.Assert.assertNotNull(realMatrix74);
        org.junit.Assert.assertNotNull(realMatrixImpl81);
        org.junit.Assert.assertNotNull(realMatrix85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(realMatrixImpl87);
        org.junit.Assert.assertNotNull(realMatrix89);
        org.junit.Assert.assertNotNull(realMatrix90);
        org.junit.Assert.assertNotNull(realMatrix91);
        org.junit.Assert.assertNotNull(realMatrixImpl92);
        org.junit.Assert.assertNotNull(realMatrix93);
        org.junit.Assert.assertNotNull(realMatrix95);
        org.junit.Assert.assertNotNull(realMatrix97);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        double[] doubleArray2 = new double[] { 1, (byte) 10 };
        double[] doubleArray5 = new double[] { 1, (byte) 10 };
        double[] doubleArray8 = new double[] { 1, (byte) 10 };
        double[] doubleArray11 = new double[] { 1, (byte) 10 };
        double[] doubleArray14 = new double[] { 1, (byte) 10 };
        double[] doubleArray17 = new double[] { 1, (byte) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        java.math.BigDecimal bigDecimal23 = bigMatrixImpl20.getEntry(0, (int) (short) 0);
        java.math.BigDecimal[][] bigDecimalArray24 = bigMatrixImpl20.getData();
        org.apache.commons.math.linear.BigMatrix bigMatrix26 = bigMatrixImpl20.getRowMatrix(1);
        int int27 = bigMatrixImpl20.getColumnDimension();
        int int28 = bigMatrixImpl20.getScale();
        java.math.BigDecimal[][] bigDecimalArray29 = bigMatrixImpl20.getDataRef();
        double[][] doubleArray30 = bigMatrixImpl20.getDataAsDoubleArray();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl32 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray30, true);
        double double35 = realMatrixImpl32.getEntry((int) (byte) 1, 0);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertNotNull(bigDecimalArray24);
        org.junit.Assert.assertNotNull(bigMatrix26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 64 + "'", int28 == 64);
        org.junit.Assert.assertNotNull(bigDecimalArray29);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1.0d + "'", double35 == 1.0d);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        double[] doubleArray2 = new double[] { 1, (byte) 10 };
        double[] doubleArray5 = new double[] { 1, (byte) 10 };
        double[] doubleArray8 = new double[] { 1, (byte) 10 };
        double[] doubleArray11 = new double[] { 1, (byte) 10 };
        double[] doubleArray14 = new double[] { 1, (byte) 10 };
        double[] doubleArray17 = new double[] { 1, (byte) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl21 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl22 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        int int23 = bigMatrixImpl22.getRowDimension();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl26 = new org.apache.commons.math.linear.BigMatrixImpl(2, 97);
        java.math.BigDecimal[][] bigDecimalArray27 = bigMatrixImpl26.getDataRef();
        java.lang.String str28 = bigMatrixImpl26.toString();
        int int29 = bigMatrixImpl26.getRoundingMode();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl30 = bigMatrixImpl22.subtract(bigMatrixImpl26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: matrix dimension mismatch");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 6 + "'", int23 == 6);
        org.junit.Assert.assertNotNull(bigDecimalArray27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "BigMatrixImpl{{null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null},{null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null}}" + "'", str28, "BigMatrixImpl{{null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null},{null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null}}");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4 + "'", int29 == 4);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        java.math.BigDecimal bigDecimal0 = null;
        java.math.BigDecimal[] bigDecimalArray1 = new java.math.BigDecimal[] { bigDecimal0 };
        java.math.BigDecimal bigDecimal2 = null;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = null;
        java.math.BigDecimal[] bigDecimalArray5 = new java.math.BigDecimal[] { bigDecimal4 };
        java.math.BigDecimal bigDecimal6 = null;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = null;
        java.math.BigDecimal[] bigDecimalArray9 = new java.math.BigDecimal[] { bigDecimal8 };
        java.math.BigDecimal[][] bigDecimalArray10 = new java.math.BigDecimal[][] { bigDecimalArray1, bigDecimalArray3, bigDecimalArray5, bigDecimalArray7, bigDecimalArray9 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl12 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray10, true);
        int int13 = bigMatrixImpl12.getRoundingMode();
        java.math.BigDecimal[][] bigDecimalArray14 = bigMatrixImpl12.getDataRef();
        java.math.BigDecimal[][] bigDecimalArray15 = bigMatrixImpl12.getDataRef();
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = bigMatrixImpl12.transpose();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal17 = bigMatrixImpl12.getNorm();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimalArray1);
        org.junit.Assert.assertNotNull(bigDecimalArray3);
        org.junit.Assert.assertNotNull(bigDecimalArray5);
        org.junit.Assert.assertNotNull(bigDecimalArray7);
        org.junit.Assert.assertNotNull(bigDecimalArray9);
        org.junit.Assert.assertNotNull(bigDecimalArray10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertNotNull(bigDecimalArray14);
        org.junit.Assert.assertNotNull(bigDecimalArray15);
        org.junit.Assert.assertNotNull(bigMatrix16);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl5 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl6 = realMatrixImpl2.add(realMatrixImpl5);
        boolean boolean7 = realMatrixImpl6.isSquare();
        int int8 = realMatrixImpl6.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl6.transpose();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl15 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = realMatrixImpl12.add(realMatrixImpl15);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl23 = realMatrixImpl19.add(realMatrixImpl22);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = realMatrixImpl12.add(realMatrixImpl22);
        org.apache.commons.math.linear.RealMatrix realMatrix26 = realMatrixImpl22.scalarMultiply(1.0d);
        boolean boolean27 = realMatrixImpl22.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix28 = realMatrixImpl22.copy();
        org.apache.commons.math.linear.RealMatrix realMatrix29 = realMatrixImpl6.subtract(realMatrix28);
        org.junit.Assert.assertNotNull(realMatrixImpl6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrixImpl16);
        org.junit.Assert.assertNotNull(realMatrixImpl23);
        org.junit.Assert.assertNotNull(realMatrixImpl24);
        org.junit.Assert.assertNotNull(realMatrix26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(realMatrix28);
        org.junit.Assert.assertNotNull(realMatrix29);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        double[] doubleArray2 = new double[] { 1, (byte) 10 };
        double[] doubleArray5 = new double[] { 1, (byte) 10 };
        double[] doubleArray8 = new double[] { 1, (byte) 10 };
        double[] doubleArray11 = new double[] { 1, (byte) 10 };
        double[] doubleArray14 = new double[] { 1, (byte) 10 };
        double[] doubleArray17 = new double[] { 1, (byte) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        double[] doubleArray23 = new double[] { 1, (byte) 10 };
        double[] doubleArray26 = new double[] { 1, (byte) 10 };
        double[] doubleArray29 = new double[] { 1, (byte) 10 };
        double[] doubleArray32 = new double[] { 1, (byte) 10 };
        double[] doubleArray35 = new double[] { 1, (byte) 10 };
        double[] doubleArray38 = new double[] { 1, (byte) 10 };
        double[][] doubleArray39 = new double[][] { doubleArray23, doubleArray26, doubleArray29, doubleArray32, doubleArray35, doubleArray38 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl40 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray39);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl41 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray39);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl42 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray39);
        int int43 = bigMatrixImpl42.getColumnDimension();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl44 = bigMatrixImpl20.add(bigMatrixImpl42);
        boolean boolean46 = bigMatrixImpl20.equals((java.lang.Object) (-1));
        double[] doubleArray49 = new double[] { 1, (byte) 10 };
        double[] doubleArray52 = new double[] { 1, (byte) 10 };
        double[] doubleArray55 = new double[] { 1, (byte) 10 };
        double[] doubleArray58 = new double[] { 1, (byte) 10 };
        double[] doubleArray61 = new double[] { 1, (byte) 10 };
        double[] doubleArray64 = new double[] { 1, (byte) 10 };
        double[][] doubleArray65 = new double[][] { doubleArray49, doubleArray52, doubleArray55, doubleArray58, doubleArray61, doubleArray64 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl66 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray65);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl67 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray65);
        double[] doubleArray70 = new double[] { 1, (byte) 10 };
        double[] doubleArray73 = new double[] { 1, (byte) 10 };
        double[] doubleArray76 = new double[] { 1, (byte) 10 };
        double[] doubleArray79 = new double[] { 1, (byte) 10 };
        double[] doubleArray82 = new double[] { 1, (byte) 10 };
        double[] doubleArray85 = new double[] { 1, (byte) 10 };
        double[][] doubleArray86 = new double[][] { doubleArray70, doubleArray73, doubleArray76, doubleArray79, doubleArray82, doubleArray85 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl87 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray86);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl88 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray86);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl89 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray86);
        int int90 = bigMatrixImpl89.getColumnDimension();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl91 = bigMatrixImpl67.add(bigMatrixImpl89);
        java.math.BigDecimal bigDecimal92 = bigMatrixImpl89.getNorm();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl93 = bigMatrixImpl20.subtract(bigMatrixImpl89);
        org.apache.commons.math.linear.BigMatrix bigMatrix94 = bigMatrixImpl93.transpose();
        double[] doubleArray96 = bigMatrixImpl93.getRowAsDoubleArray(2);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl97 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray96);
        // The following exception was thrown during execution in test generation
        try {
            double double98 = realMatrixImpl97.getDeterminant();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.InvalidMatrixException; message: matrix is not square");
        } catch (org.apache.commons.math.linear.InvalidMatrixException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertNotNull(bigMatrixImpl44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray79), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray85), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 2 + "'", int90 == 2);
        org.junit.Assert.assertNotNull(bigMatrixImpl91);
        org.junit.Assert.assertNotNull(bigDecimal92);
        org.junit.Assert.assertNotNull(bigMatrixImpl93);
        org.junit.Assert.assertNotNull(bigMatrix94);
        org.junit.Assert.assertNotNull(doubleArray96);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray96), "[0.0, 0.0]");
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (short) 1, (int) 'a');
        boolean boolean3 = realMatrixImpl2.isSquare();
        boolean boolean4 = realMatrixImpl2.isSingular();
        java.lang.String str5 = realMatrixImpl2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix10 = realMatrixImpl2.getSubMatrix(0, 0, 35, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: invalid row or column index selection");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "RealMatrixImpl{{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0}}" + "'", str5, "RealMatrixImpl{{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0}}");
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl5 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl6 = realMatrixImpl2.add(realMatrixImpl5);
        double[] doubleArray8 = realMatrixImpl5.getColumn((int) (byte) 0);
        boolean boolean10 = realMatrixImpl5.equals((java.lang.Object) 6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = realMatrixImpl5.scalarAdd((double) 4);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = realMatrixImpl5.scalarAdd((double) (-1L));
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl17 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl21 = realMatrixImpl17.add(realMatrixImpl20);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl27 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl28 = realMatrixImpl24.add(realMatrixImpl27);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix32 = realMatrixImpl27.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl31);
        boolean boolean33 = realMatrixImpl27.isSquare();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl36 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl39 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix40 = realMatrixImpl36.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl39);
        int int41 = realMatrixImpl39.getRowDimension();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl42 = realMatrixImpl27.subtract(realMatrixImpl39);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl43 = realMatrixImpl20.subtract(realMatrixImpl42);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl46 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl49 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl50 = realMatrixImpl46.add(realMatrixImpl49);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl53 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix54 = realMatrixImpl49.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl53);
        org.apache.commons.math.linear.RealMatrix realMatrix55 = realMatrixImpl43.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl49);
        boolean boolean56 = realMatrixImpl43.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix58 = realMatrixImpl43.getRowMatrix(2);
        boolean boolean59 = realMatrixImpl43.isSquare();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl60 = realMatrixImpl5.multiply(realMatrixImpl43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Matrices are not multiplication compatible.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrixImpl6);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrixImpl21);
        org.junit.Assert.assertNotNull(realMatrixImpl28);
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(realMatrix40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
        org.junit.Assert.assertNotNull(realMatrixImpl42);
        org.junit.Assert.assertNotNull(realMatrixImpl43);
        org.junit.Assert.assertNotNull(realMatrixImpl50);
        org.junit.Assert.assertNotNull(realMatrix54);
        org.junit.Assert.assertNotNull(realMatrix55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(realMatrix58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl5 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix6 = realMatrixImpl2.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl5);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl5.getColumnMatrix((int) (short) 1);
        double[][] doubleArray9 = realMatrixImpl5.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl10 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray9);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray9);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        double[] doubleArray2 = new double[] { 1, (byte) 10 };
        double[] doubleArray5 = new double[] { 1, (byte) 10 };
        double[] doubleArray8 = new double[] { 1, (byte) 10 };
        double[] doubleArray11 = new double[] { 1, (byte) 10 };
        double[] doubleArray14 = new double[] { 1, (byte) 10 };
        double[] doubleArray17 = new double[] { 1, (byte) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        java.math.BigDecimal bigDecimal23 = bigMatrixImpl20.getEntry(0, (int) (short) 0);
        java.math.BigDecimal[][] bigDecimalArray24 = bigMatrixImpl20.getData();
        org.apache.commons.math.linear.BigMatrix bigMatrix26 = bigMatrixImpl20.getRowMatrix(1);
        java.math.BigDecimal[][] bigDecimalArray27 = bigMatrixImpl20.getData();
        bigMatrixImpl20.setRoundingMode(6);
        java.math.BigDecimal bigDecimal30 = null;
        java.math.BigDecimal[] bigDecimalArray31 = new java.math.BigDecimal[] { bigDecimal30 };
        java.math.BigDecimal bigDecimal32 = null;
        java.math.BigDecimal[] bigDecimalArray33 = new java.math.BigDecimal[] { bigDecimal32 };
        java.math.BigDecimal bigDecimal34 = null;
        java.math.BigDecimal[] bigDecimalArray35 = new java.math.BigDecimal[] { bigDecimal34 };
        java.math.BigDecimal bigDecimal36 = null;
        java.math.BigDecimal[] bigDecimalArray37 = new java.math.BigDecimal[] { bigDecimal36 };
        java.math.BigDecimal bigDecimal38 = null;
        java.math.BigDecimal[] bigDecimalArray39 = new java.math.BigDecimal[] { bigDecimal38 };
        java.math.BigDecimal[][] bigDecimalArray40 = new java.math.BigDecimal[][] { bigDecimalArray31, bigDecimalArray33, bigDecimalArray35, bigDecimalArray37, bigDecimalArray39 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl42 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray40, true);
        bigMatrixImpl42.setScale((int) (short) 0);
        bigMatrixImpl42.setRoundingMode(0);
        bigMatrixImpl42.setScale((int) '4');
        java.lang.String str49 = bigMatrixImpl42.toString();
        java.math.BigDecimal[] bigDecimalArray51 = bigMatrixImpl42.getRow(0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix52 = bigMatrixImpl20.preMultiply((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Matrices are not multiplication compatible.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertNotNull(bigDecimalArray24);
        org.junit.Assert.assertNotNull(bigMatrix26);
        org.junit.Assert.assertNotNull(bigDecimalArray27);
        org.junit.Assert.assertNotNull(bigDecimalArray31);
        org.junit.Assert.assertNotNull(bigDecimalArray33);
        org.junit.Assert.assertNotNull(bigDecimalArray35);
        org.junit.Assert.assertNotNull(bigDecimalArray37);
        org.junit.Assert.assertNotNull(bigDecimalArray39);
        org.junit.Assert.assertNotNull(bigDecimalArray40);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "BigMatrixImpl{{null},{null},{null},{null},{null}}" + "'", str49, "BigMatrixImpl{{null},{null},{null},{null},{null}}");
        org.junit.Assert.assertNotNull(bigDecimalArray51);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl5 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl6 = realMatrixImpl2.add(realMatrixImpl5);
        double[] doubleArray8 = realMatrixImpl5.getColumn((int) (byte) 0);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl9 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray8);
        double[][] doubleArray10 = realMatrixImpl9.getData();
        double[][] doubleArray11 = realMatrixImpl9.getDataRef();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl12 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray11);
        double[][] doubleArray13 = bigMatrixImpl12.getDataAsDoubleArray();
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = bigMatrixImpl12.getRowMatrix(6);
        org.junit.Assert.assertNotNull(realMatrixImpl6);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertNotNull(bigMatrix15);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl5 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl6 = realMatrixImpl2.add(realMatrixImpl5);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl9 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = realMatrixImpl9.add(realMatrixImpl12);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl14 = realMatrixImpl2.add(realMatrixImpl12);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = realMatrixImpl2.scalarAdd((double) (byte) 1);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl23 = realMatrixImpl19.add(realMatrixImpl22);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrixImpl22.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        boolean boolean28 = realMatrixImpl22.isSquare();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix35 = realMatrixImpl31.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl34);
        int int36 = realMatrixImpl34.getRowDimension();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl37 = realMatrixImpl22.subtract(realMatrixImpl34);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl38 = realMatrixImpl2.add(realMatrixImpl34);
        double[][] doubleArray39 = realMatrixImpl38.getData();
        double[][] doubleArray40 = realMatrixImpl38.getData();
        boolean boolean41 = realMatrixImpl38.isSingular();
        boolean boolean42 = realMatrixImpl38.isSingular();
        double double45 = realMatrixImpl38.getEntry(4, (int) (short) 0);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl48 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl51 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl52 = realMatrixImpl48.add(realMatrixImpl51);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl55 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix56 = realMatrixImpl51.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl55);
        int int57 = realMatrixImpl51.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix58 = realMatrixImpl51.transpose();
        double[][] doubleArray59 = realMatrixImpl51.getDataRef();
        // The following exception was thrown during execution in test generation
        try {
            realMatrixImpl38.setSubMatrix(doubleArray59, (int) '#', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: invalid row or column index selection");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrixImpl6);
        org.junit.Assert.assertNotNull(realMatrixImpl13);
        org.junit.Assert.assertNotNull(realMatrixImpl14);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrixImpl23);
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(realMatrix35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertNotNull(realMatrixImpl37);
        org.junit.Assert.assertNotNull(realMatrixImpl38);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertNotNull(realMatrixImpl52);
        org.junit.Assert.assertNotNull(realMatrix56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 35 + "'", int57 == 35);
        org.junit.Assert.assertNotNull(realMatrix58);
        org.junit.Assert.assertNotNull(doubleArray59);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl5 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl6 = realMatrixImpl2.add(realMatrixImpl5);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl9 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = realMatrixImpl9.add(realMatrixImpl12);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        boolean boolean18 = realMatrixImpl12.isSquare();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl21 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix25 = realMatrixImpl21.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl24);
        int int26 = realMatrixImpl24.getRowDimension();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl27 = realMatrixImpl12.subtract(realMatrixImpl24);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl28 = realMatrixImpl5.subtract(realMatrixImpl27);
        double[] doubleArray31 = new double[] { 1, (byte) 10 };
        double[] doubleArray34 = new double[] { 1, (byte) 10 };
        double[] doubleArray37 = new double[] { 1, (byte) 10 };
        double[] doubleArray40 = new double[] { 1, (byte) 10 };
        double[] doubleArray43 = new double[] { 1, (byte) 10 };
        double[] doubleArray46 = new double[] { 1, (byte) 10 };
        double[][] doubleArray47 = new double[][] { doubleArray31, doubleArray34, doubleArray37, doubleArray40, doubleArray43, doubleArray46 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl48 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray47);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl49 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray47);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl50 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray47);
        int int51 = bigMatrixImpl50.getRoundingMode();
        int int52 = bigMatrixImpl50.getScale();
        int int53 = bigMatrixImpl50.getScale();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl56 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl59 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl60 = realMatrixImpl56.add(realMatrixImpl59);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl63 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl66 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl67 = realMatrixImpl63.add(realMatrixImpl66);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl70 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl73 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl74 = realMatrixImpl70.add(realMatrixImpl73);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl75 = realMatrixImpl63.add(realMatrixImpl73);
        org.apache.commons.math.linear.RealMatrix realMatrix77 = realMatrixImpl63.scalarAdd((double) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix78 = realMatrixImpl60.add(realMatrix77);
        double[] doubleArray80 = realMatrixImpl60.getRow((int) (byte) 1);
        boolean boolean81 = bigMatrixImpl50.equals((java.lang.Object) doubleArray80);
        double[] doubleArray82 = realMatrixImpl28.operate(doubleArray80);
        org.apache.commons.math.linear.RealMatrix realMatrix83 = realMatrixImpl28.copy();
        org.junit.Assert.assertNotNull(realMatrixImpl6);
        org.junit.Assert.assertNotNull(realMatrixImpl13);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(realMatrix25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertNotNull(realMatrixImpl27);
        org.junit.Assert.assertNotNull(realMatrixImpl28);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 4 + "'", int51 == 4);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 64 + "'", int52 == 64);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 64 + "'", int53 == 64);
        org.junit.Assert.assertNotNull(realMatrixImpl60);
        org.junit.Assert.assertNotNull(realMatrixImpl67);
        org.junit.Assert.assertNotNull(realMatrixImpl74);
        org.junit.Assert.assertNotNull(realMatrixImpl75);
        org.junit.Assert.assertNotNull(realMatrix77);
        org.junit.Assert.assertNotNull(realMatrix78);
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(realMatrix83);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl5 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl6 = realMatrixImpl2.add(realMatrixImpl5);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl9 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix10 = realMatrixImpl5.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl9);
        boolean boolean11 = realMatrixImpl5.isSquare();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl14 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl17 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl14.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl17);
        int int19 = realMatrixImpl17.getRowDimension();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = realMatrixImpl5.subtract(realMatrixImpl17);
        double[][] doubleArray21 = realMatrixImpl17.getDataRef();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl22 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray21);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl23 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        double double24 = realMatrixImpl23.getNorm();
        boolean boolean25 = realMatrixImpl23.isSingular();
        org.junit.Assert.assertNotNull(realMatrixImpl6);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(realMatrixImpl20);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        double[] doubleArray2 = new double[] { 1, (byte) 10 };
        double[] doubleArray5 = new double[] { 1, (byte) 10 };
        double[] doubleArray8 = new double[] { 1, (byte) 10 };
        double[] doubleArray11 = new double[] { 1, (byte) 10 };
        double[] doubleArray14 = new double[] { 1, (byte) 10 };
        double[] doubleArray17 = new double[] { 1, (byte) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl21 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        java.math.BigDecimal[][] bigDecimalArray22 = bigMatrixImpl21.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl24 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray22, false);
        boolean boolean25 = bigMatrixImpl24.isSingular();
        org.apache.commons.math.linear.BigMatrix bigMatrix26 = bigMatrixImpl24.transpose();
        org.apache.commons.math.linear.BigMatrix bigMatrix27 = bigMatrixImpl24.transpose();
        java.math.BigDecimal bigDecimal28 = bigMatrixImpl24.getNorm();
        double[] doubleArray31 = new double[] { 1, (byte) 10 };
        double[] doubleArray34 = new double[] { 1, (byte) 10 };
        double[] doubleArray37 = new double[] { 1, (byte) 10 };
        double[] doubleArray40 = new double[] { 1, (byte) 10 };
        double[] doubleArray43 = new double[] { 1, (byte) 10 };
        double[] doubleArray46 = new double[] { 1, (byte) 10 };
        double[][] doubleArray47 = new double[][] { doubleArray31, doubleArray34, doubleArray37, doubleArray40, doubleArray43, doubleArray46 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl48 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray47);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl49 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray47);
        int int50 = bigMatrixImpl49.getScale();
        java.math.BigDecimal[] bigDecimalArray52 = bigMatrixImpl49.getRow((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal[] bigDecimalArray53 = bigMatrixImpl24.solve(bigDecimalArray52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: constant vector has wrong length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(bigDecimalArray22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(bigMatrix26);
        org.junit.Assert.assertNotNull(bigMatrix27);
        org.junit.Assert.assertNotNull(bigDecimal28);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 64 + "'", int50 == 64);
        org.junit.Assert.assertNotNull(bigDecimalArray52);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl5 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix6 = realMatrixImpl2.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl5);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl9 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = realMatrixImpl9.add(realMatrixImpl12);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        boolean boolean18 = realMatrixImpl5.equals((java.lang.Object) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix19 = realMatrixImpl5.copy();
        org.apache.commons.math.linear.RealMatrix realMatrix21 = realMatrixImpl5.scalarAdd((double) 97);
        boolean boolean22 = realMatrixImpl5.isSingular();
        // The following exception was thrown during execution in test generation
        try {
            double double23 = realMatrixImpl5.getDeterminant();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.InvalidMatrixException; message: matrix is not square");
        } catch (org.apache.commons.math.linear.InvalidMatrixException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrixImpl13);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        double[] doubleArray2 = new double[] { 1, (byte) 10 };
        double[] doubleArray5 = new double[] { 1, (byte) 10 };
        double[] doubleArray8 = new double[] { 1, (byte) 10 };
        double[] doubleArray11 = new double[] { 1, (byte) 10 };
        double[] doubleArray14 = new double[] { 1, (byte) 10 };
        double[] doubleArray17 = new double[] { 1, (byte) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl21 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        int int22 = bigMatrixImpl21.getRoundingMode();
        int int23 = bigMatrixImpl21.getScale();
        org.apache.commons.math.linear.BigMatrix bigMatrix24 = bigMatrixImpl21.transpose();
        double[] doubleArray26 = bigMatrixImpl21.getColumnAsDoubleArray(1);
        double[] doubleArray29 = new double[] { 1, (byte) 10 };
        double[] doubleArray32 = new double[] { 1, (byte) 10 };
        double[] doubleArray35 = new double[] { 1, (byte) 10 };
        double[] doubleArray38 = new double[] { 1, (byte) 10 };
        double[] doubleArray41 = new double[] { 1, (byte) 10 };
        double[] doubleArray44 = new double[] { 1, (byte) 10 };
        double[][] doubleArray45 = new double[][] { doubleArray29, doubleArray32, doubleArray35, doubleArray38, doubleArray41, doubleArray44 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl46 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray45);
        java.math.BigDecimal bigDecimal47 = bigMatrixImpl46.getNorm();
        java.math.BigDecimal[] bigDecimalArray48 = new java.math.BigDecimal[] { bigDecimal47 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl49 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray48);
        java.math.BigDecimal[] bigDecimalArray51 = bigMatrixImpl49.getRow(0);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl54 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl57 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix58 = realMatrixImpl54.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl57);
        org.apache.commons.math.linear.RealMatrix realMatrix60 = realMatrixImpl57.getColumnMatrix((int) (short) 1);
        boolean boolean61 = realMatrixImpl57.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix63 = realMatrixImpl57.getColumnMatrix((int) (byte) 10);
        boolean boolean64 = bigMatrixImpl49.equals((java.lang.Object) (byte) 10);
        double[] doubleArray67 = new double[] { 1, (byte) 10 };
        double[] doubleArray70 = new double[] { 1, (byte) 10 };
        double[] doubleArray73 = new double[] { 1, (byte) 10 };
        double[] doubleArray76 = new double[] { 1, (byte) 10 };
        double[] doubleArray79 = new double[] { 1, (byte) 10 };
        double[] doubleArray82 = new double[] { 1, (byte) 10 };
        double[][] doubleArray83 = new double[][] { doubleArray67, doubleArray70, doubleArray73, doubleArray76, doubleArray79, doubleArray82 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl84 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray83);
        java.math.BigDecimal bigDecimal85 = bigMatrixImpl84.getNorm();
        org.apache.commons.math.linear.BigMatrix bigMatrix86 = bigMatrixImpl49.scalarAdd(bigDecimal85);
        org.apache.commons.math.linear.BigMatrix bigMatrix87 = bigMatrixImpl21.scalarAdd(bigDecimal85);
        java.math.BigDecimal[][] bigDecimalArray88 = bigMatrixImpl21.getData();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 64 + "'", int23 == 64);
        org.junit.Assert.assertNotNull(bigMatrix24);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0, 10.0, 10.0, 10.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertNotNull(bigDecimal47);
        org.junit.Assert.assertNotNull(bigDecimalArray48);
        org.junit.Assert.assertNotNull(bigDecimalArray51);
        org.junit.Assert.assertNotNull(realMatrix58);
        org.junit.Assert.assertNotNull(realMatrix60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(realMatrix63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray79), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertNotNull(bigDecimal85);
        org.junit.Assert.assertNotNull(bigMatrix86);
        org.junit.Assert.assertNotNull(bigMatrix87);
        org.junit.Assert.assertNotNull(bigDecimalArray88);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl5 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl6 = realMatrixImpl2.add(realMatrixImpl5);
        boolean boolean7 = realMatrixImpl6.isSquare();
        int int8 = realMatrixImpl6.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl6.transpose();
        double[][] doubleArray10 = realMatrixImpl6.getDataRef();
        double double13 = realMatrixImpl6.getEntry(4, 0);
        org.junit.Assert.assertNotNull(realMatrixImpl6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        double[] doubleArray2 = new double[] { 1, (byte) 10 };
        double[] doubleArray5 = new double[] { 1, (byte) 10 };
        double[] doubleArray8 = new double[] { 1, (byte) 10 };
        double[] doubleArray11 = new double[] { 1, (byte) 10 };
        double[] doubleArray14 = new double[] { 1, (byte) 10 };
        double[] doubleArray17 = new double[] { 1, (byte) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        java.math.BigDecimal bigDecimal20 = bigMatrixImpl19.getNorm();
        java.math.BigDecimal[] bigDecimalArray21 = new java.math.BigDecimal[] { bigDecimal20 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl22 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray21);
        org.apache.commons.math.linear.BigMatrix bigMatrix23 = bigMatrixImpl22.copy();
        java.math.BigDecimal bigDecimal24 = bigMatrixImpl22.getNorm();
        boolean boolean25 = bigMatrixImpl22.isSquare();
        java.math.BigDecimal bigDecimal26 = bigMatrixImpl22.getDeterminant();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal29 = bigMatrixImpl22.getEntry(64, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: matrix entry does not exist");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(bigDecimal20);
        org.junit.Assert.assertNotNull(bigDecimalArray21);
        org.junit.Assert.assertNotNull(bigMatrix23);
        org.junit.Assert.assertNotNull(bigDecimal24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(bigDecimal26);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl5 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix6 = realMatrixImpl2.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl5);
        boolean boolean7 = realMatrixImpl2.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl2.scalarAdd((double) (byte) 1);
        int int10 = realMatrixImpl2.getRowDimension();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl13.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl23 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = realMatrixImpl20.add(realMatrixImpl23);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl27 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix28 = realMatrixImpl23.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl27);
        boolean boolean29 = realMatrixImpl16.equals((java.lang.Object) realMatrixImpl27);
        org.apache.commons.math.linear.RealMatrix realMatrix30 = realMatrixImpl16.copy();
        double double31 = realMatrixImpl16.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix32 = realMatrixImpl16.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix33 = realMatrixImpl2.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrixImpl24);
        org.junit.Assert.assertNotNull(realMatrix28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(realMatrix30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(realMatrix33);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        double[] doubleArray2 = new double[] { 1, (byte) 10 };
        double[] doubleArray5 = new double[] { 1, (byte) 10 };
        double[] doubleArray8 = new double[] { 1, (byte) 10 };
        double[] doubleArray11 = new double[] { 1, (byte) 10 };
        double[] doubleArray14 = new double[] { 1, (byte) 10 };
        double[] doubleArray17 = new double[] { 1, (byte) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        double[] doubleArray23 = new double[] { 1, (byte) 10 };
        double[] doubleArray26 = new double[] { 1, (byte) 10 };
        double[] doubleArray29 = new double[] { 1, (byte) 10 };
        double[] doubleArray32 = new double[] { 1, (byte) 10 };
        double[] doubleArray35 = new double[] { 1, (byte) 10 };
        double[] doubleArray38 = new double[] { 1, (byte) 10 };
        double[][] doubleArray39 = new double[][] { doubleArray23, doubleArray26, doubleArray29, doubleArray32, doubleArray35, doubleArray38 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl40 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray39);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl41 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray39);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl42 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray39);
        int int43 = bigMatrixImpl42.getColumnDimension();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl44 = bigMatrixImpl20.add(bigMatrixImpl42);
        java.math.BigDecimal bigDecimal45 = bigMatrixImpl42.getNorm();
        java.math.BigDecimal[][] bigDecimalArray46 = bigMatrixImpl42.getData();
        double double49 = bigMatrixImpl42.getEntryAsDouble(1, (int) (byte) 0);
        int int50 = bigMatrixImpl42.getColumnDimension();
        bigMatrixImpl42.setScale(2);
        org.apache.commons.math.linear.BigMatrix bigMatrix53 = bigMatrixImpl42.transpose();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertNotNull(bigMatrixImpl44);
        org.junit.Assert.assertNotNull(bigDecimal45);
        org.junit.Assert.assertNotNull(bigDecimalArray46);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 1.0d + "'", double49 == 1.0d);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 2 + "'", int50 == 2);
        org.junit.Assert.assertNotNull(bigMatrix53);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        double[] doubleArray2 = new double[] { 1, (byte) 10 };
        double[] doubleArray5 = new double[] { 1, (byte) 10 };
        double[] doubleArray8 = new double[] { 1, (byte) 10 };
        double[] doubleArray11 = new double[] { 1, (byte) 10 };
        double[] doubleArray14 = new double[] { 1, (byte) 10 };
        double[] doubleArray17 = new double[] { 1, (byte) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl21 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl22 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrix bigMatrix23 = bigMatrixImpl22.transpose();
        int int24 = bigMatrixImpl22.getRowDimension();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(bigMatrix23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl5 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl6 = realMatrixImpl2.add(realMatrixImpl5);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl9 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = realMatrixImpl9.add(realMatrixImpl12);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl14 = realMatrixImpl2.add(realMatrixImpl12);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = realMatrixImpl2.scalarAdd((double) (byte) 1);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl23 = realMatrixImpl19.add(realMatrixImpl22);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrixImpl22.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        boolean boolean28 = realMatrixImpl22.isSquare();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix35 = realMatrixImpl31.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl34);
        int int36 = realMatrixImpl34.getRowDimension();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl37 = realMatrixImpl22.subtract(realMatrixImpl34);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl38 = realMatrixImpl2.add(realMatrixImpl34);
        double[][] doubleArray39 = realMatrixImpl38.getData();
        double[][] doubleArray40 = realMatrixImpl38.getData();
        boolean boolean41 = realMatrixImpl38.isSingular();
        double[][] doubleArray42 = realMatrixImpl38.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl44 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray42, false);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl45 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray42);
        org.apache.commons.math.linear.RealMatrix realMatrix47 = realMatrixImpl45.getRowMatrix((int) (byte) 1);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl50 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl53 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix54 = realMatrixImpl50.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl53);
        org.apache.commons.math.linear.RealMatrix realMatrix56 = realMatrixImpl53.getColumnMatrix((int) (short) 1);
        boolean boolean57 = realMatrixImpl53.isSingular();
        int int58 = realMatrixImpl53.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix60 = realMatrixImpl53.scalarMultiply(0.0d);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl63 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl66 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix67 = realMatrixImpl63.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl66);
        org.apache.commons.math.linear.RealMatrix realMatrix69 = realMatrixImpl66.getColumnMatrix((int) (short) 1);
        boolean boolean70 = realMatrixImpl66.isSingular();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl73 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl76 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl77 = realMatrixImpl73.add(realMatrixImpl76);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl80 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl83 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl84 = realMatrixImpl80.add(realMatrixImpl83);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl85 = realMatrixImpl73.add(realMatrixImpl83);
        org.apache.commons.math.linear.RealMatrix realMatrix86 = realMatrixImpl66.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl83);
        org.apache.commons.math.linear.RealMatrix realMatrix87 = realMatrixImpl83.copy();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl88 = realMatrixImpl53.add(realMatrixImpl83);
        org.apache.commons.math.linear.RealMatrix realMatrix89 = realMatrixImpl45.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl53);
        org.junit.Assert.assertNotNull(realMatrixImpl6);
        org.junit.Assert.assertNotNull(realMatrixImpl13);
        org.junit.Assert.assertNotNull(realMatrixImpl14);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrixImpl23);
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(realMatrix35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertNotNull(realMatrixImpl37);
        org.junit.Assert.assertNotNull(realMatrixImpl38);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertNotNull(realMatrix47);
        org.junit.Assert.assertNotNull(realMatrix54);
        org.junit.Assert.assertNotNull(realMatrix56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 10 + "'", int58 == 10);
        org.junit.Assert.assertNotNull(realMatrix60);
        org.junit.Assert.assertNotNull(realMatrix67);
        org.junit.Assert.assertNotNull(realMatrix69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(realMatrixImpl77);
        org.junit.Assert.assertNotNull(realMatrixImpl84);
        org.junit.Assert.assertNotNull(realMatrixImpl85);
        org.junit.Assert.assertNotNull(realMatrix86);
        org.junit.Assert.assertNotNull(realMatrix87);
        org.junit.Assert.assertNotNull(realMatrixImpl88);
        org.junit.Assert.assertNotNull(realMatrix89);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(4, (int) (short) 10);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl5 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl6 = realMatrixImpl2.add(realMatrixImpl5);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl9 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = realMatrixImpl9.add(realMatrixImpl12);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl14 = realMatrixImpl2.add(realMatrixImpl12);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = realMatrixImpl12.scalarMultiply(1.0d);
        double[] doubleArray18 = realMatrixImpl12.getRow((int) (short) 1);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl21 = new org.apache.commons.math.linear.RealMatrixImpl(1, 64);
        double[] doubleArray23 = realMatrixImpl21.getColumn((int) (short) 10);
        double[][] doubleArray24 = realMatrixImpl21.getDataRef();
        // The following exception was thrown during execution in test generation
        try {
            realMatrixImpl12.setSubMatrix(doubleArray24, (int) (byte) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: invalid row or column index selection");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrixImpl6);
        org.junit.Assert.assertNotNull(realMatrixImpl13);
        org.junit.Assert.assertNotNull(realMatrixImpl14);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        double[] doubleArray2 = new double[] { 1, (byte) 10 };
        double[] doubleArray5 = new double[] { 1, (byte) 10 };
        double[] doubleArray8 = new double[] { 1, (byte) 10 };
        double[] doubleArray11 = new double[] { 1, (byte) 10 };
        double[] doubleArray14 = new double[] { 1, (byte) 10 };
        double[] doubleArray17 = new double[] { 1, (byte) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        java.math.BigDecimal bigDecimal23 = bigMatrixImpl20.getEntry(0, (int) (short) 0);
        java.math.BigDecimal[][] bigDecimalArray24 = bigMatrixImpl20.getData();
        org.apache.commons.math.linear.BigMatrix bigMatrix26 = bigMatrixImpl20.getRowMatrix(1);
        java.math.BigDecimal[][] bigDecimalArray27 = bigMatrixImpl20.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl29 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray27, true);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal30 = bigMatrixImpl29.getTrace();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: matrix is not square");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertNotNull(bigDecimalArray24);
        org.junit.Assert.assertNotNull(bigMatrix26);
        org.junit.Assert.assertNotNull(bigDecimalArray27);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        double[] doubleArray2 = new double[] { 1, (byte) 10 };
        double[] doubleArray5 = new double[] { 1, (byte) 10 };
        double[] doubleArray8 = new double[] { 1, (byte) 10 };
        double[] doubleArray11 = new double[] { 1, (byte) 10 };
        double[] doubleArray14 = new double[] { 1, (byte) 10 };
        double[] doubleArray17 = new double[] { 1, (byte) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        java.math.BigDecimal bigDecimal23 = bigMatrixImpl20.getEntry(0, (int) (short) 0);
        java.math.BigDecimal[][] bigDecimalArray24 = bigMatrixImpl20.getData();
        org.apache.commons.math.linear.BigMatrix bigMatrix26 = bigMatrixImpl20.getRowMatrix(1);
        java.math.BigDecimal[][] bigDecimalArray27 = bigMatrixImpl20.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl29 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray27, true);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl30 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray27);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl31 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray27);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertNotNull(bigDecimalArray24);
        org.junit.Assert.assertNotNull(bigMatrix26);
        org.junit.Assert.assertNotNull(bigDecimalArray27);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl5 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl6 = realMatrixImpl2.add(realMatrixImpl5);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl9 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = realMatrixImpl9.add(realMatrixImpl12);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl14 = realMatrixImpl2.add(realMatrixImpl12);
        double[] doubleArray16 = realMatrixImpl14.getColumn(10);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl23 = realMatrixImpl19.add(realMatrixImpl22);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl29 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl30 = realMatrixImpl26.add(realMatrixImpl29);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl29.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        boolean boolean35 = realMatrixImpl29.isSquare();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl38 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl41 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix42 = realMatrixImpl38.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl41);
        int int43 = realMatrixImpl41.getRowDimension();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl44 = realMatrixImpl29.subtract(realMatrixImpl41);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl45 = realMatrixImpl22.subtract(realMatrixImpl44);
        double[] doubleArray47 = realMatrixImpl22.getRow(0);
        boolean boolean48 = realMatrixImpl14.equals((java.lang.Object) 0);
        org.apache.commons.math.linear.RealMatrix realMatrix50 = realMatrixImpl14.scalarAdd(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix55 = realMatrixImpl14.getSubMatrix(97, (int) (byte) 10, 52, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: invalid row or column index selection");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrixImpl6);
        org.junit.Assert.assertNotNull(realMatrixImpl13);
        org.junit.Assert.assertNotNull(realMatrixImpl14);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(realMatrixImpl23);
        org.junit.Assert.assertNotNull(realMatrixImpl30);
        org.junit.Assert.assertNotNull(realMatrix34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(realMatrix42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 10 + "'", int43 == 10);
        org.junit.Assert.assertNotNull(realMatrixImpl44);
        org.junit.Assert.assertNotNull(realMatrixImpl45);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(realMatrix50);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        double[] doubleArray2 = new double[] { 1, (byte) 10 };
        double[] doubleArray5 = new double[] { 1, (byte) 10 };
        double[] doubleArray8 = new double[] { 1, (byte) 10 };
        double[] doubleArray11 = new double[] { 1, (byte) 10 };
        double[] doubleArray14 = new double[] { 1, (byte) 10 };
        double[] doubleArray17 = new double[] { 1, (byte) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        java.math.BigDecimal bigDecimal23 = bigMatrixImpl20.getEntry(0, (int) (short) 0);
        boolean boolean24 = bigMatrixImpl20.isSingular();
        bigMatrixImpl20.setScale(35);
        boolean boolean27 = bigMatrixImpl20.isSingular();
        java.math.BigDecimal[][] bigDecimalArray28 = bigMatrixImpl20.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl30 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray28, true);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl32 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray28, false);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(bigDecimalArray28);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        double[] doubleArray2 = new double[] { 1, (byte) 10 };
        double[] doubleArray5 = new double[] { 1, (byte) 10 };
        double[] doubleArray8 = new double[] { 1, (byte) 10 };
        double[] doubleArray11 = new double[] { 1, (byte) 10 };
        double[] doubleArray14 = new double[] { 1, (byte) 10 };
        double[] doubleArray17 = new double[] { 1, (byte) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl21 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        int int22 = bigMatrixImpl21.getRoundingMode();
        int int23 = bigMatrixImpl21.getScale();
        int int24 = bigMatrixImpl21.getScale();
        java.math.BigDecimal[][] bigDecimalArray25 = bigMatrixImpl21.getDataRef();
        bigMatrixImpl21.setRoundingMode((int) ' ');
        double[] doubleArray30 = new double[] { 1, (byte) 10 };
        double[] doubleArray33 = new double[] { 1, (byte) 10 };
        double[] doubleArray36 = new double[] { 1, (byte) 10 };
        double[] doubleArray39 = new double[] { 1, (byte) 10 };
        double[] doubleArray42 = new double[] { 1, (byte) 10 };
        double[] doubleArray45 = new double[] { 1, (byte) 10 };
        double[][] doubleArray46 = new double[][] { doubleArray30, doubleArray33, doubleArray36, doubleArray39, doubleArray42, doubleArray45 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl47 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray46);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl48 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray46);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl49 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray46);
        int int50 = bigMatrixImpl49.getScale();
        int int51 = bigMatrixImpl49.getRowDimension();
        java.math.BigDecimal[] bigDecimalArray53 = bigMatrixImpl49.getRow(2);
        org.apache.commons.math.linear.BigMatrix bigMatrix54 = bigMatrixImpl21.add((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl49);
        double[][] doubleArray55 = bigMatrixImpl21.getDataAsDoubleArray();
        double[][] doubleArray56 = bigMatrixImpl21.getDataAsDoubleArray();
        boolean boolean57 = bigMatrixImpl21.isSquare();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 64 + "'", int23 == 64);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 64 + "'", int24 == 64);
        org.junit.Assert.assertNotNull(bigDecimalArray25);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 64 + "'", int50 == 64);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 6 + "'", int51 == 6);
        org.junit.Assert.assertNotNull(bigDecimalArray53);
        org.junit.Assert.assertNotNull(bigMatrix54);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        double[] doubleArray2 = new double[] { 1, (byte) 10 };
        double[] doubleArray5 = new double[] { 1, (byte) 10 };
        double[] doubleArray8 = new double[] { 1, (byte) 10 };
        double[] doubleArray11 = new double[] { 1, (byte) 10 };
        double[] doubleArray14 = new double[] { 1, (byte) 10 };
        double[] doubleArray17 = new double[] { 1, (byte) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        boolean boolean21 = bigMatrixImpl20.isSquare();
        java.math.BigDecimal[][] bigDecimalArray22 = bigMatrixImpl20.getDataRef();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl23 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray22);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray25 = bigMatrixImpl23.getColumnAsDoubleArray((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: illegal column argument");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(bigDecimalArray22);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl5 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix6 = realMatrixImpl2.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl5);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl9 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = realMatrixImpl9.add(realMatrixImpl12);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        boolean boolean18 = realMatrixImpl5.equals((java.lang.Object) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl21 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl25 = realMatrixImpl21.add(realMatrixImpl24);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl28 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl32 = realMatrixImpl28.add(realMatrixImpl31);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = realMatrixImpl21.add(realMatrixImpl31);
        org.apache.commons.math.linear.RealMatrix realMatrix35 = realMatrixImpl21.scalarAdd((double) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix37 = realMatrixImpl21.getColumnMatrix((int) (short) 0);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl38 = realMatrixImpl16.subtract(realMatrixImpl21);
        double[] doubleArray40 = realMatrixImpl16.getColumn((int) (short) 10);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl41 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray40);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrixImpl13);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(realMatrixImpl25);
        org.junit.Assert.assertNotNull(realMatrixImpl32);
        org.junit.Assert.assertNotNull(realMatrixImpl33);
        org.junit.Assert.assertNotNull(realMatrix35);
        org.junit.Assert.assertNotNull(realMatrix37);
        org.junit.Assert.assertNotNull(realMatrixImpl38);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (short) 100, (int) (byte) 10);
        org.apache.commons.math.linear.RealMatrix realMatrix3 = realMatrixImpl2.copy();
        org.apache.commons.math.linear.RealMatrix realMatrix4 = realMatrixImpl2.transpose();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        boolean boolean8 = realMatrixImpl7.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = realMatrixImpl7.scalarMultiply((double) 1L);
        double double13 = realMatrixImpl7.getEntry(2, 0);
        int int14 = realMatrixImpl7.getColumnDimension();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix15 = realMatrixImpl2.solve((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect row dimension");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix3);
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        double[] doubleArray2 = new double[] { 1, (byte) 10 };
        double[] doubleArray5 = new double[] { 1, (byte) 10 };
        double[] doubleArray8 = new double[] { 1, (byte) 10 };
        double[] doubleArray11 = new double[] { 1, (byte) 10 };
        double[] doubleArray14 = new double[] { 1, (byte) 10 };
        double[] doubleArray17 = new double[] { 1, (byte) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl21 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        java.math.BigDecimal[][] bigDecimalArray22 = bigMatrixImpl21.getData();
        org.apache.commons.math.linear.BigMatrix bigMatrix24 = bigMatrixImpl21.getColumnMatrix((int) (short) 1);
        int int25 = bigMatrixImpl21.getColumnDimension();
        java.math.BigDecimal[][] bigDecimalArray26 = bigMatrixImpl21.getDataRef();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(bigDecimalArray22);
        org.junit.Assert.assertNotNull(bigMatrix24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertNotNull(bigDecimalArray26);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        double[] doubleArray2 = new double[] { 1, (byte) 10 };
        double[] doubleArray5 = new double[] { 1, (byte) 10 };
        double[] doubleArray8 = new double[] { 1, (byte) 10 };
        double[] doubleArray11 = new double[] { 1, (byte) 10 };
        double[] doubleArray14 = new double[] { 1, (byte) 10 };
        double[] doubleArray17 = new double[] { 1, (byte) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        int int21 = bigMatrixImpl20.getScale();
        java.math.BigDecimal[][] bigDecimalArray22 = bigMatrixImpl20.getData();
        org.apache.commons.math.linear.BigMatrix bigMatrix23 = bigMatrixImpl20.copy();
        int int24 = bigMatrixImpl20.getRowDimension();
        java.math.BigDecimal[][] bigDecimalArray25 = bigMatrixImpl20.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl26 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray25);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal[] bigDecimalArray28 = bigMatrixImpl26.getColumn((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: illegal column argument");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 64 + "'", int21 == 64);
        org.junit.Assert.assertNotNull(bigDecimalArray22);
        org.junit.Assert.assertNotNull(bigMatrix23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertNotNull(bigDecimalArray25);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        double[] doubleArray2 = new double[] { 1, (byte) 10 };
        double[] doubleArray5 = new double[] { 1, (byte) 10 };
        double[] doubleArray8 = new double[] { 1, (byte) 10 };
        double[] doubleArray11 = new double[] { 1, (byte) 10 };
        double[] doubleArray14 = new double[] { 1, (byte) 10 };
        double[] doubleArray17 = new double[] { 1, (byte) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        java.math.BigDecimal bigDecimal20 = bigMatrixImpl19.getNorm();
        java.math.BigDecimal[] bigDecimalArray21 = new java.math.BigDecimal[] { bigDecimal20 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl22 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray21);
        org.apache.commons.math.linear.BigMatrix bigMatrix23 = bigMatrixImpl22.copy();
        java.math.BigDecimal bigDecimal24 = bigMatrixImpl22.getTrace();
        java.math.BigDecimal[][] bigDecimalArray25 = bigMatrixImpl22.getDataRef();
        boolean boolean26 = bigMatrixImpl22.isSquare();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(bigDecimal20);
        org.junit.Assert.assertNotNull(bigDecimalArray21);
        org.junit.Assert.assertNotNull(bigMatrix23);
        org.junit.Assert.assertNotNull(bigDecimal24);
        org.junit.Assert.assertNotNull(bigDecimalArray25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl5 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl6 = realMatrixImpl2.add(realMatrixImpl5);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl9 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix10 = realMatrixImpl5.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl9);
        boolean boolean11 = realMatrixImpl5.isSquare();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl14 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl17 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl14.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl17);
        int int19 = realMatrixImpl17.getRowDimension();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = realMatrixImpl5.subtract(realMatrixImpl17);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl23 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrixImpl23.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl30 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = realMatrixImpl30.add(realMatrixImpl33);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl37 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix38 = realMatrixImpl33.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl37);
        boolean boolean39 = realMatrixImpl26.equals((java.lang.Object) realMatrixImpl37);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl40 = realMatrixImpl5.add(realMatrixImpl37);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl43 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl46 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix47 = realMatrixImpl43.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl46);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl50 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl53 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl54 = realMatrixImpl50.add(realMatrixImpl53);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl57 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix58 = realMatrixImpl53.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl57);
        boolean boolean59 = realMatrixImpl46.equals((java.lang.Object) realMatrixImpl57);
        boolean boolean60 = realMatrixImpl46.isSquare();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl61 = realMatrixImpl37.add(realMatrixImpl46);
        double[] doubleArray64 = new double[] { 1, (byte) 10 };
        double[] doubleArray67 = new double[] { 1, (byte) 10 };
        double[] doubleArray70 = new double[] { 1, (byte) 10 };
        double[] doubleArray73 = new double[] { 1, (byte) 10 };
        double[] doubleArray76 = new double[] { 1, (byte) 10 };
        double[] doubleArray79 = new double[] { 1, (byte) 10 };
        double[][] doubleArray80 = new double[][] { doubleArray64, doubleArray67, doubleArray70, doubleArray73, doubleArray76, doubleArray79 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl81 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray80);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl82 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray80);
        boolean boolean83 = realMatrixImpl61.equals((java.lang.Object) bigMatrixImpl82);
        double[][] doubleArray84 = realMatrixImpl61.getDataRef();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl85 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray84);
        org.apache.commons.math.linear.BigMatrix bigMatrix86 = bigMatrixImpl85.transpose();
        org.apache.commons.math.linear.BigMatrix bigMatrix88 = bigMatrixImpl85.getRowMatrix(0);
        org.junit.Assert.assertNotNull(realMatrixImpl6);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(realMatrixImpl20);
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertNotNull(realMatrixImpl34);
        org.junit.Assert.assertNotNull(realMatrix38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(realMatrixImpl40);
        org.junit.Assert.assertNotNull(realMatrix47);
        org.junit.Assert.assertNotNull(realMatrixImpl54);
        org.junit.Assert.assertNotNull(realMatrix58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(realMatrixImpl61);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray79), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertNotNull(bigMatrix86);
        org.junit.Assert.assertNotNull(bigMatrix88);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        java.math.BigDecimal bigDecimal0 = null;
        java.math.BigDecimal[] bigDecimalArray1 = new java.math.BigDecimal[] { bigDecimal0 };
        java.math.BigDecimal bigDecimal2 = null;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = null;
        java.math.BigDecimal[] bigDecimalArray5 = new java.math.BigDecimal[] { bigDecimal4 };
        java.math.BigDecimal bigDecimal6 = null;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = null;
        java.math.BigDecimal[] bigDecimalArray9 = new java.math.BigDecimal[] { bigDecimal8 };
        java.math.BigDecimal[][] bigDecimalArray10 = new java.math.BigDecimal[][] { bigDecimalArray1, bigDecimalArray3, bigDecimalArray5, bigDecimalArray7, bigDecimalArray9 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl12 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray10, true);
        bigMatrixImpl12.setScale((int) (short) 0);
        int int15 = bigMatrixImpl12.getRoundingMode();
        boolean boolean16 = bigMatrixImpl12.isSingular();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal19 = bigMatrixImpl12.getEntry((int) (byte) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: matrix entry does not exist");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimalArray1);
        org.junit.Assert.assertNotNull(bigDecimalArray3);
        org.junit.Assert.assertNotNull(bigDecimalArray5);
        org.junit.Assert.assertNotNull(bigDecimalArray7);
        org.junit.Assert.assertNotNull(bigDecimalArray9);
        org.junit.Assert.assertNotNull(bigDecimalArray10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        double[] doubleArray2 = new double[] { 1, (byte) 10 };
        double[] doubleArray5 = new double[] { 1, (byte) 10 };
        double[] doubleArray8 = new double[] { 1, (byte) 10 };
        double[] doubleArray11 = new double[] { 1, (byte) 10 };
        double[] doubleArray14 = new double[] { 1, (byte) 10 };
        double[] doubleArray17 = new double[] { 1, (byte) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        double[] doubleArray23 = new double[] { 1, (byte) 10 };
        double[] doubleArray26 = new double[] { 1, (byte) 10 };
        double[] doubleArray29 = new double[] { 1, (byte) 10 };
        double[] doubleArray32 = new double[] { 1, (byte) 10 };
        double[] doubleArray35 = new double[] { 1, (byte) 10 };
        double[] doubleArray38 = new double[] { 1, (byte) 10 };
        double[][] doubleArray39 = new double[][] { doubleArray23, doubleArray26, doubleArray29, doubleArray32, doubleArray35, doubleArray38 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl40 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray39);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl41 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray39);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl42 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray39);
        int int43 = bigMatrixImpl42.getColumnDimension();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl44 = bigMatrixImpl20.add(bigMatrixImpl42);
        java.math.BigDecimal bigDecimal45 = bigMatrixImpl42.getNorm();
        double[] doubleArray48 = new double[] { 1, (byte) 10 };
        double[] doubleArray51 = new double[] { 1, (byte) 10 };
        double[] doubleArray54 = new double[] { 1, (byte) 10 };
        double[] doubleArray57 = new double[] { 1, (byte) 10 };
        double[] doubleArray60 = new double[] { 1, (byte) 10 };
        double[] doubleArray63 = new double[] { 1, (byte) 10 };
        double[][] doubleArray64 = new double[][] { doubleArray48, doubleArray51, doubleArray54, doubleArray57, doubleArray60, doubleArray63 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl65 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray64);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl66 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray64);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl67 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray64);
        int int68 = bigMatrixImpl67.getColumnDimension();
        int int69 = bigMatrixImpl67.getScale();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl70 = bigMatrixImpl42.subtract(bigMatrixImpl67);
        bigMatrixImpl42.setRoundingMode((int) '#');
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertNotNull(bigMatrixImpl44);
        org.junit.Assert.assertNotNull(bigDecimal45);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 2 + "'", int68 == 2);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 64 + "'", int69 == 64);
        org.junit.Assert.assertNotNull(bigMatrixImpl70);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl5 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix6 = realMatrixImpl2.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl5);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl5.getColumnMatrix((int) (short) 1);
        boolean boolean9 = realMatrixImpl5.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = realMatrixImpl5.getColumnMatrix((int) (byte) 10);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = realMatrixImpl5.scalarMultiply((double) 'a');
        boolean boolean14 = realMatrixImpl5.isSingular();
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) '#', (int) ' ');
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) 'a', (int) (byte) 1);
        int int3 = bigMatrixImpl2.getColumnDimension();
        java.lang.String str4 = bigMatrixImpl2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "BigMatrixImpl{{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null}}" + "'", str4, "BigMatrixImpl{{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null}}");
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        double[] doubleArray2 = new double[] { 1, (byte) 10 };
        double[] doubleArray5 = new double[] { 1, (byte) 10 };
        double[] doubleArray8 = new double[] { 1, (byte) 10 };
        double[] doubleArray11 = new double[] { 1, (byte) 10 };
        double[] doubleArray14 = new double[] { 1, (byte) 10 };
        double[] doubleArray17 = new double[] { 1, (byte) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        java.math.BigDecimal bigDecimal23 = bigMatrixImpl20.getEntry(0, (int) (short) 0);
        java.math.BigDecimal[][] bigDecimalArray24 = bigMatrixImpl20.getData();
        double[] doubleArray27 = new double[] { 1, (byte) 10 };
        double[] doubleArray30 = new double[] { 1, (byte) 10 };
        double[] doubleArray33 = new double[] { 1, (byte) 10 };
        double[] doubleArray36 = new double[] { 1, (byte) 10 };
        double[] doubleArray39 = new double[] { 1, (byte) 10 };
        double[] doubleArray42 = new double[] { 1, (byte) 10 };
        double[][] doubleArray43 = new double[][] { doubleArray27, doubleArray30, doubleArray33, doubleArray36, doubleArray39, doubleArray42 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl44 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray43);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl45 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray43);
        java.math.BigDecimal bigDecimal48 = bigMatrixImpl45.getEntry(0, (int) (short) 0);
        org.apache.commons.math.linear.BigMatrix bigMatrix49 = bigMatrixImpl20.scalarMultiply(bigDecimal48);
        double[] doubleArray52 = new double[] { 1, (byte) 10 };
        double[] doubleArray55 = new double[] { 1, (byte) 10 };
        double[] doubleArray58 = new double[] { 1, (byte) 10 };
        double[] doubleArray61 = new double[] { 1, (byte) 10 };
        double[] doubleArray64 = new double[] { 1, (byte) 10 };
        double[] doubleArray67 = new double[] { 1, (byte) 10 };
        double[][] doubleArray68 = new double[][] { doubleArray52, doubleArray55, doubleArray58, doubleArray61, doubleArray64, doubleArray67 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl69 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray68);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl70 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray68);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl71 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray68);
        java.math.BigDecimal[][] bigDecimalArray72 = bigMatrixImpl71.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl74 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray72, false);
        boolean boolean75 = bigMatrixImpl74.isSingular();
        org.apache.commons.math.linear.BigMatrix bigMatrix76 = bigMatrixImpl74.copy();
        java.math.BigDecimal[] bigDecimalArray78 = bigMatrixImpl74.getColumn((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal[] bigDecimalArray79 = bigMatrixImpl20.operate(bigDecimalArray78);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: vector has wrong length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertNotNull(bigDecimalArray24);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertNotNull(bigDecimal48);
        org.junit.Assert.assertNotNull(bigMatrix49);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertNotNull(bigDecimalArray72);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(bigMatrix76);
        org.junit.Assert.assertNotNull(bigDecimalArray78);
    }
}

