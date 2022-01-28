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
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math.complex.Complex complex3 = complex1.cos();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex5 = complex4.atan();
        org.apache.commons.math.complex.Complex complex6 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex7 = complex6.tanh();
        org.apache.commons.math.complex.Complex complex8 = complex7.sinh();
        org.apache.commons.math.complex.Complex complex9 = complex1.subtract(complex8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex6", complex3.equals(complex6) ? complex3.hashCode() == complex6.hashCode() : true);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        double double8 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex9 = complex4.divide(complex7);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.atan();
        org.apache.commons.math.complex.Complex complex12 = complex11.sqrt();
        org.apache.commons.math.complex.Complex complex13 = complex11.tanh();
        org.apache.commons.math.complex.Complex complex14 = complex7.multiply(complex13);
        org.apache.commons.math.complex.Complex complex15 = complex13.cos();
        org.apache.commons.math.complex.Complex complex16 = complex13.sinh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex15", complex2.equals(complex15) ? complex2.hashCode() == complex15.hashCode() : true);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        double double8 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex9 = complex4.divide(complex7);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.atan();
        org.apache.commons.math.complex.Complex complex12 = complex11.sqrt();
        org.apache.commons.math.complex.Complex complex13 = complex11.tanh();
        org.apache.commons.math.complex.Complex complex14 = complex7.multiply(complex13);
        org.apache.commons.math.complex.Complex complex15 = complex13.cos();
        double double16 = complex13.getArgument();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex15", complex2.equals(complex15) ? complex2.hashCode() == complex15.hashCode() : true);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex6 = complex2.multiply(complex5);
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex8 = complex7.atan();
        org.apache.commons.math.complex.Complex complex9 = complex8.cosh();
        org.apache.commons.math.complex.Complex complex10 = complex9.tanh();
        org.apache.commons.math.complex.Complex complex11 = complex10.sinh();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex13 = complex12.atan();
        org.apache.commons.math.complex.Complex complex14 = complex13.cosh();
        double double15 = complex14.getArgument();
        org.apache.commons.math.complex.Complex complex16 = complex11.divide(complex14);
        java.lang.String str17 = complex16.toString();
        org.apache.commons.math.complex.Complex complex18 = complex16.sqrt1z();
        org.apache.commons.math.complex.Complex complex19 = complex18.tan();
        org.apache.commons.math.complex.Complex complex20 = complex2.add(complex19);
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex22 = complex21.atan();
        org.apache.commons.math.complex.Complex complex23 = complex22.sqrt();
        org.apache.commons.math.complex.Complex complex25 = complex23.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex27 = complex23.multiply(complex26);
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex29 = complex28.atan();
        org.apache.commons.math.complex.Complex complex30 = complex29.cosh();
        org.apache.commons.math.complex.Complex complex31 = complex30.asin();
        org.apache.commons.math.complex.Complex complex32 = complex26.add(complex31);
        org.apache.commons.math.complex.Complex complex33 = complex32.conjugate();
        org.apache.commons.math.complex.Complex complex34 = complex2.divide(complex32);
        org.apache.commons.math.complex.Complex complex35 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex36 = complex35.atan();
        org.apache.commons.math.complex.Complex complex37 = complex36.sqrt();
        org.apache.commons.math.complex.Complex complex38 = complex36.cos();
        org.apache.commons.math.complex.Complex complex39 = complex38.acos();
        org.apache.commons.math.complex.Complex complex40 = complex32.add(complex38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex39", complex0.equals(complex39) ? complex0.hashCode() == complex39.hashCode() : true);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math.complex.Complex complex3 = complex1.cos();
        org.apache.commons.math.complex.Complex complex4 = complex3.acos();
        org.apache.commons.math.complex.Complex complex5 = complex3.negate();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex4", complex0.equals(complex4) ? complex0.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex4 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex5 = complex4.tanh();
        org.apache.commons.math.complex.Complex complex6 = complex1.subtract(complex4);
        org.apache.commons.math.complex.Complex complex9 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex10 = complex1.pow(complex9);
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex12 = complex11.atan();
        org.apache.commons.math.complex.Complex complex13 = complex12.sqrt();
        org.apache.commons.math.complex.Complex complex14 = complex12.tanh();
        org.apache.commons.math.complex.Complex complex15 = complex10.pow(complex12);
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex17 = complex16.atan();
        org.apache.commons.math.complex.Complex complex18 = complex17.cosh();
        org.apache.commons.math.complex.Complex complex19 = complex18.tanh();
        org.apache.commons.math.complex.Complex complex20 = complex19.sinh();
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex22 = complex21.atan();
        org.apache.commons.math.complex.Complex complex23 = complex22.cosh();
        double double24 = complex23.getArgument();
        org.apache.commons.math.complex.Complex complex25 = complex20.divide(complex23);
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex27 = complex26.atan();
        org.apache.commons.math.complex.Complex complex28 = complex27.sqrt();
        org.apache.commons.math.complex.Complex complex29 = complex27.tanh();
        org.apache.commons.math.complex.Complex complex30 = complex23.multiply(complex29);
        org.apache.commons.math.complex.Complex complex31 = complex29.cos();
        org.apache.commons.math.complex.Complex complex32 = complex31.log();
        org.apache.commons.math.complex.Complex complex33 = complex12.divide(complex31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex32", complex0.equals(complex32) ? complex0.hashCode() == complex32.hashCode() : true);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        double double8 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex9 = complex4.divide(complex7);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.atan();
        org.apache.commons.math.complex.Complex complex12 = complex11.sqrt();
        org.apache.commons.math.complex.Complex complex13 = complex11.tanh();
        org.apache.commons.math.complex.Complex complex14 = complex7.multiply(complex13);
        org.apache.commons.math.complex.Complex complex15 = complex14.conjugate();
        org.apache.commons.math.complex.Complex complex16 = complex14.atan();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex15", complex0.equals(complex15) ? complex0.hashCode() == complex15.hashCode() : true);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        double double8 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex9 = complex4.divide(complex7);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.atan();
        org.apache.commons.math.complex.Complex complex12 = complex11.sqrt();
        org.apache.commons.math.complex.Complex complex13 = complex11.tanh();
        org.apache.commons.math.complex.Complex complex14 = complex7.multiply(complex13);
        org.apache.commons.math.complex.Complex complex15 = complex13.exp();
        org.apache.commons.math.complex.Complex complex16 = complex13.atan();
        org.apache.commons.math.complex.Complex complex17 = complex13.cos();
        double double18 = complex13.getReal();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex17", complex2.equals(complex17) ? complex2.hashCode() == complex17.hashCode() : true);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        double double8 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex9 = complex4.divide(complex7);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.atan();
        org.apache.commons.math.complex.Complex complex12 = complex11.sqrt();
        org.apache.commons.math.complex.Complex complex13 = complex11.tanh();
        org.apache.commons.math.complex.Complex complex14 = complex7.multiply(complex13);
        org.apache.commons.math.complex.Complex complex15 = complex13.cos();
        org.apache.commons.math.complex.Complex complex16 = complex15.tanh();
        org.apache.commons.math.complex.Complex complex17 = complex15.conjugate();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex16", complex3.equals(complex16) ? complex3.hashCode() == complex16.hashCode() : true);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        double double8 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex9 = complex4.divide(complex7);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.atan();
        org.apache.commons.math.complex.Complex complex12 = complex11.sqrt();
        org.apache.commons.math.complex.Complex complex13 = complex11.tanh();
        org.apache.commons.math.complex.Complex complex14 = complex7.multiply(complex13);
        org.apache.commons.math.complex.Complex complex15 = complex14.conjugate();
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex17 = complex16.atan();
        java.lang.Object obj18 = new java.lang.Object();
        boolean boolean19 = complex16.equals(obj18);
        org.apache.commons.math.complex.Complex complex20 = complex14.pow(complex16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex15", complex0.equals(complex15) ? complex0.hashCode() == complex15.hashCode() : true);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex6 = complex2.multiply(complex5);
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex8 = complex7.atan();
        org.apache.commons.math.complex.Complex complex9 = complex8.cosh();
        org.apache.commons.math.complex.Complex complex10 = complex9.tanh();
        org.apache.commons.math.complex.Complex complex11 = complex10.sinh();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex13 = complex12.atan();
        org.apache.commons.math.complex.Complex complex14 = complex13.cosh();
        double double15 = complex14.getArgument();
        org.apache.commons.math.complex.Complex complex16 = complex11.divide(complex14);
        java.lang.String str17 = complex16.toString();
        org.apache.commons.math.complex.Complex complex18 = complex16.sqrt1z();
        org.apache.commons.math.complex.Complex complex19 = complex18.tan();
        org.apache.commons.math.complex.Complex complex20 = complex2.add(complex19);
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex22 = complex21.atan();
        org.apache.commons.math.complex.Complex complex23 = complex22.cosh();
        org.apache.commons.math.complex.Complex complex24 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex25 = complex24.atan();
        org.apache.commons.math.complex.Complex complex26 = complex25.cosh();
        org.apache.commons.math.complex.Complex complex27 = complex26.tanh();
        org.apache.commons.math.complex.Complex complex28 = complex26.exp();
        org.apache.commons.math.complex.Complex complex29 = complex22.add(complex26);
        org.apache.commons.math.complex.Complex complex30 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex31 = complex30.atan();
        org.apache.commons.math.complex.Complex complex32 = complex31.cosh();
        org.apache.commons.math.complex.Complex complex33 = complex32.tanh();
        org.apache.commons.math.complex.Complex complex34 = complex33.sinh();
        boolean boolean35 = complex33.isInfinite();
        org.apache.commons.math.complex.Complex complex36 = complex22.subtract(complex33);
        java.lang.String str37 = complex36.toString();
        org.apache.commons.math.complex.Complex complex38 = complex36.sqrt();
        org.apache.commons.math.complex.Complex complex39 = complex20.divide(complex38);
        org.apache.commons.math.complex.Complex complex40 = complex20.conjugate();
        org.apache.commons.math.complex.Complex complex41 = complex20.cos();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex19 and complex40", complex19.equals(complex40) ? complex19.hashCode() == complex40.hashCode() : true);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        double double8 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex9 = complex4.divide(complex7);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.atan();
        org.apache.commons.math.complex.Complex complex12 = complex11.sqrt();
        org.apache.commons.math.complex.Complex complex13 = complex11.tanh();
        org.apache.commons.math.complex.Complex complex14 = complex7.multiply(complex13);
        org.apache.commons.math.complex.Complex complex15 = complex13.exp();
        org.apache.commons.math.complex.Complex complex16 = complex15.acos();
        org.apache.commons.math.complex.Complex complex17 = complex15.tan();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex16", complex0.equals(complex16) ? complex0.hashCode() == complex16.hashCode() : true);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex4 = complex3.atan();
        org.apache.commons.math.complex.Complex complex5 = complex4.cosh();
        org.apache.commons.math.complex.Complex complex6 = complex5.tanh();
        org.apache.commons.math.complex.Complex complex7 = complex6.sinh();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.atan();
        org.apache.commons.math.complex.Complex complex10 = complex9.cosh();
        double double11 = complex10.getArgument();
        org.apache.commons.math.complex.Complex complex12 = complex7.divide(complex10);
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex14 = complex13.atan();
        org.apache.commons.math.complex.Complex complex15 = complex14.sqrt();
        org.apache.commons.math.complex.Complex complex16 = complex14.tanh();
        org.apache.commons.math.complex.Complex complex17 = complex10.multiply(complex16);
        org.apache.commons.math.complex.Complex complex18 = complex1.pow(complex16);
        org.apache.commons.math.complex.Complex complex19 = complex16.cos();
        org.apache.commons.math.complex.Complex complex20 = complex16.cos();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex5 and complex19", complex5.equals(complex19) ? complex5.hashCode() == complex19.hashCode() : true);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        double double8 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex9 = complex4.divide(complex7);
        java.lang.String str10 = complex9.toString();
        org.apache.commons.math.complex.Complex complex11 = complex9.sqrt1z();
        org.apache.commons.math.complex.Complex complex12 = complex11.tan();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean14 = complex13.isInfinite();
        org.apache.commons.math.complex.Complex complex15 = complex12.multiply(complex13);
        org.apache.commons.math.complex.Complex complex16 = complex13.negate();
        org.apache.commons.math.complex.Complex complex17 = complex16.asin();
        org.apache.commons.math.complex.Complex complex18 = complex16.sin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex17", complex0.equals(complex17) ? complex0.hashCode() == complex17.hashCode() : true);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        double double8 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex9 = complex4.divide(complex7);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.atan();
        org.apache.commons.math.complex.Complex complex12 = complex11.sqrt();
        org.apache.commons.math.complex.Complex complex13 = complex11.tanh();
        org.apache.commons.math.complex.Complex complex14 = complex7.multiply(complex13);
        org.apache.commons.math.complex.Complex complex15 = complex13.exp();
        org.apache.commons.math.complex.Complex complex16 = complex13.atan();
        org.apache.commons.math.complex.Complex complex17 = complex13.cos();
        org.apache.commons.math.complex.Complex complex18 = complex13.cosh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex17", complex2.equals(complex17) ? complex2.hashCode() == complex17.hashCode() : true);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        double double8 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex9 = complex4.divide(complex7);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.atan();
        org.apache.commons.math.complex.Complex complex12 = complex11.sqrt();
        org.apache.commons.math.complex.Complex complex13 = complex11.tanh();
        org.apache.commons.math.complex.Complex complex14 = complex7.multiply(complex13);
        org.apache.commons.math.complex.Complex complex15 = complex13.cos();
        org.apache.commons.math.complex.Complex complex16 = complex15.log();
        java.lang.Class<?> wildcardClass17 = complex15.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex16", complex0.equals(complex16) ? complex0.hashCode() == complex16.hashCode() : true);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex4 = complex3.atan();
        org.apache.commons.math.complex.Complex complex5 = complex4.cosh();
        org.apache.commons.math.complex.Complex complex6 = complex5.tanh();
        org.apache.commons.math.complex.Complex complex7 = complex5.exp();
        org.apache.commons.math.complex.Complex complex8 = complex1.add(complex5);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex10 = complex9.atan();
        org.apache.commons.math.complex.Complex complex11 = complex10.cosh();
        org.apache.commons.math.complex.Complex complex12 = complex11.tanh();
        org.apache.commons.math.complex.Complex complex13 = complex12.sinh();
        boolean boolean14 = complex12.isInfinite();
        org.apache.commons.math.complex.Complex complex15 = complex1.subtract(complex12);
        org.apache.commons.math.complex.Complex complex16 = complex15.negate();
        org.apache.commons.math.complex.Complex complex17 = complex16.exp();
        org.apache.commons.math.complex.Complex complex18 = complex17.asin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex6 and complex16", complex6.equals(complex16) ? complex6.hashCode() == complex16.hashCode() : true);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        double double8 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex9 = complex4.divide(complex7);
        org.apache.commons.math.complex.Complex complex10 = complex4.log();
        org.apache.commons.math.complex.Complex complex11 = complex10.cos();
        org.apache.commons.math.complex.Complex complex12 = complex10.exp();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex14 = complex13.atan();
        org.apache.commons.math.complex.Complex complex15 = complex14.cosh();
        org.apache.commons.math.complex.Complex complex16 = complex15.asin();
        org.apache.commons.math.complex.ComplexField complexField17 = complex15.getField();
        org.apache.commons.math.complex.Complex complex18 = complex15.tanh();
        org.apache.commons.math.complex.Complex complex19 = complex15.log();
        org.apache.commons.math.complex.Complex complex20 = complex19.cosh();
        org.apache.commons.math.complex.Complex complex21 = complex10.multiply(complex19);
        org.apache.commons.math.complex.Complex complex22 = complex10.acos();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex21", complex0.equals(complex21) ? complex0.hashCode() == complex21.hashCode() : true);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex4 = complex3.atan();
        org.apache.commons.math.complex.Complex complex5 = complex4.cosh();
        org.apache.commons.math.complex.Complex complex6 = complex5.tanh();
        org.apache.commons.math.complex.Complex complex7 = complex5.exp();
        org.apache.commons.math.complex.Complex complex8 = complex1.add(complex5);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex10 = complex9.atan();
        org.apache.commons.math.complex.Complex complex11 = complex10.cosh();
        org.apache.commons.math.complex.Complex complex12 = complex11.tanh();
        org.apache.commons.math.complex.Complex complex13 = complex12.sinh();
        boolean boolean14 = complex12.isInfinite();
        org.apache.commons.math.complex.Complex complex15 = complex1.subtract(complex12);
        java.lang.String str16 = complex15.toString();
        java.lang.String str17 = complex15.toString();
        org.apache.commons.math.complex.Complex complex19 = complex15.multiply((double) (byte) -1);
        org.apache.commons.math.complex.Complex complex20 = complex15.sqrt1z();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex6 and complex19", complex6.equals(complex19) ? complex6.hashCode() == complex19.hashCode() : true);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math.complex.Complex complex3 = complex1.cos();
        org.apache.commons.math.complex.Complex complex4 = complex3.acos();
        org.apache.commons.math.complex.Complex complex5 = complex3.log();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex4", complex0.equals(complex4) ? complex0.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt1z();
        double double2 = complex1.getReal();
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex4 = complex3.atan();
        org.apache.commons.math.complex.Complex complex5 = complex4.cosh();
        org.apache.commons.math.complex.Complex complex6 = complex5.tanh();
        org.apache.commons.math.complex.Complex complex7 = complex6.sinh();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.atan();
        org.apache.commons.math.complex.Complex complex10 = complex9.cosh();
        double double11 = complex10.getArgument();
        org.apache.commons.math.complex.Complex complex12 = complex7.divide(complex10);
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex14 = complex13.atan();
        org.apache.commons.math.complex.Complex complex15 = complex14.sqrt();
        org.apache.commons.math.complex.Complex complex16 = complex14.tanh();
        org.apache.commons.math.complex.Complex complex17 = complex10.multiply(complex16);
        org.apache.commons.math.complex.Complex complex18 = complex16.exp();
        org.apache.commons.math.complex.Complex complex19 = complex18.acos();
        org.apache.commons.math.complex.Complex complex20 = complex1.multiply(complex18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex19", complex0.equals(complex19) ? complex0.hashCode() == complex19.hashCode() : true);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex2.exp();
        boolean boolean5 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex6 = complex2.sqrt();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex8 = complex7.atan();
        org.apache.commons.math.complex.Complex complex9 = complex8.cosh();
        org.apache.commons.math.complex.Complex complex10 = complex9.tanh();
        org.apache.commons.math.complex.Complex complex11 = complex10.sinh();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex13 = complex12.atan();
        org.apache.commons.math.complex.Complex complex14 = complex13.cosh();
        double double15 = complex14.getArgument();
        org.apache.commons.math.complex.Complex complex16 = complex11.divide(complex14);
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex18 = complex17.atan();
        org.apache.commons.math.complex.Complex complex19 = complex18.sqrt();
        org.apache.commons.math.complex.Complex complex20 = complex18.tanh();
        org.apache.commons.math.complex.Complex complex21 = complex14.multiply(complex20);
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex23 = complex22.atan();
        org.apache.commons.math.complex.Complex complex24 = complex23.cosh();
        org.apache.commons.math.complex.Complex complex25 = complex24.tanh();
        org.apache.commons.math.complex.Complex complex26 = complex25.sinh();
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex28 = complex27.atan();
        org.apache.commons.math.complex.Complex complex29 = complex28.cosh();
        double double30 = complex29.getArgument();
        org.apache.commons.math.complex.Complex complex31 = complex26.divide(complex29);
        org.apache.commons.math.complex.Complex complex32 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex33 = complex32.atan();
        org.apache.commons.math.complex.Complex complex34 = complex33.sqrt();
        org.apache.commons.math.complex.Complex complex35 = complex33.tanh();
        org.apache.commons.math.complex.Complex complex36 = complex29.multiply(complex35);
        org.apache.commons.math.complex.Complex complex37 = complex14.divide(complex36);
        org.apache.commons.math.complex.Complex complex38 = complex2.pow(complex37);
        org.apache.commons.math.complex.Complex complex39 = complex2.acos();
        org.apache.commons.math.complex.Complex complex40 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex41 = complex40.atan();
        org.apache.commons.math.complex.Complex complex42 = complex41.cosh();
        org.apache.commons.math.complex.Complex complex43 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex44 = complex43.atan();
        org.apache.commons.math.complex.Complex complex45 = complex44.cosh();
        org.apache.commons.math.complex.Complex complex46 = complex45.tanh();
        org.apache.commons.math.complex.Complex complex47 = complex45.exp();
        org.apache.commons.math.complex.Complex complex48 = complex41.add(complex45);
        org.apache.commons.math.complex.Complex complex49 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex50 = complex49.atan();
        org.apache.commons.math.complex.Complex complex51 = complex50.cosh();
        org.apache.commons.math.complex.Complex complex52 = complex51.tanh();
        org.apache.commons.math.complex.Complex complex53 = complex52.sinh();
        boolean boolean54 = complex52.isInfinite();
        org.apache.commons.math.complex.Complex complex55 = complex41.subtract(complex52);
        org.apache.commons.math.complex.Complex complex56 = complex55.negate();
        org.apache.commons.math.complex.Complex complex57 = complex2.divide(complex56);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex39", complex0.equals(complex39) ? complex0.hashCode() == complex39.hashCode() : true);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        java.lang.String str4 = complex3.toString();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.atan();
        org.apache.commons.math.complex.Complex complex10 = complex9.cosh();
        org.apache.commons.math.complex.Complex complex11 = complex10.tanh();
        org.apache.commons.math.complex.Complex complex12 = complex10.exp();
        org.apache.commons.math.complex.Complex complex13 = complex6.add(complex10);
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex15 = complex14.atan();
        org.apache.commons.math.complex.Complex complex16 = complex15.cosh();
        org.apache.commons.math.complex.Complex complex17 = complex16.tanh();
        org.apache.commons.math.complex.Complex complex18 = complex17.sinh();
        boolean boolean19 = complex17.isInfinite();
        org.apache.commons.math.complex.Complex complex20 = complex6.subtract(complex17);
        org.apache.commons.math.complex.Complex complex21 = complex3.divide(complex20);
        org.apache.commons.math.complex.Complex complex22 = complex20.conjugate();
        org.apache.commons.math.complex.Complex complex23 = complex22.acos();
        org.apache.commons.math.complex.ComplexField complexField24 = complex22.getField();
        java.lang.Class<?> wildcardClass25 = complexField24.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex20 and complex22", complex20.equals(complex22) ? complex20.hashCode() == complex22.hashCode() : true);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex4 = complex3.atan();
        org.apache.commons.math.complex.Complex complex5 = complex4.cosh();
        org.apache.commons.math.complex.Complex complex6 = complex5.tanh();
        org.apache.commons.math.complex.Complex complex7 = complex6.sinh();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.atan();
        org.apache.commons.math.complex.Complex complex10 = complex9.cosh();
        double double11 = complex10.getArgument();
        org.apache.commons.math.complex.Complex complex12 = complex7.divide(complex10);
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex14 = complex13.atan();
        org.apache.commons.math.complex.Complex complex15 = complex14.sqrt();
        org.apache.commons.math.complex.Complex complex16 = complex14.tanh();
        org.apache.commons.math.complex.Complex complex17 = complex10.multiply(complex16);
        org.apache.commons.math.complex.Complex complex18 = complex1.pow(complex16);
        org.apache.commons.math.complex.Complex complex19 = complex16.cos();
        org.apache.commons.math.complex.Complex complex20 = complex19.sqrt1z();
        org.apache.commons.math.complex.Complex complex21 = complex20.asin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex5 and complex19", complex5.equals(complex19) ? complex5.hashCode() == complex19.hashCode() : true);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex4 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex5 = complex4.tanh();
        org.apache.commons.math.complex.Complex complex6 = complex1.subtract(complex4);
        org.apache.commons.math.complex.Complex complex9 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex10 = complex1.pow(complex9);
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex12 = complex11.atan();
        org.apache.commons.math.complex.Complex complex13 = complex12.cosh();
        org.apache.commons.math.complex.Complex complex14 = complex13.tanh();
        org.apache.commons.math.complex.Complex complex15 = complex14.sinh();
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex17 = complex16.atan();
        org.apache.commons.math.complex.Complex complex18 = complex17.cosh();
        double double19 = complex18.getArgument();
        org.apache.commons.math.complex.Complex complex20 = complex15.divide(complex18);
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex22 = complex21.atan();
        org.apache.commons.math.complex.Complex complex23 = complex22.sqrt();
        org.apache.commons.math.complex.Complex complex24 = complex22.tanh();
        org.apache.commons.math.complex.Complex complex25 = complex18.multiply(complex24);
        org.apache.commons.math.complex.Complex complex26 = complex24.exp();
        org.apache.commons.math.complex.Complex complex27 = complex24.atan();
        org.apache.commons.math.complex.Complex complex28 = complex24.cos();
        boolean boolean29 = complex1.equals((java.lang.Object) complex24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex10 and complex28", complex10.equals(complex28) ? complex10.hashCode() == complex28.hashCode() : true);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex6 = complex2.multiply(complex5);
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex8 = complex7.atan();
        org.apache.commons.math.complex.Complex complex9 = complex8.cosh();
        org.apache.commons.math.complex.Complex complex10 = complex9.asin();
        org.apache.commons.math.complex.Complex complex11 = complex5.add(complex10);
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex13 = complex12.atan();
        org.apache.commons.math.complex.Complex complex14 = complex11.multiply(complex13);
        org.apache.commons.math.complex.Complex complex15 = complex14.atan();
        org.apache.commons.math.complex.Complex complex16 = complex14.atan();
        org.apache.commons.math.complex.Complex complex17 = complex16.conjugate();
        double double18 = complex16.abs();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex17", complex0.equals(complex17) ? complex0.hashCode() == complex17.hashCode() : true);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        double double8 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex9 = complex4.divide(complex7);
        java.lang.String str10 = complex9.toString();
        org.apache.commons.math.complex.Complex complex11 = complex9.sqrt1z();
        org.apache.commons.math.complex.Complex complex12 = complex11.tan();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean14 = complex13.isInfinite();
        org.apache.commons.math.complex.Complex complex15 = complex12.multiply(complex13);
        org.apache.commons.math.complex.Complex complex16 = complex13.negate();
        org.apache.commons.math.complex.Complex complex17 = complex16.asin();
        org.apache.commons.math.complex.Complex complex18 = complex16.log();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex17", complex0.equals(complex17) ? complex0.hashCode() == complex17.hashCode() : true);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex6 = complex2.multiply(complex5);
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex8 = complex7.atan();
        org.apache.commons.math.complex.Complex complex9 = complex8.cosh();
        org.apache.commons.math.complex.Complex complex10 = complex9.tanh();
        org.apache.commons.math.complex.Complex complex11 = complex10.sinh();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex13 = complex12.atan();
        org.apache.commons.math.complex.Complex complex14 = complex13.cosh();
        double double15 = complex14.getArgument();
        org.apache.commons.math.complex.Complex complex16 = complex11.divide(complex14);
        java.lang.String str17 = complex16.toString();
        org.apache.commons.math.complex.Complex complex18 = complex16.sqrt1z();
        org.apache.commons.math.complex.Complex complex19 = complex18.tan();
        org.apache.commons.math.complex.Complex complex20 = complex2.add(complex19);
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex22 = complex21.atan();
        org.apache.commons.math.complex.Complex complex23 = complex22.cosh();
        org.apache.commons.math.complex.Complex complex24 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex25 = complex24.atan();
        org.apache.commons.math.complex.Complex complex26 = complex25.cosh();
        org.apache.commons.math.complex.Complex complex27 = complex26.tanh();
        org.apache.commons.math.complex.Complex complex28 = complex26.exp();
        org.apache.commons.math.complex.Complex complex29 = complex22.add(complex26);
        org.apache.commons.math.complex.Complex complex30 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex31 = complex30.atan();
        org.apache.commons.math.complex.Complex complex32 = complex31.cosh();
        org.apache.commons.math.complex.Complex complex33 = complex32.tanh();
        org.apache.commons.math.complex.Complex complex34 = complex33.sinh();
        boolean boolean35 = complex33.isInfinite();
        org.apache.commons.math.complex.Complex complex36 = complex22.subtract(complex33);
        java.lang.String str37 = complex36.toString();
        org.apache.commons.math.complex.Complex complex38 = complex36.sqrt();
        org.apache.commons.math.complex.Complex complex39 = complex20.divide(complex38);
        org.apache.commons.math.complex.Complex complex40 = complex20.conjugate();
        org.apache.commons.math.complex.Complex complex41 = complex20.acos();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex19 and complex40", complex19.equals(complex40) ? complex19.hashCode() == complex40.hashCode() : true);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        double double8 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex9 = complex4.divide(complex7);
        org.apache.commons.math.complex.Complex complex10 = complex4.log();
        org.apache.commons.math.complex.Complex complex11 = complex10.cos();
        org.apache.commons.math.complex.Complex complex12 = complex10.exp();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex14 = complex13.atan();
        org.apache.commons.math.complex.Complex complex15 = complex14.cosh();
        org.apache.commons.math.complex.Complex complex16 = complex15.asin();
        org.apache.commons.math.complex.ComplexField complexField17 = complex15.getField();
        org.apache.commons.math.complex.Complex complex18 = complex15.tanh();
        org.apache.commons.math.complex.Complex complex19 = complex15.log();
        org.apache.commons.math.complex.Complex complex20 = complex19.cosh();
        org.apache.commons.math.complex.Complex complex21 = complex10.multiply(complex19);
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex23 = complex22.atan();
        org.apache.commons.math.complex.Complex complex24 = complex23.cosh();
        org.apache.commons.math.complex.Complex complex25 = complex24.tanh();
        org.apache.commons.math.complex.Complex complex26 = complex24.exp();
        boolean boolean27 = complex24.isNaN();
        org.apache.commons.math.complex.Complex complex28 = complex24.sqrt();
        org.apache.commons.math.complex.Complex complex29 = complex28.exp();
        org.apache.commons.math.complex.Complex complex30 = complex21.add(complex28);
        org.apache.commons.math.complex.Complex complex31 = complex28.cosh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex21", complex0.equals(complex21) ? complex0.hashCode() == complex21.hashCode() : true);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        double double8 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex9 = complex4.divide(complex7);
        org.apache.commons.math.complex.Complex complex10 = complex4.log();
        org.apache.commons.math.complex.Complex complex11 = complex10.cos();
        org.apache.commons.math.complex.Complex complex12 = complex10.exp();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex14 = complex13.atan();
        org.apache.commons.math.complex.Complex complex15 = complex14.cosh();
        org.apache.commons.math.complex.Complex complex16 = complex15.asin();
        org.apache.commons.math.complex.ComplexField complexField17 = complex15.getField();
        org.apache.commons.math.complex.Complex complex18 = complex15.tanh();
        org.apache.commons.math.complex.Complex complex19 = complex15.log();
        org.apache.commons.math.complex.Complex complex20 = complex19.cosh();
        org.apache.commons.math.complex.Complex complex21 = complex10.multiply(complex19);
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex23 = complex22.atan();
        org.apache.commons.math.complex.Complex complex24 = complex23.cosh();
        org.apache.commons.math.complex.Complex complex25 = complex24.tanh();
        org.apache.commons.math.complex.Complex complex26 = complex24.exp();
        boolean boolean27 = complex24.isNaN();
        org.apache.commons.math.complex.Complex complex28 = complex24.sqrt();
        org.apache.commons.math.complex.Complex complex29 = complex28.exp();
        org.apache.commons.math.complex.Complex complex30 = complex21.add(complex28);
        boolean boolean31 = complex28.isNaN();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex21", complex0.equals(complex21) ? complex0.hashCode() == complex21.hashCode() : true);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex4 = complex3.atan();
        org.apache.commons.math.complex.Complex complex5 = complex4.cosh();
        org.apache.commons.math.complex.Complex complex6 = complex5.tanh();
        org.apache.commons.math.complex.Complex complex7 = complex5.exp();
        org.apache.commons.math.complex.Complex complex8 = complex1.add(complex5);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex10 = complex9.atan();
        org.apache.commons.math.complex.Complex complex11 = complex10.cosh();
        org.apache.commons.math.complex.Complex complex12 = complex11.tanh();
        org.apache.commons.math.complex.Complex complex13 = complex12.sinh();
        boolean boolean14 = complex12.isInfinite();
        org.apache.commons.math.complex.Complex complex15 = complex1.subtract(complex12);
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex17 = complex16.atan();
        org.apache.commons.math.complex.Complex complex18 = complex17.cosh();
        org.apache.commons.math.complex.Complex complex19 = complex18.asin();
        org.apache.commons.math.complex.Complex complex20 = complex19.tan();
        org.apache.commons.math.complex.Complex complex21 = complex15.subtract(complex20);
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex23 = complex22.atan();
        org.apache.commons.math.complex.Complex complex24 = complex23.sqrt();
        org.apache.commons.math.complex.Complex complex26 = complex24.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex28 = complex24.multiply(complex27);
        org.apache.commons.math.complex.Complex complex29 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex30 = complex29.atan();
        org.apache.commons.math.complex.Complex complex31 = complex30.cosh();
        org.apache.commons.math.complex.Complex complex32 = complex31.asin();
        org.apache.commons.math.complex.Complex complex33 = complex27.add(complex32);
        org.apache.commons.math.complex.Complex complex34 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex35 = complex34.atan();
        org.apache.commons.math.complex.Complex complex36 = complex33.multiply(complex35);
        org.apache.commons.math.complex.Complex complex37 = complex36.atan();
        org.apache.commons.math.complex.Complex complex38 = complex36.atan();
        org.apache.commons.math.complex.Complex complex39 = complex38.conjugate();
        org.apache.commons.math.complex.Complex complex40 = complex15.divide(complex38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex39", complex0.equals(complex39) ? complex0.hashCode() == complex39.hashCode() : true);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        double double8 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex9 = complex4.divide(complex7);
        java.lang.String str10 = complex9.toString();
        org.apache.commons.math.complex.Complex complex11 = complex9.sqrt1z();
        org.apache.commons.math.complex.Complex complex12 = complex11.tan();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean14 = complex13.isInfinite();
        org.apache.commons.math.complex.Complex complex15 = complex12.multiply(complex13);
        double double16 = complex13.abs();
        org.apache.commons.math.complex.Complex complex17 = complex13.asin();
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex19 = complex18.atan();
        org.apache.commons.math.complex.Complex complex20 = complex19.cosh();
        org.apache.commons.math.complex.Complex complex21 = complex20.tanh();
        org.apache.commons.math.complex.Complex complex22 = complex21.sinh();
        org.apache.commons.math.complex.Complex complex23 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex24 = complex23.atan();
        org.apache.commons.math.complex.Complex complex25 = complex24.cosh();
        double double26 = complex25.getArgument();
        org.apache.commons.math.complex.Complex complex27 = complex22.divide(complex25);
        java.lang.String str28 = complex27.toString();
        org.apache.commons.math.complex.Complex complex29 = complex27.sqrt1z();
        double double30 = complex27.getImaginary();
        org.apache.commons.math.complex.Complex complex31 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex32 = complex31.atan();
        org.apache.commons.math.complex.Complex complex33 = complex32.cosh();
        org.apache.commons.math.complex.Complex complex34 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex35 = complex34.atan();
        org.apache.commons.math.complex.Complex complex36 = complex35.cosh();
        org.apache.commons.math.complex.Complex complex37 = complex36.tanh();
        org.apache.commons.math.complex.Complex complex38 = complex36.exp();
        org.apache.commons.math.complex.Complex complex39 = complex32.add(complex36);
        org.apache.commons.math.complex.Complex complex40 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex41 = complex40.atan();
        org.apache.commons.math.complex.Complex complex42 = complex41.cosh();
        org.apache.commons.math.complex.Complex complex43 = complex42.tanh();
        org.apache.commons.math.complex.Complex complex44 = complex43.sinh();
        boolean boolean45 = complex43.isInfinite();
        org.apache.commons.math.complex.Complex complex46 = complex32.subtract(complex43);
        org.apache.commons.math.complex.Complex complex47 = complex27.add(complex43);
        org.apache.commons.math.complex.Complex complex48 = complex27.sinh();
        org.apache.commons.math.complex.Complex complex49 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex50 = complex49.atan();
        org.apache.commons.math.complex.Complex complex51 = complex50.sqrt();
        org.apache.commons.math.complex.Complex complex53 = complex51.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex54 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex55 = complex51.multiply(complex54);
        org.apache.commons.math.complex.Complex complex56 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex57 = complex56.atan();
        org.apache.commons.math.complex.Complex complex58 = complex57.cosh();
        org.apache.commons.math.complex.Complex complex59 = complex58.asin();
        org.apache.commons.math.complex.Complex complex60 = complex54.add(complex59);
        org.apache.commons.math.complex.Complex complex61 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex62 = complex61.atan();
        org.apache.commons.math.complex.Complex complex63 = complex60.multiply(complex62);
        org.apache.commons.math.complex.Complex complex64 = complex60.tanh();
        org.apache.commons.math.complex.Complex complex65 = complex64.sinh();
        org.apache.commons.math.complex.Complex complex66 = complex27.multiply(complex64);
        org.apache.commons.math.complex.Complex complex67 = complex66.acos();
        boolean boolean68 = complex67.isNaN();
        org.apache.commons.math.complex.Complex complex69 = complex13.subtract(complex67);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex13 and complex17", complex13.equals(complex17) ? complex13.hashCode() == complex17.hashCode() : true);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        double double8 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex9 = complex4.divide(complex7);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.atan();
        org.apache.commons.math.complex.Complex complex12 = complex11.sqrt();
        org.apache.commons.math.complex.Complex complex13 = complex11.tanh();
        org.apache.commons.math.complex.Complex complex14 = complex7.multiply(complex13);
        org.apache.commons.math.complex.Complex complex15 = complex7.tanh();
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex17 = complex16.atan();
        org.apache.commons.math.complex.Complex complex18 = complex17.cosh();
        org.apache.commons.math.complex.Complex complex19 = complex18.tanh();
        org.apache.commons.math.complex.Complex complex20 = complex18.exp();
        org.apache.commons.math.complex.Complex complex21 = complex18.exp();
        org.apache.commons.math.complex.Complex complex22 = complex21.sqrt();
        org.apache.commons.math.complex.Complex complex23 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex24 = complex23.atan();
        org.apache.commons.math.complex.Complex complex25 = complex24.cosh();
        org.apache.commons.math.complex.Complex complex26 = complex25.tanh();
        org.apache.commons.math.complex.Complex complex27 = complex26.sinh();
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex29 = complex28.atan();
        org.apache.commons.math.complex.Complex complex30 = complex29.cosh();
        double double31 = complex30.getArgument();
        org.apache.commons.math.complex.Complex complex32 = complex27.divide(complex30);
        java.lang.String str33 = complex32.toString();
        org.apache.commons.math.complex.Complex complex34 = complex32.sqrt1z();
        org.apache.commons.math.complex.Complex complex35 = complex34.tan();
        org.apache.commons.math.complex.Complex complex36 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean37 = complex36.isInfinite();
        org.apache.commons.math.complex.Complex complex38 = complex35.multiply(complex36);
        org.apache.commons.math.complex.Complex complex39 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex40 = complex39.sqrt1z();
        org.apache.commons.math.complex.Complex complex41 = complex35.add(complex39);
        org.apache.commons.math.complex.Complex complex42 = complex22.add(complex41);
        org.apache.commons.math.complex.Complex complex43 = complex15.multiply(complex41);
        org.apache.commons.math.complex.Complex complex44 = complex15.log();
        org.apache.commons.math.complex.Complex complex45 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex46 = complex45.atan();
        org.apache.commons.math.complex.Complex complex47 = complex46.cosh();
        org.apache.commons.math.complex.Complex complex48 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex49 = complex48.atan();
        org.apache.commons.math.complex.Complex complex50 = complex49.cosh();
        org.apache.commons.math.complex.Complex complex51 = complex50.tanh();
        org.apache.commons.math.complex.Complex complex52 = complex50.exp();
        org.apache.commons.math.complex.Complex complex53 = complex46.add(complex50);
        org.apache.commons.math.complex.Complex complex54 = complex46.sqrt1z();
        org.apache.commons.math.complex.Complex complex55 = complex15.divide(complex46);
        org.apache.commons.math.complex.Complex complex56 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex57 = complex56.sqrt1z();
        org.apache.commons.math.complex.Complex complex60 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex61 = complex60.tanh();
        org.apache.commons.math.complex.Complex complex62 = complex57.subtract(complex60);
        org.apache.commons.math.complex.Complex complex65 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex66 = complex57.pow(complex65);
        org.apache.commons.math.complex.Complex complex67 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex68 = complex67.atan();
        org.apache.commons.math.complex.Complex complex69 = complex68.sqrt();
        org.apache.commons.math.complex.Complex complex70 = complex68.tanh();
        org.apache.commons.math.complex.Complex complex71 = complex66.pow(complex68);
        org.apache.commons.math.complex.Complex complex72 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex73 = complex66.divide(complex72);
        org.apache.commons.math.complex.Complex complex74 = complex55.subtract(complex73);
        org.apache.commons.math.complex.Complex complex75 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex76 = complex75.atan();
        org.apache.commons.math.complex.Complex complex77 = complex76.cosh();
        org.apache.commons.math.complex.Complex complex78 = complex77.tanh();
        org.apache.commons.math.complex.Complex complex79 = complex78.sinh();
        org.apache.commons.math.complex.Complex complex80 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex81 = complex80.atan();
        org.apache.commons.math.complex.Complex complex82 = complex81.cosh();
        double double83 = complex82.getArgument();
        org.apache.commons.math.complex.Complex complex84 = complex79.divide(complex82);
        org.apache.commons.math.complex.Complex complex85 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex86 = complex85.atan();
        org.apache.commons.math.complex.Complex complex87 = complex86.sqrt();
        org.apache.commons.math.complex.Complex complex88 = complex86.tanh();
        org.apache.commons.math.complex.Complex complex89 = complex82.multiply(complex88);
        org.apache.commons.math.complex.Complex complex90 = complex88.exp();
        double double91 = complex88.abs();
        org.apache.commons.math.complex.Complex complex92 = complex88.atan();
        org.apache.commons.math.complex.Complex complex93 = complex88.conjugate();
        boolean boolean94 = complex73.equals((java.lang.Object) complex88);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex93", complex0.equals(complex93) ? complex0.hashCode() == complex93.hashCode() : true);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        double double8 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex9 = complex4.divide(complex7);
        org.apache.commons.math.complex.Complex complex10 = complex4.log();
        org.apache.commons.math.complex.Complex complex11 = complex10.cos();
        org.apache.commons.math.complex.Complex complex12 = complex10.exp();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex14 = complex13.atan();
        org.apache.commons.math.complex.Complex complex15 = complex14.cosh();
        org.apache.commons.math.complex.Complex complex16 = complex15.asin();
        org.apache.commons.math.complex.ComplexField complexField17 = complex15.getField();
        org.apache.commons.math.complex.Complex complex18 = complex15.tanh();
        org.apache.commons.math.complex.Complex complex19 = complex15.log();
        org.apache.commons.math.complex.Complex complex20 = complex19.cosh();
        org.apache.commons.math.complex.Complex complex21 = complex10.multiply(complex19);
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex23 = complex22.atan();
        org.apache.commons.math.complex.Complex complex24 = complex23.cosh();
        org.apache.commons.math.complex.Complex complex25 = complex24.tanh();
        org.apache.commons.math.complex.Complex complex26 = complex24.exp();
        boolean boolean27 = complex24.isNaN();
        org.apache.commons.math.complex.Complex complex28 = complex24.sqrt();
        org.apache.commons.math.complex.Complex complex29 = complex28.exp();
        org.apache.commons.math.complex.Complex complex30 = complex21.add(complex28);
        org.apache.commons.math.complex.Complex complex31 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex32 = complex31.atan();
        org.apache.commons.math.complex.Complex complex33 = complex32.sqrt();
        org.apache.commons.math.complex.Complex complex35 = complex33.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex36 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex37 = complex33.multiply(complex36);
        org.apache.commons.math.complex.Complex complex38 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex39 = complex38.atan();
        org.apache.commons.math.complex.Complex complex40 = complex39.cosh();
        org.apache.commons.math.complex.Complex complex41 = complex40.asin();
        org.apache.commons.math.complex.Complex complex42 = complex36.add(complex41);
        org.apache.commons.math.complex.Complex complex43 = complex42.asin();
        org.apache.commons.math.complex.Complex complex44 = complex28.multiply(complex42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex21", complex0.equals(complex21) ? complex0.hashCode() == complex21.hashCode() : true);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex6 = complex2.multiply(complex5);
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex8 = complex7.atan();
        org.apache.commons.math.complex.Complex complex9 = complex8.cosh();
        org.apache.commons.math.complex.Complex complex10 = complex9.tanh();
        org.apache.commons.math.complex.Complex complex11 = complex10.sinh();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex13 = complex12.atan();
        org.apache.commons.math.complex.Complex complex14 = complex13.cosh();
        double double15 = complex14.getArgument();
        org.apache.commons.math.complex.Complex complex16 = complex11.divide(complex14);
        java.lang.String str17 = complex16.toString();
        org.apache.commons.math.complex.Complex complex18 = complex16.sqrt1z();
        org.apache.commons.math.complex.Complex complex19 = complex18.tan();
        org.apache.commons.math.complex.Complex complex20 = complex2.add(complex19);
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex22 = complex21.atan();
        org.apache.commons.math.complex.Complex complex23 = complex22.sqrt();
        org.apache.commons.math.complex.Complex complex25 = complex23.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex27 = complex23.multiply(complex26);
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex29 = complex28.atan();
        org.apache.commons.math.complex.Complex complex30 = complex29.cosh();
        org.apache.commons.math.complex.Complex complex31 = complex30.asin();
        org.apache.commons.math.complex.Complex complex32 = complex26.add(complex31);
        org.apache.commons.math.complex.Complex complex33 = complex32.conjugate();
        org.apache.commons.math.complex.Complex complex34 = complex2.divide(complex32);
        org.apache.commons.math.complex.Complex complex35 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex36 = complex35.atan();
        org.apache.commons.math.complex.Complex complex37 = complex36.sqrt();
        org.apache.commons.math.complex.Complex complex39 = complex37.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex40 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex41 = complex37.multiply(complex40);
        org.apache.commons.math.complex.Complex complex42 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex43 = complex42.atan();
        org.apache.commons.math.complex.Complex complex44 = complex43.cosh();
        org.apache.commons.math.complex.Complex complex45 = complex44.asin();
        org.apache.commons.math.complex.Complex complex46 = complex40.add(complex45);
        org.apache.commons.math.complex.Complex complex47 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex48 = complex47.atan();
        org.apache.commons.math.complex.Complex complex49 = complex46.multiply(complex48);
        org.apache.commons.math.complex.Complex complex50 = complex49.atan();
        org.apache.commons.math.complex.Complex complex51 = complex32.pow(complex49);
        org.apache.commons.math.complex.Complex complex52 = complex51.acos();
        org.apache.commons.math.complex.Complex complex53 = complex52.exp();
        org.apache.commons.math.complex.Complex complex54 = complex53.tan();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex52", complex0.equals(complex52) ? complex0.hashCode() == complex52.hashCode() : true);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        double double8 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex9 = complex4.divide(complex7);
        org.apache.commons.math.complex.Complex complex10 = complex4.log();
        org.apache.commons.math.complex.Complex complex11 = complex4.conjugate();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex14 = complex13.atan();
        org.apache.commons.math.complex.Complex complex15 = complex14.cosh();
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex17 = complex16.atan();
        org.apache.commons.math.complex.Complex complex18 = complex17.cosh();
        org.apache.commons.math.complex.Complex complex19 = complex18.tanh();
        org.apache.commons.math.complex.Complex complex20 = complex18.exp();
        org.apache.commons.math.complex.Complex complex21 = complex14.add(complex18);
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex23 = complex22.atan();
        org.apache.commons.math.complex.Complex complex24 = complex23.cosh();
        org.apache.commons.math.complex.Complex complex25 = complex24.tanh();
        org.apache.commons.math.complex.Complex complex26 = complex25.sinh();
        boolean boolean27 = complex25.isInfinite();
        org.apache.commons.math.complex.Complex complex28 = complex14.subtract(complex25);
        org.apache.commons.math.complex.Complex complex29 = complex12.add(complex14);
        org.apache.commons.math.complex.Complex complex30 = complex12.cos();
        org.apache.commons.math.complex.Complex complex31 = complex30.tan();
        org.apache.commons.math.complex.Complex complex32 = complex4.divide(complex30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex9 and complex11", complex9.equals(complex11) ? complex9.hashCode() == complex11.hashCode() : true);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        double double8 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex9 = complex4.divide(complex7);
        org.apache.commons.math.complex.Complex complex10 = complex4.log();
        org.apache.commons.math.complex.Complex complex11 = complex10.cos();
        org.apache.commons.math.complex.Complex complex12 = complex10.exp();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex14 = complex13.atan();
        org.apache.commons.math.complex.Complex complex15 = complex14.cosh();
        org.apache.commons.math.complex.Complex complex16 = complex15.asin();
        org.apache.commons.math.complex.ComplexField complexField17 = complex15.getField();
        org.apache.commons.math.complex.Complex complex18 = complex15.tanh();
        org.apache.commons.math.complex.Complex complex19 = complex15.log();
        org.apache.commons.math.complex.Complex complex20 = complex19.cosh();
        org.apache.commons.math.complex.Complex complex21 = complex10.multiply(complex19);
        org.apache.commons.math.complex.Complex complex22 = complex10.atan();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex21", complex0.equals(complex21) ? complex0.hashCode() == complex21.hashCode() : true);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex6 = complex2.multiply(complex5);
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex8 = complex7.atan();
        org.apache.commons.math.complex.Complex complex9 = complex8.cosh();
        org.apache.commons.math.complex.Complex complex10 = complex9.tanh();
        org.apache.commons.math.complex.Complex complex11 = complex10.sinh();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex13 = complex12.atan();
        org.apache.commons.math.complex.Complex complex14 = complex13.cosh();
        double double15 = complex14.getArgument();
        org.apache.commons.math.complex.Complex complex16 = complex11.divide(complex14);
        java.lang.String str17 = complex16.toString();
        org.apache.commons.math.complex.Complex complex18 = complex16.sqrt1z();
        org.apache.commons.math.complex.Complex complex19 = complex18.tan();
        org.apache.commons.math.complex.Complex complex20 = complex2.add(complex19);
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex22 = complex21.atan();
        org.apache.commons.math.complex.Complex complex23 = complex22.sqrt();
        org.apache.commons.math.complex.Complex complex25 = complex23.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex27 = complex23.multiply(complex26);
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex29 = complex28.atan();
        org.apache.commons.math.complex.Complex complex30 = complex29.cosh();
        org.apache.commons.math.complex.Complex complex31 = complex30.asin();
        org.apache.commons.math.complex.Complex complex32 = complex26.add(complex31);
        org.apache.commons.math.complex.Complex complex33 = complex32.conjugate();
        org.apache.commons.math.complex.Complex complex34 = complex2.divide(complex32);
        org.apache.commons.math.complex.Complex complex35 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex36 = complex35.atan();
        org.apache.commons.math.complex.Complex complex37 = complex36.sqrt();
        org.apache.commons.math.complex.Complex complex39 = complex37.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex40 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex41 = complex37.multiply(complex40);
        org.apache.commons.math.complex.Complex complex42 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex43 = complex42.atan();
        org.apache.commons.math.complex.Complex complex44 = complex43.cosh();
        org.apache.commons.math.complex.Complex complex45 = complex44.asin();
        org.apache.commons.math.complex.Complex complex46 = complex40.add(complex45);
        org.apache.commons.math.complex.Complex complex47 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex48 = complex47.atan();
        org.apache.commons.math.complex.Complex complex49 = complex46.multiply(complex48);
        org.apache.commons.math.complex.Complex complex50 = complex49.atan();
        org.apache.commons.math.complex.Complex complex51 = complex32.pow(complex49);
        org.apache.commons.math.complex.Complex complex52 = complex51.acos();
        org.apache.commons.math.complex.Complex complex53 = complex52.exp();
        org.apache.commons.math.complex.Complex complex54 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex55 = complex54.atan();
        org.apache.commons.math.complex.Complex complex56 = complex55.cosh();
        org.apache.commons.math.complex.Complex complex57 = complex56.tanh();
        org.apache.commons.math.complex.Complex complex58 = complex56.exp();
        org.apache.commons.math.complex.Complex complex59 = complex56.exp();
        org.apache.commons.math.complex.Complex complex60 = complex52.subtract(complex56);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex9 and complex53", complex9.equals(complex53) ? complex9.hashCode() == complex53.hashCode() : true);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex5 = complex2.tan();
        org.apache.commons.math.complex.Complex complex6 = complex2.acos();
        org.apache.commons.math.complex.Complex complex7 = complex2.asin();
        org.apache.commons.math.complex.Complex complex8 = complex2.cosh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex7", complex0.equals(complex7) ? complex0.hashCode() == complex7.hashCode() : true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        double double8 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex9 = complex4.divide(complex7);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.atan();
        org.apache.commons.math.complex.Complex complex12 = complex11.sqrt();
        org.apache.commons.math.complex.Complex complex13 = complex11.tanh();
        org.apache.commons.math.complex.Complex complex14 = complex7.multiply(complex13);
        org.apache.commons.math.complex.Complex complex15 = complex13.exp();
        double double16 = complex13.abs();
        org.apache.commons.math.complex.Complex complex17 = complex13.atan();
        org.apache.commons.math.complex.Complex complex18 = complex13.conjugate();
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex20 = complex19.atan();
        org.apache.commons.math.complex.Complex complex21 = complex20.sqrt();
        org.apache.commons.math.complex.Complex complex23 = complex21.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex24 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex25 = complex21.multiply(complex24);
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex27 = complex26.atan();
        org.apache.commons.math.complex.Complex complex28 = complex27.cosh();
        org.apache.commons.math.complex.Complex complex29 = complex28.asin();
        org.apache.commons.math.complex.Complex complex30 = complex24.add(complex29);
        org.apache.commons.math.complex.Complex complex31 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex32 = complex31.atan();
        org.apache.commons.math.complex.Complex complex33 = complex30.multiply(complex32);
        org.apache.commons.math.complex.Complex complex34 = complex30.tanh();
        java.lang.String str35 = complex30.toString();
        org.apache.commons.math.complex.Complex complex36 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex37 = complex36.atan();
        org.apache.commons.math.complex.Complex complex38 = complex37.sqrt();
        org.apache.commons.math.complex.Complex complex40 = complex38.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex41 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex42 = complex38.multiply(complex41);
        org.apache.commons.math.complex.Complex complex43 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex44 = complex43.atan();
        org.apache.commons.math.complex.Complex complex45 = complex44.cosh();
        org.apache.commons.math.complex.Complex complex46 = complex45.tanh();
        org.apache.commons.math.complex.Complex complex47 = complex46.sinh();
        org.apache.commons.math.complex.Complex complex48 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex49 = complex48.atan();
        org.apache.commons.math.complex.Complex complex50 = complex49.cosh();
        double double51 = complex50.getArgument();
        org.apache.commons.math.complex.Complex complex52 = complex47.divide(complex50);
        java.lang.String str53 = complex52.toString();
        org.apache.commons.math.complex.Complex complex54 = complex52.sqrt1z();
        org.apache.commons.math.complex.Complex complex55 = complex54.tan();
        org.apache.commons.math.complex.Complex complex56 = complex38.add(complex55);
        org.apache.commons.math.complex.Complex complex57 = complex38.sqrt1z();
        org.apache.commons.math.complex.Complex complex58 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex59 = complex58.atan();
        org.apache.commons.math.complex.Complex complex60 = complex59.cosh();
        org.apache.commons.math.complex.Complex complex61 = complex60.tanh();
        org.apache.commons.math.complex.Complex complex62 = complex60.cosh();
        boolean boolean63 = complex60.isNaN();
        org.apache.commons.math.complex.Complex complex64 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex65 = complex64.sqrt1z();
        org.apache.commons.math.complex.Complex complex68 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex69 = complex68.tanh();
        org.apache.commons.math.complex.Complex complex70 = complex65.subtract(complex68);
        org.apache.commons.math.complex.Complex complex73 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex74 = complex65.pow(complex73);
        org.apache.commons.math.complex.Complex complex75 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex76 = complex75.atan();
        org.apache.commons.math.complex.Complex complex77 = complex76.sqrt();
        org.apache.commons.math.complex.Complex complex78 = complex76.tanh();
        org.apache.commons.math.complex.Complex complex79 = complex74.pow(complex76);
        org.apache.commons.math.complex.Complex complex80 = complex60.add(complex74);
        org.apache.commons.math.complex.Complex complex83 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex84 = complex60.multiply(complex83);
        org.apache.commons.math.complex.Complex complex85 = complex38.divide(complex60);
        org.apache.commons.math.complex.Complex complex86 = complex30.add(complex85);
        org.apache.commons.math.complex.Complex complex87 = complex18.divide(complex30);
        double double88 = complex87.getArgument();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex18", complex0.equals(complex18) ? complex0.hashCode() == complex18.hashCode() : true);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        double double8 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex9 = complex4.divide(complex7);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.atan();
        org.apache.commons.math.complex.Complex complex12 = complex11.sqrt();
        org.apache.commons.math.complex.Complex complex13 = complex11.tanh();
        org.apache.commons.math.complex.Complex complex14 = complex7.multiply(complex13);
        org.apache.commons.math.complex.Complex complex15 = complex13.exp();
        double double16 = complex13.abs();
        org.apache.commons.math.complex.Complex complex17 = complex13.atan();
        org.apache.commons.math.complex.Complex complex18 = complex13.conjugate();
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex20 = complex19.atan();
        org.apache.commons.math.complex.Complex complex21 = complex20.sqrt();
        org.apache.commons.math.complex.Complex complex23 = complex21.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex24 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex25 = complex21.multiply(complex24);
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex27 = complex26.atan();
        org.apache.commons.math.complex.Complex complex28 = complex27.cosh();
        org.apache.commons.math.complex.Complex complex29 = complex28.asin();
        org.apache.commons.math.complex.Complex complex30 = complex24.add(complex29);
        org.apache.commons.math.complex.Complex complex31 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex32 = complex31.atan();
        org.apache.commons.math.complex.Complex complex33 = complex30.multiply(complex32);
        org.apache.commons.math.complex.Complex complex34 = complex30.tanh();
        java.lang.String str35 = complex30.toString();
        org.apache.commons.math.complex.Complex complex36 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex37 = complex36.atan();
        org.apache.commons.math.complex.Complex complex38 = complex37.sqrt();
        org.apache.commons.math.complex.Complex complex40 = complex38.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex41 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex42 = complex38.multiply(complex41);
        org.apache.commons.math.complex.Complex complex43 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex44 = complex43.atan();
        org.apache.commons.math.complex.Complex complex45 = complex44.cosh();
        org.apache.commons.math.complex.Complex complex46 = complex45.tanh();
        org.apache.commons.math.complex.Complex complex47 = complex46.sinh();
        org.apache.commons.math.complex.Complex complex48 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex49 = complex48.atan();
        org.apache.commons.math.complex.Complex complex50 = complex49.cosh();
        double double51 = complex50.getArgument();
        org.apache.commons.math.complex.Complex complex52 = complex47.divide(complex50);
        java.lang.String str53 = complex52.toString();
        org.apache.commons.math.complex.Complex complex54 = complex52.sqrt1z();
        org.apache.commons.math.complex.Complex complex55 = complex54.tan();
        org.apache.commons.math.complex.Complex complex56 = complex38.add(complex55);
        org.apache.commons.math.complex.Complex complex57 = complex38.sqrt1z();
        org.apache.commons.math.complex.Complex complex58 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex59 = complex58.atan();
        org.apache.commons.math.complex.Complex complex60 = complex59.cosh();
        org.apache.commons.math.complex.Complex complex61 = complex60.tanh();
        org.apache.commons.math.complex.Complex complex62 = complex60.cosh();
        boolean boolean63 = complex60.isNaN();
        org.apache.commons.math.complex.Complex complex64 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex65 = complex64.sqrt1z();
        org.apache.commons.math.complex.Complex complex68 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex69 = complex68.tanh();
        org.apache.commons.math.complex.Complex complex70 = complex65.subtract(complex68);
        org.apache.commons.math.complex.Complex complex73 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex74 = complex65.pow(complex73);
        org.apache.commons.math.complex.Complex complex75 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex76 = complex75.atan();
        org.apache.commons.math.complex.Complex complex77 = complex76.sqrt();
        org.apache.commons.math.complex.Complex complex78 = complex76.tanh();
        org.apache.commons.math.complex.Complex complex79 = complex74.pow(complex76);
        org.apache.commons.math.complex.Complex complex80 = complex60.add(complex74);
        org.apache.commons.math.complex.Complex complex83 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex84 = complex60.multiply(complex83);
        org.apache.commons.math.complex.Complex complex85 = complex38.divide(complex60);
        org.apache.commons.math.complex.Complex complex86 = complex30.add(complex85);
        org.apache.commons.math.complex.Complex complex87 = complex18.divide(complex30);
        org.apache.commons.math.complex.Complex complex88 = complex18.asin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex87", complex0.equals(complex87) ? complex0.hashCode() == complex87.hashCode() : true);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        double double8 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex9 = complex4.divide(complex7);
        org.apache.commons.math.complex.Complex complex10 = complex4.log();
        org.apache.commons.math.complex.Complex complex11 = complex10.cos();
        org.apache.commons.math.complex.Complex complex12 = complex10.exp();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex14 = complex13.atan();
        org.apache.commons.math.complex.Complex complex15 = complex14.cosh();
        org.apache.commons.math.complex.Complex complex16 = complex15.asin();
        org.apache.commons.math.complex.ComplexField complexField17 = complex15.getField();
        org.apache.commons.math.complex.Complex complex18 = complex15.tanh();
        org.apache.commons.math.complex.Complex complex19 = complex15.log();
        org.apache.commons.math.complex.Complex complex20 = complex19.cosh();
        org.apache.commons.math.complex.Complex complex21 = complex10.multiply(complex19);
        org.apache.commons.math.complex.ComplexField complexField22 = complex10.getField();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex21", complex0.equals(complex21) ? complex0.hashCode() == complex21.hashCode() : true);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        java.lang.String str4 = complex3.toString();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.atan();
        org.apache.commons.math.complex.Complex complex10 = complex9.cosh();
        org.apache.commons.math.complex.Complex complex11 = complex10.tanh();
        org.apache.commons.math.complex.Complex complex12 = complex10.exp();
        org.apache.commons.math.complex.Complex complex13 = complex6.add(complex10);
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex15 = complex14.atan();
        org.apache.commons.math.complex.Complex complex16 = complex15.cosh();
        org.apache.commons.math.complex.Complex complex17 = complex16.tanh();
        org.apache.commons.math.complex.Complex complex18 = complex17.sinh();
        boolean boolean19 = complex17.isInfinite();
        org.apache.commons.math.complex.Complex complex20 = complex6.subtract(complex17);
        org.apache.commons.math.complex.Complex complex21 = complex3.divide(complex20);
        org.apache.commons.math.complex.Complex complex22 = complex20.conjugate();
        org.apache.commons.math.complex.Complex complex23 = complex22.acos();
        org.apache.commons.math.complex.Complex complex24 = complex23.sinh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex20 and complex22", complex20.equals(complex22) ? complex20.hashCode() == complex22.hashCode() : true);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.asin();
        org.apache.commons.math.complex.Complex complex4 = complex3.tan();
        org.apache.commons.math.complex.Complex complex5 = complex3.sqrt();
        boolean boolean7 = complex3.equals((java.lang.Object) (-1.0f));
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.atan();
        org.apache.commons.math.complex.Complex complex10 = complex9.cosh();
        org.apache.commons.math.complex.Complex complex11 = complex10.tanh();
        org.apache.commons.math.complex.Complex complex12 = complex11.sinh();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex14 = complex13.atan();
        org.apache.commons.math.complex.Complex complex15 = complex14.cosh();
        double double16 = complex15.getArgument();
        org.apache.commons.math.complex.Complex complex17 = complex12.divide(complex15);
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex19 = complex18.atan();
        org.apache.commons.math.complex.Complex complex20 = complex19.sqrt();
        org.apache.commons.math.complex.Complex complex21 = complex19.tanh();
        org.apache.commons.math.complex.Complex complex22 = complex15.multiply(complex21);
        org.apache.commons.math.complex.Complex complex23 = complex15.tanh();
        org.apache.commons.math.complex.Complex complex24 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex25 = complex24.atan();
        org.apache.commons.math.complex.Complex complex26 = complex25.sqrt();
        org.apache.commons.math.complex.Complex complex28 = complex26.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex29 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex30 = complex26.multiply(complex29);
        org.apache.commons.math.complex.Complex complex31 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex32 = complex31.atan();
        org.apache.commons.math.complex.Complex complex33 = complex32.cosh();
        org.apache.commons.math.complex.Complex complex34 = complex33.asin();
        org.apache.commons.math.complex.Complex complex35 = complex29.add(complex34);
        org.apache.commons.math.complex.Complex complex36 = complex35.conjugate();
        org.apache.commons.math.complex.Complex complex37 = complex36.conjugate();
        org.apache.commons.math.complex.Complex complex38 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex39 = complex38.atan();
        org.apache.commons.math.complex.Complex complex40 = complex39.cosh();
        org.apache.commons.math.complex.Complex complex41 = complex40.tanh();
        org.apache.commons.math.complex.Complex complex42 = complex41.sinh();
        org.apache.commons.math.complex.Complex complex43 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex44 = complex43.atan();
        org.apache.commons.math.complex.Complex complex45 = complex44.cosh();
        double double46 = complex45.getArgument();
        org.apache.commons.math.complex.Complex complex47 = complex42.divide(complex45);
        org.apache.commons.math.complex.Complex complex48 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex49 = complex48.atan();
        org.apache.commons.math.complex.Complex complex50 = complex49.sqrt();
        org.apache.commons.math.complex.Complex complex51 = complex49.tanh();
        org.apache.commons.math.complex.Complex complex52 = complex45.multiply(complex51);
        org.apache.commons.math.complex.Complex complex53 = complex51.exp();
        double double54 = complex51.abs();
        org.apache.commons.math.complex.Complex complex55 = complex51.atan();
        org.apache.commons.math.complex.Complex complex56 = complex55.exp();
        org.apache.commons.math.complex.Complex complex57 = complex36.add(complex55);
        org.apache.commons.math.complex.Complex complex58 = complex15.add(complex57);
        double double59 = complex15.getReal();
        org.apache.commons.math.complex.Complex complex60 = complex3.multiply(complex15);
        double double61 = complex15.abs();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex60", complex3.equals(complex60) ? complex3.hashCode() == complex60.hashCode() : true);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math.complex.Complex complex3 = complex1.cos();
        org.apache.commons.math.complex.Complex complex4 = complex3.acos();
        double double5 = complex3.getImaginary();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex4", complex0.equals(complex4) ? complex0.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.asin();
        boolean boolean4 = complex2.isInfinite();
        org.apache.commons.math.complex.Complex complex6 = complex2.multiply((double) 0);
        org.apache.commons.math.complex.Complex complex7 = complex2.acos();
        double double8 = complex2.getImaginary();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex7", complex0.equals(complex7) ? complex0.hashCode() == complex7.hashCode() : true);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex4 = complex3.atan();
        org.apache.commons.math.complex.Complex complex5 = complex4.cosh();
        org.apache.commons.math.complex.Complex complex6 = complex5.tanh();
        org.apache.commons.math.complex.Complex complex7 = complex5.exp();
        org.apache.commons.math.complex.Complex complex8 = complex1.add(complex5);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex10 = complex9.atan();
        org.apache.commons.math.complex.Complex complex11 = complex10.cosh();
        org.apache.commons.math.complex.Complex complex12 = complex11.tanh();
        org.apache.commons.math.complex.Complex complex13 = complex12.sinh();
        boolean boolean14 = complex12.isInfinite();
        org.apache.commons.math.complex.Complex complex15 = complex1.subtract(complex12);
        org.apache.commons.math.complex.Complex complex16 = complex15.negate();
        org.apache.commons.math.complex.Complex complex17 = complex16.exp();
        org.apache.commons.math.complex.Complex complex19 = complex17.multiply((double) (byte) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex6 and complex16", complex6.equals(complex16) ? complex6.hashCode() == complex16.hashCode() : true);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        java.lang.String str4 = complex3.toString();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.atan();
        org.apache.commons.math.complex.Complex complex10 = complex9.cosh();
        org.apache.commons.math.complex.Complex complex11 = complex10.tanh();
        org.apache.commons.math.complex.Complex complex12 = complex10.exp();
        org.apache.commons.math.complex.Complex complex13 = complex6.add(complex10);
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex15 = complex14.atan();
        org.apache.commons.math.complex.Complex complex16 = complex15.cosh();
        org.apache.commons.math.complex.Complex complex17 = complex16.tanh();
        org.apache.commons.math.complex.Complex complex18 = complex17.sinh();
        boolean boolean19 = complex17.isInfinite();
        org.apache.commons.math.complex.Complex complex20 = complex6.subtract(complex17);
        org.apache.commons.math.complex.Complex complex21 = complex3.divide(complex20);
        org.apache.commons.math.complex.Complex complex22 = complex20.conjugate();
        org.apache.commons.math.complex.Complex complex23 = complex22.acos();
        org.apache.commons.math.complex.Complex complex25 = complex23.multiply((double) (byte) -1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex20 and complex22", complex20.equals(complex22) ? complex20.hashCode() == complex22.hashCode() : true);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex5 = complex2.tan();
        java.lang.String str6 = complex5.toString();
        org.apache.commons.math.complex.Complex complex7 = complex5.cos();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.atan();
        org.apache.commons.math.complex.Complex complex10 = complex9.cosh();
        org.apache.commons.math.complex.Complex complex11 = complex10.tanh();
        org.apache.commons.math.complex.Complex complex12 = complex10.cosh();
        boolean boolean13 = complex10.isNaN();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex15 = complex14.sqrt1z();
        org.apache.commons.math.complex.Complex complex18 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex19 = complex18.tanh();
        org.apache.commons.math.complex.Complex complex20 = complex15.subtract(complex18);
        org.apache.commons.math.complex.Complex complex23 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex24 = complex15.pow(complex23);
        org.apache.commons.math.complex.Complex complex25 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex26 = complex25.atan();
        org.apache.commons.math.complex.Complex complex27 = complex26.sqrt();
        org.apache.commons.math.complex.Complex complex28 = complex26.tanh();
        org.apache.commons.math.complex.Complex complex29 = complex24.pow(complex26);
        org.apache.commons.math.complex.Complex complex30 = complex10.add(complex24);
        org.apache.commons.math.complex.Complex complex31 = complex7.add(complex10);
        org.apache.commons.math.complex.Complex complex33 = complex31.multiply(1.1102230246251565E-16d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex7 and complex10", complex7.equals(complex10) ? complex7.hashCode() == complex10.hashCode() : true);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex2.cosh();
        boolean boolean5 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex7 = complex6.sqrt1z();
        org.apache.commons.math.complex.Complex complex10 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex11 = complex10.tanh();
        org.apache.commons.math.complex.Complex complex12 = complex7.subtract(complex10);
        org.apache.commons.math.complex.Complex complex15 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex16 = complex7.pow(complex15);
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex18 = complex17.atan();
        org.apache.commons.math.complex.Complex complex19 = complex18.sqrt();
        org.apache.commons.math.complex.Complex complex20 = complex18.tanh();
        org.apache.commons.math.complex.Complex complex21 = complex16.pow(complex18);
        org.apache.commons.math.complex.Complex complex22 = complex2.add(complex16);
        org.apache.commons.math.complex.Complex complex23 = complex22.conjugate();
        org.apache.commons.math.complex.Complex complex24 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex25 = complex24.atan();
        org.apache.commons.math.complex.Complex complex26 = complex25.cosh();
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex28 = complex27.atan();
        org.apache.commons.math.complex.Complex complex29 = complex28.cosh();
        org.apache.commons.math.complex.Complex complex30 = complex29.tanh();
        org.apache.commons.math.complex.Complex complex31 = complex29.exp();
        org.apache.commons.math.complex.Complex complex32 = complex25.add(complex29);
        org.apache.commons.math.complex.Complex complex33 = complex22.multiply(complex29);
        org.apache.commons.math.complex.Complex complex34 = complex22.log();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex23 and complex33", complex23.equals(complex33) ? complex23.hashCode() == complex33.hashCode() : true);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex6 = complex2.multiply(complex5);
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex8 = complex7.atan();
        org.apache.commons.math.complex.Complex complex9 = complex8.cosh();
        org.apache.commons.math.complex.Complex complex10 = complex9.asin();
        org.apache.commons.math.complex.Complex complex11 = complex5.add(complex10);
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex13 = complex12.atan();
        org.apache.commons.math.complex.Complex complex14 = complex11.multiply(complex13);
        org.apache.commons.math.complex.Complex complex15 = complex11.tanh();
        org.apache.commons.math.complex.Complex complex16 = complex15.sinh();
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex18 = complex17.atan();
        org.apache.commons.math.complex.Complex complex19 = complex18.sqrt();
        org.apache.commons.math.complex.Complex complex20 = complex18.cos();
        org.apache.commons.math.complex.Complex complex21 = complex16.divide(complex18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex9 and complex20", complex9.equals(complex20) ? complex9.hashCode() == complex20.hashCode() : true);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex5 = complex2.tan();
        java.lang.String str6 = complex5.toString();
        org.apache.commons.math.complex.Complex complex7 = complex5.cos();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.atan();
        org.apache.commons.math.complex.Complex complex10 = complex9.cosh();
        org.apache.commons.math.complex.Complex complex11 = complex10.tanh();
        org.apache.commons.math.complex.Complex complex12 = complex10.cosh();
        boolean boolean13 = complex10.isNaN();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex15 = complex14.sqrt1z();
        org.apache.commons.math.complex.Complex complex18 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex19 = complex18.tanh();
        org.apache.commons.math.complex.Complex complex20 = complex15.subtract(complex18);
        org.apache.commons.math.complex.Complex complex23 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex24 = complex15.pow(complex23);
        org.apache.commons.math.complex.Complex complex25 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex26 = complex25.atan();
        org.apache.commons.math.complex.Complex complex27 = complex26.sqrt();
        org.apache.commons.math.complex.Complex complex28 = complex26.tanh();
        org.apache.commons.math.complex.Complex complex29 = complex24.pow(complex26);
        org.apache.commons.math.complex.Complex complex30 = complex10.add(complex24);
        org.apache.commons.math.complex.Complex complex31 = complex7.add(complex10);
        java.util.List<org.apache.commons.math.complex.Complex> complexList33 = complex31.nthRoot((int) (short) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex7 and complex10", complex7.equals(complex10) ? complex7.hashCode() == complex10.hashCode() : true);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex6 = complex2.multiply(complex5);
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex8 = complex7.atan();
        org.apache.commons.math.complex.Complex complex9 = complex8.cosh();
        org.apache.commons.math.complex.Complex complex10 = complex9.asin();
        org.apache.commons.math.complex.Complex complex11 = complex5.add(complex10);
        org.apache.commons.math.complex.Complex complex12 = complex11.conjugate();
        org.apache.commons.math.complex.Complex complex13 = complex12.conjugate();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex15 = complex14.atan();
        org.apache.commons.math.complex.Complex complex16 = complex15.cosh();
        org.apache.commons.math.complex.Complex complex17 = complex16.tanh();
        org.apache.commons.math.complex.Complex complex18 = complex17.sinh();
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex20 = complex19.atan();
        org.apache.commons.math.complex.Complex complex21 = complex20.cosh();
        double double22 = complex21.getArgument();
        org.apache.commons.math.complex.Complex complex23 = complex18.divide(complex21);
        org.apache.commons.math.complex.Complex complex24 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex25 = complex24.atan();
        org.apache.commons.math.complex.Complex complex26 = complex25.sqrt();
        org.apache.commons.math.complex.Complex complex27 = complex25.tanh();
        org.apache.commons.math.complex.Complex complex28 = complex21.multiply(complex27);
        org.apache.commons.math.complex.Complex complex29 = complex27.exp();
        double double30 = complex27.abs();
        org.apache.commons.math.complex.Complex complex31 = complex27.atan();
        org.apache.commons.math.complex.Complex complex32 = complex31.exp();
        org.apache.commons.math.complex.Complex complex33 = complex12.add(complex31);
        org.apache.commons.math.complex.Complex complex34 = complex31.cos();
        org.apache.commons.math.complex.Complex complex35 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex36 = complex35.sqrt1z();
        org.apache.commons.math.complex.Complex complex39 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex40 = complex39.tanh();
        org.apache.commons.math.complex.Complex complex41 = complex36.subtract(complex39);
        org.apache.commons.math.complex.Complex complex44 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex45 = complex36.pow(complex44);
        org.apache.commons.math.complex.Complex complex46 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex47 = complex46.atan();
        org.apache.commons.math.complex.Complex complex48 = complex47.sqrt();
        org.apache.commons.math.complex.Complex complex49 = complex47.tanh();
        org.apache.commons.math.complex.Complex complex50 = complex45.pow(complex47);
        org.apache.commons.math.complex.Complex complex51 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex52 = complex45.divide(complex51);
        org.apache.commons.math.complex.Complex complex53 = complex34.subtract(complex52);
        org.apache.commons.math.complex.Complex complex54 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex55 = complex54.atan();
        org.apache.commons.math.complex.Complex complex56 = complex55.cosh();
        org.apache.commons.math.complex.Complex complex57 = complex56.tanh();
        org.apache.commons.math.complex.Complex complex58 = complex57.sinh();
        org.apache.commons.math.complex.Complex complex59 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex60 = complex59.atan();
        org.apache.commons.math.complex.Complex complex61 = complex60.cosh();
        double double62 = complex61.getArgument();
        org.apache.commons.math.complex.Complex complex63 = complex58.divide(complex61);
        org.apache.commons.math.complex.Complex complex64 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex65 = complex64.atan();
        org.apache.commons.math.complex.Complex complex66 = complex65.sqrt();
        org.apache.commons.math.complex.Complex complex67 = complex65.tanh();
        org.apache.commons.math.complex.Complex complex68 = complex61.multiply(complex67);
        org.apache.commons.math.complex.Complex complex69 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex70 = complex69.atan();
        org.apache.commons.math.complex.Complex complex71 = complex70.cosh();
        org.apache.commons.math.complex.Complex complex72 = complex71.tanh();
        org.apache.commons.math.complex.Complex complex73 = complex72.sinh();
        org.apache.commons.math.complex.Complex complex74 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex75 = complex74.atan();
        org.apache.commons.math.complex.Complex complex76 = complex75.cosh();
        double double77 = complex76.getArgument();
        org.apache.commons.math.complex.Complex complex78 = complex73.divide(complex76);
        org.apache.commons.math.complex.Complex complex79 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex80 = complex79.atan();
        org.apache.commons.math.complex.Complex complex81 = complex80.sqrt();
        org.apache.commons.math.complex.Complex complex82 = complex80.tanh();
        org.apache.commons.math.complex.Complex complex83 = complex76.multiply(complex82);
        org.apache.commons.math.complex.Complex complex84 = complex61.divide(complex83);
        boolean boolean85 = complex84.isNaN();
        org.apache.commons.math.complex.Complex complex86 = complex84.sin();
        boolean boolean87 = complex84.isInfinite();
        org.apache.commons.math.complex.Complex complex88 = complex52.pow(complex84);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex9 and complex34", complex9.equals(complex34) ? complex9.hashCode() == complex34.hashCode() : true);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex6 = complex2.multiply(complex5);
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex8 = complex7.atan();
        org.apache.commons.math.complex.Complex complex9 = complex8.cosh();
        org.apache.commons.math.complex.Complex complex10 = complex9.asin();
        org.apache.commons.math.complex.Complex complex11 = complex5.add(complex10);
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex13 = complex12.atan();
        org.apache.commons.math.complex.Complex complex14 = complex11.multiply(complex13);
        org.apache.commons.math.complex.Complex complex15 = complex11.tanh();
        boolean boolean16 = complex15.isInfinite();
        org.apache.commons.math.complex.Complex complex17 = complex15.sqrt1z();
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex19 = complex18.atan();
        org.apache.commons.math.complex.Complex complex20 = complex19.sqrt();
        org.apache.commons.math.complex.Complex complex22 = complex20.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex23 = complex20.tan();
        java.lang.String str24 = complex23.toString();
        org.apache.commons.math.complex.Complex complex25 = complex23.cos();
        org.apache.commons.math.complex.Complex complex26 = complex23.sin();
        org.apache.commons.math.complex.Complex complex27 = complex26.sqrt();
        org.apache.commons.math.complex.Complex complex28 = complex15.divide(complex26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex9 and complex25", complex9.equals(complex25) ? complex9.hashCode() == complex25.hashCode() : true);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        double double8 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex9 = complex4.divide(complex7);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.atan();
        org.apache.commons.math.complex.Complex complex12 = complex11.cosh();
        org.apache.commons.math.complex.Complex complex13 = complex12.tanh();
        org.apache.commons.math.complex.Complex complex14 = complex13.sinh();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex16 = complex15.atan();
        org.apache.commons.math.complex.Complex complex17 = complex16.cosh();
        double double18 = complex17.getArgument();
        org.apache.commons.math.complex.Complex complex19 = complex14.divide(complex17);
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex21 = complex20.atan();
        org.apache.commons.math.complex.Complex complex22 = complex21.sqrt();
        org.apache.commons.math.complex.Complex complex23 = complex21.tanh();
        org.apache.commons.math.complex.Complex complex24 = complex17.multiply(complex23);
        org.apache.commons.math.complex.Complex complex25 = complex17.tanh();
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex27 = complex26.atan();
        org.apache.commons.math.complex.Complex complex28 = complex27.cosh();
        org.apache.commons.math.complex.Complex complex29 = complex28.tanh();
        org.apache.commons.math.complex.Complex complex30 = complex28.exp();
        org.apache.commons.math.complex.Complex complex31 = complex28.exp();
        org.apache.commons.math.complex.Complex complex32 = complex31.sqrt();
        org.apache.commons.math.complex.Complex complex33 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex34 = complex33.atan();
        org.apache.commons.math.complex.Complex complex35 = complex34.cosh();
        org.apache.commons.math.complex.Complex complex36 = complex35.tanh();
        org.apache.commons.math.complex.Complex complex37 = complex36.sinh();
        org.apache.commons.math.complex.Complex complex38 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex39 = complex38.atan();
        org.apache.commons.math.complex.Complex complex40 = complex39.cosh();
        double double41 = complex40.getArgument();
        org.apache.commons.math.complex.Complex complex42 = complex37.divide(complex40);
        java.lang.String str43 = complex42.toString();
        org.apache.commons.math.complex.Complex complex44 = complex42.sqrt1z();
        org.apache.commons.math.complex.Complex complex45 = complex44.tan();
        org.apache.commons.math.complex.Complex complex46 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean47 = complex46.isInfinite();
        org.apache.commons.math.complex.Complex complex48 = complex45.multiply(complex46);
        org.apache.commons.math.complex.Complex complex49 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex50 = complex49.sqrt1z();
        org.apache.commons.math.complex.Complex complex51 = complex45.add(complex49);
        org.apache.commons.math.complex.Complex complex52 = complex32.add(complex51);
        org.apache.commons.math.complex.Complex complex53 = complex25.multiply(complex51);
        org.apache.commons.math.complex.Complex complex54 = complex4.subtract(complex51);
        org.apache.commons.math.complex.Complex complex55 = complex54.negate();
        org.apache.commons.math.complex.Complex complex56 = complex54.atan();
        org.apache.commons.math.complex.Complex complex57 = complex54.conjugate();
        org.apache.commons.math.complex.Complex complex58 = complex57.sinh();
        org.apache.commons.math.complex.Complex complex59 = complex58.asin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex54 and complex57", complex54.equals(complex57) ? complex54.hashCode() == complex57.hashCode() : true);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        double double8 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex9 = complex4.divide(complex7);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.atan();
        org.apache.commons.math.complex.Complex complex12 = complex11.sqrt();
        org.apache.commons.math.complex.Complex complex13 = complex11.tanh();
        org.apache.commons.math.complex.Complex complex14 = complex7.multiply(complex13);
        org.apache.commons.math.complex.Complex complex15 = complex14.sqrt();
        org.apache.commons.math.complex.Complex complex16 = complex14.sqrt1z();
        org.apache.commons.math.complex.Complex complex19 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex20 = complex19.tanh();
        java.lang.String str21 = complex20.toString();
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex23 = complex22.atan();
        org.apache.commons.math.complex.Complex complex24 = complex23.cosh();
        org.apache.commons.math.complex.Complex complex25 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex26 = complex25.atan();
        org.apache.commons.math.complex.Complex complex27 = complex26.cosh();
        org.apache.commons.math.complex.Complex complex28 = complex27.tanh();
        org.apache.commons.math.complex.Complex complex29 = complex27.exp();
        org.apache.commons.math.complex.Complex complex30 = complex23.add(complex27);
        org.apache.commons.math.complex.Complex complex31 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex32 = complex31.atan();
        org.apache.commons.math.complex.Complex complex33 = complex32.cosh();
        org.apache.commons.math.complex.Complex complex34 = complex33.tanh();
        org.apache.commons.math.complex.Complex complex35 = complex34.sinh();
        boolean boolean36 = complex34.isInfinite();
        org.apache.commons.math.complex.Complex complex37 = complex23.subtract(complex34);
        org.apache.commons.math.complex.Complex complex38 = complex20.divide(complex37);
        org.apache.commons.math.complex.Complex complex39 = complex37.conjugate();
        org.apache.commons.math.complex.Complex complex40 = complex39.sin();
        boolean boolean41 = complex14.equals((java.lang.Object) complex40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex37 and complex39", complex37.equals(complex39) ? complex37.hashCode() == complex39.hashCode() : true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex4 = complex3.atan();
        org.apache.commons.math.complex.Complex complex5 = complex4.cosh();
        org.apache.commons.math.complex.Complex complex6 = complex5.tanh();
        org.apache.commons.math.complex.Complex complex7 = complex5.exp();
        org.apache.commons.math.complex.Complex complex8 = complex1.add(complex5);
        org.apache.commons.math.complex.Complex complex9 = complex1.sqrt1z();
        org.apache.commons.math.complex.Complex complex10 = complex9.tanh();
        org.apache.commons.math.complex.Complex complex11 = complex9.tanh();
        org.apache.commons.math.complex.Complex complex12 = complex9.acos();
        double double13 = complex9.getReal();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex12", complex0.equals(complex12) ? complex0.hashCode() == complex12.hashCode() : true);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex6 = complex2.multiply(complex5);
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex8 = complex7.atan();
        org.apache.commons.math.complex.Complex complex9 = complex8.cosh();
        org.apache.commons.math.complex.Complex complex10 = complex9.asin();
        org.apache.commons.math.complex.Complex complex11 = complex5.add(complex10);
        org.apache.commons.math.complex.Complex complex12 = complex11.conjugate();
        org.apache.commons.math.complex.Complex complex13 = complex12.conjugate();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex15 = complex14.atan();
        org.apache.commons.math.complex.Complex complex16 = complex15.cosh();
        org.apache.commons.math.complex.Complex complex17 = complex16.tanh();
        org.apache.commons.math.complex.Complex complex18 = complex17.sinh();
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex20 = complex19.atan();
        org.apache.commons.math.complex.Complex complex21 = complex20.cosh();
        double double22 = complex21.getArgument();
        org.apache.commons.math.complex.Complex complex23 = complex18.divide(complex21);
        org.apache.commons.math.complex.Complex complex24 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex25 = complex24.atan();
        org.apache.commons.math.complex.Complex complex26 = complex25.sqrt();
        org.apache.commons.math.complex.Complex complex27 = complex25.tanh();
        org.apache.commons.math.complex.Complex complex28 = complex21.multiply(complex27);
        org.apache.commons.math.complex.Complex complex29 = complex27.exp();
        double double30 = complex27.abs();
        org.apache.commons.math.complex.Complex complex31 = complex27.atan();
        org.apache.commons.math.complex.Complex complex32 = complex31.exp();
        org.apache.commons.math.complex.Complex complex33 = complex12.add(complex31);
        org.apache.commons.math.complex.Complex complex34 = complex31.cos();
        org.apache.commons.math.complex.Complex complex35 = complex31.cos();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex9 and complex34", complex9.equals(complex34) ? complex9.hashCode() == complex34.hashCode() : true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex2.exp();
        boolean boolean5 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex6 = complex2.sqrt();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex8 = complex7.atan();
        org.apache.commons.math.complex.Complex complex9 = complex8.cosh();
        org.apache.commons.math.complex.Complex complex10 = complex9.tanh();
        org.apache.commons.math.complex.Complex complex11 = complex10.sinh();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex13 = complex12.atan();
        org.apache.commons.math.complex.Complex complex14 = complex13.cosh();
        double double15 = complex14.getArgument();
        org.apache.commons.math.complex.Complex complex16 = complex11.divide(complex14);
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex18 = complex17.atan();
        org.apache.commons.math.complex.Complex complex19 = complex18.sqrt();
        org.apache.commons.math.complex.Complex complex20 = complex18.tanh();
        org.apache.commons.math.complex.Complex complex21 = complex14.multiply(complex20);
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex23 = complex22.atan();
        org.apache.commons.math.complex.Complex complex24 = complex23.cosh();
        org.apache.commons.math.complex.Complex complex25 = complex24.tanh();
        org.apache.commons.math.complex.Complex complex26 = complex25.sinh();
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex28 = complex27.atan();
        org.apache.commons.math.complex.Complex complex29 = complex28.cosh();
        double double30 = complex29.getArgument();
        org.apache.commons.math.complex.Complex complex31 = complex26.divide(complex29);
        org.apache.commons.math.complex.Complex complex32 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex33 = complex32.atan();
        org.apache.commons.math.complex.Complex complex34 = complex33.sqrt();
        org.apache.commons.math.complex.Complex complex35 = complex33.tanh();
        org.apache.commons.math.complex.Complex complex36 = complex29.multiply(complex35);
        org.apache.commons.math.complex.Complex complex37 = complex14.divide(complex36);
        org.apache.commons.math.complex.Complex complex38 = complex2.pow(complex37);
        org.apache.commons.math.complex.Complex complex39 = complex2.acos();
        org.apache.commons.math.complex.Complex complex40 = complex2.tanh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex39", complex0.equals(complex39) ? complex0.hashCode() == complex39.hashCode() : true);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex2 = complex1.atan();
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex5 = complex4.atan();
        org.apache.commons.math.complex.Complex complex6 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex7 = complex6.tanh();
        org.apache.commons.math.complex.Complex complex8 = complex6.exp();
        org.apache.commons.math.complex.Complex complex9 = complex2.add(complex6);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.atan();
        org.apache.commons.math.complex.Complex complex12 = complex11.cosh();
        org.apache.commons.math.complex.Complex complex13 = complex12.tanh();
        org.apache.commons.math.complex.Complex complex14 = complex13.sinh();
        boolean boolean15 = complex13.isInfinite();
        org.apache.commons.math.complex.Complex complex16 = complex2.subtract(complex13);
        org.apache.commons.math.complex.Complex complex17 = complex0.add(complex2);
        org.apache.commons.math.complex.Complex complex18 = complex0.cos();
        org.apache.commons.math.complex.Complex complex19 = complex18.tan();
        org.apache.commons.math.complex.Complex complex20 = complex18.asin();
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex22 = complex21.atan();
        org.apache.commons.math.complex.Complex complex23 = complex22.cosh();
        org.apache.commons.math.complex.Complex complex24 = complex23.tanh();
        org.apache.commons.math.complex.Complex complex25 = complex24.sinh();
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex27 = complex26.atan();
        org.apache.commons.math.complex.Complex complex28 = complex27.cosh();
        double double29 = complex28.getArgument();
        org.apache.commons.math.complex.Complex complex30 = complex25.divide(complex28);
        org.apache.commons.math.complex.Complex complex31 = complex25.log();
        org.apache.commons.math.complex.Complex complex32 = complex31.cos();
        org.apache.commons.math.complex.Complex complex33 = complex31.exp();
        org.apache.commons.math.complex.Complex complex34 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex35 = complex34.atan();
        org.apache.commons.math.complex.Complex complex36 = complex35.cosh();
        org.apache.commons.math.complex.Complex complex37 = complex36.asin();
        org.apache.commons.math.complex.ComplexField complexField38 = complex36.getField();
        org.apache.commons.math.complex.Complex complex39 = complex36.tanh();
        org.apache.commons.math.complex.Complex complex40 = complex36.log();
        org.apache.commons.math.complex.Complex complex41 = complex40.cosh();
        org.apache.commons.math.complex.Complex complex42 = complex31.multiply(complex40);
        org.apache.commons.math.complex.Complex complex43 = complex18.add(complex42);
        org.apache.commons.math.complex.Complex complex44 = complex42.log();
        double double45 = complex44.getReal();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex42", complex1.equals(complex42) ? complex1.hashCode() == complex42.hashCode() : true);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex6 = complex2.multiply(complex5);
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex8 = complex7.atan();
        org.apache.commons.math.complex.Complex complex9 = complex8.cosh();
        org.apache.commons.math.complex.Complex complex10 = complex9.asin();
        org.apache.commons.math.complex.Complex complex11 = complex5.add(complex10);
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex13 = complex12.atan();
        org.apache.commons.math.complex.Complex complex14 = complex11.multiply(complex13);
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex16 = complex15.atan();
        org.apache.commons.math.complex.Complex complex17 = complex16.cosh();
        org.apache.commons.math.complex.Complex complex18 = complex14.multiply(complex17);
        org.apache.commons.math.complex.Complex complex19 = complex17.asin();
        org.apache.commons.math.complex.Complex complex20 = complex17.atan();
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex22 = complex21.atan();
        org.apache.commons.math.complex.Complex complex23 = complex22.sqrt();
        org.apache.commons.math.complex.Complex complex25 = complex23.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex27 = complex23.multiply(complex26);
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex29 = complex28.atan();
        org.apache.commons.math.complex.Complex complex30 = complex29.cosh();
        org.apache.commons.math.complex.Complex complex31 = complex30.asin();
        org.apache.commons.math.complex.Complex complex32 = complex26.add(complex31);
        org.apache.commons.math.complex.Complex complex33 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex34 = complex33.atan();
        org.apache.commons.math.complex.Complex complex35 = complex32.multiply(complex34);
        org.apache.commons.math.complex.Complex complex36 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex37 = complex36.atan();
        org.apache.commons.math.complex.Complex complex38 = complex37.cosh();
        org.apache.commons.math.complex.Complex complex39 = complex35.multiply(complex38);
        org.apache.commons.math.complex.Complex complex40 = complex17.multiply(complex35);
        org.apache.commons.math.complex.Complex complex41 = complex40.conjugate();
        boolean boolean43 = complex40.equals((java.lang.Object) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex41", complex0.equals(complex41) ? complex0.hashCode() == complex41.hashCode() : true);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex2.exp();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex6.atan();
        org.apache.commons.math.complex.Complex complex8 = complex4.add(complex7);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex10 = complex9.atan();
        org.apache.commons.math.complex.Complex complex11 = complex10.cosh();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex13 = complex12.atan();
        org.apache.commons.math.complex.Complex complex14 = complex13.cosh();
        org.apache.commons.math.complex.Complex complex15 = complex14.tanh();
        org.apache.commons.math.complex.Complex complex16 = complex14.exp();
        org.apache.commons.math.complex.Complex complex17 = complex10.add(complex14);
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex19 = complex18.atan();
        org.apache.commons.math.complex.Complex complex20 = complex19.cosh();
        org.apache.commons.math.complex.Complex complex21 = complex20.tanh();
        org.apache.commons.math.complex.Complex complex22 = complex21.sinh();
        boolean boolean23 = complex21.isInfinite();
        org.apache.commons.math.complex.Complex complex24 = complex10.subtract(complex21);
        org.apache.commons.math.complex.Complex complex25 = complex10.negate();
        org.apache.commons.math.complex.Complex complex26 = complex4.multiply(complex25);
        org.apache.commons.math.complex.Complex complex27 = complex4.cosh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex26", complex0.equals(complex26) ? complex0.hashCode() == complex26.hashCode() : true);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex6 = complex2.multiply(complex5);
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex8 = complex7.atan();
        org.apache.commons.math.complex.Complex complex9 = complex8.cosh();
        org.apache.commons.math.complex.Complex complex10 = complex9.asin();
        org.apache.commons.math.complex.Complex complex11 = complex5.add(complex10);
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex13 = complex12.atan();
        org.apache.commons.math.complex.Complex complex14 = complex11.multiply(complex13);
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex16 = complex15.atan();
        org.apache.commons.math.complex.Complex complex17 = complex16.cosh();
        org.apache.commons.math.complex.Complex complex18 = complex14.multiply(complex17);
        org.apache.commons.math.complex.Complex complex19 = complex17.asin();
        org.apache.commons.math.complex.Complex complex20 = complex17.atan();
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex22 = complex21.atan();
        org.apache.commons.math.complex.Complex complex23 = complex22.sqrt();
        org.apache.commons.math.complex.Complex complex25 = complex23.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex27 = complex23.multiply(complex26);
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex29 = complex28.atan();
        org.apache.commons.math.complex.Complex complex30 = complex29.cosh();
        org.apache.commons.math.complex.Complex complex31 = complex30.asin();
        org.apache.commons.math.complex.Complex complex32 = complex26.add(complex31);
        org.apache.commons.math.complex.Complex complex33 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex34 = complex33.atan();
        org.apache.commons.math.complex.Complex complex35 = complex32.multiply(complex34);
        org.apache.commons.math.complex.Complex complex36 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex37 = complex36.atan();
        org.apache.commons.math.complex.Complex complex38 = complex37.cosh();
        org.apache.commons.math.complex.Complex complex39 = complex35.multiply(complex38);
        org.apache.commons.math.complex.Complex complex40 = complex17.multiply(complex35);
        org.apache.commons.math.complex.Complex complex41 = complex40.conjugate();
        org.apache.commons.math.complex.Complex complex42 = complex41.asin();
        org.apache.commons.math.complex.Complex complex43 = complex42.negate();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex41", complex0.equals(complex41) ? complex0.hashCode() == complex41.hashCode() : true);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex6 = complex2.multiply(complex5);
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex8 = complex7.atan();
        org.apache.commons.math.complex.Complex complex9 = complex8.cosh();
        org.apache.commons.math.complex.Complex complex10 = complex9.asin();
        org.apache.commons.math.complex.Complex complex11 = complex5.add(complex10);
        org.apache.commons.math.complex.Complex complex12 = complex11.conjugate();
        org.apache.commons.math.complex.Complex complex13 = complex12.conjugate();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex15 = complex14.atan();
        org.apache.commons.math.complex.Complex complex16 = complex15.cosh();
        org.apache.commons.math.complex.Complex complex17 = complex16.tanh();
        org.apache.commons.math.complex.Complex complex18 = complex17.sinh();
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex20 = complex19.atan();
        org.apache.commons.math.complex.Complex complex21 = complex20.cosh();
        double double22 = complex21.getArgument();
        org.apache.commons.math.complex.Complex complex23 = complex18.divide(complex21);
        org.apache.commons.math.complex.Complex complex24 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex25 = complex24.atan();
        org.apache.commons.math.complex.Complex complex26 = complex25.sqrt();
        org.apache.commons.math.complex.Complex complex27 = complex25.tanh();
        org.apache.commons.math.complex.Complex complex28 = complex21.multiply(complex27);
        org.apache.commons.math.complex.Complex complex29 = complex27.exp();
        double double30 = complex27.abs();
        org.apache.commons.math.complex.Complex complex31 = complex27.atan();
        org.apache.commons.math.complex.Complex complex32 = complex31.exp();
        org.apache.commons.math.complex.Complex complex33 = complex12.add(complex31);
        org.apache.commons.math.complex.Complex complex34 = complex31.cos();
        org.apache.commons.math.complex.Complex complex35 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex36 = complex35.sqrt1z();
        org.apache.commons.math.complex.Complex complex39 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex40 = complex39.tanh();
        org.apache.commons.math.complex.Complex complex41 = complex36.subtract(complex39);
        org.apache.commons.math.complex.Complex complex44 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex45 = complex36.pow(complex44);
        org.apache.commons.math.complex.Complex complex46 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex47 = complex46.atan();
        org.apache.commons.math.complex.Complex complex48 = complex47.sqrt();
        org.apache.commons.math.complex.Complex complex49 = complex47.tanh();
        org.apache.commons.math.complex.Complex complex50 = complex45.pow(complex47);
        org.apache.commons.math.complex.Complex complex51 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex52 = complex45.divide(complex51);
        org.apache.commons.math.complex.Complex complex53 = complex34.subtract(complex52);
        java.util.List<org.apache.commons.math.complex.Complex> complexList55 = complex52.nthRoot(100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex9 and complex34", complex9.equals(complex34) ? complex9.hashCode() == complex34.hashCode() : true);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex2.cosh();
        boolean boolean5 = complex2.isNaN();
        java.util.List<org.apache.commons.math.complex.Complex> complexList7 = complex2.nthRoot((int) '#');
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.atan();
        org.apache.commons.math.complex.Complex complex10 = complex9.cosh();
        org.apache.commons.math.complex.Complex complex11 = complex10.tanh();
        org.apache.commons.math.complex.Complex complex12 = complex11.sinh();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex14 = complex13.atan();
        org.apache.commons.math.complex.Complex complex15 = complex14.cosh();
        double double16 = complex15.getArgument();
        org.apache.commons.math.complex.Complex complex17 = complex12.divide(complex15);
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex19 = complex18.atan();
        org.apache.commons.math.complex.Complex complex20 = complex19.sqrt();
        org.apache.commons.math.complex.Complex complex21 = complex19.tanh();
        org.apache.commons.math.complex.Complex complex22 = complex15.multiply(complex21);
        org.apache.commons.math.complex.Complex complex23 = complex21.cos();
        org.apache.commons.math.complex.Complex complex24 = complex23.tanh();
        org.apache.commons.math.complex.Complex complex25 = complex2.subtract(complex23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex24", complex3.equals(complex24) ? complex3.hashCode() == complex24.hashCode() : true);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        double double8 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex9 = complex4.divide(complex7);
        org.apache.commons.math.complex.Complex complex10 = complex4.log();
        org.apache.commons.math.complex.Complex complex11 = complex10.cos();
        org.apache.commons.math.complex.Complex complex12 = complex10.exp();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex14 = complex13.atan();
        org.apache.commons.math.complex.Complex complex15 = complex14.cosh();
        org.apache.commons.math.complex.Complex complex16 = complex15.asin();
        org.apache.commons.math.complex.ComplexField complexField17 = complex15.getField();
        org.apache.commons.math.complex.Complex complex18 = complex15.tanh();
        org.apache.commons.math.complex.Complex complex19 = complex15.log();
        org.apache.commons.math.complex.Complex complex20 = complex19.cosh();
        org.apache.commons.math.complex.Complex complex21 = complex10.multiply(complex19);
        org.apache.commons.math.complex.Complex complex22 = complex19.tanh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex21", complex0.equals(complex21) ? complex0.hashCode() == complex21.hashCode() : true);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex6 = complex2.multiply(complex5);
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex8 = complex7.atan();
        org.apache.commons.math.complex.Complex complex9 = complex8.cosh();
        org.apache.commons.math.complex.Complex complex10 = complex9.tanh();
        org.apache.commons.math.complex.Complex complex11 = complex10.sinh();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex13 = complex12.atan();
        org.apache.commons.math.complex.Complex complex14 = complex13.cosh();
        double double15 = complex14.getArgument();
        org.apache.commons.math.complex.Complex complex16 = complex11.divide(complex14);
        java.lang.String str17 = complex16.toString();
        org.apache.commons.math.complex.Complex complex18 = complex16.sqrt1z();
        org.apache.commons.math.complex.Complex complex19 = complex18.tan();
        org.apache.commons.math.complex.Complex complex20 = complex2.add(complex19);
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex22 = complex21.atan();
        org.apache.commons.math.complex.Complex complex23 = complex22.sqrt();
        org.apache.commons.math.complex.Complex complex25 = complex23.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex27 = complex23.multiply(complex26);
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex29 = complex28.atan();
        org.apache.commons.math.complex.Complex complex30 = complex29.cosh();
        org.apache.commons.math.complex.Complex complex31 = complex30.asin();
        org.apache.commons.math.complex.Complex complex32 = complex26.add(complex31);
        org.apache.commons.math.complex.Complex complex33 = complex32.conjugate();
        org.apache.commons.math.complex.Complex complex34 = complex2.divide(complex32);
        org.apache.commons.math.complex.Complex complex35 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex36 = complex35.atan();
        org.apache.commons.math.complex.Complex complex37 = complex36.sqrt();
        org.apache.commons.math.complex.Complex complex39 = complex37.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex40 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex41 = complex37.multiply(complex40);
        org.apache.commons.math.complex.Complex complex42 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex43 = complex42.atan();
        org.apache.commons.math.complex.Complex complex44 = complex43.cosh();
        org.apache.commons.math.complex.Complex complex45 = complex44.asin();
        org.apache.commons.math.complex.Complex complex46 = complex40.add(complex45);
        org.apache.commons.math.complex.Complex complex47 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex48 = complex47.atan();
        org.apache.commons.math.complex.Complex complex49 = complex46.multiply(complex48);
        org.apache.commons.math.complex.Complex complex50 = complex49.atan();
        org.apache.commons.math.complex.Complex complex51 = complex32.pow(complex49);
        org.apache.commons.math.complex.Complex complex52 = complex51.acos();
        double double53 = complex51.getImaginary();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex52", complex0.equals(complex52) ? complex0.hashCode() == complex52.hashCode() : true);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        double double8 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex9 = complex4.divide(complex7);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.atan();
        org.apache.commons.math.complex.Complex complex12 = complex11.sqrt();
        org.apache.commons.math.complex.Complex complex13 = complex11.tanh();
        org.apache.commons.math.complex.Complex complex14 = complex7.multiply(complex13);
        org.apache.commons.math.complex.Complex complex15 = complex13.exp();
        org.apache.commons.math.complex.Complex complex16 = complex15.acos();
        org.apache.commons.math.complex.Complex complex17 = complex16.sqrt();
        org.apache.commons.math.complex.Complex complex18 = complex17.atan();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex16", complex0.equals(complex16) ? complex0.hashCode() == complex16.hashCode() : true);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        double double8 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex9 = complex4.divide(complex7);
        org.apache.commons.math.complex.Complex complex10 = complex4.log();
        org.apache.commons.math.complex.Complex complex11 = complex10.cos();
        org.apache.commons.math.complex.Complex complex12 = complex10.exp();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex14 = complex13.atan();
        org.apache.commons.math.complex.Complex complex15 = complex14.cosh();
        org.apache.commons.math.complex.Complex complex16 = complex15.asin();
        org.apache.commons.math.complex.ComplexField complexField17 = complex15.getField();
        org.apache.commons.math.complex.Complex complex18 = complex15.tanh();
        org.apache.commons.math.complex.Complex complex19 = complex15.log();
        org.apache.commons.math.complex.Complex complex20 = complex19.cosh();
        org.apache.commons.math.complex.Complex complex21 = complex10.multiply(complex19);
        org.apache.commons.math.complex.Complex complex22 = complex21.log();
        org.apache.commons.math.complex.Complex complex23 = complex22.cosh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex21", complex0.equals(complex21) ? complex0.hashCode() == complex21.hashCode() : true);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        double double8 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex9 = complex4.divide(complex7);
        java.lang.String str10 = complex9.toString();
        org.apache.commons.math.complex.Complex complex11 = complex9.sqrt1z();
        org.apache.commons.math.complex.Complex complex12 = complex11.tan();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean14 = complex13.isInfinite();
        org.apache.commons.math.complex.Complex complex15 = complex12.multiply(complex13);
        org.apache.commons.math.complex.Complex complex16 = complex13.negate();
        org.apache.commons.math.complex.Complex complex17 = complex16.asin();
        org.apache.commons.math.complex.Complex complex18 = complex16.sinh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex17", complex0.equals(complex17) ? complex0.hashCode() == complex17.hashCode() : true);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex6 = complex2.multiply(complex5);
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex8 = complex7.atan();
        org.apache.commons.math.complex.Complex complex9 = complex8.cosh();
        org.apache.commons.math.complex.Complex complex10 = complex9.asin();
        org.apache.commons.math.complex.Complex complex11 = complex5.add(complex10);
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex13 = complex12.atan();
        org.apache.commons.math.complex.Complex complex14 = complex11.multiply(complex13);
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex16 = complex15.atan();
        org.apache.commons.math.complex.Complex complex17 = complex16.cosh();
        org.apache.commons.math.complex.Complex complex18 = complex14.multiply(complex17);
        org.apache.commons.math.complex.Complex complex19 = complex17.asin();
        org.apache.commons.math.complex.Complex complex20 = complex17.atan();
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex22 = complex21.atan();
        org.apache.commons.math.complex.Complex complex23 = complex22.sqrt();
        org.apache.commons.math.complex.Complex complex25 = complex23.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex27 = complex23.multiply(complex26);
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex29 = complex28.atan();
        org.apache.commons.math.complex.Complex complex30 = complex29.cosh();
        org.apache.commons.math.complex.Complex complex31 = complex30.asin();
        org.apache.commons.math.complex.Complex complex32 = complex26.add(complex31);
        org.apache.commons.math.complex.Complex complex33 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex34 = complex33.atan();
        org.apache.commons.math.complex.Complex complex35 = complex32.multiply(complex34);
        org.apache.commons.math.complex.Complex complex36 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex37 = complex36.atan();
        org.apache.commons.math.complex.Complex complex38 = complex37.cosh();
        org.apache.commons.math.complex.Complex complex39 = complex35.multiply(complex38);
        org.apache.commons.math.complex.Complex complex40 = complex17.multiply(complex35);
        org.apache.commons.math.complex.Complex complex41 = complex40.conjugate();
        org.apache.commons.math.complex.Complex complex42 = complex41.asin();
        double double43 = complex41.abs();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex42", complex0.equals(complex42) ? complex0.hashCode() == complex42.hashCode() : true);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        double double8 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex9 = complex4.divide(complex7);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.atan();
        org.apache.commons.math.complex.Complex complex12 = complex11.sqrt();
        org.apache.commons.math.complex.Complex complex13 = complex11.tanh();
        org.apache.commons.math.complex.Complex complex14 = complex7.multiply(complex13);
        org.apache.commons.math.complex.Complex complex15 = complex13.cos();
        org.apache.commons.math.complex.Complex complex16 = complex13.sqrt();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex15", complex2.equals(complex15) ? complex2.hashCode() == complex15.hashCode() : true);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex4 = complex3.atan();
        org.apache.commons.math.complex.Complex complex5 = complex4.cosh();
        org.apache.commons.math.complex.Complex complex6 = complex5.tanh();
        org.apache.commons.math.complex.Complex complex7 = complex5.exp();
        org.apache.commons.math.complex.Complex complex8 = complex1.add(complex5);
        org.apache.commons.math.complex.Complex complex9 = complex1.sqrt1z();
        org.apache.commons.math.complex.Complex complex10 = complex9.conjugate();
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex12 = complex11.atan();
        org.apache.commons.math.complex.Complex complex13 = complex12.cosh();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex15 = complex14.atan();
        org.apache.commons.math.complex.Complex complex16 = complex15.cosh();
        org.apache.commons.math.complex.Complex complex17 = complex16.tanh();
        org.apache.commons.math.complex.Complex complex18 = complex16.exp();
        org.apache.commons.math.complex.Complex complex19 = complex12.add(complex16);
        org.apache.commons.math.complex.Complex complex20 = complex19.sin();
        boolean boolean21 = complex19.isInfinite();
        org.apache.commons.math.complex.Complex complex22 = complex19.tanh();
        org.apache.commons.math.complex.Complex complex23 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex24 = complex23.atan();
        org.apache.commons.math.complex.Complex complex25 = complex24.cosh();
        org.apache.commons.math.complex.Complex complex26 = complex25.tanh();
        org.apache.commons.math.complex.Complex complex27 = complex26.sinh();
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex29 = complex28.atan();
        org.apache.commons.math.complex.Complex complex30 = complex29.cosh();
        double double31 = complex30.getArgument();
        org.apache.commons.math.complex.Complex complex32 = complex27.divide(complex30);
        org.apache.commons.math.complex.Complex complex33 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex34 = complex33.atan();
        org.apache.commons.math.complex.Complex complex35 = complex34.sqrt();
        org.apache.commons.math.complex.Complex complex36 = complex34.tanh();
        org.apache.commons.math.complex.Complex complex37 = complex30.multiply(complex36);
        org.apache.commons.math.complex.Complex complex38 = complex36.exp();
        double double39 = complex36.abs();
        org.apache.commons.math.complex.Complex complex40 = complex36.atan();
        org.apache.commons.math.complex.Complex complex41 = complex40.exp();
        double double42 = complex40.getReal();
        org.apache.commons.math.complex.Complex complex43 = complex40.acos();
        org.apache.commons.math.complex.Complex complex44 = complex22.divide(complex40);
        org.apache.commons.math.complex.Complex complex45 = complex9.subtract(complex44);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex10", complex2.equals(complex10) ? complex2.hashCode() == complex10.hashCode() : true);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.asin();
        org.apache.commons.math.complex.ComplexField complexField4 = complex2.getField();
        java.lang.String str5 = complex2.toString();
        org.apache.commons.math.complex.Complex complex6 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex7 = complex6.cos();
        org.apache.commons.math.complex.Complex complex8 = complex6.sin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex7", complex2.equals(complex7) ? complex2.hashCode() == complex7.hashCode() : true);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex4 = complex3.atan();
        org.apache.commons.math.complex.Complex complex5 = complex4.cosh();
        org.apache.commons.math.complex.Complex complex6 = complex5.tanh();
        org.apache.commons.math.complex.Complex complex7 = complex6.sinh();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.atan();
        org.apache.commons.math.complex.Complex complex10 = complex9.cosh();
        double double11 = complex10.getArgument();
        org.apache.commons.math.complex.Complex complex12 = complex7.divide(complex10);
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex14 = complex13.atan();
        org.apache.commons.math.complex.Complex complex15 = complex14.sqrt();
        org.apache.commons.math.complex.Complex complex16 = complex14.tanh();
        org.apache.commons.math.complex.Complex complex17 = complex10.multiply(complex16);
        org.apache.commons.math.complex.Complex complex18 = complex1.pow(complex16);
        org.apache.commons.math.complex.Complex complex19 = complex16.sinh();
        org.apache.commons.math.complex.Complex complex20 = complex16.atan();
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex22 = complex21.atan();
        org.apache.commons.math.complex.Complex complex23 = complex22.sqrt();
        org.apache.commons.math.complex.Complex complex25 = complex23.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex27 = complex23.multiply(complex26);
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex29 = complex28.atan();
        org.apache.commons.math.complex.Complex complex30 = complex29.cosh();
        org.apache.commons.math.complex.Complex complex31 = complex30.asin();
        org.apache.commons.math.complex.Complex complex32 = complex26.add(complex31);
        double double33 = complex32.getArgument();
        org.apache.commons.math.complex.Complex complex34 = complex20.divide(complex32);
        org.apache.commons.math.complex.Complex complex35 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex36 = complex35.atan();
        org.apache.commons.math.complex.Complex complex37 = complex36.cosh();
        org.apache.commons.math.complex.Complex complex38 = complex37.tanh();
        org.apache.commons.math.complex.Complex complex39 = complex38.sinh();
        org.apache.commons.math.complex.Complex complex40 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex41 = complex40.atan();
        org.apache.commons.math.complex.Complex complex42 = complex41.cosh();
        double double43 = complex42.getArgument();
        org.apache.commons.math.complex.Complex complex44 = complex39.divide(complex42);
        org.apache.commons.math.complex.Complex complex45 = complex39.log();
        org.apache.commons.math.complex.Complex complex46 = complex39.conjugate();
        boolean boolean47 = complex34.equals((java.lang.Object) complex39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex7 and complex46", complex7.equals(complex46) ? complex7.hashCode() == complex46.hashCode() : true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex6 = complex2.multiply(complex5);
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex8 = complex7.atan();
        org.apache.commons.math.complex.Complex complex9 = complex8.cosh();
        org.apache.commons.math.complex.Complex complex10 = complex9.asin();
        org.apache.commons.math.complex.Complex complex11 = complex5.add(complex10);
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex13 = complex12.atan();
        org.apache.commons.math.complex.Complex complex14 = complex11.multiply(complex13);
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex16 = complex15.atan();
        org.apache.commons.math.complex.Complex complex17 = complex16.cosh();
        org.apache.commons.math.complex.Complex complex18 = complex14.multiply(complex17);
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex20 = complex19.sqrt1z();
        double double21 = complex20.getReal();
        org.apache.commons.math.complex.Complex complex22 = complex14.multiply(complex20);
        org.apache.commons.math.complex.Complex complex23 = complex20.acos();
        org.apache.commons.math.complex.Complex complex26 = new org.apache.commons.math.complex.Complex((double) 'a', (double) 0);
        org.apache.commons.math.complex.Complex complex27 = complex26.sqrt();
        org.apache.commons.math.complex.Complex complex28 = complex20.multiply(complex26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex23", complex0.equals(complex23) ? complex0.hashCode() == complex23.hashCode() : true);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex6 = complex2.multiply(complex5);
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex8 = complex7.atan();
        org.apache.commons.math.complex.Complex complex9 = complex8.cosh();
        org.apache.commons.math.complex.Complex complex10 = complex9.asin();
        org.apache.commons.math.complex.Complex complex11 = complex5.add(complex10);
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex13 = complex12.atan();
        org.apache.commons.math.complex.Complex complex14 = complex11.multiply(complex13);
        org.apache.commons.math.complex.Complex complex15 = complex14.atan();
        double double16 = complex15.abs();
        org.apache.commons.math.complex.Complex complex17 = complex15.conjugate();
        org.apache.commons.math.complex.ComplexField complexField18 = complex15.getField();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex17", complex0.equals(complex17) ? complex0.hashCode() == complex17.hashCode() : true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex6 = complex2.multiply(complex5);
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex8 = complex7.atan();
        org.apache.commons.math.complex.Complex complex9 = complex8.cosh();
        org.apache.commons.math.complex.Complex complex10 = complex9.tanh();
        org.apache.commons.math.complex.Complex complex11 = complex10.sinh();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex13 = complex12.atan();
        org.apache.commons.math.complex.Complex complex14 = complex13.cosh();
        double double15 = complex14.getArgument();
        org.apache.commons.math.complex.Complex complex16 = complex11.divide(complex14);
        java.lang.String str17 = complex16.toString();
        org.apache.commons.math.complex.Complex complex18 = complex16.sqrt1z();
        org.apache.commons.math.complex.Complex complex19 = complex18.tan();
        org.apache.commons.math.complex.Complex complex20 = complex2.add(complex19);
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex22 = complex21.atan();
        org.apache.commons.math.complex.Complex complex23 = complex22.sqrt();
        org.apache.commons.math.complex.Complex complex25 = complex23.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex27 = complex23.multiply(complex26);
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex29 = complex28.atan();
        org.apache.commons.math.complex.Complex complex30 = complex29.cosh();
        org.apache.commons.math.complex.Complex complex31 = complex30.asin();
        org.apache.commons.math.complex.Complex complex32 = complex26.add(complex31);
        org.apache.commons.math.complex.Complex complex33 = complex32.conjugate();
        org.apache.commons.math.complex.Complex complex34 = complex2.divide(complex32);
        org.apache.commons.math.complex.Complex complex35 = complex34.conjugate();
        java.util.List<org.apache.commons.math.complex.Complex> complexList37 = complex34.nthRoot((int) (byte) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex35", complex0.equals(complex35) ? complex0.hashCode() == complex35.hashCode() : true);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        double double8 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex9 = complex4.divide(complex7);
        org.apache.commons.math.complex.Complex complex10 = complex4.log();
        org.apache.commons.math.complex.Complex complex11 = complex10.cos();
        org.apache.commons.math.complex.Complex complex12 = complex10.exp();
        org.apache.commons.math.complex.Complex complex13 = complex12.log();
        org.apache.commons.math.complex.Complex complex14 = complex13.conjugate();
        double double15 = complex13.abs();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex10 and complex14", complex10.equals(complex14) ? complex10.hashCode() == complex14.hashCode() : true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex4 = complex3.atan();
        org.apache.commons.math.complex.Complex complex5 = complex4.cosh();
        org.apache.commons.math.complex.Complex complex6 = complex5.tanh();
        org.apache.commons.math.complex.Complex complex7 = complex5.exp();
        org.apache.commons.math.complex.Complex complex8 = complex1.add(complex5);
        org.apache.commons.math.complex.Complex complex9 = complex1.sqrt1z();
        org.apache.commons.math.complex.Complex complex10 = complex9.conjugate();
        org.apache.commons.math.complex.Complex complex11 = complex10.sinh();
        boolean boolean12 = complex10.isNaN();
        org.apache.commons.math.complex.Complex complex13 = complex10.negate();
        org.apache.commons.math.complex.Complex complex14 = complex13.negate();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex10", complex2.equals(complex10) ? complex2.hashCode() == complex10.hashCode() : true);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        java.lang.String str4 = complex3.toString();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.atan();
        org.apache.commons.math.complex.Complex complex10 = complex9.cosh();
        org.apache.commons.math.complex.Complex complex11 = complex10.tanh();
        org.apache.commons.math.complex.Complex complex12 = complex10.exp();
        org.apache.commons.math.complex.Complex complex13 = complex6.add(complex10);
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex15 = complex14.atan();
        org.apache.commons.math.complex.Complex complex16 = complex15.cosh();
        org.apache.commons.math.complex.Complex complex17 = complex16.tanh();
        org.apache.commons.math.complex.Complex complex18 = complex17.sinh();
        boolean boolean19 = complex17.isInfinite();
        org.apache.commons.math.complex.Complex complex20 = complex6.subtract(complex17);
        org.apache.commons.math.complex.Complex complex21 = complex3.divide(complex20);
        org.apache.commons.math.complex.Complex complex22 = complex20.conjugate();
        org.apache.commons.math.complex.Complex complex23 = complex20.sqrt();
        double double24 = complex23.abs();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex20 and complex22", complex20.equals(complex22) ? complex20.hashCode() == complex22.hashCode() : true);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        java.lang.String str4 = complex3.toString();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.atan();
        org.apache.commons.math.complex.Complex complex10 = complex9.cosh();
        org.apache.commons.math.complex.Complex complex11 = complex10.tanh();
        org.apache.commons.math.complex.Complex complex12 = complex10.exp();
        org.apache.commons.math.complex.Complex complex13 = complex6.add(complex10);
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex15 = complex14.atan();
        org.apache.commons.math.complex.Complex complex16 = complex15.cosh();
        org.apache.commons.math.complex.Complex complex17 = complex16.tanh();
        org.apache.commons.math.complex.Complex complex18 = complex17.sinh();
        boolean boolean19 = complex17.isInfinite();
        org.apache.commons.math.complex.Complex complex20 = complex6.subtract(complex17);
        org.apache.commons.math.complex.Complex complex21 = complex3.divide(complex20);
        org.apache.commons.math.complex.Complex complex22 = complex20.conjugate();
        org.apache.commons.math.complex.Complex complex23 = complex22.acos();
        double double24 = complex23.abs();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex20 and complex22", complex20.equals(complex22) ? complex20.hashCode() == complex22.hashCode() : true);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        double double8 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex9 = complex4.divide(complex7);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.atan();
        org.apache.commons.math.complex.Complex complex12 = complex11.sqrt();
        org.apache.commons.math.complex.Complex complex13 = complex11.tanh();
        org.apache.commons.math.complex.Complex complex14 = complex7.multiply(complex13);
        org.apache.commons.math.complex.Complex complex15 = complex13.exp();
        org.apache.commons.math.complex.Complex complex16 = complex15.acos();
        org.apache.commons.math.complex.Complex complex17 = complex16.sqrt();
        org.apache.commons.math.complex.Complex complex18 = complex17.tan();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex16", complex0.equals(complex16) ? complex0.hashCode() == complex16.hashCode() : true);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex6 = complex2.multiply(complex5);
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex8 = complex7.atan();
        org.apache.commons.math.complex.Complex complex9 = complex8.cosh();
        org.apache.commons.math.complex.Complex complex10 = complex9.tanh();
        org.apache.commons.math.complex.Complex complex11 = complex10.sinh();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex13 = complex12.atan();
        org.apache.commons.math.complex.Complex complex14 = complex13.cosh();
        double double15 = complex14.getArgument();
        org.apache.commons.math.complex.Complex complex16 = complex11.divide(complex14);
        java.lang.String str17 = complex16.toString();
        org.apache.commons.math.complex.Complex complex18 = complex16.sqrt1z();
        org.apache.commons.math.complex.Complex complex19 = complex18.tan();
        org.apache.commons.math.complex.Complex complex20 = complex2.add(complex19);
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex22 = complex21.atan();
        org.apache.commons.math.complex.Complex complex23 = complex22.sqrt();
        org.apache.commons.math.complex.Complex complex25 = complex23.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex27 = complex23.multiply(complex26);
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex29 = complex28.atan();
        org.apache.commons.math.complex.Complex complex30 = complex29.cosh();
        org.apache.commons.math.complex.Complex complex31 = complex30.asin();
        org.apache.commons.math.complex.Complex complex32 = complex26.add(complex31);
        org.apache.commons.math.complex.Complex complex33 = complex32.conjugate();
        org.apache.commons.math.complex.Complex complex34 = complex2.divide(complex32);
        org.apache.commons.math.complex.Complex complex35 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex36 = complex35.atan();
        org.apache.commons.math.complex.Complex complex37 = complex36.sqrt();
        org.apache.commons.math.complex.Complex complex39 = complex37.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex40 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex41 = complex37.multiply(complex40);
        org.apache.commons.math.complex.Complex complex42 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex43 = complex42.atan();
        org.apache.commons.math.complex.Complex complex44 = complex43.cosh();
        org.apache.commons.math.complex.Complex complex45 = complex44.asin();
        org.apache.commons.math.complex.Complex complex46 = complex40.add(complex45);
        org.apache.commons.math.complex.Complex complex47 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex48 = complex47.atan();
        org.apache.commons.math.complex.Complex complex49 = complex46.multiply(complex48);
        org.apache.commons.math.complex.Complex complex50 = complex49.atan();
        org.apache.commons.math.complex.Complex complex51 = complex32.pow(complex49);
        org.apache.commons.math.complex.Complex complex52 = complex51.acos();
        org.apache.commons.math.complex.ComplexField complexField53 = complex51.getField();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex52", complex0.equals(complex52) ? complex0.hashCode() == complex52.hashCode() : true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex4 = complex3.atan();
        org.apache.commons.math.complex.Complex complex5 = complex4.cosh();
        org.apache.commons.math.complex.Complex complex6 = complex5.tanh();
        org.apache.commons.math.complex.Complex complex7 = complex5.exp();
        org.apache.commons.math.complex.Complex complex8 = complex1.add(complex5);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex10 = complex9.atan();
        org.apache.commons.math.complex.Complex complex11 = complex10.cosh();
        org.apache.commons.math.complex.Complex complex12 = complex11.tanh();
        org.apache.commons.math.complex.Complex complex13 = complex12.sinh();
        boolean boolean14 = complex12.isInfinite();
        org.apache.commons.math.complex.Complex complex15 = complex1.subtract(complex12);
        org.apache.commons.math.complex.Complex complex16 = complex1.negate();
        org.apache.commons.math.complex.Complex complex17 = complex1.asin();
        org.apache.commons.math.complex.Complex complex18 = complex1.tan();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex17", complex0.equals(complex17) ? complex0.hashCode() == complex17.hashCode() : true);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math.complex.Complex complex3 = complex1.cos();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex5 = complex4.atan();
        org.apache.commons.math.complex.Complex complex6 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex7 = complex6.asin();
        org.apache.commons.math.complex.Complex complex8 = complex7.tan();
        org.apache.commons.math.complex.Complex complex9 = complex3.pow(complex8);
        org.apache.commons.math.complex.ComplexField complexField10 = complex8.getField();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex6", complex3.equals(complex6) ? complex3.hashCode() == complex6.hashCode() : true);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex2.cosh();
        boolean boolean5 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex7 = complex6.sqrt1z();
        org.apache.commons.math.complex.Complex complex10 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex11 = complex10.tanh();
        org.apache.commons.math.complex.Complex complex12 = complex7.subtract(complex10);
        org.apache.commons.math.complex.Complex complex15 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex16 = complex7.pow(complex15);
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex18 = complex17.atan();
        org.apache.commons.math.complex.Complex complex19 = complex18.sqrt();
        org.apache.commons.math.complex.Complex complex20 = complex18.tanh();
        org.apache.commons.math.complex.Complex complex21 = complex16.pow(complex18);
        org.apache.commons.math.complex.Complex complex22 = complex2.add(complex16);
        org.apache.commons.math.complex.Complex complex23 = complex22.conjugate();
        org.apache.commons.math.complex.Complex complex24 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex25 = complex24.atan();
        org.apache.commons.math.complex.Complex complex26 = complex25.sqrt();
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex28 = complex27.atan();
        org.apache.commons.math.complex.Complex complex29 = complex28.cosh();
        org.apache.commons.math.complex.Complex complex30 = complex29.tanh();
        org.apache.commons.math.complex.Complex complex31 = complex30.sinh();
        org.apache.commons.math.complex.Complex complex32 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex33 = complex32.atan();
        org.apache.commons.math.complex.Complex complex34 = complex33.cosh();
        double double35 = complex34.getArgument();
        org.apache.commons.math.complex.Complex complex36 = complex31.divide(complex34);
        org.apache.commons.math.complex.Complex complex37 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex38 = complex37.atan();
        org.apache.commons.math.complex.Complex complex39 = complex38.sqrt();
        org.apache.commons.math.complex.Complex complex40 = complex38.tanh();
        org.apache.commons.math.complex.Complex complex41 = complex34.multiply(complex40);
        org.apache.commons.math.complex.Complex complex42 = complex25.pow(complex40);
        org.apache.commons.math.complex.Complex complex43 = complex40.cos();
        org.apache.commons.math.complex.Complex complex44 = complex43.sqrt1z();
        org.apache.commons.math.complex.Complex complex45 = complex22.add(complex43);
        org.apache.commons.math.complex.Complex complex46 = complex22.cos();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex43", complex2.equals(complex43) ? complex2.hashCode() == complex43.hashCode() : true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        double double8 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex9 = complex4.divide(complex7);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.atan();
        org.apache.commons.math.complex.Complex complex12 = complex11.sqrt();
        org.apache.commons.math.complex.Complex complex13 = complex11.tanh();
        org.apache.commons.math.complex.Complex complex14 = complex7.multiply(complex13);
        boolean boolean15 = complex7.isInfinite();
        org.apache.commons.math.complex.Complex complex16 = complex7.conjugate();
        org.apache.commons.math.complex.Complex complex17 = complex7.asin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex16", complex2.equals(complex16) ? complex2.hashCode() == complex16.hashCode() : true);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        double double8 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex9 = complex4.divide(complex7);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.atan();
        org.apache.commons.math.complex.Complex complex12 = complex11.sqrt();
        org.apache.commons.math.complex.Complex complex13 = complex11.tanh();
        org.apache.commons.math.complex.Complex complex14 = complex7.multiply(complex13);
        org.apache.commons.math.complex.Complex complex15 = complex13.exp();
        double double16 = complex13.abs();
        org.apache.commons.math.complex.Complex complex17 = complex13.atan();
        org.apache.commons.math.complex.Complex complex18 = complex13.conjugate();
        java.lang.String str19 = complex13.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex18", complex0.equals(complex18) ? complex0.hashCode() == complex18.hashCode() : true);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (-0.0d));
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex4 = complex3.atan();
        org.apache.commons.math.complex.Complex complex5 = complex4.sqrt();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex7 = complex6.atan();
        org.apache.commons.math.complex.Complex complex8 = complex7.cosh();
        org.apache.commons.math.complex.Complex complex9 = complex8.tanh();
        org.apache.commons.math.complex.Complex complex10 = complex9.sinh();
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex12 = complex11.atan();
        org.apache.commons.math.complex.Complex complex13 = complex12.cosh();
        double double14 = complex13.getArgument();
        org.apache.commons.math.complex.Complex complex15 = complex10.divide(complex13);
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex17 = complex16.atan();
        org.apache.commons.math.complex.Complex complex18 = complex17.sqrt();
        org.apache.commons.math.complex.Complex complex19 = complex17.tanh();
        org.apache.commons.math.complex.Complex complex20 = complex13.multiply(complex19);
        org.apache.commons.math.complex.Complex complex21 = complex4.pow(complex19);
        org.apache.commons.math.complex.Complex complex22 = complex19.cos();
        org.apache.commons.math.complex.Complex complex23 = complex22.sqrt1z();
        org.apache.commons.math.complex.Complex complex24 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex25 = complex24.tanh();
        org.apache.commons.math.complex.Complex complex26 = complex25.sqrt1z();
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex28 = complex27.atan();
        org.apache.commons.math.complex.Complex complex29 = complex28.sqrt();
        org.apache.commons.math.complex.Complex complex31 = complex29.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex32 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex33 = complex29.multiply(complex32);
        org.apache.commons.math.complex.Complex complex34 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex35 = complex34.atan();
        org.apache.commons.math.complex.Complex complex36 = complex35.cosh();
        org.apache.commons.math.complex.Complex complex37 = complex36.tanh();
        org.apache.commons.math.complex.Complex complex38 = complex37.sinh();
        org.apache.commons.math.complex.Complex complex39 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex40 = complex39.atan();
        org.apache.commons.math.complex.Complex complex41 = complex40.cosh();
        double double42 = complex41.getArgument();
        org.apache.commons.math.complex.Complex complex43 = complex38.divide(complex41);
        java.lang.String str44 = complex43.toString();
        org.apache.commons.math.complex.Complex complex45 = complex43.sqrt1z();
        org.apache.commons.math.complex.Complex complex46 = complex45.tan();
        org.apache.commons.math.complex.Complex complex47 = complex29.add(complex46);
        org.apache.commons.math.complex.Complex complex48 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex49 = complex48.atan();
        org.apache.commons.math.complex.Complex complex50 = complex49.cosh();
        org.apache.commons.math.complex.Complex complex51 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex52 = complex51.atan();
        org.apache.commons.math.complex.Complex complex53 = complex52.cosh();
        org.apache.commons.math.complex.Complex complex54 = complex53.tanh();
        org.apache.commons.math.complex.Complex complex55 = complex53.exp();
        org.apache.commons.math.complex.Complex complex56 = complex49.add(complex53);
        org.apache.commons.math.complex.Complex complex57 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex58 = complex57.atan();
        org.apache.commons.math.complex.Complex complex59 = complex58.cosh();
        org.apache.commons.math.complex.Complex complex60 = complex59.tanh();
        org.apache.commons.math.complex.Complex complex61 = complex60.sinh();
        boolean boolean62 = complex60.isInfinite();
        org.apache.commons.math.complex.Complex complex63 = complex49.subtract(complex60);
        java.lang.String str64 = complex63.toString();
        org.apache.commons.math.complex.Complex complex65 = complex63.sqrt();
        org.apache.commons.math.complex.Complex complex66 = complex47.divide(complex65);
        org.apache.commons.math.complex.Complex complex67 = complex47.cosh();
        org.apache.commons.math.complex.Complex complex68 = complex25.divide(complex67);
        org.apache.commons.math.complex.Complex complex69 = complex22.add(complex68);
        boolean boolean70 = complex2.equals((java.lang.Object) complex68);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex8 and complex22", complex8.equals(complex22) ? complex8.hashCode() == complex22.hashCode() : true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        java.lang.String str4 = complex3.toString();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.atan();
        org.apache.commons.math.complex.Complex complex10 = complex9.cosh();
        org.apache.commons.math.complex.Complex complex11 = complex10.tanh();
        org.apache.commons.math.complex.Complex complex12 = complex10.exp();
        org.apache.commons.math.complex.Complex complex13 = complex6.add(complex10);
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex15 = complex14.atan();
        org.apache.commons.math.complex.Complex complex16 = complex15.cosh();
        org.apache.commons.math.complex.Complex complex17 = complex16.tanh();
        org.apache.commons.math.complex.Complex complex18 = complex17.sinh();
        boolean boolean19 = complex17.isInfinite();
        org.apache.commons.math.complex.Complex complex20 = complex6.subtract(complex17);
        org.apache.commons.math.complex.Complex complex21 = complex3.divide(complex20);
        org.apache.commons.math.complex.Complex complex22 = complex20.conjugate();
        org.apache.commons.math.complex.Complex complex23 = complex22.acos();
        org.apache.commons.math.complex.Complex complex24 = complex23.acos();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex20 and complex22", complex20.equals(complex22) ? complex20.hashCode() == complex22.hashCode() : true);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        java.lang.String str4 = complex3.toString();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.atan();
        org.apache.commons.math.complex.Complex complex10 = complex9.cosh();
        org.apache.commons.math.complex.Complex complex11 = complex10.tanh();
        org.apache.commons.math.complex.Complex complex12 = complex10.exp();
        org.apache.commons.math.complex.Complex complex13 = complex6.add(complex10);
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex15 = complex14.atan();
        org.apache.commons.math.complex.Complex complex16 = complex15.cosh();
        org.apache.commons.math.complex.Complex complex17 = complex16.tanh();
        org.apache.commons.math.complex.Complex complex18 = complex17.sinh();
        boolean boolean19 = complex17.isInfinite();
        org.apache.commons.math.complex.Complex complex20 = complex6.subtract(complex17);
        org.apache.commons.math.complex.Complex complex21 = complex3.divide(complex20);
        org.apache.commons.math.complex.Complex complex22 = complex21.sinh();
        org.apache.commons.math.complex.Complex complex23 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex24 = complex23.atan();
        org.apache.commons.math.complex.Complex complex25 = complex24.sqrt();
        org.apache.commons.math.complex.Complex complex27 = complex25.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex28 = complex25.tan();
        java.lang.String str29 = complex28.toString();
        org.apache.commons.math.complex.Complex complex30 = complex28.cos();
        org.apache.commons.math.complex.Complex complex31 = complex28.sin();
        org.apache.commons.math.complex.Complex complex32 = complex31.sqrt();
        double double33 = complex32.getImaginary();
        boolean boolean34 = complex21.equals((java.lang.Object) complex32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex7 and complex30", complex7.equals(complex30) ? complex7.hashCode() == complex30.hashCode() : true);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex2 = complex1.atan();
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex5 = complex4.atan();
        org.apache.commons.math.complex.Complex complex6 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex7 = complex6.tanh();
        org.apache.commons.math.complex.Complex complex8 = complex6.exp();
        org.apache.commons.math.complex.Complex complex9 = complex2.add(complex6);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.atan();
        org.apache.commons.math.complex.Complex complex12 = complex11.cosh();
        org.apache.commons.math.complex.Complex complex13 = complex12.tanh();
        org.apache.commons.math.complex.Complex complex14 = complex13.sinh();
        boolean boolean15 = complex13.isInfinite();
        org.apache.commons.math.complex.Complex complex16 = complex2.subtract(complex13);
        org.apache.commons.math.complex.Complex complex17 = complex0.add(complex2);
        org.apache.commons.math.complex.Complex complex18 = complex17.cos();
        org.apache.commons.math.complex.Complex complex19 = complex18.sqrt1z();
        org.apache.commons.math.complex.Complex complex20 = complex18.cos();
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex22 = complex21.atan();
        org.apache.commons.math.complex.Complex complex23 = complex22.cosh();
        org.apache.commons.math.complex.Complex complex24 = complex23.tanh();
        org.apache.commons.math.complex.Complex complex25 = complex23.cosh();
        boolean boolean26 = complex23.isNaN();
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex28 = complex27.sqrt1z();
        org.apache.commons.math.complex.Complex complex31 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex32 = complex31.tanh();
        org.apache.commons.math.complex.Complex complex33 = complex28.subtract(complex31);
        org.apache.commons.math.complex.Complex complex36 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex37 = complex28.pow(complex36);
        org.apache.commons.math.complex.Complex complex38 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex39 = complex38.atan();
        org.apache.commons.math.complex.Complex complex40 = complex39.sqrt();
        org.apache.commons.math.complex.Complex complex41 = complex39.tanh();
        org.apache.commons.math.complex.Complex complex42 = complex37.pow(complex39);
        org.apache.commons.math.complex.Complex complex43 = complex23.add(complex37);
        org.apache.commons.math.complex.Complex complex44 = complex43.conjugate();
        org.apache.commons.math.complex.Complex complex45 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex46 = complex45.atan();
        org.apache.commons.math.complex.Complex complex47 = complex46.cosh();
        org.apache.commons.math.complex.Complex complex48 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex49 = complex48.atan();
        org.apache.commons.math.complex.Complex complex50 = complex49.cosh();
        org.apache.commons.math.complex.Complex complex51 = complex50.tanh();
        org.apache.commons.math.complex.Complex complex52 = complex50.exp();
        org.apache.commons.math.complex.Complex complex53 = complex46.add(complex50);
        org.apache.commons.math.complex.Complex complex54 = complex43.multiply(complex50);
        org.apache.commons.math.complex.Complex complex55 = complex18.divide(complex50);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex43 and complex44", complex43.equals(complex44) ? complex43.hashCode() == complex44.hashCode() : true);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        double double8 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex9 = complex4.divide(complex7);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.atan();
        org.apache.commons.math.complex.Complex complex12 = complex11.sqrt();
        org.apache.commons.math.complex.Complex complex13 = complex11.tanh();
        org.apache.commons.math.complex.Complex complex14 = complex7.multiply(complex13);
        org.apache.commons.math.complex.Complex complex15 = complex13.exp();
        org.apache.commons.math.complex.Complex complex16 = complex15.acos();
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex18 = complex17.atan();
        org.apache.commons.math.complex.Complex complex19 = complex18.sqrt();
        org.apache.commons.math.complex.Complex complex21 = complex19.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex23 = complex19.multiply(complex22);
        org.apache.commons.math.complex.Complex complex24 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex25 = complex24.atan();
        org.apache.commons.math.complex.Complex complex26 = complex25.cosh();
        org.apache.commons.math.complex.Complex complex27 = complex26.tanh();
        org.apache.commons.math.complex.Complex complex28 = complex27.sinh();
        org.apache.commons.math.complex.Complex complex29 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex30 = complex29.atan();
        org.apache.commons.math.complex.Complex complex31 = complex30.cosh();
        double double32 = complex31.getArgument();
        org.apache.commons.math.complex.Complex complex33 = complex28.divide(complex31);
        java.lang.String str34 = complex33.toString();
        org.apache.commons.math.complex.Complex complex35 = complex33.sqrt1z();
        org.apache.commons.math.complex.Complex complex36 = complex35.tan();
        org.apache.commons.math.complex.Complex complex37 = complex19.add(complex36);
        org.apache.commons.math.complex.Complex complex38 = complex16.pow(complex37);
        org.apache.commons.math.complex.Complex complex39 = complex38.log();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex16", complex0.equals(complex16) ? complex0.hashCode() == complex16.hashCode() : true);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.asin();
        org.apache.commons.math.complex.ComplexField complexField4 = complex2.getField();
        java.lang.String str5 = complex2.toString();
        org.apache.commons.math.complex.Complex complex6 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex7 = complex6.cos();
        boolean boolean8 = complex6.isInfinite();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex7", complex2.equals(complex7) ? complex2.hashCode() == complex7.hashCode() : true);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        double double8 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex9 = complex4.divide(complex7);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.atan();
        org.apache.commons.math.complex.Complex complex12 = complex11.sqrt();
        org.apache.commons.math.complex.Complex complex13 = complex11.tanh();
        org.apache.commons.math.complex.Complex complex14 = complex7.multiply(complex13);
        org.apache.commons.math.complex.Complex complex15 = complex13.exp();
        org.apache.commons.math.complex.Complex complex16 = complex13.atan();
        org.apache.commons.math.complex.Complex complex17 = complex13.cos();
        org.apache.commons.math.complex.Complex complex18 = complex13.acos();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex17", complex2.equals(complex17) ? complex2.hashCode() == complex17.hashCode() : true);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex4 = complex3.atan();
        org.apache.commons.math.complex.Complex complex5 = complex4.cosh();
        org.apache.commons.math.complex.Complex complex6 = complex5.tanh();
        org.apache.commons.math.complex.Complex complex7 = complex5.exp();
        org.apache.commons.math.complex.Complex complex8 = complex1.add(complex5);
        org.apache.commons.math.complex.Complex complex9 = complex1.sqrt1z();
        org.apache.commons.math.complex.Complex complex10 = complex1.conjugate();
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex12 = complex11.atan();
        org.apache.commons.math.complex.Complex complex13 = complex12.cosh();
        org.apache.commons.math.complex.Complex complex14 = complex13.tanh();
        org.apache.commons.math.complex.Complex complex15 = complex14.sinh();
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex17 = complex16.atan();
        org.apache.commons.math.complex.Complex complex18 = complex17.cosh();
        double double19 = complex18.getArgument();
        org.apache.commons.math.complex.Complex complex20 = complex15.divide(complex18);
        org.apache.commons.math.complex.Complex complex21 = complex15.log();
        org.apache.commons.math.complex.Complex complex22 = complex21.cos();
        org.apache.commons.math.complex.Complex complex23 = complex22.sqrt1z();
        double double24 = complex23.getImaginary();
        org.apache.commons.math.complex.Complex complex25 = complex23.negate();
        org.apache.commons.math.complex.Complex complex26 = complex23.cosh();
        org.apache.commons.math.complex.Complex complex27 = complex23.sqrt();
        org.apache.commons.math.complex.Complex complex28 = complex27.cos();
        boolean boolean29 = complex1.equals((java.lang.Object) complex27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex10", complex0.equals(complex10) ? complex0.hashCode() == complex10.hashCode() : true);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex4 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex5 = complex4.tanh();
        org.apache.commons.math.complex.Complex complex6 = complex1.subtract(complex4);
        double double7 = complex6.getImaginary();
        org.apache.commons.math.complex.Complex complex8 = complex6.asin();
        double double9 = complex6.abs();
        org.apache.commons.math.complex.Complex complex11 = complex6.multiply((double) (byte) 0);
        org.apache.commons.math.complex.Complex complex12 = complex11.sinh();
        org.apache.commons.math.complex.Complex complex13 = complex12.cos();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex11", complex0.equals(complex11) ? complex0.hashCode() == complex11.hashCode() : true);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        double double8 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex9 = complex4.divide(complex7);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.atan();
        org.apache.commons.math.complex.Complex complex12 = complex11.sqrt();
        org.apache.commons.math.complex.Complex complex13 = complex11.tanh();
        org.apache.commons.math.complex.Complex complex14 = complex7.multiply(complex13);
        org.apache.commons.math.complex.Complex complex15 = complex13.cos();
        java.lang.String str16 = complex15.toString();
        org.apache.commons.math.complex.Complex complex17 = complex15.cosh();
        org.apache.commons.math.complex.Complex complex18 = complex15.exp();
        org.apache.commons.math.complex.Complex complex19 = complex18.cos();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex15", complex2.equals(complex15) ? complex2.hashCode() == complex15.hashCode() : true);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex4 = complex3.atan();
        org.apache.commons.math.complex.Complex complex5 = complex4.cosh();
        org.apache.commons.math.complex.Complex complex6 = complex5.tanh();
        org.apache.commons.math.complex.Complex complex7 = complex5.exp();
        org.apache.commons.math.complex.Complex complex8 = complex1.add(complex5);
        org.apache.commons.math.complex.Complex complex9 = complex1.sqrt1z();
        org.apache.commons.math.complex.Complex complex10 = complex1.conjugate();
        org.apache.commons.math.complex.Complex complex11 = complex1.sqrt1z();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex10", complex0.equals(complex10) ? complex0.hashCode() == complex10.hashCode() : true);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex5 = complex2.tan();
        java.lang.String str6 = complex5.toString();
        org.apache.commons.math.complex.Complex complex7 = complex5.cos();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.atan();
        org.apache.commons.math.complex.Complex complex10 = complex9.cosh();
        org.apache.commons.math.complex.Complex complex11 = complex10.tanh();
        java.util.List<org.apache.commons.math.complex.Complex> complexList13 = complex10.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex14 = complex10.sinh();
        org.apache.commons.math.complex.Complex complex15 = complex14.negate();
        boolean boolean16 = complex14.isNaN();
        org.apache.commons.math.complex.Complex complex17 = complex7.pow(complex14);
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex19 = complex18.atan();
        org.apache.commons.math.complex.Complex complex20 = complex19.cosh();
        org.apache.commons.math.complex.Complex complex21 = complex20.tanh();
        org.apache.commons.math.complex.Complex complex22 = complex20.exp();
        org.apache.commons.math.complex.Complex complex23 = complex20.exp();
        org.apache.commons.math.complex.Complex complex24 = complex23.sqrt();
        double double25 = complex23.getImaginary();
        org.apache.commons.math.complex.Complex complex26 = complex23.cosh();
        org.apache.commons.math.complex.Complex complex29 = new org.apache.commons.math.complex.Complex((double) 0.0f, (double) (short) -1);
        org.apache.commons.math.complex.Complex complex30 = complex26.multiply(complex29);
        org.apache.commons.math.complex.Complex complex31 = complex14.pow(complex30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex7 and complex10", complex7.equals(complex10) ? complex7.hashCode() == complex10.hashCode() : true);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex4 = complex3.atan();
        org.apache.commons.math.complex.Complex complex5 = complex4.cosh();
        org.apache.commons.math.complex.Complex complex6 = complex5.tanh();
        org.apache.commons.math.complex.Complex complex7 = complex5.exp();
        org.apache.commons.math.complex.Complex complex8 = complex1.add(complex5);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex10 = complex9.atan();
        org.apache.commons.math.complex.Complex complex11 = complex10.cosh();
        org.apache.commons.math.complex.Complex complex12 = complex11.tanh();
        org.apache.commons.math.complex.Complex complex13 = complex12.sinh();
        boolean boolean14 = complex12.isInfinite();
        org.apache.commons.math.complex.Complex complex15 = complex1.subtract(complex12);
        java.lang.String str16 = complex15.toString();
        java.lang.String str17 = complex15.toString();
        org.apache.commons.math.complex.Complex complex19 = complex15.multiply((double) (byte) -1);
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex21 = complex20.atan();
        org.apache.commons.math.complex.Complex complex22 = complex21.cosh();
        org.apache.commons.math.complex.Complex complex23 = complex22.tanh();
        org.apache.commons.math.complex.Complex complex24 = complex23.sinh();
        org.apache.commons.math.complex.Complex complex25 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex26 = complex25.atan();
        org.apache.commons.math.complex.Complex complex27 = complex26.cosh();
        double double28 = complex27.getArgument();
        org.apache.commons.math.complex.Complex complex29 = complex24.divide(complex27);
        java.lang.String str30 = complex29.toString();
        org.apache.commons.math.complex.Complex complex31 = complex29.sqrt1z();
        org.apache.commons.math.complex.Complex complex32 = complex19.multiply(complex31);
        org.apache.commons.math.complex.Complex complex33 = complex31.exp();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex6 and complex19", complex6.equals(complex19) ? complex6.hashCode() == complex19.hashCode() : true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.asin();
        boolean boolean4 = complex2.isInfinite();
        org.apache.commons.math.complex.Complex complex6 = complex2.multiply((double) 0);
        org.apache.commons.math.complex.Complex complex7 = complex2.acos();
        org.apache.commons.math.complex.Complex complex8 = complex7.acos();
        org.apache.commons.math.complex.Complex complex9 = complex8.sin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex7", complex0.equals(complex7) ? complex0.hashCode() == complex7.hashCode() : true);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        java.lang.String str4 = complex3.toString();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.atan();
        org.apache.commons.math.complex.Complex complex10 = complex9.cosh();
        org.apache.commons.math.complex.Complex complex11 = complex10.tanh();
        org.apache.commons.math.complex.Complex complex12 = complex10.exp();
        org.apache.commons.math.complex.Complex complex13 = complex6.add(complex10);
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex15 = complex14.atan();
        org.apache.commons.math.complex.Complex complex16 = complex15.cosh();
        org.apache.commons.math.complex.Complex complex17 = complex16.tanh();
        org.apache.commons.math.complex.Complex complex18 = complex17.sinh();
        boolean boolean19 = complex17.isInfinite();
        org.apache.commons.math.complex.Complex complex20 = complex6.subtract(complex17);
        org.apache.commons.math.complex.Complex complex21 = complex3.divide(complex20);
        org.apache.commons.math.complex.Complex complex22 = complex20.conjugate();
        org.apache.commons.math.complex.Complex complex23 = complex22.sin();
        org.apache.commons.math.complex.Complex complex25 = complex23.multiply(10.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex20 and complex22", complex20.equals(complex22) ? complex20.hashCode() == complex22.hashCode() : true);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex4 = complex3.atan();
        org.apache.commons.math.complex.Complex complex5 = complex4.cosh();
        org.apache.commons.math.complex.Complex complex6 = complex5.tanh();
        org.apache.commons.math.complex.Complex complex7 = complex6.sinh();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.atan();
        org.apache.commons.math.complex.Complex complex10 = complex9.cosh();
        double double11 = complex10.getArgument();
        org.apache.commons.math.complex.Complex complex12 = complex7.divide(complex10);
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex14 = complex13.atan();
        org.apache.commons.math.complex.Complex complex15 = complex14.sqrt();
        org.apache.commons.math.complex.Complex complex16 = complex14.tanh();
        org.apache.commons.math.complex.Complex complex17 = complex10.multiply(complex16);
        org.apache.commons.math.complex.Complex complex18 = complex1.pow(complex16);
        org.apache.commons.math.complex.Complex complex19 = complex16.cos();
        org.apache.commons.math.complex.Complex complex20 = complex19.sqrt1z();
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex22 = complex21.tanh();
        org.apache.commons.math.complex.Complex complex23 = complex22.sqrt1z();
        org.apache.commons.math.complex.Complex complex24 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex25 = complex24.atan();
        org.apache.commons.math.complex.Complex complex26 = complex25.sqrt();
        org.apache.commons.math.complex.Complex complex28 = complex26.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex29 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex30 = complex26.multiply(complex29);
        org.apache.commons.math.complex.Complex complex31 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex32 = complex31.atan();
        org.apache.commons.math.complex.Complex complex33 = complex32.cosh();
        org.apache.commons.math.complex.Complex complex34 = complex33.tanh();
        org.apache.commons.math.complex.Complex complex35 = complex34.sinh();
        org.apache.commons.math.complex.Complex complex36 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex37 = complex36.atan();
        org.apache.commons.math.complex.Complex complex38 = complex37.cosh();
        double double39 = complex38.getArgument();
        org.apache.commons.math.complex.Complex complex40 = complex35.divide(complex38);
        java.lang.String str41 = complex40.toString();
        org.apache.commons.math.complex.Complex complex42 = complex40.sqrt1z();
        org.apache.commons.math.complex.Complex complex43 = complex42.tan();
        org.apache.commons.math.complex.Complex complex44 = complex26.add(complex43);
        org.apache.commons.math.complex.Complex complex45 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex46 = complex45.atan();
        org.apache.commons.math.complex.Complex complex47 = complex46.cosh();
        org.apache.commons.math.complex.Complex complex48 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex49 = complex48.atan();
        org.apache.commons.math.complex.Complex complex50 = complex49.cosh();
        org.apache.commons.math.complex.Complex complex51 = complex50.tanh();
        org.apache.commons.math.complex.Complex complex52 = complex50.exp();
        org.apache.commons.math.complex.Complex complex53 = complex46.add(complex50);
        org.apache.commons.math.complex.Complex complex54 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex55 = complex54.atan();
        org.apache.commons.math.complex.Complex complex56 = complex55.cosh();
        org.apache.commons.math.complex.Complex complex57 = complex56.tanh();
        org.apache.commons.math.complex.Complex complex58 = complex57.sinh();
        boolean boolean59 = complex57.isInfinite();
        org.apache.commons.math.complex.Complex complex60 = complex46.subtract(complex57);
        java.lang.String str61 = complex60.toString();
        org.apache.commons.math.complex.Complex complex62 = complex60.sqrt();
        org.apache.commons.math.complex.Complex complex63 = complex44.divide(complex62);
        org.apache.commons.math.complex.Complex complex64 = complex44.cosh();
        org.apache.commons.math.complex.Complex complex65 = complex22.divide(complex64);
        org.apache.commons.math.complex.Complex complex66 = complex19.add(complex65);
        org.apache.commons.math.complex.Complex complex67 = complex66.tan();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex5 and complex19", complex5.equals(complex19) ? complex5.hashCode() == complex19.hashCode() : true);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex5 = complex2.tan();
        java.lang.String str6 = complex5.toString();
        org.apache.commons.math.complex.Complex complex7 = complex5.cos();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.atan();
        org.apache.commons.math.complex.Complex complex10 = complex9.cosh();
        org.apache.commons.math.complex.Complex complex11 = complex10.tanh();
        java.util.List<org.apache.commons.math.complex.Complex> complexList13 = complex10.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex14 = complex10.sinh();
        org.apache.commons.math.complex.Complex complex15 = complex14.negate();
        boolean boolean16 = complex14.isNaN();
        org.apache.commons.math.complex.Complex complex17 = complex7.pow(complex14);
        java.util.List<org.apache.commons.math.complex.Complex> complexList19 = complex17.nthRoot(10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex7 and complex10", complex7.equals(complex10) ? complex7.hashCode() == complex10.hashCode() : true);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        double double3 = complex2.getImaginary();
        double double4 = complex2.getReal();
        org.apache.commons.math.complex.Complex complex5 = complex2.log();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex7 = complex6.atan();
        org.apache.commons.math.complex.Complex complex8 = complex7.cosh();
        org.apache.commons.math.complex.Complex complex9 = complex8.tanh();
        org.apache.commons.math.complex.Complex complex10 = complex9.sinh();
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex12 = complex11.atan();
        org.apache.commons.math.complex.Complex complex13 = complex12.cosh();
        double double14 = complex13.getArgument();
        org.apache.commons.math.complex.Complex complex15 = complex10.divide(complex13);
        java.lang.String str16 = complex15.toString();
        org.apache.commons.math.complex.Complex complex17 = complex15.sqrt1z();
        org.apache.commons.math.complex.Complex complex18 = complex17.tan();
        org.apache.commons.math.complex.Complex complex19 = complex17.cosh();
        org.apache.commons.math.complex.Complex complex20 = complex19.cosh();
        org.apache.commons.math.complex.Complex complex21 = complex5.subtract(complex20);
        org.apache.commons.math.complex.Complex complex22 = complex5.negate();
        org.apache.commons.math.complex.Complex complex23 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex24 = complex23.atan();
        org.apache.commons.math.complex.Complex complex25 = complex24.cosh();
        org.apache.commons.math.complex.Complex complex26 = complex25.tanh();
        org.apache.commons.math.complex.Complex complex27 = complex25.exp();
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex29 = complex28.atan();
        org.apache.commons.math.complex.Complex complex30 = complex29.atan();
        org.apache.commons.math.complex.Complex complex31 = complex27.add(complex30);
        org.apache.commons.math.complex.Complex complex32 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex33 = complex32.atan();
        org.apache.commons.math.complex.Complex complex34 = complex33.cosh();
        org.apache.commons.math.complex.Complex complex35 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex36 = complex35.atan();
        org.apache.commons.math.complex.Complex complex37 = complex36.cosh();
        org.apache.commons.math.complex.Complex complex38 = complex37.tanh();
        org.apache.commons.math.complex.Complex complex39 = complex37.exp();
        org.apache.commons.math.complex.Complex complex40 = complex33.add(complex37);
        org.apache.commons.math.complex.Complex complex41 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex42 = complex41.atan();
        org.apache.commons.math.complex.Complex complex43 = complex42.cosh();
        org.apache.commons.math.complex.Complex complex44 = complex43.tanh();
        org.apache.commons.math.complex.Complex complex45 = complex44.sinh();
        boolean boolean46 = complex44.isInfinite();
        org.apache.commons.math.complex.Complex complex47 = complex33.subtract(complex44);
        org.apache.commons.math.complex.Complex complex48 = complex33.negate();
        org.apache.commons.math.complex.Complex complex49 = complex27.multiply(complex48);
        org.apache.commons.math.complex.Complex complex50 = complex5.subtract(complex27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex49", complex0.equals(complex49) ? complex0.hashCode() == complex49.hashCode() : true);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex6 = complex2.multiply(complex5);
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex8 = complex7.atan();
        org.apache.commons.math.complex.Complex complex9 = complex8.cosh();
        org.apache.commons.math.complex.Complex complex10 = complex9.asin();
        org.apache.commons.math.complex.Complex complex11 = complex5.add(complex10);
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex13 = complex12.atan();
        org.apache.commons.math.complex.Complex complex14 = complex11.multiply(complex13);
        org.apache.commons.math.complex.Complex complex15 = complex11.tanh();
        org.apache.commons.math.complex.Complex complex16 = complex11.asin();
        org.apache.commons.math.complex.Complex complex17 = complex16.sinh();
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex19 = complex18.sqrt1z();
        org.apache.commons.math.complex.Complex complex22 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex23 = complex22.tanh();
        org.apache.commons.math.complex.Complex complex24 = complex19.subtract(complex22);
        double double25 = complex24.getImaginary();
        org.apache.commons.math.complex.Complex complex26 = complex24.asin();
        double double27 = complex24.abs();
        org.apache.commons.math.complex.Complex complex29 = complex24.multiply((double) (byte) 0);
        org.apache.commons.math.complex.Complex complex30 = complex29.sinh();
        org.apache.commons.math.complex.Complex complex31 = complex17.multiply(complex29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex30", complex0.equals(complex30) ? complex0.hashCode() == complex30.hashCode() : true);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex4 = complex3.atan();
        org.apache.commons.math.complex.Complex complex5 = complex4.cosh();
        org.apache.commons.math.complex.Complex complex6 = complex5.tanh();
        org.apache.commons.math.complex.Complex complex7 = complex5.exp();
        org.apache.commons.math.complex.Complex complex8 = complex1.add(complex5);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex10 = complex9.atan();
        org.apache.commons.math.complex.Complex complex11 = complex10.cosh();
        org.apache.commons.math.complex.Complex complex12 = complex11.tanh();
        org.apache.commons.math.complex.Complex complex13 = complex12.sinh();
        boolean boolean14 = complex12.isInfinite();
        org.apache.commons.math.complex.Complex complex15 = complex1.subtract(complex12);
        java.lang.String str16 = complex15.toString();
        boolean boolean17 = complex15.isInfinite();
        org.apache.commons.math.complex.Complex complex18 = complex15.negate();
        org.apache.commons.math.complex.Complex complex19 = complex15.log();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex6 and complex18", complex6.equals(complex18) ? complex6.hashCode() == complex18.hashCode() : true);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        double double8 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex9 = complex4.divide(complex7);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.atan();
        org.apache.commons.math.complex.Complex complex12 = complex11.sqrt();
        org.apache.commons.math.complex.Complex complex13 = complex11.tanh();
        org.apache.commons.math.complex.Complex complex14 = complex7.multiply(complex13);
        org.apache.commons.math.complex.Complex complex15 = complex13.exp();
        double double16 = complex13.abs();
        org.apache.commons.math.complex.Complex complex17 = complex13.atan();
        org.apache.commons.math.complex.Complex complex18 = complex13.conjugate();
        org.apache.commons.math.complex.Complex complex19 = complex18.cos();
        org.apache.commons.math.complex.Complex complex21 = complex19.multiply(1.3398244685804683d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex18", complex0.equals(complex18) ? complex0.hashCode() == complex18.hashCode() : true);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex6 = complex2.multiply(complex5);
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex8 = complex7.atan();
        org.apache.commons.math.complex.Complex complex9 = complex8.cosh();
        org.apache.commons.math.complex.Complex complex10 = complex9.asin();
        org.apache.commons.math.complex.Complex complex11 = complex5.add(complex10);
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex13 = complex12.atan();
        org.apache.commons.math.complex.Complex complex14 = complex11.multiply(complex13);
        org.apache.commons.math.complex.Complex complex15 = complex14.atan();
        double double16 = complex15.abs();
        org.apache.commons.math.complex.Complex complex17 = complex15.conjugate();
        org.apache.commons.math.complex.Complex complex18 = complex17.exp();
        org.apache.commons.math.complex.Complex complex19 = complex18.sinh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex17", complex0.equals(complex17) ? complex0.hashCode() == complex17.hashCode() : true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        double double8 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex9 = complex4.divide(complex7);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.atan();
        org.apache.commons.math.complex.Complex complex12 = complex11.sqrt();
        org.apache.commons.math.complex.Complex complex13 = complex11.tanh();
        org.apache.commons.math.complex.Complex complex14 = complex7.multiply(complex13);
        org.apache.commons.math.complex.Complex complex15 = complex13.cos();
        java.lang.String str16 = complex15.toString();
        org.apache.commons.math.complex.Complex complex17 = complex15.cosh();
        org.apache.commons.math.complex.Complex complex18 = complex15.exp();
        boolean boolean19 = complex18.isInfinite();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex15", complex2.equals(complex15) ? complex2.hashCode() == complex15.hashCode() : true);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex2 = complex1.atan();
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex5 = complex4.atan();
        org.apache.commons.math.complex.Complex complex6 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex7 = complex6.tanh();
        org.apache.commons.math.complex.Complex complex8 = complex6.exp();
        org.apache.commons.math.complex.Complex complex9 = complex2.add(complex6);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.atan();
        org.apache.commons.math.complex.Complex complex12 = complex11.cosh();
        org.apache.commons.math.complex.Complex complex13 = complex12.tanh();
        org.apache.commons.math.complex.Complex complex14 = complex13.sinh();
        boolean boolean15 = complex13.isInfinite();
        org.apache.commons.math.complex.Complex complex16 = complex2.subtract(complex13);
        org.apache.commons.math.complex.Complex complex17 = complex0.add(complex2);
        org.apache.commons.math.complex.Complex complex18 = complex0.cos();
        org.apache.commons.math.complex.Complex complex19 = complex18.tan();
        org.apache.commons.math.complex.Complex complex20 = complex18.asin();
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex22 = complex21.atan();
        org.apache.commons.math.complex.Complex complex23 = complex22.cosh();
        org.apache.commons.math.complex.Complex complex24 = complex23.tanh();
        org.apache.commons.math.complex.Complex complex25 = complex24.sinh();
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex27 = complex26.atan();
        org.apache.commons.math.complex.Complex complex28 = complex27.cosh();
        double double29 = complex28.getArgument();
        org.apache.commons.math.complex.Complex complex30 = complex25.divide(complex28);
        org.apache.commons.math.complex.Complex complex31 = complex25.log();
        org.apache.commons.math.complex.Complex complex32 = complex31.cos();
        org.apache.commons.math.complex.Complex complex33 = complex31.exp();
        org.apache.commons.math.complex.Complex complex34 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex35 = complex34.atan();
        org.apache.commons.math.complex.Complex complex36 = complex35.cosh();
        org.apache.commons.math.complex.Complex complex37 = complex36.asin();
        org.apache.commons.math.complex.ComplexField complexField38 = complex36.getField();
        org.apache.commons.math.complex.Complex complex39 = complex36.tanh();
        org.apache.commons.math.complex.Complex complex40 = complex36.log();
        org.apache.commons.math.complex.Complex complex41 = complex40.cosh();
        org.apache.commons.math.complex.Complex complex42 = complex31.multiply(complex40);
        org.apache.commons.math.complex.Complex complex43 = complex18.add(complex42);
        org.apache.commons.math.complex.Complex complex44 = complex43.cos();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex42", complex1.equals(complex42) ? complex1.hashCode() == complex42.hashCode() : true);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        double double8 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex9 = complex4.divide(complex7);
        org.apache.commons.math.complex.Complex complex10 = complex4.log();
        org.apache.commons.math.complex.Complex complex11 = complex10.cos();
        org.apache.commons.math.complex.Complex complex12 = complex10.exp();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex14 = complex13.atan();
        org.apache.commons.math.complex.Complex complex15 = complex14.cosh();
        org.apache.commons.math.complex.Complex complex16 = complex15.asin();
        org.apache.commons.math.complex.ComplexField complexField17 = complex15.getField();
        org.apache.commons.math.complex.Complex complex18 = complex15.tanh();
        org.apache.commons.math.complex.Complex complex19 = complex15.log();
        org.apache.commons.math.complex.Complex complex20 = complex19.cosh();
        org.apache.commons.math.complex.Complex complex21 = complex10.multiply(complex19);
        org.apache.commons.math.complex.Complex complex22 = complex21.cosh();
        org.apache.commons.math.complex.Complex complex23 = complex22.tan();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex21", complex0.equals(complex21) ? complex0.hashCode() == complex21.hashCode() : true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex5 = complex2.tan();
        org.apache.commons.math.complex.Complex complex6 = complex2.acos();
        org.apache.commons.math.complex.Complex complex7 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex8 = complex7.acos();
        org.apache.commons.math.complex.Complex complex9 = complex7.cos();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex8", complex0.equals(complex8) ? complex0.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.asin();
        org.apache.commons.math.complex.Complex complex4 = complex3.tan();
        org.apache.commons.math.complex.Complex complex5 = complex3.sqrt();
        boolean boolean7 = complex3.equals((java.lang.Object) (-1.0f));
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.atan();
        org.apache.commons.math.complex.Complex complex10 = complex9.cosh();
        org.apache.commons.math.complex.Complex complex11 = complex10.tanh();
        org.apache.commons.math.complex.Complex complex12 = complex11.sinh();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex14 = complex13.atan();
        org.apache.commons.math.complex.Complex complex15 = complex14.cosh();
        double double16 = complex15.getArgument();
        org.apache.commons.math.complex.Complex complex17 = complex12.divide(complex15);
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex19 = complex18.atan();
        org.apache.commons.math.complex.Complex complex20 = complex19.sqrt();
        org.apache.commons.math.complex.Complex complex21 = complex19.tanh();
        org.apache.commons.math.complex.Complex complex22 = complex15.multiply(complex21);
        org.apache.commons.math.complex.Complex complex23 = complex15.tanh();
        org.apache.commons.math.complex.Complex complex24 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex25 = complex24.atan();
        org.apache.commons.math.complex.Complex complex26 = complex25.sqrt();
        org.apache.commons.math.complex.Complex complex28 = complex26.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex29 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex30 = complex26.multiply(complex29);
        org.apache.commons.math.complex.Complex complex31 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex32 = complex31.atan();
        org.apache.commons.math.complex.Complex complex33 = complex32.cosh();
        org.apache.commons.math.complex.Complex complex34 = complex33.asin();
        org.apache.commons.math.complex.Complex complex35 = complex29.add(complex34);
        org.apache.commons.math.complex.Complex complex36 = complex35.conjugate();
        org.apache.commons.math.complex.Complex complex37 = complex36.conjugate();
        org.apache.commons.math.complex.Complex complex38 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex39 = complex38.atan();
        org.apache.commons.math.complex.Complex complex40 = complex39.cosh();
        org.apache.commons.math.complex.Complex complex41 = complex40.tanh();
        org.apache.commons.math.complex.Complex complex42 = complex41.sinh();
        org.apache.commons.math.complex.Complex complex43 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex44 = complex43.atan();
        org.apache.commons.math.complex.Complex complex45 = complex44.cosh();
        double double46 = complex45.getArgument();
        org.apache.commons.math.complex.Complex complex47 = complex42.divide(complex45);
        org.apache.commons.math.complex.Complex complex48 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex49 = complex48.atan();
        org.apache.commons.math.complex.Complex complex50 = complex49.sqrt();
        org.apache.commons.math.complex.Complex complex51 = complex49.tanh();
        org.apache.commons.math.complex.Complex complex52 = complex45.multiply(complex51);
        org.apache.commons.math.complex.Complex complex53 = complex51.exp();
        double double54 = complex51.abs();
        org.apache.commons.math.complex.Complex complex55 = complex51.atan();
        org.apache.commons.math.complex.Complex complex56 = complex55.exp();
        org.apache.commons.math.complex.Complex complex57 = complex36.add(complex55);
        org.apache.commons.math.complex.Complex complex58 = complex15.add(complex57);
        double double59 = complex15.getReal();
        org.apache.commons.math.complex.Complex complex60 = complex3.multiply(complex15);
        org.apache.commons.math.complex.Complex complex61 = complex60.tan();
        org.apache.commons.math.complex.Complex complex62 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex63 = complex62.atan();
        org.apache.commons.math.complex.Complex complex64 = complex63.cosh();
        org.apache.commons.math.complex.Complex complex65 = complex64.tanh();
        org.apache.commons.math.complex.Complex complex66 = complex65.sinh();
        org.apache.commons.math.complex.Complex complex67 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex68 = complex67.atan();
        org.apache.commons.math.complex.Complex complex69 = complex68.cosh();
        double double70 = complex69.getArgument();
        org.apache.commons.math.complex.Complex complex71 = complex66.divide(complex69);
        org.apache.commons.math.complex.Complex complex72 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex73 = complex72.atan();
        org.apache.commons.math.complex.Complex complex74 = complex73.sqrt();
        org.apache.commons.math.complex.Complex complex75 = complex73.tanh();
        org.apache.commons.math.complex.Complex complex76 = complex69.multiply(complex75);
        org.apache.commons.math.complex.Complex complex77 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex78 = complex77.atan();
        org.apache.commons.math.complex.Complex complex79 = complex78.cosh();
        org.apache.commons.math.complex.Complex complex80 = complex79.tanh();
        org.apache.commons.math.complex.Complex complex81 = complex80.sinh();
        org.apache.commons.math.complex.Complex complex82 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex83 = complex82.atan();
        org.apache.commons.math.complex.Complex complex84 = complex83.cosh();
        double double85 = complex84.getArgument();
        org.apache.commons.math.complex.Complex complex86 = complex81.divide(complex84);
        org.apache.commons.math.complex.Complex complex87 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex88 = complex87.atan();
        org.apache.commons.math.complex.Complex complex89 = complex88.sqrt();
        org.apache.commons.math.complex.Complex complex90 = complex88.tanh();
        org.apache.commons.math.complex.Complex complex91 = complex84.multiply(complex90);
        org.apache.commons.math.complex.Complex complex92 = complex69.divide(complex91);
        org.apache.commons.math.complex.Complex complex93 = complex69.cos();
        boolean boolean94 = complex93.isInfinite();
        org.apache.commons.math.complex.Complex complex95 = complex61.add(complex93);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex60", complex3.equals(complex60) ? complex3.hashCode() == complex60.hashCode() : true);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.abs();
        org.apache.commons.math.complex.Complex complex2 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex3 = complex0.sin();
        org.apache.commons.math.complex.Complex complex4 = complex3.conjugate();
        org.apache.commons.math.complex.Complex complex5 = complex3.log();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex4", complex0.equals(complex4) ? complex0.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        double double8 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex9 = complex4.divide(complex7);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.atan();
        org.apache.commons.math.complex.Complex complex12 = complex11.sqrt();
        org.apache.commons.math.complex.Complex complex13 = complex11.tanh();
        org.apache.commons.math.complex.Complex complex14 = complex7.multiply(complex13);
        org.apache.commons.math.complex.Complex complex15 = complex13.exp();
        org.apache.commons.math.complex.Complex complex16 = complex15.acos();
        org.apache.commons.math.complex.Complex complex17 = complex16.log();
        double double18 = complex17.getImaginary();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex16", complex0.equals(complex16) ? complex0.hashCode() == complex16.hashCode() : true);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex4 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex5 = complex4.tanh();
        org.apache.commons.math.complex.Complex complex6 = complex1.subtract(complex4);
        double double7 = complex6.getImaginary();
        org.apache.commons.math.complex.Complex complex8 = complex6.asin();
        double double9 = complex6.abs();
        org.apache.commons.math.complex.Complex complex11 = complex6.multiply((double) (byte) 0);
        org.apache.commons.math.complex.Complex complex12 = complex11.sinh();
        double double13 = complex12.getArgument();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex11", complex0.equals(complex11) ? complex0.hashCode() == complex11.hashCode() : true);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex4 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex5 = complex4.tanh();
        org.apache.commons.math.complex.Complex complex6 = complex1.subtract(complex4);
        double double7 = complex1.getArgument();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.sqrt1z();
        org.apache.commons.math.complex.Complex complex12 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex13 = complex12.tanh();
        org.apache.commons.math.complex.Complex complex14 = complex9.subtract(complex12);
        double double15 = complex14.getImaginary();
        org.apache.commons.math.complex.Complex complex16 = complex14.asin();
        org.apache.commons.math.complex.Complex complex17 = complex14.cos();
        org.apache.commons.math.complex.Complex complex19 = complex17.multiply(1.0d);
        org.apache.commons.math.complex.Complex complex20 = complex1.subtract(complex19);
        org.apache.commons.math.complex.Complex complex21 = complex1.sqrt1z();
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex23 = complex22.atan();
        org.apache.commons.math.complex.Complex complex24 = complex23.cosh();
        org.apache.commons.math.complex.Complex complex25 = complex24.tanh();
        org.apache.commons.math.complex.Complex complex26 = complex25.sinh();
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex28 = complex27.atan();
        org.apache.commons.math.complex.Complex complex29 = complex28.cosh();
        double double30 = complex29.getArgument();
        org.apache.commons.math.complex.Complex complex31 = complex26.divide(complex29);
        org.apache.commons.math.complex.Complex complex32 = complex26.log();
        org.apache.commons.math.complex.Complex complex33 = complex32.cos();
        org.apache.commons.math.complex.Complex complex34 = complex32.exp();
        org.apache.commons.math.complex.Complex complex35 = complex32.acos();
        org.apache.commons.math.complex.Complex complex36 = complex32.log();
        org.apache.commons.math.complex.Complex complex37 = complex32.tanh();
        org.apache.commons.math.complex.Complex complex38 = complex1.multiply(complex37);
        boolean boolean39 = complex1.isNaN();
        org.apache.commons.math.complex.Complex complex40 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex41 = complex40.atan();
        org.apache.commons.math.complex.Complex complex42 = complex41.sqrt();
        org.apache.commons.math.complex.Complex complex44 = complex42.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex45 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex46 = complex42.multiply(complex45);
        org.apache.commons.math.complex.Complex complex47 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex48 = complex47.atan();
        org.apache.commons.math.complex.Complex complex49 = complex48.cosh();
        org.apache.commons.math.complex.Complex complex50 = complex49.tanh();
        org.apache.commons.math.complex.Complex complex51 = complex50.sinh();
        org.apache.commons.math.complex.Complex complex52 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex53 = complex52.atan();
        org.apache.commons.math.complex.Complex complex54 = complex53.cosh();
        double double55 = complex54.getArgument();
        org.apache.commons.math.complex.Complex complex56 = complex51.divide(complex54);
        java.lang.String str57 = complex56.toString();
        org.apache.commons.math.complex.Complex complex58 = complex56.sqrt1z();
        org.apache.commons.math.complex.Complex complex59 = complex58.tan();
        org.apache.commons.math.complex.Complex complex60 = complex42.add(complex59);
        org.apache.commons.math.complex.Complex complex61 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex62 = complex61.atan();
        org.apache.commons.math.complex.Complex complex63 = complex62.sqrt();
        org.apache.commons.math.complex.Complex complex65 = complex63.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex66 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex67 = complex63.multiply(complex66);
        org.apache.commons.math.complex.Complex complex68 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex69 = complex68.atan();
        org.apache.commons.math.complex.Complex complex70 = complex69.cosh();
        org.apache.commons.math.complex.Complex complex71 = complex70.asin();
        org.apache.commons.math.complex.Complex complex72 = complex66.add(complex71);
        org.apache.commons.math.complex.Complex complex73 = complex72.conjugate();
        org.apache.commons.math.complex.Complex complex74 = complex42.divide(complex72);
        org.apache.commons.math.complex.Complex complex75 = complex74.conjugate();
        org.apache.commons.math.complex.Complex complex76 = complex1.subtract(complex75);
        boolean boolean77 = complex1.isInfinite();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex75", complex0.equals(complex75) ? complex0.hashCode() == complex75.hashCode() : true);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex6 = complex2.multiply(complex5);
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex8 = complex7.atan();
        org.apache.commons.math.complex.Complex complex9 = complex8.cosh();
        org.apache.commons.math.complex.Complex complex10 = complex9.tanh();
        org.apache.commons.math.complex.Complex complex11 = complex10.sinh();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex13 = complex12.atan();
        org.apache.commons.math.complex.Complex complex14 = complex13.cosh();
        double double15 = complex14.getArgument();
        org.apache.commons.math.complex.Complex complex16 = complex11.divide(complex14);
        java.lang.String str17 = complex16.toString();
        org.apache.commons.math.complex.Complex complex18 = complex16.sqrt1z();
        org.apache.commons.math.complex.Complex complex19 = complex18.tan();
        org.apache.commons.math.complex.Complex complex20 = complex2.add(complex19);
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex22 = complex21.atan();
        org.apache.commons.math.complex.Complex complex23 = complex22.sqrt();
        org.apache.commons.math.complex.Complex complex25 = complex23.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex27 = complex23.multiply(complex26);
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex29 = complex28.atan();
        org.apache.commons.math.complex.Complex complex30 = complex29.cosh();
        org.apache.commons.math.complex.Complex complex31 = complex30.asin();
        org.apache.commons.math.complex.Complex complex32 = complex26.add(complex31);
        org.apache.commons.math.complex.Complex complex33 = complex32.conjugate();
        org.apache.commons.math.complex.Complex complex34 = complex2.divide(complex32);
        org.apache.commons.math.complex.Complex complex35 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex36 = complex35.atan();
        org.apache.commons.math.complex.Complex complex37 = complex36.sqrt();
        org.apache.commons.math.complex.Complex complex39 = complex37.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex40 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex41 = complex37.multiply(complex40);
        org.apache.commons.math.complex.Complex complex42 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex43 = complex42.atan();
        org.apache.commons.math.complex.Complex complex44 = complex43.cosh();
        org.apache.commons.math.complex.Complex complex45 = complex44.asin();
        org.apache.commons.math.complex.Complex complex46 = complex40.add(complex45);
        org.apache.commons.math.complex.Complex complex47 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex48 = complex47.atan();
        org.apache.commons.math.complex.Complex complex49 = complex46.multiply(complex48);
        org.apache.commons.math.complex.Complex complex50 = complex49.atan();
        org.apache.commons.math.complex.Complex complex51 = complex32.pow(complex49);
        org.apache.commons.math.complex.Complex complex52 = complex51.acos();
        org.apache.commons.math.complex.Complex complex53 = complex52.exp();
        org.apache.commons.math.complex.Complex complex54 = complex52.sqrt();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex9 and complex53", complex9.equals(complex53) ? complex9.hashCode() == complex53.hashCode() : true);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex6 = complex2.multiply(complex5);
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex8 = complex7.atan();
        org.apache.commons.math.complex.Complex complex9 = complex8.cosh();
        org.apache.commons.math.complex.Complex complex10 = complex9.tanh();
        org.apache.commons.math.complex.Complex complex11 = complex10.sinh();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex13 = complex12.atan();
        org.apache.commons.math.complex.Complex complex14 = complex13.cosh();
        double double15 = complex14.getArgument();
        org.apache.commons.math.complex.Complex complex16 = complex11.divide(complex14);
        java.lang.String str17 = complex16.toString();
        org.apache.commons.math.complex.Complex complex18 = complex16.sqrt1z();
        org.apache.commons.math.complex.Complex complex19 = complex18.tan();
        org.apache.commons.math.complex.Complex complex20 = complex2.add(complex19);
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex22 = complex21.atan();
        org.apache.commons.math.complex.Complex complex23 = complex22.sqrt();
        org.apache.commons.math.complex.Complex complex25 = complex23.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex27 = complex23.multiply(complex26);
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex29 = complex28.atan();
        org.apache.commons.math.complex.Complex complex30 = complex29.cosh();
        org.apache.commons.math.complex.Complex complex31 = complex30.asin();
        org.apache.commons.math.complex.Complex complex32 = complex26.add(complex31);
        org.apache.commons.math.complex.Complex complex33 = complex32.conjugate();
        org.apache.commons.math.complex.Complex complex34 = complex2.divide(complex32);
        org.apache.commons.math.complex.Complex complex35 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex36 = complex35.atan();
        org.apache.commons.math.complex.Complex complex37 = complex36.sqrt();
        org.apache.commons.math.complex.Complex complex39 = complex37.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex40 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex41 = complex37.multiply(complex40);
        org.apache.commons.math.complex.Complex complex42 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex43 = complex42.atan();
        org.apache.commons.math.complex.Complex complex44 = complex43.cosh();
        org.apache.commons.math.complex.Complex complex45 = complex44.asin();
        org.apache.commons.math.complex.Complex complex46 = complex40.add(complex45);
        org.apache.commons.math.complex.Complex complex47 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex48 = complex47.atan();
        org.apache.commons.math.complex.Complex complex49 = complex46.multiply(complex48);
        org.apache.commons.math.complex.Complex complex50 = complex49.atan();
        org.apache.commons.math.complex.Complex complex51 = complex32.pow(complex49);
        org.apache.commons.math.complex.Complex complex52 = complex51.tan();
        org.apache.commons.math.complex.Complex complex53 = complex51.acos();
        org.apache.commons.math.complex.Complex complex54 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex55 = complex54.atan();
        org.apache.commons.math.complex.Complex complex56 = complex55.cosh();
        org.apache.commons.math.complex.Complex complex57 = complex56.tanh();
        org.apache.commons.math.complex.Complex complex58 = complex57.sinh();
        org.apache.commons.math.complex.Complex complex59 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex60 = complex59.atan();
        org.apache.commons.math.complex.Complex complex61 = complex60.cosh();
        double double62 = complex61.getArgument();
        org.apache.commons.math.complex.Complex complex63 = complex58.divide(complex61);
        org.apache.commons.math.complex.Complex complex64 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex65 = complex64.atan();
        org.apache.commons.math.complex.Complex complex66 = complex65.sqrt();
        org.apache.commons.math.complex.Complex complex67 = complex65.tanh();
        org.apache.commons.math.complex.Complex complex68 = complex61.multiply(complex67);
        org.apache.commons.math.complex.Complex complex69 = complex67.exp();
        org.apache.commons.math.complex.Complex complex70 = complex67.atan();
        double double71 = complex70.getReal();
        org.apache.commons.math.complex.Complex complex72 = complex70.tanh();
        org.apache.commons.math.complex.Complex complex73 = complex51.subtract(complex72);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex53", complex0.equals(complex53) ? complex0.hashCode() == complex53.hashCode() : true);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex6 = complex2.multiply(complex5);
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex8 = complex7.atan();
        org.apache.commons.math.complex.Complex complex9 = complex8.cosh();
        org.apache.commons.math.complex.Complex complex10 = complex9.asin();
        org.apache.commons.math.complex.Complex complex11 = complex5.add(complex10);
        org.apache.commons.math.complex.Complex complex12 = complex11.conjugate();
        org.apache.commons.math.complex.Complex complex13 = complex12.conjugate();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex15 = complex14.atan();
        org.apache.commons.math.complex.Complex complex16 = complex15.cosh();
        org.apache.commons.math.complex.Complex complex17 = complex16.tanh();
        org.apache.commons.math.complex.Complex complex18 = complex17.sinh();
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex20 = complex19.atan();
        org.apache.commons.math.complex.Complex complex21 = complex20.cosh();
        double double22 = complex21.getArgument();
        org.apache.commons.math.complex.Complex complex23 = complex18.divide(complex21);
        org.apache.commons.math.complex.Complex complex24 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex25 = complex24.atan();
        org.apache.commons.math.complex.Complex complex26 = complex25.sqrt();
        org.apache.commons.math.complex.Complex complex27 = complex25.tanh();
        org.apache.commons.math.complex.Complex complex28 = complex21.multiply(complex27);
        org.apache.commons.math.complex.Complex complex29 = complex27.exp();
        double double30 = complex27.abs();
        org.apache.commons.math.complex.Complex complex31 = complex27.atan();
        org.apache.commons.math.complex.Complex complex32 = complex31.exp();
        org.apache.commons.math.complex.Complex complex33 = complex12.add(complex31);
        org.apache.commons.math.complex.Complex complex34 = complex31.cos();
        org.apache.commons.math.complex.Complex complex35 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex36 = complex35.sqrt1z();
        org.apache.commons.math.complex.Complex complex39 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex40 = complex39.tanh();
        org.apache.commons.math.complex.Complex complex41 = complex36.subtract(complex39);
        org.apache.commons.math.complex.Complex complex44 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex45 = complex36.pow(complex44);
        org.apache.commons.math.complex.Complex complex46 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex47 = complex46.atan();
        org.apache.commons.math.complex.Complex complex48 = complex47.sqrt();
        org.apache.commons.math.complex.Complex complex49 = complex47.tanh();
        org.apache.commons.math.complex.Complex complex50 = complex45.pow(complex47);
        org.apache.commons.math.complex.Complex complex51 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex52 = complex45.divide(complex51);
        org.apache.commons.math.complex.Complex complex53 = complex34.subtract(complex52);
        org.apache.commons.math.complex.Complex complex54 = complex53.negate();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex9 and complex34", complex9.equals(complex34) ? complex9.hashCode() == complex34.hashCode() : true);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex4 = complex3.atan();
        org.apache.commons.math.complex.Complex complex5 = complex4.cosh();
        org.apache.commons.math.complex.Complex complex6 = complex5.tanh();
        org.apache.commons.math.complex.Complex complex7 = complex6.sinh();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.atan();
        org.apache.commons.math.complex.Complex complex10 = complex9.cosh();
        double double11 = complex10.getArgument();
        org.apache.commons.math.complex.Complex complex12 = complex7.divide(complex10);
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex14 = complex13.atan();
        org.apache.commons.math.complex.Complex complex15 = complex14.sqrt();
        org.apache.commons.math.complex.Complex complex16 = complex14.tanh();
        org.apache.commons.math.complex.Complex complex17 = complex10.multiply(complex16);
        org.apache.commons.math.complex.Complex complex18 = complex1.pow(complex16);
        org.apache.commons.math.complex.Complex complex19 = complex16.sinh();
        org.apache.commons.math.complex.Complex complex20 = complex16.atan();
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex22 = complex21.atan();
        org.apache.commons.math.complex.Complex complex23 = complex22.sqrt();
        org.apache.commons.math.complex.Complex complex25 = complex23.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex27 = complex23.multiply(complex26);
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex29 = complex28.atan();
        org.apache.commons.math.complex.Complex complex30 = complex29.cosh();
        org.apache.commons.math.complex.Complex complex31 = complex30.asin();
        org.apache.commons.math.complex.Complex complex32 = complex26.add(complex31);
        double double33 = complex32.getArgument();
        org.apache.commons.math.complex.Complex complex34 = complex20.divide(complex32);
        org.apache.commons.math.complex.Complex complex35 = complex20.atan();
        org.apache.commons.math.complex.Complex complex36 = complex35.cos();
        org.apache.commons.math.complex.Complex complex37 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex38 = complex37.atan();
        org.apache.commons.math.complex.Complex complex39 = complex38.cosh();
        org.apache.commons.math.complex.Complex complex40 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex41 = complex40.atan();
        org.apache.commons.math.complex.Complex complex42 = complex41.cosh();
        org.apache.commons.math.complex.Complex complex43 = complex42.tanh();
        org.apache.commons.math.complex.Complex complex44 = complex42.exp();
        org.apache.commons.math.complex.Complex complex45 = complex38.add(complex42);
        org.apache.commons.math.complex.Complex complex46 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex47 = complex46.atan();
        org.apache.commons.math.complex.Complex complex48 = complex47.cosh();
        org.apache.commons.math.complex.Complex complex49 = complex48.tanh();
        org.apache.commons.math.complex.Complex complex50 = complex49.sinh();
        boolean boolean51 = complex49.isInfinite();
        org.apache.commons.math.complex.Complex complex52 = complex38.subtract(complex49);
        org.apache.commons.math.complex.Complex complex53 = complex49.atan();
        org.apache.commons.math.complex.Complex complex54 = complex53.sqrt1z();
        org.apache.commons.math.complex.Complex complex55 = complex35.add(complex54);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex5 and complex36", complex5.equals(complex36) ? complex5.hashCode() == complex36.hashCode() : true);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        double double8 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex9 = complex4.divide(complex7);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.atan();
        org.apache.commons.math.complex.Complex complex12 = complex11.sqrt();
        org.apache.commons.math.complex.Complex complex13 = complex11.tanh();
        org.apache.commons.math.complex.Complex complex14 = complex7.multiply(complex13);
        org.apache.commons.math.complex.Complex complex15 = complex13.cos();
        java.lang.String str16 = complex15.toString();
        org.apache.commons.math.complex.Complex complex17 = complex15.cosh();
        org.apache.commons.math.complex.Complex complex18 = complex15.exp();
        org.apache.commons.math.complex.Complex complex21 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex22 = complex21.tanh();
        java.lang.String str23 = complex22.toString();
        org.apache.commons.math.complex.Complex complex24 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex25 = complex24.atan();
        org.apache.commons.math.complex.Complex complex26 = complex25.cosh();
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex28 = complex27.atan();
        org.apache.commons.math.complex.Complex complex29 = complex28.cosh();
        org.apache.commons.math.complex.Complex complex30 = complex29.tanh();
        org.apache.commons.math.complex.Complex complex31 = complex29.exp();
        org.apache.commons.math.complex.Complex complex32 = complex25.add(complex29);
        org.apache.commons.math.complex.Complex complex33 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex34 = complex33.atan();
        org.apache.commons.math.complex.Complex complex35 = complex34.cosh();
        org.apache.commons.math.complex.Complex complex36 = complex35.tanh();
        org.apache.commons.math.complex.Complex complex37 = complex36.sinh();
        boolean boolean38 = complex36.isInfinite();
        org.apache.commons.math.complex.Complex complex39 = complex25.subtract(complex36);
        org.apache.commons.math.complex.Complex complex40 = complex22.divide(complex39);
        org.apache.commons.math.complex.Complex complex41 = complex15.subtract(complex22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex18 and complex31", complex18.equals(complex31) ? complex18.hashCode() == complex31.hashCode() : true);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex5 = complex2.tan();
        java.lang.String str6 = complex5.toString();
        org.apache.commons.math.complex.Complex complex7 = complex5.cos();
        org.apache.commons.math.complex.Complex complex8 = complex5.sin();
        org.apache.commons.math.complex.Complex complex9 = complex8.sqrt();
        org.apache.commons.math.complex.Complex complex10 = complex8.conjugate();
        org.apache.commons.math.complex.Complex complex11 = complex10.negate();
        org.apache.commons.math.complex.Complex complex12 = complex10.asin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex11", complex0.equals(complex11) ? complex0.hashCode() == complex11.hashCode() : true);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.asin();
        org.apache.commons.math.complex.Complex complex4 = complex3.tan();
        org.apache.commons.math.complex.Complex complex5 = complex3.sqrt();
        boolean boolean7 = complex3.equals((java.lang.Object) (-1.0f));
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.atan();
        org.apache.commons.math.complex.Complex complex10 = complex9.cosh();
        org.apache.commons.math.complex.Complex complex11 = complex10.tanh();
        org.apache.commons.math.complex.Complex complex12 = complex11.sinh();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex14 = complex13.atan();
        org.apache.commons.math.complex.Complex complex15 = complex14.cosh();
        double double16 = complex15.getArgument();
        org.apache.commons.math.complex.Complex complex17 = complex12.divide(complex15);
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex19 = complex18.atan();
        org.apache.commons.math.complex.Complex complex20 = complex19.sqrt();
        org.apache.commons.math.complex.Complex complex21 = complex19.tanh();
        org.apache.commons.math.complex.Complex complex22 = complex15.multiply(complex21);
        org.apache.commons.math.complex.Complex complex23 = complex15.tanh();
        org.apache.commons.math.complex.Complex complex24 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex25 = complex24.atan();
        org.apache.commons.math.complex.Complex complex26 = complex25.sqrt();
        org.apache.commons.math.complex.Complex complex28 = complex26.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex29 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex30 = complex26.multiply(complex29);
        org.apache.commons.math.complex.Complex complex31 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex32 = complex31.atan();
        org.apache.commons.math.complex.Complex complex33 = complex32.cosh();
        org.apache.commons.math.complex.Complex complex34 = complex33.asin();
        org.apache.commons.math.complex.Complex complex35 = complex29.add(complex34);
        org.apache.commons.math.complex.Complex complex36 = complex35.conjugate();
        org.apache.commons.math.complex.Complex complex37 = complex36.conjugate();
        org.apache.commons.math.complex.Complex complex38 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex39 = complex38.atan();
        org.apache.commons.math.complex.Complex complex40 = complex39.cosh();
        org.apache.commons.math.complex.Complex complex41 = complex40.tanh();
        org.apache.commons.math.complex.Complex complex42 = complex41.sinh();
        org.apache.commons.math.complex.Complex complex43 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex44 = complex43.atan();
        org.apache.commons.math.complex.Complex complex45 = complex44.cosh();
        double double46 = complex45.getArgument();
        org.apache.commons.math.complex.Complex complex47 = complex42.divide(complex45);
        org.apache.commons.math.complex.Complex complex48 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex49 = complex48.atan();
        org.apache.commons.math.complex.Complex complex50 = complex49.sqrt();
        org.apache.commons.math.complex.Complex complex51 = complex49.tanh();
        org.apache.commons.math.complex.Complex complex52 = complex45.multiply(complex51);
        org.apache.commons.math.complex.Complex complex53 = complex51.exp();
        double double54 = complex51.abs();
        org.apache.commons.math.complex.Complex complex55 = complex51.atan();
        org.apache.commons.math.complex.Complex complex56 = complex55.exp();
        org.apache.commons.math.complex.Complex complex57 = complex36.add(complex55);
        org.apache.commons.math.complex.Complex complex58 = complex15.add(complex57);
        double double59 = complex15.getReal();
        org.apache.commons.math.complex.Complex complex60 = complex3.multiply(complex15);
        org.apache.commons.math.complex.Complex complex61 = complex60.tan();
        org.apache.commons.math.complex.Complex complex62 = complex61.sqrt();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex60", complex3.equals(complex60) ? complex3.hashCode() == complex60.hashCode() : true);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        java.lang.String str4 = complex3.toString();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.atan();
        org.apache.commons.math.complex.Complex complex10 = complex9.cosh();
        org.apache.commons.math.complex.Complex complex11 = complex10.tanh();
        org.apache.commons.math.complex.Complex complex12 = complex10.exp();
        org.apache.commons.math.complex.Complex complex13 = complex6.add(complex10);
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex15 = complex14.atan();
        org.apache.commons.math.complex.Complex complex16 = complex15.cosh();
        org.apache.commons.math.complex.Complex complex17 = complex16.tanh();
        org.apache.commons.math.complex.Complex complex18 = complex17.sinh();
        boolean boolean19 = complex17.isInfinite();
        org.apache.commons.math.complex.Complex complex20 = complex6.subtract(complex17);
        org.apache.commons.math.complex.Complex complex21 = complex3.divide(complex20);
        org.apache.commons.math.complex.Complex complex22 = complex20.conjugate();
        org.apache.commons.math.complex.Complex complex23 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex24 = complex23.atan();
        org.apache.commons.math.complex.Complex complex25 = complex24.cosh();
        org.apache.commons.math.complex.Complex complex26 = complex25.tanh();
        org.apache.commons.math.complex.Complex complex27 = complex26.sinh();
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex29 = complex28.atan();
        org.apache.commons.math.complex.Complex complex30 = complex29.cosh();
        double double31 = complex30.getArgument();
        org.apache.commons.math.complex.Complex complex32 = complex27.divide(complex30);
        org.apache.commons.math.complex.Complex complex33 = complex27.log();
        org.apache.commons.math.complex.Complex complex34 = complex33.cos();
        java.lang.String str35 = complex33.toString();
        org.apache.commons.math.complex.Complex complex36 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex37 = complex36.atan();
        org.apache.commons.math.complex.Complex complex38 = complex37.cosh();
        org.apache.commons.math.complex.Complex complex39 = complex33.divide(complex37);
        org.apache.commons.math.complex.Complex complex40 = complex20.divide(complex37);
        org.apache.commons.math.complex.Complex complex41 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex42 = complex41.atan();
        org.apache.commons.math.complex.Complex complex43 = complex42.sqrt();
        org.apache.commons.math.complex.Complex complex45 = complex43.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex46 = complex40.multiply(complex45);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex20 and complex22", complex20.equals(complex22) ? complex20.hashCode() == complex22.hashCode() : true);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex6 = complex2.multiply(complex5);
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex8 = complex7.atan();
        org.apache.commons.math.complex.Complex complex9 = complex8.cosh();
        org.apache.commons.math.complex.Complex complex10 = complex9.asin();
        org.apache.commons.math.complex.Complex complex11 = complex5.add(complex10);
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex13 = complex12.atan();
        org.apache.commons.math.complex.Complex complex14 = complex11.multiply(complex13);
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex16 = complex15.atan();
        org.apache.commons.math.complex.Complex complex17 = complex16.cosh();
        org.apache.commons.math.complex.Complex complex18 = complex14.multiply(complex17);
        org.apache.commons.math.complex.Complex complex19 = complex14.cosh();
        org.apache.commons.math.complex.Complex complex21 = complex14.multiply((-3.141592653589793d));
        org.apache.commons.math.complex.Complex complex22 = complex21.asin();
        org.apache.commons.math.complex.Complex complex23 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex24 = complex23.sqrt1z();
        org.apache.commons.math.complex.Complex complex27 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex28 = complex27.tanh();
        org.apache.commons.math.complex.Complex complex29 = complex24.subtract(complex27);
        org.apache.commons.math.complex.Complex complex30 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex31 = complex30.atan();
        org.apache.commons.math.complex.Complex complex32 = complex31.cosh();
        org.apache.commons.math.complex.Complex complex33 = complex32.tanh();
        org.apache.commons.math.complex.Complex complex34 = complex33.sinh();
        org.apache.commons.math.complex.Complex complex35 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex36 = complex35.atan();
        org.apache.commons.math.complex.Complex complex37 = complex36.cosh();
        double double38 = complex37.getArgument();
        org.apache.commons.math.complex.Complex complex39 = complex34.divide(complex37);
        org.apache.commons.math.complex.Complex complex40 = complex27.add(complex39);
        org.apache.commons.math.complex.Complex complex41 = complex40.exp();
        org.apache.commons.math.complex.Complex complex42 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex43 = complex42.atan();
        org.apache.commons.math.complex.Complex complex44 = complex43.cosh();
        org.apache.commons.math.complex.Complex complex45 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex46 = complex45.atan();
        org.apache.commons.math.complex.Complex complex47 = complex46.cosh();
        org.apache.commons.math.complex.Complex complex48 = complex47.tanh();
        org.apache.commons.math.complex.Complex complex49 = complex47.exp();
        org.apache.commons.math.complex.Complex complex50 = complex43.add(complex47);
        org.apache.commons.math.complex.Complex complex51 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex52 = complex51.atan();
        org.apache.commons.math.complex.Complex complex53 = complex52.cosh();
        org.apache.commons.math.complex.Complex complex54 = complex53.tanh();
        org.apache.commons.math.complex.Complex complex55 = complex54.sinh();
        boolean boolean56 = complex54.isInfinite();
        org.apache.commons.math.complex.Complex complex57 = complex43.subtract(complex54);
        org.apache.commons.math.complex.Complex complex58 = complex57.log();
        org.apache.commons.math.complex.Complex complex59 = complex40.divide(complex58);
        double double60 = complex59.getArgument();
        org.apache.commons.math.complex.Complex complex63 = new org.apache.commons.math.complex.Complex((double) 'a', (double) 0);
        org.apache.commons.math.complex.Complex complex64 = complex63.sqrt();
        org.apache.commons.math.complex.Complex complex65 = complex59.add(complex63);
        org.apache.commons.math.complex.Complex complex68 = new org.apache.commons.math.complex.Complex((double) 100, (double) (short) 10);
        org.apache.commons.math.complex.Complex complex69 = complex68.cos();
        double double70 = complex69.abs();
        org.apache.commons.math.complex.Complex complex71 = complex69.cosh();
        org.apache.commons.math.complex.Complex complex74 = new org.apache.commons.math.complex.Complex(1.230045147591584d, (-3.141592653589793d));
        org.apache.commons.math.complex.Complex complex75 = complex71.divide(complex74);
        org.apache.commons.math.complex.Complex complex76 = complex65.multiply(complex71);
        org.apache.commons.math.complex.Complex complex77 = complex21.pow(complex76);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex22", complex0.equals(complex22) ? complex0.hashCode() == complex22.hashCode() : true);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        double double8 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex9 = complex4.divide(complex7);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.atan();
        org.apache.commons.math.complex.Complex complex12 = complex11.sqrt();
        org.apache.commons.math.complex.Complex complex13 = complex11.tanh();
        org.apache.commons.math.complex.Complex complex14 = complex7.multiply(complex13);
        org.apache.commons.math.complex.Complex complex15 = complex13.cos();
        org.apache.commons.math.complex.Complex complex16 = complex15.tanh();
        org.apache.commons.math.complex.Complex complex17 = complex16.acos();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex15", complex2.equals(complex15) ? complex2.hashCode() == complex15.hashCode() : true);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        double double8 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex9 = complex4.divide(complex7);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.atan();
        org.apache.commons.math.complex.Complex complex12 = complex11.cosh();
        org.apache.commons.math.complex.Complex complex13 = complex12.tanh();
        org.apache.commons.math.complex.Complex complex14 = complex13.sinh();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex16 = complex15.atan();
        org.apache.commons.math.complex.Complex complex17 = complex16.cosh();
        double double18 = complex17.getArgument();
        org.apache.commons.math.complex.Complex complex19 = complex14.divide(complex17);
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex21 = complex20.atan();
        org.apache.commons.math.complex.Complex complex22 = complex21.sqrt();
        org.apache.commons.math.complex.Complex complex23 = complex21.tanh();
        org.apache.commons.math.complex.Complex complex24 = complex17.multiply(complex23);
        org.apache.commons.math.complex.Complex complex25 = complex17.tanh();
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex27 = complex26.atan();
        org.apache.commons.math.complex.Complex complex28 = complex27.cosh();
        org.apache.commons.math.complex.Complex complex29 = complex28.tanh();
        org.apache.commons.math.complex.Complex complex30 = complex28.exp();
        org.apache.commons.math.complex.Complex complex31 = complex28.exp();
        org.apache.commons.math.complex.Complex complex32 = complex31.sqrt();
        org.apache.commons.math.complex.Complex complex33 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex34 = complex33.atan();
        org.apache.commons.math.complex.Complex complex35 = complex34.cosh();
        org.apache.commons.math.complex.Complex complex36 = complex35.tanh();
        org.apache.commons.math.complex.Complex complex37 = complex36.sinh();
        org.apache.commons.math.complex.Complex complex38 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex39 = complex38.atan();
        org.apache.commons.math.complex.Complex complex40 = complex39.cosh();
        double double41 = complex40.getArgument();
        org.apache.commons.math.complex.Complex complex42 = complex37.divide(complex40);
        java.lang.String str43 = complex42.toString();
        org.apache.commons.math.complex.Complex complex44 = complex42.sqrt1z();
        org.apache.commons.math.complex.Complex complex45 = complex44.tan();
        org.apache.commons.math.complex.Complex complex46 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean47 = complex46.isInfinite();
        org.apache.commons.math.complex.Complex complex48 = complex45.multiply(complex46);
        org.apache.commons.math.complex.Complex complex49 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex50 = complex49.sqrt1z();
        org.apache.commons.math.complex.Complex complex51 = complex45.add(complex49);
        org.apache.commons.math.complex.Complex complex52 = complex32.add(complex51);
        org.apache.commons.math.complex.Complex complex53 = complex25.multiply(complex51);
        org.apache.commons.math.complex.Complex complex54 = complex4.subtract(complex51);
        org.apache.commons.math.complex.Complex complex55 = complex54.negate();
        org.apache.commons.math.complex.Complex complex56 = complex55.conjugate();
        org.apache.commons.math.complex.Complex complex57 = complex56.negate();
        org.apache.commons.math.complex.Complex complex58 = complex56.tan();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex54 and complex57", complex54.equals(complex57) ? complex54.hashCode() == complex57.hashCode() : true);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        double double8 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex9 = complex4.divide(complex7);
        org.apache.commons.math.complex.Complex complex10 = complex4.log();
        org.apache.commons.math.complex.Complex complex11 = complex10.cos();
        org.apache.commons.math.complex.Complex complex12 = complex10.exp();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex14 = complex13.atan();
        org.apache.commons.math.complex.Complex complex15 = complex14.cosh();
        org.apache.commons.math.complex.Complex complex16 = complex15.asin();
        org.apache.commons.math.complex.ComplexField complexField17 = complex15.getField();
        org.apache.commons.math.complex.Complex complex18 = complex15.tanh();
        org.apache.commons.math.complex.Complex complex19 = complex15.log();
        org.apache.commons.math.complex.Complex complex20 = complex19.cosh();
        org.apache.commons.math.complex.Complex complex21 = complex10.multiply(complex19);
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex23 = complex22.atan();
        org.apache.commons.math.complex.Complex complex24 = complex23.cosh();
        org.apache.commons.math.complex.Complex complex25 = complex24.tanh();
        org.apache.commons.math.complex.Complex complex26 = complex24.exp();
        boolean boolean27 = complex24.isNaN();
        org.apache.commons.math.complex.Complex complex28 = complex24.sqrt();
        org.apache.commons.math.complex.Complex complex29 = complex28.exp();
        org.apache.commons.math.complex.Complex complex30 = complex21.add(complex28);
        org.apache.commons.math.complex.Complex complex31 = complex30.tanh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex21", complex0.equals(complex21) ? complex0.hashCode() == complex21.hashCode() : true);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        double double3 = complex2.getImaginary();
        double double4 = complex2.getReal();
        org.apache.commons.math.complex.Complex complex5 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex7 = complex6.atan();
        org.apache.commons.math.complex.Complex complex8 = complex7.sqrt();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex10 = complex9.atan();
        org.apache.commons.math.complex.Complex complex11 = complex10.cosh();
        org.apache.commons.math.complex.Complex complex12 = complex11.tanh();
        org.apache.commons.math.complex.Complex complex13 = complex12.sinh();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex15 = complex14.atan();
        org.apache.commons.math.complex.Complex complex16 = complex15.cosh();
        double double17 = complex16.getArgument();
        org.apache.commons.math.complex.Complex complex18 = complex13.divide(complex16);
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex20 = complex19.atan();
        org.apache.commons.math.complex.Complex complex21 = complex20.sqrt();
        org.apache.commons.math.complex.Complex complex22 = complex20.tanh();
        org.apache.commons.math.complex.Complex complex23 = complex16.multiply(complex22);
        org.apache.commons.math.complex.Complex complex24 = complex7.pow(complex22);
        org.apache.commons.math.complex.Complex complex25 = complex7.acos();
        org.apache.commons.math.complex.Complex complex26 = complex25.conjugate();
        org.apache.commons.math.complex.Complex complex29 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex30 = complex29.tanh();
        org.apache.commons.math.complex.Complex complex31 = complex29.tan();
        org.apache.commons.math.complex.Complex complex32 = complex26.add(complex31);
        boolean boolean33 = complex5.equals((java.lang.Object) complex31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex25 and complex26", complex25.equals(complex26) ? complex25.hashCode() == complex26.hashCode() : true);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        double double8 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex9 = complex4.divide(complex7);
        java.lang.String str10 = complex9.toString();
        org.apache.commons.math.complex.Complex complex11 = complex9.sqrt1z();
        org.apache.commons.math.complex.Complex complex12 = complex11.tan();
        org.apache.commons.math.complex.Complex complex13 = complex12.acos();
        org.apache.commons.math.complex.Complex complex14 = complex12.sinh();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex16 = complex15.atan();
        org.apache.commons.math.complex.Complex complex17 = complex16.cosh();
        org.apache.commons.math.complex.Complex complex18 = complex17.asin();
        org.apache.commons.math.complex.ComplexField complexField19 = complex17.getField();
        java.lang.String str20 = complex17.toString();
        org.apache.commons.math.complex.Complex complex21 = complex17.sqrt1z();
        org.apache.commons.math.complex.Complex complex22 = complex21.cos();
        org.apache.commons.math.complex.Complex complex23 = complex12.divide(complex22);
        org.apache.commons.math.complex.Complex complex24 = complex23.sinh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex22", complex2.equals(complex22) ? complex2.hashCode() == complex22.hashCode() : true);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex6 = complex2.multiply(complex5);
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex8 = complex7.atan();
        org.apache.commons.math.complex.Complex complex9 = complex8.cosh();
        org.apache.commons.math.complex.Complex complex10 = complex9.asin();
        org.apache.commons.math.complex.Complex complex11 = complex5.add(complex10);
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex13 = complex12.atan();
        org.apache.commons.math.complex.Complex complex14 = complex11.multiply(complex13);
        org.apache.commons.math.complex.Complex complex15 = complex11.tanh();
        org.apache.commons.math.complex.Complex complex16 = complex15.sinh();
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex18 = complex17.atan();
        org.apache.commons.math.complex.Complex complex19 = complex18.cosh();
        org.apache.commons.math.complex.Complex complex20 = complex15.add(complex19);
        org.apache.commons.math.complex.Complex complex21 = complex20.sqrt();
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex23 = complex22.atan();
        org.apache.commons.math.complex.Complex complex24 = complex23.sqrt();
        org.apache.commons.math.complex.Complex complex26 = complex24.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex27 = complex24.tan();
        java.lang.String str28 = complex27.toString();
        org.apache.commons.math.complex.Complex complex29 = complex27.cos();
        org.apache.commons.math.complex.Complex complex30 = complex27.sin();
        org.apache.commons.math.complex.Complex complex31 = complex30.sqrt();
        org.apache.commons.math.complex.Complex complex32 = complex30.conjugate();
        org.apache.commons.math.complex.Complex complex33 = complex20.add(complex32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex9 and complex29", complex9.equals(complex29) ? complex9.hashCode() == complex29.hashCode() : true);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex4 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex5 = complex4.tanh();
        org.apache.commons.math.complex.Complex complex6 = complex1.subtract(complex4);
        double double7 = complex1.getArgument();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.sqrt1z();
        org.apache.commons.math.complex.Complex complex12 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex13 = complex12.tanh();
        org.apache.commons.math.complex.Complex complex14 = complex9.subtract(complex12);
        double double15 = complex14.getImaginary();
        org.apache.commons.math.complex.Complex complex16 = complex14.asin();
        org.apache.commons.math.complex.Complex complex17 = complex14.cos();
        org.apache.commons.math.complex.Complex complex19 = complex17.multiply(1.0d);
        org.apache.commons.math.complex.Complex complex20 = complex1.subtract(complex19);
        org.apache.commons.math.complex.Complex complex21 = complex1.sqrt1z();
        org.apache.commons.math.complex.Complex complex22 = complex21.conjugate();
        org.apache.commons.math.complex.Complex complex23 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex24 = complex23.atan();
        org.apache.commons.math.complex.Complex complex25 = complex24.sqrt();
        org.apache.commons.math.complex.Complex complex27 = complex25.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex29 = complex25.multiply(complex28);
        org.apache.commons.math.complex.Complex complex30 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex31 = complex30.atan();
        org.apache.commons.math.complex.Complex complex32 = complex31.cosh();
        org.apache.commons.math.complex.Complex complex33 = complex32.tanh();
        org.apache.commons.math.complex.Complex complex34 = complex33.sinh();
        org.apache.commons.math.complex.Complex complex35 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex36 = complex35.atan();
        org.apache.commons.math.complex.Complex complex37 = complex36.cosh();
        double double38 = complex37.getArgument();
        org.apache.commons.math.complex.Complex complex39 = complex34.divide(complex37);
        java.lang.String str40 = complex39.toString();
        org.apache.commons.math.complex.Complex complex41 = complex39.sqrt1z();
        org.apache.commons.math.complex.Complex complex42 = complex41.tan();
        org.apache.commons.math.complex.Complex complex43 = complex25.add(complex42);
        org.apache.commons.math.complex.Complex complex44 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex45 = complex44.atan();
        org.apache.commons.math.complex.Complex complex46 = complex45.cosh();
        org.apache.commons.math.complex.Complex complex47 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex48 = complex47.atan();
        org.apache.commons.math.complex.Complex complex49 = complex48.cosh();
        org.apache.commons.math.complex.Complex complex50 = complex49.tanh();
        org.apache.commons.math.complex.Complex complex51 = complex49.exp();
        org.apache.commons.math.complex.Complex complex52 = complex45.add(complex49);
        org.apache.commons.math.complex.Complex complex53 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex54 = complex53.atan();
        org.apache.commons.math.complex.Complex complex55 = complex54.cosh();
        org.apache.commons.math.complex.Complex complex56 = complex55.tanh();
        org.apache.commons.math.complex.Complex complex57 = complex56.sinh();
        boolean boolean58 = complex56.isInfinite();
        org.apache.commons.math.complex.Complex complex59 = complex45.subtract(complex56);
        java.lang.String str60 = complex59.toString();
        org.apache.commons.math.complex.Complex complex61 = complex59.sqrt();
        org.apache.commons.math.complex.Complex complex62 = complex43.divide(complex61);
        org.apache.commons.math.complex.Complex complex63 = complex43.conjugate();
        org.apache.commons.math.complex.Complex complex64 = complex21.divide(complex43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex22", complex0.equals(complex22) ? complex0.hashCode() == complex22.hashCode() : true);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex4 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex5 = complex4.tanh();
        org.apache.commons.math.complex.Complex complex6 = complex1.subtract(complex4);
        double double7 = complex1.getArgument();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.sqrt1z();
        org.apache.commons.math.complex.Complex complex12 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex13 = complex12.tanh();
        org.apache.commons.math.complex.Complex complex14 = complex9.subtract(complex12);
        double double15 = complex14.getImaginary();
        org.apache.commons.math.complex.Complex complex16 = complex14.asin();
        org.apache.commons.math.complex.Complex complex17 = complex14.cos();
        org.apache.commons.math.complex.Complex complex19 = complex17.multiply(1.0d);
        org.apache.commons.math.complex.Complex complex20 = complex1.subtract(complex19);
        org.apache.commons.math.complex.Complex complex21 = complex1.sqrt1z();
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex23 = complex22.atan();
        org.apache.commons.math.complex.Complex complex24 = complex23.cosh();
        org.apache.commons.math.complex.Complex complex25 = complex24.tanh();
        org.apache.commons.math.complex.Complex complex26 = complex25.sinh();
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex28 = complex27.atan();
        org.apache.commons.math.complex.Complex complex29 = complex28.cosh();
        double double30 = complex29.getArgument();
        org.apache.commons.math.complex.Complex complex31 = complex26.divide(complex29);
        org.apache.commons.math.complex.Complex complex32 = complex26.log();
        org.apache.commons.math.complex.Complex complex33 = complex32.cos();
        org.apache.commons.math.complex.Complex complex34 = complex32.exp();
        org.apache.commons.math.complex.Complex complex35 = complex32.acos();
        org.apache.commons.math.complex.Complex complex36 = complex32.log();
        org.apache.commons.math.complex.Complex complex37 = complex32.tanh();
        org.apache.commons.math.complex.Complex complex38 = complex1.multiply(complex37);
        boolean boolean39 = complex1.isNaN();
        org.apache.commons.math.complex.Complex complex40 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex41 = complex40.atan();
        org.apache.commons.math.complex.Complex complex42 = complex41.sqrt();
        org.apache.commons.math.complex.Complex complex44 = complex42.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex45 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex46 = complex42.multiply(complex45);
        org.apache.commons.math.complex.Complex complex47 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex48 = complex47.atan();
        org.apache.commons.math.complex.Complex complex49 = complex48.cosh();
        org.apache.commons.math.complex.Complex complex50 = complex49.tanh();
        org.apache.commons.math.complex.Complex complex51 = complex50.sinh();
        org.apache.commons.math.complex.Complex complex52 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex53 = complex52.atan();
        org.apache.commons.math.complex.Complex complex54 = complex53.cosh();
        double double55 = complex54.getArgument();
        org.apache.commons.math.complex.Complex complex56 = complex51.divide(complex54);
        java.lang.String str57 = complex56.toString();
        org.apache.commons.math.complex.Complex complex58 = complex56.sqrt1z();
        org.apache.commons.math.complex.Complex complex59 = complex58.tan();
        org.apache.commons.math.complex.Complex complex60 = complex42.add(complex59);
        org.apache.commons.math.complex.Complex complex61 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex62 = complex61.atan();
        org.apache.commons.math.complex.Complex complex63 = complex62.sqrt();
        org.apache.commons.math.complex.Complex complex65 = complex63.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex66 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex67 = complex63.multiply(complex66);
        org.apache.commons.math.complex.Complex complex68 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex69 = complex68.atan();
        org.apache.commons.math.complex.Complex complex70 = complex69.cosh();
        org.apache.commons.math.complex.Complex complex71 = complex70.asin();
        org.apache.commons.math.complex.Complex complex72 = complex66.add(complex71);
        org.apache.commons.math.complex.Complex complex73 = complex72.conjugate();
        org.apache.commons.math.complex.Complex complex74 = complex42.divide(complex72);
        org.apache.commons.math.complex.Complex complex75 = complex74.conjugate();
        org.apache.commons.math.complex.Complex complex76 = complex1.subtract(complex75);
        org.apache.commons.math.complex.Complex complex77 = complex1.exp();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex75", complex0.equals(complex75) ? complex0.hashCode() == complex75.hashCode() : true);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        double double8 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex9 = complex4.divide(complex7);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.atan();
        org.apache.commons.math.complex.Complex complex12 = complex11.sqrt();
        org.apache.commons.math.complex.Complex complex13 = complex11.tanh();
        org.apache.commons.math.complex.Complex complex14 = complex7.multiply(complex13);
        org.apache.commons.math.complex.Complex complex15 = complex13.exp();
        double double16 = complex13.abs();
        org.apache.commons.math.complex.Complex complex17 = complex13.atan();
        org.apache.commons.math.complex.Complex complex18 = complex13.conjugate();
        org.apache.commons.math.complex.Complex complex19 = complex18.cos();
        org.apache.commons.math.complex.Complex complex21 = complex18.multiply((double) 10L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex19", complex2.equals(complex19) ? complex2.hashCode() == complex19.hashCode() : true);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        double double8 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex9 = complex4.divide(complex7);
        org.apache.commons.math.complex.Complex complex10 = complex4.log();
        org.apache.commons.math.complex.Complex complex11 = complex10.cos();
        org.apache.commons.math.complex.Complex complex12 = complex10.exp();
        org.apache.commons.math.complex.Complex complex13 = complex12.log();
        org.apache.commons.math.complex.Complex complex14 = complex13.conjugate();
        org.apache.commons.math.complex.Complex complex17 = new org.apache.commons.math.complex.Complex((double) (short) 1, 3.141592653589793d);
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex19 = complex18.atan();
        org.apache.commons.math.complex.Complex complex20 = complex19.cosh();
        org.apache.commons.math.complex.Complex complex21 = complex20.tanh();
        org.apache.commons.math.complex.Complex complex22 = complex21.sinh();
        org.apache.commons.math.complex.Complex complex23 = complex22.sqrt();
        org.apache.commons.math.complex.Complex complex24 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex25 = complex24.atan();
        org.apache.commons.math.complex.Complex complex26 = complex25.cosh();
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex28 = complex27.atan();
        org.apache.commons.math.complex.Complex complex29 = complex28.cosh();
        org.apache.commons.math.complex.Complex complex30 = complex29.tanh();
        org.apache.commons.math.complex.Complex complex31 = complex29.exp();
        org.apache.commons.math.complex.Complex complex32 = complex25.add(complex29);
        org.apache.commons.math.complex.Complex complex33 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex34 = complex33.atan();
        org.apache.commons.math.complex.Complex complex35 = complex34.cosh();
        org.apache.commons.math.complex.Complex complex36 = complex35.tanh();
        org.apache.commons.math.complex.Complex complex37 = complex36.sinh();
        boolean boolean38 = complex36.isInfinite();
        org.apache.commons.math.complex.Complex complex39 = complex25.subtract(complex36);
        org.apache.commons.math.complex.Complex complex40 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex41 = complex40.atan();
        org.apache.commons.math.complex.Complex complex42 = complex41.cosh();
        org.apache.commons.math.complex.Complex complex43 = complex42.asin();
        org.apache.commons.math.complex.Complex complex44 = complex43.tan();
        org.apache.commons.math.complex.Complex complex45 = complex39.subtract(complex44);
        org.apache.commons.math.complex.Complex complex46 = complex45.tanh();
        org.apache.commons.math.complex.Complex complex47 = complex23.subtract(complex45);
        boolean boolean48 = complex17.equals((java.lang.Object) complex23);
        boolean boolean49 = complex13.equals((java.lang.Object) complex17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex10 and complex14", complex10.equals(complex14) ? complex10.hashCode() == complex14.hashCode() : true);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex5 = complex2.tan();
        java.lang.String str6 = complex5.toString();
        org.apache.commons.math.complex.Complex complex7 = complex5.cos();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.atan();
        org.apache.commons.math.complex.Complex complex10 = complex9.cosh();
        org.apache.commons.math.complex.Complex complex11 = complex10.tanh();
        java.util.List<org.apache.commons.math.complex.Complex> complexList13 = complex10.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex14 = complex10.sinh();
        org.apache.commons.math.complex.Complex complex15 = complex14.negate();
        boolean boolean16 = complex14.isNaN();
        org.apache.commons.math.complex.Complex complex17 = complex7.pow(complex14);
        org.apache.commons.math.complex.Complex complex18 = complex14.negate();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex7 and complex10", complex7.equals(complex10) ? complex7.hashCode() == complex10.hashCode() : true);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        double double8 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex9 = complex4.divide(complex7);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.atan();
        org.apache.commons.math.complex.Complex complex12 = complex11.sqrt();
        org.apache.commons.math.complex.Complex complex13 = complex11.tanh();
        org.apache.commons.math.complex.Complex complex14 = complex7.multiply(complex13);
        org.apache.commons.math.complex.Complex complex15 = complex13.exp();
        double double16 = complex13.abs();
        org.apache.commons.math.complex.Complex complex17 = complex13.atan();
        org.apache.commons.math.complex.Complex complex18 = complex13.conjugate();
        double double19 = complex18.abs();
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex21 = complex20.atan();
        org.apache.commons.math.complex.Complex complex22 = complex21.sqrt();
        org.apache.commons.math.complex.Complex complex24 = complex22.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex25 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex26 = complex22.multiply(complex25);
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex28 = complex27.atan();
        org.apache.commons.math.complex.Complex complex29 = complex28.cosh();
        org.apache.commons.math.complex.Complex complex30 = complex29.asin();
        org.apache.commons.math.complex.Complex complex31 = complex25.add(complex30);
        org.apache.commons.math.complex.Complex complex32 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex33 = complex32.atan();
        org.apache.commons.math.complex.Complex complex34 = complex31.multiply(complex33);
        org.apache.commons.math.complex.Complex complex35 = complex31.tanh();
        java.lang.String str36 = complex31.toString();
        org.apache.commons.math.complex.Complex complex37 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex38 = complex37.atan();
        org.apache.commons.math.complex.Complex complex39 = complex38.sqrt();
        org.apache.commons.math.complex.Complex complex41 = complex39.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex42 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex43 = complex39.multiply(complex42);
        org.apache.commons.math.complex.Complex complex44 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex45 = complex44.atan();
        org.apache.commons.math.complex.Complex complex46 = complex45.cosh();
        org.apache.commons.math.complex.Complex complex47 = complex46.tanh();
        org.apache.commons.math.complex.Complex complex48 = complex47.sinh();
        org.apache.commons.math.complex.Complex complex49 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex50 = complex49.atan();
        org.apache.commons.math.complex.Complex complex51 = complex50.cosh();
        double double52 = complex51.getArgument();
        org.apache.commons.math.complex.Complex complex53 = complex48.divide(complex51);
        java.lang.String str54 = complex53.toString();
        org.apache.commons.math.complex.Complex complex55 = complex53.sqrt1z();
        org.apache.commons.math.complex.Complex complex56 = complex55.tan();
        org.apache.commons.math.complex.Complex complex57 = complex39.add(complex56);
        org.apache.commons.math.complex.Complex complex58 = complex39.sqrt1z();
        org.apache.commons.math.complex.Complex complex59 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex60 = complex59.atan();
        org.apache.commons.math.complex.Complex complex61 = complex60.cosh();
        org.apache.commons.math.complex.Complex complex62 = complex61.tanh();
        org.apache.commons.math.complex.Complex complex63 = complex61.cosh();
        boolean boolean64 = complex61.isNaN();
        org.apache.commons.math.complex.Complex complex65 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex66 = complex65.sqrt1z();
        org.apache.commons.math.complex.Complex complex69 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex70 = complex69.tanh();
        org.apache.commons.math.complex.Complex complex71 = complex66.subtract(complex69);
        org.apache.commons.math.complex.Complex complex74 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex75 = complex66.pow(complex74);
        org.apache.commons.math.complex.Complex complex76 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex77 = complex76.atan();
        org.apache.commons.math.complex.Complex complex78 = complex77.sqrt();
        org.apache.commons.math.complex.Complex complex79 = complex77.tanh();
        org.apache.commons.math.complex.Complex complex80 = complex75.pow(complex77);
        org.apache.commons.math.complex.Complex complex81 = complex61.add(complex75);
        org.apache.commons.math.complex.Complex complex84 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex85 = complex61.multiply(complex84);
        org.apache.commons.math.complex.Complex complex86 = complex39.divide(complex61);
        org.apache.commons.math.complex.Complex complex87 = complex31.add(complex86);
        org.apache.commons.math.complex.Complex complex88 = complex18.add(complex31);
        org.apache.commons.math.complex.Complex complex89 = complex88.asin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex18", complex0.equals(complex18) ? complex0.hashCode() == complex18.hashCode() : true);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex5 = complex4.sqrt();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex7 = complex6.atan();
        org.apache.commons.math.complex.Complex complex8 = complex7.cosh();
        org.apache.commons.math.complex.Complex complex9 = complex8.tanh();
        org.apache.commons.math.complex.Complex complex10 = complex9.sinh();
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex12 = complex11.atan();
        org.apache.commons.math.complex.Complex complex13 = complex12.cosh();
        double double14 = complex13.getArgument();
        org.apache.commons.math.complex.Complex complex15 = complex10.divide(complex13);
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex17 = complex16.atan();
        org.apache.commons.math.complex.Complex complex18 = complex17.cosh();
        org.apache.commons.math.complex.Complex complex19 = complex18.tanh();
        org.apache.commons.math.complex.Complex complex20 = complex19.sinh();
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex22 = complex21.atan();
        org.apache.commons.math.complex.Complex complex23 = complex22.cosh();
        double double24 = complex23.getArgument();
        org.apache.commons.math.complex.Complex complex25 = complex20.divide(complex23);
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex27 = complex26.atan();
        org.apache.commons.math.complex.Complex complex28 = complex27.sqrt();
        org.apache.commons.math.complex.Complex complex29 = complex27.tanh();
        org.apache.commons.math.complex.Complex complex30 = complex23.multiply(complex29);
        org.apache.commons.math.complex.Complex complex31 = complex23.tanh();
        org.apache.commons.math.complex.Complex complex32 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex33 = complex32.atan();
        org.apache.commons.math.complex.Complex complex34 = complex33.cosh();
        org.apache.commons.math.complex.Complex complex35 = complex34.tanh();
        org.apache.commons.math.complex.Complex complex36 = complex34.exp();
        org.apache.commons.math.complex.Complex complex37 = complex34.exp();
        org.apache.commons.math.complex.Complex complex38 = complex37.sqrt();
        org.apache.commons.math.complex.Complex complex39 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex40 = complex39.atan();
        org.apache.commons.math.complex.Complex complex41 = complex40.cosh();
        org.apache.commons.math.complex.Complex complex42 = complex41.tanh();
        org.apache.commons.math.complex.Complex complex43 = complex42.sinh();
        org.apache.commons.math.complex.Complex complex44 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex45 = complex44.atan();
        org.apache.commons.math.complex.Complex complex46 = complex45.cosh();
        double double47 = complex46.getArgument();
        org.apache.commons.math.complex.Complex complex48 = complex43.divide(complex46);
        java.lang.String str49 = complex48.toString();
        org.apache.commons.math.complex.Complex complex50 = complex48.sqrt1z();
        org.apache.commons.math.complex.Complex complex51 = complex50.tan();
        org.apache.commons.math.complex.Complex complex52 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean53 = complex52.isInfinite();
        org.apache.commons.math.complex.Complex complex54 = complex51.multiply(complex52);
        org.apache.commons.math.complex.Complex complex55 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex56 = complex55.sqrt1z();
        org.apache.commons.math.complex.Complex complex57 = complex51.add(complex55);
        org.apache.commons.math.complex.Complex complex58 = complex38.add(complex57);
        org.apache.commons.math.complex.Complex complex59 = complex31.multiply(complex57);
        org.apache.commons.math.complex.Complex complex60 = complex10.subtract(complex57);
        org.apache.commons.math.complex.Complex complex61 = complex60.negate();
        org.apache.commons.math.complex.Complex complex62 = complex60.atan();
        org.apache.commons.math.complex.Complex complex63 = complex60.conjugate();
        org.apache.commons.math.complex.Complex complex64 = complex63.sin();
        org.apache.commons.math.complex.Complex complex65 = complex5.multiply(complex63);
        org.apache.commons.math.complex.Complex complex66 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex67 = complex66.sqrt1z();
        org.apache.commons.math.complex.Complex complex70 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex71 = complex70.tanh();
        org.apache.commons.math.complex.Complex complex72 = complex67.subtract(complex70);
        double double73 = complex67.getArgument();
        org.apache.commons.math.complex.Complex complex74 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex75 = complex74.sqrt1z();
        org.apache.commons.math.complex.Complex complex78 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex79 = complex78.tanh();
        org.apache.commons.math.complex.Complex complex80 = complex75.subtract(complex78);
        double double81 = complex80.getImaginary();
        org.apache.commons.math.complex.Complex complex82 = complex80.asin();
        org.apache.commons.math.complex.Complex complex83 = complex80.cos();
        org.apache.commons.math.complex.Complex complex85 = complex83.multiply(1.0d);
        org.apache.commons.math.complex.Complex complex86 = complex67.subtract(complex85);
        org.apache.commons.math.complex.Complex complex87 = complex67.sqrt1z();
        org.apache.commons.math.complex.Complex complex88 = complex87.conjugate();
        org.apache.commons.math.complex.Complex complex89 = complex65.subtract(complex87);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex88", complex0.equals(complex88) ? complex0.hashCode() == complex88.hashCode() : true);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean1 = complex0.isInfinite();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex3 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex6 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex7 = complex6.tanh();
        org.apache.commons.math.complex.Complex complex8 = complex3.subtract(complex6);
        double double9 = complex8.getImaginary();
        org.apache.commons.math.complex.Complex complex10 = complex8.sqrt();
        org.apache.commons.math.complex.Complex complex12 = complex8.multiply((double) 10);
        org.apache.commons.math.complex.Complex complex13 = complex0.divide(complex12);
        org.apache.commons.math.complex.Complex complex14 = complex0.sinh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex13", complex0.equals(complex13) ? complex0.hashCode() == complex13.hashCode() : true);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex4 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex5 = complex4.tanh();
        org.apache.commons.math.complex.Complex complex6 = complex1.subtract(complex4);
        double double7 = complex1.getArgument();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.sqrt1z();
        org.apache.commons.math.complex.Complex complex12 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex13 = complex12.tanh();
        org.apache.commons.math.complex.Complex complex14 = complex9.subtract(complex12);
        double double15 = complex14.getImaginary();
        org.apache.commons.math.complex.Complex complex16 = complex14.asin();
        org.apache.commons.math.complex.Complex complex17 = complex14.cos();
        org.apache.commons.math.complex.Complex complex19 = complex17.multiply(1.0d);
        org.apache.commons.math.complex.Complex complex20 = complex1.subtract(complex19);
        org.apache.commons.math.complex.Complex complex21 = complex1.sqrt1z();
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex23 = complex22.atan();
        org.apache.commons.math.complex.Complex complex24 = complex23.cosh();
        org.apache.commons.math.complex.Complex complex25 = complex24.tanh();
        org.apache.commons.math.complex.Complex complex26 = complex25.sinh();
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex28 = complex27.atan();
        org.apache.commons.math.complex.Complex complex29 = complex28.cosh();
        double double30 = complex29.getArgument();
        org.apache.commons.math.complex.Complex complex31 = complex26.divide(complex29);
        org.apache.commons.math.complex.Complex complex32 = complex26.log();
        org.apache.commons.math.complex.Complex complex33 = complex32.cos();
        org.apache.commons.math.complex.Complex complex34 = complex32.exp();
        org.apache.commons.math.complex.Complex complex35 = complex32.acos();
        org.apache.commons.math.complex.Complex complex36 = complex32.log();
        org.apache.commons.math.complex.Complex complex37 = complex32.tanh();
        org.apache.commons.math.complex.Complex complex38 = complex1.multiply(complex37);
        boolean boolean39 = complex1.isNaN();
        org.apache.commons.math.complex.Complex complex40 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex41 = complex40.atan();
        org.apache.commons.math.complex.Complex complex42 = complex41.sqrt();
        org.apache.commons.math.complex.Complex complex44 = complex42.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex45 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex46 = complex42.multiply(complex45);
        org.apache.commons.math.complex.Complex complex47 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex48 = complex47.atan();
        org.apache.commons.math.complex.Complex complex49 = complex48.cosh();
        org.apache.commons.math.complex.Complex complex50 = complex49.tanh();
        org.apache.commons.math.complex.Complex complex51 = complex50.sinh();
        org.apache.commons.math.complex.Complex complex52 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex53 = complex52.atan();
        org.apache.commons.math.complex.Complex complex54 = complex53.cosh();
        double double55 = complex54.getArgument();
        org.apache.commons.math.complex.Complex complex56 = complex51.divide(complex54);
        java.lang.String str57 = complex56.toString();
        org.apache.commons.math.complex.Complex complex58 = complex56.sqrt1z();
        org.apache.commons.math.complex.Complex complex59 = complex58.tan();
        org.apache.commons.math.complex.Complex complex60 = complex42.add(complex59);
        org.apache.commons.math.complex.Complex complex61 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex62 = complex61.atan();
        org.apache.commons.math.complex.Complex complex63 = complex62.sqrt();
        org.apache.commons.math.complex.Complex complex65 = complex63.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex66 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex67 = complex63.multiply(complex66);
        org.apache.commons.math.complex.Complex complex68 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex69 = complex68.atan();
        org.apache.commons.math.complex.Complex complex70 = complex69.cosh();
        org.apache.commons.math.complex.Complex complex71 = complex70.asin();
        org.apache.commons.math.complex.Complex complex72 = complex66.add(complex71);
        org.apache.commons.math.complex.Complex complex73 = complex72.conjugate();
        org.apache.commons.math.complex.Complex complex74 = complex42.divide(complex72);
        org.apache.commons.math.complex.Complex complex75 = complex74.conjugate();
        org.apache.commons.math.complex.Complex complex76 = complex1.subtract(complex75);
        double double77 = complex1.getArgument();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex75", complex0.equals(complex75) ? complex0.hashCode() == complex75.hashCode() : true);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.asin();
        boolean boolean4 = complex2.isInfinite();
        org.apache.commons.math.complex.Complex complex6 = complex2.multiply((double) 0);
        org.apache.commons.math.complex.Complex complex7 = complex2.acos();
        org.apache.commons.math.complex.Complex complex8 = complex7.asin();
        org.apache.commons.math.complex.Complex complex9 = complex8.negate();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex7", complex0.equals(complex7) ? complex0.hashCode() == complex7.hashCode() : true);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        double double8 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex9 = complex4.divide(complex7);
        org.apache.commons.math.complex.Complex complex10 = complex4.log();
        org.apache.commons.math.complex.Complex complex11 = complex10.cos();
        org.apache.commons.math.complex.Complex complex12 = complex10.exp();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex14 = complex13.atan();
        org.apache.commons.math.complex.Complex complex15 = complex14.cosh();
        org.apache.commons.math.complex.Complex complex16 = complex15.asin();
        org.apache.commons.math.complex.ComplexField complexField17 = complex15.getField();
        org.apache.commons.math.complex.Complex complex18 = complex15.tanh();
        org.apache.commons.math.complex.Complex complex19 = complex15.log();
        org.apache.commons.math.complex.Complex complex20 = complex19.cosh();
        org.apache.commons.math.complex.Complex complex21 = complex10.multiply(complex19);
        org.apache.commons.math.complex.Complex complex22 = complex19.sin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex21", complex0.equals(complex21) ? complex0.hashCode() == complex21.hashCode() : true);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math.complex.Complex complex3 = complex1.cos();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex5 = complex4.atan();
        org.apache.commons.math.complex.Complex complex6 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex7 = complex6.tanh();
        org.apache.commons.math.complex.Complex complex8 = complex6.cosh();
        boolean boolean9 = complex6.isNaN();
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.atan();
        org.apache.commons.math.complex.Complex complex12 = complex11.cosh();
        org.apache.commons.math.complex.Complex complex13 = complex12.tanh();
        org.apache.commons.math.complex.Complex complex14 = complex12.cosh();
        boolean boolean15 = complex12.isNaN();
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex17 = complex16.sqrt1z();
        org.apache.commons.math.complex.Complex complex20 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex21 = complex20.tanh();
        org.apache.commons.math.complex.Complex complex22 = complex17.subtract(complex20);
        org.apache.commons.math.complex.Complex complex25 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex26 = complex17.pow(complex25);
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex28 = complex27.atan();
        org.apache.commons.math.complex.Complex complex29 = complex28.sqrt();
        org.apache.commons.math.complex.Complex complex30 = complex28.tanh();
        org.apache.commons.math.complex.Complex complex31 = complex26.pow(complex28);
        org.apache.commons.math.complex.Complex complex32 = complex12.add(complex26);
        org.apache.commons.math.complex.Complex complex35 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex36 = complex12.multiply(complex35);
        org.apache.commons.math.complex.Complex complex37 = complex6.add(complex12);
        org.apache.commons.math.complex.Complex complex38 = complex6.asin();
        org.apache.commons.math.complex.Complex complex39 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex40 = complex39.atan();
        org.apache.commons.math.complex.Complex complex41 = complex40.cosh();
        org.apache.commons.math.complex.Complex complex42 = complex41.tanh();
        org.apache.commons.math.complex.Complex complex43 = complex41.cosh();
        boolean boolean44 = complex41.isNaN();
        org.apache.commons.math.complex.Complex complex45 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex46 = complex45.sqrt1z();
        org.apache.commons.math.complex.Complex complex49 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex50 = complex49.tanh();
        org.apache.commons.math.complex.Complex complex51 = complex46.subtract(complex49);
        org.apache.commons.math.complex.Complex complex54 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex55 = complex46.pow(complex54);
        org.apache.commons.math.complex.Complex complex56 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex57 = complex56.atan();
        org.apache.commons.math.complex.Complex complex58 = complex57.sqrt();
        org.apache.commons.math.complex.Complex complex59 = complex57.tanh();
        org.apache.commons.math.complex.Complex complex60 = complex55.pow(complex57);
        org.apache.commons.math.complex.Complex complex61 = complex41.add(complex55);
        org.apache.commons.math.complex.Complex complex64 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex65 = complex41.multiply(complex64);
        org.apache.commons.math.complex.Complex complex66 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex67 = complex66.atan();
        org.apache.commons.math.complex.Complex complex68 = complex67.sqrt();
        org.apache.commons.math.complex.Complex complex70 = complex68.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex71 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex72 = complex68.multiply(complex71);
        org.apache.commons.math.complex.Complex complex73 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex74 = complex73.atan();
        org.apache.commons.math.complex.Complex complex75 = complex74.cosh();
        org.apache.commons.math.complex.Complex complex76 = complex75.asin();
        org.apache.commons.math.complex.Complex complex77 = complex71.add(complex76);
        org.apache.commons.math.complex.Complex complex78 = complex77.conjugate();
        double double79 = complex78.getImaginary();
        boolean boolean80 = complex41.equals((java.lang.Object) complex78);
        org.apache.commons.math.complex.Complex complex81 = complex38.divide(complex41);
        org.apache.commons.math.complex.Complex complex82 = complex3.add(complex38);
        org.apache.commons.math.complex.ComplexField complexField83 = complex38.getField();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex6", complex3.equals(complex6) ? complex3.hashCode() == complex6.hashCode() : true);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        double double8 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex9 = complex4.divide(complex7);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.atan();
        org.apache.commons.math.complex.Complex complex12 = complex11.cosh();
        org.apache.commons.math.complex.Complex complex13 = complex12.tanh();
        org.apache.commons.math.complex.Complex complex14 = complex13.sinh();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex16 = complex15.atan();
        org.apache.commons.math.complex.Complex complex17 = complex16.cosh();
        double double18 = complex17.getArgument();
        org.apache.commons.math.complex.Complex complex19 = complex14.divide(complex17);
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex21 = complex20.atan();
        org.apache.commons.math.complex.Complex complex22 = complex21.sqrt();
        org.apache.commons.math.complex.Complex complex23 = complex21.tanh();
        org.apache.commons.math.complex.Complex complex24 = complex17.multiply(complex23);
        org.apache.commons.math.complex.Complex complex25 = complex17.tanh();
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex27 = complex26.atan();
        org.apache.commons.math.complex.Complex complex28 = complex27.cosh();
        org.apache.commons.math.complex.Complex complex29 = complex28.tanh();
        org.apache.commons.math.complex.Complex complex30 = complex28.exp();
        org.apache.commons.math.complex.Complex complex31 = complex28.exp();
        org.apache.commons.math.complex.Complex complex32 = complex31.sqrt();
        org.apache.commons.math.complex.Complex complex33 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex34 = complex33.atan();
        org.apache.commons.math.complex.Complex complex35 = complex34.cosh();
        org.apache.commons.math.complex.Complex complex36 = complex35.tanh();
        org.apache.commons.math.complex.Complex complex37 = complex36.sinh();
        org.apache.commons.math.complex.Complex complex38 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex39 = complex38.atan();
        org.apache.commons.math.complex.Complex complex40 = complex39.cosh();
        double double41 = complex40.getArgument();
        org.apache.commons.math.complex.Complex complex42 = complex37.divide(complex40);
        java.lang.String str43 = complex42.toString();
        org.apache.commons.math.complex.Complex complex44 = complex42.sqrt1z();
        org.apache.commons.math.complex.Complex complex45 = complex44.tan();
        org.apache.commons.math.complex.Complex complex46 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean47 = complex46.isInfinite();
        org.apache.commons.math.complex.Complex complex48 = complex45.multiply(complex46);
        org.apache.commons.math.complex.Complex complex49 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex50 = complex49.sqrt1z();
        org.apache.commons.math.complex.Complex complex51 = complex45.add(complex49);
        org.apache.commons.math.complex.Complex complex52 = complex32.add(complex51);
        org.apache.commons.math.complex.Complex complex53 = complex25.multiply(complex51);
        org.apache.commons.math.complex.Complex complex54 = complex4.subtract(complex51);
        org.apache.commons.math.complex.Complex complex55 = complex54.negate();
        org.apache.commons.math.complex.Complex complex56 = complex54.atan();
        org.apache.commons.math.complex.Complex complex57 = complex54.conjugate();
        org.apache.commons.math.complex.Complex complex58 = complex57.sin();
        org.apache.commons.math.complex.Complex complex59 = complex57.cos();
        org.apache.commons.math.complex.Complex complex60 = complex57.tan();
        double double61 = complex60.getReal();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex54 and complex57", complex54.equals(complex57) ? complex54.hashCode() == complex57.hashCode() : true);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        double double8 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex9 = complex4.divide(complex7);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.atan();
        org.apache.commons.math.complex.Complex complex12 = complex11.sqrt();
        org.apache.commons.math.complex.Complex complex13 = complex11.tanh();
        org.apache.commons.math.complex.Complex complex14 = complex7.multiply(complex13);
        org.apache.commons.math.complex.Complex complex15 = complex13.exp();
        double double16 = complex13.abs();
        org.apache.commons.math.complex.Complex complex17 = complex13.atan();
        org.apache.commons.math.complex.Complex complex18 = complex13.conjugate();
        org.apache.commons.math.complex.Complex complex19 = complex13.negate();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex18", complex0.equals(complex18) ? complex0.hashCode() == complex18.hashCode() : true);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.asin();
        org.apache.commons.math.complex.Complex complex4 = complex3.tan();
        org.apache.commons.math.complex.Complex complex5 = complex3.sqrt();
        boolean boolean7 = complex3.equals((java.lang.Object) (-1.0f));
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.atan();
        org.apache.commons.math.complex.Complex complex10 = complex9.cosh();
        org.apache.commons.math.complex.Complex complex11 = complex10.tanh();
        org.apache.commons.math.complex.Complex complex12 = complex11.sinh();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex14 = complex13.atan();
        org.apache.commons.math.complex.Complex complex15 = complex14.cosh();
        double double16 = complex15.getArgument();
        org.apache.commons.math.complex.Complex complex17 = complex12.divide(complex15);
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex19 = complex18.atan();
        org.apache.commons.math.complex.Complex complex20 = complex19.sqrt();
        org.apache.commons.math.complex.Complex complex21 = complex19.tanh();
        org.apache.commons.math.complex.Complex complex22 = complex15.multiply(complex21);
        org.apache.commons.math.complex.Complex complex23 = complex15.tanh();
        org.apache.commons.math.complex.Complex complex24 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex25 = complex24.atan();
        org.apache.commons.math.complex.Complex complex26 = complex25.sqrt();
        org.apache.commons.math.complex.Complex complex28 = complex26.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex29 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex30 = complex26.multiply(complex29);
        org.apache.commons.math.complex.Complex complex31 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex32 = complex31.atan();
        org.apache.commons.math.complex.Complex complex33 = complex32.cosh();
        org.apache.commons.math.complex.Complex complex34 = complex33.asin();
        org.apache.commons.math.complex.Complex complex35 = complex29.add(complex34);
        org.apache.commons.math.complex.Complex complex36 = complex35.conjugate();
        org.apache.commons.math.complex.Complex complex37 = complex36.conjugate();
        org.apache.commons.math.complex.Complex complex38 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex39 = complex38.atan();
        org.apache.commons.math.complex.Complex complex40 = complex39.cosh();
        org.apache.commons.math.complex.Complex complex41 = complex40.tanh();
        org.apache.commons.math.complex.Complex complex42 = complex41.sinh();
        org.apache.commons.math.complex.Complex complex43 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex44 = complex43.atan();
        org.apache.commons.math.complex.Complex complex45 = complex44.cosh();
        double double46 = complex45.getArgument();
        org.apache.commons.math.complex.Complex complex47 = complex42.divide(complex45);
        org.apache.commons.math.complex.Complex complex48 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex49 = complex48.atan();
        org.apache.commons.math.complex.Complex complex50 = complex49.sqrt();
        org.apache.commons.math.complex.Complex complex51 = complex49.tanh();
        org.apache.commons.math.complex.Complex complex52 = complex45.multiply(complex51);
        org.apache.commons.math.complex.Complex complex53 = complex51.exp();
        double double54 = complex51.abs();
        org.apache.commons.math.complex.Complex complex55 = complex51.atan();
        org.apache.commons.math.complex.Complex complex56 = complex55.exp();
        org.apache.commons.math.complex.Complex complex57 = complex36.add(complex55);
        org.apache.commons.math.complex.Complex complex58 = complex15.add(complex57);
        double double59 = complex15.getReal();
        org.apache.commons.math.complex.Complex complex60 = complex3.multiply(complex15);
        org.apache.commons.math.complex.Complex complex61 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex62 = complex61.atan();
        org.apache.commons.math.complex.Complex complex63 = complex62.cosh();
        org.apache.commons.math.complex.Complex complex64 = complex63.tanh();
        org.apache.commons.math.complex.Complex complex65 = complex64.sinh();
        org.apache.commons.math.complex.Complex complex66 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex67 = complex66.atan();
        org.apache.commons.math.complex.Complex complex68 = complex67.cosh();
        double double69 = complex68.getArgument();
        org.apache.commons.math.complex.Complex complex70 = complex65.divide(complex68);
        java.lang.String str71 = complex70.toString();
        double double72 = complex70.getImaginary();
        double double73 = complex70.getReal();
        org.apache.commons.math.complex.Complex complex74 = complex15.subtract(complex70);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex60", complex3.equals(complex60) ? complex3.hashCode() == complex60.hashCode() : true);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        double double8 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex9 = complex4.divide(complex7);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.atan();
        org.apache.commons.math.complex.Complex complex12 = complex11.sqrt();
        org.apache.commons.math.complex.Complex complex13 = complex11.tanh();
        org.apache.commons.math.complex.Complex complex14 = complex7.multiply(complex13);
        boolean boolean15 = complex7.isInfinite();
        org.apache.commons.math.complex.Complex complex16 = complex7.conjugate();
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex18 = complex17.sqrt1z();
        org.apache.commons.math.complex.Complex complex21 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex22 = complex21.tanh();
        org.apache.commons.math.complex.Complex complex23 = complex18.subtract(complex21);
        double double24 = complex18.getArgument();
        org.apache.commons.math.complex.Complex complex25 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex26 = complex25.sqrt1z();
        org.apache.commons.math.complex.Complex complex29 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex30 = complex29.tanh();
        org.apache.commons.math.complex.Complex complex31 = complex26.subtract(complex29);
        double double32 = complex31.getImaginary();
        org.apache.commons.math.complex.Complex complex33 = complex31.asin();
        org.apache.commons.math.complex.Complex complex34 = complex31.cos();
        org.apache.commons.math.complex.Complex complex36 = complex34.multiply(1.0d);
        org.apache.commons.math.complex.Complex complex37 = complex18.subtract(complex36);
        org.apache.commons.math.complex.Complex complex38 = complex18.sqrt1z();
        org.apache.commons.math.complex.Complex complex39 = complex7.add(complex18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex16", complex2.equals(complex16) ? complex2.hashCode() == complex16.hashCode() : true);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex4 = complex3.atan();
        org.apache.commons.math.complex.Complex complex5 = complex4.cosh();
        org.apache.commons.math.complex.Complex complex6 = complex5.tanh();
        org.apache.commons.math.complex.Complex complex7 = complex6.sinh();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.atan();
        org.apache.commons.math.complex.Complex complex10 = complex9.cosh();
        double double11 = complex10.getArgument();
        org.apache.commons.math.complex.Complex complex12 = complex7.divide(complex10);
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex14 = complex13.atan();
        org.apache.commons.math.complex.Complex complex15 = complex14.sqrt();
        org.apache.commons.math.complex.Complex complex16 = complex14.tanh();
        org.apache.commons.math.complex.Complex complex17 = complex10.multiply(complex16);
        org.apache.commons.math.complex.Complex complex18 = complex1.pow(complex16);
        org.apache.commons.math.complex.Complex complex19 = complex1.acos();
        org.apache.commons.math.complex.Complex complex20 = complex19.conjugate();
        org.apache.commons.math.complex.Complex complex21 = complex19.sqrt();
        org.apache.commons.math.complex.Complex complex22 = complex21.exp();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex19 and complex20", complex19.equals(complex20) ? complex19.hashCode() == complex20.hashCode() : true);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.asin();
        boolean boolean4 = complex2.isInfinite();
        org.apache.commons.math.complex.Complex complex6 = complex2.multiply((double) 0);
        org.apache.commons.math.complex.Complex complex7 = complex2.acos();
        org.apache.commons.math.complex.Complex complex8 = complex7.negate();
        org.apache.commons.math.complex.Complex complex9 = complex7.atan();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex8", complex0.equals(complex8) ? complex0.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        double double8 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex9 = complex4.divide(complex7);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.atan();
        org.apache.commons.math.complex.Complex complex12 = complex11.sqrt();
        org.apache.commons.math.complex.Complex complex13 = complex11.tanh();
        org.apache.commons.math.complex.Complex complex14 = complex7.multiply(complex13);
        org.apache.commons.math.complex.Complex complex15 = complex13.exp();
        double double16 = complex13.abs();
        org.apache.commons.math.complex.Complex complex17 = complex13.atan();
        org.apache.commons.math.complex.Complex complex18 = complex13.conjugate();
        org.apache.commons.math.complex.Complex complex19 = complex18.cos();
        org.apache.commons.math.complex.Complex complex20 = complex18.tanh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex19", complex2.equals(complex19) ? complex2.hashCode() == complex19.hashCode() : true);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex6 = complex2.multiply(complex5);
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex8 = complex7.atan();
        org.apache.commons.math.complex.Complex complex9 = complex8.cosh();
        org.apache.commons.math.complex.Complex complex10 = complex9.asin();
        org.apache.commons.math.complex.Complex complex11 = complex5.add(complex10);
        org.apache.commons.math.complex.Complex complex12 = complex11.conjugate();
        org.apache.commons.math.complex.Complex complex13 = complex12.conjugate();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex15 = complex14.atan();
        org.apache.commons.math.complex.Complex complex16 = complex15.cosh();
        org.apache.commons.math.complex.Complex complex17 = complex16.tanh();
        org.apache.commons.math.complex.Complex complex18 = complex17.sinh();
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex20 = complex19.atan();
        org.apache.commons.math.complex.Complex complex21 = complex20.cosh();
        double double22 = complex21.getArgument();
        org.apache.commons.math.complex.Complex complex23 = complex18.divide(complex21);
        org.apache.commons.math.complex.Complex complex24 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex25 = complex24.atan();
        org.apache.commons.math.complex.Complex complex26 = complex25.sqrt();
        org.apache.commons.math.complex.Complex complex27 = complex25.tanh();
        org.apache.commons.math.complex.Complex complex28 = complex21.multiply(complex27);
        org.apache.commons.math.complex.Complex complex29 = complex27.exp();
        double double30 = complex27.abs();
        org.apache.commons.math.complex.Complex complex31 = complex27.atan();
        org.apache.commons.math.complex.Complex complex32 = complex31.exp();
        org.apache.commons.math.complex.Complex complex33 = complex12.add(complex31);
        org.apache.commons.math.complex.Complex complex34 = complex31.cos();
        org.apache.commons.math.complex.Complex complex35 = complex31.cosh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex9 and complex34", complex9.equals(complex34) ? complex9.hashCode() == complex34.hashCode() : true);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        double double8 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex9 = complex4.divide(complex7);
        org.apache.commons.math.complex.Complex complex10 = complex4.log();
        org.apache.commons.math.complex.Complex complex11 = complex10.cos();
        org.apache.commons.math.complex.Complex complex12 = complex10.exp();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex14 = complex13.atan();
        org.apache.commons.math.complex.Complex complex15 = complex14.cosh();
        org.apache.commons.math.complex.Complex complex16 = complex15.asin();
        org.apache.commons.math.complex.ComplexField complexField17 = complex15.getField();
        org.apache.commons.math.complex.Complex complex18 = complex15.tanh();
        org.apache.commons.math.complex.Complex complex19 = complex15.log();
        org.apache.commons.math.complex.Complex complex20 = complex19.cosh();
        org.apache.commons.math.complex.Complex complex21 = complex10.multiply(complex19);
        org.apache.commons.math.complex.Complex complex22 = complex21.cosh();
        org.apache.commons.math.complex.Complex complex23 = complex22.sqrt();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex21", complex0.equals(complex21) ? complex0.hashCode() == complex21.hashCode() : true);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex5 = complex2.tan();
        java.lang.String str6 = complex5.toString();
        org.apache.commons.math.complex.Complex complex7 = complex5.cos();
        org.apache.commons.math.complex.Complex complex8 = complex5.sin();
        org.apache.commons.math.complex.Complex complex9 = complex8.sqrt();
        org.apache.commons.math.complex.Complex complex10 = complex8.conjugate();
        org.apache.commons.math.complex.Complex complex11 = complex10.negate();
        org.apache.commons.math.complex.Complex complex12 = complex11.tanh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex10", complex0.equals(complex10) ? complex0.hashCode() == complex10.hashCode() : true);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex4 = complex3.atan();
        org.apache.commons.math.complex.Complex complex5 = complex4.cosh();
        org.apache.commons.math.complex.Complex complex6 = complex5.tanh();
        org.apache.commons.math.complex.Complex complex7 = complex5.exp();
        org.apache.commons.math.complex.Complex complex8 = complex1.add(complex5);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex10 = complex9.atan();
        org.apache.commons.math.complex.Complex complex11 = complex10.cosh();
        org.apache.commons.math.complex.Complex complex12 = complex11.tanh();
        org.apache.commons.math.complex.Complex complex13 = complex12.sinh();
        boolean boolean14 = complex12.isInfinite();
        org.apache.commons.math.complex.Complex complex15 = complex1.subtract(complex12);
        java.lang.String str16 = complex15.toString();
        java.lang.String str17 = complex15.toString();
        org.apache.commons.math.complex.Complex complex19 = complex15.multiply((double) (byte) -1);
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex21 = complex20.atan();
        org.apache.commons.math.complex.Complex complex22 = complex21.cosh();
        org.apache.commons.math.complex.Complex complex23 = complex22.tanh();
        org.apache.commons.math.complex.Complex complex24 = complex23.sinh();
        org.apache.commons.math.complex.Complex complex25 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex26 = complex25.atan();
        org.apache.commons.math.complex.Complex complex27 = complex26.cosh();
        double double28 = complex27.getArgument();
        org.apache.commons.math.complex.Complex complex29 = complex24.divide(complex27);
        java.lang.String str30 = complex29.toString();
        org.apache.commons.math.complex.Complex complex31 = complex29.sqrt1z();
        org.apache.commons.math.complex.Complex complex32 = complex19.multiply(complex31);
        org.apache.commons.math.complex.Complex complex33 = complex31.sqrt();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex6 and complex19", complex6.equals(complex19) ? complex6.hashCode() == complex19.hashCode() : true);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex6 = complex2.multiply(complex5);
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex8 = complex7.atan();
        org.apache.commons.math.complex.Complex complex9 = complex8.cosh();
        org.apache.commons.math.complex.Complex complex10 = complex9.asin();
        org.apache.commons.math.complex.Complex complex11 = complex5.add(complex10);
        org.apache.commons.math.complex.Complex complex12 = complex11.conjugate();
        org.apache.commons.math.complex.Complex complex13 = complex12.conjugate();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex15 = complex14.atan();
        org.apache.commons.math.complex.Complex complex16 = complex15.cosh();
        org.apache.commons.math.complex.Complex complex17 = complex16.tanh();
        org.apache.commons.math.complex.Complex complex18 = complex17.sinh();
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex20 = complex19.atan();
        org.apache.commons.math.complex.Complex complex21 = complex20.cosh();
        double double22 = complex21.getArgument();
        org.apache.commons.math.complex.Complex complex23 = complex18.divide(complex21);
        org.apache.commons.math.complex.Complex complex24 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex25 = complex24.atan();
        org.apache.commons.math.complex.Complex complex26 = complex25.sqrt();
        org.apache.commons.math.complex.Complex complex27 = complex25.tanh();
        org.apache.commons.math.complex.Complex complex28 = complex21.multiply(complex27);
        org.apache.commons.math.complex.Complex complex29 = complex27.exp();
        double double30 = complex27.abs();
        org.apache.commons.math.complex.Complex complex31 = complex27.atan();
        org.apache.commons.math.complex.Complex complex32 = complex31.exp();
        org.apache.commons.math.complex.Complex complex33 = complex12.add(complex31);
        org.apache.commons.math.complex.Complex complex34 = complex31.cos();
        org.apache.commons.math.complex.Complex complex35 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex36 = complex35.atan();
        org.apache.commons.math.complex.Complex complex37 = complex36.sqrt();
        org.apache.commons.math.complex.Complex complex39 = complex37.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex40 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex41 = complex37.multiply(complex40);
        org.apache.commons.math.complex.Complex complex42 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex43 = complex42.atan();
        org.apache.commons.math.complex.Complex complex44 = complex43.cosh();
        org.apache.commons.math.complex.Complex complex45 = complex44.asin();
        org.apache.commons.math.complex.Complex complex46 = complex40.add(complex45);
        org.apache.commons.math.complex.Complex complex47 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex48 = complex47.atan();
        org.apache.commons.math.complex.Complex complex49 = complex46.multiply(complex48);
        org.apache.commons.math.complex.Complex complex50 = complex46.tanh();
        java.lang.String str51 = complex46.toString();
        boolean boolean52 = complex34.equals((java.lang.Object) complex46);
        double double53 = complex46.getImaginary();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex9 and complex34", complex9.equals(complex34) ? complex9.hashCode() == complex34.hashCode() : true);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex4 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex5 = complex4.tanh();
        org.apache.commons.math.complex.Complex complex6 = complex1.subtract(complex4);
        double double7 = complex1.getArgument();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.sqrt1z();
        org.apache.commons.math.complex.Complex complex12 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex13 = complex12.tanh();
        org.apache.commons.math.complex.Complex complex14 = complex9.subtract(complex12);
        double double15 = complex14.getImaginary();
        org.apache.commons.math.complex.Complex complex16 = complex14.asin();
        org.apache.commons.math.complex.Complex complex17 = complex14.cos();
        org.apache.commons.math.complex.Complex complex19 = complex17.multiply(1.0d);
        org.apache.commons.math.complex.Complex complex20 = complex1.subtract(complex19);
        org.apache.commons.math.complex.Complex complex21 = complex1.sqrt1z();
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex23 = complex22.atan();
        org.apache.commons.math.complex.Complex complex24 = complex23.cosh();
        org.apache.commons.math.complex.Complex complex25 = complex24.tanh();
        org.apache.commons.math.complex.Complex complex26 = complex25.sinh();
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex28 = complex27.atan();
        org.apache.commons.math.complex.Complex complex29 = complex28.cosh();
        double double30 = complex29.getArgument();
        org.apache.commons.math.complex.Complex complex31 = complex26.divide(complex29);
        org.apache.commons.math.complex.Complex complex32 = complex26.log();
        org.apache.commons.math.complex.Complex complex33 = complex32.cos();
        org.apache.commons.math.complex.Complex complex34 = complex32.exp();
        org.apache.commons.math.complex.Complex complex35 = complex32.acos();
        org.apache.commons.math.complex.Complex complex36 = complex32.log();
        org.apache.commons.math.complex.Complex complex37 = complex32.tanh();
        org.apache.commons.math.complex.Complex complex38 = complex1.multiply(complex37);
        boolean boolean39 = complex1.isNaN();
        org.apache.commons.math.complex.Complex complex40 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex41 = complex40.atan();
        org.apache.commons.math.complex.Complex complex42 = complex41.sqrt();
        org.apache.commons.math.complex.Complex complex44 = complex42.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex45 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex46 = complex42.multiply(complex45);
        org.apache.commons.math.complex.Complex complex47 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex48 = complex47.atan();
        org.apache.commons.math.complex.Complex complex49 = complex48.cosh();
        org.apache.commons.math.complex.Complex complex50 = complex49.tanh();
        org.apache.commons.math.complex.Complex complex51 = complex50.sinh();
        org.apache.commons.math.complex.Complex complex52 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex53 = complex52.atan();
        org.apache.commons.math.complex.Complex complex54 = complex53.cosh();
        double double55 = complex54.getArgument();
        org.apache.commons.math.complex.Complex complex56 = complex51.divide(complex54);
        java.lang.String str57 = complex56.toString();
        org.apache.commons.math.complex.Complex complex58 = complex56.sqrt1z();
        org.apache.commons.math.complex.Complex complex59 = complex58.tan();
        org.apache.commons.math.complex.Complex complex60 = complex42.add(complex59);
        org.apache.commons.math.complex.Complex complex61 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex62 = complex61.atan();
        org.apache.commons.math.complex.Complex complex63 = complex62.sqrt();
        org.apache.commons.math.complex.Complex complex65 = complex63.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex66 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex67 = complex63.multiply(complex66);
        org.apache.commons.math.complex.Complex complex68 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex69 = complex68.atan();
        org.apache.commons.math.complex.Complex complex70 = complex69.cosh();
        org.apache.commons.math.complex.Complex complex71 = complex70.asin();
        org.apache.commons.math.complex.Complex complex72 = complex66.add(complex71);
        org.apache.commons.math.complex.Complex complex73 = complex72.conjugate();
        org.apache.commons.math.complex.Complex complex74 = complex42.divide(complex72);
        org.apache.commons.math.complex.Complex complex75 = complex74.conjugate();
        org.apache.commons.math.complex.Complex complex76 = complex1.subtract(complex75);
        org.apache.commons.math.complex.Complex complex78 = complex76.multiply((-0.5669115049410094d));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex75", complex0.equals(complex75) ? complex0.hashCode() == complex75.hashCode() : true);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex4 = complex3.atan();
        org.apache.commons.math.complex.Complex complex5 = complex4.cosh();
        org.apache.commons.math.complex.Complex complex6 = complex5.tanh();
        org.apache.commons.math.complex.Complex complex7 = complex6.sinh();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.atan();
        org.apache.commons.math.complex.Complex complex10 = complex9.cosh();
        double double11 = complex10.getArgument();
        org.apache.commons.math.complex.Complex complex12 = complex7.divide(complex10);
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex14 = complex13.atan();
        org.apache.commons.math.complex.Complex complex15 = complex14.sqrt();
        org.apache.commons.math.complex.Complex complex16 = complex14.tanh();
        org.apache.commons.math.complex.Complex complex17 = complex10.multiply(complex16);
        org.apache.commons.math.complex.Complex complex18 = complex1.pow(complex16);
        org.apache.commons.math.complex.Complex complex19 = complex1.acos();
        double double20 = complex19.getImaginary();
        org.apache.commons.math.complex.Complex complex21 = complex19.cos();
        org.apache.commons.math.complex.Complex complex22 = complex21.cosh();
        boolean boolean23 = complex21.isInfinite();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex5 and complex22", complex5.equals(complex22) ? complex5.hashCode() == complex22.hashCode() : true);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math.complex.Complex complex3 = complex1.cos();
        org.apache.commons.math.complex.Complex complex4 = complex1.sinh();
        boolean boolean5 = complex4.isNaN();
        org.apache.commons.math.complex.Complex complex6 = complex4.tanh();
        double double7 = complex6.abs();
        org.apache.commons.math.complex.Complex complex10 = new org.apache.commons.math.complex.Complex((double) 0.0f, (double) (short) -1);
        org.apache.commons.math.complex.Complex complex11 = complex10.log();
        double double12 = complex11.getImaginary();
        double double13 = complex11.getReal();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex15 = complex14.atan();
        org.apache.commons.math.complex.Complex complex16 = complex15.cosh();
        org.apache.commons.math.complex.Complex complex17 = complex16.asin();
        org.apache.commons.math.complex.Complex complex18 = complex17.tan();
        org.apache.commons.math.complex.Complex complex19 = complex17.sqrt();
        boolean boolean21 = complex17.equals((java.lang.Object) (-1.0f));
        org.apache.commons.math.complex.Complex complex22 = complex17.atan();
        org.apache.commons.math.complex.Complex complex23 = complex11.subtract(complex17);
        org.apache.commons.math.complex.Complex complex24 = complex6.subtract(complex17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex16", complex3.equals(complex16) ? complex3.hashCode() == complex16.hashCode() : true);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math.complex.Complex complex3 = complex1.cos();
        org.apache.commons.math.complex.Complex complex4 = complex3.acos();
        java.lang.Class<?> wildcardClass5 = complex3.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex4", complex0.equals(complex4) ? complex0.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean1 = complex0.isInfinite();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex3 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex6 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex7 = complex6.tanh();
        org.apache.commons.math.complex.Complex complex8 = complex3.subtract(complex6);
        double double9 = complex8.getImaginary();
        org.apache.commons.math.complex.Complex complex10 = complex8.sqrt();
        org.apache.commons.math.complex.Complex complex12 = complex8.multiply((double) 10);
        org.apache.commons.math.complex.Complex complex13 = complex0.divide(complex12);
        org.apache.commons.math.complex.Complex complex14 = complex0.sin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex13", complex0.equals(complex13) ? complex0.hashCode() == complex13.hashCode() : true);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex4 = complex3.atan();
        org.apache.commons.math.complex.Complex complex5 = complex4.cosh();
        org.apache.commons.math.complex.Complex complex6 = complex5.tanh();
        org.apache.commons.math.complex.Complex complex7 = complex5.exp();
        org.apache.commons.math.complex.Complex complex8 = complex1.add(complex5);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex10 = complex9.atan();
        org.apache.commons.math.complex.Complex complex11 = complex10.cosh();
        org.apache.commons.math.complex.Complex complex12 = complex11.tanh();
        org.apache.commons.math.complex.Complex complex13 = complex12.sinh();
        boolean boolean14 = complex12.isInfinite();
        org.apache.commons.math.complex.Complex complex15 = complex1.subtract(complex12);
        org.apache.commons.math.complex.Complex complex16 = complex1.acos();
        org.apache.commons.math.complex.Complex complex17 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex18 = complex1.exp();
        org.apache.commons.math.complex.Complex complex19 = complex18.acos();
        org.apache.commons.math.complex.Complex complex20 = complex19.tanh();
        org.apache.commons.math.complex.Complex complex21 = complex20.tan();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex19", complex0.equals(complex19) ? complex0.hashCode() == complex19.hashCode() : true);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex5 = complex4.sqrt();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex7 = complex6.atan();
        org.apache.commons.math.complex.Complex complex8 = complex7.cosh();
        org.apache.commons.math.complex.Complex complex9 = complex8.tanh();
        org.apache.commons.math.complex.Complex complex10 = complex9.sinh();
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex12 = complex11.atan();
        org.apache.commons.math.complex.Complex complex13 = complex12.cosh();
        double double14 = complex13.getArgument();
        org.apache.commons.math.complex.Complex complex15 = complex10.divide(complex13);
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex17 = complex16.atan();
        org.apache.commons.math.complex.Complex complex18 = complex17.cosh();
        org.apache.commons.math.complex.Complex complex19 = complex18.tanh();
        org.apache.commons.math.complex.Complex complex20 = complex19.sinh();
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex22 = complex21.atan();
        org.apache.commons.math.complex.Complex complex23 = complex22.cosh();
        double double24 = complex23.getArgument();
        org.apache.commons.math.complex.Complex complex25 = complex20.divide(complex23);
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex27 = complex26.atan();
        org.apache.commons.math.complex.Complex complex28 = complex27.sqrt();
        org.apache.commons.math.complex.Complex complex29 = complex27.tanh();
        org.apache.commons.math.complex.Complex complex30 = complex23.multiply(complex29);
        org.apache.commons.math.complex.Complex complex31 = complex23.tanh();
        org.apache.commons.math.complex.Complex complex32 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex33 = complex32.atan();
        org.apache.commons.math.complex.Complex complex34 = complex33.cosh();
        org.apache.commons.math.complex.Complex complex35 = complex34.tanh();
        org.apache.commons.math.complex.Complex complex36 = complex34.exp();
        org.apache.commons.math.complex.Complex complex37 = complex34.exp();
        org.apache.commons.math.complex.Complex complex38 = complex37.sqrt();
        org.apache.commons.math.complex.Complex complex39 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex40 = complex39.atan();
        org.apache.commons.math.complex.Complex complex41 = complex40.cosh();
        org.apache.commons.math.complex.Complex complex42 = complex41.tanh();
        org.apache.commons.math.complex.Complex complex43 = complex42.sinh();
        org.apache.commons.math.complex.Complex complex44 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex45 = complex44.atan();
        org.apache.commons.math.complex.Complex complex46 = complex45.cosh();
        double double47 = complex46.getArgument();
        org.apache.commons.math.complex.Complex complex48 = complex43.divide(complex46);
        java.lang.String str49 = complex48.toString();
        org.apache.commons.math.complex.Complex complex50 = complex48.sqrt1z();
        org.apache.commons.math.complex.Complex complex51 = complex50.tan();
        org.apache.commons.math.complex.Complex complex52 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean53 = complex52.isInfinite();
        org.apache.commons.math.complex.Complex complex54 = complex51.multiply(complex52);
        org.apache.commons.math.complex.Complex complex55 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex56 = complex55.sqrt1z();
        org.apache.commons.math.complex.Complex complex57 = complex51.add(complex55);
        org.apache.commons.math.complex.Complex complex58 = complex38.add(complex57);
        org.apache.commons.math.complex.Complex complex59 = complex31.multiply(complex57);
        org.apache.commons.math.complex.Complex complex60 = complex10.subtract(complex57);
        org.apache.commons.math.complex.Complex complex61 = complex60.negate();
        org.apache.commons.math.complex.Complex complex62 = complex60.atan();
        org.apache.commons.math.complex.Complex complex63 = complex60.conjugate();
        org.apache.commons.math.complex.Complex complex64 = complex63.sin();
        org.apache.commons.math.complex.Complex complex65 = complex5.multiply(complex63);
        org.apache.commons.math.complex.Complex complex66 = complex5.sinh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex60 and complex63", complex60.equals(complex63) ? complex60.hashCode() == complex63.hashCode() : true);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        java.lang.String str4 = complex3.toString();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.atan();
        org.apache.commons.math.complex.Complex complex10 = complex9.cosh();
        org.apache.commons.math.complex.Complex complex11 = complex10.tanh();
        org.apache.commons.math.complex.Complex complex12 = complex10.exp();
        org.apache.commons.math.complex.Complex complex13 = complex6.add(complex10);
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex15 = complex14.atan();
        org.apache.commons.math.complex.Complex complex16 = complex15.cosh();
        org.apache.commons.math.complex.Complex complex17 = complex16.tanh();
        org.apache.commons.math.complex.Complex complex18 = complex17.sinh();
        boolean boolean19 = complex17.isInfinite();
        org.apache.commons.math.complex.Complex complex20 = complex6.subtract(complex17);
        org.apache.commons.math.complex.Complex complex21 = complex3.divide(complex20);
        org.apache.commons.math.complex.Complex complex22 = complex20.conjugate();
        org.apache.commons.math.complex.Complex complex23 = complex20.sqrt();
        org.apache.commons.math.complex.Complex complex26 = new org.apache.commons.math.complex.Complex((double) 0.0f, (double) (short) -1);
        double double27 = complex26.abs();
        boolean boolean28 = complex26.isNaN();
        org.apache.commons.math.complex.Complex complex29 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex30 = complex29.atan();
        org.apache.commons.math.complex.Complex complex31 = complex30.cosh();
        org.apache.commons.math.complex.Complex complex32 = complex31.asin();
        org.apache.commons.math.complex.ComplexField complexField33 = complex31.getField();
        org.apache.commons.math.complex.Complex complex34 = complex31.tanh();
        org.apache.commons.math.complex.Complex complex35 = complex31.log();
        org.apache.commons.math.complex.Complex complex36 = complex35.cosh();
        boolean boolean37 = complex35.isNaN();
        org.apache.commons.math.complex.Complex complex38 = complex26.divide(complex35);
        org.apache.commons.math.complex.Complex complex39 = complex35.cosh();
        org.apache.commons.math.complex.Complex complex40 = complex39.atan();
        boolean boolean41 = complex23.equals((java.lang.Object) complex39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex20 and complex22", complex20.equals(complex22) ? complex20.hashCode() == complex22.hashCode() : true);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex4 = complex3.atan();
        org.apache.commons.math.complex.Complex complex5 = complex4.cosh();
        org.apache.commons.math.complex.Complex complex6 = complex5.tanh();
        org.apache.commons.math.complex.Complex complex7 = complex5.exp();
        org.apache.commons.math.complex.Complex complex8 = complex1.add(complex5);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex10 = complex9.atan();
        org.apache.commons.math.complex.Complex complex11 = complex10.cosh();
        org.apache.commons.math.complex.Complex complex12 = complex11.tanh();
        org.apache.commons.math.complex.Complex complex13 = complex12.sinh();
        boolean boolean14 = complex12.isInfinite();
        org.apache.commons.math.complex.Complex complex15 = complex1.subtract(complex12);
        org.apache.commons.math.complex.Complex complex16 = complex1.acos();
        org.apache.commons.math.complex.Complex complex17 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex18 = complex1.exp();
        org.apache.commons.math.complex.Complex complex19 = complex1.conjugate();
        org.apache.commons.math.complex.Complex complex20 = complex1.asin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex19", complex0.equals(complex19) ? complex0.hashCode() == complex19.hashCode() : true);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex4 = complex3.atan();
        org.apache.commons.math.complex.Complex complex5 = complex4.cosh();
        org.apache.commons.math.complex.Complex complex6 = complex5.tanh();
        org.apache.commons.math.complex.Complex complex7 = complex6.sinh();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.atan();
        org.apache.commons.math.complex.Complex complex10 = complex9.cosh();
        double double11 = complex10.getArgument();
        org.apache.commons.math.complex.Complex complex12 = complex7.divide(complex10);
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex14 = complex13.atan();
        org.apache.commons.math.complex.Complex complex15 = complex14.sqrt();
        org.apache.commons.math.complex.Complex complex16 = complex14.tanh();
        org.apache.commons.math.complex.Complex complex17 = complex10.multiply(complex16);
        org.apache.commons.math.complex.Complex complex18 = complex1.pow(complex16);
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex20 = complex19.atan();
        org.apache.commons.math.complex.Complex complex21 = complex19.sin();
        org.apache.commons.math.complex.Complex complex22 = complex1.pow(complex19);
        org.apache.commons.math.complex.Complex complex23 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex24 = complex23.atan();
        org.apache.commons.math.complex.Complex complex25 = complex24.sqrt();
        org.apache.commons.math.complex.Complex complex27 = complex25.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex29 = complex25.multiply(complex28);
        org.apache.commons.math.complex.Complex complex30 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex31 = complex30.atan();
        org.apache.commons.math.complex.Complex complex32 = complex31.cosh();
        org.apache.commons.math.complex.Complex complex33 = complex32.asin();
        org.apache.commons.math.complex.Complex complex34 = complex28.add(complex33);
        org.apache.commons.math.complex.Complex complex35 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex36 = complex35.atan();
        org.apache.commons.math.complex.Complex complex37 = complex34.multiply(complex36);
        org.apache.commons.math.complex.Complex complex38 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex39 = complex38.atan();
        org.apache.commons.math.complex.Complex complex40 = complex39.cosh();
        org.apache.commons.math.complex.Complex complex41 = complex37.multiply(complex40);
        org.apache.commons.math.complex.Complex complex42 = complex1.divide(complex40);
        org.apache.commons.math.complex.Complex complex43 = complex42.conjugate();
        boolean boolean44 = complex42.isInfinite();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex43", complex0.equals(complex43) ? complex0.hashCode() == complex43.hashCode() : true);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex4 = complex3.atan();
        org.apache.commons.math.complex.Complex complex5 = complex4.cosh();
        org.apache.commons.math.complex.Complex complex6 = complex5.tanh();
        org.apache.commons.math.complex.Complex complex7 = complex5.exp();
        org.apache.commons.math.complex.Complex complex8 = complex1.add(complex5);
        org.apache.commons.math.complex.Complex complex9 = complex8.asin();
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.atan();
        org.apache.commons.math.complex.Complex complex12 = complex11.sqrt();
        org.apache.commons.math.complex.Complex complex14 = complex12.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex16 = complex12.multiply(complex15);
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex18 = complex17.atan();
        org.apache.commons.math.complex.Complex complex19 = complex18.cosh();
        org.apache.commons.math.complex.Complex complex20 = complex19.asin();
        org.apache.commons.math.complex.Complex complex21 = complex15.add(complex20);
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex23 = complex22.atan();
        org.apache.commons.math.complex.Complex complex24 = complex21.multiply(complex23);
        org.apache.commons.math.complex.Complex complex25 = complex24.atan();
        double double26 = complex25.abs();
        double double27 = complex25.getReal();
        boolean boolean28 = complex25.isNaN();
        org.apache.commons.math.complex.Complex complex29 = complex8.divide(complex25);
        org.apache.commons.math.complex.Complex complex30 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex31 = complex30.atan();
        org.apache.commons.math.complex.Complex complex32 = complex31.cosh();
        org.apache.commons.math.complex.Complex complex33 = complex32.tanh();
        org.apache.commons.math.complex.Complex complex34 = complex33.sinh();
        org.apache.commons.math.complex.Complex complex35 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex36 = complex35.atan();
        org.apache.commons.math.complex.Complex complex37 = complex36.cosh();
        double double38 = complex37.getArgument();
        org.apache.commons.math.complex.Complex complex39 = complex34.divide(complex37);
        org.apache.commons.math.complex.Complex complex40 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex41 = complex40.atan();
        org.apache.commons.math.complex.Complex complex42 = complex41.sqrt();
        org.apache.commons.math.complex.Complex complex43 = complex41.tanh();
        org.apache.commons.math.complex.Complex complex44 = complex37.multiply(complex43);
        org.apache.commons.math.complex.Complex complex45 = complex37.tanh();
        org.apache.commons.math.complex.Complex complex46 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex47 = complex46.atan();
        org.apache.commons.math.complex.Complex complex48 = complex47.sqrt();
        org.apache.commons.math.complex.Complex complex50 = complex48.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex51 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex52 = complex48.multiply(complex51);
        org.apache.commons.math.complex.Complex complex53 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex54 = complex53.atan();
        org.apache.commons.math.complex.Complex complex55 = complex54.cosh();
        org.apache.commons.math.complex.Complex complex56 = complex55.asin();
        org.apache.commons.math.complex.Complex complex57 = complex51.add(complex56);
        org.apache.commons.math.complex.Complex complex58 = complex57.conjugate();
        org.apache.commons.math.complex.Complex complex59 = complex58.conjugate();
        org.apache.commons.math.complex.Complex complex60 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex61 = complex60.atan();
        org.apache.commons.math.complex.Complex complex62 = complex61.cosh();
        org.apache.commons.math.complex.Complex complex63 = complex62.tanh();
        org.apache.commons.math.complex.Complex complex64 = complex63.sinh();
        org.apache.commons.math.complex.Complex complex65 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex66 = complex65.atan();
        org.apache.commons.math.complex.Complex complex67 = complex66.cosh();
        double double68 = complex67.getArgument();
        org.apache.commons.math.complex.Complex complex69 = complex64.divide(complex67);
        org.apache.commons.math.complex.Complex complex70 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex71 = complex70.atan();
        org.apache.commons.math.complex.Complex complex72 = complex71.sqrt();
        org.apache.commons.math.complex.Complex complex73 = complex71.tanh();
        org.apache.commons.math.complex.Complex complex74 = complex67.multiply(complex73);
        org.apache.commons.math.complex.Complex complex75 = complex73.exp();
        double double76 = complex73.abs();
        org.apache.commons.math.complex.Complex complex77 = complex73.atan();
        org.apache.commons.math.complex.Complex complex78 = complex77.exp();
        org.apache.commons.math.complex.Complex complex79 = complex58.add(complex77);
        org.apache.commons.math.complex.Complex complex80 = complex37.add(complex79);
        java.lang.String str81 = complex79.toString();
        double double82 = complex79.abs();
        org.apache.commons.math.complex.Complex complex83 = complex25.divide(complex79);
        org.apache.commons.math.complex.Complex complex84 = complex25.asin();
        org.apache.commons.math.complex.Complex complex85 = complex25.sqrt1z();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex84", complex0.equals(complex84) ? complex0.hashCode() == complex84.hashCode() : true);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex2 = complex1.atan();
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex5 = complex4.atan();
        org.apache.commons.math.complex.Complex complex6 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex7 = complex6.tanh();
        org.apache.commons.math.complex.Complex complex8 = complex6.exp();
        org.apache.commons.math.complex.Complex complex9 = complex2.add(complex6);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.atan();
        org.apache.commons.math.complex.Complex complex12 = complex11.cosh();
        org.apache.commons.math.complex.Complex complex13 = complex12.tanh();
        org.apache.commons.math.complex.Complex complex14 = complex13.sinh();
        boolean boolean15 = complex13.isInfinite();
        org.apache.commons.math.complex.Complex complex16 = complex2.subtract(complex13);
        org.apache.commons.math.complex.Complex complex17 = complex0.add(complex2);
        org.apache.commons.math.complex.Complex complex18 = complex0.cos();
        org.apache.commons.math.complex.Complex complex19 = complex18.tan();
        org.apache.commons.math.complex.Complex complex20 = complex18.asin();
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex22 = complex21.atan();
        org.apache.commons.math.complex.Complex complex23 = complex22.cosh();
        org.apache.commons.math.complex.Complex complex24 = complex23.tanh();
        org.apache.commons.math.complex.Complex complex25 = complex24.sinh();
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex27 = complex26.atan();
        org.apache.commons.math.complex.Complex complex28 = complex27.cosh();
        double double29 = complex28.getArgument();
        org.apache.commons.math.complex.Complex complex30 = complex25.divide(complex28);
        org.apache.commons.math.complex.Complex complex31 = complex25.log();
        org.apache.commons.math.complex.Complex complex32 = complex31.cos();
        org.apache.commons.math.complex.Complex complex33 = complex31.exp();
        org.apache.commons.math.complex.Complex complex34 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex35 = complex34.atan();
        org.apache.commons.math.complex.Complex complex36 = complex35.cosh();
        org.apache.commons.math.complex.Complex complex37 = complex36.asin();
        org.apache.commons.math.complex.ComplexField complexField38 = complex36.getField();
        org.apache.commons.math.complex.Complex complex39 = complex36.tanh();
        org.apache.commons.math.complex.Complex complex40 = complex36.log();
        org.apache.commons.math.complex.Complex complex41 = complex40.cosh();
        org.apache.commons.math.complex.Complex complex42 = complex31.multiply(complex40);
        org.apache.commons.math.complex.Complex complex43 = complex18.add(complex42);
        java.lang.String str44 = complex18.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex42", complex1.equals(complex42) ? complex1.hashCode() == complex42.hashCode() : true);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.asin();
        org.apache.commons.math.complex.Complex complex4 = complex3.tan();
        org.apache.commons.math.complex.Complex complex5 = complex3.sqrt();
        boolean boolean7 = complex3.equals((java.lang.Object) (-1.0f));
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.atan();
        org.apache.commons.math.complex.Complex complex10 = complex9.cosh();
        org.apache.commons.math.complex.Complex complex11 = complex10.tanh();
        org.apache.commons.math.complex.Complex complex12 = complex11.sinh();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex14 = complex13.atan();
        org.apache.commons.math.complex.Complex complex15 = complex14.cosh();
        double double16 = complex15.getArgument();
        org.apache.commons.math.complex.Complex complex17 = complex12.divide(complex15);
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex19 = complex18.atan();
        org.apache.commons.math.complex.Complex complex20 = complex19.sqrt();
        org.apache.commons.math.complex.Complex complex21 = complex19.tanh();
        org.apache.commons.math.complex.Complex complex22 = complex15.multiply(complex21);
        org.apache.commons.math.complex.Complex complex23 = complex15.tanh();
        org.apache.commons.math.complex.Complex complex24 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex25 = complex24.atan();
        org.apache.commons.math.complex.Complex complex26 = complex25.sqrt();
        org.apache.commons.math.complex.Complex complex28 = complex26.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex29 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex30 = complex26.multiply(complex29);
        org.apache.commons.math.complex.Complex complex31 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex32 = complex31.atan();
        org.apache.commons.math.complex.Complex complex33 = complex32.cosh();
        org.apache.commons.math.complex.Complex complex34 = complex33.asin();
        org.apache.commons.math.complex.Complex complex35 = complex29.add(complex34);
        org.apache.commons.math.complex.Complex complex36 = complex35.conjugate();
        org.apache.commons.math.complex.Complex complex37 = complex36.conjugate();
        org.apache.commons.math.complex.Complex complex38 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex39 = complex38.atan();
        org.apache.commons.math.complex.Complex complex40 = complex39.cosh();
        org.apache.commons.math.complex.Complex complex41 = complex40.tanh();
        org.apache.commons.math.complex.Complex complex42 = complex41.sinh();
        org.apache.commons.math.complex.Complex complex43 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex44 = complex43.atan();
        org.apache.commons.math.complex.Complex complex45 = complex44.cosh();
        double double46 = complex45.getArgument();
        org.apache.commons.math.complex.Complex complex47 = complex42.divide(complex45);
        org.apache.commons.math.complex.Complex complex48 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex49 = complex48.atan();
        org.apache.commons.math.complex.Complex complex50 = complex49.sqrt();
        org.apache.commons.math.complex.Complex complex51 = complex49.tanh();
        org.apache.commons.math.complex.Complex complex52 = complex45.multiply(complex51);
        org.apache.commons.math.complex.Complex complex53 = complex51.exp();
        double double54 = complex51.abs();
        org.apache.commons.math.complex.Complex complex55 = complex51.atan();
        org.apache.commons.math.complex.Complex complex56 = complex55.exp();
        org.apache.commons.math.complex.Complex complex57 = complex36.add(complex55);
        org.apache.commons.math.complex.Complex complex58 = complex15.add(complex57);
        double double59 = complex15.getReal();
        org.apache.commons.math.complex.Complex complex60 = complex3.multiply(complex15);
        org.apache.commons.math.complex.Complex complex61 = complex3.negate();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex34 and complex60", complex34.equals(complex60) ? complex34.hashCode() == complex60.hashCode() : true);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.acos();
        double double3 = complex1.getArgument();
        org.apache.commons.math.complex.Complex complex4 = complex1.tan();
        org.apache.commons.math.complex.Complex complex5 = complex4.conjugate();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex7 = complex6.atan();
        org.apache.commons.math.complex.Complex complex8 = complex7.sqrt();
        org.apache.commons.math.complex.Complex complex10 = complex8.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex12 = complex8.multiply(complex11);
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex14 = complex13.atan();
        org.apache.commons.math.complex.Complex complex15 = complex14.cosh();
        org.apache.commons.math.complex.Complex complex16 = complex15.asin();
        org.apache.commons.math.complex.Complex complex17 = complex11.add(complex16);
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex19 = complex18.atan();
        org.apache.commons.math.complex.Complex complex20 = complex19.cosh();
        org.apache.commons.math.complex.Complex complex21 = complex20.asin();
        org.apache.commons.math.complex.Complex complex22 = complex21.sin();
        org.apache.commons.math.complex.Complex complex23 = complex21.asin();
        org.apache.commons.math.complex.Complex complex24 = complex23.conjugate();
        org.apache.commons.math.complex.Complex complex25 = complex17.divide(complex24);
        org.apache.commons.math.complex.Complex complex28 = new org.apache.commons.math.complex.Complex(0.8373830985134536d, 1.1102230246251565E-16d);
        org.apache.commons.math.complex.Complex complex29 = complex24.add(complex28);
        org.apache.commons.math.complex.Complex complex30 = complex28.sqrt();
        org.apache.commons.math.complex.Complex complex31 = complex28.tan();
        org.apache.commons.math.complex.Complex complex32 = complex5.multiply(complex28);
        org.apache.commons.math.complex.Complex complex33 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex34 = complex33.atan();
        org.apache.commons.math.complex.Complex complex35 = complex34.cosh();
        org.apache.commons.math.complex.Complex complex36 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex37 = complex36.atan();
        org.apache.commons.math.complex.Complex complex38 = complex37.cosh();
        org.apache.commons.math.complex.Complex complex39 = complex38.tanh();
        org.apache.commons.math.complex.Complex complex40 = complex38.exp();
        org.apache.commons.math.complex.Complex complex41 = complex34.add(complex38);
        org.apache.commons.math.complex.Complex complex42 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex43 = complex42.atan();
        org.apache.commons.math.complex.Complex complex44 = complex43.cosh();
        org.apache.commons.math.complex.Complex complex45 = complex44.tanh();
        org.apache.commons.math.complex.Complex complex46 = complex45.sinh();
        boolean boolean47 = complex45.isInfinite();
        org.apache.commons.math.complex.Complex complex48 = complex34.subtract(complex45);
        org.apache.commons.math.complex.Complex complex49 = complex34.negate();
        double double50 = complex34.getReal();
        org.apache.commons.math.complex.Complex complex51 = complex34.cosh();
        boolean boolean52 = complex32.equals((java.lang.Object) complex34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex5", complex0.equals(complex5) ? complex0.hashCode() == complex5.hashCode() : true);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex4 = complex3.atan();
        org.apache.commons.math.complex.Complex complex5 = complex4.cosh();
        org.apache.commons.math.complex.Complex complex6 = complex5.tanh();
        org.apache.commons.math.complex.Complex complex7 = complex5.exp();
        org.apache.commons.math.complex.Complex complex8 = complex1.add(complex5);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex10 = complex9.atan();
        org.apache.commons.math.complex.Complex complex11 = complex10.cosh();
        org.apache.commons.math.complex.Complex complex12 = complex11.tanh();
        org.apache.commons.math.complex.Complex complex13 = complex12.sinh();
        boolean boolean14 = complex12.isInfinite();
        org.apache.commons.math.complex.Complex complex15 = complex1.subtract(complex12);
        java.lang.String str16 = complex15.toString();
        java.lang.String str17 = complex15.toString();
        org.apache.commons.math.complex.Complex complex19 = complex15.multiply((double) (byte) -1);
        boolean boolean20 = complex15.isNaN();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex6 and complex19", complex6.equals(complex19) ? complex6.hashCode() == complex19.hashCode() : true);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.acos();
        double double3 = complex1.getArgument();
        org.apache.commons.math.complex.Complex complex4 = complex1.tan();
        org.apache.commons.math.complex.Complex complex5 = complex1.asin();
        org.apache.commons.math.complex.Complex complex6 = complex1.asin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex5", complex0.equals(complex5) ? complex0.hashCode() == complex5.hashCode() : true);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        double double8 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex9 = complex4.divide(complex7);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.atan();
        org.apache.commons.math.complex.Complex complex12 = complex11.sqrt();
        org.apache.commons.math.complex.Complex complex13 = complex11.tanh();
        org.apache.commons.math.complex.Complex complex14 = complex7.multiply(complex13);
        boolean boolean15 = complex7.isInfinite();
        org.apache.commons.math.complex.Complex complex16 = complex7.conjugate();
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex18 = complex17.atan();
        org.apache.commons.math.complex.Complex complex19 = complex18.cosh();
        org.apache.commons.math.complex.Complex complex20 = complex19.tanh();
        org.apache.commons.math.complex.Complex complex21 = complex20.sinh();
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex23 = complex22.atan();
        org.apache.commons.math.complex.Complex complex24 = complex23.cosh();
        double double25 = complex24.getArgument();
        org.apache.commons.math.complex.Complex complex26 = complex21.divide(complex24);
        java.lang.String str27 = complex26.toString();
        org.apache.commons.math.complex.Complex complex28 = complex26.sqrt1z();
        org.apache.commons.math.complex.Complex complex29 = complex28.tan();
        org.apache.commons.math.complex.Complex complex30 = complex28.cosh();
        org.apache.commons.math.complex.Complex complex31 = complex30.cosh();
        org.apache.commons.math.complex.Complex complex32 = complex7.multiply(complex31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex16", complex2.equals(complex16) ? complex2.hashCode() == complex16.hashCode() : true);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        double double8 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex9 = complex4.divide(complex7);
        org.apache.commons.math.complex.Complex complex10 = complex4.log();
        org.apache.commons.math.complex.Complex complex11 = complex10.cos();
        org.apache.commons.math.complex.Complex complex12 = complex10.exp();
        org.apache.commons.math.complex.Complex complex13 = complex12.log();
        org.apache.commons.math.complex.Complex complex14 = complex13.conjugate();
        org.apache.commons.math.complex.Complex complex15 = complex13.tanh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex10 and complex14", complex10.equals(complex14) ? complex10.hashCode() == complex14.hashCode() : true);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex2 = complex1.atan();
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex5 = complex4.atan();
        org.apache.commons.math.complex.Complex complex6 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex7 = complex6.tanh();
        org.apache.commons.math.complex.Complex complex8 = complex6.exp();
        org.apache.commons.math.complex.Complex complex9 = complex2.add(complex6);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.atan();
        org.apache.commons.math.complex.Complex complex12 = complex11.cosh();
        org.apache.commons.math.complex.Complex complex13 = complex12.tanh();
        org.apache.commons.math.complex.Complex complex14 = complex13.sinh();
        boolean boolean15 = complex13.isInfinite();
        org.apache.commons.math.complex.Complex complex16 = complex2.subtract(complex13);
        org.apache.commons.math.complex.Complex complex17 = complex0.add(complex2);
        org.apache.commons.math.complex.Complex complex18 = complex0.cos();
        org.apache.commons.math.complex.Complex complex19 = complex18.tan();
        org.apache.commons.math.complex.Complex complex20 = complex18.asin();
        org.apache.commons.math.complex.Complex complex21 = complex20.sqrt();
        org.apache.commons.math.complex.Complex complex22 = complex21.asin();
        org.apache.commons.math.complex.Complex complex23 = complex21.tan();
        org.apache.commons.math.complex.Complex complex24 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex25 = complex24.sqrt1z();
        org.apache.commons.math.complex.Complex complex28 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex29 = complex28.tanh();
        org.apache.commons.math.complex.Complex complex30 = complex25.subtract(complex28);
        org.apache.commons.math.complex.Complex complex33 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex34 = complex25.pow(complex33);
        org.apache.commons.math.complex.Complex complex35 = complex25.atan();
        org.apache.commons.math.complex.Complex complex36 = complex25.acos();
        org.apache.commons.math.complex.Complex complex37 = complex21.divide(complex25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex36", complex1.equals(complex36) ? complex1.hashCode() == complex36.hashCode() : true);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        double double8 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex9 = complex4.divide(complex7);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.atan();
        org.apache.commons.math.complex.Complex complex12 = complex11.sqrt();
        org.apache.commons.math.complex.Complex complex13 = complex11.tanh();
        org.apache.commons.math.complex.Complex complex14 = complex7.multiply(complex13);
        org.apache.commons.math.complex.Complex complex15 = complex13.exp();
        double double16 = complex13.abs();
        org.apache.commons.math.complex.Complex complex17 = complex13.atan();
        org.apache.commons.math.complex.Complex complex18 = complex13.conjugate();
        double double19 = complex18.abs();
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex21 = complex20.atan();
        org.apache.commons.math.complex.Complex complex22 = complex21.sqrt();
        org.apache.commons.math.complex.Complex complex24 = complex22.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex25 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex26 = complex22.multiply(complex25);
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex28 = complex27.atan();
        org.apache.commons.math.complex.Complex complex29 = complex28.cosh();
        org.apache.commons.math.complex.Complex complex30 = complex29.asin();
        org.apache.commons.math.complex.Complex complex31 = complex25.add(complex30);
        org.apache.commons.math.complex.Complex complex32 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex33 = complex32.atan();
        org.apache.commons.math.complex.Complex complex34 = complex31.multiply(complex33);
        org.apache.commons.math.complex.Complex complex35 = complex31.tanh();
        java.lang.String str36 = complex31.toString();
        org.apache.commons.math.complex.Complex complex37 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex38 = complex37.atan();
        org.apache.commons.math.complex.Complex complex39 = complex38.sqrt();
        org.apache.commons.math.complex.Complex complex41 = complex39.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex42 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex43 = complex39.multiply(complex42);
        org.apache.commons.math.complex.Complex complex44 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex45 = complex44.atan();
        org.apache.commons.math.complex.Complex complex46 = complex45.cosh();
        org.apache.commons.math.complex.Complex complex47 = complex46.tanh();
        org.apache.commons.math.complex.Complex complex48 = complex47.sinh();
        org.apache.commons.math.complex.Complex complex49 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex50 = complex49.atan();
        org.apache.commons.math.complex.Complex complex51 = complex50.cosh();
        double double52 = complex51.getArgument();
        org.apache.commons.math.complex.Complex complex53 = complex48.divide(complex51);
        java.lang.String str54 = complex53.toString();
        org.apache.commons.math.complex.Complex complex55 = complex53.sqrt1z();
        org.apache.commons.math.complex.Complex complex56 = complex55.tan();
        org.apache.commons.math.complex.Complex complex57 = complex39.add(complex56);
        org.apache.commons.math.complex.Complex complex58 = complex39.sqrt1z();
        org.apache.commons.math.complex.Complex complex59 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex60 = complex59.atan();
        org.apache.commons.math.complex.Complex complex61 = complex60.cosh();
        org.apache.commons.math.complex.Complex complex62 = complex61.tanh();
        org.apache.commons.math.complex.Complex complex63 = complex61.cosh();
        boolean boolean64 = complex61.isNaN();
        org.apache.commons.math.complex.Complex complex65 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex66 = complex65.sqrt1z();
        org.apache.commons.math.complex.Complex complex69 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex70 = complex69.tanh();
        org.apache.commons.math.complex.Complex complex71 = complex66.subtract(complex69);
        org.apache.commons.math.complex.Complex complex74 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex75 = complex66.pow(complex74);
        org.apache.commons.math.complex.Complex complex76 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex77 = complex76.atan();
        org.apache.commons.math.complex.Complex complex78 = complex77.sqrt();
        org.apache.commons.math.complex.Complex complex79 = complex77.tanh();
        org.apache.commons.math.complex.Complex complex80 = complex75.pow(complex77);
        org.apache.commons.math.complex.Complex complex81 = complex61.add(complex75);
        org.apache.commons.math.complex.Complex complex84 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex85 = complex61.multiply(complex84);
        org.apache.commons.math.complex.Complex complex86 = complex39.divide(complex61);
        org.apache.commons.math.complex.Complex complex87 = complex31.add(complex86);
        org.apache.commons.math.complex.Complex complex88 = complex18.add(complex31);
        double double89 = complex88.abs();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex18", complex0.equals(complex18) ? complex0.hashCode() == complex18.hashCode() : true);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex4 = complex3.atan();
        org.apache.commons.math.complex.Complex complex5 = complex4.cosh();
        org.apache.commons.math.complex.Complex complex6 = complex5.tanh();
        org.apache.commons.math.complex.Complex complex7 = complex5.exp();
        org.apache.commons.math.complex.Complex complex8 = complex1.add(complex5);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex10 = complex9.atan();
        org.apache.commons.math.complex.Complex complex11 = complex10.cosh();
        org.apache.commons.math.complex.Complex complex12 = complex11.tanh();
        org.apache.commons.math.complex.Complex complex13 = complex12.sinh();
        boolean boolean14 = complex12.isInfinite();
        org.apache.commons.math.complex.Complex complex15 = complex1.subtract(complex12);
        java.lang.String str16 = complex15.toString();
        java.lang.String str17 = complex15.toString();
        org.apache.commons.math.complex.Complex complex19 = complex15.multiply((double) (byte) -1);
        java.util.List<org.apache.commons.math.complex.Complex> complexList21 = complex15.nthRoot((int) (byte) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex6 and complex19", complex6.equals(complex19) ? complex6.hashCode() == complex19.hashCode() : true);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        double double8 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex9 = complex4.divide(complex7);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.atan();
        org.apache.commons.math.complex.Complex complex12 = complex11.sqrt();
        org.apache.commons.math.complex.Complex complex13 = complex11.tanh();
        org.apache.commons.math.complex.Complex complex14 = complex7.multiply(complex13);
        org.apache.commons.math.complex.Complex complex15 = complex7.tanh();
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex17 = complex16.atan();
        org.apache.commons.math.complex.Complex complex18 = complex17.cosh();
        org.apache.commons.math.complex.Complex complex19 = complex18.tanh();
        org.apache.commons.math.complex.Complex complex20 = complex18.exp();
        org.apache.commons.math.complex.Complex complex21 = complex18.exp();
        org.apache.commons.math.complex.Complex complex22 = complex21.sqrt();
        org.apache.commons.math.complex.Complex complex23 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex24 = complex23.atan();
        org.apache.commons.math.complex.Complex complex25 = complex24.cosh();
        org.apache.commons.math.complex.Complex complex26 = complex25.tanh();
        org.apache.commons.math.complex.Complex complex27 = complex26.sinh();
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex29 = complex28.atan();
        org.apache.commons.math.complex.Complex complex30 = complex29.cosh();
        double double31 = complex30.getArgument();
        org.apache.commons.math.complex.Complex complex32 = complex27.divide(complex30);
        java.lang.String str33 = complex32.toString();
        org.apache.commons.math.complex.Complex complex34 = complex32.sqrt1z();
        org.apache.commons.math.complex.Complex complex35 = complex34.tan();
        org.apache.commons.math.complex.Complex complex36 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean37 = complex36.isInfinite();
        org.apache.commons.math.complex.Complex complex38 = complex35.multiply(complex36);
        org.apache.commons.math.complex.Complex complex39 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex40 = complex39.sqrt1z();
        org.apache.commons.math.complex.Complex complex41 = complex35.add(complex39);
        org.apache.commons.math.complex.Complex complex42 = complex22.add(complex41);
        org.apache.commons.math.complex.Complex complex43 = complex15.multiply(complex41);
        org.apache.commons.math.complex.Complex complex44 = complex15.log();
        org.apache.commons.math.complex.Complex complex45 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex46 = complex45.atan();
        org.apache.commons.math.complex.Complex complex47 = complex46.cosh();
        org.apache.commons.math.complex.Complex complex48 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex49 = complex48.atan();
        org.apache.commons.math.complex.Complex complex50 = complex49.cosh();
        org.apache.commons.math.complex.Complex complex51 = complex50.tanh();
        org.apache.commons.math.complex.Complex complex52 = complex50.exp();
        org.apache.commons.math.complex.Complex complex53 = complex46.add(complex50);
        org.apache.commons.math.complex.Complex complex54 = complex46.sqrt1z();
        org.apache.commons.math.complex.Complex complex55 = complex15.divide(complex46);
        org.apache.commons.math.complex.Complex complex56 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex57 = complex56.sqrt1z();
        org.apache.commons.math.complex.Complex complex60 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex61 = complex60.tanh();
        org.apache.commons.math.complex.Complex complex62 = complex57.subtract(complex60);
        org.apache.commons.math.complex.Complex complex65 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex66 = complex57.pow(complex65);
        org.apache.commons.math.complex.Complex complex67 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex68 = complex67.atan();
        org.apache.commons.math.complex.Complex complex69 = complex68.sqrt();
        org.apache.commons.math.complex.Complex complex70 = complex68.tanh();
        org.apache.commons.math.complex.Complex complex71 = complex66.pow(complex68);
        org.apache.commons.math.complex.Complex complex72 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex73 = complex66.divide(complex72);
        org.apache.commons.math.complex.Complex complex74 = complex55.subtract(complex73);
        org.apache.commons.math.complex.Complex complex75 = complex55.negate();
        org.apache.commons.math.complex.Complex complex76 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex77 = complex76.atan();
        org.apache.commons.math.complex.Complex complex78 = complex77.sqrt();
        org.apache.commons.math.complex.Complex complex80 = complex78.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex81 = complex78.tan();
        java.lang.String str82 = complex81.toString();
        org.apache.commons.math.complex.Complex complex83 = complex81.cos();
        org.apache.commons.math.complex.Complex complex84 = complex81.sin();
        org.apache.commons.math.complex.Complex complex85 = complex84.sqrt();
        double double86 = complex85.getImaginary();
        org.apache.commons.math.complex.Complex complex87 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex88 = complex87.tanh();
        org.apache.commons.math.complex.Complex complex89 = complex88.cosh();
        org.apache.commons.math.complex.Complex complex90 = complex85.add(complex88);
        org.apache.commons.math.complex.Complex complex91 = complex55.add(complex90);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex83", complex2.equals(complex83) ? complex2.hashCode() == complex83.hashCode() : true);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        double double8 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex9 = complex4.divide(complex7);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.atan();
        org.apache.commons.math.complex.Complex complex12 = complex11.cosh();
        org.apache.commons.math.complex.Complex complex13 = complex12.tanh();
        org.apache.commons.math.complex.Complex complex14 = complex13.sinh();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex16 = complex15.atan();
        org.apache.commons.math.complex.Complex complex17 = complex16.cosh();
        double double18 = complex17.getArgument();
        org.apache.commons.math.complex.Complex complex19 = complex14.divide(complex17);
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex21 = complex20.atan();
        org.apache.commons.math.complex.Complex complex22 = complex21.sqrt();
        org.apache.commons.math.complex.Complex complex23 = complex21.tanh();
        org.apache.commons.math.complex.Complex complex24 = complex17.multiply(complex23);
        org.apache.commons.math.complex.Complex complex25 = complex17.tanh();
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex27 = complex26.atan();
        org.apache.commons.math.complex.Complex complex28 = complex27.cosh();
        org.apache.commons.math.complex.Complex complex29 = complex28.tanh();
        org.apache.commons.math.complex.Complex complex30 = complex28.exp();
        org.apache.commons.math.complex.Complex complex31 = complex28.exp();
        org.apache.commons.math.complex.Complex complex32 = complex31.sqrt();
        org.apache.commons.math.complex.Complex complex33 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex34 = complex33.atan();
        org.apache.commons.math.complex.Complex complex35 = complex34.cosh();
        org.apache.commons.math.complex.Complex complex36 = complex35.tanh();
        org.apache.commons.math.complex.Complex complex37 = complex36.sinh();
        org.apache.commons.math.complex.Complex complex38 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex39 = complex38.atan();
        org.apache.commons.math.complex.Complex complex40 = complex39.cosh();
        double double41 = complex40.getArgument();
        org.apache.commons.math.complex.Complex complex42 = complex37.divide(complex40);
        java.lang.String str43 = complex42.toString();
        org.apache.commons.math.complex.Complex complex44 = complex42.sqrt1z();
        org.apache.commons.math.complex.Complex complex45 = complex44.tan();
        org.apache.commons.math.complex.Complex complex46 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean47 = complex46.isInfinite();
        org.apache.commons.math.complex.Complex complex48 = complex45.multiply(complex46);
        org.apache.commons.math.complex.Complex complex49 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex50 = complex49.sqrt1z();
        org.apache.commons.math.complex.Complex complex51 = complex45.add(complex49);
        org.apache.commons.math.complex.Complex complex52 = complex32.add(complex51);
        org.apache.commons.math.complex.Complex complex53 = complex25.multiply(complex51);
        org.apache.commons.math.complex.Complex complex54 = complex4.subtract(complex51);
        org.apache.commons.math.complex.Complex complex55 = complex54.negate();
        org.apache.commons.math.complex.Complex complex56 = complex54.atan();
        org.apache.commons.math.complex.Complex complex57 = complex54.conjugate();
        org.apache.commons.math.complex.Complex complex58 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex59 = complex58.atan();
        org.apache.commons.math.complex.Complex complex60 = complex59.sqrt();
        org.apache.commons.math.complex.Complex complex62 = complex60.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex63 = complex60.tan();
        java.lang.String str64 = complex63.toString();
        org.apache.commons.math.complex.Complex complex65 = complex63.cos();
        boolean boolean66 = complex57.equals((java.lang.Object) complex63);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex65", complex2.equals(complex65) ? complex2.hashCode() == complex65.hashCode() : true);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.sqrt();
        double double3 = complex1.getReal();
        org.apache.commons.math.complex.Complex complex4 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex5 = complex4.conjugate();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex7 = complex6.atan();
        org.apache.commons.math.complex.Complex complex8 = complex7.sqrt();
        org.apache.commons.math.complex.Complex complex10 = complex8.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex12 = complex8.multiply(complex11);
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex14 = complex13.atan();
        org.apache.commons.math.complex.Complex complex15 = complex14.cosh();
        org.apache.commons.math.complex.Complex complex16 = complex15.asin();
        org.apache.commons.math.complex.Complex complex17 = complex11.add(complex16);
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex19 = complex18.atan();
        org.apache.commons.math.complex.Complex complex20 = complex17.multiply(complex19);
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex22 = complex21.atan();
        org.apache.commons.math.complex.Complex complex23 = complex22.cosh();
        org.apache.commons.math.complex.Complex complex24 = complex20.multiply(complex23);
        double double25 = complex23.abs();
        org.apache.commons.math.complex.Complex complex26 = complex23.log();
        org.apache.commons.math.complex.Complex complex27 = complex23.sqrt1z();
        org.apache.commons.math.complex.Complex complex28 = complex4.divide(complex23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex5 and complex15", complex5.equals(complex15) ? complex5.hashCode() == complex15.hashCode() : true);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex2 = complex1.atan();
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex5 = complex4.atan();
        org.apache.commons.math.complex.Complex complex6 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex7 = complex6.tanh();
        org.apache.commons.math.complex.Complex complex8 = complex6.exp();
        org.apache.commons.math.complex.Complex complex9 = complex2.add(complex6);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.atan();
        org.apache.commons.math.complex.Complex complex12 = complex11.cosh();
        org.apache.commons.math.complex.Complex complex13 = complex12.tanh();
        org.apache.commons.math.complex.Complex complex14 = complex13.sinh();
        boolean boolean15 = complex13.isInfinite();
        org.apache.commons.math.complex.Complex complex16 = complex2.subtract(complex13);
        org.apache.commons.math.complex.Complex complex17 = complex0.add(complex2);
        org.apache.commons.math.complex.Complex complex18 = complex0.cos();
        org.apache.commons.math.complex.Complex complex19 = complex18.tan();
        org.apache.commons.math.complex.Complex complex20 = complex18.asin();
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex22 = complex21.atan();
        org.apache.commons.math.complex.Complex complex23 = complex22.cosh();
        org.apache.commons.math.complex.Complex complex24 = complex23.tanh();
        org.apache.commons.math.complex.Complex complex25 = complex24.sinh();
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex27 = complex26.atan();
        org.apache.commons.math.complex.Complex complex28 = complex27.cosh();
        double double29 = complex28.getArgument();
        org.apache.commons.math.complex.Complex complex30 = complex25.divide(complex28);
        org.apache.commons.math.complex.Complex complex31 = complex25.log();
        org.apache.commons.math.complex.Complex complex32 = complex31.cos();
        org.apache.commons.math.complex.Complex complex33 = complex31.exp();
        org.apache.commons.math.complex.Complex complex34 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex35 = complex34.atan();
        org.apache.commons.math.complex.Complex complex36 = complex35.cosh();
        org.apache.commons.math.complex.Complex complex37 = complex36.asin();
        org.apache.commons.math.complex.ComplexField complexField38 = complex36.getField();
        org.apache.commons.math.complex.Complex complex39 = complex36.tanh();
        org.apache.commons.math.complex.Complex complex40 = complex36.log();
        org.apache.commons.math.complex.Complex complex41 = complex40.cosh();
        org.apache.commons.math.complex.Complex complex42 = complex31.multiply(complex40);
        org.apache.commons.math.complex.Complex complex43 = complex18.add(complex42);
        org.apache.commons.math.complex.Complex complex44 = complex42.log();
        org.apache.commons.math.complex.Complex complex45 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex46 = complex45.atan();
        org.apache.commons.math.complex.Complex complex47 = complex46.cosh();
        org.apache.commons.math.complex.Complex complex48 = complex47.tanh();
        java.util.List<org.apache.commons.math.complex.Complex> complexList50 = complex47.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex51 = complex47.sinh();
        org.apache.commons.math.complex.Complex complex52 = complex51.negate();
        org.apache.commons.math.complex.Complex complex53 = complex52.acos();
        org.apache.commons.math.complex.Complex complex54 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex55 = complex54.atan();
        org.apache.commons.math.complex.Complex complex56 = complex55.cosh();
        org.apache.commons.math.complex.Complex complex57 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex58 = complex57.atan();
        org.apache.commons.math.complex.Complex complex59 = complex58.cosh();
        org.apache.commons.math.complex.Complex complex60 = complex59.tanh();
        org.apache.commons.math.complex.Complex complex61 = complex59.exp();
        org.apache.commons.math.complex.Complex complex62 = complex55.add(complex59);
        org.apache.commons.math.complex.Complex complex63 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex64 = complex63.atan();
        org.apache.commons.math.complex.Complex complex65 = complex64.cosh();
        org.apache.commons.math.complex.Complex complex66 = complex65.tanh();
        org.apache.commons.math.complex.Complex complex67 = complex66.sinh();
        boolean boolean68 = complex66.isInfinite();
        org.apache.commons.math.complex.Complex complex69 = complex55.subtract(complex66);
        java.lang.String str70 = complex69.toString();
        java.lang.String str71 = complex69.toString();
        org.apache.commons.math.complex.Complex complex72 = complex53.subtract(complex69);
        org.apache.commons.math.complex.Complex complex73 = complex44.divide(complex53);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex42", complex1.equals(complex42) ? complex1.hashCode() == complex42.hashCode() : true);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean1 = complex0.isInfinite();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex3 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex6 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex7 = complex6.tanh();
        org.apache.commons.math.complex.Complex complex8 = complex3.subtract(complex6);
        double double9 = complex8.getImaginary();
        org.apache.commons.math.complex.Complex complex10 = complex8.sqrt();
        org.apache.commons.math.complex.Complex complex12 = complex8.multiply((double) 10);
        org.apache.commons.math.complex.Complex complex13 = complex0.divide(complex12);
        org.apache.commons.math.complex.Complex complex15 = complex0.multiply(0.6657737500283538d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex13", complex0.equals(complex13) ? complex0.hashCode() == complex13.hashCode() : true);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex6 = complex2.multiply(complex5);
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex8 = complex7.atan();
        org.apache.commons.math.complex.Complex complex9 = complex8.cosh();
        org.apache.commons.math.complex.Complex complex10 = complex9.asin();
        org.apache.commons.math.complex.Complex complex11 = complex5.add(complex10);
        boolean boolean12 = complex11.isInfinite();
        org.apache.commons.math.complex.Complex complex13 = complex11.exp();
        double double14 = complex13.getImaginary();
        org.apache.commons.math.complex.Complex complex15 = complex13.log();
        org.apache.commons.math.complex.Complex complex16 = complex13.asin();
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex18 = complex17.atan();
        org.apache.commons.math.complex.Complex complex19 = complex18.sqrt();
        org.apache.commons.math.complex.Complex complex21 = complex19.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex22 = complex19.tan();
        java.lang.String str23 = complex22.toString();
        org.apache.commons.math.complex.Complex complex24 = complex22.cos();
        org.apache.commons.math.complex.Complex complex25 = complex22.sin();
        org.apache.commons.math.complex.Complex complex26 = complex16.subtract(complex25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex9 and complex24", complex9.equals(complex24) ? complex9.hashCode() == complex24.hashCode() : true);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        double double8 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex9 = complex4.divide(complex7);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.atan();
        org.apache.commons.math.complex.Complex complex12 = complex11.sqrt();
        org.apache.commons.math.complex.Complex complex13 = complex11.tanh();
        org.apache.commons.math.complex.Complex complex14 = complex7.multiply(complex13);
        org.apache.commons.math.complex.Complex complex15 = complex14.sqrt();
        org.apache.commons.math.complex.Complex complex16 = complex15.atan();
        org.apache.commons.math.complex.Complex complex17 = complex16.acos();
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex19 = complex18.sqrt1z();
        org.apache.commons.math.complex.Complex complex22 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex23 = complex22.tanh();
        org.apache.commons.math.complex.Complex complex24 = complex19.subtract(complex22);
        org.apache.commons.math.complex.Complex complex27 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex28 = complex19.pow(complex27);
        org.apache.commons.math.complex.Complex complex29 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex30 = complex29.atan();
        org.apache.commons.math.complex.Complex complex31 = complex30.sqrt();
        org.apache.commons.math.complex.Complex complex32 = complex30.tanh();
        org.apache.commons.math.complex.Complex complex33 = complex28.pow(complex30);
        org.apache.commons.math.complex.Complex complex34 = complex16.pow(complex28);
        org.apache.commons.math.complex.Complex complex35 = complex28.conjugate();
        org.apache.commons.math.complex.Complex complex36 = complex28.sin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex35", complex2.equals(complex35) ? complex2.hashCode() == complex35.hashCode() : true);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        double double8 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex9 = complex4.divide(complex7);
        java.lang.String str10 = complex9.toString();
        org.apache.commons.math.complex.Complex complex11 = complex9.sqrt1z();
        org.apache.commons.math.complex.Complex complex12 = complex11.tan();
        org.apache.commons.math.complex.Complex complex13 = complex12.acos();
        org.apache.commons.math.complex.Complex complex14 = complex12.sinh();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex16 = complex15.atan();
        org.apache.commons.math.complex.Complex complex17 = complex16.cosh();
        org.apache.commons.math.complex.Complex complex18 = complex17.asin();
        org.apache.commons.math.complex.ComplexField complexField19 = complex17.getField();
        java.lang.String str20 = complex17.toString();
        org.apache.commons.math.complex.Complex complex21 = complex17.sqrt1z();
        org.apache.commons.math.complex.Complex complex22 = complex21.cos();
        org.apache.commons.math.complex.Complex complex23 = complex12.divide(complex22);
        org.apache.commons.math.complex.Complex complex25 = complex12.multiply(10.034999275220502d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex22", complex2.equals(complex22) ? complex2.hashCode() == complex22.hashCode() : true);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex6 = complex2.multiply(complex5);
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex8 = complex7.atan();
        org.apache.commons.math.complex.Complex complex9 = complex8.cosh();
        org.apache.commons.math.complex.Complex complex10 = complex9.asin();
        org.apache.commons.math.complex.Complex complex11 = complex5.add(complex10);
        org.apache.commons.math.complex.Complex complex12 = complex11.conjugate();
        org.apache.commons.math.complex.Complex complex13 = complex11.acos();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex15 = complex14.atan();
        org.apache.commons.math.complex.Complex complex16 = complex15.cosh();
        org.apache.commons.math.complex.Complex complex17 = complex16.asin();
        org.apache.commons.math.complex.ComplexField complexField18 = complex16.getField();
        org.apache.commons.math.complex.Complex complex19 = complex16.tanh();
        org.apache.commons.math.complex.Complex complex20 = complex13.pow(complex16);
        org.apache.commons.math.complex.Complex complex21 = complex16.cosh();
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex23 = complex22.atan();
        org.apache.commons.math.complex.Complex complex24 = complex23.cosh();
        org.apache.commons.math.complex.Complex complex25 = complex24.asin();
        org.apache.commons.math.complex.ComplexField complexField26 = complex24.getField();
        java.lang.String str27 = complex24.toString();
        org.apache.commons.math.complex.Complex complex28 = complex24.sqrt1z();
        org.apache.commons.math.complex.Complex complex29 = complex28.cos();
        org.apache.commons.math.complex.Complex complex31 = complex29.multiply(Double.NaN);
        boolean boolean32 = complex29.isNaN();
        boolean boolean33 = complex21.equals((java.lang.Object) complex29);
        boolean boolean34 = complex21.isInfinite();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex9 and complex29", complex9.equals(complex29) ? complex9.hashCode() == complex29.hashCode() : true);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex6 = complex2.multiply(complex5);
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex8 = complex7.atan();
        org.apache.commons.math.complex.Complex complex9 = complex8.cosh();
        org.apache.commons.math.complex.Complex complex10 = complex9.asin();
        org.apache.commons.math.complex.Complex complex11 = complex5.add(complex10);
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex13 = complex12.atan();
        org.apache.commons.math.complex.Complex complex14 = complex11.multiply(complex13);
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex16 = complex15.atan();
        org.apache.commons.math.complex.Complex complex17 = complex16.cosh();
        org.apache.commons.math.complex.Complex complex18 = complex14.multiply(complex17);
        org.apache.commons.math.complex.Complex complex19 = complex17.asin();
        org.apache.commons.math.complex.Complex complex20 = complex17.atan();
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex22 = complex21.atan();
        org.apache.commons.math.complex.Complex complex23 = complex22.sqrt();
        org.apache.commons.math.complex.Complex complex25 = complex23.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex27 = complex23.multiply(complex26);
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex29 = complex28.atan();
        org.apache.commons.math.complex.Complex complex30 = complex29.cosh();
        org.apache.commons.math.complex.Complex complex31 = complex30.asin();
        org.apache.commons.math.complex.Complex complex32 = complex26.add(complex31);
        org.apache.commons.math.complex.Complex complex33 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex34 = complex33.atan();
        org.apache.commons.math.complex.Complex complex35 = complex32.multiply(complex34);
        org.apache.commons.math.complex.Complex complex36 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex37 = complex36.atan();
        org.apache.commons.math.complex.Complex complex38 = complex37.cosh();
        org.apache.commons.math.complex.Complex complex39 = complex35.multiply(complex38);
        org.apache.commons.math.complex.Complex complex40 = complex17.multiply(complex35);
        org.apache.commons.math.complex.Complex complex41 = complex40.conjugate();
        org.apache.commons.math.complex.Complex complex42 = complex40.cos();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex41", complex0.equals(complex41) ? complex0.hashCode() == complex41.hashCode() : true);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        double double8 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex9 = complex4.divide(complex7);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.atan();
        org.apache.commons.math.complex.Complex complex12 = complex11.sqrt();
        org.apache.commons.math.complex.Complex complex13 = complex11.tanh();
        org.apache.commons.math.complex.Complex complex14 = complex7.multiply(complex13);
        org.apache.commons.math.complex.Complex complex15 = complex13.exp();
        double double16 = complex13.abs();
        org.apache.commons.math.complex.Complex complex17 = complex13.atan();
        org.apache.commons.math.complex.Complex complex18 = complex13.conjugate();
        double double19 = complex18.abs();
        double double20 = complex18.getArgument();
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex22 = complex21.atan();
        org.apache.commons.math.complex.Complex complex23 = complex22.cosh();
        org.apache.commons.math.complex.Complex complex24 = complex23.asin();
        org.apache.commons.math.complex.ComplexField complexField25 = complex23.getField();
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex27 = complex26.atan();
        org.apache.commons.math.complex.Complex complex28 = complex27.cosh();
        org.apache.commons.math.complex.Complex complex29 = complex28.tanh();
        java.util.List<org.apache.commons.math.complex.Complex> complexList31 = complex28.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex32 = complex28.sinh();
        org.apache.commons.math.complex.Complex complex33 = complex32.negate();
        boolean boolean34 = complex33.isNaN();
        org.apache.commons.math.complex.Complex complex35 = complex23.divide(complex33);
        org.apache.commons.math.complex.Complex complex36 = complex18.divide(complex23);
        org.apache.commons.math.complex.Complex complex37 = complex23.sqrt();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex18", complex0.equals(complex18) ? complex0.hashCode() == complex18.hashCode() : true);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        double double8 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex9 = complex4.divide(complex7);
        java.lang.String str10 = complex9.toString();
        org.apache.commons.math.complex.Complex complex11 = complex9.sqrt1z();
        org.apache.commons.math.complex.Complex complex12 = complex11.tan();
        org.apache.commons.math.complex.Complex complex13 = complex12.acos();
        org.apache.commons.math.complex.Complex complex14 = complex12.sinh();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex16 = complex15.atan();
        org.apache.commons.math.complex.Complex complex17 = complex16.cosh();
        org.apache.commons.math.complex.Complex complex18 = complex17.asin();
        org.apache.commons.math.complex.ComplexField complexField19 = complex17.getField();
        java.lang.String str20 = complex17.toString();
        org.apache.commons.math.complex.Complex complex21 = complex17.sqrt1z();
        org.apache.commons.math.complex.Complex complex22 = complex21.cos();
        org.apache.commons.math.complex.Complex complex23 = complex12.divide(complex22);
        double double24 = complex12.getArgument();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex22", complex2.equals(complex22) ? complex2.hashCode() == complex22.hashCode() : true);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        double double8 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex9 = complex4.divide(complex7);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.atan();
        org.apache.commons.math.complex.Complex complex12 = complex11.sqrt();
        org.apache.commons.math.complex.Complex complex13 = complex11.tanh();
        org.apache.commons.math.complex.Complex complex14 = complex7.multiply(complex13);
        org.apache.commons.math.complex.Complex complex15 = complex13.exp();
        double double16 = complex13.abs();
        org.apache.commons.math.complex.Complex complex17 = complex13.atan();
        org.apache.commons.math.complex.Complex complex18 = complex13.conjugate();
        org.apache.commons.math.complex.Complex complex19 = complex18.cos();
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex21 = complex20.atan();
        org.apache.commons.math.complex.Complex complex22 = complex21.sqrt();
        org.apache.commons.math.complex.Complex complex24 = complex22.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex25 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex26 = complex22.multiply(complex25);
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex28 = complex27.atan();
        org.apache.commons.math.complex.Complex complex29 = complex28.cosh();
        org.apache.commons.math.complex.Complex complex30 = complex29.asin();
        org.apache.commons.math.complex.Complex complex31 = complex25.add(complex30);
        org.apache.commons.math.complex.Complex complex32 = complex31.conjugate();
        org.apache.commons.math.complex.Complex complex33 = complex32.conjugate();
        org.apache.commons.math.complex.Complex complex34 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex35 = complex34.atan();
        org.apache.commons.math.complex.Complex complex36 = complex35.cosh();
        org.apache.commons.math.complex.Complex complex37 = complex36.tanh();
        org.apache.commons.math.complex.Complex complex38 = complex37.sinh();
        org.apache.commons.math.complex.Complex complex39 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex40 = complex39.atan();
        org.apache.commons.math.complex.Complex complex41 = complex40.cosh();
        double double42 = complex41.getArgument();
        org.apache.commons.math.complex.Complex complex43 = complex38.divide(complex41);
        org.apache.commons.math.complex.Complex complex44 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex45 = complex44.atan();
        org.apache.commons.math.complex.Complex complex46 = complex45.sqrt();
        org.apache.commons.math.complex.Complex complex47 = complex45.tanh();
        org.apache.commons.math.complex.Complex complex48 = complex41.multiply(complex47);
        org.apache.commons.math.complex.Complex complex49 = complex47.exp();
        double double50 = complex47.abs();
        org.apache.commons.math.complex.Complex complex51 = complex47.atan();
        org.apache.commons.math.complex.Complex complex52 = complex51.exp();
        org.apache.commons.math.complex.Complex complex53 = complex32.add(complex51);
        org.apache.commons.math.complex.Complex complex54 = complex53.sinh();
        org.apache.commons.math.complex.Complex complex56 = complex54.multiply(0.07857354418226557d);
        org.apache.commons.math.complex.Complex complex57 = complex19.subtract(complex54);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex18", complex0.equals(complex18) ? complex0.hashCode() == complex18.hashCode() : true);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        double double8 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex9 = complex4.divide(complex7);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.atan();
        org.apache.commons.math.complex.Complex complex12 = complex11.sqrt();
        org.apache.commons.math.complex.Complex complex13 = complex11.tanh();
        org.apache.commons.math.complex.Complex complex14 = complex7.multiply(complex13);
        org.apache.commons.math.complex.Complex complex15 = complex7.negate();
        org.apache.commons.math.complex.Complex complex17 = complex15.multiply(0.8414709848078965d);
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex19 = complex18.atan();
        org.apache.commons.math.complex.Complex complex20 = complex19.cosh();
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex22 = complex21.atan();
        org.apache.commons.math.complex.Complex complex23 = complex22.cosh();
        org.apache.commons.math.complex.Complex complex24 = complex23.tanh();
        org.apache.commons.math.complex.Complex complex25 = complex23.exp();
        org.apache.commons.math.complex.Complex complex26 = complex19.add(complex23);
        org.apache.commons.math.complex.Complex complex27 = complex26.sin();
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex29 = complex28.atan();
        org.apache.commons.math.complex.Complex complex30 = complex29.cosh();
        org.apache.commons.math.complex.Complex complex31 = complex30.tanh();
        org.apache.commons.math.complex.Complex complex32 = complex31.sinh();
        org.apache.commons.math.complex.Complex complex33 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex34 = complex33.atan();
        org.apache.commons.math.complex.Complex complex35 = complex34.cosh();
        double double36 = complex35.getArgument();
        org.apache.commons.math.complex.Complex complex37 = complex32.divide(complex35);
        org.apache.commons.math.complex.Complex complex38 = complex32.log();
        org.apache.commons.math.complex.Complex complex39 = complex38.cos();
        org.apache.commons.math.complex.Complex complex40 = complex38.exp();
        org.apache.commons.math.complex.Complex complex43 = new org.apache.commons.math.complex.Complex((double) 0.0f, (double) (short) -1);
        boolean boolean44 = complex40.equals((java.lang.Object) (short) -1);
        org.apache.commons.math.complex.Complex complex45 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex46 = complex45.atan();
        org.apache.commons.math.complex.Complex complex47 = complex46.sqrt();
        org.apache.commons.math.complex.Complex complex49 = complex47.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex50 = complex47.tan();
        java.lang.String str51 = complex50.toString();
        boolean boolean52 = complex40.equals((java.lang.Object) complex50);
        org.apache.commons.math.complex.Complex complex53 = complex26.divide(complex50);
        org.apache.commons.math.complex.Complex complex54 = complex15.add(complex50);
        org.apache.commons.math.complex.Complex complex56 = complex15.multiply(11013.23288795684d);
        org.apache.commons.math.complex.Complex complex57 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex58 = complex57.atan();
        org.apache.commons.math.complex.Complex complex59 = complex58.cosh();
        org.apache.commons.math.complex.Complex complex60 = complex59.tanh();
        org.apache.commons.math.complex.Complex complex61 = complex60.sinh();
        org.apache.commons.math.complex.Complex complex62 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex63 = complex62.atan();
        org.apache.commons.math.complex.Complex complex64 = complex63.cosh();
        double double65 = complex64.getArgument();
        org.apache.commons.math.complex.Complex complex66 = complex61.divide(complex64);
        java.lang.String str67 = complex66.toString();
        org.apache.commons.math.complex.Complex complex68 = complex66.sqrt1z();
        double double69 = complex66.getImaginary();
        org.apache.commons.math.complex.Complex complex70 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex71 = complex70.atan();
        org.apache.commons.math.complex.Complex complex72 = complex71.cosh();
        org.apache.commons.math.complex.Complex complex73 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex74 = complex73.atan();
        org.apache.commons.math.complex.Complex complex75 = complex74.cosh();
        org.apache.commons.math.complex.Complex complex76 = complex75.tanh();
        org.apache.commons.math.complex.Complex complex77 = complex75.exp();
        org.apache.commons.math.complex.Complex complex78 = complex71.add(complex75);
        org.apache.commons.math.complex.Complex complex79 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex80 = complex79.atan();
        org.apache.commons.math.complex.Complex complex81 = complex80.cosh();
        org.apache.commons.math.complex.Complex complex82 = complex81.tanh();
        org.apache.commons.math.complex.Complex complex83 = complex82.sinh();
        boolean boolean84 = complex82.isInfinite();
        org.apache.commons.math.complex.Complex complex85 = complex71.subtract(complex82);
        org.apache.commons.math.complex.Complex complex86 = complex66.add(complex82);
        org.apache.commons.math.complex.Complex complex87 = complex82.atan();
        org.apache.commons.math.complex.Complex complex88 = complex82.sin();
        double double89 = complex88.getImaginary();
        org.apache.commons.math.complex.Complex complex90 = complex88.sinh();
        org.apache.commons.math.complex.Complex complex91 = complex88.cosh();
        org.apache.commons.math.complex.Complex complex92 = complex56.pow(complex91);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex15 and complex54", complex15.equals(complex54) ? complex15.hashCode() == complex54.hashCode() : true);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex5 = complex4.sqrt();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex7 = complex6.atan();
        org.apache.commons.math.complex.Complex complex8 = complex7.cosh();
        org.apache.commons.math.complex.Complex complex9 = complex8.tanh();
        org.apache.commons.math.complex.Complex complex10 = complex9.sinh();
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex12 = complex11.atan();
        org.apache.commons.math.complex.Complex complex13 = complex12.cosh();
        double double14 = complex13.getArgument();
        org.apache.commons.math.complex.Complex complex15 = complex10.divide(complex13);
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex17 = complex16.atan();
        org.apache.commons.math.complex.Complex complex18 = complex17.cosh();
        org.apache.commons.math.complex.Complex complex19 = complex18.tanh();
        org.apache.commons.math.complex.Complex complex20 = complex19.sinh();
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex22 = complex21.atan();
        org.apache.commons.math.complex.Complex complex23 = complex22.cosh();
        double double24 = complex23.getArgument();
        org.apache.commons.math.complex.Complex complex25 = complex20.divide(complex23);
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex27 = complex26.atan();
        org.apache.commons.math.complex.Complex complex28 = complex27.sqrt();
        org.apache.commons.math.complex.Complex complex29 = complex27.tanh();
        org.apache.commons.math.complex.Complex complex30 = complex23.multiply(complex29);
        org.apache.commons.math.complex.Complex complex31 = complex23.tanh();
        org.apache.commons.math.complex.Complex complex32 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex33 = complex32.atan();
        org.apache.commons.math.complex.Complex complex34 = complex33.cosh();
        org.apache.commons.math.complex.Complex complex35 = complex34.tanh();
        org.apache.commons.math.complex.Complex complex36 = complex34.exp();
        org.apache.commons.math.complex.Complex complex37 = complex34.exp();
        org.apache.commons.math.complex.Complex complex38 = complex37.sqrt();
        org.apache.commons.math.complex.Complex complex39 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex40 = complex39.atan();
        org.apache.commons.math.complex.Complex complex41 = complex40.cosh();
        org.apache.commons.math.complex.Complex complex42 = complex41.tanh();
        org.apache.commons.math.complex.Complex complex43 = complex42.sinh();
        org.apache.commons.math.complex.Complex complex44 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex45 = complex44.atan();
        org.apache.commons.math.complex.Complex complex46 = complex45.cosh();
        double double47 = complex46.getArgument();
        org.apache.commons.math.complex.Complex complex48 = complex43.divide(complex46);
        java.lang.String str49 = complex48.toString();
        org.apache.commons.math.complex.Complex complex50 = complex48.sqrt1z();
        org.apache.commons.math.complex.Complex complex51 = complex50.tan();
        org.apache.commons.math.complex.Complex complex52 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean53 = complex52.isInfinite();
        org.apache.commons.math.complex.Complex complex54 = complex51.multiply(complex52);
        org.apache.commons.math.complex.Complex complex55 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex56 = complex55.sqrt1z();
        org.apache.commons.math.complex.Complex complex57 = complex51.add(complex55);
        org.apache.commons.math.complex.Complex complex58 = complex38.add(complex57);
        org.apache.commons.math.complex.Complex complex59 = complex31.multiply(complex57);
        org.apache.commons.math.complex.Complex complex60 = complex10.subtract(complex57);
        org.apache.commons.math.complex.Complex complex61 = complex60.negate();
        org.apache.commons.math.complex.Complex complex62 = complex60.atan();
        org.apache.commons.math.complex.Complex complex63 = complex60.conjugate();
        org.apache.commons.math.complex.Complex complex64 = complex63.sin();
        org.apache.commons.math.complex.Complex complex65 = complex5.multiply(complex63);
        org.apache.commons.math.complex.Complex complex66 = complex65.sinh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex60 and complex63", complex60.equals(complex63) ? complex60.hashCode() == complex63.hashCode() : true);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        double double8 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex9 = complex4.divide(complex7);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.atan();
        org.apache.commons.math.complex.Complex complex12 = complex11.sqrt();
        org.apache.commons.math.complex.Complex complex13 = complex11.tanh();
        org.apache.commons.math.complex.Complex complex14 = complex7.multiply(complex13);
        org.apache.commons.math.complex.Complex complex15 = complex13.exp();
        double double16 = complex13.abs();
        org.apache.commons.math.complex.Complex complex17 = complex13.atan();
        org.apache.commons.math.complex.Complex complex18 = complex17.exp();
        org.apache.commons.math.complex.Complex complex19 = complex17.asin();
        org.apache.commons.math.complex.Complex complex20 = complex19.tan();
        org.apache.commons.math.complex.Complex complex22 = complex20.multiply(0.33387612069872247d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex19", complex0.equals(complex19) ? complex0.hashCode() == complex19.hashCode() : true);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.asin();
        org.apache.commons.math.complex.Complex complex4 = complex3.tan();
        org.apache.commons.math.complex.Complex complex5 = complex3.sqrt();
        boolean boolean7 = complex3.equals((java.lang.Object) (-1.0f));
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.atan();
        org.apache.commons.math.complex.Complex complex10 = complex9.cosh();
        org.apache.commons.math.complex.Complex complex11 = complex10.tanh();
        org.apache.commons.math.complex.Complex complex12 = complex11.sinh();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex14 = complex13.atan();
        org.apache.commons.math.complex.Complex complex15 = complex14.cosh();
        double double16 = complex15.getArgument();
        org.apache.commons.math.complex.Complex complex17 = complex12.divide(complex15);
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex19 = complex18.atan();
        org.apache.commons.math.complex.Complex complex20 = complex19.sqrt();
        org.apache.commons.math.complex.Complex complex21 = complex19.tanh();
        org.apache.commons.math.complex.Complex complex22 = complex15.multiply(complex21);
        org.apache.commons.math.complex.Complex complex23 = complex15.tanh();
        org.apache.commons.math.complex.Complex complex24 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex25 = complex24.atan();
        org.apache.commons.math.complex.Complex complex26 = complex25.sqrt();
        org.apache.commons.math.complex.Complex complex28 = complex26.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex29 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex30 = complex26.multiply(complex29);
        org.apache.commons.math.complex.Complex complex31 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex32 = complex31.atan();
        org.apache.commons.math.complex.Complex complex33 = complex32.cosh();
        org.apache.commons.math.complex.Complex complex34 = complex33.asin();
        org.apache.commons.math.complex.Complex complex35 = complex29.add(complex34);
        org.apache.commons.math.complex.Complex complex36 = complex35.conjugate();
        org.apache.commons.math.complex.Complex complex37 = complex36.conjugate();
        org.apache.commons.math.complex.Complex complex38 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex39 = complex38.atan();
        org.apache.commons.math.complex.Complex complex40 = complex39.cosh();
        org.apache.commons.math.complex.Complex complex41 = complex40.tanh();
        org.apache.commons.math.complex.Complex complex42 = complex41.sinh();
        org.apache.commons.math.complex.Complex complex43 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex44 = complex43.atan();
        org.apache.commons.math.complex.Complex complex45 = complex44.cosh();
        double double46 = complex45.getArgument();
        org.apache.commons.math.complex.Complex complex47 = complex42.divide(complex45);
        org.apache.commons.math.complex.Complex complex48 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex49 = complex48.atan();
        org.apache.commons.math.complex.Complex complex50 = complex49.sqrt();
        org.apache.commons.math.complex.Complex complex51 = complex49.tanh();
        org.apache.commons.math.complex.Complex complex52 = complex45.multiply(complex51);
        org.apache.commons.math.complex.Complex complex53 = complex51.exp();
        double double54 = complex51.abs();
        org.apache.commons.math.complex.Complex complex55 = complex51.atan();
        org.apache.commons.math.complex.Complex complex56 = complex55.exp();
        org.apache.commons.math.complex.Complex complex57 = complex36.add(complex55);
        org.apache.commons.math.complex.Complex complex58 = complex15.add(complex57);
        double double59 = complex15.getReal();
        org.apache.commons.math.complex.Complex complex60 = complex3.multiply(complex15);
        java.lang.String str61 = complex3.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex34 and complex60", complex34.equals(complex60) ? complex34.hashCode() == complex60.hashCode() : true);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex6 = complex2.multiply(complex5);
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex8 = complex7.atan();
        org.apache.commons.math.complex.Complex complex9 = complex8.cosh();
        org.apache.commons.math.complex.Complex complex10 = complex9.tanh();
        org.apache.commons.math.complex.Complex complex11 = complex10.sinh();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex13 = complex12.atan();
        org.apache.commons.math.complex.Complex complex14 = complex13.cosh();
        double double15 = complex14.getArgument();
        org.apache.commons.math.complex.Complex complex16 = complex11.divide(complex14);
        java.lang.String str17 = complex16.toString();
        org.apache.commons.math.complex.Complex complex18 = complex16.sqrt1z();
        org.apache.commons.math.complex.Complex complex19 = complex18.tan();
        org.apache.commons.math.complex.Complex complex20 = complex2.add(complex19);
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex22 = complex21.atan();
        org.apache.commons.math.complex.Complex complex23 = complex22.sqrt();
        org.apache.commons.math.complex.Complex complex25 = complex23.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex27 = complex23.multiply(complex26);
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex29 = complex28.atan();
        org.apache.commons.math.complex.Complex complex30 = complex29.cosh();
        org.apache.commons.math.complex.Complex complex31 = complex30.asin();
        org.apache.commons.math.complex.Complex complex32 = complex26.add(complex31);
        org.apache.commons.math.complex.Complex complex33 = complex32.conjugate();
        org.apache.commons.math.complex.Complex complex34 = complex2.divide(complex32);
        org.apache.commons.math.complex.Complex complex35 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex36 = complex35.atan();
        org.apache.commons.math.complex.Complex complex37 = complex36.sqrt();
        org.apache.commons.math.complex.Complex complex39 = complex37.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex40 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex41 = complex37.multiply(complex40);
        org.apache.commons.math.complex.Complex complex42 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex43 = complex42.atan();
        org.apache.commons.math.complex.Complex complex44 = complex43.cosh();
        org.apache.commons.math.complex.Complex complex45 = complex44.asin();
        org.apache.commons.math.complex.Complex complex46 = complex40.add(complex45);
        org.apache.commons.math.complex.Complex complex47 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex48 = complex47.atan();
        org.apache.commons.math.complex.Complex complex49 = complex46.multiply(complex48);
        org.apache.commons.math.complex.Complex complex50 = complex49.atan();
        org.apache.commons.math.complex.Complex complex51 = complex32.pow(complex49);
        org.apache.commons.math.complex.Complex complex52 = complex51.acos();
        org.apache.commons.math.complex.Complex complex53 = complex52.exp();
        double double54 = complex52.getReal();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex9 and complex53", complex9.equals(complex53) ? complex9.hashCode() == complex53.hashCode() : true);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex6 = complex2.multiply(complex5);
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex8 = complex7.atan();
        org.apache.commons.math.complex.Complex complex9 = complex8.cosh();
        org.apache.commons.math.complex.Complex complex10 = complex9.asin();
        org.apache.commons.math.complex.Complex complex11 = complex5.add(complex10);
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex13 = complex12.atan();
        org.apache.commons.math.complex.Complex complex14 = complex11.multiply(complex13);
        org.apache.commons.math.complex.Complex complex15 = complex14.atan();
        double double16 = complex15.abs();
        org.apache.commons.math.complex.Complex complex17 = complex15.conjugate();
        double double18 = complex15.abs();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex17", complex0.equals(complex17) ? complex0.hashCode() == complex17.hashCode() : true);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.acos();
        double double3 = complex1.getArgument();
        org.apache.commons.math.complex.Complex complex4 = complex1.tan();
        org.apache.commons.math.complex.Complex complex5 = complex4.conjugate();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex7 = complex6.atan();
        org.apache.commons.math.complex.Complex complex8 = complex7.sqrt();
        org.apache.commons.math.complex.Complex complex10 = complex8.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex12 = complex8.multiply(complex11);
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex14 = complex13.atan();
        org.apache.commons.math.complex.Complex complex15 = complex14.cosh();
        org.apache.commons.math.complex.Complex complex16 = complex15.asin();
        org.apache.commons.math.complex.Complex complex17 = complex11.add(complex16);
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex19 = complex18.atan();
        org.apache.commons.math.complex.Complex complex20 = complex19.cosh();
        org.apache.commons.math.complex.Complex complex21 = complex20.asin();
        org.apache.commons.math.complex.Complex complex22 = complex21.sin();
        org.apache.commons.math.complex.Complex complex23 = complex21.asin();
        org.apache.commons.math.complex.Complex complex24 = complex23.conjugate();
        org.apache.commons.math.complex.Complex complex25 = complex17.divide(complex24);
        org.apache.commons.math.complex.Complex complex28 = new org.apache.commons.math.complex.Complex(0.8373830985134536d, 1.1102230246251565E-16d);
        org.apache.commons.math.complex.Complex complex29 = complex24.add(complex28);
        org.apache.commons.math.complex.Complex complex30 = complex28.sqrt();
        org.apache.commons.math.complex.Complex complex31 = complex28.tan();
        org.apache.commons.math.complex.Complex complex32 = complex5.multiply(complex28);
        org.apache.commons.math.complex.Complex complex33 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex34 = complex33.sqrt1z();
        org.apache.commons.math.complex.Complex complex37 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex38 = complex37.tanh();
        org.apache.commons.math.complex.Complex complex39 = complex34.subtract(complex37);
        org.apache.commons.math.complex.Complex complex42 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex43 = complex34.pow(complex42);
        org.apache.commons.math.complex.Complex complex44 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex45 = complex44.atan();
        org.apache.commons.math.complex.Complex complex46 = complex45.sqrt();
        org.apache.commons.math.complex.Complex complex47 = complex45.tanh();
        org.apache.commons.math.complex.Complex complex48 = complex43.pow(complex45);
        org.apache.commons.math.complex.Complex complex49 = complex48.atan();
        org.apache.commons.math.complex.Complex complex50 = complex32.pow(complex48);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex5", complex0.equals(complex5) ? complex0.hashCode() == complex5.hashCode() : true);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        double double8 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex9 = complex4.divide(complex7);
        java.lang.String str10 = complex9.toString();
        org.apache.commons.math.complex.Complex complex11 = complex9.sqrt1z();
        org.apache.commons.math.complex.Complex complex12 = complex11.tan();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean14 = complex13.isInfinite();
        org.apache.commons.math.complex.Complex complex15 = complex12.multiply(complex13);
        org.apache.commons.math.complex.Complex complex16 = complex13.negate();
        org.apache.commons.math.complex.Complex complex17 = complex13.cos();
        org.apache.commons.math.complex.Complex complex18 = complex13.atan();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex17", complex2.equals(complex17) ? complex2.hashCode() == complex17.hashCode() : true);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex6 = complex2.multiply(complex5);
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex8 = complex7.atan();
        org.apache.commons.math.complex.Complex complex9 = complex8.cosh();
        org.apache.commons.math.complex.Complex complex10 = complex9.asin();
        org.apache.commons.math.complex.Complex complex11 = complex5.add(complex10);
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex13 = complex12.atan();
        org.apache.commons.math.complex.Complex complex14 = complex13.cosh();
        org.apache.commons.math.complex.Complex complex15 = complex14.asin();
        org.apache.commons.math.complex.Complex complex16 = complex15.sin();
        org.apache.commons.math.complex.Complex complex17 = complex15.asin();
        org.apache.commons.math.complex.Complex complex18 = complex17.conjugate();
        org.apache.commons.math.complex.Complex complex19 = complex11.divide(complex18);
        org.apache.commons.math.complex.Complex complex22 = new org.apache.commons.math.complex.Complex(0.8373830985134536d, 1.1102230246251565E-16d);
        org.apache.commons.math.complex.Complex complex23 = complex18.add(complex22);
        org.apache.commons.math.complex.Complex complex24 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex25 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex26 = complex25.atan();
        org.apache.commons.math.complex.Complex complex27 = complex26.cosh();
        org.apache.commons.math.complex.Complex complex28 = complex27.asin();
        org.apache.commons.math.complex.ComplexField complexField29 = complex27.getField();
        java.util.List<org.apache.commons.math.complex.Complex> complexList31 = complex27.nthRoot(10);
        org.apache.commons.math.complex.Complex complex32 = complex24.divide(complex27);
        org.apache.commons.math.complex.Complex complex33 = complex24.acos();
        org.apache.commons.math.complex.Complex complex34 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex35 = complex34.atan();
        org.apache.commons.math.complex.Complex complex36 = complex35.cosh();
        org.apache.commons.math.complex.Complex complex37 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex38 = complex37.atan();
        org.apache.commons.math.complex.Complex complex39 = complex38.cosh();
        org.apache.commons.math.complex.Complex complex40 = complex39.tanh();
        org.apache.commons.math.complex.Complex complex41 = complex39.exp();
        org.apache.commons.math.complex.Complex complex42 = complex35.add(complex39);
        org.apache.commons.math.complex.Complex complex43 = complex42.sin();
        org.apache.commons.math.complex.Complex complex44 = complex24.add(complex43);
        org.apache.commons.math.complex.Complex complex46 = complex24.multiply((double) 1L);
        org.apache.commons.math.complex.ComplexField complexField47 = complex24.getField();
        org.apache.commons.math.complex.Complex complex48 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex49 = complex48.atan();
        org.apache.commons.math.complex.Complex complex50 = complex49.cosh();
        double double51 = complex50.getImaginary();
        boolean boolean52 = complex50.isNaN();
        org.apache.commons.math.complex.Complex complex53 = complex50.conjugate();
        org.apache.commons.math.complex.Complex complex54 = complex24.pow(complex53);
        org.apache.commons.math.complex.Complex complex55 = complex23.pow(complex24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex9 and complex53", complex9.equals(complex53) ? complex9.hashCode() == complex53.hashCode() : true);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex6 = complex2.multiply(complex5);
        org.apache.commons.math.complex.Complex complex7 = complex5.sqrt1z();
        org.apache.commons.math.complex.Complex complex8 = complex5.sin();
        java.lang.Object obj9 = null;
        boolean boolean10 = complex8.equals(obj9);
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex12 = complex11.atan();
        org.apache.commons.math.complex.Complex complex13 = complex12.cosh();
        org.apache.commons.math.complex.Complex complex14 = complex13.asin();
        boolean boolean15 = complex13.isInfinite();
        org.apache.commons.math.complex.Complex complex17 = complex13.multiply((double) 0);
        org.apache.commons.math.complex.Complex complex18 = complex13.asin();
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex20 = complex19.atan();
        org.apache.commons.math.complex.Complex complex21 = complex20.sqrt();
        org.apache.commons.math.complex.Complex complex23 = complex21.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex24 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex25 = complex21.multiply(complex24);
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex27 = complex26.atan();
        org.apache.commons.math.complex.Complex complex28 = complex27.cosh();
        org.apache.commons.math.complex.Complex complex29 = complex28.tanh();
        org.apache.commons.math.complex.Complex complex30 = complex29.sinh();
        org.apache.commons.math.complex.Complex complex31 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex32 = complex31.atan();
        org.apache.commons.math.complex.Complex complex33 = complex32.cosh();
        double double34 = complex33.getArgument();
        org.apache.commons.math.complex.Complex complex35 = complex30.divide(complex33);
        java.lang.String str36 = complex35.toString();
        org.apache.commons.math.complex.Complex complex37 = complex35.sqrt1z();
        org.apache.commons.math.complex.Complex complex38 = complex37.tan();
        org.apache.commons.math.complex.Complex complex39 = complex21.add(complex38);
        org.apache.commons.math.complex.Complex complex40 = complex21.sqrt1z();
        double double41 = complex40.abs();
        org.apache.commons.math.complex.Complex complex42 = complex18.subtract(complex40);
        org.apache.commons.math.complex.Complex complex43 = complex40.acos();
        org.apache.commons.math.complex.Complex complex44 = complex8.pow(complex43);
        boolean boolean45 = complex8.isNaN();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex43", complex0.equals(complex43) ? complex0.hashCode() == complex43.hashCode() : true);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        double double3 = complex2.getImaginary();
        double double4 = complex2.getReal();
        org.apache.commons.math.complex.Complex complex5 = complex2.log();
        org.apache.commons.math.complex.Complex complex6 = complex5.exp();
        double double7 = complex6.abs();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.atan();
        org.apache.commons.math.complex.Complex complex10 = complex9.cosh();
        org.apache.commons.math.complex.Complex complex11 = complex10.tanh();
        org.apache.commons.math.complex.Complex complex12 = complex10.cosh();
        boolean boolean13 = complex10.isNaN();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex15 = complex14.sqrt1z();
        org.apache.commons.math.complex.Complex complex18 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex19 = complex18.tanh();
        org.apache.commons.math.complex.Complex complex20 = complex15.subtract(complex18);
        org.apache.commons.math.complex.Complex complex23 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex24 = complex15.pow(complex23);
        org.apache.commons.math.complex.Complex complex25 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex26 = complex25.atan();
        org.apache.commons.math.complex.Complex complex27 = complex26.sqrt();
        org.apache.commons.math.complex.Complex complex28 = complex26.tanh();
        org.apache.commons.math.complex.Complex complex29 = complex24.pow(complex26);
        org.apache.commons.math.complex.Complex complex30 = complex10.add(complex24);
        org.apache.commons.math.complex.Complex complex31 = complex30.conjugate();
        org.apache.commons.math.complex.Complex complex32 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex33 = complex32.atan();
        org.apache.commons.math.complex.Complex complex34 = complex33.sqrt();
        org.apache.commons.math.complex.Complex complex35 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex36 = complex35.atan();
        org.apache.commons.math.complex.Complex complex37 = complex36.cosh();
        org.apache.commons.math.complex.Complex complex38 = complex37.tanh();
        org.apache.commons.math.complex.Complex complex39 = complex38.sinh();
        org.apache.commons.math.complex.Complex complex40 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex41 = complex40.atan();
        org.apache.commons.math.complex.Complex complex42 = complex41.cosh();
        double double43 = complex42.getArgument();
        org.apache.commons.math.complex.Complex complex44 = complex39.divide(complex42);
        org.apache.commons.math.complex.Complex complex45 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex46 = complex45.atan();
        org.apache.commons.math.complex.Complex complex47 = complex46.sqrt();
        org.apache.commons.math.complex.Complex complex48 = complex46.tanh();
        org.apache.commons.math.complex.Complex complex49 = complex42.multiply(complex48);
        org.apache.commons.math.complex.Complex complex50 = complex33.pow(complex48);
        org.apache.commons.math.complex.Complex complex51 = complex48.cos();
        org.apache.commons.math.complex.Complex complex52 = complex51.sqrt1z();
        org.apache.commons.math.complex.Complex complex53 = complex30.add(complex51);
        org.apache.commons.math.complex.Complex complex54 = complex6.add(complex53);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex51", complex2.equals(complex51) ? complex2.hashCode() == complex51.hashCode() : true);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        double double8 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex9 = complex4.divide(complex7);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.atan();
        org.apache.commons.math.complex.Complex complex12 = complex11.cosh();
        org.apache.commons.math.complex.Complex complex13 = complex12.tanh();
        org.apache.commons.math.complex.Complex complex14 = complex12.exp();
        org.apache.commons.math.complex.Complex complex15 = complex12.exp();
        org.apache.commons.math.complex.Complex complex16 = complex15.sqrt();
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex18 = complex17.atan();
        org.apache.commons.math.complex.Complex complex19 = complex18.cosh();
        org.apache.commons.math.complex.Complex complex20 = complex19.tanh();
        org.apache.commons.math.complex.Complex complex21 = complex20.sinh();
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex23 = complex22.atan();
        org.apache.commons.math.complex.Complex complex24 = complex23.cosh();
        double double25 = complex24.getArgument();
        org.apache.commons.math.complex.Complex complex26 = complex21.divide(complex24);
        java.lang.String str27 = complex26.toString();
        org.apache.commons.math.complex.Complex complex28 = complex26.sqrt1z();
        org.apache.commons.math.complex.Complex complex29 = complex28.tan();
        org.apache.commons.math.complex.Complex complex30 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean31 = complex30.isInfinite();
        org.apache.commons.math.complex.Complex complex32 = complex29.multiply(complex30);
        org.apache.commons.math.complex.Complex complex33 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex34 = complex33.sqrt1z();
        org.apache.commons.math.complex.Complex complex35 = complex29.add(complex33);
        org.apache.commons.math.complex.Complex complex36 = complex16.add(complex35);
        org.apache.commons.math.complex.Complex complex37 = complex35.asin();
        org.apache.commons.math.complex.Complex complex38 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex39 = complex38.sqrt1z();
        org.apache.commons.math.complex.Complex complex42 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex43 = complex42.tanh();
        org.apache.commons.math.complex.Complex complex44 = complex39.subtract(complex42);
        double double45 = complex39.getArgument();
        org.apache.commons.math.complex.Complex complex46 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex47 = complex46.sqrt1z();
        org.apache.commons.math.complex.Complex complex50 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex51 = complex50.tanh();
        org.apache.commons.math.complex.Complex complex52 = complex47.subtract(complex50);
        double double53 = complex52.getImaginary();
        org.apache.commons.math.complex.Complex complex54 = complex52.asin();
        org.apache.commons.math.complex.Complex complex55 = complex52.cos();
        org.apache.commons.math.complex.Complex complex57 = complex55.multiply(1.0d);
        org.apache.commons.math.complex.Complex complex58 = complex39.subtract(complex57);
        org.apache.commons.math.complex.Complex complex59 = complex35.subtract(complex58);
        org.apache.commons.math.complex.Complex complex60 = complex7.divide(complex59);
        org.apache.commons.math.complex.Complex complex61 = complex7.cos();
        org.apache.commons.math.complex.Complex complex62 = complex7.acos();
        double double63 = complex7.getReal();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex62", complex0.equals(complex62) ? complex0.hashCode() == complex62.hashCode() : true);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex4 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex5 = complex4.tanh();
        org.apache.commons.math.complex.Complex complex6 = complex1.subtract(complex4);
        double double7 = complex1.getArgument();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.sqrt1z();
        org.apache.commons.math.complex.Complex complex12 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex13 = complex12.tanh();
        org.apache.commons.math.complex.Complex complex14 = complex9.subtract(complex12);
        double double15 = complex14.getImaginary();
        org.apache.commons.math.complex.Complex complex16 = complex14.asin();
        org.apache.commons.math.complex.Complex complex17 = complex14.cos();
        org.apache.commons.math.complex.Complex complex19 = complex17.multiply(1.0d);
        org.apache.commons.math.complex.Complex complex20 = complex1.subtract(complex19);
        org.apache.commons.math.complex.Complex complex21 = complex1.sqrt1z();
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex23 = complex22.atan();
        org.apache.commons.math.complex.Complex complex24 = complex23.cosh();
        org.apache.commons.math.complex.Complex complex25 = complex24.tanh();
        org.apache.commons.math.complex.Complex complex26 = complex25.sinh();
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex28 = complex27.atan();
        org.apache.commons.math.complex.Complex complex29 = complex28.cosh();
        double double30 = complex29.getArgument();
        org.apache.commons.math.complex.Complex complex31 = complex26.divide(complex29);
        org.apache.commons.math.complex.Complex complex32 = complex26.log();
        org.apache.commons.math.complex.Complex complex33 = complex32.cos();
        org.apache.commons.math.complex.Complex complex34 = complex32.exp();
        org.apache.commons.math.complex.Complex complex35 = complex32.acos();
        org.apache.commons.math.complex.Complex complex36 = complex32.log();
        org.apache.commons.math.complex.Complex complex37 = complex32.tanh();
        org.apache.commons.math.complex.Complex complex38 = complex1.multiply(complex37);
        boolean boolean39 = complex1.isNaN();
        org.apache.commons.math.complex.Complex complex40 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex41 = complex40.atan();
        org.apache.commons.math.complex.Complex complex42 = complex41.sqrt();
        org.apache.commons.math.complex.Complex complex44 = complex42.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex45 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex46 = complex42.multiply(complex45);
        org.apache.commons.math.complex.Complex complex47 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex48 = complex47.atan();
        org.apache.commons.math.complex.Complex complex49 = complex48.cosh();
        org.apache.commons.math.complex.Complex complex50 = complex49.tanh();
        org.apache.commons.math.complex.Complex complex51 = complex50.sinh();
        org.apache.commons.math.complex.Complex complex52 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex53 = complex52.atan();
        org.apache.commons.math.complex.Complex complex54 = complex53.cosh();
        double double55 = complex54.getArgument();
        org.apache.commons.math.complex.Complex complex56 = complex51.divide(complex54);
        java.lang.String str57 = complex56.toString();
        org.apache.commons.math.complex.Complex complex58 = complex56.sqrt1z();
        org.apache.commons.math.complex.Complex complex59 = complex58.tan();
        org.apache.commons.math.complex.Complex complex60 = complex42.add(complex59);
        org.apache.commons.math.complex.Complex complex61 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex62 = complex61.atan();
        org.apache.commons.math.complex.Complex complex63 = complex62.sqrt();
        org.apache.commons.math.complex.Complex complex65 = complex63.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex66 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex67 = complex63.multiply(complex66);
        org.apache.commons.math.complex.Complex complex68 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex69 = complex68.atan();
        org.apache.commons.math.complex.Complex complex70 = complex69.cosh();
        org.apache.commons.math.complex.Complex complex71 = complex70.asin();
        org.apache.commons.math.complex.Complex complex72 = complex66.add(complex71);
        org.apache.commons.math.complex.Complex complex73 = complex72.conjugate();
        org.apache.commons.math.complex.Complex complex74 = complex42.divide(complex72);
        org.apache.commons.math.complex.Complex complex75 = complex74.conjugate();
        org.apache.commons.math.complex.Complex complex76 = complex1.subtract(complex75);
        org.apache.commons.math.complex.Complex complex77 = complex76.tanh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex75", complex0.equals(complex75) ? complex0.hashCode() == complex75.hashCode() : true);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex2.exp();
        org.apache.commons.math.complex.Complex complex5 = complex2.exp();
        org.apache.commons.math.complex.Complex complex6 = complex5.sqrt();
        double double7 = complex5.getImaginary();
        org.apache.commons.math.complex.Complex complex8 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex11 = new org.apache.commons.math.complex.Complex((double) 0.0f, (double) (short) -1);
        org.apache.commons.math.complex.Complex complex12 = complex8.multiply(complex11);
        org.apache.commons.math.complex.Complex complex13 = complex8.negate();
        org.apache.commons.math.complex.Complex complex14 = complex13.cos();
        org.apache.commons.math.complex.Complex complex15 = complex14.negate();
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex17 = complex16.atan();
        org.apache.commons.math.complex.Complex complex18 = complex17.sqrt();
        org.apache.commons.math.complex.Complex complex20 = complex18.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex22 = complex18.multiply(complex21);
        org.apache.commons.math.complex.Complex complex23 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex24 = complex23.atan();
        org.apache.commons.math.complex.Complex complex25 = complex24.cosh();
        org.apache.commons.math.complex.Complex complex26 = complex25.tanh();
        org.apache.commons.math.complex.Complex complex27 = complex26.sinh();
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex29 = complex28.atan();
        org.apache.commons.math.complex.Complex complex30 = complex29.cosh();
        double double31 = complex30.getArgument();
        org.apache.commons.math.complex.Complex complex32 = complex27.divide(complex30);
        java.lang.String str33 = complex32.toString();
        org.apache.commons.math.complex.Complex complex34 = complex32.sqrt1z();
        org.apache.commons.math.complex.Complex complex35 = complex34.tan();
        org.apache.commons.math.complex.Complex complex36 = complex18.add(complex35);
        org.apache.commons.math.complex.Complex complex37 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex38 = complex37.atan();
        org.apache.commons.math.complex.Complex complex39 = complex38.cosh();
        org.apache.commons.math.complex.Complex complex40 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex41 = complex40.atan();
        org.apache.commons.math.complex.Complex complex42 = complex41.cosh();
        org.apache.commons.math.complex.Complex complex43 = complex42.tanh();
        org.apache.commons.math.complex.Complex complex44 = complex42.exp();
        org.apache.commons.math.complex.Complex complex45 = complex38.add(complex42);
        org.apache.commons.math.complex.Complex complex46 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex47 = complex46.atan();
        org.apache.commons.math.complex.Complex complex48 = complex47.cosh();
        org.apache.commons.math.complex.Complex complex49 = complex48.tanh();
        org.apache.commons.math.complex.Complex complex50 = complex49.sinh();
        boolean boolean51 = complex49.isInfinite();
        org.apache.commons.math.complex.Complex complex52 = complex38.subtract(complex49);
        java.lang.String str53 = complex52.toString();
        org.apache.commons.math.complex.Complex complex54 = complex52.sqrt();
        org.apache.commons.math.complex.Complex complex55 = complex36.divide(complex54);
        org.apache.commons.math.complex.Complex complex56 = complex36.conjugate();
        org.apache.commons.math.complex.Complex complex57 = complex56.tanh();
        org.apache.commons.math.complex.Complex complex58 = complex15.pow(complex57);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex35 and complex56", complex35.equals(complex56) ? complex35.hashCode() == complex56.hashCode() : true);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex6 = complex2.multiply(complex5);
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex8 = complex7.atan();
        org.apache.commons.math.complex.Complex complex9 = complex8.cosh();
        org.apache.commons.math.complex.Complex complex10 = complex9.asin();
        org.apache.commons.math.complex.Complex complex11 = complex5.add(complex10);
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex13 = complex12.atan();
        org.apache.commons.math.complex.Complex complex14 = complex11.multiply(complex13);
        org.apache.commons.math.complex.Complex complex15 = complex14.atan();
        org.apache.commons.math.complex.Complex complex16 = complex14.atan();
        org.apache.commons.math.complex.Complex complex17 = complex16.conjugate();
        org.apache.commons.math.complex.Complex complex18 = complex16.sinh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex17", complex0.equals(complex17) ? complex0.hashCode() == complex17.hashCode() : true);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex4 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex5 = complex4.tanh();
        org.apache.commons.math.complex.Complex complex6 = complex1.subtract(complex4);
        double double7 = complex1.getArgument();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.sqrt1z();
        org.apache.commons.math.complex.Complex complex12 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex13 = complex12.tanh();
        org.apache.commons.math.complex.Complex complex14 = complex9.subtract(complex12);
        double double15 = complex14.getImaginary();
        org.apache.commons.math.complex.Complex complex16 = complex14.asin();
        org.apache.commons.math.complex.Complex complex17 = complex14.cos();
        org.apache.commons.math.complex.Complex complex19 = complex17.multiply(1.0d);
        org.apache.commons.math.complex.Complex complex20 = complex1.subtract(complex19);
        org.apache.commons.math.complex.Complex complex21 = complex1.sqrt1z();
        org.apache.commons.math.complex.Complex complex22 = complex21.conjugate();
        org.apache.commons.math.complex.Complex complex23 = complex22.asin();
        org.apache.commons.math.complex.Complex complex24 = complex23.atan();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex22", complex0.equals(complex22) ? complex0.hashCode() == complex22.hashCode() : true);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        double double8 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex9 = complex4.divide(complex7);
        java.lang.String str10 = complex9.toString();
        org.apache.commons.math.complex.Complex complex11 = complex9.sqrt1z();
        double double12 = complex9.getImaginary();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex14 = complex13.atan();
        org.apache.commons.math.complex.Complex complex15 = complex14.cosh();
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex17 = complex16.atan();
        org.apache.commons.math.complex.Complex complex18 = complex17.cosh();
        org.apache.commons.math.complex.Complex complex19 = complex18.tanh();
        org.apache.commons.math.complex.Complex complex20 = complex18.exp();
        org.apache.commons.math.complex.Complex complex21 = complex14.add(complex18);
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex23 = complex22.atan();
        org.apache.commons.math.complex.Complex complex24 = complex23.cosh();
        org.apache.commons.math.complex.Complex complex25 = complex24.tanh();
        org.apache.commons.math.complex.Complex complex26 = complex25.sinh();
        boolean boolean27 = complex25.isInfinite();
        org.apache.commons.math.complex.Complex complex28 = complex14.subtract(complex25);
        org.apache.commons.math.complex.Complex complex29 = complex9.add(complex25);
        org.apache.commons.math.complex.Complex complex30 = complex25.atan();
        org.apache.commons.math.complex.Complex complex31 = complex25.acos();
        double double32 = complex31.getImaginary();
        org.apache.commons.math.complex.Complex complex33 = complex31.asin();
        org.apache.commons.math.complex.Complex complex34 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex35 = complex34.atan();
        org.apache.commons.math.complex.Complex complex36 = complex35.sqrt();
        org.apache.commons.math.complex.Complex complex37 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex38 = complex37.atan();
        org.apache.commons.math.complex.Complex complex39 = complex38.cosh();
        org.apache.commons.math.complex.Complex complex40 = complex39.tanh();
        org.apache.commons.math.complex.Complex complex41 = complex40.sinh();
        org.apache.commons.math.complex.Complex complex42 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex43 = complex42.atan();
        org.apache.commons.math.complex.Complex complex44 = complex43.cosh();
        double double45 = complex44.getArgument();
        org.apache.commons.math.complex.Complex complex46 = complex41.divide(complex44);
        org.apache.commons.math.complex.Complex complex47 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex48 = complex47.atan();
        org.apache.commons.math.complex.Complex complex49 = complex48.sqrt();
        org.apache.commons.math.complex.Complex complex50 = complex48.tanh();
        org.apache.commons.math.complex.Complex complex51 = complex44.multiply(complex50);
        org.apache.commons.math.complex.Complex complex52 = complex35.pow(complex50);
        org.apache.commons.math.complex.Complex complex53 = complex50.cos();
        org.apache.commons.math.complex.Complex complex54 = complex31.add(complex50);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex53", complex2.equals(complex53) ? complex2.hashCode() == complex53.hashCode() : true);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        double double8 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex9 = complex4.divide(complex7);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.atan();
        org.apache.commons.math.complex.Complex complex12 = complex11.sqrt();
        org.apache.commons.math.complex.Complex complex13 = complex11.tanh();
        org.apache.commons.math.complex.Complex complex14 = complex7.multiply(complex13);
        org.apache.commons.math.complex.Complex complex15 = complex13.cos();
        org.apache.commons.math.complex.Complex complex16 = complex15.tanh();
        org.apache.commons.math.complex.Complex complex17 = complex16.sinh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex15", complex2.equals(complex15) ? complex2.hashCode() == complex15.hashCode() : true);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.abs();
        org.apache.commons.math.complex.Complex complex2 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex4 = complex3.atan();
        org.apache.commons.math.complex.Complex complex5 = complex4.cosh();
        org.apache.commons.math.complex.Complex complex6 = complex5.tanh();
        org.apache.commons.math.complex.Complex complex7 = complex6.sinh();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.atan();
        org.apache.commons.math.complex.Complex complex10 = complex9.cosh();
        double double11 = complex10.getArgument();
        org.apache.commons.math.complex.Complex complex12 = complex7.divide(complex10);
        org.apache.commons.math.complex.Complex complex13 = complex7.log();
        org.apache.commons.math.complex.Complex complex14 = complex13.cos();
        org.apache.commons.math.complex.Complex complex15 = complex13.exp();
        org.apache.commons.math.complex.Complex complex16 = complex13.acos();
        org.apache.commons.math.complex.Complex complex17 = complex13.log();
        boolean boolean18 = complex17.isInfinite();
        org.apache.commons.math.complex.Complex complex19 = complex0.divide(complex17);
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex21 = complex20.atan();
        org.apache.commons.math.complex.Complex complex22 = complex21.sqrt();
        org.apache.commons.math.complex.Complex complex24 = complex22.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex25 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex26 = complex22.multiply(complex25);
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex28 = complex27.atan();
        org.apache.commons.math.complex.Complex complex29 = complex28.cosh();
        org.apache.commons.math.complex.Complex complex30 = complex29.tanh();
        org.apache.commons.math.complex.Complex complex31 = complex30.sinh();
        org.apache.commons.math.complex.Complex complex32 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex33 = complex32.atan();
        org.apache.commons.math.complex.Complex complex34 = complex33.cosh();
        double double35 = complex34.getArgument();
        org.apache.commons.math.complex.Complex complex36 = complex31.divide(complex34);
        java.lang.String str37 = complex36.toString();
        org.apache.commons.math.complex.Complex complex38 = complex36.sqrt1z();
        org.apache.commons.math.complex.Complex complex39 = complex38.tan();
        org.apache.commons.math.complex.Complex complex40 = complex22.add(complex39);
        org.apache.commons.math.complex.Complex complex41 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex42 = complex41.atan();
        org.apache.commons.math.complex.Complex complex43 = complex42.sqrt();
        org.apache.commons.math.complex.Complex complex45 = complex43.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex46 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex47 = complex43.multiply(complex46);
        org.apache.commons.math.complex.Complex complex48 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex49 = complex48.atan();
        org.apache.commons.math.complex.Complex complex50 = complex49.cosh();
        org.apache.commons.math.complex.Complex complex51 = complex50.asin();
        org.apache.commons.math.complex.Complex complex52 = complex46.add(complex51);
        org.apache.commons.math.complex.Complex complex53 = complex52.conjugate();
        org.apache.commons.math.complex.Complex complex54 = complex22.divide(complex52);
        org.apache.commons.math.complex.Complex complex55 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex56 = complex55.atan();
        org.apache.commons.math.complex.Complex complex57 = complex56.sqrt();
        org.apache.commons.math.complex.Complex complex59 = complex57.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex60 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex61 = complex57.multiply(complex60);
        org.apache.commons.math.complex.Complex complex62 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex63 = complex62.atan();
        org.apache.commons.math.complex.Complex complex64 = complex63.cosh();
        org.apache.commons.math.complex.Complex complex65 = complex64.asin();
        org.apache.commons.math.complex.Complex complex66 = complex60.add(complex65);
        org.apache.commons.math.complex.Complex complex67 = complex54.pow(complex66);
        org.apache.commons.math.complex.Complex complex68 = complex66.atan();
        org.apache.commons.math.complex.Complex complex69 = complex19.pow(complex68);
        java.lang.String str70 = complex69.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex19", complex0.equals(complex19) ? complex0.hashCode() == complex19.hashCode() : true);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        double double8 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex9 = complex4.divide(complex7);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.atan();
        org.apache.commons.math.complex.Complex complex12 = complex11.sqrt();
        org.apache.commons.math.complex.Complex complex13 = complex11.tanh();
        org.apache.commons.math.complex.Complex complex14 = complex7.multiply(complex13);
        org.apache.commons.math.complex.Complex complex15 = complex13.exp();
        double double16 = complex13.abs();
        org.apache.commons.math.complex.Complex complex17 = complex13.atan();
        org.apache.commons.math.complex.Complex complex18 = complex13.conjugate();
        double double19 = complex18.abs();
        double double20 = complex18.getArgument();
        org.apache.commons.math.complex.Complex complex21 = complex18.conjugate();
        java.lang.Class<?> wildcardClass22 = complex21.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex18", complex0.equals(complex18) ? complex0.hashCode() == complex18.hashCode() : true);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex4 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex5 = complex4.tanh();
        org.apache.commons.math.complex.Complex complex6 = complex1.subtract(complex4);
        org.apache.commons.math.complex.Complex complex9 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex10 = complex1.pow(complex9);
        org.apache.commons.math.complex.Complex complex11 = complex1.atan();
        org.apache.commons.math.complex.Complex complex12 = complex1.acos();
        org.apache.commons.math.complex.Complex complex13 = complex1.acos();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex12", complex0.equals(complex12) ? complex0.hashCode() == complex12.hashCode() : true);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex4 = complex3.atan();
        org.apache.commons.math.complex.Complex complex5 = complex4.cosh();
        org.apache.commons.math.complex.Complex complex6 = complex5.tanh();
        org.apache.commons.math.complex.Complex complex7 = complex5.exp();
        org.apache.commons.math.complex.Complex complex8 = complex1.add(complex5);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex10 = complex9.atan();
        org.apache.commons.math.complex.Complex complex11 = complex10.cosh();
        org.apache.commons.math.complex.Complex complex12 = complex11.tanh();
        org.apache.commons.math.complex.Complex complex13 = complex12.sinh();
        boolean boolean14 = complex12.isInfinite();
        org.apache.commons.math.complex.Complex complex15 = complex1.subtract(complex12);
        org.apache.commons.math.complex.Complex complex16 = complex1.acos();
        org.apache.commons.math.complex.Complex complex17 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex18 = complex1.exp();
        org.apache.commons.math.complex.Complex complex19 = complex1.conjugate();
        org.apache.commons.math.complex.Complex complex20 = complex19.tanh();
        org.apache.commons.math.complex.Complex complex21 = complex19.log();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex20", complex0.equals(complex20) ? complex0.hashCode() == complex20.hashCode() : true);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex6 = complex2.multiply(complex5);
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex8 = complex7.atan();
        org.apache.commons.math.complex.Complex complex9 = complex8.cosh();
        org.apache.commons.math.complex.Complex complex10 = complex9.asin();
        org.apache.commons.math.complex.Complex complex11 = complex5.add(complex10);
        org.apache.commons.math.complex.Complex complex12 = complex11.asin();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex14 = complex13.atan();
        org.apache.commons.math.complex.Complex complex15 = complex14.cosh();
        org.apache.commons.math.complex.Complex complex16 = complex15.asin();
        org.apache.commons.math.complex.ComplexField complexField17 = complex15.getField();
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex19 = complex18.atan();
        org.apache.commons.math.complex.Complex complex20 = complex19.cosh();
        org.apache.commons.math.complex.Complex complex21 = complex20.tanh();
        org.apache.commons.math.complex.Complex complex22 = complex20.exp();
        boolean boolean23 = complex20.isNaN();
        org.apache.commons.math.complex.Complex complex24 = complex20.sqrt();
        org.apache.commons.math.complex.Complex complex25 = complex24.exp();
        org.apache.commons.math.complex.Complex complex26 = complex15.pow(complex25);
        org.apache.commons.math.complex.Complex complex27 = complex12.multiply(complex25);
        org.apache.commons.math.complex.Complex complex30 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex31 = complex30.tanh();
        java.lang.String str32 = complex31.toString();
        org.apache.commons.math.complex.Complex complex33 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex34 = complex33.atan();
        org.apache.commons.math.complex.Complex complex35 = complex34.cosh();
        org.apache.commons.math.complex.Complex complex36 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex37 = complex36.atan();
        org.apache.commons.math.complex.Complex complex38 = complex37.cosh();
        org.apache.commons.math.complex.Complex complex39 = complex38.tanh();
        org.apache.commons.math.complex.Complex complex40 = complex38.exp();
        org.apache.commons.math.complex.Complex complex41 = complex34.add(complex38);
        org.apache.commons.math.complex.Complex complex42 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex43 = complex42.atan();
        org.apache.commons.math.complex.Complex complex44 = complex43.cosh();
        org.apache.commons.math.complex.Complex complex45 = complex44.tanh();
        org.apache.commons.math.complex.Complex complex46 = complex45.sinh();
        boolean boolean47 = complex45.isInfinite();
        org.apache.commons.math.complex.Complex complex48 = complex34.subtract(complex45);
        org.apache.commons.math.complex.Complex complex49 = complex31.divide(complex48);
        org.apache.commons.math.complex.Complex complex50 = complex48.conjugate();
        org.apache.commons.math.complex.Complex complex51 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex52 = complex51.atan();
        org.apache.commons.math.complex.Complex complex53 = complex52.cosh();
        org.apache.commons.math.complex.Complex complex54 = complex53.tanh();
        org.apache.commons.math.complex.Complex complex55 = complex54.sinh();
        org.apache.commons.math.complex.Complex complex56 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex57 = complex56.atan();
        org.apache.commons.math.complex.Complex complex58 = complex57.cosh();
        double double59 = complex58.getArgument();
        org.apache.commons.math.complex.Complex complex60 = complex55.divide(complex58);
        org.apache.commons.math.complex.Complex complex61 = complex55.log();
        org.apache.commons.math.complex.Complex complex62 = complex61.cos();
        java.lang.String str63 = complex61.toString();
        org.apache.commons.math.complex.Complex complex64 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex65 = complex64.atan();
        org.apache.commons.math.complex.Complex complex66 = complex65.cosh();
        org.apache.commons.math.complex.Complex complex67 = complex61.divide(complex65);
        org.apache.commons.math.complex.Complex complex68 = complex48.divide(complex65);
        org.apache.commons.math.complex.Complex complex69 = complex27.add(complex65);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex48 and complex50", complex48.equals(complex50) ? complex48.hashCode() == complex50.hashCode() : true);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        boolean boolean2 = complex1.isInfinite();
        double double3 = complex1.abs();
        org.apache.commons.math.complex.Complex complex4 = complex1.tanh();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        org.apache.commons.math.complex.Complex complex8 = complex7.asin();
        org.apache.commons.math.complex.Complex complex9 = complex8.tan();
        org.apache.commons.math.complex.Complex complex10 = complex8.sqrt();
        boolean boolean12 = complex8.equals((java.lang.Object) (-1.0f));
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex14 = complex13.atan();
        org.apache.commons.math.complex.Complex complex15 = complex14.cosh();
        org.apache.commons.math.complex.Complex complex16 = complex15.tanh();
        org.apache.commons.math.complex.Complex complex17 = complex16.sinh();
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex19 = complex18.atan();
        org.apache.commons.math.complex.Complex complex20 = complex19.cosh();
        double double21 = complex20.getArgument();
        org.apache.commons.math.complex.Complex complex22 = complex17.divide(complex20);
        org.apache.commons.math.complex.Complex complex23 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex24 = complex23.atan();
        org.apache.commons.math.complex.Complex complex25 = complex24.sqrt();
        org.apache.commons.math.complex.Complex complex26 = complex24.tanh();
        org.apache.commons.math.complex.Complex complex27 = complex20.multiply(complex26);
        org.apache.commons.math.complex.Complex complex28 = complex20.tanh();
        org.apache.commons.math.complex.Complex complex29 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex30 = complex29.atan();
        org.apache.commons.math.complex.Complex complex31 = complex30.sqrt();
        org.apache.commons.math.complex.Complex complex33 = complex31.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex34 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex35 = complex31.multiply(complex34);
        org.apache.commons.math.complex.Complex complex36 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex37 = complex36.atan();
        org.apache.commons.math.complex.Complex complex38 = complex37.cosh();
        org.apache.commons.math.complex.Complex complex39 = complex38.asin();
        org.apache.commons.math.complex.Complex complex40 = complex34.add(complex39);
        org.apache.commons.math.complex.Complex complex41 = complex40.conjugate();
        org.apache.commons.math.complex.Complex complex42 = complex41.conjugate();
        org.apache.commons.math.complex.Complex complex43 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex44 = complex43.atan();
        org.apache.commons.math.complex.Complex complex45 = complex44.cosh();
        org.apache.commons.math.complex.Complex complex46 = complex45.tanh();
        org.apache.commons.math.complex.Complex complex47 = complex46.sinh();
        org.apache.commons.math.complex.Complex complex48 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex49 = complex48.atan();
        org.apache.commons.math.complex.Complex complex50 = complex49.cosh();
        double double51 = complex50.getArgument();
        org.apache.commons.math.complex.Complex complex52 = complex47.divide(complex50);
        org.apache.commons.math.complex.Complex complex53 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex54 = complex53.atan();
        org.apache.commons.math.complex.Complex complex55 = complex54.sqrt();
        org.apache.commons.math.complex.Complex complex56 = complex54.tanh();
        org.apache.commons.math.complex.Complex complex57 = complex50.multiply(complex56);
        org.apache.commons.math.complex.Complex complex58 = complex56.exp();
        double double59 = complex56.abs();
        org.apache.commons.math.complex.Complex complex60 = complex56.atan();
        org.apache.commons.math.complex.Complex complex61 = complex60.exp();
        org.apache.commons.math.complex.Complex complex62 = complex41.add(complex60);
        org.apache.commons.math.complex.Complex complex63 = complex20.add(complex62);
        double double64 = complex20.getReal();
        org.apache.commons.math.complex.Complex complex65 = complex8.multiply(complex20);
        org.apache.commons.math.complex.Complex complex66 = complex4.multiply(complex8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex39 and complex65", complex39.equals(complex65) ? complex39.hashCode() == complex65.hashCode() : true);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.acos();
        double double3 = complex1.getArgument();
        org.apache.commons.math.complex.Complex complex4 = complex1.tan();
        org.apache.commons.math.complex.Complex complex5 = complex1.asin();
        java.util.List<org.apache.commons.math.complex.Complex> complexList7 = complex1.nthRoot(1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex5", complex0.equals(complex5) ? complex0.hashCode() == complex5.hashCode() : true);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        double double8 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex9 = complex4.divide(complex7);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.atan();
        org.apache.commons.math.complex.Complex complex12 = complex11.sqrt();
        org.apache.commons.math.complex.Complex complex13 = complex11.tanh();
        org.apache.commons.math.complex.Complex complex14 = complex7.multiply(complex13);
        org.apache.commons.math.complex.Complex complex15 = complex13.exp();
        org.apache.commons.math.complex.Complex complex16 = complex15.acos();
        org.apache.commons.math.complex.Complex complex17 = complex16.cosh();
        org.apache.commons.math.complex.Complex complex18 = complex17.sin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex16", complex0.equals(complex16) ? complex0.hashCode() == complex16.hashCode() : true);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex4 = complex3.atan();
        org.apache.commons.math.complex.Complex complex5 = complex4.cosh();
        org.apache.commons.math.complex.Complex complex6 = complex5.tanh();
        org.apache.commons.math.complex.Complex complex7 = complex6.sinh();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.atan();
        org.apache.commons.math.complex.Complex complex10 = complex9.cosh();
        double double11 = complex10.getArgument();
        org.apache.commons.math.complex.Complex complex12 = complex7.divide(complex10);
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex14 = complex13.atan();
        org.apache.commons.math.complex.Complex complex15 = complex14.sqrt();
        org.apache.commons.math.complex.Complex complex16 = complex14.tanh();
        org.apache.commons.math.complex.Complex complex17 = complex10.multiply(complex16);
        org.apache.commons.math.complex.Complex complex18 = complex1.pow(complex16);
        org.apache.commons.math.complex.Complex complex19 = complex1.acos();
        org.apache.commons.math.complex.Complex complex20 = complex19.conjugate();
        org.apache.commons.math.complex.Complex complex23 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex24 = complex23.tanh();
        org.apache.commons.math.complex.Complex complex25 = complex23.tan();
        org.apache.commons.math.complex.Complex complex26 = complex20.add(complex25);
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex28 = complex27.atan();
        org.apache.commons.math.complex.Complex complex29 = complex28.cosh();
        org.apache.commons.math.complex.Complex complex30 = complex29.tanh();
        org.apache.commons.math.complex.Complex complex31 = complex30.sinh();
        org.apache.commons.math.complex.Complex complex32 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex33 = complex32.atan();
        org.apache.commons.math.complex.Complex complex34 = complex33.cosh();
        double double35 = complex34.getArgument();
        org.apache.commons.math.complex.Complex complex36 = complex31.divide(complex34);
        org.apache.commons.math.complex.Complex complex37 = complex31.log();
        org.apache.commons.math.complex.Complex complex38 = complex37.cos();
        org.apache.commons.math.complex.Complex complex39 = complex37.exp();
        org.apache.commons.math.complex.Complex complex40 = complex39.log();
        org.apache.commons.math.complex.Complex complex41 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex42 = complex41.atan();
        org.apache.commons.math.complex.Complex complex43 = complex42.sqrt();
        org.apache.commons.math.complex.Complex complex45 = complex43.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex46 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex47 = complex43.multiply(complex46);
        org.apache.commons.math.complex.Complex complex48 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex49 = complex48.atan();
        org.apache.commons.math.complex.Complex complex50 = complex49.cosh();
        org.apache.commons.math.complex.Complex complex51 = complex50.asin();
        org.apache.commons.math.complex.Complex complex52 = complex46.add(complex51);
        double double53 = complex52.getArgument();
        double double54 = complex52.abs();
        org.apache.commons.math.complex.Complex complex55 = complex40.multiply(complex52);
        org.apache.commons.math.complex.Complex complex56 = complex52.sqrt1z();
        org.apache.commons.math.complex.Complex complex57 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex58 = complex57.atan();
        org.apache.commons.math.complex.Complex complex59 = complex58.cosh();
        org.apache.commons.math.complex.Complex complex60 = complex59.tanh();
        org.apache.commons.math.complex.Complex complex61 = complex59.exp();
        boolean boolean62 = complex59.isNaN();
        org.apache.commons.math.complex.Complex complex63 = complex59.sqrt();
        double double64 = complex59.getImaginary();
        org.apache.commons.math.complex.Complex complex65 = complex59.asin();
        org.apache.commons.math.complex.Complex complex66 = complex56.subtract(complex65);
        org.apache.commons.math.complex.Complex complex67 = complex65.log();
        org.apache.commons.math.complex.Complex complex68 = complex65.negate();
        boolean boolean69 = complex26.equals((java.lang.Object) complex65);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex19 and complex20", complex19.equals(complex20) ? complex19.hashCode() == complex20.hashCode() : true);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex6 = complex2.multiply(complex5);
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex8 = complex7.atan();
        org.apache.commons.math.complex.Complex complex9 = complex8.cosh();
        org.apache.commons.math.complex.Complex complex10 = complex9.asin();
        org.apache.commons.math.complex.Complex complex11 = complex5.add(complex10);
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex13 = complex12.atan();
        org.apache.commons.math.complex.Complex complex14 = complex11.multiply(complex13);
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex16 = complex15.atan();
        org.apache.commons.math.complex.Complex complex17 = complex16.cosh();
        org.apache.commons.math.complex.Complex complex18 = complex14.multiply(complex17);
        org.apache.commons.math.complex.Complex complex19 = complex14.cosh();
        org.apache.commons.math.complex.Complex complex21 = complex14.multiply((-3.141592653589793d));
        org.apache.commons.math.complex.Complex complex22 = complex21.asin();
        java.lang.String str23 = complex21.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex22", complex0.equals(complex22) ? complex0.hashCode() == complex22.hashCode() : true);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex2 = complex1.atan();
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math.complex.Complex complex4 = complex3.asin();
        org.apache.commons.math.complex.ComplexField complexField5 = complex3.getField();
        java.util.List<org.apache.commons.math.complex.Complex> complexList7 = complex3.nthRoot(10);
        org.apache.commons.math.complex.Complex complex8 = complex0.divide(complex3);
        org.apache.commons.math.complex.Complex complex9 = complex0.acos();
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.atan();
        org.apache.commons.math.complex.Complex complex12 = complex11.cosh();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex14 = complex13.atan();
        org.apache.commons.math.complex.Complex complex15 = complex14.cosh();
        org.apache.commons.math.complex.Complex complex16 = complex15.tanh();
        org.apache.commons.math.complex.Complex complex17 = complex15.exp();
        org.apache.commons.math.complex.Complex complex18 = complex11.add(complex15);
        org.apache.commons.math.complex.Complex complex19 = complex18.sin();
        org.apache.commons.math.complex.Complex complex20 = complex0.add(complex19);
        org.apache.commons.math.complex.Complex complex22 = complex0.multiply((double) 1L);
        org.apache.commons.math.complex.ComplexField complexField23 = complex0.getField();
        org.apache.commons.math.complex.Complex complex24 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex25 = complex24.atan();
        org.apache.commons.math.complex.Complex complex26 = complex25.cosh();
        double double27 = complex26.getImaginary();
        boolean boolean28 = complex26.isNaN();
        org.apache.commons.math.complex.Complex complex29 = complex26.conjugate();
        org.apache.commons.math.complex.Complex complex30 = complex0.pow(complex29);
        boolean boolean32 = complex30.equals((java.lang.Object) (-3.141592653589793d));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex29", complex3.equals(complex29) ? complex3.hashCode() == complex29.hashCode() : true);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math.complex.Complex complex3 = complex1.cos();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex5 = complex4.atan();
        org.apache.commons.math.complex.Complex complex6 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex7 = complex6.asin();
        org.apache.commons.math.complex.Complex complex8 = complex7.tan();
        org.apache.commons.math.complex.Complex complex9 = complex3.pow(complex8);
        org.apache.commons.math.complex.Complex complex10 = complex9.acos();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex6", complex3.equals(complex6) ? complex3.hashCode() == complex6.hashCode() : true);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        double double8 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex9 = complex4.divide(complex7);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.atan();
        org.apache.commons.math.complex.Complex complex12 = complex11.sqrt();
        org.apache.commons.math.complex.Complex complex13 = complex11.tanh();
        org.apache.commons.math.complex.Complex complex14 = complex7.multiply(complex13);
        org.apache.commons.math.complex.Complex complex15 = complex13.exp();
        double double16 = complex13.abs();
        org.apache.commons.math.complex.Complex complex17 = complex13.atan();
        org.apache.commons.math.complex.Complex complex18 = complex13.conjugate();
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex20 = complex19.atan();
        org.apache.commons.math.complex.Complex complex21 = complex20.sqrt();
        org.apache.commons.math.complex.Complex complex23 = complex21.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex24 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex25 = complex21.multiply(complex24);
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex27 = complex26.atan();
        org.apache.commons.math.complex.Complex complex28 = complex27.cosh();
        org.apache.commons.math.complex.Complex complex29 = complex28.asin();
        org.apache.commons.math.complex.Complex complex30 = complex24.add(complex29);
        org.apache.commons.math.complex.Complex complex31 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex32 = complex31.atan();
        org.apache.commons.math.complex.Complex complex33 = complex30.multiply(complex32);
        org.apache.commons.math.complex.Complex complex34 = complex30.tanh();
        java.lang.String str35 = complex30.toString();
        org.apache.commons.math.complex.Complex complex36 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex37 = complex36.atan();
        org.apache.commons.math.complex.Complex complex38 = complex37.sqrt();
        org.apache.commons.math.complex.Complex complex40 = complex38.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex41 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex42 = complex38.multiply(complex41);
        org.apache.commons.math.complex.Complex complex43 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex44 = complex43.atan();
        org.apache.commons.math.complex.Complex complex45 = complex44.cosh();
        org.apache.commons.math.complex.Complex complex46 = complex45.tanh();
        org.apache.commons.math.complex.Complex complex47 = complex46.sinh();
        org.apache.commons.math.complex.Complex complex48 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex49 = complex48.atan();
        org.apache.commons.math.complex.Complex complex50 = complex49.cosh();
        double double51 = complex50.getArgument();
        org.apache.commons.math.complex.Complex complex52 = complex47.divide(complex50);
        java.lang.String str53 = complex52.toString();
        org.apache.commons.math.complex.Complex complex54 = complex52.sqrt1z();
        org.apache.commons.math.complex.Complex complex55 = complex54.tan();
        org.apache.commons.math.complex.Complex complex56 = complex38.add(complex55);
        org.apache.commons.math.complex.Complex complex57 = complex38.sqrt1z();
        org.apache.commons.math.complex.Complex complex58 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex59 = complex58.atan();
        org.apache.commons.math.complex.Complex complex60 = complex59.cosh();
        org.apache.commons.math.complex.Complex complex61 = complex60.tanh();
        org.apache.commons.math.complex.Complex complex62 = complex60.cosh();
        boolean boolean63 = complex60.isNaN();
        org.apache.commons.math.complex.Complex complex64 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex65 = complex64.sqrt1z();
        org.apache.commons.math.complex.Complex complex68 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex69 = complex68.tanh();
        org.apache.commons.math.complex.Complex complex70 = complex65.subtract(complex68);
        org.apache.commons.math.complex.Complex complex73 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex74 = complex65.pow(complex73);
        org.apache.commons.math.complex.Complex complex75 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex76 = complex75.atan();
        org.apache.commons.math.complex.Complex complex77 = complex76.sqrt();
        org.apache.commons.math.complex.Complex complex78 = complex76.tanh();
        org.apache.commons.math.complex.Complex complex79 = complex74.pow(complex76);
        org.apache.commons.math.complex.Complex complex80 = complex60.add(complex74);
        org.apache.commons.math.complex.Complex complex83 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex84 = complex60.multiply(complex83);
        org.apache.commons.math.complex.Complex complex85 = complex38.divide(complex60);
        org.apache.commons.math.complex.Complex complex86 = complex30.add(complex85);
        org.apache.commons.math.complex.Complex complex87 = complex18.divide(complex30);
        org.apache.commons.math.complex.Complex complex88 = complex87.sinh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex18", complex0.equals(complex18) ? complex0.hashCode() == complex18.hashCode() : true);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex2.exp();
        org.apache.commons.math.complex.Complex complex5 = complex2.exp();
        org.apache.commons.math.complex.Complex complex6 = complex5.sinh();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex8 = complex7.atan();
        org.apache.commons.math.complex.Complex complex9 = complex8.cosh();
        org.apache.commons.math.complex.Complex complex10 = complex9.tanh();
        org.apache.commons.math.complex.Complex complex11 = complex10.sinh();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex13 = complex12.atan();
        org.apache.commons.math.complex.Complex complex14 = complex13.cosh();
        double double15 = complex14.getArgument();
        org.apache.commons.math.complex.Complex complex16 = complex11.divide(complex14);
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex18 = complex17.atan();
        org.apache.commons.math.complex.Complex complex19 = complex18.sqrt();
        org.apache.commons.math.complex.Complex complex20 = complex18.tanh();
        org.apache.commons.math.complex.Complex complex21 = complex14.multiply(complex20);
        org.apache.commons.math.complex.Complex complex22 = complex20.cos();
        java.lang.String str23 = complex22.toString();
        org.apache.commons.math.complex.Complex complex24 = complex22.cosh();
        org.apache.commons.math.complex.Complex complex25 = complex22.exp();
        boolean boolean26 = complex6.equals((java.lang.Object) complex25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex22", complex2.equals(complex22) ? complex2.hashCode() == complex22.hashCode() : true);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        java.lang.String str4 = complex3.toString();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.atan();
        org.apache.commons.math.complex.Complex complex10 = complex9.cosh();
        org.apache.commons.math.complex.Complex complex11 = complex10.tanh();
        org.apache.commons.math.complex.Complex complex12 = complex10.exp();
        org.apache.commons.math.complex.Complex complex13 = complex6.add(complex10);
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex15 = complex14.atan();
        org.apache.commons.math.complex.Complex complex16 = complex15.cosh();
        org.apache.commons.math.complex.Complex complex17 = complex16.tanh();
        org.apache.commons.math.complex.Complex complex18 = complex17.sinh();
        boolean boolean19 = complex17.isInfinite();
        org.apache.commons.math.complex.Complex complex20 = complex6.subtract(complex17);
        org.apache.commons.math.complex.Complex complex21 = complex3.divide(complex20);
        org.apache.commons.math.complex.Complex complex22 = complex20.conjugate();
        org.apache.commons.math.complex.Complex complex23 = complex22.acos();
        org.apache.commons.math.complex.Complex complex24 = complex22.atan();
        org.apache.commons.math.complex.Complex complex25 = complex22.cosh();
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex28 = complex27.atan();
        org.apache.commons.math.complex.Complex complex29 = complex28.cosh();
        org.apache.commons.math.complex.Complex complex30 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex31 = complex30.atan();
        org.apache.commons.math.complex.Complex complex32 = complex31.cosh();
        org.apache.commons.math.complex.Complex complex33 = complex32.tanh();
        org.apache.commons.math.complex.Complex complex34 = complex32.exp();
        org.apache.commons.math.complex.Complex complex35 = complex28.add(complex32);
        org.apache.commons.math.complex.Complex complex36 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex37 = complex36.atan();
        org.apache.commons.math.complex.Complex complex38 = complex37.cosh();
        org.apache.commons.math.complex.Complex complex39 = complex38.tanh();
        org.apache.commons.math.complex.Complex complex40 = complex39.sinh();
        boolean boolean41 = complex39.isInfinite();
        org.apache.commons.math.complex.Complex complex42 = complex28.subtract(complex39);
        org.apache.commons.math.complex.Complex complex43 = complex26.add(complex28);
        org.apache.commons.math.complex.Complex complex44 = complex43.cos();
        org.apache.commons.math.complex.Complex complex45 = complex25.subtract(complex44);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex20 and complex22", complex20.equals(complex22) ? complex20.hashCode() == complex22.hashCode() : true);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        double double8 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex9 = complex4.divide(complex7);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.atan();
        org.apache.commons.math.complex.Complex complex12 = complex11.sqrt();
        org.apache.commons.math.complex.Complex complex13 = complex11.tanh();
        org.apache.commons.math.complex.Complex complex14 = complex7.multiply(complex13);
        org.apache.commons.math.complex.Complex complex15 = complex13.exp();
        double double16 = complex13.abs();
        org.apache.commons.math.complex.Complex complex17 = complex13.atan();
        org.apache.commons.math.complex.Complex complex18 = complex13.conjugate();
        double double19 = complex18.abs();
        double double20 = complex18.getArgument();
        org.apache.commons.math.complex.Complex complex21 = complex18.tan();
        java.lang.Class<?> wildcardClass22 = complex21.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex18", complex0.equals(complex18) ? complex0.hashCode() == complex18.hashCode() : true);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex3.cosh();
        org.apache.commons.math.complex.Complex complex5 = complex3.cos();
        org.apache.commons.math.complex.Complex complex6 = complex5.cos();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex8 = complex7.atan();
        org.apache.commons.math.complex.Complex complex9 = complex8.cosh();
        org.apache.commons.math.complex.Complex complex10 = complex9.tanh();
        org.apache.commons.math.complex.Complex complex11 = complex10.sinh();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex13 = complex12.atan();
        org.apache.commons.math.complex.Complex complex14 = complex13.cosh();
        double double15 = complex14.getArgument();
        org.apache.commons.math.complex.Complex complex16 = complex11.divide(complex14);
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex18 = complex17.atan();
        org.apache.commons.math.complex.Complex complex19 = complex18.cosh();
        org.apache.commons.math.complex.Complex complex20 = complex19.tanh();
        org.apache.commons.math.complex.Complex complex21 = complex20.sinh();
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex23 = complex22.atan();
        org.apache.commons.math.complex.Complex complex24 = complex23.cosh();
        double double25 = complex24.getArgument();
        org.apache.commons.math.complex.Complex complex26 = complex21.divide(complex24);
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex28 = complex27.atan();
        org.apache.commons.math.complex.Complex complex29 = complex28.sqrt();
        org.apache.commons.math.complex.Complex complex30 = complex28.tanh();
        org.apache.commons.math.complex.Complex complex31 = complex24.multiply(complex30);
        org.apache.commons.math.complex.Complex complex32 = complex24.tanh();
        org.apache.commons.math.complex.Complex complex33 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex34 = complex33.atan();
        org.apache.commons.math.complex.Complex complex35 = complex34.cosh();
        org.apache.commons.math.complex.Complex complex36 = complex35.tanh();
        org.apache.commons.math.complex.Complex complex37 = complex35.exp();
        org.apache.commons.math.complex.Complex complex38 = complex35.exp();
        org.apache.commons.math.complex.Complex complex39 = complex38.sqrt();
        org.apache.commons.math.complex.Complex complex40 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex41 = complex40.atan();
        org.apache.commons.math.complex.Complex complex42 = complex41.cosh();
        org.apache.commons.math.complex.Complex complex43 = complex42.tanh();
        org.apache.commons.math.complex.Complex complex44 = complex43.sinh();
        org.apache.commons.math.complex.Complex complex45 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex46 = complex45.atan();
        org.apache.commons.math.complex.Complex complex47 = complex46.cosh();
        double double48 = complex47.getArgument();
        org.apache.commons.math.complex.Complex complex49 = complex44.divide(complex47);
        java.lang.String str50 = complex49.toString();
        org.apache.commons.math.complex.Complex complex51 = complex49.sqrt1z();
        org.apache.commons.math.complex.Complex complex52 = complex51.tan();
        org.apache.commons.math.complex.Complex complex53 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean54 = complex53.isInfinite();
        org.apache.commons.math.complex.Complex complex55 = complex52.multiply(complex53);
        org.apache.commons.math.complex.Complex complex56 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex57 = complex56.sqrt1z();
        org.apache.commons.math.complex.Complex complex58 = complex52.add(complex56);
        org.apache.commons.math.complex.Complex complex59 = complex39.add(complex58);
        org.apache.commons.math.complex.Complex complex60 = complex32.multiply(complex58);
        org.apache.commons.math.complex.Complex complex61 = complex11.subtract(complex58);
        org.apache.commons.math.complex.Complex complex62 = complex61.negate();
        org.apache.commons.math.complex.Complex complex63 = complex61.atan();
        org.apache.commons.math.complex.Complex complex64 = complex61.conjugate();
        org.apache.commons.math.complex.Complex complex65 = complex5.add(complex64);
        org.apache.commons.math.complex.Complex complex67 = complex65.multiply(1.4487364907774045d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex61 and complex64", complex61.equals(complex64) ? complex61.hashCode() == complex64.hashCode() : true);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex4 = complex3.atan();
        org.apache.commons.math.complex.Complex complex5 = complex4.cosh();
        org.apache.commons.math.complex.Complex complex6 = complex5.tanh();
        org.apache.commons.math.complex.Complex complex7 = complex5.exp();
        org.apache.commons.math.complex.Complex complex8 = complex1.add(complex5);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex10 = complex9.atan();
        org.apache.commons.math.complex.Complex complex11 = complex10.cosh();
        org.apache.commons.math.complex.Complex complex12 = complex11.tanh();
        org.apache.commons.math.complex.Complex complex13 = complex12.sinh();
        boolean boolean14 = complex12.isInfinite();
        org.apache.commons.math.complex.Complex complex15 = complex1.subtract(complex12);
        org.apache.commons.math.complex.Complex complex17 = complex12.multiply(0.8373830985134536d);
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex19 = complex18.sqrt1z();
        org.apache.commons.math.complex.Complex complex22 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex23 = complex22.tanh();
        org.apache.commons.math.complex.Complex complex24 = complex19.subtract(complex22);
        org.apache.commons.math.complex.Complex complex25 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex26 = complex25.atan();
        org.apache.commons.math.complex.Complex complex27 = complex26.cosh();
        org.apache.commons.math.complex.Complex complex28 = complex27.tanh();
        org.apache.commons.math.complex.Complex complex29 = complex28.sinh();
        org.apache.commons.math.complex.Complex complex30 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex31 = complex30.atan();
        org.apache.commons.math.complex.Complex complex32 = complex31.cosh();
        double double33 = complex32.getArgument();
        org.apache.commons.math.complex.Complex complex34 = complex29.divide(complex32);
        org.apache.commons.math.complex.Complex complex35 = complex22.add(complex34);
        org.apache.commons.math.complex.Complex complex36 = complex35.exp();
        double double37 = complex35.abs();
        org.apache.commons.math.complex.Complex complex38 = complex17.divide(complex35);
        org.apache.commons.math.complex.Complex complex39 = complex38.atan();
        org.apache.commons.math.complex.Complex complex40 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex41 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex42 = complex41.atan();
        org.apache.commons.math.complex.Complex complex43 = complex42.cosh();
        org.apache.commons.math.complex.Complex complex44 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex45 = complex44.atan();
        org.apache.commons.math.complex.Complex complex46 = complex45.cosh();
        org.apache.commons.math.complex.Complex complex47 = complex46.tanh();
        org.apache.commons.math.complex.Complex complex48 = complex46.exp();
        org.apache.commons.math.complex.Complex complex49 = complex42.add(complex46);
        org.apache.commons.math.complex.Complex complex50 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex51 = complex50.atan();
        org.apache.commons.math.complex.Complex complex52 = complex51.cosh();
        org.apache.commons.math.complex.Complex complex53 = complex52.tanh();
        org.apache.commons.math.complex.Complex complex54 = complex53.sinh();
        boolean boolean55 = complex53.isInfinite();
        org.apache.commons.math.complex.Complex complex56 = complex42.subtract(complex53);
        org.apache.commons.math.complex.Complex complex57 = complex40.add(complex42);
        org.apache.commons.math.complex.Complex complex58 = complex38.pow(complex42);
        org.apache.commons.math.complex.Complex complex60 = complex42.multiply(0.6084594171064591d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex58", complex2.equals(complex58) ? complex2.hashCode() == complex58.hashCode() : true);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex5 = complex2.tan();
        java.lang.String str6 = complex5.toString();
        org.apache.commons.math.complex.Complex complex7 = complex5.cos();
        org.apache.commons.math.complex.Complex complex8 = complex5.sin();
        org.apache.commons.math.complex.Complex complex9 = complex5.tan();
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex12 = complex11.atan();
        org.apache.commons.math.complex.Complex complex13 = complex12.cosh();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex15 = complex14.atan();
        org.apache.commons.math.complex.Complex complex16 = complex15.cosh();
        org.apache.commons.math.complex.Complex complex17 = complex16.tanh();
        org.apache.commons.math.complex.Complex complex18 = complex16.exp();
        org.apache.commons.math.complex.Complex complex19 = complex12.add(complex16);
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex21 = complex20.atan();
        org.apache.commons.math.complex.Complex complex22 = complex21.cosh();
        org.apache.commons.math.complex.Complex complex23 = complex22.tanh();
        org.apache.commons.math.complex.Complex complex24 = complex23.sinh();
        boolean boolean25 = complex23.isInfinite();
        org.apache.commons.math.complex.Complex complex26 = complex12.subtract(complex23);
        org.apache.commons.math.complex.Complex complex27 = complex10.add(complex12);
        org.apache.commons.math.complex.Complex complex28 = complex27.tan();
        org.apache.commons.math.complex.Complex complex29 = complex28.tan();
        org.apache.commons.math.complex.Complex complex30 = complex28.tan();
        boolean boolean31 = complex5.equals((java.lang.Object) complex28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex7 and complex13", complex7.equals(complex13) ? complex7.hashCode() == complex13.hashCode() : true);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        java.util.List<org.apache.commons.math.complex.Complex> complexList5 = complex2.nthRoot((int) (short) 100);
        boolean boolean6 = complex2.isNaN();
        double double7 = complex2.getArgument();
        boolean boolean8 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex9 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex10 = complex2.acos();
        org.apache.commons.math.complex.Complex complex11 = complex2.sqrt1z();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex10", complex0.equals(complex10) ? complex0.hashCode() == complex10.hashCode() : true);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex4 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex5 = complex4.tanh();
        org.apache.commons.math.complex.Complex complex6 = complex1.subtract(complex4);
        double double7 = complex6.getImaginary();
        org.apache.commons.math.complex.Complex complex8 = complex6.asin();
        org.apache.commons.math.complex.Complex complex9 = complex6.cos();
        org.apache.commons.math.complex.Complex complex10 = complex9.conjugate();
        org.apache.commons.math.complex.Complex complex12 = complex10.multiply(0.0d);
        double double13 = complex10.getImaginary();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex12", complex0.equals(complex12) ? complex0.hashCode() == complex12.hashCode() : true);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        double double8 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex9 = complex4.divide(complex7);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.atan();
        org.apache.commons.math.complex.Complex complex12 = complex11.sqrt();
        org.apache.commons.math.complex.Complex complex13 = complex11.tanh();
        org.apache.commons.math.complex.Complex complex14 = complex7.multiply(complex13);
        org.apache.commons.math.complex.Complex complex15 = complex14.conjugate();
        org.apache.commons.math.complex.Complex complex16 = complex15.tanh();
        org.apache.commons.math.complex.Complex complex17 = complex15.log();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex16", complex0.equals(complex16) ? complex0.hashCode() == complex16.hashCode() : true);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        double double8 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex9 = complex4.divide(complex7);
        org.apache.commons.math.complex.Complex complex10 = complex4.log();
        org.apache.commons.math.complex.Complex complex11 = complex10.cos();
        org.apache.commons.math.complex.Complex complex12 = complex10.exp();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex14 = complex13.atan();
        org.apache.commons.math.complex.Complex complex15 = complex14.cosh();
        org.apache.commons.math.complex.Complex complex16 = complex15.asin();
        org.apache.commons.math.complex.ComplexField complexField17 = complex15.getField();
        org.apache.commons.math.complex.Complex complex18 = complex15.tanh();
        org.apache.commons.math.complex.Complex complex19 = complex15.log();
        org.apache.commons.math.complex.Complex complex20 = complex19.cosh();
        org.apache.commons.math.complex.Complex complex21 = complex10.multiply(complex19);
        boolean boolean22 = complex21.isInfinite();
        org.apache.commons.math.complex.Complex complex23 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex24 = complex23.atan();
        org.apache.commons.math.complex.Complex complex25 = complex24.cosh();
        org.apache.commons.math.complex.Complex complex26 = complex25.tanh();
        org.apache.commons.math.complex.Complex complex27 = complex26.sinh();
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex29 = complex28.atan();
        org.apache.commons.math.complex.Complex complex30 = complex29.cosh();
        double double31 = complex30.getArgument();
        org.apache.commons.math.complex.Complex complex32 = complex27.divide(complex30);
        java.lang.String str33 = complex32.toString();
        org.apache.commons.math.complex.Complex complex34 = complex32.sqrt1z();
        double double35 = complex32.getImaginary();
        org.apache.commons.math.complex.Complex complex36 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex37 = complex36.atan();
        org.apache.commons.math.complex.Complex complex38 = complex37.cosh();
        org.apache.commons.math.complex.Complex complex39 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex40 = complex39.atan();
        org.apache.commons.math.complex.Complex complex41 = complex40.cosh();
        org.apache.commons.math.complex.Complex complex42 = complex41.tanh();
        org.apache.commons.math.complex.Complex complex43 = complex41.exp();
        org.apache.commons.math.complex.Complex complex44 = complex37.add(complex41);
        org.apache.commons.math.complex.Complex complex45 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex46 = complex45.atan();
        org.apache.commons.math.complex.Complex complex47 = complex46.cosh();
        org.apache.commons.math.complex.Complex complex48 = complex47.tanh();
        org.apache.commons.math.complex.Complex complex49 = complex48.sinh();
        boolean boolean50 = complex48.isInfinite();
        org.apache.commons.math.complex.Complex complex51 = complex37.subtract(complex48);
        org.apache.commons.math.complex.Complex complex52 = complex32.add(complex48);
        org.apache.commons.math.complex.Complex complex53 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex54 = complex53.atan();
        org.apache.commons.math.complex.Complex complex55 = complex54.sqrt();
        org.apache.commons.math.complex.Complex complex57 = complex55.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex58 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex59 = complex55.multiply(complex58);
        org.apache.commons.math.complex.Complex complex60 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex61 = complex60.atan();
        org.apache.commons.math.complex.Complex complex62 = complex61.cosh();
        org.apache.commons.math.complex.Complex complex63 = complex62.asin();
        org.apache.commons.math.complex.Complex complex64 = complex58.add(complex63);
        org.apache.commons.math.complex.Complex complex65 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex66 = complex65.atan();
        org.apache.commons.math.complex.Complex complex67 = complex64.multiply(complex66);
        org.apache.commons.math.complex.Complex complex68 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex69 = complex68.atan();
        org.apache.commons.math.complex.Complex complex70 = complex69.cosh();
        org.apache.commons.math.complex.Complex complex71 = complex67.multiply(complex70);
        org.apache.commons.math.complex.Complex complex72 = complex71.atan();
        org.apache.commons.math.complex.Complex complex73 = complex52.subtract(complex72);
        org.apache.commons.math.complex.Complex complex74 = complex73.exp();
        org.apache.commons.math.complex.Complex complex75 = complex21.divide(complex73);
        org.apache.commons.math.complex.Complex complex76 = complex21.tan();
        org.apache.commons.math.complex.ComplexField complexField77 = complex76.getField();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex21", complex0.equals(complex21) ? complex0.hashCode() == complex21.hashCode() : true);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        double double8 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex9 = complex4.divide(complex7);
        org.apache.commons.math.complex.Complex complex10 = complex4.log();
        org.apache.commons.math.complex.Complex complex11 = complex10.cos();
        org.apache.commons.math.complex.Complex complex12 = complex10.exp();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex14 = complex13.atan();
        org.apache.commons.math.complex.Complex complex15 = complex14.cosh();
        org.apache.commons.math.complex.Complex complex16 = complex15.asin();
        org.apache.commons.math.complex.ComplexField complexField17 = complex15.getField();
        org.apache.commons.math.complex.Complex complex18 = complex15.tanh();
        org.apache.commons.math.complex.Complex complex19 = complex15.log();
        org.apache.commons.math.complex.Complex complex20 = complex19.cosh();
        org.apache.commons.math.complex.Complex complex21 = complex10.multiply(complex19);
        org.apache.commons.math.complex.Complex complex22 = complex21.tan();
        org.apache.commons.math.complex.Complex complex23 = complex21.asin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex22", complex0.equals(complex22) ? complex0.hashCode() == complex22.hashCode() : true);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex6 = complex2.multiply(complex5);
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex8 = complex7.atan();
        org.apache.commons.math.complex.Complex complex9 = complex8.cosh();
        org.apache.commons.math.complex.Complex complex10 = complex9.asin();
        org.apache.commons.math.complex.Complex complex11 = complex5.add(complex10);
        org.apache.commons.math.complex.Complex complex12 = complex11.conjugate();
        org.apache.commons.math.complex.Complex complex13 = complex12.conjugate();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex15 = complex14.atan();
        org.apache.commons.math.complex.Complex complex16 = complex15.cosh();
        org.apache.commons.math.complex.Complex complex17 = complex16.tanh();
        org.apache.commons.math.complex.Complex complex18 = complex17.sinh();
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex20 = complex19.atan();
        org.apache.commons.math.complex.Complex complex21 = complex20.cosh();
        double double22 = complex21.getArgument();
        org.apache.commons.math.complex.Complex complex23 = complex18.divide(complex21);
        org.apache.commons.math.complex.Complex complex24 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex25 = complex24.atan();
        org.apache.commons.math.complex.Complex complex26 = complex25.sqrt();
        org.apache.commons.math.complex.Complex complex27 = complex25.tanh();
        org.apache.commons.math.complex.Complex complex28 = complex21.multiply(complex27);
        org.apache.commons.math.complex.Complex complex29 = complex27.exp();
        double double30 = complex27.abs();
        org.apache.commons.math.complex.Complex complex31 = complex27.atan();
        org.apache.commons.math.complex.Complex complex32 = complex31.exp();
        org.apache.commons.math.complex.Complex complex33 = complex12.add(complex31);
        org.apache.commons.math.complex.Complex complex34 = complex31.cos();
        org.apache.commons.math.complex.Complex complex35 = complex31.sinh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex9 and complex34", complex9.equals(complex34) ? complex9.hashCode() == complex34.hashCode() : true);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        double double8 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex9 = complex4.divide(complex7);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.atan();
        org.apache.commons.math.complex.Complex complex12 = complex11.sqrt();
        org.apache.commons.math.complex.Complex complex13 = complex11.tanh();
        org.apache.commons.math.complex.Complex complex14 = complex7.multiply(complex13);
        org.apache.commons.math.complex.Complex complex15 = complex13.exp();
        double double16 = complex13.abs();
        org.apache.commons.math.complex.Complex complex17 = complex13.atan();
        org.apache.commons.math.complex.Complex complex18 = complex13.conjugate();
        double double19 = complex18.abs();
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex21 = complex20.atan();
        org.apache.commons.math.complex.Complex complex22 = complex21.sqrt();
        org.apache.commons.math.complex.Complex complex24 = complex22.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex25 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex26 = complex22.multiply(complex25);
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex28 = complex27.atan();
        org.apache.commons.math.complex.Complex complex29 = complex28.cosh();
        org.apache.commons.math.complex.Complex complex30 = complex29.asin();
        org.apache.commons.math.complex.Complex complex31 = complex25.add(complex30);
        org.apache.commons.math.complex.Complex complex32 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex33 = complex32.atan();
        org.apache.commons.math.complex.Complex complex34 = complex31.multiply(complex33);
        org.apache.commons.math.complex.Complex complex35 = complex31.tanh();
        java.lang.String str36 = complex31.toString();
        org.apache.commons.math.complex.Complex complex37 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex38 = complex37.atan();
        org.apache.commons.math.complex.Complex complex39 = complex38.sqrt();
        org.apache.commons.math.complex.Complex complex41 = complex39.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex42 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex43 = complex39.multiply(complex42);
        org.apache.commons.math.complex.Complex complex44 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex45 = complex44.atan();
        org.apache.commons.math.complex.Complex complex46 = complex45.cosh();
        org.apache.commons.math.complex.Complex complex47 = complex46.tanh();
        org.apache.commons.math.complex.Complex complex48 = complex47.sinh();
        org.apache.commons.math.complex.Complex complex49 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex50 = complex49.atan();
        org.apache.commons.math.complex.Complex complex51 = complex50.cosh();
        double double52 = complex51.getArgument();
        org.apache.commons.math.complex.Complex complex53 = complex48.divide(complex51);
        java.lang.String str54 = complex53.toString();
        org.apache.commons.math.complex.Complex complex55 = complex53.sqrt1z();
        org.apache.commons.math.complex.Complex complex56 = complex55.tan();
        org.apache.commons.math.complex.Complex complex57 = complex39.add(complex56);
        org.apache.commons.math.complex.Complex complex58 = complex39.sqrt1z();
        org.apache.commons.math.complex.Complex complex59 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex60 = complex59.atan();
        org.apache.commons.math.complex.Complex complex61 = complex60.cosh();
        org.apache.commons.math.complex.Complex complex62 = complex61.tanh();
        org.apache.commons.math.complex.Complex complex63 = complex61.cosh();
        boolean boolean64 = complex61.isNaN();
        org.apache.commons.math.complex.Complex complex65 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex66 = complex65.sqrt1z();
        org.apache.commons.math.complex.Complex complex69 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex70 = complex69.tanh();
        org.apache.commons.math.complex.Complex complex71 = complex66.subtract(complex69);
        org.apache.commons.math.complex.Complex complex74 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex75 = complex66.pow(complex74);
        org.apache.commons.math.complex.Complex complex76 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex77 = complex76.atan();
        org.apache.commons.math.complex.Complex complex78 = complex77.sqrt();
        org.apache.commons.math.complex.Complex complex79 = complex77.tanh();
        org.apache.commons.math.complex.Complex complex80 = complex75.pow(complex77);
        org.apache.commons.math.complex.Complex complex81 = complex61.add(complex75);
        org.apache.commons.math.complex.Complex complex84 = new org.apache.commons.math.complex.Complex((double) 0, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex85 = complex61.multiply(complex84);
        org.apache.commons.math.complex.Complex complex86 = complex39.divide(complex61);
        org.apache.commons.math.complex.Complex complex87 = complex31.add(complex86);
        org.apache.commons.math.complex.Complex complex88 = complex18.add(complex31);
        boolean boolean89 = complex88.isInfinite();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex18", complex0.equals(complex18) ? complex0.hashCode() == complex18.hashCode() : true);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.acos();
        double double3 = complex1.getArgument();
        org.apache.commons.math.complex.Complex complex4 = complex1.tan();
        org.apache.commons.math.complex.Complex complex5 = complex4.conjugate();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex7 = complex6.atan();
        org.apache.commons.math.complex.Complex complex8 = complex7.sqrt();
        org.apache.commons.math.complex.Complex complex10 = complex8.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex12 = complex8.multiply(complex11);
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex14 = complex13.atan();
        org.apache.commons.math.complex.Complex complex15 = complex14.cosh();
        org.apache.commons.math.complex.Complex complex16 = complex15.asin();
        org.apache.commons.math.complex.Complex complex17 = complex11.add(complex16);
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex19 = complex18.atan();
        org.apache.commons.math.complex.Complex complex20 = complex19.cosh();
        org.apache.commons.math.complex.Complex complex21 = complex20.asin();
        org.apache.commons.math.complex.Complex complex22 = complex21.sin();
        org.apache.commons.math.complex.Complex complex23 = complex21.asin();
        org.apache.commons.math.complex.Complex complex24 = complex23.conjugate();
        org.apache.commons.math.complex.Complex complex25 = complex17.divide(complex24);
        org.apache.commons.math.complex.Complex complex28 = new org.apache.commons.math.complex.Complex(0.8373830985134536d, 1.1102230246251565E-16d);
        org.apache.commons.math.complex.Complex complex29 = complex24.add(complex28);
        org.apache.commons.math.complex.Complex complex30 = complex28.sqrt();
        org.apache.commons.math.complex.Complex complex31 = complex28.tan();
        org.apache.commons.math.complex.Complex complex32 = complex5.multiply(complex28);
        java.lang.Class<?> wildcardClass33 = complex28.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex5", complex0.equals(complex5) ? complex0.hashCode() == complex5.hashCode() : true);
    }
}

