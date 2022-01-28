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
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector12);
        double double14 = openMapRealVector5.dotProduct(openMapRealVector9);
        int int15 = openMapRealVector5.getMaxIndex();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor16 = openMapRealVector5.sparseIterator();
        org.apache.commons.math.linear.RealVector realVector18 = openMapRealVector5.mapMultiply((double) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector21 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector29 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector30 = openMapRealVector26.projection((org.apache.commons.math.linear.RealVector) openMapRealVector29);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector33 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector36 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector37 = openMapRealVector33.projection((org.apache.commons.math.linear.RealVector) openMapRealVector36);
        double double38 = openMapRealVector29.dotProduct(openMapRealVector33);
        int int39 = openMapRealVector29.getMaxIndex();
        org.apache.commons.math.linear.RealVector realVector40 = openMapRealVector21.combineToSelf((double) (byte) -1, (double) '4', (org.apache.commons.math.linear.RealVector) openMapRealVector29);
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
        double[] doubleArray66 = new double[] { 100.0d, (-1.0d), (-1.0f) };
        openMapRealVector61.setSubVector(99, doubleArray66);
        org.apache.commons.math.linear.RealVector realVector68 = openMapRealVector29.add(doubleArray66);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector69 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray66);
        org.apache.commons.math.linear.RealMatrix realMatrix70 = openMapRealVector5.outerProduct(doubleArray66);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on realVector68 and openMapRealVector69.", realVector68.equals(openMapRealVector69) == openMapRealVector69.equals(realVector68));
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
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
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector50 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray47);
        double[] doubleArray51 = openMapRealVector50.toArray();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector52 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray51);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on realVector49 and openMapRealVector50.", realVector49.equals(openMapRealVector50) == openMapRealVector50.equals(realVector49));
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.RealVector realVector8 = openMapRealVector5.mapDivideToSelf((double) 1);
        double double9 = openMapRealVector5.getSparsity();
        double[] doubleArray10 = openMapRealVector5.toArray();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector11 = openMapRealVector5.copy();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector17 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector18 = openMapRealVector14.projection((org.apache.commons.math.linear.RealVector) openMapRealVector17);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector21 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector24 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector25 = openMapRealVector21.projection((org.apache.commons.math.linear.RealVector) openMapRealVector24);
        double double26 = openMapRealVector17.dotProduct(openMapRealVector21);
        int int27 = openMapRealVector17.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector30 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean31 = openMapRealVector30.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector32 = openMapRealVector17.append((org.apache.commons.math.linear.RealVector) openMapRealVector30);
        double[] doubleArray37 = new double[] { 100.0d, (-1.0d), (-1.0f) };
        openMapRealVector32.setSubVector(99, doubleArray37);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor39 = openMapRealVector32.iterator();
        double[] doubleArray40 = openMapRealVector32.toArray();
        org.apache.commons.math.linear.RealVector realVector41 = openMapRealVector11.add(doubleArray40);
        boolean boolean42 = openMapRealVector11.isInfinite();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on realVector41 and openMapRealVector32.", realVector41.equals(openMapRealVector32) == openMapRealVector32.equals(realVector41));
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
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
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector50 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray47);
        double double51 = openMapRealVector50.getSparsity();
        double double52 = openMapRealVector50.getL1Norm();
        double[] doubleArray53 = openMapRealVector50.toArray();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector54 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray53);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on realVector49 and openMapRealVector50.", realVector49.equals(openMapRealVector50) == openMapRealVector50.equals(realVector49));
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.RealVector realVector8 = openMapRealVector5.mapDivideToSelf((double) 1);
        double double9 = openMapRealVector5.getSparsity();
        double[] doubleArray10 = openMapRealVector5.toArray();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector11 = openMapRealVector5.copy();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector17 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector18 = openMapRealVector14.projection((org.apache.commons.math.linear.RealVector) openMapRealVector17);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector21 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector24 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector25 = openMapRealVector21.projection((org.apache.commons.math.linear.RealVector) openMapRealVector24);
        double double26 = openMapRealVector17.dotProduct(openMapRealVector21);
        int int27 = openMapRealVector17.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector30 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean31 = openMapRealVector30.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector32 = openMapRealVector17.append((org.apache.commons.math.linear.RealVector) openMapRealVector30);
        double[] doubleArray37 = new double[] { 100.0d, (-1.0d), (-1.0f) };
        openMapRealVector32.setSubVector(99, doubleArray37);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor39 = openMapRealVector32.iterator();
        double[] doubleArray40 = openMapRealVector32.toArray();
        org.apache.commons.math.linear.RealVector realVector41 = openMapRealVector11.add(doubleArray40);
        java.lang.Class<?> wildcardClass42 = doubleArray40.getClass();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on realVector41 and openMapRealVector32.", realVector41.equals(openMapRealVector32) == openMapRealVector32.equals(realVector41));
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
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
        org.apache.commons.math.linear.RealVector realVector47 = openMapRealVector44.mapDivideToSelf((double) 1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector50 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector53 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector54 = openMapRealVector50.projection((org.apache.commons.math.linear.RealVector) openMapRealVector53);
        org.apache.commons.math.linear.RealVector realVector56 = openMapRealVector53.mapDivideToSelf((double) 1);
        double double57 = openMapRealVector53.getSparsity();
        double[] doubleArray58 = openMapRealVector53.toArray();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector59 = openMapRealVector44.subtract(doubleArray58);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector60 = openMapRealVector26.ebeMultiply((org.apache.commons.math.linear.RealVector) openMapRealVector44);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector63 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector66 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector67 = openMapRealVector63.projection((org.apache.commons.math.linear.RealVector) openMapRealVector66);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor68 = openMapRealVector66.sparseIterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector71 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        double[] doubleArray73 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector74 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray73);
        openMapRealVector71.setSubVector((int) 'a', doubleArray73);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector76 = openMapRealVector66.append(doubleArray73);
        org.apache.commons.math.linear.RealVector realVector77 = openMapRealVector44.add(doubleArray73);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector79 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray73, (double) 'a');
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on realVector77 and openMapRealVector74.", realVector77.equals(openMapRealVector74) == openMapRealVector74.equals(realVector77));
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        java.lang.Double[] doubleArray2 = new java.lang.Double[] { 100.0d, 1.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray2, (double) (byte) 1);
        int int5 = openMapRealVector4.getDimension();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = openMapRealVector4.mapAddToSelf((double) (-1));
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector10 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector18 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector19 = openMapRealVector15.projection((org.apache.commons.math.linear.RealVector) openMapRealVector18);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector22 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector25 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector26 = openMapRealVector22.projection((org.apache.commons.math.linear.RealVector) openMapRealVector25);
        double double27 = openMapRealVector18.dotProduct(openMapRealVector22);
        int int28 = openMapRealVector18.getMaxIndex();
        org.apache.commons.math.linear.RealVector realVector29 = openMapRealVector10.combineToSelf((double) (byte) -1, (double) '4', (org.apache.commons.math.linear.RealVector) openMapRealVector18);
        java.lang.Double[] doubleArray33 = new java.lang.Double[] { 100.0d, 1.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector35 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray33, (double) (byte) 1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector36 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray33);
        boolean boolean37 = openMapRealVector36.isNaN();
        double[] doubleArray38 = openMapRealVector36.toArray();
        openMapRealVector18.setSubVector(2, doubleArray38);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector40 = openMapRealVector7.subtract(doubleArray38);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector43 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector46 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector47 = openMapRealVector43.projection((org.apache.commons.math.linear.RealVector) openMapRealVector46);
        double[] doubleArray48 = openMapRealVector46.toArray();
        java.lang.Double[] doubleArray51 = new java.lang.Double[] { 100.0d, 1.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector53 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray51, (double) (byte) 1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector54 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray51);
        java.lang.Double[] doubleArray57 = new java.lang.Double[] { 100.0d, 1.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector59 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray57, (double) (byte) 1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector60 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray57);
        boolean boolean61 = openMapRealVector60.isNaN();
        double[] doubleArray62 = openMapRealVector60.toArray();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector63 = openMapRealVector54.ebeMultiply(doubleArray62);
        org.apache.commons.math.linear.RealVector realVector64 = openMapRealVector46.add(doubleArray62);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector65 = openMapRealVector7.ebeDivide(doubleArray62);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on realVector64 and openMapRealVector35.", realVector64.equals(openMapRealVector35) == openMapRealVector35.equals(realVector64));
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector3 = new org.apache.commons.math.linear.OpenMapRealVector(1, (int) (byte) 10, (double) 96);
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
        org.apache.commons.math.linear.RealVector realVector51 = openMapRealVector48.mapDivideToSelf((double) 1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector54 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector57 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector58 = openMapRealVector54.projection((org.apache.commons.math.linear.RealVector) openMapRealVector57);
        org.apache.commons.math.linear.RealVector realVector60 = openMapRealVector57.mapDivideToSelf((double) 1);
        double double61 = openMapRealVector57.getSparsity();
        double[] doubleArray62 = openMapRealVector57.toArray();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector63 = openMapRealVector48.subtract(doubleArray62);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector64 = openMapRealVector30.ebeMultiply((org.apache.commons.math.linear.RealVector) openMapRealVector48);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector67 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector70 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector71 = openMapRealVector67.projection((org.apache.commons.math.linear.RealVector) openMapRealVector70);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor72 = openMapRealVector70.sparseIterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector75 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        double[] doubleArray77 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector78 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray77);
        openMapRealVector75.setSubVector((int) 'a', doubleArray77);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector80 = openMapRealVector70.append(doubleArray77);
        org.apache.commons.math.linear.RealVector realVector81 = openMapRealVector48.add(doubleArray77);
        org.apache.commons.math.linear.RealVector realVector82 = openMapRealVector3.add(doubleArray77);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on realVector81 and openMapRealVector78.", realVector81.equals(openMapRealVector78) == openMapRealVector78.equals(realVector81));
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
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
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector50 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray47);
        double double51 = openMapRealVector50.getSparsity();
        double double52 = openMapRealVector50.getL1Norm();
        double[] doubleArray53 = openMapRealVector50.toArray();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector55 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray53, 3.09375d);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on realVector49 and openMapRealVector50.", realVector49.equals(openMapRealVector50) == openMapRealVector50.equals(realVector49));
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.RealVector realVector8 = openMapRealVector5.mapDivideToSelf((double) 1);
        double double9 = openMapRealVector5.getSparsity();
        double[] doubleArray10 = openMapRealVector5.toArray();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector11 = openMapRealVector5.copy();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector17 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector18 = openMapRealVector14.projection((org.apache.commons.math.linear.RealVector) openMapRealVector17);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector21 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector24 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector25 = openMapRealVector21.projection((org.apache.commons.math.linear.RealVector) openMapRealVector24);
        double double26 = openMapRealVector17.dotProduct(openMapRealVector21);
        int int27 = openMapRealVector17.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector30 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean31 = openMapRealVector30.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector32 = openMapRealVector17.append((org.apache.commons.math.linear.RealVector) openMapRealVector30);
        double[] doubleArray37 = new double[] { 100.0d, (-1.0d), (-1.0f) };
        openMapRealVector32.setSubVector(99, doubleArray37);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor39 = openMapRealVector32.iterator();
        double[] doubleArray40 = openMapRealVector32.toArray();
        org.apache.commons.math.linear.RealVector realVector41 = openMapRealVector11.add(doubleArray40);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector44 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector47 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector48 = openMapRealVector44.projection((org.apache.commons.math.linear.RealVector) openMapRealVector47);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector51 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector54 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector55 = openMapRealVector51.projection((org.apache.commons.math.linear.RealVector) openMapRealVector54);
        double double56 = openMapRealVector47.dotProduct(openMapRealVector51);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector59 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector62 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector63 = openMapRealVector59.projection((org.apache.commons.math.linear.RealVector) openMapRealVector62);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector66 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector69 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector70 = openMapRealVector66.projection((org.apache.commons.math.linear.RealVector) openMapRealVector69);
        double double71 = openMapRealVector62.dotProduct(openMapRealVector66);
        int int72 = openMapRealVector62.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector75 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean76 = openMapRealVector75.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector77 = openMapRealVector62.append((org.apache.commons.math.linear.RealVector) openMapRealVector75);
        double[] doubleArray82 = new double[] { 100.0d, (-1.0d), (-1.0f) };
        openMapRealVector77.setSubVector(99, doubleArray82);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor84 = openMapRealVector77.iterator();
        double[] doubleArray85 = openMapRealVector77.toArray();
        org.apache.commons.math.linear.RealMatrix realMatrix86 = openMapRealVector47.outerProduct(doubleArray85);
        org.apache.commons.math.linear.RealVector realVector87 = openMapRealVector11.add(doubleArray85);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on realVector41 and openMapRealVector32.", realVector41.equals(openMapRealVector32) == openMapRealVector32.equals(realVector41));
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector((int) 'a', (int) (short) 10);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor3 = openMapRealVector2.sparseIterator();
        double[] doubleArray9 = new double[] { 1.0d, (short) 10, 'a', (byte) 100, 0.0f };
        org.apache.commons.math.linear.RealVector realVector10 = openMapRealVector2.add(doubleArray9);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector11 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray9);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector13 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray9, 52.0d);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on realVector10 and openMapRealVector11.", realVector10.equals(openMapRealVector11) == openMapRealVector11.equals(realVector10));
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        int int7 = openMapRealVector2.getMaxIndex();
        boolean boolean8 = openMapRealVector2.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector11 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean12 = openMapRealVector11.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector13 = openMapRealVector2.subtract((org.apache.commons.math.linear.RealVector) openMapRealVector11);
        double double14 = openMapRealVector11.getMinValue();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector17 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector21 = openMapRealVector17.projection((org.apache.commons.math.linear.RealVector) openMapRealVector20);
        int int22 = openMapRealVector17.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector24 = openMapRealVector17.mapAddToSelf((double) (byte) -1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector27 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector30 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector31 = openMapRealVector27.projection((org.apache.commons.math.linear.RealVector) openMapRealVector30);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor32 = openMapRealVector30.sparseIterator();
        org.apache.commons.math.linear.RealVector realVector33 = openMapRealVector24.projection((org.apache.commons.math.linear.RealVector) openMapRealVector30);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector36 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector39 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector40 = openMapRealVector36.projection((org.apache.commons.math.linear.RealVector) openMapRealVector39);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector43 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector46 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector47 = openMapRealVector43.projection((org.apache.commons.math.linear.RealVector) openMapRealVector46);
        double double48 = openMapRealVector39.dotProduct(openMapRealVector43);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor49 = openMapRealVector43.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector50 = openMapRealVector24.subtract((org.apache.commons.math.linear.RealVector) openMapRealVector43);
        boolean boolean51 = openMapRealVector11.equals((java.lang.Object) openMapRealVector43);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector54 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector57 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector58 = openMapRealVector54.projection((org.apache.commons.math.linear.RealVector) openMapRealVector57);
        double[] doubleArray59 = openMapRealVector57.toArray();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector61 = openMapRealVector57.append((double) ' ');
        double double62 = openMapRealVector43.dotProduct(openMapRealVector57);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector65 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector68 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector69 = openMapRealVector65.projection((org.apache.commons.math.linear.RealVector) openMapRealVector68);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector72 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector75 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector76 = openMapRealVector72.projection((org.apache.commons.math.linear.RealVector) openMapRealVector75);
        double double77 = openMapRealVector68.dotProduct(openMapRealVector72);
        int int78 = openMapRealVector68.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector81 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean82 = openMapRealVector81.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector83 = openMapRealVector68.append((org.apache.commons.math.linear.RealVector) openMapRealVector81);
        double[] doubleArray88 = new double[] { 100.0d, (-1.0d), (-1.0f) };
        openMapRealVector83.setSubVector(99, doubleArray88);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor90 = openMapRealVector83.iterator();
        double[] doubleArray91 = openMapRealVector83.toArray();
        org.apache.commons.math.linear.RealVector realVector92 = openMapRealVector43.add(doubleArray91);
        org.apache.commons.math.linear.RealVector realVector94 = openMapRealVector43.mapMultiplyToSelf((double) 10);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on realVector92 and openMapRealVector83.", realVector92.equals(openMapRealVector83) == openMapRealVector83.equals(realVector92));
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector3 = new org.apache.commons.math.linear.OpenMapRealVector(100, 0, 102.0d);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector10 = openMapRealVector6.projection((org.apache.commons.math.linear.RealVector) openMapRealVector9);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector13 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector16 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector17 = openMapRealVector13.projection((org.apache.commons.math.linear.RealVector) openMapRealVector16);
        double double18 = openMapRealVector9.dotProduct(openMapRealVector13);
        int int19 = openMapRealVector9.getMaxIndex();
        org.apache.commons.math.linear.RealVector realVector21 = openMapRealVector9.mapMultiplyToSelf((double) '4');
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = openMapRealVector9.append(1.0d);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector24 = openMapRealVector3.append(openMapRealVector9);
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
        double[] doubleArray46 = openMapRealVector45.getData();
        org.apache.commons.math.linear.RealVector realVector47 = openMapRealVector24.add(doubleArray46);
        int int48 = openMapRealVector24.getMaxIndex();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on realVector47 and openMapRealVector45.", realVector47.equals(openMapRealVector45) == openMapRealVector45.equals(realVector47));
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 100);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector8 = openMapRealVector4.projection((org.apache.commons.math.linear.RealVector) openMapRealVector7);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector11 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector15 = openMapRealVector11.projection((org.apache.commons.math.linear.RealVector) openMapRealVector14);
        double double16 = openMapRealVector7.dotProduct(openMapRealVector11);
        int int17 = openMapRealVector7.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean21 = openMapRealVector20.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector22 = openMapRealVector7.append((org.apache.commons.math.linear.RealVector) openMapRealVector20);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector25 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector28 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector29 = openMapRealVector25.projection((org.apache.commons.math.linear.RealVector) openMapRealVector28);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector32 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector35 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector36 = openMapRealVector32.projection((org.apache.commons.math.linear.RealVector) openMapRealVector35);
        double double37 = openMapRealVector28.dotProduct(openMapRealVector32);
        int int38 = openMapRealVector28.getMaxIndex();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor39 = openMapRealVector28.sparseIterator();
        double double40 = openMapRealVector7.dotProduct((org.apache.commons.math.linear.RealVector) openMapRealVector28);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector42 = openMapRealVector28.mapAddToSelf((double) (short) 10);
        double double43 = openMapRealVector42.getLInfNorm();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector46 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector49 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector50 = openMapRealVector46.projection((org.apache.commons.math.linear.RealVector) openMapRealVector49);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector53 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector56 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector57 = openMapRealVector53.projection((org.apache.commons.math.linear.RealVector) openMapRealVector56);
        double double58 = openMapRealVector49.dotProduct(openMapRealVector53);
        int int59 = openMapRealVector49.getMaxIndex();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor60 = openMapRealVector49.sparseIterator();
        org.apache.commons.math.linear.RealVector realVector62 = openMapRealVector49.mapMultiply((double) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector63 = openMapRealVector42.subtract(realVector62);
        org.apache.commons.math.linear.RealVector realVector64 = openMapRealVector1.projection((org.apache.commons.math.linear.RealVector) openMapRealVector42);
        openMapRealVector42.set((double) 'a');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector1 and realVector64", openMapRealVector1.equals(realVector64) ? openMapRealVector1.hashCode() == realVector64.hashCode() : true);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 100);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector8 = openMapRealVector4.projection((org.apache.commons.math.linear.RealVector) openMapRealVector7);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector11 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector15 = openMapRealVector11.projection((org.apache.commons.math.linear.RealVector) openMapRealVector14);
        double double16 = openMapRealVector7.dotProduct(openMapRealVector11);
        int int17 = openMapRealVector7.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean21 = openMapRealVector20.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector22 = openMapRealVector7.append((org.apache.commons.math.linear.RealVector) openMapRealVector20);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector25 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector28 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector29 = openMapRealVector25.projection((org.apache.commons.math.linear.RealVector) openMapRealVector28);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector32 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector35 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector36 = openMapRealVector32.projection((org.apache.commons.math.linear.RealVector) openMapRealVector35);
        double double37 = openMapRealVector28.dotProduct(openMapRealVector32);
        int int38 = openMapRealVector28.getMaxIndex();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor39 = openMapRealVector28.sparseIterator();
        double double40 = openMapRealVector7.dotProduct((org.apache.commons.math.linear.RealVector) openMapRealVector28);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector42 = openMapRealVector28.mapAddToSelf((double) (short) 10);
        double double43 = openMapRealVector42.getLInfNorm();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector46 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector49 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector50 = openMapRealVector46.projection((org.apache.commons.math.linear.RealVector) openMapRealVector49);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector53 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector56 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector57 = openMapRealVector53.projection((org.apache.commons.math.linear.RealVector) openMapRealVector56);
        double double58 = openMapRealVector49.dotProduct(openMapRealVector53);
        int int59 = openMapRealVector49.getMaxIndex();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor60 = openMapRealVector49.sparseIterator();
        org.apache.commons.math.linear.RealVector realVector62 = openMapRealVector49.mapMultiply((double) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector63 = openMapRealVector42.subtract(realVector62);
        org.apache.commons.math.linear.RealVector realVector64 = openMapRealVector1.projection((org.apache.commons.math.linear.RealVector) openMapRealVector42);
        int int65 = openMapRealVector42.getMinIndex();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector1 and realVector64", openMapRealVector1.equals(realVector64) ? openMapRealVector1.hashCode() == realVector64.hashCode() : true);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        double[] doubleArray7 = openMapRealVector5.toArray();
        java.lang.Double[] doubleArray10 = new java.lang.Double[] { 100.0d, 1.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray10, (double) (byte) 1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector13 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray10);
        java.lang.Double[] doubleArray16 = new java.lang.Double[] { 100.0d, 1.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector18 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray16, (double) (byte) 1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray16);
        boolean boolean20 = openMapRealVector19.isNaN();
        double[] doubleArray21 = openMapRealVector19.toArray();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector22 = openMapRealVector13.ebeMultiply(doubleArray21);
        org.apache.commons.math.linear.RealVector realVector23 = openMapRealVector5.add(doubleArray21);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector24 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray21);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on realVector23 and openMapRealVector12.", realVector23.equals(openMapRealVector12) == openMapRealVector12.equals(realVector23));
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        java.lang.Double[] doubleArray2 = new java.lang.Double[] { 10.0d, 1.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector3 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray2);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray2);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray2);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray2);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray2);
        java.lang.Double[] doubleArray10 = new java.lang.Double[] { 100.0d, 1.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray10, (double) (byte) 1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector13 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray10);
        boolean boolean14 = openMapRealVector13.isNaN();
        double[] doubleArray15 = openMapRealVector13.toArray();
        double double16 = openMapRealVector7.dotProduct(doubleArray15);
        java.lang.Double[] doubleArray19 = new java.lang.Double[] { 10.0d, 1.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray19);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector21 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray19);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector22 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray19);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray19);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector24 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray19);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray19, 104.0d);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector28 = openMapRealVector26.mapAddToSelf(0.0d);
        double[] doubleArray29 = openMapRealVector26.getData();
        org.apache.commons.math.linear.RealVector realVector30 = openMapRealVector7.add(doubleArray29);
        org.apache.commons.math.linear.RealVector realVector32 = openMapRealVector7.mapMultiplyToSelf(Double.NaN);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on realVector30 and openMapRealVector3.", realVector30.equals(openMapRealVector3) == openMapRealVector3.equals(realVector30));
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
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
        java.lang.Double[] doubleArray66 = new java.lang.Double[] { 10.0d, 1.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector67 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray66);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector68 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray66);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector69 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray66);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector70 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray66);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector71 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray66);
        java.lang.Double[] doubleArray74 = new java.lang.Double[] { 100.0d, 1.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector76 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray74, (double) (byte) 1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector77 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray74);
        boolean boolean78 = openMapRealVector77.isNaN();
        double[] doubleArray79 = openMapRealVector77.toArray();
        double double80 = openMapRealVector71.dotProduct(doubleArray79);
        java.lang.Double[] doubleArray83 = new java.lang.Double[] { 10.0d, 1.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector84 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray83);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector85 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray83);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector86 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray83);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector87 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray83);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector88 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray83);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector90 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray83, 104.0d);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector92 = openMapRealVector90.mapAddToSelf(0.0d);
        double[] doubleArray93 = openMapRealVector90.getData();
        org.apache.commons.math.linear.RealVector realVector94 = openMapRealVector71.add(doubleArray93);
        org.apache.commons.math.linear.RealVector realVector95 = openMapRealVector44.add(doubleArray93);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on realVector94 and openMapRealVector67.", realVector94.equals(openMapRealVector67) == openMapRealVector67.equals(realVector94));
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        java.lang.Double[] doubleArray2 = new java.lang.Double[] { 100.0d, 1.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray2, (double) (byte) 1);
        boolean boolean5 = openMapRealVector4.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector8 = new org.apache.commons.math.linear.OpenMapRealVector((int) 'a', (int) (short) 10);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor9 = openMapRealVector8.sparseIterator();
        double[] doubleArray15 = new double[] { 1.0d, (short) 10, 'a', (byte) 100, 0.0f };
        org.apache.commons.math.linear.RealVector realVector16 = openMapRealVector8.add(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = openMapRealVector4.outerProduct(doubleArray15);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector18 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray15);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray15);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on realVector16 and openMapRealVector18.", realVector16.equals(openMapRealVector18) == openMapRealVector18.equals(realVector16));
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.RealVector realVector8 = openMapRealVector5.mapDivideToSelf((double) 1);
        double double9 = openMapRealVector5.getSparsity();
        double[] doubleArray10 = openMapRealVector5.toArray();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector11 = openMapRealVector5.copy();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector17 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector18 = openMapRealVector14.projection((org.apache.commons.math.linear.RealVector) openMapRealVector17);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector21 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector24 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector25 = openMapRealVector21.projection((org.apache.commons.math.linear.RealVector) openMapRealVector24);
        double double26 = openMapRealVector17.dotProduct(openMapRealVector21);
        int int27 = openMapRealVector17.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector30 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean31 = openMapRealVector30.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector32 = openMapRealVector17.append((org.apache.commons.math.linear.RealVector) openMapRealVector30);
        double[] doubleArray37 = new double[] { 100.0d, (-1.0d), (-1.0f) };
        openMapRealVector32.setSubVector(99, doubleArray37);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor39 = openMapRealVector32.iterator();
        double[] doubleArray40 = openMapRealVector32.toArray();
        org.apache.commons.math.linear.RealVector realVector41 = openMapRealVector11.add(doubleArray40);
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
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector63 = new org.apache.commons.math.linear.OpenMapRealVector(openMapRealVector47);
        org.apache.commons.math.linear.RealVector realVector64 = openMapRealVector11.add((org.apache.commons.math.linear.RealVector) openMapRealVector63);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on realVector41 and openMapRealVector32.", realVector41.equals(openMapRealVector32) == openMapRealVector32.equals(realVector41));
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector12);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector16 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector20 = openMapRealVector16.projection((org.apache.commons.math.linear.RealVector) openMapRealVector19);
        double double21 = openMapRealVector12.dotProduct(openMapRealVector16);
        int int22 = openMapRealVector12.getMaxIndex();
        org.apache.commons.math.linear.RealVector realVector23 = openMapRealVector4.combineToSelf((double) (byte) -1, (double) '4', (org.apache.commons.math.linear.RealVector) openMapRealVector12);
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
        org.apache.commons.math.linear.RealVector realVector51 = openMapRealVector12.add(doubleArray49);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector52 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray49);
        double double53 = openMapRealVector52.getSparsity();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector56 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector59 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector60 = openMapRealVector56.projection((org.apache.commons.math.linear.RealVector) openMapRealVector59);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector63 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector66 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector67 = openMapRealVector63.projection((org.apache.commons.math.linear.RealVector) openMapRealVector66);
        double double68 = openMapRealVector59.dotProduct(openMapRealVector63);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor69 = openMapRealVector63.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector70 = openMapRealVector63.copy();
        double[] doubleArray71 = openMapRealVector63.toArray();
        org.apache.commons.math.linear.RealMatrix realMatrix72 = openMapRealVector52.outerProduct(doubleArray71);
        org.apache.commons.math.linear.RealVector realVector73 = openMapRealVector1.add(doubleArray71);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on realVector51 and openMapRealVector52.", realVector51.equals(openMapRealVector52) == openMapRealVector52.equals(realVector51));
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        java.lang.Double[] doubleArray2 = new java.lang.Double[] { 10.0d, 1.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector3 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray2);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray2);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray2);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray2);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray2);
        java.lang.Double[] doubleArray10 = new java.lang.Double[] { 100.0d, 1.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray10, (double) (byte) 1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector13 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray10);
        boolean boolean14 = openMapRealVector13.isNaN();
        double[] doubleArray15 = openMapRealVector13.toArray();
        double double16 = openMapRealVector7.dotProduct(doubleArray15);
        java.lang.Double[] doubleArray19 = new java.lang.Double[] { 10.0d, 1.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray19);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector21 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray19);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector22 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray19);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray19);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector24 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray19);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray19, 104.0d);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector28 = openMapRealVector26.mapAddToSelf(0.0d);
        double[] doubleArray29 = openMapRealVector26.getData();
        org.apache.commons.math.linear.RealVector realVector30 = openMapRealVector7.add(doubleArray29);
        int int31 = openMapRealVector7.getDimension();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on realVector30 and openMapRealVector3.", realVector30.equals(openMapRealVector3) == openMapRealVector3.equals(realVector30));
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
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
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor27 = openMapRealVector20.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector30 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector33 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector34 = openMapRealVector30.projection((org.apache.commons.math.linear.RealVector) openMapRealVector33);
        org.apache.commons.math.linear.RealVector realVector36 = openMapRealVector33.mapDivideToSelf((double) 1);
        double double37 = openMapRealVector33.getSparsity();
        double[] doubleArray38 = openMapRealVector33.toArray();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector39 = openMapRealVector33.copy();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector42 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector45 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector46 = openMapRealVector42.projection((org.apache.commons.math.linear.RealVector) openMapRealVector45);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector49 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector52 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector53 = openMapRealVector49.projection((org.apache.commons.math.linear.RealVector) openMapRealVector52);
        double double54 = openMapRealVector45.dotProduct(openMapRealVector49);
        int int55 = openMapRealVector45.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector58 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean59 = openMapRealVector58.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector60 = openMapRealVector45.append((org.apache.commons.math.linear.RealVector) openMapRealVector58);
        double[] doubleArray65 = new double[] { 100.0d, (-1.0d), (-1.0f) };
        openMapRealVector60.setSubVector(99, doubleArray65);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor67 = openMapRealVector60.iterator();
        double[] doubleArray68 = openMapRealVector60.toArray();
        org.apache.commons.math.linear.RealVector realVector69 = openMapRealVector39.add(doubleArray68);
        double double70 = openMapRealVector20.getLInfDistance(doubleArray68);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on realVector69 and openMapRealVector60.", realVector69.equals(openMapRealVector60) == openMapRealVector60.equals(realVector69));
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        java.lang.Double[] doubleArray2 = new java.lang.Double[] { 10.0d, 1.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector3 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray2);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray2);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray2);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray2);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray2);
        java.lang.Double[] doubleArray10 = new java.lang.Double[] { 100.0d, 1.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray10, (double) (byte) 1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector13 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray10);
        boolean boolean14 = openMapRealVector13.isNaN();
        double[] doubleArray15 = openMapRealVector13.toArray();
        double double16 = openMapRealVector7.dotProduct(doubleArray15);
        java.lang.Double[] doubleArray19 = new java.lang.Double[] { 10.0d, 1.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray19);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector21 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray19);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector22 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray19);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray19);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector24 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray19);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray19, 104.0d);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector28 = openMapRealVector26.mapAddToSelf(0.0d);
        double[] doubleArray29 = openMapRealVector26.getData();
        org.apache.commons.math.linear.RealVector realVector30 = openMapRealVector7.add(doubleArray29);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector33 = openMapRealVector7.getSubVector((int) (byte) 1, (int) (short) 1);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on realVector30 and openMapRealVector3.", realVector30.equals(openMapRealVector3) == openMapRealVector3.equals(realVector30));
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor7 = openMapRealVector5.sparseIterator();
        org.apache.commons.math.linear.RealVector realVector9 = openMapRealVector5.mapDivide((double) 199);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector13 = new org.apache.commons.math.linear.OpenMapRealVector((int) (byte) 100, (int) (byte) 1, (double) 2);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector16 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector20 = openMapRealVector16.projection((org.apache.commons.math.linear.RealVector) openMapRealVector19);
        org.apache.commons.math.linear.RealVector realVector22 = openMapRealVector19.mapDivideToSelf((double) 1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector25 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector28 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector29 = openMapRealVector25.projection((org.apache.commons.math.linear.RealVector) openMapRealVector28);
        org.apache.commons.math.linear.RealVector realVector31 = openMapRealVector28.mapDivideToSelf((double) 1);
        double double32 = openMapRealVector28.getSparsity();
        double[] doubleArray33 = openMapRealVector28.toArray();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector34 = openMapRealVector19.subtract(doubleArray33);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector35 = openMapRealVector13.ebeMultiply(doubleArray33);
        java.lang.Double[] doubleArray38 = new java.lang.Double[] { 100.0d, 1.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector40 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray38, (double) (byte) 1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector41 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray38);
        java.lang.Double[] doubleArray44 = new java.lang.Double[] { 100.0d, 1.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector46 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray44, (double) (byte) 1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector47 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray44);
        boolean boolean48 = openMapRealVector47.isNaN();
        double[] doubleArray49 = openMapRealVector47.toArray();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector50 = openMapRealVector41.ebeMultiply(doubleArray49);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector52 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray49, (double) (-1));
        org.apache.commons.math.linear.RealVector realVector53 = openMapRealVector13.add(doubleArray49);
        org.apache.commons.math.linear.RealVector realVector54 = openMapRealVector5.add(doubleArray49);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on realVector53 and openMapRealVector40.", realVector53.equals(openMapRealVector40) == openMapRealVector40.equals(realVector53));
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector3 = new org.apache.commons.math.linear.OpenMapRealVector((int) (byte) 100, (int) (byte) 1, (double) 2);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector10 = openMapRealVector6.projection((org.apache.commons.math.linear.RealVector) openMapRealVector9);
        org.apache.commons.math.linear.RealVector realVector12 = openMapRealVector9.mapDivideToSelf((double) 1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector18 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector19 = openMapRealVector15.projection((org.apache.commons.math.linear.RealVector) openMapRealVector18);
        org.apache.commons.math.linear.RealVector realVector21 = openMapRealVector18.mapDivideToSelf((double) 1);
        double double22 = openMapRealVector18.getSparsity();
        double[] doubleArray23 = openMapRealVector18.toArray();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector24 = openMapRealVector9.subtract(doubleArray23);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector25 = openMapRealVector3.ebeMultiply(doubleArray23);
        java.lang.Double[] doubleArray28 = new java.lang.Double[] { 100.0d, 1.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector30 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray28, (double) (byte) 1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector31 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray28);
        java.lang.Double[] doubleArray34 = new java.lang.Double[] { 100.0d, 1.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector36 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray34, (double) (byte) 1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector37 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray34);
        boolean boolean38 = openMapRealVector37.isNaN();
        double[] doubleArray39 = openMapRealVector37.toArray();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector40 = openMapRealVector31.ebeMultiply(doubleArray39);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector42 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray39, (double) (-1));
        org.apache.commons.math.linear.RealVector realVector43 = openMapRealVector3.add(doubleArray39);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector45 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray39, 31.622776601683793d);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on realVector43 and openMapRealVector30.", realVector43.equals(openMapRealVector30) == openMapRealVector30.equals(realVector43));
    }
}

