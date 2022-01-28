import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test001");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector10 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector11 = openMapRealVector7.projection((org.apache.commons.math.linear.RealVector) openMapRealVector10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector17 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector18 = openMapRealVector14.projection((org.apache.commons.math.linear.RealVector) openMapRealVector17);
        double double19 = openMapRealVector10.dotProduct(openMapRealVector14);
        int int20 = openMapRealVector10.getMaxIndex();
        org.apache.commons.math.linear.RealVector realVector21 = openMapRealVector2.combineToSelf((double) (byte) -1, (double) '4', (org.apache.commons.math.linear.RealVector) openMapRealVector10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector24 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector27 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector28 = openMapRealVector24.projection((org.apache.commons.math.linear.RealVector) openMapRealVector27);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector31 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector34 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector35 = openMapRealVector31.projection((org.apache.commons.math.linear.RealVector) openMapRealVector34);
        double double36 = openMapRealVector27.dotProduct(openMapRealVector31);
        int int37 = openMapRealVector27.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector40 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean41 = openMapRealVector40.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector42 = openMapRealVector27.append((org.apache.commons.math.linear.RealVector) openMapRealVector40);
        double[] doubleArray47 = new double[] { 100.0d, (-1.0d), (-1.0f) };
        openMapRealVector42.setSubVector(99, doubleArray47);
        org.apache.commons.math.linear.RealVector realVector49 = openMapRealVector10.add(doubleArray47);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector7", openMapRealVector2.equals(openMapRealVector7) ? openMapRealVector2.hashCode() == openMapRealVector7.hashCode() : true);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector10 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector11 = openMapRealVector7.projection((org.apache.commons.math.linear.RealVector) openMapRealVector10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector17 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector18 = openMapRealVector14.projection((org.apache.commons.math.linear.RealVector) openMapRealVector17);
        double double19 = openMapRealVector10.dotProduct(openMapRealVector14);
        int int20 = openMapRealVector10.getMaxIndex();
        org.apache.commons.math.linear.RealVector realVector21 = openMapRealVector2.combineToSelf((double) (byte) -1, (double) '4', (org.apache.commons.math.linear.RealVector) openMapRealVector10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector24 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector27 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector28 = openMapRealVector24.projection((org.apache.commons.math.linear.RealVector) openMapRealVector27);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector31 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector34 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector35 = openMapRealVector31.projection((org.apache.commons.math.linear.RealVector) openMapRealVector34);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector38 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector41 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector42 = openMapRealVector38.projection((org.apache.commons.math.linear.RealVector) openMapRealVector41);
        double double43 = openMapRealVector34.dotProduct(openMapRealVector38);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor44 = openMapRealVector38.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector45 = openMapRealVector27.append((org.apache.commons.math.linear.RealVector) openMapRealVector38);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector47 = openMapRealVector38.append((double) 10);
        double double48 = openMapRealVector10.getDistance(openMapRealVector38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector7", openMapRealVector2.equals(openMapRealVector7) ? openMapRealVector2.hashCode() == openMapRealVector7.hashCode() : true);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector17 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector18 = openMapRealVector14.projection((org.apache.commons.math.linear.RealVector) openMapRealVector17);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector21 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector24 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector25 = openMapRealVector21.projection((org.apache.commons.math.linear.RealVector) openMapRealVector24);
        double double26 = openMapRealVector17.dotProduct(openMapRealVector21);
        int int27 = openMapRealVector17.getMaxIndex();
        org.apache.commons.math.linear.RealVector realVector28 = openMapRealVector9.combineToSelf((double) (byte) -1, (double) '4', (org.apache.commons.math.linear.RealVector) openMapRealVector17);
        org.apache.commons.math.linear.RealMatrix realMatrix29 = openMapRealVector2.outerProduct((org.apache.commons.math.linear.RealVector) openMapRealVector9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector5 and openMapRealVector9", openMapRealVector5.equals(openMapRealVector9) ? openMapRealVector5.hashCode() == openMapRealVector9.hashCode() : true);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector10 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector11 = openMapRealVector7.projection((org.apache.commons.math.linear.RealVector) openMapRealVector10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector17 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector18 = openMapRealVector14.projection((org.apache.commons.math.linear.RealVector) openMapRealVector17);
        double double19 = openMapRealVector10.dotProduct(openMapRealVector14);
        int int20 = openMapRealVector10.getMaxIndex();
        org.apache.commons.math.linear.RealVector realVector21 = openMapRealVector2.combineToSelf((double) (byte) -1, (double) '4', (org.apache.commons.math.linear.RealVector) openMapRealVector10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector24 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector27 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector28 = openMapRealVector24.projection((org.apache.commons.math.linear.RealVector) openMapRealVector27);
        int int29 = openMapRealVector24.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector31 = openMapRealVector24.mapAddToSelf((double) (byte) -1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector34 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector37 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector38 = openMapRealVector34.projection((org.apache.commons.math.linear.RealVector) openMapRealVector37);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor39 = openMapRealVector37.sparseIterator();
        org.apache.commons.math.linear.RealVector realVector40 = openMapRealVector31.projection((org.apache.commons.math.linear.RealVector) openMapRealVector37);
        org.apache.commons.math.linear.RealVector realVector42 = openMapRealVector31.mapMultiply(100.0d);
        org.apache.commons.math.linear.RealVector realVector43 = openMapRealVector2.add((org.apache.commons.math.linear.RealVector) openMapRealVector31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector7 and openMapRealVector2", openMapRealVector7.equals(openMapRealVector2) ? openMapRealVector7.hashCode() == openMapRealVector2.hashCode() : true);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector8 = openMapRealVector4.projection((org.apache.commons.math.linear.RealVector) openMapRealVector7);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector11 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector15 = openMapRealVector11.projection((org.apache.commons.math.linear.RealVector) openMapRealVector14);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector18 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector21 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector22 = openMapRealVector18.projection((org.apache.commons.math.linear.RealVector) openMapRealVector21);
        double double23 = openMapRealVector14.dotProduct(openMapRealVector18);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor24 = openMapRealVector18.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector25 = openMapRealVector7.append((org.apache.commons.math.linear.RealVector) openMapRealVector18);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector27 = openMapRealVector18.append((double) 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector30 = openMapRealVector27.getSubVector((int) 'a', (int) (byte) 1);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor31 = openMapRealVector30.iterator();
        double double32 = openMapRealVector1.getDistance(openMapRealVector30);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector35 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector38 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector39 = openMapRealVector35.projection((org.apache.commons.math.linear.RealVector) openMapRealVector38);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector42 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector45 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector46 = openMapRealVector42.projection((org.apache.commons.math.linear.RealVector) openMapRealVector45);
        double double47 = openMapRealVector38.dotProduct(openMapRealVector42);
        int int48 = openMapRealVector38.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector51 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean52 = openMapRealVector51.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector53 = openMapRealVector38.append((org.apache.commons.math.linear.RealVector) openMapRealVector51);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector57 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector60 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector61 = openMapRealVector57.projection((org.apache.commons.math.linear.RealVector) openMapRealVector60);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor62 = openMapRealVector60.sparseIterator();
        openMapRealVector51.setSubVector((int) (short) 0, (org.apache.commons.math.linear.RealVector) openMapRealVector60);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector64 = openMapRealVector1.append((org.apache.commons.math.linear.RealVector) openMapRealVector60);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector4 and openMapRealVector51", openMapRealVector4.equals(openMapRealVector51) ? openMapRealVector4.hashCode() == openMapRealVector51.hashCode() : true);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector12);
        double double14 = openMapRealVector5.dotProduct(openMapRealVector9);
        int int15 = openMapRealVector5.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector18 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean19 = openMapRealVector18.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = openMapRealVector5.append((org.apache.commons.math.linear.RealVector) openMapRealVector18);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector24 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector27 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector28 = openMapRealVector24.projection((org.apache.commons.math.linear.RealVector) openMapRealVector27);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor29 = openMapRealVector27.sparseIterator();
        openMapRealVector18.setSubVector((int) (short) 0, (org.apache.commons.math.linear.RealVector) openMapRealVector27);
        double double31 = openMapRealVector27.getLInfNorm();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector18", openMapRealVector2.equals(openMapRealVector18) ? openMapRealVector2.hashCode() == openMapRealVector18.hashCode() : true);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector10 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector11 = openMapRealVector7.projection((org.apache.commons.math.linear.RealVector) openMapRealVector10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector17 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector18 = openMapRealVector14.projection((org.apache.commons.math.linear.RealVector) openMapRealVector17);
        double double19 = openMapRealVector10.dotProduct(openMapRealVector14);
        int int20 = openMapRealVector10.getMaxIndex();
        org.apache.commons.math.linear.RealVector realVector21 = openMapRealVector2.combineToSelf((double) (byte) -1, (double) '4', (org.apache.commons.math.linear.RealVector) openMapRealVector10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector24 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector27 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector28 = openMapRealVector24.projection((org.apache.commons.math.linear.RealVector) openMapRealVector27);
        int int29 = openMapRealVector24.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector31 = openMapRealVector24.mapAddToSelf((double) (byte) -1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector34 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector37 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector38 = openMapRealVector34.projection((org.apache.commons.math.linear.RealVector) openMapRealVector37);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor39 = openMapRealVector37.sparseIterator();
        org.apache.commons.math.linear.RealVector realVector40 = openMapRealVector31.projection((org.apache.commons.math.linear.RealVector) openMapRealVector37);
        org.apache.commons.math.linear.RealVector realVector42 = openMapRealVector31.mapMultiply(100.0d);
        org.apache.commons.math.linear.RealVector realVector43 = openMapRealVector10.add((org.apache.commons.math.linear.RealVector) openMapRealVector31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector7", openMapRealVector2.equals(openMapRealVector7) ? openMapRealVector2.hashCode() == openMapRealVector7.hashCode() : true);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector12);
        double double14 = openMapRealVector5.dotProduct(openMapRealVector9);
        int int15 = openMapRealVector5.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector18 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean19 = openMapRealVector18.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = openMapRealVector5.append((org.apache.commons.math.linear.RealVector) openMapRealVector18);
        double[] doubleArray21 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector22 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray21);
        org.apache.commons.math.linear.RealVector realVector23 = openMapRealVector5.add(doubleArray21);
        java.lang.Class<?> wildcardClass24 = doubleArray21.getClass();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on realVector23 and openMapRealVector22.", realVector23.equals(openMapRealVector22) == openMapRealVector22.equals(realVector23));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector12);
        double double14 = openMapRealVector5.dotProduct(openMapRealVector9);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor15 = openMapRealVector9.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector24 = openMapRealVector20.projection((org.apache.commons.math.linear.RealVector) openMapRealVector23);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector27 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector30 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector31 = openMapRealVector27.projection((org.apache.commons.math.linear.RealVector) openMapRealVector30);
        double double32 = openMapRealVector23.dotProduct(openMapRealVector27);
        int int33 = openMapRealVector23.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector36 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean37 = openMapRealVector36.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector38 = openMapRealVector23.append((org.apache.commons.math.linear.RealVector) openMapRealVector36);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector41 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector44 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector45 = openMapRealVector41.projection((org.apache.commons.math.linear.RealVector) openMapRealVector44);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector48 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector51 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector52 = openMapRealVector48.projection((org.apache.commons.math.linear.RealVector) openMapRealVector51);
        double double53 = openMapRealVector44.dotProduct(openMapRealVector48);
        int int54 = openMapRealVector44.getMaxIndex();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor55 = openMapRealVector44.sparseIterator();
        double double56 = openMapRealVector23.dotProduct((org.apache.commons.math.linear.RealVector) openMapRealVector44);
        org.apache.commons.math.linear.RealVector realVector57 = openMapRealVector9.combineToSelf(1.0d, (double) 100.0f, (org.apache.commons.math.linear.RealVector) openMapRealVector44);
        double[] doubleArray58 = openMapRealVector9.getData();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector9", openMapRealVector2.equals(openMapRealVector9) ? openMapRealVector2.hashCode() == openMapRealVector9.hashCode() : true);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector12);
        double double14 = openMapRealVector5.dotProduct(openMapRealVector9);
        int int15 = openMapRealVector5.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector18 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean19 = openMapRealVector18.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = openMapRealVector5.append((org.apache.commons.math.linear.RealVector) openMapRealVector18);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector24 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector27 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector28 = openMapRealVector24.projection((org.apache.commons.math.linear.RealVector) openMapRealVector27);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor29 = openMapRealVector27.sparseIterator();
        openMapRealVector18.setSubVector((int) (short) 0, (org.apache.commons.math.linear.RealVector) openMapRealVector27);
        double[] doubleArray31 = openMapRealVector18.toArray();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector33 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray31, (double) (-1L));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector18", openMapRealVector2.equals(openMapRealVector18) ? openMapRealVector2.hashCode() == openMapRealVector18.hashCode() : true);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector10 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector11 = openMapRealVector7.projection((org.apache.commons.math.linear.RealVector) openMapRealVector10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector17 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector18 = openMapRealVector14.projection((org.apache.commons.math.linear.RealVector) openMapRealVector17);
        double double19 = openMapRealVector10.dotProduct(openMapRealVector14);
        int int20 = openMapRealVector10.getMaxIndex();
        org.apache.commons.math.linear.RealVector realVector21 = openMapRealVector2.combineToSelf((double) (byte) -1, (double) '4', (org.apache.commons.math.linear.RealVector) openMapRealVector10);
        openMapRealVector10.set((double) (byte) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector7", openMapRealVector2.equals(openMapRealVector7) ? openMapRealVector2.hashCode() == openMapRealVector7.hashCode() : true);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector12);
        double double14 = openMapRealVector5.dotProduct(openMapRealVector9);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor15 = openMapRealVector9.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector24 = openMapRealVector20.projection((org.apache.commons.math.linear.RealVector) openMapRealVector23);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector27 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector30 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector31 = openMapRealVector27.projection((org.apache.commons.math.linear.RealVector) openMapRealVector30);
        double double32 = openMapRealVector23.dotProduct(openMapRealVector27);
        int int33 = openMapRealVector23.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector36 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean37 = openMapRealVector36.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector38 = openMapRealVector23.append((org.apache.commons.math.linear.RealVector) openMapRealVector36);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector41 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector44 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector45 = openMapRealVector41.projection((org.apache.commons.math.linear.RealVector) openMapRealVector44);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector48 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector51 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector52 = openMapRealVector48.projection((org.apache.commons.math.linear.RealVector) openMapRealVector51);
        double double53 = openMapRealVector44.dotProduct(openMapRealVector48);
        int int54 = openMapRealVector44.getMaxIndex();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor55 = openMapRealVector44.sparseIterator();
        double double56 = openMapRealVector23.dotProduct((org.apache.commons.math.linear.RealVector) openMapRealVector44);
        org.apache.commons.math.linear.RealVector realVector57 = openMapRealVector9.combineToSelf(1.0d, (double) 100.0f, (org.apache.commons.math.linear.RealVector) openMapRealVector44);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector60 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector63 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector64 = openMapRealVector60.projection((org.apache.commons.math.linear.RealVector) openMapRealVector63);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector67 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector70 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector71 = openMapRealVector67.projection((org.apache.commons.math.linear.RealVector) openMapRealVector70);
        double double72 = openMapRealVector63.dotProduct(openMapRealVector67);
        int int73 = openMapRealVector63.getMaxIndex();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor74 = openMapRealVector63.sparseIterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector77 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector80 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector81 = openMapRealVector77.projection((org.apache.commons.math.linear.RealVector) openMapRealVector80);
        int int82 = openMapRealVector77.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector84 = openMapRealVector77.mapAddToSelf((double) (byte) -1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector87 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector90 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector91 = openMapRealVector87.projection((org.apache.commons.math.linear.RealVector) openMapRealVector90);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor92 = openMapRealVector90.sparseIterator();
        org.apache.commons.math.linear.RealVector realVector93 = openMapRealVector84.projection((org.apache.commons.math.linear.RealVector) openMapRealVector90);
        org.apache.commons.math.linear.RealVector realVector94 = openMapRealVector63.add((org.apache.commons.math.linear.RealVector) openMapRealVector84);
        int int95 = openMapRealVector63.getDimension();
        double double96 = openMapRealVector63.getMinValue();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector97 = openMapRealVector44.ebeDivide((org.apache.commons.math.linear.RealVector) openMapRealVector63);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector9", openMapRealVector2.equals(openMapRealVector9) ? openMapRealVector2.hashCode() == openMapRealVector9.hashCode() : true);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector12);
        double double14 = openMapRealVector5.dotProduct(openMapRealVector9);
        int int15 = openMapRealVector5.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector18 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean19 = openMapRealVector18.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = openMapRealVector5.append((org.apache.commons.math.linear.RealVector) openMapRealVector18);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector24 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector27 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector28 = openMapRealVector24.projection((org.apache.commons.math.linear.RealVector) openMapRealVector27);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor29 = openMapRealVector27.sparseIterator();
        openMapRealVector18.setSubVector((int) (short) 0, (org.apache.commons.math.linear.RealVector) openMapRealVector27);
        org.apache.commons.math.linear.RealVector realVector32 = openMapRealVector27.mapDivide((double) ' ');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector18", openMapRealVector2.equals(openMapRealVector18) ? openMapRealVector2.hashCode() == openMapRealVector18.hashCode() : true);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector12);
        double double14 = openMapRealVector5.dotProduct(openMapRealVector9);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor15 = openMapRealVector9.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector24 = openMapRealVector20.projection((org.apache.commons.math.linear.RealVector) openMapRealVector23);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector27 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector30 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector31 = openMapRealVector27.projection((org.apache.commons.math.linear.RealVector) openMapRealVector30);
        double double32 = openMapRealVector23.dotProduct(openMapRealVector27);
        int int33 = openMapRealVector23.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector36 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean37 = openMapRealVector36.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector38 = openMapRealVector23.append((org.apache.commons.math.linear.RealVector) openMapRealVector36);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector41 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector44 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector45 = openMapRealVector41.projection((org.apache.commons.math.linear.RealVector) openMapRealVector44);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector48 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector51 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector52 = openMapRealVector48.projection((org.apache.commons.math.linear.RealVector) openMapRealVector51);
        double double53 = openMapRealVector44.dotProduct(openMapRealVector48);
        int int54 = openMapRealVector44.getMaxIndex();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor55 = openMapRealVector44.sparseIterator();
        double double56 = openMapRealVector23.dotProduct((org.apache.commons.math.linear.RealVector) openMapRealVector44);
        org.apache.commons.math.linear.RealVector realVector57 = openMapRealVector9.combineToSelf(1.0d, (double) 100.0f, (org.apache.commons.math.linear.RealVector) openMapRealVector44);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector58 = new org.apache.commons.math.linear.OpenMapRealVector(openMapRealVector44);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector9", openMapRealVector2.equals(openMapRealVector9) ? openMapRealVector2.hashCode() == openMapRealVector9.hashCode() : true);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector12);
        double double14 = openMapRealVector5.dotProduct(openMapRealVector9);
        int int15 = openMapRealVector5.getMaxIndex();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor16 = openMapRealVector5.sparseIterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector22 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector23 = openMapRealVector19.projection((org.apache.commons.math.linear.RealVector) openMapRealVector22);
        int int24 = openMapRealVector19.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = openMapRealVector19.mapAddToSelf((double) (byte) -1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector29 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector32 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector33 = openMapRealVector29.projection((org.apache.commons.math.linear.RealVector) openMapRealVector32);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor34 = openMapRealVector32.sparseIterator();
        org.apache.commons.math.linear.RealVector realVector35 = openMapRealVector26.projection((org.apache.commons.math.linear.RealVector) openMapRealVector32);
        org.apache.commons.math.linear.RealVector realVector36 = openMapRealVector5.add((org.apache.commons.math.linear.RealVector) openMapRealVector26);
        int int37 = openMapRealVector5.getDimension();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector40 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector43 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector44 = openMapRealVector40.projection((org.apache.commons.math.linear.RealVector) openMapRealVector43);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector47 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector50 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector51 = openMapRealVector47.projection((org.apache.commons.math.linear.RealVector) openMapRealVector50);
        double double52 = openMapRealVector43.dotProduct(openMapRealVector47);
        int int53 = openMapRealVector43.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector56 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean57 = openMapRealVector56.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector58 = openMapRealVector43.append((org.apache.commons.math.linear.RealVector) openMapRealVector56);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector62 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector65 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector66 = openMapRealVector62.projection((org.apache.commons.math.linear.RealVector) openMapRealVector65);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor67 = openMapRealVector65.sparseIterator();
        openMapRealVector56.setSubVector((int) (short) 0, (org.apache.commons.math.linear.RealVector) openMapRealVector65);
        double[] doubleArray69 = openMapRealVector56.toArray();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector70 = openMapRealVector5.ebeDivide(doubleArray69);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector56", openMapRealVector2.equals(openMapRealVector56) ? openMapRealVector2.hashCode() == openMapRealVector56.hashCode() : true);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector12);
        double double14 = openMapRealVector5.dotProduct(openMapRealVector9);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor15 = openMapRealVector9.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector24 = openMapRealVector20.projection((org.apache.commons.math.linear.RealVector) openMapRealVector23);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector27 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector30 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector31 = openMapRealVector27.projection((org.apache.commons.math.linear.RealVector) openMapRealVector30);
        double double32 = openMapRealVector23.dotProduct(openMapRealVector27);
        int int33 = openMapRealVector23.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector36 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean37 = openMapRealVector36.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector38 = openMapRealVector23.append((org.apache.commons.math.linear.RealVector) openMapRealVector36);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector41 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector44 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector45 = openMapRealVector41.projection((org.apache.commons.math.linear.RealVector) openMapRealVector44);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector48 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector51 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector52 = openMapRealVector48.projection((org.apache.commons.math.linear.RealVector) openMapRealVector51);
        double double53 = openMapRealVector44.dotProduct(openMapRealVector48);
        int int54 = openMapRealVector44.getMaxIndex();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor55 = openMapRealVector44.sparseIterator();
        double double56 = openMapRealVector23.dotProduct((org.apache.commons.math.linear.RealVector) openMapRealVector44);
        org.apache.commons.math.linear.RealVector realVector57 = openMapRealVector9.combineToSelf(1.0d, (double) 100.0f, (org.apache.commons.math.linear.RealVector) openMapRealVector44);
        org.apache.commons.math.linear.RealVector realVector59 = openMapRealVector44.mapSubtract(1.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector9", openMapRealVector2.equals(openMapRealVector9) ? openMapRealVector2.hashCode() == openMapRealVector9.hashCode() : true);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector10 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector11 = openMapRealVector7.projection((org.apache.commons.math.linear.RealVector) openMapRealVector10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector17 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector18 = openMapRealVector14.projection((org.apache.commons.math.linear.RealVector) openMapRealVector17);
        double double19 = openMapRealVector10.dotProduct(openMapRealVector14);
        int int20 = openMapRealVector10.getMaxIndex();
        org.apache.commons.math.linear.RealVector realVector21 = openMapRealVector2.combineToSelf((double) (byte) -1, (double) '4', (org.apache.commons.math.linear.RealVector) openMapRealVector10);
        java.lang.Double[] doubleArray24 = new java.lang.Double[] { 100.0d, 1.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray24, (double) (byte) 1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector28 = openMapRealVector26.mapAdd((-1.0d));
        org.apache.commons.math.linear.RealMatrix realMatrix29 = openMapRealVector10.outerProduct((org.apache.commons.math.linear.RealVector) openMapRealVector28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector7", openMapRealVector2.equals(openMapRealVector7) ? openMapRealVector2.hashCode() == openMapRealVector7.hashCode() : true);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 100);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector8 = openMapRealVector4.projection((org.apache.commons.math.linear.RealVector) openMapRealVector7);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector11 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector15 = openMapRealVector11.projection((org.apache.commons.math.linear.RealVector) openMapRealVector14);
        double double16 = openMapRealVector7.dotProduct(openMapRealVector11);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor17 = openMapRealVector11.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector22 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector25 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector26 = openMapRealVector22.projection((org.apache.commons.math.linear.RealVector) openMapRealVector25);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector29 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector32 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector33 = openMapRealVector29.projection((org.apache.commons.math.linear.RealVector) openMapRealVector32);
        double double34 = openMapRealVector25.dotProduct(openMapRealVector29);
        int int35 = openMapRealVector25.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector38 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean39 = openMapRealVector38.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector40 = openMapRealVector25.append((org.apache.commons.math.linear.RealVector) openMapRealVector38);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector43 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector46 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector47 = openMapRealVector43.projection((org.apache.commons.math.linear.RealVector) openMapRealVector46);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector50 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector53 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector54 = openMapRealVector50.projection((org.apache.commons.math.linear.RealVector) openMapRealVector53);
        double double55 = openMapRealVector46.dotProduct(openMapRealVector50);
        int int56 = openMapRealVector46.getMaxIndex();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor57 = openMapRealVector46.sparseIterator();
        double double58 = openMapRealVector25.dotProduct((org.apache.commons.math.linear.RealVector) openMapRealVector46);
        org.apache.commons.math.linear.RealVector realVector59 = openMapRealVector11.combineToSelf(1.0d, (double) 100.0f, (org.apache.commons.math.linear.RealVector) openMapRealVector46);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector60 = openMapRealVector1.add(openMapRealVector46);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector4 and openMapRealVector11", openMapRealVector4.equals(openMapRealVector11) ? openMapRealVector4.hashCode() == openMapRealVector11.hashCode() : true);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector12);
        double double14 = openMapRealVector5.dotProduct(openMapRealVector9);
        int int15 = openMapRealVector5.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector18 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean19 = openMapRealVector18.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = openMapRealVector5.append((org.apache.commons.math.linear.RealVector) openMapRealVector18);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector24 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector27 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector28 = openMapRealVector24.projection((org.apache.commons.math.linear.RealVector) openMapRealVector27);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor29 = openMapRealVector27.sparseIterator();
        openMapRealVector18.setSubVector((int) (short) 0, (org.apache.commons.math.linear.RealVector) openMapRealVector27);
        org.apache.commons.math.linear.RealVector realVector32 = openMapRealVector27.mapMultiply(Double.NaN);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector18", openMapRealVector2.equals(openMapRealVector18) ? openMapRealVector2.hashCode() == openMapRealVector18.hashCode() : true);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector12);
        double double14 = openMapRealVector5.dotProduct(openMapRealVector9);
        int int15 = openMapRealVector5.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector18 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean19 = openMapRealVector18.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = openMapRealVector5.append((org.apache.commons.math.linear.RealVector) openMapRealVector18);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector24 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector27 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector28 = openMapRealVector24.projection((org.apache.commons.math.linear.RealVector) openMapRealVector27);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor29 = openMapRealVector27.sparseIterator();
        openMapRealVector18.setSubVector((int) (short) 0, (org.apache.commons.math.linear.RealVector) openMapRealVector27);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector35 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector38 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector39 = openMapRealVector35.projection((org.apache.commons.math.linear.RealVector) openMapRealVector38);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector42 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector45 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector46 = openMapRealVector42.projection((org.apache.commons.math.linear.RealVector) openMapRealVector45);
        double double47 = openMapRealVector38.dotProduct(openMapRealVector42);
        int int48 = openMapRealVector38.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector51 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean52 = openMapRealVector51.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector53 = openMapRealVector38.append((org.apache.commons.math.linear.RealVector) openMapRealVector51);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector56 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector59 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector60 = openMapRealVector56.projection((org.apache.commons.math.linear.RealVector) openMapRealVector59);
        double[] doubleArray61 = openMapRealVector59.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix62 = openMapRealVector53.outerProduct(doubleArray61);
        org.apache.commons.math.linear.RealVector realVector63 = openMapRealVector27.combineToSelf((double) 0, (double) (-1L), doubleArray61);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector18", openMapRealVector2.equals(openMapRealVector18) ? openMapRealVector2.hashCode() == openMapRealVector18.hashCode() : true);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector12);
        double double14 = openMapRealVector5.dotProduct(openMapRealVector9);
        int int15 = openMapRealVector5.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector18 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean19 = openMapRealVector18.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = openMapRealVector5.append((org.apache.commons.math.linear.RealVector) openMapRealVector18);
        double[] doubleArray21 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector22 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray21);
        org.apache.commons.math.linear.RealVector realVector23 = openMapRealVector5.add(doubleArray21);
        java.lang.Class<?> wildcardClass24 = openMapRealVector5.getClass();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on realVector23 and openMapRealVector22.", realVector23.equals(openMapRealVector22) == openMapRealVector22.equals(realVector23));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector12);
        double double14 = openMapRealVector5.dotProduct(openMapRealVector9);
        int int15 = openMapRealVector5.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector18 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean19 = openMapRealVector18.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = openMapRealVector5.append((org.apache.commons.math.linear.RealVector) openMapRealVector18);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector24 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector27 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector28 = openMapRealVector24.projection((org.apache.commons.math.linear.RealVector) openMapRealVector27);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor29 = openMapRealVector27.sparseIterator();
        openMapRealVector18.setSubVector((int) (short) 0, (org.apache.commons.math.linear.RealVector) openMapRealVector27);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector33 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector36 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector37 = openMapRealVector33.projection((org.apache.commons.math.linear.RealVector) openMapRealVector36);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector40 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector43 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector44 = openMapRealVector40.projection((org.apache.commons.math.linear.RealVector) openMapRealVector43);
        double double45 = openMapRealVector36.dotProduct(openMapRealVector40);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor46 = openMapRealVector40.iterator();
        boolean boolean47 = openMapRealVector40.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector50 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector53 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector54 = openMapRealVector50.projection((org.apache.commons.math.linear.RealVector) openMapRealVector53);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector57 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector60 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector61 = openMapRealVector57.projection((org.apache.commons.math.linear.RealVector) openMapRealVector60);
        double double62 = openMapRealVector53.dotProduct(openMapRealVector57);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector65 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector68 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector69 = openMapRealVector65.projection((org.apache.commons.math.linear.RealVector) openMapRealVector68);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor70 = openMapRealVector68.sparseIterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector71 = openMapRealVector53.append(openMapRealVector68);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector72 = openMapRealVector40.add(openMapRealVector68);
        double[] doubleArray77 = new double[] { (short) 1, 100.0f, 99, (-1) };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector78 = openMapRealVector72.append(doubleArray77);
        org.apache.commons.math.linear.RealVector realVector79 = openMapRealVector27.add(doubleArray77);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector18", openMapRealVector2.equals(openMapRealVector18) ? openMapRealVector2.hashCode() == openMapRealVector18.hashCode() : true);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector12);
        double double14 = openMapRealVector5.dotProduct(openMapRealVector9);
        int int15 = openMapRealVector5.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector18 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean19 = openMapRealVector18.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = openMapRealVector5.append((org.apache.commons.math.linear.RealVector) openMapRealVector18);
        double[] doubleArray21 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector22 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray21);
        org.apache.commons.math.linear.RealVector realVector23 = openMapRealVector5.add(doubleArray21);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector24 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray21);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on realVector23 and openMapRealVector22.", realVector23.equals(openMapRealVector22) == openMapRealVector22.equals(realVector23));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector12);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector16 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector20 = openMapRealVector16.projection((org.apache.commons.math.linear.RealVector) openMapRealVector19);
        double double21 = openMapRealVector12.dotProduct(openMapRealVector16);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor22 = openMapRealVector16.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector27 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector30 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector31 = openMapRealVector27.projection((org.apache.commons.math.linear.RealVector) openMapRealVector30);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector34 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector37 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector38 = openMapRealVector34.projection((org.apache.commons.math.linear.RealVector) openMapRealVector37);
        double double39 = openMapRealVector30.dotProduct(openMapRealVector34);
        int int40 = openMapRealVector30.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector43 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean44 = openMapRealVector43.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector45 = openMapRealVector30.append((org.apache.commons.math.linear.RealVector) openMapRealVector43);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector48 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector51 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector52 = openMapRealVector48.projection((org.apache.commons.math.linear.RealVector) openMapRealVector51);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector55 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector58 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector59 = openMapRealVector55.projection((org.apache.commons.math.linear.RealVector) openMapRealVector58);
        double double60 = openMapRealVector51.dotProduct(openMapRealVector55);
        int int61 = openMapRealVector51.getMaxIndex();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor62 = openMapRealVector51.sparseIterator();
        double double63 = openMapRealVector30.dotProduct((org.apache.commons.math.linear.RealVector) openMapRealVector51);
        org.apache.commons.math.linear.RealVector realVector64 = openMapRealVector16.combineToSelf(1.0d, (double) 100.0f, (org.apache.commons.math.linear.RealVector) openMapRealVector51);
        org.apache.commons.math.linear.RealVector realVector65 = openMapRealVector2.add((org.apache.commons.math.linear.RealVector) openMapRealVector16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector5 and openMapRealVector16", openMapRealVector5.equals(openMapRealVector16) ? openMapRealVector5.hashCode() == openMapRealVector16.hashCode() : true);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector12);
        double double14 = openMapRealVector5.dotProduct(openMapRealVector9);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor15 = openMapRealVector9.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector24 = openMapRealVector20.projection((org.apache.commons.math.linear.RealVector) openMapRealVector23);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector27 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector30 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector31 = openMapRealVector27.projection((org.apache.commons.math.linear.RealVector) openMapRealVector30);
        double double32 = openMapRealVector23.dotProduct(openMapRealVector27);
        int int33 = openMapRealVector23.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector36 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean37 = openMapRealVector36.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector38 = openMapRealVector23.append((org.apache.commons.math.linear.RealVector) openMapRealVector36);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector41 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector44 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector45 = openMapRealVector41.projection((org.apache.commons.math.linear.RealVector) openMapRealVector44);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector48 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector51 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector52 = openMapRealVector48.projection((org.apache.commons.math.linear.RealVector) openMapRealVector51);
        double double53 = openMapRealVector44.dotProduct(openMapRealVector48);
        int int54 = openMapRealVector44.getMaxIndex();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor55 = openMapRealVector44.sparseIterator();
        double double56 = openMapRealVector23.dotProduct((org.apache.commons.math.linear.RealVector) openMapRealVector44);
        org.apache.commons.math.linear.RealVector realVector57 = openMapRealVector9.combineToSelf(1.0d, (double) 100.0f, (org.apache.commons.math.linear.RealVector) openMapRealVector44);
        int int58 = openMapRealVector9.getMaxIndex();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector9", openMapRealVector2.equals(openMapRealVector9) ? openMapRealVector2.hashCode() == openMapRealVector9.hashCode() : true);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        int int7 = openMapRealVector2.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector2.mapAddToSelf((double) (byte) -1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector16 = openMapRealVector12.projection((org.apache.commons.math.linear.RealVector) openMapRealVector15);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor17 = openMapRealVector15.sparseIterator();
        org.apache.commons.math.linear.RealVector realVector18 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector15);
        openMapRealVector15.set(0.0d);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector27 = openMapRealVector23.projection((org.apache.commons.math.linear.RealVector) openMapRealVector26);
        double[] doubleArray28 = openMapRealVector26.getData();
        double double29 = openMapRealVector15.getDistance(doubleArray28);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector31 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray28, Double.NaN);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector5 and openMapRealVector15", openMapRealVector5.equals(openMapRealVector15) ? openMapRealVector5.hashCode() == openMapRealVector15.hashCode() : true);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector3 = new org.apache.commons.math.linear.OpenMapRealVector(100, (int) '#', (-1.0d));
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector10 = openMapRealVector6.projection((org.apache.commons.math.linear.RealVector) openMapRealVector9);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector13 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector16 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector17 = openMapRealVector13.projection((org.apache.commons.math.linear.RealVector) openMapRealVector16);
        double double18 = openMapRealVector9.dotProduct(openMapRealVector13);
        int int19 = openMapRealVector9.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector22 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean23 = openMapRealVector22.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector24 = openMapRealVector9.append((org.apache.commons.math.linear.RealVector) openMapRealVector22);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector27 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector30 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector31 = openMapRealVector27.projection((org.apache.commons.math.linear.RealVector) openMapRealVector30);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector34 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector37 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector38 = openMapRealVector34.projection((org.apache.commons.math.linear.RealVector) openMapRealVector37);
        double double39 = openMapRealVector30.dotProduct(openMapRealVector34);
        int int40 = openMapRealVector30.getMaxIndex();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor41 = openMapRealVector30.sparseIterator();
        double double42 = openMapRealVector9.dotProduct((org.apache.commons.math.linear.RealVector) openMapRealVector30);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector45 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector48 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector49 = openMapRealVector45.projection((org.apache.commons.math.linear.RealVector) openMapRealVector48);
        int int50 = openMapRealVector45.getMaxIndex();
        double double51 = openMapRealVector30.getL1Distance((org.apache.commons.math.linear.RealVector) openMapRealVector45);
        double double52 = openMapRealVector3.getDistance(openMapRealVector30);
        double double53 = openMapRealVector3.getL1Norm();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector56 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector59 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector60 = openMapRealVector56.projection((org.apache.commons.math.linear.RealVector) openMapRealVector59);
        int int61 = openMapRealVector56.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector63 = openMapRealVector56.mapAddToSelf((double) (byte) -1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector66 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector69 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector70 = openMapRealVector66.projection((org.apache.commons.math.linear.RealVector) openMapRealVector69);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor71 = openMapRealVector69.sparseIterator();
        org.apache.commons.math.linear.RealVector realVector72 = openMapRealVector63.projection((org.apache.commons.math.linear.RealVector) openMapRealVector69);
        openMapRealVector69.set(0.0d);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector77 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector80 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector81 = openMapRealVector77.projection((org.apache.commons.math.linear.RealVector) openMapRealVector80);
        double[] doubleArray82 = openMapRealVector80.getData();
        double double83 = openMapRealVector69.getDistance(doubleArray82);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector84 = openMapRealVector3.subtract(doubleArray82);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector6 and openMapRealVector69", openMapRealVector6.equals(openMapRealVector69) ? openMapRealVector6.hashCode() == openMapRealVector69.hashCode() : true);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        int int7 = openMapRealVector2.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector2.mapAddToSelf((double) (byte) -1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector16 = openMapRealVector12.projection((org.apache.commons.math.linear.RealVector) openMapRealVector15);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor17 = openMapRealVector15.sparseIterator();
        org.apache.commons.math.linear.RealVector realVector18 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector15);
        openMapRealVector15.set(0.0d);
        java.lang.Double[] doubleArray24 = new java.lang.Double[] { 0.0d, (-1.0d), 100.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray24, (double) (byte) 1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector28 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray24, (double) (short) 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector29 = openMapRealVector15.append(openMapRealVector28);
        boolean boolean30 = openMapRealVector29.isInfinite();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector5 and openMapRealVector15", openMapRealVector5.equals(openMapRealVector15) ? openMapRealVector5.hashCode() == openMapRealVector15.hashCode() : true);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 100, (int) (short) 1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector8 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector9 = openMapRealVector5.projection((org.apache.commons.math.linear.RealVector) openMapRealVector8);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector16 = openMapRealVector12.projection((org.apache.commons.math.linear.RealVector) openMapRealVector15);
        double double17 = openMapRealVector8.dotProduct(openMapRealVector12);
        int int18 = openMapRealVector8.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector21 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean22 = openMapRealVector21.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = openMapRealVector8.append((org.apache.commons.math.linear.RealVector) openMapRealVector21);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector29 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector30 = openMapRealVector26.projection((org.apache.commons.math.linear.RealVector) openMapRealVector29);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector33 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector36 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector37 = openMapRealVector33.projection((org.apache.commons.math.linear.RealVector) openMapRealVector36);
        double double38 = openMapRealVector29.dotProduct(openMapRealVector33);
        int int39 = openMapRealVector29.getMaxIndex();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor40 = openMapRealVector29.sparseIterator();
        double double41 = openMapRealVector8.dotProduct((org.apache.commons.math.linear.RealVector) openMapRealVector29);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector44 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector47 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector48 = openMapRealVector44.projection((org.apache.commons.math.linear.RealVector) openMapRealVector47);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector51 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector54 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector55 = openMapRealVector51.projection((org.apache.commons.math.linear.RealVector) openMapRealVector54);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector58 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector61 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector62 = openMapRealVector58.projection((org.apache.commons.math.linear.RealVector) openMapRealVector61);
        double double63 = openMapRealVector54.dotProduct(openMapRealVector58);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor64 = openMapRealVector58.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector65 = openMapRealVector47.append((org.apache.commons.math.linear.RealVector) openMapRealVector58);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector66 = openMapRealVector29.add(openMapRealVector47);
        org.apache.commons.math.linear.RealVector realVector68 = openMapRealVector47.mapSubtractToSelf(0.0d);
        org.apache.commons.math.linear.RealMatrix realMatrix69 = openMapRealVector2.outerProduct((org.apache.commons.math.linear.RealVector) openMapRealVector47);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector5 and openMapRealVector47", openMapRealVector5.equals(openMapRealVector47) ? openMapRealVector5.hashCode() == openMapRealVector47.hashCode() : true);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean3 = openMapRealVector2.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector4.mapSubtract((double) 0L);
        org.apache.commons.math.linear.RealVector realVector8 = openMapRealVector4.mapSubtract((double) 1L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and realVector6", openMapRealVector2.equals(realVector6) ? openMapRealVector2.hashCode() == realVector6.hashCode() : true);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector12);
        double double14 = openMapRealVector5.dotProduct(openMapRealVector9);
        int int15 = openMapRealVector5.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector18 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean19 = openMapRealVector18.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = openMapRealVector5.append((org.apache.commons.math.linear.RealVector) openMapRealVector18);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector24 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector27 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector28 = openMapRealVector24.projection((org.apache.commons.math.linear.RealVector) openMapRealVector27);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor29 = openMapRealVector27.sparseIterator();
        openMapRealVector18.setSubVector((int) (short) 0, (org.apache.commons.math.linear.RealVector) openMapRealVector27);
        org.apache.commons.math.linear.RealVector realVector32 = openMapRealVector27.mapMultiplyToSelf((double) 0L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector18", openMapRealVector2.equals(openMapRealVector18) ? openMapRealVector2.hashCode() == openMapRealVector18.hashCode() : true);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector12);
        double double14 = openMapRealVector5.dotProduct(openMapRealVector9);
        int int15 = openMapRealVector5.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector18 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean19 = openMapRealVector18.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = openMapRealVector5.append((org.apache.commons.math.linear.RealVector) openMapRealVector18);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector27 = openMapRealVector23.projection((org.apache.commons.math.linear.RealVector) openMapRealVector26);
        int int28 = openMapRealVector23.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector30 = openMapRealVector23.mapAddToSelf((double) (byte) -1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector33 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector36 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector37 = openMapRealVector33.projection((org.apache.commons.math.linear.RealVector) openMapRealVector36);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor38 = openMapRealVector36.sparseIterator();
        org.apache.commons.math.linear.RealVector realVector39 = openMapRealVector30.projection((org.apache.commons.math.linear.RealVector) openMapRealVector36);
        openMapRealVector36.set(0.0d);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector44 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector47 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector48 = openMapRealVector44.projection((org.apache.commons.math.linear.RealVector) openMapRealVector47);
        double[] doubleArray49 = openMapRealVector47.getData();
        double double50 = openMapRealVector36.getDistance(doubleArray49);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector51 = openMapRealVector5.ebeDivide(doubleArray49);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector36", openMapRealVector2.equals(openMapRealVector36) ? openMapRealVector2.hashCode() == openMapRealVector36.hashCode() : true);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        int int7 = openMapRealVector2.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector2.mapAddToSelf((double) (byte) -1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector16 = openMapRealVector12.projection((org.apache.commons.math.linear.RealVector) openMapRealVector15);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector22 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector23 = openMapRealVector19.projection((org.apache.commons.math.linear.RealVector) openMapRealVector22);
        double double24 = openMapRealVector15.dotProduct(openMapRealVector19);
        int int25 = openMapRealVector15.getMaxIndex();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor26 = openMapRealVector15.sparseIterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector29 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector32 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector33 = openMapRealVector29.projection((org.apache.commons.math.linear.RealVector) openMapRealVector32);
        int int34 = openMapRealVector29.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector36 = openMapRealVector29.mapAddToSelf((double) (byte) -1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector39 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector42 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector43 = openMapRealVector39.projection((org.apache.commons.math.linear.RealVector) openMapRealVector42);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor44 = openMapRealVector42.sparseIterator();
        org.apache.commons.math.linear.RealVector realVector45 = openMapRealVector36.projection((org.apache.commons.math.linear.RealVector) openMapRealVector42);
        org.apache.commons.math.linear.RealVector realVector46 = openMapRealVector15.add((org.apache.commons.math.linear.RealVector) openMapRealVector36);
        double double47 = openMapRealVector36.getSparsity();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector48 = openMapRealVector9.ebeMultiply((org.apache.commons.math.linear.RealVector) openMapRealVector36);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector49 = openMapRealVector36.unitVector();
        org.apache.commons.math.linear.RealVector realVector51 = openMapRealVector49.mapMultiplyToSelf((double) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector54 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        double double55 = openMapRealVector49.getDistance((org.apache.commons.math.linear.RealVector) openMapRealVector54);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector58 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector61 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector62 = openMapRealVector58.projection((org.apache.commons.math.linear.RealVector) openMapRealVector61);
        int int63 = openMapRealVector58.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector65 = openMapRealVector58.mapAddToSelf((double) (byte) -1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector68 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector71 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector72 = openMapRealVector68.projection((org.apache.commons.math.linear.RealVector) openMapRealVector71);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor73 = openMapRealVector71.sparseIterator();
        org.apache.commons.math.linear.RealVector realVector74 = openMapRealVector65.projection((org.apache.commons.math.linear.RealVector) openMapRealVector71);
        openMapRealVector71.set(0.0d);
        java.lang.Double[] doubleArray80 = new java.lang.Double[] { 0.0d, (-1.0d), 100.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector82 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray80, (double) (byte) 1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector84 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray80, (double) (short) 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector85 = openMapRealVector71.append(openMapRealVector84);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector86 = openMapRealVector54.append((org.apache.commons.math.linear.RealVector) openMapRealVector84);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector5 and openMapRealVector71", openMapRealVector5.equals(openMapRealVector71) ? openMapRealVector5.hashCode() == openMapRealVector71.hashCode() : true);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector12);
        double double14 = openMapRealVector5.dotProduct(openMapRealVector9);
        int int15 = openMapRealVector5.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector18 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean19 = openMapRealVector18.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = openMapRealVector5.append((org.apache.commons.math.linear.RealVector) openMapRealVector18);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector27 = openMapRealVector23.projection((org.apache.commons.math.linear.RealVector) openMapRealVector26);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector30 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector33 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector34 = openMapRealVector30.projection((org.apache.commons.math.linear.RealVector) openMapRealVector33);
        double double35 = openMapRealVector26.dotProduct(openMapRealVector30);
        int int36 = openMapRealVector26.getMaxIndex();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor37 = openMapRealVector26.sparseIterator();
        double double38 = openMapRealVector5.dotProduct((org.apache.commons.math.linear.RealVector) openMapRealVector26);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector41 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector44 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector45 = openMapRealVector41.projection((org.apache.commons.math.linear.RealVector) openMapRealVector44);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector48 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector51 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector52 = openMapRealVector48.projection((org.apache.commons.math.linear.RealVector) openMapRealVector51);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector55 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector58 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector59 = openMapRealVector55.projection((org.apache.commons.math.linear.RealVector) openMapRealVector58);
        double double60 = openMapRealVector51.dotProduct(openMapRealVector55);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor61 = openMapRealVector55.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector62 = openMapRealVector44.append((org.apache.commons.math.linear.RealVector) openMapRealVector55);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector63 = openMapRealVector26.add(openMapRealVector44);
        org.apache.commons.math.linear.RealVector realVector65 = openMapRealVector44.mapSubtractToSelf(0.0d);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector66 = new org.apache.commons.math.linear.OpenMapRealVector(openMapRealVector44);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector44", openMapRealVector2.equals(openMapRealVector44) ? openMapRealVector2.hashCode() == openMapRealVector44.hashCode() : true);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector12);
        double double14 = openMapRealVector5.dotProduct(openMapRealVector9);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector17 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector21 = openMapRealVector17.projection((org.apache.commons.math.linear.RealVector) openMapRealVector20);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor22 = openMapRealVector20.sparseIterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = openMapRealVector5.append(openMapRealVector20);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector29 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector30 = openMapRealVector26.projection((org.apache.commons.math.linear.RealVector) openMapRealVector29);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector33 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector36 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector37 = openMapRealVector33.projection((org.apache.commons.math.linear.RealVector) openMapRealVector36);
        double double38 = openMapRealVector29.dotProduct(openMapRealVector33);
        int int39 = openMapRealVector29.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector42 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean43 = openMapRealVector42.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector44 = openMapRealVector29.append((org.apache.commons.math.linear.RealVector) openMapRealVector42);
        double[] doubleArray45 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector46 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray45);
        org.apache.commons.math.linear.RealVector realVector47 = openMapRealVector29.add(doubleArray45);
        org.apache.commons.math.linear.RealVector realVector48 = openMapRealVector20.add(doubleArray45);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on realVector47 and openMapRealVector46.", realVector47.equals(openMapRealVector46) == openMapRealVector46.equals(realVector47));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector10 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector11 = openMapRealVector7.projection((org.apache.commons.math.linear.RealVector) openMapRealVector10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector17 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector18 = openMapRealVector14.projection((org.apache.commons.math.linear.RealVector) openMapRealVector17);
        double double19 = openMapRealVector10.dotProduct(openMapRealVector14);
        int int20 = openMapRealVector10.getMaxIndex();
        org.apache.commons.math.linear.RealVector realVector21 = openMapRealVector2.combineToSelf((double) (byte) -1, (double) '4', (org.apache.commons.math.linear.RealVector) openMapRealVector10);
        double double22 = openMapRealVector2.getMinValue();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector7 and openMapRealVector2", openMapRealVector7.equals(openMapRealVector2) ? openMapRealVector7.hashCode() == openMapRealVector2.hashCode() : true);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean3 = openMapRealVector2.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector4.mapSubtract((double) 0L);
        org.apache.commons.math.linear.RealVector realVector8 = openMapRealVector4.mapDivide(Double.NaN);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and realVector6", openMapRealVector2.equals(realVector6) ? openMapRealVector2.hashCode() == realVector6.hashCode() : true);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        int int7 = openMapRealVector2.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector2.mapAddToSelf((double) (byte) -1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector16 = openMapRealVector12.projection((org.apache.commons.math.linear.RealVector) openMapRealVector15);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor17 = openMapRealVector15.sparseIterator();
        org.apache.commons.math.linear.RealVector realVector18 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector15);
        openMapRealVector15.set(0.0d);
        java.lang.Double[] doubleArray24 = new java.lang.Double[] { 0.0d, (-1.0d), 100.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray24, (double) (byte) 1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector28 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray24, (double) (short) 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector29 = openMapRealVector15.append(openMapRealVector28);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector31 = openMapRealVector28.append((double) 100L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector5 and openMapRealVector15", openMapRealVector5.equals(openMapRealVector15) ? openMapRealVector5.hashCode() == openMapRealVector15.hashCode() : true);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector12);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector16 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector20 = openMapRealVector16.projection((org.apache.commons.math.linear.RealVector) openMapRealVector19);
        double double21 = openMapRealVector12.dotProduct(openMapRealVector16);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor22 = openMapRealVector16.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = openMapRealVector5.append((org.apache.commons.math.linear.RealVector) openMapRealVector16);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector25 = openMapRealVector16.append((double) 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector28 = openMapRealVector25.getSubVector((int) 'a', (int) (byte) 1);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor29 = openMapRealVector28.iterator();
        org.apache.commons.math.linear.RealVector realVector31 = openMapRealVector28.mapSubtractToSelf((double) (short) 1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector34 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector37 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector38 = openMapRealVector34.projection((org.apache.commons.math.linear.RealVector) openMapRealVector37);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector41 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector44 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector45 = openMapRealVector41.projection((org.apache.commons.math.linear.RealVector) openMapRealVector44);
        double double46 = openMapRealVector37.dotProduct(openMapRealVector41);
        int int47 = openMapRealVector37.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector50 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean51 = openMapRealVector50.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector52 = openMapRealVector37.append((org.apache.commons.math.linear.RealVector) openMapRealVector50);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector56 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector59 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector60 = openMapRealVector56.projection((org.apache.commons.math.linear.RealVector) openMapRealVector59);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor61 = openMapRealVector59.sparseIterator();
        openMapRealVector50.setSubVector((int) (short) 0, (org.apache.commons.math.linear.RealVector) openMapRealVector59);
        double double63 = openMapRealVector50.getLInfNorm();
        double double64 = openMapRealVector28.getDistance(openMapRealVector50);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector68 = new org.apache.commons.math.linear.OpenMapRealVector((int) (byte) 100, (int) (byte) 1, (double) (-1));
        double double69 = openMapRealVector50.getL1Distance(openMapRealVector68);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor70 = openMapRealVector68.iterator();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector50", openMapRealVector2.equals(openMapRealVector50) ? openMapRealVector2.hashCode() == openMapRealVector50.hashCode() : true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector12);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector16 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector20 = openMapRealVector16.projection((org.apache.commons.math.linear.RealVector) openMapRealVector19);
        double double21 = openMapRealVector12.dotProduct(openMapRealVector16);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor22 = openMapRealVector16.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = openMapRealVector5.append((org.apache.commons.math.linear.RealVector) openMapRealVector16);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector25 = openMapRealVector16.append((double) 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector28 = openMapRealVector25.getSubVector((int) 'a', (int) (byte) 1);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor29 = openMapRealVector28.iterator();
        org.apache.commons.math.linear.RealVector realVector31 = openMapRealVector28.mapSubtractToSelf((double) (short) 1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector34 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector37 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector38 = openMapRealVector34.projection((org.apache.commons.math.linear.RealVector) openMapRealVector37);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector41 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector44 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector45 = openMapRealVector41.projection((org.apache.commons.math.linear.RealVector) openMapRealVector44);
        double double46 = openMapRealVector37.dotProduct(openMapRealVector41);
        int int47 = openMapRealVector37.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector50 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean51 = openMapRealVector50.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector52 = openMapRealVector37.append((org.apache.commons.math.linear.RealVector) openMapRealVector50);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector56 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector59 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector60 = openMapRealVector56.projection((org.apache.commons.math.linear.RealVector) openMapRealVector59);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor61 = openMapRealVector59.sparseIterator();
        openMapRealVector50.setSubVector((int) (short) 0, (org.apache.commons.math.linear.RealVector) openMapRealVector59);
        double double63 = openMapRealVector50.getLInfNorm();
        double double64 = openMapRealVector28.getDistance(openMapRealVector50);
        double double65 = openMapRealVector28.getLInfNorm();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector50", openMapRealVector2.equals(openMapRealVector50) ? openMapRealVector2.hashCode() == openMapRealVector50.hashCode() : true);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector10 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector11 = openMapRealVector7.projection((org.apache.commons.math.linear.RealVector) openMapRealVector10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector17 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector18 = openMapRealVector14.projection((org.apache.commons.math.linear.RealVector) openMapRealVector17);
        double double19 = openMapRealVector10.dotProduct(openMapRealVector14);
        int int20 = openMapRealVector10.getMaxIndex();
        org.apache.commons.math.linear.RealVector realVector21 = openMapRealVector2.combineToSelf((double) (byte) -1, (double) '4', (org.apache.commons.math.linear.RealVector) openMapRealVector10);
        double double22 = openMapRealVector2.getNorm();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector7 and openMapRealVector2", openMapRealVector7.equals(openMapRealVector2) ? openMapRealVector7.hashCode() == openMapRealVector2.hashCode() : true);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector12);
        double double14 = openMapRealVector5.dotProduct(openMapRealVector9);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector17 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector21 = openMapRealVector17.projection((org.apache.commons.math.linear.RealVector) openMapRealVector20);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor22 = openMapRealVector20.sparseIterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = openMapRealVector5.append(openMapRealVector20);
        org.apache.commons.math.linear.RealVector realVector25 = openMapRealVector20.mapMultiplyToSelf((double) (-1L));
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector28 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector31 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector32 = openMapRealVector28.projection((org.apache.commons.math.linear.RealVector) openMapRealVector31);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector35 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector38 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector39 = openMapRealVector35.projection((org.apache.commons.math.linear.RealVector) openMapRealVector38);
        double double40 = openMapRealVector31.dotProduct(openMapRealVector35);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector43 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector46 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector47 = openMapRealVector43.projection((org.apache.commons.math.linear.RealVector) openMapRealVector46);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor48 = openMapRealVector46.sparseIterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector49 = openMapRealVector31.append(openMapRealVector46);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector50 = openMapRealVector20.append((org.apache.commons.math.linear.RealVector) openMapRealVector31);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector53 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector58 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector61 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector62 = openMapRealVector58.projection((org.apache.commons.math.linear.RealVector) openMapRealVector61);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector65 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector68 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector69 = openMapRealVector65.projection((org.apache.commons.math.linear.RealVector) openMapRealVector68);
        double double70 = openMapRealVector61.dotProduct(openMapRealVector65);
        int int71 = openMapRealVector61.getMaxIndex();
        org.apache.commons.math.linear.RealVector realVector72 = openMapRealVector53.combineToSelf((double) (byte) -1, (double) '4', (org.apache.commons.math.linear.RealVector) openMapRealVector61);
        double double73 = openMapRealVector31.getL1Distance(openMapRealVector61);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector53", openMapRealVector2.equals(openMapRealVector53) ? openMapRealVector2.hashCode() == openMapRealVector53.hashCode() : true);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector12);
        double double14 = openMapRealVector5.dotProduct(openMapRealVector9);
        int int15 = openMapRealVector5.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector18 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean19 = openMapRealVector18.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = openMapRealVector5.append((org.apache.commons.math.linear.RealVector) openMapRealVector18);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector21 = openMapRealVector5.copy();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector29 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector30 = openMapRealVector26.projection((org.apache.commons.math.linear.RealVector) openMapRealVector29);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector33 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector36 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector37 = openMapRealVector33.projection((org.apache.commons.math.linear.RealVector) openMapRealVector36);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector40 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector43 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector44 = openMapRealVector40.projection((org.apache.commons.math.linear.RealVector) openMapRealVector43);
        double double45 = openMapRealVector36.dotProduct(openMapRealVector40);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor46 = openMapRealVector40.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector47 = openMapRealVector29.append((org.apache.commons.math.linear.RealVector) openMapRealVector40);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector49 = openMapRealVector40.append((double) 10);
        org.apache.commons.math.linear.RealVector realVector50 = openMapRealVector21.combineToSelf((double) 'a', (double) 2, (org.apache.commons.math.linear.RealVector) openMapRealVector40);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector54 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector57 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector58 = openMapRealVector54.projection((org.apache.commons.math.linear.RealVector) openMapRealVector57);
        int int59 = openMapRealVector54.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector61 = openMapRealVector54.mapAddToSelf((double) (byte) -1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector64 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector67 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector68 = openMapRealVector64.projection((org.apache.commons.math.linear.RealVector) openMapRealVector67);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor69 = openMapRealVector67.sparseIterator();
        org.apache.commons.math.linear.RealVector realVector70 = openMapRealVector61.projection((org.apache.commons.math.linear.RealVector) openMapRealVector67);
        boolean boolean71 = openMapRealVector67.isInfinite();
        double[] doubleArray72 = openMapRealVector67.getData();
        openMapRealVector21.setSubVector((int) (byte) 0, doubleArray72);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector21", openMapRealVector2.equals(openMapRealVector21) ? openMapRealVector2.hashCode() == openMapRealVector21.hashCode() : true);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector12);
        double double14 = openMapRealVector5.dotProduct(openMapRealVector9);
        int int15 = openMapRealVector5.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector18 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector21 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector22 = openMapRealVector18.projection((org.apache.commons.math.linear.RealVector) openMapRealVector21);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector25 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector28 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector29 = openMapRealVector25.projection((org.apache.commons.math.linear.RealVector) openMapRealVector28);
        double double30 = openMapRealVector21.dotProduct(openMapRealVector25);
        int int31 = openMapRealVector21.getMaxIndex();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor32 = openMapRealVector21.sparseIterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector35 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector38 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector39 = openMapRealVector35.projection((org.apache.commons.math.linear.RealVector) openMapRealVector38);
        int int40 = openMapRealVector35.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector42 = openMapRealVector35.mapAddToSelf((double) (byte) -1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector45 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector48 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector49 = openMapRealVector45.projection((org.apache.commons.math.linear.RealVector) openMapRealVector48);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor50 = openMapRealVector48.sparseIterator();
        org.apache.commons.math.linear.RealVector realVector51 = openMapRealVector42.projection((org.apache.commons.math.linear.RealVector) openMapRealVector48);
        org.apache.commons.math.linear.RealVector realVector52 = openMapRealVector21.add((org.apache.commons.math.linear.RealVector) openMapRealVector42);
        double double53 = openMapRealVector42.getSparsity();
        double double54 = openMapRealVector42.getMaxValue();
        org.apache.commons.math.linear.RealVector realVector55 = openMapRealVector5.add((org.apache.commons.math.linear.RealVector) openMapRealVector42);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector58 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector61 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector62 = openMapRealVector58.projection((org.apache.commons.math.linear.RealVector) openMapRealVector61);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector65 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector68 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector69 = openMapRealVector65.projection((org.apache.commons.math.linear.RealVector) openMapRealVector68);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector72 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector75 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector76 = openMapRealVector72.projection((org.apache.commons.math.linear.RealVector) openMapRealVector75);
        double double77 = openMapRealVector68.dotProduct(openMapRealVector72);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor78 = openMapRealVector72.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector79 = openMapRealVector61.append((org.apache.commons.math.linear.RealVector) openMapRealVector72);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector81 = openMapRealVector72.mapAdd((double) (byte) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector82 = openMapRealVector42.subtract(openMapRealVector72);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector81", openMapRealVector2.equals(openMapRealVector81) ? openMapRealVector2.hashCode() == openMapRealVector81.hashCode() : true);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector12);
        double double14 = openMapRealVector5.dotProduct(openMapRealVector9);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector16 = openMapRealVector5.mapAdd((double) (short) 1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 100);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector22 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector25 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector26 = openMapRealVector22.projection((org.apache.commons.math.linear.RealVector) openMapRealVector25);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector29 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector32 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector33 = openMapRealVector29.projection((org.apache.commons.math.linear.RealVector) openMapRealVector32);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector36 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector39 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector40 = openMapRealVector36.projection((org.apache.commons.math.linear.RealVector) openMapRealVector39);
        double double41 = openMapRealVector32.dotProduct(openMapRealVector36);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor42 = openMapRealVector36.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector43 = openMapRealVector25.append((org.apache.commons.math.linear.RealVector) openMapRealVector36);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector45 = openMapRealVector36.append((double) 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector48 = openMapRealVector45.getSubVector((int) 'a', (int) (byte) 1);
        boolean boolean49 = openMapRealVector48.isNaN();
        org.apache.commons.math.linear.RealMatrix realMatrix50 = openMapRealVector19.outerProduct((org.apache.commons.math.linear.RealVector) openMapRealVector48);
        boolean boolean51 = openMapRealVector19.isInfinite();
        openMapRealVector16.setSubVector((int) (byte) 0, (org.apache.commons.math.linear.RealVector) openMapRealVector19);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector58 = new org.apache.commons.math.linear.OpenMapRealVector((int) (byte) 100, (int) (byte) 1, (double) (-1));
        org.apache.commons.math.linear.RealVector realVector59 = openMapRealVector19.combine((double) '4', (double) '4', (org.apache.commons.math.linear.RealVector) openMapRealVector58);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector16", openMapRealVector2.equals(openMapRealVector16) ? openMapRealVector2.hashCode() == openMapRealVector16.hashCode() : true);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector10 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector11 = openMapRealVector7.projection((org.apache.commons.math.linear.RealVector) openMapRealVector10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector17 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector18 = openMapRealVector14.projection((org.apache.commons.math.linear.RealVector) openMapRealVector17);
        double double19 = openMapRealVector10.dotProduct(openMapRealVector14);
        int int20 = openMapRealVector10.getMaxIndex();
        org.apache.commons.math.linear.RealVector realVector21 = openMapRealVector2.combineToSelf((double) (byte) -1, (double) '4', (org.apache.commons.math.linear.RealVector) openMapRealVector10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = openMapRealVector10.append((double) (byte) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector7", openMapRealVector2.equals(openMapRealVector7) ? openMapRealVector2.hashCode() == openMapRealVector7.hashCode() : true);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        int int7 = openMapRealVector2.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector2.mapAddToSelf((double) (byte) -1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector16 = openMapRealVector12.projection((org.apache.commons.math.linear.RealVector) openMapRealVector15);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector22 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector23 = openMapRealVector19.projection((org.apache.commons.math.linear.RealVector) openMapRealVector22);
        double double24 = openMapRealVector15.dotProduct(openMapRealVector19);
        int int25 = openMapRealVector15.getMaxIndex();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor26 = openMapRealVector15.sparseIterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector29 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector32 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector33 = openMapRealVector29.projection((org.apache.commons.math.linear.RealVector) openMapRealVector32);
        int int34 = openMapRealVector29.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector36 = openMapRealVector29.mapAddToSelf((double) (byte) -1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector39 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector42 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector43 = openMapRealVector39.projection((org.apache.commons.math.linear.RealVector) openMapRealVector42);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor44 = openMapRealVector42.sparseIterator();
        org.apache.commons.math.linear.RealVector realVector45 = openMapRealVector36.projection((org.apache.commons.math.linear.RealVector) openMapRealVector42);
        org.apache.commons.math.linear.RealVector realVector46 = openMapRealVector15.add((org.apache.commons.math.linear.RealVector) openMapRealVector36);
        double double47 = openMapRealVector36.getSparsity();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector48 = openMapRealVector9.ebeMultiply((org.apache.commons.math.linear.RealVector) openMapRealVector36);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector49 = openMapRealVector36.unitVector();
        double double50 = openMapRealVector36.getSparsity();
        org.apache.commons.math.linear.RealVector realVector52 = openMapRealVector36.mapSubtractToSelf((double) (short) 1);
        double[] doubleArray53 = openMapRealVector36.getData();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector55 = new org.apache.commons.math.linear.OpenMapRealVector(100);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector58 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector61 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector62 = openMapRealVector58.projection((org.apache.commons.math.linear.RealVector) openMapRealVector61);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector65 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector68 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector69 = openMapRealVector65.projection((org.apache.commons.math.linear.RealVector) openMapRealVector68);
        double double70 = openMapRealVector61.dotProduct(openMapRealVector65);
        int int71 = openMapRealVector61.getMaxIndex();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor72 = openMapRealVector61.sparseIterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector75 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector78 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector79 = openMapRealVector75.projection((org.apache.commons.math.linear.RealVector) openMapRealVector78);
        int int80 = openMapRealVector75.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector82 = openMapRealVector75.mapAddToSelf((double) (byte) -1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector85 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector88 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector89 = openMapRealVector85.projection((org.apache.commons.math.linear.RealVector) openMapRealVector88);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor90 = openMapRealVector88.sparseIterator();
        org.apache.commons.math.linear.RealVector realVector91 = openMapRealVector82.projection((org.apache.commons.math.linear.RealVector) openMapRealVector88);
        org.apache.commons.math.linear.RealVector realVector92 = openMapRealVector61.add((org.apache.commons.math.linear.RealVector) openMapRealVector82);
        double double93 = openMapRealVector61.getL1Norm();
        double[] doubleArray94 = openMapRealVector61.getData();
        org.apache.commons.math.linear.RealVector realVector95 = openMapRealVector55.add(doubleArray94);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector96 = openMapRealVector36.ebeMultiply(doubleArray94);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on realVector95 and openMapRealVector5.", realVector95.equals(openMapRealVector5) == openMapRealVector5.equals(realVector95));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector12);
        double double14 = openMapRealVector5.dotProduct(openMapRealVector9);
        int int15 = openMapRealVector5.getMaxIndex();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor16 = openMapRealVector5.sparseIterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector22 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector23 = openMapRealVector19.projection((org.apache.commons.math.linear.RealVector) openMapRealVector22);
        int int24 = openMapRealVector19.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = openMapRealVector19.mapAddToSelf((double) (byte) -1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector29 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector32 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector33 = openMapRealVector29.projection((org.apache.commons.math.linear.RealVector) openMapRealVector32);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor34 = openMapRealVector32.sparseIterator();
        org.apache.commons.math.linear.RealVector realVector35 = openMapRealVector26.projection((org.apache.commons.math.linear.RealVector) openMapRealVector32);
        org.apache.commons.math.linear.RealVector realVector36 = openMapRealVector5.add((org.apache.commons.math.linear.RealVector) openMapRealVector26);
        int int37 = openMapRealVector5.getDimension();
        double double38 = openMapRealVector5.getMinValue();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector40 = openMapRealVector5.mapAddToSelf(0.0d);
        boolean boolean41 = openMapRealVector40.isInfinite();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector40", openMapRealVector2.equals(openMapRealVector40) ? openMapRealVector2.hashCode() == openMapRealVector40.hashCode() : true);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector12);
        double double14 = openMapRealVector5.dotProduct(openMapRealVector9);
        int int15 = openMapRealVector5.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector18 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean19 = openMapRealVector18.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = openMapRealVector5.append((org.apache.commons.math.linear.RealVector) openMapRealVector18);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector27 = openMapRealVector23.projection((org.apache.commons.math.linear.RealVector) openMapRealVector26);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector30 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector33 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector34 = openMapRealVector30.projection((org.apache.commons.math.linear.RealVector) openMapRealVector33);
        double double35 = openMapRealVector26.dotProduct(openMapRealVector30);
        int int36 = openMapRealVector26.getMaxIndex();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor37 = openMapRealVector26.sparseIterator();
        double double38 = openMapRealVector5.dotProduct((org.apache.commons.math.linear.RealVector) openMapRealVector26);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector41 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector44 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector45 = openMapRealVector41.projection((org.apache.commons.math.linear.RealVector) openMapRealVector44);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector48 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector51 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector52 = openMapRealVector48.projection((org.apache.commons.math.linear.RealVector) openMapRealVector51);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector55 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector58 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector59 = openMapRealVector55.projection((org.apache.commons.math.linear.RealVector) openMapRealVector58);
        double double60 = openMapRealVector51.dotProduct(openMapRealVector55);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor61 = openMapRealVector55.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector62 = openMapRealVector44.append((org.apache.commons.math.linear.RealVector) openMapRealVector55);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector63 = openMapRealVector26.add(openMapRealVector44);
        org.apache.commons.math.linear.RealVector realVector65 = openMapRealVector44.mapSubtractToSelf(0.0d);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector69 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 1, 100);
        openMapRealVector44.setSubVector((int) (short) 10, (org.apache.commons.math.linear.RealVector) openMapRealVector69);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector44", openMapRealVector2.equals(openMapRealVector44) ? openMapRealVector2.hashCode() == openMapRealVector44.hashCode() : true);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean3 = openMapRealVector2.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector4.mapSubtract((double) 0L);
        double double7 = openMapRealVector4.getLInfNorm();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and realVector6", openMapRealVector2.equals(realVector6) ? openMapRealVector2.hashCode() == realVector6.hashCode() : true);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector12);
        double double14 = openMapRealVector5.dotProduct(openMapRealVector9);
        int int15 = openMapRealVector5.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector18 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean19 = openMapRealVector18.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = openMapRealVector5.append((org.apache.commons.math.linear.RealVector) openMapRealVector18);
        double[] doubleArray21 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector22 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray21);
        org.apache.commons.math.linear.RealVector realVector23 = openMapRealVector5.add(doubleArray21);
        double double25 = openMapRealVector5.getEntry((int) (byte) 1);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on realVector23 and openMapRealVector22.", realVector23.equals(openMapRealVector22) == openMapRealVector22.equals(realVector23));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector12);
        double double14 = openMapRealVector5.dotProduct(openMapRealVector9);
        int int15 = openMapRealVector5.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector18 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean19 = openMapRealVector18.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = openMapRealVector5.append((org.apache.commons.math.linear.RealVector) openMapRealVector18);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector27 = openMapRealVector23.projection((org.apache.commons.math.linear.RealVector) openMapRealVector26);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector30 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector33 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector34 = openMapRealVector30.projection((org.apache.commons.math.linear.RealVector) openMapRealVector33);
        double double35 = openMapRealVector26.dotProduct(openMapRealVector30);
        int int36 = openMapRealVector26.getMaxIndex();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor37 = openMapRealVector26.sparseIterator();
        double double38 = openMapRealVector5.dotProduct((org.apache.commons.math.linear.RealVector) openMapRealVector26);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector41 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector44 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector45 = openMapRealVector41.projection((org.apache.commons.math.linear.RealVector) openMapRealVector44);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector48 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector51 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector52 = openMapRealVector48.projection((org.apache.commons.math.linear.RealVector) openMapRealVector51);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector55 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector58 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector59 = openMapRealVector55.projection((org.apache.commons.math.linear.RealVector) openMapRealVector58);
        double double60 = openMapRealVector51.dotProduct(openMapRealVector55);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor61 = openMapRealVector55.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector62 = openMapRealVector44.append((org.apache.commons.math.linear.RealVector) openMapRealVector55);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector63 = openMapRealVector26.add(openMapRealVector44);
        org.apache.commons.math.linear.RealVector realVector65 = openMapRealVector44.mapSubtractToSelf(0.0d);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector69 = new org.apache.commons.math.linear.OpenMapRealVector((int) (byte) 100, (int) (byte) 1, (double) (-1));
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector70 = openMapRealVector44.append(openMapRealVector69);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector44", openMapRealVector2.equals(openMapRealVector44) ? openMapRealVector2.hashCode() == openMapRealVector44.hashCode() : true);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector12);
        double double14 = openMapRealVector5.dotProduct(openMapRealVector9);
        int int15 = openMapRealVector5.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector18 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean19 = openMapRealVector18.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = openMapRealVector5.append((org.apache.commons.math.linear.RealVector) openMapRealVector18);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector27 = openMapRealVector23.projection((org.apache.commons.math.linear.RealVector) openMapRealVector26);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector30 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector33 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector34 = openMapRealVector30.projection((org.apache.commons.math.linear.RealVector) openMapRealVector33);
        double double35 = openMapRealVector26.dotProduct(openMapRealVector30);
        int int36 = openMapRealVector26.getMaxIndex();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor37 = openMapRealVector26.sparseIterator();
        double double38 = openMapRealVector5.dotProduct((org.apache.commons.math.linear.RealVector) openMapRealVector26);
        org.apache.commons.math.linear.RealVector realVector40 = openMapRealVector26.mapMultiply((double) 100);
        int int41 = openMapRealVector26.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector44 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector47 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector48 = openMapRealVector44.projection((org.apache.commons.math.linear.RealVector) openMapRealVector47);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector51 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector54 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector55 = openMapRealVector51.projection((org.apache.commons.math.linear.RealVector) openMapRealVector54);
        double double56 = openMapRealVector47.dotProduct(openMapRealVector51);
        int int57 = openMapRealVector47.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector60 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean61 = openMapRealVector60.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector62 = openMapRealVector47.append((org.apache.commons.math.linear.RealVector) openMapRealVector60);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector66 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector69 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector70 = openMapRealVector66.projection((org.apache.commons.math.linear.RealVector) openMapRealVector69);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor71 = openMapRealVector69.sparseIterator();
        openMapRealVector60.setSubVector((int) (short) 0, (org.apache.commons.math.linear.RealVector) openMapRealVector69);
        double[] doubleArray73 = openMapRealVector60.toArray();
        double[] doubleArray74 = openMapRealVector60.toArray();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector75 = openMapRealVector26.subtract(doubleArray74);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector60", openMapRealVector2.equals(openMapRealVector60) ? openMapRealVector2.hashCode() == openMapRealVector60.hashCode() : true);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector12);
        double double14 = openMapRealVector5.dotProduct(openMapRealVector9);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector17 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector21 = openMapRealVector17.projection((org.apache.commons.math.linear.RealVector) openMapRealVector20);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor22 = openMapRealVector20.sparseIterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = openMapRealVector5.append(openMapRealVector20);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector25 = openMapRealVector20.mapAdd(Double.NaN);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector28 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector31 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector32 = openMapRealVector28.projection((org.apache.commons.math.linear.RealVector) openMapRealVector31);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector35 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector38 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector39 = openMapRealVector35.projection((org.apache.commons.math.linear.RealVector) openMapRealVector38);
        double double40 = openMapRealVector31.dotProduct(openMapRealVector35);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor41 = openMapRealVector35.iterator();
        boolean boolean42 = openMapRealVector35.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector45 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector48 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector49 = openMapRealVector45.projection((org.apache.commons.math.linear.RealVector) openMapRealVector48);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector52 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector55 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector56 = openMapRealVector52.projection((org.apache.commons.math.linear.RealVector) openMapRealVector55);
        double double57 = openMapRealVector48.dotProduct(openMapRealVector52);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector60 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector63 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector64 = openMapRealVector60.projection((org.apache.commons.math.linear.RealVector) openMapRealVector63);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor65 = openMapRealVector63.sparseIterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector66 = openMapRealVector48.append(openMapRealVector63);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector67 = openMapRealVector35.add(openMapRealVector63);
        double[] doubleArray72 = new double[] { (short) 1, 100.0f, 99, (-1) };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector73 = openMapRealVector67.append(doubleArray72);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector75 = openMapRealVector67.mapAdd((double) 'a');
        org.apache.commons.math.linear.RealVector realVector77 = openMapRealVector67.mapSubtractToSelf(0.0d);
        org.apache.commons.math.linear.RealMatrix realMatrix78 = openMapRealVector25.outerProduct(realVector77);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and realVector77", openMapRealVector2.equals(realVector77) ? openMapRealVector2.hashCode() == realVector77.hashCode() : true);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        java.lang.Double[] doubleArray3 = new java.lang.Double[] { 0.0d, (-1.0d), 100.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray3, (double) (byte) 1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray3, (double) (short) 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray3, (double) (short) 1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector10 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray3);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray3, 10.0d);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector18 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector19 = openMapRealVector15.projection((org.apache.commons.math.linear.RealVector) openMapRealVector18);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector22 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector25 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector26 = openMapRealVector22.projection((org.apache.commons.math.linear.RealVector) openMapRealVector25);
        double double27 = openMapRealVector18.dotProduct(openMapRealVector22);
        int int28 = openMapRealVector18.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector31 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean32 = openMapRealVector31.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector33 = openMapRealVector18.append((org.apache.commons.math.linear.RealVector) openMapRealVector31);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector37 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector40 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector41 = openMapRealVector37.projection((org.apache.commons.math.linear.RealVector) openMapRealVector40);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor42 = openMapRealVector40.sparseIterator();
        openMapRealVector31.setSubVector((int) (short) 0, (org.apache.commons.math.linear.RealVector) openMapRealVector40);
        double[] doubleArray44 = openMapRealVector31.toArray();
        double[] doubleArray45 = openMapRealVector31.toArray();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector46 = openMapRealVector12.append(doubleArray45);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector15 and openMapRealVector31", openMapRealVector15.equals(openMapRealVector31) ? openMapRealVector15.hashCode() == openMapRealVector31.hashCode() : true);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector(100);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector8 = openMapRealVector4.projection((org.apache.commons.math.linear.RealVector) openMapRealVector7);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector11 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector15 = openMapRealVector11.projection((org.apache.commons.math.linear.RealVector) openMapRealVector14);
        double double16 = openMapRealVector7.dotProduct(openMapRealVector11);
        int int17 = openMapRealVector7.getMaxIndex();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor18 = openMapRealVector7.sparseIterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector21 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector24 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector25 = openMapRealVector21.projection((org.apache.commons.math.linear.RealVector) openMapRealVector24);
        int int26 = openMapRealVector21.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector28 = openMapRealVector21.mapAddToSelf((double) (byte) -1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector31 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector34 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector35 = openMapRealVector31.projection((org.apache.commons.math.linear.RealVector) openMapRealVector34);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor36 = openMapRealVector34.sparseIterator();
        org.apache.commons.math.linear.RealVector realVector37 = openMapRealVector28.projection((org.apache.commons.math.linear.RealVector) openMapRealVector34);
        org.apache.commons.math.linear.RealVector realVector38 = openMapRealVector7.add((org.apache.commons.math.linear.RealVector) openMapRealVector28);
        double double39 = openMapRealVector7.getL1Norm();
        double[] doubleArray40 = openMapRealVector7.getData();
        org.apache.commons.math.linear.RealVector realVector41 = openMapRealVector1.add(doubleArray40);
        int int42 = openMapRealVector1.getDimension();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on realVector41 and openMapRealVector4.", realVector41.equals(openMapRealVector4) == openMapRealVector4.equals(realVector41));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector12);
        double double14 = openMapRealVector5.dotProduct(openMapRealVector9);
        int int15 = openMapRealVector5.getMaxIndex();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor16 = openMapRealVector5.sparseIterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector22 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector23 = openMapRealVector19.projection((org.apache.commons.math.linear.RealVector) openMapRealVector22);
        int int24 = openMapRealVector19.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = openMapRealVector19.mapAddToSelf((double) (byte) -1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector29 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector32 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector33 = openMapRealVector29.projection((org.apache.commons.math.linear.RealVector) openMapRealVector32);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor34 = openMapRealVector32.sparseIterator();
        org.apache.commons.math.linear.RealVector realVector35 = openMapRealVector26.projection((org.apache.commons.math.linear.RealVector) openMapRealVector32);
        org.apache.commons.math.linear.RealVector realVector36 = openMapRealVector5.add((org.apache.commons.math.linear.RealVector) openMapRealVector26);
        double double37 = openMapRealVector5.getL1Norm();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector40 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector43 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector44 = openMapRealVector40.projection((org.apache.commons.math.linear.RealVector) openMapRealVector43);
        int int45 = openMapRealVector40.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector48 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector51 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector52 = openMapRealVector48.projection((org.apache.commons.math.linear.RealVector) openMapRealVector51);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector55 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector58 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector59 = openMapRealVector55.projection((org.apache.commons.math.linear.RealVector) openMapRealVector58);
        double double60 = openMapRealVector51.dotProduct(openMapRealVector55);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector63 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector66 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector67 = openMapRealVector63.projection((org.apache.commons.math.linear.RealVector) openMapRealVector66);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor68 = openMapRealVector66.sparseIterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector69 = openMapRealVector51.append(openMapRealVector66);
        org.apache.commons.math.linear.RealMatrix realMatrix70 = openMapRealVector40.outerProduct((org.apache.commons.math.linear.RealVector) openMapRealVector66);
        double double71 = openMapRealVector5.dotProduct(openMapRealVector66);
        double double72 = openMapRealVector5.getLInfNorm();
        org.apache.commons.math.linear.RealVector realVector74 = openMapRealVector5.mapSubtractToSelf(0.0d);
        org.apache.commons.math.linear.RealVector realVector76 = openMapRealVector5.mapMultiply(113.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector5", openMapRealVector2.equals(openMapRealVector5) ? openMapRealVector2.hashCode() == openMapRealVector5.hashCode() : true);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector12);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector16 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector20 = openMapRealVector16.projection((org.apache.commons.math.linear.RealVector) openMapRealVector19);
        double double21 = openMapRealVector12.dotProduct(openMapRealVector16);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor22 = openMapRealVector16.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = openMapRealVector5.append((org.apache.commons.math.linear.RealVector) openMapRealVector16);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector25 = openMapRealVector16.mapAdd((double) (byte) 0);
        openMapRealVector16.setEntry((int) (short) 0, 100.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector25", openMapRealVector2.equals(openMapRealVector25) ? openMapRealVector2.hashCode() == openMapRealVector25.hashCode() : true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector12);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector16 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector20 = openMapRealVector16.projection((org.apache.commons.math.linear.RealVector) openMapRealVector19);
        double double21 = openMapRealVector12.dotProduct(openMapRealVector16);
        int int22 = openMapRealVector12.getMaxIndex();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor23 = openMapRealVector12.sparseIterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector29 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector30 = openMapRealVector26.projection((org.apache.commons.math.linear.RealVector) openMapRealVector29);
        int int31 = openMapRealVector26.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector33 = openMapRealVector26.mapAddToSelf((double) (byte) -1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector36 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector39 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector40 = openMapRealVector36.projection((org.apache.commons.math.linear.RealVector) openMapRealVector39);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor41 = openMapRealVector39.sparseIterator();
        org.apache.commons.math.linear.RealVector realVector42 = openMapRealVector33.projection((org.apache.commons.math.linear.RealVector) openMapRealVector39);
        org.apache.commons.math.linear.RealVector realVector43 = openMapRealVector12.add((org.apache.commons.math.linear.RealVector) openMapRealVector33);
        double double44 = openMapRealVector33.getSparsity();
        double double45 = openMapRealVector33.getMaxValue();
        int int46 = openMapRealVector33.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector47 = openMapRealVector2.subtract((org.apache.commons.math.linear.RealVector) openMapRealVector33);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector52 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean53 = openMapRealVector52.isInfinite();
        org.apache.commons.math.linear.RealVector realVector54 = openMapRealVector33.combine((double) 100, (double) 10, (org.apache.commons.math.linear.RealVector) openMapRealVector52);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector57 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector60 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector61 = openMapRealVector57.projection((org.apache.commons.math.linear.RealVector) openMapRealVector60);
        int int62 = openMapRealVector57.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector64 = openMapRealVector57.mapAddToSelf((double) (byte) -1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector67 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector70 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector71 = openMapRealVector67.projection((org.apache.commons.math.linear.RealVector) openMapRealVector70);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor72 = openMapRealVector70.sparseIterator();
        org.apache.commons.math.linear.RealVector realVector73 = openMapRealVector64.projection((org.apache.commons.math.linear.RealVector) openMapRealVector70);
        openMapRealVector70.set(0.0d);
        java.lang.Double[] doubleArray79 = new java.lang.Double[] { 0.0d, (-1.0d), 100.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector81 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray79, (double) (byte) 1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector83 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray79, (double) (short) 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector84 = openMapRealVector70.append(openMapRealVector83);
        int int85 = openMapRealVector70.getMinIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector86 = openMapRealVector33.subtract(openMapRealVector70);
        openMapRealVector33.set((double) (-1.0f));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector70", openMapRealVector2.equals(openMapRealVector70) ? openMapRealVector2.hashCode() == openMapRealVector70.hashCode() : true);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector12);
        double double14 = openMapRealVector5.dotProduct(openMapRealVector9);
        int int15 = openMapRealVector5.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector18 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean19 = openMapRealVector18.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = openMapRealVector5.append((org.apache.commons.math.linear.RealVector) openMapRealVector18);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector27 = openMapRealVector23.projection((org.apache.commons.math.linear.RealVector) openMapRealVector26);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector30 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector33 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector34 = openMapRealVector30.projection((org.apache.commons.math.linear.RealVector) openMapRealVector33);
        double double35 = openMapRealVector26.dotProduct(openMapRealVector30);
        int int36 = openMapRealVector26.getMaxIndex();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor37 = openMapRealVector26.sparseIterator();
        double double38 = openMapRealVector5.dotProduct((org.apache.commons.math.linear.RealVector) openMapRealVector26);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector41 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector44 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector45 = openMapRealVector41.projection((org.apache.commons.math.linear.RealVector) openMapRealVector44);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector48 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector51 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector52 = openMapRealVector48.projection((org.apache.commons.math.linear.RealVector) openMapRealVector51);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector55 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector58 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector59 = openMapRealVector55.projection((org.apache.commons.math.linear.RealVector) openMapRealVector58);
        double double60 = openMapRealVector51.dotProduct(openMapRealVector55);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor61 = openMapRealVector55.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector62 = openMapRealVector44.append((org.apache.commons.math.linear.RealVector) openMapRealVector55);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector63 = openMapRealVector26.add(openMapRealVector44);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector66 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector69 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector70 = openMapRealVector66.projection((org.apache.commons.math.linear.RealVector) openMapRealVector69);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector73 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector76 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector77 = openMapRealVector73.projection((org.apache.commons.math.linear.RealVector) openMapRealVector76);
        double double78 = openMapRealVector69.dotProduct(openMapRealVector73);
        int int79 = openMapRealVector69.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector82 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean83 = openMapRealVector82.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector84 = openMapRealVector69.append((org.apache.commons.math.linear.RealVector) openMapRealVector82);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector88 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector91 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector92 = openMapRealVector88.projection((org.apache.commons.math.linear.RealVector) openMapRealVector91);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor93 = openMapRealVector91.sparseIterator();
        openMapRealVector82.setSubVector((int) (short) 0, (org.apache.commons.math.linear.RealVector) openMapRealVector91);
        double[] doubleArray95 = openMapRealVector82.toArray();
        double double96 = openMapRealVector63.dotProduct(doubleArray95);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector82", openMapRealVector2.equals(openMapRealVector82) ? openMapRealVector2.hashCode() == openMapRealVector82.hashCode() : true);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector12);
        double double14 = openMapRealVector5.dotProduct(openMapRealVector9);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector16 = openMapRealVector5.mapAdd((double) (short) 1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 100);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector22 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector25 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector26 = openMapRealVector22.projection((org.apache.commons.math.linear.RealVector) openMapRealVector25);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector29 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector32 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector33 = openMapRealVector29.projection((org.apache.commons.math.linear.RealVector) openMapRealVector32);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector36 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector39 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector40 = openMapRealVector36.projection((org.apache.commons.math.linear.RealVector) openMapRealVector39);
        double double41 = openMapRealVector32.dotProduct(openMapRealVector36);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor42 = openMapRealVector36.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector43 = openMapRealVector25.append((org.apache.commons.math.linear.RealVector) openMapRealVector36);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector45 = openMapRealVector36.append((double) 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector48 = openMapRealVector45.getSubVector((int) 'a', (int) (byte) 1);
        boolean boolean49 = openMapRealVector48.isNaN();
        org.apache.commons.math.linear.RealMatrix realMatrix50 = openMapRealVector19.outerProduct((org.apache.commons.math.linear.RealVector) openMapRealVector48);
        boolean boolean51 = openMapRealVector19.isInfinite();
        openMapRealVector16.setSubVector((int) (byte) 0, (org.apache.commons.math.linear.RealVector) openMapRealVector19);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector55 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector58 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector59 = openMapRealVector55.projection((org.apache.commons.math.linear.RealVector) openMapRealVector58);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector62 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector65 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector66 = openMapRealVector62.projection((org.apache.commons.math.linear.RealVector) openMapRealVector65);
        double double67 = openMapRealVector58.dotProduct(openMapRealVector62);
        int int68 = openMapRealVector58.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector71 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean72 = openMapRealVector71.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector73 = openMapRealVector58.append((org.apache.commons.math.linear.RealVector) openMapRealVector71);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector77 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector80 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector81 = openMapRealVector77.projection((org.apache.commons.math.linear.RealVector) openMapRealVector80);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor82 = openMapRealVector80.sparseIterator();
        openMapRealVector71.setSubVector((int) (short) 0, (org.apache.commons.math.linear.RealVector) openMapRealVector80);
        double[] doubleArray84 = openMapRealVector71.toArray();
        double[] doubleArray85 = openMapRealVector71.toArray();
        double double86 = openMapRealVector16.getL1Distance(doubleArray85);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector71", openMapRealVector2.equals(openMapRealVector71) ? openMapRealVector2.hashCode() == openMapRealVector71.hashCode() : true);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector12);
        double double14 = openMapRealVector5.dotProduct(openMapRealVector9);
        int int15 = openMapRealVector5.getMaxIndex();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor16 = openMapRealVector5.sparseIterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector22 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector23 = openMapRealVector19.projection((org.apache.commons.math.linear.RealVector) openMapRealVector22);
        int int24 = openMapRealVector19.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = openMapRealVector19.mapAddToSelf((double) (byte) -1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector29 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector32 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector33 = openMapRealVector29.projection((org.apache.commons.math.linear.RealVector) openMapRealVector32);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor34 = openMapRealVector32.sparseIterator();
        org.apache.commons.math.linear.RealVector realVector35 = openMapRealVector26.projection((org.apache.commons.math.linear.RealVector) openMapRealVector32);
        org.apache.commons.math.linear.RealVector realVector36 = openMapRealVector5.add((org.apache.commons.math.linear.RealVector) openMapRealVector26);
        int int37 = openMapRealVector5.getDimension();
        double double38 = openMapRealVector5.getMinValue();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector40 = openMapRealVector5.mapAddToSelf(0.0d);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor41 = openMapRealVector5.sparseIterator();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector5", openMapRealVector2.equals(openMapRealVector5) ? openMapRealVector2.hashCode() == openMapRealVector5.hashCode() : true);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector12);
        double double14 = openMapRealVector5.dotProduct(openMapRealVector9);
        int int15 = openMapRealVector5.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector18 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean19 = openMapRealVector18.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = openMapRealVector5.append((org.apache.commons.math.linear.RealVector) openMapRealVector18);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector21 = openMapRealVector5.copy();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector29 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector30 = openMapRealVector26.projection((org.apache.commons.math.linear.RealVector) openMapRealVector29);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector33 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector36 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector37 = openMapRealVector33.projection((org.apache.commons.math.linear.RealVector) openMapRealVector36);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector40 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector43 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector44 = openMapRealVector40.projection((org.apache.commons.math.linear.RealVector) openMapRealVector43);
        double double45 = openMapRealVector36.dotProduct(openMapRealVector40);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor46 = openMapRealVector40.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector47 = openMapRealVector29.append((org.apache.commons.math.linear.RealVector) openMapRealVector40);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector49 = openMapRealVector40.append((double) 10);
        org.apache.commons.math.linear.RealVector realVector50 = openMapRealVector21.combineToSelf((double) 'a', (double) 2, (org.apache.commons.math.linear.RealVector) openMapRealVector40);
        double double52 = openMapRealVector21.getEntry((int) (byte) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector21", openMapRealVector2.equals(openMapRealVector21) ? openMapRealVector2.hashCode() == openMapRealVector21.hashCode() : true);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector12);
        double double14 = openMapRealVector5.dotProduct(openMapRealVector9);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor15 = openMapRealVector9.iterator();
        boolean boolean16 = openMapRealVector9.isInfinite();
        double[] doubleArray22 = new double[] { 10, (-1.0d), 2, (short) 100, (byte) 10 };
        org.apache.commons.math.linear.RealVector realVector23 = openMapRealVector9.add(doubleArray22);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector27 = new org.apache.commons.math.linear.OpenMapRealVector(100, (int) '#', (-1.0d));
        org.apache.commons.math.linear.RealVector realVector29 = openMapRealVector27.mapDivide((double) 100.0f);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector31 = openMapRealVector27.append((double) 0.0f);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = openMapRealVector9.outerProduct((org.apache.commons.math.linear.RealVector) openMapRealVector31);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector35 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector38 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector39 = openMapRealVector35.projection((org.apache.commons.math.linear.RealVector) openMapRealVector38);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector42 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector45 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector46 = openMapRealVector42.projection((org.apache.commons.math.linear.RealVector) openMapRealVector45);
        double double47 = openMapRealVector38.dotProduct(openMapRealVector42);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor48 = openMapRealVector42.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector53 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector56 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector57 = openMapRealVector53.projection((org.apache.commons.math.linear.RealVector) openMapRealVector56);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector60 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector63 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector64 = openMapRealVector60.projection((org.apache.commons.math.linear.RealVector) openMapRealVector63);
        double double65 = openMapRealVector56.dotProduct(openMapRealVector60);
        int int66 = openMapRealVector56.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector69 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean70 = openMapRealVector69.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector71 = openMapRealVector56.append((org.apache.commons.math.linear.RealVector) openMapRealVector69);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector74 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector77 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector78 = openMapRealVector74.projection((org.apache.commons.math.linear.RealVector) openMapRealVector77);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector81 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector84 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector85 = openMapRealVector81.projection((org.apache.commons.math.linear.RealVector) openMapRealVector84);
        double double86 = openMapRealVector77.dotProduct(openMapRealVector81);
        int int87 = openMapRealVector77.getMaxIndex();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor88 = openMapRealVector77.sparseIterator();
        double double89 = openMapRealVector56.dotProduct((org.apache.commons.math.linear.RealVector) openMapRealVector77);
        org.apache.commons.math.linear.RealVector realVector90 = openMapRealVector42.combineToSelf(1.0d, (double) 100.0f, (org.apache.commons.math.linear.RealVector) openMapRealVector77);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector91 = openMapRealVector9.subtract((org.apache.commons.math.linear.RealVector) openMapRealVector42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector42", openMapRealVector2.equals(openMapRealVector42) ? openMapRealVector2.hashCode() == openMapRealVector42.hashCode() : true);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector12);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector16 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector20 = openMapRealVector16.projection((org.apache.commons.math.linear.RealVector) openMapRealVector19);
        double double21 = openMapRealVector12.dotProduct(openMapRealVector16);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor22 = openMapRealVector16.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = openMapRealVector5.append((org.apache.commons.math.linear.RealVector) openMapRealVector16);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector29 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector30 = openMapRealVector26.projection((org.apache.commons.math.linear.RealVector) openMapRealVector29);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector33 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector36 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector37 = openMapRealVector33.projection((org.apache.commons.math.linear.RealVector) openMapRealVector36);
        double double38 = openMapRealVector29.dotProduct(openMapRealVector33);
        int int39 = openMapRealVector29.getMaxIndex();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor40 = openMapRealVector29.sparseIterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector43 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector46 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector47 = openMapRealVector43.projection((org.apache.commons.math.linear.RealVector) openMapRealVector46);
        int int48 = openMapRealVector43.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector50 = openMapRealVector43.mapAddToSelf((double) (byte) -1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector53 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector56 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector57 = openMapRealVector53.projection((org.apache.commons.math.linear.RealVector) openMapRealVector56);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor58 = openMapRealVector56.sparseIterator();
        org.apache.commons.math.linear.RealVector realVector59 = openMapRealVector50.projection((org.apache.commons.math.linear.RealVector) openMapRealVector56);
        org.apache.commons.math.linear.RealVector realVector60 = openMapRealVector29.add((org.apache.commons.math.linear.RealVector) openMapRealVector50);
        double double61 = openMapRealVector50.getSparsity();
        double double62 = openMapRealVector5.dotProduct(openMapRealVector50);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector64 = openMapRealVector50.mapAdd((double) 1L);
        org.apache.commons.math.linear.RealVector realVector66 = openMapRealVector50.mapMultiply(101.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector64", openMapRealVector2.equals(openMapRealVector64) ? openMapRealVector2.hashCode() == openMapRealVector64.hashCode() : true);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector12);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector16 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector20 = openMapRealVector16.projection((org.apache.commons.math.linear.RealVector) openMapRealVector19);
        double double21 = openMapRealVector12.dotProduct(openMapRealVector16);
        int int22 = openMapRealVector12.getMaxIndex();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor23 = openMapRealVector12.sparseIterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector29 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector30 = openMapRealVector26.projection((org.apache.commons.math.linear.RealVector) openMapRealVector29);
        int int31 = openMapRealVector26.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector33 = openMapRealVector26.mapAddToSelf((double) (byte) -1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector36 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector39 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector40 = openMapRealVector36.projection((org.apache.commons.math.linear.RealVector) openMapRealVector39);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor41 = openMapRealVector39.sparseIterator();
        org.apache.commons.math.linear.RealVector realVector42 = openMapRealVector33.projection((org.apache.commons.math.linear.RealVector) openMapRealVector39);
        org.apache.commons.math.linear.RealVector realVector43 = openMapRealVector12.add((org.apache.commons.math.linear.RealVector) openMapRealVector33);
        double double44 = openMapRealVector33.getSparsity();
        double double45 = openMapRealVector33.getMaxValue();
        int int46 = openMapRealVector33.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector47 = openMapRealVector2.subtract((org.apache.commons.math.linear.RealVector) openMapRealVector33);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector52 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean53 = openMapRealVector52.isInfinite();
        org.apache.commons.math.linear.RealVector realVector54 = openMapRealVector33.combine((double) 100, (double) 10, (org.apache.commons.math.linear.RealVector) openMapRealVector52);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector57 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector60 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector61 = openMapRealVector57.projection((org.apache.commons.math.linear.RealVector) openMapRealVector60);
        int int62 = openMapRealVector57.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector64 = openMapRealVector57.mapAddToSelf((double) (byte) -1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector67 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector70 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector71 = openMapRealVector67.projection((org.apache.commons.math.linear.RealVector) openMapRealVector70);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor72 = openMapRealVector70.sparseIterator();
        org.apache.commons.math.linear.RealVector realVector73 = openMapRealVector64.projection((org.apache.commons.math.linear.RealVector) openMapRealVector70);
        openMapRealVector70.set(0.0d);
        java.lang.Double[] doubleArray79 = new java.lang.Double[] { 0.0d, (-1.0d), 100.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector81 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray79, (double) (byte) 1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector83 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray79, (double) (short) 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector84 = openMapRealVector70.append(openMapRealVector83);
        int int85 = openMapRealVector70.getMinIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector86 = openMapRealVector33.subtract(openMapRealVector70);
        org.apache.commons.math.linear.RealVector realVector88 = openMapRealVector33.mapDivideToSelf(301.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector70", openMapRealVector2.equals(openMapRealVector70) ? openMapRealVector2.hashCode() == openMapRealVector70.hashCode() : true);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        int int7 = openMapRealVector2.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector10 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector13 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector14 = openMapRealVector10.projection((org.apache.commons.math.linear.RealVector) openMapRealVector13);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector17 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector21 = openMapRealVector17.projection((org.apache.commons.math.linear.RealVector) openMapRealVector20);
        double double22 = openMapRealVector13.dotProduct(openMapRealVector17);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector25 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector28 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector29 = openMapRealVector25.projection((org.apache.commons.math.linear.RealVector) openMapRealVector28);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor30 = openMapRealVector28.sparseIterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector31 = openMapRealVector13.append(openMapRealVector28);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = openMapRealVector2.outerProduct((org.apache.commons.math.linear.RealVector) openMapRealVector28);
        org.apache.commons.math.linear.RealVector realVector34 = openMapRealVector2.mapDivideToSelf((double) (byte) 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector37 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector40 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector41 = openMapRealVector37.projection((org.apache.commons.math.linear.RealVector) openMapRealVector40);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector44 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector47 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector48 = openMapRealVector44.projection((org.apache.commons.math.linear.RealVector) openMapRealVector47);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector51 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector54 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector55 = openMapRealVector51.projection((org.apache.commons.math.linear.RealVector) openMapRealVector54);
        double double56 = openMapRealVector47.dotProduct(openMapRealVector51);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor57 = openMapRealVector51.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector58 = openMapRealVector40.append((org.apache.commons.math.linear.RealVector) openMapRealVector51);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector60 = openMapRealVector51.mapAdd((double) (byte) 0);
        double double61 = openMapRealVector2.dotProduct(openMapRealVector60);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector63 = new org.apache.commons.math.linear.OpenMapRealVector((int) 'a');
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector65 = openMapRealVector63.append((double) 1.0f);
        double double66 = openMapRealVector65.getLInfNorm();
        double double67 = openMapRealVector65.getSparsity();
        double double68 = openMapRealVector2.getDistance(openMapRealVector65);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector5 and openMapRealVector60", openMapRealVector5.equals(openMapRealVector60) ? openMapRealVector5.hashCode() == openMapRealVector60.hashCode() : true);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean3 = openMapRealVector2.isInfinite();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor4 = openMapRealVector2.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector10 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector11 = openMapRealVector7.projection((org.apache.commons.math.linear.RealVector) openMapRealVector10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector17 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector18 = openMapRealVector14.projection((org.apache.commons.math.linear.RealVector) openMapRealVector17);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector21 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector24 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector25 = openMapRealVector21.projection((org.apache.commons.math.linear.RealVector) openMapRealVector24);
        double double26 = openMapRealVector17.dotProduct(openMapRealVector21);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor27 = openMapRealVector21.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector28 = openMapRealVector10.append((org.apache.commons.math.linear.RealVector) openMapRealVector21);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector30 = openMapRealVector21.append((double) 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector31 = new org.apache.commons.math.linear.OpenMapRealVector(openMapRealVector30);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector33 = openMapRealVector31.append((double) 1.0f);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector36 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector39 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector40 = openMapRealVector36.projection((org.apache.commons.math.linear.RealVector) openMapRealVector39);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector43 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector46 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector47 = openMapRealVector43.projection((org.apache.commons.math.linear.RealVector) openMapRealVector46);
        double double48 = openMapRealVector39.dotProduct(openMapRealVector43);
        int int49 = openMapRealVector39.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector52 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean53 = openMapRealVector52.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector54 = openMapRealVector39.append((org.apache.commons.math.linear.RealVector) openMapRealVector52);
        double[] doubleArray59 = new double[] { 100.0d, (-1.0d), (-1.0f) };
        openMapRealVector54.setSubVector(99, doubleArray59);
        org.apache.commons.math.linear.RealMatrix realMatrix61 = openMapRealVector31.outerProduct(doubleArray59);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector65 = new org.apache.commons.math.linear.OpenMapRealVector(96, 0);
        openMapRealVector31.setSubVector(0, (org.apache.commons.math.linear.RealVector) openMapRealVector65);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector67 = openMapRealVector2.append(openMapRealVector65);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector30 and openMapRealVector31", openMapRealVector30.equals(openMapRealVector31) ? openMapRealVector30.hashCode() == openMapRealVector31.hashCode() : true);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector12);
        double double14 = openMapRealVector5.dotProduct(openMapRealVector9);
        int int15 = openMapRealVector5.getMaxIndex();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor16 = openMapRealVector5.sparseIterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector22 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector23 = openMapRealVector19.projection((org.apache.commons.math.linear.RealVector) openMapRealVector22);
        int int24 = openMapRealVector19.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = openMapRealVector19.mapAddToSelf((double) (byte) -1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector29 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector32 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector33 = openMapRealVector29.projection((org.apache.commons.math.linear.RealVector) openMapRealVector32);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor34 = openMapRealVector32.sparseIterator();
        org.apache.commons.math.linear.RealVector realVector35 = openMapRealVector26.projection((org.apache.commons.math.linear.RealVector) openMapRealVector32);
        org.apache.commons.math.linear.RealVector realVector36 = openMapRealVector5.add((org.apache.commons.math.linear.RealVector) openMapRealVector26);
        double double38 = openMapRealVector5.getEntry((int) (byte) 1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector40 = openMapRealVector5.append((double) 'a');
        int int41 = openMapRealVector5.getMaxIndex();
        double[] doubleArray42 = openMapRealVector5.toArray();
        double double43 = openMapRealVector5.getSparsity();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector46 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector51 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector54 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector55 = openMapRealVector51.projection((org.apache.commons.math.linear.RealVector) openMapRealVector54);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector58 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector61 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector62 = openMapRealVector58.projection((org.apache.commons.math.linear.RealVector) openMapRealVector61);
        double double63 = openMapRealVector54.dotProduct(openMapRealVector58);
        int int64 = openMapRealVector54.getMaxIndex();
        org.apache.commons.math.linear.RealVector realVector65 = openMapRealVector46.combineToSelf((double) (byte) -1, (double) '4', (org.apache.commons.math.linear.RealVector) openMapRealVector54);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector66 = openMapRealVector5.ebeDivide(realVector65);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and realVector65", openMapRealVector2.equals(realVector65) ? openMapRealVector2.hashCode() == realVector65.hashCode() : true);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        int int7 = openMapRealVector2.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector2.mapAddToSelf((double) (byte) -1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector16 = openMapRealVector12.projection((org.apache.commons.math.linear.RealVector) openMapRealVector15);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor17 = openMapRealVector15.sparseIterator();
        org.apache.commons.math.linear.RealVector realVector18 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector15);
        openMapRealVector15.set(0.0d);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector27 = openMapRealVector23.projection((org.apache.commons.math.linear.RealVector) openMapRealVector26);
        double[] doubleArray28 = openMapRealVector26.getData();
        double double29 = openMapRealVector15.getDistance(doubleArray28);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector30 = new org.apache.commons.math.linear.OpenMapRealVector(openMapRealVector15);
        int int31 = openMapRealVector15.getDimension();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector5 and openMapRealVector30", openMapRealVector5.equals(openMapRealVector30) ? openMapRealVector5.hashCode() == openMapRealVector30.hashCode() : true);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector12);
        double double14 = openMapRealVector5.dotProduct(openMapRealVector9);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector16 = openMapRealVector5.mapAdd((double) (short) 1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 100);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector22 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector25 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector26 = openMapRealVector22.projection((org.apache.commons.math.linear.RealVector) openMapRealVector25);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector29 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector32 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector33 = openMapRealVector29.projection((org.apache.commons.math.linear.RealVector) openMapRealVector32);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector36 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector39 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector40 = openMapRealVector36.projection((org.apache.commons.math.linear.RealVector) openMapRealVector39);
        double double41 = openMapRealVector32.dotProduct(openMapRealVector36);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor42 = openMapRealVector36.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector43 = openMapRealVector25.append((org.apache.commons.math.linear.RealVector) openMapRealVector36);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector45 = openMapRealVector36.append((double) 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector48 = openMapRealVector45.getSubVector((int) 'a', (int) (byte) 1);
        boolean boolean49 = openMapRealVector48.isNaN();
        org.apache.commons.math.linear.RealMatrix realMatrix50 = openMapRealVector19.outerProduct((org.apache.commons.math.linear.RealVector) openMapRealVector48);
        boolean boolean51 = openMapRealVector19.isInfinite();
        openMapRealVector16.setSubVector((int) (byte) 0, (org.apache.commons.math.linear.RealVector) openMapRealVector19);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector57 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector60 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector61 = openMapRealVector57.projection((org.apache.commons.math.linear.RealVector) openMapRealVector60);
        double[] doubleArray62 = openMapRealVector60.getData();
        org.apache.commons.math.linear.RealVector realVector64 = openMapRealVector60.mapSubtract(Double.NaN);
        org.apache.commons.math.linear.RealVector realVector65 = openMapRealVector19.combine(0.0d, (double) 200, realVector64);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector16", openMapRealVector2.equals(openMapRealVector16) ? openMapRealVector2.hashCode() == openMapRealVector16.hashCode() : true);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector12);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector16 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector20 = openMapRealVector16.projection((org.apache.commons.math.linear.RealVector) openMapRealVector19);
        double double21 = openMapRealVector12.dotProduct(openMapRealVector16);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor22 = openMapRealVector16.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = openMapRealVector5.append((org.apache.commons.math.linear.RealVector) openMapRealVector16);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector25 = openMapRealVector16.append((double) 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector28 = openMapRealVector25.getSubVector((int) 'a', (int) (byte) 1);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor29 = openMapRealVector28.iterator();
        org.apache.commons.math.linear.RealVector realVector31 = openMapRealVector28.mapSubtractToSelf((double) (short) 1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector34 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector37 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector38 = openMapRealVector34.projection((org.apache.commons.math.linear.RealVector) openMapRealVector37);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector41 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector44 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector45 = openMapRealVector41.projection((org.apache.commons.math.linear.RealVector) openMapRealVector44);
        double double46 = openMapRealVector37.dotProduct(openMapRealVector41);
        int int47 = openMapRealVector37.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector50 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean51 = openMapRealVector50.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector52 = openMapRealVector37.append((org.apache.commons.math.linear.RealVector) openMapRealVector50);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector56 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector59 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector60 = openMapRealVector56.projection((org.apache.commons.math.linear.RealVector) openMapRealVector59);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor61 = openMapRealVector59.sparseIterator();
        openMapRealVector50.setSubVector((int) (short) 0, (org.apache.commons.math.linear.RealVector) openMapRealVector59);
        double double63 = openMapRealVector50.getLInfNorm();
        double double64 = openMapRealVector28.getDistance(openMapRealVector50);
        org.apache.commons.math.linear.RealVector realVector66 = openMapRealVector50.mapMultiply((double) 1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector69 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector72 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector73 = openMapRealVector69.projection((org.apache.commons.math.linear.RealVector) openMapRealVector72);
        int int74 = openMapRealVector69.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector76 = openMapRealVector69.mapAddToSelf((double) (byte) -1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector79 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector82 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector83 = openMapRealVector79.projection((org.apache.commons.math.linear.RealVector) openMapRealVector82);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor84 = openMapRealVector82.sparseIterator();
        org.apache.commons.math.linear.RealVector realVector85 = openMapRealVector76.projection((org.apache.commons.math.linear.RealVector) openMapRealVector82);
        boolean boolean86 = openMapRealVector82.isInfinite();
        double[] doubleArray87 = openMapRealVector82.getData();
        org.apache.commons.math.linear.RealVector realVector88 = openMapRealVector50.add(doubleArray87);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and realVector66", openMapRealVector2.equals(realVector66) ? openMapRealVector2.hashCode() == realVector66.hashCode() : true);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector12);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector16 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector20 = openMapRealVector16.projection((org.apache.commons.math.linear.RealVector) openMapRealVector19);
        double double21 = openMapRealVector12.dotProduct(openMapRealVector16);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor22 = openMapRealVector16.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = openMapRealVector5.append((org.apache.commons.math.linear.RealVector) openMapRealVector16);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector25 = openMapRealVector16.append((double) 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector28 = openMapRealVector25.getSubVector((int) 'a', (int) (byte) 1);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor29 = openMapRealVector28.iterator();
        org.apache.commons.math.linear.RealVector realVector31 = openMapRealVector28.mapSubtractToSelf((double) (short) 1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector34 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector37 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector38 = openMapRealVector34.projection((org.apache.commons.math.linear.RealVector) openMapRealVector37);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector41 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector44 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector45 = openMapRealVector41.projection((org.apache.commons.math.linear.RealVector) openMapRealVector44);
        double double46 = openMapRealVector37.dotProduct(openMapRealVector41);
        int int47 = openMapRealVector37.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector50 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean51 = openMapRealVector50.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector52 = openMapRealVector37.append((org.apache.commons.math.linear.RealVector) openMapRealVector50);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector56 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector59 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector60 = openMapRealVector56.projection((org.apache.commons.math.linear.RealVector) openMapRealVector59);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor61 = openMapRealVector59.sparseIterator();
        openMapRealVector50.setSubVector((int) (short) 0, (org.apache.commons.math.linear.RealVector) openMapRealVector59);
        double double63 = openMapRealVector50.getLInfNorm();
        double double64 = openMapRealVector28.getDistance(openMapRealVector50);
        org.apache.commons.math.linear.RealVector realVector66 = openMapRealVector50.mapMultiply((double) 1);
        double double68 = openMapRealVector50.getEntry(2);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and realVector66", openMapRealVector2.equals(realVector66) ? openMapRealVector2.hashCode() == realVector66.hashCode() : true);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector12);
        double double14 = openMapRealVector5.dotProduct(openMapRealVector9);
        int int15 = openMapRealVector5.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector18 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean19 = openMapRealVector18.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = openMapRealVector5.append((org.apache.commons.math.linear.RealVector) openMapRealVector18);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector21 = openMapRealVector5.copy();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector29 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector30 = openMapRealVector26.projection((org.apache.commons.math.linear.RealVector) openMapRealVector29);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector33 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector36 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector37 = openMapRealVector33.projection((org.apache.commons.math.linear.RealVector) openMapRealVector36);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector40 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector43 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector44 = openMapRealVector40.projection((org.apache.commons.math.linear.RealVector) openMapRealVector43);
        double double45 = openMapRealVector36.dotProduct(openMapRealVector40);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor46 = openMapRealVector40.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector47 = openMapRealVector29.append((org.apache.commons.math.linear.RealVector) openMapRealVector40);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector49 = openMapRealVector40.append((double) 10);
        org.apache.commons.math.linear.RealVector realVector50 = openMapRealVector21.combineToSelf((double) 'a', (double) 2, (org.apache.commons.math.linear.RealVector) openMapRealVector40);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor51 = openMapRealVector21.sparseIterator();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector21", openMapRealVector2.equals(openMapRealVector21) ? openMapRealVector2.hashCode() == openMapRealVector21.hashCode() : true);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean3 = openMapRealVector2.isInfinite();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor4 = openMapRealVector2.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 1);
        openMapRealVector2.setSubVector((int) ' ', (org.apache.commons.math.linear.RealVector) openMapRealVector7);
        boolean boolean9 = openMapRealVector2.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector16 = openMapRealVector12.projection((org.apache.commons.math.linear.RealVector) openMapRealVector15);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector22 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector23 = openMapRealVector19.projection((org.apache.commons.math.linear.RealVector) openMapRealVector22);
        double double24 = openMapRealVector15.dotProduct(openMapRealVector19);
        int int25 = openMapRealVector15.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector28 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean29 = openMapRealVector28.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector30 = openMapRealVector15.append((org.apache.commons.math.linear.RealVector) openMapRealVector28);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector33 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector36 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector37 = openMapRealVector33.projection((org.apache.commons.math.linear.RealVector) openMapRealVector36);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector40 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector43 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector44 = openMapRealVector40.projection((org.apache.commons.math.linear.RealVector) openMapRealVector43);
        double double45 = openMapRealVector36.dotProduct(openMapRealVector40);
        int int46 = openMapRealVector36.getMaxIndex();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor47 = openMapRealVector36.sparseIterator();
        double double48 = openMapRealVector15.dotProduct((org.apache.commons.math.linear.RealVector) openMapRealVector36);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector51 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector54 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector55 = openMapRealVector51.projection((org.apache.commons.math.linear.RealVector) openMapRealVector54);
        int int56 = openMapRealVector51.getMaxIndex();
        double double57 = openMapRealVector36.getL1Distance((org.apache.commons.math.linear.RealVector) openMapRealVector51);
        int int58 = openMapRealVector51.getMaxIndex();
        org.apache.commons.math.linear.RealVector realVector60 = openMapRealVector51.mapDivide((double) 10.0f);
        double[] doubleArray61 = openMapRealVector51.toArray();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector62 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray61);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector63 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray61);
        double double64 = openMapRealVector2.getDistance(doubleArray61);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector65 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray61);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector12", openMapRealVector2.equals(openMapRealVector12) ? openMapRealVector2.hashCode() == openMapRealVector12.hashCode() : true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        int int7 = openMapRealVector2.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector2.mapAddToSelf((double) (byte) -1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector16 = openMapRealVector12.projection((org.apache.commons.math.linear.RealVector) openMapRealVector15);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor17 = openMapRealVector15.sparseIterator();
        org.apache.commons.math.linear.RealVector realVector18 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector15);
        openMapRealVector15.set(0.0d);
        java.lang.Double[] doubleArray24 = new java.lang.Double[] { 0.0d, (-1.0d), 100.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray24, (double) (byte) 1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector28 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray24, (double) (short) 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector29 = openMapRealVector15.append(openMapRealVector28);
        double[] doubleArray30 = openMapRealVector28.getData();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector5 and openMapRealVector15", openMapRealVector5.equals(openMapRealVector15) ? openMapRealVector5.hashCode() == openMapRealVector15.hashCode() : true);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean3 = openMapRealVector2.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector12);
        int int14 = openMapRealVector9.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector16 = openMapRealVector9.mapAddToSelf((double) (byte) -1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector22 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector23 = openMapRealVector19.projection((org.apache.commons.math.linear.RealVector) openMapRealVector22);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor24 = openMapRealVector22.sparseIterator();
        org.apache.commons.math.linear.RealVector realVector25 = openMapRealVector16.projection((org.apache.commons.math.linear.RealVector) openMapRealVector22);
        org.apache.commons.math.linear.RealVector realVector27 = openMapRealVector16.mapMultiply(100.0d);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector30 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector33 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector34 = openMapRealVector30.projection((org.apache.commons.math.linear.RealVector) openMapRealVector33);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector37 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector40 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector41 = openMapRealVector37.projection((org.apache.commons.math.linear.RealVector) openMapRealVector40);
        double double42 = openMapRealVector33.dotProduct(openMapRealVector37);
        int int43 = openMapRealVector33.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector46 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean47 = openMapRealVector46.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector48 = openMapRealVector33.append((org.apache.commons.math.linear.RealVector) openMapRealVector46);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector51 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector54 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector55 = openMapRealVector51.projection((org.apache.commons.math.linear.RealVector) openMapRealVector54);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector58 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector61 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector62 = openMapRealVector58.projection((org.apache.commons.math.linear.RealVector) openMapRealVector61);
        double double63 = openMapRealVector54.dotProduct(openMapRealVector58);
        int int64 = openMapRealVector54.getMaxIndex();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor65 = openMapRealVector54.sparseIterator();
        double double66 = openMapRealVector33.dotProduct((org.apache.commons.math.linear.RealVector) openMapRealVector54);
        org.apache.commons.math.linear.RealVector realVector68 = openMapRealVector54.mapMultiply((double) 100);
        double[] doubleArray69 = openMapRealVector54.toArray();
        double double70 = openMapRealVector16.getL1Distance(doubleArray69);
        org.apache.commons.math.linear.RealVector realVector71 = openMapRealVector4.combine((double) 0, 10.0d, doubleArray69);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector72 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray69);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and realVector71", openMapRealVector2.equals(realVector71) ? openMapRealVector2.hashCode() == realVector71.hashCode() : true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector12);
        double double14 = openMapRealVector5.dotProduct(openMapRealVector9);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor15 = openMapRealVector9.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector24 = openMapRealVector20.projection((org.apache.commons.math.linear.RealVector) openMapRealVector23);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector27 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector30 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector31 = openMapRealVector27.projection((org.apache.commons.math.linear.RealVector) openMapRealVector30);
        double double32 = openMapRealVector23.dotProduct(openMapRealVector27);
        int int33 = openMapRealVector23.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector36 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean37 = openMapRealVector36.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector38 = openMapRealVector23.append((org.apache.commons.math.linear.RealVector) openMapRealVector36);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector41 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector44 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector45 = openMapRealVector41.projection((org.apache.commons.math.linear.RealVector) openMapRealVector44);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector48 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector51 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector52 = openMapRealVector48.projection((org.apache.commons.math.linear.RealVector) openMapRealVector51);
        double double53 = openMapRealVector44.dotProduct(openMapRealVector48);
        int int54 = openMapRealVector44.getMaxIndex();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor55 = openMapRealVector44.sparseIterator();
        double double56 = openMapRealVector23.dotProduct((org.apache.commons.math.linear.RealVector) openMapRealVector44);
        org.apache.commons.math.linear.RealVector realVector57 = openMapRealVector9.combineToSelf(1.0d, (double) 100.0f, (org.apache.commons.math.linear.RealVector) openMapRealVector44);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector60 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean61 = openMapRealVector60.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector62 = new org.apache.commons.math.linear.OpenMapRealVector(openMapRealVector60);
        org.apache.commons.math.linear.RealVector realVector64 = openMapRealVector62.mapSubtract((double) 0L);
        double double65 = openMapRealVector44.getDistance(openMapRealVector62);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector9", openMapRealVector2.equals(openMapRealVector9) ? openMapRealVector2.hashCode() == openMapRealVector9.hashCode() : true);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector12);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector16 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector20 = openMapRealVector16.projection((org.apache.commons.math.linear.RealVector) openMapRealVector19);
        double double21 = openMapRealVector12.dotProduct(openMapRealVector16);
        int int22 = openMapRealVector12.getMaxIndex();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor23 = openMapRealVector12.sparseIterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector29 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector30 = openMapRealVector26.projection((org.apache.commons.math.linear.RealVector) openMapRealVector29);
        int int31 = openMapRealVector26.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector33 = openMapRealVector26.mapAddToSelf((double) (byte) -1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector36 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector39 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector40 = openMapRealVector36.projection((org.apache.commons.math.linear.RealVector) openMapRealVector39);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor41 = openMapRealVector39.sparseIterator();
        org.apache.commons.math.linear.RealVector realVector42 = openMapRealVector33.projection((org.apache.commons.math.linear.RealVector) openMapRealVector39);
        org.apache.commons.math.linear.RealVector realVector43 = openMapRealVector12.add((org.apache.commons.math.linear.RealVector) openMapRealVector33);
        double double44 = openMapRealVector33.getSparsity();
        double double45 = openMapRealVector33.getMaxValue();
        int int46 = openMapRealVector33.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector47 = openMapRealVector2.subtract((org.apache.commons.math.linear.RealVector) openMapRealVector33);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector52 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean53 = openMapRealVector52.isInfinite();
        org.apache.commons.math.linear.RealVector realVector54 = openMapRealVector33.combine((double) 100, (double) 10, (org.apache.commons.math.linear.RealVector) openMapRealVector52);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector57 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector60 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector61 = openMapRealVector57.projection((org.apache.commons.math.linear.RealVector) openMapRealVector60);
        int int62 = openMapRealVector57.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector64 = openMapRealVector57.mapAddToSelf((double) (byte) -1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector67 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector70 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector71 = openMapRealVector67.projection((org.apache.commons.math.linear.RealVector) openMapRealVector70);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor72 = openMapRealVector70.sparseIterator();
        org.apache.commons.math.linear.RealVector realVector73 = openMapRealVector64.projection((org.apache.commons.math.linear.RealVector) openMapRealVector70);
        openMapRealVector70.set(0.0d);
        java.lang.Double[] doubleArray79 = new java.lang.Double[] { 0.0d, (-1.0d), 100.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector81 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray79, (double) (byte) 1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector83 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray79, (double) (short) 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector84 = openMapRealVector70.append(openMapRealVector83);
        int int85 = openMapRealVector70.getMinIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector86 = openMapRealVector33.subtract(openMapRealVector70);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector87 = new org.apache.commons.math.linear.OpenMapRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector86);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector70", openMapRealVector2.equals(openMapRealVector70) ? openMapRealVector2.hashCode() == openMapRealVector70.hashCode() : true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector12);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector16 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector20 = openMapRealVector16.projection((org.apache.commons.math.linear.RealVector) openMapRealVector19);
        double double21 = openMapRealVector12.dotProduct(openMapRealVector16);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor22 = openMapRealVector16.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = openMapRealVector5.append((org.apache.commons.math.linear.RealVector) openMapRealVector16);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector25 = openMapRealVector16.append((double) 10);
        double double26 = openMapRealVector16.getNorm();
        org.apache.commons.math.linear.RealVector realVector28 = openMapRealVector16.mapSubtract((double) 0.0f);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector29 = new org.apache.commons.math.linear.OpenMapRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and realVector28", openMapRealVector2.equals(realVector28) ? openMapRealVector2.hashCode() == realVector28.hashCode() : true);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector3 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 100, 0, (double) 100.0f);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector8 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector11 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector12 = openMapRealVector8.projection((org.apache.commons.math.linear.RealVector) openMapRealVector11);
        int int13 = openMapRealVector8.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector16 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector20 = openMapRealVector16.projection((org.apache.commons.math.linear.RealVector) openMapRealVector19);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector27 = openMapRealVector23.projection((org.apache.commons.math.linear.RealVector) openMapRealVector26);
        double double28 = openMapRealVector19.dotProduct(openMapRealVector23);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector31 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector34 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector35 = openMapRealVector31.projection((org.apache.commons.math.linear.RealVector) openMapRealVector34);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor36 = openMapRealVector34.sparseIterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector37 = openMapRealVector19.append(openMapRealVector34);
        org.apache.commons.math.linear.RealMatrix realMatrix38 = openMapRealVector8.outerProduct((org.apache.commons.math.linear.RealVector) openMapRealVector34);
        org.apache.commons.math.linear.RealVector realVector40 = openMapRealVector8.mapDivideToSelf((double) (byte) 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector43 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector46 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector47 = openMapRealVector43.projection((org.apache.commons.math.linear.RealVector) openMapRealVector46);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector50 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector53 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector54 = openMapRealVector50.projection((org.apache.commons.math.linear.RealVector) openMapRealVector53);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector57 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector60 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector61 = openMapRealVector57.projection((org.apache.commons.math.linear.RealVector) openMapRealVector60);
        double double62 = openMapRealVector53.dotProduct(openMapRealVector57);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor63 = openMapRealVector57.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector64 = openMapRealVector46.append((org.apache.commons.math.linear.RealVector) openMapRealVector57);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector66 = openMapRealVector57.mapAdd((double) (byte) 0);
        double double67 = openMapRealVector8.dotProduct(openMapRealVector66);
        double[] doubleArray68 = openMapRealVector66.getData();
        org.apache.commons.math.linear.RealVector realVector69 = openMapRealVector3.combine((double) (byte) 1, 14.142135623730951d, doubleArray68);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector8 and openMapRealVector66", openMapRealVector8.equals(openMapRealVector66) ? openMapRealVector8.hashCode() == openMapRealVector66.hashCode() : true);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector12);
        double double14 = openMapRealVector5.dotProduct(openMapRealVector9);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor15 = openMapRealVector9.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector24 = openMapRealVector20.projection((org.apache.commons.math.linear.RealVector) openMapRealVector23);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector27 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector30 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector31 = openMapRealVector27.projection((org.apache.commons.math.linear.RealVector) openMapRealVector30);
        double double32 = openMapRealVector23.dotProduct(openMapRealVector27);
        int int33 = openMapRealVector23.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector36 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean37 = openMapRealVector36.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector38 = openMapRealVector23.append((org.apache.commons.math.linear.RealVector) openMapRealVector36);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector41 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector44 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector45 = openMapRealVector41.projection((org.apache.commons.math.linear.RealVector) openMapRealVector44);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector48 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector51 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector52 = openMapRealVector48.projection((org.apache.commons.math.linear.RealVector) openMapRealVector51);
        double double53 = openMapRealVector44.dotProduct(openMapRealVector48);
        int int54 = openMapRealVector44.getMaxIndex();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor55 = openMapRealVector44.sparseIterator();
        double double56 = openMapRealVector23.dotProduct((org.apache.commons.math.linear.RealVector) openMapRealVector44);
        org.apache.commons.math.linear.RealVector realVector57 = openMapRealVector9.combineToSelf(1.0d, (double) 100.0f, (org.apache.commons.math.linear.RealVector) openMapRealVector44);
        double[] doubleArray58 = openMapRealVector44.getData();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector9", openMapRealVector2.equals(openMapRealVector9) ? openMapRealVector2.hashCode() == openMapRealVector9.hashCode() : true);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector12);
        double double14 = openMapRealVector5.dotProduct(openMapRealVector9);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor15 = openMapRealVector9.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector24 = openMapRealVector20.projection((org.apache.commons.math.linear.RealVector) openMapRealVector23);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector27 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector30 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector31 = openMapRealVector27.projection((org.apache.commons.math.linear.RealVector) openMapRealVector30);
        double double32 = openMapRealVector23.dotProduct(openMapRealVector27);
        int int33 = openMapRealVector23.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector36 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean37 = openMapRealVector36.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector38 = openMapRealVector23.append((org.apache.commons.math.linear.RealVector) openMapRealVector36);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector41 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector44 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector45 = openMapRealVector41.projection((org.apache.commons.math.linear.RealVector) openMapRealVector44);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector48 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector51 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector52 = openMapRealVector48.projection((org.apache.commons.math.linear.RealVector) openMapRealVector51);
        double double53 = openMapRealVector44.dotProduct(openMapRealVector48);
        int int54 = openMapRealVector44.getMaxIndex();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor55 = openMapRealVector44.sparseIterator();
        double double56 = openMapRealVector23.dotProduct((org.apache.commons.math.linear.RealVector) openMapRealVector44);
        org.apache.commons.math.linear.RealVector realVector57 = openMapRealVector9.combineToSelf(1.0d, (double) 100.0f, (org.apache.commons.math.linear.RealVector) openMapRealVector44);
        double double58 = openMapRealVector9.getMaxValue();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector9", openMapRealVector2.equals(openMapRealVector9) ? openMapRealVector2.hashCode() == openMapRealVector9.hashCode() : true);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector12);
        double double14 = openMapRealVector5.dotProduct(openMapRealVector9);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor15 = openMapRealVector9.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector24 = openMapRealVector20.projection((org.apache.commons.math.linear.RealVector) openMapRealVector23);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector27 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector30 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector31 = openMapRealVector27.projection((org.apache.commons.math.linear.RealVector) openMapRealVector30);
        double double32 = openMapRealVector23.dotProduct(openMapRealVector27);
        int int33 = openMapRealVector23.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector36 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean37 = openMapRealVector36.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector38 = openMapRealVector23.append((org.apache.commons.math.linear.RealVector) openMapRealVector36);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector41 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector44 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector45 = openMapRealVector41.projection((org.apache.commons.math.linear.RealVector) openMapRealVector44);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector48 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector51 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector52 = openMapRealVector48.projection((org.apache.commons.math.linear.RealVector) openMapRealVector51);
        double double53 = openMapRealVector44.dotProduct(openMapRealVector48);
        int int54 = openMapRealVector44.getMaxIndex();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor55 = openMapRealVector44.sparseIterator();
        double double56 = openMapRealVector23.dotProduct((org.apache.commons.math.linear.RealVector) openMapRealVector44);
        org.apache.commons.math.linear.RealVector realVector57 = openMapRealVector9.combineToSelf(1.0d, (double) 100.0f, (org.apache.commons.math.linear.RealVector) openMapRealVector44);
        int int58 = openMapRealVector44.getMinIndex();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector9", openMapRealVector2.equals(openMapRealVector9) ? openMapRealVector2.hashCode() == openMapRealVector9.hashCode() : true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector(100);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector8 = openMapRealVector4.projection((org.apache.commons.math.linear.RealVector) openMapRealVector7);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector11 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector15 = openMapRealVector11.projection((org.apache.commons.math.linear.RealVector) openMapRealVector14);
        double double16 = openMapRealVector7.dotProduct(openMapRealVector11);
        int int17 = openMapRealVector7.getMaxIndex();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor18 = openMapRealVector7.sparseIterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector21 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector24 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector25 = openMapRealVector21.projection((org.apache.commons.math.linear.RealVector) openMapRealVector24);
        int int26 = openMapRealVector21.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector28 = openMapRealVector21.mapAddToSelf((double) (byte) -1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector31 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector34 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector35 = openMapRealVector31.projection((org.apache.commons.math.linear.RealVector) openMapRealVector34);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor36 = openMapRealVector34.sparseIterator();
        org.apache.commons.math.linear.RealVector realVector37 = openMapRealVector28.projection((org.apache.commons.math.linear.RealVector) openMapRealVector34);
        org.apache.commons.math.linear.RealVector realVector38 = openMapRealVector7.add((org.apache.commons.math.linear.RealVector) openMapRealVector28);
        double double39 = openMapRealVector7.getL1Norm();
        double[] doubleArray40 = openMapRealVector7.getData();
        org.apache.commons.math.linear.RealVector realVector41 = openMapRealVector1.add(doubleArray40);
        org.apache.commons.math.linear.RealVector realVector43 = openMapRealVector1.mapDivide((double) 10.0f);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on realVector41 and openMapRealVector4.", realVector41.equals(openMapRealVector4) == openMapRealVector4.equals(realVector41));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector12);
        double double14 = openMapRealVector5.dotProduct(openMapRealVector9);
        int int15 = openMapRealVector5.getMaxIndex();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor16 = openMapRealVector5.sparseIterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector22 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector23 = openMapRealVector19.projection((org.apache.commons.math.linear.RealVector) openMapRealVector22);
        int int24 = openMapRealVector19.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = openMapRealVector19.mapAddToSelf((double) (byte) -1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector29 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector32 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector33 = openMapRealVector29.projection((org.apache.commons.math.linear.RealVector) openMapRealVector32);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor34 = openMapRealVector32.sparseIterator();
        org.apache.commons.math.linear.RealVector realVector35 = openMapRealVector26.projection((org.apache.commons.math.linear.RealVector) openMapRealVector32);
        org.apache.commons.math.linear.RealVector realVector36 = openMapRealVector5.add((org.apache.commons.math.linear.RealVector) openMapRealVector26);
        double double37 = openMapRealVector5.getL1Norm();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector40 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector43 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector44 = openMapRealVector40.projection((org.apache.commons.math.linear.RealVector) openMapRealVector43);
        int int45 = openMapRealVector40.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector48 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector51 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector52 = openMapRealVector48.projection((org.apache.commons.math.linear.RealVector) openMapRealVector51);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector55 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector58 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector59 = openMapRealVector55.projection((org.apache.commons.math.linear.RealVector) openMapRealVector58);
        double double60 = openMapRealVector51.dotProduct(openMapRealVector55);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector63 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector66 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector67 = openMapRealVector63.projection((org.apache.commons.math.linear.RealVector) openMapRealVector66);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor68 = openMapRealVector66.sparseIterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector69 = openMapRealVector51.append(openMapRealVector66);
        org.apache.commons.math.linear.RealMatrix realMatrix70 = openMapRealVector40.outerProduct((org.apache.commons.math.linear.RealVector) openMapRealVector66);
        double double71 = openMapRealVector5.dotProduct(openMapRealVector66);
        double double72 = openMapRealVector5.getLInfNorm();
        org.apache.commons.math.linear.RealVector realVector74 = openMapRealVector5.mapSubtractToSelf(0.0d);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector76 = openMapRealVector5.append((double) (short) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector5", openMapRealVector2.equals(openMapRealVector5) ? openMapRealVector2.hashCode() == openMapRealVector5.hashCode() : true);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector12);
        double double14 = openMapRealVector5.dotProduct(openMapRealVector9);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector16 = openMapRealVector5.mapAdd((double) (short) 1);
        boolean boolean17 = openMapRealVector16.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector18 = openMapRealVector16.unitVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector22 = new org.apache.commons.math.linear.OpenMapRealVector(100, (int) '#', (-1.0d));
        org.apache.commons.math.linear.RealVector realVector24 = openMapRealVector22.mapDivide((double) 100.0f);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = openMapRealVector22.append((double) 0.0f);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector27 = openMapRealVector18.ebeMultiply((org.apache.commons.math.linear.RealVector) openMapRealVector22);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector30 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector33 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector34 = openMapRealVector30.projection((org.apache.commons.math.linear.RealVector) openMapRealVector33);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector37 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector40 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector41 = openMapRealVector37.projection((org.apache.commons.math.linear.RealVector) openMapRealVector40);
        double double42 = openMapRealVector33.dotProduct(openMapRealVector37);
        double double43 = openMapRealVector22.getL1Distance(openMapRealVector37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector27", openMapRealVector2.equals(openMapRealVector27) ? openMapRealVector2.hashCode() == openMapRealVector27.hashCode() : true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector12);
        double double14 = openMapRealVector5.dotProduct(openMapRealVector9);
        int int15 = openMapRealVector5.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector18 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean19 = openMapRealVector18.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = openMapRealVector5.append((org.apache.commons.math.linear.RealVector) openMapRealVector18);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector24 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector27 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector28 = openMapRealVector24.projection((org.apache.commons.math.linear.RealVector) openMapRealVector27);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor29 = openMapRealVector27.sparseIterator();
        openMapRealVector18.setSubVector((int) (short) 0, (org.apache.commons.math.linear.RealVector) openMapRealVector27);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector33 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector36 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector37 = openMapRealVector33.projection((org.apache.commons.math.linear.RealVector) openMapRealVector36);
        int int38 = openMapRealVector33.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector41 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector44 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector45 = openMapRealVector41.projection((org.apache.commons.math.linear.RealVector) openMapRealVector44);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector48 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector51 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector52 = openMapRealVector48.projection((org.apache.commons.math.linear.RealVector) openMapRealVector51);
        double double53 = openMapRealVector44.dotProduct(openMapRealVector48);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector56 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector59 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector60 = openMapRealVector56.projection((org.apache.commons.math.linear.RealVector) openMapRealVector59);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor61 = openMapRealVector59.sparseIterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector62 = openMapRealVector44.append(openMapRealVector59);
        org.apache.commons.math.linear.RealMatrix realMatrix63 = openMapRealVector33.outerProduct((org.apache.commons.math.linear.RealVector) openMapRealVector59);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector65 = openMapRealVector33.mapAdd((double) 10.0f);
        double double66 = openMapRealVector65.getSparsity();
        double double67 = openMapRealVector27.getL1Distance(openMapRealVector65);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector18", openMapRealVector2.equals(openMapRealVector18) ? openMapRealVector2.hashCode() == openMapRealVector18.hashCode() : true);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        int int7 = openMapRealVector2.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector2.mapAddToSelf((double) (byte) -1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector16 = openMapRealVector12.projection((org.apache.commons.math.linear.RealVector) openMapRealVector15);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor17 = openMapRealVector15.sparseIterator();
        org.apache.commons.math.linear.RealVector realVector18 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector15);
        openMapRealVector15.set(0.0d);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor21 = openMapRealVector15.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector24 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector27 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector28 = openMapRealVector24.projection((org.apache.commons.math.linear.RealVector) openMapRealVector27);
        int int29 = openMapRealVector24.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector31 = openMapRealVector24.mapAddToSelf((double) (byte) -1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector34 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector37 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector38 = openMapRealVector34.projection((org.apache.commons.math.linear.RealVector) openMapRealVector37);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector41 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector44 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector45 = openMapRealVector41.projection((org.apache.commons.math.linear.RealVector) openMapRealVector44);
        double double46 = openMapRealVector37.dotProduct(openMapRealVector41);
        int int47 = openMapRealVector37.getMaxIndex();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor48 = openMapRealVector37.sparseIterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector51 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector54 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector55 = openMapRealVector51.projection((org.apache.commons.math.linear.RealVector) openMapRealVector54);
        int int56 = openMapRealVector51.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector58 = openMapRealVector51.mapAddToSelf((double) (byte) -1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector61 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector64 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector65 = openMapRealVector61.projection((org.apache.commons.math.linear.RealVector) openMapRealVector64);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor66 = openMapRealVector64.sparseIterator();
        org.apache.commons.math.linear.RealVector realVector67 = openMapRealVector58.projection((org.apache.commons.math.linear.RealVector) openMapRealVector64);
        org.apache.commons.math.linear.RealVector realVector68 = openMapRealVector37.add((org.apache.commons.math.linear.RealVector) openMapRealVector58);
        double double69 = openMapRealVector58.getSparsity();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector70 = openMapRealVector31.ebeMultiply((org.apache.commons.math.linear.RealVector) openMapRealVector58);
        double[] doubleArray71 = openMapRealVector70.getData();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector72 = openMapRealVector15.subtract(doubleArray71);
        org.apache.commons.math.linear.RealVector realVector74 = openMapRealVector72.mapDivide(201.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector5 and openMapRealVector15", openMapRealVector5.equals(openMapRealVector15) ? openMapRealVector5.hashCode() == openMapRealVector15.hashCode() : true);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector12);
        double double14 = openMapRealVector5.dotProduct(openMapRealVector9);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor15 = openMapRealVector9.iterator();
        boolean boolean16 = openMapRealVector9.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector22 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector23 = openMapRealVector19.projection((org.apache.commons.math.linear.RealVector) openMapRealVector22);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector29 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector30 = openMapRealVector26.projection((org.apache.commons.math.linear.RealVector) openMapRealVector29);
        double double31 = openMapRealVector22.dotProduct(openMapRealVector26);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector34 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector37 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector38 = openMapRealVector34.projection((org.apache.commons.math.linear.RealVector) openMapRealVector37);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor39 = openMapRealVector37.sparseIterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector40 = openMapRealVector22.append(openMapRealVector37);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector41 = openMapRealVector9.add(openMapRealVector37);
        double[] doubleArray46 = new double[] { (short) 1, 100.0f, 99, (-1) };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector47 = openMapRealVector41.append(doubleArray46);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector50 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector53 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector54 = openMapRealVector50.projection((org.apache.commons.math.linear.RealVector) openMapRealVector53);
        int int55 = openMapRealVector50.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector57 = openMapRealVector50.mapAddToSelf((double) (byte) -1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector60 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector63 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector64 = openMapRealVector60.projection((org.apache.commons.math.linear.RealVector) openMapRealVector63);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor65 = openMapRealVector63.sparseIterator();
        org.apache.commons.math.linear.RealVector realVector66 = openMapRealVector57.projection((org.apache.commons.math.linear.RealVector) openMapRealVector63);
        openMapRealVector63.set(0.0d);
        java.lang.Double[] doubleArray72 = new java.lang.Double[] { 0.0d, (-1.0d), 100.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector74 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray72, (double) (byte) 1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector76 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray72, (double) (short) 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector77 = openMapRealVector63.append(openMapRealVector76);
        int int78 = openMapRealVector63.getMinIndex();
        double[] doubleArray79 = openMapRealVector63.getData();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector80 = openMapRealVector47.append(doubleArray79);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector63", openMapRealVector2.equals(openMapRealVector63) ? openMapRealVector2.hashCode() == openMapRealVector63.hashCode() : true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector12);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector16 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector20 = openMapRealVector16.projection((org.apache.commons.math.linear.RealVector) openMapRealVector19);
        double double21 = openMapRealVector12.dotProduct(openMapRealVector16);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor22 = openMapRealVector16.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = openMapRealVector5.append((org.apache.commons.math.linear.RealVector) openMapRealVector16);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector25 = openMapRealVector16.append((double) 10);
        double double26 = openMapRealVector16.getNorm();
        org.apache.commons.math.linear.RealVector realVector28 = openMapRealVector16.mapSubtract((double) 0.0f);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector31 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector34 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector35 = openMapRealVector31.projection((org.apache.commons.math.linear.RealVector) openMapRealVector34);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector38 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector41 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector42 = openMapRealVector38.projection((org.apache.commons.math.linear.RealVector) openMapRealVector41);
        double double43 = openMapRealVector34.dotProduct(openMapRealVector38);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector46 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector49 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector50 = openMapRealVector46.projection((org.apache.commons.math.linear.RealVector) openMapRealVector49);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor51 = openMapRealVector49.sparseIterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector52 = openMapRealVector34.append(openMapRealVector49);
        boolean boolean53 = openMapRealVector52.isNaN();
        double double54 = openMapRealVector52.getMaxValue();
        boolean boolean55 = openMapRealVector16.equals((java.lang.Object) openMapRealVector52);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and realVector28", openMapRealVector2.equals(realVector28) ? openMapRealVector2.hashCode() == realVector28.hashCode() : true);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector12);
        double double14 = openMapRealVector5.dotProduct(openMapRealVector9);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector16 = openMapRealVector5.mapAdd((double) (short) 1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 100);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector22 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector25 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector26 = openMapRealVector22.projection((org.apache.commons.math.linear.RealVector) openMapRealVector25);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector29 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector32 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector33 = openMapRealVector29.projection((org.apache.commons.math.linear.RealVector) openMapRealVector32);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector36 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector39 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector40 = openMapRealVector36.projection((org.apache.commons.math.linear.RealVector) openMapRealVector39);
        double double41 = openMapRealVector32.dotProduct(openMapRealVector36);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor42 = openMapRealVector36.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector43 = openMapRealVector25.append((org.apache.commons.math.linear.RealVector) openMapRealVector36);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector45 = openMapRealVector36.append((double) 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector48 = openMapRealVector45.getSubVector((int) 'a', (int) (byte) 1);
        boolean boolean49 = openMapRealVector48.isNaN();
        org.apache.commons.math.linear.RealMatrix realMatrix50 = openMapRealVector19.outerProduct((org.apache.commons.math.linear.RealVector) openMapRealVector48);
        boolean boolean51 = openMapRealVector19.isInfinite();
        openMapRealVector16.setSubVector((int) (byte) 0, (org.apache.commons.math.linear.RealVector) openMapRealVector19);
        double double53 = openMapRealVector16.getMinValue();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector56 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector59 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector60 = openMapRealVector56.projection((org.apache.commons.math.linear.RealVector) openMapRealVector59);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector63 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector66 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector67 = openMapRealVector63.projection((org.apache.commons.math.linear.RealVector) openMapRealVector66);
        double double68 = openMapRealVector59.dotProduct(openMapRealVector63);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector71 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector74 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector75 = openMapRealVector71.projection((org.apache.commons.math.linear.RealVector) openMapRealVector74);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor76 = openMapRealVector74.sparseIterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector77 = openMapRealVector59.append(openMapRealVector74);
        org.apache.commons.math.linear.RealVector realVector79 = openMapRealVector74.mapMultiplyToSelf((double) (-1L));
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector81 = openMapRealVector74.mapAdd((double) 10L);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector82 = openMapRealVector81.copy();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector83 = openMapRealVector16.subtract(openMapRealVector81);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor84 = openMapRealVector83.sparseIterator();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector16", openMapRealVector2.equals(openMapRealVector16) ? openMapRealVector2.hashCode() == openMapRealVector16.hashCode() : true);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector12);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector16 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector20 = openMapRealVector16.projection((org.apache.commons.math.linear.RealVector) openMapRealVector19);
        double double21 = openMapRealVector12.dotProduct(openMapRealVector16);
        int int22 = openMapRealVector12.getMaxIndex();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor23 = openMapRealVector12.sparseIterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector29 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector30 = openMapRealVector26.projection((org.apache.commons.math.linear.RealVector) openMapRealVector29);
        int int31 = openMapRealVector26.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector33 = openMapRealVector26.mapAddToSelf((double) (byte) -1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector36 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector39 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector40 = openMapRealVector36.projection((org.apache.commons.math.linear.RealVector) openMapRealVector39);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor41 = openMapRealVector39.sparseIterator();
        org.apache.commons.math.linear.RealVector realVector42 = openMapRealVector33.projection((org.apache.commons.math.linear.RealVector) openMapRealVector39);
        org.apache.commons.math.linear.RealVector realVector43 = openMapRealVector12.add((org.apache.commons.math.linear.RealVector) openMapRealVector33);
        double double44 = openMapRealVector33.getSparsity();
        double double45 = openMapRealVector33.getMaxValue();
        int int46 = openMapRealVector33.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector47 = openMapRealVector2.subtract((org.apache.commons.math.linear.RealVector) openMapRealVector33);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector52 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean53 = openMapRealVector52.isInfinite();
        org.apache.commons.math.linear.RealVector realVector54 = openMapRealVector33.combine((double) 100, (double) 10, (org.apache.commons.math.linear.RealVector) openMapRealVector52);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector57 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector60 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector61 = openMapRealVector57.projection((org.apache.commons.math.linear.RealVector) openMapRealVector60);
        int int62 = openMapRealVector57.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector64 = openMapRealVector57.mapAddToSelf((double) (byte) -1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector67 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector70 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector71 = openMapRealVector67.projection((org.apache.commons.math.linear.RealVector) openMapRealVector70);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor72 = openMapRealVector70.sparseIterator();
        org.apache.commons.math.linear.RealVector realVector73 = openMapRealVector64.projection((org.apache.commons.math.linear.RealVector) openMapRealVector70);
        openMapRealVector70.set(0.0d);
        java.lang.Double[] doubleArray79 = new java.lang.Double[] { 0.0d, (-1.0d), 100.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector81 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray79, (double) (byte) 1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector83 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray79, (double) (short) 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector84 = openMapRealVector70.append(openMapRealVector83);
        int int85 = openMapRealVector70.getMinIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector86 = openMapRealVector33.subtract(openMapRealVector70);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector89 = new org.apache.commons.math.linear.OpenMapRealVector((int) (byte) 100, 100);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector91 = openMapRealVector89.mapAddToSelf((double) (-1.0f));
        double double92 = openMapRealVector86.getDistance((org.apache.commons.math.linear.RealVector) openMapRealVector89);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector70", openMapRealVector2.equals(openMapRealVector70) ? openMapRealVector2.hashCode() == openMapRealVector70.hashCode() : true);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector12);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector16 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector20 = openMapRealVector16.projection((org.apache.commons.math.linear.RealVector) openMapRealVector19);
        double double21 = openMapRealVector12.dotProduct(openMapRealVector16);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor22 = openMapRealVector16.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = openMapRealVector5.append((org.apache.commons.math.linear.RealVector) openMapRealVector16);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector25 = openMapRealVector16.append((double) 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = new org.apache.commons.math.linear.OpenMapRealVector(openMapRealVector25);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector28 = openMapRealVector26.append((double) 1.0f);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector31 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector34 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector35 = openMapRealVector31.projection((org.apache.commons.math.linear.RealVector) openMapRealVector34);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector38 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector41 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector42 = openMapRealVector38.projection((org.apache.commons.math.linear.RealVector) openMapRealVector41);
        double double43 = openMapRealVector34.dotProduct(openMapRealVector38);
        int int44 = openMapRealVector34.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector47 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean48 = openMapRealVector47.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector49 = openMapRealVector34.append((org.apache.commons.math.linear.RealVector) openMapRealVector47);
        double[] doubleArray54 = new double[] { 100.0d, (-1.0d), (-1.0f) };
        openMapRealVector49.setSubVector(99, doubleArray54);
        org.apache.commons.math.linear.RealMatrix realMatrix56 = openMapRealVector26.outerProduct(doubleArray54);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector60 = new org.apache.commons.math.linear.OpenMapRealVector(96, 0);
        openMapRealVector26.setSubVector(0, (org.apache.commons.math.linear.RealVector) openMapRealVector60);
        openMapRealVector60.set((-2.0d));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector25 and openMapRealVector26", openMapRealVector25.equals(openMapRealVector26) ? openMapRealVector25.hashCode() == openMapRealVector26.hashCode() : true);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector12);
        double double14 = openMapRealVector5.dotProduct(openMapRealVector9);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector17 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector21 = openMapRealVector17.projection((org.apache.commons.math.linear.RealVector) openMapRealVector20);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor22 = openMapRealVector20.sparseIterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = openMapRealVector5.append(openMapRealVector20);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor24 = openMapRealVector5.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector27 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector30 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector31 = openMapRealVector27.projection((org.apache.commons.math.linear.RealVector) openMapRealVector30);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector34 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector37 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector38 = openMapRealVector34.projection((org.apache.commons.math.linear.RealVector) openMapRealVector37);
        double double39 = openMapRealVector30.dotProduct(openMapRealVector34);
        int int40 = openMapRealVector30.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector43 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean44 = openMapRealVector43.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector45 = openMapRealVector30.append((org.apache.commons.math.linear.RealVector) openMapRealVector43);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector49 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector52 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector53 = openMapRealVector49.projection((org.apache.commons.math.linear.RealVector) openMapRealVector52);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor54 = openMapRealVector52.sparseIterator();
        openMapRealVector43.setSubVector((int) (short) 0, (org.apache.commons.math.linear.RealVector) openMapRealVector52);
        double[] doubleArray56 = openMapRealVector43.toArray();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector57 = openMapRealVector5.projection(doubleArray56);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector43", openMapRealVector2.equals(openMapRealVector43) ? openMapRealVector2.hashCode() == openMapRealVector43.hashCode() : true);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector12);
        double double14 = openMapRealVector5.dotProduct(openMapRealVector9);
        int int15 = openMapRealVector5.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector18 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean19 = openMapRealVector18.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = openMapRealVector5.append((org.apache.commons.math.linear.RealVector) openMapRealVector18);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector27 = openMapRealVector23.projection((org.apache.commons.math.linear.RealVector) openMapRealVector26);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector30 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector33 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector34 = openMapRealVector30.projection((org.apache.commons.math.linear.RealVector) openMapRealVector33);
        double double35 = openMapRealVector26.dotProduct(openMapRealVector30);
        int int36 = openMapRealVector26.getMaxIndex();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor37 = openMapRealVector26.sparseIterator();
        double double38 = openMapRealVector5.dotProduct((org.apache.commons.math.linear.RealVector) openMapRealVector26);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector41 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector44 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector45 = openMapRealVector41.projection((org.apache.commons.math.linear.RealVector) openMapRealVector44);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector48 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector51 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector52 = openMapRealVector48.projection((org.apache.commons.math.linear.RealVector) openMapRealVector51);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector55 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector58 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector59 = openMapRealVector55.projection((org.apache.commons.math.linear.RealVector) openMapRealVector58);
        double double60 = openMapRealVector51.dotProduct(openMapRealVector55);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor61 = openMapRealVector55.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector62 = openMapRealVector44.append((org.apache.commons.math.linear.RealVector) openMapRealVector55);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector63 = openMapRealVector26.add(openMapRealVector44);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector66 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector69 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector70 = openMapRealVector66.projection((org.apache.commons.math.linear.RealVector) openMapRealVector69);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector73 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector76 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector77 = openMapRealVector73.projection((org.apache.commons.math.linear.RealVector) openMapRealVector76);
        double double78 = openMapRealVector69.dotProduct(openMapRealVector73);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector81 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector84 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector85 = openMapRealVector81.projection((org.apache.commons.math.linear.RealVector) openMapRealVector84);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor86 = openMapRealVector84.sparseIterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector87 = openMapRealVector69.append(openMapRealVector84);
        double double88 = openMapRealVector44.getL1Distance(openMapRealVector69);
        org.apache.commons.math.linear.RealVector realVector90 = openMapRealVector44.mapSubtractToSelf(0.0d);
        java.lang.Class<?> wildcardClass91 = realVector90.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and realVector90", openMapRealVector2.equals(realVector90) ? openMapRealVector2.hashCode() == realVector90.hashCode() : true);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector12);
        double double14 = openMapRealVector5.dotProduct(openMapRealVector9);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor15 = openMapRealVector9.iterator();
        boolean boolean16 = openMapRealVector9.isInfinite();
        double[] doubleArray22 = new double[] { 10, (-1.0d), 2, (short) 100, (byte) 10 };
        org.apache.commons.math.linear.RealVector realVector23 = openMapRealVector9.add(doubleArray22);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector24 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray22);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray22, (double) 10L);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on realVector23 and openMapRealVector24.", realVector23.equals(openMapRealVector24) == openMapRealVector24.equals(realVector23));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector12);
        double double14 = openMapRealVector5.dotProduct(openMapRealVector9);
        int int15 = openMapRealVector5.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector18 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean19 = openMapRealVector18.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = openMapRealVector5.append((org.apache.commons.math.linear.RealVector) openMapRealVector18);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector21 = openMapRealVector5.copy();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector29 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector30 = openMapRealVector26.projection((org.apache.commons.math.linear.RealVector) openMapRealVector29);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector33 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector36 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector37 = openMapRealVector33.projection((org.apache.commons.math.linear.RealVector) openMapRealVector36);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector40 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector43 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector44 = openMapRealVector40.projection((org.apache.commons.math.linear.RealVector) openMapRealVector43);
        double double45 = openMapRealVector36.dotProduct(openMapRealVector40);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor46 = openMapRealVector40.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector47 = openMapRealVector29.append((org.apache.commons.math.linear.RealVector) openMapRealVector40);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector49 = openMapRealVector40.append((double) 10);
        org.apache.commons.math.linear.RealVector realVector50 = openMapRealVector21.combineToSelf((double) 'a', (double) 2, (org.apache.commons.math.linear.RealVector) openMapRealVector40);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector52 = openMapRealVector40.mapAddToSelf((double) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector21", openMapRealVector2.equals(openMapRealVector21) ? openMapRealVector2.hashCode() == openMapRealVector21.hashCode() : true);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector3 = new org.apache.commons.math.linear.OpenMapRealVector(100, (int) '#', (-1.0d));
        org.apache.commons.math.linear.RealVector realVector5 = openMapRealVector3.mapDivide((double) 100.0f);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = openMapRealVector3.append((double) 0.0f);
        double double8 = openMapRealVector3.getSparsity();
        int int9 = openMapRealVector3.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector16 = openMapRealVector12.projection((org.apache.commons.math.linear.RealVector) openMapRealVector15);
        double[] doubleArray17 = openMapRealVector15.getData();
        org.apache.commons.math.linear.RealVector realVector19 = openMapRealVector15.mapSubtract(Double.NaN);
        org.apache.commons.math.linear.RealVector realVector21 = openMapRealVector15.mapMultiply((double) 0.0f);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector22 = openMapRealVector3.append(openMapRealVector15);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = openMapRealVector3.unitVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector29 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector30 = openMapRealVector26.projection((org.apache.commons.math.linear.RealVector) openMapRealVector29);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector33 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector36 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector37 = openMapRealVector33.projection((org.apache.commons.math.linear.RealVector) openMapRealVector36);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector40 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector43 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector44 = openMapRealVector40.projection((org.apache.commons.math.linear.RealVector) openMapRealVector43);
        double double45 = openMapRealVector36.dotProduct(openMapRealVector40);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor46 = openMapRealVector40.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector47 = openMapRealVector29.append((org.apache.commons.math.linear.RealVector) openMapRealVector40);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector50 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector53 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector54 = openMapRealVector50.projection((org.apache.commons.math.linear.RealVector) openMapRealVector53);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector57 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector60 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector61 = openMapRealVector57.projection((org.apache.commons.math.linear.RealVector) openMapRealVector60);
        double double62 = openMapRealVector53.dotProduct(openMapRealVector57);
        int int63 = openMapRealVector53.getMaxIndex();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor64 = openMapRealVector53.sparseIterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector67 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector70 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector71 = openMapRealVector67.projection((org.apache.commons.math.linear.RealVector) openMapRealVector70);
        int int72 = openMapRealVector67.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector74 = openMapRealVector67.mapAddToSelf((double) (byte) -1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector77 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector80 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector81 = openMapRealVector77.projection((org.apache.commons.math.linear.RealVector) openMapRealVector80);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor82 = openMapRealVector80.sparseIterator();
        org.apache.commons.math.linear.RealVector realVector83 = openMapRealVector74.projection((org.apache.commons.math.linear.RealVector) openMapRealVector80);
        org.apache.commons.math.linear.RealVector realVector84 = openMapRealVector53.add((org.apache.commons.math.linear.RealVector) openMapRealVector74);
        double double85 = openMapRealVector74.getSparsity();
        double double86 = openMapRealVector29.dotProduct(openMapRealVector74);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector88 = openMapRealVector74.mapAdd((double) 1L);
        boolean boolean90 = openMapRealVector88.equals((java.lang.Object) 96);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector91 = new org.apache.commons.math.linear.OpenMapRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector88);
        org.apache.commons.math.linear.RealVector realVector92 = openMapRealVector23.projection((org.apache.commons.math.linear.RealVector) openMapRealVector91);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector12 and openMapRealVector88", openMapRealVector12.equals(openMapRealVector88) ? openMapRealVector12.hashCode() == openMapRealVector88.hashCode() : true);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 100);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector8 = openMapRealVector4.projection((org.apache.commons.math.linear.RealVector) openMapRealVector7);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector11 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector15 = openMapRealVector11.projection((org.apache.commons.math.linear.RealVector) openMapRealVector14);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector18 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector21 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector22 = openMapRealVector18.projection((org.apache.commons.math.linear.RealVector) openMapRealVector21);
        double double23 = openMapRealVector14.dotProduct(openMapRealVector18);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor24 = openMapRealVector18.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector25 = openMapRealVector7.append((org.apache.commons.math.linear.RealVector) openMapRealVector18);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector27 = openMapRealVector18.append((double) 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector30 = openMapRealVector27.getSubVector((int) 'a', (int) (byte) 1);
        boolean boolean31 = openMapRealVector30.isNaN();
        org.apache.commons.math.linear.RealMatrix realMatrix32 = openMapRealVector1.outerProduct((org.apache.commons.math.linear.RealVector) openMapRealVector30);
        boolean boolean33 = openMapRealVector1.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector35 = new org.apache.commons.math.linear.OpenMapRealVector(100);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector38 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector41 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector42 = openMapRealVector38.projection((org.apache.commons.math.linear.RealVector) openMapRealVector41);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector45 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector48 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector49 = openMapRealVector45.projection((org.apache.commons.math.linear.RealVector) openMapRealVector48);
        double double50 = openMapRealVector41.dotProduct(openMapRealVector45);
        int int51 = openMapRealVector41.getMaxIndex();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor52 = openMapRealVector41.sparseIterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector55 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector58 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector59 = openMapRealVector55.projection((org.apache.commons.math.linear.RealVector) openMapRealVector58);
        int int60 = openMapRealVector55.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector62 = openMapRealVector55.mapAddToSelf((double) (byte) -1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector65 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector68 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector69 = openMapRealVector65.projection((org.apache.commons.math.linear.RealVector) openMapRealVector68);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor70 = openMapRealVector68.sparseIterator();
        org.apache.commons.math.linear.RealVector realVector71 = openMapRealVector62.projection((org.apache.commons.math.linear.RealVector) openMapRealVector68);
        org.apache.commons.math.linear.RealVector realVector72 = openMapRealVector41.add((org.apache.commons.math.linear.RealVector) openMapRealVector62);
        double double73 = openMapRealVector41.getL1Norm();
        double[] doubleArray74 = openMapRealVector41.getData();
        org.apache.commons.math.linear.RealVector realVector75 = openMapRealVector35.add(doubleArray74);
        boolean boolean76 = openMapRealVector1.equals((java.lang.Object) doubleArray74);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on realVector75 and openMapRealVector4.", realVector75.equals(openMapRealVector4) == openMapRealVector4.equals(realVector75));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean3 = openMapRealVector2.isInfinite();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor4 = openMapRealVector2.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 1);
        openMapRealVector2.setSubVector((int) ' ', (org.apache.commons.math.linear.RealVector) openMapRealVector7);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector11 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector15 = openMapRealVector11.projection((org.apache.commons.math.linear.RealVector) openMapRealVector14);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector18 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector21 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector22 = openMapRealVector18.projection((org.apache.commons.math.linear.RealVector) openMapRealVector21);
        double double23 = openMapRealVector14.dotProduct(openMapRealVector18);
        int int24 = openMapRealVector14.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector27 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean28 = openMapRealVector27.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector29 = openMapRealVector14.append((org.apache.commons.math.linear.RealVector) openMapRealVector27);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector30 = openMapRealVector2.append(openMapRealVector29);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector33 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector36 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector37 = openMapRealVector33.projection((org.apache.commons.math.linear.RealVector) openMapRealVector36);
        int int38 = openMapRealVector33.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector40 = openMapRealVector33.mapAddToSelf((double) (byte) -1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector43 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector46 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector47 = openMapRealVector43.projection((org.apache.commons.math.linear.RealVector) openMapRealVector46);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor48 = openMapRealVector46.sparseIterator();
        org.apache.commons.math.linear.RealVector realVector49 = openMapRealVector40.projection((org.apache.commons.math.linear.RealVector) openMapRealVector46);
        openMapRealVector46.set(0.0d);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor52 = openMapRealVector46.iterator();
        openMapRealVector46.set((double) (-1L));
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector55 = openMapRealVector2.add(openMapRealVector46);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector56 = openMapRealVector55.copy();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector11", openMapRealVector2.equals(openMapRealVector11) ? openMapRealVector2.hashCode() == openMapRealVector11.hashCode() : true);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector12);
        double double14 = openMapRealVector5.dotProduct(openMapRealVector9);
        int int15 = openMapRealVector5.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector18 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean19 = openMapRealVector18.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = openMapRealVector5.append((org.apache.commons.math.linear.RealVector) openMapRealVector18);
        double[] doubleArray25 = new double[] { 100.0d, (-1.0d), (-1.0f) };
        openMapRealVector20.setSubVector(99, doubleArray25);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector28 = openMapRealVector20.mapAdd(0.0d);
        boolean boolean29 = openMapRealVector20.isNaN();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector33 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector36 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector37 = openMapRealVector33.projection((org.apache.commons.math.linear.RealVector) openMapRealVector36);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector40 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector43 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector44 = openMapRealVector40.projection((org.apache.commons.math.linear.RealVector) openMapRealVector43);
        double double45 = openMapRealVector36.dotProduct(openMapRealVector40);
        int int46 = openMapRealVector36.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector49 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean50 = openMapRealVector49.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector51 = openMapRealVector36.append((org.apache.commons.math.linear.RealVector) openMapRealVector49);
        double[] doubleArray56 = new double[] { 100.0d, (-1.0d), (-1.0f) };
        openMapRealVector51.setSubVector(99, doubleArray56);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector59 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray56, (double) 'a');
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector62 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector65 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector66 = openMapRealVector62.projection((org.apache.commons.math.linear.RealVector) openMapRealVector65);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector69 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector72 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector73 = openMapRealVector69.projection((org.apache.commons.math.linear.RealVector) openMapRealVector72);
        double double74 = openMapRealVector65.dotProduct(openMapRealVector69);
        int int75 = openMapRealVector65.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector78 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean79 = openMapRealVector78.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector80 = openMapRealVector65.append((org.apache.commons.math.linear.RealVector) openMapRealVector78);
        double[] doubleArray85 = new double[] { 100.0d, (-1.0d), (-1.0f) };
        openMapRealVector80.setSubVector(99, doubleArray85);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector88 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray85, (double) (-1.0f));
        org.apache.commons.math.linear.RealMatrix realMatrix89 = openMapRealVector59.outerProduct(doubleArray85);
        openMapRealVector20.setSubVector(196, doubleArray85);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector28 and openMapRealVector51", openMapRealVector28.equals(openMapRealVector51) ? openMapRealVector28.hashCode() == openMapRealVector51.hashCode() : true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        int int7 = openMapRealVector2.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector2.mapAddToSelf((double) (byte) -1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector16 = openMapRealVector12.projection((org.apache.commons.math.linear.RealVector) openMapRealVector15);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor17 = openMapRealVector15.sparseIterator();
        org.apache.commons.math.linear.RealVector realVector18 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector15);
        openMapRealVector15.set(0.0d);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector27 = openMapRealVector23.projection((org.apache.commons.math.linear.RealVector) openMapRealVector26);
        double[] doubleArray28 = openMapRealVector26.getData();
        double double29 = openMapRealVector15.getDistance(doubleArray28);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector30 = new org.apache.commons.math.linear.OpenMapRealVector(openMapRealVector15);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor31 = openMapRealVector15.sparseIterator();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector5 and openMapRealVector30", openMapRealVector5.equals(openMapRealVector30) ? openMapRealVector5.hashCode() == openMapRealVector30.hashCode() : true);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        int int7 = openMapRealVector2.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector2.mapAddToSelf((double) (byte) -1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector16 = openMapRealVector12.projection((org.apache.commons.math.linear.RealVector) openMapRealVector15);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor17 = openMapRealVector15.sparseIterator();
        org.apache.commons.math.linear.RealVector realVector18 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector15);
        openMapRealVector15.set(0.0d);
        java.lang.Double[] doubleArray24 = new java.lang.Double[] { 0.0d, (-1.0d), 100.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray24, (double) (byte) 1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector28 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray24, (double) (short) 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector29 = openMapRealVector15.append(openMapRealVector28);
        double double30 = openMapRealVector28.getSparsity();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector5 and openMapRealVector15", openMapRealVector5.equals(openMapRealVector15) ? openMapRealVector5.hashCode() == openMapRealVector15.hashCode() : true);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector12);
        double double14 = openMapRealVector5.dotProduct(openMapRealVector9);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor15 = openMapRealVector9.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector17 = openMapRealVector9.mapAddToSelf((double) ' ');
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = openMapRealVector9.mapAddToSelf((double) (short) 100);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector22 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector25 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector26 = openMapRealVector22.projection((org.apache.commons.math.linear.RealVector) openMapRealVector25);
        double[] doubleArray27 = openMapRealVector25.toArray();
        org.apache.commons.math.linear.RealVector realVector28 = openMapRealVector9.add(doubleArray27);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector29 = new org.apache.commons.math.linear.OpenMapRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector9);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on realVector28 and openMapRealVector9.", realVector28.equals(openMapRealVector9) == openMapRealVector9.equals(realVector28));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector8 = openMapRealVector4.projection((org.apache.commons.math.linear.RealVector) openMapRealVector7);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector11 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector15 = openMapRealVector11.projection((org.apache.commons.math.linear.RealVector) openMapRealVector14);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector18 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector21 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector22 = openMapRealVector18.projection((org.apache.commons.math.linear.RealVector) openMapRealVector21);
        double double23 = openMapRealVector14.dotProduct(openMapRealVector18);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor24 = openMapRealVector18.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector25 = openMapRealVector7.append((org.apache.commons.math.linear.RealVector) openMapRealVector18);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector27 = openMapRealVector18.append((double) 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector30 = openMapRealVector27.getSubVector((int) 'a', (int) (byte) 1);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor31 = openMapRealVector30.iterator();
        double double32 = openMapRealVector1.getDistance(openMapRealVector30);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector35 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector38 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector39 = openMapRealVector35.projection((org.apache.commons.math.linear.RealVector) openMapRealVector38);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector42 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector45 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector46 = openMapRealVector42.projection((org.apache.commons.math.linear.RealVector) openMapRealVector45);
        double double47 = openMapRealVector38.dotProduct(openMapRealVector42);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor48 = openMapRealVector42.iterator();
        java.lang.Double[] doubleArray51 = new java.lang.Double[] { 100.0d, 1.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector53 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray51, (double) (byte) 1);
        double[] doubleArray59 = new double[] { 10L, (-1.0f), (-1.0f), (-1), 100 };
        org.apache.commons.math.linear.RealMatrix realMatrix60 = openMapRealVector53.outerProduct(doubleArray59);
        org.apache.commons.math.linear.RealVector realVector61 = openMapRealVector42.add(doubleArray59);
        boolean boolean62 = openMapRealVector30.equals((java.lang.Object) openMapRealVector42);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector65 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector68 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector69 = openMapRealVector65.projection((org.apache.commons.math.linear.RealVector) openMapRealVector68);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector72 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector75 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector76 = openMapRealVector72.projection((org.apache.commons.math.linear.RealVector) openMapRealVector75);
        double double77 = openMapRealVector68.dotProduct(openMapRealVector72);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor78 = openMapRealVector72.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector80 = openMapRealVector72.mapAddToSelf((double) ' ');
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector82 = openMapRealVector72.mapAddToSelf((double) (short) 100);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector85 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector88 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector89 = openMapRealVector85.projection((org.apache.commons.math.linear.RealVector) openMapRealVector88);
        double[] doubleArray90 = openMapRealVector88.toArray();
        org.apache.commons.math.linear.RealVector realVector91 = openMapRealVector72.add(doubleArray90);
        double double92 = openMapRealVector42.getL1Distance(doubleArray90);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on realVector91 and openMapRealVector72.", realVector91.equals(openMapRealVector72) == openMapRealVector72.equals(realVector91));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector12);
        double double14 = openMapRealVector5.dotProduct(openMapRealVector9);
        int int15 = openMapRealVector5.getMaxIndex();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor16 = openMapRealVector5.sparseIterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector22 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector23 = openMapRealVector19.projection((org.apache.commons.math.linear.RealVector) openMapRealVector22);
        int int24 = openMapRealVector19.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = openMapRealVector19.mapAddToSelf((double) (byte) -1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector29 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector32 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector33 = openMapRealVector29.projection((org.apache.commons.math.linear.RealVector) openMapRealVector32);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor34 = openMapRealVector32.sparseIterator();
        org.apache.commons.math.linear.RealVector realVector35 = openMapRealVector26.projection((org.apache.commons.math.linear.RealVector) openMapRealVector32);
        org.apache.commons.math.linear.RealVector realVector36 = openMapRealVector5.add((org.apache.commons.math.linear.RealVector) openMapRealVector26);
        int int37 = openMapRealVector5.getDimension();
        double double38 = openMapRealVector5.getMinValue();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector40 = openMapRealVector5.mapAddToSelf(0.0d);
        double[] doubleArray41 = openMapRealVector40.getData();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector40", openMapRealVector2.equals(openMapRealVector40) ? openMapRealVector2.hashCode() == openMapRealVector40.hashCode() : true);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        java.lang.Double[] doubleArray3 = new java.lang.Double[] { 0.0d, (-1.0d), 100.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray3, (double) (byte) 1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray3, (double) (short) 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray3, 10.0d);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector11 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray3, (double) 10.0f);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = openMapRealVector11.unitVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector16 = new org.apache.commons.math.linear.OpenMapRealVector(100, (int) '#', (-1.0d));
        org.apache.commons.math.linear.RealVector realVector18 = openMapRealVector16.mapDivide((double) 100.0f);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = openMapRealVector16.append((double) 0.0f);
        double double21 = openMapRealVector16.getSparsity();
        org.apache.commons.math.linear.RealMatrix realMatrix22 = openMapRealVector11.outerProduct((org.apache.commons.math.linear.RealVector) openMapRealVector16);
        int int23 = openMapRealVector16.getMinIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector29 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector30 = openMapRealVector26.projection((org.apache.commons.math.linear.RealVector) openMapRealVector29);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector33 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector36 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector37 = openMapRealVector33.projection((org.apache.commons.math.linear.RealVector) openMapRealVector36);
        double double38 = openMapRealVector29.dotProduct(openMapRealVector33);
        int int39 = openMapRealVector29.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector42 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean43 = openMapRealVector42.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector44 = openMapRealVector29.append((org.apache.commons.math.linear.RealVector) openMapRealVector42);
        double[] doubleArray49 = new double[] { 100.0d, (-1.0d), (-1.0f) };
        openMapRealVector44.setSubVector(99, doubleArray49);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector52 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray49, (double) 'a');
        double double53 = openMapRealVector52.getNorm();
        double[] doubleArray54 = openMapRealVector52.toArray();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector55 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray54);
        org.apache.commons.math.linear.RealVector realVector56 = openMapRealVector16.add(doubleArray54);
        org.apache.commons.math.linear.RealVector realVector58 = openMapRealVector16.mapMultiplyToSelf((double) 101);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on realVector56 and openMapRealVector52.", realVector56.equals(openMapRealVector52) == openMapRealVector52.equals(realVector56));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(200, 1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector8 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector9 = openMapRealVector5.projection((org.apache.commons.math.linear.RealVector) openMapRealVector8);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector16 = openMapRealVector12.projection((org.apache.commons.math.linear.RealVector) openMapRealVector15);
        double double17 = openMapRealVector8.dotProduct(openMapRealVector12);
        int int18 = openMapRealVector8.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector21 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean22 = openMapRealVector21.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = openMapRealVector8.append((org.apache.commons.math.linear.RealVector) openMapRealVector21);
        double[] doubleArray28 = new double[] { 100.0d, (-1.0d), (-1.0f) };
        openMapRealVector23.setSubVector(99, doubleArray28);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector31 = openMapRealVector23.mapAdd(0.0d);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector34 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean35 = openMapRealVector34.isInfinite();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor36 = openMapRealVector34.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector39 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 1);
        openMapRealVector34.setSubVector((int) ' ', (org.apache.commons.math.linear.RealVector) openMapRealVector39);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector43 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector46 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector47 = openMapRealVector43.projection((org.apache.commons.math.linear.RealVector) openMapRealVector46);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector50 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector53 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector54 = openMapRealVector50.projection((org.apache.commons.math.linear.RealVector) openMapRealVector53);
        double double55 = openMapRealVector46.dotProduct(openMapRealVector50);
        int int56 = openMapRealVector46.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector59 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean60 = openMapRealVector59.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector61 = openMapRealVector46.append((org.apache.commons.math.linear.RealVector) openMapRealVector59);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector62 = openMapRealVector34.append(openMapRealVector61);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector64 = openMapRealVector34.mapAddToSelf((double) 199);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector67 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector70 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector71 = openMapRealVector67.projection((org.apache.commons.math.linear.RealVector) openMapRealVector70);
        double[] doubleArray72 = openMapRealVector70.getData();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector73 = openMapRealVector64.projection(doubleArray72);
        org.apache.commons.math.linear.RealMatrix realMatrix74 = openMapRealVector31.outerProduct(doubleArray72);
        org.apache.commons.math.linear.RealVector realVector75 = openMapRealVector2.add(doubleArray72);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector23 and openMapRealVector31", openMapRealVector23.equals(openMapRealVector31) ? openMapRealVector23.hashCode() == openMapRealVector31.hashCode() : true);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        int int7 = openMapRealVector2.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector10 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector13 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector14 = openMapRealVector10.projection((org.apache.commons.math.linear.RealVector) openMapRealVector13);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector17 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector21 = openMapRealVector17.projection((org.apache.commons.math.linear.RealVector) openMapRealVector20);
        double double22 = openMapRealVector13.dotProduct(openMapRealVector17);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector25 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector28 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector29 = openMapRealVector25.projection((org.apache.commons.math.linear.RealVector) openMapRealVector28);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor30 = openMapRealVector28.sparseIterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector31 = openMapRealVector13.append(openMapRealVector28);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = openMapRealVector2.outerProduct((org.apache.commons.math.linear.RealVector) openMapRealVector28);
        org.apache.commons.math.linear.RealVector realVector34 = openMapRealVector2.mapDivideToSelf((double) (byte) 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector37 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector40 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector41 = openMapRealVector37.projection((org.apache.commons.math.linear.RealVector) openMapRealVector40);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector44 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector47 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector48 = openMapRealVector44.projection((org.apache.commons.math.linear.RealVector) openMapRealVector47);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector51 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector54 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector55 = openMapRealVector51.projection((org.apache.commons.math.linear.RealVector) openMapRealVector54);
        double double56 = openMapRealVector47.dotProduct(openMapRealVector51);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor57 = openMapRealVector51.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector58 = openMapRealVector40.append((org.apache.commons.math.linear.RealVector) openMapRealVector51);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector60 = openMapRealVector51.mapAdd((double) (byte) 0);
        double double61 = openMapRealVector2.dotProduct(openMapRealVector60);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector65 = new org.apache.commons.math.linear.OpenMapRealVector((int) (byte) 0, 200, Double.NaN);
        int int66 = openMapRealVector65.getMinIndex();
        double double67 = openMapRealVector65.getLInfNorm();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector69 = openMapRealVector65.mapAddToSelf((double) 1L);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector70 = openMapRealVector2.append((org.apache.commons.math.linear.RealVector) openMapRealVector69);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector5 and openMapRealVector60", openMapRealVector5.equals(openMapRealVector60) ? openMapRealVector5.hashCode() == openMapRealVector60.hashCode() : true);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector12);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector16 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector20 = openMapRealVector16.projection((org.apache.commons.math.linear.RealVector) openMapRealVector19);
        double double21 = openMapRealVector12.dotProduct(openMapRealVector16);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor22 = openMapRealVector16.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = openMapRealVector5.append((org.apache.commons.math.linear.RealVector) openMapRealVector16);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector29 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector30 = openMapRealVector26.projection((org.apache.commons.math.linear.RealVector) openMapRealVector29);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector33 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector36 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector37 = openMapRealVector33.projection((org.apache.commons.math.linear.RealVector) openMapRealVector36);
        double double38 = openMapRealVector29.dotProduct(openMapRealVector33);
        int int39 = openMapRealVector29.getMaxIndex();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor40 = openMapRealVector29.sparseIterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector43 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector46 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector47 = openMapRealVector43.projection((org.apache.commons.math.linear.RealVector) openMapRealVector46);
        int int48 = openMapRealVector43.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector50 = openMapRealVector43.mapAddToSelf((double) (byte) -1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector53 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector56 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector57 = openMapRealVector53.projection((org.apache.commons.math.linear.RealVector) openMapRealVector56);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor58 = openMapRealVector56.sparseIterator();
        org.apache.commons.math.linear.RealVector realVector59 = openMapRealVector50.projection((org.apache.commons.math.linear.RealVector) openMapRealVector56);
        org.apache.commons.math.linear.RealVector realVector60 = openMapRealVector29.add((org.apache.commons.math.linear.RealVector) openMapRealVector50);
        double double61 = openMapRealVector50.getSparsity();
        double double62 = openMapRealVector5.dotProduct(openMapRealVector50);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector64 = openMapRealVector50.mapAdd((double) 1L);
        openMapRealVector50.set((double) 100L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector64", openMapRealVector2.equals(openMapRealVector64) ? openMapRealVector2.hashCode() == openMapRealVector64.hashCode() : true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector((int) 'a');
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector3 = openMapRealVector1.append((double) 1.0f);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = openMapRealVector3.mapAddToSelf((double) 0L);
        boolean boolean6 = openMapRealVector5.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math.linear.OpenMapRealVector(openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector11 = new org.apache.commons.math.linear.OpenMapRealVector((int) (byte) 1, 10, 100.0d);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector17 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector18 = openMapRealVector14.projection((org.apache.commons.math.linear.RealVector) openMapRealVector17);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector21 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector24 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector25 = openMapRealVector21.projection((org.apache.commons.math.linear.RealVector) openMapRealVector24);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector28 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector31 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector32 = openMapRealVector28.projection((org.apache.commons.math.linear.RealVector) openMapRealVector31);
        double double33 = openMapRealVector24.dotProduct(openMapRealVector28);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor34 = openMapRealVector28.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector35 = openMapRealVector17.append((org.apache.commons.math.linear.RealVector) openMapRealVector28);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector37 = openMapRealVector28.append((double) 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector38 = new org.apache.commons.math.linear.OpenMapRealVector(openMapRealVector37);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector39 = openMapRealVector11.append((org.apache.commons.math.linear.RealVector) openMapRealVector38);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector41 = new org.apache.commons.math.linear.OpenMapRealVector(100);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector43 = new org.apache.commons.math.linear.OpenMapRealVector((int) 'a');
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector45 = openMapRealVector43.append((double) 1.0f);
        int int46 = openMapRealVector43.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector47 = openMapRealVector41.append(openMapRealVector43);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector50 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector53 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector54 = openMapRealVector50.projection((org.apache.commons.math.linear.RealVector) openMapRealVector53);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector57 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector60 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector61 = openMapRealVector57.projection((org.apache.commons.math.linear.RealVector) openMapRealVector60);
        double double62 = openMapRealVector53.dotProduct(openMapRealVector57);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector65 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector68 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector69 = openMapRealVector65.projection((org.apache.commons.math.linear.RealVector) openMapRealVector68);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor70 = openMapRealVector68.sparseIterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector71 = openMapRealVector53.append(openMapRealVector68);
        org.apache.commons.math.linear.RealVector realVector73 = openMapRealVector68.mapMultiplyToSelf((double) (-1L));
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector75 = openMapRealVector68.mapAdd((double) 10L);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector76 = openMapRealVector75.copy();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector77 = openMapRealVector43.append(openMapRealVector76);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector78 = openMapRealVector38.append(openMapRealVector77);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector81 = new org.apache.commons.math.linear.OpenMapRealVector(10, (int) '4');
        double[] doubleArray82 = openMapRealVector81.toArray();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector83 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray82);
        org.apache.commons.math.linear.RealMatrix realMatrix84 = openMapRealVector38.outerProduct(doubleArray82);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector86 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray82, 0.009900990099009901d);
        openMapRealVector86.setEntry((int) (short) 0, 1.0E-12d);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector90 = openMapRealVector7.append((org.apache.commons.math.linear.RealVector) openMapRealVector86);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector3 and openMapRealVector45", openMapRealVector3.equals(openMapRealVector45) ? openMapRealVector3.hashCode() == openMapRealVector45.hashCode() : true);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean3 = openMapRealVector2.isInfinite();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor4 = openMapRealVector2.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 1);
        openMapRealVector2.setSubVector((int) ' ', (org.apache.commons.math.linear.RealVector) openMapRealVector7);
        boolean boolean9 = openMapRealVector7.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector13 = new org.apache.commons.math.linear.OpenMapRealVector((int) (byte) 1, 10, 100.0d);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector16 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector20 = openMapRealVector16.projection((org.apache.commons.math.linear.RealVector) openMapRealVector19);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector27 = openMapRealVector23.projection((org.apache.commons.math.linear.RealVector) openMapRealVector26);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector30 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector33 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector34 = openMapRealVector30.projection((org.apache.commons.math.linear.RealVector) openMapRealVector33);
        double double35 = openMapRealVector26.dotProduct(openMapRealVector30);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor36 = openMapRealVector30.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector37 = openMapRealVector19.append((org.apache.commons.math.linear.RealVector) openMapRealVector30);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector39 = openMapRealVector30.append((double) 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector40 = new org.apache.commons.math.linear.OpenMapRealVector(openMapRealVector39);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector41 = openMapRealVector13.append((org.apache.commons.math.linear.RealVector) openMapRealVector40);
        org.apache.commons.math.linear.RealVector realVector43 = openMapRealVector41.mapMultiply((double) (byte) 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector44 = new org.apache.commons.math.linear.OpenMapRealVector(realVector43);
        openMapRealVector44.set((double) 103);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector47 = openMapRealVector7.append(openMapRealVector44);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector16", openMapRealVector2.equals(openMapRealVector16) ? openMapRealVector2.hashCode() == openMapRealVector16.hashCode() : true);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector8 = openMapRealVector4.projection((org.apache.commons.math.linear.RealVector) openMapRealVector7);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector11 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector15 = openMapRealVector11.projection((org.apache.commons.math.linear.RealVector) openMapRealVector14);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector18 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector21 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector22 = openMapRealVector18.projection((org.apache.commons.math.linear.RealVector) openMapRealVector21);
        double double23 = openMapRealVector14.dotProduct(openMapRealVector18);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor24 = openMapRealVector18.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector25 = openMapRealVector7.append((org.apache.commons.math.linear.RealVector) openMapRealVector18);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector27 = openMapRealVector18.append((double) 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector30 = openMapRealVector27.getSubVector((int) 'a', (int) (byte) 1);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor31 = openMapRealVector30.iterator();
        double double32 = openMapRealVector1.getDistance(openMapRealVector30);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector35 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector38 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector39 = openMapRealVector35.projection((org.apache.commons.math.linear.RealVector) openMapRealVector38);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector42 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector45 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector46 = openMapRealVector42.projection((org.apache.commons.math.linear.RealVector) openMapRealVector45);
        double double47 = openMapRealVector38.dotProduct(openMapRealVector42);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor48 = openMapRealVector42.iterator();
        java.lang.Double[] doubleArray51 = new java.lang.Double[] { 100.0d, 1.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector53 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray51, (double) (byte) 1);
        double[] doubleArray59 = new double[] { 10L, (-1.0f), (-1.0f), (-1), 100 };
        org.apache.commons.math.linear.RealMatrix realMatrix60 = openMapRealVector53.outerProduct(doubleArray59);
        org.apache.commons.math.linear.RealVector realVector61 = openMapRealVector42.add(doubleArray59);
        boolean boolean62 = openMapRealVector30.equals((java.lang.Object) openMapRealVector42);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector67 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector70 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector71 = openMapRealVector67.projection((org.apache.commons.math.linear.RealVector) openMapRealVector70);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector74 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector77 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector78 = openMapRealVector74.projection((org.apache.commons.math.linear.RealVector) openMapRealVector77);
        double double79 = openMapRealVector70.dotProduct(openMapRealVector74);
        int int80 = openMapRealVector70.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector83 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean84 = openMapRealVector83.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector85 = openMapRealVector70.append((org.apache.commons.math.linear.RealVector) openMapRealVector83);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector89 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector92 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector93 = openMapRealVector89.projection((org.apache.commons.math.linear.RealVector) openMapRealVector92);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor94 = openMapRealVector92.sparseIterator();
        openMapRealVector83.setSubVector((int) (short) 0, (org.apache.commons.math.linear.RealVector) openMapRealVector92);
        double[] doubleArray96 = openMapRealVector83.toArray();
        double[] doubleArray97 = openMapRealVector83.toArray();
        org.apache.commons.math.linear.RealVector realVector98 = openMapRealVector42.combine(0.009900990099009901d, 0.0d, (org.apache.commons.math.linear.RealVector) openMapRealVector83);
        java.lang.Class<?> wildcardClass99 = realVector98.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector4 and openMapRealVector83", openMapRealVector4.equals(openMapRealVector83) ? openMapRealVector4.hashCode() == openMapRealVector83.hashCode() : true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector3 = new org.apache.commons.math.linear.OpenMapRealVector((int) (byte) 1, 10, 100.0d);
        double double4 = openMapRealVector3.getL1Norm();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector10 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector11 = openMapRealVector7.projection((org.apache.commons.math.linear.RealVector) openMapRealVector10);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor12 = openMapRealVector10.sparseIterator();
        boolean boolean13 = openMapRealVector10.isNaN();
        double[] doubleArray14 = openMapRealVector10.toArray();
        org.apache.commons.math.linear.RealVector realVector15 = openMapRealVector3.add(doubleArray14);
        double double16 = openMapRealVector3.getL1Norm();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on realVector15 and openMapRealVector7.", realVector15.equals(openMapRealVector7) == openMapRealVector7.equals(realVector15));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector12);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector16 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector20 = openMapRealVector16.projection((org.apache.commons.math.linear.RealVector) openMapRealVector19);
        double double21 = openMapRealVector12.dotProduct(openMapRealVector16);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor22 = openMapRealVector16.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = openMapRealVector5.append((org.apache.commons.math.linear.RealVector) openMapRealVector16);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector29 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector30 = openMapRealVector26.projection((org.apache.commons.math.linear.RealVector) openMapRealVector29);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector33 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector36 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector37 = openMapRealVector33.projection((org.apache.commons.math.linear.RealVector) openMapRealVector36);
        double double38 = openMapRealVector29.dotProduct(openMapRealVector33);
        int int39 = openMapRealVector29.getMaxIndex();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor40 = openMapRealVector29.sparseIterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector43 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector46 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector47 = openMapRealVector43.projection((org.apache.commons.math.linear.RealVector) openMapRealVector46);
        int int48 = openMapRealVector43.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector50 = openMapRealVector43.mapAddToSelf((double) (byte) -1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector53 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector56 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector57 = openMapRealVector53.projection((org.apache.commons.math.linear.RealVector) openMapRealVector56);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor58 = openMapRealVector56.sparseIterator();
        org.apache.commons.math.linear.RealVector realVector59 = openMapRealVector50.projection((org.apache.commons.math.linear.RealVector) openMapRealVector56);
        org.apache.commons.math.linear.RealVector realVector60 = openMapRealVector29.add((org.apache.commons.math.linear.RealVector) openMapRealVector50);
        double double61 = openMapRealVector50.getSparsity();
        double double62 = openMapRealVector5.dotProduct(openMapRealVector50);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector64 = openMapRealVector50.mapAdd((double) 1L);
        boolean boolean66 = openMapRealVector64.equals((java.lang.Object) 96);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector67 = new org.apache.commons.math.linear.OpenMapRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector64);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor68 = openMapRealVector67.iterator();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector64", openMapRealVector2.equals(openMapRealVector64) ? openMapRealVector2.hashCode() == openMapRealVector64.hashCode() : true);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        java.lang.Double[] doubleArray2 = new java.lang.Double[] { 100.0d, 1.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray2, (double) (byte) 1);
        double[] doubleArray10 = new double[] { 10L, (-1.0f), (-1.0f), (-1), 100 };
        org.apache.commons.math.linear.RealMatrix realMatrix11 = openMapRealVector4.outerProduct(doubleArray10);
        openMapRealVector4.set((double) (short) 10);
        int int14 = openMapRealVector4.getDimension();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math.linear.OpenMapRealVector(openMapRealVector4);
        boolean boolean16 = openMapRealVector4.isInfinite();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor17 = openMapRealVector4.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector24 = openMapRealVector20.projection((org.apache.commons.math.linear.RealVector) openMapRealVector23);
        int int25 = openMapRealVector20.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector27 = openMapRealVector20.mapAddToSelf((double) (byte) -1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector30 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector33 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector34 = openMapRealVector30.projection((org.apache.commons.math.linear.RealVector) openMapRealVector33);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector37 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector40 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector41 = openMapRealVector37.projection((org.apache.commons.math.linear.RealVector) openMapRealVector40);
        double double42 = openMapRealVector33.dotProduct(openMapRealVector37);
        int int43 = openMapRealVector33.getMaxIndex();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor44 = openMapRealVector33.sparseIterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector47 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector50 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector51 = openMapRealVector47.projection((org.apache.commons.math.linear.RealVector) openMapRealVector50);
        int int52 = openMapRealVector47.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector54 = openMapRealVector47.mapAddToSelf((double) (byte) -1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector57 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector60 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector61 = openMapRealVector57.projection((org.apache.commons.math.linear.RealVector) openMapRealVector60);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor62 = openMapRealVector60.sparseIterator();
        org.apache.commons.math.linear.RealVector realVector63 = openMapRealVector54.projection((org.apache.commons.math.linear.RealVector) openMapRealVector60);
        org.apache.commons.math.linear.RealVector realVector64 = openMapRealVector33.add((org.apache.commons.math.linear.RealVector) openMapRealVector54);
        double double65 = openMapRealVector54.getSparsity();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector66 = openMapRealVector27.ebeMultiply((org.apache.commons.math.linear.RealVector) openMapRealVector54);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector69 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector72 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector73 = openMapRealVector69.projection((org.apache.commons.math.linear.RealVector) openMapRealVector72);
        double[] doubleArray74 = openMapRealVector72.getData();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector75 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray74);
        org.apache.commons.math.linear.RealVector realVector76 = openMapRealVector54.add(doubleArray74);
        org.apache.commons.math.linear.RealVector realVector77 = openMapRealVector4.add(doubleArray74);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on realVector76 and openMapRealVector20.", realVector76.equals(openMapRealVector20) == openMapRealVector20.equals(realVector76));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector3 = new org.apache.commons.math.linear.OpenMapRealVector(100, (int) '#', (-1.0d));
        org.apache.commons.math.linear.RealVector realVector5 = openMapRealVector3.mapDivide((double) 100.0f);
        double[] doubleArray6 = openMapRealVector3.getData();
        boolean boolean7 = openMapRealVector3.isNaN();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector10 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean11 = openMapRealVector10.isInfinite();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor12 = openMapRealVector10.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 1);
        openMapRealVector10.setSubVector((int) ' ', (org.apache.commons.math.linear.RealVector) openMapRealVector15);
        boolean boolean17 = openMapRealVector10.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector24 = openMapRealVector20.projection((org.apache.commons.math.linear.RealVector) openMapRealVector23);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector27 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector30 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector31 = openMapRealVector27.projection((org.apache.commons.math.linear.RealVector) openMapRealVector30);
        double double32 = openMapRealVector23.dotProduct(openMapRealVector27);
        int int33 = openMapRealVector23.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector36 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean37 = openMapRealVector36.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector38 = openMapRealVector23.append((org.apache.commons.math.linear.RealVector) openMapRealVector36);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector41 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector44 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector45 = openMapRealVector41.projection((org.apache.commons.math.linear.RealVector) openMapRealVector44);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector48 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector51 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector52 = openMapRealVector48.projection((org.apache.commons.math.linear.RealVector) openMapRealVector51);
        double double53 = openMapRealVector44.dotProduct(openMapRealVector48);
        int int54 = openMapRealVector44.getMaxIndex();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor55 = openMapRealVector44.sparseIterator();
        double double56 = openMapRealVector23.dotProduct((org.apache.commons.math.linear.RealVector) openMapRealVector44);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector59 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector62 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector63 = openMapRealVector59.projection((org.apache.commons.math.linear.RealVector) openMapRealVector62);
        int int64 = openMapRealVector59.getMaxIndex();
        double double65 = openMapRealVector44.getL1Distance((org.apache.commons.math.linear.RealVector) openMapRealVector59);
        int int66 = openMapRealVector59.getMaxIndex();
        org.apache.commons.math.linear.RealVector realVector68 = openMapRealVector59.mapDivide((double) 10.0f);
        double[] doubleArray69 = openMapRealVector59.toArray();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector70 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray69);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector71 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray69);
        double double72 = openMapRealVector10.getDistance(doubleArray69);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector73 = openMapRealVector3.projection(doubleArray69);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector10 and openMapRealVector20", openMapRealVector10.equals(openMapRealVector20) ? openMapRealVector10.hashCode() == openMapRealVector20.hashCode() : true);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector12);
        double double14 = openMapRealVector5.dotProduct(openMapRealVector9);
        int int15 = openMapRealVector5.getMaxIndex();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor16 = openMapRealVector5.sparseIterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector22 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector23 = openMapRealVector19.projection((org.apache.commons.math.linear.RealVector) openMapRealVector22);
        int int24 = openMapRealVector19.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = openMapRealVector19.mapAddToSelf((double) (byte) -1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector29 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector32 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector33 = openMapRealVector29.projection((org.apache.commons.math.linear.RealVector) openMapRealVector32);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor34 = openMapRealVector32.sparseIterator();
        org.apache.commons.math.linear.RealVector realVector35 = openMapRealVector26.projection((org.apache.commons.math.linear.RealVector) openMapRealVector32);
        org.apache.commons.math.linear.RealVector realVector36 = openMapRealVector5.add((org.apache.commons.math.linear.RealVector) openMapRealVector26);
        double double37 = openMapRealVector26.getSparsity();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector40 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector43 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector44 = openMapRealVector40.projection((org.apache.commons.math.linear.RealVector) openMapRealVector43);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector47 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector50 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector51 = openMapRealVector47.projection((org.apache.commons.math.linear.RealVector) openMapRealVector50);
        double double52 = openMapRealVector43.dotProduct(openMapRealVector47);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor53 = openMapRealVector47.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector54 = new org.apache.commons.math.linear.OpenMapRealVector(openMapRealVector47);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector56 = openMapRealVector54.mapAddToSelf((double) (-1.0f));
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector57 = openMapRealVector26.subtract((org.apache.commons.math.linear.RealVector) openMapRealVector54);
        double[] doubleArray58 = openMapRealVector54.toArray();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector57", openMapRealVector2.equals(openMapRealVector57) ? openMapRealVector2.hashCode() == openMapRealVector57.hashCode() : true);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector(100);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector3 = new org.apache.commons.math.linear.OpenMapRealVector((int) 'a');
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = openMapRealVector3.append((double) 1.0f);
        int int6 = openMapRealVector3.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = openMapRealVector1.append(openMapRealVector3);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector11 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector15 = openMapRealVector11.projection((org.apache.commons.math.linear.RealVector) openMapRealVector14);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector18 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector21 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector22 = openMapRealVector18.projection((org.apache.commons.math.linear.RealVector) openMapRealVector21);
        double double23 = openMapRealVector14.dotProduct(openMapRealVector18);
        int int24 = openMapRealVector14.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector27 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean28 = openMapRealVector27.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector29 = openMapRealVector14.append((org.apache.commons.math.linear.RealVector) openMapRealVector27);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector32 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector35 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector36 = openMapRealVector32.projection((org.apache.commons.math.linear.RealVector) openMapRealVector35);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector39 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector42 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector43 = openMapRealVector39.projection((org.apache.commons.math.linear.RealVector) openMapRealVector42);
        double double44 = openMapRealVector35.dotProduct(openMapRealVector39);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor45 = openMapRealVector39.iterator();
        java.lang.Double[] doubleArray48 = new java.lang.Double[] { 100.0d, 1.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector50 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray48, (double) (byte) 1);
        double[] doubleArray56 = new double[] { 10L, (-1.0f), (-1.0f), (-1), 100 };
        org.apache.commons.math.linear.RealMatrix realMatrix57 = openMapRealVector50.outerProduct(doubleArray56);
        org.apache.commons.math.linear.RealVector realVector58 = openMapRealVector39.add(doubleArray56);
        org.apache.commons.math.linear.RealVector realVector59 = openMapRealVector29.add(doubleArray56);
        openMapRealVector7.setSubVector(0, doubleArray56);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector61 = new org.apache.commons.math.linear.OpenMapRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector7);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector64 = openMapRealVector7.getSubVector((int) '#', (int) (byte) 100);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector69 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector72 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector73 = openMapRealVector69.projection((org.apache.commons.math.linear.RealVector) openMapRealVector72);
        double[] doubleArray74 = openMapRealVector72.getData();
        org.apache.commons.math.linear.RealVector realVector75 = openMapRealVector64.combine((double) (short) 0, (double) 1.0f, (org.apache.commons.math.linear.RealVector) openMapRealVector72);
        org.apache.commons.math.linear.RealVector realVector77 = openMapRealVector72.mapSubtractToSelf(14.177446878757825d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector1 and realVector75", openMapRealVector1.equals(realVector75) ? openMapRealVector1.hashCode() == realVector75.hashCode() : true);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector12);
        double double14 = openMapRealVector5.dotProduct(openMapRealVector9);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor15 = openMapRealVector9.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector16 = new org.apache.commons.math.linear.OpenMapRealVector(openMapRealVector9);
        double double17 = openMapRealVector9.getMinValue();
        double[] doubleArray18 = openMapRealVector9.toArray();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray18, (double) (short) 10);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor21 = openMapRealVector20.sparseIterator();
        openMapRealVector20.set((double) 197);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector29 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector30 = openMapRealVector26.projection((org.apache.commons.math.linear.RealVector) openMapRealVector29);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector33 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector36 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector37 = openMapRealVector33.projection((org.apache.commons.math.linear.RealVector) openMapRealVector36);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector40 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector43 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector44 = openMapRealVector40.projection((org.apache.commons.math.linear.RealVector) openMapRealVector43);
        double double45 = openMapRealVector36.dotProduct(openMapRealVector40);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor46 = openMapRealVector40.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector47 = openMapRealVector29.append((org.apache.commons.math.linear.RealVector) openMapRealVector40);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector49 = openMapRealVector40.append((double) 10);
        double double50 = openMapRealVector40.getNorm();
        org.apache.commons.math.linear.RealVector realVector52 = openMapRealVector40.mapSubtract((double) 0.0f);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector53 = openMapRealVector20.append(openMapRealVector40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and realVector52", openMapRealVector2.equals(realVector52) ? openMapRealVector2.hashCode() == realVector52.hashCode() : true);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector12);
        double double14 = openMapRealVector5.dotProduct(openMapRealVector9);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector16 = openMapRealVector5.mapAdd((double) (short) 1);
        boolean boolean17 = openMapRealVector16.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector18 = openMapRealVector16.unitVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector22 = new org.apache.commons.math.linear.OpenMapRealVector(100, (int) '#', (-1.0d));
        org.apache.commons.math.linear.RealVector realVector24 = openMapRealVector22.mapDivide((double) 100.0f);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = openMapRealVector22.append((double) 0.0f);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector27 = openMapRealVector18.ebeMultiply((org.apache.commons.math.linear.RealVector) openMapRealVector22);
        double double28 = openMapRealVector22.getMaxValue();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector27", openMapRealVector2.equals(openMapRealVector27) ? openMapRealVector2.hashCode() == openMapRealVector27.hashCode() : true);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector((int) 'a');
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector3 = openMapRealVector1.append((double) 1.0f);
        double double4 = openMapRealVector3.getLInfNorm();
        double double5 = openMapRealVector3.getSparsity();
        java.lang.Double[] doubleArray8 = new java.lang.Double[] { 100.0d, 1.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector10 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray8, (double) (byte) 1);
        int int11 = openMapRealVector10.getMaxIndex();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = openMapRealVector3.outerProduct((org.apache.commons.math.linear.RealVector) openMapRealVector10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector18 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector19 = openMapRealVector15.projection((org.apache.commons.math.linear.RealVector) openMapRealVector18);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector22 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector25 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector26 = openMapRealVector22.projection((org.apache.commons.math.linear.RealVector) openMapRealVector25);
        double double27 = openMapRealVector18.dotProduct(openMapRealVector22);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor28 = openMapRealVector22.iterator();
        boolean boolean29 = openMapRealVector22.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector32 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector35 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector36 = openMapRealVector32.projection((org.apache.commons.math.linear.RealVector) openMapRealVector35);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector39 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector42 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector43 = openMapRealVector39.projection((org.apache.commons.math.linear.RealVector) openMapRealVector42);
        double double44 = openMapRealVector35.dotProduct(openMapRealVector39);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector47 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector50 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector51 = openMapRealVector47.projection((org.apache.commons.math.linear.RealVector) openMapRealVector50);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor52 = openMapRealVector50.sparseIterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector53 = openMapRealVector35.append(openMapRealVector50);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector54 = openMapRealVector22.add(openMapRealVector50);
        double[] doubleArray59 = new double[] { (short) 1, 100.0f, 99, (-1) };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector60 = openMapRealVector54.append(doubleArray59);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector62 = openMapRealVector54.mapAdd((double) 'a');
        org.apache.commons.math.linear.RealVector realVector64 = openMapRealVector54.mapSubtractToSelf(0.0d);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector65 = openMapRealVector3.append(openMapRealVector54);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector15 and openMapRealVector54", openMapRealVector15.equals(openMapRealVector54) ? openMapRealVector15.hashCode() == openMapRealVector54.hashCode() : true);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector12);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector16 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector20 = openMapRealVector16.projection((org.apache.commons.math.linear.RealVector) openMapRealVector19);
        double double21 = openMapRealVector12.dotProduct(openMapRealVector16);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor22 = openMapRealVector16.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = openMapRealVector5.append((org.apache.commons.math.linear.RealVector) openMapRealVector16);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector25 = openMapRealVector16.append((double) 10);
        double double26 = openMapRealVector16.getNorm();
        org.apache.commons.math.linear.RealVector realVector28 = openMapRealVector16.mapSubtract((double) 0.0f);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector31 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector34 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector35 = openMapRealVector31.projection((org.apache.commons.math.linear.RealVector) openMapRealVector34);
        int int36 = openMapRealVector31.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector38 = openMapRealVector31.mapAddToSelf((double) (byte) -1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector41 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector44 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector45 = openMapRealVector41.projection((org.apache.commons.math.linear.RealVector) openMapRealVector44);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor46 = openMapRealVector44.sparseIterator();
        org.apache.commons.math.linear.RealVector realVector47 = openMapRealVector38.projection((org.apache.commons.math.linear.RealVector) openMapRealVector44);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector48 = new org.apache.commons.math.linear.OpenMapRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector44);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor49 = openMapRealVector44.sparseIterator();
        double double50 = openMapRealVector44.getSparsity();
        double double51 = openMapRealVector16.getL1Distance(openMapRealVector44);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and realVector28", openMapRealVector2.equals(realVector28) ? openMapRealVector2.hashCode() == realVector28.hashCode() : true);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector8 = openMapRealVector4.projection((org.apache.commons.math.linear.RealVector) openMapRealVector7);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector11 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector15 = openMapRealVector11.projection((org.apache.commons.math.linear.RealVector) openMapRealVector14);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector18 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector21 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector22 = openMapRealVector18.projection((org.apache.commons.math.linear.RealVector) openMapRealVector21);
        double double23 = openMapRealVector14.dotProduct(openMapRealVector18);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor24 = openMapRealVector18.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector25 = openMapRealVector7.append((org.apache.commons.math.linear.RealVector) openMapRealVector18);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector27 = openMapRealVector18.append((double) 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector30 = openMapRealVector27.getSubVector((int) 'a', (int) (byte) 1);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor31 = openMapRealVector30.iterator();
        double double32 = openMapRealVector1.getDistance(openMapRealVector30);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector35 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector38 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector39 = openMapRealVector35.projection((org.apache.commons.math.linear.RealVector) openMapRealVector38);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector42 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector45 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector46 = openMapRealVector42.projection((org.apache.commons.math.linear.RealVector) openMapRealVector45);
        double double47 = openMapRealVector38.dotProduct(openMapRealVector42);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor48 = openMapRealVector42.iterator();
        java.lang.Double[] doubleArray51 = new java.lang.Double[] { 100.0d, 1.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector53 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray51, (double) (byte) 1);
        double[] doubleArray59 = new double[] { 10L, (-1.0f), (-1.0f), (-1), 100 };
        org.apache.commons.math.linear.RealMatrix realMatrix60 = openMapRealVector53.outerProduct(doubleArray59);
        org.apache.commons.math.linear.RealVector realVector61 = openMapRealVector42.add(doubleArray59);
        boolean boolean62 = openMapRealVector30.equals((java.lang.Object) openMapRealVector42);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector67 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector70 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector71 = openMapRealVector67.projection((org.apache.commons.math.linear.RealVector) openMapRealVector70);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector74 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector77 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector78 = openMapRealVector74.projection((org.apache.commons.math.linear.RealVector) openMapRealVector77);
        double double79 = openMapRealVector70.dotProduct(openMapRealVector74);
        int int80 = openMapRealVector70.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector83 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean84 = openMapRealVector83.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector85 = openMapRealVector70.append((org.apache.commons.math.linear.RealVector) openMapRealVector83);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector89 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector92 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector93 = openMapRealVector89.projection((org.apache.commons.math.linear.RealVector) openMapRealVector92);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor94 = openMapRealVector92.sparseIterator();
        openMapRealVector83.setSubVector((int) (short) 0, (org.apache.commons.math.linear.RealVector) openMapRealVector92);
        double[] doubleArray96 = openMapRealVector83.toArray();
        double[] doubleArray97 = openMapRealVector83.toArray();
        org.apache.commons.math.linear.RealVector realVector98 = openMapRealVector42.combine(0.009900990099009901d, 0.0d, (org.apache.commons.math.linear.RealVector) openMapRealVector83);
        java.lang.Class<?> wildcardClass99 = openMapRealVector83.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector4 and realVector98", openMapRealVector4.equals(realVector98) ? openMapRealVector4.hashCode() == realVector98.hashCode() : true);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector12);
        double double14 = openMapRealVector5.dotProduct(openMapRealVector9);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector17 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector21 = openMapRealVector17.projection((org.apache.commons.math.linear.RealVector) openMapRealVector20);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor22 = openMapRealVector20.sparseIterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = openMapRealVector5.append(openMapRealVector20);
        org.apache.commons.math.linear.RealVector realVector25 = openMapRealVector20.mapMultiplyToSelf((double) (-1L));
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector27 = openMapRealVector20.mapAdd((double) 10L);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector30 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector33 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector34 = openMapRealVector30.projection((org.apache.commons.math.linear.RealVector) openMapRealVector33);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor35 = openMapRealVector33.sparseIterator();
        boolean boolean36 = openMapRealVector33.isNaN();
        double double37 = openMapRealVector20.dotProduct((org.apache.commons.math.linear.RealVector) openMapRealVector33);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector40 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector43 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector44 = openMapRealVector40.projection((org.apache.commons.math.linear.RealVector) openMapRealVector43);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector47 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector50 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector51 = openMapRealVector47.projection((org.apache.commons.math.linear.RealVector) openMapRealVector50);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector54 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector57 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector58 = openMapRealVector54.projection((org.apache.commons.math.linear.RealVector) openMapRealVector57);
        double double59 = openMapRealVector50.dotProduct(openMapRealVector54);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor60 = openMapRealVector54.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector61 = openMapRealVector43.append((org.apache.commons.math.linear.RealVector) openMapRealVector54);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector63 = openMapRealVector54.mapAdd((double) (byte) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector64 = openMapRealVector20.subtract(openMapRealVector63);
        double double65 = openMapRealVector64.getMinValue();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector63", openMapRealVector2.equals(openMapRealVector63) ? openMapRealVector2.hashCode() == openMapRealVector63.hashCode() : true);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        java.lang.Double[] doubleArray5 = new java.lang.Double[] { 1.0E-12d, 100.0d, 0.0d, 101.0d, 100.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray5);
        java.lang.Double[] doubleArray11 = new java.lang.Double[] { 0.0d, (-1.0d), 100.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector13 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray11, (double) (byte) 1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray11, (double) (short) 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector17 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray11, (double) (byte) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector18 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray11);
        double double19 = openMapRealVector18.getL1Norm();
        openMapRealVector6.setSubVector(0, (org.apache.commons.math.linear.RealVector) openMapRealVector18);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector27 = openMapRealVector23.projection((org.apache.commons.math.linear.RealVector) openMapRealVector26);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector30 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector33 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector34 = openMapRealVector30.projection((org.apache.commons.math.linear.RealVector) openMapRealVector33);
        double double35 = openMapRealVector26.dotProduct(openMapRealVector30);
        int int36 = openMapRealVector26.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector39 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean40 = openMapRealVector39.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector41 = openMapRealVector26.append((org.apache.commons.math.linear.RealVector) openMapRealVector39);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector45 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector48 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector49 = openMapRealVector45.projection((org.apache.commons.math.linear.RealVector) openMapRealVector48);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor50 = openMapRealVector48.sparseIterator();
        openMapRealVector39.setSubVector((int) (short) 0, (org.apache.commons.math.linear.RealVector) openMapRealVector48);
        double double52 = openMapRealVector39.getLInfNorm();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector57 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector60 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector61 = openMapRealVector57.projection((org.apache.commons.math.linear.RealVector) openMapRealVector60);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector64 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector67 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector68 = openMapRealVector64.projection((org.apache.commons.math.linear.RealVector) openMapRealVector67);
        double double69 = openMapRealVector60.dotProduct(openMapRealVector64);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector72 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector75 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector76 = openMapRealVector72.projection((org.apache.commons.math.linear.RealVector) openMapRealVector75);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor77 = openMapRealVector75.sparseIterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector78 = openMapRealVector60.append(openMapRealVector75);
        org.apache.commons.math.linear.RealVector realVector80 = openMapRealVector75.mapMultiplyToSelf((double) (-1L));
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector82 = openMapRealVector75.mapAdd((double) 10L);
        org.apache.commons.math.linear.RealVector realVector83 = openMapRealVector39.combine((double) (-1.0f), (double) (-1.0f), (org.apache.commons.math.linear.RealVector) openMapRealVector75);
        double double84 = openMapRealVector18.getL1Distance(openMapRealVector75);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector23 and openMapRealVector39", openMapRealVector23.equals(openMapRealVector39) ? openMapRealVector23.hashCode() == openMapRealVector39.hashCode() : true);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector3 = new org.apache.commons.math.linear.OpenMapRealVector(100, (int) '#', (-1.0d));
        org.apache.commons.math.linear.RealVector realVector5 = openMapRealVector3.mapDivide((double) 100.0f);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = openMapRealVector3.append((double) 0.0f);
        double double8 = openMapRealVector3.getSparsity();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector11 = openMapRealVector3.getSubVector(1, 99);
        int int12 = openMapRealVector11.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector18 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector19 = openMapRealVector15.projection((org.apache.commons.math.linear.RealVector) openMapRealVector18);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector22 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector25 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector26 = openMapRealVector22.projection((org.apache.commons.math.linear.RealVector) openMapRealVector25);
        double double27 = openMapRealVector18.dotProduct(openMapRealVector22);
        int int28 = openMapRealVector18.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector31 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean32 = openMapRealVector31.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector33 = openMapRealVector18.append((org.apache.commons.math.linear.RealVector) openMapRealVector31);
        double[] doubleArray38 = new double[] { 100.0d, (-1.0d), (-1.0f) };
        openMapRealVector33.setSubVector(99, doubleArray38);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector41 = openMapRealVector33.mapAdd(0.0d);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector44 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean45 = openMapRealVector44.isInfinite();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor46 = openMapRealVector44.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector49 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 1);
        openMapRealVector44.setSubVector((int) ' ', (org.apache.commons.math.linear.RealVector) openMapRealVector49);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector53 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector56 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector57 = openMapRealVector53.projection((org.apache.commons.math.linear.RealVector) openMapRealVector56);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector60 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector63 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector64 = openMapRealVector60.projection((org.apache.commons.math.linear.RealVector) openMapRealVector63);
        double double65 = openMapRealVector56.dotProduct(openMapRealVector60);
        int int66 = openMapRealVector56.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector69 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean70 = openMapRealVector69.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector71 = openMapRealVector56.append((org.apache.commons.math.linear.RealVector) openMapRealVector69);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector72 = openMapRealVector44.append(openMapRealVector71);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector74 = openMapRealVector44.mapAddToSelf((double) 199);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector77 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector80 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector81 = openMapRealVector77.projection((org.apache.commons.math.linear.RealVector) openMapRealVector80);
        double[] doubleArray82 = openMapRealVector80.getData();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector83 = openMapRealVector74.projection(doubleArray82);
        org.apache.commons.math.linear.RealMatrix realMatrix84 = openMapRealVector41.outerProduct(doubleArray82);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector85 = openMapRealVector11.append(doubleArray82);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector33 and openMapRealVector41", openMapRealVector33.equals(openMapRealVector41) ? openMapRealVector33.hashCode() == openMapRealVector41.hashCode() : true);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector12);
        double double14 = openMapRealVector5.dotProduct(openMapRealVector9);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor15 = openMapRealVector9.iterator();
        boolean boolean16 = openMapRealVector9.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector22 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector23 = openMapRealVector19.projection((org.apache.commons.math.linear.RealVector) openMapRealVector22);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector29 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector30 = openMapRealVector26.projection((org.apache.commons.math.linear.RealVector) openMapRealVector29);
        double double31 = openMapRealVector22.dotProduct(openMapRealVector26);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector34 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector37 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector38 = openMapRealVector34.projection((org.apache.commons.math.linear.RealVector) openMapRealVector37);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor39 = openMapRealVector37.sparseIterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector40 = openMapRealVector22.append(openMapRealVector37);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector41 = openMapRealVector9.add(openMapRealVector37);
        double[] doubleArray46 = new double[] { (short) 1, 100.0f, 99, (-1) };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector47 = openMapRealVector41.append(doubleArray46);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector49 = openMapRealVector41.mapAdd((double) 'a');
        org.apache.commons.math.linear.RealVector realVector51 = openMapRealVector41.mapSubtractToSelf(0.0d);
        boolean boolean52 = openMapRealVector41.isNaN();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector41", openMapRealVector2.equals(openMapRealVector41) ? openMapRealVector2.hashCode() == openMapRealVector41.hashCode() : true);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector12);
        double double14 = openMapRealVector5.dotProduct(openMapRealVector9);
        int int15 = openMapRealVector5.getMaxIndex();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor16 = openMapRealVector5.sparseIterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector22 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector23 = openMapRealVector19.projection((org.apache.commons.math.linear.RealVector) openMapRealVector22);
        int int24 = openMapRealVector19.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = openMapRealVector19.mapAddToSelf((double) (byte) -1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector29 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector32 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector33 = openMapRealVector29.projection((org.apache.commons.math.linear.RealVector) openMapRealVector32);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor34 = openMapRealVector32.sparseIterator();
        org.apache.commons.math.linear.RealVector realVector35 = openMapRealVector26.projection((org.apache.commons.math.linear.RealVector) openMapRealVector32);
        org.apache.commons.math.linear.RealVector realVector36 = openMapRealVector5.add((org.apache.commons.math.linear.RealVector) openMapRealVector26);
        int int37 = openMapRealVector5.getDimension();
        double double38 = openMapRealVector5.getMinValue();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector40 = openMapRealVector5.mapAddToSelf(0.0d);
        org.apache.commons.math.linear.RealVector realVector42 = openMapRealVector40.mapDivide((double) 200);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector40", openMapRealVector2.equals(openMapRealVector40) ? openMapRealVector2.hashCode() == openMapRealVector40.hashCode() : true);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector12);
        double double14 = openMapRealVector5.dotProduct(openMapRealVector9);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor15 = openMapRealVector9.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector24 = openMapRealVector20.projection((org.apache.commons.math.linear.RealVector) openMapRealVector23);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector27 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector30 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector31 = openMapRealVector27.projection((org.apache.commons.math.linear.RealVector) openMapRealVector30);
        double double32 = openMapRealVector23.dotProduct(openMapRealVector27);
        int int33 = openMapRealVector23.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector36 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean37 = openMapRealVector36.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector38 = openMapRealVector23.append((org.apache.commons.math.linear.RealVector) openMapRealVector36);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector41 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector44 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector45 = openMapRealVector41.projection((org.apache.commons.math.linear.RealVector) openMapRealVector44);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector48 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector51 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector52 = openMapRealVector48.projection((org.apache.commons.math.linear.RealVector) openMapRealVector51);
        double double53 = openMapRealVector44.dotProduct(openMapRealVector48);
        int int54 = openMapRealVector44.getMaxIndex();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor55 = openMapRealVector44.sparseIterator();
        double double56 = openMapRealVector23.dotProduct((org.apache.commons.math.linear.RealVector) openMapRealVector44);
        org.apache.commons.math.linear.RealVector realVector57 = openMapRealVector9.combineToSelf(1.0d, (double) 100.0f, (org.apache.commons.math.linear.RealVector) openMapRealVector44);
        double double58 = openMapRealVector9.getL1Norm();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector9", openMapRealVector2.equals(openMapRealVector9) ? openMapRealVector2.hashCode() == openMapRealVector9.hashCode() : true);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector12);
        double double14 = openMapRealVector5.dotProduct(openMapRealVector9);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector17 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector21 = openMapRealVector17.projection((org.apache.commons.math.linear.RealVector) openMapRealVector20);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor22 = openMapRealVector20.sparseIterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = openMapRealVector5.append(openMapRealVector20);
        org.apache.commons.math.linear.RealVector realVector25 = openMapRealVector20.mapMultiplyToSelf((double) (-1L));
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector28 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector31 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector32 = openMapRealVector28.projection((org.apache.commons.math.linear.RealVector) openMapRealVector31);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector35 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector38 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector39 = openMapRealVector35.projection((org.apache.commons.math.linear.RealVector) openMapRealVector38);
        double double40 = openMapRealVector31.dotProduct(openMapRealVector35);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector43 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector46 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector47 = openMapRealVector43.projection((org.apache.commons.math.linear.RealVector) openMapRealVector46);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor48 = openMapRealVector46.sparseIterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector49 = openMapRealVector31.append(openMapRealVector46);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector50 = openMapRealVector20.append((org.apache.commons.math.linear.RealVector) openMapRealVector31);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector52 = openMapRealVector31.mapAdd((double) 0);
        boolean boolean53 = openMapRealVector31.isNaN();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector52", openMapRealVector2.equals(openMapRealVector52) ? openMapRealVector2.hashCode() == openMapRealVector52.hashCode() : true);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector10 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector11 = openMapRealVector7.projection((org.apache.commons.math.linear.RealVector) openMapRealVector10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector17 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector18 = openMapRealVector14.projection((org.apache.commons.math.linear.RealVector) openMapRealVector17);
        double double19 = openMapRealVector10.dotProduct(openMapRealVector14);
        int int20 = openMapRealVector10.getMaxIndex();
        org.apache.commons.math.linear.RealVector realVector21 = openMapRealVector2.combineToSelf((double) (byte) -1, (double) '4', (org.apache.commons.math.linear.RealVector) openMapRealVector10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector24 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector27 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector28 = openMapRealVector24.projection((org.apache.commons.math.linear.RealVector) openMapRealVector27);
        int int29 = openMapRealVector24.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector31 = openMapRealVector24.mapAddToSelf((double) (byte) -1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector34 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector37 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector38 = openMapRealVector34.projection((org.apache.commons.math.linear.RealVector) openMapRealVector37);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector41 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector44 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector45 = openMapRealVector41.projection((org.apache.commons.math.linear.RealVector) openMapRealVector44);
        double double46 = openMapRealVector37.dotProduct(openMapRealVector41);
        int int47 = openMapRealVector37.getMaxIndex();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor48 = openMapRealVector37.sparseIterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector51 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector54 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector55 = openMapRealVector51.projection((org.apache.commons.math.linear.RealVector) openMapRealVector54);
        int int56 = openMapRealVector51.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector58 = openMapRealVector51.mapAddToSelf((double) (byte) -1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector61 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector64 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector65 = openMapRealVector61.projection((org.apache.commons.math.linear.RealVector) openMapRealVector64);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor66 = openMapRealVector64.sparseIterator();
        org.apache.commons.math.linear.RealVector realVector67 = openMapRealVector58.projection((org.apache.commons.math.linear.RealVector) openMapRealVector64);
        org.apache.commons.math.linear.RealVector realVector68 = openMapRealVector37.add((org.apache.commons.math.linear.RealVector) openMapRealVector58);
        double double69 = openMapRealVector58.getSparsity();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector70 = openMapRealVector31.ebeMultiply((org.apache.commons.math.linear.RealVector) openMapRealVector58);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector71 = openMapRealVector58.unitVector();
        double double72 = openMapRealVector58.getSparsity();
        org.apache.commons.math.linear.RealVector realVector74 = openMapRealVector58.mapSubtractToSelf((double) (short) 1);
        double[] doubleArray75 = openMapRealVector58.getData();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector78 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector81 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector82 = openMapRealVector78.projection((org.apache.commons.math.linear.RealVector) openMapRealVector81);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector85 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector88 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector89 = openMapRealVector85.projection((org.apache.commons.math.linear.RealVector) openMapRealVector88);
        double double90 = openMapRealVector81.dotProduct(openMapRealVector85);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector92 = openMapRealVector81.mapAdd((double) (short) 1);
        boolean boolean93 = openMapRealVector92.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector94 = openMapRealVector58.subtract(openMapRealVector92);
        org.apache.commons.math.linear.RealVector realVector96 = openMapRealVector58.mapSubtract(14.142135623730951d);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector97 = openMapRealVector2.subtract(openMapRealVector58);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector7 and openMapRealVector2", openMapRealVector7.equals(openMapRealVector2) ? openMapRealVector7.hashCode() == openMapRealVector2.hashCode() : true);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        int int7 = openMapRealVector2.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector2.mapAddToSelf((double) (byte) -1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector16 = openMapRealVector12.projection((org.apache.commons.math.linear.RealVector) openMapRealVector15);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor17 = openMapRealVector15.sparseIterator();
        org.apache.commons.math.linear.RealVector realVector18 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector15);
        openMapRealVector15.set(0.0d);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor21 = openMapRealVector15.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector24 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector27 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector28 = openMapRealVector24.projection((org.apache.commons.math.linear.RealVector) openMapRealVector27);
        int int29 = openMapRealVector24.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector31 = openMapRealVector24.mapAddToSelf((double) (byte) -1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector34 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector37 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector38 = openMapRealVector34.projection((org.apache.commons.math.linear.RealVector) openMapRealVector37);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector41 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector44 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector45 = openMapRealVector41.projection((org.apache.commons.math.linear.RealVector) openMapRealVector44);
        double double46 = openMapRealVector37.dotProduct(openMapRealVector41);
        int int47 = openMapRealVector37.getMaxIndex();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor48 = openMapRealVector37.sparseIterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector51 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector54 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector55 = openMapRealVector51.projection((org.apache.commons.math.linear.RealVector) openMapRealVector54);
        int int56 = openMapRealVector51.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector58 = openMapRealVector51.mapAddToSelf((double) (byte) -1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector61 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector64 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector65 = openMapRealVector61.projection((org.apache.commons.math.linear.RealVector) openMapRealVector64);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor66 = openMapRealVector64.sparseIterator();
        org.apache.commons.math.linear.RealVector realVector67 = openMapRealVector58.projection((org.apache.commons.math.linear.RealVector) openMapRealVector64);
        org.apache.commons.math.linear.RealVector realVector68 = openMapRealVector37.add((org.apache.commons.math.linear.RealVector) openMapRealVector58);
        double double69 = openMapRealVector58.getSparsity();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector70 = openMapRealVector31.ebeMultiply((org.apache.commons.math.linear.RealVector) openMapRealVector58);
        double[] doubleArray71 = openMapRealVector70.getData();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector72 = openMapRealVector15.subtract(doubleArray71);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector73 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray71);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector5 and openMapRealVector15", openMapRealVector5.equals(openMapRealVector15) ? openMapRealVector5.hashCode() == openMapRealVector15.hashCode() : true);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector3 = new org.apache.commons.math.linear.OpenMapRealVector(100, (int) '#', (-1.0d));
        int int4 = openMapRealVector3.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean8 = openMapRealVector7.isInfinite();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor9 = openMapRealVector7.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 1);
        openMapRealVector7.setSubVector((int) ' ', (org.apache.commons.math.linear.RealVector) openMapRealVector12);
        boolean boolean14 = openMapRealVector7.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector17 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector21 = openMapRealVector17.projection((org.apache.commons.math.linear.RealVector) openMapRealVector20);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector24 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector27 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector28 = openMapRealVector24.projection((org.apache.commons.math.linear.RealVector) openMapRealVector27);
        double double29 = openMapRealVector20.dotProduct(openMapRealVector24);
        int int30 = openMapRealVector20.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector33 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean34 = openMapRealVector33.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector35 = openMapRealVector20.append((org.apache.commons.math.linear.RealVector) openMapRealVector33);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector38 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector41 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector42 = openMapRealVector38.projection((org.apache.commons.math.linear.RealVector) openMapRealVector41);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector45 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector48 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector49 = openMapRealVector45.projection((org.apache.commons.math.linear.RealVector) openMapRealVector48);
        double double50 = openMapRealVector41.dotProduct(openMapRealVector45);
        int int51 = openMapRealVector41.getMaxIndex();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor52 = openMapRealVector41.sparseIterator();
        double double53 = openMapRealVector20.dotProduct((org.apache.commons.math.linear.RealVector) openMapRealVector41);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector56 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector59 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector60 = openMapRealVector56.projection((org.apache.commons.math.linear.RealVector) openMapRealVector59);
        int int61 = openMapRealVector56.getMaxIndex();
        double double62 = openMapRealVector41.getL1Distance((org.apache.commons.math.linear.RealVector) openMapRealVector56);
        int int63 = openMapRealVector56.getMaxIndex();
        org.apache.commons.math.linear.RealVector realVector65 = openMapRealVector56.mapDivide((double) 10.0f);
        double[] doubleArray66 = openMapRealVector56.toArray();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector67 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray66);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector68 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray66);
        double double69 = openMapRealVector7.getDistance(doubleArray66);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector70 = openMapRealVector3.ebeDivide(doubleArray66);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector7 and openMapRealVector17", openMapRealVector7.equals(openMapRealVector17) ? openMapRealVector7.hashCode() == openMapRealVector17.hashCode() : true);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector((int) 'a', (int) (short) 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector8 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector9 = openMapRealVector5.projection((org.apache.commons.math.linear.RealVector) openMapRealVector8);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector16 = openMapRealVector12.projection((org.apache.commons.math.linear.RealVector) openMapRealVector15);
        double double17 = openMapRealVector8.dotProduct(openMapRealVector12);
        int int18 = openMapRealVector8.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector21 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean22 = openMapRealVector21.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = openMapRealVector8.append((org.apache.commons.math.linear.RealVector) openMapRealVector21);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector29 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector30 = openMapRealVector26.projection((org.apache.commons.math.linear.RealVector) openMapRealVector29);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector33 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector36 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector37 = openMapRealVector33.projection((org.apache.commons.math.linear.RealVector) openMapRealVector36);
        double double38 = openMapRealVector29.dotProduct(openMapRealVector33);
        int int39 = openMapRealVector29.getMaxIndex();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor40 = openMapRealVector29.sparseIterator();
        double double41 = openMapRealVector8.dotProduct((org.apache.commons.math.linear.RealVector) openMapRealVector29);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector44 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector47 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector48 = openMapRealVector44.projection((org.apache.commons.math.linear.RealVector) openMapRealVector47);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector51 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector54 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector55 = openMapRealVector51.projection((org.apache.commons.math.linear.RealVector) openMapRealVector54);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector58 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector61 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector62 = openMapRealVector58.projection((org.apache.commons.math.linear.RealVector) openMapRealVector61);
        double double63 = openMapRealVector54.dotProduct(openMapRealVector58);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor64 = openMapRealVector58.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector65 = openMapRealVector47.append((org.apache.commons.math.linear.RealVector) openMapRealVector58);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector66 = openMapRealVector29.add(openMapRealVector47);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector69 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector72 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector73 = openMapRealVector69.projection((org.apache.commons.math.linear.RealVector) openMapRealVector72);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector76 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector79 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector80 = openMapRealVector76.projection((org.apache.commons.math.linear.RealVector) openMapRealVector79);
        double double81 = openMapRealVector72.dotProduct(openMapRealVector76);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector84 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector87 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector88 = openMapRealVector84.projection((org.apache.commons.math.linear.RealVector) openMapRealVector87);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor89 = openMapRealVector87.sparseIterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector90 = openMapRealVector72.append(openMapRealVector87);
        double double91 = openMapRealVector47.getL1Distance(openMapRealVector72);
        org.apache.commons.math.linear.RealMatrix realMatrix92 = openMapRealVector2.outerProduct((org.apache.commons.math.linear.RealVector) openMapRealVector72);
        org.apache.commons.math.linear.RealVector realVector94 = openMapRealVector72.mapSubtractToSelf((double) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector95 = new org.apache.commons.math.linear.OpenMapRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector72);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector5 and openMapRealVector72", openMapRealVector5.equals(openMapRealVector72) ? openMapRealVector5.hashCode() == openMapRealVector72.hashCode() : true);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean3 = openMapRealVector2.isInfinite();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor4 = openMapRealVector2.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 1);
        openMapRealVector2.setSubVector((int) ' ', (org.apache.commons.math.linear.RealVector) openMapRealVector7);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector11 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector15 = openMapRealVector11.projection((org.apache.commons.math.linear.RealVector) openMapRealVector14);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector18 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector21 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector22 = openMapRealVector18.projection((org.apache.commons.math.linear.RealVector) openMapRealVector21);
        double double23 = openMapRealVector14.dotProduct(openMapRealVector18);
        int int24 = openMapRealVector14.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector27 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean28 = openMapRealVector27.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector29 = openMapRealVector14.append((org.apache.commons.math.linear.RealVector) openMapRealVector27);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector30 = openMapRealVector2.append(openMapRealVector29);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector33 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector36 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector37 = openMapRealVector33.projection((org.apache.commons.math.linear.RealVector) openMapRealVector36);
        int int38 = openMapRealVector33.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector40 = openMapRealVector33.mapAddToSelf((double) (byte) -1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector43 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector46 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector47 = openMapRealVector43.projection((org.apache.commons.math.linear.RealVector) openMapRealVector46);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor48 = openMapRealVector46.sparseIterator();
        org.apache.commons.math.linear.RealVector realVector49 = openMapRealVector40.projection((org.apache.commons.math.linear.RealVector) openMapRealVector46);
        openMapRealVector46.set(0.0d);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor52 = openMapRealVector46.iterator();
        openMapRealVector46.set((double) (-1L));
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector55 = openMapRealVector2.add(openMapRealVector46);
        boolean boolean56 = openMapRealVector46.isInfinite();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector11", openMapRealVector2.equals(openMapRealVector11) ? openMapRealVector2.hashCode() == openMapRealVector11.hashCode() : true);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector3 = new org.apache.commons.math.linear.OpenMapRealVector(100, (int) '#', (-1.0d));
        org.apache.commons.math.linear.RealVector realVector5 = openMapRealVector3.mapDivide((double) 100.0f);
        double[] doubleArray6 = openMapRealVector3.getData();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector12);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector16 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector20 = openMapRealVector16.projection((org.apache.commons.math.linear.RealVector) openMapRealVector19);
        double double21 = openMapRealVector12.dotProduct(openMapRealVector16);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor22 = openMapRealVector16.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector24 = openMapRealVector16.mapAddToSelf((double) ' ');
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = openMapRealVector16.mapAddToSelf((double) (short) 100);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector29 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector32 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector33 = openMapRealVector29.projection((org.apache.commons.math.linear.RealVector) openMapRealVector32);
        double[] doubleArray34 = openMapRealVector32.toArray();
        org.apache.commons.math.linear.RealVector realVector35 = openMapRealVector16.add(doubleArray34);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector36 = openMapRealVector3.ebeDivide(doubleArray34);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on realVector35 and openMapRealVector16.", realVector35.equals(openMapRealVector16) == openMapRealVector16.equals(realVector35));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean3 = openMapRealVector2.isInfinite();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor4 = openMapRealVector2.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 1);
        openMapRealVector2.setSubVector((int) ' ', (org.apache.commons.math.linear.RealVector) openMapRealVector7);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector11 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector15 = openMapRealVector11.projection((org.apache.commons.math.linear.RealVector) openMapRealVector14);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector18 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector21 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector22 = openMapRealVector18.projection((org.apache.commons.math.linear.RealVector) openMapRealVector21);
        double double23 = openMapRealVector14.dotProduct(openMapRealVector18);
        int int24 = openMapRealVector14.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector27 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean28 = openMapRealVector27.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector29 = openMapRealVector14.append((org.apache.commons.math.linear.RealVector) openMapRealVector27);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector30 = openMapRealVector2.append(openMapRealVector29);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector32 = openMapRealVector29.append((double) 100L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector11", openMapRealVector2.equals(openMapRealVector11) ? openMapRealVector2.hashCode() == openMapRealVector11.hashCode() : true);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector8 = openMapRealVector4.projection((org.apache.commons.math.linear.RealVector) openMapRealVector7);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector11 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector15 = openMapRealVector11.projection((org.apache.commons.math.linear.RealVector) openMapRealVector14);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector18 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector21 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector22 = openMapRealVector18.projection((org.apache.commons.math.linear.RealVector) openMapRealVector21);
        double double23 = openMapRealVector14.dotProduct(openMapRealVector18);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor24 = openMapRealVector18.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector25 = openMapRealVector7.append((org.apache.commons.math.linear.RealVector) openMapRealVector18);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector27 = openMapRealVector18.append((double) 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector30 = openMapRealVector27.getSubVector((int) 'a', (int) (byte) 1);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor31 = openMapRealVector30.iterator();
        double double32 = openMapRealVector1.getDistance(openMapRealVector30);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector35 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector38 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector39 = openMapRealVector35.projection((org.apache.commons.math.linear.RealVector) openMapRealVector38);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector42 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector45 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector46 = openMapRealVector42.projection((org.apache.commons.math.linear.RealVector) openMapRealVector45);
        double double47 = openMapRealVector38.dotProduct(openMapRealVector42);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor48 = openMapRealVector42.iterator();
        java.lang.Double[] doubleArray51 = new java.lang.Double[] { 100.0d, 1.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector53 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray51, (double) (byte) 1);
        double[] doubleArray59 = new double[] { 10L, (-1.0f), (-1.0f), (-1), 100 };
        org.apache.commons.math.linear.RealMatrix realMatrix60 = openMapRealVector53.outerProduct(doubleArray59);
        org.apache.commons.math.linear.RealVector realVector61 = openMapRealVector42.add(doubleArray59);
        boolean boolean62 = openMapRealVector30.equals((java.lang.Object) openMapRealVector42);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector67 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector70 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector71 = openMapRealVector67.projection((org.apache.commons.math.linear.RealVector) openMapRealVector70);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector74 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector77 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector78 = openMapRealVector74.projection((org.apache.commons.math.linear.RealVector) openMapRealVector77);
        double double79 = openMapRealVector70.dotProduct(openMapRealVector74);
        int int80 = openMapRealVector70.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector83 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean84 = openMapRealVector83.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector85 = openMapRealVector70.append((org.apache.commons.math.linear.RealVector) openMapRealVector83);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector89 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector92 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector93 = openMapRealVector89.projection((org.apache.commons.math.linear.RealVector) openMapRealVector92);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor94 = openMapRealVector92.sparseIterator();
        openMapRealVector83.setSubVector((int) (short) 0, (org.apache.commons.math.linear.RealVector) openMapRealVector92);
        double[] doubleArray96 = openMapRealVector83.toArray();
        double[] doubleArray97 = openMapRealVector83.toArray();
        org.apache.commons.math.linear.RealVector realVector98 = openMapRealVector42.combine(0.009900990099009901d, 0.0d, (org.apache.commons.math.linear.RealVector) openMapRealVector83);
        int int99 = openMapRealVector83.getDimension();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector4 and realVector98", openMapRealVector4.equals(realVector98) ? openMapRealVector4.hashCode() == realVector98.hashCode() : true);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        int int7 = openMapRealVector2.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector2.mapAddToSelf((double) (byte) -1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector16 = openMapRealVector12.projection((org.apache.commons.math.linear.RealVector) openMapRealVector15);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector22 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector23 = openMapRealVector19.projection((org.apache.commons.math.linear.RealVector) openMapRealVector22);
        double double24 = openMapRealVector15.dotProduct(openMapRealVector19);
        int int25 = openMapRealVector15.getMaxIndex();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor26 = openMapRealVector15.sparseIterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector29 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector32 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector33 = openMapRealVector29.projection((org.apache.commons.math.linear.RealVector) openMapRealVector32);
        int int34 = openMapRealVector29.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector36 = openMapRealVector29.mapAddToSelf((double) (byte) -1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector39 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector42 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector43 = openMapRealVector39.projection((org.apache.commons.math.linear.RealVector) openMapRealVector42);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor44 = openMapRealVector42.sparseIterator();
        org.apache.commons.math.linear.RealVector realVector45 = openMapRealVector36.projection((org.apache.commons.math.linear.RealVector) openMapRealVector42);
        org.apache.commons.math.linear.RealVector realVector46 = openMapRealVector15.add((org.apache.commons.math.linear.RealVector) openMapRealVector36);
        double double47 = openMapRealVector36.getSparsity();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector48 = openMapRealVector9.ebeMultiply((org.apache.commons.math.linear.RealVector) openMapRealVector36);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector49 = openMapRealVector36.unitVector();
        org.apache.commons.math.linear.RealVector realVector51 = openMapRealVector49.mapMultiplyToSelf((double) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector54 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        double double55 = openMapRealVector49.getDistance((org.apache.commons.math.linear.RealVector) openMapRealVector54);
        int int56 = openMapRealVector54.getMinIndex();
        double double57 = openMapRealVector54.getL1Norm();
        double double58 = openMapRealVector54.getLInfNorm();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector61 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector64 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector65 = openMapRealVector61.projection((org.apache.commons.math.linear.RealVector) openMapRealVector64);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector68 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector71 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector72 = openMapRealVector68.projection((org.apache.commons.math.linear.RealVector) openMapRealVector71);
        double double73 = openMapRealVector64.dotProduct(openMapRealVector68);
        int int74 = openMapRealVector64.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector77 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean78 = openMapRealVector77.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector79 = openMapRealVector64.append((org.apache.commons.math.linear.RealVector) openMapRealVector77);
        double[] doubleArray80 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector81 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray80);
        org.apache.commons.math.linear.RealVector realVector82 = openMapRealVector64.add(doubleArray80);
        double double83 = openMapRealVector54.getL1Distance(openMapRealVector64);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on realVector82 and openMapRealVector81.", realVector82.equals(openMapRealVector81) == openMapRealVector81.equals(realVector82));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector12);
        double double14 = openMapRealVector5.dotProduct(openMapRealVector9);
        int int15 = openMapRealVector5.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector18 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean19 = openMapRealVector18.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = openMapRealVector5.append((org.apache.commons.math.linear.RealVector) openMapRealVector18);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector21 = openMapRealVector5.copy();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector29 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector30 = openMapRealVector26.projection((org.apache.commons.math.linear.RealVector) openMapRealVector29);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector33 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector36 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector37 = openMapRealVector33.projection((org.apache.commons.math.linear.RealVector) openMapRealVector36);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector40 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector43 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector44 = openMapRealVector40.projection((org.apache.commons.math.linear.RealVector) openMapRealVector43);
        double double45 = openMapRealVector36.dotProduct(openMapRealVector40);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor46 = openMapRealVector40.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector47 = openMapRealVector29.append((org.apache.commons.math.linear.RealVector) openMapRealVector40);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector49 = openMapRealVector40.append((double) 10);
        org.apache.commons.math.linear.RealVector realVector50 = openMapRealVector21.combineToSelf((double) 'a', (double) 2, (org.apache.commons.math.linear.RealVector) openMapRealVector40);
        boolean boolean51 = openMapRealVector40.isNaN();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector21", openMapRealVector2.equals(openMapRealVector21) ? openMapRealVector2.hashCode() == openMapRealVector21.hashCode() : true);
    }
}

