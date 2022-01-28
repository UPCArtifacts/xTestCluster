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
        double double42 = openMapRealVector40.getLInfNorm();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector45 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector48 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector49 = openMapRealVector45.projection((org.apache.commons.math.linear.RealVector) openMapRealVector48);
        double[] doubleArray50 = openMapRealVector48.toArray();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector52 = openMapRealVector48.append((double) ' ');
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector53 = openMapRealVector40.ebeMultiply((org.apache.commons.math.linear.RealVector) openMapRealVector48);
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
        double double73 = openMapRealVector63.getMaxValue();
        org.apache.commons.math.linear.RealVector realVector74 = openMapRealVector40.projection((org.apache.commons.math.linear.RealVector) openMapRealVector63);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector53", openMapRealVector2.equals(openMapRealVector53) ? openMapRealVector2.hashCode() == openMapRealVector53.hashCode() : true);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
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
        int int86 = openMapRealVector9.getDimension();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on realVector85 and openMapRealVector2.", realVector85.equals(openMapRealVector2) == openMapRealVector2.equals(realVector85));
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean3 = openMapRealVector2.isInfinite();
        boolean boolean4 = openMapRealVector2.isNaN();
        java.lang.Double[] doubleArray7 = new java.lang.Double[] { 100.0d, 1.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray7, (double) (byte) 1);
        int int10 = openMapRealVector9.getDimension();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = openMapRealVector9.mapAddToSelf((double) (-1));
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector24 = openMapRealVector20.projection((org.apache.commons.math.linear.RealVector) openMapRealVector23);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector27 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector30 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector31 = openMapRealVector27.projection((org.apache.commons.math.linear.RealVector) openMapRealVector30);
        double double32 = openMapRealVector23.dotProduct(openMapRealVector27);
        int int33 = openMapRealVector23.getMaxIndex();
        org.apache.commons.math.linear.RealVector realVector34 = openMapRealVector15.combineToSelf((double) (byte) -1, (double) '4', (org.apache.commons.math.linear.RealVector) openMapRealVector23);
        java.lang.Double[] doubleArray38 = new java.lang.Double[] { 100.0d, 1.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector40 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray38, (double) (byte) 1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector41 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray38);
        boolean boolean42 = openMapRealVector41.isNaN();
        double[] doubleArray43 = openMapRealVector41.toArray();
        openMapRealVector23.setSubVector(2, doubleArray43);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector45 = openMapRealVector12.subtract(doubleArray43);
        java.lang.Double[] doubleArray48 = new java.lang.Double[] { 100.0d, 1.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector50 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray48, (double) (byte) 1);
        int int51 = openMapRealVector50.getDimension();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector53 = openMapRealVector50.mapAddToSelf((double) (-1));
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector56 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector61 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector64 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector65 = openMapRealVector61.projection((org.apache.commons.math.linear.RealVector) openMapRealVector64);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector68 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector71 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector72 = openMapRealVector68.projection((org.apache.commons.math.linear.RealVector) openMapRealVector71);
        double double73 = openMapRealVector64.dotProduct(openMapRealVector68);
        int int74 = openMapRealVector64.getMaxIndex();
        org.apache.commons.math.linear.RealVector realVector75 = openMapRealVector56.combineToSelf((double) (byte) -1, (double) '4', (org.apache.commons.math.linear.RealVector) openMapRealVector64);
        java.lang.Double[] doubleArray79 = new java.lang.Double[] { 100.0d, 1.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector81 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray79, (double) (byte) 1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector82 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray79);
        boolean boolean83 = openMapRealVector82.isNaN();
        double[] doubleArray84 = openMapRealVector82.toArray();
        openMapRealVector64.setSubVector(2, doubleArray84);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector86 = openMapRealVector53.subtract(doubleArray84);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector87 = openMapRealVector45.subtract(doubleArray84);
        org.apache.commons.math.linear.RealVector realVector88 = openMapRealVector2.add(doubleArray84);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector89 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray84);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on realVector88 and openMapRealVector40.", realVector88.equals(openMapRealVector40) == openMapRealVector40.equals(realVector88));
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
        double[] doubleArray64 = openMapRealVector44.toArray();
        int int65 = openMapRealVector44.getDimension();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector68 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector71 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector72 = openMapRealVector68.projection((org.apache.commons.math.linear.RealVector) openMapRealVector71);
        double[] doubleArray73 = openMapRealVector71.toArray();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector75 = openMapRealVector71.append((double) ' ');
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector76 = openMapRealVector44.append(openMapRealVector75);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector78 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 100);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector79 = openMapRealVector44.add(openMapRealVector78);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector82 = new org.apache.commons.math.linear.OpenMapRealVector((int) 'a', (int) (short) 10);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor83 = openMapRealVector82.sparseIterator();
        double[] doubleArray89 = new double[] { 1.0d, (short) 10, 'a', (byte) 100, 0.0f };
        org.apache.commons.math.linear.RealVector realVector90 = openMapRealVector82.add(doubleArray89);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector91 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray89);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector92 = openMapRealVector79.append(doubleArray89);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on realVector90 and openMapRealVector91.", realVector90.equals(openMapRealVector91) == openMapRealVector91.equals(realVector90));
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
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
        java.lang.Class<?> wildcardClass54 = doubleArray53.getClass();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on realVector49 and openMapRealVector50.", realVector49.equals(openMapRealVector50) == openMapRealVector50.equals(realVector49));
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
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
        double[] doubleArray28 = openMapRealVector20.toArray();
        boolean boolean29 = openMapRealVector20.isNaN();
        double double30 = openMapRealVector20.getL1Norm();
        double double31 = openMapRealVector20.getSparsity();
        java.lang.Double[] doubleArray34 = new java.lang.Double[] { 100.0d, 1.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector36 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray34, (double) (byte) 1);
        boolean boolean37 = openMapRealVector36.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector40 = new org.apache.commons.math.linear.OpenMapRealVector((int) 'a', (int) (short) 10);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor41 = openMapRealVector40.sparseIterator();
        double[] doubleArray47 = new double[] { 1.0d, (short) 10, 'a', (byte) 100, 0.0f };
        org.apache.commons.math.linear.RealVector realVector48 = openMapRealVector40.add(doubleArray47);
        org.apache.commons.math.linear.RealMatrix realMatrix49 = openMapRealVector36.outerProduct(doubleArray47);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector50 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray47);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector51 = openMapRealVector20.append(doubleArray47);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on realVector48 and openMapRealVector50.", realVector48.equals(openMapRealVector50) == openMapRealVector50.equals(realVector48));
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
        int int15 = openMapRealVector5.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector18 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean19 = openMapRealVector18.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = openMapRealVector5.append((org.apache.commons.math.linear.RealVector) openMapRealVector18);
        double double21 = openMapRealVector5.getMaxValue();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector24 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector27 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector28 = openMapRealVector24.projection((org.apache.commons.math.linear.RealVector) openMapRealVector27);
        org.apache.commons.math.linear.RealVector realVector30 = openMapRealVector27.mapDivideToSelf((double) 1);
        double double31 = openMapRealVector27.getSparsity();
        double[] doubleArray32 = openMapRealVector27.toArray();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector33 = openMapRealVector27.copy();
        double[] doubleArray34 = openMapRealVector33.toArray();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector35 = openMapRealVector5.append(doubleArray34);
        int int36 = openMapRealVector5.getMinIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector39 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector42 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector43 = openMapRealVector39.projection((org.apache.commons.math.linear.RealVector) openMapRealVector42);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector46 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector49 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector50 = openMapRealVector46.projection((org.apache.commons.math.linear.RealVector) openMapRealVector49);
        double double51 = openMapRealVector42.dotProduct(openMapRealVector46);
        int int52 = openMapRealVector42.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector55 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean56 = openMapRealVector55.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector57 = openMapRealVector42.append((org.apache.commons.math.linear.RealVector) openMapRealVector55);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector60 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector63 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector64 = openMapRealVector60.projection((org.apache.commons.math.linear.RealVector) openMapRealVector63);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector67 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector70 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector71 = openMapRealVector67.projection((org.apache.commons.math.linear.RealVector) openMapRealVector70);
        double double72 = openMapRealVector63.dotProduct(openMapRealVector67);
        int int73 = openMapRealVector63.getMaxIndex();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor74 = openMapRealVector63.sparseIterator();
        double double75 = openMapRealVector42.dotProduct((org.apache.commons.math.linear.RealVector) openMapRealVector63);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector77 = openMapRealVector63.mapAddToSelf((double) (short) 10);
        double double78 = openMapRealVector77.getNorm();
        double double79 = openMapRealVector77.getLInfNorm();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector82 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector85 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector86 = openMapRealVector82.projection((org.apache.commons.math.linear.RealVector) openMapRealVector85);
        double[] doubleArray87 = openMapRealVector85.toArray();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector89 = openMapRealVector85.append((double) ' ');
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector90 = openMapRealVector77.ebeMultiply((org.apache.commons.math.linear.RealVector) openMapRealVector85);
        double double91 = openMapRealVector5.dotProduct((org.apache.commons.math.linear.RealVector) openMapRealVector90);
        double double92 = openMapRealVector5.getLInfNorm();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector90", openMapRealVector2.equals(openMapRealVector90) ? openMapRealVector2.hashCode() == openMapRealVector90.hashCode() : true);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
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
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
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
        double double42 = openMapRealVector40.getLInfNorm();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector45 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector48 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector49 = openMapRealVector45.projection((org.apache.commons.math.linear.RealVector) openMapRealVector48);
        double[] doubleArray50 = openMapRealVector48.toArray();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector52 = openMapRealVector48.append((double) ' ');
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector53 = openMapRealVector40.ebeMultiply((org.apache.commons.math.linear.RealVector) openMapRealVector48);
        openMapRealVector48.set((double) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector53", openMapRealVector2.equals(openMapRealVector53) ? openMapRealVector2.hashCode() == openMapRealVector53.hashCode() : true);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
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
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector56 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector59 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector60 = openMapRealVector56.projection((org.apache.commons.math.linear.RealVector) openMapRealVector59);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector63 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector66 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector67 = openMapRealVector63.projection((org.apache.commons.math.linear.RealVector) openMapRealVector66);
        double double68 = openMapRealVector59.dotProduct(openMapRealVector63);
        int int69 = openMapRealVector59.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector72 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean73 = openMapRealVector72.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector74 = openMapRealVector59.append((org.apache.commons.math.linear.RealVector) openMapRealVector72);
        double[] doubleArray79 = new double[] { 100.0d, (-1.0d), (-1.0f) };
        openMapRealVector74.setSubVector(99, doubleArray79);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor81 = openMapRealVector74.iterator();
        double[] doubleArray82 = openMapRealVector74.toArray();
        boolean boolean83 = openMapRealVector74.isNaN();
        openMapRealVector74.setEntry((int) (short) 100, (double) (-1.0f));
        java.lang.Double[] doubleArray90 = new java.lang.Double[] { 10.0d, 1.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector91 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray90);
        double[] doubleArray92 = openMapRealVector91.toArray();
        openMapRealVector74.setSubVector(100, doubleArray92);
        org.apache.commons.math.linear.RealVector realVector95 = openMapRealVector74.mapSubtractToSelf((double) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector96 = openMapRealVector50.append((org.apache.commons.math.linear.RealVector) openMapRealVector74);
        double double97 = openMapRealVector74.getNorm();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on realVector49 and openMapRealVector50.", realVector49.equals(openMapRealVector50) == openMapRealVector50.equals(realVector49));
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        int int7 = openMapRealVector2.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector2.mapAddToSelf((double) (byte) -1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector10 = new org.apache.commons.math.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math.linear.OpenMapRealVector(1, (int) (byte) 10, (double) 96);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector17 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector21 = openMapRealVector17.projection((org.apache.commons.math.linear.RealVector) openMapRealVector20);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector24 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector27 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector28 = openMapRealVector24.projection((org.apache.commons.math.linear.RealVector) openMapRealVector27);
        double double29 = openMapRealVector20.dotProduct(openMapRealVector24);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor30 = openMapRealVector24.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector31 = openMapRealVector24.copy();
        double[] doubleArray32 = openMapRealVector24.toArray();
        org.apache.commons.math.linear.RealVector realVector33 = openMapRealVector14.add(doubleArray32);
        org.apache.commons.math.linear.RealVector realVector34 = openMapRealVector2.add(doubleArray32);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on realVector33 and openMapRealVector5.", realVector33.equals(openMapRealVector5) == openMapRealVector5.equals(realVector33));
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
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
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector56 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector59 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector60 = openMapRealVector56.projection((org.apache.commons.math.linear.RealVector) openMapRealVector59);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector63 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector66 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector67 = openMapRealVector63.projection((org.apache.commons.math.linear.RealVector) openMapRealVector66);
        double double68 = openMapRealVector59.dotProduct(openMapRealVector63);
        int int69 = openMapRealVector59.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector72 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean73 = openMapRealVector72.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector74 = openMapRealVector59.append((org.apache.commons.math.linear.RealVector) openMapRealVector72);
        double[] doubleArray79 = new double[] { 100.0d, (-1.0d), (-1.0f) };
        openMapRealVector74.setSubVector(99, doubleArray79);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor81 = openMapRealVector74.iterator();
        double[] doubleArray82 = openMapRealVector74.toArray();
        boolean boolean83 = openMapRealVector74.isNaN();
        openMapRealVector74.setEntry((int) (short) 100, (double) (-1.0f));
        java.lang.Double[] doubleArray90 = new java.lang.Double[] { 10.0d, 1.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector91 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray90);
        double[] doubleArray92 = openMapRealVector91.toArray();
        openMapRealVector74.setSubVector(100, doubleArray92);
        org.apache.commons.math.linear.RealVector realVector95 = openMapRealVector74.mapSubtractToSelf((double) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector96 = openMapRealVector50.append((org.apache.commons.math.linear.RealVector) openMapRealVector74);
        org.apache.commons.math.linear.RealVector realVector98 = openMapRealVector74.mapSubtract((double) 10);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on realVector49 and openMapRealVector50.", realVector49.equals(openMapRealVector50) == openMapRealVector50.equals(realVector49));
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean3 = openMapRealVector2.isInfinite();
        boolean boolean4 = openMapRealVector2.isNaN();
        java.lang.Double[] doubleArray7 = new java.lang.Double[] { 100.0d, 1.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray7, (double) (byte) 1);
        int int10 = openMapRealVector9.getDimension();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = openMapRealVector9.mapAddToSelf((double) (-1));
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector24 = openMapRealVector20.projection((org.apache.commons.math.linear.RealVector) openMapRealVector23);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector27 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector30 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector31 = openMapRealVector27.projection((org.apache.commons.math.linear.RealVector) openMapRealVector30);
        double double32 = openMapRealVector23.dotProduct(openMapRealVector27);
        int int33 = openMapRealVector23.getMaxIndex();
        org.apache.commons.math.linear.RealVector realVector34 = openMapRealVector15.combineToSelf((double) (byte) -1, (double) '4', (org.apache.commons.math.linear.RealVector) openMapRealVector23);
        java.lang.Double[] doubleArray38 = new java.lang.Double[] { 100.0d, 1.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector40 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray38, (double) (byte) 1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector41 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray38);
        boolean boolean42 = openMapRealVector41.isNaN();
        double[] doubleArray43 = openMapRealVector41.toArray();
        openMapRealVector23.setSubVector(2, doubleArray43);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector45 = openMapRealVector12.subtract(doubleArray43);
        java.lang.Double[] doubleArray48 = new java.lang.Double[] { 100.0d, 1.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector50 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray48, (double) (byte) 1);
        int int51 = openMapRealVector50.getDimension();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector53 = openMapRealVector50.mapAddToSelf((double) (-1));
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector56 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector61 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector64 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector65 = openMapRealVector61.projection((org.apache.commons.math.linear.RealVector) openMapRealVector64);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector68 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector71 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector72 = openMapRealVector68.projection((org.apache.commons.math.linear.RealVector) openMapRealVector71);
        double double73 = openMapRealVector64.dotProduct(openMapRealVector68);
        int int74 = openMapRealVector64.getMaxIndex();
        org.apache.commons.math.linear.RealVector realVector75 = openMapRealVector56.combineToSelf((double) (byte) -1, (double) '4', (org.apache.commons.math.linear.RealVector) openMapRealVector64);
        java.lang.Double[] doubleArray79 = new java.lang.Double[] { 100.0d, 1.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector81 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray79, (double) (byte) 1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector82 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray79);
        boolean boolean83 = openMapRealVector82.isNaN();
        double[] doubleArray84 = openMapRealVector82.toArray();
        openMapRealVector64.setSubVector(2, doubleArray84);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector86 = openMapRealVector53.subtract(doubleArray84);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector87 = openMapRealVector45.subtract(doubleArray84);
        org.apache.commons.math.linear.RealVector realVector88 = openMapRealVector2.add(doubleArray84);
        java.lang.Class<?> wildcardClass89 = doubleArray84.getClass();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on realVector88 and openMapRealVector40.", realVector88.equals(openMapRealVector40) == openMapRealVector40.equals(realVector88));
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean3 = openMapRealVector2.isInfinite();
        boolean boolean4 = openMapRealVector2.isNaN();
        java.lang.Double[] doubleArray7 = new java.lang.Double[] { 100.0d, 1.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray7, (double) (byte) 1);
        int int10 = openMapRealVector9.getDimension();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = openMapRealVector9.mapAddToSelf((double) (-1));
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector24 = openMapRealVector20.projection((org.apache.commons.math.linear.RealVector) openMapRealVector23);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector27 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector30 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector31 = openMapRealVector27.projection((org.apache.commons.math.linear.RealVector) openMapRealVector30);
        double double32 = openMapRealVector23.dotProduct(openMapRealVector27);
        int int33 = openMapRealVector23.getMaxIndex();
        org.apache.commons.math.linear.RealVector realVector34 = openMapRealVector15.combineToSelf((double) (byte) -1, (double) '4', (org.apache.commons.math.linear.RealVector) openMapRealVector23);
        java.lang.Double[] doubleArray38 = new java.lang.Double[] { 100.0d, 1.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector40 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray38, (double) (byte) 1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector41 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray38);
        boolean boolean42 = openMapRealVector41.isNaN();
        double[] doubleArray43 = openMapRealVector41.toArray();
        openMapRealVector23.setSubVector(2, doubleArray43);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector45 = openMapRealVector12.subtract(doubleArray43);
        java.lang.Double[] doubleArray48 = new java.lang.Double[] { 100.0d, 1.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector50 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray48, (double) (byte) 1);
        int int51 = openMapRealVector50.getDimension();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector53 = openMapRealVector50.mapAddToSelf((double) (-1));
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector56 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector61 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector64 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector65 = openMapRealVector61.projection((org.apache.commons.math.linear.RealVector) openMapRealVector64);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector68 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector71 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector72 = openMapRealVector68.projection((org.apache.commons.math.linear.RealVector) openMapRealVector71);
        double double73 = openMapRealVector64.dotProduct(openMapRealVector68);
        int int74 = openMapRealVector64.getMaxIndex();
        org.apache.commons.math.linear.RealVector realVector75 = openMapRealVector56.combineToSelf((double) (byte) -1, (double) '4', (org.apache.commons.math.linear.RealVector) openMapRealVector64);
        java.lang.Double[] doubleArray79 = new java.lang.Double[] { 100.0d, 1.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector81 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray79, (double) (byte) 1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector82 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray79);
        boolean boolean83 = openMapRealVector82.isNaN();
        double[] doubleArray84 = openMapRealVector82.toArray();
        openMapRealVector64.setSubVector(2, doubleArray84);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector86 = openMapRealVector53.subtract(doubleArray84);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector87 = openMapRealVector45.subtract(doubleArray84);
        org.apache.commons.math.linear.RealVector realVector88 = openMapRealVector2.add(doubleArray84);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector89 = openMapRealVector2.copy();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on realVector88 and openMapRealVector40.", realVector88.equals(openMapRealVector40) == openMapRealVector40.equals(realVector88));
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector12);
        double double14 = openMapRealVector5.dotProduct(openMapRealVector9);
        int int15 = openMapRealVector5.getMaxIndex();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor16 = openMapRealVector5.sparseIterator();
        boolean boolean17 = openMapRealVector5.isInfinite();
        double[] doubleArray25 = new double[] { 1.0d, (byte) 1, 100.0d, ' ', (short) 10, (-1.0f) };
        openMapRealVector5.setSubVector(0, doubleArray25);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector29 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector34 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector37 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector38 = openMapRealVector34.projection((org.apache.commons.math.linear.RealVector) openMapRealVector37);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector41 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector44 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector45 = openMapRealVector41.projection((org.apache.commons.math.linear.RealVector) openMapRealVector44);
        double double46 = openMapRealVector37.dotProduct(openMapRealVector41);
        int int47 = openMapRealVector37.getMaxIndex();
        org.apache.commons.math.linear.RealVector realVector48 = openMapRealVector29.combineToSelf((double) (byte) -1, (double) '4', (org.apache.commons.math.linear.RealVector) openMapRealVector37);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector51 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean52 = openMapRealVector51.isInfinite();
        double double53 = openMapRealVector37.getDistance((org.apache.commons.math.linear.RealVector) openMapRealVector51);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector56 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector59 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector60 = openMapRealVector56.projection((org.apache.commons.math.linear.RealVector) openMapRealVector59);
        org.apache.commons.math.linear.RealVector realVector62 = openMapRealVector59.mapDivideToSelf((double) 1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector65 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector68 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector69 = openMapRealVector65.projection((org.apache.commons.math.linear.RealVector) openMapRealVector68);
        org.apache.commons.math.linear.RealVector realVector71 = openMapRealVector68.mapDivideToSelf((double) 1);
        double double72 = openMapRealVector68.getSparsity();
        double[] doubleArray73 = openMapRealVector68.toArray();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector74 = openMapRealVector59.subtract(doubleArray73);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector75 = openMapRealVector37.ebeMultiply(doubleArray73);
        org.apache.commons.math.linear.RealVector realVector76 = openMapRealVector5.add(doubleArray73);
        java.lang.Class<?> wildcardClass77 = doubleArray73.getClass();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on realVector76 and openMapRealVector5.", realVector76.equals(openMapRealVector5) == openMapRealVector5.equals(realVector76));
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        int int7 = openMapRealVector2.getMaxIndex();
        boolean boolean8 = openMapRealVector2.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector11 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean12 = openMapRealVector11.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector13 = openMapRealVector2.subtract((org.apache.commons.math.linear.RealVector) openMapRealVector11);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector16 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector20 = openMapRealVector16.projection((org.apache.commons.math.linear.RealVector) openMapRealVector19);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector27 = openMapRealVector23.projection((org.apache.commons.math.linear.RealVector) openMapRealVector26);
        double double28 = openMapRealVector19.dotProduct(openMapRealVector23);
        int int29 = openMapRealVector19.getMaxIndex();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor30 = openMapRealVector19.sparseIterator();
        org.apache.commons.math.linear.RealVector realVector32 = openMapRealVector19.mapMultiply((double) 0);
        org.apache.commons.math.linear.RealVector realVector34 = openMapRealVector19.mapMultiplyToSelf((double) 99);
        double double35 = openMapRealVector11.getLInfDistance(realVector34);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector36 = new org.apache.commons.math.linear.OpenMapRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector11);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector39 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector42 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector43 = openMapRealVector39.projection((org.apache.commons.math.linear.RealVector) openMapRealVector42);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector46 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector49 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector50 = openMapRealVector46.projection((org.apache.commons.math.linear.RealVector) openMapRealVector49);
        double double51 = openMapRealVector42.dotProduct(openMapRealVector46);
        int int52 = openMapRealVector42.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector55 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean56 = openMapRealVector55.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector57 = openMapRealVector42.append((org.apache.commons.math.linear.RealVector) openMapRealVector55);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector60 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector63 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector64 = openMapRealVector60.projection((org.apache.commons.math.linear.RealVector) openMapRealVector63);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector67 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector70 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector71 = openMapRealVector67.projection((org.apache.commons.math.linear.RealVector) openMapRealVector70);
        double double72 = openMapRealVector63.dotProduct(openMapRealVector67);
        int int73 = openMapRealVector63.getMaxIndex();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor74 = openMapRealVector63.sparseIterator();
        double double75 = openMapRealVector42.dotProduct((org.apache.commons.math.linear.RealVector) openMapRealVector63);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector77 = openMapRealVector63.mapAddToSelf((double) (short) 10);
        double double78 = openMapRealVector77.getNorm();
        double double79 = openMapRealVector77.getLInfNorm();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector82 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector85 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector86 = openMapRealVector82.projection((org.apache.commons.math.linear.RealVector) openMapRealVector85);
        double[] doubleArray87 = openMapRealVector85.toArray();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector89 = openMapRealVector85.append((double) ' ');
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector90 = openMapRealVector77.ebeMultiply((org.apache.commons.math.linear.RealVector) openMapRealVector85);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector91 = openMapRealVector11.subtract(openMapRealVector90);
        openMapRealVector11.setEntry(0, (double) (short) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector90", openMapRealVector2.equals(openMapRealVector90) ? openMapRealVector2.hashCode() == openMapRealVector90.hashCode() : true);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
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
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector56 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector59 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector60 = openMapRealVector56.projection((org.apache.commons.math.linear.RealVector) openMapRealVector59);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector63 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector66 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector67 = openMapRealVector63.projection((org.apache.commons.math.linear.RealVector) openMapRealVector66);
        double double68 = openMapRealVector59.dotProduct(openMapRealVector63);
        int int69 = openMapRealVector59.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector72 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean73 = openMapRealVector72.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector74 = openMapRealVector59.append((org.apache.commons.math.linear.RealVector) openMapRealVector72);
        double[] doubleArray79 = new double[] { 100.0d, (-1.0d), (-1.0f) };
        openMapRealVector74.setSubVector(99, doubleArray79);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor81 = openMapRealVector74.iterator();
        double[] doubleArray82 = openMapRealVector74.toArray();
        boolean boolean83 = openMapRealVector74.isNaN();
        openMapRealVector74.setEntry((int) (short) 100, (double) (-1.0f));
        java.lang.Double[] doubleArray90 = new java.lang.Double[] { 10.0d, 1.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector91 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray90);
        double[] doubleArray92 = openMapRealVector91.toArray();
        openMapRealVector74.setSubVector(100, doubleArray92);
        org.apache.commons.math.linear.RealVector realVector95 = openMapRealVector74.mapSubtractToSelf((double) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector96 = openMapRealVector50.append((org.apache.commons.math.linear.RealVector) openMapRealVector74);
        double double97 = openMapRealVector74.getSparsity();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on realVector49 and openMapRealVector50.", realVector49.equals(openMapRealVector50) == openMapRealVector50.equals(realVector49));
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector12);
        double double14 = openMapRealVector5.dotProduct(openMapRealVector9);
        int int15 = openMapRealVector5.getMaxIndex();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor16 = openMapRealVector5.sparseIterator();
        boolean boolean17 = openMapRealVector5.isInfinite();
        double[] doubleArray25 = new double[] { 1.0d, (byte) 1, 100.0d, ' ', (short) 10, (-1.0f) };
        openMapRealVector5.setSubVector(0, doubleArray25);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector29 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector34 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector37 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector38 = openMapRealVector34.projection((org.apache.commons.math.linear.RealVector) openMapRealVector37);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector41 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector44 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector45 = openMapRealVector41.projection((org.apache.commons.math.linear.RealVector) openMapRealVector44);
        double double46 = openMapRealVector37.dotProduct(openMapRealVector41);
        int int47 = openMapRealVector37.getMaxIndex();
        org.apache.commons.math.linear.RealVector realVector48 = openMapRealVector29.combineToSelf((double) (byte) -1, (double) '4', (org.apache.commons.math.linear.RealVector) openMapRealVector37);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector51 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean52 = openMapRealVector51.isInfinite();
        double double53 = openMapRealVector37.getDistance((org.apache.commons.math.linear.RealVector) openMapRealVector51);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector56 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector59 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector60 = openMapRealVector56.projection((org.apache.commons.math.linear.RealVector) openMapRealVector59);
        org.apache.commons.math.linear.RealVector realVector62 = openMapRealVector59.mapDivideToSelf((double) 1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector65 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector68 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector69 = openMapRealVector65.projection((org.apache.commons.math.linear.RealVector) openMapRealVector68);
        org.apache.commons.math.linear.RealVector realVector71 = openMapRealVector68.mapDivideToSelf((double) 1);
        double double72 = openMapRealVector68.getSparsity();
        double[] doubleArray73 = openMapRealVector68.toArray();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector74 = openMapRealVector59.subtract(doubleArray73);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector75 = openMapRealVector37.ebeMultiply(doubleArray73);
        org.apache.commons.math.linear.RealVector realVector76 = openMapRealVector5.add(doubleArray73);
        double[] doubleArray77 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector78 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray77);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector79 = openMapRealVector5.append(doubleArray77);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector81 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray77, (double) (short) 1);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on realVector76 and openMapRealVector5.", realVector76.equals(openMapRealVector5) == openMapRealVector5.equals(realVector76));
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        int int7 = openMapRealVector2.getMaxIndex();
        boolean boolean8 = openMapRealVector2.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector11 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean12 = openMapRealVector11.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector13 = openMapRealVector2.subtract((org.apache.commons.math.linear.RealVector) openMapRealVector11);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector16 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector20 = openMapRealVector16.projection((org.apache.commons.math.linear.RealVector) openMapRealVector19);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector27 = openMapRealVector23.projection((org.apache.commons.math.linear.RealVector) openMapRealVector26);
        double double28 = openMapRealVector19.dotProduct(openMapRealVector23);
        int int29 = openMapRealVector19.getMaxIndex();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor30 = openMapRealVector19.sparseIterator();
        org.apache.commons.math.linear.RealVector realVector32 = openMapRealVector19.mapMultiply((double) 0);
        org.apache.commons.math.linear.RealVector realVector34 = openMapRealVector19.mapMultiplyToSelf((double) 99);
        double double35 = openMapRealVector11.getLInfDistance(realVector34);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector36 = new org.apache.commons.math.linear.OpenMapRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector11);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector39 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector42 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector43 = openMapRealVector39.projection((org.apache.commons.math.linear.RealVector) openMapRealVector42);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector46 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector49 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector50 = openMapRealVector46.projection((org.apache.commons.math.linear.RealVector) openMapRealVector49);
        double double51 = openMapRealVector42.dotProduct(openMapRealVector46);
        int int52 = openMapRealVector42.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector55 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean56 = openMapRealVector55.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector57 = openMapRealVector42.append((org.apache.commons.math.linear.RealVector) openMapRealVector55);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector60 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector63 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector64 = openMapRealVector60.projection((org.apache.commons.math.linear.RealVector) openMapRealVector63);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector67 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector70 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector71 = openMapRealVector67.projection((org.apache.commons.math.linear.RealVector) openMapRealVector70);
        double double72 = openMapRealVector63.dotProduct(openMapRealVector67);
        int int73 = openMapRealVector63.getMaxIndex();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor74 = openMapRealVector63.sparseIterator();
        double double75 = openMapRealVector42.dotProduct((org.apache.commons.math.linear.RealVector) openMapRealVector63);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector77 = openMapRealVector63.mapAddToSelf((double) (short) 10);
        double double78 = openMapRealVector77.getNorm();
        double double79 = openMapRealVector77.getLInfNorm();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector82 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector85 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector86 = openMapRealVector82.projection((org.apache.commons.math.linear.RealVector) openMapRealVector85);
        double[] doubleArray87 = openMapRealVector85.toArray();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector89 = openMapRealVector85.append((double) ' ');
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector90 = openMapRealVector77.ebeMultiply((org.apache.commons.math.linear.RealVector) openMapRealVector85);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector91 = openMapRealVector11.subtract(openMapRealVector90);
        double double92 = openMapRealVector11.getMaxValue();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector90", openMapRealVector2.equals(openMapRealVector90) ? openMapRealVector2.hashCode() == openMapRealVector90.hashCode() : true);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
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
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector43 = new org.apache.commons.math.linear.OpenMapRealVector(openMapRealVector29);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector45 = openMapRealVector29.mapAddToSelf((double) (-1));
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector48 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector51 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector54 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector55 = openMapRealVector51.projection((org.apache.commons.math.linear.RealVector) openMapRealVector54);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector58 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector61 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector62 = openMapRealVector58.projection((org.apache.commons.math.linear.RealVector) openMapRealVector61);
        double double63 = openMapRealVector54.dotProduct(openMapRealVector58);
        int int64 = openMapRealVector54.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector67 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean68 = openMapRealVector67.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector69 = openMapRealVector54.append((org.apache.commons.math.linear.RealVector) openMapRealVector67);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector72 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector75 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector76 = openMapRealVector72.projection((org.apache.commons.math.linear.RealVector) openMapRealVector75);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector79 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector82 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector83 = openMapRealVector79.projection((org.apache.commons.math.linear.RealVector) openMapRealVector82);
        double double84 = openMapRealVector75.dotProduct(openMapRealVector79);
        int int85 = openMapRealVector75.getMaxIndex();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor86 = openMapRealVector75.sparseIterator();
        double double87 = openMapRealVector54.dotProduct((org.apache.commons.math.linear.RealVector) openMapRealVector75);
        double double88 = openMapRealVector48.getL1Distance(openMapRealVector75);
        double[] doubleArray89 = openMapRealVector75.getData();
        org.apache.commons.math.linear.RealVector realVector90 = openMapRealVector45.add(doubleArray89);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector91 = openMapRealVector45.unitVector();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on realVector90 and openMapRealVector45.", realVector90.equals(openMapRealVector45) == openMapRealVector45.equals(realVector90));
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
        double double42 = openMapRealVector40.getLInfNorm();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector45 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector48 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector49 = openMapRealVector45.projection((org.apache.commons.math.linear.RealVector) openMapRealVector48);
        double[] doubleArray50 = openMapRealVector48.toArray();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector52 = openMapRealVector48.append((double) ' ');
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector53 = openMapRealVector40.ebeMultiply((org.apache.commons.math.linear.RealVector) openMapRealVector48);
        int int54 = openMapRealVector40.getMaxIndex();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector53", openMapRealVector2.equals(openMapRealVector53) ? openMapRealVector2.hashCode() == openMapRealVector53.hashCode() : true);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
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
        double double42 = openMapRealVector40.getLInfNorm();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector45 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector48 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector49 = openMapRealVector45.projection((org.apache.commons.math.linear.RealVector) openMapRealVector48);
        double[] doubleArray50 = openMapRealVector48.toArray();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector52 = openMapRealVector48.append((double) ' ');
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector53 = openMapRealVector40.ebeMultiply((org.apache.commons.math.linear.RealVector) openMapRealVector48);
        double double54 = openMapRealVector48.getLInfNorm();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector53", openMapRealVector2.equals(openMapRealVector53) ? openMapRealVector2.hashCode() == openMapRealVector53.hashCode() : true);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
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
        double double42 = openMapRealVector40.getLInfNorm();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector45 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector48 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector49 = openMapRealVector45.projection((org.apache.commons.math.linear.RealVector) openMapRealVector48);
        double[] doubleArray50 = openMapRealVector48.toArray();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector52 = openMapRealVector48.append((double) ' ');
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector53 = openMapRealVector40.ebeMultiply((org.apache.commons.math.linear.RealVector) openMapRealVector48);
        double double54 = openMapRealVector40.getL1Norm();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector53", openMapRealVector2.equals(openMapRealVector53) ? openMapRealVector2.hashCode() == openMapRealVector53.hashCode() : true);
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
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector41 = new org.apache.commons.math.linear.OpenMapRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector26);
        double double42 = openMapRealVector41.getSparsity();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector45 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector48 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector49 = openMapRealVector45.projection((org.apache.commons.math.linear.RealVector) openMapRealVector48);
        int int50 = openMapRealVector45.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector52 = openMapRealVector45.mapAddToSelf((double) (byte) -1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector55 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector58 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector59 = openMapRealVector55.projection((org.apache.commons.math.linear.RealVector) openMapRealVector58);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector62 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector65 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector66 = openMapRealVector62.projection((org.apache.commons.math.linear.RealVector) openMapRealVector65);
        double double67 = openMapRealVector58.dotProduct(openMapRealVector62);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor68 = openMapRealVector62.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector69 = openMapRealVector62.copy();
        double[] doubleArray70 = openMapRealVector62.toArray();
        org.apache.commons.math.linear.RealVector realVector71 = openMapRealVector45.add(doubleArray70);
        double double72 = openMapRealVector41.getL1Distance(openMapRealVector45);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on realVector71 and openMapRealVector45.", realVector71.equals(openMapRealVector45) == openMapRealVector45.equals(realVector71));
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
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
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector51 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray47);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on realVector49 and openMapRealVector50.", realVector49.equals(openMapRealVector50) == openMapRealVector50.equals(realVector49));
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        java.lang.Double[] doubleArray2 = new java.lang.Double[] { 10.0d, 1.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector3 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray2);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray2);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray2);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray2, (double) (byte) 100);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector8 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray2);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray2);
        java.lang.Double[] doubleArray12 = new java.lang.Double[] { 10.0d, 1.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector13 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray12);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray12);
        int int15 = openMapRealVector14.getDimension();
        double double16 = openMapRealVector9.dotProduct(openMapRealVector14);
        boolean boolean17 = openMapRealVector14.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 100, (double) '#');
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector27 = openMapRealVector23.projection((org.apache.commons.math.linear.RealVector) openMapRealVector26);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector30 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector33 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector34 = openMapRealVector30.projection((org.apache.commons.math.linear.RealVector) openMapRealVector33);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector37 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector40 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector41 = openMapRealVector37.projection((org.apache.commons.math.linear.RealVector) openMapRealVector40);
        double double42 = openMapRealVector33.dotProduct(openMapRealVector37);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor43 = openMapRealVector37.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector44 = openMapRealVector26.append((org.apache.commons.math.linear.RealVector) openMapRealVector37);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector46 = openMapRealVector37.append((double) 10);
        double double47 = openMapRealVector37.getNorm();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector50 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector53 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector54 = openMapRealVector50.projection((org.apache.commons.math.linear.RealVector) openMapRealVector53);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector57 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector60 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector61 = openMapRealVector57.projection((org.apache.commons.math.linear.RealVector) openMapRealVector60);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector64 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector67 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector68 = openMapRealVector64.projection((org.apache.commons.math.linear.RealVector) openMapRealVector67);
        double double69 = openMapRealVector60.dotProduct(openMapRealVector64);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor70 = openMapRealVector64.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector71 = openMapRealVector53.append((org.apache.commons.math.linear.RealVector) openMapRealVector64);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector73 = openMapRealVector64.append((double) 10);
        double double74 = openMapRealVector64.getNorm();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector75 = openMapRealVector37.ebeDivide((org.apache.commons.math.linear.RealVector) openMapRealVector64);
        org.apache.commons.math.linear.RealVector realVector76 = openMapRealVector20.projection((org.apache.commons.math.linear.RealVector) openMapRealVector37);
        java.lang.Double[] doubleArray79 = new java.lang.Double[] { 100.0d, 1.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector81 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray79, (double) (byte) 1);
        boolean boolean82 = openMapRealVector81.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector85 = new org.apache.commons.math.linear.OpenMapRealVector((int) 'a', (int) (short) 10);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor86 = openMapRealVector85.sparseIterator();
        double[] doubleArray92 = new double[] { 1.0d, (short) 10, 'a', (byte) 100, 0.0f };
        org.apache.commons.math.linear.RealVector realVector93 = openMapRealVector85.add(doubleArray92);
        org.apache.commons.math.linear.RealMatrix realMatrix94 = openMapRealVector81.outerProduct(doubleArray92);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector95 = openMapRealVector37.append(doubleArray92);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector96 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray92);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector97 = openMapRealVector14.append(doubleArray92);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on realVector93 and openMapRealVector96.", realVector93.equals(openMapRealVector96) == openMapRealVector96.equals(realVector93));
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        int int7 = openMapRealVector2.getMaxIndex();
        boolean boolean8 = openMapRealVector2.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector11 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean12 = openMapRealVector11.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector13 = openMapRealVector2.subtract((org.apache.commons.math.linear.RealVector) openMapRealVector11);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector16 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector20 = openMapRealVector16.projection((org.apache.commons.math.linear.RealVector) openMapRealVector19);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector27 = openMapRealVector23.projection((org.apache.commons.math.linear.RealVector) openMapRealVector26);
        double double28 = openMapRealVector19.dotProduct(openMapRealVector23);
        int int29 = openMapRealVector19.getMaxIndex();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor30 = openMapRealVector19.sparseIterator();
        org.apache.commons.math.linear.RealVector realVector32 = openMapRealVector19.mapMultiply((double) 0);
        org.apache.commons.math.linear.RealVector realVector34 = openMapRealVector19.mapMultiplyToSelf((double) 99);
        double double35 = openMapRealVector11.getLInfDistance(realVector34);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector36 = new org.apache.commons.math.linear.OpenMapRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector11);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector39 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector42 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector43 = openMapRealVector39.projection((org.apache.commons.math.linear.RealVector) openMapRealVector42);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector46 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector49 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector50 = openMapRealVector46.projection((org.apache.commons.math.linear.RealVector) openMapRealVector49);
        double double51 = openMapRealVector42.dotProduct(openMapRealVector46);
        int int52 = openMapRealVector42.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector55 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean56 = openMapRealVector55.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector57 = openMapRealVector42.append((org.apache.commons.math.linear.RealVector) openMapRealVector55);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector60 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector63 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector64 = openMapRealVector60.projection((org.apache.commons.math.linear.RealVector) openMapRealVector63);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector67 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector70 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector71 = openMapRealVector67.projection((org.apache.commons.math.linear.RealVector) openMapRealVector70);
        double double72 = openMapRealVector63.dotProduct(openMapRealVector67);
        int int73 = openMapRealVector63.getMaxIndex();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor74 = openMapRealVector63.sparseIterator();
        double double75 = openMapRealVector42.dotProduct((org.apache.commons.math.linear.RealVector) openMapRealVector63);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector77 = openMapRealVector63.mapAddToSelf((double) (short) 10);
        double double78 = openMapRealVector77.getNorm();
        double double79 = openMapRealVector77.getLInfNorm();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector82 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector85 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector86 = openMapRealVector82.projection((org.apache.commons.math.linear.RealVector) openMapRealVector85);
        double[] doubleArray87 = openMapRealVector85.toArray();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector89 = openMapRealVector85.append((double) ' ');
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector90 = openMapRealVector77.ebeMultiply((org.apache.commons.math.linear.RealVector) openMapRealVector85);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector91 = openMapRealVector11.subtract(openMapRealVector90);
        int int92 = openMapRealVector91.getDimension();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector2 and openMapRealVector90", openMapRealVector2.equals(openMapRealVector90) ? openMapRealVector2.hashCode() == openMapRealVector90.hashCode() : true);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
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
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector3 = new org.apache.commons.math.linear.OpenMapRealVector((int) ' ', (int) '#', (double) 100.0f);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = openMapRealVector3.append(99.0d);
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
        org.apache.commons.math.linear.RealVector realVector56 = openMapRealVector17.add(doubleArray54);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector57 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray54);
        double double58 = openMapRealVector57.getSparsity();
        double double59 = openMapRealVector57.getL1Norm();
        double[] doubleArray60 = openMapRealVector57.toArray();
        openMapRealVector3.setSubVector(1, doubleArray60);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on realVector56 and openMapRealVector57.", realVector56.equals(openMapRealVector57) == openMapRealVector57.equals(realVector56));
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
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
        org.apache.commons.math.linear.RealVector realVector44 = openMapRealVector2.mapMultiply((double) 'a');
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector47 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector50 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector51 = openMapRealVector47.projection((org.apache.commons.math.linear.RealVector) openMapRealVector50);
        int int52 = openMapRealVector47.getMaxIndex();
        boolean boolean53 = openMapRealVector47.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector56 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean57 = openMapRealVector56.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector58 = openMapRealVector47.subtract((org.apache.commons.math.linear.RealVector) openMapRealVector56);
        org.apache.commons.math.linear.RealVector realVector60 = openMapRealVector47.mapMultiplyToSelf(0.0d);
        int int61 = openMapRealVector47.getMinIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector62 = openMapRealVector2.subtract(openMapRealVector47);
        java.lang.Double[] doubleArray65 = new java.lang.Double[] { 100.0d, 1.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector67 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray65, (double) (byte) 1);
        int int68 = openMapRealVector67.getDimension();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor69 = openMapRealVector67.sparseIterator();
        java.lang.Double[] doubleArray72 = new java.lang.Double[] { 10.0d, 1.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector73 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray72);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector75 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray72, 134.09325113517085d);
        double double76 = openMapRealVector67.getL1Distance(openMapRealVector75);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector79 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector82 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector83 = openMapRealVector79.projection((org.apache.commons.math.linear.RealVector) openMapRealVector82);
        double[] doubleArray84 = openMapRealVector82.toArray();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector85 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray84);
        org.apache.commons.math.linear.RealVector realVector86 = openMapRealVector75.add(doubleArray84);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector87 = openMapRealVector47.append(doubleArray84);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on realVector86 and openMapRealVector2.", realVector86.equals(openMapRealVector2) == openMapRealVector2.equals(realVector86));
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector3 = new org.apache.commons.math.linear.OpenMapRealVector(98, (int) '4', (double) 134);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor4 = openMapRealVector3.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector10 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector11 = openMapRealVector7.projection((org.apache.commons.math.linear.RealVector) openMapRealVector10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector17 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector18 = openMapRealVector14.projection((org.apache.commons.math.linear.RealVector) openMapRealVector17);
        double double19 = openMapRealVector10.dotProduct(openMapRealVector14);
        int int20 = openMapRealVector10.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean24 = openMapRealVector23.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector25 = openMapRealVector10.append((org.apache.commons.math.linear.RealVector) openMapRealVector23);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector28 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector31 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector32 = openMapRealVector28.projection((org.apache.commons.math.linear.RealVector) openMapRealVector31);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector35 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector38 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector39 = openMapRealVector35.projection((org.apache.commons.math.linear.RealVector) openMapRealVector38);
        double double40 = openMapRealVector31.dotProduct(openMapRealVector35);
        int int41 = openMapRealVector31.getMaxIndex();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor42 = openMapRealVector31.sparseIterator();
        double double43 = openMapRealVector10.dotProduct((org.apache.commons.math.linear.RealVector) openMapRealVector31);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector45 = openMapRealVector31.mapAddToSelf((double) (short) 10);
        double double46 = openMapRealVector45.getNorm();
        double double47 = openMapRealVector45.getLInfNorm();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector50 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector53 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector54 = openMapRealVector50.projection((org.apache.commons.math.linear.RealVector) openMapRealVector53);
        double[] doubleArray55 = openMapRealVector53.toArray();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector57 = openMapRealVector53.append((double) ' ');
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector58 = openMapRealVector45.ebeMultiply((org.apache.commons.math.linear.RealVector) openMapRealVector53);
        double double59 = openMapRealVector3.getDistance(openMapRealVector45);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector7 and openMapRealVector58", openMapRealVector7.equals(openMapRealVector58) ? openMapRealVector7.hashCode() == openMapRealVector58.hashCode() : true);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
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
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector54 = openMapRealVector50.mapAddToSelf((double) (byte) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector56 = openMapRealVector50.mapAdd(0.0d);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on realVector49 and openMapRealVector50.", realVector49.equals(openMapRealVector50) == openMapRealVector50.equals(realVector49));
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
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
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector42 = openMapRealVector26.mapAdd((double) (byte) 0);
        double double43 = openMapRealVector42.getNorm();
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
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector68 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector71 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector72 = openMapRealVector68.projection((org.apache.commons.math.linear.RealVector) openMapRealVector71);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector75 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector78 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector79 = openMapRealVector75.projection((org.apache.commons.math.linear.RealVector) openMapRealVector78);
        double double80 = openMapRealVector71.dotProduct(openMapRealVector75);
        int int81 = openMapRealVector71.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector84 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean85 = openMapRealVector84.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector86 = openMapRealVector71.append((org.apache.commons.math.linear.RealVector) openMapRealVector84);
        double[] doubleArray91 = new double[] { 100.0d, (-1.0d), (-1.0f) };
        openMapRealVector86.setSubVector(99, doubleArray91);
        org.apache.commons.math.linear.RealVector realVector93 = openMapRealVector54.add(doubleArray91);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector94 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray91);
        double[] doubleArray95 = openMapRealVector94.toArray();
        org.apache.commons.math.linear.RealMatrix realMatrix96 = openMapRealVector42.outerProduct(doubleArray95);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on realVector93 and openMapRealVector94.", realVector93.equals(openMapRealVector94) == openMapRealVector94.equals(realVector93));
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
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
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector54 = openMapRealVector50.mapAddToSelf((double) (byte) 0);
        int int55 = openMapRealVector54.getMinIndex();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on realVector49 and openMapRealVector54.", realVector49.equals(openMapRealVector54) == openMapRealVector54.equals(realVector49));
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
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
        double double41 = openMapRealVector40.getLInfNorm();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector44 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector47 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector48 = openMapRealVector44.projection((org.apache.commons.math.linear.RealVector) openMapRealVector47);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector51 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector54 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector55 = openMapRealVector51.projection((org.apache.commons.math.linear.RealVector) openMapRealVector54);
        double double56 = openMapRealVector47.dotProduct(openMapRealVector51);
        int int57 = openMapRealVector47.getMaxIndex();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor58 = openMapRealVector47.sparseIterator();
        org.apache.commons.math.linear.RealVector realVector60 = openMapRealVector47.mapMultiply((double) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector61 = openMapRealVector40.subtract(realVector60);
        java.lang.Double[] doubleArray64 = new java.lang.Double[] { 100.0d, 1.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector66 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray64, (double) (byte) 1);
        int int67 = openMapRealVector66.getDimension();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor68 = openMapRealVector66.sparseIterator();
        java.lang.Double[] doubleArray71 = new java.lang.Double[] { 10.0d, 1.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector72 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray71);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector74 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray71, 134.09325113517085d);
        double double75 = openMapRealVector66.getL1Distance(openMapRealVector74);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector78 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector81 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector82 = openMapRealVector78.projection((org.apache.commons.math.linear.RealVector) openMapRealVector81);
        double[] doubleArray83 = openMapRealVector81.toArray();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector84 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray83);
        org.apache.commons.math.linear.RealVector realVector85 = openMapRealVector74.add(doubleArray83);
        double double86 = openMapRealVector40.dotProduct(doubleArray83);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on realVector85 and openMapRealVector2.", realVector85.equals(openMapRealVector2) == openMapRealVector2.equals(realVector85));
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector((int) '4', 101);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math.linear.OpenMapRealVector(1, (int) ' ', (-1.0d));
        boolean boolean7 = openMapRealVector6.isNaN();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector10 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector13 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector14 = openMapRealVector10.projection((org.apache.commons.math.linear.RealVector) openMapRealVector13);
        org.apache.commons.math.linear.RealVector realVector16 = openMapRealVector13.mapDivideToSelf((double) 1);
        double double17 = openMapRealVector13.getSparsity();
        double[] doubleArray18 = openMapRealVector13.toArray();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = openMapRealVector13.copy();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector22 = new org.apache.commons.math.linear.OpenMapRealVector((int) 'a', (int) (short) 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = openMapRealVector13.append(openMapRealVector22);
        double double24 = openMapRealVector6.getL1Distance(openMapRealVector22);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector27 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector30 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector31 = openMapRealVector27.projection((org.apache.commons.math.linear.RealVector) openMapRealVector30);
        int int32 = openMapRealVector27.getMaxIndex();
        boolean boolean33 = openMapRealVector27.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector36 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean37 = openMapRealVector36.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector38 = openMapRealVector27.subtract((org.apache.commons.math.linear.RealVector) openMapRealVector36);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector41 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector44 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector45 = openMapRealVector41.projection((org.apache.commons.math.linear.RealVector) openMapRealVector44);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector48 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector51 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector52 = openMapRealVector48.projection((org.apache.commons.math.linear.RealVector) openMapRealVector51);
        double double53 = openMapRealVector44.dotProduct(openMapRealVector48);
        int int54 = openMapRealVector44.getMaxIndex();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor55 = openMapRealVector44.sparseIterator();
        org.apache.commons.math.linear.RealVector realVector57 = openMapRealVector44.mapMultiply((double) 0);
        org.apache.commons.math.linear.RealVector realVector59 = openMapRealVector44.mapMultiplyToSelf((double) 99);
        double double60 = openMapRealVector36.getLInfDistance(realVector59);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector61 = new org.apache.commons.math.linear.OpenMapRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector36);
        openMapRealVector61.setEntry((int) (short) 10, (double) '#');
        double[] doubleArray65 = openMapRealVector61.toArray();
        double[] doubleArray66 = openMapRealVector61.getData();
        org.apache.commons.math.linear.RealVector realVector67 = openMapRealVector22.add(doubleArray66);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector68 = openMapRealVector2.append(doubleArray66);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on realVector67 and openMapRealVector61.", realVector67.equals(openMapRealVector61) == openMapRealVector61.equals(realVector67));
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
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
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor25 = openMapRealVector19.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = openMapRealVector19.copy();
        double[] doubleArray27 = openMapRealVector19.toArray();
        org.apache.commons.math.linear.RealVector realVector28 = openMapRealVector2.add(doubleArray27);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector30 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray27, 10.0d);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on realVector28 and openMapRealVector2.", realVector28.equals(openMapRealVector2) == openMapRealVector2.equals(realVector28));
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector2.projection((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector9.projection((org.apache.commons.math.linear.RealVector) openMapRealVector12);
        double double14 = openMapRealVector5.dotProduct(openMapRealVector9);
        int int15 = openMapRealVector5.getMaxIndex();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor16 = openMapRealVector5.sparseIterator();
        boolean boolean17 = openMapRealVector5.isInfinite();
        double[] doubleArray25 = new double[] { 1.0d, (byte) 1, 100.0d, ' ', (short) 10, (-1.0f) };
        openMapRealVector5.setSubVector(0, doubleArray25);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector29 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector34 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector37 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector38 = openMapRealVector34.projection((org.apache.commons.math.linear.RealVector) openMapRealVector37);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector41 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector44 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector45 = openMapRealVector41.projection((org.apache.commons.math.linear.RealVector) openMapRealVector44);
        double double46 = openMapRealVector37.dotProduct(openMapRealVector41);
        int int47 = openMapRealVector37.getMaxIndex();
        org.apache.commons.math.linear.RealVector realVector48 = openMapRealVector29.combineToSelf((double) (byte) -1, (double) '4', (org.apache.commons.math.linear.RealVector) openMapRealVector37);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector51 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        boolean boolean52 = openMapRealVector51.isInfinite();
        double double53 = openMapRealVector37.getDistance((org.apache.commons.math.linear.RealVector) openMapRealVector51);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector56 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector59 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector60 = openMapRealVector56.projection((org.apache.commons.math.linear.RealVector) openMapRealVector59);
        org.apache.commons.math.linear.RealVector realVector62 = openMapRealVector59.mapDivideToSelf((double) 1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector65 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector68 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector69 = openMapRealVector65.projection((org.apache.commons.math.linear.RealVector) openMapRealVector68);
        org.apache.commons.math.linear.RealVector realVector71 = openMapRealVector68.mapDivideToSelf((double) 1);
        double double72 = openMapRealVector68.getSparsity();
        double[] doubleArray73 = openMapRealVector68.toArray();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector74 = openMapRealVector59.subtract(doubleArray73);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector75 = openMapRealVector37.ebeMultiply(doubleArray73);
        org.apache.commons.math.linear.RealVector realVector76 = openMapRealVector5.add(doubleArray73);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector77 = openMapRealVector5.copy();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector80 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector83 = new org.apache.commons.math.linear.OpenMapRealVector(100, 10);
        org.apache.commons.math.linear.RealVector realVector84 = openMapRealVector80.projection((org.apache.commons.math.linear.RealVector) openMapRealVector83);
        double[] doubleArray85 = openMapRealVector83.toArray();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector87 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray85, 10.0d);
        double[] doubleArray88 = openMapRealVector87.getData();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector89 = openMapRealVector77.subtract(doubleArray88);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on realVector76 and openMapRealVector5.", realVector76.equals(openMapRealVector5) == openMapRealVector5.equals(realVector76));
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
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
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector54 = openMapRealVector50.mapAddToSelf((double) (byte) 0);
        double double55 = openMapRealVector50.getLInfNorm();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on realVector49 and openMapRealVector50.", realVector49.equals(openMapRealVector50) == openMapRealVector50.equals(realVector49));
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        java.lang.Double[] doubleArray2 = new java.lang.Double[] { 100.0d, 1.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray2, (double) (byte) 1);
        boolean boolean5 = openMapRealVector4.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector8 = new org.apache.commons.math.linear.OpenMapRealVector((int) 'a', (int) (short) 10);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor9 = openMapRealVector8.sparseIterator();
        double[] doubleArray15 = new double[] { 1.0d, (short) 10, 'a', (byte) 100, 0.0f };
        org.apache.commons.math.linear.RealVector realVector16 = openMapRealVector8.add(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = openMapRealVector4.outerProduct(doubleArray15);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector18 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray15);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray15, (double) 1);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on realVector16 and openMapRealVector18.", realVector16.equals(openMapRealVector18) == openMapRealVector18.equals(realVector16));
    }
}

