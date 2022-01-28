import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix2 = bigMatrixImpl0.getColumnMatrix((int) (byte) 100);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl0 = new org.apache.commons.math.linear.RealMatrixImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double1 = realMatrixImpl0.getDeterminant();
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl(2, 97);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = bigMatrixImpl2.getRowAsDoubleArray((int) (byte) 0);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) 'a', (int) (byte) 1);
        org.apache.commons.math.linear.BigMatrix bigMatrix3 = bigMatrixImpl2.transpose();
        double[] doubleArray6 = new double[] { 1, (byte) 10 };
        double[] doubleArray9 = new double[] { 1, (byte) 10 };
        double[] doubleArray12 = new double[] { 1, (byte) 10 };
        double[] doubleArray15 = new double[] { 1, (byte) 10 };
        double[] doubleArray18 = new double[] { 1, (byte) 10 };
        double[] doubleArray21 = new double[] { 1, (byte) 10 };
        double[][] doubleArray22 = new double[][] { doubleArray6, doubleArray9, doubleArray12, doubleArray15, doubleArray18, doubleArray21 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl23 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray22);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl24 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray22);
        double[] doubleArray27 = new double[] { 1, (byte) 10 };
        double[] doubleArray30 = new double[] { 1, (byte) 10 };
        double[] doubleArray33 = new double[] { 1, (byte) 10 };
        double[] doubleArray36 = new double[] { 1, (byte) 10 };
        double[] doubleArray39 = new double[] { 1, (byte) 10 };
        double[] doubleArray42 = new double[] { 1, (byte) 10 };
        double[][] doubleArray43 = new double[][] { doubleArray27, doubleArray30, doubleArray33, doubleArray36, doubleArray39, doubleArray42 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl44 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray43);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl45 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray43);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl46 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray43);
        int int47 = bigMatrixImpl46.getColumnDimension();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl48 = bigMatrixImpl24.add(bigMatrixImpl46);
        java.math.BigDecimal bigDecimal49 = bigMatrixImpl46.getNorm();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix50 = bigMatrixImpl2.scalarMultiply(bigDecimal49);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        double[] doubleArray3 = new double[] { 1, (byte) 10 };
        double[] doubleArray6 = new double[] { 1, (byte) 10 };
        double[] doubleArray9 = new double[] { 1, (byte) 10 };
        double[] doubleArray12 = new double[] { 1, (byte) 10 };
        double[] doubleArray15 = new double[] { 1, (byte) 10 };
        double[] doubleArray18 = new double[] { 1, (byte) 10 };
        double[][] doubleArray19 = new double[][] { doubleArray3, doubleArray6, doubleArray9, doubleArray12, doubleArray15, doubleArray18 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray19);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl21 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray19);
        java.math.BigDecimal bigDecimal24 = bigMatrixImpl21.getEntry(0, (int) (short) 0);
        java.math.BigDecimal[][] bigDecimalArray25 = bigMatrixImpl21.getData();
        double[] doubleArray28 = new double[] { 1, (byte) 10 };
        double[] doubleArray31 = new double[] { 1, (byte) 10 };
        double[] doubleArray34 = new double[] { 1, (byte) 10 };
        double[] doubleArray37 = new double[] { 1, (byte) 10 };
        double[] doubleArray40 = new double[] { 1, (byte) 10 };
        double[] doubleArray43 = new double[] { 1, (byte) 10 };
        double[][] doubleArray44 = new double[][] { doubleArray28, doubleArray31, doubleArray34, doubleArray37, doubleArray40, doubleArray43 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl45 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray44);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl46 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray44);
        java.math.BigDecimal bigDecimal49 = bigMatrixImpl46.getEntry(0, (int) (short) 0);
        org.apache.commons.math.linear.BigMatrix bigMatrix50 = bigMatrixImpl21.scalarMultiply(bigDecimal49);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix51 = bigMatrixImpl0.scalarMultiply(bigDecimal49);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean1 = bigMatrixImpl0.isSquare();
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) '4', (int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix3 = bigMatrixImpl2.inverse();
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) '4', 5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray3 = bigMatrixImpl2.getDataAsDoubleArray();
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix1 = bigMatrixImpl0.transpose();
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) 'a', (int) (byte) 1);
        org.apache.commons.math.linear.BigMatrix bigMatrix3 = bigMatrixImpl2.copy();
        boolean boolean4 = bigMatrixImpl2.isSquare();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrix3 and bigMatrix3", bigMatrix3.equals(bigMatrix3) ? bigMatrix3.hashCode() == bigMatrix3.hashCode() : true);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
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
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = new org.apache.commons.math.linear.RealMatrixImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = realMatrixImpl2.subtract(realMatrixImpl19);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) 'a', (int) (byte) 1);
        org.apache.commons.math.linear.BigMatrix bigMatrix3 = bigMatrixImpl2.copy();
        double[] doubleArray6 = new double[] { 1, (byte) 10 };
        double[] doubleArray9 = new double[] { 1, (byte) 10 };
        double[] doubleArray12 = new double[] { 1, (byte) 10 };
        double[] doubleArray15 = new double[] { 1, (byte) 10 };
        double[] doubleArray18 = new double[] { 1, (byte) 10 };
        double[] doubleArray21 = new double[] { 1, (byte) 10 };
        double[][] doubleArray22 = new double[][] { doubleArray6, doubleArray9, doubleArray12, doubleArray15, doubleArray18, doubleArray21 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl23 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray22);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl24 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray22);
        int int25 = bigMatrixImpl24.getRowDimension();
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
        java.math.BigDecimal bigDecimal71 = bigMatrixImpl68.getNorm();
        java.math.BigDecimal bigDecimal72 = bigMatrixImpl68.getNorm();
        org.apache.commons.math.linear.BigMatrix bigMatrix73 = bigMatrixImpl24.scalarMultiply(bigDecimal72);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix74 = bigMatrixImpl2.scalarMultiply(bigDecimal72);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) 'a', (int) (byte) 1);
        int int3 = bigMatrixImpl2.getColumnDimension();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl6 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl9 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl10 = realMatrixImpl6.add(realMatrixImpl9);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = realMatrixImpl10.scalarMultiply((double) (byte) 0);
        boolean boolean13 = bigMatrixImpl2.equals((java.lang.Object) realMatrixImpl10);
        int int14 = realMatrixImpl10.getColumnDimension();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrixImpl2 and bigMatrixImpl2", bigMatrixImpl2.equals(bigMatrixImpl2) ? bigMatrixImpl2.hashCode() == bigMatrixImpl2.hashCode() : true);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) (short) 100, (int) (byte) 10);
        org.apache.commons.math.linear.BigMatrix bigMatrix3 = bigMatrixImpl2.transpose();
        int int4 = bigMatrixImpl2.getScale();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrix3 and bigMatrix3", bigMatrix3.equals(bigMatrix3) ? bigMatrix3.hashCode() == bigMatrix3.hashCode() : true);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) 'a', (int) (byte) 1);
        int int3 = bigMatrixImpl2.getColumnDimension();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl6 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl9 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl10 = realMatrixImpl6.add(realMatrixImpl9);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = realMatrixImpl10.scalarMultiply((double) (byte) 0);
        boolean boolean13 = bigMatrixImpl2.equals((java.lang.Object) realMatrixImpl10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal bigDecimal14 = bigMatrixImpl2.getNorm();
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl(2, 97);
        double[] doubleArray5 = new double[] { 1, (byte) 10 };
        double[] doubleArray8 = new double[] { 1, (byte) 10 };
        double[] doubleArray11 = new double[] { 1, (byte) 10 };
        double[] doubleArray14 = new double[] { 1, (byte) 10 };
        double[] doubleArray17 = new double[] { 1, (byte) 10 };
        double[] doubleArray20 = new double[] { 1, (byte) 10 };
        double[][] doubleArray21 = new double[][] { doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17, doubleArray20 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl22 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray21);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl23 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray21);
        java.math.BigDecimal bigDecimal26 = bigMatrixImpl23.getEntry(0, (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix27 = bigMatrixImpl2.scalarMultiply(bigDecimal26);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) (short) 100, (int) (byte) 10);
        org.apache.commons.math.linear.BigMatrix bigMatrix3 = bigMatrixImpl2.transpose();
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = bigMatrixImpl2.getRowMatrix(97);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrix3 and bigMatrix3", bigMatrix3.equals(bigMatrix3) ? bigMatrix3.hashCode() == bigMatrix3.hashCode() : true);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl0 = new org.apache.commons.math.linear.RealMatrixImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double3 = realMatrixImpl0.getEntry((int) 'a', (int) '4');
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) 'a', (int) (byte) 1);
        org.apache.commons.math.linear.BigMatrix bigMatrix3 = bigMatrixImpl2.transpose();
        bigMatrixImpl2.setRoundingMode((int) '4');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrix3 and bigMatrix3", bigMatrix3.equals(bigMatrix3) ? bigMatrix3.hashCode() == bigMatrix3.hashCode() : true);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl(2, 97);
        java.math.BigDecimal[][] bigDecimalArray3 = bigMatrixImpl2.getDataRef();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal bigDecimal4 = bigMatrixImpl2.getNorm();
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl6 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = realMatrixImpl3.add(realMatrixImpl6);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl10 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl14 = realMatrixImpl10.add(realMatrixImpl13);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl15 = realMatrixImpl3.add(realMatrixImpl13);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl3.scalarAdd((double) (byte) 1);
        double[] doubleArray19 = realMatrixImpl3.getColumn((int) (short) 10);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray19);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl21 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal[] bigDecimalArray22 = bigMatrixImpl0.operate(doubleArray19);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl0 = new org.apache.commons.math.linear.RealMatrixImpl();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl6 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = realMatrixImpl3.add(realMatrixImpl6);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl10 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl14 = realMatrixImpl10.add(realMatrixImpl13);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl17 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl13.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl17);
        boolean boolean19 = realMatrixImpl13.isSquare();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl25 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix26 = realMatrixImpl22.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl25);
        int int27 = realMatrixImpl25.getRowDimension();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl28 = realMatrixImpl13.subtract(realMatrixImpl25);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl29 = realMatrixImpl6.subtract(realMatrixImpl28);
        double[] doubleArray31 = realMatrixImpl6.getRow((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl32 = realMatrixImpl0.subtract(realMatrixImpl6);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal[][] bigDecimalArray1 = bigMatrixImpl0.getData();
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) 'a', (int) (byte) 1);
        int int3 = bigMatrixImpl2.getColumnDimension();
        double[] doubleArray6 = new double[] { 1, (byte) 10 };
        double[] doubleArray9 = new double[] { 1, (byte) 10 };
        double[] doubleArray12 = new double[] { 1, (byte) 10 };
        double[] doubleArray15 = new double[] { 1, (byte) 10 };
        double[] doubleArray18 = new double[] { 1, (byte) 10 };
        double[] doubleArray21 = new double[] { 1, (byte) 10 };
        double[][] doubleArray22 = new double[][] { doubleArray6, doubleArray9, doubleArray12, doubleArray15, doubleArray18, doubleArray21 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl23 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray22);
        java.math.BigDecimal bigDecimal24 = bigMatrixImpl23.getNorm();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix25 = bigMatrixImpl2.scalarAdd(bigDecimal24);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        double[] doubleArray2 = new double[] { 1, (byte) 10 };
        double[] doubleArray5 = new double[] { 1, (byte) 10 };
        double[] doubleArray8 = new double[] { 1, (byte) 10 };
        double[] doubleArray11 = new double[] { 1, (byte) 10 };
        double[] doubleArray14 = new double[] { 1, (byte) 10 };
        double[] doubleArray17 = new double[] { 1, (byte) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        int int20 = bigMatrixImpl19.getRoundingMode();
        boolean boolean21 = bigMatrixImpl19.isSquare();
        org.apache.commons.math.linear.BigMatrix bigMatrix22 = bigMatrixImpl19.transpose();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl25 = new org.apache.commons.math.linear.BigMatrixImpl(2, 97);
        java.math.BigDecimal[][] bigDecimalArray26 = bigMatrixImpl25.getDataRef();
        java.lang.String str27 = bigMatrixImpl25.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix28 = bigMatrixImpl19.multiply((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl25);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl(2, 97);
        java.math.BigDecimal[][] bigDecimalArray3 = bigMatrixImpl2.getDataRef();
        java.lang.String str4 = bigMatrixImpl2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray5 = bigMatrixImpl2.getDataAsDoubleArray();
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) '4', 5);
        java.math.BigDecimal[] bigDecimalArray4 = bigMatrixImpl2.getColumn(0);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl5 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray4);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrixImpl2 and bigMatrixImpl2", bigMatrixImpl2.equals(bigMatrixImpl2) ? bigMatrixImpl2.hashCode() == bigMatrixImpl2.hashCode() : true);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) 'a', (int) (byte) 1);
        int int3 = bigMatrixImpl2.getColumnDimension();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl6 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl9 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl10 = realMatrixImpl6.add(realMatrixImpl9);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = realMatrixImpl10.scalarMultiply((double) (byte) 0);
        boolean boolean13 = bigMatrixImpl2.equals((java.lang.Object) realMatrixImpl10);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = realMatrixImpl10.getColumnMatrix(2);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrixImpl2 and bigMatrixImpl2", bigMatrixImpl2.equals(bigMatrixImpl2) ? bigMatrixImpl2.hashCode() == bigMatrixImpl2.hashCode() : true);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) (short) 100, (int) (byte) 10);
        org.apache.commons.math.linear.BigMatrix bigMatrix3 = bigMatrixImpl2.transpose();
        java.math.BigDecimal[] bigDecimalArray5 = bigMatrixImpl2.getRow(1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrix3 and bigMatrix3", bigMatrix3.equals(bigMatrix3) ? bigMatrix3.hashCode() == bigMatrix3.hashCode() : true);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) (short) 100, (int) (byte) 10);
        double[] doubleArray5 = new double[] { 1, (byte) 10 };
        double[] doubleArray8 = new double[] { 1, (byte) 10 };
        double[] doubleArray11 = new double[] { 1, (byte) 10 };
        double[] doubleArray14 = new double[] { 1, (byte) 10 };
        double[] doubleArray17 = new double[] { 1, (byte) 10 };
        double[] doubleArray20 = new double[] { 1, (byte) 10 };
        double[][] doubleArray21 = new double[][] { doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17, doubleArray20 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl22 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray21);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl23 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray21);
        java.math.BigDecimal bigDecimal24 = bigMatrixImpl23.getNorm();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix25 = bigMatrixImpl2.scalarAdd(bigDecimal24);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) 'a', (int) (byte) 1);
        java.math.BigDecimal[][] bigDecimalArray3 = bigMatrixImpl2.getDataRef();
        bigMatrixImpl2.setScale((int) (byte) 0);
        double[] doubleArray8 = new double[] { 1, (byte) 10 };
        double[] doubleArray11 = new double[] { 1, (byte) 10 };
        double[] doubleArray14 = new double[] { 1, (byte) 10 };
        double[] doubleArray17 = new double[] { 1, (byte) 10 };
        double[] doubleArray20 = new double[] { 1, (byte) 10 };
        double[] doubleArray23 = new double[] { 1, (byte) 10 };
        double[][] doubleArray24 = new double[][] { doubleArray8, doubleArray11, doubleArray14, doubleArray17, doubleArray20, doubleArray23 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl25 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray24);
        java.math.BigDecimal bigDecimal26 = bigMatrixImpl25.getNorm();
        java.math.BigDecimal[] bigDecimalArray27 = new java.math.BigDecimal[] { bigDecimal26 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl28 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray27);
        org.apache.commons.math.linear.BigMatrix bigMatrix29 = bigMatrixImpl28.copy();
        java.math.BigDecimal bigDecimal30 = bigMatrixImpl28.getTrace();
        java.math.BigDecimal bigDecimal31 = bigMatrixImpl28.getNorm();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix32 = bigMatrixImpl2.scalarAdd(bigDecimal31);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl(35, (int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = bigMatrixImpl2.getRowAsDoubleArray((int) (short) 10);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray2 = bigMatrixImpl0.getRowAsDoubleArray((int) (short) 0);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl0 = new org.apache.commons.math.linear.RealMatrixImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.RealMatrix realMatrix2 = realMatrixImpl0.getColumnMatrix((int) (byte) 0);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) 'a', (int) (byte) 1);
        java.math.BigDecimal[][] bigDecimalArray3 = bigMatrixImpl2.getDataRef();
        double[] doubleArray6 = new double[] { 1, (byte) 10 };
        double[] doubleArray9 = new double[] { 1, (byte) 10 };
        double[] doubleArray12 = new double[] { 1, (byte) 10 };
        double[] doubleArray15 = new double[] { 1, (byte) 10 };
        double[] doubleArray18 = new double[] { 1, (byte) 10 };
        double[] doubleArray21 = new double[] { 1, (byte) 10 };
        double[][] doubleArray22 = new double[][] { doubleArray6, doubleArray9, doubleArray12, doubleArray15, doubleArray18, doubleArray21 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl23 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray22);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl24 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray22);
        java.math.BigDecimal bigDecimal27 = bigMatrixImpl24.getEntry(0, (int) (short) 0);
        bigMatrixImpl24.setRoundingMode((int) (short) -1);
        boolean boolean30 = bigMatrixImpl2.equals((java.lang.Object) bigMatrixImpl24);
        double[] doubleArray32 = bigMatrixImpl24.getColumnAsDoubleArray((int) (byte) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrixImpl2 and bigMatrixImpl2", bigMatrixImpl2.equals(bigMatrixImpl2) ? bigMatrixImpl2.hashCode() == bigMatrixImpl2.hashCode() : true);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) 'a', (int) (byte) 1);
        int int3 = bigMatrixImpl2.getColumnDimension();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl6 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl9 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl10 = realMatrixImpl6.add(realMatrixImpl9);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = realMatrixImpl10.scalarMultiply((double) (byte) 0);
        boolean boolean13 = bigMatrixImpl2.equals((java.lang.Object) realMatrixImpl10);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = realMatrixImpl10.transpose();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrixImpl2 and bigMatrixImpl2", bigMatrixImpl2.equals(bigMatrixImpl2) ? bigMatrixImpl2.hashCode() == bigMatrixImpl2.hashCode() : true);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl0 = new org.apache.commons.math.linear.RealMatrixImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.RealMatrix realMatrix1 = realMatrixImpl0.copy();
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
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
        int int27 = bigMatrixImpl26.getColumnDimension();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl30 = new org.apache.commons.math.linear.BigMatrixImpl((int) 'a', (int) (byte) 1);
        java.math.BigDecimal[][] bigDecimalArray31 = bigMatrixImpl30.getDataRef();
        double[] doubleArray34 = new double[] { 1, (byte) 10 };
        double[] doubleArray37 = new double[] { 1, (byte) 10 };
        double[] doubleArray40 = new double[] { 1, (byte) 10 };
        double[] doubleArray43 = new double[] { 1, (byte) 10 };
        double[] doubleArray46 = new double[] { 1, (byte) 10 };
        double[] doubleArray49 = new double[] { 1, (byte) 10 };
        double[][] doubleArray50 = new double[][] { doubleArray34, doubleArray37, doubleArray40, doubleArray43, doubleArray46, doubleArray49 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl51 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray50);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl52 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray50);
        java.math.BigDecimal bigDecimal55 = bigMatrixImpl52.getEntry(0, (int) (short) 0);
        bigMatrixImpl52.setRoundingMode((int) (short) -1);
        boolean boolean58 = bigMatrixImpl30.equals((java.lang.Object) bigMatrixImpl52);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl59 = bigMatrixImpl26.add(bigMatrixImpl52);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrixImpl30 and bigMatrixImpl30", bigMatrixImpl30.equals(bigMatrixImpl30) ? bigMatrixImpl30.hashCode() == bigMatrixImpl30.hashCode() : true);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) 'a', (int) (byte) 1);
        java.math.BigDecimal[][] bigDecimalArray3 = bigMatrixImpl2.getDataRef();
        double[] doubleArray6 = new double[] { 1, (byte) 10 };
        double[] doubleArray9 = new double[] { 1, (byte) 10 };
        double[] doubleArray12 = new double[] { 1, (byte) 10 };
        double[] doubleArray15 = new double[] { 1, (byte) 10 };
        double[] doubleArray18 = new double[] { 1, (byte) 10 };
        double[] doubleArray21 = new double[] { 1, (byte) 10 };
        double[][] doubleArray22 = new double[][] { doubleArray6, doubleArray9, doubleArray12, doubleArray15, doubleArray18, doubleArray21 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl23 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray22);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl24 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray22);
        java.math.BigDecimal bigDecimal27 = bigMatrixImpl24.getEntry(0, (int) (short) 0);
        bigMatrixImpl24.setRoundingMode((int) (short) -1);
        boolean boolean30 = bigMatrixImpl2.equals((java.lang.Object) bigMatrixImpl24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal bigDecimal31 = bigMatrixImpl2.getNorm();
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) '4', (int) '4');
        double[] doubleArray5 = new double[] { 1, (byte) 10 };
        double[] doubleArray8 = new double[] { 1, (byte) 10 };
        double[] doubleArray11 = new double[] { 1, (byte) 10 };
        double[] doubleArray14 = new double[] { 1, (byte) 10 };
        double[] doubleArray17 = new double[] { 1, (byte) 10 };
        double[] doubleArray20 = new double[] { 1, (byte) 10 };
        double[][] doubleArray21 = new double[][] { doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17, doubleArray20 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl22 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray21);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl23 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray21);
        java.math.BigDecimal bigDecimal26 = bigMatrixImpl23.getEntry(0, (int) (short) 0);
        boolean boolean27 = bigMatrixImpl23.isSingular();
        java.math.BigDecimal[][] bigDecimalArray28 = bigMatrixImpl23.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl29 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray28);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl31 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray28, true);
        bigMatrixImpl2.setSubMatrix(bigDecimalArray28, (int) (short) 0, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray36 = bigMatrixImpl2.getColumnAsDoubleArray(0);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) 'a', (int) (byte) 1);
        java.math.BigDecimal bigDecimal5 = bigMatrixImpl2.getEntry(1, (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = bigMatrixImpl2.getRowAsDoubleArray(4);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
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
        double[][] doubleArray21 = realMatrixImpl20.getDataRef();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl22 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray21);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl25 = new org.apache.commons.math.linear.BigMatrixImpl((int) (short) 1, (int) (short) 10);
        boolean boolean26 = bigMatrixImpl22.equals((java.lang.Object) (short) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrixImpl25 and bigMatrixImpl25", bigMatrixImpl25.equals(bigMatrixImpl25) ? bigMatrixImpl25.hashCode() == bigMatrixImpl25.hashCode() : true);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl(4, 10);
        double[] doubleArray5 = new double[] { 1, (byte) 10 };
        double[] doubleArray8 = new double[] { 1, (byte) 10 };
        double[] doubleArray11 = new double[] { 1, (byte) 10 };
        double[] doubleArray14 = new double[] { 1, (byte) 10 };
        double[] doubleArray17 = new double[] { 1, (byte) 10 };
        double[] doubleArray20 = new double[] { 1, (byte) 10 };
        double[][] doubleArray21 = new double[][] { doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17, doubleArray20 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl22 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray21);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl23 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray21);
        int int24 = bigMatrixImpl23.getRowDimension();
        bigMatrixImpl23.setRoundingMode(5);
        java.math.BigDecimal bigDecimal27 = bigMatrixImpl23.getNorm();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix28 = bigMatrixImpl2.scalarMultiply(bigDecimal27);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl(4, 10);
        double[] doubleArray5 = new double[] { 1, (byte) 10 };
        double[] doubleArray8 = new double[] { 1, (byte) 10 };
        double[] doubleArray11 = new double[] { 1, (byte) 10 };
        double[] doubleArray14 = new double[] { 1, (byte) 10 };
        double[] doubleArray17 = new double[] { 1, (byte) 10 };
        double[] doubleArray20 = new double[] { 1, (byte) 10 };
        double[][] doubleArray21 = new double[][] { doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17, doubleArray20 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl22 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray21);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl23 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray21);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl24 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray21);
        int int25 = bigMatrixImpl24.getRoundingMode();
        int int26 = bigMatrixImpl24.getScale();
        org.apache.commons.math.linear.BigMatrix bigMatrix27 = bigMatrixImpl24.transpose();
        double[] doubleArray29 = bigMatrixImpl24.getColumnAsDoubleArray(1);
        double[] doubleArray32 = new double[] { 1, (byte) 10 };
        double[] doubleArray35 = new double[] { 1, (byte) 10 };
        double[] doubleArray38 = new double[] { 1, (byte) 10 };
        double[] doubleArray41 = new double[] { 1, (byte) 10 };
        double[] doubleArray44 = new double[] { 1, (byte) 10 };
        double[] doubleArray47 = new double[] { 1, (byte) 10 };
        double[][] doubleArray48 = new double[][] { doubleArray32, doubleArray35, doubleArray38, doubleArray41, doubleArray44, doubleArray47 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl49 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray48);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl50 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray48);
        boolean boolean51 = bigMatrixImpl50.isSquare();
        java.math.BigDecimal[][] bigDecimalArray52 = bigMatrixImpl50.getDataRef();
        java.math.BigDecimal bigDecimal55 = bigMatrixImpl50.getEntry(1, (int) (short) 1);
        org.apache.commons.math.linear.BigMatrix bigMatrix56 = bigMatrixImpl24.scalarAdd(bigDecimal55);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix57 = bigMatrixImpl2.scalarMultiply(bigDecimal55);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl(35, 5);
        int int3 = bigMatrixImpl2.getRowDimension();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl6 = new org.apache.commons.math.linear.RealMatrixImpl(1, 64);
        double[] doubleArray8 = realMatrixImpl6.getColumn((int) (short) 10);
        boolean boolean9 = bigMatrixImpl2.equals((java.lang.Object) doubleArray8);
        double[] doubleArray12 = new double[] { 1, (byte) 10 };
        double[] doubleArray15 = new double[] { 1, (byte) 10 };
        double[] doubleArray18 = new double[] { 1, (byte) 10 };
        double[] doubleArray21 = new double[] { 1, (byte) 10 };
        double[] doubleArray24 = new double[] { 1, (byte) 10 };
        double[] doubleArray27 = new double[] { 1, (byte) 10 };
        double[][] doubleArray28 = new double[][] { doubleArray12, doubleArray15, doubleArray18, doubleArray21, doubleArray24, doubleArray27 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl29 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray28);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl30 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray28);
        java.math.BigDecimal bigDecimal33 = bigMatrixImpl30.getEntry(0, (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix34 = bigMatrixImpl2.scalarAdd(bigDecimal33);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
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
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl32 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray30, true);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl35 = new org.apache.commons.math.linear.BigMatrixImpl((int) 'a', (int) (byte) 1);
        int int36 = bigMatrixImpl35.getColumnDimension();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl39 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl42 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl43 = realMatrixImpl39.add(realMatrixImpl42);
        org.apache.commons.math.linear.RealMatrix realMatrix45 = realMatrixImpl43.scalarMultiply((double) (byte) 0);
        boolean boolean46 = bigMatrixImpl35.equals((java.lang.Object) realMatrixImpl43);
        int int47 = bigMatrixImpl35.getRowDimension();
        org.apache.commons.math.linear.BigMatrix bigMatrix48 = bigMatrixImpl35.transpose();
        boolean boolean49 = realMatrixImpl32.equals((java.lang.Object) bigMatrix48);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrixImpl35 and bigMatrixImpl35", bigMatrixImpl35.equals(bigMatrixImpl35) ? bigMatrixImpl35.hashCode() == bigMatrixImpl35.hashCode() : true);
    }
}

