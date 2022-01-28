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
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector3 = new org.apache.commons.math.linear.OpenMapRealVector((int) (byte) 0, (int) (byte) 1, 10.0d);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector12);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector16 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector20 = openMapRealVector16.projection((org.apache.commons.math.linear.RealVector) openMapRealVector19);
        double double21 = openMapRealVector12.dotProduct(openMapRealVector16);
        int int22 = openMapRealVector12.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector25 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean26 = openMapRealVector25.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector27 = openMapRealVector12.append((org.apache.commons.math.linear.RealVector) openMapRealVector25);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector30 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector33 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector34 = openMapRealVector30.projection((org.apache.commons.math.linear.RealVector) openMapRealVector33);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector37 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector40 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector41 = openMapRealVector37.projection((org.apache.commons.math.linear.RealVector) openMapRealVector40);
        double double42 = openMapRealVector33.dotProduct(openMapRealVector37);
        int int43 = openMapRealVector33.getMaxIndex();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor44 = openMapRealVector33.sparseIterator();
        double double45 = openMapRealVector12.dotProduct((org.apache.commons.math.linear.RealVector) openMapRealVector33);
        double double46 = openMapRealVector6.getL1Distance(openMapRealVector33);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector49 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector54 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector57 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector58 = openMapRealVector54.projection((org.apache.commons.math.linear.RealVector) openMapRealVector57);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector61 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector64 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector65 = openMapRealVector61.projection((org.apache.commons.math.linear.RealVector) openMapRealVector64);
        double double66 = openMapRealVector57.dotProduct(openMapRealVector61);
        int int67 = openMapRealVector57.getMaxIndex();
        org.apache.commons.math.linear.RealVector realVector68 = openMapRealVector49.combineToSelf((double) (byte) -1, (double) '4', (org.apache.commons.math.linear.RealVector) openMapRealVector57);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector71 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector74 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector75 = openMapRealVector71.projection((org.apache.commons.math.linear.RealVector) openMapRealVector74);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector78 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector81 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector82 = openMapRealVector78.projection((org.apache.commons.math.linear.RealVector) openMapRealVector81);
        double double83 = openMapRealVector74.dotProduct(openMapRealVector78);
        int int84 = openMapRealVector74.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector87 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean88 = openMapRealVector87.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector89 = openMapRealVector74.append((org.apache.commons.math.linear.RealVector) openMapRealVector87);
        double[] doubleArray94 = new double[] { 100.0d, (-1.0d), (-1.0f) };
        openMapRealVector89.setSubVector(99, doubleArray94);
        org.apache.commons.math.linear.RealVector realVector96 = openMapRealVector57.add(doubleArray94);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector97 = openMapRealVector33.append(doubleArray94);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector98 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray94);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector99 = openMapRealVector3.append(doubleArray94);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on realVector96 and openMapRealVector98.", realVector96.equals(openMapRealVector98) == openMapRealVector98.equals(realVector96));
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
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
        double double42 = openMapRealVector2.getL1Distance(openMapRealVector29);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector45 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector50 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector53 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector54 = openMapRealVector50.projection((org.apache.commons.math.linear.RealVector) openMapRealVector53);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector57 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector60 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector61 = openMapRealVector57.projection((org.apache.commons.math.linear.RealVector) openMapRealVector60);
        double double62 = openMapRealVector53.dotProduct(openMapRealVector57);
        int int63 = openMapRealVector53.getMaxIndex();
        org.apache.commons.math.linear.RealVector realVector64 = openMapRealVector45.combineToSelf((double) (byte) -1, (double) '4', (org.apache.commons.math.linear.RealVector) openMapRealVector53);
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
        double[] doubleArray90 = new double[] { 100.0d, (-1.0d), (-1.0f) };
        openMapRealVector85.setSubVector(99, doubleArray90);
        org.apache.commons.math.linear.RealVector realVector92 = openMapRealVector53.add(doubleArray90);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector93 = openMapRealVector29.append(doubleArray90);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector94 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray90);
        java.lang.Class<?> wildcardClass95 = doubleArray90.getClass();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on realVector92 and openMapRealVector94.", realVector92.equals(openMapRealVector94) == openMapRealVector94.equals(realVector92));
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
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
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector54 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector57 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector58 = openMapRealVector54.projection((org.apache.commons.math.linear.RealVector) openMapRealVector57);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector61 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector64 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector65 = openMapRealVector61.projection((org.apache.commons.math.linear.RealVector) openMapRealVector64);
        double double66 = openMapRealVector57.dotProduct(openMapRealVector61);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor67 = openMapRealVector61.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector68 = openMapRealVector61.copy();
        double[] doubleArray69 = openMapRealVector61.toArray();
        org.apache.commons.math.linear.RealMatrix realMatrix70 = openMapRealVector50.outerProduct(doubleArray69);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector72 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray69, (double) (byte) -1);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on realVector49 and openMapRealVector50.", realVector49.equals(openMapRealVector50) == openMapRealVector50.equals(realVector49));
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
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
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector40 = openMapRealVector26.mapAddToSelf((double) (short) 10);
        double double41 = openMapRealVector40.getNorm();
        org.apache.commons.math.linear.RealVector realVector43 = openMapRealVector40.mapMultiplyToSelf(0.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and realVector43", openMapRealVector2.equals(realVector43) ? openMapRealVector2.hashCode() == realVector43.hashCode() : true);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
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
        double double42 = openMapRealVector2.getL1Distance(openMapRealVector29);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector45 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector50 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector53 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector54 = openMapRealVector50.projection((org.apache.commons.math.linear.RealVector) openMapRealVector53);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector57 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector60 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector61 = openMapRealVector57.projection((org.apache.commons.math.linear.RealVector) openMapRealVector60);
        double double62 = openMapRealVector53.dotProduct(openMapRealVector57);
        int int63 = openMapRealVector53.getMaxIndex();
        org.apache.commons.math.linear.RealVector realVector64 = openMapRealVector45.combineToSelf((double) (byte) -1, (double) '4', (org.apache.commons.math.linear.RealVector) openMapRealVector53);
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
        double[] doubleArray90 = new double[] { 100.0d, (-1.0d), (-1.0f) };
        openMapRealVector85.setSubVector(99, doubleArray90);
        org.apache.commons.math.linear.RealVector realVector92 = openMapRealVector53.add(doubleArray90);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector93 = openMapRealVector29.append(doubleArray90);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector94 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray90);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector95 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray90);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on realVector92 and openMapRealVector94.", realVector92.equals(openMapRealVector94) == openMapRealVector94.equals(realVector92));
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector12);
        double double14 = openMapRealVector5.dotProduct(openMapRealVector9);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor15 = openMapRealVector9.iterator();
        org.apache.commons.math.linear.RealVector realVector17 = openMapRealVector9.mapSubtractToSelf((double) 0);
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
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector66 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector69 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector70 = openMapRealVector66.projection((org.apache.commons.math.linear.RealVector) openMapRealVector69);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector73 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector76 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector77 = openMapRealVector73.projection((org.apache.commons.math.linear.RealVector) openMapRealVector76);
        double double78 = openMapRealVector69.dotProduct(openMapRealVector73);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor79 = openMapRealVector73.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector80 = openMapRealVector62.append((org.apache.commons.math.linear.RealVector) openMapRealVector73);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector81 = openMapRealVector44.add(openMapRealVector62);
        double[] doubleArray82 = openMapRealVector62.toArray();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector84 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray82, (double) (short) 10);
        org.apache.commons.math.linear.RealVector realVector85 = openMapRealVector9.add(doubleArray82);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector87 = new org.apache.commons.math.linear.OpenMapRealVector((int) '4');
        org.apache.commons.math.linear.RealVector realVector89 = openMapRealVector87.mapSubtractToSelf((double) (byte) -1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector90 = openMapRealVector9.append((org.apache.commons.math.linear.RealVector) openMapRealVector87);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on realVector85 and openMapRealVector2.", realVector85.equals(openMapRealVector2) == openMapRealVector2.equals(realVector85));
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector3 = new org.apache.commons.math.linear.OpenMapRealVector(1, (int) (short) 10, (double) (short) 0);
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
        double[] doubleArray29 = new double[] { 100.0d, (-1.0d), (-1.0f) };
        openMapRealVector24.setSubVector(99, doubleArray29);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor31 = openMapRealVector24.iterator();
        double[] doubleArray32 = openMapRealVector24.toArray();
        boolean boolean33 = openMapRealVector24.isNaN();
        openMapRealVector24.setEntry((int) (short) 100, (double) (-1.0f));
        java.lang.Double[] doubleArray40 = new java.lang.Double[] { 10.0d, 1.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector41 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray40);
        double[] doubleArray42 = openMapRealVector41.toArray();
        openMapRealVector24.setSubVector(100, doubleArray42);
        org.apache.commons.math.linear.RealVector realVector44 = openMapRealVector3.add(doubleArray42);
        org.apache.commons.math.linear.RealVector realVector46 = openMapRealVector3.mapDivideToSelf((double) (byte) -1);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on realVector44 and openMapRealVector41.", realVector44.equals(openMapRealVector41) == openMapRealVector41.equals(realVector44));
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
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray9);
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
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector2.mapAddToSelf((double) (byte) -1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector16 = openMapRealVector12.projection((org.apache.commons.math.linear.RealVector) openMapRealVector15);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor17 = openMapRealVector15.sparseIterator();
        org.apache.commons.math.linear.RealVector realVector18 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector15);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector21 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector24 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector25 = openMapRealVector21.projection((org.apache.commons.math.linear.RealVector) openMapRealVector24);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector28 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector31 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector32 = openMapRealVector28.projection((org.apache.commons.math.linear.RealVector) openMapRealVector31);
        double double33 = openMapRealVector24.dotProduct(openMapRealVector28);
        org.apache.commons.math.linear.RealVector realVector34 = openMapRealVector15.add((org.apache.commons.math.linear.RealVector) openMapRealVector24);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector37 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector40 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector41 = openMapRealVector37.projection((org.apache.commons.math.linear.RealVector) openMapRealVector40);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor42 = openMapRealVector40.sparseIterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector45 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        double[] doubleArray47 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector48 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray47);
        openMapRealVector45.setSubVector((int) 'a', doubleArray47);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector50 = openMapRealVector40.append(doubleArray47);
        org.apache.commons.math.linear.RealVector realVector51 = openMapRealVector24.add(doubleArray47);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector53 = openMapRealVector24.append((double) (-1));
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on realVector51 and openMapRealVector48.", realVector51.equals(openMapRealVector48) == openMapRealVector48.equals(realVector51));
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        java.lang.Double[] doubleArray2 = new java.lang.Double[] { 10.0d, 1.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector3 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray2);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray2, (double) '#');
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray2);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector8 = openMapRealVector6.mapAdd((double) 1L);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector11 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector16 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector20 = openMapRealVector16.projection((org.apache.commons.math.linear.RealVector) openMapRealVector19);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector27 = openMapRealVector23.projection((org.apache.commons.math.linear.RealVector) openMapRealVector26);
        double double28 = openMapRealVector19.dotProduct(openMapRealVector23);
        int int29 = openMapRealVector19.getMaxIndex();
        org.apache.commons.math.linear.RealVector realVector30 = openMapRealVector11.combineToSelf((double) (byte) -1, (double) '4', (org.apache.commons.math.linear.RealVector) openMapRealVector19);
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
        org.apache.commons.math.linear.RealVector realVector58 = openMapRealVector19.add(doubleArray56);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector59 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray56);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector60 = openMapRealVector8.append((org.apache.commons.math.linear.RealVector) openMapRealVector59);
        int int61 = openMapRealVector8.getMinIndex();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on realVector58 and openMapRealVector59.", realVector58.equals(openMapRealVector59) == openMapRealVector59.equals(realVector58));
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
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
        double double27 = openMapRealVector20.getMinValue();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector28 = openMapRealVector20.copy();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector29 = new org.apache.commons.math.linear.OpenMapRealVector(openMapRealVector28);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector33 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector38 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector41 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector42 = openMapRealVector38.projection((org.apache.commons.math.linear.RealVector) openMapRealVector41);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector45 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector48 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector49 = openMapRealVector45.projection((org.apache.commons.math.linear.RealVector) openMapRealVector48);
        double double50 = openMapRealVector41.dotProduct(openMapRealVector45);
        int int51 = openMapRealVector41.getMaxIndex();
        org.apache.commons.math.linear.RealVector realVector52 = openMapRealVector33.combineToSelf((double) (byte) -1, (double) '4', (org.apache.commons.math.linear.RealVector) openMapRealVector41);
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
        double[] doubleArray78 = new double[] { 100.0d, (-1.0d), (-1.0f) };
        openMapRealVector73.setSubVector(99, doubleArray78);
        org.apache.commons.math.linear.RealVector realVector80 = openMapRealVector41.add(doubleArray78);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector81 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray78);
        double double82 = openMapRealVector81.getSparsity();
        double double83 = openMapRealVector81.getL1Norm();
        double[] doubleArray84 = openMapRealVector81.toArray();
        openMapRealVector29.setSubVector((int) '4', doubleArray84);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on realVector80 and openMapRealVector81.", realVector80.equals(openMapRealVector81) == openMapRealVector81.equals(realVector80));
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.RealVector realVector8 = openMapRealVector5.mapDivideToSelf((double) 1);
        double double9 = openMapRealVector5.getSparsity();
        double[] doubleArray10 = openMapRealVector5.toArray();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector11 = openMapRealVector5.copy();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 100, (double) '#');
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector16 = openMapRealVector14.mapAddToSelf((double) 0L);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector21 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector24 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector25 = openMapRealVector21.projection((org.apache.commons.math.linear.RealVector) openMapRealVector24);
        double[] doubleArray26 = openMapRealVector24.toArray();
        org.apache.commons.math.linear.RealVector realVector27 = openMapRealVector14.combineToSelf((double) (byte) 100, (double) 100L, doubleArray26);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector32 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector35 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector36 = openMapRealVector32.projection((org.apache.commons.math.linear.RealVector) openMapRealVector35);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector39 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector42 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector43 = openMapRealVector39.projection((org.apache.commons.math.linear.RealVector) openMapRealVector42);
        double double44 = openMapRealVector35.dotProduct(openMapRealVector39);
        int int45 = openMapRealVector35.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector48 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean49 = openMapRealVector48.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector50 = openMapRealVector35.append((org.apache.commons.math.linear.RealVector) openMapRealVector48);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector53 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector56 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector57 = openMapRealVector53.projection((org.apache.commons.math.linear.RealVector) openMapRealVector56);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector60 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector63 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector64 = openMapRealVector60.projection((org.apache.commons.math.linear.RealVector) openMapRealVector63);
        double double65 = openMapRealVector56.dotProduct(openMapRealVector60);
        int int66 = openMapRealVector56.getMaxIndex();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor67 = openMapRealVector56.sparseIterator();
        double double68 = openMapRealVector35.dotProduct((org.apache.commons.math.linear.RealVector) openMapRealVector56);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector70 = openMapRealVector56.mapAddToSelf((double) (short) 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector71 = new org.apache.commons.math.linear.OpenMapRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector56);
        org.apache.commons.math.linear.RealVector realVector72 = openMapRealVector14.combineToSelf(32.0d, (double) (short) 0, (org.apache.commons.math.linear.RealVector) openMapRealVector56);
        double[] doubleArray73 = openMapRealVector56.getData();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector74 = openMapRealVector11.projection(doubleArray73);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector75 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray73);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector74", openMapRealVector2.equals(openMapRealVector74) ? openMapRealVector2.hashCode() == openMapRealVector74.hashCode() : true);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
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
        double double42 = openMapRealVector2.getL1Distance(openMapRealVector29);
        org.apache.commons.math.linear.RealVector realVector44 = openMapRealVector29.mapSubtract((double) 0);
        boolean boolean45 = openMapRealVector29.isNaN();
        double double46 = openMapRealVector29.getLInfNorm();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector49 = new org.apache.commons.math.linear.OpenMapRealVector((int) (byte) 10, 99);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector50 = openMapRealVector49.copy();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector52 = openMapRealVector50.mapAdd((double) (byte) 10);
        double[] doubleArray53 = openMapRealVector52.getData();
        org.apache.commons.math.linear.RealVector realVector54 = openMapRealVector29.add(doubleArray53);
        org.apache.commons.math.linear.RealVector realVector56 = openMapRealVector29.mapDivide((double) 96);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on realVector54 and openMapRealVector52.", realVector54.equals(openMapRealVector52) == openMapRealVector52.equals(realVector54));
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        int int3 = openMapRealVector2.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector10 = openMapRealVector6.projection((org.apache.commons.math.linear.RealVector) openMapRealVector9);
        double[] doubleArray11 = openMapRealVector9.toArray();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector13 = openMapRealVector9.append((double) ' ');
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector16 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector20 = openMapRealVector16.projection((org.apache.commons.math.linear.RealVector) openMapRealVector19);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector27 = openMapRealVector23.projection((org.apache.commons.math.linear.RealVector) openMapRealVector26);
        double double28 = openMapRealVector19.dotProduct(openMapRealVector23);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector29 = new org.apache.commons.math.linear.OpenMapRealVector(openMapRealVector23);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector30 = openMapRealVector9.subtract((org.apache.commons.math.linear.RealVector) openMapRealVector29);
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
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector53 = openMapRealVector49.mapAdd((double) (byte) 10);
        double double54 = openMapRealVector53.getLInfNorm();
        double double55 = openMapRealVector9.getL1Distance(openMapRealVector53);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector58 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector61 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector62 = openMapRealVector58.projection((org.apache.commons.math.linear.RealVector) openMapRealVector61);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector65 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector68 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector69 = openMapRealVector65.projection((org.apache.commons.math.linear.RealVector) openMapRealVector68);
        double double70 = openMapRealVector61.dotProduct(openMapRealVector65);
        int int71 = openMapRealVector61.getMaxIndex();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor72 = openMapRealVector61.sparseIterator();
        boolean boolean73 = openMapRealVector61.isInfinite();
        double[] doubleArray74 = openMapRealVector61.toArray();
        org.apache.commons.math.linear.RealVector realVector75 = openMapRealVector53.add(doubleArray74);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector76 = openMapRealVector2.ebeMultiply(doubleArray74);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on realVector75 and openMapRealVector53.", realVector75.equals(openMapRealVector53) == openMapRealVector53.equals(realVector75));
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
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
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector21 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector24 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector25 = openMapRealVector21.projection((org.apache.commons.math.linear.RealVector) openMapRealVector24);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector28 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector31 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector32 = openMapRealVector28.projection((org.apache.commons.math.linear.RealVector) openMapRealVector31);
        double double33 = openMapRealVector24.dotProduct(openMapRealVector28);
        org.apache.commons.math.linear.RealVector realVector34 = openMapRealVector15.add((org.apache.commons.math.linear.RealVector) openMapRealVector24);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector37 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector40 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector41 = openMapRealVector37.projection((org.apache.commons.math.linear.RealVector) openMapRealVector40);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor42 = openMapRealVector40.sparseIterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector45 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        double[] doubleArray47 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector48 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray47);
        openMapRealVector45.setSubVector((int) 'a', doubleArray47);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector50 = openMapRealVector40.append(doubleArray47);
        org.apache.commons.math.linear.RealVector realVector51 = openMapRealVector24.add(doubleArray47);
        boolean boolean52 = openMapRealVector24.isNaN();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on realVector51 and openMapRealVector48.", realVector51.equals(openMapRealVector48) == openMapRealVector48.equals(realVector51));
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
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
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector21 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector24 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector25 = openMapRealVector21.projection((org.apache.commons.math.linear.RealVector) openMapRealVector24);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector28 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector31 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector32 = openMapRealVector28.projection((org.apache.commons.math.linear.RealVector) openMapRealVector31);
        double double33 = openMapRealVector24.dotProduct(openMapRealVector28);
        org.apache.commons.math.linear.RealVector realVector34 = openMapRealVector15.add((org.apache.commons.math.linear.RealVector) openMapRealVector24);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector37 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector40 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector41 = openMapRealVector37.projection((org.apache.commons.math.linear.RealVector) openMapRealVector40);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor42 = openMapRealVector40.sparseIterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector45 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        double[] doubleArray47 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector48 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray47);
        openMapRealVector45.setSubVector((int) 'a', doubleArray47);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector50 = openMapRealVector40.append(doubleArray47);
        org.apache.commons.math.linear.RealVector realVector51 = openMapRealVector24.add(doubleArray47);
        org.apache.commons.math.linear.RealVector realVector53 = openMapRealVector24.mapDivideToSelf(0.52d);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on realVector51 and openMapRealVector48.", realVector51.equals(openMapRealVector48) == openMapRealVector48.equals(realVector51));
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
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 100, (double) '#');
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector16 = openMapRealVector14.mapAddToSelf((double) 0L);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector21 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector24 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector25 = openMapRealVector21.projection((org.apache.commons.math.linear.RealVector) openMapRealVector24);
        double[] doubleArray26 = openMapRealVector24.toArray();
        org.apache.commons.math.linear.RealVector realVector27 = openMapRealVector14.combineToSelf((double) (byte) 100, (double) 100L, doubleArray26);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector32 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector35 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector36 = openMapRealVector32.projection((org.apache.commons.math.linear.RealVector) openMapRealVector35);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector39 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector42 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector43 = openMapRealVector39.projection((org.apache.commons.math.linear.RealVector) openMapRealVector42);
        double double44 = openMapRealVector35.dotProduct(openMapRealVector39);
        int int45 = openMapRealVector35.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector48 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean49 = openMapRealVector48.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector50 = openMapRealVector35.append((org.apache.commons.math.linear.RealVector) openMapRealVector48);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector53 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector56 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector57 = openMapRealVector53.projection((org.apache.commons.math.linear.RealVector) openMapRealVector56);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector60 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector63 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector64 = openMapRealVector60.projection((org.apache.commons.math.linear.RealVector) openMapRealVector63);
        double double65 = openMapRealVector56.dotProduct(openMapRealVector60);
        int int66 = openMapRealVector56.getMaxIndex();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor67 = openMapRealVector56.sparseIterator();
        double double68 = openMapRealVector35.dotProduct((org.apache.commons.math.linear.RealVector) openMapRealVector56);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector70 = openMapRealVector56.mapAddToSelf((double) (short) 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector71 = new org.apache.commons.math.linear.OpenMapRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector56);
        org.apache.commons.math.linear.RealVector realVector72 = openMapRealVector14.combineToSelf(32.0d, (double) (short) 0, (org.apache.commons.math.linear.RealVector) openMapRealVector56);
        double[] doubleArray73 = openMapRealVector56.getData();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector74 = openMapRealVector11.projection(doubleArray73);
        double double75 = openMapRealVector11.getMinValue();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector74", openMapRealVector2.equals(openMapRealVector74) ? openMapRealVector2.hashCode() == openMapRealVector74.hashCode() : true);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector((int) '4');
        double double2 = openMapRealVector1.getSparsity();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector10 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector13 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector14 = openMapRealVector10.projection((org.apache.commons.math.linear.RealVector) openMapRealVector13);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector17 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector21 = openMapRealVector17.projection((org.apache.commons.math.linear.RealVector) openMapRealVector20);
        double double22 = openMapRealVector13.dotProduct(openMapRealVector17);
        int int23 = openMapRealVector13.getMaxIndex();
        org.apache.commons.math.linear.RealVector realVector24 = openMapRealVector5.combineToSelf((double) (byte) -1, (double) '4', (org.apache.commons.math.linear.RealVector) openMapRealVector13);
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
        double[] doubleArray50 = new double[] { 100.0d, (-1.0d), (-1.0f) };
        openMapRealVector45.setSubVector(99, doubleArray50);
        org.apache.commons.math.linear.RealVector realVector52 = openMapRealVector13.add(doubleArray50);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector53 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray50);
        double double54 = openMapRealVector53.getSparsity();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector57 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector60 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector61 = openMapRealVector57.projection((org.apache.commons.math.linear.RealVector) openMapRealVector60);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector64 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector67 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector68 = openMapRealVector64.projection((org.apache.commons.math.linear.RealVector) openMapRealVector67);
        double double69 = openMapRealVector60.dotProduct(openMapRealVector64);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor70 = openMapRealVector64.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector71 = openMapRealVector64.copy();
        double[] doubleArray72 = openMapRealVector64.toArray();
        org.apache.commons.math.linear.RealMatrix realMatrix73 = openMapRealVector53.outerProduct(doubleArray72);
        org.apache.commons.math.linear.RealVector realVector74 = openMapRealVector1.add(doubleArray72);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on realVector52 and openMapRealVector53.", realVector52.equals(openMapRealVector53) == openMapRealVector53.equals(realVector52));
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector((int) 'a', (int) (short) 10);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor3 = openMapRealVector2.sparseIterator();
        double[] doubleArray9 = new double[] { 1.0d, (short) 10, 'a', (byte) 100, 0.0f };
        org.apache.commons.math.linear.RealVector realVector10 = openMapRealVector2.add(doubleArray9);
        double double11 = openMapRealVector2.getMinValue();
        double[] doubleArray12 = openMapRealVector2.getData();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor13 = openMapRealVector2.iterator();
        java.lang.Double[] doubleArray16 = new java.lang.Double[] { 10.0d, 1.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector17 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray16);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector18 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray16);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray16);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector21 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray16, (double) (byte) 100);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray16, 1.0E-12d);
        org.apache.commons.math.linear.RealVector realVector25 = openMapRealVector23.mapMultiply((double) 0L);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector28 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector31 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector32 = openMapRealVector28.projection((org.apache.commons.math.linear.RealVector) openMapRealVector31);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector35 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector38 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector39 = openMapRealVector35.projection((org.apache.commons.math.linear.RealVector) openMapRealVector38);
        double double40 = openMapRealVector31.dotProduct(openMapRealVector35);
        int int41 = openMapRealVector31.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector44 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean45 = openMapRealVector44.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector46 = openMapRealVector31.append((org.apache.commons.math.linear.RealVector) openMapRealVector44);
        double[] doubleArray51 = new double[] { 100.0d, (-1.0d), (-1.0f) };
        openMapRealVector46.setSubVector(99, doubleArray51);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor53 = openMapRealVector46.iterator();
        double[] doubleArray54 = openMapRealVector46.toArray();
        boolean boolean55 = openMapRealVector46.isNaN();
        openMapRealVector46.setEntry((int) (short) 100, (double) (-1.0f));
        java.lang.Double[] doubleArray62 = new java.lang.Double[] { 10.0d, 1.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector63 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray62);
        double[] doubleArray64 = openMapRealVector63.toArray();
        openMapRealVector46.setSubVector(100, doubleArray64);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector66 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray64);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector67 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray64);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector68 = openMapRealVector23.subtract(doubleArray64);
        org.apache.commons.math.linear.RealMatrix realMatrix69 = openMapRealVector2.outerProduct(doubleArray64);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on realVector25 and openMapRealVector68", realVector25.equals(openMapRealVector68) ? realVector25.hashCode() == openMapRealVector68.hashCode() : true);
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
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector16 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector20 = openMapRealVector16.projection((org.apache.commons.math.linear.RealVector) openMapRealVector19);
        double double21 = openMapRealVector12.dotProduct(openMapRealVector16);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor22 = openMapRealVector16.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = openMapRealVector5.append((org.apache.commons.math.linear.RealVector) openMapRealVector16);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector25 = openMapRealVector16.append((double) 10);
        double double26 = openMapRealVector16.getNorm();
        double double27 = openMapRealVector16.getMaxValue();
        java.lang.Double[] doubleArray30 = new java.lang.Double[] { 10.0d, 1.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector31 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray30);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector32 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray30);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector33 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray30);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector35 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray30, (double) (byte) 100);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector37 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray30, 1.0E-12d);
        org.apache.commons.math.linear.RealVector realVector39 = openMapRealVector37.mapMultiply((double) 0L);
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
        boolean boolean69 = openMapRealVector60.isNaN();
        openMapRealVector60.setEntry((int) (short) 100, (double) (-1.0f));
        java.lang.Double[] doubleArray76 = new java.lang.Double[] { 10.0d, 1.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector77 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray76);
        double[] doubleArray78 = openMapRealVector77.toArray();
        openMapRealVector60.setSubVector(100, doubleArray78);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector80 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray78);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector81 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray78);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector82 = openMapRealVector37.subtract(doubleArray78);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector83 = openMapRealVector16.append(openMapRealVector82);
        double double84 = openMapRealVector16.getL1Norm();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on realVector39 and openMapRealVector82", realVector39.equals(openMapRealVector82) ? realVector39.hashCode() == openMapRealVector82.hashCode() : true);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
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
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector54 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector57 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector58 = openMapRealVector54.projection((org.apache.commons.math.linear.RealVector) openMapRealVector57);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector61 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector64 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector65 = openMapRealVector61.projection((org.apache.commons.math.linear.RealVector) openMapRealVector64);
        double double66 = openMapRealVector57.dotProduct(openMapRealVector61);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor67 = openMapRealVector61.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector68 = openMapRealVector61.copy();
        double[] doubleArray69 = openMapRealVector61.toArray();
        org.apache.commons.math.linear.RealMatrix realMatrix70 = openMapRealVector50.outerProduct(doubleArray69);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector72 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray69, (double) 101);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on realVector49 and openMapRealVector50.", realVector49.equals(openMapRealVector50) == openMapRealVector50.equals(realVector49));
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector3 = new org.apache.commons.math.linear.OpenMapRealVector(1, (int) (short) 10, (double) (short) 0);
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
        double[] doubleArray29 = new double[] { 100.0d, (-1.0d), (-1.0f) };
        openMapRealVector24.setSubVector(99, doubleArray29);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor31 = openMapRealVector24.iterator();
        double[] doubleArray32 = openMapRealVector24.toArray();
        boolean boolean33 = openMapRealVector24.isNaN();
        openMapRealVector24.setEntry((int) (short) 100, (double) (-1.0f));
        java.lang.Double[] doubleArray40 = new java.lang.Double[] { 10.0d, 1.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector41 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray40);
        double[] doubleArray42 = openMapRealVector41.toArray();
        openMapRealVector24.setSubVector(100, doubleArray42);
        org.apache.commons.math.linear.RealVector realVector44 = openMapRealVector3.add(doubleArray42);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector45 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray42);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on realVector44 and openMapRealVector41.", realVector44.equals(openMapRealVector41) == openMapRealVector41.equals(realVector44));
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
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
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector21 = new org.apache.commons.math.linear.OpenMapRealVector(openMapRealVector5);
        double double23 = openMapRealVector5.getEntry((int) (short) 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector27 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
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
        double double67 = openMapRealVector27.getL1Distance(openMapRealVector54);
        org.apache.commons.math.linear.RealVector realVector69 = openMapRealVector54.mapSubtract((double) 0);
        boolean boolean70 = openMapRealVector54.isNaN();
        double double71 = openMapRealVector54.getLInfNorm();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector74 = new org.apache.commons.math.linear.OpenMapRealVector((int) (byte) 10, 99);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector75 = openMapRealVector74.copy();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector77 = openMapRealVector75.mapAdd((double) (byte) 10);
        double[] doubleArray78 = openMapRealVector77.getData();
        org.apache.commons.math.linear.RealVector realVector79 = openMapRealVector54.add(doubleArray78);
        openMapRealVector5.setSubVector((int) '#', doubleArray78);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on realVector79 and openMapRealVector77.", realVector79.equals(openMapRealVector77) == openMapRealVector77.equals(realVector79));
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector3 = new org.apache.commons.math.linear.OpenMapRealVector((int) (byte) -1, 0, (double) 100L);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector10 = openMapRealVector6.projection((org.apache.commons.math.linear.RealVector) openMapRealVector9);
        org.apache.commons.math.linear.RealVector realVector12 = openMapRealVector9.mapDivideToSelf((double) 1);
        double double13 = openMapRealVector9.getSparsity();
        double[] doubleArray14 = openMapRealVector9.toArray();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector16 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray14, (double) 1);
        org.apache.commons.math.linear.RealVector realVector17 = openMapRealVector3.add(doubleArray14);
        java.lang.Double[] doubleArray20 = new java.lang.Double[] { 10.0d, 1.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector21 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray20);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray20, 134.09325113517085d);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector25 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray20, (double) 1.0f);
        int int26 = openMapRealVector25.getMinIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector27 = openMapRealVector25.unitVector();
        boolean boolean28 = openMapRealVector3.equals((java.lang.Object) openMapRealVector27);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on realVector17 and openMapRealVector6.", realVector17.equals(openMapRealVector6) == openMapRealVector6.equals(realVector17));
    }
}

