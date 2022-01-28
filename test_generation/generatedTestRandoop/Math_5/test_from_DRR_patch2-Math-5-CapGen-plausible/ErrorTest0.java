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
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex3.reciprocal();
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex7 = complex6.exp();
        double double8 = complex6.getArgument();
        org.apache.commons.math3.complex.Complex complex10 = complex6.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex11 = complex6.sin();
        org.apache.commons.math3.complex.Complex complex12 = complex6.cosh();
        org.apache.commons.math3.complex.Complex complex13 = complex6.tan();
        org.apache.commons.math3.complex.Complex complex14 = complex6.tan();
        org.apache.commons.math3.complex.Complex complex15 = complex3.add(complex14);
        org.apache.commons.math3.complex.Complex complex17 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double18 = complex17.getImaginary();
        org.apache.commons.math3.complex.Complex complex19 = complex17.negate();
        org.apache.commons.math3.complex.Complex complex21 = complex19.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex22 = complex14.add(complex21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex4", complex3.equals(complex4) ? complex3.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex3.reciprocal();
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex7 = complex6.exp();
        double double8 = complex6.getArgument();
        org.apache.commons.math3.complex.Complex complex10 = complex6.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex11 = complex6.sin();
        org.apache.commons.math3.complex.Complex complex12 = complex6.cosh();
        org.apache.commons.math3.complex.Complex complex13 = complex6.tan();
        org.apache.commons.math3.complex.Complex complex14 = complex6.tan();
        org.apache.commons.math3.complex.Complex complex15 = complex3.add(complex14);
        org.apache.commons.math3.complex.Complex complex16 = complex14.atan();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex4", complex3.equals(complex4) ? complex3.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex6 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex7 = complex1.conjugate();
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double10 = complex9.getImaginary();
        org.apache.commons.math3.complex.Complex complex11 = complex9.negate();
        org.apache.commons.math3.complex.Complex complex13 = complex11.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex14 = complex1.multiply(complex11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex5 and complex7", complex5.equals(complex7) ? complex5.hashCode() == complex7.hashCode() : true);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex6 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex8 = complex6.pow((-0.0d));
        org.apache.commons.math3.complex.Complex complex9 = complex8.negate();
        org.apache.commons.math3.complex.Complex complex10 = complex9.sinh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex8", complex1.equals(complex8) ? complex1.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex6 = complex1.acos();
        boolean boolean7 = complex1.isInfinite();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex6", complex4.equals(complex6) ? complex4.hashCode() == complex6.hashCode() : true);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex3.reciprocal();
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex7 = complex6.exp();
        double double8 = complex6.getArgument();
        org.apache.commons.math3.complex.Complex complex10 = complex6.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex11 = complex6.sin();
        org.apache.commons.math3.complex.Complex complex12 = complex6.cosh();
        org.apache.commons.math3.complex.Complex complex13 = complex6.tan();
        org.apache.commons.math3.complex.Complex complex14 = complex6.tan();
        org.apache.commons.math3.complex.Complex complex15 = complex3.add(complex14);
        org.apache.commons.math3.complex.Complex complex16 = complex15.sqrt1z();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex4", complex3.equals(complex4) ? complex3.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex6 = complex1.acos();
        org.apache.commons.math3.complex.Complex complex8 = complex1.multiply((double) (short) -1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex6", complex4.equals(complex6) ? complex4.hashCode() == complex6.hashCode() : true);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex4 = complex2.pow((double) (short) 10);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex1 and complex0.", complex1.equals(complex0) == complex0.equals(complex1));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math3.complex.Complex complex8 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex9 = complex8.exp();
        double double10 = complex8.getArgument();
        org.apache.commons.math3.complex.Complex complex12 = complex8.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex13 = complex8.sin();
        org.apache.commons.math3.complex.Complex complex14 = complex8.cosh();
        org.apache.commons.math3.complex.Complex complex16 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double17 = complex16.getImaginary();
        boolean boolean18 = complex14.equals((java.lang.Object) double17);
        org.apache.commons.math3.complex.Complex complex19 = complex14.tanh();
        org.apache.commons.math3.complex.Complex complex20 = complex5.subtract(complex19);
        org.apache.commons.math3.complex.Complex complex22 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex23 = complex22.exp();
        double double24 = complex22.getArgument();
        org.apache.commons.math3.complex.Complex complex25 = complex22.log();
        org.apache.commons.math3.complex.Complex complex26 = complex22.acos();
        org.apache.commons.math3.complex.Complex complex27 = complex20.multiply(complex22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex25 and complex26", complex25.equals(complex26) ? complex25.hashCode() == complex26.hashCode() : true);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.acos();
        org.apache.commons.math3.complex.Complex complex7 = complex1.multiply((double) (short) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex5", complex4.equals(complex5) ? complex4.hashCode() == complex5.hashCode() : true);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex3.reciprocal();
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex7 = complex6.exp();
        double double8 = complex6.getArgument();
        org.apache.commons.math3.complex.Complex complex10 = complex6.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex11 = complex6.sin();
        org.apache.commons.math3.complex.Complex complex12 = complex6.cosh();
        org.apache.commons.math3.complex.Complex complex13 = complex6.tan();
        org.apache.commons.math3.complex.Complex complex14 = complex6.tan();
        org.apache.commons.math3.complex.Complex complex15 = complex3.add(complex14);
        org.apache.commons.math3.complex.Complex complex17 = complex3.multiply((int) '#');
        org.apache.commons.math3.complex.Complex complex19 = complex17.multiply((int) 'a');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex4", complex3.equals(complex4) ? complex3.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex6 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex8 = complex6.pow((-0.0d));
        org.apache.commons.math3.complex.Complex complex9 = complex6.asin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex8", complex1.equals(complex8) ? complex1.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex6 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex8 = complex6.pow((-0.0d));
        org.apache.commons.math3.complex.Complex complex9 = complex8.negate();
        org.apache.commons.math3.complex.Complex complex10 = complex8.sinh();
        org.apache.commons.math3.complex.Complex complex11 = complex10.tan();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex8", complex1.equals(complex8) ? complex1.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex5.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex9 = complex5.negate();
        boolean boolean10 = complex5.isInfinite();
        org.apache.commons.math3.complex.Complex complex12 = complex5.pow((double) (-1.0f));
        org.apache.commons.math3.complex.Complex complex13 = complex5.asin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex12", complex1.equals(complex12) ? complex1.hashCode() == complex12.hashCode() : true);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex6 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex7 = complex1.conjugate();
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex10 = complex9.exp();
        double double11 = complex9.getArgument();
        org.apache.commons.math3.complex.Complex complex13 = complex9.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex14 = complex9.sin();
        org.apache.commons.math3.complex.Complex complex15 = complex9.cosh();
        org.apache.commons.math3.complex.Complex complex16 = complex9.tan();
        org.apache.commons.math3.complex.Complex complex17 = complex9.tan();
        org.apache.commons.math3.complex.Complex complex19 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex20 = complex19.exp();
        double double21 = complex19.getArgument();
        org.apache.commons.math3.complex.Complex complex23 = complex19.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex24 = complex19.sin();
        org.apache.commons.math3.complex.Complex complex25 = complex19.cosh();
        org.apache.commons.math3.complex.Complex complex26 = complex19.tan();
        org.apache.commons.math3.complex.Complex complex27 = complex19.tan();
        org.apache.commons.math3.complex.Complex complex29 = complex19.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex30 = complex17.subtract(complex19);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList32 = complex30.nthRoot((int) '4');
        org.apache.commons.math3.complex.Complex complex33 = complex30.cos();
        org.apache.commons.math3.complex.Complex complex34 = complex30.sin();
        org.apache.commons.math3.complex.Complex complex35 = complex30.atan();
        org.apache.commons.math3.complex.Complex complex36 = complex1.subtract(complex35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex5 and complex7", complex5.equals(complex7) ? complex5.hashCode() == complex7.hashCode() : true);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math3.complex.Complex complex4 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double5 = complex4.getImaginary();
        org.apache.commons.math3.complex.Complex complex7 = complex4.pow((double) 100L);
        org.apache.commons.math3.complex.Complex complex8 = complex2.pow(complex7);
        org.apache.commons.math3.complex.Complex complex10 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex11 = complex10.exp();
        double double12 = complex10.getArgument();
        org.apache.commons.math3.complex.Complex complex13 = complex10.log();
        org.apache.commons.math3.complex.Complex complex14 = complex10.acos();
        org.apache.commons.math3.complex.Complex complex16 = complex14.add((double) 0L);
        org.apache.commons.math3.complex.Complex complex17 = complex2.divide(complex14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex13 and complex16", complex13.equals(complex16) ? complex13.hashCode() == complex16.hashCode() : true);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex3.reciprocal();
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex7 = complex6.exp();
        double double8 = complex6.getArgument();
        org.apache.commons.math3.complex.Complex complex10 = complex6.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex11 = complex6.sin();
        org.apache.commons.math3.complex.Complex complex12 = complex6.cosh();
        org.apache.commons.math3.complex.Complex complex13 = complex6.tan();
        org.apache.commons.math3.complex.Complex complex14 = complex6.tan();
        org.apache.commons.math3.complex.Complex complex15 = complex3.add(complex14);
        org.apache.commons.math3.complex.Complex complex17 = complex3.multiply((int) '#');
        org.apache.commons.math3.complex.Complex complex18 = complex17.exp();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex4", complex3.equals(complex4) ? complex3.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.acos();
        org.apache.commons.math3.complex.Complex complex7 = complex5.add((double) 0L);
        org.apache.commons.math3.complex.Complex complex8 = complex7.conjugate();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex5", complex4.equals(complex5) ? complex4.hashCode() == complex5.hashCode() : true);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex5.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex9 = complex5.negate();
        boolean boolean10 = complex5.isInfinite();
        org.apache.commons.math3.complex.Complex complex12 = complex5.pow((double) (-1.0f));
        org.apache.commons.math3.complex.Complex complex14 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double15 = complex14.getImaginary();
        org.apache.commons.math3.complex.Complex complex16 = complex14.negate();
        org.apache.commons.math3.complex.Complex complex18 = complex16.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex19 = complex18.sqrt1z();
        org.apache.commons.math3.complex.Complex complex20 = complex5.add(complex18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex12", complex1.equals(complex12) ? complex1.hashCode() == complex12.hashCode() : true);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex3.reciprocal();
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex7 = complex6.exp();
        double double8 = complex6.getArgument();
        org.apache.commons.math3.complex.Complex complex10 = complex6.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex11 = complex6.sin();
        org.apache.commons.math3.complex.Complex complex12 = complex6.cosh();
        org.apache.commons.math3.complex.Complex complex13 = complex6.tan();
        org.apache.commons.math3.complex.Complex complex14 = complex6.tan();
        org.apache.commons.math3.complex.Complex complex15 = complex3.add(complex14);
        org.apache.commons.math3.complex.Complex complex17 = complex3.multiply((int) '#');
        org.apache.commons.math3.complex.Complex complex19 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex20 = complex19.exp();
        double double21 = complex19.getArgument();
        org.apache.commons.math3.complex.Complex complex22 = complex19.log();
        org.apache.commons.math3.complex.Complex complex23 = complex19.log();
        org.apache.commons.math3.complex.Complex complex24 = complex17.multiply(complex19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex4", complex3.equals(complex4) ? complex3.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex1 = complex0.exp();
        boolean boolean2 = complex0.isInfinite();
        org.apache.commons.math3.complex.Complex complex3 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex4 = complex3.sqrt1z();
        boolean boolean5 = complex0.equals((java.lang.Object) complex3);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex1 and complex4.", complex1.equals(complex4) == complex4.equals(complex1));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex6 = complex1.acos();
        org.apache.commons.math3.complex.Complex complex7 = complex1.tanh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex6", complex4.equals(complex6) ? complex4.hashCode() == complex6.hashCode() : true);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex3.reciprocal();
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex7 = complex6.exp();
        double double8 = complex6.getArgument();
        org.apache.commons.math3.complex.Complex complex10 = complex6.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex11 = complex6.sin();
        org.apache.commons.math3.complex.Complex complex12 = complex6.cosh();
        org.apache.commons.math3.complex.Complex complex13 = complex6.tan();
        org.apache.commons.math3.complex.Complex complex14 = complex6.tan();
        org.apache.commons.math3.complex.Complex complex15 = complex3.add(complex14);
        boolean boolean17 = complex14.equals((java.lang.Object) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex4", complex3.equals(complex4) ? complex3.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex6 = complex1.acos();
        org.apache.commons.math3.complex.Complex complex8 = complex6.subtract((double) '#');
        org.apache.commons.math3.complex.Complex complex9 = complex8.sin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex6", complex4.equals(complex6) ? complex4.hashCode() == complex6.hashCode() : true);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.sin();
        org.apache.commons.math3.complex.Complex complex8 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex9 = complex8.exp();
        double double10 = complex8.getArgument();
        org.apache.commons.math3.complex.Complex complex11 = complex8.log();
        org.apache.commons.math3.complex.Complex complex12 = complex11.log();
        org.apache.commons.math3.complex.Complex complex13 = complex6.pow(complex12);
        org.apache.commons.math3.complex.Complex complex14 = complex6.cosh();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex13 and complex1.", complex13.equals(complex1) == complex1.equals(complex13));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex5.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex10 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex11 = complex10.exp();
        org.apache.commons.math3.complex.Complex complex12 = complex10.tanh();
        org.apache.commons.math3.complex.Complex complex13 = complex5.subtract(complex10);
        org.apache.commons.math3.complex.Complex complex14 = complex5.asin();
        java.lang.String str15 = complex14.toString();
        org.apache.commons.math3.complex.Complex complex16 = complex14.tanh();
        org.apache.commons.math3.complex.Complex complex18 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double19 = complex18.getImaginary();
        org.apache.commons.math3.complex.Complex complex20 = complex18.negate();
        org.apache.commons.math3.complex.Complex complex21 = complex20.reciprocal();
        org.apache.commons.math3.complex.Complex complex22 = complex16.divide(complex20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex21", complex3.equals(complex21) ? complex3.hashCode() == complex21.hashCode() : true);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex3.reciprocal();
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex7 = complex6.exp();
        double double8 = complex6.getArgument();
        org.apache.commons.math3.complex.Complex complex10 = complex6.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex11 = complex6.sin();
        org.apache.commons.math3.complex.Complex complex12 = complex6.cosh();
        org.apache.commons.math3.complex.Complex complex13 = complex6.tan();
        org.apache.commons.math3.complex.Complex complex14 = complex6.tan();
        org.apache.commons.math3.complex.Complex complex15 = complex3.add(complex14);
        org.apache.commons.math3.complex.Complex complex18 = org.apache.commons.math3.complex.Complex.valueOf((double) (-1.0f), (double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList20 = complex18.nthRoot(100);
        org.apache.commons.math3.complex.Complex complex21 = complex15.pow(complex18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex4", complex3.equals(complex4) ? complex3.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.sin();
        org.apache.commons.math3.complex.Complex complex8 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex9 = complex8.exp();
        double double10 = complex8.getArgument();
        org.apache.commons.math3.complex.Complex complex11 = complex8.log();
        org.apache.commons.math3.complex.Complex complex12 = complex11.log();
        org.apache.commons.math3.complex.Complex complex13 = complex6.pow(complex12);
        org.apache.commons.math3.complex.Complex complex14 = complex12.exp();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex13 and complex1.", complex13.equals(complex1) == complex1.equals(complex13));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex6 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex8 = complex6.pow((-0.0d));
        org.apache.commons.math3.complex.Complex complex9 = complex8.negate();
        org.apache.commons.math3.complex.Complex complex10 = complex9.negate();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex8", complex1.equals(complex8) ? complex1.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex1 = complex0.exp();
        boolean boolean2 = complex0.isInfinite();
        org.apache.commons.math3.complex.Complex complex3 = complex0.conjugate();
        org.apache.commons.math3.complex.Complex complex6 = new org.apache.commons.math3.complex.Complex((double) 10, (double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex8 = complex6.add((double) (byte) 10);
        org.apache.commons.math3.complex.Complex complex9 = complex8.exp();
        org.apache.commons.math3.complex.Complex complex10 = complex8.log();
        org.apache.commons.math3.complex.Complex complex11 = complex3.subtract(complex8);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex1 and complex0.", complex1.equals(complex0) == complex0.equals(complex1));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex7 = complex3.pow((double) 100L);
        org.apache.commons.math3.complex.Complex complex8 = complex3.acos();
        org.apache.commons.math3.complex.Complex complex10 = complex8.pow((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex12 = complex10.pow(0.0d);
        org.apache.commons.math3.complex.Complex complex13 = complex12.reciprocal();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex10", complex1.equals(complex10) ? complex1.hashCode() == complex10.hashCode() : true);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double3 = complex2.getImaginary();
        org.apache.commons.math3.complex.Complex complex4 = complex2.negate();
        org.apache.commons.math3.complex.Complex complex6 = complex4.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex8 = complex4.subtract(complex7);
        org.apache.commons.math3.complex.Complex complex9 = complex4.acos();
        org.apache.commons.math3.complex.Complex complex10 = complex0.subtract(complex4);
        org.apache.commons.math3.complex.Complex complex11 = complex4.atan();
        org.apache.commons.math3.complex.Complex complex13 = complex4.pow((double) 0L);
        org.apache.commons.math3.complex.Complex complex15 = complex4.add((-1.0d));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex13", complex2.equals(complex13) ? complex2.hashCode() == complex13.hashCode() : true);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex3.reciprocal();
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex7 = complex6.exp();
        double double8 = complex6.getArgument();
        org.apache.commons.math3.complex.Complex complex10 = complex6.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex11 = complex6.sin();
        org.apache.commons.math3.complex.Complex complex12 = complex6.cosh();
        org.apache.commons.math3.complex.Complex complex13 = complex6.tan();
        org.apache.commons.math3.complex.Complex complex14 = complex6.tan();
        org.apache.commons.math3.complex.Complex complex15 = complex3.add(complex14);
        double double16 = complex15.getImaginary();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex4", complex3.equals(complex4) ? complex3.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex6 = complex1.divide((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex7 = complex6.tan();
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex10 = complex9.exp();
        double double11 = complex9.getArgument();
        org.apache.commons.math3.complex.Complex complex13 = complex9.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex14 = complex9.sin();
        org.apache.commons.math3.complex.Complex complex15 = complex9.cosh();
        org.apache.commons.math3.complex.Complex complex16 = complex9.tan();
        org.apache.commons.math3.complex.Complex complex17 = complex9.tan();
        org.apache.commons.math3.complex.Complex complex19 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex20 = complex19.exp();
        double double21 = complex19.getArgument();
        org.apache.commons.math3.complex.Complex complex23 = complex19.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex24 = complex19.sin();
        org.apache.commons.math3.complex.Complex complex25 = complex19.cosh();
        org.apache.commons.math3.complex.Complex complex26 = complex19.tan();
        org.apache.commons.math3.complex.Complex complex27 = complex19.tan();
        org.apache.commons.math3.complex.Complex complex29 = complex19.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex30 = complex17.subtract(complex19);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList32 = complex30.nthRoot((int) '4');
        org.apache.commons.math3.complex.Complex complex34 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double35 = complex34.getImaginary();
        org.apache.commons.math3.complex.Complex complex36 = complex30.divide(complex34);
        org.apache.commons.math3.complex.Complex complex37 = complex30.conjugate();
        org.apache.commons.math3.complex.Complex complex38 = complex7.add(complex37);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex38 and complex1.", complex38.equals(complex1) == complex1.equals(complex38));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex1 = complex0.sqrt1z();
        org.apache.commons.math3.complex.Complex complex3 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double4 = complex3.getImaginary();
        org.apache.commons.math3.complex.Complex complex5 = complex3.negate();
        org.apache.commons.math3.complex.Complex complex6 = complex5.sinh();
        org.apache.commons.math3.complex.Complex complex7 = complex6.acos();
        org.apache.commons.math3.complex.Complex complex8 = complex1.divide(complex6);
        org.apache.commons.math3.complex.Complex complex9 = complex8.tan();
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double12 = complex11.getImaginary();
        org.apache.commons.math3.complex.Complex complex13 = complex11.negate();
        org.apache.commons.math3.complex.Complex complex15 = complex13.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex16 = complex13.tanh();
        org.apache.commons.math3.complex.Complex complex17 = complex16.conjugate();
        org.apache.commons.math3.complex.Complex complex18 = complex9.divide(complex16);
        boolean boolean19 = complex16.isNaN();
        org.apache.commons.math3.complex.Complex complex20 = complex16.cos();
        org.apache.commons.math3.complex.Complex complex22 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double23 = complex22.getImaginary();
        org.apache.commons.math3.complex.Complex complex24 = complex22.negate();
        org.apache.commons.math3.complex.Complex complex26 = complex24.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex27 = complex26.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList29 = complex26.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex31 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex32 = complex31.exp();
        org.apache.commons.math3.complex.Complex complex33 = complex31.tanh();
        org.apache.commons.math3.complex.Complex complex34 = complex26.subtract(complex31);
        org.apache.commons.math3.complex.Complex complex35 = complex20.pow(complex26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex16 and complex17", complex16.equals(complex17) ? complex16.hashCode() == complex17.hashCode() : true);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.acos();
        org.apache.commons.math3.complex.Complex complex7 = complex5.add((double) 0L);
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex10 = complex9.exp();
        double double11 = complex9.getArgument();
        org.apache.commons.math3.complex.Complex complex13 = complex9.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex14 = complex9.sin();
        org.apache.commons.math3.complex.Complex complex15 = complex9.cosh();
        org.apache.commons.math3.complex.Complex complex16 = complex9.tan();
        org.apache.commons.math3.complex.Complex complex17 = complex9.tan();
        org.apache.commons.math3.complex.Complex complex19 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex20 = complex19.exp();
        double double21 = complex19.getArgument();
        org.apache.commons.math3.complex.Complex complex23 = complex19.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex24 = complex19.sin();
        org.apache.commons.math3.complex.Complex complex25 = complex19.cosh();
        org.apache.commons.math3.complex.Complex complex26 = complex19.tan();
        org.apache.commons.math3.complex.Complex complex27 = complex19.tan();
        org.apache.commons.math3.complex.Complex complex29 = complex19.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex30 = complex17.subtract(complex19);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList32 = complex30.nthRoot((int) '4');
        org.apache.commons.math3.complex.Complex complex34 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double35 = complex34.getImaginary();
        org.apache.commons.math3.complex.Complex complex36 = complex30.divide(complex34);
        boolean boolean37 = complex5.equals((java.lang.Object) complex30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex7", complex4.equals(complex7) ? complex4.hashCode() == complex7.hashCode() : true);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex3.reciprocal();
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex7 = complex6.exp();
        double double8 = complex6.getArgument();
        org.apache.commons.math3.complex.Complex complex10 = complex6.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex11 = complex6.sin();
        org.apache.commons.math3.complex.Complex complex12 = complex6.cosh();
        org.apache.commons.math3.complex.Complex complex13 = complex6.tan();
        org.apache.commons.math3.complex.Complex complex14 = complex6.tan();
        org.apache.commons.math3.complex.Complex complex15 = complex3.add(complex14);
        org.apache.commons.math3.complex.Complex complex17 = complex3.multiply((int) '#');
        org.apache.commons.math3.complex.Complex complex18 = complex3.acos();
        org.apache.commons.math3.complex.Complex complex20 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex21 = complex20.sqrt();
        org.apache.commons.math3.complex.Complex complex22 = complex20.sqrt();
        org.apache.commons.math3.complex.Complex complex23 = complex20.log();
        org.apache.commons.math3.complex.Complex complex24 = complex18.subtract(complex20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex4", complex3.equals(complex4) ? complex3.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex7 = complex3.subtract(complex6);
        org.apache.commons.math3.complex.Complex complex8 = complex6.cos();
        org.apache.commons.math3.complex.Complex complex9 = complex8.log();
        boolean boolean10 = complex9.isNaN();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex8", complex1.equals(complex8) ? complex1.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex5.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex10 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex11 = complex10.exp();
        org.apache.commons.math3.complex.Complex complex12 = complex10.tanh();
        org.apache.commons.math3.complex.Complex complex13 = complex5.subtract(complex10);
        org.apache.commons.math3.complex.Complex complex14 = complex5.asin();
        java.lang.String str15 = complex14.toString();
        org.apache.commons.math3.complex.Complex complex17 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex18 = complex17.exp();
        double double19 = complex17.getArgument();
        org.apache.commons.math3.complex.Complex complex21 = complex17.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex22 = complex17.sin();
        org.apache.commons.math3.complex.Complex complex23 = complex17.cosh();
        org.apache.commons.math3.complex.Complex complex24 = complex17.tan();
        org.apache.commons.math3.complex.Complex complex25 = complex17.tan();
        org.apache.commons.math3.complex.Complex complex27 = complex17.subtract((double) (short) -1);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList29 = complex17.nthRoot(100);
        org.apache.commons.math3.complex.Complex complex30 = complex17.sinh();
        org.apache.commons.math3.complex.Complex complex31 = complex14.divide(complex17);
        double double32 = complex17.getArgument();
        org.apache.commons.math3.complex.Complex complex34 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex35 = complex34.exp();
        double double36 = complex34.getArgument();
        org.apache.commons.math3.complex.Complex complex37 = complex34.log();
        org.apache.commons.math3.complex.Complex complex38 = complex34.acos();
        org.apache.commons.math3.complex.Complex complex39 = complex38.cos();
        org.apache.commons.math3.complex.Complex complex40 = complex17.add(complex39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex13 and complex38", complex13.equals(complex38) ? complex13.hashCode() == complex38.hashCode() : true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex4.log();
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex8 = complex7.exp();
        double double9 = complex7.getArgument();
        org.apache.commons.math3.complex.Complex complex11 = complex7.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex12 = complex5.pow(complex11);
        org.apache.commons.math3.complex.Complex complex13 = complex11.negate();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex12 and complex1.", complex12.equals(complex1) == complex1.equals(complex12));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.acos();
        org.apache.commons.math3.complex.Complex complex7 = complex5.add((double) 0L);
        org.apache.commons.math3.complex.Complex complex8 = complex7.cosh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex5", complex4.equals(complex5) ? complex4.hashCode() == complex5.hashCode() : true);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex5.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex10 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex11 = complex10.exp();
        org.apache.commons.math3.complex.Complex complex12 = complex10.tanh();
        org.apache.commons.math3.complex.Complex complex13 = complex5.subtract(complex10);
        org.apache.commons.math3.complex.Complex complex15 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex16 = complex15.exp();
        double double17 = complex15.getArgument();
        org.apache.commons.math3.complex.Complex complex19 = complex15.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex20 = complex15.sin();
        org.apache.commons.math3.complex.Complex complex21 = complex15.cosh();
        org.apache.commons.math3.complex.Complex complex22 = complex15.tan();
        org.apache.commons.math3.complex.Complex complex23 = complex15.tan();
        org.apache.commons.math3.complex.Complex complex25 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex26 = complex25.exp();
        double double27 = complex25.getArgument();
        org.apache.commons.math3.complex.Complex complex29 = complex25.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex30 = complex25.sin();
        org.apache.commons.math3.complex.Complex complex31 = complex25.cosh();
        org.apache.commons.math3.complex.Complex complex32 = complex25.tan();
        org.apache.commons.math3.complex.Complex complex33 = complex25.tan();
        org.apache.commons.math3.complex.Complex complex35 = complex25.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex36 = complex23.subtract(complex25);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList38 = complex36.nthRoot((int) '4');
        org.apache.commons.math3.complex.Complex complex39 = complex10.subtract(complex36);
        org.apache.commons.math3.complex.Complex complex40 = complex10.reciprocal();
        org.apache.commons.math3.complex.Complex complex42 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double43 = complex42.getImaginary();
        org.apache.commons.math3.complex.Complex complex44 = complex42.negate();
        org.apache.commons.math3.complex.Complex complex45 = complex44.cosh();
        org.apache.commons.math3.complex.Complex complex46 = complex10.multiply(complex44);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex40", complex1.equals(complex40) ? complex1.hashCode() == complex40.hashCode() : true);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.acos();
        org.apache.commons.math3.complex.Complex complex7 = complex5.add((double) 0L);
        org.apache.commons.math3.complex.Complex complex9 = complex5.pow(0.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex7", complex4.equals(complex7) ? complex4.hashCode() == complex7.hashCode() : true);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex6 = complex1.divide((double) (short) 0);
        boolean boolean7 = complex1.isInfinite();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex6 and complex2.", complex6.equals(complex2) == complex2.equals(complex6));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex7 = complex3.pow((double) 100L);
        org.apache.commons.math3.complex.Complex complex8 = complex3.reciprocal();
        org.apache.commons.math3.complex.Complex complex9 = complex8.sinh();
        org.apache.commons.math3.complex.Complex complex10 = complex9.sqrt();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex8", complex3.equals(complex8) ? complex3.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex4.log();
        org.apache.commons.math3.complex.Complex complex6 = complex4.reciprocal();
        org.apache.commons.math3.complex.Complex complex8 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex9 = complex8.exp();
        org.apache.commons.math3.complex.Complex complex11 = complex9.subtract(2.820679600601607E-23d);
        org.apache.commons.math3.complex.Complex complex12 = complex9.reciprocal();
        org.apache.commons.math3.complex.Complex complex13 = complex4.divide(complex9);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex6 and complex1.", complex6.equals(complex1) == complex1.equals(complex6));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math3.complex.Complex complex4 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double5 = complex4.getImaginary();
        org.apache.commons.math3.complex.Complex complex7 = complex4.pow((double) 100L);
        org.apache.commons.math3.complex.Complex complex8 = complex2.pow(complex7);
        double double9 = complex7.abs();
        org.apache.commons.math3.complex.Complex complex10 = complex7.acos();
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex13 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double14 = complex13.getImaginary();
        org.apache.commons.math3.complex.Complex complex15 = complex13.negate();
        org.apache.commons.math3.complex.Complex complex17 = complex15.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex18 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex19 = complex15.subtract(complex18);
        org.apache.commons.math3.complex.Complex complex20 = complex15.acos();
        org.apache.commons.math3.complex.Complex complex21 = complex11.subtract(complex15);
        org.apache.commons.math3.complex.Complex complex22 = complex15.atan();
        org.apache.commons.math3.complex.Complex complex24 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex25 = complex24.exp();
        double double26 = complex24.getArgument();
        org.apache.commons.math3.complex.Complex complex28 = complex24.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex29 = complex24.exp();
        org.apache.commons.math3.complex.Complex complex32 = new org.apache.commons.math3.complex.Complex((double) (short) -1, (double) '4');
        org.apache.commons.math3.complex.Complex complex33 = complex32.cos();
        org.apache.commons.math3.complex.Complex complex34 = complex29.divide(complex33);
        org.apache.commons.math3.complex.Complex complex35 = complex15.subtract(complex34);
        org.apache.commons.math3.complex.Complex complex36 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex37 = complex36.exp();
        org.apache.commons.math3.complex.Complex complex38 = complex34.multiply(complex37);
        boolean boolean39 = complex7.equals((java.lang.Object) complex38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex10 and complex11", complex10.equals(complex11) ? complex10.hashCode() == complex11.hashCode() : true);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex6 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex8 = complex6.pow((-0.0d));
        org.apache.commons.math3.complex.ComplexField complexField9 = complex6.getField();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex8", complex1.equals(complex8) ? complex1.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) (short) -1, (double) '4');
        org.apache.commons.math3.complex.Complex complex4 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double5 = complex4.getImaginary();
        org.apache.commons.math3.complex.Complex complex6 = complex4.negate();
        org.apache.commons.math3.complex.Complex complex8 = complex6.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex9 = complex8.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList11 = complex8.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex13 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex14 = complex13.exp();
        org.apache.commons.math3.complex.Complex complex15 = complex13.tanh();
        org.apache.commons.math3.complex.Complex complex16 = complex8.subtract(complex13);
        org.apache.commons.math3.complex.Complex complex17 = complex8.asin();
        java.lang.String str18 = complex17.toString();
        org.apache.commons.math3.complex.Complex complex19 = complex17.tanh();
        org.apache.commons.math3.complex.Complex complex20 = complex2.pow(complex17);
        org.apache.commons.math3.complex.Complex complex22 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double23 = complex22.getImaginary();
        org.apache.commons.math3.complex.Complex complex24 = complex22.negate();
        org.apache.commons.math3.complex.Complex complex26 = complex24.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex27 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex28 = complex24.subtract(complex27);
        org.apache.commons.math3.complex.Complex complex29 = complex27.cos();
        org.apache.commons.math3.complex.Complex complex30 = complex29.log();
        org.apache.commons.math3.complex.Complex complex31 = complex2.subtract(complex30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex29", complex4.equals(complex29) ? complex4.hashCode() == complex29.hashCode() : true);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.acos();
        org.apache.commons.math3.complex.Complex complex4 = complex3.reciprocal();
        boolean boolean5 = complex3.isInfinite();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex4 and complex1.", complex4.equals(complex1) == complex1.equals(complex4));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.sin();
        org.apache.commons.math3.complex.Complex complex8 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex9 = complex8.exp();
        double double10 = complex8.getArgument();
        org.apache.commons.math3.complex.Complex complex11 = complex8.log();
        org.apache.commons.math3.complex.Complex complex12 = complex11.log();
        org.apache.commons.math3.complex.Complex complex13 = complex6.pow(complex12);
        org.apache.commons.math3.complex.Complex complex15 = new org.apache.commons.math3.complex.Complex(100.0d);
        org.apache.commons.math3.complex.Complex complex16 = complex6.multiply(complex15);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex13 and complex1.", complex13.equals(complex1) == complex1.equals(complex13));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex6 = complex1.acos();
        org.apache.commons.math3.complex.Complex complex8 = complex6.subtract((double) '#');
        java.lang.String str9 = complex6.toString();
        org.apache.commons.math3.complex.Complex complex11 = new org.apache.commons.math3.complex.Complex((double) 100L);
        org.apache.commons.math3.complex.Complex complex13 = complex11.divide((double) (-1));
        org.apache.commons.math3.complex.Complex complex15 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex16 = complex15.exp();
        double double17 = complex15.getArgument();
        org.apache.commons.math3.complex.Complex complex19 = complex15.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex20 = complex15.sin();
        org.apache.commons.math3.complex.Complex complex21 = complex15.cosh();
        org.apache.commons.math3.complex.Complex complex22 = complex15.tan();
        org.apache.commons.math3.complex.Complex complex23 = complex11.multiply(complex22);
        boolean boolean24 = complex6.equals((java.lang.Object) complex23);
        java.lang.Class<?> wildcardClass25 = complex23.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex6", complex4.equals(complex6) ? complex4.hashCode() == complex6.hashCode() : true);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex7 = complex3.pow((double) 100L);
        org.apache.commons.math3.complex.Complex complex8 = complex3.reciprocal();
        org.apache.commons.math3.complex.Complex complex9 = complex3.tanh();
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double12 = complex11.getImaginary();
        org.apache.commons.math3.complex.Complex complex13 = complex11.negate();
        org.apache.commons.math3.complex.Complex complex14 = complex13.sinh();
        org.apache.commons.math3.complex.Complex complex15 = complex14.acos();
        org.apache.commons.math3.complex.Complex complex17 = complex15.add(2.820679600601607E-23d);
        org.apache.commons.math3.complex.Complex complex18 = complex15.acos();
        org.apache.commons.math3.complex.Complex complex19 = complex9.pow(complex15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex8", complex3.equals(complex8) ? complex3.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.sin();
        org.apache.commons.math3.complex.Complex complex8 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex9 = complex8.exp();
        double double10 = complex8.getArgument();
        org.apache.commons.math3.complex.Complex complex11 = complex8.log();
        org.apache.commons.math3.complex.Complex complex12 = complex11.log();
        org.apache.commons.math3.complex.Complex complex13 = complex6.pow(complex12);
        org.apache.commons.math3.complex.Complex complex14 = complex6.conjugate();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex13 and complex1.", complex13.equals(complex1) == complex1.equals(complex13));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex6 = complex1.acos();
        org.apache.commons.math3.complex.Complex complex8 = complex6.subtract((double) '#');
        java.lang.String str9 = complex6.toString();
        org.apache.commons.math3.complex.Complex complex11 = new org.apache.commons.math3.complex.Complex((double) 100L);
        org.apache.commons.math3.complex.Complex complex13 = complex11.divide((double) (-1));
        org.apache.commons.math3.complex.Complex complex15 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex16 = complex15.exp();
        double double17 = complex15.getArgument();
        org.apache.commons.math3.complex.Complex complex19 = complex15.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex20 = complex15.sin();
        org.apache.commons.math3.complex.Complex complex21 = complex15.cosh();
        org.apache.commons.math3.complex.Complex complex22 = complex15.tan();
        org.apache.commons.math3.complex.Complex complex23 = complex11.multiply(complex22);
        boolean boolean24 = complex6.equals((java.lang.Object) complex23);
        org.apache.commons.math3.complex.Complex complex26 = complex23.pow((double) ' ');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex6", complex4.equals(complex6) ? complex4.hashCode() == complex6.hashCode() : true);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math3.complex.Complex complex4 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double5 = complex4.getImaginary();
        org.apache.commons.math3.complex.Complex complex7 = complex4.pow((double) 100L);
        org.apache.commons.math3.complex.Complex complex8 = complex2.pow(complex7);
        org.apache.commons.math3.complex.Complex complex9 = complex7.cosh();
        org.apache.commons.math3.complex.Complex complex10 = complex9.tanh();
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex12 = complex11.sqrt1z();
        org.apache.commons.math3.complex.Complex complex14 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double15 = complex14.getImaginary();
        org.apache.commons.math3.complex.Complex complex16 = complex14.negate();
        org.apache.commons.math3.complex.Complex complex17 = complex16.sinh();
        org.apache.commons.math3.complex.Complex complex18 = complex17.acos();
        org.apache.commons.math3.complex.Complex complex19 = complex12.divide(complex17);
        org.apache.commons.math3.complex.Complex complex20 = complex19.tan();
        org.apache.commons.math3.complex.Complex complex22 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double23 = complex22.getImaginary();
        org.apache.commons.math3.complex.Complex complex24 = complex22.negate();
        org.apache.commons.math3.complex.Complex complex26 = complex24.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex27 = complex24.tanh();
        org.apache.commons.math3.complex.Complex complex28 = complex27.conjugate();
        org.apache.commons.math3.complex.Complex complex29 = complex20.divide(complex27);
        boolean boolean30 = complex10.equals((java.lang.Object) complex20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex27 and complex28", complex27.equals(complex28) ? complex27.hashCode() == complex28.hashCode() : true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 10, (double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex4 = complex2.add((double) (byte) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex4.pow(1.0d);
        org.apache.commons.math3.complex.Complex complex7 = complex6.sin();
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex10 = complex9.exp();
        double double11 = complex9.getArgument();
        org.apache.commons.math3.complex.Complex complex12 = complex9.log();
        org.apache.commons.math3.complex.Complex complex13 = complex9.log();
        org.apache.commons.math3.complex.Complex complex15 = complex13.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex16 = complex6.multiply(complex13);
        org.apache.commons.math3.complex.Complex complex17 = complex16.cos();
        double double18 = complex16.getArgument();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex9 and complex17", complex9.equals(complex17) ? complex9.hashCode() == complex17.hashCode() : true);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex1 = complex0.sqrt1z();
        org.apache.commons.math3.complex.Complex complex3 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double4 = complex3.getImaginary();
        org.apache.commons.math3.complex.Complex complex5 = complex3.negate();
        org.apache.commons.math3.complex.Complex complex6 = complex5.sinh();
        org.apache.commons.math3.complex.Complex complex7 = complex6.acos();
        org.apache.commons.math3.complex.Complex complex8 = complex1.divide(complex6);
        org.apache.commons.math3.complex.Complex complex9 = complex8.tan();
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double12 = complex11.getImaginary();
        org.apache.commons.math3.complex.Complex complex13 = complex11.negate();
        org.apache.commons.math3.complex.Complex complex15 = complex13.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex16 = complex13.tanh();
        org.apache.commons.math3.complex.Complex complex17 = complex16.conjugate();
        org.apache.commons.math3.complex.Complex complex18 = complex9.divide(complex16);
        org.apache.commons.math3.complex.Complex complex20 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double21 = complex20.getImaginary();
        org.apache.commons.math3.complex.Complex complex22 = complex20.negate();
        org.apache.commons.math3.complex.Complex complex24 = complex22.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex25 = complex24.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList27 = complex24.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex29 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex30 = complex29.exp();
        org.apache.commons.math3.complex.Complex complex31 = complex29.tanh();
        org.apache.commons.math3.complex.Complex complex32 = complex24.subtract(complex29);
        org.apache.commons.math3.complex.Complex complex33 = complex24.cos();
        org.apache.commons.math3.complex.Complex complex34 = complex33.tan();
        org.apache.commons.math3.complex.Complex complex36 = complex34.multiply((double) (short) 1);
        org.apache.commons.math3.complex.Complex complex37 = complex18.divide(complex34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex16 and complex17", complex16.equals(complex17) ? complex16.hashCode() == complex17.hashCode() : true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex6 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex8 = complex6.pow((-0.0d));
        java.lang.String str9 = complex6.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex8", complex1.equals(complex8) ? complex1.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.sqrt();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex3 and complex0.", complex3.equals(complex0) == complex0.equals(complex3));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.sin();
        org.apache.commons.math3.complex.Complex complex7 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex8 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex9 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex11 = complex1.subtract((double) (short) -1);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList13 = complex1.nthRoot(100);
        org.apache.commons.math3.complex.Complex complex14 = complex1.sinh();
        org.apache.commons.math3.complex.Complex complex16 = complex14.subtract((double) 10L);
        org.apache.commons.math3.complex.Complex complex19 = new org.apache.commons.math3.complex.Complex((double) 10, (double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex21 = complex19.add((double) (byte) 10);
        org.apache.commons.math3.complex.Complex complex22 = complex21.sinh();
        org.apache.commons.math3.complex.Complex complex24 = complex22.divide((double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex25 = complex24.tanh();
        org.apache.commons.math3.complex.Complex complex26 = complex16.multiply(complex25);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex26 and complex1.", complex26.equals(complex1) == complex1.equals(complex26));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex1 = complex0.sqrt1z();
        org.apache.commons.math3.complex.Complex complex3 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double4 = complex3.getImaginary();
        org.apache.commons.math3.complex.Complex complex5 = complex3.negate();
        org.apache.commons.math3.complex.Complex complex6 = complex5.sinh();
        org.apache.commons.math3.complex.Complex complex7 = complex6.acos();
        org.apache.commons.math3.complex.Complex complex8 = complex1.divide(complex6);
        org.apache.commons.math3.complex.Complex complex9 = complex8.tan();
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double12 = complex11.getImaginary();
        org.apache.commons.math3.complex.Complex complex13 = complex11.negate();
        org.apache.commons.math3.complex.Complex complex15 = complex13.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex16 = complex13.tanh();
        org.apache.commons.math3.complex.Complex complex17 = complex16.conjugate();
        org.apache.commons.math3.complex.Complex complex18 = complex9.divide(complex16);
        boolean boolean19 = complex16.isNaN();
        org.apache.commons.math3.complex.Complex complex20 = complex16.negate();
        org.apache.commons.math3.complex.Complex complex21 = complex20.atan();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex16 and complex17", complex16.equals(complex17) ? complex16.hashCode() == complex17.hashCode() : true);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex5 = complex1.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex6 = complex1.reciprocal();
        org.apache.commons.math3.complex.Complex complex8 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex9 = complex8.exp();
        org.apache.commons.math3.complex.Complex complex10 = complex8.tan();
        org.apache.commons.math3.complex.Complex complex13 = new org.apache.commons.math3.complex.Complex((double) 10, (double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex15 = complex13.add((double) (byte) 10);
        double double16 = complex15.getImaginary();
        org.apache.commons.math3.complex.Complex complex17 = complex15.tan();
        double double18 = complex15.getImaginary();
        org.apache.commons.math3.complex.Complex complex19 = complex8.add(complex15);
        org.apache.commons.math3.complex.Complex complex21 = complex19.divide((double) (-1.0f));
        org.apache.commons.math3.complex.Complex complex22 = complex1.subtract(complex21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex5 and complex6", complex5.equals(complex6) ? complex5.hashCode() == complex6.hashCode() : true);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex7 = complex3.pow((double) 100L);
        org.apache.commons.math3.complex.Complex complex8 = complex3.acos();
        org.apache.commons.math3.complex.Complex complex10 = complex8.pow((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex12 = complex10.pow(0.0d);
        org.apache.commons.math3.complex.Complex complex14 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex15 = complex14.exp();
        double double16 = complex14.getArgument();
        org.apache.commons.math3.complex.Complex complex18 = complex14.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex19 = complex14.sin();
        org.apache.commons.math3.complex.Complex complex20 = complex14.cosh();
        org.apache.commons.math3.complex.Complex complex21 = complex14.tan();
        org.apache.commons.math3.complex.Complex complex22 = complex14.tan();
        org.apache.commons.math3.complex.Complex complex24 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex25 = complex24.exp();
        double double26 = complex24.getArgument();
        org.apache.commons.math3.complex.Complex complex28 = complex24.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex29 = complex24.sin();
        org.apache.commons.math3.complex.Complex complex30 = complex24.cosh();
        org.apache.commons.math3.complex.Complex complex31 = complex24.tan();
        org.apache.commons.math3.complex.Complex complex32 = complex24.tan();
        org.apache.commons.math3.complex.Complex complex34 = complex24.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex35 = complex22.subtract(complex24);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList37 = complex35.nthRoot((int) '4');
        org.apache.commons.math3.complex.Complex complex38 = complex35.cos();
        org.apache.commons.math3.complex.Complex complex39 = complex35.sin();
        org.apache.commons.math3.complex.Complex complex40 = complex39.cosh();
        org.apache.commons.math3.complex.Complex complex41 = complex40.reciprocal();
        org.apache.commons.math3.complex.Complex complex42 = complex40.acos();
        boolean boolean43 = complex42.isInfinite();
        org.apache.commons.math3.complex.Complex complex44 = complex12.add(complex42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex10", complex1.equals(complex10) ? complex1.hashCode() == complex10.hashCode() : true);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex3 = complex2.exp();
        org.apache.commons.math3.complex.Complex complex4 = complex1.pow(complex2);
        boolean boolean5 = complex2.isNaN();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex3 and complex1.", complex3.equals(complex1) == complex1.equals(complex3));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex3.reciprocal();
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex7 = complex6.exp();
        double double8 = complex6.getArgument();
        org.apache.commons.math3.complex.Complex complex10 = complex6.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex11 = complex6.sin();
        org.apache.commons.math3.complex.Complex complex12 = complex6.cosh();
        org.apache.commons.math3.complex.Complex complex13 = complex6.tan();
        org.apache.commons.math3.complex.Complex complex14 = complex6.tan();
        org.apache.commons.math3.complex.Complex complex15 = complex3.add(complex14);
        org.apache.commons.math3.complex.Complex complex17 = complex3.multiply((int) '#');
        org.apache.commons.math3.complex.Complex complex18 = complex17.tanh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex4", complex3.equals(complex4) ? complex3.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex4.log();
        org.apache.commons.math3.complex.Complex complex6 = complex4.reciprocal();
        org.apache.commons.math3.complex.Complex complex8 = complex4.add(11013.232874703393d);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex6 and complex1.", complex6.equals(complex1) == complex1.equals(complex6));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex6 = complex5.exp();
        double double7 = complex5.getArgument();
        org.apache.commons.math3.complex.Complex complex8 = complex5.log();
        org.apache.commons.math3.complex.Complex complex9 = complex5.log();
        org.apache.commons.math3.complex.Complex complex11 = complex9.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex12 = complex3.subtract(complex11);
        org.apache.commons.math3.complex.Complex complex13 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex14 = complex13.sqrt1z();
        boolean boolean15 = complex12.equals((java.lang.Object) complex14);
        org.apache.commons.math3.complex.ComplexField complexField16 = complex12.getField();
        org.apache.commons.math3.complex.Complex complex18 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex19 = complex18.exp();
        double double20 = complex18.getArgument();
        org.apache.commons.math3.complex.Complex complex22 = complex18.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex23 = complex18.exp();
        org.apache.commons.math3.complex.Complex complex25 = complex23.pow((-0.0d));
        org.apache.commons.math3.complex.Complex complex26 = complex25.negate();
        org.apache.commons.math3.complex.Complex complex27 = complex12.add(complex26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex25", complex1.equals(complex25) ? complex1.hashCode() == complex25.hashCode() : true);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex3.reciprocal();
        org.apache.commons.math3.complex.Complex complex6 = complex4.divide((double) 0L);
        org.apache.commons.math3.complex.Complex complex8 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex9 = complex8.exp();
        double double10 = complex8.getArgument();
        org.apache.commons.math3.complex.Complex complex12 = complex8.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex13 = complex8.sin();
        org.apache.commons.math3.complex.Complex complex14 = complex8.cosh();
        org.apache.commons.math3.complex.Complex complex15 = complex8.tan();
        org.apache.commons.math3.complex.Complex complex16 = complex8.tan();
        org.apache.commons.math3.complex.Complex complex18 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex19 = complex18.exp();
        double double20 = complex18.getArgument();
        org.apache.commons.math3.complex.Complex complex22 = complex18.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex23 = complex18.sin();
        org.apache.commons.math3.complex.Complex complex24 = complex18.cosh();
        org.apache.commons.math3.complex.Complex complex25 = complex18.tan();
        org.apache.commons.math3.complex.Complex complex26 = complex18.tan();
        org.apache.commons.math3.complex.Complex complex28 = complex18.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex29 = complex16.subtract(complex18);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList31 = complex29.nthRoot((int) '4');
        org.apache.commons.math3.complex.Complex complex32 = complex29.cos();
        org.apache.commons.math3.complex.Complex complex33 = complex29.sin();
        org.apache.commons.math3.complex.Complex complex34 = complex33.cosh();
        org.apache.commons.math3.complex.Complex complex35 = complex34.reciprocal();
        org.apache.commons.math3.complex.Complex complex37 = complex35.multiply(10);
        org.apache.commons.math3.complex.Complex complex38 = complex37.log();
        org.apache.commons.math3.complex.Complex complex39 = complex4.multiply(complex38);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex6 and complex1.", complex6.equals(complex1) == complex1.equals(complex6));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.sin();
        org.apache.commons.math3.complex.Complex complex7 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex8 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex9 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex11 = complex1.subtract((double) (short) -1);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList13 = complex1.nthRoot(100);
        org.apache.commons.math3.complex.Complex complex14 = complex1.sinh();
        org.apache.commons.math3.complex.Complex complex16 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex17 = complex16.exp();
        double double18 = complex16.getArgument();
        org.apache.commons.math3.complex.Complex complex19 = complex16.log();
        org.apache.commons.math3.complex.Complex complex20 = complex16.acos();
        org.apache.commons.math3.complex.Complex complex22 = complex20.add((double) 0L);
        org.apache.commons.math3.complex.Complex complex23 = complex1.divide(complex22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex19 and complex20", complex19.equals(complex20) ? complex19.hashCode() == complex20.hashCode() : true);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex(10.0d, (double) 100L);
        org.apache.commons.math3.complex.Complex complex4 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex5 = complex4.sqrt();
        org.apache.commons.math3.complex.Complex complex6 = complex2.multiply(complex5);
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.NaN;
        org.apache.commons.math3.complex.Complex complex9 = complex7.divide(3.141592653589793d);
        org.apache.commons.math3.complex.Complex complex10 = complex6.subtract(complex9);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex10 and complex2.", complex10.equals(complex2) == complex2.equals(complex10));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex6 = complex1.acos();
        org.apache.commons.math3.complex.Complex complex8 = complex6.subtract((double) '#');
        java.lang.String str9 = complex6.toString();
        org.apache.commons.math3.complex.Complex complex11 = new org.apache.commons.math3.complex.Complex((double) 100L);
        org.apache.commons.math3.complex.Complex complex13 = complex11.divide((double) (-1));
        org.apache.commons.math3.complex.Complex complex15 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex16 = complex15.exp();
        double double17 = complex15.getArgument();
        org.apache.commons.math3.complex.Complex complex19 = complex15.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex20 = complex15.sin();
        org.apache.commons.math3.complex.Complex complex21 = complex15.cosh();
        org.apache.commons.math3.complex.Complex complex22 = complex15.tan();
        org.apache.commons.math3.complex.Complex complex23 = complex11.multiply(complex22);
        boolean boolean24 = complex6.equals((java.lang.Object) complex23);
        org.apache.commons.math3.complex.Complex complex26 = complex6.subtract(1.6118410375849543E22d);
        org.apache.commons.math3.complex.Complex complex27 = complex26.sinh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex6", complex4.equals(complex6) ? complex4.hashCode() == complex6.hashCode() : true);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex3 = complex2.exp();
        org.apache.commons.math3.complex.Complex complex4 = complex1.pow(complex2);
        org.apache.commons.math3.complex.Complex complex7 = new org.apache.commons.math3.complex.Complex((double) 10, (double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex9 = complex7.add((double) (byte) 10);
        org.apache.commons.math3.complex.Complex complex11 = complex9.pow(1.0d);
        double double12 = complex11.getArgument();
        org.apache.commons.math3.complex.Complex complex13 = complex4.pow(complex11);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex3 and complex1.", complex3.equals(complex1) == complex1.equals(complex3));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex5.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex10 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex11 = complex10.exp();
        org.apache.commons.math3.complex.Complex complex12 = complex10.tanh();
        org.apache.commons.math3.complex.Complex complex13 = complex5.subtract(complex10);
        org.apache.commons.math3.complex.Complex complex15 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex16 = complex15.exp();
        double double17 = complex15.getArgument();
        org.apache.commons.math3.complex.Complex complex19 = complex15.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex20 = complex15.sin();
        org.apache.commons.math3.complex.Complex complex21 = complex15.cosh();
        org.apache.commons.math3.complex.Complex complex22 = complex15.tan();
        org.apache.commons.math3.complex.Complex complex23 = complex15.tan();
        org.apache.commons.math3.complex.Complex complex25 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex26 = complex25.exp();
        double double27 = complex25.getArgument();
        org.apache.commons.math3.complex.Complex complex29 = complex25.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex30 = complex25.sin();
        org.apache.commons.math3.complex.Complex complex31 = complex25.cosh();
        org.apache.commons.math3.complex.Complex complex32 = complex25.tan();
        org.apache.commons.math3.complex.Complex complex33 = complex25.tan();
        org.apache.commons.math3.complex.Complex complex35 = complex25.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex36 = complex23.subtract(complex25);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList38 = complex36.nthRoot((int) '4');
        org.apache.commons.math3.complex.Complex complex39 = complex10.subtract(complex36);
        boolean boolean40 = complex10.isNaN();
        org.apache.commons.math3.complex.Complex complex42 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double43 = complex42.getImaginary();
        org.apache.commons.math3.complex.Complex complex44 = complex42.negate();
        org.apache.commons.math3.complex.Complex complex46 = complex44.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex47 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex48 = complex44.subtract(complex47);
        org.apache.commons.math3.complex.Complex complex49 = complex44.cosh();
        org.apache.commons.math3.complex.Complex complex50 = complex10.divide(complex49);
        org.apache.commons.math3.complex.Complex complex52 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex53 = complex52.exp();
        double double54 = complex52.getArgument();
        org.apache.commons.math3.complex.Complex complex55 = complex52.log();
        org.apache.commons.math3.complex.Complex complex56 = complex52.log();
        org.apache.commons.math3.complex.Complex complex57 = complex52.sqrt1z();
        org.apache.commons.math3.complex.Complex complex58 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex59 = complex57.add(complex58);
        org.apache.commons.math3.complex.Complex complex61 = complex59.add((double) (byte) 10);
        org.apache.commons.math3.complex.Complex complex63 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double64 = complex63.getImaginary();
        org.apache.commons.math3.complex.Complex complex65 = complex63.negate();
        org.apache.commons.math3.complex.Complex complex67 = complex65.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex69 = complex65.pow((double) 100L);
        org.apache.commons.math3.complex.Complex complex70 = complex65.reciprocal();
        org.apache.commons.math3.complex.Complex complex71 = complex61.add(complex65);
        org.apache.commons.math3.complex.Complex complex72 = complex49.multiply(complex65);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex70", complex3.equals(complex70) ? complex3.hashCode() == complex70.hashCode() : true);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex1 = complex0.sqrt1z();
        org.apache.commons.math3.complex.Complex complex3 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double4 = complex3.getImaginary();
        org.apache.commons.math3.complex.Complex complex5 = complex3.negate();
        org.apache.commons.math3.complex.Complex complex6 = complex5.sinh();
        org.apache.commons.math3.complex.Complex complex7 = complex6.acos();
        org.apache.commons.math3.complex.Complex complex8 = complex1.divide(complex6);
        org.apache.commons.math3.complex.Complex complex10 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex11 = complex10.exp();
        org.apache.commons.math3.complex.Complex complex12 = complex10.acos();
        boolean boolean13 = complex1.equals((java.lang.Object) complex12);
        org.apache.commons.math3.complex.Complex complex15 = complex1.add(1.6118410375849543E22d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex12", complex0.equals(complex12) ? complex0.hashCode() == complex12.hashCode() : true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex2.asin();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex1 and complex0.", complex1.equals(complex0) == complex0.equals(complex1));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double3 = complex2.getImaginary();
        org.apache.commons.math3.complex.Complex complex4 = complex2.negate();
        org.apache.commons.math3.complex.Complex complex6 = complex4.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex8 = complex4.subtract(complex7);
        org.apache.commons.math3.complex.Complex complex9 = complex4.acos();
        org.apache.commons.math3.complex.Complex complex10 = complex0.subtract(complex4);
        org.apache.commons.math3.complex.Complex complex11 = complex4.atan();
        org.apache.commons.math3.complex.Complex complex13 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex14 = complex13.exp();
        double double15 = complex13.getArgument();
        org.apache.commons.math3.complex.Complex complex17 = complex13.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex18 = complex13.exp();
        org.apache.commons.math3.complex.Complex complex21 = new org.apache.commons.math3.complex.Complex((double) (short) -1, (double) '4');
        org.apache.commons.math3.complex.Complex complex22 = complex21.cos();
        org.apache.commons.math3.complex.Complex complex23 = complex18.divide(complex22);
        org.apache.commons.math3.complex.Complex complex24 = complex4.subtract(complex23);
        org.apache.commons.math3.complex.Complex complex25 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex26 = complex25.exp();
        org.apache.commons.math3.complex.Complex complex27 = complex23.multiply(complex26);
        org.apache.commons.math3.complex.Complex complex28 = complex26.log();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex28 and complex0.", complex28.equals(complex0) == complex0.equals(complex28));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 10, (double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex4 = complex2.add((double) (byte) 10);
        org.apache.commons.math3.complex.Complex complex5 = complex4.sinh();
        org.apache.commons.math3.complex.Complex complex7 = complex5.divide((double) (byte) 0);
        boolean boolean8 = complex5.isNaN();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex7 and complex2.", complex7.equals(complex2) == complex2.equals(complex7));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex7 = complex3.pow((double) 100L);
        org.apache.commons.math3.complex.Complex complex8 = complex3.reciprocal();
        org.apache.commons.math3.complex.Complex complex9 = complex8.asin();
        org.apache.commons.math3.complex.Complex complex12 = new org.apache.commons.math3.complex.Complex((double) (short) -1, (double) '4');
        org.apache.commons.math3.complex.Complex complex13 = complex12.cos();
        org.apache.commons.math3.complex.Complex complex15 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex16 = complex15.sqrt();
        org.apache.commons.math3.complex.Complex complex17 = complex15.sqrt();
        org.apache.commons.math3.complex.Complex complex18 = complex17.tanh();
        org.apache.commons.math3.complex.Complex complex19 = complex12.divide(complex17);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList21 = complex17.nthRoot((int) 'a');
        org.apache.commons.math3.complex.Complex complex22 = complex8.divide(complex17);
        org.apache.commons.math3.complex.Complex complex23 = complex22.log();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex8", complex3.equals(complex8) ? complex3.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.sin();
        org.apache.commons.math3.complex.Complex complex7 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex8 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex9 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex12 = complex11.exp();
        double double13 = complex11.getArgument();
        org.apache.commons.math3.complex.Complex complex15 = complex11.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex16 = complex11.sin();
        org.apache.commons.math3.complex.Complex complex17 = complex11.cosh();
        org.apache.commons.math3.complex.Complex complex18 = complex11.tan();
        org.apache.commons.math3.complex.Complex complex19 = complex11.tan();
        org.apache.commons.math3.complex.Complex complex21 = complex11.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex22 = complex9.subtract(complex11);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList24 = complex22.nthRoot((int) '4');
        org.apache.commons.math3.complex.Complex complex26 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double27 = complex26.getImaginary();
        org.apache.commons.math3.complex.Complex complex28 = complex22.divide(complex26);
        org.apache.commons.math3.complex.Complex complex29 = complex22.conjugate();
        org.apache.commons.math3.complex.Complex complex30 = complex22.sqrt1z();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex28 and complex29", complex28.equals(complex29) ? complex28.hashCode() == complex29.hashCode() : true);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex7 = complex3.subtract(complex6);
        org.apache.commons.math3.complex.Complex complex8 = complex6.cos();
        org.apache.commons.math3.complex.ComplexField complexField9 = complex8.getField();
        double double10 = complex8.getImaginary();
        org.apache.commons.math3.complex.Complex complex11 = complex8.cosh();
        double double12 = complex11.abs();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex8", complex1.equals(complex8) ? complex1.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math3.complex.Complex complex3 = complex1.sqrt();
        org.apache.commons.math3.complex.Complex complex4 = complex3.tanh();
        org.apache.commons.math3.complex.Complex complex5 = complex4.acos();
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex8 = complex7.exp();
        org.apache.commons.math3.complex.Complex complex9 = complex7.tan();
        org.apache.commons.math3.complex.Complex complex11 = complex7.pow((-0.0d));
        boolean boolean12 = complex5.equals((java.lang.Object) complex11);
        org.apache.commons.math3.complex.Complex complex13 = complex5.sqrt();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex11", complex1.equals(complex11) ? complex1.hashCode() == complex11.hashCode() : true);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex6 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex8 = complex6.pow((-0.0d));
        org.apache.commons.math3.complex.Complex complex9 = complex8.negate();
        org.apache.commons.math3.complex.Complex complex10 = complex8.sinh();
        org.apache.commons.math3.complex.Complex complex12 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double13 = complex12.getImaginary();
        org.apache.commons.math3.complex.Complex complex14 = complex12.negate();
        org.apache.commons.math3.complex.Complex complex16 = complex14.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex17 = complex16.atan();
        org.apache.commons.math3.complex.Complex complex18 = complex16.atan();
        org.apache.commons.math3.complex.Complex complex19 = complex8.subtract(complex16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex9 and complex14", complex9.equals(complex14) ? complex9.hashCode() == complex14.hashCode() : true);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex6 = complex1.acos();
        org.apache.commons.math3.complex.Complex complex7 = complex6.cosh();
        java.lang.Class<?> wildcardClass8 = complex7.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex6", complex4.equals(complex6) ? complex4.hashCode() == complex6.hashCode() : true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex3.reciprocal();
        org.apache.commons.math3.complex.Complex complex6 = complex4.divide((double) 0L);
        org.apache.commons.math3.complex.Complex complex7 = complex4.sinh();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex6 and complex1.", complex6.equals(complex1) == complex1.equals(complex6));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math3.complex.Complex complex2 = complex0.reciprocal();
        org.apache.commons.math3.complex.Complex complex3 = complex2.log();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex1 and complex0.", complex1.equals(complex0) == complex0.equals(complex1));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex7 = complex3.pow((double) 100L);
        org.apache.commons.math3.complex.Complex complex8 = complex3.acos();
        org.apache.commons.math3.complex.Complex complex10 = complex8.pow((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex12 = complex10.pow(0.0d);
        java.lang.Class<?> wildcardClass13 = complex10.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex12", complex1.equals(complex12) ? complex1.hashCode() == complex12.hashCode() : true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex5.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex9 = complex5.negate();
        org.apache.commons.math3.complex.Complex complex10 = complex5.acos();
        org.apache.commons.math3.complex.Complex complex11 = complex10.cosh();
        org.apache.commons.math3.complex.Complex complex12 = complex10.tan();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex11", complex1.equals(complex11) ? complex1.hashCode() == complex11.hashCode() : true);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex1 = complex0.acos();
        org.apache.commons.math3.complex.Complex complex2 = complex0.conjugate();
        org.apache.commons.math3.complex.Complex complex3 = complex0.sqrt();
        org.apache.commons.math3.complex.Complex complex4 = complex3.conjugate();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex2", complex0.equals(complex2) ? complex0.hashCode() == complex2.hashCode() : true);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex1 = complex0.sqrt1z();
        org.apache.commons.math3.complex.Complex complex3 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double4 = complex3.getImaginary();
        org.apache.commons.math3.complex.Complex complex5 = complex3.negate();
        org.apache.commons.math3.complex.Complex complex6 = complex5.sinh();
        org.apache.commons.math3.complex.Complex complex7 = complex6.acos();
        org.apache.commons.math3.complex.Complex complex8 = complex1.divide(complex6);
        org.apache.commons.math3.complex.Complex complex10 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex11 = complex10.exp();
        org.apache.commons.math3.complex.Complex complex12 = complex10.acos();
        boolean boolean13 = complex1.equals((java.lang.Object) complex12);
        org.apache.commons.math3.complex.Complex complex15 = org.apache.commons.math3.complex.Complex.valueOf((double) 100);
        org.apache.commons.math3.complex.Complex complex18 = org.apache.commons.math3.complex.Complex.valueOf((double) (-1.0f), (double) '#');
        org.apache.commons.math3.complex.Complex complex19 = complex15.subtract(complex18);
        org.apache.commons.math3.complex.Complex complex20 = complex1.pow(complex18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex12", complex0.equals(complex12) ? complex0.hashCode() == complex12.hashCode() : true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex3 and complex0.", complex3.equals(complex0) == complex0.equals(complex3));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex6 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex8 = complex6.pow((-0.0d));
        org.apache.commons.math3.complex.Complex complex9 = complex8.negate();
        org.apache.commons.math3.complex.Complex complex11 = complex9.pow((-1.0d));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex8", complex1.equals(complex8) ? complex1.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math3.complex.Complex complex8 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex9 = complex8.exp();
        double double10 = complex8.getArgument();
        org.apache.commons.math3.complex.Complex complex12 = complex8.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex13 = complex8.sin();
        org.apache.commons.math3.complex.Complex complex14 = complex8.cosh();
        org.apache.commons.math3.complex.Complex complex16 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double17 = complex16.getImaginary();
        boolean boolean18 = complex14.equals((java.lang.Object) double17);
        org.apache.commons.math3.complex.Complex complex19 = complex14.tanh();
        org.apache.commons.math3.complex.Complex complex20 = complex5.subtract(complex19);
        org.apache.commons.math3.complex.Complex complex21 = complex5.conjugate();
        org.apache.commons.math3.complex.Complex complex23 = complex5.pow(1.6118410375849543E22d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex21", complex1.equals(complex21) ? complex1.hashCode() == complex21.hashCode() : true);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.sin();
        org.apache.commons.math3.complex.Complex complex7 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex8 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex9 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex11 = complex1.subtract((double) (short) -1);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList13 = complex1.nthRoot(100);
        org.apache.commons.math3.complex.Complex complex14 = complex1.sinh();
        org.apache.commons.math3.complex.Complex complex16 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double17 = complex16.getImaginary();
        org.apache.commons.math3.complex.Complex complex18 = complex16.negate();
        org.apache.commons.math3.complex.Complex complex20 = complex18.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex21 = complex20.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList23 = complex20.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex25 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex26 = complex25.exp();
        org.apache.commons.math3.complex.Complex complex27 = complex25.tanh();
        org.apache.commons.math3.complex.Complex complex28 = complex20.subtract(complex25);
        org.apache.commons.math3.complex.Complex complex29 = complex20.asin();
        java.lang.String str30 = complex29.toString();
        org.apache.commons.math3.complex.Complex complex32 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex33 = complex32.exp();
        double double34 = complex32.getArgument();
        org.apache.commons.math3.complex.Complex complex36 = complex32.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex37 = complex32.sin();
        org.apache.commons.math3.complex.Complex complex38 = complex32.cosh();
        org.apache.commons.math3.complex.Complex complex39 = complex32.tan();
        org.apache.commons.math3.complex.Complex complex40 = complex32.tan();
        org.apache.commons.math3.complex.Complex complex42 = complex32.subtract((double) (short) -1);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList44 = complex32.nthRoot(100);
        org.apache.commons.math3.complex.Complex complex45 = complex32.sinh();
        org.apache.commons.math3.complex.Complex complex46 = complex29.divide(complex32);
        org.apache.commons.math3.complex.Complex complex47 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex48 = complex47.sqrt1z();
        org.apache.commons.math3.complex.Complex complex49 = complex47.sqrt();
        org.apache.commons.math3.complex.Complex complex50 = complex46.pow(complex47);
        org.apache.commons.math3.complex.Complex complex51 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex52 = complex51.sqrt1z();
        org.apache.commons.math3.complex.Complex complex54 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double55 = complex54.getImaginary();
        org.apache.commons.math3.complex.Complex complex56 = complex54.negate();
        org.apache.commons.math3.complex.Complex complex57 = complex56.sinh();
        org.apache.commons.math3.complex.Complex complex58 = complex57.acos();
        org.apache.commons.math3.complex.Complex complex59 = complex52.divide(complex57);
        org.apache.commons.math3.complex.Complex complex60 = complex59.tan();
        org.apache.commons.math3.complex.Complex complex61 = complex60.tan();
        org.apache.commons.math3.complex.Complex complex62 = complex47.multiply(complex60);
        org.apache.commons.math3.complex.Complex complex63 = complex14.multiply(complex47);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex28 and complex62", complex28.equals(complex62) ? complex28.hashCode() == complex62.hashCode() : true);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex6 = complex1.acos();
        org.apache.commons.math3.complex.Complex complex7 = complex6.cosh();
        org.apache.commons.math3.complex.Complex complex8 = complex6.asin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex7", complex1.equals(complex7) ? complex1.hashCode() == complex7.hashCode() : true);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex5.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex10 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex11 = complex10.exp();
        org.apache.commons.math3.complex.Complex complex12 = complex10.tanh();
        org.apache.commons.math3.complex.Complex complex13 = complex5.subtract(complex10);
        org.apache.commons.math3.complex.Complex complex14 = complex5.asin();
        java.lang.String str15 = complex14.toString();
        org.apache.commons.math3.complex.Complex complex17 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex18 = complex17.exp();
        double double19 = complex17.getArgument();
        org.apache.commons.math3.complex.Complex complex21 = complex17.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex22 = complex17.sin();
        org.apache.commons.math3.complex.Complex complex23 = complex17.cosh();
        org.apache.commons.math3.complex.Complex complex24 = complex17.tan();
        org.apache.commons.math3.complex.Complex complex25 = complex17.tan();
        org.apache.commons.math3.complex.Complex complex27 = complex17.subtract((double) (short) -1);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList29 = complex17.nthRoot(100);
        org.apache.commons.math3.complex.Complex complex30 = complex17.sinh();
        org.apache.commons.math3.complex.Complex complex31 = complex14.divide(complex17);
        org.apache.commons.math3.complex.Complex complex32 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex33 = complex32.sqrt1z();
        org.apache.commons.math3.complex.Complex complex34 = complex32.sqrt();
        org.apache.commons.math3.complex.Complex complex35 = complex31.pow(complex32);
        org.apache.commons.math3.complex.Complex complex36 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex37 = complex36.sqrt1z();
        org.apache.commons.math3.complex.Complex complex39 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double40 = complex39.getImaginary();
        org.apache.commons.math3.complex.Complex complex41 = complex39.negate();
        org.apache.commons.math3.complex.Complex complex42 = complex41.sinh();
        org.apache.commons.math3.complex.Complex complex43 = complex42.acos();
        org.apache.commons.math3.complex.Complex complex44 = complex37.divide(complex42);
        org.apache.commons.math3.complex.Complex complex45 = complex44.tan();
        org.apache.commons.math3.complex.Complex complex46 = complex45.tan();
        org.apache.commons.math3.complex.Complex complex47 = complex32.multiply(complex45);
        org.apache.commons.math3.complex.Complex complex48 = complex32.negate();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex13 and complex47", complex13.equals(complex47) ? complex13.hashCode() == complex47.hashCode() : true);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex((double) 0.0f);
        boolean boolean2 = complex1.isInfinite();
        org.apache.commons.math3.complex.Complex complex4 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double5 = complex4.getImaginary();
        org.apache.commons.math3.complex.Complex complex6 = complex4.negate();
        org.apache.commons.math3.complex.Complex complex8 = complex6.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex9 = complex6.tanh();
        org.apache.commons.math3.complex.Complex complex10 = complex9.conjugate();
        org.apache.commons.math3.complex.Complex complex11 = complex1.divide(complex9);
        org.apache.commons.math3.complex.Complex complex12 = complex1.tan();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex9 and complex10", complex9.equals(complex10) ? complex9.hashCode() == complex10.hashCode() : true);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex5.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex10 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex11 = complex10.exp();
        org.apache.commons.math3.complex.Complex complex12 = complex10.tanh();
        org.apache.commons.math3.complex.Complex complex13 = complex5.subtract(complex10);
        org.apache.commons.math3.complex.Complex complex14 = complex5.asin();
        java.lang.String str15 = complex14.toString();
        org.apache.commons.math3.complex.Complex complex17 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex18 = complex17.exp();
        double double19 = complex17.getArgument();
        org.apache.commons.math3.complex.Complex complex21 = complex17.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex22 = complex17.sin();
        org.apache.commons.math3.complex.Complex complex23 = complex17.cosh();
        org.apache.commons.math3.complex.Complex complex24 = complex17.tan();
        org.apache.commons.math3.complex.Complex complex25 = complex17.tan();
        org.apache.commons.math3.complex.Complex complex27 = complex17.subtract((double) (short) -1);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList29 = complex17.nthRoot(100);
        org.apache.commons.math3.complex.Complex complex30 = complex17.sinh();
        org.apache.commons.math3.complex.Complex complex31 = complex14.divide(complex17);
        org.apache.commons.math3.complex.Complex complex32 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex33 = complex32.sqrt1z();
        org.apache.commons.math3.complex.Complex complex34 = complex32.sqrt();
        org.apache.commons.math3.complex.Complex complex35 = complex31.pow(complex32);
        org.apache.commons.math3.complex.Complex complex36 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex37 = complex36.sqrt1z();
        org.apache.commons.math3.complex.Complex complex39 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double40 = complex39.getImaginary();
        org.apache.commons.math3.complex.Complex complex41 = complex39.negate();
        org.apache.commons.math3.complex.Complex complex42 = complex41.sinh();
        org.apache.commons.math3.complex.Complex complex43 = complex42.acos();
        org.apache.commons.math3.complex.Complex complex44 = complex37.divide(complex42);
        org.apache.commons.math3.complex.Complex complex45 = complex44.tan();
        org.apache.commons.math3.complex.Complex complex46 = complex45.tan();
        org.apache.commons.math3.complex.Complex complex47 = complex32.multiply(complex45);
        double double48 = complex32.getArgument();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex13 and complex47", complex13.equals(complex47) ? complex13.hashCode() == complex47.hashCode() : true);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex3.reciprocal();
        org.apache.commons.math3.complex.Complex complex6 = complex3.divide(100.0d);
        org.apache.commons.math3.complex.Complex complex7 = complex6.sin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex4", complex3.equals(complex4) ? complex3.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex6 = complex1.acos();
        org.apache.commons.math3.complex.Complex complex8 = complex6.subtract((double) '#');
        java.lang.String str9 = complex6.toString();
        org.apache.commons.math3.complex.Complex complex11 = new org.apache.commons.math3.complex.Complex((double) 100L);
        org.apache.commons.math3.complex.Complex complex13 = complex11.divide((double) (-1));
        org.apache.commons.math3.complex.Complex complex15 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex16 = complex15.exp();
        double double17 = complex15.getArgument();
        org.apache.commons.math3.complex.Complex complex19 = complex15.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex20 = complex15.sin();
        org.apache.commons.math3.complex.Complex complex21 = complex15.cosh();
        org.apache.commons.math3.complex.Complex complex22 = complex15.tan();
        org.apache.commons.math3.complex.Complex complex23 = complex11.multiply(complex22);
        boolean boolean24 = complex6.equals((java.lang.Object) complex23);
        org.apache.commons.math3.complex.Complex complex26 = complex6.multiply((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex27 = complex6.cosh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex26", complex4.equals(complex26) ? complex4.hashCode() == complex26.hashCode() : true);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((-0.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex1.asin();
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex8 = complex7.sqrt1z();
        org.apache.commons.math3.complex.Complex complex9 = complex8.asin();
        boolean boolean10 = complex8.isNaN();
        org.apache.commons.math3.complex.Complex complex11 = complex1.pow(complex8);
        double double12 = complex11.getArgument();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex5", complex1.equals(complex5) ? complex1.hashCode() == complex5.hashCode() : true);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex1 = complex0.sqrt1z();
        org.apache.commons.math3.complex.Complex complex3 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double4 = complex3.getImaginary();
        org.apache.commons.math3.complex.Complex complex5 = complex3.negate();
        org.apache.commons.math3.complex.Complex complex6 = complex5.sinh();
        org.apache.commons.math3.complex.Complex complex7 = complex6.acos();
        org.apache.commons.math3.complex.Complex complex8 = complex1.divide(complex6);
        org.apache.commons.math3.complex.Complex complex9 = complex8.tan();
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double12 = complex11.getImaginary();
        org.apache.commons.math3.complex.Complex complex13 = complex11.negate();
        org.apache.commons.math3.complex.Complex complex15 = complex13.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex16 = complex13.tanh();
        org.apache.commons.math3.complex.Complex complex17 = complex16.conjugate();
        org.apache.commons.math3.complex.Complex complex18 = complex9.divide(complex16);
        org.apache.commons.math3.complex.Complex complex19 = complex9.negate();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex16 and complex17", complex16.equals(complex17) ? complex16.hashCode() == complex17.hashCode() : true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.acos();
        org.apache.commons.math3.complex.Complex complex6 = complex5.cos();
        org.apache.commons.math3.complex.Complex complex7 = complex6.cosh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex5", complex4.equals(complex5) ? complex4.hashCode() == complex5.hashCode() : true);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.acos();
        org.apache.commons.math3.complex.Complex complex6 = complex5.cos();
        boolean boolean7 = complex6.isInfinite();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex5", complex4.equals(complex5) ? complex4.hashCode() == complex5.hashCode() : true);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) (byte) 100, 0.0d);
        org.apache.commons.math3.complex.Complex complex3 = complex2.sqrt();
        org.apache.commons.math3.complex.Complex complex4 = complex2.log();
        org.apache.commons.math3.complex.Complex complex6 = complex4.multiply((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex8 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double9 = complex8.getImaginary();
        org.apache.commons.math3.complex.Complex complex10 = complex8.negate();
        org.apache.commons.math3.complex.Complex complex12 = complex10.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex14 = complex10.pow((double) 100L);
        org.apache.commons.math3.complex.Complex complex15 = complex14.sin();
        double double16 = complex14.abs();
        org.apache.commons.math3.complex.Complex complex17 = complex14.atan();
        org.apache.commons.math3.complex.Complex complex19 = complex17.pow(1.0349512282932293E22d);
        org.apache.commons.math3.complex.Complex complex20 = complex6.divide(complex17);
        org.apache.commons.math3.complex.Complex complex21 = complex6.sin();
        org.apache.commons.math3.complex.Complex complex22 = complex6.log();
        org.apache.commons.math3.complex.Complex complex23 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex24 = complex23.exp();
        org.apache.commons.math3.complex.Complex complex25 = complex24.exp();
        org.apache.commons.math3.complex.Complex complex26 = complex6.add(complex25);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex24 and complex2.", complex24.equals(complex2) == complex2.equals(complex24));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex3.reciprocal();
        org.apache.commons.math3.complex.Complex complex6 = complex4.divide((double) 0L);
        boolean boolean7 = complex6.isInfinite();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex4", complex3.equals(complex4) ? complex3.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double3 = complex2.getImaginary();
        org.apache.commons.math3.complex.Complex complex4 = complex2.negate();
        org.apache.commons.math3.complex.Complex complex6 = complex4.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex8 = complex4.subtract(complex7);
        org.apache.commons.math3.complex.Complex complex9 = complex4.acos();
        org.apache.commons.math3.complex.Complex complex10 = complex0.subtract(complex4);
        org.apache.commons.math3.complex.Complex complex11 = complex4.atan();
        org.apache.commons.math3.complex.Complex complex13 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex14 = complex13.exp();
        double double15 = complex13.getArgument();
        org.apache.commons.math3.complex.Complex complex17 = complex13.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex18 = complex13.exp();
        org.apache.commons.math3.complex.Complex complex21 = new org.apache.commons.math3.complex.Complex((double) (short) -1, (double) '4');
        org.apache.commons.math3.complex.Complex complex22 = complex21.cos();
        org.apache.commons.math3.complex.Complex complex23 = complex18.divide(complex22);
        org.apache.commons.math3.complex.Complex complex24 = complex4.subtract(complex23);
        org.apache.commons.math3.complex.Complex complex25 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex26 = complex25.exp();
        org.apache.commons.math3.complex.Complex complex27 = complex23.multiply(complex26);
        org.apache.commons.math3.complex.Complex complex28 = complex26.exp();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex28 and complex0.", complex28.equals(complex0) == complex0.equals(complex28));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.acos();
        org.apache.commons.math3.complex.Complex complex7 = complex5.add((double) 0L);
        org.apache.commons.math3.complex.Complex complex8 = complex5.sqrt();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex7", complex4.equals(complex7) ? complex4.hashCode() == complex7.hashCode() : true);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 10, (double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex4 = complex2.add((double) (byte) 10);
        org.apache.commons.math3.complex.Complex complex5 = complex4.sinh();
        org.apache.commons.math3.complex.Complex complex7 = complex5.divide((double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex8 = complex7.tanh();
        org.apache.commons.math3.complex.Complex complex10 = complex8.multiply((double) 10.0f);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex10 and complex2.", complex10.equals(complex2) == complex2.equals(complex10));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex7 = complex5.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex8 = complex5.tan();
        org.apache.commons.math3.complex.Complex complex9 = complex5.asin();
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex12 = complex11.exp();
        double double13 = complex11.getArgument();
        org.apache.commons.math3.complex.Complex complex15 = complex11.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex16 = complex11.sin();
        org.apache.commons.math3.complex.Complex complex17 = complex11.cosh();
        org.apache.commons.math3.complex.Complex complex18 = complex11.tan();
        org.apache.commons.math3.complex.Complex complex19 = complex11.tan();
        org.apache.commons.math3.complex.Complex complex21 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex22 = complex21.exp();
        double double23 = complex21.getArgument();
        org.apache.commons.math3.complex.Complex complex25 = complex21.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex26 = complex21.sin();
        org.apache.commons.math3.complex.Complex complex27 = complex21.cosh();
        org.apache.commons.math3.complex.Complex complex28 = complex21.tan();
        org.apache.commons.math3.complex.Complex complex29 = complex21.tan();
        org.apache.commons.math3.complex.Complex complex31 = complex21.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex32 = complex19.subtract(complex21);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList34 = complex32.nthRoot((int) '4');
        org.apache.commons.math3.complex.Complex complex36 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double37 = complex36.getImaginary();
        org.apache.commons.math3.complex.Complex complex38 = complex32.divide(complex36);
        org.apache.commons.math3.complex.Complex complex39 = complex32.conjugate();
        boolean boolean40 = complex9.equals((java.lang.Object) complex32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex38 and complex39", complex38.equals(complex39) ? complex38.hashCode() == complex39.hashCode() : true);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex3.reciprocal();
        boolean boolean5 = complex4.isNaN();
        org.apache.commons.math3.complex.Complex complex6 = complex4.negate();
        org.apache.commons.math3.complex.Complex complex7 = complex4.reciprocal();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex6", complex1.equals(complex6) ? complex1.hashCode() == complex6.hashCode() : true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex3.reciprocal();
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex7 = complex6.exp();
        double double8 = complex6.getArgument();
        org.apache.commons.math3.complex.Complex complex10 = complex6.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex11 = complex6.sin();
        org.apache.commons.math3.complex.Complex complex12 = complex6.cosh();
        org.apache.commons.math3.complex.Complex complex13 = complex6.tan();
        org.apache.commons.math3.complex.Complex complex14 = complex6.tan();
        org.apache.commons.math3.complex.Complex complex15 = complex3.add(complex14);
        boolean boolean16 = complex15.isNaN();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex4", complex3.equals(complex4) ? complex3.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double3 = complex2.getImaginary();
        org.apache.commons.math3.complex.Complex complex4 = complex2.negate();
        org.apache.commons.math3.complex.Complex complex6 = complex4.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex8 = complex4.subtract(complex7);
        org.apache.commons.math3.complex.Complex complex9 = complex4.acos();
        org.apache.commons.math3.complex.Complex complex10 = complex0.subtract(complex4);
        org.apache.commons.math3.complex.Complex complex11 = complex4.atan();
        org.apache.commons.math3.complex.Complex complex13 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex14 = complex13.exp();
        double double15 = complex13.getArgument();
        org.apache.commons.math3.complex.Complex complex17 = complex13.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex18 = complex13.exp();
        org.apache.commons.math3.complex.Complex complex21 = new org.apache.commons.math3.complex.Complex((double) (short) -1, (double) '4');
        org.apache.commons.math3.complex.Complex complex22 = complex21.cos();
        org.apache.commons.math3.complex.Complex complex23 = complex18.divide(complex22);
        org.apache.commons.math3.complex.Complex complex24 = complex4.subtract(complex23);
        org.apache.commons.math3.complex.Complex complex25 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex26 = complex25.exp();
        org.apache.commons.math3.complex.Complex complex27 = complex23.multiply(complex26);
        java.lang.Class<?> wildcardClass28 = complex23.getClass();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex26 and complex0.", complex26.equals(complex0) == complex0.equals(complex26));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex7 = complex3.pow((double) 100L);
        org.apache.commons.math3.complex.Complex complex8 = complex3.reciprocal();
        org.apache.commons.math3.complex.Complex complex9 = complex8.asin();
        org.apache.commons.math3.complex.Complex complex12 = new org.apache.commons.math3.complex.Complex((double) (short) -1, (double) '4');
        org.apache.commons.math3.complex.Complex complex13 = complex12.cos();
        org.apache.commons.math3.complex.Complex complex15 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex16 = complex15.sqrt();
        org.apache.commons.math3.complex.Complex complex17 = complex15.sqrt();
        org.apache.commons.math3.complex.Complex complex18 = complex17.tanh();
        org.apache.commons.math3.complex.Complex complex19 = complex12.divide(complex17);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList21 = complex17.nthRoot((int) 'a');
        org.apache.commons.math3.complex.Complex complex22 = complex8.divide(complex17);
        org.apache.commons.math3.complex.Complex complex24 = complex8.subtract((-3.141592653589793d));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex22", complex3.equals(complex22) ? complex3.hashCode() == complex22.hashCode() : true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex6 = complex1.divide((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex7 = complex1.tan();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex6 and complex2.", complex6.equals(complex2) == complex2.equals(complex6));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex3 = complex2.exp();
        org.apache.commons.math3.complex.Complex complex4 = complex1.pow(complex2);
        boolean boolean5 = complex2.isInfinite();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex3 and complex1.", complex3.equals(complex1) == complex1.equals(complex3));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.acos();
        org.apache.commons.math3.complex.Complex complex6 = complex5.cos();
        java.lang.Class<?> wildcardClass7 = complex6.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex5", complex4.equals(complex5) ? complex4.hashCode() == complex5.hashCode() : true);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 10, (double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex4 = complex2.add((double) (byte) 10);
        org.apache.commons.math3.complex.Complex complex5 = complex4.sinh();
        org.apache.commons.math3.complex.Complex complex7 = complex5.divide((double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex8 = complex7.tanh();
        org.apache.commons.math3.complex.ComplexField complexField9 = complex7.getField();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex7 and complex2.", complex7.equals(complex2) == complex2.equals(complex7));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 10, (double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex4 = complex2.add((double) (byte) 10);
        org.apache.commons.math3.complex.Complex complex5 = complex4.sinh();
        org.apache.commons.math3.complex.Complex complex7 = complex5.divide((double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex8 = complex7.tanh();
        org.apache.commons.math3.complex.Complex complex9 = complex7.conjugate();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex9 and complex2.", complex9.equals(complex2) == complex2.equals(complex9));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex5.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex10 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex11 = complex10.exp();
        org.apache.commons.math3.complex.Complex complex12 = complex10.tanh();
        org.apache.commons.math3.complex.Complex complex13 = complex5.subtract(complex10);
        org.apache.commons.math3.complex.Complex complex14 = complex5.cos();
        org.apache.commons.math3.complex.Complex complex15 = complex14.tan();
        org.apache.commons.math3.complex.Complex complex17 = complex15.multiply((double) (short) 1);
        boolean boolean18 = complex17.isInfinite();
        org.apache.commons.math3.complex.Complex complex19 = complex17.atan();
        org.apache.commons.math3.complex.Complex complex20 = complex19.negate();
        org.apache.commons.math3.complex.Complex complex22 = new org.apache.commons.math3.complex.Complex((double) 1.0f);
        boolean boolean23 = complex22.isNaN();
        org.apache.commons.math3.complex.Complex complex24 = complex22.sqrt();
        org.apache.commons.math3.complex.Complex complex25 = complex20.add(complex22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex14 and complex19", complex14.equals(complex19) ? complex14.hashCode() == complex19.hashCode() : true);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex5.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex9 = complex5.negate();
        org.apache.commons.math3.complex.Complex complex10 = complex5.acos();
        org.apache.commons.math3.complex.Complex complex11 = complex10.exp();
        org.apache.commons.math3.complex.Complex complex12 = complex10.sin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex11", complex1.equals(complex11) ? complex1.hashCode() == complex11.hashCode() : true);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex3 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double4 = complex3.getImaginary();
        org.apache.commons.math3.complex.Complex complex5 = complex3.negate();
        org.apache.commons.math3.complex.Complex complex7 = complex5.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex8 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex9 = complex5.subtract(complex8);
        org.apache.commons.math3.complex.Complex complex10 = complex8.sqrt();
        boolean boolean11 = complex1.equals((java.lang.Object) complex8);
        org.apache.commons.math3.complex.Complex complex12 = complex8.reciprocal();
        double double13 = complex8.getImaginary();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex12 and complex1.", complex12.equals(complex1) == complex1.equals(complex12));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex5.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex10 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex11 = complex10.exp();
        org.apache.commons.math3.complex.Complex complex12 = complex10.tanh();
        org.apache.commons.math3.complex.Complex complex13 = complex5.subtract(complex10);
        org.apache.commons.math3.complex.Complex complex15 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex16 = complex15.exp();
        double double17 = complex15.getArgument();
        org.apache.commons.math3.complex.Complex complex19 = complex15.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex20 = complex15.sin();
        org.apache.commons.math3.complex.Complex complex21 = complex15.cosh();
        org.apache.commons.math3.complex.Complex complex22 = complex15.tan();
        org.apache.commons.math3.complex.Complex complex23 = complex15.tan();
        org.apache.commons.math3.complex.Complex complex25 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex26 = complex25.exp();
        double double27 = complex25.getArgument();
        org.apache.commons.math3.complex.Complex complex29 = complex25.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex30 = complex25.sin();
        org.apache.commons.math3.complex.Complex complex31 = complex25.cosh();
        org.apache.commons.math3.complex.Complex complex32 = complex25.tan();
        org.apache.commons.math3.complex.Complex complex33 = complex25.tan();
        org.apache.commons.math3.complex.Complex complex35 = complex25.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex36 = complex23.subtract(complex25);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList38 = complex36.nthRoot((int) '4');
        org.apache.commons.math3.complex.Complex complex39 = complex10.subtract(complex36);
        org.apache.commons.math3.complex.Complex complex40 = complex10.reciprocal();
        org.apache.commons.math3.complex.Complex complex43 = new org.apache.commons.math3.complex.Complex((double) 'a', 0.0d);
        org.apache.commons.math3.complex.Complex complex44 = complex43.negate();
        org.apache.commons.math3.complex.Complex complex45 = complex43.sqrt1z();
        org.apache.commons.math3.complex.Complex complex46 = complex40.add(complex45);
        org.apache.commons.math3.complex.Complex complex48 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex49 = complex48.exp();
        double double50 = complex48.getArgument();
        org.apache.commons.math3.complex.Complex complex51 = complex48.log();
        org.apache.commons.math3.complex.Complex complex52 = complex48.log();
        org.apache.commons.math3.complex.Complex complex53 = complex48.sqrt1z();
        org.apache.commons.math3.complex.Complex complex54 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex55 = complex53.add(complex54);
        boolean boolean56 = complex46.equals((java.lang.Object) complex53);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex40", complex1.equals(complex40) ? complex1.hashCode() == complex40.hashCode() : true);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex5.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex10 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex11 = complex10.exp();
        org.apache.commons.math3.complex.Complex complex12 = complex10.tanh();
        org.apache.commons.math3.complex.Complex complex13 = complex5.subtract(complex10);
        org.apache.commons.math3.complex.Complex complex14 = complex5.cos();
        org.apache.commons.math3.complex.Complex complex15 = complex14.tan();
        org.apache.commons.math3.complex.Complex complex17 = complex15.multiply((double) (short) 1);
        boolean boolean18 = complex17.isInfinite();
        org.apache.commons.math3.complex.Complex complex19 = complex17.atan();
        org.apache.commons.math3.complex.Complex complex20 = complex19.negate();
        org.apache.commons.math3.complex.Complex complex22 = complex20.multiply((double) '4');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex14 and complex19", complex14.equals(complex19) ? complex14.hashCode() == complex19.hashCode() : true);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
        org.apache.commons.math3.complex.Complex complex3 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double4 = complex3.getImaginary();
        org.apache.commons.math3.complex.Complex complex5 = complex3.negate();
        org.apache.commons.math3.complex.Complex complex7 = complex5.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex8 = complex5.tanh();
        org.apache.commons.math3.complex.Complex complex9 = complex8.conjugate();
        org.apache.commons.math3.complex.Complex complex10 = complex1.add(complex8);
        org.apache.commons.math3.complex.Complex complex12 = complex1.multiply((double) (-1));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex8 and complex9", complex8.equals(complex9) ? complex8.hashCode() == complex9.hashCode() : true);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex3.reciprocal();
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex7 = complex6.exp();
        double double8 = complex6.getArgument();
        org.apache.commons.math3.complex.Complex complex10 = complex6.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex11 = complex6.sin();
        org.apache.commons.math3.complex.Complex complex12 = complex6.cosh();
        org.apache.commons.math3.complex.Complex complex13 = complex6.tan();
        org.apache.commons.math3.complex.Complex complex14 = complex6.tan();
        org.apache.commons.math3.complex.Complex complex15 = complex3.add(complex14);
        org.apache.commons.math3.complex.Complex complex17 = complex3.multiply((int) '#');
        org.apache.commons.math3.complex.Complex complex18 = complex3.sqrt1z();
        java.lang.String str19 = complex18.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex4", complex3.equals(complex4) ? complex3.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex6 = complex1.sqrt1z();
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex8 = complex6.add(complex7);
        org.apache.commons.math3.complex.Complex complex10 = complex8.subtract((double) ' ');
        org.apache.commons.math3.complex.Complex complex11 = complex10.negate();
        org.apache.commons.math3.complex.Complex complex13 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double14 = complex13.getImaginary();
        org.apache.commons.math3.complex.Complex complex15 = complex13.negate();
        org.apache.commons.math3.complex.Complex complex17 = complex15.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex18 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex19 = complex15.subtract(complex18);
        org.apache.commons.math3.complex.Complex complex20 = complex15.acos();
        double double21 = complex20.getImaginary();
        org.apache.commons.math3.complex.Complex complex23 = complex20.multiply((int) (short) -1);
        org.apache.commons.math3.complex.Complex complex24 = complex10.multiply(complex20);
        org.apache.commons.math3.complex.Complex complex26 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex27 = complex26.exp();
        double double28 = complex26.getArgument();
        org.apache.commons.math3.complex.Complex complex29 = complex26.log();
        org.apache.commons.math3.complex.Complex complex30 = complex26.log();
        org.apache.commons.math3.complex.Complex complex31 = complex26.tan();
        org.apache.commons.math3.complex.Complex complex32 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex33 = complex32.sqrt1z();
        org.apache.commons.math3.complex.Complex complex35 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double36 = complex35.getImaginary();
        org.apache.commons.math3.complex.Complex complex37 = complex35.negate();
        org.apache.commons.math3.complex.Complex complex38 = complex37.sinh();
        org.apache.commons.math3.complex.Complex complex39 = complex38.acos();
        org.apache.commons.math3.complex.Complex complex40 = complex33.divide(complex38);
        org.apache.commons.math3.complex.Complex complex41 = complex40.tan();
        org.apache.commons.math3.complex.Complex complex42 = complex26.pow(complex40);
        org.apache.commons.math3.complex.Complex complex43 = complex20.divide(complex26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex42", complex1.equals(complex42) ? complex1.hashCode() == complex42.hashCode() : true);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex6 = complex5.negate();
        org.apache.commons.math3.complex.Complex complex8 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex9 = complex8.exp();
        double double10 = complex8.getArgument();
        org.apache.commons.math3.complex.Complex complex11 = complex8.log();
        org.apache.commons.math3.complex.Complex complex12 = complex8.log();
        org.apache.commons.math3.complex.Complex complex14 = complex12.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex15 = complex12.sqrt();
        org.apache.commons.math3.complex.Complex complex16 = complex6.subtract(complex12);
        org.apache.commons.math3.complex.Complex complex18 = complex12.multiply((double) (short) 100);
        org.apache.commons.math3.complex.Complex complex20 = complex18.add(Double.NaN);
        org.apache.commons.math3.complex.Complex complex21 = complex18.acos();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex20 and complex1.", complex20.equals(complex1) == complex1.equals(complex20));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((-0.0d));
        org.apache.commons.math3.complex.Complex complex7 = complex1.divide((double) (byte) 10);
        org.apache.commons.math3.complex.Complex complex8 = complex7.cosh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex5", complex1.equals(complex5) ? complex1.hashCode() == complex5.hashCode() : true);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((-0.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex1.asin();
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex8 = complex7.sqrt1z();
        org.apache.commons.math3.complex.Complex complex9 = complex8.asin();
        boolean boolean10 = complex8.isNaN();
        org.apache.commons.math3.complex.Complex complex11 = complex1.pow(complex8);
        org.apache.commons.math3.complex.Complex complex13 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double14 = complex13.getImaginary();
        org.apache.commons.math3.complex.Complex complex15 = complex13.negate();
        org.apache.commons.math3.complex.Complex complex17 = complex15.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex18 = complex17.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList20 = complex17.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex22 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex23 = complex22.exp();
        org.apache.commons.math3.complex.Complex complex24 = complex22.tanh();
        org.apache.commons.math3.complex.Complex complex25 = complex17.subtract(complex22);
        org.apache.commons.math3.complex.Complex complex26 = complex17.tanh();
        org.apache.commons.math3.complex.Complex complex28 = complex17.multiply(0.5574077246549021d);
        org.apache.commons.math3.complex.Complex complex29 = complex11.divide(complex17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex5", complex1.equals(complex5) ? complex1.hashCode() == complex5.hashCode() : true);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex1 = complex0.sqrt1z();
        org.apache.commons.math3.complex.Complex complex3 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double4 = complex3.getImaginary();
        org.apache.commons.math3.complex.Complex complex5 = complex3.negate();
        org.apache.commons.math3.complex.Complex complex6 = complex5.sinh();
        org.apache.commons.math3.complex.Complex complex7 = complex6.acos();
        org.apache.commons.math3.complex.Complex complex8 = complex1.divide(complex6);
        org.apache.commons.math3.complex.Complex complex9 = complex8.tan();
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double12 = complex11.getImaginary();
        org.apache.commons.math3.complex.Complex complex13 = complex11.negate();
        org.apache.commons.math3.complex.Complex complex15 = complex13.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex16 = complex13.tanh();
        org.apache.commons.math3.complex.Complex complex17 = complex16.conjugate();
        org.apache.commons.math3.complex.Complex complex18 = complex9.divide(complex16);
        org.apache.commons.math3.complex.Complex complex20 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double21 = complex20.getImaginary();
        org.apache.commons.math3.complex.Complex complex22 = complex20.negate();
        org.apache.commons.math3.complex.Complex complex24 = complex22.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex26 = complex22.pow((double) 100L);
        org.apache.commons.math3.complex.Complex complex27 = complex26.sin();
        boolean boolean28 = complex27.isNaN();
        org.apache.commons.math3.complex.Complex complex29 = complex16.divide(complex27);
        double double30 = complex27.getReal();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex16 and complex17", complex16.equals(complex17) ? complex16.hashCode() == complex17.hashCode() : true);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 10, (double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex4 = complex2.add((double) (byte) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex4.pow(1.0d);
        org.apache.commons.math3.complex.Complex complex7 = complex6.sin();
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex10 = complex9.exp();
        double double11 = complex9.getArgument();
        org.apache.commons.math3.complex.Complex complex12 = complex9.log();
        org.apache.commons.math3.complex.Complex complex13 = complex9.log();
        org.apache.commons.math3.complex.Complex complex15 = complex13.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex16 = complex6.multiply(complex13);
        org.apache.commons.math3.complex.Complex complex17 = complex16.cos();
        org.apache.commons.math3.complex.Complex complex19 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double20 = complex19.getImaginary();
        org.apache.commons.math3.complex.Complex complex21 = complex19.negate();
        org.apache.commons.math3.complex.Complex complex23 = complex21.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex24 = complex23.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList26 = complex23.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex28 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex29 = complex28.exp();
        org.apache.commons.math3.complex.Complex complex30 = complex28.tanh();
        org.apache.commons.math3.complex.Complex complex31 = complex23.subtract(complex28);
        org.apache.commons.math3.complex.Complex complex32 = complex23.tanh();
        org.apache.commons.math3.complex.Complex complex33 = complex16.subtract(complex23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex9 and complex17", complex9.equals(complex17) ? complex9.hashCode() == complex17.hashCode() : true);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex3 = complex2.exp();
        org.apache.commons.math3.complex.Complex complex4 = complex1.pow(complex2);
        org.apache.commons.math3.complex.Complex complex5 = complex4.atan();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex3 and complex1.", complex3.equals(complex1) == complex1.equals(complex3));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 10, (double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex4 = complex2.add((double) (byte) 10);
        org.apache.commons.math3.complex.Complex complex5 = complex4.sinh();
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double8 = complex7.getImaginary();
        org.apache.commons.math3.complex.Complex complex9 = complex7.negate();
        org.apache.commons.math3.complex.Complex complex11 = complex9.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex12 = complex11.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList14 = complex11.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex16 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex17 = complex16.exp();
        org.apache.commons.math3.complex.Complex complex18 = complex16.tanh();
        org.apache.commons.math3.complex.Complex complex19 = complex11.subtract(complex16);
        org.apache.commons.math3.complex.Complex complex20 = complex11.asin();
        java.lang.String str21 = complex20.toString();
        org.apache.commons.math3.complex.Complex complex23 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex24 = complex23.exp();
        double double25 = complex23.getArgument();
        org.apache.commons.math3.complex.Complex complex27 = complex23.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex28 = complex23.sin();
        org.apache.commons.math3.complex.Complex complex29 = complex23.cosh();
        org.apache.commons.math3.complex.Complex complex30 = complex23.tan();
        org.apache.commons.math3.complex.Complex complex31 = complex23.tan();
        org.apache.commons.math3.complex.Complex complex33 = complex23.subtract((double) (short) -1);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList35 = complex23.nthRoot(100);
        org.apache.commons.math3.complex.Complex complex36 = complex23.sinh();
        org.apache.commons.math3.complex.Complex complex37 = complex20.divide(complex23);
        org.apache.commons.math3.complex.Complex complex38 = complex5.pow(complex37);
        org.apache.commons.math3.complex.Complex complex39 = complex5.conjugate();
        org.apache.commons.math3.complex.Complex complex41 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex42 = complex41.exp();
        double double43 = complex41.getArgument();
        org.apache.commons.math3.complex.Complex complex44 = complex41.log();
        org.apache.commons.math3.complex.Complex complex45 = complex41.log();
        org.apache.commons.math3.complex.Complex complex46 = complex41.sqrt1z();
        org.apache.commons.math3.complex.Complex complex47 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex48 = complex46.add(complex47);
        org.apache.commons.math3.complex.Complex complex49 = complex48.cosh();
        boolean boolean50 = complex39.equals((java.lang.Object) complex48);
        java.lang.Class<?> wildcardClass51 = complex48.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex5 and complex39", complex5.equals(complex39) ? complex5.hashCode() == complex39.hashCode() : true);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex5.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex9 = complex5.negate();
        org.apache.commons.math3.complex.Complex complex10 = complex5.acos();
        org.apache.commons.math3.complex.Complex complex11 = complex10.cosh();
        double double12 = complex10.getImaginary();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex11", complex1.equals(complex11) ? complex1.hashCode() == complex11.hashCode() : true);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex6 = complex5.exp();
        double double7 = complex5.getArgument();
        org.apache.commons.math3.complex.Complex complex8 = complex5.log();
        org.apache.commons.math3.complex.Complex complex9 = complex5.log();
        org.apache.commons.math3.complex.Complex complex11 = complex9.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex12 = complex3.subtract(complex11);
        org.apache.commons.math3.complex.Complex complex14 = complex11.divide((double) (short) 10);
        org.apache.commons.math3.complex.Complex complex15 = complex11.exp();
        org.apache.commons.math3.complex.Complex complex16 = complex11.conjugate();
        org.apache.commons.math3.complex.Complex complex18 = complex11.pow((double) 10.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex8 and complex16", complex8.equals(complex16) ? complex8.hashCode() == complex16.hashCode() : true);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.acos();
        org.apache.commons.math3.complex.Complex complex4 = complex3.reciprocal();
        org.apache.commons.math3.complex.Complex complex6 = complex4.add(1.5430806348152437d);
        org.apache.commons.math3.complex.Complex complex7 = complex6.atan();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex7 and complex1.", complex7.equals(complex1) == complex1.equals(complex7));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
        org.apache.commons.math3.complex.Complex complex3 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double4 = complex3.getImaginary();
        org.apache.commons.math3.complex.Complex complex5 = complex3.negate();
        org.apache.commons.math3.complex.Complex complex7 = complex5.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex8 = complex5.tanh();
        org.apache.commons.math3.complex.Complex complex9 = complex8.conjugate();
        org.apache.commons.math3.complex.Complex complex10 = complex1.add(complex8);
        java.lang.String str11 = complex10.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex8 and complex9", complex8.equals(complex9) ? complex8.hashCode() == complex9.hashCode() : true);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex6 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex8 = complex7.sqrt1z();
        org.apache.commons.math3.complex.Complex complex10 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double11 = complex10.getImaginary();
        org.apache.commons.math3.complex.Complex complex12 = complex10.negate();
        org.apache.commons.math3.complex.Complex complex13 = complex12.sinh();
        org.apache.commons.math3.complex.Complex complex14 = complex13.acos();
        org.apache.commons.math3.complex.Complex complex15 = complex8.divide(complex13);
        org.apache.commons.math3.complex.Complex complex16 = complex15.tan();
        org.apache.commons.math3.complex.Complex complex17 = complex1.pow(complex15);
        org.apache.commons.math3.complex.Complex complex18 = complex1.reciprocal();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex8 and complex17", complex8.equals(complex17) ? complex8.hashCode() == complex17.hashCode() : true);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex5 = complex1.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex6 = complex5.log();
        org.apache.commons.math3.complex.Complex complex8 = complex5.subtract((double) 10L);
        boolean boolean9 = complex8.isInfinite();
        boolean boolean10 = complex8.isNaN();
        org.apache.commons.math3.complex.Complex complex11 = complex8.sqrt1z();
        org.apache.commons.math3.complex.Complex complex13 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double14 = complex13.getImaginary();
        org.apache.commons.math3.complex.Complex complex15 = complex13.negate();
        org.apache.commons.math3.complex.Complex complex16 = complex15.reciprocal();
        org.apache.commons.math3.complex.Complex complex18 = complex15.divide(100.0d);
        org.apache.commons.math3.complex.Complex complex19 = complex15.sqrt1z();
        org.apache.commons.math3.complex.Complex complex20 = complex8.multiply(complex15);
        org.apache.commons.math3.complex.Complex complex21 = complex8.log();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex15 and complex16", complex15.equals(complex16) ? complex15.hashCode() == complex16.hashCode() : true);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex5 = complex1.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex6 = complex5.log();
        org.apache.commons.math3.complex.Complex complex8 = complex5.subtract((double) 10L);
        boolean boolean9 = complex8.isInfinite();
        boolean boolean10 = complex8.isNaN();
        org.apache.commons.math3.complex.Complex complex11 = complex8.sqrt1z();
        org.apache.commons.math3.complex.Complex complex13 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double14 = complex13.getImaginary();
        org.apache.commons.math3.complex.Complex complex15 = complex13.negate();
        org.apache.commons.math3.complex.Complex complex16 = complex15.reciprocal();
        org.apache.commons.math3.complex.Complex complex18 = complex15.divide(100.0d);
        org.apache.commons.math3.complex.Complex complex19 = complex15.sqrt1z();
        org.apache.commons.math3.complex.Complex complex20 = complex8.multiply(complex15);
        org.apache.commons.math3.complex.Complex complex22 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double23 = complex22.getImaginary();
        org.apache.commons.math3.complex.Complex complex24 = complex22.negate();
        org.apache.commons.math3.complex.Complex complex26 = complex24.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex28 = complex24.pow((double) 100L);
        org.apache.commons.math3.complex.Complex complex29 = complex28.sin();
        double double30 = complex28.abs();
        org.apache.commons.math3.complex.Complex complex31 = complex15.multiply(complex28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex16 and complex24", complex16.equals(complex24) ? complex16.hashCode() == complex24.hashCode() : true);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex((double) 0.0f);
        boolean boolean2 = complex1.isInfinite();
        org.apache.commons.math3.complex.Complex complex4 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double5 = complex4.getImaginary();
        org.apache.commons.math3.complex.Complex complex6 = complex4.negate();
        org.apache.commons.math3.complex.Complex complex8 = complex6.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex9 = complex6.tanh();
        org.apache.commons.math3.complex.Complex complex10 = complex9.conjugate();
        org.apache.commons.math3.complex.Complex complex11 = complex1.divide(complex9);
        org.apache.commons.math3.complex.Complex complex13 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex14 = complex13.exp();
        org.apache.commons.math3.complex.Complex complex15 = complex13.tan();
        org.apache.commons.math3.complex.Complex complex17 = complex13.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex18 = complex17.log();
        org.apache.commons.math3.complex.Complex complex20 = complex17.subtract((double) 10L);
        boolean boolean21 = complex20.isInfinite();
        boolean boolean22 = complex20.isNaN();
        org.apache.commons.math3.complex.Complex complex23 = complex20.sqrt1z();
        org.apache.commons.math3.complex.Complex complex25 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double26 = complex25.getImaginary();
        org.apache.commons.math3.complex.Complex complex27 = complex25.negate();
        org.apache.commons.math3.complex.Complex complex28 = complex27.reciprocal();
        org.apache.commons.math3.complex.Complex complex30 = complex27.divide(100.0d);
        org.apache.commons.math3.complex.Complex complex31 = complex27.sqrt1z();
        org.apache.commons.math3.complex.Complex complex32 = complex20.multiply(complex27);
        org.apache.commons.math3.complex.Complex complex33 = complex9.multiply(complex32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex6 and complex28", complex6.equals(complex28) ? complex6.hashCode() == complex28.hashCode() : true);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) (byte) 100, 0.0d);
        org.apache.commons.math3.complex.Complex complex3 = complex2.log();
        org.apache.commons.math3.complex.Complex complex4 = complex3.tanh();
        org.apache.commons.math3.complex.Complex complex6 = complex3.divide((double) 0L);
        org.apache.commons.math3.complex.Complex complex8 = complex6.subtract(0.7518860375694327d);
        org.apache.commons.math3.complex.Complex complex10 = complex8.multiply((int) (short) 100);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex10 and complex2.", complex10.equals(complex2) == complex2.equals(complex10));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex7 = complex3.subtract(complex6);
        org.apache.commons.math3.complex.Complex complex8 = complex6.sqrt();
        org.apache.commons.math3.complex.Complex complex9 = complex6.exp();
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double12 = complex11.getImaginary();
        org.apache.commons.math3.complex.Complex complex13 = complex11.negate();
        org.apache.commons.math3.complex.Complex complex15 = complex13.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex16 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex17 = complex13.subtract(complex16);
        org.apache.commons.math3.complex.Complex complex18 = complex13.cosh();
        org.apache.commons.math3.complex.Complex complex19 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex20 = complex19.sqrt1z();
        org.apache.commons.math3.complex.Complex complex22 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double23 = complex22.getImaginary();
        org.apache.commons.math3.complex.Complex complex24 = complex22.negate();
        org.apache.commons.math3.complex.Complex complex25 = complex24.sinh();
        org.apache.commons.math3.complex.Complex complex26 = complex25.acos();
        org.apache.commons.math3.complex.Complex complex27 = complex20.divide(complex25);
        org.apache.commons.math3.complex.Complex complex28 = complex27.tan();
        org.apache.commons.math3.complex.Complex complex29 = complex18.subtract(complex27);
        org.apache.commons.math3.complex.Complex complex30 = complex27.sin();
        org.apache.commons.math3.complex.Complex complex31 = complex9.pow(complex27);
        org.apache.commons.math3.complex.Complex complex32 = complex9.sin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex31", complex1.equals(complex31) ? complex1.hashCode() == complex31.hashCode() : true);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex1 = complex0.sqrt1z();
        org.apache.commons.math3.complex.Complex complex3 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double4 = complex3.getImaginary();
        org.apache.commons.math3.complex.Complex complex5 = complex3.negate();
        org.apache.commons.math3.complex.Complex complex6 = complex5.sinh();
        org.apache.commons.math3.complex.Complex complex7 = complex6.acos();
        org.apache.commons.math3.complex.Complex complex8 = complex1.divide(complex6);
        org.apache.commons.math3.complex.Complex complex9 = complex8.tan();
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double12 = complex11.getImaginary();
        org.apache.commons.math3.complex.Complex complex13 = complex11.negate();
        org.apache.commons.math3.complex.Complex complex15 = complex13.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex16 = complex13.tanh();
        org.apache.commons.math3.complex.Complex complex17 = complex16.conjugate();
        org.apache.commons.math3.complex.Complex complex18 = complex9.divide(complex16);
        boolean boolean19 = complex16.isNaN();
        org.apache.commons.math3.complex.Complex complex20 = complex16.sqrt();
        double double21 = complex20.getArgument();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex16 and complex17", complex16.equals(complex17) ? complex16.hashCode() == complex17.hashCode() : true);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex3 = complex2.exp();
        org.apache.commons.math3.complex.Complex complex4 = complex1.pow(complex2);
        org.apache.commons.math3.complex.Complex complex5 = complex4.sinh();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex3 and complex1.", complex3.equals(complex1) == complex1.equals(complex3));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex1 = complex0.acos();
        org.apache.commons.math3.complex.Complex complex2 = complex0.conjugate();
        org.apache.commons.math3.complex.Complex complex3 = complex0.sqrt();
        double double4 = complex0.getReal();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex3", complex2.equals(complex3) ? complex2.hashCode() == complex3.hashCode() : true);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex4.log();
        org.apache.commons.math3.complex.Complex complex6 = complex4.reciprocal();
        org.apache.commons.math3.complex.Complex complex8 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double9 = complex8.getImaginary();
        org.apache.commons.math3.complex.Complex complex10 = complex8.negate();
        org.apache.commons.math3.complex.Complex complex11 = complex10.sinh();
        org.apache.commons.math3.complex.Complex complex12 = complex11.acos();
        org.apache.commons.math3.complex.Complex complex14 = complex11.pow((double) 100.0f);
        org.apache.commons.math3.complex.Complex complex15 = complex6.divide(complex11);
        org.apache.commons.math3.complex.Complex complex17 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex18 = complex17.exp();
        double double19 = complex17.getArgument();
        org.apache.commons.math3.complex.Complex complex20 = complex17.log();
        org.apache.commons.math3.complex.Complex complex21 = complex17.log();
        org.apache.commons.math3.complex.Complex complex22 = complex17.sqrt1z();
        org.apache.commons.math3.complex.Complex complex23 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex24 = complex22.add(complex23);
        org.apache.commons.math3.complex.Complex complex25 = complex6.divide(complex23);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex25 and complex1.", complex25.equals(complex1) == complex1.equals(complex25));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex7 = complex3.pow((double) 100L);
        org.apache.commons.math3.complex.Complex complex8 = complex3.reciprocal();
        org.apache.commons.math3.complex.Complex complex9 = complex8.sinh();
        org.apache.commons.math3.complex.Complex complex10 = complex9.cos();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex8", complex3.equals(complex8) ? complex3.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex1 = complex0.sqrt1z();
        org.apache.commons.math3.complex.Complex complex3 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double4 = complex3.getImaginary();
        org.apache.commons.math3.complex.Complex complex5 = complex3.negate();
        org.apache.commons.math3.complex.Complex complex6 = complex5.sinh();
        org.apache.commons.math3.complex.Complex complex7 = complex6.acos();
        org.apache.commons.math3.complex.Complex complex8 = complex1.divide(complex6);
        org.apache.commons.math3.complex.Complex complex10 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex11 = complex10.exp();
        org.apache.commons.math3.complex.Complex complex12 = complex10.acos();
        boolean boolean13 = complex1.equals((java.lang.Object) complex12);
        org.apache.commons.math3.complex.Complex complex14 = complex1.asin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex12", complex0.equals(complex12) ? complex0.hashCode() == complex12.hashCode() : true);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex4.log();
        org.apache.commons.math3.complex.Complex complex6 = complex4.reciprocal();
        org.apache.commons.math3.complex.Complex complex8 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double9 = complex8.getImaginary();
        org.apache.commons.math3.complex.Complex complex10 = complex8.negate();
        org.apache.commons.math3.complex.Complex complex11 = complex10.sinh();
        org.apache.commons.math3.complex.Complex complex12 = complex11.acos();
        org.apache.commons.math3.complex.Complex complex14 = complex11.pow((double) 100.0f);
        org.apache.commons.math3.complex.Complex complex15 = complex6.divide(complex11);
        org.apache.commons.math3.complex.Complex complex17 = complex6.subtract(0.0d);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex17 and complex1.", complex17.equals(complex1) == complex1.equals(complex17));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex5 = complex1.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex6 = complex5.log();
        org.apache.commons.math3.complex.Complex complex8 = complex5.subtract((double) 10L);
        boolean boolean9 = complex8.isInfinite();
        boolean boolean10 = complex8.isNaN();
        org.apache.commons.math3.complex.Complex complex11 = complex8.sqrt1z();
        org.apache.commons.math3.complex.Complex complex13 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double14 = complex13.getImaginary();
        org.apache.commons.math3.complex.Complex complex15 = complex13.negate();
        org.apache.commons.math3.complex.Complex complex16 = complex15.reciprocal();
        org.apache.commons.math3.complex.Complex complex18 = complex15.divide(100.0d);
        org.apache.commons.math3.complex.Complex complex19 = complex15.sqrt1z();
        org.apache.commons.math3.complex.Complex complex20 = complex8.multiply(complex15);
        org.apache.commons.math3.complex.Complex complex22 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex23 = complex22.exp();
        double double24 = complex22.getArgument();
        org.apache.commons.math3.complex.Complex complex26 = complex22.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex27 = complex22.sin();
        org.apache.commons.math3.complex.Complex complex28 = complex22.cosh();
        org.apache.commons.math3.complex.Complex complex29 = complex22.tan();
        org.apache.commons.math3.complex.Complex complex30 = complex22.tan();
        org.apache.commons.math3.complex.Complex complex32 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex33 = complex32.exp();
        double double34 = complex32.getArgument();
        org.apache.commons.math3.complex.Complex complex36 = complex32.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex37 = complex32.sin();
        org.apache.commons.math3.complex.Complex complex38 = complex32.cosh();
        org.apache.commons.math3.complex.Complex complex39 = complex32.tan();
        org.apache.commons.math3.complex.Complex complex40 = complex32.tan();
        org.apache.commons.math3.complex.Complex complex42 = complex32.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex43 = complex30.subtract(complex32);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList45 = complex43.nthRoot((int) '4');
        org.apache.commons.math3.complex.Complex complex47 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double48 = complex47.getImaginary();
        org.apache.commons.math3.complex.Complex complex49 = complex43.divide(complex47);
        org.apache.commons.math3.complex.Complex complex50 = complex43.conjugate();
        org.apache.commons.math3.complex.Complex complex51 = complex8.pow(complex43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex15 and complex16", complex15.equals(complex16) ? complex15.hashCode() == complex16.hashCode() : true);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.NaN;
        org.apache.commons.math3.complex.Complex complex2 = complex0.divide(3.141592653589793d);
        org.apache.commons.math3.complex.Complex complex4 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex5 = complex4.exp();
        double double6 = complex4.getArgument();
        org.apache.commons.math3.complex.Complex complex8 = complex4.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex9 = complex4.exp();
        org.apache.commons.math3.complex.Complex complex12 = new org.apache.commons.math3.complex.Complex((double) (short) -1, (double) '4');
        org.apache.commons.math3.complex.Complex complex13 = complex12.cos();
        org.apache.commons.math3.complex.Complex complex14 = complex9.divide(complex13);
        org.apache.commons.math3.complex.Complex complex15 = complex14.sin();
        boolean boolean16 = complex0.equals((java.lang.Object) complex14);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex0 and complex4.", complex0.equals(complex4) == complex4.equals(complex0));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex3.reciprocal();
        org.apache.commons.math3.complex.Complex complex6 = complex4.divide((double) 0L);
        org.apache.commons.math3.complex.Complex complex7 = complex6.log();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex4", complex3.equals(complex4) ? complex3.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) (byte) 100, 0.0d);
        org.apache.commons.math3.complex.Complex complex3 = complex2.log();
        org.apache.commons.math3.complex.Complex complex4 = complex3.tanh();
        org.apache.commons.math3.complex.Complex complex6 = complex3.divide((double) 0L);
        org.apache.commons.math3.complex.Complex complex7 = complex3.sinh();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex6 and complex2.", complex6.equals(complex2) == complex2.equals(complex6));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.sin();
        org.apache.commons.math3.complex.Complex complex7 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex8 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex9 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex12 = complex11.exp();
        double double13 = complex11.getArgument();
        org.apache.commons.math3.complex.Complex complex15 = complex11.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex16 = complex11.sin();
        org.apache.commons.math3.complex.Complex complex17 = complex11.cosh();
        org.apache.commons.math3.complex.Complex complex18 = complex11.tan();
        org.apache.commons.math3.complex.Complex complex19 = complex11.tan();
        org.apache.commons.math3.complex.Complex complex21 = complex11.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex22 = complex9.subtract(complex11);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList24 = complex22.nthRoot((int) '4');
        org.apache.commons.math3.complex.Complex complex25 = complex22.cos();
        org.apache.commons.math3.complex.Complex complex26 = complex22.sin();
        org.apache.commons.math3.complex.Complex complex27 = complex26.cosh();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList29 = complex27.nthRoot(1);
        org.apache.commons.math3.complex.Complex complex31 = complex27.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex33 = complex27.subtract(0.4080820618133952d);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex31 and complex1.", complex31.equals(complex1) == complex1.equals(complex31));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.sin();
        org.apache.commons.math3.complex.Complex complex7 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex8 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex9 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex12 = complex11.exp();
        double double13 = complex11.getArgument();
        org.apache.commons.math3.complex.Complex complex15 = complex11.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex16 = complex11.sin();
        org.apache.commons.math3.complex.Complex complex17 = complex11.cosh();
        org.apache.commons.math3.complex.Complex complex18 = complex11.tan();
        org.apache.commons.math3.complex.Complex complex19 = complex11.tan();
        org.apache.commons.math3.complex.Complex complex21 = complex11.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex22 = complex9.subtract(complex11);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList24 = complex22.nthRoot((int) '4');
        org.apache.commons.math3.complex.Complex complex26 = complex22.subtract(Double.POSITIVE_INFINITY);
        org.apache.commons.math3.complex.Complex complex27 = complex26.tan();
        org.apache.commons.math3.complex.Complex complex28 = complex26.asin();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex28 and complex1.", complex28.equals(complex1) == complex1.equals(complex28));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex6 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex7 = complex1.conjugate();
        org.apache.commons.math3.complex.Complex complex8 = complex1.sin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex5 and complex7", complex5.equals(complex7) ? complex5.hashCode() == complex7.hashCode() : true);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf(0.0d, (double) ' ');
        org.apache.commons.math3.complex.Complex complex4 = complex2.pow(1.0349512282932293E22d);
        org.apache.commons.math3.complex.Complex complex5 = complex4.atan();
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.valueOf((double) 0L);
        org.apache.commons.math3.complex.Complex complex8 = complex7.asin();
        org.apache.commons.math3.complex.Complex complex9 = complex4.add(complex8);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex5 and complex2.", complex5.equals(complex2) == complex2.equals(complex5));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex(10.0d, (double) 100L);
        org.apache.commons.math3.complex.Complex complex4 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex5 = complex4.sqrt();
        org.apache.commons.math3.complex.Complex complex6 = complex2.multiply(complex5);
        org.apache.commons.math3.complex.Complex complex8 = complex5.pow((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex10 = complex8.add((double) 0.0f);
        double double11 = complex10.getArgument();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex8", complex4.equals(complex8) ? complex4.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex3.reciprocal();
        boolean boolean5 = complex4.isNaN();
        org.apache.commons.math3.complex.Complex complex6 = complex4.negate();
        org.apache.commons.math3.complex.Complex complex7 = complex4.acos();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex6", complex1.equals(complex6) ? complex1.hashCode() == complex6.hashCode() : true);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.sin();
        org.apache.commons.math3.complex.Complex complex7 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex8 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex9 = complex8.conjugate();
        org.apache.commons.math3.complex.Complex complex10 = complex8.sqrt();
        org.apache.commons.math3.complex.Complex complex12 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex13 = complex12.sqrt();
        org.apache.commons.math3.complex.Complex complex14 = complex12.sqrt();
        org.apache.commons.math3.complex.Complex complex15 = complex14.tanh();
        org.apache.commons.math3.complex.Complex complex16 = complex15.acos();
        org.apache.commons.math3.complex.Complex complex18 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex19 = complex18.exp();
        org.apache.commons.math3.complex.Complex complex20 = complex18.tan();
        org.apache.commons.math3.complex.Complex complex22 = complex18.pow((-0.0d));
        boolean boolean23 = complex16.equals((java.lang.Object) complex22);
        org.apache.commons.math3.complex.Complex complex24 = complex8.pow(complex22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex9 and complex20", complex9.equals(complex20) ? complex9.hashCode() == complex20.hashCode() : true);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex6 = complex1.sqrt1z();
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex8 = complex6.add(complex7);
        org.apache.commons.math3.complex.Complex complex9 = complex6.cosh();
        org.apache.commons.math3.complex.Complex complex10 = complex9.conjugate();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList12 = complex9.nthRoot((int) (short) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex10", complex1.equals(complex10) ? complex1.hashCode() == complex10.hashCode() : true);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex6 = complex1.sqrt1z();
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex8 = complex6.add(complex7);
        org.apache.commons.math3.complex.Complex complex9 = complex6.cosh();
        org.apache.commons.math3.complex.Complex complex10 = complex9.conjugate();
        org.apache.commons.math3.complex.Complex complex11 = complex9.cos();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex10", complex1.equals(complex10) ? complex1.hashCode() == complex10.hashCode() : true);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 'a', 0.0d);
        org.apache.commons.math3.complex.Complex complex3 = complex2.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex2.sqrt1z();
        double double5 = complex2.getArgument();
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex7 = complex6.exp();
        org.apache.commons.math3.complex.Complex complex8 = complex6.reciprocal();
        org.apache.commons.math3.complex.Complex complex9 = complex2.pow(complex6);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex7 and complex3.", complex7.equals(complex3) == complex3.equals(complex7));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex7 = complex5.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex8 = complex5.tan();
        org.apache.commons.math3.complex.Complex complex9 = complex5.asin();
        boolean boolean10 = complex5.isNaN();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex9", complex4.equals(complex9) ? complex4.hashCode() == complex9.hashCode() : true);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((-0.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex1.asin();
        org.apache.commons.math3.complex.Complex complex7 = complex6.cos();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex5", complex1.equals(complex5) ? complex1.hashCode() == complex5.hashCode() : true);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math3.complex.Complex complex3 = complex1.sqrt();
        double double4 = complex1.getReal();
        org.apache.commons.math3.complex.Complex complex6 = complex1.add((-0.0d));
        org.apache.commons.math3.complex.Complex complex9 = new org.apache.commons.math3.complex.Complex((double) (byte) 100, 0.0d);
        org.apache.commons.math3.complex.Complex complex10 = complex9.sqrt();
        org.apache.commons.math3.complex.Complex complex11 = complex9.log();
        org.apache.commons.math3.complex.Complex complex13 = complex11.multiply((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex14 = complex11.tan();
        double double15 = complex14.getImaginary();
        org.apache.commons.math3.complex.Complex complex16 = complex14.sqrt();
        org.apache.commons.math3.complex.Complex complex17 = complex1.multiply(complex16);
        org.apache.commons.math3.complex.Complex complex19 = org.apache.commons.math3.complex.Complex.valueOf((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex20 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex21 = complex20.exp();
        org.apache.commons.math3.complex.Complex complex22 = complex19.pow(complex20);
        org.apache.commons.math3.complex.Complex complex23 = complex1.multiply(complex19);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex21 and complex2.", complex21.equals(complex2) == complex2.equals(complex21));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex3.reciprocal();
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex7 = complex6.exp();
        double double8 = complex6.getArgument();
        org.apache.commons.math3.complex.Complex complex10 = complex6.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex11 = complex6.sin();
        org.apache.commons.math3.complex.Complex complex12 = complex6.cosh();
        org.apache.commons.math3.complex.Complex complex13 = complex6.tan();
        org.apache.commons.math3.complex.Complex complex14 = complex6.tan();
        org.apache.commons.math3.complex.Complex complex15 = complex3.add(complex14);
        org.apache.commons.math3.complex.Complex complex17 = complex3.add((-1.0d));
        java.lang.Class<?> wildcardClass18 = complex17.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex4", complex3.equals(complex4) ? complex3.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.sin();
        org.apache.commons.math3.complex.Complex complex7 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex8 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex9 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex12 = complex11.exp();
        double double13 = complex11.getArgument();
        org.apache.commons.math3.complex.Complex complex15 = complex11.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex16 = complex11.sin();
        org.apache.commons.math3.complex.Complex complex17 = complex11.cosh();
        org.apache.commons.math3.complex.Complex complex18 = complex11.tan();
        org.apache.commons.math3.complex.Complex complex19 = complex11.tan();
        org.apache.commons.math3.complex.Complex complex21 = complex11.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex22 = complex9.subtract(complex11);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList24 = complex22.nthRoot((int) '4');
        org.apache.commons.math3.complex.Complex complex25 = complex22.cos();
        org.apache.commons.math3.complex.Complex complex26 = complex22.sin();
        org.apache.commons.math3.complex.Complex complex27 = complex26.cosh();
        org.apache.commons.math3.complex.Complex complex28 = complex27.acos();
        org.apache.commons.math3.complex.ComplexField complexField29 = complex27.getField();
        org.apache.commons.math3.complex.Complex complex31 = new org.apache.commons.math3.complex.Complex((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex32 = complex27.pow(complex31);
        org.apache.commons.math3.complex.Complex complex34 = complex31.add(100.0d);
        org.apache.commons.math3.complex.Complex complex35 = complex31.log();
        org.apache.commons.math3.complex.Complex complex36 = complex35.sinh();
        org.apache.commons.math3.complex.Complex complex37 = complex35.cos();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex36 and complex1.", complex36.equals(complex1) == complex1.equals(complex36));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex6 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex8 = complex6.pow((-0.0d));
        org.apache.commons.math3.complex.Complex complex9 = complex6.sqrt();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex8", complex1.equals(complex8) ? complex1.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex7 = complex3.subtract(complex6);
        org.apache.commons.math3.complex.Complex complex8 = complex3.cosh();
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex10 = complex9.sqrt1z();
        org.apache.commons.math3.complex.Complex complex12 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double13 = complex12.getImaginary();
        org.apache.commons.math3.complex.Complex complex14 = complex12.negate();
        org.apache.commons.math3.complex.Complex complex15 = complex14.sinh();
        org.apache.commons.math3.complex.Complex complex16 = complex15.acos();
        org.apache.commons.math3.complex.Complex complex17 = complex10.divide(complex15);
        org.apache.commons.math3.complex.Complex complex18 = complex17.tan();
        org.apache.commons.math3.complex.Complex complex19 = complex8.subtract(complex17);
        org.apache.commons.math3.complex.Complex complex21 = complex8.add(0.5574077246549021d);
        org.apache.commons.math3.complex.Complex complex23 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double24 = complex23.getImaginary();
        org.apache.commons.math3.complex.Complex complex25 = complex23.negate();
        org.apache.commons.math3.complex.Complex complex27 = complex25.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex29 = complex25.pow((double) 100L);
        org.apache.commons.math3.complex.Complex complex30 = complex25.reciprocal();
        org.apache.commons.math3.complex.Complex complex31 = complex25.tanh();
        org.apache.commons.math3.complex.ComplexField complexField32 = complex25.getField();
        org.apache.commons.math3.complex.Complex complex34 = complex25.multiply(0.03140559722642014d);
        org.apache.commons.math3.complex.Complex complex35 = complex25.sinh();
        org.apache.commons.math3.complex.Complex complex37 = complex25.subtract(20.0d);
        org.apache.commons.math3.complex.Complex complex38 = complex8.multiply(complex37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex30", complex3.equals(complex30) ? complex3.hashCode() == complex30.hashCode() : true);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math3.complex.Complex complex7 = complex5.reciprocal();
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double10 = complex9.getImaginary();
        org.apache.commons.math3.complex.Complex complex11 = complex9.negate();
        org.apache.commons.math3.complex.Complex complex13 = complex11.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex14 = complex13.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList16 = complex13.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex18 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex19 = complex18.exp();
        org.apache.commons.math3.complex.Complex complex20 = complex18.tanh();
        org.apache.commons.math3.complex.Complex complex21 = complex13.subtract(complex18);
        org.apache.commons.math3.complex.Complex complex22 = complex7.multiply(complex13);
        org.apache.commons.math3.complex.Complex complex24 = complex13.multiply(0.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex7", complex1.equals(complex7) ? complex1.hashCode() == complex7.hashCode() : true);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex7 = complex5.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex8 = complex5.tan();
        org.apache.commons.math3.complex.Complex complex9 = complex5.asin();
        org.apache.commons.math3.complex.Complex complex10 = complex5.negate();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex9", complex4.equals(complex9) ? complex4.hashCode() == complex9.hashCode() : true);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex3.reciprocal();
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex7 = complex6.exp();
        double double8 = complex6.getArgument();
        org.apache.commons.math3.complex.Complex complex10 = complex6.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex11 = complex6.sin();
        org.apache.commons.math3.complex.Complex complex12 = complex6.cosh();
        org.apache.commons.math3.complex.Complex complex13 = complex6.tan();
        org.apache.commons.math3.complex.Complex complex14 = complex6.tan();
        org.apache.commons.math3.complex.Complex complex15 = complex3.add(complex14);
        org.apache.commons.math3.complex.Complex complex17 = complex3.multiply((int) '#');
        org.apache.commons.math3.complex.Complex complex19 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double20 = complex19.getImaginary();
        org.apache.commons.math3.complex.Complex complex21 = complex19.negate();
        org.apache.commons.math3.complex.Complex complex23 = complex21.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex24 = complex23.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList26 = complex23.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex28 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex29 = complex28.exp();
        org.apache.commons.math3.complex.Complex complex30 = complex28.tanh();
        org.apache.commons.math3.complex.Complex complex31 = complex23.subtract(complex28);
        org.apache.commons.math3.complex.Complex complex32 = complex23.cos();
        org.apache.commons.math3.complex.Complex complex33 = complex32.tan();
        org.apache.commons.math3.complex.Complex complex35 = complex33.multiply((double) (short) 1);
        boolean boolean36 = complex35.isInfinite();
        org.apache.commons.math3.complex.Complex complex37 = complex35.atan();
        org.apache.commons.math3.complex.Complex complex38 = complex17.divide(complex35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex4", complex3.equals(complex4) ? complex3.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex5 = complex1.subtract((double) (short) 0);
        double double6 = complex5.abs();
        double double7 = complex5.getImaginary();
        org.apache.commons.math3.complex.Complex complex8 = complex5.reciprocal();
        org.apache.commons.math3.complex.Complex complex10 = complex8.multiply(0.03140559722642014d);
        org.apache.commons.math3.complex.Complex complex11 = complex10.cosh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex8", complex1.equals(complex8) ? complex1.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
        org.apache.commons.math3.complex.Complex complex3 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double4 = complex3.getImaginary();
        org.apache.commons.math3.complex.Complex complex5 = complex3.negate();
        org.apache.commons.math3.complex.Complex complex7 = complex5.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex8 = complex5.tanh();
        org.apache.commons.math3.complex.Complex complex9 = complex8.conjugate();
        org.apache.commons.math3.complex.Complex complex10 = complex1.add(complex8);
        double double11 = complex1.getImaginary();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex8 and complex9", complex8.equals(complex9) ? complex8.hashCode() == complex9.hashCode() : true);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.sin();
        org.apache.commons.math3.complex.Complex complex7 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex8 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex9 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex12 = complex11.exp();
        double double13 = complex11.getArgument();
        org.apache.commons.math3.complex.Complex complex15 = complex11.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex16 = complex11.sin();
        org.apache.commons.math3.complex.Complex complex17 = complex11.cosh();
        org.apache.commons.math3.complex.Complex complex18 = complex11.tan();
        org.apache.commons.math3.complex.Complex complex19 = complex11.tan();
        org.apache.commons.math3.complex.Complex complex21 = complex11.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex22 = complex9.subtract(complex11);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList24 = complex22.nthRoot((int) '4');
        org.apache.commons.math3.complex.Complex complex25 = complex22.cos();
        org.apache.commons.math3.complex.Complex complex26 = complex22.sin();
        org.apache.commons.math3.complex.Complex complex27 = complex26.cosh();
        org.apache.commons.math3.complex.Complex complex28 = complex27.reciprocal();
        org.apache.commons.math3.complex.Complex complex29 = complex27.cosh();
        org.apache.commons.math3.complex.Complex complex31 = complex27.multiply(1.5430806348152437d);
        org.apache.commons.math3.complex.Complex complex34 = new org.apache.commons.math3.complex.Complex((double) (short) -1, (double) '4');
        org.apache.commons.math3.complex.Complex complex36 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double37 = complex36.getImaginary();
        org.apache.commons.math3.complex.Complex complex38 = complex36.negate();
        org.apache.commons.math3.complex.Complex complex40 = complex38.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex41 = complex40.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList43 = complex40.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex45 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex46 = complex45.exp();
        org.apache.commons.math3.complex.Complex complex47 = complex45.tanh();
        org.apache.commons.math3.complex.Complex complex48 = complex40.subtract(complex45);
        org.apache.commons.math3.complex.Complex complex49 = complex40.asin();
        java.lang.String str50 = complex49.toString();
        org.apache.commons.math3.complex.Complex complex51 = complex49.tanh();
        org.apache.commons.math3.complex.Complex complex52 = complex34.pow(complex49);
        org.apache.commons.math3.complex.Complex complex54 = complex52.pow((double) 1.0f);
        org.apache.commons.math3.complex.Complex complex56 = complex54.multiply(8.509181282393216d);
        org.apache.commons.math3.complex.Complex complex57 = complex27.divide(complex54);
        org.apache.commons.math3.complex.Complex complex59 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex60 = complex59.exp();
        double double61 = complex59.getArgument();
        org.apache.commons.math3.complex.Complex complex63 = complex59.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex64 = complex59.exp();
        org.apache.commons.math3.complex.Complex complex66 = complex64.pow((-0.0d));
        org.apache.commons.math3.complex.Complex complex67 = complex66.negate();
        org.apache.commons.math3.complex.Complex complex68 = complex27.divide(complex66);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex38 and complex67", complex38.equals(complex67) ? complex38.hashCode() == complex67.hashCode() : true);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.sin();
        org.apache.commons.math3.complex.Complex complex7 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex8 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex9 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex12 = complex11.exp();
        double double13 = complex11.getArgument();
        org.apache.commons.math3.complex.Complex complex15 = complex11.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex16 = complex11.sin();
        org.apache.commons.math3.complex.Complex complex17 = complex11.cosh();
        org.apache.commons.math3.complex.Complex complex18 = complex11.tan();
        org.apache.commons.math3.complex.Complex complex19 = complex11.tan();
        org.apache.commons.math3.complex.Complex complex21 = complex11.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex22 = complex9.subtract(complex11);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList24 = complex22.nthRoot((int) '4');
        org.apache.commons.math3.complex.Complex complex26 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double27 = complex26.getImaginary();
        org.apache.commons.math3.complex.Complex complex28 = complex22.divide(complex26);
        org.apache.commons.math3.complex.Complex complex29 = complex22.conjugate();
        org.apache.commons.math3.complex.Complex complex31 = complex22.multiply(100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex28 and complex29", complex28.equals(complex29) ? complex28.hashCode() == complex29.hashCode() : true);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) (short) -1, (double) '4');
        boolean boolean3 = complex2.isInfinite();
        org.apache.commons.math3.complex.Complex complex6 = new org.apache.commons.math3.complex.Complex((double) 0L, (double) 100.0f);
        org.apache.commons.math3.complex.Complex complex7 = complex2.multiply(complex6);
        org.apache.commons.math3.complex.Complex complex8 = complex6.cos();
        org.apache.commons.math3.complex.Complex complex9 = complex8.atan();
        org.apache.commons.math3.complex.Complex complex10 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex11 = complex10.sqrt1z();
        org.apache.commons.math3.complex.Complex complex12 = complex11.asin();
        org.apache.commons.math3.complex.Complex complex13 = complex9.add(complex11);
        org.apache.commons.math3.complex.Complex complex15 = complex11.multiply((double) 10.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex9 and complex12", complex9.equals(complex12) ? complex9.hashCode() == complex12.hashCode() : true);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.sin();
        org.apache.commons.math3.complex.Complex complex7 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex8 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex10 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex11 = complex10.exp();
        double double12 = complex10.getArgument();
        org.apache.commons.math3.complex.Complex complex14 = complex10.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex15 = complex10.sin();
        org.apache.commons.math3.complex.Complex complex16 = complex10.cosh();
        org.apache.commons.math3.complex.Complex complex17 = complex10.tan();
        org.apache.commons.math3.complex.Complex complex18 = complex10.tan();
        org.apache.commons.math3.complex.Complex complex20 = complex10.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex21 = complex8.pow(complex20);
        org.apache.commons.math3.complex.Complex complex23 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex24 = complex23.exp();
        org.apache.commons.math3.complex.Complex complex25 = complex23.tan();
        org.apache.commons.math3.complex.Complex complex27 = complex23.pow((-0.0d));
        org.apache.commons.math3.complex.Complex complex28 = complex20.divide(complex27);
        org.apache.commons.math3.complex.Complex complex30 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double31 = complex30.getImaginary();
        org.apache.commons.math3.complex.Complex complex32 = complex30.negate();
        org.apache.commons.math3.complex.Complex complex34 = complex32.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex35 = complex34.atan();
        org.apache.commons.math3.complex.Complex complex37 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex38 = complex37.exp();
        double double39 = complex37.getArgument();
        org.apache.commons.math3.complex.Complex complex41 = complex37.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex42 = complex37.sin();
        org.apache.commons.math3.complex.Complex complex43 = complex37.cosh();
        org.apache.commons.math3.complex.Complex complex45 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double46 = complex45.getImaginary();
        boolean boolean47 = complex43.equals((java.lang.Object) double46);
        org.apache.commons.math3.complex.Complex complex48 = complex43.tanh();
        org.apache.commons.math3.complex.Complex complex49 = complex34.subtract(complex48);
        org.apache.commons.math3.complex.Complex complex50 = complex48.cosh();
        org.apache.commons.math3.complex.Complex complex52 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double53 = complex52.getImaginary();
        org.apache.commons.math3.complex.Complex complex54 = complex52.negate();
        org.apache.commons.math3.complex.Complex complex56 = complex54.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex57 = complex56.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList59 = complex56.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex61 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex62 = complex61.exp();
        org.apache.commons.math3.complex.Complex complex63 = complex61.tanh();
        org.apache.commons.math3.complex.Complex complex64 = complex56.subtract(complex61);
        org.apache.commons.math3.complex.Complex complex66 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex67 = complex66.exp();
        double double68 = complex66.getArgument();
        org.apache.commons.math3.complex.Complex complex70 = complex66.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex71 = complex66.sin();
        org.apache.commons.math3.complex.Complex complex72 = complex66.cosh();
        org.apache.commons.math3.complex.Complex complex73 = complex66.tan();
        org.apache.commons.math3.complex.Complex complex74 = complex66.tan();
        org.apache.commons.math3.complex.Complex complex76 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex77 = complex76.exp();
        double double78 = complex76.getArgument();
        org.apache.commons.math3.complex.Complex complex80 = complex76.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex81 = complex76.sin();
        org.apache.commons.math3.complex.Complex complex82 = complex76.cosh();
        org.apache.commons.math3.complex.Complex complex83 = complex76.tan();
        org.apache.commons.math3.complex.Complex complex84 = complex76.tan();
        org.apache.commons.math3.complex.Complex complex86 = complex76.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex87 = complex74.subtract(complex76);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList89 = complex87.nthRoot((int) '4');
        org.apache.commons.math3.complex.Complex complex90 = complex61.subtract(complex87);
        org.apache.commons.math3.complex.Complex complex91 = complex48.pow(complex87);
        org.apache.commons.math3.complex.Complex complex92 = complex20.add(complex87);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex27", complex1.equals(complex27) ? complex1.hashCode() == complex27.hashCode() : true);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math3.complex.Complex complex8 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double9 = complex8.getImaginary();
        org.apache.commons.math3.complex.Complex complex10 = complex8.negate();
        org.apache.commons.math3.complex.Complex complex12 = complex10.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex13 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex14 = complex10.subtract(complex13);
        org.apache.commons.math3.complex.Complex complex15 = complex5.divide(complex14);
        org.apache.commons.math3.complex.Complex complex17 = complex5.divide((double) ' ');
        double double18 = complex5.abs();
        org.apache.commons.math3.complex.Complex complex19 = complex5.negate();
        org.apache.commons.math3.complex.Complex complex20 = complex19.sqrt();
        org.apache.commons.math3.complex.Complex complex22 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex23 = complex22.exp();
        double double24 = complex22.getArgument();
        org.apache.commons.math3.complex.Complex complex26 = complex22.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex27 = complex22.sin();
        org.apache.commons.math3.complex.Complex complex28 = complex22.cosh();
        org.apache.commons.math3.complex.Complex complex29 = complex22.tan();
        org.apache.commons.math3.complex.Complex complex30 = complex22.tan();
        org.apache.commons.math3.complex.Complex complex32 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex33 = complex32.exp();
        double double34 = complex32.getArgument();
        org.apache.commons.math3.complex.Complex complex36 = complex32.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex37 = complex32.sin();
        org.apache.commons.math3.complex.Complex complex38 = complex32.cosh();
        org.apache.commons.math3.complex.Complex complex39 = complex32.tan();
        org.apache.commons.math3.complex.Complex complex40 = complex32.tan();
        org.apache.commons.math3.complex.Complex complex42 = complex32.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex43 = complex30.subtract(complex32);
        org.apache.commons.math3.complex.Complex complex46 = new org.apache.commons.math3.complex.Complex((double) 10, (double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex48 = complex46.add((double) (byte) 10);
        org.apache.commons.math3.complex.Complex complex50 = complex48.pow(1.0d);
        org.apache.commons.math3.complex.Complex complex51 = complex50.sin();
        org.apache.commons.math3.complex.Complex complex52 = complex30.multiply(complex51);
        org.apache.commons.math3.complex.Complex complex53 = complex19.divide(complex52);
        org.apache.commons.math3.complex.Complex complex54 = org.apache.commons.math3.complex.Complex.INF;
        double double55 = complex54.getImaginary();
        org.apache.commons.math3.complex.Complex complex56 = complex54.asin();
        org.apache.commons.math3.complex.Complex complex57 = complex19.divide(complex54);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex56 and complex1.", complex56.equals(complex1) == complex1.equals(complex56));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex7 = complex3.pow((double) 100L);
        org.apache.commons.math3.complex.Complex complex8 = complex3.reciprocal();
        org.apache.commons.math3.complex.Complex complex9 = complex3.tanh();
        org.apache.commons.math3.complex.ComplexField complexField10 = complex3.getField();
        org.apache.commons.math3.complex.Complex complex12 = complex3.multiply(0.03140559722642014d);
        org.apache.commons.math3.complex.Complex complex13 = complex3.sinh();
        org.apache.commons.math3.complex.Complex complex14 = complex13.sqrt();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex8", complex3.equals(complex8) ? complex3.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex2.cosh();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex1 and complex0.", complex1.equals(complex0) == complex0.equals(complex1));
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.sin();
        org.apache.commons.math3.complex.Complex complex8 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex9 = complex8.exp();
        double double10 = complex8.getArgument();
        org.apache.commons.math3.complex.Complex complex11 = complex8.log();
        org.apache.commons.math3.complex.Complex complex12 = complex11.log();
        org.apache.commons.math3.complex.Complex complex13 = complex6.pow(complex12);
        boolean boolean14 = complex13.isInfinite();
        org.apache.commons.math3.complex.Complex complex15 = complex13.atan();
        org.apache.commons.math3.complex.Complex complex16 = complex13.conjugate();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex16 and complex1.", complex16.equals(complex1) == complex1.equals(complex16));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double3 = complex2.getImaginary();
        org.apache.commons.math3.complex.Complex complex4 = complex2.negate();
        org.apache.commons.math3.complex.Complex complex6 = complex4.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex8 = complex4.subtract(complex7);
        org.apache.commons.math3.complex.Complex complex9 = complex4.acos();
        org.apache.commons.math3.complex.Complex complex10 = complex0.subtract(complex4);
        org.apache.commons.math3.complex.Complex complex11 = complex4.atan();
        org.apache.commons.math3.complex.Complex complex13 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex14 = complex13.exp();
        double double15 = complex13.getArgument();
        org.apache.commons.math3.complex.Complex complex17 = complex13.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex18 = complex13.exp();
        org.apache.commons.math3.complex.Complex complex21 = new org.apache.commons.math3.complex.Complex((double) (short) -1, (double) '4');
        org.apache.commons.math3.complex.Complex complex22 = complex21.cos();
        org.apache.commons.math3.complex.Complex complex23 = complex18.divide(complex22);
        org.apache.commons.math3.complex.Complex complex24 = complex4.subtract(complex23);
        org.apache.commons.math3.complex.Complex complex25 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex26 = complex25.exp();
        org.apache.commons.math3.complex.Complex complex27 = complex23.multiply(complex26);
        double double28 = complex27.getArgument();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex26 and complex0.", complex26.equals(complex0) == complex0.equals(complex26));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) (short) 10);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex4 = complex1.divide((double) (byte) 10);
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double7 = complex6.getImaginary();
        org.apache.commons.math3.complex.Complex complex8 = complex6.negate();
        org.apache.commons.math3.complex.Complex complex9 = complex8.reciprocal();
        boolean boolean10 = complex9.isNaN();
        org.apache.commons.math3.complex.Complex complex11 = complex4.add(complex9);
        boolean boolean12 = complex4.isInfinite();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex8 and complex9", complex8.equals(complex9) ? complex8.hashCode() == complex9.hashCode() : true);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex6 = complex1.sqrt1z();
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex8 = complex6.add(complex7);
        org.apache.commons.math3.complex.Complex complex10 = complex8.subtract((double) ' ');
        org.apache.commons.math3.complex.Complex complex12 = org.apache.commons.math3.complex.Complex.valueOf((double) (short) 10);
        double double13 = complex12.getImaginary();
        org.apache.commons.math3.complex.Complex complex15 = complex12.divide((double) (byte) 10);
        org.apache.commons.math3.complex.Complex complex17 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double18 = complex17.getImaginary();
        org.apache.commons.math3.complex.Complex complex19 = complex17.negate();
        org.apache.commons.math3.complex.Complex complex20 = complex19.reciprocal();
        boolean boolean21 = complex20.isNaN();
        org.apache.commons.math3.complex.Complex complex22 = complex15.add(complex20);
        org.apache.commons.math3.complex.Complex complex23 = complex8.divide(complex15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex19 and complex20", complex19.equals(complex20) ? complex19.hashCode() == complex20.hashCode() : true);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.acos();
        org.apache.commons.math3.complex.Complex complex6 = complex5.negate();
        org.apache.commons.math3.complex.Complex complex8 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double9 = complex8.getImaginary();
        org.apache.commons.math3.complex.Complex complex10 = complex8.negate();
        org.apache.commons.math3.complex.Complex complex12 = complex10.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex14 = complex10.pow((double) 100L);
        org.apache.commons.math3.complex.Complex complex15 = complex14.sin();
        org.apache.commons.math3.complex.Complex complex17 = complex15.divide((double) ' ');
        org.apache.commons.math3.complex.Complex complex18 = complex15.negate();
        org.apache.commons.math3.complex.Complex complex19 = complex5.subtract(complex15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex6", complex4.equals(complex6) ? complex4.hashCode() == complex6.hashCode() : true);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex7 = complex3.pow((double) 100L);
        org.apache.commons.math3.complex.Complex complex8 = complex3.reciprocal();
        org.apache.commons.math3.complex.Complex complex9 = complex3.tanh();
        org.apache.commons.math3.complex.ComplexField complexField10 = complex3.getField();
        org.apache.commons.math3.complex.Complex complex12 = complex3.multiply(0.03140559722642014d);
        org.apache.commons.math3.complex.Complex complex13 = complex3.sinh();
        org.apache.commons.math3.complex.Complex complex15 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double16 = complex15.getImaginary();
        org.apache.commons.math3.complex.Complex complex17 = complex15.negate();
        org.apache.commons.math3.complex.Complex complex18 = complex17.sinh();
        org.apache.commons.math3.complex.Complex complex19 = complex18.acos();
        org.apache.commons.math3.complex.Complex complex21 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex22 = complex21.exp();
        boolean boolean23 = complex22.isNaN();
        double double24 = complex22.getArgument();
        org.apache.commons.math3.complex.Complex complex25 = complex19.multiply(complex22);
        org.apache.commons.math3.complex.Complex complex26 = complex3.subtract(complex22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex8 and complex17", complex8.equals(complex17) ? complex8.hashCode() == complex17.hashCode() : true);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex6 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex8 = complex7.sqrt1z();
        org.apache.commons.math3.complex.Complex complex10 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double11 = complex10.getImaginary();
        org.apache.commons.math3.complex.Complex complex12 = complex10.negate();
        org.apache.commons.math3.complex.Complex complex13 = complex12.sinh();
        org.apache.commons.math3.complex.Complex complex14 = complex13.acos();
        org.apache.commons.math3.complex.Complex complex15 = complex8.divide(complex13);
        org.apache.commons.math3.complex.Complex complex16 = complex15.tan();
        org.apache.commons.math3.complex.Complex complex17 = complex1.pow(complex15);
        org.apache.commons.math3.complex.Complex complex19 = complex1.add((-3.141592653589793d));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex8 and complex17", complex8.equals(complex17) ? complex8.hashCode() == complex17.hashCode() : true);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex5.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex9 = complex5.negate();
        boolean boolean10 = complex5.isInfinite();
        org.apache.commons.math3.complex.Complex complex12 = complex5.pow((double) (-1.0f));
        org.apache.commons.math3.complex.Complex complex14 = new org.apache.commons.math3.complex.Complex((double) 0.0f);
        boolean boolean15 = complex14.isInfinite();
        org.apache.commons.math3.complex.Complex complex17 = complex14.pow((double) 0L);
        org.apache.commons.math3.complex.Complex complex19 = complex17.pow((double) (-1));
        org.apache.commons.math3.complex.Complex complex20 = complex12.pow(complex17);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex20 and complex1.", complex20.equals(complex1) == complex1.equals(complex20));
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex6 = complex1.sqrt1z();
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex8 = complex6.add(complex7);
        org.apache.commons.math3.complex.Complex complex9 = complex6.cosh();
        org.apache.commons.math3.complex.Complex complex10 = complex9.conjugate();
        org.apache.commons.math3.complex.Complex complex11 = complex10.log();
        org.apache.commons.math3.complex.Complex complex13 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex14 = complex13.exp();
        double double15 = complex13.getArgument();
        org.apache.commons.math3.complex.Complex complex17 = complex13.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex18 = complex13.sin();
        org.apache.commons.math3.complex.Complex complex19 = complex13.cosh();
        org.apache.commons.math3.complex.Complex complex21 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double22 = complex21.getImaginary();
        boolean boolean23 = complex19.equals((java.lang.Object) double22);
        org.apache.commons.math3.complex.Complex complex24 = complex19.tanh();
        org.apache.commons.math3.complex.Complex complex25 = complex19.tanh();
        org.apache.commons.math3.complex.Complex complex26 = complex19.sqrt1z();
        org.apache.commons.math3.complex.Complex complex27 = complex19.sqrt1z();
        org.apache.commons.math3.complex.Complex complex28 = complex11.pow(complex27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex10", complex1.equals(complex10) ? complex1.hashCode() == complex10.hashCode() : true);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex1 = complex0.sqrt1z();
        org.apache.commons.math3.complex.Complex complex3 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double4 = complex3.getImaginary();
        org.apache.commons.math3.complex.Complex complex5 = complex3.negate();
        org.apache.commons.math3.complex.Complex complex6 = complex5.sinh();
        org.apache.commons.math3.complex.Complex complex7 = complex6.acos();
        org.apache.commons.math3.complex.Complex complex8 = complex1.divide(complex6);
        org.apache.commons.math3.complex.Complex complex9 = complex8.tan();
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double12 = complex11.getImaginary();
        org.apache.commons.math3.complex.Complex complex13 = complex11.negate();
        org.apache.commons.math3.complex.Complex complex15 = complex13.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex16 = complex13.tanh();
        org.apache.commons.math3.complex.Complex complex17 = complex16.conjugate();
        org.apache.commons.math3.complex.Complex complex18 = complex9.divide(complex16);
        org.apache.commons.math3.complex.Complex complex20 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double21 = complex20.getImaginary();
        org.apache.commons.math3.complex.Complex complex22 = complex20.negate();
        org.apache.commons.math3.complex.Complex complex24 = complex22.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex26 = complex22.pow((double) 100L);
        org.apache.commons.math3.complex.Complex complex27 = complex26.sin();
        boolean boolean28 = complex27.isNaN();
        org.apache.commons.math3.complex.Complex complex29 = complex16.divide(complex27);
        org.apache.commons.math3.complex.Complex complex30 = complex29.asin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex16 and complex17", complex16.equals(complex17) ? complex16.hashCode() == complex17.hashCode() : true);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.acos();
        org.apache.commons.math3.complex.Complex complex4 = complex3.reciprocal();
        org.apache.commons.math3.complex.Complex complex6 = complex4.add(1.5430806348152437d);
        org.apache.commons.math3.complex.Complex complex8 = complex6.multiply((-35.0d));
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex8 and complex1.", complex8.equals(complex1) == complex1.equals(complex8));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex1 = complex0.exp();
        boolean boolean2 = complex0.isInfinite();
        org.apache.commons.math3.complex.Complex complex3 = complex0.conjugate();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList5 = complex0.nthRoot(1);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex1 and complex3.", complex1.equals(complex3) == complex3.equals(complex1));
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex6 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex8 = complex7.sqrt1z();
        org.apache.commons.math3.complex.Complex complex10 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double11 = complex10.getImaginary();
        org.apache.commons.math3.complex.Complex complex12 = complex10.negate();
        org.apache.commons.math3.complex.Complex complex13 = complex12.sinh();
        org.apache.commons.math3.complex.Complex complex14 = complex13.acos();
        org.apache.commons.math3.complex.Complex complex15 = complex8.divide(complex13);
        org.apache.commons.math3.complex.Complex complex16 = complex15.tan();
        org.apache.commons.math3.complex.Complex complex17 = complex1.pow(complex15);
        org.apache.commons.math3.complex.ComplexField complexField18 = complex15.getField();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex17", complex1.equals(complex17) ? complex1.hashCode() == complex17.hashCode() : true);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tanh();
        org.apache.commons.math3.complex.Complex complex4 = complex3.log();
        org.apache.commons.math3.complex.Complex complex5 = complex3.acos();
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double8 = complex7.getImaginary();
        org.apache.commons.math3.complex.Complex complex9 = complex7.negate();
        org.apache.commons.math3.complex.Complex complex10 = complex9.reciprocal();
        boolean boolean11 = complex10.isNaN();
        double double12 = complex10.getArgument();
        org.apache.commons.math3.complex.Complex complex13 = complex3.subtract(complex10);
        org.apache.commons.math3.complex.ComplexField complexField14 = complex10.getField();
        org.apache.commons.math3.complex.Complex complex15 = complex10.asin();
        org.apache.commons.math3.complex.Complex complex16 = complex10.cos();
        org.apache.commons.math3.complex.Complex complex17 = complex16.tanh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex9 and complex10", complex9.equals(complex10) ? complex9.hashCode() == complex10.hashCode() : true);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.sin();
        org.apache.commons.math3.complex.Complex complex7 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double10 = complex9.getImaginary();
        boolean boolean11 = complex7.equals((java.lang.Object) double10);
        org.apache.commons.math3.complex.Complex complex12 = complex7.tanh();
        org.apache.commons.math3.complex.Complex complex13 = complex7.tanh();
        org.apache.commons.math3.complex.Complex complex15 = complex7.multiply(0.0d);
        org.apache.commons.math3.complex.Complex complex16 = complex15.reciprocal();
        org.apache.commons.math3.complex.Complex complex17 = complex15.sqrt1z();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex16 and complex1.", complex16.equals(complex1) == complex1.equals(complex16));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex4.log();
        org.apache.commons.math3.complex.Complex complex6 = complex4.reciprocal();
        org.apache.commons.math3.complex.Complex complex8 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double9 = complex8.getImaginary();
        org.apache.commons.math3.complex.Complex complex10 = complex8.negate();
        org.apache.commons.math3.complex.Complex complex11 = complex10.sinh();
        org.apache.commons.math3.complex.Complex complex12 = complex11.acos();
        org.apache.commons.math3.complex.Complex complex14 = complex11.pow((double) 100.0f);
        org.apache.commons.math3.complex.Complex complex15 = complex6.divide(complex11);
        double double16 = complex11.getReal();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex6 and complex1.", complex6.equals(complex1) == complex1.equals(complex6));
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math3.complex.Complex complex7 = complex5.reciprocal();
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double10 = complex9.getImaginary();
        org.apache.commons.math3.complex.Complex complex11 = complex9.negate();
        org.apache.commons.math3.complex.Complex complex13 = complex11.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex14 = complex13.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList16 = complex13.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex18 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex19 = complex18.exp();
        org.apache.commons.math3.complex.Complex complex20 = complex18.tanh();
        org.apache.commons.math3.complex.Complex complex21 = complex13.subtract(complex18);
        org.apache.commons.math3.complex.Complex complex22 = complex7.multiply(complex13);
        org.apache.commons.math3.complex.Complex complex23 = complex22.atan();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex7", complex1.equals(complex7) ? complex1.hashCode() == complex7.hashCode() : true);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 10, (double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex4 = complex2.add((double) (byte) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex4.pow(1.0d);
        org.apache.commons.math3.complex.Complex complex7 = complex6.sin();
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex10 = complex9.exp();
        double double11 = complex9.getArgument();
        org.apache.commons.math3.complex.Complex complex12 = complex9.log();
        org.apache.commons.math3.complex.Complex complex13 = complex9.log();
        org.apache.commons.math3.complex.Complex complex15 = complex13.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex16 = complex6.multiply(complex13);
        org.apache.commons.math3.complex.Complex complex17 = complex16.conjugate();
        double double18 = complex16.getImaginary();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex12 and complex17", complex12.equals(complex17) ? complex12.hashCode() == complex17.hashCode() : true);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex1 = complex0.sqrt1z();
        org.apache.commons.math3.complex.Complex complex3 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double4 = complex3.getImaginary();
        org.apache.commons.math3.complex.Complex complex5 = complex3.negate();
        org.apache.commons.math3.complex.Complex complex6 = complex5.sinh();
        org.apache.commons.math3.complex.Complex complex7 = complex6.acos();
        org.apache.commons.math3.complex.Complex complex8 = complex1.divide(complex6);
        org.apache.commons.math3.complex.Complex complex9 = complex8.tan();
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double12 = complex11.getImaginary();
        org.apache.commons.math3.complex.Complex complex13 = complex11.negate();
        org.apache.commons.math3.complex.Complex complex15 = complex13.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex16 = complex13.tanh();
        org.apache.commons.math3.complex.Complex complex17 = complex16.conjugate();
        org.apache.commons.math3.complex.Complex complex18 = complex9.divide(complex16);
        org.apache.commons.math3.complex.Complex complex20 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double21 = complex20.getImaginary();
        org.apache.commons.math3.complex.Complex complex22 = complex20.negate();
        org.apache.commons.math3.complex.Complex complex24 = complex22.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex26 = complex22.pow((double) 100L);
        org.apache.commons.math3.complex.Complex complex27 = complex26.sin();
        boolean boolean28 = complex27.isNaN();
        org.apache.commons.math3.complex.Complex complex29 = complex16.divide(complex27);
        org.apache.commons.math3.complex.Complex complex31 = complex29.multiply((double) (byte) -1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex16 and complex17", complex16.equals(complex17) ? complex16.hashCode() == complex17.hashCode() : true);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) (short) 1, (double) (byte) 1);
        org.apache.commons.math3.complex.Complex complex4 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double5 = complex4.getImaginary();
        org.apache.commons.math3.complex.Complex complex6 = complex4.negate();
        org.apache.commons.math3.complex.Complex complex8 = complex6.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex9 = complex8.atan();
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex12 = complex11.exp();
        double double13 = complex11.getArgument();
        org.apache.commons.math3.complex.Complex complex15 = complex11.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex16 = complex11.sin();
        org.apache.commons.math3.complex.Complex complex17 = complex11.cosh();
        org.apache.commons.math3.complex.Complex complex19 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double20 = complex19.getImaginary();
        boolean boolean21 = complex17.equals((java.lang.Object) double20);
        org.apache.commons.math3.complex.Complex complex22 = complex17.tanh();
        org.apache.commons.math3.complex.Complex complex23 = complex8.subtract(complex22);
        org.apache.commons.math3.complex.Complex complex24 = complex22.cosh();
        org.apache.commons.math3.complex.Complex complex25 = complex22.cos();
        org.apache.commons.math3.complex.Complex complex26 = complex2.subtract(complex25);
        org.apache.commons.math3.complex.Complex complex28 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex29 = complex28.sqrt();
        org.apache.commons.math3.complex.Complex complex31 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double32 = complex31.getImaginary();
        org.apache.commons.math3.complex.Complex complex34 = complex31.pow((double) 100L);
        org.apache.commons.math3.complex.Complex complex35 = complex29.pow(complex34);
        double double36 = complex34.abs();
        org.apache.commons.math3.complex.Complex complex37 = complex34.acos();
        org.apache.commons.math3.complex.Complex complex39 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double40 = complex39.getImaginary();
        org.apache.commons.math3.complex.Complex complex41 = complex39.negate();
        org.apache.commons.math3.complex.Complex complex42 = complex41.cosh();
        org.apache.commons.math3.complex.Complex complex43 = complex42.conjugate();
        boolean boolean44 = complex34.equals((java.lang.Object) complex42);
        org.apache.commons.math3.complex.Complex complex45 = complex26.add(complex42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex43", complex17.equals(complex43) ? complex17.hashCode() == complex43.hashCode() : true);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.sin();
        org.apache.commons.math3.complex.Complex complex7 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex8 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex9 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex12 = complex11.exp();
        double double13 = complex11.getArgument();
        org.apache.commons.math3.complex.Complex complex15 = complex11.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex16 = complex11.sin();
        org.apache.commons.math3.complex.Complex complex17 = complex11.cosh();
        org.apache.commons.math3.complex.Complex complex18 = complex11.tan();
        org.apache.commons.math3.complex.Complex complex19 = complex11.tan();
        org.apache.commons.math3.complex.Complex complex21 = complex11.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex22 = complex9.subtract(complex11);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList24 = complex22.nthRoot((int) '4');
        org.apache.commons.math3.complex.Complex complex25 = complex22.cos();
        org.apache.commons.math3.complex.Complex complex26 = complex22.sin();
        org.apache.commons.math3.complex.Complex complex27 = complex26.cosh();
        org.apache.commons.math3.complex.Complex complex28 = complex27.acos();
        org.apache.commons.math3.complex.ComplexField complexField29 = complex27.getField();
        org.apache.commons.math3.complex.Complex complex31 = new org.apache.commons.math3.complex.Complex((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex32 = complex27.pow(complex31);
        org.apache.commons.math3.complex.Complex complex34 = complex31.add(100.0d);
        org.apache.commons.math3.complex.Complex complex35 = complex31.log();
        org.apache.commons.math3.complex.Complex complex36 = complex35.sinh();
        org.apache.commons.math3.complex.Complex complex38 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
        org.apache.commons.math3.complex.Complex complex40 = complex38.pow(0.0d);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList42 = complex38.nthRoot((int) (byte) 10);
        org.apache.commons.math3.complex.Complex complex44 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double45 = complex44.getImaginary();
        org.apache.commons.math3.complex.Complex complex46 = complex44.negate();
        org.apache.commons.math3.complex.Complex complex48 = complex46.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex49 = complex48.atan();
        org.apache.commons.math3.complex.Complex complex51 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double52 = complex51.getImaginary();
        org.apache.commons.math3.complex.Complex complex53 = complex51.negate();
        org.apache.commons.math3.complex.Complex complex55 = complex53.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex56 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex57 = complex53.subtract(complex56);
        org.apache.commons.math3.complex.Complex complex58 = complex48.divide(complex57);
        org.apache.commons.math3.complex.Complex complex61 = org.apache.commons.math3.complex.Complex.valueOf(0.0d, (double) (byte) -1);
        org.apache.commons.math3.complex.Complex complex62 = complex48.pow(complex61);
        org.apache.commons.math3.complex.Complex complex63 = complex62.sqrt1z();
        org.apache.commons.math3.complex.Complex complex65 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex66 = complex65.exp();
        double double67 = complex65.getArgument();
        org.apache.commons.math3.complex.Complex complex69 = complex65.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex70 = complex65.sin();
        org.apache.commons.math3.complex.Complex complex71 = complex65.cosh();
        org.apache.commons.math3.complex.Complex complex72 = complex65.tan();
        org.apache.commons.math3.complex.Complex complex74 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex75 = complex74.exp();
        double double76 = complex74.getArgument();
        org.apache.commons.math3.complex.Complex complex78 = complex74.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex79 = complex74.sin();
        org.apache.commons.math3.complex.Complex complex80 = complex74.cosh();
        org.apache.commons.math3.complex.Complex complex81 = complex74.tan();
        org.apache.commons.math3.complex.Complex complex82 = complex74.tan();
        org.apache.commons.math3.complex.Complex complex84 = complex74.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex85 = complex72.pow(complex84);
        org.apache.commons.math3.complex.Complex complex86 = complex62.multiply(complex85);
        org.apache.commons.math3.complex.Complex complex87 = complex38.divide(complex85);
        org.apache.commons.math3.complex.Complex complex88 = complex35.add(complex85);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex36 and complex1.", complex36.equals(complex1) == complex1.equals(complex36));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex1 = complex0.exp();
        boolean boolean2 = complex0.isInfinite();
        org.apache.commons.math3.complex.Complex complex3 = complex0.conjugate();
        org.apache.commons.math3.complex.Complex complex6 = new org.apache.commons.math3.complex.Complex(10.0d, (double) 100L);
        org.apache.commons.math3.complex.Complex complex8 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex9 = complex8.sqrt();
        org.apache.commons.math3.complex.Complex complex10 = complex6.multiply(complex9);
        org.apache.commons.math3.complex.Complex complex12 = complex9.pow((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex14 = complex12.add((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex15 = complex0.add(complex14);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex1 and complex3.", complex1.equals(complex3) == complex3.equals(complex1));
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex7 = complex3.pow((double) 100L);
        org.apache.commons.math3.complex.Complex complex8 = complex3.reciprocal();
        org.apache.commons.math3.complex.Complex complex9 = complex8.asin();
        org.apache.commons.math3.complex.Complex complex12 = new org.apache.commons.math3.complex.Complex((double) (short) -1, (double) '4');
        org.apache.commons.math3.complex.Complex complex13 = complex12.cos();
        org.apache.commons.math3.complex.Complex complex15 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex16 = complex15.sqrt();
        org.apache.commons.math3.complex.Complex complex17 = complex15.sqrt();
        org.apache.commons.math3.complex.Complex complex18 = complex17.tanh();
        org.apache.commons.math3.complex.Complex complex19 = complex12.divide(complex17);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList21 = complex17.nthRoot((int) 'a');
        org.apache.commons.math3.complex.Complex complex22 = complex8.divide(complex17);
        double double23 = complex22.abs();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex8", complex3.equals(complex8) ? complex3.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.sin();
        org.apache.commons.math3.complex.Complex complex7 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex8 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex9 = complex8.conjugate();
        org.apache.commons.math3.complex.Complex complex10 = complex9.sqrt1z();
        org.apache.commons.math3.complex.Complex complex11 = complex9.conjugate();
        double double12 = complex11.abs();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex8 and complex9", complex8.equals(complex9) ? complex8.hashCode() == complex9.hashCode() : true);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) (byte) 100, 0.0d);
        org.apache.commons.math3.complex.Complex complex3 = complex2.log();
        org.apache.commons.math3.complex.Complex complex4 = complex2.conjugate();
        boolean boolean5 = complex2.isNaN();
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex8 = complex7.exp();
        double double9 = complex7.getArgument();
        org.apache.commons.math3.complex.Complex complex10 = complex7.log();
        org.apache.commons.math3.complex.Complex complex11 = complex7.log();
        org.apache.commons.math3.complex.Complex complex12 = complex7.sqrt1z();
        org.apache.commons.math3.complex.Complex complex13 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex14 = complex12.add(complex13);
        org.apache.commons.math3.complex.Complex complex16 = complex14.subtract((double) ' ');
        org.apache.commons.math3.complex.Complex complex17 = complex16.negate();
        double double18 = complex16.getArgument();
        org.apache.commons.math3.complex.Complex complex20 = complex16.pow(0.0d);
        org.apache.commons.math3.complex.Complex complex23 = new org.apache.commons.math3.complex.Complex((double) 'a', 0.0d);
        org.apache.commons.math3.complex.Complex complex24 = complex23.negate();
        org.apache.commons.math3.complex.Complex complex25 = complex20.subtract(complex23);
        org.apache.commons.math3.complex.Complex complex26 = complex2.subtract(complex23);
        boolean boolean27 = complex23.isNaN();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex4", complex2.equals(complex4) ? complex2.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) (byte) 100, 0.0d);
        org.apache.commons.math3.complex.Complex complex3 = complex2.sqrt();
        org.apache.commons.math3.complex.Complex complex4 = complex2.log();
        org.apache.commons.math3.complex.Complex complex6 = complex4.multiply((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex8 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double9 = complex8.getImaginary();
        org.apache.commons.math3.complex.Complex complex10 = complex8.negate();
        org.apache.commons.math3.complex.Complex complex12 = complex10.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex14 = complex10.pow((double) 100L);
        org.apache.commons.math3.complex.Complex complex15 = complex14.sin();
        double double16 = complex14.abs();
        org.apache.commons.math3.complex.Complex complex17 = complex14.atan();
        org.apache.commons.math3.complex.Complex complex19 = complex17.pow(1.0349512282932293E22d);
        org.apache.commons.math3.complex.Complex complex20 = complex6.divide(complex17);
        org.apache.commons.math3.complex.Complex complex21 = complex6.sin();
        org.apache.commons.math3.complex.Complex complex22 = complex21.reciprocal();
        double double23 = complex21.abs();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex22 and complex2.", complex22.equals(complex2) == complex2.equals(complex22));
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex5.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex10 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex11 = complex10.exp();
        org.apache.commons.math3.complex.Complex complex12 = complex10.tanh();
        org.apache.commons.math3.complex.Complex complex13 = complex5.subtract(complex10);
        org.apache.commons.math3.complex.Complex complex14 = complex5.cos();
        org.apache.commons.math3.complex.Complex complex15 = complex14.tan();
        org.apache.commons.math3.complex.Complex complex17 = complex15.multiply((double) (short) 1);
        boolean boolean18 = complex17.isInfinite();
        org.apache.commons.math3.complex.Complex complex19 = complex17.atan();
        org.apache.commons.math3.complex.Complex complex20 = complex19.negate();
        boolean boolean21 = complex20.isInfinite();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex14 and complex19", complex14.equals(complex19) ? complex14.hashCode() == complex19.hashCode() : true);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex5.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex10 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex11 = complex10.exp();
        org.apache.commons.math3.complex.Complex complex12 = complex10.tanh();
        org.apache.commons.math3.complex.Complex complex13 = complex5.subtract(complex10);
        org.apache.commons.math3.complex.Complex complex14 = complex5.asin();
        java.lang.String str15 = complex14.toString();
        org.apache.commons.math3.complex.Complex complex17 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex18 = complex17.exp();
        double double19 = complex17.getArgument();
        org.apache.commons.math3.complex.Complex complex21 = complex17.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex22 = complex17.sin();
        org.apache.commons.math3.complex.Complex complex23 = complex17.cosh();
        org.apache.commons.math3.complex.Complex complex24 = complex17.tan();
        org.apache.commons.math3.complex.Complex complex25 = complex17.tan();
        org.apache.commons.math3.complex.Complex complex27 = complex17.subtract((double) (short) -1);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList29 = complex17.nthRoot(100);
        org.apache.commons.math3.complex.Complex complex30 = complex17.sinh();
        org.apache.commons.math3.complex.Complex complex31 = complex14.divide(complex17);
        org.apache.commons.math3.complex.Complex complex32 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex33 = complex32.sqrt1z();
        org.apache.commons.math3.complex.Complex complex34 = complex32.sqrt();
        org.apache.commons.math3.complex.Complex complex35 = complex31.pow(complex32);
        org.apache.commons.math3.complex.Complex complex37 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex38 = complex37.exp();
        double double39 = complex37.getArgument();
        org.apache.commons.math3.complex.Complex complex41 = complex37.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex42 = complex37.sin();
        org.apache.commons.math3.complex.Complex complex43 = complex37.cosh();
        org.apache.commons.math3.complex.Complex complex44 = complex37.tan();
        org.apache.commons.math3.complex.Complex complex45 = complex37.tan();
        org.apache.commons.math3.complex.Complex complex47 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex48 = complex47.exp();
        double double49 = complex47.getArgument();
        org.apache.commons.math3.complex.Complex complex51 = complex47.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex52 = complex47.sin();
        org.apache.commons.math3.complex.Complex complex53 = complex47.cosh();
        org.apache.commons.math3.complex.Complex complex54 = complex47.tan();
        org.apache.commons.math3.complex.Complex complex55 = complex47.tan();
        org.apache.commons.math3.complex.Complex complex57 = complex47.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex58 = complex45.subtract(complex47);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList60 = complex58.nthRoot((int) '4');
        org.apache.commons.math3.complex.Complex complex61 = complex58.cos();
        org.apache.commons.math3.complex.Complex complex62 = complex58.sin();
        org.apache.commons.math3.complex.Complex complex63 = complex58.atan();
        org.apache.commons.math3.complex.Complex complex64 = complex63.sin();
        org.apache.commons.math3.complex.Complex complex65 = complex31.subtract(complex64);
        org.apache.commons.math3.complex.Complex complex67 = complex64.subtract((-1.0d));
        org.apache.commons.math3.complex.Complex complex69 = complex64.multiply((double) 0);
        org.apache.commons.math3.complex.Complex complex71 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex72 = complex71.exp();
        double double73 = complex71.getArgument();
        org.apache.commons.math3.complex.Complex complex74 = complex71.log();
        org.apache.commons.math3.complex.Complex complex75 = complex71.log();
        org.apache.commons.math3.complex.Complex complex76 = complex71.sqrt1z();
        boolean boolean77 = complex71.isNaN();
        org.apache.commons.math3.complex.Complex complex78 = complex71.log();
        org.apache.commons.math3.complex.Complex complex79 = complex78.reciprocal();
        org.apache.commons.math3.complex.Complex complex80 = complex64.add(complex79);
        boolean boolean81 = complex79.isNaN();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex79 and complex1.", complex79.equals(complex1) == complex1.equals(complex79));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex5.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex10 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex11 = complex10.exp();
        org.apache.commons.math3.complex.Complex complex12 = complex10.tanh();
        org.apache.commons.math3.complex.Complex complex13 = complex5.subtract(complex10);
        org.apache.commons.math3.complex.Complex complex14 = complex13.asin();
        org.apache.commons.math3.complex.Complex complex17 = new org.apache.commons.math3.complex.Complex((double) 10, (double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex19 = complex17.add((double) (byte) 10);
        org.apache.commons.math3.complex.Complex complex21 = complex19.pow(1.0d);
        org.apache.commons.math3.complex.Complex complex22 = complex21.sin();
        org.apache.commons.math3.complex.Complex complex24 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex25 = complex24.exp();
        double double26 = complex24.getArgument();
        org.apache.commons.math3.complex.Complex complex27 = complex24.log();
        org.apache.commons.math3.complex.Complex complex28 = complex24.log();
        org.apache.commons.math3.complex.Complex complex30 = complex28.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex31 = complex21.multiply(complex28);
        org.apache.commons.math3.complex.Complex complex33 = complex28.divide(1.0349512282932293E22d);
        org.apache.commons.math3.complex.Complex complex34 = complex28.cosh();
        org.apache.commons.math3.complex.Complex complex37 = org.apache.commons.math3.complex.Complex.valueOf(0.0d, (double) (byte) -1);
        org.apache.commons.math3.complex.Complex complex38 = complex37.sinh();
        org.apache.commons.math3.complex.Complex complex39 = complex38.sinh();
        org.apache.commons.math3.complex.Complex complex40 = complex38.tanh();
        org.apache.commons.math3.complex.Complex complex41 = complex38.sinh();
        org.apache.commons.math3.complex.Complex complex42 = complex28.pow(complex41);
        boolean boolean43 = complex14.equals((java.lang.Object) complex28);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex42 and complex1.", complex42.equals(complex1) == complex1.equals(complex42));
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex3.reciprocal();
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex7 = complex6.exp();
        double double8 = complex6.getArgument();
        org.apache.commons.math3.complex.Complex complex10 = complex6.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex11 = complex6.sin();
        org.apache.commons.math3.complex.Complex complex12 = complex6.cosh();
        org.apache.commons.math3.complex.Complex complex13 = complex6.tan();
        org.apache.commons.math3.complex.Complex complex14 = complex6.tan();
        org.apache.commons.math3.complex.Complex complex15 = complex3.add(complex14);
        org.apache.commons.math3.complex.Complex complex17 = complex3.multiply((int) '#');
        org.apache.commons.math3.complex.Complex complex18 = complex3.acos();
        org.apache.commons.math3.complex.Complex complex20 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex21 = complex20.exp();
        double double22 = complex20.getArgument();
        org.apache.commons.math3.complex.Complex complex24 = complex20.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex25 = complex20.sin();
        org.apache.commons.math3.complex.Complex complex26 = complex20.cosh();
        org.apache.commons.math3.complex.Complex complex27 = complex20.tan();
        org.apache.commons.math3.complex.Complex complex29 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex30 = complex29.exp();
        double double31 = complex29.getArgument();
        org.apache.commons.math3.complex.Complex complex33 = complex29.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex34 = complex29.sin();
        org.apache.commons.math3.complex.Complex complex35 = complex29.cosh();
        org.apache.commons.math3.complex.Complex complex36 = complex29.tan();
        org.apache.commons.math3.complex.Complex complex37 = complex29.tan();
        org.apache.commons.math3.complex.Complex complex39 = complex29.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex40 = complex27.pow(complex39);
        org.apache.commons.math3.complex.Complex complex42 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex43 = complex42.exp();
        org.apache.commons.math3.complex.Complex complex44 = complex42.tan();
        org.apache.commons.math3.complex.Complex complex46 = complex42.pow((-0.0d));
        org.apache.commons.math3.complex.Complex complex47 = complex39.divide(complex46);
        org.apache.commons.math3.complex.Complex complex48 = complex3.subtract(complex47);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex46", complex1.equals(complex46) ? complex1.hashCode() == complex46.hashCode() : true);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex3 = complex2.exp();
        org.apache.commons.math3.complex.Complex complex4 = complex1.pow(complex2);
        boolean boolean5 = complex1.isNaN();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex3 and complex2.", complex3.equals(complex2) == complex2.equals(complex3));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex4.exp();
        org.apache.commons.math3.complex.Complex complex7 = complex4.multiply((int) (short) 1);
        org.apache.commons.math3.complex.Complex complex8 = complex4.cos();
        org.apache.commons.math3.complex.Complex complex10 = complex8.add(8.509181282393216d);
        org.apache.commons.math3.complex.Complex complex11 = complex10.sqrt1z();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex8", complex1.equals(complex8) ? complex1.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex5.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex10 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex11 = complex10.exp();
        org.apache.commons.math3.complex.Complex complex12 = complex10.tanh();
        org.apache.commons.math3.complex.Complex complex13 = complex5.subtract(complex10);
        org.apache.commons.math3.complex.Complex complex14 = complex5.cos();
        org.apache.commons.math3.complex.Complex complex15 = complex14.tan();
        org.apache.commons.math3.complex.Complex complex17 = complex15.multiply((double) (short) 1);
        boolean boolean18 = complex17.isInfinite();
        org.apache.commons.math3.complex.Complex complex19 = complex17.atan();
        org.apache.commons.math3.complex.Complex complex20 = complex19.exp();
        boolean boolean21 = complex20.isInfinite();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex14 and complex19", complex14.equals(complex19) ? complex14.hashCode() == complex19.hashCode() : true);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex7 = complex3.pow((double) 100L);
        org.apache.commons.math3.complex.Complex complex8 = complex7.sin();
        double double9 = complex7.abs();
        org.apache.commons.math3.complex.Complex complex11 = complex7.multiply((int) '#');
        org.apache.commons.math3.complex.Complex complex13 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex14 = complex13.exp();
        org.apache.commons.math3.complex.Complex complex15 = complex13.tan();
        org.apache.commons.math3.complex.Complex complex17 = complex13.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex18 = complex17.log();
        org.apache.commons.math3.complex.Complex complex20 = complex17.subtract((double) 10L);
        boolean boolean21 = complex20.isInfinite();
        boolean boolean22 = complex20.isNaN();
        org.apache.commons.math3.complex.Complex complex23 = complex20.sqrt1z();
        org.apache.commons.math3.complex.Complex complex25 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double26 = complex25.getImaginary();
        org.apache.commons.math3.complex.Complex complex27 = complex25.negate();
        org.apache.commons.math3.complex.Complex complex28 = complex27.reciprocal();
        org.apache.commons.math3.complex.Complex complex30 = complex27.divide(100.0d);
        org.apache.commons.math3.complex.Complex complex31 = complex27.sqrt1z();
        org.apache.commons.math3.complex.Complex complex32 = complex20.multiply(complex27);
        boolean boolean33 = complex7.equals((java.lang.Object) complex20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex28", complex3.equals(complex28) ? complex3.hashCode() == complex28.hashCode() : true);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex7 = complex3.pow((double) 100L);
        org.apache.commons.math3.complex.Complex complex8 = complex7.sin();
        org.apache.commons.math3.complex.Complex complex10 = complex8.divide((double) ' ');
        org.apache.commons.math3.complex.Complex complex12 = complex10.multiply((int) (short) 0);
        org.apache.commons.math3.complex.Complex complex13 = complex12.cosh();
        org.apache.commons.math3.complex.Complex complex14 = complex12.cosh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex13", complex1.equals(complex13) ? complex1.hashCode() == complex13.hashCode() : true);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf(0.0d, (double) ' ');
        org.apache.commons.math3.complex.Complex complex4 = complex2.pow(1.0349512282932293E22d);
        org.apache.commons.math3.complex.Complex complex5 = complex4.atan();
        org.apache.commons.math3.complex.Complex complex6 = complex5.tan();
        org.apache.commons.math3.complex.Complex complex7 = complex6.tan();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex7 and complex2.", complex7.equals(complex2) == complex2.equals(complex7));
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex6 = complex1.acos();
        org.apache.commons.math3.complex.Complex complex7 = complex6.cosh();
        org.apache.commons.math3.complex.Complex complex8 = complex7.negate();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex6", complex4.equals(complex6) ? complex4.hashCode() == complex6.hashCode() : true);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math3.complex.Complex complex4 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double5 = complex4.getImaginary();
        org.apache.commons.math3.complex.Complex complex7 = complex4.pow((double) 100L);
        org.apache.commons.math3.complex.Complex complex8 = complex2.pow(complex7);
        double double9 = complex7.abs();
        org.apache.commons.math3.complex.Complex complex10 = complex7.acos();
        org.apache.commons.math3.complex.Complex complex11 = complex7.sqrt1z();
        org.apache.commons.math3.complex.Complex complex13 = complex7.multiply(0.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex10 and complex11", complex10.equals(complex11) ? complex10.hashCode() == complex11.hashCode() : true);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.sin();
        org.apache.commons.math3.complex.Complex complex7 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex8 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex9 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex12 = complex11.exp();
        double double13 = complex11.getArgument();
        org.apache.commons.math3.complex.Complex complex15 = complex11.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex16 = complex11.sin();
        org.apache.commons.math3.complex.Complex complex17 = complex11.cosh();
        org.apache.commons.math3.complex.Complex complex18 = complex11.tan();
        org.apache.commons.math3.complex.Complex complex19 = complex11.tan();
        org.apache.commons.math3.complex.Complex complex21 = complex11.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex22 = complex9.subtract(complex11);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList24 = complex22.nthRoot((int) '4');
        org.apache.commons.math3.complex.Complex complex26 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double27 = complex26.getImaginary();
        org.apache.commons.math3.complex.Complex complex28 = complex22.divide(complex26);
        org.apache.commons.math3.complex.Complex complex29 = complex22.conjugate();
        org.apache.commons.math3.complex.Complex complex31 = complex29.subtract((double) 0L);
        org.apache.commons.math3.complex.Complex complex33 = complex29.pow(0.8509181282393216d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex22 and complex31", complex22.equals(complex31) ? complex22.hashCode() == complex31.hashCode() : true);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex7 = complex3.pow((double) 100L);
        org.apache.commons.math3.complex.Complex complex8 = complex3.reciprocal();
        org.apache.commons.math3.complex.Complex complex9 = complex3.tanh();
        org.apache.commons.math3.complex.ComplexField complexField10 = complex3.getField();
        org.apache.commons.math3.complex.Complex complex12 = complex3.multiply(0.03140559722642014d);
        org.apache.commons.math3.complex.Complex complex13 = complex3.sinh();
        org.apache.commons.math3.complex.ComplexField complexField14 = complex13.getField();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex8", complex3.equals(complex8) ? complex3.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.sin();
        org.apache.commons.math3.complex.Complex complex7 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex8 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex9 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex12 = complex11.exp();
        double double13 = complex11.getArgument();
        org.apache.commons.math3.complex.Complex complex15 = complex11.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex16 = complex11.sin();
        org.apache.commons.math3.complex.Complex complex17 = complex11.cosh();
        org.apache.commons.math3.complex.Complex complex18 = complex11.tan();
        org.apache.commons.math3.complex.Complex complex19 = complex11.tan();
        org.apache.commons.math3.complex.Complex complex21 = complex11.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex22 = complex9.subtract(complex11);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList24 = complex22.nthRoot((int) '4');
        org.apache.commons.math3.complex.Complex complex25 = complex22.cos();
        org.apache.commons.math3.complex.Complex complex26 = complex22.sin();
        org.apache.commons.math3.complex.Complex complex27 = complex26.conjugate();
        org.apache.commons.math3.complex.Complex complex28 = complex26.tan();
        org.apache.commons.math3.complex.Complex complex30 = complex28.multiply(1.1105228976479364d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex26 and complex27", complex26.equals(complex27) ? complex26.hashCode() == complex27.hashCode() : true);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex7 = complex3.pow((double) 100L);
        org.apache.commons.math3.complex.Complex complex8 = complex3.acos();
        org.apache.commons.math3.complex.Complex complex10 = complex8.pow((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex12 = complex10.pow(0.0d);
        org.apache.commons.math3.complex.Complex complex14 = complex10.pow(0.7615941559557649d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex12", complex1.equals(complex12) ? complex1.hashCode() == complex12.hashCode() : true);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.sin();
        org.apache.commons.math3.complex.Complex complex7 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex8 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex9 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex12 = complex11.exp();
        double double13 = complex11.getArgument();
        org.apache.commons.math3.complex.Complex complex15 = complex11.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex16 = complex11.sin();
        org.apache.commons.math3.complex.Complex complex17 = complex11.cosh();
        org.apache.commons.math3.complex.Complex complex18 = complex11.tan();
        org.apache.commons.math3.complex.Complex complex19 = complex11.tan();
        org.apache.commons.math3.complex.Complex complex21 = complex11.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex22 = complex9.subtract(complex11);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList24 = complex22.nthRoot((int) '4');
        org.apache.commons.math3.complex.Complex complex26 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double27 = complex26.getImaginary();
        org.apache.commons.math3.complex.Complex complex28 = complex22.divide(complex26);
        org.apache.commons.math3.complex.Complex complex29 = complex22.conjugate();
        org.apache.commons.math3.complex.Complex complex31 = complex29.subtract((double) 0L);
        boolean boolean32 = complex29.isNaN();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex22 and complex31", complex22.equals(complex31) ? complex22.hashCode() == complex31.hashCode() : true);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.sin();
        org.apache.commons.math3.complex.Complex complex7 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex8 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex9 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex12 = complex11.exp();
        double double13 = complex11.getArgument();
        org.apache.commons.math3.complex.Complex complex15 = complex11.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex16 = complex11.sin();
        org.apache.commons.math3.complex.Complex complex17 = complex11.cosh();
        org.apache.commons.math3.complex.Complex complex18 = complex11.tan();
        org.apache.commons.math3.complex.Complex complex19 = complex11.tan();
        org.apache.commons.math3.complex.Complex complex21 = complex11.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex22 = complex9.subtract(complex11);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList24 = complex22.nthRoot((int) '4');
        org.apache.commons.math3.complex.Complex complex26 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double27 = complex26.getImaginary();
        org.apache.commons.math3.complex.Complex complex28 = complex22.divide(complex26);
        org.apache.commons.math3.complex.Complex complex29 = complex22.conjugate();
        double double30 = complex22.getReal();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex28 and complex29", complex28.equals(complex29) ? complex28.hashCode() == complex29.hashCode() : true);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex7 = complex3.pow((double) 100L);
        org.apache.commons.math3.complex.Complex complex8 = complex3.acos();
        org.apache.commons.math3.complex.Complex complex10 = complex8.pow((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex12 = complex10.pow(0.0d);
        org.apache.commons.math3.complex.Complex complex13 = complex12.sqrt();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex10", complex1.equals(complex10) ? complex1.hashCode() == complex10.hashCode() : true);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex6 = complex1.sqrt1z();
        double double7 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex10 = complex9.exp();
        org.apache.commons.math3.complex.Complex complex11 = complex9.acos();
        org.apache.commons.math3.complex.Complex complex12 = complex11.reciprocal();
        org.apache.commons.math3.complex.Complex complex13 = complex1.divide(complex11);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex13 and complex2.", complex13.equals(complex2) == complex2.equals(complex13));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.sin();
        org.apache.commons.math3.complex.Complex complex7 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex8 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex9 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex12 = complex11.exp();
        double double13 = complex11.getArgument();
        org.apache.commons.math3.complex.Complex complex15 = complex11.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex16 = complex11.sin();
        org.apache.commons.math3.complex.Complex complex17 = complex11.cosh();
        org.apache.commons.math3.complex.Complex complex18 = complex11.tan();
        org.apache.commons.math3.complex.Complex complex19 = complex11.tan();
        org.apache.commons.math3.complex.Complex complex21 = complex11.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex22 = complex9.subtract(complex11);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList24 = complex22.nthRoot((int) '4');
        org.apache.commons.math3.complex.Complex complex25 = complex22.cos();
        org.apache.commons.math3.complex.Complex complex26 = complex22.tanh();
        org.apache.commons.math3.complex.Complex complex27 = complex22.reciprocal();
        org.apache.commons.math3.complex.Complex complex29 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex30 = complex29.sqrt();
        org.apache.commons.math3.complex.Complex complex31 = complex29.sqrt();
        org.apache.commons.math3.complex.Complex complex32 = complex22.add(complex29);
        double double33 = complex29.abs();
        org.apache.commons.math3.complex.Complex complex34 = complex29.reciprocal();
        org.apache.commons.math3.complex.Complex complex35 = complex34.exp();
        double double36 = complex35.getReal();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex34", complex1.equals(complex34) ? complex1.hashCode() == complex34.hashCode() : true);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.sin();
        org.apache.commons.math3.complex.Complex complex7 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex8 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex9 = complex8.conjugate();
        org.apache.commons.math3.complex.Complex complex10 = complex9.cosh();
        org.apache.commons.math3.complex.Complex complex11 = complex10.tanh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex8 and complex9", complex8.equals(complex9) ? complex8.hashCode() == complex9.hashCode() : true);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex3.reciprocal();
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex7 = complex6.exp();
        double double8 = complex6.getArgument();
        org.apache.commons.math3.complex.Complex complex10 = complex6.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex11 = complex6.sin();
        org.apache.commons.math3.complex.Complex complex12 = complex6.cosh();
        org.apache.commons.math3.complex.Complex complex13 = complex6.tan();
        org.apache.commons.math3.complex.Complex complex14 = complex6.tan();
        org.apache.commons.math3.complex.Complex complex15 = complex3.add(complex14);
        org.apache.commons.math3.complex.Complex complex18 = new org.apache.commons.math3.complex.Complex(10.0d, (double) 100L);
        org.apache.commons.math3.complex.Complex complex20 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex21 = complex20.sqrt();
        org.apache.commons.math3.complex.Complex complex22 = complex18.multiply(complex21);
        org.apache.commons.math3.complex.Complex complex23 = complex21.sin();
        org.apache.commons.math3.complex.Complex complex25 = complex21.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex26 = complex15.multiply(complex25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex4", complex3.equals(complex4) ? complex3.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex4.log();
        org.apache.commons.math3.complex.ComplexField complexField6 = complex5.getField();
        org.apache.commons.math3.complex.Complex complex7 = complex5.sqrt1z();
        org.apache.commons.math3.complex.Complex complex8 = complex5.negate();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex7 and complex1.", complex7.equals(complex1) == complex1.equals(complex7));
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex6 = complex1.sqrt1z();
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex8 = complex6.add(complex7);
        org.apache.commons.math3.complex.Complex complex9 = complex6.cosh();
        org.apache.commons.math3.complex.Complex complex10 = complex9.conjugate();
        org.apache.commons.math3.complex.Complex complex11 = complex10.log();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList13 = complex11.nthRoot(100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex10", complex1.equals(complex10) ? complex1.hashCode() == complex10.hashCode() : true);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex7 = complex5.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex8 = complex5.sqrt();
        org.apache.commons.math3.complex.Complex complex9 = complex5.conjugate();
        org.apache.commons.math3.complex.Complex complex10 = complex5.asin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex9", complex4.equals(complex9) ? complex4.hashCode() == complex9.hashCode() : true);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex(10.0d, (double) 100L);
        org.apache.commons.math3.complex.Complex complex4 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex5 = complex4.sqrt();
        org.apache.commons.math3.complex.Complex complex6 = complex2.multiply(complex5);
        org.apache.commons.math3.complex.Complex complex8 = complex5.pow((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex10 = complex8.add((double) 0.0f);
        double double11 = complex10.getReal();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex8", complex4.equals(complex8) ? complex4.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
        org.apache.commons.math3.complex.Complex complex3 = complex1.multiply((int) (byte) 10);
        org.apache.commons.math3.complex.Complex complex5 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex6 = complex5.exp();
        double double7 = complex5.getArgument();
        org.apache.commons.math3.complex.Complex complex8 = complex5.log();
        org.apache.commons.math3.complex.Complex complex9 = complex5.log();
        org.apache.commons.math3.complex.Complex complex10 = complex5.sqrt1z();
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex12 = complex10.add(complex11);
        org.apache.commons.math3.complex.Complex complex14 = complex12.subtract((double) ' ');
        org.apache.commons.math3.complex.Complex complex16 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex17 = complex16.exp();
        double double18 = complex16.getArgument();
        org.apache.commons.math3.complex.Complex complex20 = complex16.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex21 = complex16.sin();
        org.apache.commons.math3.complex.Complex complex22 = complex16.cosh();
        org.apache.commons.math3.complex.Complex complex23 = complex16.tan();
        org.apache.commons.math3.complex.Complex complex24 = complex16.tan();
        org.apache.commons.math3.complex.Complex complex26 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex27 = complex26.exp();
        double double28 = complex26.getArgument();
        org.apache.commons.math3.complex.Complex complex30 = complex26.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex31 = complex26.sin();
        org.apache.commons.math3.complex.Complex complex32 = complex26.cosh();
        org.apache.commons.math3.complex.Complex complex33 = complex26.tan();
        org.apache.commons.math3.complex.Complex complex34 = complex26.tan();
        org.apache.commons.math3.complex.Complex complex36 = complex26.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex37 = complex24.subtract(complex26);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList39 = complex37.nthRoot((int) '4');
        org.apache.commons.math3.complex.Complex complex40 = complex37.cos();
        org.apache.commons.math3.complex.Complex complex41 = complex37.sin();
        org.apache.commons.math3.complex.Complex complex42 = complex41.cosh();
        org.apache.commons.math3.complex.Complex complex43 = complex42.reciprocal();
        org.apache.commons.math3.complex.Complex complex44 = complex42.cosh();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList46 = complex42.nthRoot((int) (short) 100);
        boolean boolean47 = complex12.equals((java.lang.Object) complex42);
        org.apache.commons.math3.complex.Complex complex48 = complex3.add(complex42);
        org.apache.commons.math3.complex.Complex complex49 = complex42.atan();
        org.apache.commons.math3.complex.Complex complex51 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex52 = complex51.exp();
        boolean boolean53 = complex52.isNaN();
        org.apache.commons.math3.complex.Complex complex55 = complex52.pow((double) 0L);
        org.apache.commons.math3.complex.Complex complex58 = new org.apache.commons.math3.complex.Complex((double) (-1.0f), (double) 100.0f);
        org.apache.commons.math3.complex.Complex complex59 = complex55.pow(complex58);
        double double60 = complex55.getImaginary();
        org.apache.commons.math3.complex.Complex complex61 = complex55.exp();
        org.apache.commons.math3.complex.Complex complex62 = complex55.conjugate();
        org.apache.commons.math3.complex.Complex complex63 = complex49.subtract(complex55);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex5 and complex62", complex5.equals(complex62) ? complex5.hashCode() == complex62.hashCode() : true);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex1 = complex0.sqrt1z();
        org.apache.commons.math3.complex.Complex complex2 = complex0.sqrt();
        double double3 = complex0.abs();
        org.apache.commons.math3.complex.Complex complex4 = complex0.sqrt();
        org.apache.commons.math3.complex.Complex complex5 = complex0.cos();
        org.apache.commons.math3.complex.Complex complex7 = complex0.multiply(0.9126365759632116d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex5", complex1.equals(complex5) ? complex1.hashCode() == complex5.hashCode() : true);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex6 = complex1.sqrt1z();
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex8 = complex6.add(complex7);
        org.apache.commons.math3.complex.Complex complex10 = complex8.subtract((double) ' ');
        org.apache.commons.math3.complex.Complex complex12 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex13 = complex12.exp();
        double double14 = complex12.getArgument();
        org.apache.commons.math3.complex.Complex complex16 = complex12.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex17 = complex12.sin();
        org.apache.commons.math3.complex.Complex complex18 = complex12.cosh();
        org.apache.commons.math3.complex.Complex complex19 = complex12.tan();
        org.apache.commons.math3.complex.Complex complex20 = complex12.tan();
        org.apache.commons.math3.complex.Complex complex22 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex23 = complex22.exp();
        double double24 = complex22.getArgument();
        org.apache.commons.math3.complex.Complex complex26 = complex22.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex27 = complex22.sin();
        org.apache.commons.math3.complex.Complex complex28 = complex22.cosh();
        org.apache.commons.math3.complex.Complex complex29 = complex22.tan();
        org.apache.commons.math3.complex.Complex complex30 = complex22.tan();
        org.apache.commons.math3.complex.Complex complex32 = complex22.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex33 = complex20.subtract(complex22);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList35 = complex33.nthRoot((int) '4');
        org.apache.commons.math3.complex.Complex complex36 = complex33.cos();
        org.apache.commons.math3.complex.Complex complex37 = complex33.sin();
        org.apache.commons.math3.complex.Complex complex38 = complex37.cosh();
        org.apache.commons.math3.complex.Complex complex39 = complex38.reciprocal();
        org.apache.commons.math3.complex.Complex complex40 = complex38.cosh();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList42 = complex38.nthRoot((int) (short) 100);
        boolean boolean43 = complex8.equals((java.lang.Object) complex38);
        org.apache.commons.math3.complex.Complex complex44 = complex8.conjugate();
        org.apache.commons.math3.complex.Complex complex45 = complex8.cos();
        org.apache.commons.math3.complex.Complex complex46 = complex8.cosh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex18 and complex45", complex18.equals(complex45) ? complex18.hashCode() == complex45.hashCode() : true);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double3 = complex2.getImaginary();
        org.apache.commons.math3.complex.Complex complex4 = complex2.negate();
        org.apache.commons.math3.complex.Complex complex6 = complex4.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex8 = complex4.subtract(complex7);
        org.apache.commons.math3.complex.Complex complex9 = complex4.acos();
        org.apache.commons.math3.complex.Complex complex10 = complex0.subtract(complex4);
        org.apache.commons.math3.complex.Complex complex11 = complex4.atan();
        org.apache.commons.math3.complex.Complex complex13 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex14 = complex13.exp();
        double double15 = complex13.getArgument();
        org.apache.commons.math3.complex.Complex complex17 = complex13.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex18 = complex13.exp();
        org.apache.commons.math3.complex.Complex complex21 = new org.apache.commons.math3.complex.Complex((double) (short) -1, (double) '4');
        org.apache.commons.math3.complex.Complex complex22 = complex21.cos();
        org.apache.commons.math3.complex.Complex complex23 = complex18.divide(complex22);
        org.apache.commons.math3.complex.Complex complex24 = complex4.subtract(complex23);
        org.apache.commons.math3.complex.Complex complex25 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex26 = complex25.exp();
        org.apache.commons.math3.complex.Complex complex27 = complex23.multiply(complex26);
        boolean boolean28 = complex27.isInfinite();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex26 and complex0.", complex26.equals(complex0) == complex0.equals(complex26));
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex3.reciprocal();
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex7 = complex6.exp();
        double double8 = complex6.getArgument();
        org.apache.commons.math3.complex.Complex complex10 = complex6.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex11 = complex6.sin();
        org.apache.commons.math3.complex.Complex complex12 = complex6.cosh();
        org.apache.commons.math3.complex.Complex complex13 = complex6.tan();
        org.apache.commons.math3.complex.Complex complex14 = complex6.tan();
        org.apache.commons.math3.complex.Complex complex15 = complex3.add(complex14);
        org.apache.commons.math3.complex.Complex complex17 = complex3.multiply((int) '#');
        org.apache.commons.math3.complex.Complex complex18 = complex3.sqrt1z();
        org.apache.commons.math3.complex.Complex complex19 = complex18.exp();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex4", complex3.equals(complex4) ? complex3.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex4.log();
        org.apache.commons.math3.complex.ComplexField complexField6 = complex5.getField();
        org.apache.commons.math3.complex.Complex complex7 = complex5.acos();
        org.apache.commons.math3.complex.Complex complex8 = complex5.negate();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex7 and complex1.", complex7.equals(complex1) == complex1.equals(complex7));
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex1 = complex0.sqrt1z();
        org.apache.commons.math3.complex.Complex complex3 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double4 = complex3.getImaginary();
        org.apache.commons.math3.complex.Complex complex5 = complex3.negate();
        org.apache.commons.math3.complex.Complex complex6 = complex5.sinh();
        org.apache.commons.math3.complex.Complex complex7 = complex6.acos();
        org.apache.commons.math3.complex.Complex complex8 = complex1.divide(complex6);
        org.apache.commons.math3.complex.Complex complex9 = complex8.tan();
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double12 = complex11.getImaginary();
        org.apache.commons.math3.complex.Complex complex13 = complex11.negate();
        org.apache.commons.math3.complex.Complex complex15 = complex13.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex16 = complex13.tanh();
        org.apache.commons.math3.complex.Complex complex17 = complex16.conjugate();
        org.apache.commons.math3.complex.Complex complex18 = complex9.divide(complex16);
        boolean boolean19 = complex16.isNaN();
        org.apache.commons.math3.complex.Complex complex20 = complex16.cos();
        org.apache.commons.math3.complex.Complex complex21 = complex20.exp();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex16 and complex17", complex16.equals(complex17) ? complex16.hashCode() == complex17.hashCode() : true);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((double) 1, 10.0d);
        org.apache.commons.math3.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math3.complex.Complex complex5 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex6 = complex5.exp();
        double double7 = complex5.getArgument();
        org.apache.commons.math3.complex.Complex complex8 = complex5.log();
        org.apache.commons.math3.complex.Complex complex9 = complex5.log();
        org.apache.commons.math3.complex.Complex complex10 = complex9.negate();
        org.apache.commons.math3.complex.Complex complex11 = complex10.sqrt();
        org.apache.commons.math3.complex.Complex complex12 = complex3.divide(complex10);
        org.apache.commons.math3.complex.Complex complex13 = complex10.sqrt();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex12 and complex2.", complex12.equals(complex2) == complex2.equals(complex12));
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex((-0.0d));
        org.apache.commons.math3.complex.Complex complex3 = complex1.divide((double) (short) 10);
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow(1.4440009959998334d);
        org.apache.commons.math3.complex.Complex complex7 = complex1.pow((double) (-1.0f));
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex5 and complex3.", complex5.equals(complex3) == complex3.equals(complex5));
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex(1.0349512282932293E22d, (double) 0);
        org.apache.commons.math3.complex.Complex complex3 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex4 = complex3.cosh();
        org.apache.commons.math3.complex.Complex complex5 = complex3.conjugate();
        org.apache.commons.math3.complex.Complex complex8 = new org.apache.commons.math3.complex.Complex((double) (short) -1, (double) '4');
        org.apache.commons.math3.complex.Complex complex9 = complex8.cos();
        org.apache.commons.math3.complex.Complex complex10 = complex3.subtract(complex8);
        org.apache.commons.math3.complex.Complex complex11 = complex10.atan();
        org.apache.commons.math3.complex.Complex complex12 = complex2.subtract(complex11);
        org.apache.commons.math3.complex.Complex complex14 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double15 = complex14.getImaginary();
        org.apache.commons.math3.complex.Complex complex16 = complex14.negate();
        org.apache.commons.math3.complex.Complex complex17 = complex16.sinh();
        org.apache.commons.math3.complex.Complex complex18 = complex17.tanh();
        org.apache.commons.math3.complex.Complex complex20 = complex18.subtract((double) 1L);
        org.apache.commons.math3.complex.Complex complex21 = complex20.atan();
        org.apache.commons.math3.complex.Complex complex22 = complex12.divide(complex21);
        org.apache.commons.math3.complex.Complex complex24 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex25 = complex24.exp();
        double double26 = complex24.getArgument();
        org.apache.commons.math3.complex.Complex complex27 = complex24.log();
        org.apache.commons.math3.complex.Complex complex28 = complex24.log();
        org.apache.commons.math3.complex.Complex complex29 = complex24.acos();
        org.apache.commons.math3.complex.Complex complex31 = complex29.subtract((double) '#');
        java.lang.String str32 = complex29.toString();
        org.apache.commons.math3.complex.Complex complex34 = new org.apache.commons.math3.complex.Complex((double) 100L);
        org.apache.commons.math3.complex.Complex complex36 = complex34.divide((double) (-1));
        org.apache.commons.math3.complex.Complex complex38 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex39 = complex38.exp();
        double double40 = complex38.getArgument();
        org.apache.commons.math3.complex.Complex complex42 = complex38.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex43 = complex38.sin();
        org.apache.commons.math3.complex.Complex complex44 = complex38.cosh();
        org.apache.commons.math3.complex.Complex complex45 = complex38.tan();
        org.apache.commons.math3.complex.Complex complex46 = complex34.multiply(complex45);
        boolean boolean47 = complex29.equals((java.lang.Object) complex46);
        org.apache.commons.math3.complex.Complex complex49 = complex29.multiply((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex50 = complex12.pow(complex49);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex27 and complex29", complex27.equals(complex29) ? complex27.hashCode() == complex29.hashCode() : true);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex6 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex8 = complex6.pow((-0.0d));
        org.apache.commons.math3.complex.Complex complex9 = complex6.cos();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex8", complex1.equals(complex8) ? complex1.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.sin();
        org.apache.commons.math3.complex.Complex complex7 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex8 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex9 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex12 = complex11.exp();
        double double13 = complex11.getArgument();
        org.apache.commons.math3.complex.Complex complex15 = complex11.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex16 = complex11.sin();
        org.apache.commons.math3.complex.Complex complex17 = complex11.cosh();
        org.apache.commons.math3.complex.Complex complex18 = complex11.tan();
        org.apache.commons.math3.complex.Complex complex19 = complex11.tan();
        org.apache.commons.math3.complex.Complex complex21 = complex11.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex22 = complex9.subtract(complex11);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList24 = complex22.nthRoot((int) '4');
        org.apache.commons.math3.complex.Complex complex25 = complex22.cos();
        org.apache.commons.math3.complex.Complex complex26 = complex22.tanh();
        org.apache.commons.math3.complex.Complex complex27 = complex22.reciprocal();
        org.apache.commons.math3.complex.Complex complex29 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex30 = complex29.sqrt();
        org.apache.commons.math3.complex.Complex complex31 = complex29.sqrt();
        org.apache.commons.math3.complex.Complex complex32 = complex22.add(complex29);
        double double33 = complex29.abs();
        org.apache.commons.math3.complex.Complex complex34 = complex29.reciprocal();
        org.apache.commons.math3.complex.Complex complex36 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex37 = complex36.exp();
        double double38 = complex36.getArgument();
        org.apache.commons.math3.complex.Complex complex40 = complex36.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex41 = complex36.sin();
        org.apache.commons.math3.complex.Complex complex42 = complex36.cosh();
        org.apache.commons.math3.complex.Complex complex44 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double45 = complex44.getImaginary();
        boolean boolean46 = complex42.equals((java.lang.Object) double45);
        org.apache.commons.math3.complex.Complex complex47 = complex42.tanh();
        org.apache.commons.math3.complex.Complex complex48 = complex42.tanh();
        org.apache.commons.math3.complex.Complex complex49 = complex42.sqrt1z();
        org.apache.commons.math3.complex.Complex complex50 = complex49.acos();
        org.apache.commons.math3.complex.Complex complex51 = complex29.subtract(complex49);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex34", complex1.equals(complex34) ? complex1.hashCode() == complex34.hashCode() : true);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex7 = complex3.pow((double) 100L);
        org.apache.commons.math3.complex.Complex complex8 = complex3.reciprocal();
        org.apache.commons.math3.complex.Complex complex9 = complex8.asin();
        org.apache.commons.math3.complex.Complex complex12 = new org.apache.commons.math3.complex.Complex((double) (short) -1, (double) '4');
        org.apache.commons.math3.complex.Complex complex13 = complex12.cos();
        org.apache.commons.math3.complex.Complex complex15 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex16 = complex15.sqrt();
        org.apache.commons.math3.complex.Complex complex17 = complex15.sqrt();
        org.apache.commons.math3.complex.Complex complex18 = complex17.tanh();
        org.apache.commons.math3.complex.Complex complex19 = complex12.divide(complex17);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList21 = complex17.nthRoot((int) 'a');
        org.apache.commons.math3.complex.Complex complex22 = complex8.divide(complex17);
        org.apache.commons.math3.complex.Complex complex23 = complex17.tanh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex8", complex3.equals(complex8) ? complex3.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex5.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex10 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex11 = complex10.exp();
        org.apache.commons.math3.complex.Complex complex12 = complex10.tanh();
        org.apache.commons.math3.complex.Complex complex13 = complex5.subtract(complex10);
        org.apache.commons.math3.complex.Complex complex14 = complex5.cos();
        org.apache.commons.math3.complex.Complex complex15 = complex14.tan();
        org.apache.commons.math3.complex.Complex complex17 = complex15.multiply((double) (short) 1);
        org.apache.commons.math3.complex.Complex complex19 = complex15.add((double) 100.0f);
        org.apache.commons.math3.complex.Complex complex21 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double22 = complex21.getImaginary();
        org.apache.commons.math3.complex.Complex complex23 = complex21.negate();
        org.apache.commons.math3.complex.Complex complex25 = complex23.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex26 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex27 = complex23.subtract(complex26);
        org.apache.commons.math3.complex.Complex complex28 = complex23.cosh();
        org.apache.commons.math3.complex.Complex complex30 = complex28.multiply(0);
        org.apache.commons.math3.complex.Complex complex31 = complex15.divide(complex30);
        org.apache.commons.math3.complex.Complex complex33 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex34 = complex33.sqrt();
        org.apache.commons.math3.complex.Complex complex35 = complex33.sqrt();
        org.apache.commons.math3.complex.Complex complex36 = complex33.sinh();
        org.apache.commons.math3.complex.Complex complex37 = complex36.exp();
        org.apache.commons.math3.complex.ComplexField complexField38 = complex36.getField();
        org.apache.commons.math3.complex.Complex complex39 = complex36.tanh();
        org.apache.commons.math3.complex.Complex complex40 = complex15.multiply(complex39);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex31 and complex1.", complex31.equals(complex1) == complex1.equals(complex31));
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex1 = complex0.sqrt1z();
        org.apache.commons.math3.complex.Complex complex3 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double4 = complex3.getImaginary();
        org.apache.commons.math3.complex.Complex complex5 = complex3.negate();
        org.apache.commons.math3.complex.Complex complex6 = complex5.sinh();
        org.apache.commons.math3.complex.Complex complex7 = complex6.acos();
        org.apache.commons.math3.complex.Complex complex8 = complex1.divide(complex6);
        org.apache.commons.math3.complex.Complex complex9 = complex8.tan();
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double12 = complex11.getImaginary();
        org.apache.commons.math3.complex.Complex complex13 = complex11.negate();
        org.apache.commons.math3.complex.Complex complex15 = complex13.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex16 = complex13.tanh();
        org.apache.commons.math3.complex.Complex complex17 = complex16.conjugate();
        org.apache.commons.math3.complex.Complex complex18 = complex9.divide(complex16);
        boolean boolean19 = complex16.isNaN();
        org.apache.commons.math3.complex.Complex complex20 = complex16.cos();
        boolean boolean21 = complex16.isNaN();
        org.apache.commons.math3.complex.Complex complex22 = complex16.cosh();
        org.apache.commons.math3.complex.Complex complex24 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex25 = complex24.sqrt();
        org.apache.commons.math3.complex.Complex complex27 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double28 = complex27.getImaginary();
        org.apache.commons.math3.complex.Complex complex29 = complex27.negate();
        org.apache.commons.math3.complex.Complex complex30 = complex29.cosh();
        org.apache.commons.math3.complex.Complex complex31 = complex24.pow(complex30);
        org.apache.commons.math3.complex.Complex complex32 = complex24.sin();
        org.apache.commons.math3.complex.Complex complex33 = complex22.multiply(complex24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex16 and complex17", complex16.equals(complex17) ? complex16.hashCode() == complex17.hashCode() : true);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex3.reciprocal();
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex7 = complex6.exp();
        double double8 = complex6.getArgument();
        org.apache.commons.math3.complex.Complex complex10 = complex6.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex11 = complex6.sin();
        org.apache.commons.math3.complex.Complex complex12 = complex6.cosh();
        org.apache.commons.math3.complex.Complex complex13 = complex6.tan();
        org.apache.commons.math3.complex.Complex complex14 = complex6.tan();
        org.apache.commons.math3.complex.Complex complex15 = complex3.add(complex14);
        org.apache.commons.math3.complex.Complex complex17 = complex3.add((-1.0d));
        org.apache.commons.math3.complex.Complex complex20 = new org.apache.commons.math3.complex.Complex((double) (byte) 100, 0.0d);
        org.apache.commons.math3.complex.Complex complex21 = complex20.sqrt();
        java.lang.String str22 = complex21.toString();
        org.apache.commons.math3.complex.Complex complex24 = new org.apache.commons.math3.complex.Complex((double) 100);
        double double25 = complex24.getImaginary();
        org.apache.commons.math3.complex.Complex complex26 = complex24.negate();
        org.apache.commons.math3.complex.Complex complex27 = complex21.divide(complex26);
        boolean boolean28 = complex17.equals((java.lang.Object) complex26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex4", complex3.equals(complex4) ? complex3.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex(10.0d, (double) 100L);
        org.apache.commons.math3.complex.Complex complex4 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex5 = complex4.sqrt();
        org.apache.commons.math3.complex.Complex complex6 = complex2.multiply(complex5);
        org.apache.commons.math3.complex.Complex complex8 = complex5.pow((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex10 = complex8.add((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex13 = new org.apache.commons.math3.complex.Complex((double) (short) -1, (double) '4');
        org.apache.commons.math3.complex.Complex complex14 = complex13.log();
        org.apache.commons.math3.complex.Complex complex16 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double17 = complex16.getImaginary();
        org.apache.commons.math3.complex.Complex complex18 = complex16.negate();
        org.apache.commons.math3.complex.Complex complex20 = complex18.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex21 = complex14.add(complex18);
        org.apache.commons.math3.complex.Complex complex22 = complex14.cos();
        org.apache.commons.math3.complex.Complex complex23 = complex22.tan();
        org.apache.commons.math3.complex.Complex complex24 = complex8.pow(complex22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex10", complex4.equals(complex10) ? complex4.hashCode() == complex10.hashCode() : true);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.sin();
        org.apache.commons.math3.complex.Complex complex7 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex8 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex9 = complex8.conjugate();
        org.apache.commons.math3.complex.Complex complex10 = complex9.sqrt1z();
        org.apache.commons.math3.complex.Complex complex11 = complex9.conjugate();
        org.apache.commons.math3.complex.Complex complex13 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex14 = complex13.exp();
        double double15 = complex13.getArgument();
        org.apache.commons.math3.complex.Complex complex16 = complex13.log();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList18 = complex16.nthRoot((int) 'a');
        org.apache.commons.math3.complex.Complex complex20 = complex16.add((double) (-1.0f));
        boolean boolean21 = complex16.isNaN();
        org.apache.commons.math3.complex.Complex complex22 = complex9.add(complex16);
        org.apache.commons.math3.complex.Complex complex23 = complex16.cos();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex8 and complex9", complex8.equals(complex9) ? complex8.hashCode() == complex9.hashCode() : true);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex7 = complex3.pow((double) 100L);
        org.apache.commons.math3.complex.Complex complex8 = complex3.reciprocal();
        org.apache.commons.math3.complex.Complex complex9 = complex8.asin();
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double12 = complex11.getImaginary();
        org.apache.commons.math3.complex.Complex complex13 = complex11.negate();
        org.apache.commons.math3.complex.Complex complex14 = complex13.sinh();
        org.apache.commons.math3.complex.Complex complex15 = complex14.tanh();
        org.apache.commons.math3.complex.Complex complex16 = complex15.sqrt1z();
        org.apache.commons.math3.complex.Complex complex18 = complex15.multiply((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex20 = complex18.subtract(3.141592653589793d);
        org.apache.commons.math3.complex.Complex complex21 = complex20.reciprocal();
        org.apache.commons.math3.complex.Complex complex23 = complex21.pow(Double.NEGATIVE_INFINITY);
        org.apache.commons.math3.complex.Complex complex24 = complex9.pow(complex23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex8", complex3.equals(complex8) ? complex3.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex(11013.232874703393d, 2.0d);
        org.apache.commons.math3.complex.Complex complex4 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex5 = complex4.exp();
        double double6 = complex4.getArgument();
        org.apache.commons.math3.complex.Complex complex8 = complex4.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex9 = complex4.sin();
        org.apache.commons.math3.complex.Complex complex10 = complex2.divide(complex9);
        org.apache.commons.math3.complex.Complex complex13 = org.apache.commons.math3.complex.Complex.valueOf((double) (byte) 1, (double) (-1L));
        org.apache.commons.math3.complex.Complex complex15 = complex13.add(0.9630272572571656d);
        org.apache.commons.math3.complex.Complex complex16 = complex10.subtract(complex13);
        org.apache.commons.math3.complex.Complex complex18 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex19 = complex18.exp();
        double double20 = complex18.getArgument();
        org.apache.commons.math3.complex.Complex complex21 = complex18.log();
        org.apache.commons.math3.complex.Complex complex23 = complex18.divide((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex24 = complex10.subtract(complex18);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex23 and complex2.", complex23.equals(complex2) == complex2.equals(complex23));
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex5.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex10 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex11 = complex10.exp();
        org.apache.commons.math3.complex.Complex complex12 = complex10.tanh();
        org.apache.commons.math3.complex.Complex complex13 = complex5.subtract(complex10);
        org.apache.commons.math3.complex.Complex complex15 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex16 = complex15.exp();
        double double17 = complex15.getArgument();
        org.apache.commons.math3.complex.Complex complex19 = complex15.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex20 = complex15.sin();
        org.apache.commons.math3.complex.Complex complex21 = complex15.cosh();
        org.apache.commons.math3.complex.Complex complex22 = complex15.tan();
        org.apache.commons.math3.complex.Complex complex23 = complex15.tan();
        org.apache.commons.math3.complex.Complex complex25 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex26 = complex25.exp();
        double double27 = complex25.getArgument();
        org.apache.commons.math3.complex.Complex complex29 = complex25.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex30 = complex25.sin();
        org.apache.commons.math3.complex.Complex complex31 = complex25.cosh();
        org.apache.commons.math3.complex.Complex complex32 = complex25.tan();
        org.apache.commons.math3.complex.Complex complex33 = complex25.tan();
        org.apache.commons.math3.complex.Complex complex35 = complex25.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex36 = complex23.subtract(complex25);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList38 = complex36.nthRoot((int) '4');
        org.apache.commons.math3.complex.Complex complex39 = complex10.subtract(complex36);
        org.apache.commons.math3.complex.Complex complex40 = complex10.reciprocal();
        org.apache.commons.math3.complex.Complex complex43 = new org.apache.commons.math3.complex.Complex((double) 'a', 0.0d);
        org.apache.commons.math3.complex.Complex complex44 = complex43.negate();
        org.apache.commons.math3.complex.Complex complex45 = complex43.sqrt1z();
        org.apache.commons.math3.complex.Complex complex46 = complex40.add(complex45);
        org.apache.commons.math3.complex.Complex complex49 = new org.apache.commons.math3.complex.Complex((double) (byte) 100, 0.0d);
        org.apache.commons.math3.complex.Complex complex50 = complex49.sqrt();
        org.apache.commons.math3.complex.Complex complex51 = complex49.log();
        org.apache.commons.math3.complex.Complex complex53 = complex51.multiply((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex54 = complex51.log();
        org.apache.commons.math3.complex.Complex complex55 = complex51.cos();
        boolean boolean56 = complex55.isNaN();
        org.apache.commons.math3.complex.Complex complex57 = complex46.multiply(complex55);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex40", complex1.equals(complex40) ? complex1.hashCode() == complex40.hashCode() : true);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex7 = complex5.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex8 = complex5.sqrt();
        org.apache.commons.math3.complex.Complex complex10 = complex5.multiply((int) '#');
        org.apache.commons.math3.complex.Complex complex11 = complex10.reciprocal();
        java.lang.String str12 = complex11.toString();
        org.apache.commons.math3.complex.Complex complex15 = org.apache.commons.math3.complex.Complex.valueOf((double) 100.0f, (double) (short) 1);
        org.apache.commons.math3.complex.ComplexField complexField16 = complex15.getField();
        org.apache.commons.math3.complex.Complex complex17 = complex15.sinh();
        org.apache.commons.math3.complex.Complex complex18 = complex11.pow(complex17);
        org.apache.commons.math3.complex.Complex complex20 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex21 = complex20.exp();
        double double22 = complex20.getArgument();
        org.apache.commons.math3.complex.Complex complex24 = complex20.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex25 = complex20.sin();
        org.apache.commons.math3.complex.Complex complex26 = complex20.cosh();
        org.apache.commons.math3.complex.Complex complex27 = complex20.tan();
        org.apache.commons.math3.complex.Complex complex28 = complex20.tan();
        org.apache.commons.math3.complex.Complex complex30 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex31 = complex30.exp();
        double double32 = complex30.getArgument();
        org.apache.commons.math3.complex.Complex complex34 = complex30.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex35 = complex30.sin();
        org.apache.commons.math3.complex.Complex complex36 = complex30.cosh();
        org.apache.commons.math3.complex.Complex complex37 = complex30.tan();
        org.apache.commons.math3.complex.Complex complex38 = complex30.tan();
        org.apache.commons.math3.complex.Complex complex40 = complex30.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex41 = complex28.subtract(complex30);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList43 = complex41.nthRoot((int) '4');
        org.apache.commons.math3.complex.Complex complex44 = complex41.cos();
        org.apache.commons.math3.complex.Complex complex45 = complex41.sin();
        org.apache.commons.math3.complex.Complex complex46 = complex45.cosh();
        org.apache.commons.math3.complex.Complex complex47 = complex46.sinh();
        org.apache.commons.math3.complex.Complex complex49 = complex46.add((-0.7853981633974483d));
        org.apache.commons.math3.complex.Complex complex50 = complex17.add(complex49);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex11 and complex1.", complex11.equals(complex1) == complex1.equals(complex11));
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex((double) 0.0f);
        boolean boolean2 = complex1.isInfinite();
        org.apache.commons.math3.complex.Complex complex4 = complex1.pow((double) 0L);
        org.apache.commons.math3.complex.Complex complex7 = new org.apache.commons.math3.complex.Complex((double) (short) -1, (double) '4');
        boolean boolean8 = complex7.isInfinite();
        org.apache.commons.math3.complex.Complex complex11 = new org.apache.commons.math3.complex.Complex((double) 0L, (double) 100.0f);
        org.apache.commons.math3.complex.Complex complex12 = complex7.multiply(complex11);
        org.apache.commons.math3.complex.Complex complex13 = complex11.cos();
        org.apache.commons.math3.complex.Complex complex14 = complex13.atan();
        org.apache.commons.math3.complex.Complex complex15 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex16 = complex15.sqrt1z();
        org.apache.commons.math3.complex.Complex complex17 = complex16.asin();
        org.apache.commons.math3.complex.Complex complex18 = complex14.add(complex16);
        org.apache.commons.math3.complex.Complex complex19 = complex4.pow(complex18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex14 and complex17", complex14.equals(complex17) ? complex14.hashCode() == complex17.hashCode() : true);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) (byte) 100, 0.0d);
        org.apache.commons.math3.complex.Complex complex3 = complex2.log();
        org.apache.commons.math3.complex.Complex complex4 = complex3.tanh();
        org.apache.commons.math3.complex.Complex complex6 = complex3.divide((double) 0L);
        org.apache.commons.math3.complex.Complex complex8 = complex6.subtract(0.7518860375694327d);
        org.apache.commons.math3.complex.Complex complex9 = complex6.exp();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex9 and complex2.", complex9.equals(complex2) == complex2.equals(complex9));
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.sqrt1z();
        org.apache.commons.math3.complex.Complex complex9 = new org.apache.commons.math3.complex.Complex((double) (short) -1, (double) '4');
        org.apache.commons.math3.complex.Complex complex10 = complex9.atan();
        org.apache.commons.math3.complex.Complex complex11 = complex6.multiply(complex10);
        org.apache.commons.math3.complex.Complex complex12 = complex10.sinh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex6 and complex11", complex6.equals(complex11) ? complex6.hashCode() == complex11.hashCode() : true);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex6 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex7 = complex1.conjugate();
        org.apache.commons.math3.complex.Complex complex9 = complex1.add((double) (short) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex5 and complex7", complex5.equals(complex7) ? complex5.hashCode() == complex7.hashCode() : true);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex3.reciprocal();
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex7 = complex6.exp();
        double double8 = complex6.getArgument();
        org.apache.commons.math3.complex.Complex complex10 = complex6.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex11 = complex6.sin();
        org.apache.commons.math3.complex.Complex complex12 = complex6.cosh();
        org.apache.commons.math3.complex.Complex complex13 = complex6.tan();
        org.apache.commons.math3.complex.Complex complex14 = complex6.tan();
        org.apache.commons.math3.complex.Complex complex15 = complex3.add(complex14);
        org.apache.commons.math3.complex.Complex complex17 = complex3.add((-1.0d));
        org.apache.commons.math3.complex.Complex complex19 = complex3.multiply((-0.8259324122591327d));
        org.apache.commons.math3.complex.Complex complex21 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double22 = complex21.getImaginary();
        org.apache.commons.math3.complex.Complex complex23 = complex21.negate();
        org.apache.commons.math3.complex.Complex complex24 = complex23.cosh();
        org.apache.commons.math3.complex.Complex complex25 = complex24.sqrt();
        org.apache.commons.math3.complex.Complex complex27 = complex24.subtract((double) 10.0f);
        java.lang.String str28 = complex27.toString();
        org.apache.commons.math3.complex.Complex complex29 = complex3.multiply(complex27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex23", complex4.equals(complex23) ? complex4.hashCode() == complex23.hashCode() : true);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex((double) 100L);
        org.apache.commons.math3.complex.Complex complex3 = complex1.divide((double) (-1));
        org.apache.commons.math3.complex.Complex complex5 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex6 = complex5.exp();
        double double7 = complex5.getArgument();
        org.apache.commons.math3.complex.Complex complex9 = complex5.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex10 = complex5.sin();
        org.apache.commons.math3.complex.Complex complex11 = complex5.cosh();
        org.apache.commons.math3.complex.Complex complex12 = complex5.tan();
        org.apache.commons.math3.complex.Complex complex13 = complex1.multiply(complex12);
        org.apache.commons.math3.complex.Complex complex16 = new org.apache.commons.math3.complex.Complex((double) 10, (double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex18 = complex16.add((double) (byte) 10);
        org.apache.commons.math3.complex.Complex complex19 = complex18.exp();
        org.apache.commons.math3.complex.Complex complex20 = complex12.divide(complex18);
        org.apache.commons.math3.complex.Complex complex22 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double23 = complex22.getImaginary();
        org.apache.commons.math3.complex.Complex complex24 = complex22.negate();
        org.apache.commons.math3.complex.Complex complex26 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex27 = complex26.exp();
        double double28 = complex26.getArgument();
        org.apache.commons.math3.complex.Complex complex29 = complex26.log();
        org.apache.commons.math3.complex.Complex complex30 = complex26.log();
        org.apache.commons.math3.complex.Complex complex32 = complex30.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex33 = complex24.subtract(complex32);
        org.apache.commons.math3.complex.Complex complex35 = complex33.divide((double) 10);
        org.apache.commons.math3.complex.Complex complex37 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex38 = complex37.exp();
        double double39 = complex37.getArgument();
        org.apache.commons.math3.complex.Complex complex40 = complex37.log();
        org.apache.commons.math3.complex.Complex complex41 = complex37.log();
        org.apache.commons.math3.complex.Complex complex43 = complex41.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex44 = complex41.tan();
        org.apache.commons.math3.complex.Complex complex45 = complex41.asin();
        org.apache.commons.math3.complex.Complex complex46 = complex35.divide(complex45);
        org.apache.commons.math3.complex.Complex complex47 = complex20.subtract(complex45);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex46 and complex1.", complex46.equals(complex1) == complex1.equals(complex46));
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.sin();
        org.apache.commons.math3.complex.Complex complex7 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex8 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex9 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex11 = complex1.subtract((double) (short) -1);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList13 = complex1.nthRoot(100);
        org.apache.commons.math3.complex.Complex complex14 = complex1.sinh();
        org.apache.commons.math3.complex.Complex complex16 = complex14.subtract((double) 10L);
        org.apache.commons.math3.complex.Complex complex18 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex19 = complex18.exp();
        double double20 = complex18.getArgument();
        org.apache.commons.math3.complex.Complex complex21 = complex18.log();
        org.apache.commons.math3.complex.Complex complex22 = complex14.add(complex21);
        org.apache.commons.math3.complex.Complex complex24 = complex21.add(0.0d);
        org.apache.commons.math3.complex.Complex complex25 = complex21.cos();
        org.apache.commons.math3.complex.Complex complex28 = new org.apache.commons.math3.complex.Complex((double) (byte) -1, 0.7518860375694327d);
        org.apache.commons.math3.complex.Complex complex29 = complex21.multiply(complex28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex25", complex1.equals(complex25) ? complex1.hashCode() == complex25.hashCode() : true);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) (short) -1, (double) '4');
        boolean boolean3 = complex2.isInfinite();
        org.apache.commons.math3.complex.Complex complex6 = new org.apache.commons.math3.complex.Complex((double) 0L, (double) 100.0f);
        org.apache.commons.math3.complex.Complex complex7 = complex2.multiply(complex6);
        org.apache.commons.math3.complex.Complex complex8 = complex6.cos();
        org.apache.commons.math3.complex.Complex complex9 = complex8.sin();
        org.apache.commons.math3.complex.Complex complex12 = new org.apache.commons.math3.complex.Complex((double) 10, (double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex14 = complex12.add((double) (byte) 10);
        org.apache.commons.math3.complex.Complex complex15 = complex14.sinh();
        org.apache.commons.math3.complex.Complex complex17 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double18 = complex17.getImaginary();
        org.apache.commons.math3.complex.Complex complex19 = complex17.negate();
        org.apache.commons.math3.complex.Complex complex21 = complex19.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex22 = complex21.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList24 = complex21.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex26 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex27 = complex26.exp();
        org.apache.commons.math3.complex.Complex complex28 = complex26.tanh();
        org.apache.commons.math3.complex.Complex complex29 = complex21.subtract(complex26);
        org.apache.commons.math3.complex.Complex complex30 = complex21.asin();
        java.lang.String str31 = complex30.toString();
        org.apache.commons.math3.complex.Complex complex33 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex34 = complex33.exp();
        double double35 = complex33.getArgument();
        org.apache.commons.math3.complex.Complex complex37 = complex33.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex38 = complex33.sin();
        org.apache.commons.math3.complex.Complex complex39 = complex33.cosh();
        org.apache.commons.math3.complex.Complex complex40 = complex33.tan();
        org.apache.commons.math3.complex.Complex complex41 = complex33.tan();
        org.apache.commons.math3.complex.Complex complex43 = complex33.subtract((double) (short) -1);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList45 = complex33.nthRoot(100);
        org.apache.commons.math3.complex.Complex complex46 = complex33.sinh();
        org.apache.commons.math3.complex.Complex complex47 = complex30.divide(complex33);
        org.apache.commons.math3.complex.Complex complex48 = complex15.pow(complex47);
        org.apache.commons.math3.complex.Complex complex49 = complex15.conjugate();
        org.apache.commons.math3.complex.Complex complex51 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex52 = complex51.exp();
        double double53 = complex51.getArgument();
        org.apache.commons.math3.complex.Complex complex54 = complex51.log();
        org.apache.commons.math3.complex.Complex complex55 = complex51.log();
        org.apache.commons.math3.complex.Complex complex56 = complex51.sqrt1z();
        org.apache.commons.math3.complex.Complex complex57 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex58 = complex56.add(complex57);
        org.apache.commons.math3.complex.Complex complex59 = complex58.cosh();
        boolean boolean60 = complex49.equals((java.lang.Object) complex58);
        boolean boolean61 = complex9.equals((java.lang.Object) complex49);
        org.apache.commons.math3.complex.Complex complex63 = complex9.divide(1.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex15 and complex49", complex15.equals(complex49) ? complex15.hashCode() == complex49.hashCode() : true);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        java.lang.Class<?> wildcardClass3 = complex1.getClass();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex2 and complex0.", complex2.equals(complex0) == complex0.equals(complex2));
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex6 = complex5.exp();
        double double7 = complex5.getArgument();
        org.apache.commons.math3.complex.Complex complex8 = complex5.log();
        org.apache.commons.math3.complex.Complex complex9 = complex5.log();
        org.apache.commons.math3.complex.Complex complex11 = complex9.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex12 = complex3.subtract(complex11);
        org.apache.commons.math3.complex.Complex complex13 = complex12.cos();
        org.apache.commons.math3.complex.Complex complex14 = complex12.tanh();
        org.apache.commons.math3.complex.Complex complex16 = complex14.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex17 = complex14.tanh();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex16 and complex1.", complex16.equals(complex1) == complex1.equals(complex16));
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.acos();
        org.apache.commons.math3.complex.Complex complex4 = complex3.reciprocal();
        org.apache.commons.math3.complex.Complex complex6 = complex4.add(1.5430806348152437d);
        org.apache.commons.math3.complex.Complex complex7 = complex4.tan();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex7 and complex1.", complex7.equals(complex1) == complex1.equals(complex7));
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math3.complex.Complex complex2 = complex0.reciprocal();
        org.apache.commons.math3.complex.Complex complex3 = complex2.tan();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex1 and complex0.", complex1.equals(complex0) == complex0.equals(complex1));
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex5.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex9 = complex5.negate();
        boolean boolean10 = complex5.isInfinite();
        org.apache.commons.math3.complex.Complex complex12 = complex5.pow((double) (-1.0f));
        org.apache.commons.math3.complex.Complex complex14 = complex5.multiply(3506.7733852965175d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex12", complex1.equals(complex12) ? complex1.hashCode() == complex12.hashCode() : true);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex6 = complex1.sqrt1z();
        boolean boolean7 = complex1.isNaN();
        org.apache.commons.math3.complex.Complex complex8 = complex1.log();
        org.apache.commons.math3.complex.Complex complex9 = complex8.cos();
        org.apache.commons.math3.complex.Complex complex10 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex12 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double13 = complex12.getImaginary();
        org.apache.commons.math3.complex.Complex complex14 = complex12.negate();
        org.apache.commons.math3.complex.Complex complex16 = complex14.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex17 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex18 = complex14.subtract(complex17);
        org.apache.commons.math3.complex.Complex complex19 = complex14.acos();
        org.apache.commons.math3.complex.Complex complex20 = complex10.subtract(complex14);
        org.apache.commons.math3.complex.Complex complex21 = complex14.atan();
        org.apache.commons.math3.complex.Complex complex23 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex24 = complex23.exp();
        double double25 = complex23.getArgument();
        org.apache.commons.math3.complex.Complex complex27 = complex23.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex28 = complex23.sin();
        org.apache.commons.math3.complex.Complex complex29 = complex23.cosh();
        org.apache.commons.math3.complex.Complex complex30 = complex23.tan();
        org.apache.commons.math3.complex.Complex complex31 = complex23.tan();
        org.apache.commons.math3.complex.Complex complex33 = complex23.subtract((double) (short) -1);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList35 = complex23.nthRoot(100);
        org.apache.commons.math3.complex.Complex complex36 = complex23.sinh();
        org.apache.commons.math3.complex.Complex complex37 = complex21.pow(complex36);
        double double38 = complex21.getReal();
        org.apache.commons.math3.complex.Complex complex39 = complex8.pow(complex21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex9", complex1.equals(complex9) ? complex1.hashCode() == complex9.hashCode() : true);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex3.reciprocal();
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex7 = complex6.exp();
        double double8 = complex6.getArgument();
        org.apache.commons.math3.complex.Complex complex10 = complex6.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex11 = complex6.sin();
        org.apache.commons.math3.complex.Complex complex12 = complex6.cosh();
        org.apache.commons.math3.complex.Complex complex13 = complex6.tan();
        org.apache.commons.math3.complex.Complex complex14 = complex6.tan();
        org.apache.commons.math3.complex.Complex complex15 = complex3.add(complex14);
        org.apache.commons.math3.complex.Complex complex17 = complex3.multiply((int) '#');
        org.apache.commons.math3.complex.Complex complex19 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double20 = complex19.getImaginary();
        org.apache.commons.math3.complex.Complex complex21 = complex19.negate();
        org.apache.commons.math3.complex.Complex complex23 = complex21.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex24 = complex23.sqrt1z();
        org.apache.commons.math3.complex.Complex complex27 = new org.apache.commons.math3.complex.Complex((double) (short) -1, (double) '4');
        org.apache.commons.math3.complex.Complex complex28 = complex27.atan();
        org.apache.commons.math3.complex.Complex complex29 = complex24.multiply(complex28);
        double double30 = complex24.abs();
        org.apache.commons.math3.complex.Complex complex31 = complex3.pow(complex24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex21", complex4.equals(complex21) ? complex4.hashCode() == complex21.hashCode() : true);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.sin();
        org.apache.commons.math3.complex.Complex complex7 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex8 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex9 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex11 = complex1.subtract((double) (short) -1);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList13 = complex1.nthRoot(100);
        org.apache.commons.math3.complex.Complex complex14 = complex1.sinh();
        org.apache.commons.math3.complex.Complex complex16 = complex14.subtract((double) 10L);
        org.apache.commons.math3.complex.Complex complex17 = complex16.sqrt();
        org.apache.commons.math3.complex.Complex complex19 = complex16.add((double) 100.0f);
        org.apache.commons.math3.complex.Complex complex20 = complex16.acos();
        org.apache.commons.math3.complex.Complex complex21 = complex16.sqrt();
        org.apache.commons.math3.complex.Complex complex23 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double24 = complex23.getImaginary();
        org.apache.commons.math3.complex.Complex complex25 = complex23.negate();
        org.apache.commons.math3.complex.Complex complex27 = complex25.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex28 = complex27.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList30 = complex27.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex32 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex33 = complex32.exp();
        org.apache.commons.math3.complex.Complex complex34 = complex32.tanh();
        org.apache.commons.math3.complex.Complex complex35 = complex27.subtract(complex32);
        org.apache.commons.math3.complex.Complex complex36 = complex27.asin();
        java.lang.String str37 = complex36.toString();
        org.apache.commons.math3.complex.Complex complex38 = complex36.tanh();
        org.apache.commons.math3.complex.Complex complex40 = complex36.multiply((double) (short) 10);
        org.apache.commons.math3.complex.Complex complex42 = complex36.pow((double) (-1));
        org.apache.commons.math3.complex.Complex complex43 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex44 = complex43.negate();
        org.apache.commons.math3.complex.Complex complex45 = complex36.divide(complex44);
        org.apache.commons.math3.complex.Complex complex47 = complex44.divide((double) (short) 10);
        org.apache.commons.math3.complex.Complex complex48 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex49 = complex48.cosh();
        org.apache.commons.math3.complex.Complex complex50 = complex48.conjugate();
        org.apache.commons.math3.complex.Complex complex53 = new org.apache.commons.math3.complex.Complex((double) (short) -1, (double) '4');
        org.apache.commons.math3.complex.Complex complex54 = complex53.cos();
        org.apache.commons.math3.complex.Complex complex55 = complex48.subtract(complex53);
        org.apache.commons.math3.complex.Complex complex57 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double58 = complex57.getImaginary();
        org.apache.commons.math3.complex.Complex complex59 = complex57.negate();
        org.apache.commons.math3.complex.Complex complex61 = complex59.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex62 = complex61.atan();
        org.apache.commons.math3.complex.Complex complex64 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex65 = complex64.exp();
        double double66 = complex64.getArgument();
        org.apache.commons.math3.complex.Complex complex68 = complex64.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex69 = complex64.sin();
        org.apache.commons.math3.complex.Complex complex70 = complex64.cosh();
        org.apache.commons.math3.complex.Complex complex72 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double73 = complex72.getImaginary();
        boolean boolean74 = complex70.equals((java.lang.Object) double73);
        org.apache.commons.math3.complex.Complex complex75 = complex70.tanh();
        org.apache.commons.math3.complex.Complex complex76 = complex61.subtract(complex75);
        org.apache.commons.math3.complex.Complex complex77 = complex75.cosh();
        org.apache.commons.math3.complex.Complex complex78 = complex55.add(complex75);
        org.apache.commons.math3.complex.Complex complex79 = complex75.acos();
        org.apache.commons.math3.complex.Complex complex80 = complex75.tan();
        org.apache.commons.math3.complex.Complex complex81 = complex44.pow(complex75);
        boolean boolean82 = complex16.equals((java.lang.Object) complex44);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex81 and complex1.", complex81.equals(complex1) == complex1.equals(complex81));
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex6 = complex1.sqrt1z();
        boolean boolean7 = complex1.isNaN();
        org.apache.commons.math3.complex.Complex complex8 = complex1.log();
        org.apache.commons.math3.complex.Complex complex9 = complex8.reciprocal();
        org.apache.commons.math3.complex.Complex complex10 = complex8.tan();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex9 and complex1.", complex9.equals(complex1) == complex1.equals(complex9));
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex((-0.0d));
        org.apache.commons.math3.complex.Complex complex3 = complex1.divide((double) (short) 10);
        org.apache.commons.math3.complex.Complex complex5 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex6 = complex5.exp();
        double double7 = complex5.getArgument();
        org.apache.commons.math3.complex.Complex complex9 = complex5.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex10 = complex5.sin();
        org.apache.commons.math3.complex.Complex complex11 = complex5.cosh();
        org.apache.commons.math3.complex.Complex complex12 = complex5.tan();
        org.apache.commons.math3.complex.Complex complex13 = complex5.tan();
        org.apache.commons.math3.complex.Complex complex15 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex16 = complex15.exp();
        double double17 = complex15.getArgument();
        org.apache.commons.math3.complex.Complex complex19 = complex15.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex20 = complex15.sin();
        org.apache.commons.math3.complex.Complex complex21 = complex15.cosh();
        org.apache.commons.math3.complex.Complex complex22 = complex15.tan();
        org.apache.commons.math3.complex.Complex complex23 = complex15.tan();
        org.apache.commons.math3.complex.Complex complex25 = complex15.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex26 = complex13.subtract(complex15);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList28 = complex26.nthRoot((int) '4');
        org.apache.commons.math3.complex.Complex complex29 = complex26.cos();
        org.apache.commons.math3.complex.Complex complex30 = complex26.sin();
        org.apache.commons.math3.complex.Complex complex31 = complex30.cosh();
        org.apache.commons.math3.complex.Complex complex32 = complex31.sinh();
        boolean boolean33 = complex3.equals((java.lang.Object) complex31);
        org.apache.commons.math3.complex.Complex complex36 = new org.apache.commons.math3.complex.Complex((double) (short) -1, (double) '4');
        org.apache.commons.math3.complex.Complex complex38 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double39 = complex38.getImaginary();
        org.apache.commons.math3.complex.Complex complex40 = complex38.negate();
        org.apache.commons.math3.complex.Complex complex42 = complex40.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex43 = complex42.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList45 = complex42.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex47 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex48 = complex47.exp();
        org.apache.commons.math3.complex.Complex complex49 = complex47.tanh();
        org.apache.commons.math3.complex.Complex complex50 = complex42.subtract(complex47);
        org.apache.commons.math3.complex.Complex complex51 = complex42.asin();
        java.lang.String str52 = complex51.toString();
        org.apache.commons.math3.complex.Complex complex53 = complex51.tanh();
        org.apache.commons.math3.complex.Complex complex54 = complex36.pow(complex51);
        org.apache.commons.math3.complex.Complex complex56 = complex54.pow((double) 1.0f);
        org.apache.commons.math3.complex.Complex complex58 = complex54.multiply((int) ' ');
        org.apache.commons.math3.complex.Complex complex59 = complex31.pow(complex58);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex50", complex1.equals(complex50) ? complex1.hashCode() == complex50.hashCode() : true);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test278");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex4.exp();
        org.apache.commons.math3.complex.Complex complex7 = complex4.multiply((int) (short) 1);
        org.apache.commons.math3.complex.Complex complex8 = complex7.cos();
        org.apache.commons.math3.complex.Complex complex10 = complex7.subtract((double) (short) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex8", complex1.equals(complex8) ? complex1.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test279");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex3 = complex2.exp();
        org.apache.commons.math3.complex.Complex complex4 = complex1.pow(complex2);
        java.lang.Class<?> wildcardClass5 = complex2.getClass();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex3 and complex1.", complex3.equals(complex1) == complex1.equals(complex3));
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test280");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex7 = complex3.pow((double) 100L);
        org.apache.commons.math3.complex.Complex complex8 = complex3.reciprocal();
        org.apache.commons.math3.complex.Complex complex9 = complex8.asin();
        org.apache.commons.math3.complex.Complex complex12 = new org.apache.commons.math3.complex.Complex((double) (short) -1, (double) '4');
        org.apache.commons.math3.complex.Complex complex13 = complex12.cos();
        org.apache.commons.math3.complex.Complex complex15 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex16 = complex15.sqrt();
        org.apache.commons.math3.complex.Complex complex17 = complex15.sqrt();
        org.apache.commons.math3.complex.Complex complex18 = complex17.tanh();
        org.apache.commons.math3.complex.Complex complex19 = complex12.divide(complex17);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList21 = complex17.nthRoot((int) 'a');
        org.apache.commons.math3.complex.Complex complex22 = complex8.divide(complex17);
        double double23 = complex17.getImaginary();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex8", complex3.equals(complex8) ? complex3.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test281");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex7 = complex3.subtract(complex6);
        org.apache.commons.math3.complex.Complex complex8 = complex6.cos();
        org.apache.commons.math3.complex.Complex complex9 = complex8.log();
        java.lang.Class<?> wildcardClass10 = complex8.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex6 and complex9", complex6.equals(complex9) ? complex6.hashCode() == complex9.hashCode() : true);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test282");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.sin();
        org.apache.commons.math3.complex.Complex complex7 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex8 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex9 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex12 = complex11.exp();
        double double13 = complex11.getArgument();
        org.apache.commons.math3.complex.Complex complex15 = complex11.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex16 = complex11.sin();
        org.apache.commons.math3.complex.Complex complex17 = complex11.cosh();
        org.apache.commons.math3.complex.Complex complex18 = complex11.tan();
        org.apache.commons.math3.complex.Complex complex19 = complex11.tan();
        org.apache.commons.math3.complex.Complex complex21 = complex11.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex22 = complex9.subtract(complex11);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList24 = complex22.nthRoot((int) '4');
        org.apache.commons.math3.complex.Complex complex25 = complex22.cos();
        org.apache.commons.math3.complex.Complex complex26 = complex22.sin();
        org.apache.commons.math3.complex.Complex complex27 = complex26.cosh();
        org.apache.commons.math3.complex.Complex complex28 = complex27.reciprocal();
        org.apache.commons.math3.complex.Complex complex30 = complex28.multiply(0.0d);
        java.lang.String str31 = complex30.toString();
        org.apache.commons.math3.complex.Complex complex32 = complex30.cos();
        org.apache.commons.math3.complex.Complex complex35 = new org.apache.commons.math3.complex.Complex((double) (byte) 100, 0.0d);
        org.apache.commons.math3.complex.Complex complex36 = complex35.sqrt();
        org.apache.commons.math3.complex.Complex complex37 = complex35.log();
        org.apache.commons.math3.complex.Complex complex39 = complex37.multiply((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex40 = complex37.tan();
        double double41 = complex40.getImaginary();
        org.apache.commons.math3.complex.Complex complex42 = complex40.sqrt();
        org.apache.commons.math3.complex.Complex complex45 = new org.apache.commons.math3.complex.Complex((double) 1, (double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex47 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex48 = complex47.exp();
        double double49 = complex47.getArgument();
        org.apache.commons.math3.complex.Complex complex51 = complex47.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex52 = complex47.sin();
        org.apache.commons.math3.complex.Complex complex53 = complex47.cosh();
        org.apache.commons.math3.complex.Complex complex54 = complex47.tan();
        org.apache.commons.math3.complex.Complex complex55 = complex47.tan();
        org.apache.commons.math3.complex.Complex complex57 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex58 = complex57.exp();
        double double59 = complex57.getArgument();
        org.apache.commons.math3.complex.Complex complex61 = complex57.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex62 = complex57.sin();
        org.apache.commons.math3.complex.Complex complex63 = complex57.cosh();
        org.apache.commons.math3.complex.Complex complex64 = complex57.tan();
        org.apache.commons.math3.complex.Complex complex65 = complex57.tan();
        org.apache.commons.math3.complex.Complex complex67 = complex57.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex68 = complex55.subtract(complex57);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList70 = complex68.nthRoot((int) '4');
        org.apache.commons.math3.complex.Complex complex71 = complex68.cos();
        org.apache.commons.math3.complex.Complex complex72 = complex68.sin();
        org.apache.commons.math3.complex.Complex complex73 = complex72.cosh();
        org.apache.commons.math3.complex.Complex complex74 = complex73.acos();
        org.apache.commons.math3.complex.Complex complex75 = complex45.multiply(complex74);
        boolean boolean76 = complex42.equals((java.lang.Object) complex75);
        org.apache.commons.math3.complex.Complex complex77 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex78 = complex77.cosh();
        org.apache.commons.math3.complex.Complex complex79 = complex77.conjugate();
        org.apache.commons.math3.complex.Complex complex82 = new org.apache.commons.math3.complex.Complex((double) (short) -1, (double) '4');
        org.apache.commons.math3.complex.Complex complex83 = complex82.cos();
        org.apache.commons.math3.complex.Complex complex84 = complex77.subtract(complex82);
        org.apache.commons.math3.complex.Complex complex85 = complex84.atan();
        org.apache.commons.math3.complex.Complex complex86 = complex75.multiply(complex84);
        org.apache.commons.math3.complex.Complex complex87 = complex32.subtract(complex75);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex30 and complex39", complex30.equals(complex39) ? complex30.hashCode() == complex39.hashCode() : true);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test283");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.sin();
        org.apache.commons.math3.complex.Complex complex7 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double10 = complex9.getImaginary();
        boolean boolean11 = complex7.equals((java.lang.Object) double10);
        org.apache.commons.math3.complex.Complex complex12 = complex7.tanh();
        org.apache.commons.math3.complex.Complex complex13 = complex7.tanh();
        org.apache.commons.math3.complex.Complex complex15 = complex7.multiply(0.0d);
        org.apache.commons.math3.complex.Complex complex16 = complex15.sin();
        org.apache.commons.math3.complex.Complex complex17 = complex15.cos();
        org.apache.commons.math3.complex.Complex complex18 = complex15.cosh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex17", complex1.equals(complex17) ? complex1.hashCode() == complex17.hashCode() : true);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test284");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex((double) 100L);
        org.apache.commons.math3.complex.Complex complex3 = complex1.divide((double) (-1));
        org.apache.commons.math3.complex.Complex complex5 = complex1.multiply((double) ' ');
        org.apache.commons.math3.complex.Complex complex8 = org.apache.commons.math3.complex.Complex.valueOf((double) 1, 10.0d);
        org.apache.commons.math3.complex.Complex complex9 = complex8.cosh();
        org.apache.commons.math3.complex.Complex complex10 = complex9.acos();
        org.apache.commons.math3.complex.Complex complex12 = complex9.pow((-4.392948198753447E-23d));
        org.apache.commons.math3.complex.Complex complex13 = complex5.add(complex9);
        org.apache.commons.math3.complex.Complex complex15 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double16 = complex15.getImaginary();
        org.apache.commons.math3.complex.Complex complex17 = complex15.negate();
        org.apache.commons.math3.complex.Complex complex18 = complex17.reciprocal();
        org.apache.commons.math3.complex.Complex complex20 = complex17.divide(100.0d);
        org.apache.commons.math3.complex.Complex complex22 = complex17.multiply((double) 0);
        org.apache.commons.math3.complex.Complex complex23 = complex5.multiply(complex22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex18", complex17.equals(complex18) ? complex17.hashCode() == complex18.hashCode() : true);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test285");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.acos();
        org.apache.commons.math3.complex.Complex complex6 = complex5.cos();
        org.apache.commons.math3.complex.Complex complex8 = complex6.multiply((int) '#');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex5", complex4.equals(complex5) ? complex4.hashCode() == complex5.hashCode() : true);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test286");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex3.reciprocal();
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex7 = complex6.exp();
        double double8 = complex6.getArgument();
        org.apache.commons.math3.complex.Complex complex10 = complex6.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex11 = complex6.sin();
        org.apache.commons.math3.complex.Complex complex12 = complex6.cosh();
        org.apache.commons.math3.complex.Complex complex13 = complex6.tan();
        org.apache.commons.math3.complex.Complex complex14 = complex6.tan();
        org.apache.commons.math3.complex.Complex complex15 = complex3.add(complex14);
        org.apache.commons.math3.complex.Complex complex16 = complex14.cosh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex4", complex3.equals(complex4) ? complex3.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test287");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) (short) -1, (double) '4');
        boolean boolean3 = complex2.isInfinite();
        org.apache.commons.math3.complex.Complex complex6 = new org.apache.commons.math3.complex.Complex((double) 0L, (double) 100.0f);
        org.apache.commons.math3.complex.Complex complex7 = complex2.multiply(complex6);
        org.apache.commons.math3.complex.Complex complex8 = complex6.cos();
        org.apache.commons.math3.complex.Complex complex9 = complex8.atan();
        org.apache.commons.math3.complex.Complex complex10 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex11 = complex10.sqrt1z();
        org.apache.commons.math3.complex.Complex complex12 = complex11.asin();
        org.apache.commons.math3.complex.Complex complex13 = complex9.add(complex11);
        org.apache.commons.math3.complex.Complex complex14 = complex13.asin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex9 and complex12", complex9.equals(complex12) ? complex9.hashCode() == complex12.hashCode() : true);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test288");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math3.complex.Complex complex4 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double5 = complex4.getImaginary();
        org.apache.commons.math3.complex.Complex complex7 = complex4.pow((double) 100L);
        org.apache.commons.math3.complex.Complex complex8 = complex2.pow(complex7);
        double double9 = complex7.abs();
        org.apache.commons.math3.complex.Complex complex10 = complex7.acos();
        org.apache.commons.math3.complex.Complex complex12 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double13 = complex12.getImaginary();
        org.apache.commons.math3.complex.Complex complex14 = complex12.negate();
        org.apache.commons.math3.complex.Complex complex15 = complex14.cosh();
        org.apache.commons.math3.complex.Complex complex16 = complex15.conjugate();
        boolean boolean17 = complex7.equals((java.lang.Object) complex15);
        org.apache.commons.math3.complex.Complex complex18 = complex7.sqrt1z();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex15 and complex16", complex15.equals(complex16) ? complex15.hashCode() == complex16.hashCode() : true);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test289");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex5.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex10 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex11 = complex10.exp();
        org.apache.commons.math3.complex.Complex complex12 = complex10.tanh();
        org.apache.commons.math3.complex.Complex complex13 = complex5.subtract(complex10);
        org.apache.commons.math3.complex.Complex complex14 = complex5.asin();
        java.lang.String str15 = complex14.toString();
        org.apache.commons.math3.complex.Complex complex16 = complex14.tanh();
        org.apache.commons.math3.complex.Complex complex18 = complex14.multiply((double) (short) 10);
        org.apache.commons.math3.complex.Complex complex20 = complex14.pow((double) (-1));
        org.apache.commons.math3.complex.Complex complex21 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex22 = complex21.negate();
        org.apache.commons.math3.complex.Complex complex23 = complex14.divide(complex22);
        org.apache.commons.math3.complex.Complex complex25 = complex22.divide((double) (short) 10);
        org.apache.commons.math3.complex.Complex complex26 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex27 = complex26.cosh();
        org.apache.commons.math3.complex.Complex complex28 = complex26.conjugate();
        org.apache.commons.math3.complex.Complex complex31 = new org.apache.commons.math3.complex.Complex((double) (short) -1, (double) '4');
        org.apache.commons.math3.complex.Complex complex32 = complex31.cos();
        org.apache.commons.math3.complex.Complex complex33 = complex26.subtract(complex31);
        org.apache.commons.math3.complex.Complex complex35 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double36 = complex35.getImaginary();
        org.apache.commons.math3.complex.Complex complex37 = complex35.negate();
        org.apache.commons.math3.complex.Complex complex39 = complex37.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex40 = complex39.atan();
        org.apache.commons.math3.complex.Complex complex42 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex43 = complex42.exp();
        double double44 = complex42.getArgument();
        org.apache.commons.math3.complex.Complex complex46 = complex42.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex47 = complex42.sin();
        org.apache.commons.math3.complex.Complex complex48 = complex42.cosh();
        org.apache.commons.math3.complex.Complex complex50 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double51 = complex50.getImaginary();
        boolean boolean52 = complex48.equals((java.lang.Object) double51);
        org.apache.commons.math3.complex.Complex complex53 = complex48.tanh();
        org.apache.commons.math3.complex.Complex complex54 = complex39.subtract(complex53);
        org.apache.commons.math3.complex.Complex complex55 = complex53.cosh();
        org.apache.commons.math3.complex.Complex complex56 = complex33.add(complex53);
        org.apache.commons.math3.complex.Complex complex57 = complex53.acos();
        org.apache.commons.math3.complex.Complex complex58 = complex53.tan();
        org.apache.commons.math3.complex.Complex complex59 = complex22.pow(complex53);
        org.apache.commons.math3.complex.Complex complex60 = complex22.cosh();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex59 and complex1.", complex59.equals(complex1) == complex1.equals(complex59));
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test290");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList6 = complex4.nthRoot((int) 'a');
        org.apache.commons.math3.complex.Complex complex8 = complex4.add((double) (-1.0f));
        boolean boolean9 = complex4.isNaN();
        org.apache.commons.math3.complex.Complex complex11 = complex4.multiply((double) 100);
        org.apache.commons.math3.complex.Complex complex12 = complex11.cosh();
        org.apache.commons.math3.complex.Complex complex14 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double15 = complex14.getImaginary();
        org.apache.commons.math3.complex.Complex complex16 = complex14.negate();
        org.apache.commons.math3.complex.Complex complex18 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex19 = complex18.exp();
        double double20 = complex18.getArgument();
        org.apache.commons.math3.complex.Complex complex21 = complex18.log();
        org.apache.commons.math3.complex.Complex complex22 = complex18.log();
        org.apache.commons.math3.complex.Complex complex24 = complex22.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex25 = complex16.subtract(complex24);
        org.apache.commons.math3.complex.Complex complex26 = complex25.cos();
        org.apache.commons.math3.complex.Complex complex27 = complex25.tanh();
        org.apache.commons.math3.complex.Complex complex29 = complex25.divide((double) 100.0f);
        org.apache.commons.math3.complex.Complex complex30 = complex12.multiply(complex29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex8 and complex16", complex8.equals(complex16) ? complex8.hashCode() == complex16.hashCode() : true);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test291");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex3.sinh();
        org.apache.commons.math3.complex.Complex complex5 = complex4.acos();
        double double6 = complex5.getReal();
        org.apache.commons.math3.complex.Complex complex8 = complex5.multiply(0);
        org.apache.commons.math3.complex.Complex complex9 = complex8.asin();
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double12 = complex11.getImaginary();
        org.apache.commons.math3.complex.Complex complex13 = complex11.negate();
        org.apache.commons.math3.complex.Complex complex15 = complex13.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex16 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex17 = complex13.subtract(complex16);
        org.apache.commons.math3.complex.Complex complex18 = complex16.sqrt();
        org.apache.commons.math3.complex.Complex complex19 = complex16.exp();
        org.apache.commons.math3.complex.Complex complex20 = complex8.add(complex19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex9 and complex16", complex9.equals(complex16) ? complex9.hashCode() == complex16.hashCode() : true);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test292");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((double) 1, 10.0d);
        org.apache.commons.math3.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math3.complex.Complex complex5 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex6 = complex5.exp();
        double double7 = complex5.getArgument();
        org.apache.commons.math3.complex.Complex complex8 = complex5.log();
        org.apache.commons.math3.complex.Complex complex9 = complex5.log();
        org.apache.commons.math3.complex.Complex complex10 = complex9.negate();
        org.apache.commons.math3.complex.Complex complex11 = complex10.sqrt();
        org.apache.commons.math3.complex.Complex complex12 = complex3.divide(complex10);
        org.apache.commons.math3.complex.Complex complex13 = complex3.asin();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex12 and complex2.", complex12.equals(complex2) == complex2.equals(complex12));
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test293");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex5.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex10 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex11 = complex10.exp();
        org.apache.commons.math3.complex.Complex complex12 = complex10.tanh();
        org.apache.commons.math3.complex.Complex complex13 = complex5.subtract(complex10);
        org.apache.commons.math3.complex.Complex complex15 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex16 = complex15.exp();
        double double17 = complex15.getArgument();
        org.apache.commons.math3.complex.Complex complex19 = complex15.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex20 = complex15.sin();
        org.apache.commons.math3.complex.Complex complex21 = complex15.cosh();
        org.apache.commons.math3.complex.Complex complex22 = complex15.tan();
        org.apache.commons.math3.complex.Complex complex23 = complex15.tan();
        org.apache.commons.math3.complex.Complex complex25 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex26 = complex25.exp();
        double double27 = complex25.getArgument();
        org.apache.commons.math3.complex.Complex complex29 = complex25.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex30 = complex25.sin();
        org.apache.commons.math3.complex.Complex complex31 = complex25.cosh();
        org.apache.commons.math3.complex.Complex complex32 = complex25.tan();
        org.apache.commons.math3.complex.Complex complex33 = complex25.tan();
        org.apache.commons.math3.complex.Complex complex35 = complex25.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex36 = complex23.subtract(complex25);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList38 = complex36.nthRoot((int) '4');
        org.apache.commons.math3.complex.Complex complex39 = complex10.subtract(complex36);
        boolean boolean40 = complex10.isNaN();
        org.apache.commons.math3.complex.Complex complex42 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double43 = complex42.getImaginary();
        org.apache.commons.math3.complex.Complex complex44 = complex42.negate();
        org.apache.commons.math3.complex.Complex complex46 = complex44.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex47 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex48 = complex44.subtract(complex47);
        org.apache.commons.math3.complex.Complex complex49 = complex44.cosh();
        org.apache.commons.math3.complex.Complex complex50 = complex10.divide(complex49);
        boolean boolean51 = complex50.isNaN();
        double double52 = complex50.getImaginary();
        org.apache.commons.math3.complex.Complex complex53 = complex50.conjugate();
        org.apache.commons.math3.complex.Complex complex54 = complex53.cos();
        double double55 = complex54.getReal();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex50 and complex53", complex50.equals(complex53) ? complex50.hashCode() == complex53.hashCode() : true);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test294");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
        org.apache.commons.math3.complex.Complex complex3 = complex1.multiply((int) (byte) 10);
        org.apache.commons.math3.complex.Complex complex5 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double6 = complex5.getImaginary();
        org.apache.commons.math3.complex.Complex complex7 = complex5.negate();
        org.apache.commons.math3.complex.Complex complex9 = complex7.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex10 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex11 = complex7.subtract(complex10);
        org.apache.commons.math3.complex.Complex complex12 = complex7.acos();
        org.apache.commons.math3.complex.Complex complex13 = complex12.sqrt();
        org.apache.commons.math3.complex.Complex complex14 = complex3.pow(complex13);
        org.apache.commons.math3.complex.Complex complex15 = complex14.atan();
        org.apache.commons.math3.complex.Complex complex17 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex18 = complex17.exp();
        double double19 = complex17.getArgument();
        org.apache.commons.math3.complex.Complex complex20 = complex17.log();
        org.apache.commons.math3.complex.Complex complex21 = complex20.log();
        org.apache.commons.math3.complex.Complex complex23 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex24 = complex23.exp();
        double double25 = complex23.getArgument();
        org.apache.commons.math3.complex.Complex complex27 = complex23.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex28 = complex21.pow(complex27);
        boolean boolean29 = complex15.equals((java.lang.Object) complex28);
        org.apache.commons.math3.complex.Complex complex30 = complex15.acos();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex28 and complex1.", complex28.equals(complex1) == complex1.equals(complex28));
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test295");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double8 = complex7.getImaginary();
        org.apache.commons.math3.complex.Complex complex9 = complex7.negate();
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex12 = complex11.exp();
        double double13 = complex11.getArgument();
        org.apache.commons.math3.complex.Complex complex14 = complex11.log();
        org.apache.commons.math3.complex.Complex complex15 = complex11.log();
        org.apache.commons.math3.complex.Complex complex17 = complex15.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex18 = complex9.subtract(complex17);
        org.apache.commons.math3.complex.Complex complex19 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex20 = complex19.sqrt1z();
        boolean boolean21 = complex18.equals((java.lang.Object) complex20);
        org.apache.commons.math3.complex.ComplexField complexField22 = complex20.getField();
        org.apache.commons.math3.complex.Complex complex23 = complex1.divide(complex20);
        org.apache.commons.math3.complex.Complex complex25 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double26 = complex25.getImaginary();
        org.apache.commons.math3.complex.Complex complex27 = complex25.negate();
        org.apache.commons.math3.complex.Complex complex29 = complex27.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex30 = complex29.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList32 = complex29.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex33 = complex29.negate();
        org.apache.commons.math3.complex.Complex complex34 = complex29.acos();
        org.apache.commons.math3.complex.Complex complex35 = complex20.pow(complex34);
        org.apache.commons.math3.complex.Complex complex36 = complex35.log();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex34", complex4.equals(complex34) ? complex4.hashCode() == complex34.hashCode() : true);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test296");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) (byte) 100, 0.0d);
        org.apache.commons.math3.complex.Complex complex3 = complex2.sqrt();
        org.apache.commons.math3.complex.Complex complex4 = complex2.log();
        org.apache.commons.math3.complex.Complex complex6 = complex4.multiply((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex7 = complex4.sqrt1z();
        org.apache.commons.math3.complex.Complex complex10 = org.apache.commons.math3.complex.Complex.valueOf((double) 1, 10.0d);
        org.apache.commons.math3.complex.Complex complex11 = complex10.cosh();
        org.apache.commons.math3.complex.Complex complex13 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex14 = complex13.exp();
        double double15 = complex13.getArgument();
        org.apache.commons.math3.complex.Complex complex16 = complex13.log();
        org.apache.commons.math3.complex.Complex complex17 = complex13.log();
        org.apache.commons.math3.complex.Complex complex18 = complex17.negate();
        org.apache.commons.math3.complex.Complex complex19 = complex18.sqrt();
        org.apache.commons.math3.complex.Complex complex20 = complex11.divide(complex18);
        org.apache.commons.math3.complex.Complex complex21 = complex20.asin();
        org.apache.commons.math3.complex.Complex complex22 = complex7.add(complex20);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex22 and complex2.", complex22.equals(complex2) == complex2.equals(complex22));
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test297");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex4.log();
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex8 = complex7.exp();
        double double9 = complex7.getArgument();
        org.apache.commons.math3.complex.Complex complex11 = complex7.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex12 = complex5.pow(complex11);
        boolean boolean13 = complex11.isInfinite();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex12 and complex1.", complex12.equals(complex1) == complex1.equals(complex12));
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test298");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex7 = complex3.pow((double) 100L);
        org.apache.commons.math3.complex.Complex complex8 = complex3.reciprocal();
        org.apache.commons.math3.complex.Complex complex9 = complex3.tanh();
        org.apache.commons.math3.complex.ComplexField complexField10 = complex3.getField();
        org.apache.commons.math3.complex.Complex complex12 = complex3.multiply(0.03140559722642014d);
        boolean boolean13 = complex12.isInfinite();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex8", complex3.equals(complex8) ? complex3.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test299");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex5.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex10 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex11 = complex10.exp();
        org.apache.commons.math3.complex.Complex complex12 = complex10.tanh();
        org.apache.commons.math3.complex.Complex complex13 = complex5.subtract(complex10);
        org.apache.commons.math3.complex.Complex complex14 = complex5.cos();
        org.apache.commons.math3.complex.Complex complex15 = complex14.tan();
        org.apache.commons.math3.complex.Complex complex17 = complex15.multiply((double) (short) 1);
        boolean boolean18 = complex17.isInfinite();
        org.apache.commons.math3.complex.Complex complex19 = complex17.atan();
        double double20 = complex17.getImaginary();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex14 and complex19", complex14.equals(complex19) ? complex14.hashCode() == complex19.hashCode() : true);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test300");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex4.exp();
        org.apache.commons.math3.complex.Complex complex7 = complex4.multiply((int) (short) 1);
        org.apache.commons.math3.complex.Complex complex8 = complex7.cos();
        org.apache.commons.math3.complex.Complex complex9 = complex7.sinh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex8", complex1.equals(complex8) ? complex1.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test301");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex6 = complex1.divide((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex8 = complex6.divide(complex7);
        org.apache.commons.math3.complex.Complex complex9 = complex8.sinh();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex9 and complex1.", complex9.equals(complex1) == complex1.equals(complex9));
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test302");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex5.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex10 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex11 = complex10.exp();
        org.apache.commons.math3.complex.Complex complex12 = complex10.tanh();
        org.apache.commons.math3.complex.Complex complex13 = complex5.subtract(complex10);
        org.apache.commons.math3.complex.Complex complex15 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex16 = complex15.exp();
        double double17 = complex15.getArgument();
        org.apache.commons.math3.complex.Complex complex19 = complex15.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex20 = complex15.sin();
        org.apache.commons.math3.complex.Complex complex21 = complex15.cosh();
        org.apache.commons.math3.complex.Complex complex22 = complex15.tan();
        org.apache.commons.math3.complex.Complex complex23 = complex15.tan();
        org.apache.commons.math3.complex.Complex complex25 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex26 = complex25.exp();
        double double27 = complex25.getArgument();
        org.apache.commons.math3.complex.Complex complex29 = complex25.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex30 = complex25.sin();
        org.apache.commons.math3.complex.Complex complex31 = complex25.cosh();
        org.apache.commons.math3.complex.Complex complex32 = complex25.tan();
        org.apache.commons.math3.complex.Complex complex33 = complex25.tan();
        org.apache.commons.math3.complex.Complex complex35 = complex25.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex36 = complex23.subtract(complex25);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList38 = complex36.nthRoot((int) '4');
        org.apache.commons.math3.complex.Complex complex39 = complex10.subtract(complex36);
        double double40 = complex10.abs();
        org.apache.commons.math3.complex.Complex complex42 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex43 = complex42.exp();
        double double44 = complex42.getArgument();
        org.apache.commons.math3.complex.Complex complex46 = complex42.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex47 = complex42.sin();
        org.apache.commons.math3.complex.Complex complex48 = complex42.cosh();
        org.apache.commons.math3.complex.Complex complex49 = complex42.tan();
        org.apache.commons.math3.complex.Complex complex50 = complex42.tan();
        org.apache.commons.math3.complex.Complex complex52 = complex42.subtract((double) (short) -1);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList54 = complex42.nthRoot(100);
        org.apache.commons.math3.complex.Complex complex55 = complex42.sinh();
        org.apache.commons.math3.complex.Complex complex57 = complex55.multiply((int) (short) 100);
        double double58 = complex57.getArgument();
        org.apache.commons.math3.complex.Complex complex61 = new org.apache.commons.math3.complex.Complex((double) (short) -1, (double) '4');
        org.apache.commons.math3.complex.Complex complex63 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double64 = complex63.getImaginary();
        org.apache.commons.math3.complex.Complex complex65 = complex63.negate();
        org.apache.commons.math3.complex.Complex complex67 = complex65.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex68 = complex67.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList70 = complex67.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex72 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex73 = complex72.exp();
        org.apache.commons.math3.complex.Complex complex74 = complex72.tanh();
        org.apache.commons.math3.complex.Complex complex75 = complex67.subtract(complex72);
        org.apache.commons.math3.complex.Complex complex76 = complex67.asin();
        java.lang.String str77 = complex76.toString();
        org.apache.commons.math3.complex.Complex complex78 = complex76.tanh();
        org.apache.commons.math3.complex.Complex complex79 = complex61.pow(complex76);
        org.apache.commons.math3.complex.Complex complex80 = complex79.exp();
        org.apache.commons.math3.complex.Complex complex81 = complex57.pow(complex79);
        org.apache.commons.math3.complex.Complex complex82 = complex10.divide(complex79);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex13 and complex81", complex13.equals(complex81) ? complex13.hashCode() == complex81.hashCode() : true);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test303");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex7 = complex5.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex8 = complex5.sqrt();
        org.apache.commons.math3.complex.Complex complex9 = complex5.conjugate();
        org.apache.commons.math3.complex.Complex complex10 = complex5.cosh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex9", complex4.equals(complex9) ? complex4.hashCode() == complex9.hashCode() : true);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test304");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex7 = complex5.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex8 = complex5.sqrt();
        org.apache.commons.math3.complex.Complex complex10 = complex5.multiply((int) '#');
        org.apache.commons.math3.complex.Complex complex11 = complex10.reciprocal();
        java.lang.String str12 = complex11.toString();
        org.apache.commons.math3.complex.Complex complex15 = org.apache.commons.math3.complex.Complex.valueOf((double) 100.0f, (double) (short) 1);
        org.apache.commons.math3.complex.ComplexField complexField16 = complex15.getField();
        org.apache.commons.math3.complex.Complex complex17 = complex15.sinh();
        org.apache.commons.math3.complex.Complex complex18 = complex11.pow(complex17);
        java.lang.String str19 = complex18.toString();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex18 and complex1.", complex18.equals(complex1) == complex1.equals(complex18));
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test305");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex4.log();
        org.apache.commons.math3.complex.Complex complex6 = complex4.reciprocal();
        org.apache.commons.math3.complex.Complex complex8 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex9 = complex8.exp();
        double double10 = complex8.getArgument();
        org.apache.commons.math3.complex.Complex complex12 = complex8.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex13 = complex8.sin();
        org.apache.commons.math3.complex.Complex complex14 = complex8.cosh();
        org.apache.commons.math3.complex.Complex complex16 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double17 = complex16.getImaginary();
        boolean boolean18 = complex14.equals((java.lang.Object) double17);
        org.apache.commons.math3.complex.Complex complex19 = complex14.tanh();
        boolean boolean20 = complex6.equals((java.lang.Object) complex14);
        java.lang.Class<?> wildcardClass21 = complex14.getClass();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex6 and complex1.", complex6.equals(complex1) == complex1.equals(complex6));
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test306");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.sin();
        org.apache.commons.math3.complex.Complex complex7 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex8 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex9 = complex8.conjugate();
        org.apache.commons.math3.complex.Complex complex10 = complex9.sqrt1z();
        org.apache.commons.math3.complex.Complex complex11 = complex9.conjugate();
        org.apache.commons.math3.complex.Complex complex13 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex14 = complex13.exp();
        double double15 = complex13.getArgument();
        org.apache.commons.math3.complex.Complex complex16 = complex13.log();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList18 = complex16.nthRoot((int) 'a');
        org.apache.commons.math3.complex.Complex complex20 = complex16.add((double) (-1.0f));
        boolean boolean21 = complex16.isNaN();
        org.apache.commons.math3.complex.Complex complex22 = complex9.add(complex16);
        boolean boolean23 = complex16.isInfinite();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex8 and complex9", complex8.equals(complex9) ? complex8.hashCode() == complex9.hashCode() : true);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test307");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex6 = new org.apache.commons.math3.complex.Complex((double) 10, (double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex8 = complex6.add((double) (byte) 10);
        double double9 = complex8.getImaginary();
        org.apache.commons.math3.complex.Complex complex10 = complex8.tan();
        double double11 = complex8.getImaginary();
        org.apache.commons.math3.complex.Complex complex12 = complex1.add(complex8);
        org.apache.commons.math3.complex.Complex complex13 = complex1.acos();
        org.apache.commons.math3.complex.Complex complex15 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex16 = complex15.exp();
        double double17 = complex15.getArgument();
        org.apache.commons.math3.complex.Complex complex19 = complex15.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex20 = complex15.sin();
        org.apache.commons.math3.complex.Complex complex21 = complex15.cosh();
        org.apache.commons.math3.complex.Complex complex22 = complex15.tan();
        org.apache.commons.math3.complex.Complex complex23 = complex15.tan();
        org.apache.commons.math3.complex.Complex complex25 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex26 = complex25.exp();
        double double27 = complex25.getArgument();
        org.apache.commons.math3.complex.Complex complex29 = complex25.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex30 = complex25.sin();
        org.apache.commons.math3.complex.Complex complex31 = complex25.cosh();
        org.apache.commons.math3.complex.Complex complex32 = complex25.tan();
        org.apache.commons.math3.complex.Complex complex33 = complex25.tan();
        org.apache.commons.math3.complex.Complex complex35 = complex25.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex36 = complex23.subtract(complex25);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList38 = complex36.nthRoot((int) '4');
        org.apache.commons.math3.complex.Complex complex39 = complex36.cos();
        org.apache.commons.math3.complex.Complex complex40 = complex36.sin();
        org.apache.commons.math3.complex.Complex complex41 = complex40.cosh();
        org.apache.commons.math3.complex.Complex complex42 = complex41.acos();
        org.apache.commons.math3.complex.ComplexField complexField43 = complex41.getField();
        org.apache.commons.math3.complex.Complex complex45 = new org.apache.commons.math3.complex.Complex((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex46 = complex41.pow(complex45);
        org.apache.commons.math3.complex.Complex complex47 = complex1.subtract(complex41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex13 and complex45", complex13.equals(complex45) ? complex13.hashCode() == complex45.hashCode() : true);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test308");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((double) 1, 10.0d);
        org.apache.commons.math3.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math3.complex.Complex complex5 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex6 = complex5.exp();
        double double7 = complex5.getArgument();
        org.apache.commons.math3.complex.Complex complex8 = complex5.log();
        org.apache.commons.math3.complex.Complex complex9 = complex5.log();
        org.apache.commons.math3.complex.Complex complex10 = complex9.negate();
        org.apache.commons.math3.complex.Complex complex11 = complex10.sqrt();
        org.apache.commons.math3.complex.Complex complex12 = complex3.divide(complex10);
        org.apache.commons.math3.complex.Complex complex13 = complex12.asin();
        org.apache.commons.math3.complex.Complex complex16 = org.apache.commons.math3.complex.Complex.valueOf((double) (short) 0, 1.0d);
        org.apache.commons.math3.complex.Complex complex18 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex19 = complex18.exp();
        org.apache.commons.math3.complex.Complex complex20 = complex18.tan();
        org.apache.commons.math3.complex.Complex complex22 = complex18.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex24 = new org.apache.commons.math3.complex.Complex((double) 100L);
        org.apache.commons.math3.complex.Complex complex26 = complex24.divide((double) (-1));
        org.apache.commons.math3.complex.Complex complex28 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex29 = complex28.exp();
        double double30 = complex28.getArgument();
        org.apache.commons.math3.complex.Complex complex32 = complex28.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex33 = complex28.sin();
        org.apache.commons.math3.complex.Complex complex34 = complex28.cosh();
        org.apache.commons.math3.complex.Complex complex35 = complex28.tan();
        org.apache.commons.math3.complex.Complex complex36 = complex24.multiply(complex35);
        org.apache.commons.math3.complex.Complex complex37 = complex22.divide(complex36);
        org.apache.commons.math3.complex.Complex complex38 = complex36.conjugate();
        org.apache.commons.math3.complex.Complex complex39 = complex16.subtract(complex36);
        org.apache.commons.math3.complex.Complex complex40 = complex12.pow(complex16);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex40 and complex2.", complex40.equals(complex2) == complex2.equals(complex40));
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test309");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex7 = complex5.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex8 = complex5.sqrt();
        org.apache.commons.math3.complex.Complex complex10 = complex5.multiply((int) '#');
        org.apache.commons.math3.complex.Complex complex11 = complex10.reciprocal();
        java.lang.String str12 = complex11.toString();
        org.apache.commons.math3.complex.Complex complex15 = org.apache.commons.math3.complex.Complex.valueOf((double) 100.0f, (double) (short) 1);
        org.apache.commons.math3.complex.ComplexField complexField16 = complex15.getField();
        org.apache.commons.math3.complex.Complex complex17 = complex15.sinh();
        org.apache.commons.math3.complex.Complex complex18 = complex11.pow(complex17);
        boolean boolean19 = complex17.isInfinite();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex11 and complex1.", complex11.equals(complex1) == complex1.equals(complex11));
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test310");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.sin();
        org.apache.commons.math3.complex.Complex complex7 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex8 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex9 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex12 = complex11.exp();
        double double13 = complex11.getArgument();
        org.apache.commons.math3.complex.Complex complex15 = complex11.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex16 = complex11.sin();
        org.apache.commons.math3.complex.Complex complex17 = complex11.cosh();
        org.apache.commons.math3.complex.Complex complex18 = complex11.tan();
        org.apache.commons.math3.complex.Complex complex19 = complex11.tan();
        org.apache.commons.math3.complex.Complex complex21 = complex11.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex22 = complex9.subtract(complex11);
        org.apache.commons.math3.complex.Complex complex23 = complex11.tanh();
        org.apache.commons.math3.complex.Complex complex25 = complex23.pow((double) 100.0f);
        org.apache.commons.math3.complex.Complex complex26 = complex25.cosh();
        double double27 = complex26.getReal();
        org.apache.commons.math3.complex.Complex complex29 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex30 = complex29.exp();
        double double31 = complex29.getArgument();
        org.apache.commons.math3.complex.Complex complex33 = complex29.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex34 = complex29.sin();
        org.apache.commons.math3.complex.Complex complex36 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex37 = complex36.exp();
        double double38 = complex36.getArgument();
        org.apache.commons.math3.complex.Complex complex39 = complex36.log();
        org.apache.commons.math3.complex.Complex complex40 = complex39.log();
        org.apache.commons.math3.complex.Complex complex41 = complex34.pow(complex40);
        boolean boolean42 = complex41.isInfinite();
        boolean boolean43 = complex41.isNaN();
        org.apache.commons.math3.complex.Complex complex44 = complex41.asin();
        org.apache.commons.math3.complex.Complex complex45 = complex26.multiply(complex44);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex41 and complex1.", complex41.equals(complex1) == complex1.equals(complex41));
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test311");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex(10.0d, (double) 100L);
        org.apache.commons.math3.complex.Complex complex4 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex5 = complex4.sqrt();
        org.apache.commons.math3.complex.Complex complex6 = complex2.multiply(complex5);
        org.apache.commons.math3.complex.Complex complex8 = complex5.pow((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex9 = complex8.cos();
        org.apache.commons.math3.complex.Complex complex10 = complex9.reciprocal();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex8", complex4.equals(complex8) ? complex4.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test312");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) (byte) 100, 0.0d);
        org.apache.commons.math3.complex.Complex complex3 = complex2.sqrt();
        org.apache.commons.math3.complex.Complex complex4 = complex2.log();
        org.apache.commons.math3.complex.Complex complex6 = complex4.multiply((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex7 = complex4.log();
        double double8 = complex4.abs();
        org.apache.commons.math3.complex.Complex complex9 = complex4.acos();
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex12 = complex11.exp();
        double double13 = complex11.getArgument();
        org.apache.commons.math3.complex.Complex complex14 = complex11.log();
        org.apache.commons.math3.complex.Complex complex15 = complex11.log();
        org.apache.commons.math3.complex.Complex complex16 = complex11.sqrt1z();
        org.apache.commons.math3.complex.Complex complex17 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex18 = complex16.add(complex17);
        org.apache.commons.math3.complex.Complex complex19 = complex16.acos();
        org.apache.commons.math3.complex.Complex complex20 = complex19.sin();
        boolean boolean21 = complex4.equals((java.lang.Object) complex19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex11 and complex20", complex11.equals(complex20) ? complex11.hashCode() == complex20.hashCode() : true);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test313");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.sin();
        org.apache.commons.math3.complex.Complex complex7 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex8 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex9 = complex8.conjugate();
        org.apache.commons.math3.complex.Complex complex10 = complex9.sqrt1z();
        org.apache.commons.math3.complex.Complex complex11 = complex9.conjugate();
        org.apache.commons.math3.complex.Complex complex13 = complex9.multiply(0.0d);
        org.apache.commons.math3.complex.ComplexField complexField14 = complex13.getField();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex8 and complex9", complex8.equals(complex9) ? complex8.hashCode() == complex9.hashCode() : true);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test314");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math3.complex.Complex complex4 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double5 = complex4.getImaginary();
        org.apache.commons.math3.complex.Complex complex7 = complex4.pow((double) 100L);
        org.apache.commons.math3.complex.Complex complex8 = complex2.pow(complex7);
        double double9 = complex7.abs();
        org.apache.commons.math3.complex.Complex complex10 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex11 = complex10.exp();
        boolean boolean12 = complex10.isInfinite();
        org.apache.commons.math3.complex.Complex complex13 = complex7.multiply(complex10);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex11 and complex1.", complex11.equals(complex1) == complex1.equals(complex11));
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test315");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math3.complex.Complex complex8 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double9 = complex8.getImaginary();
        org.apache.commons.math3.complex.Complex complex10 = complex8.negate();
        org.apache.commons.math3.complex.Complex complex12 = complex10.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex13 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex14 = complex10.subtract(complex13);
        org.apache.commons.math3.complex.Complex complex15 = complex5.divide(complex14);
        org.apache.commons.math3.complex.Complex complex17 = complex5.divide(1.0349512282932293E22d);
        org.apache.commons.math3.complex.Complex complex18 = complex17.acos();
        org.apache.commons.math3.complex.Complex complex20 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex21 = complex20.exp();
        double double22 = complex20.getArgument();
        org.apache.commons.math3.complex.Complex complex24 = complex20.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex25 = complex20.sin();
        org.apache.commons.math3.complex.Complex complex26 = complex20.cosh();
        org.apache.commons.math3.complex.Complex complex27 = complex20.tan();
        org.apache.commons.math3.complex.Complex complex28 = complex20.tan();
        org.apache.commons.math3.complex.Complex complex30 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex31 = complex30.exp();
        double double32 = complex30.getArgument();
        org.apache.commons.math3.complex.Complex complex34 = complex30.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex35 = complex30.sin();
        org.apache.commons.math3.complex.Complex complex36 = complex30.cosh();
        org.apache.commons.math3.complex.Complex complex37 = complex30.tan();
        org.apache.commons.math3.complex.Complex complex38 = complex30.tan();
        org.apache.commons.math3.complex.Complex complex40 = complex30.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex41 = complex28.subtract(complex30);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList43 = complex41.nthRoot((int) '4');
        org.apache.commons.math3.complex.Complex complex44 = complex41.cos();
        org.apache.commons.math3.complex.Complex complex45 = complex41.sin();
        org.apache.commons.math3.complex.Complex complex46 = complex45.cosh();
        org.apache.commons.math3.complex.Complex complex47 = complex46.reciprocal();
        org.apache.commons.math3.complex.Complex complex49 = complex47.multiply(0.0d);
        org.apache.commons.math3.complex.Complex complex50 = complex47.reciprocal();
        org.apache.commons.math3.complex.Complex complex51 = complex17.divide(complex50);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex13 and complex49", complex13.equals(complex49) ? complex13.hashCode() == complex49.hashCode() : true);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test316");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.sin();
        org.apache.commons.math3.complex.Complex complex8 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex9 = complex8.exp();
        double double10 = complex8.getArgument();
        org.apache.commons.math3.complex.Complex complex11 = complex8.log();
        org.apache.commons.math3.complex.Complex complex12 = complex11.log();
        org.apache.commons.math3.complex.Complex complex13 = complex6.pow(complex12);
        org.apache.commons.math3.complex.Complex complex14 = complex12.cosh();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex13 and complex1.", complex13.equals(complex1) == complex1.equals(complex13));
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test317");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex3.reciprocal();
        org.apache.commons.math3.complex.Complex complex6 = complex3.divide(100.0d);
        org.apache.commons.math3.complex.Complex complex8 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex9 = complex8.exp();
        double double10 = complex8.getArgument();
        org.apache.commons.math3.complex.Complex complex11 = complex8.log();
        org.apache.commons.math3.complex.Complex complex12 = complex8.log();
        org.apache.commons.math3.complex.Complex complex13 = complex12.negate();
        org.apache.commons.math3.complex.Complex complex14 = complex6.multiply(complex13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex4", complex3.equals(complex4) ? complex3.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test318");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex1 = complex0.acos();
        org.apache.commons.math3.complex.Complex complex3 = complex0.subtract((double) (byte) 1);
        org.apache.commons.math3.complex.Complex complex5 = complex3.divide((double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex8 = complex7.exp();
        double double9 = complex7.getArgument();
        org.apache.commons.math3.complex.Complex complex10 = complex7.log();
        org.apache.commons.math3.complex.Complex complex11 = complex7.log();
        org.apache.commons.math3.complex.Complex complex12 = complex7.sqrt1z();
        org.apache.commons.math3.complex.Complex complex13 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex14 = complex12.add(complex13);
        org.apache.commons.math3.complex.Complex complex15 = complex12.cosh();
        org.apache.commons.math3.complex.Complex complex16 = complex15.conjugate();
        org.apache.commons.math3.complex.Complex complex17 = complex16.log();
        org.apache.commons.math3.complex.Complex complex18 = complex5.pow(complex16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex17", complex0.equals(complex17) ? complex0.hashCode() == complex17.hashCode() : true);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test319");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.sin();
        org.apache.commons.math3.complex.Complex complex7 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex8 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex9 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex11 = complex1.subtract((double) (short) -1);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList13 = complex1.nthRoot(100);
        org.apache.commons.math3.complex.Complex complex14 = complex1.sinh();
        org.apache.commons.math3.complex.Complex complex16 = complex14.multiply((int) (short) 100);
        double double17 = complex16.getArgument();
        org.apache.commons.math3.complex.Complex complex20 = new org.apache.commons.math3.complex.Complex((double) (short) -1, (double) '4');
        org.apache.commons.math3.complex.Complex complex22 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double23 = complex22.getImaginary();
        org.apache.commons.math3.complex.Complex complex24 = complex22.negate();
        org.apache.commons.math3.complex.Complex complex26 = complex24.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex27 = complex26.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList29 = complex26.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex31 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex32 = complex31.exp();
        org.apache.commons.math3.complex.Complex complex33 = complex31.tanh();
        org.apache.commons.math3.complex.Complex complex34 = complex26.subtract(complex31);
        org.apache.commons.math3.complex.Complex complex35 = complex26.asin();
        java.lang.String str36 = complex35.toString();
        org.apache.commons.math3.complex.Complex complex37 = complex35.tanh();
        org.apache.commons.math3.complex.Complex complex38 = complex20.pow(complex35);
        org.apache.commons.math3.complex.Complex complex39 = complex38.exp();
        org.apache.commons.math3.complex.Complex complex40 = complex16.pow(complex38);
        org.apache.commons.math3.complex.Complex complex41 = complex38.acos();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex34 and complex40", complex34.equals(complex40) ? complex34.hashCode() == complex40.hashCode() : true);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test320");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 10, (double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex4 = complex2.add((double) (byte) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex4.pow(1.0d);
        org.apache.commons.math3.complex.Complex complex7 = complex6.conjugate();
        org.apache.commons.math3.complex.Complex complex9 = new org.apache.commons.math3.complex.Complex((double) 0.0f);
        boolean boolean10 = complex9.isInfinite();
        org.apache.commons.math3.complex.Complex complex12 = complex9.add((double) (-1.0f));
        org.apache.commons.math3.complex.Complex complex15 = new org.apache.commons.math3.complex.Complex((double) 100, (double) (short) 0);
        org.apache.commons.math3.complex.Complex complex16 = complex12.subtract(complex15);
        org.apache.commons.math3.complex.Complex complex17 = complex7.subtract(complex12);
        org.apache.commons.math3.complex.Complex complex20 = new org.apache.commons.math3.complex.Complex((double) (-1.0f), (double) 100.0f);
        org.apache.commons.math3.complex.Complex complex21 = complex20.sin();
        org.apache.commons.math3.complex.Complex complex22 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex23 = complex22.cosh();
        org.apache.commons.math3.complex.Complex complex24 = complex22.conjugate();
        org.apache.commons.math3.complex.Complex complex27 = new org.apache.commons.math3.complex.Complex((double) (short) -1, (double) '4');
        org.apache.commons.math3.complex.Complex complex28 = complex27.cos();
        org.apache.commons.math3.complex.Complex complex29 = complex22.subtract(complex27);
        org.apache.commons.math3.complex.Complex complex30 = complex21.multiply(complex27);
        java.lang.String str31 = complex27.toString();
        org.apache.commons.math3.complex.Complex complex34 = new org.apache.commons.math3.complex.Complex((double) (short) -1, (double) '4');
        org.apache.commons.math3.complex.Complex complex35 = complex34.log();
        org.apache.commons.math3.complex.Complex complex37 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double38 = complex37.getImaginary();
        org.apache.commons.math3.complex.Complex complex39 = complex37.negate();
        org.apache.commons.math3.complex.Complex complex41 = complex39.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex42 = complex35.add(complex39);
        org.apache.commons.math3.complex.Complex complex43 = complex27.subtract(complex35);
        boolean boolean44 = complex12.equals((java.lang.Object) complex35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex6 and complex7", complex6.equals(complex7) ? complex6.hashCode() == complex7.hashCode() : true);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test321");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math3.complex.Complex complex7 = complex5.reciprocal();
        double double8 = complex5.getReal();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex7", complex1.equals(complex7) ? complex1.hashCode() == complex7.hashCode() : true);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test322");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) (byte) 100, 0.0d);
        org.apache.commons.math3.complex.Complex complex3 = complex2.sqrt();
        org.apache.commons.math3.complex.Complex complex4 = complex2.log();
        org.apache.commons.math3.complex.Complex complex6 = complex4.multiply((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex7 = complex4.sin();
        org.apache.commons.math3.complex.Complex complex8 = complex4.tanh();
        org.apache.commons.math3.complex.Complex complex10 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex11 = complex10.exp();
        double double12 = complex10.getArgument();
        org.apache.commons.math3.complex.Complex complex14 = complex10.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex15 = complex10.sin();
        org.apache.commons.math3.complex.Complex complex16 = complex10.cosh();
        org.apache.commons.math3.complex.Complex complex17 = complex10.tan();
        org.apache.commons.math3.complex.Complex complex18 = complex10.tan();
        org.apache.commons.math3.complex.Complex complex20 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex21 = complex20.exp();
        double double22 = complex20.getArgument();
        org.apache.commons.math3.complex.Complex complex24 = complex20.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex25 = complex20.sin();
        org.apache.commons.math3.complex.Complex complex26 = complex20.cosh();
        org.apache.commons.math3.complex.Complex complex27 = complex20.tan();
        org.apache.commons.math3.complex.Complex complex28 = complex20.tan();
        org.apache.commons.math3.complex.Complex complex30 = complex20.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex31 = complex18.subtract(complex20);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList33 = complex31.nthRoot((int) '4');
        org.apache.commons.math3.complex.Complex complex34 = complex31.cos();
        org.apache.commons.math3.complex.Complex complex35 = complex31.sin();
        org.apache.commons.math3.complex.Complex complex36 = complex35.cosh();
        org.apache.commons.math3.complex.Complex complex37 = complex36.acos();
        org.apache.commons.math3.complex.ComplexField complexField38 = complex36.getField();
        org.apache.commons.math3.complex.Complex complex40 = new org.apache.commons.math3.complex.Complex((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex41 = complex36.pow(complex40);
        org.apache.commons.math3.complex.Complex complex43 = complex40.add(100.0d);
        org.apache.commons.math3.complex.Complex complex44 = complex40.log();
        org.apache.commons.math3.complex.Complex complex45 = complex44.sinh();
        org.apache.commons.math3.complex.Complex complex46 = complex4.multiply(complex45);
        org.apache.commons.math3.complex.Complex complex48 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex49 = complex48.exp();
        org.apache.commons.math3.complex.Complex complex50 = complex48.tanh();
        org.apache.commons.math3.complex.Complex complex51 = complex50.log();
        org.apache.commons.math3.complex.Complex complex52 = complex50.acos();
        boolean boolean53 = complex52.isNaN();
        org.apache.commons.math3.complex.Complex complex54 = complex4.subtract(complex52);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex45 and complex2.", complex45.equals(complex2) == complex2.equals(complex45));
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test323");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex4 = complex2.subtract(2.820679600601607E-23d);
        org.apache.commons.math3.complex.Complex complex5 = complex4.conjugate();
        org.apache.commons.math3.complex.Complex complex6 = complex4.sqrt();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex5", complex2.equals(complex5) ? complex2.hashCode() == complex5.hashCode() : true);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test324");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex5 = complex1.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex6 = complex5.log();
        org.apache.commons.math3.complex.Complex complex8 = complex5.subtract((double) 10L);
        boolean boolean9 = complex8.isInfinite();
        boolean boolean10 = complex8.isNaN();
        org.apache.commons.math3.complex.Complex complex11 = complex8.sqrt1z();
        org.apache.commons.math3.complex.Complex complex13 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double14 = complex13.getImaginary();
        org.apache.commons.math3.complex.Complex complex15 = complex13.negate();
        org.apache.commons.math3.complex.Complex complex16 = complex15.reciprocal();
        org.apache.commons.math3.complex.Complex complex18 = complex15.divide(100.0d);
        org.apache.commons.math3.complex.Complex complex19 = complex15.sqrt1z();
        org.apache.commons.math3.complex.Complex complex20 = complex8.multiply(complex15);
        org.apache.commons.math3.complex.Complex complex23 = org.apache.commons.math3.complex.Complex.valueOf((double) '#', 8.509181282393216d);
        org.apache.commons.math3.complex.Complex complex24 = complex23.sqrt1z();
        org.apache.commons.math3.complex.Complex complex25 = complex15.multiply(complex24);
        double double26 = complex25.getImaginary();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex15 and complex16", complex15.equals(complex16) ? complex15.hashCode() == complex16.hashCode() : true);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test325");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex5 = complex1.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex6 = complex5.log();
        org.apache.commons.math3.complex.Complex complex8 = complex5.subtract((double) 10L);
        boolean boolean9 = complex8.isInfinite();
        org.apache.commons.math3.complex.Complex complex10 = complex8.conjugate();
        org.apache.commons.math3.complex.Complex complex11 = complex8.sinh();
        boolean boolean12 = complex11.isInfinite();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex8 and complex10", complex8.equals(complex10) ? complex8.hashCode() == complex10.hashCode() : true);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test326");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex6 = complex5.negate();
        org.apache.commons.math3.complex.Complex complex7 = complex6.sqrt();
        org.apache.commons.math3.complex.Complex complex9 = complex6.multiply(2.0d);
        org.apache.commons.math3.complex.Complex complex11 = complex6.pow(2534.769615493933d);
        org.apache.commons.math3.complex.Complex complex13 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex14 = complex13.exp();
        org.apache.commons.math3.complex.Complex complex15 = complex13.tanh();
        org.apache.commons.math3.complex.Complex complex16 = complex15.log();
        org.apache.commons.math3.complex.Complex complex17 = complex15.acos();
        org.apache.commons.math3.complex.Complex complex19 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double20 = complex19.getImaginary();
        org.apache.commons.math3.complex.Complex complex21 = complex19.negate();
        org.apache.commons.math3.complex.Complex complex22 = complex21.reciprocal();
        boolean boolean23 = complex22.isNaN();
        double double24 = complex22.getArgument();
        org.apache.commons.math3.complex.Complex complex25 = complex15.subtract(complex22);
        org.apache.commons.math3.complex.Complex complex26 = complex11.divide(complex15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex21 and complex22", complex21.equals(complex22) ? complex21.hashCode() == complex22.hashCode() : true);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test327");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex5.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex9 = complex5.log();
        org.apache.commons.math3.complex.Complex complex10 = complex5.reciprocal();
        org.apache.commons.math3.complex.Complex complex11 = complex5.log();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex10", complex1.equals(complex10) ? complex1.hashCode() == complex10.hashCode() : true);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test328");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tanh();
        org.apache.commons.math3.complex.Complex complex4 = complex3.log();
        org.apache.commons.math3.complex.Complex complex5 = complex3.acos();
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double8 = complex7.getImaginary();
        org.apache.commons.math3.complex.Complex complex9 = complex7.negate();
        org.apache.commons.math3.complex.Complex complex10 = complex9.reciprocal();
        boolean boolean11 = complex10.isNaN();
        double double12 = complex10.getArgument();
        org.apache.commons.math3.complex.Complex complex13 = complex3.subtract(complex10);
        org.apache.commons.math3.complex.ComplexField complexField14 = complex10.getField();
        org.apache.commons.math3.complex.Complex complex15 = complex10.asin();
        org.apache.commons.math3.complex.Complex complex16 = complex10.sqrt1z();
        org.apache.commons.math3.complex.Complex complex18 = org.apache.commons.math3.complex.Complex.valueOf(0.7853981633974483d);
        org.apache.commons.math3.complex.Complex complex19 = complex10.multiply(complex18);
        double double20 = complex18.getArgument();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex9 and complex10", complex9.equals(complex10) ? complex9.hashCode() == complex10.hashCode() : true);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test329");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) (byte) 100, 0.0d);
        org.apache.commons.math3.complex.Complex complex3 = complex2.sqrt();
        org.apache.commons.math3.complex.Complex complex4 = complex2.log();
        org.apache.commons.math3.complex.Complex complex6 = complex4.multiply((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex7 = complex4.log();
        org.apache.commons.math3.complex.Complex complex8 = complex4.cos();
        boolean boolean9 = complex8.isNaN();
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex12 = complex11.exp();
        double double13 = complex11.getArgument();
        org.apache.commons.math3.complex.Complex complex14 = complex11.log();
        org.apache.commons.math3.complex.Complex complex15 = complex11.log();
        org.apache.commons.math3.complex.Complex complex16 = complex11.sqrt1z();
        boolean boolean17 = complex11.isNaN();
        org.apache.commons.math3.complex.Complex complex18 = complex11.log();
        org.apache.commons.math3.complex.Complex complex19 = complex18.cos();
        org.apache.commons.math3.complex.Complex complex20 = complex8.subtract(complex18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex11 and complex19", complex11.equals(complex19) ? complex11.hashCode() == complex19.hashCode() : true);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test330");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex7 = complex3.subtract(complex6);
        org.apache.commons.math3.complex.Complex complex8 = complex3.cosh();
        double double9 = complex3.getImaginary();
        org.apache.commons.math3.complex.Complex complex10 = complex3.sqrt1z();
        org.apache.commons.math3.complex.Complex complex12 = complex3.add(2.0d);
        org.apache.commons.math3.complex.Complex complex14 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex15 = complex14.exp();
        double double16 = complex14.getArgument();
        org.apache.commons.math3.complex.Complex complex17 = complex14.log();
        org.apache.commons.math3.complex.Complex complex18 = complex14.log();
        org.apache.commons.math3.complex.Complex complex19 = complex14.acos();
        org.apache.commons.math3.complex.Complex complex21 = complex19.subtract((double) '#');
        java.lang.String str22 = complex19.toString();
        org.apache.commons.math3.complex.Complex complex24 = new org.apache.commons.math3.complex.Complex((double) 100L);
        org.apache.commons.math3.complex.Complex complex26 = complex24.divide((double) (-1));
        org.apache.commons.math3.complex.Complex complex28 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex29 = complex28.exp();
        double double30 = complex28.getArgument();
        org.apache.commons.math3.complex.Complex complex32 = complex28.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex33 = complex28.sin();
        org.apache.commons.math3.complex.Complex complex34 = complex28.cosh();
        org.apache.commons.math3.complex.Complex complex35 = complex28.tan();
        org.apache.commons.math3.complex.Complex complex36 = complex24.multiply(complex35);
        boolean boolean37 = complex19.equals((java.lang.Object) complex36);
        org.apache.commons.math3.complex.Complex complex39 = complex19.subtract(1.6118410375849543E22d);
        org.apache.commons.math3.complex.Complex complex40 = complex3.pow(complex39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex12", complex1.equals(complex12) ? complex1.hashCode() == complex12.hashCode() : true);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test331");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math3.complex.Complex complex7 = complex5.reciprocal();
        org.apache.commons.math3.complex.Complex complex8 = complex7.cosh();
        org.apache.commons.math3.complex.Complex complex9 = complex7.acos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList11 = complex9.nthRoot((int) (byte) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex7", complex1.equals(complex7) ? complex1.hashCode() == complex7.hashCode() : true);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test332");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex3.cosh();
        org.apache.commons.math3.complex.Complex complex5 = complex4.conjugate();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList7 = complex4.nthRoot((int) (short) 10);
        org.apache.commons.math3.complex.Complex complex8 = complex4.reciprocal();
        boolean boolean9 = complex8.isInfinite();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex5", complex4.equals(complex5) ? complex4.hashCode() == complex5.hashCode() : true);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test333");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf(100.0d, (double) (short) 100);
        org.apache.commons.math3.complex.Complex complex4 = complex2.add(0.0d);
        org.apache.commons.math3.complex.Complex complex6 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex7 = complex6.sqrt();
        org.apache.commons.math3.complex.Complex complex8 = complex6.sqrt();
        org.apache.commons.math3.complex.Complex complex9 = complex8.tanh();
        org.apache.commons.math3.complex.Complex complex10 = complex9.acos();
        org.apache.commons.math3.complex.Complex complex12 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex13 = complex12.exp();
        org.apache.commons.math3.complex.Complex complex14 = complex12.tan();
        org.apache.commons.math3.complex.Complex complex16 = complex12.pow((-0.0d));
        boolean boolean17 = complex10.equals((java.lang.Object) complex16);
        org.apache.commons.math3.complex.Complex complex18 = complex2.subtract(complex10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex6 and complex16", complex6.equals(complex16) ? complex6.hashCode() == complex16.hashCode() : true);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test334");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.sin();
        org.apache.commons.math3.complex.Complex complex7 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex8 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex9 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex12 = complex11.exp();
        double double13 = complex11.getArgument();
        org.apache.commons.math3.complex.Complex complex15 = complex11.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex16 = complex11.sin();
        org.apache.commons.math3.complex.Complex complex17 = complex11.cosh();
        org.apache.commons.math3.complex.Complex complex18 = complex11.tan();
        org.apache.commons.math3.complex.Complex complex19 = complex11.tan();
        org.apache.commons.math3.complex.Complex complex21 = complex11.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex22 = complex9.subtract(complex11);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList24 = complex22.nthRoot((int) '4');
        org.apache.commons.math3.complex.Complex complex25 = complex22.cos();
        org.apache.commons.math3.complex.Complex complex26 = complex22.tanh();
        org.apache.commons.math3.complex.Complex complex27 = complex22.reciprocal();
        org.apache.commons.math3.complex.Complex complex29 = complex27.pow(2.820679600601607E-23d);
        org.apache.commons.math3.complex.Complex complex30 = complex27.acos();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex29", complex1.equals(complex29) ? complex1.hashCode() == complex29.hashCode() : true);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test335");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double3 = complex2.getImaginary();
        org.apache.commons.math3.complex.Complex complex4 = complex2.negate();
        org.apache.commons.math3.complex.Complex complex6 = complex4.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex8 = complex4.subtract(complex7);
        org.apache.commons.math3.complex.Complex complex9 = complex4.acos();
        org.apache.commons.math3.complex.Complex complex10 = complex0.subtract(complex4);
        org.apache.commons.math3.complex.Complex complex11 = complex4.atan();
        org.apache.commons.math3.complex.Complex complex13 = complex4.pow((double) 0L);
        org.apache.commons.math3.complex.Complex complex14 = complex4.negate();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex13", complex2.equals(complex13) ? complex2.hashCode() == complex13.hashCode() : true);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test336");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex5.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex10 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex11 = complex10.exp();
        org.apache.commons.math3.complex.Complex complex12 = complex10.tanh();
        org.apache.commons.math3.complex.Complex complex13 = complex5.subtract(complex10);
        boolean boolean14 = complex13.isNaN();
        org.apache.commons.math3.complex.Complex complex16 = complex13.pow(0.1585290151921035d);
        org.apache.commons.math3.complex.Complex complex19 = new org.apache.commons.math3.complex.Complex((double) (byte) 100, 0.0d);
        org.apache.commons.math3.complex.Complex complex20 = complex19.sqrt();
        org.apache.commons.math3.complex.Complex complex21 = complex19.log();
        org.apache.commons.math3.complex.Complex complex23 = complex21.multiply((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex24 = complex21.log();
        double double25 = complex21.abs();
        org.apache.commons.math3.complex.Complex complex26 = complex21.acos();
        org.apache.commons.math3.complex.Complex complex27 = complex13.divide(complex26);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex16 and complex1.", complex16.equals(complex1) == complex1.equals(complex16));
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test337");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex1 = complex0.exp();
        boolean boolean2 = complex0.isInfinite();
        org.apache.commons.math3.complex.Complex complex3 = complex0.cos();
        org.apache.commons.math3.complex.Complex complex6 = new org.apache.commons.math3.complex.Complex(1.0349512282932293E22d, (double) 0);
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex8 = complex7.cosh();
        org.apache.commons.math3.complex.Complex complex9 = complex7.conjugate();
        org.apache.commons.math3.complex.Complex complex12 = new org.apache.commons.math3.complex.Complex((double) (short) -1, (double) '4');
        org.apache.commons.math3.complex.Complex complex13 = complex12.cos();
        org.apache.commons.math3.complex.Complex complex14 = complex7.subtract(complex12);
        org.apache.commons.math3.complex.Complex complex15 = complex14.atan();
        org.apache.commons.math3.complex.Complex complex16 = complex6.subtract(complex15);
        org.apache.commons.math3.complex.Complex complex18 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double19 = complex18.getImaginary();
        org.apache.commons.math3.complex.Complex complex20 = complex18.negate();
        org.apache.commons.math3.complex.Complex complex21 = complex20.sinh();
        org.apache.commons.math3.complex.Complex complex22 = complex21.tanh();
        org.apache.commons.math3.complex.Complex complex24 = complex22.subtract((double) 1L);
        org.apache.commons.math3.complex.Complex complex25 = complex24.atan();
        org.apache.commons.math3.complex.Complex complex26 = complex16.divide(complex25);
        org.apache.commons.math3.complex.Complex complex27 = complex0.pow(complex26);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex1 and complex6.", complex1.equals(complex6) == complex6.equals(complex1));
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test338");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double3 = complex2.getImaginary();
        org.apache.commons.math3.complex.Complex complex4 = complex2.negate();
        org.apache.commons.math3.complex.Complex complex6 = complex4.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex8 = complex4.subtract(complex7);
        org.apache.commons.math3.complex.Complex complex9 = complex4.acos();
        org.apache.commons.math3.complex.Complex complex10 = complex0.subtract(complex4);
        org.apache.commons.math3.complex.Complex complex11 = complex4.atan();
        org.apache.commons.math3.complex.Complex complex13 = complex4.pow((double) 0L);
        org.apache.commons.math3.complex.Complex complex14 = complex4.exp();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex13", complex2.equals(complex13) ? complex2.hashCode() == complex13.hashCode() : true);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test339");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex7 = complex5.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex8 = complex5.sqrt();
        org.apache.commons.math3.complex.Complex complex10 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double11 = complex10.getImaginary();
        org.apache.commons.math3.complex.Complex complex12 = complex10.negate();
        org.apache.commons.math3.complex.Complex complex13 = complex12.sinh();
        org.apache.commons.math3.complex.Complex complex14 = complex13.tanh();
        org.apache.commons.math3.complex.Complex complex16 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double17 = complex16.getImaginary();
        org.apache.commons.math3.complex.Complex complex18 = complex16.negate();
        org.apache.commons.math3.complex.Complex complex19 = complex18.sinh();
        org.apache.commons.math3.complex.Complex complex20 = complex19.acos();
        org.apache.commons.math3.complex.Complex complex22 = complex20.add(2.820679600601607E-23d);
        org.apache.commons.math3.complex.Complex complex23 = complex20.acos();
        org.apache.commons.math3.complex.Complex complex25 = complex23.add((double) 'a');
        org.apache.commons.math3.complex.Complex complex26 = complex23.tanh();
        org.apache.commons.math3.complex.Complex complex27 = complex13.subtract(complex23);
        org.apache.commons.math3.complex.Complex complex28 = complex8.pow(complex13);
        org.apache.commons.math3.complex.Complex complex30 = complex28.divide(2.97065629219474d);
        org.apache.commons.math3.complex.ComplexField complexField31 = complex28.getField();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex30 and complex1.", complex30.equals(complex1) == complex1.equals(complex30));
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test340");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex6 = complex1.acos();
        org.apache.commons.math3.complex.Complex complex8 = complex6.subtract((double) '#');
        java.lang.String str9 = complex6.toString();
        double double10 = complex6.getImaginary();
        org.apache.commons.math3.complex.Complex complex11 = complex6.reciprocal();
        org.apache.commons.math3.complex.Complex complex13 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex14 = complex13.exp();
        double double15 = complex13.getArgument();
        org.apache.commons.math3.complex.Complex complex17 = complex13.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex18 = complex13.sin();
        org.apache.commons.math3.complex.Complex complex19 = complex13.cosh();
        org.apache.commons.math3.complex.Complex complex20 = complex13.tan();
        org.apache.commons.math3.complex.Complex complex21 = complex13.negate();
        boolean boolean22 = complex11.equals((java.lang.Object) complex13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex6", complex4.equals(complex6) ? complex4.hashCode() == complex6.hashCode() : true);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test341");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex6 = complex1.divide((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex7 = complex6.tan();
        org.apache.commons.math3.complex.Complex complex8 = complex6.asin();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex8 and complex1.", complex8.equals(complex1) == complex1.equals(complex8));
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test342");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.sin();
        org.apache.commons.math3.complex.Complex complex7 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex8 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex9 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex12 = complex11.exp();
        double double13 = complex11.getArgument();
        org.apache.commons.math3.complex.Complex complex15 = complex11.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex16 = complex11.sin();
        org.apache.commons.math3.complex.Complex complex17 = complex11.cosh();
        org.apache.commons.math3.complex.Complex complex18 = complex11.tan();
        org.apache.commons.math3.complex.Complex complex19 = complex11.tan();
        org.apache.commons.math3.complex.Complex complex21 = complex11.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex22 = complex9.subtract(complex11);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList24 = complex22.nthRoot((int) '4');
        org.apache.commons.math3.complex.Complex complex25 = complex22.cos();
        org.apache.commons.math3.complex.Complex complex26 = complex22.sin();
        org.apache.commons.math3.complex.Complex complex27 = complex26.cosh();
        org.apache.commons.math3.complex.Complex complex28 = complex27.reciprocal();
        org.apache.commons.math3.complex.Complex complex30 = complex28.multiply(0.0d);
        org.apache.commons.math3.complex.Complex complex31 = complex28.tanh();
        double double32 = complex31.abs();
        org.apache.commons.math3.complex.Complex complex35 = new org.apache.commons.math3.complex.Complex((double) 10, (double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex37 = complex35.add((double) (byte) 10);
        org.apache.commons.math3.complex.Complex complex39 = complex37.pow(1.0d);
        org.apache.commons.math3.complex.Complex complex40 = complex39.sin();
        org.apache.commons.math3.complex.Complex complex41 = complex40.cos();
        org.apache.commons.math3.complex.Complex complex42 = complex31.add(complex41);
        org.apache.commons.math3.complex.Complex complex45 = new org.apache.commons.math3.complex.Complex((double) (short) -1, (double) '4');
        org.apache.commons.math3.complex.Complex complex47 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double48 = complex47.getImaginary();
        org.apache.commons.math3.complex.Complex complex49 = complex47.negate();
        org.apache.commons.math3.complex.Complex complex51 = complex49.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex52 = complex51.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList54 = complex51.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex56 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex57 = complex56.exp();
        org.apache.commons.math3.complex.Complex complex58 = complex56.tanh();
        org.apache.commons.math3.complex.Complex complex59 = complex51.subtract(complex56);
        org.apache.commons.math3.complex.Complex complex60 = complex51.asin();
        java.lang.String str61 = complex60.toString();
        org.apache.commons.math3.complex.Complex complex62 = complex60.tanh();
        org.apache.commons.math3.complex.Complex complex63 = complex45.pow(complex60);
        double double64 = complex60.getArgument();
        org.apache.commons.math3.complex.Complex complex65 = complex42.divide(complex60);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex30 and complex59", complex30.equals(complex59) ? complex30.hashCode() == complex59.hashCode() : true);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test343");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.sin();
        org.apache.commons.math3.complex.Complex complex7 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex8 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex9 = complex8.conjugate();
        org.apache.commons.math3.complex.Complex complex10 = complex9.sqrt1z();
        org.apache.commons.math3.complex.Complex complex11 = complex9.conjugate();
        org.apache.commons.math3.complex.Complex complex13 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex14 = complex13.exp();
        double double15 = complex13.getArgument();
        org.apache.commons.math3.complex.Complex complex16 = complex13.log();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList18 = complex16.nthRoot((int) 'a');
        org.apache.commons.math3.complex.Complex complex20 = complex16.add((double) (-1.0f));
        boolean boolean21 = complex16.isNaN();
        org.apache.commons.math3.complex.Complex complex22 = complex9.add(complex16);
        org.apache.commons.math3.complex.Complex complex24 = complex22.divide(0.4080820618133952d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex8 and complex9", complex8.equals(complex9) ? complex8.hashCode() == complex9.hashCode() : true);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test344");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex5.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex10 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex11 = complex10.exp();
        org.apache.commons.math3.complex.Complex complex12 = complex10.tanh();
        org.apache.commons.math3.complex.Complex complex13 = complex5.subtract(complex10);
        org.apache.commons.math3.complex.Complex complex14 = complex5.tanh();
        org.apache.commons.math3.complex.Complex complex15 = complex5.acos();
        org.apache.commons.math3.complex.Complex complex17 = complex5.pow(Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex13 and complex15", complex13.equals(complex15) ? complex13.hashCode() == complex15.hashCode() : true);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test345");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math3.complex.Complex complex8 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double9 = complex8.getImaginary();
        org.apache.commons.math3.complex.Complex complex10 = complex8.negate();
        org.apache.commons.math3.complex.Complex complex12 = complex10.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex13 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex14 = complex10.subtract(complex13);
        org.apache.commons.math3.complex.Complex complex15 = complex5.divide(complex14);
        org.apache.commons.math3.complex.Complex complex16 = complex15.reciprocal();
        org.apache.commons.math3.complex.Complex complex17 = complex16.sinh();
        org.apache.commons.math3.complex.Complex complex18 = complex17.asin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex16", complex3.equals(complex16) ? complex3.hashCode() == complex16.hashCode() : true);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test346");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 10, (double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex4 = complex2.add((double) (byte) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex4.pow(1.0d);
        org.apache.commons.math3.complex.Complex complex7 = complex6.sin();
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex10 = complex9.exp();
        double double11 = complex9.getArgument();
        org.apache.commons.math3.complex.Complex complex12 = complex9.log();
        org.apache.commons.math3.complex.Complex complex13 = complex9.log();
        org.apache.commons.math3.complex.Complex complex15 = complex13.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex16 = complex6.multiply(complex13);
        org.apache.commons.math3.complex.Complex complex17 = complex16.conjugate();
        org.apache.commons.math3.complex.Complex complex18 = complex17.reciprocal();
        org.apache.commons.math3.complex.ComplexField complexField19 = complex17.getField();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex18 and complex2.", complex18.equals(complex2) == complex2.equals(complex18));
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test347");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex5.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex10 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex11 = complex10.exp();
        org.apache.commons.math3.complex.Complex complex12 = complex10.tanh();
        org.apache.commons.math3.complex.Complex complex13 = complex5.subtract(complex10);
        org.apache.commons.math3.complex.Complex complex14 = complex5.asin();
        java.lang.String str15 = complex14.toString();
        org.apache.commons.math3.complex.Complex complex16 = complex14.tanh();
        org.apache.commons.math3.complex.Complex complex18 = complex14.multiply((double) (short) 10);
        org.apache.commons.math3.complex.Complex complex20 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex21 = complex20.exp();
        org.apache.commons.math3.complex.Complex complex22 = complex20.tan();
        org.apache.commons.math3.complex.Complex complex24 = complex20.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex25 = complex24.log();
        org.apache.commons.math3.complex.Complex complex27 = complex24.subtract((double) 10L);
        boolean boolean28 = complex27.isInfinite();
        org.apache.commons.math3.complex.Complex complex29 = complex27.conjugate();
        org.apache.commons.math3.complex.Complex complex31 = complex27.add((double) 10.0f);
        org.apache.commons.math3.complex.Complex complex33 = complex27.pow((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex34 = complex14.add(complex33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex27 and complex29", complex27.equals(complex29) ? complex27.hashCode() == complex29.hashCode() : true);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test348");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex6 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex9 = new org.apache.commons.math3.complex.Complex((double) (short) -1, (double) '4');
        org.apache.commons.math3.complex.Complex complex10 = complex9.cos();
        org.apache.commons.math3.complex.Complex complex11 = complex6.divide(complex10);
        org.apache.commons.math3.complex.Complex complex13 = complex10.multiply(0.0d);
        org.apache.commons.math3.complex.Complex complex15 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double16 = complex15.getImaginary();
        org.apache.commons.math3.complex.Complex complex17 = complex15.negate();
        org.apache.commons.math3.complex.Complex complex19 = complex17.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex21 = complex17.pow((double) 100L);
        org.apache.commons.math3.complex.Complex complex22 = complex17.reciprocal();
        org.apache.commons.math3.complex.Complex complex25 = org.apache.commons.math3.complex.Complex.valueOf((double) 'a', (-35.0d));
        org.apache.commons.math3.complex.Complex complex26 = complex17.add(complex25);
        org.apache.commons.math3.complex.Complex complex27 = complex13.multiply(complex25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex22", complex17.equals(complex22) ? complex17.hashCode() == complex22.hashCode() : true);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test349");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex(0.006420926159343307d, 0.08736342403678843d);
        org.apache.commons.math3.complex.Complex complex4 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex5 = complex4.exp();
        org.apache.commons.math3.complex.Complex complex6 = complex4.tanh();
        org.apache.commons.math3.complex.Complex complex7 = complex6.log();
        org.apache.commons.math3.complex.Complex complex8 = complex6.acos();
        org.apache.commons.math3.complex.Complex complex10 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double11 = complex10.getImaginary();
        org.apache.commons.math3.complex.Complex complex12 = complex10.negate();
        org.apache.commons.math3.complex.Complex complex13 = complex12.reciprocal();
        boolean boolean14 = complex13.isNaN();
        double double15 = complex13.getArgument();
        org.apache.commons.math3.complex.Complex complex16 = complex6.subtract(complex13);
        org.apache.commons.math3.complex.ComplexField complexField17 = complex13.getField();
        org.apache.commons.math3.complex.Complex complex18 = complex13.asin();
        org.apache.commons.math3.complex.Complex complex19 = complex13.sqrt1z();
        org.apache.commons.math3.complex.Complex complex21 = org.apache.commons.math3.complex.Complex.valueOf(0.7853981633974483d);
        org.apache.commons.math3.complex.Complex complex22 = complex13.multiply(complex21);
        org.apache.commons.math3.complex.Complex complex23 = complex2.subtract(complex21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex12 and complex13", complex12.equals(complex13) ? complex12.hashCode() == complex13.hashCode() : true);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test350");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex5.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex10 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex11 = complex10.exp();
        org.apache.commons.math3.complex.Complex complex12 = complex10.tanh();
        org.apache.commons.math3.complex.Complex complex13 = complex5.subtract(complex10);
        org.apache.commons.math3.complex.Complex complex14 = complex5.cos();
        org.apache.commons.math3.complex.Complex complex15 = complex14.tan();
        org.apache.commons.math3.complex.Complex complex17 = complex15.multiply((double) (short) 1);
        boolean boolean18 = complex17.isInfinite();
        org.apache.commons.math3.complex.Complex complex19 = complex17.atan();
        org.apache.commons.math3.complex.Complex complex21 = complex17.subtract(0.1585290151921035d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex14 and complex19", complex14.equals(complex19) ? complex14.hashCode() == complex19.hashCode() : true);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test351");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex5.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex10 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex11 = complex10.exp();
        org.apache.commons.math3.complex.Complex complex12 = complex10.tanh();
        org.apache.commons.math3.complex.Complex complex13 = complex5.subtract(complex10);
        org.apache.commons.math3.complex.Complex complex15 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex16 = complex15.exp();
        double double17 = complex15.getArgument();
        org.apache.commons.math3.complex.Complex complex19 = complex15.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex20 = complex15.sin();
        org.apache.commons.math3.complex.Complex complex21 = complex15.cosh();
        org.apache.commons.math3.complex.Complex complex22 = complex15.tan();
        org.apache.commons.math3.complex.Complex complex23 = complex15.tan();
        org.apache.commons.math3.complex.Complex complex25 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex26 = complex25.exp();
        double double27 = complex25.getArgument();
        org.apache.commons.math3.complex.Complex complex29 = complex25.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex30 = complex25.sin();
        org.apache.commons.math3.complex.Complex complex31 = complex25.cosh();
        org.apache.commons.math3.complex.Complex complex32 = complex25.tan();
        org.apache.commons.math3.complex.Complex complex33 = complex25.tan();
        org.apache.commons.math3.complex.Complex complex35 = complex25.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex36 = complex23.subtract(complex25);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList38 = complex36.nthRoot((int) '4');
        org.apache.commons.math3.complex.Complex complex39 = complex10.subtract(complex36);
        org.apache.commons.math3.complex.Complex complex40 = complex39.tanh();
        org.apache.commons.math3.complex.Complex complex41 = complex39.sqrt1z();
        org.apache.commons.math3.complex.Complex complex43 = complex41.add(Double.NaN);
        org.apache.commons.math3.complex.Complex complex44 = complex41.asin();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex43 and complex1.", complex43.equals(complex1) == complex1.equals(complex43));
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test352");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 10, (double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex4 = complex2.add((double) (byte) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex4.pow(1.0d);
        org.apache.commons.math3.complex.Complex complex7 = complex6.sin();
        org.apache.commons.math3.complex.Complex complex9 = complex6.divide(1.0349512282932293E22d);
        org.apache.commons.math3.complex.Complex complex10 = complex6.tanh();
        org.apache.commons.math3.complex.Complex complex11 = complex10.sqrt();
        org.apache.commons.math3.complex.Complex complex13 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double14 = complex13.getImaginary();
        org.apache.commons.math3.complex.Complex complex15 = complex13.negate();
        org.apache.commons.math3.complex.Complex complex16 = complex15.sinh();
        org.apache.commons.math3.complex.Complex complex17 = complex16.tanh();
        org.apache.commons.math3.complex.Complex complex18 = complex17.sqrt1z();
        org.apache.commons.math3.complex.Complex complex20 = complex17.multiply((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex22 = complex17.pow(1.6118410375849543E22d);
        org.apache.commons.math3.complex.Complex complex23 = complex10.divide(complex22);
        org.apache.commons.math3.complex.Complex complex24 = complex10.reciprocal();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex23 and complex2.", complex23.equals(complex2) == complex2.equals(complex23));
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test353");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex6 = complex1.sqrt1z();
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex8 = complex6.add(complex7);
        org.apache.commons.math3.complex.Complex complex9 = complex6.cosh();
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex12 = complex11.exp();
        double double13 = complex11.getArgument();
        org.apache.commons.math3.complex.Complex complex14 = complex11.log();
        org.apache.commons.math3.complex.Complex complex15 = complex11.log();
        org.apache.commons.math3.complex.Complex complex17 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double18 = complex17.getImaginary();
        org.apache.commons.math3.complex.Complex complex19 = complex17.negate();
        org.apache.commons.math3.complex.Complex complex21 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex22 = complex21.exp();
        double double23 = complex21.getArgument();
        org.apache.commons.math3.complex.Complex complex24 = complex21.log();
        org.apache.commons.math3.complex.Complex complex25 = complex21.log();
        org.apache.commons.math3.complex.Complex complex27 = complex25.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex28 = complex19.subtract(complex27);
        org.apache.commons.math3.complex.Complex complex29 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex30 = complex29.sqrt1z();
        boolean boolean31 = complex28.equals((java.lang.Object) complex30);
        org.apache.commons.math3.complex.ComplexField complexField32 = complex30.getField();
        org.apache.commons.math3.complex.Complex complex33 = complex11.divide(complex30);
        org.apache.commons.math3.complex.Complex complex35 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double36 = complex35.getImaginary();
        org.apache.commons.math3.complex.Complex complex37 = complex35.negate();
        org.apache.commons.math3.complex.Complex complex39 = complex37.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex40 = complex39.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList42 = complex39.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex43 = complex39.negate();
        org.apache.commons.math3.complex.Complex complex44 = complex39.acos();
        org.apache.commons.math3.complex.Complex complex45 = complex30.pow(complex44);
        org.apache.commons.math3.complex.Complex complex46 = complex9.pow(complex45);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex44", complex4.equals(complex44) ? complex4.hashCode() == complex44.hashCode() : true);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test354");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex6 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex9 = new org.apache.commons.math3.complex.Complex((double) (short) -1, (double) '4');
        org.apache.commons.math3.complex.Complex complex10 = complex9.cos();
        org.apache.commons.math3.complex.Complex complex11 = complex6.divide(complex10);
        org.apache.commons.math3.complex.Complex complex12 = complex10.asin();
        org.apache.commons.math3.complex.Complex complex13 = complex12.reciprocal();
        org.apache.commons.math3.complex.Complex complex14 = complex13.asin();
        org.apache.commons.math3.complex.Complex complex16 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex17 = complex16.exp();
        double double18 = complex16.getArgument();
        org.apache.commons.math3.complex.Complex complex19 = complex16.log();
        org.apache.commons.math3.complex.Complex complex21 = complex16.divide((double) (short) 0);
        boolean boolean22 = complex14.equals((java.lang.Object) complex16);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex21 and complex1.", complex21.equals(complex1) == complex1.equals(complex21));
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test355");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex5.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex10 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex11 = complex10.exp();
        org.apache.commons.math3.complex.Complex complex12 = complex10.tanh();
        org.apache.commons.math3.complex.Complex complex13 = complex5.subtract(complex10);
        org.apache.commons.math3.complex.Complex complex14 = complex5.asin();
        java.lang.String str15 = complex14.toString();
        org.apache.commons.math3.complex.Complex complex17 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex18 = complex17.exp();
        double double19 = complex17.getArgument();
        org.apache.commons.math3.complex.Complex complex21 = complex17.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex22 = complex17.sin();
        org.apache.commons.math3.complex.Complex complex23 = complex17.cosh();
        org.apache.commons.math3.complex.Complex complex24 = complex17.tan();
        org.apache.commons.math3.complex.Complex complex25 = complex17.tan();
        org.apache.commons.math3.complex.Complex complex27 = complex17.subtract((double) (short) -1);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList29 = complex17.nthRoot(100);
        org.apache.commons.math3.complex.Complex complex30 = complex17.sinh();
        org.apache.commons.math3.complex.Complex complex31 = complex14.divide(complex17);
        org.apache.commons.math3.complex.Complex complex32 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex33 = complex32.sqrt1z();
        org.apache.commons.math3.complex.Complex complex34 = complex32.sqrt();
        org.apache.commons.math3.complex.Complex complex35 = complex31.pow(complex32);
        org.apache.commons.math3.complex.Complex complex36 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex37 = complex36.sqrt1z();
        org.apache.commons.math3.complex.Complex complex39 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double40 = complex39.getImaginary();
        org.apache.commons.math3.complex.Complex complex41 = complex39.negate();
        org.apache.commons.math3.complex.Complex complex42 = complex41.sinh();
        org.apache.commons.math3.complex.Complex complex43 = complex42.acos();
        org.apache.commons.math3.complex.Complex complex44 = complex37.divide(complex42);
        org.apache.commons.math3.complex.Complex complex45 = complex44.tan();
        org.apache.commons.math3.complex.Complex complex46 = complex45.tan();
        org.apache.commons.math3.complex.Complex complex47 = complex32.multiply(complex45);
        boolean boolean48 = complex32.isNaN();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex13 and complex47", complex13.equals(complex47) ? complex13.hashCode() == complex47.hashCode() : true);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test356");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math3.complex.Complex complex2 = complex0.reciprocal();
        org.apache.commons.math3.complex.ComplexField complexField3 = complex0.getField();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex1 and complex2.", complex1.equals(complex2) == complex2.equals(complex1));
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test357");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 10, (double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex4 = complex2.add((double) (byte) 10);
        org.apache.commons.math3.complex.Complex complex5 = complex4.exp();
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex8 = complex7.exp();
        double double9 = complex7.getArgument();
        org.apache.commons.math3.complex.Complex complex11 = complex7.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex12 = complex7.exp();
        org.apache.commons.math3.complex.Complex complex14 = complex12.multiply((int) (short) 0);
        org.apache.commons.math3.complex.Complex complex15 = complex12.tan();
        org.apache.commons.math3.complex.Complex complex17 = complex12.subtract(Double.NEGATIVE_INFINITY);
        org.apache.commons.math3.complex.Complex complex18 = complex17.conjugate();
        org.apache.commons.math3.complex.Complex complex19 = complex17.exp();
        org.apache.commons.math3.complex.Complex complex20 = complex5.add(complex19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex18", complex17.equals(complex18) ? complex17.hashCode() == complex18.hashCode() : true);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test358");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 10, (double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((double) (byte) 1);
        org.apache.commons.math3.complex.Complex complex6 = complex4.divide((double) (byte) 0);
        boolean boolean7 = complex4.isNaN();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex6 and complex2.", complex6.equals(complex2) == complex2.equals(complex6));
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test359");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.INF;
        double double1 = complex0.getImaginary();
        org.apache.commons.math3.complex.Complex complex2 = complex0.asin();
        double double3 = complex0.getArgument();
        double double4 = complex0.getArgument();
        org.apache.commons.math3.complex.Complex complex6 = complex0.multiply((-2.0158089984440206E-8d));
        org.apache.commons.math3.complex.Complex complex8 = complex0.divide((double) 1);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex2 and complex0.", complex2.equals(complex0) == complex0.equals(complex2));
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test360");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.sin();
        org.apache.commons.math3.complex.Complex complex8 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex9 = complex8.exp();
        double double10 = complex8.getArgument();
        org.apache.commons.math3.complex.Complex complex11 = complex8.log();
        org.apache.commons.math3.complex.Complex complex12 = complex11.log();
        org.apache.commons.math3.complex.Complex complex13 = complex6.pow(complex12);
        boolean boolean14 = complex13.isInfinite();
        boolean boolean15 = complex13.isNaN();
        org.apache.commons.math3.complex.Complex complex16 = complex13.asin();
        org.apache.commons.math3.complex.Complex complex18 = complex13.divide((-4.392948198753447E-23d));
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex18 and complex1.", complex18.equals(complex1) == complex1.equals(complex18));
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test361");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex5 = complex1.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex6 = complex5.log();
        org.apache.commons.math3.complex.Complex complex8 = complex5.subtract((double) 10L);
        boolean boolean9 = complex8.isInfinite();
        boolean boolean10 = complex8.isNaN();
        org.apache.commons.math3.complex.Complex complex11 = complex8.sqrt1z();
        org.apache.commons.math3.complex.Complex complex13 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double14 = complex13.getImaginary();
        org.apache.commons.math3.complex.Complex complex15 = complex13.negate();
        org.apache.commons.math3.complex.Complex complex16 = complex15.reciprocal();
        org.apache.commons.math3.complex.Complex complex18 = complex15.divide(100.0d);
        org.apache.commons.math3.complex.Complex complex19 = complex15.sqrt1z();
        org.apache.commons.math3.complex.Complex complex20 = complex8.multiply(complex15);
        org.apache.commons.math3.complex.Complex complex23 = org.apache.commons.math3.complex.Complex.valueOf((double) '#', 8.509181282393216d);
        org.apache.commons.math3.complex.Complex complex24 = complex23.sqrt1z();
        org.apache.commons.math3.complex.Complex complex25 = complex15.multiply(complex24);
        org.apache.commons.math3.complex.Complex complex26 = complex25.cosh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex15 and complex16", complex15.equals(complex16) ? complex15.hashCode() == complex16.hashCode() : true);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test362");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex6 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex7 = complex1.conjugate();
        org.apache.commons.math3.complex.Complex complex8 = complex1.negate();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex5 and complex7", complex5.equals(complex7) ? complex5.hashCode() == complex7.hashCode() : true);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test363");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex6 = complex5.exp();
        double double7 = complex5.getArgument();
        org.apache.commons.math3.complex.Complex complex8 = complex5.log();
        org.apache.commons.math3.complex.Complex complex9 = complex5.log();
        org.apache.commons.math3.complex.Complex complex11 = complex9.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex12 = complex3.subtract(complex11);
        org.apache.commons.math3.complex.Complex complex14 = complex3.subtract((double) 'a');
        org.apache.commons.math3.complex.Complex complex16 = complex14.divide((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex18 = complex14.multiply(0);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex16 and complex1.", complex16.equals(complex1) == complex1.equals(complex16));
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test364");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex7 = complex1.sqrt1z();
        org.apache.commons.math3.complex.Complex complex9 = complex7.pow(7.211769165453326d);
        double double10 = complex7.getImaginary();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex9 and complex1.", complex9.equals(complex1) == complex1.equals(complex9));
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test365");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex((double) 0.0f);
        boolean boolean2 = complex1.isInfinite();
        org.apache.commons.math3.complex.Complex complex4 = complex1.pow((double) 0L);
        org.apache.commons.math3.complex.Complex complex5 = complex1.acos();
        org.apache.commons.math3.complex.Complex complex6 = complex5.log();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex4 and complex1.", complex4.equals(complex1) == complex1.equals(complex4));
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test366");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex6 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex8 = complex1.multiply(1.5691849834744453d);
        org.apache.commons.math3.complex.Complex complex10 = complex1.multiply(0.0d);
        org.apache.commons.math3.complex.Complex complex12 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double13 = complex12.getImaginary();
        org.apache.commons.math3.complex.Complex complex14 = complex12.negate();
        org.apache.commons.math3.complex.Complex complex16 = complex14.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex17 = complex16.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList19 = complex16.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex21 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex22 = complex21.exp();
        org.apache.commons.math3.complex.Complex complex23 = complex21.tanh();
        org.apache.commons.math3.complex.Complex complex24 = complex16.subtract(complex21);
        org.apache.commons.math3.complex.Complex complex26 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex27 = complex26.exp();
        double double28 = complex26.getArgument();
        org.apache.commons.math3.complex.Complex complex30 = complex26.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex31 = complex26.sin();
        org.apache.commons.math3.complex.Complex complex32 = complex26.cosh();
        org.apache.commons.math3.complex.Complex complex33 = complex26.tan();
        org.apache.commons.math3.complex.Complex complex34 = complex26.tan();
        org.apache.commons.math3.complex.Complex complex36 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex37 = complex36.exp();
        double double38 = complex36.getArgument();
        org.apache.commons.math3.complex.Complex complex40 = complex36.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex41 = complex36.sin();
        org.apache.commons.math3.complex.Complex complex42 = complex36.cosh();
        org.apache.commons.math3.complex.Complex complex43 = complex36.tan();
        org.apache.commons.math3.complex.Complex complex44 = complex36.tan();
        org.apache.commons.math3.complex.Complex complex46 = complex36.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex47 = complex34.subtract(complex36);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList49 = complex47.nthRoot((int) '4');
        org.apache.commons.math3.complex.Complex complex50 = complex21.subtract(complex47);
        boolean boolean51 = complex21.isNaN();
        org.apache.commons.math3.complex.Complex complex53 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double54 = complex53.getImaginary();
        org.apache.commons.math3.complex.Complex complex55 = complex53.negate();
        org.apache.commons.math3.complex.Complex complex57 = complex55.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex58 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex59 = complex55.subtract(complex58);
        org.apache.commons.math3.complex.Complex complex60 = complex55.cosh();
        org.apache.commons.math3.complex.Complex complex61 = complex21.divide(complex60);
        boolean boolean62 = complex61.isNaN();
        double double63 = complex61.getImaginary();
        org.apache.commons.math3.complex.Complex complex65 = complex61.add((-2.0158089984440206E-8d));
        org.apache.commons.math3.complex.Complex complex67 = complex65.divide(Double.NaN);
        org.apache.commons.math3.complex.Complex complex68 = complex10.divide(complex65);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex67 and complex1.", complex67.equals(complex1) == complex1.equals(complex67));
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test367");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) (-1.0f), (double) 100.0f);
        org.apache.commons.math3.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math3.complex.Complex complex4 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex5 = complex4.cosh();
        org.apache.commons.math3.complex.Complex complex6 = complex4.conjugate();
        org.apache.commons.math3.complex.Complex complex9 = new org.apache.commons.math3.complex.Complex((double) (short) -1, (double) '4');
        org.apache.commons.math3.complex.Complex complex10 = complex9.cos();
        org.apache.commons.math3.complex.Complex complex11 = complex4.subtract(complex9);
        org.apache.commons.math3.complex.Complex complex12 = complex3.multiply(complex9);
        org.apache.commons.math3.complex.Complex complex13 = complex12.atan();
        org.apache.commons.math3.complex.Complex complex15 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex16 = complex15.sqrt();
        org.apache.commons.math3.complex.Complex complex17 = complex15.sqrt();
        double double18 = complex15.getReal();
        org.apache.commons.math3.complex.Complex complex20 = complex15.add((-0.0d));
        org.apache.commons.math3.complex.Complex complex23 = new org.apache.commons.math3.complex.Complex((double) (byte) 100, 0.0d);
        org.apache.commons.math3.complex.Complex complex24 = complex23.sqrt();
        org.apache.commons.math3.complex.Complex complex25 = complex23.log();
        org.apache.commons.math3.complex.Complex complex27 = complex25.multiply((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex28 = complex25.tan();
        double double29 = complex28.getImaginary();
        org.apache.commons.math3.complex.Complex complex30 = complex28.sqrt();
        org.apache.commons.math3.complex.Complex complex31 = complex15.multiply(complex30);
        boolean boolean32 = complex13.equals((java.lang.Object) complex15);
        org.apache.commons.math3.complex.Complex complex33 = complex15.acos();
        org.apache.commons.math3.complex.Complex complex35 = complex15.subtract((-1.0038848218538872d));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex27 and complex33", complex27.equals(complex33) ? complex27.hashCode() == complex33.hashCode() : true);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test368");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex7 = complex3.subtract(complex6);
        org.apache.commons.math3.complex.Complex complex8 = complex6.cos();
        org.apache.commons.math3.complex.ComplexField complexField9 = complex8.getField();
        double double10 = complex8.getImaginary();
        org.apache.commons.math3.complex.Complex complex11 = complex8.cosh();
        org.apache.commons.math3.complex.Complex complex13 = complex8.pow((double) (short) 1);
        org.apache.commons.math3.complex.Complex complex14 = complex13.tan();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex8", complex1.equals(complex8) ? complex1.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test369");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math3.complex.Complex complex8 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex9 = complex8.exp();
        double double10 = complex8.getArgument();
        org.apache.commons.math3.complex.Complex complex12 = complex8.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex13 = complex8.sin();
        org.apache.commons.math3.complex.Complex complex14 = complex8.cosh();
        org.apache.commons.math3.complex.Complex complex16 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double17 = complex16.getImaginary();
        boolean boolean18 = complex14.equals((java.lang.Object) double17);
        org.apache.commons.math3.complex.Complex complex19 = complex14.tanh();
        org.apache.commons.math3.complex.Complex complex20 = complex5.subtract(complex19);
        org.apache.commons.math3.complex.Complex complex21 = complex19.cosh();
        org.apache.commons.math3.complex.Complex complex22 = complex19.cos();
        org.apache.commons.math3.complex.Complex complex23 = complex19.sqrt1z();
        org.apache.commons.math3.complex.Complex complex24 = complex19.conjugate();
        org.apache.commons.math3.complex.Complex complex25 = complex19.sqrt();
        double double26 = complex25.abs();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex19 and complex24", complex19.equals(complex24) ? complex19.hashCode() == complex24.hashCode() : true);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test370");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex((double) 0.0f);
        boolean boolean2 = complex1.isInfinite();
        org.apache.commons.math3.complex.Complex complex4 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double5 = complex4.getImaginary();
        org.apache.commons.math3.complex.Complex complex6 = complex4.negate();
        org.apache.commons.math3.complex.Complex complex8 = complex6.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex9 = complex6.tanh();
        org.apache.commons.math3.complex.Complex complex10 = complex9.conjugate();
        org.apache.commons.math3.complex.Complex complex11 = complex1.divide(complex9);
        org.apache.commons.math3.complex.Complex complex12 = complex11.sqrt1z();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex9 and complex10", complex9.equals(complex10) ? complex9.hashCode() == complex10.hashCode() : true);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test371");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex5.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex10 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex11 = complex10.exp();
        org.apache.commons.math3.complex.Complex complex12 = complex10.tanh();
        org.apache.commons.math3.complex.Complex complex13 = complex5.subtract(complex10);
        org.apache.commons.math3.complex.Complex complex14 = complex5.asin();
        java.lang.String str15 = complex14.toString();
        org.apache.commons.math3.complex.Complex complex17 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex18 = complex17.exp();
        double double19 = complex17.getArgument();
        org.apache.commons.math3.complex.Complex complex21 = complex17.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex22 = complex17.sin();
        org.apache.commons.math3.complex.Complex complex23 = complex17.cosh();
        org.apache.commons.math3.complex.Complex complex24 = complex17.tan();
        org.apache.commons.math3.complex.Complex complex25 = complex17.tan();
        org.apache.commons.math3.complex.Complex complex27 = complex17.subtract((double) (short) -1);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList29 = complex17.nthRoot(100);
        org.apache.commons.math3.complex.Complex complex30 = complex17.sinh();
        org.apache.commons.math3.complex.Complex complex31 = complex14.divide(complex17);
        org.apache.commons.math3.complex.Complex complex32 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex33 = complex32.sqrt1z();
        org.apache.commons.math3.complex.Complex complex34 = complex32.sqrt();
        org.apache.commons.math3.complex.Complex complex35 = complex31.pow(complex32);
        org.apache.commons.math3.complex.Complex complex36 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex37 = complex36.sqrt1z();
        org.apache.commons.math3.complex.Complex complex39 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double40 = complex39.getImaginary();
        org.apache.commons.math3.complex.Complex complex41 = complex39.negate();
        org.apache.commons.math3.complex.Complex complex42 = complex41.sinh();
        org.apache.commons.math3.complex.Complex complex43 = complex42.acos();
        org.apache.commons.math3.complex.Complex complex44 = complex37.divide(complex42);
        org.apache.commons.math3.complex.Complex complex45 = complex44.tan();
        org.apache.commons.math3.complex.Complex complex46 = complex45.tan();
        org.apache.commons.math3.complex.Complex complex47 = complex32.multiply(complex45);
        org.apache.commons.math3.complex.Complex complex48 = complex32.atan();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex13 and complex47", complex13.equals(complex47) ? complex13.hashCode() == complex47.hashCode() : true);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test372");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex1 = complex0.sqrt1z();
        org.apache.commons.math3.complex.Complex complex3 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double4 = complex3.getImaginary();
        org.apache.commons.math3.complex.Complex complex5 = complex3.negate();
        org.apache.commons.math3.complex.Complex complex6 = complex5.sinh();
        org.apache.commons.math3.complex.Complex complex7 = complex6.acos();
        org.apache.commons.math3.complex.Complex complex8 = complex1.divide(complex6);
        org.apache.commons.math3.complex.Complex complex9 = complex8.tan();
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double12 = complex11.getImaginary();
        org.apache.commons.math3.complex.Complex complex13 = complex11.negate();
        org.apache.commons.math3.complex.Complex complex15 = complex13.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex16 = complex13.tanh();
        org.apache.commons.math3.complex.Complex complex17 = complex16.conjugate();
        org.apache.commons.math3.complex.Complex complex18 = complex9.divide(complex16);
        boolean boolean19 = complex16.isNaN();
        org.apache.commons.math3.complex.Complex complex20 = complex16.cos();
        boolean boolean21 = complex16.isNaN();
        org.apache.commons.math3.complex.Complex complex23 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex24 = complex23.exp();
        double double25 = complex23.getArgument();
        org.apache.commons.math3.complex.Complex complex27 = complex23.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex28 = complex23.sin();
        org.apache.commons.math3.complex.Complex complex29 = complex23.cosh();
        org.apache.commons.math3.complex.Complex complex30 = complex23.tan();
        org.apache.commons.math3.complex.Complex complex31 = complex23.tan();
        org.apache.commons.math3.complex.Complex complex33 = complex23.subtract((double) (short) -1);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList35 = complex23.nthRoot(100);
        org.apache.commons.math3.complex.Complex complex36 = complex23.sinh();
        org.apache.commons.math3.complex.Complex complex38 = complex36.multiply((int) (short) 100);
        double double39 = complex38.getArgument();
        org.apache.commons.math3.complex.Complex complex40 = complex16.add(complex38);
        org.apache.commons.math3.complex.Complex complex41 = complex40.exp();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex16 and complex17", complex16.equals(complex17) ? complex16.hashCode() == complex17.hashCode() : true);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test373");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex1 = complex0.acos();
        org.apache.commons.math3.complex.Complex complex2 = complex0.conjugate();
        org.apache.commons.math3.complex.Complex complex3 = complex0.sqrt1z();
        org.apache.commons.math3.complex.ComplexField complexField4 = complex0.getField();
        org.apache.commons.math3.complex.Complex complex5 = complex0.log();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList7 = complex5.nthRoot((int) ' ');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex2", complex0.equals(complex2) ? complex0.hashCode() == complex2.hashCode() : true);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test374");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex7 = complex3.subtract(complex6);
        org.apache.commons.math3.complex.Complex complex8 = complex3.cosh();
        double double9 = complex3.getImaginary();
        org.apache.commons.math3.complex.Complex complex11 = complex3.pow(0.0d);
        org.apache.commons.math3.complex.Complex complex13 = complex11.pow(0.0d);
        org.apache.commons.math3.complex.Complex complex16 = new org.apache.commons.math3.complex.Complex(11013.232874703393d, 2.0d);
        org.apache.commons.math3.complex.Complex complex18 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex19 = complex18.exp();
        double double20 = complex18.getArgument();
        org.apache.commons.math3.complex.Complex complex22 = complex18.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex23 = complex18.sin();
        org.apache.commons.math3.complex.Complex complex24 = complex16.divide(complex23);
        org.apache.commons.math3.complex.Complex complex27 = org.apache.commons.math3.complex.Complex.valueOf((double) (byte) 1, (double) (-1L));
        org.apache.commons.math3.complex.Complex complex29 = complex27.add(0.9630272572571656d);
        org.apache.commons.math3.complex.Complex complex30 = complex24.subtract(complex27);
        org.apache.commons.math3.complex.Complex complex31 = complex30.reciprocal();
        org.apache.commons.math3.complex.Complex complex32 = complex13.add(complex31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex11", complex1.equals(complex11) ? complex1.hashCode() == complex11.hashCode() : true);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test375");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex(10.0d, (double) 100L);
        org.apache.commons.math3.complex.Complex complex4 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex5 = complex4.sqrt();
        org.apache.commons.math3.complex.Complex complex6 = complex2.multiply(complex5);
        org.apache.commons.math3.complex.Complex complex8 = complex5.pow((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex10 = complex8.add((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex12 = complex8.pow(2.718281828459045d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex10", complex4.equals(complex10) ? complex4.hashCode() == complex10.hashCode() : true);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test376");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex6 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex7 = complex1.conjugate();
        double double8 = complex1.abs();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex5 and complex7", complex5.equals(complex7) ? complex5.hashCode() == complex7.hashCode() : true);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test377");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex6 = complex1.sqrt1z();
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex8 = complex6.add(complex7);
        org.apache.commons.math3.complex.Complex complex10 = complex8.subtract((double) ' ');
        org.apache.commons.math3.complex.Complex complex12 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex13 = complex12.exp();
        double double14 = complex12.getArgument();
        org.apache.commons.math3.complex.Complex complex16 = complex12.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex17 = complex12.sin();
        org.apache.commons.math3.complex.Complex complex18 = complex12.cosh();
        org.apache.commons.math3.complex.Complex complex19 = complex12.tan();
        org.apache.commons.math3.complex.Complex complex20 = complex12.tan();
        org.apache.commons.math3.complex.Complex complex22 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex23 = complex22.exp();
        double double24 = complex22.getArgument();
        org.apache.commons.math3.complex.Complex complex26 = complex22.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex27 = complex22.sin();
        org.apache.commons.math3.complex.Complex complex28 = complex22.cosh();
        org.apache.commons.math3.complex.Complex complex29 = complex22.tan();
        org.apache.commons.math3.complex.Complex complex30 = complex22.tan();
        org.apache.commons.math3.complex.Complex complex32 = complex22.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex33 = complex20.subtract(complex22);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList35 = complex33.nthRoot((int) '4');
        org.apache.commons.math3.complex.Complex complex36 = complex33.cos();
        org.apache.commons.math3.complex.Complex complex37 = complex33.sin();
        org.apache.commons.math3.complex.Complex complex38 = complex37.cosh();
        org.apache.commons.math3.complex.Complex complex39 = complex38.reciprocal();
        org.apache.commons.math3.complex.Complex complex40 = complex38.cosh();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList42 = complex38.nthRoot((int) (short) 100);
        boolean boolean43 = complex8.equals((java.lang.Object) complex38);
        org.apache.commons.math3.complex.Complex complex44 = complex38.atan();
        org.apache.commons.math3.complex.Complex complex46 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double47 = complex46.getImaginary();
        org.apache.commons.math3.complex.Complex complex48 = complex46.negate();
        org.apache.commons.math3.complex.Complex complex50 = complex48.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex51 = complex50.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList53 = complex50.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex55 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex56 = complex55.exp();
        org.apache.commons.math3.complex.Complex complex57 = complex55.tanh();
        org.apache.commons.math3.complex.Complex complex58 = complex50.subtract(complex55);
        org.apache.commons.math3.complex.Complex complex59 = complex50.asin();
        java.lang.String str60 = complex59.toString();
        org.apache.commons.math3.complex.Complex complex61 = complex59.tanh();
        org.apache.commons.math3.complex.Complex complex63 = complex59.multiply((double) (short) 10);
        org.apache.commons.math3.complex.Complex complex65 = complex59.pow((double) (-1));
        org.apache.commons.math3.complex.Complex complex66 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex67 = complex66.negate();
        org.apache.commons.math3.complex.Complex complex68 = complex59.divide(complex67);
        org.apache.commons.math3.complex.Complex complex70 = complex67.divide((double) (short) 10);
        org.apache.commons.math3.complex.Complex complex71 = complex67.sqrt();
        org.apache.commons.math3.complex.Complex complex72 = complex44.add(complex67);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex71 and complex1.", complex71.equals(complex1) == complex1.equals(complex71));
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test378");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex3 = complex2.exp();
        org.apache.commons.math3.complex.Complex complex4 = complex1.pow(complex2);
        boolean boolean5 = complex1.isInfinite();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex3 and complex2.", complex3.equals(complex2) == complex2.equals(complex3));
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test379");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex7 = complex3.pow((double) 100L);
        org.apache.commons.math3.complex.Complex complex8 = complex3.reciprocal();
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.valueOf((double) 'a', (-35.0d));
        org.apache.commons.math3.complex.Complex complex12 = complex3.add(complex11);
        org.apache.commons.math3.complex.Complex complex15 = new org.apache.commons.math3.complex.Complex((double) 10, (double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex17 = complex15.add((double) (byte) 10);
        org.apache.commons.math3.complex.Complex complex19 = complex15.multiply(1);
        org.apache.commons.math3.complex.Complex complex21 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex22 = complex21.exp();
        double double23 = complex21.getArgument();
        org.apache.commons.math3.complex.Complex complex24 = complex21.log();
        org.apache.commons.math3.complex.Complex complex25 = complex21.log();
        org.apache.commons.math3.complex.Complex complex26 = complex21.sqrt1z();
        org.apache.commons.math3.complex.Complex complex27 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex28 = complex26.add(complex27);
        org.apache.commons.math3.complex.Complex complex30 = complex28.subtract((double) ' ');
        org.apache.commons.math3.complex.Complex complex31 = complex30.negate();
        org.apache.commons.math3.complex.Complex complex33 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double34 = complex33.getImaginary();
        org.apache.commons.math3.complex.Complex complex35 = complex33.negate();
        org.apache.commons.math3.complex.Complex complex37 = complex35.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex38 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex39 = complex35.subtract(complex38);
        org.apache.commons.math3.complex.Complex complex40 = complex35.acos();
        double double41 = complex40.getImaginary();
        org.apache.commons.math3.complex.Complex complex43 = complex40.multiply((int) (short) -1);
        org.apache.commons.math3.complex.Complex complex44 = complex30.multiply(complex40);
        org.apache.commons.math3.complex.Complex complex45 = complex15.divide(complex30);
        boolean boolean46 = complex45.isInfinite();
        org.apache.commons.math3.complex.Complex complex48 = complex45.pow((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex49 = complex12.subtract(complex48);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex8", complex3.equals(complex8) ? complex3.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test380");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex6 = complex5.exp();
        double double7 = complex5.getArgument();
        org.apache.commons.math3.complex.Complex complex8 = complex5.log();
        org.apache.commons.math3.complex.Complex complex9 = complex5.log();
        org.apache.commons.math3.complex.Complex complex11 = complex9.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex12 = complex3.subtract(complex11);
        org.apache.commons.math3.complex.Complex complex14 = complex12.divide((double) 10);
        org.apache.commons.math3.complex.Complex complex16 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex17 = complex16.exp();
        double double18 = complex16.getArgument();
        org.apache.commons.math3.complex.Complex complex19 = complex16.log();
        org.apache.commons.math3.complex.Complex complex20 = complex16.log();
        org.apache.commons.math3.complex.Complex complex22 = complex20.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex23 = complex20.tan();
        org.apache.commons.math3.complex.Complex complex24 = complex20.asin();
        org.apache.commons.math3.complex.Complex complex25 = complex14.divide(complex24);
        double double26 = complex14.getReal();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex8 and complex24", complex8.equals(complex24) ? complex8.hashCode() == complex24.hashCode() : true);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test381");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.acos();
        org.apache.commons.math3.complex.Complex complex5 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex6 = complex5.sqrt();
        org.apache.commons.math3.complex.Complex complex7 = complex5.sqrt();
        org.apache.commons.math3.complex.Complex complex8 = complex5.sinh();
        org.apache.commons.math3.complex.Complex complex9 = complex8.exp();
        org.apache.commons.math3.complex.Complex complex10 = complex8.acos();
        org.apache.commons.math3.complex.Complex complex11 = complex3.pow(complex10);
        org.apache.commons.math3.complex.Complex complex13 = complex3.pow(0.8414709848078965d);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex11 and complex1.", complex11.equals(complex1) == complex1.equals(complex11));
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test382");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex6 = complex1.acos();
        org.apache.commons.math3.complex.Complex complex8 = complex6.subtract((double) '#');
        java.lang.String str9 = complex6.toString();
        double double10 = complex6.getImaginary();
        org.apache.commons.math3.complex.Complex complex11 = complex6.reciprocal();
        org.apache.commons.math3.complex.Complex complex13 = complex11.multiply(0.8509181282393216d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex6", complex4.equals(complex6) ? complex4.hashCode() == complex6.hashCode() : true);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test383");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math3.complex.Complex complex8 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double9 = complex8.getImaginary();
        org.apache.commons.math3.complex.Complex complex10 = complex8.negate();
        org.apache.commons.math3.complex.Complex complex12 = complex10.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex13 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex14 = complex10.subtract(complex13);
        org.apache.commons.math3.complex.Complex complex15 = complex5.divide(complex14);
        org.apache.commons.math3.complex.Complex complex17 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex18 = complex17.exp();
        double double19 = complex17.getArgument();
        org.apache.commons.math3.complex.Complex complex21 = complex17.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex22 = complex17.sin();
        org.apache.commons.math3.complex.Complex complex23 = complex17.cosh();
        org.apache.commons.math3.complex.Complex complex24 = complex17.tan();
        org.apache.commons.math3.complex.Complex complex25 = complex17.tan();
        org.apache.commons.math3.complex.Complex complex27 = complex17.subtract((double) (short) -1);
        boolean boolean28 = complex15.equals((java.lang.Object) (short) -1);
        org.apache.commons.math3.complex.Complex complex30 = complex15.multiply((double) 1.0f);
        org.apache.commons.math3.complex.Complex complex31 = complex30.tanh();
        org.apache.commons.math3.complex.Complex complex33 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex34 = complex33.exp();
        double double35 = complex33.getArgument();
        org.apache.commons.math3.complex.Complex complex37 = complex33.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex38 = complex33.sin();
        org.apache.commons.math3.complex.Complex complex39 = complex33.cosh();
        org.apache.commons.math3.complex.Complex complex40 = complex33.tan();
        org.apache.commons.math3.complex.Complex complex41 = complex33.tan();
        org.apache.commons.math3.complex.Complex complex43 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex44 = complex43.exp();
        double double45 = complex43.getArgument();
        org.apache.commons.math3.complex.Complex complex47 = complex43.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex48 = complex43.sin();
        org.apache.commons.math3.complex.Complex complex49 = complex43.cosh();
        org.apache.commons.math3.complex.Complex complex50 = complex43.tan();
        org.apache.commons.math3.complex.Complex complex51 = complex43.tan();
        org.apache.commons.math3.complex.Complex complex53 = complex43.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex54 = complex41.subtract(complex43);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList56 = complex54.nthRoot((int) '4');
        org.apache.commons.math3.complex.Complex complex58 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double59 = complex58.getImaginary();
        org.apache.commons.math3.complex.Complex complex60 = complex54.divide(complex58);
        org.apache.commons.math3.complex.Complex complex61 = complex58.negate();
        org.apache.commons.math3.complex.Complex complex62 = complex31.add(complex58);
        org.apache.commons.math3.complex.Complex complex63 = complex58.conjugate();
        org.apache.commons.math3.complex.Complex complex64 = complex58.sin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex63", complex1.equals(complex63) ? complex1.hashCode() == complex63.hashCode() : true);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test384");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math3.complex.Complex complex8 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex9 = complex8.exp();
        double double10 = complex8.getArgument();
        org.apache.commons.math3.complex.Complex complex12 = complex8.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex13 = complex8.sin();
        org.apache.commons.math3.complex.Complex complex14 = complex8.cosh();
        org.apache.commons.math3.complex.Complex complex16 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double17 = complex16.getImaginary();
        boolean boolean18 = complex14.equals((java.lang.Object) double17);
        org.apache.commons.math3.complex.Complex complex19 = complex14.tanh();
        org.apache.commons.math3.complex.Complex complex20 = complex5.subtract(complex19);
        org.apache.commons.math3.complex.Complex complex22 = complex20.add((double) 'a');
        org.apache.commons.math3.complex.Complex complex24 = org.apache.commons.math3.complex.Complex.valueOf((double) 0L);
        org.apache.commons.math3.complex.Complex complex25 = complex24.asin();
        org.apache.commons.math3.complex.Complex complex26 = complex20.pow(complex24);
        double double27 = complex26.getReal();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex24 and complex25", complex24.equals(complex25) ? complex24.hashCode() == complex25.hashCode() : true);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test385");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.sin();
        org.apache.commons.math3.complex.Complex complex7 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex8 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex9 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex12 = complex11.exp();
        double double13 = complex11.getArgument();
        org.apache.commons.math3.complex.Complex complex15 = complex11.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex16 = complex11.sin();
        org.apache.commons.math3.complex.Complex complex17 = complex11.cosh();
        org.apache.commons.math3.complex.Complex complex18 = complex11.tan();
        org.apache.commons.math3.complex.Complex complex19 = complex11.tan();
        org.apache.commons.math3.complex.Complex complex21 = complex11.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex22 = complex9.subtract(complex11);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList24 = complex22.nthRoot((int) '4');
        org.apache.commons.math3.complex.Complex complex25 = complex22.cos();
        org.apache.commons.math3.complex.Complex complex26 = complex22.sin();
        org.apache.commons.math3.complex.Complex complex27 = complex26.cosh();
        org.apache.commons.math3.complex.Complex complex28 = complex27.reciprocal();
        org.apache.commons.math3.complex.Complex complex30 = complex28.multiply(0.0d);
        org.apache.commons.math3.complex.Complex complex31 = complex28.tanh();
        org.apache.commons.math3.complex.Complex complex33 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex34 = complex33.exp();
        double double35 = complex33.getArgument();
        org.apache.commons.math3.complex.Complex complex36 = complex33.log();
        org.apache.commons.math3.complex.Complex complex37 = complex33.log();
        org.apache.commons.math3.complex.Complex complex39 = complex37.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex40 = complex37.tan();
        org.apache.commons.math3.complex.Complex complex41 = complex37.asin();
        org.apache.commons.math3.complex.Complex complex42 = complex31.subtract(complex41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex30 and complex36", complex30.equals(complex36) ? complex30.hashCode() == complex36.hashCode() : true);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test386");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex7 = complex3.pow((double) 100L);
        org.apache.commons.math3.complex.Complex complex8 = complex3.acos();
        org.apache.commons.math3.complex.Complex complex10 = complex8.pow((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex12 = complex10.pow(0.0d);
        double double13 = complex10.getArgument();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex12", complex1.equals(complex12) ? complex1.hashCode() == complex12.hashCode() : true);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test387");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex6 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex8 = complex6.pow((-0.0d));
        org.apache.commons.math3.complex.Complex complex9 = complex8.negate();
        org.apache.commons.math3.complex.Complex complex10 = complex9.sqrt();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex8", complex1.equals(complex8) ? complex1.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test388");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math3.complex.Complex complex4 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double5 = complex4.getImaginary();
        org.apache.commons.math3.complex.Complex complex7 = complex4.pow((double) 100L);
        org.apache.commons.math3.complex.Complex complex8 = complex2.pow(complex7);
        double double9 = complex7.abs();
        org.apache.commons.math3.complex.Complex complex10 = complex7.acos();
        org.apache.commons.math3.complex.Complex complex12 = complex7.divide(Double.NEGATIVE_INFINITY);
        org.apache.commons.math3.complex.ComplexField complexField13 = complex12.getField();
        org.apache.commons.math3.complex.Complex complex16 = org.apache.commons.math3.complex.Complex.valueOf(0.0d, (double) (byte) -1);
        org.apache.commons.math3.complex.Complex complex17 = complex16.sinh();
        boolean boolean18 = complex17.isInfinite();
        org.apache.commons.math3.complex.Complex complex20 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex21 = complex20.exp();
        double double22 = complex20.getArgument();
        org.apache.commons.math3.complex.Complex complex24 = complex20.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex25 = complex20.sin();
        org.apache.commons.math3.complex.Complex complex26 = complex20.cosh();
        org.apache.commons.math3.complex.Complex complex27 = complex17.divide(complex20);
        boolean boolean28 = complex27.isInfinite();
        org.apache.commons.math3.complex.Complex complex31 = new org.apache.commons.math3.complex.Complex((double) 10, (double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex33 = complex31.add((double) (byte) 10);
        double double34 = complex33.getImaginary();
        org.apache.commons.math3.complex.Complex complex35 = complex33.tan();
        org.apache.commons.math3.complex.Complex complex36 = complex33.sqrt();
        org.apache.commons.math3.complex.Complex complex37 = complex27.pow(complex33);
        org.apache.commons.math3.complex.Complex complex38 = complex12.multiply(complex37);
        org.apache.commons.math3.complex.Complex complex39 = complex37.tanh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex10 and complex12", complex10.equals(complex12) ? complex10.hashCode() == complex12.hashCode() : true);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test389");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex((double) 0.0f);
        boolean boolean2 = complex1.isInfinite();
        org.apache.commons.math3.complex.Complex complex4 = complex1.pow((double) 0L);
        org.apache.commons.math3.complex.Complex complex6 = complex4.pow((double) (-1));
        org.apache.commons.math3.complex.ComplexField complexField7 = complex4.getField();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex6 and complex1.", complex6.equals(complex1) == complex1.equals(complex6));
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test390");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double8 = complex7.getImaginary();
        org.apache.commons.math3.complex.Complex complex9 = complex7.negate();
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex12 = complex11.exp();
        double double13 = complex11.getArgument();
        org.apache.commons.math3.complex.Complex complex14 = complex11.log();
        org.apache.commons.math3.complex.Complex complex15 = complex11.log();
        org.apache.commons.math3.complex.Complex complex17 = complex15.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex18 = complex9.subtract(complex17);
        org.apache.commons.math3.complex.Complex complex19 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex20 = complex19.sqrt1z();
        boolean boolean21 = complex18.equals((java.lang.Object) complex20);
        org.apache.commons.math3.complex.ComplexField complexField22 = complex20.getField();
        org.apache.commons.math3.complex.Complex complex23 = complex1.divide(complex20);
        org.apache.commons.math3.complex.Complex complex25 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double26 = complex25.getImaginary();
        org.apache.commons.math3.complex.Complex complex27 = complex25.negate();
        org.apache.commons.math3.complex.Complex complex29 = complex27.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex30 = complex29.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList32 = complex29.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex33 = complex29.negate();
        org.apache.commons.math3.complex.Complex complex34 = complex29.acos();
        org.apache.commons.math3.complex.Complex complex35 = complex20.pow(complex34);
        org.apache.commons.math3.complex.Complex complex36 = complex20.sqrt();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex34", complex4.equals(complex34) ? complex4.hashCode() == complex34.hashCode() : true);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test391");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.acos();
        org.apache.commons.math3.complex.Complex complex5 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex6 = complex5.exp();
        boolean boolean7 = complex6.isNaN();
        org.apache.commons.math3.complex.Complex complex9 = complex6.pow((double) 0L);
        org.apache.commons.math3.complex.Complex complex12 = new org.apache.commons.math3.complex.Complex((double) (-1.0f), (double) 100.0f);
        org.apache.commons.math3.complex.Complex complex13 = complex9.pow(complex12);
        org.apache.commons.math3.complex.Complex complex14 = complex12.log();
        org.apache.commons.math3.complex.Complex complex15 = complex3.subtract(complex14);
        org.apache.commons.math3.complex.Complex complex18 = new org.apache.commons.math3.complex.Complex((double) (-1.0f), (double) 100.0f);
        org.apache.commons.math3.complex.Complex complex19 = complex18.sin();
        org.apache.commons.math3.complex.Complex complex20 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex21 = complex20.cosh();
        org.apache.commons.math3.complex.Complex complex22 = complex20.conjugate();
        org.apache.commons.math3.complex.Complex complex25 = new org.apache.commons.math3.complex.Complex((double) (short) -1, (double) '4');
        org.apache.commons.math3.complex.Complex complex26 = complex25.cos();
        org.apache.commons.math3.complex.Complex complex27 = complex20.subtract(complex25);
        org.apache.commons.math3.complex.Complex complex28 = complex19.multiply(complex25);
        org.apache.commons.math3.complex.Complex complex29 = complex14.multiply(complex25);
        org.apache.commons.math3.complex.Complex complex30 = complex29.acos();
        org.apache.commons.math3.complex.Complex complex31 = complex30.cosh();
        org.apache.commons.math3.complex.Complex complex33 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double34 = complex33.getImaginary();
        org.apache.commons.math3.complex.Complex complex35 = complex33.negate();
        org.apache.commons.math3.complex.Complex complex36 = complex35.reciprocal();
        org.apache.commons.math3.complex.Complex complex37 = complex30.pow(complex36);
        boolean boolean38 = complex30.isNaN();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex35 and complex36", complex35.equals(complex36) ? complex35.hashCode() == complex36.hashCode() : true);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test392");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex7 = complex5.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex8 = complex5.sqrt();
        org.apache.commons.math3.complex.Complex complex10 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double11 = complex10.getImaginary();
        org.apache.commons.math3.complex.Complex complex12 = complex10.negate();
        org.apache.commons.math3.complex.Complex complex13 = complex12.sinh();
        org.apache.commons.math3.complex.Complex complex14 = complex13.tanh();
        org.apache.commons.math3.complex.Complex complex16 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double17 = complex16.getImaginary();
        org.apache.commons.math3.complex.Complex complex18 = complex16.negate();
        org.apache.commons.math3.complex.Complex complex19 = complex18.sinh();
        org.apache.commons.math3.complex.Complex complex20 = complex19.acos();
        org.apache.commons.math3.complex.Complex complex22 = complex20.add(2.820679600601607E-23d);
        org.apache.commons.math3.complex.Complex complex23 = complex20.acos();
        org.apache.commons.math3.complex.Complex complex25 = complex23.add((double) 'a');
        org.apache.commons.math3.complex.Complex complex26 = complex23.tanh();
        org.apache.commons.math3.complex.Complex complex27 = complex13.subtract(complex23);
        org.apache.commons.math3.complex.Complex complex28 = complex8.pow(complex13);
        org.apache.commons.math3.complex.Complex complex30 = complex28.divide(2.97065629219474d);
        org.apache.commons.math3.complex.Complex complex32 = new org.apache.commons.math3.complex.Complex((double) 100L);
        org.apache.commons.math3.complex.Complex complex34 = complex32.divide((double) (-1));
        org.apache.commons.math3.complex.Complex complex36 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex37 = complex36.exp();
        double double38 = complex36.getArgument();
        org.apache.commons.math3.complex.Complex complex40 = complex36.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex41 = complex36.sin();
        org.apache.commons.math3.complex.Complex complex42 = complex36.cosh();
        org.apache.commons.math3.complex.Complex complex43 = complex36.tan();
        org.apache.commons.math3.complex.Complex complex44 = complex32.multiply(complex43);
        org.apache.commons.math3.complex.Complex complex45 = complex32.atan();
        org.apache.commons.math3.complex.Complex complex47 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double48 = complex47.getImaginary();
        org.apache.commons.math3.complex.Complex complex49 = complex47.negate();
        org.apache.commons.math3.complex.Complex complex51 = complex49.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex52 = complex51.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList54 = complex51.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex56 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex57 = complex56.exp();
        org.apache.commons.math3.complex.Complex complex58 = complex56.tanh();
        org.apache.commons.math3.complex.Complex complex59 = complex51.subtract(complex56);
        org.apache.commons.math3.complex.Complex complex61 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex62 = complex61.exp();
        double double63 = complex61.getArgument();
        org.apache.commons.math3.complex.Complex complex65 = complex61.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex66 = complex61.sin();
        org.apache.commons.math3.complex.Complex complex67 = complex61.cosh();
        org.apache.commons.math3.complex.Complex complex68 = complex61.tan();
        org.apache.commons.math3.complex.Complex complex69 = complex61.tan();
        org.apache.commons.math3.complex.Complex complex71 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex72 = complex71.exp();
        double double73 = complex71.getArgument();
        org.apache.commons.math3.complex.Complex complex75 = complex71.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex76 = complex71.sin();
        org.apache.commons.math3.complex.Complex complex77 = complex71.cosh();
        org.apache.commons.math3.complex.Complex complex78 = complex71.tan();
        org.apache.commons.math3.complex.Complex complex79 = complex71.tan();
        org.apache.commons.math3.complex.Complex complex81 = complex71.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex82 = complex69.subtract(complex71);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList84 = complex82.nthRoot((int) '4');
        org.apache.commons.math3.complex.Complex complex85 = complex56.subtract(complex82);
        org.apache.commons.math3.complex.Complex complex86 = complex82.negate();
        boolean boolean87 = complex32.equals((java.lang.Object) complex82);
        org.apache.commons.math3.complex.Complex complex88 = complex30.pow(complex82);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex28 and complex1.", complex28.equals(complex1) == complex1.equals(complex28));
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test393");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 10, (double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex4 = complex2.add((double) (byte) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex4.pow(1.0d);
        org.apache.commons.math3.complex.Complex complex7 = complex6.sin();
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex10 = complex9.exp();
        double double11 = complex9.getArgument();
        org.apache.commons.math3.complex.Complex complex12 = complex9.log();
        org.apache.commons.math3.complex.Complex complex13 = complex9.log();
        org.apache.commons.math3.complex.Complex complex15 = complex13.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex16 = complex6.multiply(complex13);
        org.apache.commons.math3.complex.Complex complex18 = complex13.divide(1.0349512282932293E22d);
        org.apache.commons.math3.complex.Complex complex19 = complex13.cosh();
        org.apache.commons.math3.complex.Complex complex22 = org.apache.commons.math3.complex.Complex.valueOf(0.0d, (double) (byte) -1);
        org.apache.commons.math3.complex.Complex complex23 = complex22.sinh();
        org.apache.commons.math3.complex.Complex complex24 = complex23.sinh();
        org.apache.commons.math3.complex.Complex complex25 = complex23.tanh();
        org.apache.commons.math3.complex.Complex complex26 = complex23.sinh();
        org.apache.commons.math3.complex.Complex complex27 = complex13.pow(complex26);
        org.apache.commons.math3.complex.Complex complex29 = complex27.divide((double) (-1.0f));
        java.util.List<org.apache.commons.math3.complex.Complex> complexList31 = complex27.nthRoot(100);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex29 and complex2.", complex29.equals(complex2) == complex2.equals(complex29));
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test394");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex3.reciprocal();
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex7 = complex6.exp();
        double double8 = complex6.getArgument();
        org.apache.commons.math3.complex.Complex complex10 = complex6.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex11 = complex6.sin();
        org.apache.commons.math3.complex.Complex complex12 = complex6.cosh();
        org.apache.commons.math3.complex.Complex complex13 = complex6.tan();
        org.apache.commons.math3.complex.Complex complex14 = complex6.tan();
        org.apache.commons.math3.complex.Complex complex15 = complex3.add(complex14);
        org.apache.commons.math3.complex.Complex complex17 = complex3.add((-1.0d));
        org.apache.commons.math3.complex.Complex complex19 = complex3.multiply((-0.8259324122591327d));
        org.apache.commons.math3.complex.Complex complex20 = complex19.conjugate();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex4", complex3.equals(complex4) ? complex3.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test395");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math3.complex.Complex complex8 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex9 = complex8.exp();
        double double10 = complex8.getArgument();
        org.apache.commons.math3.complex.Complex complex12 = complex8.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex13 = complex8.sin();
        org.apache.commons.math3.complex.Complex complex14 = complex8.cosh();
        org.apache.commons.math3.complex.Complex complex16 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double17 = complex16.getImaginary();
        boolean boolean18 = complex14.equals((java.lang.Object) double17);
        org.apache.commons.math3.complex.Complex complex19 = complex14.tanh();
        org.apache.commons.math3.complex.Complex complex20 = complex5.subtract(complex19);
        org.apache.commons.math3.complex.Complex complex22 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex23 = complex22.exp();
        double double24 = complex22.getArgument();
        org.apache.commons.math3.complex.Complex complex26 = complex22.pow((double) 10);
        double double27 = complex26.getReal();
        org.apache.commons.math3.complex.Complex complex28 = complex26.atan();
        double double29 = complex28.abs();
        org.apache.commons.math3.complex.Complex complex30 = complex20.subtract(complex28);
        org.apache.commons.math3.complex.Complex complex31 = complex28.sin();
        org.apache.commons.math3.complex.Complex complex32 = complex31.conjugate();
        org.apache.commons.math3.complex.Complex complex34 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double35 = complex34.getImaginary();
        org.apache.commons.math3.complex.Complex complex36 = complex34.negate();
        org.apache.commons.math3.complex.Complex complex38 = complex36.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex39 = complex38.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList41 = complex38.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex43 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex44 = complex43.exp();
        org.apache.commons.math3.complex.Complex complex45 = complex43.tanh();
        org.apache.commons.math3.complex.Complex complex46 = complex38.subtract(complex43);
        org.apache.commons.math3.complex.Complex complex47 = complex38.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList49 = complex38.nthRoot((int) (byte) 10);
        boolean boolean50 = complex38.isInfinite();
        org.apache.commons.math3.complex.Complex complex51 = complex32.pow(complex38);
        org.apache.commons.math3.complex.Complex complex52 = complex32.asin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex31 and complex51", complex31.equals(complex51) ? complex31.hashCode() == complex51.hashCode() : true);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test396");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math3.complex.Complex complex8 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex9 = complex8.exp();
        double double10 = complex8.getArgument();
        org.apache.commons.math3.complex.Complex complex12 = complex8.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex13 = complex8.sin();
        org.apache.commons.math3.complex.Complex complex14 = complex8.cosh();
        org.apache.commons.math3.complex.Complex complex16 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double17 = complex16.getImaginary();
        boolean boolean18 = complex14.equals((java.lang.Object) double17);
        org.apache.commons.math3.complex.Complex complex19 = complex14.tanh();
        org.apache.commons.math3.complex.Complex complex20 = complex5.subtract(complex19);
        org.apache.commons.math3.complex.Complex complex22 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex23 = complex22.exp();
        double double24 = complex22.getArgument();
        org.apache.commons.math3.complex.Complex complex26 = complex22.pow((double) 10);
        double double27 = complex26.getReal();
        org.apache.commons.math3.complex.Complex complex28 = complex26.atan();
        double double29 = complex28.abs();
        org.apache.commons.math3.complex.Complex complex30 = complex20.subtract(complex28);
        org.apache.commons.math3.complex.Complex complex31 = complex28.sin();
        org.apache.commons.math3.complex.Complex complex32 = complex31.conjugate();
        org.apache.commons.math3.complex.Complex complex34 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double35 = complex34.getImaginary();
        org.apache.commons.math3.complex.Complex complex36 = complex34.negate();
        org.apache.commons.math3.complex.Complex complex38 = complex36.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex39 = complex38.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList41 = complex38.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex43 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex44 = complex43.exp();
        org.apache.commons.math3.complex.Complex complex45 = complex43.tanh();
        org.apache.commons.math3.complex.Complex complex46 = complex38.subtract(complex43);
        org.apache.commons.math3.complex.Complex complex47 = complex38.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList49 = complex38.nthRoot((int) (byte) 10);
        boolean boolean50 = complex38.isInfinite();
        org.apache.commons.math3.complex.Complex complex51 = complex32.pow(complex38);
        org.apache.commons.math3.complex.Complex complex52 = complex51.tanh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex31 and complex32", complex31.equals(complex32) ? complex31.hashCode() == complex32.hashCode() : true);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test397");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex5.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex10 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex11 = complex10.exp();
        org.apache.commons.math3.complex.Complex complex12 = complex10.tanh();
        org.apache.commons.math3.complex.Complex complex13 = complex5.subtract(complex10);
        org.apache.commons.math3.complex.Complex complex14 = complex5.asin();
        java.lang.String str15 = complex14.toString();
        org.apache.commons.math3.complex.Complex complex17 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex18 = complex17.exp();
        double double19 = complex17.getArgument();
        org.apache.commons.math3.complex.Complex complex21 = complex17.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex22 = complex17.sin();
        org.apache.commons.math3.complex.Complex complex23 = complex17.cosh();
        org.apache.commons.math3.complex.Complex complex24 = complex17.tan();
        org.apache.commons.math3.complex.Complex complex25 = complex17.tan();
        org.apache.commons.math3.complex.Complex complex27 = complex17.subtract((double) (short) -1);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList29 = complex17.nthRoot(100);
        org.apache.commons.math3.complex.Complex complex30 = complex17.sinh();
        org.apache.commons.math3.complex.Complex complex31 = complex14.divide(complex17);
        org.apache.commons.math3.complex.Complex complex32 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex33 = complex32.sqrt1z();
        org.apache.commons.math3.complex.Complex complex34 = complex32.sqrt();
        org.apache.commons.math3.complex.Complex complex35 = complex31.pow(complex32);
        org.apache.commons.math3.complex.Complex complex37 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex38 = complex37.exp();
        double double39 = complex37.getArgument();
        org.apache.commons.math3.complex.Complex complex41 = complex37.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex42 = complex37.sin();
        org.apache.commons.math3.complex.Complex complex43 = complex37.cosh();
        org.apache.commons.math3.complex.Complex complex44 = complex37.tan();
        org.apache.commons.math3.complex.Complex complex45 = complex37.tan();
        org.apache.commons.math3.complex.Complex complex47 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex48 = complex47.exp();
        double double49 = complex47.getArgument();
        org.apache.commons.math3.complex.Complex complex51 = complex47.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex52 = complex47.sin();
        org.apache.commons.math3.complex.Complex complex53 = complex47.cosh();
        org.apache.commons.math3.complex.Complex complex54 = complex47.tan();
        org.apache.commons.math3.complex.Complex complex55 = complex47.tan();
        org.apache.commons.math3.complex.Complex complex57 = complex47.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex58 = complex45.subtract(complex47);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList60 = complex58.nthRoot((int) '4');
        org.apache.commons.math3.complex.Complex complex61 = complex58.cos();
        org.apache.commons.math3.complex.Complex complex62 = complex58.sin();
        org.apache.commons.math3.complex.Complex complex63 = complex58.atan();
        org.apache.commons.math3.complex.Complex complex64 = complex63.sin();
        org.apache.commons.math3.complex.Complex complex65 = complex31.subtract(complex64);
        org.apache.commons.math3.complex.Complex complex67 = complex64.subtract((-1.0d));
        org.apache.commons.math3.complex.Complex complex69 = complex64.multiply((double) 0);
        org.apache.commons.math3.complex.Complex complex71 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex72 = complex71.exp();
        double double73 = complex71.getArgument();
        org.apache.commons.math3.complex.Complex complex74 = complex71.log();
        org.apache.commons.math3.complex.Complex complex75 = complex71.log();
        org.apache.commons.math3.complex.Complex complex76 = complex71.sqrt1z();
        boolean boolean77 = complex71.isNaN();
        org.apache.commons.math3.complex.Complex complex78 = complex71.log();
        org.apache.commons.math3.complex.Complex complex79 = complex78.reciprocal();
        org.apache.commons.math3.complex.Complex complex80 = complex64.add(complex79);
        org.apache.commons.math3.complex.Complex complex81 = complex64.reciprocal();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex79 and complex1.", complex79.equals(complex1) == complex1.equals(complex79));
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test398");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.sin();
        org.apache.commons.math3.complex.Complex complex7 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex8 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex9 = complex8.conjugate();
        org.apache.commons.math3.complex.Complex complex10 = complex8.sqrt();
        org.apache.commons.math3.complex.Complex complex12 = new org.apache.commons.math3.complex.Complex((double) 0.0f);
        boolean boolean13 = complex12.isInfinite();
        org.apache.commons.math3.complex.Complex complex15 = complex12.pow((double) 0L);
        org.apache.commons.math3.complex.Complex complex17 = complex15.pow((double) (-1));
        org.apache.commons.math3.complex.Complex complex18 = complex10.pow(complex15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex8 and complex9", complex8.equals(complex9) ? complex8.hashCode() == complex9.hashCode() : true);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test399");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 10, (double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex4 = complex2.add((double) (byte) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex4.pow(1.0d);
        org.apache.commons.math3.complex.Complex complex7 = complex4.conjugate();
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.valueOf(20.0d);
        org.apache.commons.math3.complex.Complex complex10 = complex4.divide(complex9);
        org.apache.commons.math3.complex.Complex complex11 = complex9.log();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex7", complex4.equals(complex7) ? complex4.hashCode() == complex7.hashCode() : true);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test400");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((double) (short) 0, 1.0d);
        org.apache.commons.math3.complex.Complex complex4 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex5 = complex4.exp();
        org.apache.commons.math3.complex.Complex complex6 = complex4.tan();
        org.apache.commons.math3.complex.Complex complex8 = complex4.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex10 = new org.apache.commons.math3.complex.Complex((double) 100L);
        org.apache.commons.math3.complex.Complex complex12 = complex10.divide((double) (-1));
        org.apache.commons.math3.complex.Complex complex14 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex15 = complex14.exp();
        double double16 = complex14.getArgument();
        org.apache.commons.math3.complex.Complex complex18 = complex14.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex19 = complex14.sin();
        org.apache.commons.math3.complex.Complex complex20 = complex14.cosh();
        org.apache.commons.math3.complex.Complex complex21 = complex14.tan();
        org.apache.commons.math3.complex.Complex complex22 = complex10.multiply(complex21);
        org.apache.commons.math3.complex.Complex complex23 = complex8.divide(complex22);
        org.apache.commons.math3.complex.Complex complex24 = complex22.conjugate();
        org.apache.commons.math3.complex.Complex complex25 = complex2.subtract(complex22);
        org.apache.commons.math3.complex.Complex complex26 = complex2.sinh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex22 and complex24", complex22.equals(complex24) ? complex22.hashCode() == complex24.hashCode() : true);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test401");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex4.asin();
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex8 = complex7.exp();
        double double9 = complex7.getArgument();
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex12 = complex11.exp();
        double double13 = complex11.getArgument();
        org.apache.commons.math3.complex.Complex complex15 = complex11.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex16 = complex11.sin();
        org.apache.commons.math3.complex.Complex complex17 = complex11.cosh();
        org.apache.commons.math3.complex.Complex complex18 = complex11.tan();
        org.apache.commons.math3.complex.Complex complex20 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex21 = complex20.exp();
        double double22 = complex20.getArgument();
        org.apache.commons.math3.complex.Complex complex24 = complex20.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex25 = complex20.sin();
        org.apache.commons.math3.complex.Complex complex26 = complex20.cosh();
        org.apache.commons.math3.complex.Complex complex27 = complex20.tan();
        org.apache.commons.math3.complex.Complex complex28 = complex20.tan();
        org.apache.commons.math3.complex.Complex complex30 = complex20.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex31 = complex18.pow(complex30);
        org.apache.commons.math3.complex.Complex complex32 = complex7.subtract(complex30);
        org.apache.commons.math3.complex.Complex complex33 = complex4.pow(complex7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex32", complex3.equals(complex32) ? complex3.hashCode() == complex32.hashCode() : true);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test402");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex(10.0d);
        org.apache.commons.math3.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex3 = complex1.sinh();
        java.lang.String str4 = complex3.toString();
        org.apache.commons.math3.complex.Complex complex5 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex7 = complex5.divide((double) (short) 10);
        org.apache.commons.math3.complex.Complex complex9 = complex5.subtract((double) (short) 1);
        org.apache.commons.math3.complex.Complex complex10 = complex5.exp();
        org.apache.commons.math3.complex.Complex complex11 = complex3.add(complex5);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex10 and complex1.", complex10.equals(complex1) == complex1.equals(complex10));
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test403");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex5 = complex1.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex6 = complex5.log();
        org.apache.commons.math3.complex.Complex complex8 = complex5.subtract((double) 10L);
        boolean boolean9 = complex8.isInfinite();
        boolean boolean10 = complex8.isNaN();
        org.apache.commons.math3.complex.Complex complex11 = complex8.sqrt1z();
        org.apache.commons.math3.complex.Complex complex13 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double14 = complex13.getImaginary();
        org.apache.commons.math3.complex.Complex complex15 = complex13.negate();
        org.apache.commons.math3.complex.Complex complex16 = complex15.reciprocal();
        org.apache.commons.math3.complex.Complex complex18 = complex15.divide(100.0d);
        org.apache.commons.math3.complex.Complex complex19 = complex15.sqrt1z();
        org.apache.commons.math3.complex.Complex complex20 = complex8.multiply(complex15);
        org.apache.commons.math3.complex.Complex complex23 = org.apache.commons.math3.complex.Complex.valueOf((double) '#', 8.509181282393216d);
        org.apache.commons.math3.complex.Complex complex24 = complex23.sqrt1z();
        org.apache.commons.math3.complex.Complex complex25 = complex15.multiply(complex24);
        org.apache.commons.math3.complex.Complex complex27 = complex25.subtract((double) (byte) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex15 and complex16", complex15.equals(complex16) ? complex15.hashCode() == complex16.hashCode() : true);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test404");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) (-1.0f), (double) 100.0f);
        org.apache.commons.math3.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math3.complex.Complex complex4 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex5 = complex4.cosh();
        org.apache.commons.math3.complex.Complex complex6 = complex4.conjugate();
        org.apache.commons.math3.complex.Complex complex9 = new org.apache.commons.math3.complex.Complex((double) (short) -1, (double) '4');
        org.apache.commons.math3.complex.Complex complex10 = complex9.cos();
        org.apache.commons.math3.complex.Complex complex11 = complex4.subtract(complex9);
        org.apache.commons.math3.complex.Complex complex12 = complex3.multiply(complex9);
        org.apache.commons.math3.complex.Complex complex13 = complex12.atan();
        org.apache.commons.math3.complex.Complex complex15 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex16 = complex15.sqrt();
        org.apache.commons.math3.complex.Complex complex17 = complex15.sqrt();
        double double18 = complex15.getReal();
        org.apache.commons.math3.complex.Complex complex20 = complex15.add((-0.0d));
        org.apache.commons.math3.complex.Complex complex23 = new org.apache.commons.math3.complex.Complex((double) (byte) 100, 0.0d);
        org.apache.commons.math3.complex.Complex complex24 = complex23.sqrt();
        org.apache.commons.math3.complex.Complex complex25 = complex23.log();
        org.apache.commons.math3.complex.Complex complex27 = complex25.multiply((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex28 = complex25.tan();
        double double29 = complex28.getImaginary();
        org.apache.commons.math3.complex.Complex complex30 = complex28.sqrt();
        org.apache.commons.math3.complex.Complex complex31 = complex15.multiply(complex30);
        boolean boolean32 = complex13.equals((java.lang.Object) complex15);
        org.apache.commons.math3.complex.Complex complex33 = complex13.conjugate();
        org.apache.commons.math3.complex.Complex complex34 = complex13.atan();
        org.apache.commons.math3.complex.Complex complex35 = complex34.acos();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex13 and complex33", complex13.equals(complex33) ? complex13.hashCode() == complex33.hashCode() : true);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test405");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex4.log();
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex8 = complex7.exp();
        double double9 = complex7.getArgument();
        org.apache.commons.math3.complex.Complex complex11 = complex7.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex12 = complex5.pow(complex11);
        org.apache.commons.math3.complex.Complex complex13 = complex5.exp();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex12 and complex1.", complex12.equals(complex1) == complex1.equals(complex12));
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test406");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) (byte) 100, 0.0d);
        org.apache.commons.math3.complex.Complex complex3 = complex2.sqrt();
        java.lang.String str4 = complex3.toString();
        double double5 = complex3.getImaginary();
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex8 = complex7.exp();
        double double9 = complex7.getArgument();
        org.apache.commons.math3.complex.Complex complex10 = complex7.log();
        org.apache.commons.math3.complex.Complex complex11 = complex7.log();
        org.apache.commons.math3.complex.Complex complex13 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double14 = complex13.getImaginary();
        org.apache.commons.math3.complex.Complex complex15 = complex13.negate();
        org.apache.commons.math3.complex.Complex complex17 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex18 = complex17.exp();
        double double19 = complex17.getArgument();
        org.apache.commons.math3.complex.Complex complex20 = complex17.log();
        org.apache.commons.math3.complex.Complex complex21 = complex17.log();
        org.apache.commons.math3.complex.Complex complex23 = complex21.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex24 = complex15.subtract(complex23);
        org.apache.commons.math3.complex.Complex complex25 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex26 = complex25.sqrt1z();
        boolean boolean27 = complex24.equals((java.lang.Object) complex26);
        org.apache.commons.math3.complex.ComplexField complexField28 = complex26.getField();
        org.apache.commons.math3.complex.Complex complex29 = complex7.divide(complex26);
        org.apache.commons.math3.complex.Complex complex31 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double32 = complex31.getImaginary();
        org.apache.commons.math3.complex.Complex complex33 = complex31.negate();
        org.apache.commons.math3.complex.Complex complex35 = complex33.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex36 = complex35.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList38 = complex35.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex39 = complex35.negate();
        org.apache.commons.math3.complex.Complex complex40 = complex35.acos();
        org.apache.commons.math3.complex.Complex complex41 = complex26.pow(complex40);
        org.apache.commons.math3.complex.Complex complex42 = complex3.divide(complex26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex10 and complex40", complex10.equals(complex40) ? complex10.hashCode() == complex40.hashCode() : true);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test407");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 10, (double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex4 = complex2.add((double) (byte) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex2.multiply(1);
        org.apache.commons.math3.complex.Complex complex8 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex9 = complex8.exp();
        double double10 = complex8.getArgument();
        org.apache.commons.math3.complex.Complex complex11 = complex8.log();
        org.apache.commons.math3.complex.Complex complex12 = complex8.log();
        org.apache.commons.math3.complex.Complex complex13 = complex8.sqrt1z();
        org.apache.commons.math3.complex.Complex complex14 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex15 = complex13.add(complex14);
        org.apache.commons.math3.complex.Complex complex17 = complex15.subtract((double) ' ');
        org.apache.commons.math3.complex.Complex complex18 = complex17.negate();
        org.apache.commons.math3.complex.Complex complex20 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double21 = complex20.getImaginary();
        org.apache.commons.math3.complex.Complex complex22 = complex20.negate();
        org.apache.commons.math3.complex.Complex complex24 = complex22.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex25 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex26 = complex22.subtract(complex25);
        org.apache.commons.math3.complex.Complex complex27 = complex22.acos();
        double double28 = complex27.getImaginary();
        org.apache.commons.math3.complex.Complex complex30 = complex27.multiply((int) (short) -1);
        org.apache.commons.math3.complex.Complex complex31 = complex17.multiply(complex27);
        org.apache.commons.math3.complex.Complex complex32 = complex2.divide(complex17);
        boolean boolean33 = complex32.isInfinite();
        org.apache.commons.math3.complex.Complex complex35 = complex32.pow((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex37 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex38 = complex37.exp();
        double double39 = complex37.getArgument();
        org.apache.commons.math3.complex.Complex complex41 = complex37.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex42 = complex37.sin();
        org.apache.commons.math3.complex.Complex complex43 = complex37.cosh();
        org.apache.commons.math3.complex.Complex complex44 = complex37.tan();
        org.apache.commons.math3.complex.Complex complex45 = complex37.tan();
        org.apache.commons.math3.complex.Complex complex47 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex48 = complex47.exp();
        double double49 = complex47.getArgument();
        org.apache.commons.math3.complex.Complex complex51 = complex47.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex52 = complex47.sin();
        org.apache.commons.math3.complex.Complex complex53 = complex47.cosh();
        org.apache.commons.math3.complex.Complex complex54 = complex47.tan();
        org.apache.commons.math3.complex.Complex complex55 = complex47.tan();
        org.apache.commons.math3.complex.Complex complex57 = complex47.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex58 = complex45.subtract(complex47);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList60 = complex58.nthRoot((int) '4');
        org.apache.commons.math3.complex.Complex complex62 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double63 = complex62.getImaginary();
        org.apache.commons.math3.complex.Complex complex64 = complex58.divide(complex62);
        double double65 = complex58.getReal();
        org.apache.commons.math3.complex.Complex complex66 = complex32.pow(complex58);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex8 and complex35", complex8.equals(complex35) ? complex8.hashCode() == complex35.hashCode() : true);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test408");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math3.complex.Complex complex4 = complex2.add((double) (short) 1);
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.valueOf((-0.0d));
        org.apache.commons.math3.complex.Complex complex7 = complex4.divide(complex6);
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex10 = complex9.exp();
        org.apache.commons.math3.complex.Complex complex11 = complex9.tanh();
        org.apache.commons.math3.complex.Complex complex12 = complex11.log();
        org.apache.commons.math3.complex.Complex complex13 = complex6.divide(complex11);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex7 and complex1.", complex7.equals(complex1) == complex1.equals(complex7));
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test409");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.sin();
        org.apache.commons.math3.complex.Complex complex7 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex8 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex9 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex12 = complex11.exp();
        double double13 = complex11.getArgument();
        org.apache.commons.math3.complex.Complex complex15 = complex11.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex16 = complex11.sin();
        org.apache.commons.math3.complex.Complex complex17 = complex11.cosh();
        org.apache.commons.math3.complex.Complex complex18 = complex11.tan();
        org.apache.commons.math3.complex.Complex complex19 = complex11.tan();
        org.apache.commons.math3.complex.Complex complex21 = complex11.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex22 = complex9.subtract(complex11);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList24 = complex22.nthRoot((int) '4');
        org.apache.commons.math3.complex.Complex complex25 = complex22.cos();
        org.apache.commons.math3.complex.Complex complex26 = complex22.tanh();
        org.apache.commons.math3.complex.Complex complex27 = complex22.reciprocal();
        org.apache.commons.math3.complex.Complex complex29 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex30 = complex29.sqrt();
        org.apache.commons.math3.complex.Complex complex31 = complex29.sqrt();
        org.apache.commons.math3.complex.Complex complex32 = complex22.add(complex29);
        double double33 = complex29.abs();
        org.apache.commons.math3.complex.Complex complex34 = complex29.reciprocal();
        java.lang.String str35 = complex29.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex34", complex1.equals(complex34) ? complex1.hashCode() == complex34.hashCode() : true);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test410");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex1 = complex0.sqrt1z();
        org.apache.commons.math3.complex.Complex complex3 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double4 = complex3.getImaginary();
        org.apache.commons.math3.complex.Complex complex5 = complex3.negate();
        org.apache.commons.math3.complex.Complex complex6 = complex5.sinh();
        org.apache.commons.math3.complex.Complex complex7 = complex6.acos();
        org.apache.commons.math3.complex.Complex complex8 = complex1.divide(complex6);
        org.apache.commons.math3.complex.Complex complex9 = complex8.tan();
        org.apache.commons.math3.complex.Complex complex10 = complex8.tanh();
        org.apache.commons.math3.complex.Complex complex13 = new org.apache.commons.math3.complex.Complex((double) (short) -1, (double) '4');
        org.apache.commons.math3.complex.Complex complex14 = complex13.cos();
        double double15 = complex14.getImaginary();
        org.apache.commons.math3.complex.Complex complex16 = complex8.divide(complex14);
        org.apache.commons.math3.complex.Complex complex19 = new org.apache.commons.math3.complex.Complex(10.0d, (double) 100L);
        org.apache.commons.math3.complex.Complex complex21 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex22 = complex21.sqrt();
        org.apache.commons.math3.complex.Complex complex23 = complex19.multiply(complex22);
        org.apache.commons.math3.complex.Complex complex25 = complex22.pow((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex27 = complex25.add((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex28 = complex14.pow(complex25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex27", complex1.equals(complex27) ? complex1.hashCode() == complex27.hashCode() : true);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test411");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex5.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex10 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex11 = complex10.exp();
        org.apache.commons.math3.complex.Complex complex12 = complex10.tanh();
        org.apache.commons.math3.complex.Complex complex13 = complex5.subtract(complex10);
        org.apache.commons.math3.complex.Complex complex14 = complex5.tanh();
        org.apache.commons.math3.complex.Complex complex15 = complex5.acos();
        org.apache.commons.math3.complex.Complex complex16 = complex5.sqrt();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex13 and complex15", complex13.equals(complex15) ? complex13.hashCode() == complex15.hashCode() : true);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test412");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex1 = complex0.exp();
        boolean boolean2 = complex0.isInfinite();
        org.apache.commons.math3.complex.Complex complex3 = complex0.cos();
        org.apache.commons.math3.complex.Complex complex4 = complex3.tan();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex1 and complex0.", complex1.equals(complex0) == complex0.equals(complex1));
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test413");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math3.complex.Complex complex8 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double9 = complex8.getImaginary();
        org.apache.commons.math3.complex.Complex complex10 = complex8.negate();
        org.apache.commons.math3.complex.Complex complex12 = complex10.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex13 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex14 = complex10.subtract(complex13);
        org.apache.commons.math3.complex.Complex complex15 = complex5.divide(complex14);
        org.apache.commons.math3.complex.Complex complex17 = complex5.divide((double) ' ');
        double double18 = complex5.abs();
        org.apache.commons.math3.complex.Complex complex19 = complex5.negate();
        org.apache.commons.math3.complex.Complex complex20 = complex19.sqrt();
        org.apache.commons.math3.complex.Complex complex22 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex23 = complex22.exp();
        double double24 = complex22.getArgument();
        org.apache.commons.math3.complex.Complex complex26 = complex22.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex27 = complex22.sin();
        org.apache.commons.math3.complex.Complex complex28 = complex22.cosh();
        org.apache.commons.math3.complex.Complex complex29 = complex22.tan();
        org.apache.commons.math3.complex.Complex complex30 = complex22.tan();
        org.apache.commons.math3.complex.Complex complex32 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex33 = complex32.exp();
        double double34 = complex32.getArgument();
        org.apache.commons.math3.complex.Complex complex36 = complex32.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex37 = complex32.sin();
        org.apache.commons.math3.complex.Complex complex38 = complex32.cosh();
        org.apache.commons.math3.complex.Complex complex39 = complex32.tan();
        org.apache.commons.math3.complex.Complex complex40 = complex32.tan();
        org.apache.commons.math3.complex.Complex complex42 = complex32.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex43 = complex30.subtract(complex32);
        org.apache.commons.math3.complex.Complex complex46 = new org.apache.commons.math3.complex.Complex((double) 10, (double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex48 = complex46.add((double) (byte) 10);
        org.apache.commons.math3.complex.Complex complex50 = complex48.pow(1.0d);
        org.apache.commons.math3.complex.Complex complex51 = complex50.sin();
        org.apache.commons.math3.complex.Complex complex52 = complex30.multiply(complex51);
        org.apache.commons.math3.complex.Complex complex53 = complex19.divide(complex52);
        org.apache.commons.math3.complex.Complex complex55 = complex53.multiply(Double.NaN);
        org.apache.commons.math3.complex.Complex complex56 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex57 = complex56.sqrt1z();
        org.apache.commons.math3.complex.Complex complex59 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double60 = complex59.getImaginary();
        org.apache.commons.math3.complex.Complex complex61 = complex59.negate();
        org.apache.commons.math3.complex.Complex complex62 = complex61.sinh();
        org.apache.commons.math3.complex.Complex complex63 = complex62.acos();
        org.apache.commons.math3.complex.Complex complex64 = complex57.divide(complex62);
        org.apache.commons.math3.complex.Complex complex65 = complex64.tan();
        org.apache.commons.math3.complex.Complex complex66 = complex65.tan();
        org.apache.commons.math3.complex.Complex complex67 = complex66.acos();
        org.apache.commons.math3.complex.Complex complex68 = complex53.divide(complex66);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex55 and complex1.", complex55.equals(complex1) == complex1.equals(complex55));
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test414");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex5 = complex1.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex6 = complex5.log();
        org.apache.commons.math3.complex.Complex complex9 = new org.apache.commons.math3.complex.Complex((double) 10, (double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex11 = complex9.add((double) (byte) 10);
        org.apache.commons.math3.complex.Complex complex13 = complex11.pow(1.0d);
        org.apache.commons.math3.complex.Complex complex14 = complex13.conjugate();
        org.apache.commons.math3.complex.Complex complex15 = complex6.subtract(complex13);
        org.apache.commons.math3.complex.Complex complex16 = complex6.tanh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex13 and complex14", complex13.equals(complex14) ? complex13.hashCode() == complex14.hashCode() : true);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test415");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) (-1.0f), (double) 100.0f);
        org.apache.commons.math3.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math3.complex.Complex complex4 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex5 = complex4.cosh();
        org.apache.commons.math3.complex.Complex complex6 = complex4.conjugate();
        org.apache.commons.math3.complex.Complex complex9 = new org.apache.commons.math3.complex.Complex((double) (short) -1, (double) '4');
        org.apache.commons.math3.complex.Complex complex10 = complex9.cos();
        org.apache.commons.math3.complex.Complex complex11 = complex4.subtract(complex9);
        org.apache.commons.math3.complex.Complex complex12 = complex3.multiply(complex9);
        org.apache.commons.math3.complex.Complex complex14 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double15 = complex14.getImaginary();
        org.apache.commons.math3.complex.Complex complex16 = complex14.negate();
        org.apache.commons.math3.complex.Complex complex18 = complex16.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex19 = complex18.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList21 = complex18.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex23 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex24 = complex23.exp();
        org.apache.commons.math3.complex.Complex complex25 = complex23.tanh();
        org.apache.commons.math3.complex.Complex complex26 = complex18.subtract(complex23);
        org.apache.commons.math3.complex.Complex complex27 = complex18.asin();
        java.lang.String str28 = complex27.toString();
        org.apache.commons.math3.complex.Complex complex30 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex31 = complex30.exp();
        double double32 = complex30.getArgument();
        org.apache.commons.math3.complex.Complex complex34 = complex30.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex35 = complex30.sin();
        org.apache.commons.math3.complex.Complex complex36 = complex30.cosh();
        org.apache.commons.math3.complex.Complex complex37 = complex30.tan();
        org.apache.commons.math3.complex.Complex complex38 = complex30.tan();
        org.apache.commons.math3.complex.Complex complex40 = complex30.subtract((double) (short) -1);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList42 = complex30.nthRoot(100);
        org.apache.commons.math3.complex.Complex complex43 = complex30.sinh();
        org.apache.commons.math3.complex.Complex complex44 = complex27.divide(complex30);
        org.apache.commons.math3.complex.Complex complex45 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex46 = complex45.sqrt1z();
        org.apache.commons.math3.complex.Complex complex47 = complex45.sqrt();
        org.apache.commons.math3.complex.Complex complex48 = complex44.pow(complex45);
        org.apache.commons.math3.complex.Complex complex49 = complex3.multiply(complex45);
        org.apache.commons.math3.complex.Complex complex50 = complex49.reciprocal();
        org.apache.commons.math3.complex.Complex complex52 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double53 = complex52.getImaginary();
        org.apache.commons.math3.complex.Complex complex54 = complex52.negate();
        org.apache.commons.math3.complex.Complex complex56 = complex54.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex57 = complex56.atan();
        org.apache.commons.math3.complex.Complex complex59 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double60 = complex59.getImaginary();
        org.apache.commons.math3.complex.Complex complex61 = complex59.negate();
        org.apache.commons.math3.complex.Complex complex63 = complex61.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex64 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex65 = complex61.subtract(complex64);
        org.apache.commons.math3.complex.Complex complex66 = complex56.divide(complex65);
        org.apache.commons.math3.complex.Complex complex68 = complex56.divide((double) ' ');
        double double69 = complex56.abs();
        org.apache.commons.math3.complex.Complex complex70 = complex56.asin();
        org.apache.commons.math3.complex.Complex complex71 = complex50.subtract(complex56);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex26 and complex49", complex26.equals(complex49) ? complex26.hashCode() == complex49.hashCode() : true);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test416");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex6 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex8 = complex6.multiply((int) (short) 0);
        org.apache.commons.math3.complex.Complex complex9 = complex6.tan();
        double double10 = complex9.abs();
        org.apache.commons.math3.complex.Complex complex12 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double13 = complex12.getImaginary();
        org.apache.commons.math3.complex.Complex complex14 = complex12.negate();
        org.apache.commons.math3.complex.Complex complex15 = complex14.sinh();
        org.apache.commons.math3.complex.Complex complex16 = complex15.tanh();
        org.apache.commons.math3.complex.Complex complex17 = complex16.sqrt1z();
        org.apache.commons.math3.complex.Complex complex19 = complex16.multiply((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex21 = complex16.pow(1.6118410375849543E22d);
        org.apache.commons.math3.complex.Complex complex22 = complex16.sinh();
        org.apache.commons.math3.complex.Complex complex23 = complex9.divide(complex22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex8 and complex21", complex8.equals(complex21) ? complex8.hashCode() == complex21.hashCode() : true);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test417");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) '4', (double) (short) 100);
        org.apache.commons.math3.complex.Complex complex3 = complex2.acos();
        org.apache.commons.math3.complex.Complex complex5 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex6 = complex5.sqrt();
        org.apache.commons.math3.complex.Complex complex8 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double9 = complex8.getImaginary();
        org.apache.commons.math3.complex.Complex complex11 = complex8.pow((double) 100L);
        org.apache.commons.math3.complex.Complex complex12 = complex6.pow(complex11);
        double double13 = complex11.abs();
        org.apache.commons.math3.complex.Complex complex14 = complex11.acos();
        org.apache.commons.math3.complex.Complex complex16 = complex11.divide(Double.NEGATIVE_INFINITY);
        org.apache.commons.math3.complex.ComplexField complexField17 = complex16.getField();
        org.apache.commons.math3.complex.Complex complex20 = org.apache.commons.math3.complex.Complex.valueOf(0.0d, (double) (byte) -1);
        org.apache.commons.math3.complex.Complex complex21 = complex20.sinh();
        boolean boolean22 = complex21.isInfinite();
        org.apache.commons.math3.complex.Complex complex24 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex25 = complex24.exp();
        double double26 = complex24.getArgument();
        org.apache.commons.math3.complex.Complex complex28 = complex24.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex29 = complex24.sin();
        org.apache.commons.math3.complex.Complex complex30 = complex24.cosh();
        org.apache.commons.math3.complex.Complex complex31 = complex21.divide(complex24);
        boolean boolean32 = complex31.isInfinite();
        org.apache.commons.math3.complex.Complex complex35 = new org.apache.commons.math3.complex.Complex((double) 10, (double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex37 = complex35.add((double) (byte) 10);
        double double38 = complex37.getImaginary();
        org.apache.commons.math3.complex.Complex complex39 = complex37.tan();
        org.apache.commons.math3.complex.Complex complex40 = complex37.sqrt();
        org.apache.commons.math3.complex.Complex complex41 = complex31.pow(complex37);
        org.apache.commons.math3.complex.Complex complex42 = complex16.multiply(complex41);
        org.apache.commons.math3.complex.Complex complex43 = complex2.subtract(complex41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex14 and complex16", complex14.equals(complex16) ? complex14.hashCode() == complex16.hashCode() : true);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test418");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex7 = complex3.pow((double) 100L);
        org.apache.commons.math3.complex.Complex complex8 = complex7.sin();
        org.apache.commons.math3.complex.Complex complex10 = complex8.divide((double) ' ');
        org.apache.commons.math3.complex.Complex complex12 = complex10.multiply((int) (short) 0);
        org.apache.commons.math3.complex.Complex complex13 = complex12.cosh();
        org.apache.commons.math3.complex.Complex complex14 = complex12.sqrt1z();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex13", complex1.equals(complex13) ? complex1.hashCode() == complex13.hashCode() : true);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test419");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.sin();
        org.apache.commons.math3.complex.Complex complex7 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex8 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex9 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex12 = complex11.exp();
        double double13 = complex11.getArgument();
        org.apache.commons.math3.complex.Complex complex15 = complex11.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex16 = complex11.sin();
        org.apache.commons.math3.complex.Complex complex17 = complex11.cosh();
        org.apache.commons.math3.complex.Complex complex18 = complex11.tan();
        org.apache.commons.math3.complex.Complex complex19 = complex11.tan();
        org.apache.commons.math3.complex.Complex complex21 = complex11.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex22 = complex9.subtract(complex11);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList24 = complex22.nthRoot((int) '4');
        org.apache.commons.math3.complex.Complex complex25 = complex22.cos();
        org.apache.commons.math3.complex.Complex complex26 = complex22.sin();
        org.apache.commons.math3.complex.Complex complex27 = complex26.conjugate();
        org.apache.commons.math3.complex.Complex complex28 = complex27.log();
        org.apache.commons.math3.complex.Complex complex29 = complex28.cosh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex26 and complex27", complex26.equals(complex27) ? complex26.hashCode() == complex27.hashCode() : true);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test420");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 10, (double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex4 = complex2.add((double) (byte) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex4.pow(1.0d);
        org.apache.commons.math3.complex.Complex complex7 = complex6.sin();
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex10 = complex9.exp();
        double double11 = complex9.getArgument();
        org.apache.commons.math3.complex.Complex complex12 = complex9.log();
        org.apache.commons.math3.complex.Complex complex13 = complex9.log();
        org.apache.commons.math3.complex.Complex complex15 = complex13.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex16 = complex6.multiply(complex13);
        org.apache.commons.math3.complex.Complex complex18 = complex13.divide(1.0349512282932293E22d);
        org.apache.commons.math3.complex.Complex complex20 = complex13.multiply(0.0d);
        org.apache.commons.math3.complex.Complex complex22 = complex13.multiply((int) '#');
        org.apache.commons.math3.complex.Complex complex25 = org.apache.commons.math3.complex.Complex.valueOf(100.0d, (double) (short) 100);
        org.apache.commons.math3.complex.Complex complex27 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double28 = complex27.getImaginary();
        org.apache.commons.math3.complex.Complex complex29 = complex27.negate();
        org.apache.commons.math3.complex.Complex complex31 = complex29.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex32 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex33 = complex29.subtract(complex32);
        org.apache.commons.math3.complex.Complex complex34 = complex29.cosh();
        org.apache.commons.math3.complex.Complex complex35 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex36 = complex35.sqrt1z();
        org.apache.commons.math3.complex.Complex complex38 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double39 = complex38.getImaginary();
        org.apache.commons.math3.complex.Complex complex40 = complex38.negate();
        org.apache.commons.math3.complex.Complex complex41 = complex40.sinh();
        org.apache.commons.math3.complex.Complex complex42 = complex41.acos();
        org.apache.commons.math3.complex.Complex complex43 = complex36.divide(complex41);
        org.apache.commons.math3.complex.Complex complex44 = complex43.tan();
        org.apache.commons.math3.complex.Complex complex45 = complex34.subtract(complex43);
        org.apache.commons.math3.complex.Complex complex46 = complex43.sin();
        org.apache.commons.math3.complex.Complex complex47 = complex46.exp();
        org.apache.commons.math3.complex.Complex complex48 = complex46.negate();
        org.apache.commons.math3.complex.Complex complex49 = complex25.divide(complex46);
        org.apache.commons.math3.complex.Complex complex50 = complex13.multiply(complex46);
        org.apache.commons.math3.complex.Complex complex51 = complex13.tan();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex12 and complex50", complex12.equals(complex50) ? complex12.hashCode() == complex50.hashCode() : true);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test421");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((double) (byte) 10, 0.0d);
        org.apache.commons.math3.complex.Complex complex4 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex5 = complex4.exp();
        org.apache.commons.math3.complex.Complex complex6 = complex4.tan();
        org.apache.commons.math3.complex.Complex complex8 = complex4.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex10 = new org.apache.commons.math3.complex.Complex((double) 100L);
        org.apache.commons.math3.complex.Complex complex12 = complex10.divide((double) (-1));
        org.apache.commons.math3.complex.Complex complex14 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex15 = complex14.exp();
        double double16 = complex14.getArgument();
        org.apache.commons.math3.complex.Complex complex18 = complex14.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex19 = complex14.sin();
        org.apache.commons.math3.complex.Complex complex20 = complex14.cosh();
        org.apache.commons.math3.complex.Complex complex21 = complex14.tan();
        org.apache.commons.math3.complex.Complex complex22 = complex10.multiply(complex21);
        org.apache.commons.math3.complex.Complex complex23 = complex8.divide(complex22);
        org.apache.commons.math3.complex.Complex complex24 = complex22.conjugate();
        org.apache.commons.math3.complex.Complex complex25 = complex2.multiply(complex22);
        org.apache.commons.math3.complex.Complex complex26 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex27 = complex26.sqrt1z();
        org.apache.commons.math3.complex.Complex complex28 = complex27.asin();
        boolean boolean29 = complex27.isNaN();
        org.apache.commons.math3.complex.Complex complex30 = complex27.sinh();
        org.apache.commons.math3.complex.Complex complex31 = complex22.divide(complex30);
        org.apache.commons.math3.complex.Complex complex33 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double34 = complex33.getImaginary();
        org.apache.commons.math3.complex.Complex complex35 = complex33.negate();
        org.apache.commons.math3.complex.Complex complex36 = complex35.reciprocal();
        org.apache.commons.math3.complex.Complex complex38 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex39 = complex38.exp();
        double double40 = complex38.getArgument();
        org.apache.commons.math3.complex.Complex complex42 = complex38.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex43 = complex38.sin();
        org.apache.commons.math3.complex.Complex complex44 = complex38.cosh();
        org.apache.commons.math3.complex.Complex complex45 = complex38.tan();
        org.apache.commons.math3.complex.Complex complex46 = complex38.tan();
        org.apache.commons.math3.complex.Complex complex47 = complex35.add(complex46);
        org.apache.commons.math3.complex.Complex complex49 = complex35.multiply((int) '#');
        org.apache.commons.math3.complex.Complex complex50 = complex35.acos();
        org.apache.commons.math3.complex.Complex complex51 = complex31.divide(complex35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex22 and complex24", complex22.equals(complex24) ? complex22.hashCode() == complex24.hashCode() : true);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test422");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex6 = complex5.negate();
        org.apache.commons.math3.complex.Complex complex8 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex9 = complex8.exp();
        double double10 = complex8.getArgument();
        org.apache.commons.math3.complex.Complex complex11 = complex8.log();
        org.apache.commons.math3.complex.Complex complex12 = complex8.log();
        org.apache.commons.math3.complex.Complex complex14 = complex12.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex15 = complex12.sqrt();
        org.apache.commons.math3.complex.Complex complex16 = complex6.subtract(complex12);
        org.apache.commons.math3.complex.Complex complex17 = complex16.exp();
        org.apache.commons.math3.complex.Complex complex20 = new org.apache.commons.math3.complex.Complex((double) (short) -1, (double) '4');
        boolean boolean21 = complex20.isInfinite();
        org.apache.commons.math3.complex.Complex complex23 = complex20.multiply((-1.2613182101454838E-15d));
        org.apache.commons.math3.complex.Complex complex24 = complex16.multiply(complex20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex17", complex1.equals(complex17) ? complex1.hashCode() == complex17.hashCode() : true);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test423");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex5.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex10 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex11 = complex10.exp();
        org.apache.commons.math3.complex.Complex complex12 = complex10.tanh();
        org.apache.commons.math3.complex.Complex complex13 = complex5.subtract(complex10);
        org.apache.commons.math3.complex.Complex complex14 = complex5.asin();
        java.lang.String str15 = complex14.toString();
        org.apache.commons.math3.complex.Complex complex17 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex18 = complex17.exp();
        double double19 = complex17.getArgument();
        org.apache.commons.math3.complex.Complex complex21 = complex17.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex22 = complex17.sin();
        org.apache.commons.math3.complex.Complex complex23 = complex17.cosh();
        org.apache.commons.math3.complex.Complex complex24 = complex17.tan();
        org.apache.commons.math3.complex.Complex complex25 = complex17.tan();
        org.apache.commons.math3.complex.Complex complex27 = complex17.subtract((double) (short) -1);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList29 = complex17.nthRoot(100);
        org.apache.commons.math3.complex.Complex complex30 = complex17.sinh();
        org.apache.commons.math3.complex.Complex complex31 = complex14.divide(complex17);
        org.apache.commons.math3.complex.Complex complex32 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex33 = complex32.sqrt1z();
        org.apache.commons.math3.complex.Complex complex34 = complex32.sqrt();
        org.apache.commons.math3.complex.Complex complex35 = complex31.pow(complex32);
        org.apache.commons.math3.complex.Complex complex37 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex38 = complex37.exp();
        double double39 = complex37.getArgument();
        org.apache.commons.math3.complex.Complex complex41 = complex37.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex42 = complex37.sin();
        org.apache.commons.math3.complex.Complex complex43 = complex37.cosh();
        org.apache.commons.math3.complex.Complex complex44 = complex37.tan();
        org.apache.commons.math3.complex.Complex complex45 = complex37.tan();
        org.apache.commons.math3.complex.Complex complex47 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex48 = complex47.exp();
        double double49 = complex47.getArgument();
        org.apache.commons.math3.complex.Complex complex51 = complex47.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex52 = complex47.sin();
        org.apache.commons.math3.complex.Complex complex53 = complex47.cosh();
        org.apache.commons.math3.complex.Complex complex54 = complex47.tan();
        org.apache.commons.math3.complex.Complex complex55 = complex47.tan();
        org.apache.commons.math3.complex.Complex complex57 = complex47.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex58 = complex45.subtract(complex47);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList60 = complex58.nthRoot((int) '4');
        org.apache.commons.math3.complex.Complex complex61 = complex58.cos();
        org.apache.commons.math3.complex.Complex complex62 = complex58.sin();
        org.apache.commons.math3.complex.Complex complex63 = complex58.atan();
        org.apache.commons.math3.complex.Complex complex64 = complex63.sin();
        org.apache.commons.math3.complex.Complex complex65 = complex31.subtract(complex64);
        org.apache.commons.math3.complex.Complex complex67 = complex64.subtract((-1.0d));
        org.apache.commons.math3.complex.Complex complex69 = complex64.multiply((double) 0);
        org.apache.commons.math3.complex.Complex complex71 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex72 = complex71.exp();
        double double73 = complex71.getArgument();
        org.apache.commons.math3.complex.Complex complex74 = complex71.log();
        org.apache.commons.math3.complex.Complex complex75 = complex71.log();
        org.apache.commons.math3.complex.Complex complex76 = complex71.sqrt1z();
        boolean boolean77 = complex71.isNaN();
        org.apache.commons.math3.complex.Complex complex78 = complex71.log();
        org.apache.commons.math3.complex.Complex complex79 = complex78.reciprocal();
        org.apache.commons.math3.complex.Complex complex80 = complex64.add(complex79);
        org.apache.commons.math3.complex.Complex complex83 = org.apache.commons.math3.complex.Complex.valueOf(100.0d, (double) (short) 100);
        org.apache.commons.math3.complex.Complex complex86 = new org.apache.commons.math3.complex.Complex((double) 10, (double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex88 = complex86.add((double) (byte) 10);
        double double89 = complex88.getImaginary();
        org.apache.commons.math3.complex.Complex complex90 = complex88.tan();
        double double91 = complex88.getReal();
        org.apache.commons.math3.complex.Complex complex92 = complex88.cos();
        org.apache.commons.math3.complex.Complex complex93 = complex83.subtract(complex92);
        org.apache.commons.math3.complex.Complex complex95 = complex83.add(1.0d);
        org.apache.commons.math3.complex.Complex complex96 = complex83.sin();
        org.apache.commons.math3.complex.Complex complex97 = complex79.add(complex96);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex97 and complex1.", complex97.equals(complex1) == complex1.equals(complex97));
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test424");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 10, (double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex4 = complex2.add((double) (byte) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex4.pow(1.0d);
        org.apache.commons.math3.complex.Complex complex7 = complex4.conjugate();
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.valueOf(20.0d);
        org.apache.commons.math3.complex.Complex complex10 = complex4.divide(complex9);
        org.apache.commons.math3.complex.Complex complex11 = complex9.cos();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex7", complex4.equals(complex7) ? complex4.hashCode() == complex7.hashCode() : true);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test425");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.sin();
        org.apache.commons.math3.complex.Complex complex7 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex8 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex9 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex12 = complex11.exp();
        double double13 = complex11.getArgument();
        org.apache.commons.math3.complex.Complex complex15 = complex11.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex16 = complex11.sin();
        org.apache.commons.math3.complex.Complex complex17 = complex11.cosh();
        org.apache.commons.math3.complex.Complex complex18 = complex11.tan();
        org.apache.commons.math3.complex.Complex complex19 = complex11.tan();
        org.apache.commons.math3.complex.Complex complex21 = complex11.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex22 = complex9.subtract(complex11);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList24 = complex22.nthRoot((int) '4');
        org.apache.commons.math3.complex.Complex complex26 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex27 = complex26.exp();
        double double28 = complex26.getArgument();
        org.apache.commons.math3.complex.Complex complex30 = complex26.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex31 = complex26.sin();
        org.apache.commons.math3.complex.Complex complex32 = complex26.cosh();
        org.apache.commons.math3.complex.Complex complex33 = complex26.tan();
        org.apache.commons.math3.complex.Complex complex34 = complex26.tan();
        org.apache.commons.math3.complex.Complex complex35 = complex22.pow(complex34);
        org.apache.commons.math3.complex.Complex complex38 = new org.apache.commons.math3.complex.Complex((double) 10, (double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex40 = complex38.add((double) (byte) 10);
        org.apache.commons.math3.complex.Complex complex42 = complex40.pow(1.0d);
        org.apache.commons.math3.complex.Complex complex43 = complex42.sin();
        org.apache.commons.math3.complex.Complex complex44 = complex35.multiply(complex42);
        org.apache.commons.math3.complex.Complex complex47 = new org.apache.commons.math3.complex.Complex(0.8414709848078965d, (double) 0);
        org.apache.commons.math3.complex.Complex complex48 = complex42.pow(complex47);
        org.apache.commons.math3.complex.Complex complex50 = complex48.add(Double.NaN);
        org.apache.commons.math3.complex.Complex complex51 = complex48.negate();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex50 and complex1.", complex50.equals(complex1) == complex1.equals(complex50));
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test426");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.sin();
        org.apache.commons.math3.complex.Complex complex7 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex8 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex9 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex12 = complex11.exp();
        double double13 = complex11.getArgument();
        org.apache.commons.math3.complex.Complex complex15 = complex11.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex16 = complex11.sin();
        org.apache.commons.math3.complex.Complex complex17 = complex11.cosh();
        org.apache.commons.math3.complex.Complex complex18 = complex11.tan();
        org.apache.commons.math3.complex.Complex complex19 = complex11.tan();
        org.apache.commons.math3.complex.Complex complex21 = complex11.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex22 = complex9.subtract(complex11);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList24 = complex22.nthRoot((int) '4');
        org.apache.commons.math3.complex.Complex complex25 = complex22.cos();
        org.apache.commons.math3.complex.Complex complex26 = complex22.sin();
        org.apache.commons.math3.complex.Complex complex27 = complex26.cosh();
        org.apache.commons.math3.complex.Complex complex28 = complex27.reciprocal();
        org.apache.commons.math3.complex.Complex complex30 = complex28.multiply(0.0d);
        org.apache.commons.math3.complex.Complex complex32 = complex28.pow(0.8414709848078965d);
        org.apache.commons.math3.complex.Complex complex34 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex35 = complex34.exp();
        double double36 = complex34.getArgument();
        org.apache.commons.math3.complex.Complex complex38 = complex34.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex39 = complex34.sin();
        org.apache.commons.math3.complex.Complex complex40 = complex34.cosh();
        org.apache.commons.math3.complex.Complex complex41 = complex34.tan();
        org.apache.commons.math3.complex.Complex complex42 = complex34.tan();
        org.apache.commons.math3.complex.Complex complex44 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex45 = complex44.exp();
        double double46 = complex44.getArgument();
        org.apache.commons.math3.complex.Complex complex48 = complex44.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex49 = complex44.sin();
        org.apache.commons.math3.complex.Complex complex50 = complex44.cosh();
        org.apache.commons.math3.complex.Complex complex51 = complex44.tan();
        org.apache.commons.math3.complex.Complex complex52 = complex44.tan();
        org.apache.commons.math3.complex.Complex complex54 = complex44.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex55 = complex42.subtract(complex44);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList57 = complex55.nthRoot((int) '4');
        org.apache.commons.math3.complex.Complex complex58 = complex55.cos();
        org.apache.commons.math3.complex.Complex complex59 = complex55.sin();
        org.apache.commons.math3.complex.Complex complex60 = complex59.cosh();
        org.apache.commons.math3.complex.Complex complex61 = complex60.acos();
        org.apache.commons.math3.complex.ComplexField complexField62 = complex60.getField();
        org.apache.commons.math3.complex.Complex complex64 = complex60.multiply((double) '#');
        org.apache.commons.math3.complex.Complex complex65 = complex32.subtract(complex64);
        org.apache.commons.math3.complex.Complex complex67 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex68 = complex67.exp();
        double double69 = complex67.getArgument();
        org.apache.commons.math3.complex.Complex complex70 = complex67.log();
        org.apache.commons.math3.complex.Complex complex71 = complex67.log();
        org.apache.commons.math3.complex.Complex complex72 = complex67.sqrt1z();
        org.apache.commons.math3.complex.Complex complex73 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex74 = complex72.add(complex73);
        org.apache.commons.math3.complex.Complex complex76 = complex74.subtract((double) ' ');
        org.apache.commons.math3.complex.Complex complex77 = complex76.negate();
        double double78 = complex76.getArgument();
        org.apache.commons.math3.complex.Complex complex80 = complex76.pow(0.0d);
        org.apache.commons.math3.complex.Complex complex83 = new org.apache.commons.math3.complex.Complex((double) 'a', 0.0d);
        org.apache.commons.math3.complex.Complex complex84 = complex83.negate();
        org.apache.commons.math3.complex.Complex complex85 = complex80.subtract(complex83);
        org.apache.commons.math3.complex.Complex complex86 = complex85.acos();
        org.apache.commons.math3.complex.Complex complex87 = complex86.cos();
        org.apache.commons.math3.complex.Complex complex88 = complex65.divide(complex87);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex30 and complex70", complex30.equals(complex70) ? complex30.hashCode() == complex70.hashCode() : true);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test427");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex7 = complex5.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex8 = complex5.sqrt();
        org.apache.commons.math3.complex.Complex complex10 = complex5.multiply((int) '#');
        org.apache.commons.math3.complex.Complex complex11 = complex10.reciprocal();
        java.lang.String str12 = complex11.toString();
        org.apache.commons.math3.complex.Complex complex13 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex14 = complex13.sqrt1z();
        org.apache.commons.math3.complex.Complex complex15 = complex13.sqrt();
        org.apache.commons.math3.complex.Complex complex16 = complex13.sqrt1z();
        org.apache.commons.math3.complex.Complex complex18 = complex16.pow(0.45054953406980763d);
        org.apache.commons.math3.complex.Complex complex19 = complex11.add(complex16);
        java.lang.String str20 = complex16.toString();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex11 and complex1.", complex11.equals(complex1) == complex1.equals(complex11));
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test428");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        double double6 = complex5.getArgument();
        org.apache.commons.math3.complex.Complex complex8 = complex5.subtract((double) 100.0f);
        org.apache.commons.math3.complex.Complex complex9 = complex5.cos();
        org.apache.commons.math3.complex.Complex complex10 = complex9.sqrt1z();
        org.apache.commons.math3.complex.Complex complex11 = complex10.cos();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex9", complex1.equals(complex9) ? complex1.hashCode() == complex9.hashCode() : true);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test429");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex6 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex8 = complex6.multiply((int) (short) 0);
        org.apache.commons.math3.complex.Complex complex9 = complex6.tan();
        org.apache.commons.math3.complex.Complex complex11 = complex6.subtract(Double.NEGATIVE_INFINITY);
        org.apache.commons.math3.complex.Complex complex12 = complex11.conjugate();
        org.apache.commons.math3.complex.Complex complex13 = complex11.negate();
        org.apache.commons.math3.complex.Complex complex14 = complex13.exp();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex11 and complex12", complex11.equals(complex12) ? complex11.hashCode() == complex12.hashCode() : true);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test430");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex5.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex10 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex11 = complex10.exp();
        org.apache.commons.math3.complex.Complex complex12 = complex10.tanh();
        org.apache.commons.math3.complex.Complex complex13 = complex5.subtract(complex10);
        org.apache.commons.math3.complex.Complex complex14 = complex5.asin();
        java.lang.String str15 = complex14.toString();
        org.apache.commons.math3.complex.Complex complex16 = complex14.tanh();
        org.apache.commons.math3.complex.Complex complex18 = complex14.multiply((double) (short) 10);
        org.apache.commons.math3.complex.Complex complex20 = complex14.pow((double) (-1));
        org.apache.commons.math3.complex.Complex complex21 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex22 = complex21.negate();
        org.apache.commons.math3.complex.Complex complex23 = complex14.divide(complex22);
        org.apache.commons.math3.complex.Complex complex25 = complex22.divide((double) (short) 10);
        org.apache.commons.math3.complex.Complex complex26 = complex22.sqrt();
        org.apache.commons.math3.complex.Complex complex28 = complex26.subtract((double) (-1.0f));
        org.apache.commons.math3.complex.Complex complex29 = complex28.atan();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex26 and complex1.", complex26.equals(complex1) == complex1.equals(complex26));
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test431");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex1 = complex0.sqrt1z();
        org.apache.commons.math3.complex.Complex complex3 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double4 = complex3.getImaginary();
        org.apache.commons.math3.complex.Complex complex5 = complex3.negate();
        org.apache.commons.math3.complex.Complex complex6 = complex5.sinh();
        org.apache.commons.math3.complex.Complex complex7 = complex6.acos();
        org.apache.commons.math3.complex.Complex complex8 = complex1.divide(complex6);
        org.apache.commons.math3.complex.Complex complex9 = complex8.tan();
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double12 = complex11.getImaginary();
        org.apache.commons.math3.complex.Complex complex13 = complex11.negate();
        org.apache.commons.math3.complex.Complex complex15 = complex13.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex16 = complex13.tanh();
        org.apache.commons.math3.complex.Complex complex17 = complex16.conjugate();
        org.apache.commons.math3.complex.Complex complex18 = complex9.divide(complex16);
        boolean boolean19 = complex16.isNaN();
        org.apache.commons.math3.complex.Complex complex21 = complex16.multiply(7.211769165453326d);
        org.apache.commons.math3.complex.Complex complex22 = complex21.acos();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex16 and complex17", complex16.equals(complex17) ? complex16.hashCode() == complex17.hashCode() : true);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test432");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math3.complex.Complex complex5 = complex2.pow((double) 0L);
        org.apache.commons.math3.complex.Complex complex8 = new org.apache.commons.math3.complex.Complex((double) (-1.0f), (double) 100.0f);
        org.apache.commons.math3.complex.Complex complex9 = complex5.pow(complex8);
        double double10 = complex5.getImaginary();
        org.apache.commons.math3.complex.Complex complex11 = complex5.exp();
        org.apache.commons.math3.complex.Complex complex12 = complex5.conjugate();
        org.apache.commons.math3.complex.Complex complex14 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex15 = complex14.exp();
        double double16 = complex14.getArgument();
        org.apache.commons.math3.complex.Complex complex17 = complex14.log();
        org.apache.commons.math3.complex.Complex complex18 = complex14.log();
        org.apache.commons.math3.complex.Complex complex20 = complex18.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex21 = complex18.sqrt();
        double double22 = complex18.getImaginary();
        org.apache.commons.math3.complex.Complex complex23 = complex18.exp();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList25 = complex18.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex26 = complex18.sqrt();
        org.apache.commons.math3.complex.Complex complex27 = complex5.subtract(complex18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex12", complex1.equals(complex12) ? complex1.hashCode() == complex12.hashCode() : true);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test433");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.sqrt1z();
        org.apache.commons.math3.complex.Complex complex9 = new org.apache.commons.math3.complex.Complex((double) (short) -1, (double) '4');
        org.apache.commons.math3.complex.Complex complex10 = complex9.atan();
        org.apache.commons.math3.complex.Complex complex11 = complex6.multiply(complex10);
        boolean boolean12 = complex10.isInfinite();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex6 and complex11", complex6.equals(complex11) ? complex6.hashCode() == complex11.hashCode() : true);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test434");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.sin();
        org.apache.commons.math3.complex.Complex complex7 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex8 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex9 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex12 = complex11.exp();
        double double13 = complex11.getArgument();
        org.apache.commons.math3.complex.Complex complex15 = complex11.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex16 = complex11.sin();
        org.apache.commons.math3.complex.Complex complex17 = complex11.cosh();
        org.apache.commons.math3.complex.Complex complex18 = complex11.tan();
        org.apache.commons.math3.complex.Complex complex19 = complex11.tan();
        org.apache.commons.math3.complex.Complex complex21 = complex11.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex22 = complex9.subtract(complex11);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList24 = complex22.nthRoot((int) '4');
        org.apache.commons.math3.complex.Complex complex25 = complex22.cos();
        org.apache.commons.math3.complex.Complex complex26 = complex22.sin();
        org.apache.commons.math3.complex.Complex complex27 = complex26.cosh();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList29 = complex27.nthRoot(1);
        org.apache.commons.math3.complex.Complex complex31 = complex27.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex32 = complex27.negate();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex31 and complex1.", complex31.equals(complex1) == complex1.equals(complex31));
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test435");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.sin();
        org.apache.commons.math3.complex.Complex complex7 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex8 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex9 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex12 = complex11.exp();
        double double13 = complex11.getArgument();
        org.apache.commons.math3.complex.Complex complex15 = complex11.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex16 = complex11.sin();
        org.apache.commons.math3.complex.Complex complex17 = complex11.cosh();
        org.apache.commons.math3.complex.Complex complex18 = complex11.tan();
        org.apache.commons.math3.complex.Complex complex19 = complex11.tan();
        org.apache.commons.math3.complex.Complex complex21 = complex11.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex22 = complex9.subtract(complex11);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList24 = complex22.nthRoot((int) '4');
        org.apache.commons.math3.complex.Complex complex25 = complex22.cos();
        org.apache.commons.math3.complex.Complex complex26 = complex22.tanh();
        org.apache.commons.math3.complex.Complex complex27 = complex22.reciprocal();
        org.apache.commons.math3.complex.Complex complex29 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex30 = complex29.sqrt();
        org.apache.commons.math3.complex.Complex complex31 = complex29.sqrt();
        org.apache.commons.math3.complex.Complex complex32 = complex22.add(complex29);
        double double33 = complex29.abs();
        org.apache.commons.math3.complex.Complex complex34 = complex29.reciprocal();
        org.apache.commons.math3.complex.Complex complex36 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double37 = complex36.getImaginary();
        org.apache.commons.math3.complex.Complex complex38 = complex36.negate();
        org.apache.commons.math3.complex.Complex complex40 = complex38.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex41 = complex40.atan();
        org.apache.commons.math3.complex.Complex complex43 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex44 = complex43.exp();
        double double45 = complex43.getArgument();
        org.apache.commons.math3.complex.Complex complex47 = complex43.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex48 = complex43.sin();
        org.apache.commons.math3.complex.Complex complex49 = complex43.cosh();
        org.apache.commons.math3.complex.Complex complex51 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double52 = complex51.getImaginary();
        boolean boolean53 = complex49.equals((java.lang.Object) double52);
        org.apache.commons.math3.complex.Complex complex54 = complex49.tanh();
        org.apache.commons.math3.complex.Complex complex55 = complex40.subtract(complex54);
        org.apache.commons.math3.complex.Complex complex57 = complex55.add((double) 'a');
        org.apache.commons.math3.complex.Complex complex59 = org.apache.commons.math3.complex.Complex.valueOf((double) 0L);
        org.apache.commons.math3.complex.Complex complex60 = complex59.asin();
        org.apache.commons.math3.complex.Complex complex61 = complex55.pow(complex59);
        boolean boolean62 = complex29.equals((java.lang.Object) complex55);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex34", complex1.equals(complex34) ? complex1.hashCode() == complex34.hashCode() : true);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test436");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex7 = complex5.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex8 = complex5.sqrt();
        org.apache.commons.math3.complex.Complex complex10 = complex5.multiply((int) '#');
        org.apache.commons.math3.complex.Complex complex11 = complex10.reciprocal();
        org.apache.commons.math3.complex.Complex complex13 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
        org.apache.commons.math3.complex.Complex complex15 = complex13.pow(0.0d);
        org.apache.commons.math3.complex.Complex complex16 = complex11.divide(complex13);
        org.apache.commons.math3.complex.Complex complex18 = complex11.pow(0.9997508731988978d);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex18 and complex1.", complex18.equals(complex1) == complex1.equals(complex18));
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test437");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex5 = complex1.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex6 = complex5.log();
        org.apache.commons.math3.complex.Complex complex8 = complex5.subtract((double) 10L);
        boolean boolean9 = complex8.isInfinite();
        boolean boolean10 = complex8.isNaN();
        org.apache.commons.math3.complex.Complex complex11 = complex8.sqrt1z();
        org.apache.commons.math3.complex.Complex complex13 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double14 = complex13.getImaginary();
        org.apache.commons.math3.complex.Complex complex15 = complex13.negate();
        org.apache.commons.math3.complex.Complex complex16 = complex15.reciprocal();
        org.apache.commons.math3.complex.Complex complex18 = complex15.divide(100.0d);
        org.apache.commons.math3.complex.Complex complex19 = complex15.sqrt1z();
        org.apache.commons.math3.complex.Complex complex20 = complex8.multiply(complex15);
        org.apache.commons.math3.complex.Complex complex21 = complex20.reciprocal();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex15 and complex16", complex15.equals(complex16) ? complex15.hashCode() == complex16.hashCode() : true);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test438");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.sin();
        org.apache.commons.math3.complex.Complex complex7 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex8 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex9 = complex8.conjugate();
        org.apache.commons.math3.complex.Complex complex10 = complex9.sqrt1z();
        org.apache.commons.math3.complex.Complex complex11 = complex9.conjugate();
        org.apache.commons.math3.complex.Complex complex13 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex14 = complex13.exp();
        double double15 = complex13.getArgument();
        org.apache.commons.math3.complex.Complex complex16 = complex13.log();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList18 = complex16.nthRoot((int) 'a');
        org.apache.commons.math3.complex.Complex complex20 = complex16.add((double) (-1.0f));
        boolean boolean21 = complex16.isNaN();
        org.apache.commons.math3.complex.Complex complex22 = complex9.add(complex16);
        org.apache.commons.math3.complex.Complex complex24 = complex9.multiply((int) '4');
        org.apache.commons.math3.complex.Complex complex27 = new org.apache.commons.math3.complex.Complex((double) 10, (double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex29 = complex27.add((double) (byte) 10);
        org.apache.commons.math3.complex.Complex complex31 = complex29.pow(1.0d);
        org.apache.commons.math3.complex.Complex complex32 = complex31.conjugate();
        org.apache.commons.math3.complex.Complex complex33 = complex32.exp();
        boolean boolean34 = complex24.equals((java.lang.Object) complex32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex8 and complex9", complex8.equals(complex9) ? complex8.hashCode() == complex9.hashCode() : true);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test439");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex3.reciprocal();
        org.apache.commons.math3.complex.Complex complex6 = complex3.divide(100.0d);
        org.apache.commons.math3.complex.Complex complex7 = complex3.sqrt1z();
        boolean boolean8 = complex7.isNaN();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex4", complex3.equals(complex4) ? complex3.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test440");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math3.complex.Complex complex4 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double5 = complex4.getImaginary();
        org.apache.commons.math3.complex.Complex complex7 = complex4.pow((double) 100L);
        org.apache.commons.math3.complex.Complex complex8 = complex2.pow(complex7);
        double double9 = complex7.abs();
        org.apache.commons.math3.complex.Complex complex10 = complex7.acos();
        org.apache.commons.math3.complex.Complex complex11 = complex7.sqrt1z();
        org.apache.commons.math3.complex.ComplexField complexField12 = complex7.getField();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex10 and complex11", complex10.equals(complex11) ? complex10.hashCode() == complex11.hashCode() : true);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test441");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.sin();
        org.apache.commons.math3.complex.Complex complex7 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex8 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex9 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex12 = complex11.exp();
        double double13 = complex11.getArgument();
        org.apache.commons.math3.complex.Complex complex15 = complex11.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex16 = complex11.sin();
        org.apache.commons.math3.complex.Complex complex17 = complex11.cosh();
        org.apache.commons.math3.complex.Complex complex18 = complex11.tan();
        org.apache.commons.math3.complex.Complex complex19 = complex11.tan();
        org.apache.commons.math3.complex.Complex complex21 = complex11.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex22 = complex9.subtract(complex11);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList24 = complex22.nthRoot((int) '4');
        org.apache.commons.math3.complex.Complex complex25 = complex22.cos();
        org.apache.commons.math3.complex.Complex complex26 = complex22.tanh();
        org.apache.commons.math3.complex.Complex complex27 = complex22.reciprocal();
        org.apache.commons.math3.complex.Complex complex29 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex30 = complex29.sqrt();
        org.apache.commons.math3.complex.Complex complex31 = complex29.sqrt();
        org.apache.commons.math3.complex.Complex complex32 = complex22.add(complex29);
        double double33 = complex29.abs();
        double double34 = complex29.getImaginary();
        org.apache.commons.math3.complex.Complex complex36 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex37 = complex36.exp();
        java.lang.String str38 = complex37.toString();
        org.apache.commons.math3.complex.Complex complex39 = complex37.sqrt1z();
        org.apache.commons.math3.complex.Complex complex40 = complex37.exp();
        org.apache.commons.math3.complex.Complex complex41 = complex29.divide(complex37);
        org.apache.commons.math3.complex.Complex complex43 = org.apache.commons.math3.complex.Complex.valueOf((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex45 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double46 = complex45.getImaginary();
        org.apache.commons.math3.complex.Complex complex47 = complex45.negate();
        org.apache.commons.math3.complex.Complex complex49 = complex47.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex50 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex51 = complex47.subtract(complex50);
        org.apache.commons.math3.complex.Complex complex52 = complex50.sqrt();
        boolean boolean53 = complex43.equals((java.lang.Object) complex50);
        org.apache.commons.math3.complex.Complex complex56 = new org.apache.commons.math3.complex.Complex((double) (byte) 100, 0.0d);
        org.apache.commons.math3.complex.Complex complex57 = complex56.sqrt();
        org.apache.commons.math3.complex.Complex complex58 = complex56.log();
        org.apache.commons.math3.complex.Complex complex60 = complex58.multiply((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex61 = complex58.sqrt1z();
        org.apache.commons.math3.complex.Complex complex62 = complex61.tan();
        double double63 = complex61.getArgument();
        double double64 = complex61.abs();
        org.apache.commons.math3.complex.Complex complex65 = complex43.pow(complex61);
        boolean boolean66 = complex37.equals((java.lang.Object) complex43);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex65 and complex1.", complex65.equals(complex1) == complex1.equals(complex65));
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test442");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math3.complex.Complex complex8 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double9 = complex8.getImaginary();
        org.apache.commons.math3.complex.Complex complex10 = complex8.negate();
        org.apache.commons.math3.complex.Complex complex12 = complex10.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex13 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex14 = complex10.subtract(complex13);
        org.apache.commons.math3.complex.Complex complex15 = complex5.divide(complex14);
        org.apache.commons.math3.complex.Complex complex16 = complex15.reciprocal();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList18 = complex15.nthRoot((int) (byte) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex16", complex3.equals(complex16) ? complex3.hashCode() == complex16.hashCode() : true);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test443");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math3.complex.Complex complex8 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex9 = complex8.exp();
        double double10 = complex8.getArgument();
        org.apache.commons.math3.complex.Complex complex12 = complex8.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex13 = complex8.sin();
        org.apache.commons.math3.complex.Complex complex14 = complex8.cosh();
        org.apache.commons.math3.complex.Complex complex16 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double17 = complex16.getImaginary();
        boolean boolean18 = complex14.equals((java.lang.Object) double17);
        org.apache.commons.math3.complex.Complex complex19 = complex14.tanh();
        org.apache.commons.math3.complex.Complex complex20 = complex5.subtract(complex19);
        org.apache.commons.math3.complex.Complex complex22 = complex20.add((double) 'a');
        org.apache.commons.math3.complex.Complex complex24 = org.apache.commons.math3.complex.Complex.valueOf((double) 0L);
        org.apache.commons.math3.complex.Complex complex25 = complex24.asin();
        org.apache.commons.math3.complex.Complex complex26 = complex20.pow(complex24);
        org.apache.commons.math3.complex.Complex complex27 = complex20.log();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex24 and complex25", complex24.equals(complex25) ? complex24.hashCode() == complex25.hashCode() : true);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test444");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math3.complex.Complex complex3 = complex2.cos();
        org.apache.commons.math3.complex.Complex complex4 = complex3.asin();
        org.apache.commons.math3.complex.Complex complex6 = complex4.multiply(4.605170185988092d);
        org.apache.commons.math3.complex.Complex complex9 = new org.apache.commons.math3.complex.Complex((double) (-1.0f), (double) 100.0f);
        org.apache.commons.math3.complex.Complex complex10 = complex9.sin();
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex12 = complex11.cosh();
        org.apache.commons.math3.complex.Complex complex13 = complex11.conjugate();
        org.apache.commons.math3.complex.Complex complex16 = new org.apache.commons.math3.complex.Complex((double) (short) -1, (double) '4');
        org.apache.commons.math3.complex.Complex complex17 = complex16.cos();
        org.apache.commons.math3.complex.Complex complex18 = complex11.subtract(complex16);
        org.apache.commons.math3.complex.Complex complex19 = complex10.multiply(complex16);
        org.apache.commons.math3.complex.Complex complex21 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double22 = complex21.getImaginary();
        org.apache.commons.math3.complex.Complex complex23 = complex21.negate();
        org.apache.commons.math3.complex.Complex complex25 = complex23.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex26 = complex25.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList28 = complex25.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex30 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex31 = complex30.exp();
        org.apache.commons.math3.complex.Complex complex32 = complex30.tanh();
        org.apache.commons.math3.complex.Complex complex33 = complex25.subtract(complex30);
        org.apache.commons.math3.complex.Complex complex34 = complex25.asin();
        java.lang.String str35 = complex34.toString();
        org.apache.commons.math3.complex.Complex complex37 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex38 = complex37.exp();
        double double39 = complex37.getArgument();
        org.apache.commons.math3.complex.Complex complex41 = complex37.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex42 = complex37.sin();
        org.apache.commons.math3.complex.Complex complex43 = complex37.cosh();
        org.apache.commons.math3.complex.Complex complex44 = complex37.tan();
        org.apache.commons.math3.complex.Complex complex45 = complex37.tan();
        org.apache.commons.math3.complex.Complex complex47 = complex37.subtract((double) (short) -1);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList49 = complex37.nthRoot(100);
        org.apache.commons.math3.complex.Complex complex50 = complex37.sinh();
        org.apache.commons.math3.complex.Complex complex51 = complex34.divide(complex37);
        org.apache.commons.math3.complex.Complex complex52 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex53 = complex52.sqrt1z();
        org.apache.commons.math3.complex.Complex complex54 = complex52.sqrt();
        org.apache.commons.math3.complex.Complex complex55 = complex51.pow(complex52);
        org.apache.commons.math3.complex.Complex complex56 = complex10.multiply(complex52);
        org.apache.commons.math3.complex.Complex complex57 = complex56.reciprocal();
        org.apache.commons.math3.complex.Complex complex58 = complex4.divide(complex57);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex12", complex3.equals(complex12) ? complex3.hashCode() == complex12.hashCode() : true);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test445");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex6 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex8 = complex6.pow((-0.0d));
        double double9 = complex8.getReal();
        org.apache.commons.math3.complex.Complex complex11 = complex8.add(0.7853981633974483d);
        org.apache.commons.math3.complex.Complex complex12 = complex11.log();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex8", complex1.equals(complex8) ? complex1.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test446");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.sin();
        org.apache.commons.math3.complex.Complex complex8 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex9 = complex8.exp();
        double double10 = complex8.getArgument();
        org.apache.commons.math3.complex.Complex complex11 = complex8.log();
        org.apache.commons.math3.complex.Complex complex12 = complex11.log();
        org.apache.commons.math3.complex.Complex complex13 = complex6.pow(complex12);
        boolean boolean14 = complex13.isInfinite();
        boolean boolean15 = complex13.isNaN();
        org.apache.commons.math3.complex.Complex complex16 = complex13.asin();
        org.apache.commons.math3.complex.Complex complex18 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex19 = complex18.exp();
        double double20 = complex18.getArgument();
        org.apache.commons.math3.complex.Complex complex22 = complex18.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex23 = complex18.sin();
        org.apache.commons.math3.complex.Complex complex24 = complex18.cosh();
        org.apache.commons.math3.complex.Complex complex25 = complex18.tan();
        org.apache.commons.math3.complex.Complex complex26 = complex18.tan();
        org.apache.commons.math3.complex.Complex complex28 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex29 = complex28.exp();
        double double30 = complex28.getArgument();
        org.apache.commons.math3.complex.Complex complex32 = complex28.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex33 = complex28.sin();
        org.apache.commons.math3.complex.Complex complex34 = complex28.cosh();
        org.apache.commons.math3.complex.Complex complex35 = complex28.tan();
        org.apache.commons.math3.complex.Complex complex36 = complex28.tan();
        org.apache.commons.math3.complex.Complex complex38 = complex28.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex39 = complex26.subtract(complex28);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList41 = complex39.nthRoot((int) '4');
        org.apache.commons.math3.complex.Complex complex42 = complex39.cos();
        org.apache.commons.math3.complex.Complex complex43 = complex39.sin();
        org.apache.commons.math3.complex.Complex complex44 = complex43.cosh();
        org.apache.commons.math3.complex.Complex complex45 = complex44.reciprocal();
        org.apache.commons.math3.complex.Complex complex47 = complex45.multiply(0.0d);
        org.apache.commons.math3.complex.Complex complex49 = complex45.pow(0.8414709848078965d);
        org.apache.commons.math3.complex.Complex complex51 = complex45.multiply((double) 10L);
        org.apache.commons.math3.complex.Complex complex52 = complex51.asin();
        org.apache.commons.math3.complex.Complex complex53 = complex16.pow(complex51);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex11 and complex47", complex11.equals(complex47) ? complex11.hashCode() == complex47.hashCode() : true);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test447");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex(1.6118410375849543E22d);
        org.apache.commons.math3.complex.Complex complex2 = complex1.sinh();
        org.apache.commons.math3.complex.Complex complex4 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex5 = complex4.exp();
        org.apache.commons.math3.complex.Complex complex6 = complex4.tanh();
        org.apache.commons.math3.complex.Complex complex7 = complex6.log();
        org.apache.commons.math3.complex.Complex complex8 = complex6.acos();
        org.apache.commons.math3.complex.Complex complex10 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double11 = complex10.getImaginary();
        org.apache.commons.math3.complex.Complex complex12 = complex10.negate();
        org.apache.commons.math3.complex.Complex complex13 = complex12.reciprocal();
        boolean boolean14 = complex13.isNaN();
        double double15 = complex13.getArgument();
        org.apache.commons.math3.complex.Complex complex16 = complex6.subtract(complex13);
        org.apache.commons.math3.complex.Complex complex17 = complex1.pow(complex16);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex2 and complex4.", complex2.equals(complex4) == complex4.equals(complex2));
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test448");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.sin();
        org.apache.commons.math3.complex.Complex complex7 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex8 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex9 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex12 = complex11.exp();
        double double13 = complex11.getArgument();
        org.apache.commons.math3.complex.Complex complex15 = complex11.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex16 = complex11.sin();
        org.apache.commons.math3.complex.Complex complex17 = complex11.cosh();
        org.apache.commons.math3.complex.Complex complex18 = complex11.tan();
        org.apache.commons.math3.complex.Complex complex19 = complex11.tan();
        org.apache.commons.math3.complex.Complex complex21 = complex11.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex22 = complex9.subtract(complex11);
        org.apache.commons.math3.complex.Complex complex23 = complex11.tanh();
        double double24 = complex11.abs();
        org.apache.commons.math3.complex.ComplexField complexField25 = complex11.getField();
        org.apache.commons.math3.complex.Complex complex27 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex28 = complex27.exp();
        double double29 = complex27.getArgument();
        org.apache.commons.math3.complex.Complex complex31 = complex27.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex32 = complex27.sin();
        org.apache.commons.math3.complex.Complex complex33 = complex27.cosh();
        org.apache.commons.math3.complex.Complex complex34 = complex27.tan();
        org.apache.commons.math3.complex.Complex complex35 = complex34.conjugate();
        double double36 = complex34.getReal();
        org.apache.commons.math3.complex.Complex complex37 = complex11.subtract(complex34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex8 and complex35", complex8.equals(complex35) ? complex8.hashCode() == complex35.hashCode() : true);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test449");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double3 = complex2.getImaginary();
        org.apache.commons.math3.complex.Complex complex4 = complex2.negate();
        org.apache.commons.math3.complex.Complex complex6 = complex4.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex8 = complex4.subtract(complex7);
        org.apache.commons.math3.complex.Complex complex9 = complex4.acos();
        org.apache.commons.math3.complex.Complex complex10 = complex0.subtract(complex4);
        org.apache.commons.math3.complex.Complex complex11 = complex4.atan();
        org.apache.commons.math3.complex.Complex complex13 = complex4.pow((double) 0L);
        org.apache.commons.math3.complex.Complex complex14 = complex13.sinh();
        org.apache.commons.math3.complex.Complex complex15 = complex14.sinh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex13", complex2.equals(complex13) ? complex2.hashCode() == complex13.hashCode() : true);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test450");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex6 = complex1.acos();
        org.apache.commons.math3.complex.Complex complex8 = complex6.subtract((double) '#');
        java.lang.String str9 = complex6.toString();
        org.apache.commons.math3.complex.Complex complex11 = new org.apache.commons.math3.complex.Complex((double) 100L);
        org.apache.commons.math3.complex.Complex complex13 = complex11.divide((double) (-1));
        org.apache.commons.math3.complex.Complex complex15 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex16 = complex15.exp();
        double double17 = complex15.getArgument();
        org.apache.commons.math3.complex.Complex complex19 = complex15.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex20 = complex15.sin();
        org.apache.commons.math3.complex.Complex complex21 = complex15.cosh();
        org.apache.commons.math3.complex.Complex complex22 = complex15.tan();
        org.apache.commons.math3.complex.Complex complex23 = complex11.multiply(complex22);
        boolean boolean24 = complex6.equals((java.lang.Object) complex23);
        org.apache.commons.math3.complex.Complex complex26 = complex6.multiply((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex27 = complex6.negate();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex26", complex4.equals(complex26) ? complex4.hashCode() == complex26.hashCode() : true);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test451");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 10, (double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex4 = complex2.add((double) (byte) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex4.pow(1.0d);
        org.apache.commons.math3.complex.Complex complex7 = complex6.sin();
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex10 = complex9.exp();
        double double11 = complex9.getArgument();
        org.apache.commons.math3.complex.Complex complex12 = complex9.log();
        org.apache.commons.math3.complex.Complex complex13 = complex9.log();
        org.apache.commons.math3.complex.Complex complex15 = complex13.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex16 = complex6.multiply(complex13);
        org.apache.commons.math3.complex.Complex complex18 = complex13.divide(1.0349512282932293E22d);
        org.apache.commons.math3.complex.Complex complex20 = complex13.multiply(0.0d);
        org.apache.commons.math3.complex.Complex complex22 = complex13.multiply((int) '#');
        org.apache.commons.math3.complex.Complex complex24 = complex22.divide(3.141592653589793d);
        org.apache.commons.math3.complex.Complex complex25 = complex24.conjugate();
        org.apache.commons.math3.complex.Complex complex26 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex27 = complex26.exp();
        org.apache.commons.math3.complex.Complex complex28 = complex27.exp();
        org.apache.commons.math3.complex.Complex complex29 = complex25.add(complex28);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex27 and complex2.", complex27.equals(complex2) == complex2.equals(complex27));
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test452");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math3.complex.Complex complex7 = complex5.reciprocal();
        org.apache.commons.math3.complex.Complex complex8 = complex7.cosh();
        org.apache.commons.math3.complex.Complex complex9 = complex7.acos();
        org.apache.commons.math3.complex.Complex complex12 = new org.apache.commons.math3.complex.Complex((double) 10, (double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex14 = complex12.add((double) (byte) 10);
        double double15 = complex14.getImaginary();
        org.apache.commons.math3.complex.Complex complex16 = complex14.cosh();
        org.apache.commons.math3.complex.Complex complex17 = complex9.add(complex16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex7", complex1.equals(complex7) ? complex1.hashCode() == complex7.hashCode() : true);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test453");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex7 = complex5.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex8 = complex5.sqrt();
        org.apache.commons.math3.complex.Complex complex10 = complex5.multiply((int) '#');
        org.apache.commons.math3.complex.Complex complex11 = complex10.reciprocal();
        java.lang.String str12 = complex11.toString();
        org.apache.commons.math3.complex.Complex complex13 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex14 = complex13.sqrt1z();
        org.apache.commons.math3.complex.Complex complex15 = complex13.sqrt();
        org.apache.commons.math3.complex.Complex complex16 = complex13.sqrt1z();
        org.apache.commons.math3.complex.Complex complex18 = complex16.pow(0.45054953406980763d);
        org.apache.commons.math3.complex.Complex complex19 = complex11.add(complex16);
        org.apache.commons.math3.complex.Complex complex20 = complex11.acos();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex20 and complex1.", complex20.equals(complex1) == complex1.equals(complex20));
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test454");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math3.complex.Complex complex7 = complex5.atan();
        org.apache.commons.math3.complex.Complex complex9 = complex5.pow(2.2835403144819257d);
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex12 = complex11.exp();
        org.apache.commons.math3.complex.Complex complex13 = complex11.acos();
        org.apache.commons.math3.complex.Complex complex14 = complex13.reciprocal();
        org.apache.commons.math3.complex.Complex complex15 = complex5.divide(complex14);
        org.apache.commons.math3.complex.Complex complex17 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex18 = complex5.pow(complex17);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on complex14 and complex1.", complex14.equals(complex1) == complex1.equals(complex14));
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test455");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math3.complex.Complex complex7 = complex5.reciprocal();
        org.apache.commons.math3.complex.Complex complex8 = complex7.cosh();
        org.apache.commons.math3.complex.Complex complex10 = complex8.pow(7.211769165453326d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex7", complex1.equals(complex7) ? complex1.hashCode() == complex7.hashCode() : true);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test456");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex3.tanh();
        org.apache.commons.math3.complex.Complex complex7 = complex3.conjugate();
        org.apache.commons.math3.complex.Complex complex8 = complex7.sinh();
        org.apache.commons.math3.complex.Complex complex10 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double11 = complex10.getImaginary();
        org.apache.commons.math3.complex.Complex complex12 = complex10.negate();
        org.apache.commons.math3.complex.Complex complex14 = complex12.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex15 = complex14.atan();
        org.apache.commons.math3.complex.Complex complex17 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex18 = complex17.exp();
        double double19 = complex17.getArgument();
        org.apache.commons.math3.complex.Complex complex21 = complex17.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex22 = complex17.sin();
        org.apache.commons.math3.complex.Complex complex23 = complex17.cosh();
        org.apache.commons.math3.complex.Complex complex25 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double26 = complex25.getImaginary();
        boolean boolean27 = complex23.equals((java.lang.Object) double26);
        org.apache.commons.math3.complex.Complex complex28 = complex23.tanh();
        org.apache.commons.math3.complex.Complex complex29 = complex14.subtract(complex28);
        org.apache.commons.math3.complex.Complex complex30 = complex28.cosh();
        org.apache.commons.math3.complex.Complex complex32 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double33 = complex32.getImaginary();
        org.apache.commons.math3.complex.Complex complex34 = complex32.negate();
        org.apache.commons.math3.complex.Complex complex36 = complex34.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex37 = complex36.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList39 = complex36.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex41 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex42 = complex41.exp();
        org.apache.commons.math3.complex.Complex complex43 = complex41.tanh();
        org.apache.commons.math3.complex.Complex complex44 = complex36.subtract(complex41);
        org.apache.commons.math3.complex.Complex complex46 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex47 = complex46.exp();
        double double48 = complex46.getArgument();
        org.apache.commons.math3.complex.Complex complex50 = complex46.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex51 = complex46.sin();
        org.apache.commons.math3.complex.Complex complex52 = complex46.cosh();
        org.apache.commons.math3.complex.Complex complex53 = complex46.tan();
        org.apache.commons.math3.complex.Complex complex54 = complex46.tan();
        org.apache.commons.math3.complex.Complex complex56 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex57 = complex56.exp();
        double double58 = complex56.getArgument();
        org.apache.commons.math3.complex.Complex complex60 = complex56.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex61 = complex56.sin();
        org.apache.commons.math3.complex.Complex complex62 = complex56.cosh();
        org.apache.commons.math3.complex.Complex complex63 = complex56.tan();
        org.apache.commons.math3.complex.Complex complex64 = complex56.tan();
        org.apache.commons.math3.complex.Complex complex66 = complex56.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex67 = complex54.subtract(complex56);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList69 = complex67.nthRoot((int) '4');
        org.apache.commons.math3.complex.Complex complex70 = complex41.subtract(complex67);
        org.apache.commons.math3.complex.Complex complex71 = complex28.pow(complex67);
        org.apache.commons.math3.complex.Complex complex72 = complex28.sqrt();
        org.apache.commons.math3.complex.Complex complex75 = org.apache.commons.math3.complex.Complex.valueOf(100.0d, (double) (short) 100);
        org.apache.commons.math3.complex.Complex complex78 = new org.apache.commons.math3.complex.Complex((double) 10, (double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex80 = complex78.add((double) (byte) 10);
        double double81 = complex80.getImaginary();
        org.apache.commons.math3.complex.Complex complex82 = complex80.tan();
        double double83 = complex80.getReal();
        org.apache.commons.math3.complex.Complex complex84 = complex80.cos();
        org.apache.commons.math3.complex.Complex complex85 = complex75.subtract(complex84);
        org.apache.commons.math3.complex.Complex complex87 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double88 = complex87.getImaginary();
        org.apache.commons.math3.complex.Complex complex90 = complex87.pow((double) 100L);
        org.apache.commons.math3.complex.Complex complex91 = complex75.multiply(complex87);
        org.apache.commons.math3.complex.Complex complex92 = complex28.add(complex75);
        org.apache.commons.math3.complex.Complex complex93 = complex28.negate();
        org.apache.commons.math3.complex.Complex complex95 = complex93.subtract(3.738039258735582E-23d);
        org.apache.commons.math3.complex.Complex complex96 = complex8.subtract(complex95);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex7", complex3.equals(complex7) ? complex3.hashCode() == complex7.hashCode() : true);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test457");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double8 = complex7.getImaginary();
        org.apache.commons.math3.complex.Complex complex9 = complex7.negate();
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex12 = complex11.exp();
        double double13 = complex11.getArgument();
        org.apache.commons.math3.complex.Complex complex14 = complex11.log();
        org.apache.commons.math3.complex.Complex complex15 = complex11.log();
        org.apache.commons.math3.complex.Complex complex17 = complex15.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex18 = complex9.subtract(complex17);
        org.apache.commons.math3.complex.Complex complex19 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex20 = complex19.sqrt1z();
        boolean boolean21 = complex18.equals((java.lang.Object) complex20);
        org.apache.commons.math3.complex.ComplexField complexField22 = complex20.getField();
        org.apache.commons.math3.complex.Complex complex23 = complex1.divide(complex20);
        org.apache.commons.math3.complex.Complex complex25 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double26 = complex25.getImaginary();
        org.apache.commons.math3.complex.Complex complex27 = complex25.negate();
        org.apache.commons.math3.complex.Complex complex29 = complex27.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex30 = complex29.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList32 = complex29.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex33 = complex29.negate();
        org.apache.commons.math3.complex.Complex complex34 = complex29.acos();
        org.apache.commons.math3.complex.Complex complex35 = complex20.pow(complex34);
        org.apache.commons.math3.complex.Complex complex36 = complex34.cosh();
        org.apache.commons.math3.complex.Complex complex38 = complex36.divide((-10.233808090179405d));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex34", complex4.equals(complex34) ? complex4.hashCode() == complex34.hashCode() : true);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test458");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex3.reciprocal();
        boolean boolean5 = complex4.isNaN();
        org.apache.commons.math3.complex.Complex complex6 = complex4.negate();
        org.apache.commons.math3.complex.Complex complex8 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double9 = complex8.getImaginary();
        org.apache.commons.math3.complex.Complex complex10 = complex8.negate();
        org.apache.commons.math3.complex.Complex complex12 = complex10.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex13 = complex12.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList15 = complex12.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex17 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex18 = complex17.exp();
        org.apache.commons.math3.complex.Complex complex19 = complex17.tanh();
        org.apache.commons.math3.complex.Complex complex20 = complex12.subtract(complex17);
        org.apache.commons.math3.complex.Complex complex22 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex23 = complex22.exp();
        double double24 = complex22.getArgument();
        org.apache.commons.math3.complex.Complex complex26 = complex22.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex27 = complex22.sin();
        org.apache.commons.math3.complex.Complex complex28 = complex22.cosh();
        org.apache.commons.math3.complex.Complex complex29 = complex22.tan();
        org.apache.commons.math3.complex.Complex complex30 = complex22.tan();
        org.apache.commons.math3.complex.Complex complex32 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex33 = complex32.exp();
        double double34 = complex32.getArgument();
        org.apache.commons.math3.complex.Complex complex36 = complex32.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex37 = complex32.sin();
        org.apache.commons.math3.complex.Complex complex38 = complex32.cosh();
        org.apache.commons.math3.complex.Complex complex39 = complex32.tan();
        org.apache.commons.math3.complex.Complex complex40 = complex32.tan();
        org.apache.commons.math3.complex.Complex complex42 = complex32.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex43 = complex30.subtract(complex32);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList45 = complex43.nthRoot((int) '4');
        org.apache.commons.math3.complex.Complex complex46 = complex17.subtract(complex43);
        boolean boolean47 = complex17.isNaN();
        org.apache.commons.math3.complex.Complex complex48 = complex17.cos();
        boolean boolean49 = complex4.equals((java.lang.Object) complex17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex6", complex1.equals(complex6) ? complex1.hashCode() == complex6.hashCode() : true);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test459");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double8 = complex7.getImaginary();
        org.apache.commons.math3.complex.Complex complex9 = complex7.negate();
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex12 = complex11.exp();
        double double13 = complex11.getArgument();
        org.apache.commons.math3.complex.Complex complex14 = complex11.log();
        org.apache.commons.math3.complex.Complex complex15 = complex11.log();
        org.apache.commons.math3.complex.Complex complex17 = complex15.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex18 = complex9.subtract(complex17);
        org.apache.commons.math3.complex.Complex complex19 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex20 = complex19.sqrt1z();
        boolean boolean21 = complex18.equals((java.lang.Object) complex20);
        org.apache.commons.math3.complex.ComplexField complexField22 = complex20.getField();
        org.apache.commons.math3.complex.Complex complex23 = complex1.divide(complex20);
        org.apache.commons.math3.complex.Complex complex25 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double26 = complex25.getImaginary();
        org.apache.commons.math3.complex.Complex complex27 = complex25.negate();
        org.apache.commons.math3.complex.Complex complex29 = complex27.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex30 = complex29.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList32 = complex29.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex33 = complex29.negate();
        org.apache.commons.math3.complex.Complex complex34 = complex29.acos();
        org.apache.commons.math3.complex.Complex complex35 = complex20.pow(complex34);
        boolean boolean36 = complex34.isInfinite();
        org.apache.commons.math3.complex.Complex complex39 = new org.apache.commons.math3.complex.Complex((double) (byte) 100, 0.0d);
        org.apache.commons.math3.complex.Complex complex40 = complex39.sqrt();
        org.apache.commons.math3.complex.Complex complex41 = complex39.log();
        org.apache.commons.math3.complex.Complex complex43 = complex41.multiply((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex44 = complex41.log();
        double double45 = complex41.abs();
        org.apache.commons.math3.complex.Complex complex46 = complex41.acos();
        org.apache.commons.math3.complex.Complex complex47 = complex46.log();
        org.apache.commons.math3.complex.Complex complex48 = complex34.subtract(complex46);
        org.apache.commons.math3.complex.Complex complex50 = complex34.multiply((-2.356194490192345d));
        org.apache.commons.math3.complex.Complex complex51 = complex34.tanh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex50", complex4.equals(complex50) ? complex4.hashCode() == complex50.hashCode() : true);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test460");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math3.complex.Complex complex8 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex9 = complex8.exp();
        double double10 = complex8.getArgument();
        org.apache.commons.math3.complex.Complex complex12 = complex8.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex13 = complex8.sin();
        org.apache.commons.math3.complex.Complex complex14 = complex8.cosh();
        org.apache.commons.math3.complex.Complex complex16 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double17 = complex16.getImaginary();
        boolean boolean18 = complex14.equals((java.lang.Object) double17);
        org.apache.commons.math3.complex.Complex complex19 = complex14.tanh();
        org.apache.commons.math3.complex.Complex complex20 = complex5.subtract(complex19);
        org.apache.commons.math3.complex.Complex complex21 = complex19.cosh();
        org.apache.commons.math3.complex.Complex complex22 = complex21.atan();
        org.apache.commons.math3.complex.Complex complex23 = complex22.cosh();
        org.apache.commons.math3.complex.Complex complex24 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex25 = complex24.sqrt1z();
        org.apache.commons.math3.complex.Complex complex27 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double28 = complex27.getImaginary();
        org.apache.commons.math3.complex.Complex complex29 = complex27.negate();
        org.apache.commons.math3.complex.Complex complex30 = complex29.sinh();
        org.apache.commons.math3.complex.Complex complex31 = complex30.acos();
        org.apache.commons.math3.complex.Complex complex32 = complex25.divide(complex30);
        org.apache.commons.math3.complex.Complex complex33 = complex32.tan();
        org.apache.commons.math3.complex.Complex complex35 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double36 = complex35.getImaginary();
        org.apache.commons.math3.complex.Complex complex37 = complex35.negate();
        org.apache.commons.math3.complex.Complex complex39 = complex37.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex40 = complex37.tanh();
        org.apache.commons.math3.complex.Complex complex41 = complex40.conjugate();
        org.apache.commons.math3.complex.Complex complex42 = complex33.divide(complex40);
        boolean boolean43 = complex40.isNaN();
        org.apache.commons.math3.complex.Complex complex44 = complex40.cos();
        org.apache.commons.math3.complex.Complex complex45 = complex40.sqrt1z();
        org.apache.commons.math3.complex.Complex complex46 = complex22.subtract(complex40);
        double double47 = complex22.abs();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex40 and complex41", complex40.equals(complex41) ? complex40.hashCode() == complex41.hashCode() : true);
    }
}

