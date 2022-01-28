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
        org.apache.commons.math3.complex.Complex complex22 = complex21.atan();
        org.apache.commons.math3.complex.Complex complex24 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex25 = complex24.exp();
        double double26 = complex24.getArgument();
        org.apache.commons.math3.complex.Complex complex28 = complex24.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex29 = complex24.sin();
        org.apache.commons.math3.complex.Complex complex30 = complex24.cosh();
        org.apache.commons.math3.complex.Complex complex32 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double33 = complex32.getImaginary();
        boolean boolean34 = complex30.equals((java.lang.Object) double33);
        org.apache.commons.math3.complex.Complex complex35 = complex30.tanh();
        org.apache.commons.math3.complex.Complex complex36 = complex21.subtract(complex35);
        org.apache.commons.math3.complex.Complex complex37 = complex15.add(complex36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex4", complex3.equals(complex4) ? complex3.hashCode() == complex4.hashCode() : true);
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
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex5.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex9 = complex5.negate();
        boolean boolean10 = complex5.isInfinite();
        org.apache.commons.math3.complex.Complex complex12 = complex5.pow((double) (-1.0f));
        org.apache.commons.math3.complex.Complex complex14 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex16 = complex14.divide((double) (short) 100);
        org.apache.commons.math3.complex.Complex complex17 = complex5.divide(complex16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex12", complex1.equals(complex12) ? complex1.hashCode() == complex12.hashCode() : true);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex8 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex9 = complex8.exp();
        double double10 = complex8.getArgument();
        org.apache.commons.math3.complex.Complex complex11 = complex8.log();
        org.apache.commons.math3.complex.Complex complex12 = complex8.acos();
        org.apache.commons.math3.complex.Complex complex14 = complex12.add((double) 0L);
        org.apache.commons.math3.complex.Complex complex15 = complex6.multiply(complex12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex11 and complex14", complex11.equals(complex14) ? complex11.hashCode() == complex14.hashCode() : true);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex3.reciprocal();
        org.apache.commons.math3.complex.ComplexField complexField5 = complex3.getField();
        org.apache.commons.math3.complex.Complex complex6 = complex3.reciprocal();
        org.apache.commons.math3.complex.Complex complex8 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex9 = complex8.exp();
        double double10 = complex8.getArgument();
        org.apache.commons.math3.complex.Complex complex11 = complex8.log();
        org.apache.commons.math3.complex.Complex complex12 = complex8.log();
        org.apache.commons.math3.complex.Complex complex13 = complex8.acos();
        org.apache.commons.math3.complex.Complex complex15 = complex13.subtract((double) '#');
        org.apache.commons.math3.complex.Complex complex16 = complex13.asin();
        org.apache.commons.math3.complex.Complex complex17 = complex6.divide(complex13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex4", complex3.equals(complex4) ? complex3.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex7 = complex1.pow((double) 100.0f);
        org.apache.commons.math3.complex.Complex complex9 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex10 = complex9.sqrt();
        org.apache.commons.math3.complex.Complex complex11 = complex10.conjugate();
        org.apache.commons.math3.complex.Complex complex12 = complex1.add(complex10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex5 and complex11", complex5.equals(complex11) ? complex5.hashCode() == complex11.hashCode() : true);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.acos();
        org.apache.commons.math3.complex.Complex complex7 = complex5.add((double) 0L);
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex11 = complex9.subtract((double) (-1));
        org.apache.commons.math3.complex.Complex complex12 = complex7.add(complex11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex5", complex4.equals(complex5) ? complex4.hashCode() == complex5.hashCode() : true);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex6 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex8 = complex6.pow((-0.0d));
        org.apache.commons.math3.complex.Complex complex10 = complex6.pow((double) 0.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex8", complex1.equals(complex8) ? complex1.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex3.reciprocal();
        org.apache.commons.math3.complex.ComplexField complexField5 = complex3.getField();
        org.apache.commons.math3.complex.Complex complex6 = complex3.reciprocal();
        double double7 = complex3.abs();
        org.apache.commons.math3.complex.Complex complex8 = complex3.acos();
        org.apache.commons.math3.complex.Complex complex9 = complex8.sqrt();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex4", complex3.equals(complex4) ? complex3.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex6 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex8 = complex6.pow((-0.0d));
        org.apache.commons.math3.complex.Complex complex9 = complex8.negate();
        org.apache.commons.math3.complex.Complex complex10 = complex9.acos();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex8", complex1.equals(complex8) ? complex1.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex3.reciprocal();
        org.apache.commons.math3.complex.ComplexField complexField5 = complex3.getField();
        org.apache.commons.math3.complex.Complex complex6 = complex3.reciprocal();
        double double7 = complex3.abs();
        org.apache.commons.math3.complex.Complex complex8 = complex3.acos();
        org.apache.commons.math3.complex.Complex complex10 = complex3.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex11 = complex3.sin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex10", complex4.equals(complex10) ? complex4.hashCode() == complex10.hashCode() : true);
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
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex8 = complex7.exp();
        double double9 = complex7.getArgument();
        org.apache.commons.math3.complex.Complex complex10 = complex7.log();
        org.apache.commons.math3.complex.Complex complex11 = complex7.log();
        org.apache.commons.math3.complex.Complex complex12 = complex5.multiply(complex7);
        double double13 = complex7.abs();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex5", complex4.equals(complex5) ? complex4.hashCode() == complex5.hashCode() : true);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex3.reciprocal();
        org.apache.commons.math3.complex.ComplexField complexField5 = complex3.getField();
        org.apache.commons.math3.complex.Complex complex6 = complex3.reciprocal();
        org.apache.commons.math3.complex.Complex complex7 = complex3.log();
        org.apache.commons.math3.complex.Complex complex8 = complex7.reciprocal();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex4", complex3.equals(complex4) ? complex3.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex6 = complex1.acos();
        org.apache.commons.math3.complex.Complex complex8 = complex6.subtract((double) '#');
        org.apache.commons.math3.complex.Complex complex9 = complex6.asin();
        org.apache.commons.math3.complex.Complex complex10 = complex6.acos();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex9", complex4.equals(complex9) ? complex4.hashCode() == complex9.hashCode() : true);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex6 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex8 = complex6.pow((-0.0d));
        org.apache.commons.math3.complex.Complex complex10 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex11 = complex10.exp();
        double double12 = complex10.getArgument();
        org.apache.commons.math3.complex.Complex complex14 = complex10.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex16 = complex10.pow((double) 100.0f);
        org.apache.commons.math3.complex.Complex complex17 = complex16.sin();
        org.apache.commons.math3.complex.Complex complex18 = complex17.negate();
        org.apache.commons.math3.complex.Complex complex19 = complex18.sin();
        org.apache.commons.math3.complex.Complex complex20 = complex6.multiply(complex19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex8", complex1.equals(complex8) ? complex1.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex3.reciprocal();
        org.apache.commons.math3.complex.ComplexField complexField5 = complex3.getField();
        org.apache.commons.math3.complex.Complex complex6 = complex3.reciprocal();
        boolean boolean7 = complex6.isInfinite();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex4", complex3.equals(complex4) ? complex3.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex6 = complex1.acos();
        org.apache.commons.math3.complex.Complex complex7 = complex1.reciprocal();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex6", complex4.equals(complex6) ? complex4.hashCode() == complex6.hashCode() : true);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex7 = complex3.subtract(complex6);
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex10 = complex9.exp();
        org.apache.commons.math3.complex.Complex complex11 = complex9.tan();
        org.apache.commons.math3.complex.Complex complex13 = complex9.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex14 = complex9.cos();
        org.apache.commons.math3.complex.Complex complex15 = complex7.subtract(complex14);
        org.apache.commons.math3.complex.Complex complex16 = complex7.conjugate();
        double double17 = complex7.getImaginary();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex16", complex3.equals(complex16) ? complex3.hashCode() == complex16.hashCode() : true);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex2.exp();
        org.apache.commons.math3.complex.Complex complex5 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex6 = complex5.exp();
        double double7 = complex5.getArgument();
        org.apache.commons.math3.complex.Complex complex9 = complex5.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex11 = complex9.divide((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex13 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double14 = complex13.getImaginary();
        org.apache.commons.math3.complex.Complex complex15 = complex13.negate();
        org.apache.commons.math3.complex.Complex complex16 = complex15.reciprocal();
        org.apache.commons.math3.complex.Complex complex17 = complex11.divide(complex16);
        org.apache.commons.math3.complex.Complex complex18 = complex2.subtract(complex17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex15 and complex16", complex15.equals(complex16) ? complex15.hashCode() == complex16.hashCode() : true);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex6 = complex1.acos();
        org.apache.commons.math3.complex.Complex complex8 = complex6.subtract((double) '#');
        org.apache.commons.math3.complex.ComplexField complexField9 = complex8.getField();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex6", complex4.equals(complex6) ? complex4.hashCode() == complex6.hashCode() : true);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
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
        org.apache.commons.math3.complex.Complex complex33 = complex30.asin();
        java.lang.String str34 = complex30.toString();
        org.apache.commons.math3.complex.Complex complex35 = complex1.subtract(complex30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex5 and complex7", complex5.equals(complex7) ? complex5.hashCode() == complex7.hashCode() : true);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
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
        org.apache.commons.math3.complex.Complex complex41 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex42 = complex41.exp();
        double double43 = complex41.getArgument();
        org.apache.commons.math3.complex.Complex complex45 = complex41.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex46 = complex41.sin();
        org.apache.commons.math3.complex.Complex complex47 = complex41.conjugate();
        org.apache.commons.math3.complex.Complex complex48 = complex10.pow(complex41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex47", complex1.equals(complex47) ? complex1.hashCode() == complex47.hashCode() : true);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.acos();
        org.apache.commons.math3.complex.Complex complex7 = complex1.pow((double) (byte) -1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex5", complex4.equals(complex5) ? complex4.hashCode() == complex5.hashCode() : true);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex7 = complex5.divide((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double10 = complex9.getImaginary();
        org.apache.commons.math3.complex.Complex complex11 = complex9.negate();
        org.apache.commons.math3.complex.Complex complex12 = complex11.reciprocal();
        org.apache.commons.math3.complex.Complex complex13 = complex7.divide(complex12);
        boolean boolean14 = complex13.isInfinite();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex11 and complex12", complex11.equals(complex12) ? complex11.hashCode() == complex12.hashCode() : true);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.acos();
        org.apache.commons.math3.complex.Complex complex7 = complex5.add((double) 0L);
        org.apache.commons.math3.complex.Complex complex8 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex9 = complex8.negate();
        org.apache.commons.math3.complex.Complex complex10 = complex7.divide(complex9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex5", complex4.equals(complex5) ? complex4.hashCode() == complex5.hashCode() : true);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.sin();
        org.apache.commons.math3.complex.Complex complex7 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex8 = complex1.tanh();
        double double9 = complex8.getImaginary();
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double12 = complex11.getImaginary();
        org.apache.commons.math3.complex.Complex complex13 = complex11.negate();
        org.apache.commons.math3.complex.Complex complex14 = complex13.reciprocal();
        org.apache.commons.math3.complex.Complex complex16 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex17 = complex16.exp();
        double double18 = complex16.getArgument();
        org.apache.commons.math3.complex.Complex complex20 = complex16.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex21 = complex16.sin();
        org.apache.commons.math3.complex.Complex complex22 = complex16.cosh();
        org.apache.commons.math3.complex.Complex complex23 = complex16.tan();
        org.apache.commons.math3.complex.Complex complex24 = complex16.tan();
        org.apache.commons.math3.complex.Complex complex25 = complex13.add(complex24);
        org.apache.commons.math3.complex.Complex complex26 = complex8.multiply(complex25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex13 and complex14", complex13.equals(complex14) ? complex13.hashCode() == complex14.hashCode() : true);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.ComplexField complexField5 = complex1.getField();
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double8 = complex7.getImaginary();
        org.apache.commons.math3.complex.Complex complex9 = complex7.negate();
        org.apache.commons.math3.complex.Complex complex10 = complex9.reciprocal();
        org.apache.commons.math3.complex.ComplexField complexField11 = complex9.getField();
        org.apache.commons.math3.complex.Complex complex12 = complex9.reciprocal();
        org.apache.commons.math3.complex.Complex complex13 = complex1.subtract(complex9);
        org.apache.commons.math3.complex.Complex complex15 = complex1.multiply(Double.NaN);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex9 and complex10", complex9.equals(complex10) ? complex9.hashCode() == complex10.hashCode() : true);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex5.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex9 = complex5.negate();
        boolean boolean10 = complex5.isInfinite();
        org.apache.commons.math3.complex.Complex complex12 = complex5.pow((double) (-1.0f));
        org.apache.commons.math3.complex.Complex complex13 = complex12.cosh();
        org.apache.commons.math3.complex.Complex complex15 = complex13.divide((double) (-1));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex12", complex1.equals(complex12) ? complex1.hashCode() == complex12.hashCode() : true);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
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
        org.apache.commons.math3.complex.Complex complex32 = complex30.divide((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex34 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double35 = complex34.getImaginary();
        org.apache.commons.math3.complex.Complex complex36 = complex34.negate();
        org.apache.commons.math3.complex.Complex complex37 = complex36.reciprocal();
        org.apache.commons.math3.complex.Complex complex38 = complex32.divide(complex37);
        org.apache.commons.math3.complex.Complex complex39 = complex22.add(complex32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex36 and complex37", complex36.equals(complex37) ? complex36.hashCode() == complex37.hashCode() : true);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex6 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex8 = complex6.pow((-0.0d));
        double double9 = complex8.abs();
        org.apache.commons.math3.complex.Complex complex11 = complex8.subtract((double) (-1));
        org.apache.commons.math3.complex.Complex complex12 = complex11.sqrt1z();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex8", complex1.equals(complex8) ? complex1.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex6 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex7 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double10 = complex9.getImaginary();
        org.apache.commons.math3.complex.Complex complex11 = complex9.negate();
        org.apache.commons.math3.complex.Complex complex12 = complex11.reciprocal();
        org.apache.commons.math3.complex.ComplexField complexField13 = complex11.getField();
        org.apache.commons.math3.complex.Complex complex14 = complex11.reciprocal();
        org.apache.commons.math3.complex.Complex complex15 = complex11.log();
        org.apache.commons.math3.complex.Complex complex16 = complex1.pow(complex11);
        org.apache.commons.math3.complex.Complex complex18 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex19 = complex18.exp();
        double double20 = complex18.getArgument();
        org.apache.commons.math3.complex.Complex complex21 = complex18.log();
        org.apache.commons.math3.complex.Complex complex22 = complex18.log();
        org.apache.commons.math3.complex.Complex complex24 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex25 = complex24.exp();
        double double26 = complex24.getArgument();
        org.apache.commons.math3.complex.Complex complex27 = complex24.log();
        org.apache.commons.math3.complex.Complex complex28 = complex22.subtract(complex27);
        org.apache.commons.math3.complex.Complex complex29 = complex22.negate();
        org.apache.commons.math3.complex.Complex complex30 = complex1.add(complex29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex5 and complex16", complex5.equals(complex16) ? complex5.hashCode() == complex16.hashCode() : true);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex7 = complex5.divide((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double10 = complex9.getImaginary();
        org.apache.commons.math3.complex.Complex complex11 = complex9.negate();
        org.apache.commons.math3.complex.Complex complex12 = complex11.reciprocal();
        org.apache.commons.math3.complex.Complex complex13 = complex7.divide(complex12);
        org.apache.commons.math3.complex.Complex complex15 = complex7.add((double) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex11 and complex12", complex11.equals(complex12) ? complex11.hashCode() == complex12.hashCode() : true);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex7 = complex5.divide((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double10 = complex9.getImaginary();
        org.apache.commons.math3.complex.Complex complex11 = complex9.negate();
        org.apache.commons.math3.complex.Complex complex12 = complex11.reciprocal();
        org.apache.commons.math3.complex.Complex complex13 = complex7.divide(complex12);
        org.apache.commons.math3.complex.Complex complex14 = complex7.exp();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex11 and complex12", complex11.equals(complex12) ? complex11.hashCode() == complex12.hashCode() : true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex3.reciprocal();
        org.apache.commons.math3.complex.ComplexField complexField5 = complex3.getField();
        org.apache.commons.math3.complex.Complex complex6 = complex3.reciprocal();
        org.apache.commons.math3.complex.Complex complex7 = complex3.log();
        double double8 = complex7.abs();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex4", complex3.equals(complex4) ? complex3.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex6 = complex1.acos();
        org.apache.commons.math3.complex.Complex complex8 = complex6.subtract((double) '#');
        org.apache.commons.math3.complex.Complex complex9 = complex6.asin();
        org.apache.commons.math3.complex.Complex complex11 = complex6.multiply((int) (short) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex9", complex4.equals(complex9) ? complex4.hashCode() == complex9.hashCode() : true);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math3.complex.Complex complex3 = complex2.conjugate();
        org.apache.commons.math3.complex.Complex complex4 = complex2.log();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex3", complex1.equals(complex3) ? complex1.hashCode() == complex3.hashCode() : true);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex3.reciprocal();
        org.apache.commons.math3.complex.ComplexField complexField5 = complex3.getField();
        org.apache.commons.math3.complex.Complex complex6 = complex3.reciprocal();
        org.apache.commons.math3.complex.Complex complex7 = complex6.cos();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex4", complex3.equals(complex4) ? complex3.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
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
        double double16 = complex3.getReal();
        org.apache.commons.math3.complex.Complex complex17 = complex3.tanh();
        org.apache.commons.math3.complex.Complex complex19 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex20 = complex19.exp();
        org.apache.commons.math3.complex.Complex complex21 = complex19.tanh();
        org.apache.commons.math3.complex.Complex complex22 = complex3.pow(complex21);
        boolean boolean23 = complex21.isInfinite();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex4", complex3.equals(complex4) ? complex3.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
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
        double double16 = complex3.getReal();
        org.apache.commons.math3.complex.Complex complex17 = complex3.tanh();
        org.apache.commons.math3.complex.Complex complex19 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex20 = complex19.exp();
        org.apache.commons.math3.complex.Complex complex21 = complex19.tanh();
        org.apache.commons.math3.complex.Complex complex22 = complex3.pow(complex21);
        org.apache.commons.math3.complex.Complex complex24 = complex22.divide(0.21460183660255172d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex4", complex3.equals(complex4) ? complex3.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex3.reciprocal();
        org.apache.commons.math3.complex.ComplexField complexField5 = complex3.getField();
        org.apache.commons.math3.complex.Complex complex6 = complex3.reciprocal();
        double double7 = complex3.abs();
        org.apache.commons.math3.complex.Complex complex8 = complex3.cos();
        org.apache.commons.math3.complex.Complex complex9 = complex8.cosh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex4", complex3.equals(complex4) ? complex3.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex6 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex8 = complex6.pow((-0.0d));
        org.apache.commons.math3.complex.Complex complex9 = complex8.negate();
        org.apache.commons.math3.complex.ComplexField complexField10 = complex9.getField();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex8", complex1.equals(complex8) ? complex1.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) '#');
        double double6 = complex1.getReal();
        org.apache.commons.math3.complex.Complex complex7 = complex1.atan();
        org.apache.commons.math3.complex.Complex complex8 = complex1.sqrt1z();
        org.apache.commons.math3.complex.Complex complex9 = complex1.reciprocal();
        org.apache.commons.math3.complex.Complex complex10 = complex9.sqrt();
        org.apache.commons.math3.complex.Complex complex11 = complex9.sin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex10", complex1.equals(complex10) ? complex1.hashCode() == complex10.hashCode() : true);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex7 = complex5.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex8 = complex7.exp();
        java.lang.String str9 = complex7.toString();
        org.apache.commons.math3.complex.Complex complex10 = complex7.cos();
        org.apache.commons.math3.complex.Complex complex11 = complex7.sqrt();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex10", complex1.equals(complex10) ? complex1.hashCode() == complex10.hashCode() : true);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.sin();
        org.apache.commons.math3.complex.Complex complex7 = complex1.conjugate();
        org.apache.commons.math3.complex.Complex complex8 = complex1.cos();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex5 and complex7", complex5.equals(complex7) ? complex5.hashCode() == complex7.hashCode() : true);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex5 = complex1.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex6 = complex1.cos();
        org.apache.commons.math3.complex.Complex complex7 = complex1.conjugate();
        org.apache.commons.math3.complex.Complex complex8 = complex1.sin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex5 and complex7", complex5.equals(complex7) ? complex5.hashCode() == complex7.hashCode() : true);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex6 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex8 = complex6.pow((-0.0d));
        org.apache.commons.math3.complex.Complex complex9 = complex6.reciprocal();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex8", complex1.equals(complex8) ? complex1.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.acos();
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex8 = complex7.exp();
        double double9 = complex7.getArgument();
        org.apache.commons.math3.complex.Complex complex10 = complex7.log();
        org.apache.commons.math3.complex.Complex complex11 = complex7.log();
        org.apache.commons.math3.complex.Complex complex12 = complex5.multiply(complex7);
        double double13 = complex7.getReal();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex5", complex4.equals(complex5) ? complex4.hashCode() == complex5.hashCode() : true);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex5 = complex1.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex6 = complex1.cos();
        org.apache.commons.math3.complex.Complex complex7 = complex1.conjugate();
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex10 = complex9.exp();
        double double11 = complex9.getArgument();
        org.apache.commons.math3.complex.Complex complex12 = complex9.log();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList14 = complex12.nthRoot((int) 'a');
        org.apache.commons.math3.complex.Complex complex15 = complex12.exp();
        org.apache.commons.math3.complex.Complex complex17 = complex12.pow(35.0d);
        org.apache.commons.math3.complex.Complex complex19 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double20 = complex19.getImaginary();
        org.apache.commons.math3.complex.Complex complex21 = complex19.negate();
        org.apache.commons.math3.complex.Complex complex23 = complex21.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex24 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex25 = complex21.subtract(complex24);
        org.apache.commons.math3.complex.Complex complex27 = complex21.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex28 = complex17.divide(complex21);
        org.apache.commons.math3.complex.Complex complex29 = complex1.divide(complex21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex5 and complex7", complex5.equals(complex7) ? complex5.hashCode() == complex7.hashCode() : true);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.ComplexField complexField5 = complex1.getField();
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double8 = complex7.getImaginary();
        org.apache.commons.math3.complex.Complex complex9 = complex7.negate();
        org.apache.commons.math3.complex.Complex complex10 = complex9.reciprocal();
        org.apache.commons.math3.complex.ComplexField complexField11 = complex9.getField();
        org.apache.commons.math3.complex.Complex complex12 = complex9.reciprocal();
        org.apache.commons.math3.complex.Complex complex13 = complex1.subtract(complex9);
        org.apache.commons.math3.complex.Complex complex15 = complex13.add((double) (-1.0f));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex9 and complex10", complex9.equals(complex10) ? complex9.hashCode() == complex10.hashCode() : true);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex3.reciprocal();
        org.apache.commons.math3.complex.ComplexField complexField5 = complex3.getField();
        org.apache.commons.math3.complex.Complex complex6 = complex3.reciprocal();
        double double7 = complex6.getArgument();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex4", complex3.equals(complex4) ? complex3.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex7 = complex3.subtract(complex6);
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex10 = complex9.exp();
        org.apache.commons.math3.complex.Complex complex11 = complex9.tan();
        org.apache.commons.math3.complex.Complex complex13 = complex9.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex14 = complex9.cos();
        org.apache.commons.math3.complex.Complex complex15 = complex7.subtract(complex14);
        org.apache.commons.math3.complex.Complex complex16 = complex7.conjugate();
        org.apache.commons.math3.complex.Complex complex18 = complex7.pow((double) (byte) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex16", complex3.equals(complex16) ? complex3.hashCode() == complex16.hashCode() : true);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex6 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex8 = complex6.pow((-0.0d));
        double double9 = complex8.abs();
        org.apache.commons.math3.complex.Complex complex10 = complex8.sinh();
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex12 = complex11.exp();
        org.apache.commons.math3.complex.Complex complex13 = complex12.exp();
        java.lang.String str14 = complex13.toString();
        boolean boolean15 = complex10.equals((java.lang.Object) complex13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex8", complex1.equals(complex8) ? complex1.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList6 = complex4.nthRoot((int) 'a');
        org.apache.commons.math3.complex.Complex complex7 = complex4.exp();
        org.apache.commons.math3.complex.Complex complex9 = complex4.pow(35.0d);
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double12 = complex11.getImaginary();
        org.apache.commons.math3.complex.Complex complex13 = complex11.negate();
        org.apache.commons.math3.complex.Complex complex15 = complex13.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex16 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex17 = complex13.subtract(complex16);
        org.apache.commons.math3.complex.Complex complex19 = complex13.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex20 = complex9.divide(complex13);
        org.apache.commons.math3.complex.Complex complex22 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex23 = complex22.exp();
        double double24 = complex22.getArgument();
        org.apache.commons.math3.complex.Complex complex26 = complex22.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex27 = complex22.exp();
        org.apache.commons.math3.complex.Complex complex28 = complex22.acos();
        org.apache.commons.math3.complex.Complex complex29 = complex20.add(complex22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex28", complex4.equals(complex28) ? complex4.hashCode() == complex28.hashCode() : true);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
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
        double double16 = complex3.getReal();
        org.apache.commons.math3.complex.Complex complex17 = complex3.tanh();
        org.apache.commons.math3.complex.Complex complex18 = complex17.tanh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex4", complex3.equals(complex4) ? complex3.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex6 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex7 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double10 = complex9.getImaginary();
        org.apache.commons.math3.complex.Complex complex11 = complex9.negate();
        org.apache.commons.math3.complex.Complex complex12 = complex11.reciprocal();
        org.apache.commons.math3.complex.ComplexField complexField13 = complex11.getField();
        org.apache.commons.math3.complex.Complex complex14 = complex11.reciprocal();
        org.apache.commons.math3.complex.Complex complex15 = complex11.log();
        org.apache.commons.math3.complex.Complex complex16 = complex1.pow(complex11);
        org.apache.commons.math3.complex.Complex complex17 = complex16.sin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex11 and complex12", complex11.equals(complex12) ? complex11.hashCode() == complex12.hashCode() : true);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex7 = complex3.subtract(complex6);
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex10 = complex9.exp();
        org.apache.commons.math3.complex.Complex complex11 = complex9.tan();
        org.apache.commons.math3.complex.Complex complex13 = complex9.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex14 = complex9.cos();
        org.apache.commons.math3.complex.Complex complex15 = complex7.subtract(complex14);
        org.apache.commons.math3.complex.Complex complex16 = complex7.conjugate();
        org.apache.commons.math3.complex.Complex complex18 = complex7.subtract((-3.141592653589793d));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex16", complex3.equals(complex16) ? complex3.hashCode() == complex16.hashCode() : true);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex7 = complex1.sqrt1z();
        org.apache.commons.math3.complex.Complex complex8 = complex1.acos();
        org.apache.commons.math3.complex.Complex complex10 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double11 = complex10.getImaginary();
        org.apache.commons.math3.complex.Complex complex13 = complex10.pow((double) 100L);
        org.apache.commons.math3.complex.Complex complex14 = complex1.subtract(complex13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex7 and complex8", complex7.equals(complex8) ? complex7.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex7 = complex3.subtract(complex6);
        org.apache.commons.math3.complex.Complex complex8 = complex3.acos();
        org.apache.commons.math3.complex.Complex complex9 = complex3.negate();
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex13 = complex11.subtract((double) (-1));
        org.apache.commons.math3.complex.Complex complex15 = complex11.multiply((double) 10L);
        boolean boolean16 = complex9.equals((java.lang.Object) complex15);
        org.apache.commons.math3.complex.Complex complex18 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex19 = complex18.exp();
        double double20 = complex18.getArgument();
        org.apache.commons.math3.complex.Complex complex22 = complex18.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex23 = complex18.exp();
        org.apache.commons.math3.complex.Complex complex24 = complex18.acos();
        org.apache.commons.math3.complex.Complex complex26 = complex18.pow((double) 100L);
        org.apache.commons.math3.complex.Complex complex28 = complex18.multiply((double) (-1.0f));
        org.apache.commons.math3.complex.Complex complex29 = complex9.add(complex28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex6 and complex24", complex6.equals(complex24) ? complex6.hashCode() == complex24.hashCode() : true);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex5 = complex1.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex6 = complex1.cos();
        boolean boolean7 = complex1.isNaN();
        org.apache.commons.math3.complex.Complex complex8 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex9 = complex1.asin();
        org.apache.commons.math3.complex.Complex complex10 = complex9.sin();
        double double11 = complex9.getReal();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex10", complex1.equals(complex10) ? complex1.hashCode() == complex10.hashCode() : true);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex7 = complex3.subtract(complex6);
        org.apache.commons.math3.complex.Complex complex8 = complex3.asin();
        double double9 = complex3.abs();
        org.apache.commons.math3.complex.Complex complex11 = complex3.subtract((-2.0d));
        org.apache.commons.math3.complex.Complex complex13 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex14 = complex13.exp();
        double double15 = complex13.getArgument();
        org.apache.commons.math3.complex.Complex complex17 = complex13.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex18 = complex13.exp();
        org.apache.commons.math3.complex.Complex complex19 = complex11.multiply(complex13);
        org.apache.commons.math3.complex.Complex complex21 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex22 = complex21.exp();
        double double23 = complex21.getArgument();
        org.apache.commons.math3.complex.Complex complex24 = complex21.log();
        org.apache.commons.math3.complex.Complex complex25 = complex21.log();
        org.apache.commons.math3.complex.Complex complex26 = complex21.sqrt1z();
        org.apache.commons.math3.complex.Complex complex28 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex29 = complex28.exp();
        double double30 = complex28.getArgument();
        org.apache.commons.math3.complex.Complex complex32 = complex28.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex33 = complex28.sin();
        org.apache.commons.math3.complex.Complex complex34 = complex28.cosh();
        org.apache.commons.math3.complex.Complex complex35 = complex28.tan();
        org.apache.commons.math3.complex.Complex complex36 = complex28.tan();
        org.apache.commons.math3.complex.Complex complex38 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex39 = complex38.exp();
        double double40 = complex38.getArgument();
        org.apache.commons.math3.complex.Complex complex42 = complex38.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex43 = complex38.sin();
        org.apache.commons.math3.complex.Complex complex44 = complex38.cosh();
        org.apache.commons.math3.complex.Complex complex45 = complex38.tan();
        org.apache.commons.math3.complex.Complex complex46 = complex38.tan();
        org.apache.commons.math3.complex.Complex complex48 = complex38.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex49 = complex36.subtract(complex38);
        org.apache.commons.math3.complex.Complex complex50 = complex49.tanh();
        org.apache.commons.math3.complex.Complex complex51 = complex26.divide(complex49);
        org.apache.commons.math3.complex.Complex complex52 = complex49.exp();
        org.apache.commons.math3.complex.Complex complex54 = complex49.subtract((double) '#');
        org.apache.commons.math3.complex.Complex complex55 = complex19.add(complex49);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex11", complex1.equals(complex11) ? complex1.hashCode() == complex11.hashCode() : true);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math3.complex.Complex complex3 = complex1.sqrt();
        org.apache.commons.math3.complex.Complex complex4 = complex3.acos();
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex7 = complex6.exp();
        double double8 = complex6.getArgument();
        org.apache.commons.math3.complex.Complex complex9 = complex6.log();
        org.apache.commons.math3.complex.Complex complex10 = complex6.acos();
        org.apache.commons.math3.complex.Complex complex12 = complex10.add((double) 0L);
        org.apache.commons.math3.complex.Complex complex13 = complex3.divide(complex12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex9", complex4.equals(complex9) ? complex4.hashCode() == complex9.hashCode() : true);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
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
        org.apache.commons.math3.complex.Complex complex15 = complex14.cos();
        org.apache.commons.math3.complex.Complex complex16 = complex15.cos();
        org.apache.commons.math3.complex.Complex complex17 = complex16.conjugate();
        org.apache.commons.math3.complex.Complex complex18 = complex17.tanh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex16", complex1.equals(complex16) ? complex1.hashCode() == complex16.hashCode() : true);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex7 = complex5.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex8 = complex7.cos();
        org.apache.commons.math3.complex.Complex complex9 = complex7.asin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex8", complex1.equals(complex8) ? complex1.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex6 = complex1.acos();
        org.apache.commons.math3.complex.Complex complex8 = complex6.subtract((double) '#');
        org.apache.commons.math3.complex.Complex complex9 = complex6.asin();
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex12 = complex11.exp();
        org.apache.commons.math3.complex.Complex complex13 = complex11.tanh();
        org.apache.commons.math3.complex.Complex complex14 = complex13.log();
        org.apache.commons.math3.complex.Complex complex15 = complex13.acos();
        org.apache.commons.math3.complex.Complex complex16 = complex15.reciprocal();
        org.apache.commons.math3.complex.Complex complex17 = complex15.exp();
        org.apache.commons.math3.complex.Complex complex18 = complex6.add(complex15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex9", complex4.equals(complex9) ? complex4.hashCode() == complex9.hashCode() : true);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex5.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex9 = complex5.negate();
        boolean boolean10 = complex5.isInfinite();
        org.apache.commons.math3.complex.Complex complex12 = complex5.pow((double) (-1.0f));
        org.apache.commons.math3.complex.Complex complex13 = complex12.cosh();
        org.apache.commons.math3.complex.Complex complex15 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex16 = complex15.exp();
        double double17 = complex15.getArgument();
        org.apache.commons.math3.complex.Complex complex18 = complex15.log();
        org.apache.commons.math3.complex.Complex complex19 = complex18.log();
        org.apache.commons.math3.complex.Complex complex21 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex22 = complex21.exp();
        double double23 = complex21.getArgument();
        org.apache.commons.math3.complex.Complex complex25 = complex21.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex26 = complex21.sin();
        org.apache.commons.math3.complex.Complex complex27 = complex21.cosh();
        org.apache.commons.math3.complex.Complex complex28 = complex21.tanh();
        org.apache.commons.math3.complex.Complex complex29 = complex21.log();
        org.apache.commons.math3.complex.Complex complex30 = complex19.multiply(complex21);
        org.apache.commons.math3.complex.Complex complex31 = complex30.negate();
        org.apache.commons.math3.complex.Complex complex32 = complex13.multiply(complex30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex12", complex1.equals(complex12) ? complex1.hashCode() == complex12.hashCode() : true);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.acos();
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex8 = complex7.exp();
        double double9 = complex7.getArgument();
        org.apache.commons.math3.complex.Complex complex10 = complex7.log();
        org.apache.commons.math3.complex.Complex complex11 = complex7.log();
        org.apache.commons.math3.complex.Complex complex12 = complex7.sqrt1z();
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
        org.apache.commons.math3.complex.Complex complex36 = complex35.tanh();
        org.apache.commons.math3.complex.Complex complex37 = complex12.divide(complex35);
        org.apache.commons.math3.complex.Complex complex38 = complex35.exp();
        boolean boolean39 = complex5.equals((java.lang.Object) complex35);
        org.apache.commons.math3.complex.Complex complex41 = complex5.subtract(0.5403023058681398d);
        org.apache.commons.math3.complex.Complex complex44 = new org.apache.commons.math3.complex.Complex(Double.NaN, (double) 0);
        org.apache.commons.math3.complex.Complex complex45 = complex41.pow(complex44);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex5", complex4.equals(complex5) ? complex4.hashCode() == complex5.hashCode() : true);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex7 = complex5.divide((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double10 = complex9.getImaginary();
        org.apache.commons.math3.complex.Complex complex11 = complex9.negate();
        org.apache.commons.math3.complex.Complex complex12 = complex11.reciprocal();
        org.apache.commons.math3.complex.Complex complex13 = complex7.divide(complex12);
        org.apache.commons.math3.complex.Complex complex15 = complex12.subtract((double) 'a');
        org.apache.commons.math3.complex.Complex complex17 = complex15.multiply((double) 10L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex11 and complex12", complex11.equals(complex12) ? complex11.hashCode() == complex12.hashCode() : true);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex7 = complex5.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex8 = complex7.cos();
        org.apache.commons.math3.complex.Complex complex10 = complex7.pow((double) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex8", complex1.equals(complex8) ? complex1.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((double) ' ', (double) 1L);
        org.apache.commons.math3.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math3.complex.Complex complex5 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex6 = complex5.exp();
        double double7 = complex5.getArgument();
        org.apache.commons.math3.complex.Complex complex9 = complex5.pow((double) '#');
        double double10 = complex5.getReal();
        org.apache.commons.math3.complex.Complex complex11 = complex5.atan();
        org.apache.commons.math3.complex.Complex complex12 = complex5.sqrt1z();
        org.apache.commons.math3.complex.Complex complex13 = complex5.reciprocal();
        org.apache.commons.math3.complex.Complex complex14 = complex13.sqrt();
        org.apache.commons.math3.complex.Complex complex15 = complex3.divide(complex13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex5 and complex14", complex5.equals(complex14) ? complex5.hashCode() == complex14.hashCode() : true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex6 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex7 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double10 = complex9.getImaginary();
        org.apache.commons.math3.complex.Complex complex11 = complex9.negate();
        org.apache.commons.math3.complex.Complex complex12 = complex11.reciprocal();
        org.apache.commons.math3.complex.ComplexField complexField13 = complex11.getField();
        org.apache.commons.math3.complex.Complex complex14 = complex11.reciprocal();
        org.apache.commons.math3.complex.Complex complex15 = complex11.log();
        org.apache.commons.math3.complex.Complex complex16 = complex1.pow(complex11);
        org.apache.commons.math3.complex.Complex complex18 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex19 = complex18.exp();
        org.apache.commons.math3.complex.Complex complex20 = complex18.tanh();
        org.apache.commons.math3.complex.Complex complex21 = complex20.log();
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
        org.apache.commons.math3.complex.Complex complex61 = complex32.subtract(complex58);
        org.apache.commons.math3.complex.Complex complex62 = complex20.divide(complex61);
        org.apache.commons.math3.complex.Complex complex63 = complex62.sqrt1z();
        org.apache.commons.math3.complex.Complex complex64 = complex16.multiply(complex63);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex11 and complex12", complex11.equals(complex12) ? complex11.hashCode() == complex12.hashCode() : true);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex7 = complex1.pow((double) 100.0f);
        org.apache.commons.math3.complex.Complex complex8 = complex7.sin();
        org.apache.commons.math3.complex.Complex complex10 = complex8.subtract((double) 1);
        org.apache.commons.math3.complex.Complex complex12 = complex10.multiply(0.0d);
        org.apache.commons.math3.complex.Complex complex14 = complex10.multiply(0);
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
        org.apache.commons.math3.complex.Complex complex29 = complex20.cos();
        boolean boolean30 = complex29.isInfinite();
        org.apache.commons.math3.complex.Complex complex31 = complex14.pow(complex29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex12 and complex28", complex12.equals(complex28) ? complex12.hashCode() == complex28.hashCode() : true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((double) (short) -1, (-3.141592653589793d));
        boolean boolean3 = complex2.isInfinite();
        org.apache.commons.math3.complex.Complex complex5 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex6 = complex5.exp();
        double double7 = complex5.getArgument();
        org.apache.commons.math3.complex.Complex complex8 = complex5.log();
        org.apache.commons.math3.complex.Complex complex9 = complex5.acos();
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex12 = complex11.exp();
        double double13 = complex11.getArgument();
        org.apache.commons.math3.complex.Complex complex14 = complex11.log();
        org.apache.commons.math3.complex.Complex complex15 = complex11.log();
        org.apache.commons.math3.complex.Complex complex16 = complex11.sqrt1z();
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
        org.apache.commons.math3.complex.Complex complex40 = complex39.tanh();
        org.apache.commons.math3.complex.Complex complex41 = complex16.divide(complex39);
        org.apache.commons.math3.complex.Complex complex42 = complex39.exp();
        boolean boolean43 = complex9.equals((java.lang.Object) complex39);
        org.apache.commons.math3.complex.Complex complex44 = complex2.add(complex39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex8 and complex9", complex8.equals(complex9) ? complex8.hashCode() == complex9.hashCode() : true);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex3 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex3.exp();
        double double5 = complex3.getArgument();
        org.apache.commons.math3.complex.Complex complex6 = complex3.log();
        org.apache.commons.math3.complex.Complex complex7 = complex3.acos();
        org.apache.commons.math3.complex.Complex complex8 = complex1.subtract(complex3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex6 and complex7", complex6.equals(complex7) ? complex6.hashCode() == complex7.hashCode() : true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex7 = complex3.subtract(complex6);
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex10 = complex9.exp();
        org.apache.commons.math3.complex.Complex complex11 = complex9.tan();
        org.apache.commons.math3.complex.Complex complex13 = complex9.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex14 = complex9.cos();
        org.apache.commons.math3.complex.Complex complex15 = complex7.subtract(complex14);
        org.apache.commons.math3.complex.Complex complex16 = complex7.conjugate();
        org.apache.commons.math3.complex.Complex complex17 = complex16.tan();
        boolean boolean18 = complex16.isInfinite();
        org.apache.commons.math3.complex.Complex complex20 = complex16.multiply((int) (byte) 1);
        org.apache.commons.math3.complex.Complex complex22 = complex16.subtract((double) 10.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex20", complex3.equals(complex20) ? complex3.hashCode() == complex20.hashCode() : true);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
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
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex7 = complex1.pow((double) 100.0f);
        org.apache.commons.math3.complex.Complex complex8 = complex7.sin();
        org.apache.commons.math3.complex.Complex complex9 = complex7.conjugate();
        org.apache.commons.math3.complex.Complex complex10 = complex7.exp();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex9", complex1.equals(complex9) ? complex1.hashCode() == complex9.hashCode() : true);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex7 = complex3.subtract(complex6);
        org.apache.commons.math3.complex.Complex complex8 = complex3.asin();
        double double9 = complex3.abs();
        org.apache.commons.math3.complex.Complex complex11 = complex3.subtract((-2.0d));
        org.apache.commons.math3.complex.Complex complex13 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex14 = complex13.exp();
        double double15 = complex13.getArgument();
        org.apache.commons.math3.complex.Complex complex17 = complex13.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex18 = complex13.exp();
        org.apache.commons.math3.complex.Complex complex19 = complex11.multiply(complex13);
        org.apache.commons.math3.complex.Complex complex21 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double22 = complex21.getImaginary();
        org.apache.commons.math3.complex.Complex complex23 = complex21.negate();
        org.apache.commons.math3.complex.Complex complex24 = complex23.reciprocal();
        org.apache.commons.math3.complex.ComplexField complexField25 = complex23.getField();
        org.apache.commons.math3.complex.Complex complex26 = complex23.reciprocal();
        double double27 = complex23.abs();
        org.apache.commons.math3.complex.Complex complex28 = complex23.cos();
        org.apache.commons.math3.complex.Complex complex29 = complex23.asin();
        org.apache.commons.math3.complex.Complex complex30 = complex13.multiply(complex23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex11", complex1.equals(complex11) ? complex1.hashCode() == complex11.hashCode() : true);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex3.reciprocal();
        org.apache.commons.math3.complex.ComplexField complexField5 = complex3.getField();
        org.apache.commons.math3.complex.Complex complex6 = complex3.reciprocal();
        double double7 = complex3.abs();
        org.apache.commons.math3.complex.Complex complex8 = complex3.acos();
        org.apache.commons.math3.complex.Complex complex10 = complex3.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex11 = complex10.conjugate();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex4", complex3.equals(complex4) ? complex3.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex5.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex9 = complex5.negate();
        boolean boolean10 = complex5.isInfinite();
        org.apache.commons.math3.complex.Complex complex11 = complex5.negate();
        org.apache.commons.math3.complex.Complex complex12 = complex11.negate();
        org.apache.commons.math3.complex.Complex complex13 = complex11.reciprocal();
        org.apache.commons.math3.complex.Complex complex14 = complex11.asin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex13", complex3.equals(complex13) ? complex3.hashCode() == complex13.hashCode() : true);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.sqrt1z();
        org.apache.commons.math3.complex.Complex complex7 = complex5.conjugate();
        org.apache.commons.math3.complex.Complex complex8 = complex5.acos();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex7", complex1.equals(complex7) ? complex1.hashCode() == complex7.hashCode() : true);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex7 = complex5.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex8 = complex7.cos();
        org.apache.commons.math3.complex.Complex complex10 = complex7.add((double) 'a');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex8", complex1.equals(complex8) ? complex1.hashCode() == complex8.hashCode() : true);
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
        boolean boolean10 = complex5.isInfinite();
        org.apache.commons.math3.complex.Complex complex11 = complex5.negate();
        org.apache.commons.math3.complex.Complex complex12 = complex11.negate();
        org.apache.commons.math3.complex.Complex complex13 = complex11.reciprocal();
        org.apache.commons.math3.complex.Complex complex14 = complex11.sin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex13", complex3.equals(complex13) ? complex3.hashCode() == complex13.hashCode() : true);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex7 = complex5.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex8 = complex7.exp();
        org.apache.commons.math3.complex.Complex complex10 = complex7.subtract((double) 1);
        org.apache.commons.math3.complex.Complex complex11 = complex7.cos();
        org.apache.commons.math3.complex.Complex complex13 = org.apache.commons.math3.complex.Complex.valueOf((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex14 = complex13.sqrt();
        org.apache.commons.math3.complex.Complex complex15 = complex11.subtract(complex13);
        org.apache.commons.math3.complex.Complex complex17 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex18 = complex17.exp();
        org.apache.commons.math3.complex.Complex complex19 = complex17.tan();
        org.apache.commons.math3.complex.Complex complex21 = complex17.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex22 = complex17.cos();
        boolean boolean23 = complex17.isNaN();
        org.apache.commons.math3.complex.Complex complex24 = complex17.cosh();
        org.apache.commons.math3.complex.Complex complex25 = complex17.asin();
        org.apache.commons.math3.complex.Complex complex26 = complex25.sin();
        org.apache.commons.math3.complex.Complex complex28 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex29 = complex28.exp();
        double double30 = complex28.getArgument();
        org.apache.commons.math3.complex.Complex complex32 = complex28.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex33 = complex28.sin();
        org.apache.commons.math3.complex.Complex complex34 = complex28.cosh();
        org.apache.commons.math3.complex.Complex complex36 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double37 = complex36.getImaginary();
        boolean boolean38 = complex34.equals((java.lang.Object) double37);
        org.apache.commons.math3.complex.Complex complex39 = complex34.tanh();
        org.apache.commons.math3.complex.Complex complex40 = complex34.sqrt();
        org.apache.commons.math3.complex.Complex complex41 = complex34.tanh();
        org.apache.commons.math3.complex.Complex complex42 = complex34.tanh();
        org.apache.commons.math3.complex.Complex complex43 = complex42.acos();
        org.apache.commons.math3.complex.Complex complex44 = complex26.add(complex43);
        org.apache.commons.math3.complex.Complex complex45 = complex13.subtract(complex26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex11", complex1.equals(complex11) ? complex1.hashCode() == complex11.hashCode() : true);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.ComplexField complexField5 = complex1.getField();
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double8 = complex7.getImaginary();
        org.apache.commons.math3.complex.Complex complex9 = complex7.negate();
        org.apache.commons.math3.complex.Complex complex10 = complex9.reciprocal();
        org.apache.commons.math3.complex.ComplexField complexField11 = complex9.getField();
        org.apache.commons.math3.complex.Complex complex12 = complex9.reciprocal();
        org.apache.commons.math3.complex.Complex complex13 = complex1.subtract(complex9);
        org.apache.commons.math3.complex.Complex complex14 = complex13.sinh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex9 and complex10", complex9.equals(complex10) ? complex9.hashCode() == complex10.hashCode() : true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math3.complex.Complex complex8 = complex5.multiply((int) (byte) 10);
        org.apache.commons.math3.complex.Complex complex10 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double11 = complex10.getImaginary();
        org.apache.commons.math3.complex.Complex complex12 = complex10.negate();
        org.apache.commons.math3.complex.Complex complex14 = complex12.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex15 = complex14.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList17 = complex14.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex19 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex20 = complex19.exp();
        org.apache.commons.math3.complex.Complex complex21 = complex19.tanh();
        org.apache.commons.math3.complex.Complex complex22 = complex14.subtract(complex19);
        org.apache.commons.math3.complex.Complex complex24 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex25 = complex24.exp();
        double double26 = complex24.getArgument();
        org.apache.commons.math3.complex.Complex complex28 = complex24.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex29 = complex24.sin();
        org.apache.commons.math3.complex.Complex complex30 = complex24.cosh();
        org.apache.commons.math3.complex.Complex complex31 = complex24.tan();
        org.apache.commons.math3.complex.Complex complex32 = complex24.tan();
        org.apache.commons.math3.complex.Complex complex34 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex35 = complex34.exp();
        double double36 = complex34.getArgument();
        org.apache.commons.math3.complex.Complex complex38 = complex34.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex39 = complex34.sin();
        org.apache.commons.math3.complex.Complex complex40 = complex34.cosh();
        org.apache.commons.math3.complex.Complex complex41 = complex34.tan();
        org.apache.commons.math3.complex.Complex complex42 = complex34.tan();
        org.apache.commons.math3.complex.Complex complex44 = complex34.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex45 = complex32.subtract(complex34);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList47 = complex45.nthRoot((int) '4');
        org.apache.commons.math3.complex.Complex complex48 = complex19.subtract(complex45);
        org.apache.commons.math3.complex.Complex complex49 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex51 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex52 = complex51.exp();
        org.apache.commons.math3.complex.Complex complex53 = complex51.tan();
        org.apache.commons.math3.complex.Complex complex55 = complex51.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex57 = complex55.multiply(100);
        org.apache.commons.math3.complex.Complex complex58 = complex57.tanh();
        org.apache.commons.math3.complex.Complex complex59 = complex49.subtract(complex58);
        boolean boolean60 = complex48.equals((java.lang.Object) complex58);
        org.apache.commons.math3.complex.Complex complex62 = complex48.add(10.0d);
        org.apache.commons.math3.complex.Complex complex63 = complex8.pow(complex62);
        org.apache.commons.math3.complex.Complex complex65 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex66 = complex65.exp();
        double double67 = complex65.getArgument();
        org.apache.commons.math3.complex.Complex complex69 = complex65.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex70 = complex65.sin();
        org.apache.commons.math3.complex.Complex complex71 = complex65.cosh();
        org.apache.commons.math3.complex.Complex complex72 = complex65.tan();
        org.apache.commons.math3.complex.Complex complex73 = complex65.tan();
        org.apache.commons.math3.complex.Complex complex75 = complex65.subtract((double) (short) -1);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList77 = complex65.nthRoot(100);
        org.apache.commons.math3.complex.Complex complex78 = complex65.acos();
        org.apache.commons.math3.complex.Complex complex80 = complex65.multiply((double) (byte) 10);
        org.apache.commons.math3.complex.Complex complex81 = complex8.subtract(complex80);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex22 and complex78", complex22.equals(complex78) ? complex22.hashCode() == complex78.hashCode() : true);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tanh();
        org.apache.commons.math3.complex.Complex complex4 = complex3.log();
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex7 = complex6.exp();
        double double8 = complex6.getArgument();
        org.apache.commons.math3.complex.Complex complex10 = complex6.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex11 = complex6.exp();
        org.apache.commons.math3.complex.Complex complex13 = complex11.pow((-0.0d));
        boolean boolean14 = complex4.equals((java.lang.Object) complex11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex13", complex1.equals(complex13) ? complex1.hashCode() == complex13.hashCode() : true);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.ComplexField complexField5 = complex1.getField();
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double8 = complex7.getImaginary();
        org.apache.commons.math3.complex.Complex complex9 = complex7.negate();
        org.apache.commons.math3.complex.Complex complex10 = complex9.reciprocal();
        org.apache.commons.math3.complex.ComplexField complexField11 = complex9.getField();
        org.apache.commons.math3.complex.Complex complex12 = complex9.reciprocal();
        org.apache.commons.math3.complex.Complex complex13 = complex1.subtract(complex9);
        org.apache.commons.math3.complex.Complex complex14 = complex1.log();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex9 and complex10", complex9.equals(complex10) ? complex9.hashCode() == complex10.hashCode() : true);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex5 = complex1.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex7 = complex5.multiply(100);
        org.apache.commons.math3.complex.Complex complex9 = complex5.multiply((int) (short) 0);
        double double10 = complex5.getImaginary();
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
        org.apache.commons.math3.complex.Complex complex25 = complex16.asin();
        java.lang.String str26 = complex25.toString();
        org.apache.commons.math3.complex.Complex complex27 = complex25.cosh();
        org.apache.commons.math3.complex.Complex complex29 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double30 = complex29.getImaginary();
        org.apache.commons.math3.complex.Complex complex31 = complex29.negate();
        org.apache.commons.math3.complex.Complex complex33 = complex31.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex34 = complex33.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList36 = complex33.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex38 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex39 = complex38.exp();
        org.apache.commons.math3.complex.Complex complex40 = complex38.tanh();
        org.apache.commons.math3.complex.Complex complex41 = complex33.subtract(complex38);
        org.apache.commons.math3.complex.Complex complex42 = complex33.asin();
        org.apache.commons.math3.complex.Complex complex43 = complex27.pow(complex42);
        org.apache.commons.math3.complex.Complex complex44 = complex5.subtract(complex27);
        org.apache.commons.math3.complex.Complex complex45 = complex5.atan();
        org.apache.commons.math3.complex.Complex complex46 = complex45.conjugate();
        org.apache.commons.math3.complex.Complex complex48 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex49 = complex48.exp();
        double double50 = complex48.getArgument();
        org.apache.commons.math3.complex.Complex complex52 = complex48.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex53 = complex48.sin();
        org.apache.commons.math3.complex.Complex complex54 = complex48.cosh();
        org.apache.commons.math3.complex.Complex complex56 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double57 = complex56.getImaginary();
        boolean boolean58 = complex54.equals((java.lang.Object) double57);
        org.apache.commons.math3.complex.Complex complex59 = complex54.tanh();
        org.apache.commons.math3.complex.Complex complex60 = complex54.sqrt();
        org.apache.commons.math3.complex.Complex complex61 = complex54.tanh();
        org.apache.commons.math3.complex.Complex complex63 = complex54.divide((double) '4');
        org.apache.commons.math3.complex.Complex complex64 = complex63.exp();
        org.apache.commons.math3.complex.Complex complex65 = complex64.exp();
        java.lang.String str66 = complex64.toString();
        org.apache.commons.math3.complex.Complex complex67 = complex64.atan();
        boolean boolean68 = complex45.equals((java.lang.Object) complex67);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex46", complex17.equals(complex46) ? complex17.hashCode() == complex46.hashCode() : true);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex3.reciprocal();
        org.apache.commons.math3.complex.ComplexField complexField5 = complex3.getField();
        org.apache.commons.math3.complex.Complex complex6 = complex3.reciprocal();
        double double7 = complex3.abs();
        org.apache.commons.math3.complex.Complex complex8 = complex3.acos();
        double double9 = complex3.getArgument();
        org.apache.commons.math3.complex.Complex complex11 = complex3.divide(2.718281828459045d);
        org.apache.commons.math3.complex.Complex complex12 = complex11.reciprocal();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex4", complex3.equals(complex4) ? complex3.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) '#');
        double double6 = complex1.getReal();
        org.apache.commons.math3.complex.Complex complex7 = complex1.atan();
        org.apache.commons.math3.complex.Complex complex8 = complex1.sqrt1z();
        org.apache.commons.math3.complex.Complex complex9 = complex1.reciprocal();
        org.apache.commons.math3.complex.Complex complex10 = complex9.sqrt();
        org.apache.commons.math3.complex.Complex complex12 = complex10.add((double) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex9", complex1.equals(complex9) ? complex1.hashCode() == complex9.hashCode() : true);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
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
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex7 = complex3.subtract(complex6);
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex10 = complex9.exp();
        org.apache.commons.math3.complex.Complex complex11 = complex9.tan();
        org.apache.commons.math3.complex.Complex complex13 = complex9.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex14 = complex9.cos();
        org.apache.commons.math3.complex.Complex complex15 = complex7.subtract(complex14);
        org.apache.commons.math3.complex.Complex complex16 = complex7.conjugate();
        org.apache.commons.math3.complex.Complex complex17 = complex7.negate();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex16", complex3.equals(complex16) ? complex3.hashCode() == complex16.hashCode() : true);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.acos();
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex8 = complex7.exp();
        double double9 = complex7.getArgument();
        org.apache.commons.math3.complex.Complex complex10 = complex7.log();
        org.apache.commons.math3.complex.Complex complex11 = complex7.log();
        org.apache.commons.math3.complex.Complex complex12 = complex5.multiply(complex7);
        org.apache.commons.math3.complex.Complex complex14 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex15 = complex14.exp();
        double double16 = complex14.getArgument();
        org.apache.commons.math3.complex.Complex complex18 = complex14.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex19 = complex14.exp();
        org.apache.commons.math3.complex.Complex complex20 = complex5.pow(complex19);
        org.apache.commons.math3.complex.Complex complex21 = complex20.reciprocal();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex5", complex4.equals(complex5) ? complex4.hashCode() == complex5.hashCode() : true);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex7 = complex3.subtract(complex6);
        org.apache.commons.math3.complex.Complex complex9 = complex3.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex10 = complex3.sin();
        org.apache.commons.math3.complex.Complex complex11 = complex10.conjugate();
        org.apache.commons.math3.complex.Complex complex13 = complex11.pow((double) 1);
        org.apache.commons.math3.complex.Complex complex14 = complex13.sin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex10 and complex11", complex10.equals(complex11) ? complex10.hashCode() == complex11.hashCode() : true);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex7 = complex5.divide((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex8 = complex5.asin();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList10 = complex5.nthRoot((int) 'a');
        org.apache.commons.math3.complex.Complex complex13 = new org.apache.commons.math3.complex.Complex((double) 1, (double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex14 = complex13.tanh();
        double double15 = complex13.getImaginary();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList17 = complex13.nthRoot((int) (byte) 10);
        boolean boolean18 = complex5.equals((java.lang.Object) complexList17);
        org.apache.commons.math3.complex.Complex complex19 = complex5.asin();
        org.apache.commons.math3.complex.Complex complex20 = complex5.reciprocal();
        org.apache.commons.math3.complex.Complex complex21 = complex5.sinh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex20", complex1.equals(complex20) ? complex1.hashCode() == complex20.hashCode() : true);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.acos();
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex8 = complex7.exp();
        double double9 = complex7.getArgument();
        org.apache.commons.math3.complex.Complex complex10 = complex7.log();
        org.apache.commons.math3.complex.Complex complex11 = complex7.log();
        org.apache.commons.math3.complex.Complex complex12 = complex5.multiply(complex7);
        org.apache.commons.math3.complex.Complex complex14 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex15 = complex14.exp();
        double double16 = complex14.getArgument();
        org.apache.commons.math3.complex.Complex complex18 = complex14.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex19 = complex14.exp();
        org.apache.commons.math3.complex.Complex complex20 = complex5.pow(complex19);
        org.apache.commons.math3.complex.ComplexField complexField21 = complex19.getField();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex5", complex4.equals(complex5) ? complex4.hashCode() == complex5.hashCode() : true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex6 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex8 = complex6.pow((-0.0d));
        double double9 = complex8.abs();
        org.apache.commons.math3.complex.Complex complex10 = complex8.sinh();
        org.apache.commons.math3.complex.ComplexField complexField11 = complex10.getField();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex8", complex1.equals(complex8) ? complex1.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex5 = complex1.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex6 = complex1.cos();
        org.apache.commons.math3.complex.Complex complex7 = complex1.tan();
        double double8 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex9 = complex1.reciprocal();
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex12 = complex11.exp();
        double double13 = complex11.getArgument();
        org.apache.commons.math3.complex.Complex complex15 = complex11.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex16 = complex11.exp();
        org.apache.commons.math3.complex.Complex complex17 = complex11.exp();
        double double18 = complex17.getReal();
        org.apache.commons.math3.complex.Complex complex19 = complex17.sinh();
        org.apache.commons.math3.complex.Complex complex21 = complex17.multiply(0.0d);
        org.apache.commons.math3.complex.Complex complex22 = complex21.cosh();
        org.apache.commons.math3.complex.Complex complex23 = complex1.multiply(complex21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex5 and complex9", complex5.equals(complex9) ? complex5.hashCode() == complex9.hashCode() : true);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex6 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex8 = complex6.pow((-0.0d));
        org.apache.commons.math3.complex.Complex complex10 = complex8.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex11 = complex10.tan();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex8", complex1.equals(complex8) ? complex1.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex6 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex7 = complex1.conjugate();
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex10 = complex9.exp();
        org.apache.commons.math3.complex.Complex complex11 = complex9.tan();
        org.apache.commons.math3.complex.Complex complex13 = complex9.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex14 = complex9.cos();
        double double15 = complex14.getArgument();
        java.lang.String str16 = complex14.toString();
        org.apache.commons.math3.complex.Complex complex18 = complex14.pow((-1.0d));
        org.apache.commons.math3.complex.Complex complex19 = complex7.multiply(complex14);
        org.apache.commons.math3.complex.Complex complex20 = complex14.atan();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex7", complex1.equals(complex7) ? complex1.hashCode() == complex7.hashCode() : true);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex3.reciprocal();
        org.apache.commons.math3.complex.ComplexField complexField5 = complex3.getField();
        org.apache.commons.math3.complex.Complex complex6 = complex3.reciprocal();
        double double7 = complex3.abs();
        org.apache.commons.math3.complex.Complex complex8 = complex3.cos();
        org.apache.commons.math3.complex.Complex complex10 = complex3.subtract((-2.0d));
        org.apache.commons.math3.complex.Complex complex12 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex13 = complex12.exp();
        double double14 = complex12.getArgument();
        org.apache.commons.math3.complex.Complex complex16 = complex12.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex18 = complex12.pow((double) 100.0f);
        org.apache.commons.math3.complex.Complex complex19 = complex18.sin();
        org.apache.commons.math3.complex.Complex complex20 = complex19.negate();
        boolean boolean21 = complex19.isNaN();
        org.apache.commons.math3.complex.Complex complex23 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex24 = complex23.exp();
        double double25 = complex23.getArgument();
        org.apache.commons.math3.complex.Complex complex27 = complex23.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex28 = complex23.exp();
        org.apache.commons.math3.complex.Complex complex29 = complex28.cosh();
        org.apache.commons.math3.complex.Complex complex30 = complex28.sin();
        org.apache.commons.math3.complex.Complex complex31 = complex19.pow(complex30);
        org.apache.commons.math3.complex.Complex complex32 = complex10.multiply(complex31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex4", complex3.equals(complex4) ? complex3.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex5 = complex1.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex7 = complex5.multiply(100);
        org.apache.commons.math3.complex.Complex complex9 = complex5.multiply((int) (short) 0);
        double double10 = complex5.getImaginary();
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
        org.apache.commons.math3.complex.Complex complex25 = complex16.asin();
        java.lang.String str26 = complex25.toString();
        org.apache.commons.math3.complex.Complex complex27 = complex25.cosh();
        org.apache.commons.math3.complex.Complex complex29 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double30 = complex29.getImaginary();
        org.apache.commons.math3.complex.Complex complex31 = complex29.negate();
        org.apache.commons.math3.complex.Complex complex33 = complex31.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex34 = complex33.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList36 = complex33.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex38 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex39 = complex38.exp();
        org.apache.commons.math3.complex.Complex complex40 = complex38.tanh();
        org.apache.commons.math3.complex.Complex complex41 = complex33.subtract(complex38);
        org.apache.commons.math3.complex.Complex complex42 = complex33.asin();
        org.apache.commons.math3.complex.Complex complex43 = complex27.pow(complex42);
        org.apache.commons.math3.complex.Complex complex44 = complex5.subtract(complex27);
        org.apache.commons.math3.complex.Complex complex45 = complex5.atan();
        org.apache.commons.math3.complex.Complex complex46 = complex45.conjugate();
        org.apache.commons.math3.complex.Complex complex48 = complex45.pow(6.610125138662287d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex46", complex17.equals(complex46) ? complex17.hashCode() == complex46.hashCode() : true);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex7 = complex1.pow((double) 100.0f);
        org.apache.commons.math3.complex.Complex complex8 = complex7.sin();
        org.apache.commons.math3.complex.Complex complex9 = complex8.negate();
        boolean boolean10 = complex8.isNaN();
        org.apache.commons.math3.complex.Complex complex11 = complex8.negate();
        org.apache.commons.math3.complex.Complex complex13 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double14 = complex13.getImaginary();
        org.apache.commons.math3.complex.Complex complex15 = complex13.negate();
        org.apache.commons.math3.complex.Complex complex17 = complex15.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex18 = complex17.sqrt1z();
        org.apache.commons.math3.complex.Complex complex20 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex21 = complex20.sqrt();
        org.apache.commons.math3.complex.Complex complex22 = complex21.conjugate();
        org.apache.commons.math3.complex.Complex complex23 = complex17.subtract(complex22);
        org.apache.commons.math3.complex.Complex complex24 = complex11.subtract(complex23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex22", complex1.equals(complex22) ? complex1.hashCode() == complex22.hashCode() : true);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex7 = complex1.pow((double) 100.0f);
        org.apache.commons.math3.complex.Complex complex8 = complex7.sin();
        org.apache.commons.math3.complex.Complex complex9 = complex8.negate();
        boolean boolean10 = complex8.isNaN();
        org.apache.commons.math3.complex.Complex complex12 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex13 = complex12.exp();
        double double14 = complex12.getArgument();
        org.apache.commons.math3.complex.Complex complex16 = complex12.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex17 = complex12.exp();
        org.apache.commons.math3.complex.Complex complex18 = complex17.cosh();
        org.apache.commons.math3.complex.Complex complex19 = complex17.sin();
        org.apache.commons.math3.complex.Complex complex20 = complex8.pow(complex19);
        org.apache.commons.math3.complex.Complex complex22 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double23 = complex22.getImaginary();
        org.apache.commons.math3.complex.Complex complex24 = complex22.negate();
        org.apache.commons.math3.complex.Complex complex25 = complex24.reciprocal();
        org.apache.commons.math3.complex.Complex complex27 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex28 = complex27.exp();
        double double29 = complex27.getArgument();
        org.apache.commons.math3.complex.Complex complex31 = complex27.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex32 = complex27.sin();
        org.apache.commons.math3.complex.Complex complex33 = complex27.cosh();
        org.apache.commons.math3.complex.Complex complex34 = complex27.tan();
        org.apache.commons.math3.complex.Complex complex35 = complex27.tan();
        org.apache.commons.math3.complex.Complex complex36 = complex24.add(complex35);
        double double37 = complex24.getReal();
        org.apache.commons.math3.complex.Complex complex38 = complex24.tanh();
        org.apache.commons.math3.complex.Complex complex39 = complex24.negate();
        org.apache.commons.math3.complex.Complex complex41 = complex24.pow(52.0d);
        org.apache.commons.math3.complex.Complex complex42 = complex20.multiply(complex41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex24 and complex25", complex24.equals(complex25) ? complex24.hashCode() == complex25.hashCode() : true);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex3.reciprocal();
        org.apache.commons.math3.complex.ComplexField complexField5 = complex3.getField();
        org.apache.commons.math3.complex.Complex complex6 = complex3.reciprocal();
        double double7 = complex3.abs();
        org.apache.commons.math3.complex.Complex complex8 = complex3.cos();
        org.apache.commons.math3.complex.Complex complex10 = complex3.subtract((-2.0d));
        java.lang.String str11 = complex10.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex4", complex3.equals(complex4) ? complex3.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.sqrt1z();
        org.apache.commons.math3.complex.Complex complex8 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex9 = complex8.sqrt();
        org.apache.commons.math3.complex.Complex complex10 = complex9.conjugate();
        org.apache.commons.math3.complex.Complex complex11 = complex5.subtract(complex10);
        org.apache.commons.math3.complex.Complex complex12 = complex5.sin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex10", complex1.equals(complex10) ? complex1.hashCode() == complex10.hashCode() : true);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex7 = complex5.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex8 = complex7.cos();
        double double9 = complex8.abs();
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex12 = complex11.exp();
        double double13 = complex11.getArgument();
        org.apache.commons.math3.complex.Complex complex15 = complex11.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex16 = complex11.exp();
        org.apache.commons.math3.complex.Complex complex17 = complex16.cosh();
        org.apache.commons.math3.complex.Complex complex19 = complex17.divide((double) (short) 1);
        org.apache.commons.math3.complex.Complex complex21 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex22 = complex21.exp();
        org.apache.commons.math3.complex.Complex complex23 = complex21.tan();
        org.apache.commons.math3.complex.Complex complex25 = complex21.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex26 = complex21.cos();
        org.apache.commons.math3.complex.Complex complex27 = complex21.tan();
        boolean boolean28 = complex17.equals((java.lang.Object) complex21);
        org.apache.commons.math3.complex.Complex complex29 = complex8.divide(complex21);
        double double30 = complex21.getArgument();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex8", complex1.equals(complex8) ? complex1.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex5 = complex1.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex6 = complex1.cos();
        org.apache.commons.math3.complex.Complex complex7 = complex1.tan();
        double double8 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex9 = complex1.reciprocal();
        org.apache.commons.math3.complex.Complex complex11 = complex9.divide(76.15941559557649d);
        org.apache.commons.math3.complex.Complex complex12 = complex11.exp();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex9", complex1.equals(complex9) ? complex1.hashCode() == complex9.hashCode() : true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex6 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex8 = complex6.pow((-0.0d));
        double double9 = complex8.abs();
        org.apache.commons.math3.complex.Complex complex10 = complex8.sinh();
        org.apache.commons.math3.complex.Complex complex12 = complex8.divide((double) 0L);
        double double13 = complex12.getArgument();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex8", complex1.equals(complex8) ? complex1.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
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
        double double16 = complex3.getReal();
        org.apache.commons.math3.complex.Complex complex18 = complex3.multiply((double) 100);
        org.apache.commons.math3.complex.Complex complex19 = complex18.conjugate();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex4", complex3.equals(complex4) ? complex3.hashCode() == complex4.hashCode() : true);
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
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex8 = complex7.exp();
        double double9 = complex7.getArgument();
        org.apache.commons.math3.complex.Complex complex10 = complex7.log();
        org.apache.commons.math3.complex.Complex complex11 = complex7.log();
        org.apache.commons.math3.complex.Complex complex12 = complex7.sqrt1z();
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
        org.apache.commons.math3.complex.Complex complex36 = complex35.tanh();
        org.apache.commons.math3.complex.Complex complex37 = complex12.divide(complex35);
        org.apache.commons.math3.complex.Complex complex38 = complex35.exp();
        boolean boolean39 = complex5.equals((java.lang.Object) complex35);
        org.apache.commons.math3.complex.Complex complex40 = complex35.negate();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex5", complex4.equals(complex5) ? complex4.hashCode() == complex5.hashCode() : true);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
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
        double double16 = complex3.getReal();
        org.apache.commons.math3.complex.Complex complex18 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex19 = complex18.exp();
        double double20 = complex18.getArgument();
        org.apache.commons.math3.complex.Complex complex21 = complex18.log();
        org.apache.commons.math3.complex.Complex complex22 = complex3.multiply(complex18);
        org.apache.commons.math3.complex.Complex complex23 = complex22.sqrt1z();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex4", complex3.equals(complex4) ? complex3.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex7 = complex6.cosh();
        org.apache.commons.math3.complex.Complex complex9 = complex7.divide((double) (short) 1);
        org.apache.commons.math3.complex.Complex complex10 = complex7.log();
        org.apache.commons.math3.complex.Complex complex12 = complex7.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex14 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex15 = complex14.exp();
        double double16 = complex14.getArgument();
        org.apache.commons.math3.complex.Complex complex18 = complex14.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex20 = complex18.divide((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex21 = complex18.asin();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList23 = complex18.nthRoot((int) 'a');
        org.apache.commons.math3.complex.Complex complex26 = new org.apache.commons.math3.complex.Complex((double) 1, (double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex27 = complex26.tanh();
        double double28 = complex26.getImaginary();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList30 = complex26.nthRoot((int) (byte) 10);
        boolean boolean31 = complex18.equals((java.lang.Object) complexList30);
        org.apache.commons.math3.complex.Complex complex32 = complex18.asin();
        org.apache.commons.math3.complex.Complex complex33 = complex18.reciprocal();
        org.apache.commons.math3.complex.Complex complex34 = complex12.divide(complex18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex33", complex1.equals(complex33) ? complex1.hashCode() == complex33.hashCode() : true);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex3.reciprocal();
        org.apache.commons.math3.complex.ComplexField complexField5 = complex3.getField();
        org.apache.commons.math3.complex.Complex complex6 = complex3.reciprocal();
        double double7 = complex3.abs();
        org.apache.commons.math3.complex.Complex complex8 = complex3.reciprocal();
        org.apache.commons.math3.complex.ComplexField complexField9 = complex8.getField();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex4", complex3.equals(complex4) ? complex3.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex7 = complex3.subtract(complex6);
        org.apache.commons.math3.complex.Complex complex8 = complex3.asin();
        double double9 = complex3.abs();
        org.apache.commons.math3.complex.Complex complex11 = complex3.subtract((-2.0d));
        org.apache.commons.math3.complex.Complex complex13 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex14 = complex13.exp();
        double double15 = complex13.getArgument();
        org.apache.commons.math3.complex.Complex complex17 = complex13.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex18 = complex13.exp();
        org.apache.commons.math3.complex.Complex complex19 = complex11.multiply(complex13);
        org.apache.commons.math3.complex.Complex complex20 = complex19.exp();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex11", complex1.equals(complex11) ? complex1.hashCode() == complex11.hashCode() : true);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
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
        org.apache.commons.math3.complex.Complex complex15 = complex14.cos();
        org.apache.commons.math3.complex.Complex complex16 = complex15.tan();
        org.apache.commons.math3.complex.Complex complex17 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex18 = complex17.exp();
        org.apache.commons.math3.complex.Complex complex19 = complex18.exp();
        org.apache.commons.math3.complex.Complex complex21 = complex19.pow((double) (short) 10);
        double double22 = complex19.abs();
        boolean boolean23 = complex15.equals((java.lang.Object) double22);
        org.apache.commons.math3.complex.Complex complex24 = complex15.asin();
        double double25 = complex15.getArgument();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex16 and complex24", complex16.equals(complex24) ? complex16.hashCode() == complex24.hashCode() : true);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex6 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex7 = complex1.conjugate();
        org.apache.commons.math3.complex.Complex complex8 = complex1.reciprocal();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex5 and complex7", complex5.equals(complex7) ? complex5.hashCode() == complex7.hashCode() : true);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex4.log();
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double8 = complex7.getImaginary();
        org.apache.commons.math3.complex.Complex complex9 = complex7.negate();
        org.apache.commons.math3.complex.Complex complex10 = complex9.reciprocal();
        org.apache.commons.math3.complex.Complex complex12 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex13 = complex12.exp();
        double double14 = complex12.getArgument();
        org.apache.commons.math3.complex.Complex complex16 = complex12.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex17 = complex12.sin();
        org.apache.commons.math3.complex.Complex complex18 = complex12.cosh();
        org.apache.commons.math3.complex.Complex complex19 = complex12.tan();
        org.apache.commons.math3.complex.Complex complex20 = complex12.tan();
        org.apache.commons.math3.complex.Complex complex21 = complex9.add(complex20);
        org.apache.commons.math3.complex.Complex complex23 = complex9.multiply((int) '#');
        org.apache.commons.math3.complex.Complex complex24 = complex5.subtract(complex9);
        double double25 = complex24.getImaginary();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex9 and complex10", complex9.equals(complex10) ? complex9.hashCode() == complex10.hashCode() : true);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tanh();
        org.apache.commons.math3.complex.Complex complex4 = complex3.log();
        org.apache.commons.math3.complex.Complex complex5 = complex3.acos();
        org.apache.commons.math3.complex.Complex complex6 = complex3.tanh();
        org.apache.commons.math3.complex.Complex complex7 = complex6.asin();
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex10 = complex9.exp();
        org.apache.commons.math3.complex.Complex complex11 = complex9.tan();
        org.apache.commons.math3.complex.Complex complex13 = complex9.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex14 = complex9.cos();
        org.apache.commons.math3.complex.Complex complex15 = complex9.tan();
        double double16 = complex9.getImaginary();
        org.apache.commons.math3.complex.Complex complex17 = complex9.reciprocal();
        org.apache.commons.math3.complex.Complex complex18 = complex6.pow(complex17);
        boolean boolean19 = complex18.isNaN();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex17", complex1.equals(complex17) ? complex1.hashCode() == complex17.hashCode() : true);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex3.reciprocal();
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.valueOf(1.557407724654902d, 35.0d);
        org.apache.commons.math3.complex.Complex complex8 = complex3.divide(complex7);
        org.apache.commons.math3.complex.Complex complex9 = complex8.conjugate();
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
        org.apache.commons.math3.complex.Complex complex7 = complex5.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex8 = complex7.exp();
        org.apache.commons.math3.complex.Complex complex9 = complex8.log();
        org.apache.commons.math3.complex.Complex complex11 = complex8.multiply((int) (byte) 0);
        org.apache.commons.math3.complex.Complex complex13 = complex11.multiply((int) 'a');
        org.apache.commons.math3.complex.Complex complex15 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double16 = complex15.getImaginary();
        org.apache.commons.math3.complex.Complex complex17 = complex15.negate();
        org.apache.commons.math3.complex.Complex complex18 = complex17.reciprocal();
        org.apache.commons.math3.complex.Complex complex21 = org.apache.commons.math3.complex.Complex.valueOf(1.557407724654902d, 35.0d);
        org.apache.commons.math3.complex.Complex complex22 = complex17.divide(complex21);
        org.apache.commons.math3.complex.Complex complex23 = complex17.log();
        org.apache.commons.math3.complex.Complex complex24 = complex13.divide(complex23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex18", complex17.equals(complex18) ? complex17.hashCode() == complex18.hashCode() : true);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex7 = complex1.sqrt1z();
        org.apache.commons.math3.complex.Complex complex8 = complex1.acos();
        org.apache.commons.math3.complex.Complex complex9 = complex1.atan();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex7 and complex8", complex7.equals(complex8) ? complex7.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tanh();
        org.apache.commons.math3.complex.Complex complex4 = complex3.log();
        org.apache.commons.math3.complex.Complex complex5 = complex3.acos();
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex8 = complex7.exp();
        org.apache.commons.math3.complex.Complex complex9 = complex7.tanh();
        org.apache.commons.math3.complex.Complex complex10 = complex9.log();
        org.apache.commons.math3.complex.Complex complex11 = complex9.acos();
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
        org.apache.commons.math3.complex.Complex complex26 = complex11.add(complex25);
        org.apache.commons.math3.complex.Complex complex27 = complex3.subtract(complex25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex5 and complex26", complex5.equals(complex26) ? complex5.hashCode() == complex26.hashCode() : true);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
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
        org.apache.commons.math3.complex.Complex complex40 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex42 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex43 = complex42.exp();
        org.apache.commons.math3.complex.Complex complex44 = complex42.tan();
        org.apache.commons.math3.complex.Complex complex46 = complex42.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex48 = complex46.multiply(100);
        org.apache.commons.math3.complex.Complex complex49 = complex48.tanh();
        org.apache.commons.math3.complex.Complex complex50 = complex40.subtract(complex49);
        boolean boolean51 = complex39.equals((java.lang.Object) complex49);
        double double52 = complex49.getReal();
        org.apache.commons.math3.complex.Complex complex54 = complex49.pow((-2.0d));
        org.apache.commons.math3.complex.Complex complex55 = complex49.log();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex54", complex1.equals(complex54) ? complex1.hashCode() == complex54.hashCode() : true);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math3.complex.Complex complex3 = complex1.sqrt();
        org.apache.commons.math3.complex.Complex complex4 = complex3.cosh();
        org.apache.commons.math3.complex.Complex complex6 = complex3.add((double) ' ');
        org.apache.commons.math3.complex.Complex complex7 = complex3.sinh();
        org.apache.commons.math3.complex.Complex complex8 = complex3.reciprocal();
        org.apache.commons.math3.complex.Complex complex9 = complex3.sqrt();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex8", complex1.equals(complex8) ? complex1.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex4 = complex1.pow((double) 100L);
        org.apache.commons.math3.complex.Complex complex6 = complex4.pow((double) (short) 100);
        org.apache.commons.math3.complex.Complex complex8 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double9 = complex8.getImaginary();
        org.apache.commons.math3.complex.Complex complex10 = complex8.negate();
        org.apache.commons.math3.complex.Complex complex11 = complex10.reciprocal();
        org.apache.commons.math3.complex.ComplexField complexField12 = complex10.getField();
        org.apache.commons.math3.complex.Complex complex13 = complex10.reciprocal();
        double double14 = complex10.abs();
        org.apache.commons.math3.complex.Complex complex15 = complex10.cos();
        org.apache.commons.math3.complex.Complex complex17 = complex10.subtract((-2.0d));
        org.apache.commons.math3.complex.Complex complex18 = complex4.subtract(complex10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex17", complex1.equals(complex17) ? complex1.hashCode() == complex17.hashCode() : true);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
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
        org.apache.commons.math3.complex.Complex complex15 = complex14.cos();
        org.apache.commons.math3.complex.Complex complex16 = complex15.cos();
        org.apache.commons.math3.complex.Complex complex17 = complex16.conjugate();
        org.apache.commons.math3.complex.Complex complex18 = complex17.acos();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex16", complex1.equals(complex16) ? complex1.hashCode() == complex16.hashCode() : true);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex4.log();
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double8 = complex7.getImaginary();
        org.apache.commons.math3.complex.Complex complex9 = complex7.negate();
        org.apache.commons.math3.complex.Complex complex10 = complex9.reciprocal();
        org.apache.commons.math3.complex.Complex complex12 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex13 = complex12.exp();
        double double14 = complex12.getArgument();
        org.apache.commons.math3.complex.Complex complex16 = complex12.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex17 = complex12.sin();
        org.apache.commons.math3.complex.Complex complex18 = complex12.cosh();
        org.apache.commons.math3.complex.Complex complex19 = complex12.tan();
        org.apache.commons.math3.complex.Complex complex20 = complex12.tan();
        org.apache.commons.math3.complex.Complex complex21 = complex9.add(complex20);
        org.apache.commons.math3.complex.Complex complex23 = complex9.multiply((int) '#');
        org.apache.commons.math3.complex.Complex complex24 = complex5.subtract(complex9);
        org.apache.commons.math3.complex.Complex complex26 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex28 = complex26.subtract((double) (-1));
        org.apache.commons.math3.complex.Complex complex30 = complex26.multiply((int) (short) 0);
        org.apache.commons.math3.complex.Complex complex32 = complex26.subtract((double) 10L);
        boolean boolean33 = complex5.equals((java.lang.Object) complex32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex9 and complex10", complex9.equals(complex10) ? complex9.hashCode() == complex10.hashCode() : true);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
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
        double double16 = complex3.getReal();
        org.apache.commons.math3.complex.Complex complex18 = complex3.multiply((double) 100);
        org.apache.commons.math3.complex.Complex complex20 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double21 = complex20.getImaginary();
        org.apache.commons.math3.complex.Complex complex22 = complex20.negate();
        org.apache.commons.math3.complex.Complex complex24 = complex22.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex25 = complex24.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList27 = complex24.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex28 = complex24.negate();
        boolean boolean29 = complex24.isInfinite();
        org.apache.commons.math3.complex.Complex complex30 = complex24.asin();
        org.apache.commons.math3.complex.Complex complex32 = complex30.multiply(3.8412897345910653E-4d);
        boolean boolean33 = complex3.equals((java.lang.Object) complex32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex22", complex4.equals(complex22) ? complex4.hashCode() == complex22.hashCode() : true);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex7 = complex6.cosh();
        org.apache.commons.math3.complex.Complex complex9 = complex7.divide((double) (short) 1);
        org.apache.commons.math3.complex.Complex complex11 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex12 = complex11.sqrt();
        org.apache.commons.math3.complex.Complex complex13 = complex11.sqrt();
        org.apache.commons.math3.complex.Complex complex14 = complex13.cosh();
        org.apache.commons.math3.complex.Complex complex16 = complex13.add((double) ' ');
        org.apache.commons.math3.complex.Complex complex17 = complex9.subtract(complex13);
        org.apache.commons.math3.complex.Complex complex18 = complex13.sqrt1z();
        org.apache.commons.math3.complex.Complex complex20 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex21 = complex20.exp();
        double double22 = complex20.getArgument();
        org.apache.commons.math3.complex.Complex complex24 = complex20.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex26 = complex20.pow((double) 100.0f);
        org.apache.commons.math3.complex.Complex complex27 = complex26.sin();
        org.apache.commons.math3.complex.Complex complex29 = complex27.subtract((double) 1);
        org.apache.commons.math3.complex.Complex complex31 = complex29.multiply(0.0d);
        double double32 = complex29.getReal();
        org.apache.commons.math3.complex.Complex complex34 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex35 = complex34.exp();
        double double36 = complex34.getArgument();
        org.apache.commons.math3.complex.Complex complex38 = complex34.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex40 = complex38.divide((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex41 = complex40.cosh();
        org.apache.commons.math3.complex.Complex complex42 = complex41.asin();
        org.apache.commons.math3.complex.Complex complex43 = complex29.multiply(complex42);
        org.apache.commons.math3.complex.Complex complex44 = complex13.add(complex43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex18 and complex31", complex18.equals(complex31) ? complex18.hashCode() == complex31.hashCode() : true);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
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
        org.apache.commons.math3.complex.Complex complex15 = complex14.conjugate();
        org.apache.commons.math3.complex.Complex complex17 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex18 = complex17.exp();
        double double19 = complex17.getArgument();
        org.apache.commons.math3.complex.Complex complex21 = complex17.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex22 = complex17.exp();
        org.apache.commons.math3.complex.Complex complex23 = complex17.conjugate();
        double double24 = complex23.abs();
        org.apache.commons.math3.complex.Complex complex25 = complex23.cos();
        org.apache.commons.math3.complex.Complex complex27 = complex23.pow(1.5430806348152437d);
        org.apache.commons.math3.complex.Complex complex28 = complex14.add(complex27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex23", complex1.equals(complex23) ? complex1.hashCode() == complex23.hashCode() : true);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex3 = complex2.exp();
        org.apache.commons.math3.complex.Complex complex4 = complex2.tan();
        org.apache.commons.math3.complex.Complex complex6 = complex2.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex8 = complex6.multiply(100);
        org.apache.commons.math3.complex.Complex complex9 = complex8.tanh();
        org.apache.commons.math3.complex.Complex complex10 = complex0.subtract(complex9);
        org.apache.commons.math3.complex.Complex complex11 = complex9.sqrt1z();
        org.apache.commons.math3.complex.Complex complex13 = complex9.divide((double) '#');
        org.apache.commons.math3.complex.Complex complex14 = complex9.negate();
        org.apache.commons.math3.complex.Complex complex16 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double17 = complex16.getImaginary();
        org.apache.commons.math3.complex.Complex complex18 = complex16.negate();
        org.apache.commons.math3.complex.Complex complex19 = complex18.reciprocal();
        org.apache.commons.math3.complex.ComplexField complexField20 = complex18.getField();
        org.apache.commons.math3.complex.Complex complex21 = complex18.reciprocal();
        double double22 = complex18.abs();
        org.apache.commons.math3.complex.Complex complex23 = complex14.subtract(complex18);
        org.apache.commons.math3.complex.Complex complex24 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex25 = complex24.exp();
        double double26 = complex24.getImaginary();
        org.apache.commons.math3.complex.ComplexField complexField27 = complex24.getField();
        org.apache.commons.math3.complex.Complex complex28 = complex18.divide(complex24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex14 and complex19", complex14.equals(complex19) ? complex14.hashCode() == complex19.hashCode() : true);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex3 = complex1.subtract((double) (-1));
        org.apache.commons.math3.complex.Complex complex5 = complex1.multiply((double) 10L);
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex8 = complex7.exp();
        org.apache.commons.math3.complex.Complex complex9 = complex7.tanh();
        org.apache.commons.math3.complex.Complex complex10 = complex9.log();
        org.apache.commons.math3.complex.Complex complex11 = complex9.acos();
        org.apache.commons.math3.complex.Complex complex12 = complex5.pow(complex11);
        org.apache.commons.math3.complex.Complex complex13 = complex11.sqrt();
        org.apache.commons.math3.complex.Complex complex15 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double16 = complex15.getImaginary();
        org.apache.commons.math3.complex.Complex complex17 = complex15.negate();
        org.apache.commons.math3.complex.Complex complex19 = complex17.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex21 = complex17.pow((double) 100L);
        org.apache.commons.math3.complex.Complex complex22 = complex21.sqrt();
        org.apache.commons.math3.complex.Complex complex23 = complex13.add(complex22);
        org.apache.commons.math3.complex.Complex complex25 = new org.apache.commons.math3.complex.Complex((double) (-1L));
        org.apache.commons.math3.complex.Complex complex26 = complex25.sqrt();
        org.apache.commons.math3.complex.Complex complex29 = org.apache.commons.math3.complex.Complex.valueOf((double) 100.0f, (double) (short) 1);
        org.apache.commons.math3.complex.Complex complex30 = complex29.acos();
        org.apache.commons.math3.complex.Complex complex31 = complex30.sin();
        org.apache.commons.math3.complex.Complex complex32 = complex25.pow(complex31);
        org.apache.commons.math3.complex.Complex complex35 = new org.apache.commons.math3.complex.Complex((double) 1, (double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex36 = complex35.tanh();
        org.apache.commons.math3.complex.Complex complex37 = complex35.tanh();
        boolean boolean38 = complex25.equals((java.lang.Object) complex37);
        org.apache.commons.math3.complex.Complex complex39 = complex22.multiply(complex25);
        double double40 = complex22.getReal();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex25", complex17.equals(complex25) ? complex17.hashCode() == complex25.hashCode() : true);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex3 = complex2.exp();
        org.apache.commons.math3.complex.Complex complex4 = complex2.tan();
        org.apache.commons.math3.complex.Complex complex6 = complex2.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex8 = complex6.multiply(100);
        org.apache.commons.math3.complex.Complex complex9 = complex8.tanh();
        org.apache.commons.math3.complex.Complex complex10 = complex0.subtract(complex9);
        org.apache.commons.math3.complex.Complex complex11 = complex9.sqrt1z();
        org.apache.commons.math3.complex.Complex complex13 = complex11.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex14 = complex11.asin();
        org.apache.commons.math3.complex.Complex complex15 = complex14.atan();
        java.lang.String str16 = complex15.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex11 and complex14", complex11.equals(complex14) ? complex11.hashCode() == complex14.hashCode() : true);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex7 = complex3.subtract(complex6);
        org.apache.commons.math3.complex.Complex complex8 = complex3.acos();
        org.apache.commons.math3.complex.Complex complex9 = complex3.negate();
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double12 = complex11.getImaginary();
        org.apache.commons.math3.complex.Complex complex13 = complex11.negate();
        org.apache.commons.math3.complex.Complex complex14 = complex13.reciprocal();
        org.apache.commons.math3.complex.Complex complex16 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex17 = complex16.exp();
        double double18 = complex16.getArgument();
        org.apache.commons.math3.complex.Complex complex20 = complex16.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex21 = complex16.sin();
        org.apache.commons.math3.complex.Complex complex22 = complex16.cosh();
        org.apache.commons.math3.complex.Complex complex23 = complex16.tan();
        org.apache.commons.math3.complex.Complex complex24 = complex16.tan();
        org.apache.commons.math3.complex.Complex complex25 = complex13.add(complex24);
        double double26 = complex13.getReal();
        org.apache.commons.math3.complex.Complex complex27 = complex13.tan();
        org.apache.commons.math3.complex.Complex complex28 = complex9.multiply(complex13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex14", complex3.equals(complex14) ? complex3.hashCode() == complex14.hashCode() : true);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex3.reciprocal();
        org.apache.commons.math3.complex.Complex complex6 = complex3.divide(100.0d);
        org.apache.commons.math3.complex.Complex complex7 = complex6.cos();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex4", complex3.equals(complex4) ? complex3.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.acos();
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex8 = complex7.exp();
        double double9 = complex7.getArgument();
        org.apache.commons.math3.complex.Complex complex10 = complex7.log();
        org.apache.commons.math3.complex.Complex complex11 = complex7.log();
        org.apache.commons.math3.complex.Complex complex12 = complex5.multiply(complex7);
        org.apache.commons.math3.complex.Complex complex13 = complex12.log();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex5", complex4.equals(complex5) ? complex4.hashCode() == complex5.hashCode() : true);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex5 = complex1.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex6 = complex1.cos();
        org.apache.commons.math3.complex.Complex complex7 = complex1.tan();
        double double8 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex9 = complex1.reciprocal();
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double12 = complex11.getImaginary();
        org.apache.commons.math3.complex.Complex complex13 = complex11.negate();
        org.apache.commons.math3.complex.Complex complex14 = complex13.reciprocal();
        org.apache.commons.math3.complex.ComplexField complexField15 = complex13.getField();
        org.apache.commons.math3.complex.Complex complex16 = complex13.reciprocal();
        double double17 = complex13.abs();
        org.apache.commons.math3.complex.Complex complex18 = complex13.cos();
        org.apache.commons.math3.complex.Complex complex19 = complex13.asin();
        org.apache.commons.math3.complex.Complex complex20 = complex13.conjugate();
        boolean boolean21 = complex1.equals((java.lang.Object) complex13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex5 and complex9", complex5.equals(complex9) ? complex5.hashCode() == complex9.hashCode() : true);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
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
        org.apache.commons.math3.complex.Complex complex17 = complex14.add(0.9996159447946292d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex4", complex3.equals(complex4) ? complex3.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
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
        org.apache.commons.math3.complex.Complex complex13 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex14 = complex13.exp();
        org.apache.commons.math3.complex.Complex complex15 = complex14.exp();
        org.apache.commons.math3.complex.Complex complex17 = complex15.pow((double) (short) 10);
        org.apache.commons.math3.complex.Complex complex19 = complex15.divide(2.718281828459045d);
        boolean boolean20 = complex7.equals((java.lang.Object) 2.718281828459045d);
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
        org.apache.commons.math3.complex.Complex complex35 = complex26.cos();
        boolean boolean36 = complex35.isInfinite();
        org.apache.commons.math3.complex.Complex complex37 = complex35.cos();
        org.apache.commons.math3.complex.Complex complex38 = complex35.conjugate();
        org.apache.commons.math3.complex.Complex complex39 = complex7.add(complex38);
        org.apache.commons.math3.complex.Complex complex41 = complex39.add(0.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex35 and complex38", complex35.equals(complex38) ? complex35.hashCode() == complex38.hashCode() : true);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex3.reciprocal();
        org.apache.commons.math3.complex.Complex complex5 = complex3.cosh();
        double double6 = complex5.getArgument();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex4", complex3.equals(complex4) ? complex3.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
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
        org.apache.commons.math3.complex.Complex complex16 = complex15.sinh();
        double double17 = complex15.getImaginary();
        org.apache.commons.math3.complex.Complex complex18 = complex15.conjugate();
        org.apache.commons.math3.complex.Complex complex21 = org.apache.commons.math3.complex.Complex.valueOf((double) (-1.0f), (double) '#');
        double double22 = complex21.getImaginary();
        org.apache.commons.math3.complex.Complex complex24 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double25 = complex24.getImaginary();
        org.apache.commons.math3.complex.Complex complex26 = complex24.negate();
        org.apache.commons.math3.complex.Complex complex27 = complex26.reciprocal();
        org.apache.commons.math3.complex.Complex complex29 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex30 = complex29.exp();
        double double31 = complex29.getArgument();
        org.apache.commons.math3.complex.Complex complex33 = complex29.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex34 = complex29.sin();
        org.apache.commons.math3.complex.Complex complex35 = complex29.cosh();
        org.apache.commons.math3.complex.Complex complex36 = complex29.tan();
        org.apache.commons.math3.complex.Complex complex37 = complex29.tan();
        org.apache.commons.math3.complex.Complex complex38 = complex26.add(complex37);
        double double39 = complex26.getReal();
        org.apache.commons.math3.complex.Complex complex40 = complex26.tanh();
        org.apache.commons.math3.complex.Complex complex42 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex43 = complex42.exp();
        org.apache.commons.math3.complex.Complex complex44 = complex42.tanh();
        org.apache.commons.math3.complex.Complex complex45 = complex26.pow(complex44);
        boolean boolean46 = complex21.equals((java.lang.Object) complex26);
        org.apache.commons.math3.complex.Complex complex47 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex48 = complex47.exp();
        org.apache.commons.math3.complex.Complex complex49 = complex48.exp();
        org.apache.commons.math3.complex.Complex complex51 = complex49.pow((double) (short) 10);
        org.apache.commons.math3.complex.Complex complex52 = complex26.add(complex49);
        org.apache.commons.math3.complex.Complex complex53 = complex15.pow(complex49);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex27", complex3.equals(complex27) ? complex3.hashCode() == complex27.hashCode() : true);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex3.reciprocal();
        org.apache.commons.math3.complex.Complex complex5 = complex3.cosh();
        org.apache.commons.math3.complex.Complex complex7 = complex3.divide((double) 1);
        org.apache.commons.math3.complex.Complex complex8 = complex7.log();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex4", complex3.equals(complex4) ? complex3.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex7 = complex1.pow((double) 100.0f);
        org.apache.commons.math3.complex.Complex complex8 = complex7.sin();
        org.apache.commons.math3.complex.Complex complex9 = complex8.negate();
        boolean boolean10 = complex8.isNaN();
        org.apache.commons.math3.complex.Complex complex12 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex13 = complex12.exp();
        double double14 = complex12.getArgument();
        org.apache.commons.math3.complex.Complex complex16 = complex12.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex17 = complex12.exp();
        org.apache.commons.math3.complex.Complex complex18 = complex17.cosh();
        org.apache.commons.math3.complex.Complex complex19 = complex17.sin();
        org.apache.commons.math3.complex.Complex complex20 = complex8.pow(complex19);
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
        org.apache.commons.math3.complex.Complex complex35 = complex26.cos();
        org.apache.commons.math3.complex.Complex complex36 = complex35.tan();
        org.apache.commons.math3.complex.Complex complex37 = complex36.sinh();
        org.apache.commons.math3.complex.Complex complex39 = complex36.pow(0.0d);
        boolean boolean40 = complex19.equals((java.lang.Object) 0.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex39", complex1.equals(complex39) ? complex1.hashCode() == complex39.hashCode() : true);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.acos();
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex8 = complex7.exp();
        double double9 = complex7.getArgument();
        org.apache.commons.math3.complex.Complex complex10 = complex7.log();
        org.apache.commons.math3.complex.Complex complex11 = complex7.log();
        org.apache.commons.math3.complex.Complex complex12 = complex5.multiply(complex7);
        org.apache.commons.math3.complex.Complex complex13 = complex7.sinh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex5", complex4.equals(complex5) ? complex4.hashCode() == complex5.hashCode() : true);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex3 = complex2.exp();
        org.apache.commons.math3.complex.Complex complex4 = complex2.tan();
        org.apache.commons.math3.complex.Complex complex6 = complex2.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex8 = complex6.multiply(100);
        org.apache.commons.math3.complex.Complex complex9 = complex8.tanh();
        org.apache.commons.math3.complex.Complex complex10 = complex0.subtract(complex9);
        org.apache.commons.math3.complex.Complex complex11 = complex9.sqrt1z();
        org.apache.commons.math3.complex.Complex complex13 = complex11.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex14 = complex11.asin();
        org.apache.commons.math3.complex.Complex complex16 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex17 = complex16.exp();
        org.apache.commons.math3.complex.Complex complex18 = complex16.tanh();
        org.apache.commons.math3.complex.Complex complex19 = complex18.log();
        org.apache.commons.math3.complex.Complex complex20 = complex18.acos();
        org.apache.commons.math3.complex.Complex complex21 = complex20.reciprocal();
        org.apache.commons.math3.complex.Complex complex22 = complex20.exp();
        org.apache.commons.math3.complex.Complex complex23 = complex22.cosh();
        org.apache.commons.math3.complex.Complex complex24 = complex22.tan();
        org.apache.commons.math3.complex.Complex complex26 = complex22.add(263.6733373605274d);
        org.apache.commons.math3.complex.Complex complex28 = complex22.subtract(0.0d);
        org.apache.commons.math3.complex.Complex complex29 = complex11.add(complex22);
        double double30 = complex11.getReal();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex22 and complex29", complex22.equals(complex29) ? complex22.hashCode() == complex29.hashCode() : true);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex3.reciprocal();
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.valueOf(1.557407724654902d, 35.0d);
        org.apache.commons.math3.complex.Complex complex8 = complex3.divide(complex7);
        org.apache.commons.math3.complex.Complex complex9 = complex7.reciprocal();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex4", complex3.equals(complex4) ? complex3.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex3.reciprocal();
        org.apache.commons.math3.complex.ComplexField complexField5 = complex3.getField();
        org.apache.commons.math3.complex.Complex complex6 = complex3.reciprocal();
        double double7 = complex3.abs();
        org.apache.commons.math3.complex.Complex complex8 = complex3.cos();
        org.apache.commons.math3.complex.Complex complex9 = complex3.asin();
        org.apache.commons.math3.complex.Complex complex11 = complex9.multiply(0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex4", complex3.equals(complex4) ? complex3.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math3.complex.Complex complex3 = complex1.sqrt();
        org.apache.commons.math3.complex.Complex complex4 = complex3.cosh();
        org.apache.commons.math3.complex.Complex complex6 = complex3.add((double) ' ');
        org.apache.commons.math3.complex.Complex complex8 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double9 = complex8.getImaginary();
        org.apache.commons.math3.complex.Complex complex10 = complex8.negate();
        org.apache.commons.math3.complex.Complex complex11 = complex10.reciprocal();
        org.apache.commons.math3.complex.Complex complex13 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex14 = complex13.exp();
        double double15 = complex13.getArgument();
        org.apache.commons.math3.complex.Complex complex17 = complex13.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex18 = complex13.sin();
        org.apache.commons.math3.complex.Complex complex19 = complex13.cosh();
        org.apache.commons.math3.complex.Complex complex20 = complex13.tan();
        org.apache.commons.math3.complex.Complex complex21 = complex13.tan();
        org.apache.commons.math3.complex.Complex complex22 = complex10.add(complex21);
        org.apache.commons.math3.complex.Complex complex24 = complex10.multiply((int) '#');
        org.apache.commons.math3.complex.Complex complex25 = complex6.subtract(complex24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex10 and complex11", complex10.equals(complex11) ? complex10.hashCode() == complex11.hashCode() : true);
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
        org.apache.commons.math3.complex.Complex complex23 = complex22.tanh();
        org.apache.commons.math3.complex.Complex complex24 = complex22.asin();
        org.apache.commons.math3.complex.Complex complex26 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex27 = complex26.exp();
        org.apache.commons.math3.complex.Complex complex28 = complex26.tan();
        org.apache.commons.math3.complex.Complex complex30 = complex26.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex32 = complex30.multiply(100);
        org.apache.commons.math3.complex.Complex complex34 = complex30.multiply((int) (short) 0);
        double double35 = complex30.getImaginary();
        org.apache.commons.math3.complex.Complex complex37 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double38 = complex37.getImaginary();
        org.apache.commons.math3.complex.Complex complex39 = complex37.negate();
        org.apache.commons.math3.complex.Complex complex41 = complex39.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex42 = complex41.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList44 = complex41.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex46 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex47 = complex46.exp();
        org.apache.commons.math3.complex.Complex complex48 = complex46.tanh();
        org.apache.commons.math3.complex.Complex complex49 = complex41.subtract(complex46);
        org.apache.commons.math3.complex.Complex complex50 = complex41.asin();
        java.lang.String str51 = complex50.toString();
        org.apache.commons.math3.complex.Complex complex52 = complex50.cosh();
        org.apache.commons.math3.complex.Complex complex54 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double55 = complex54.getImaginary();
        org.apache.commons.math3.complex.Complex complex56 = complex54.negate();
        org.apache.commons.math3.complex.Complex complex58 = complex56.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex59 = complex58.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList61 = complex58.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex63 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex64 = complex63.exp();
        org.apache.commons.math3.complex.Complex complex65 = complex63.tanh();
        org.apache.commons.math3.complex.Complex complex66 = complex58.subtract(complex63);
        org.apache.commons.math3.complex.Complex complex67 = complex58.asin();
        org.apache.commons.math3.complex.Complex complex68 = complex52.pow(complex67);
        org.apache.commons.math3.complex.Complex complex69 = complex30.subtract(complex52);
        org.apache.commons.math3.complex.Complex complex70 = complex30.atan();
        org.apache.commons.math3.complex.Complex complex71 = complex70.conjugate();
        org.apache.commons.math3.complex.Complex complex72 = complex22.multiply(complex70);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex42 and complex71", complex42.equals(complex71) ? complex42.hashCode() == complex71.hashCode() : true);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tanh();
        org.apache.commons.math3.complex.Complex complex4 = complex3.log();
        org.apache.commons.math3.complex.Complex complex5 = complex3.acos();
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
        org.apache.commons.math3.complex.Complex complex20 = complex5.add(complex19);
        org.apache.commons.math3.complex.Complex complex21 = complex19.exp();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex5 and complex20", complex5.equals(complex20) ? complex5.hashCode() == complex20.hashCode() : true);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex7 = complex1.pow((double) 100.0f);
        org.apache.commons.math3.complex.Complex complex8 = complex7.sin();
        org.apache.commons.math3.complex.Complex complex9 = complex8.negate();
        org.apache.commons.math3.complex.Complex complex10 = complex9.sin();
        org.apache.commons.math3.complex.Complex complex11 = complex9.sinh();
        org.apache.commons.math3.complex.Complex complex13 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double14 = complex13.getImaginary();
        org.apache.commons.math3.complex.Complex complex15 = complex13.negate();
        org.apache.commons.math3.complex.Complex complex17 = complex15.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex18 = complex17.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList20 = complex17.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex21 = complex17.negate();
        boolean boolean22 = complex17.isInfinite();
        org.apache.commons.math3.complex.Complex complex24 = complex17.subtract((double) 1);
        org.apache.commons.math3.complex.Complex complex26 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex27 = complex26.exp();
        double double28 = complex26.getArgument();
        org.apache.commons.math3.complex.Complex complex30 = complex26.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex31 = complex26.exp();
        org.apache.commons.math3.complex.Complex complex32 = complex26.conjugate();
        org.apache.commons.math3.complex.Complex complex34 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex35 = complex34.exp();
        org.apache.commons.math3.complex.Complex complex36 = complex34.tan();
        org.apache.commons.math3.complex.Complex complex38 = complex34.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex39 = complex34.cos();
        double double40 = complex39.getArgument();
        java.lang.String str41 = complex39.toString();
        org.apache.commons.math3.complex.Complex complex43 = complex39.pow((-1.0d));
        org.apache.commons.math3.complex.Complex complex44 = complex32.multiply(complex39);
        org.apache.commons.math3.complex.Complex complex45 = complex24.subtract(complex32);
        org.apache.commons.math3.complex.Complex complex46 = complex9.divide(complex24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex32", complex1.equals(complex32) ? complex1.hashCode() == complex32.hashCode() : true);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex5.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex9 = complex5.negate();
        boolean boolean10 = complex5.isInfinite();
        org.apache.commons.math3.complex.Complex complex11 = complex5.negate();
        org.apache.commons.math3.complex.Complex complex12 = complex11.negate();
        org.apache.commons.math3.complex.Complex complex13 = complex11.reciprocal();
        org.apache.commons.math3.complex.Complex complex15 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex16 = complex15.exp();
        boolean boolean17 = complex16.isNaN();
        org.apache.commons.math3.complex.Complex complex19 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex20 = complex19.exp();
        org.apache.commons.math3.complex.Complex complex21 = complex19.tan();
        org.apache.commons.math3.complex.Complex complex23 = complex19.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex25 = complex23.multiply(100);
        org.apache.commons.math3.complex.Complex complex26 = complex16.pow(complex25);
        org.apache.commons.math3.complex.Complex complex27 = complex16.cosh();
        org.apache.commons.math3.complex.Complex complex29 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex30 = complex29.exp();
        org.apache.commons.math3.complex.Complex complex31 = complex29.tanh();
        org.apache.commons.math3.complex.Complex complex32 = complex31.log();
        org.apache.commons.math3.complex.Complex complex33 = complex31.acos();
        org.apache.commons.math3.complex.Complex complex34 = complex33.reciprocal();
        org.apache.commons.math3.complex.Complex complex35 = complex16.add(complex33);
        org.apache.commons.math3.complex.Complex complex36 = complex11.multiply(complex33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex13", complex3.equals(complex13) ? complex3.hashCode() == complex13.hashCode() : true);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
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
        org.apache.commons.math3.complex.Complex complex14 = complex13.conjugate();
        org.apache.commons.math3.complex.ComplexField complexField15 = complex14.getField();
        org.apache.commons.math3.complex.Complex complex16 = complex14.exp();
        org.apache.commons.math3.complex.Complex complex18 = complex14.add(2.428308113150743d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex16", complex1.equals(complex16) ? complex1.hashCode() == complex16.hashCode() : true);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        double double6 = complex5.getArgument();
        org.apache.commons.math3.complex.Complex complex8 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex9 = complex8.exp();
        double double10 = complex8.getArgument();
        org.apache.commons.math3.complex.Complex complex12 = complex8.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex14 = complex8.pow((double) 100.0f);
        org.apache.commons.math3.complex.Complex complex15 = complex14.sin();
        org.apache.commons.math3.complex.Complex complex16 = complex14.conjugate();
        org.apache.commons.math3.complex.Complex complex17 = complex5.add(complex14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex16", complex1.equals(complex16) ? complex1.hashCode() == complex16.hashCode() : true);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
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
        org.apache.commons.math3.complex.Complex complex16 = complex15.sinh();
        double double17 = complex15.getImaginary();
        org.apache.commons.math3.complex.Complex complex18 = complex15.conjugate();
        org.apache.commons.math3.complex.Complex complex19 = complex15.atan();
        org.apache.commons.math3.complex.Complex complex20 = complex15.reciprocal();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex14 and complex19", complex14.equals(complex19) ? complex14.hashCode() == complex19.hashCode() : true);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex7 = complex1.sqrt1z();
        org.apache.commons.math3.complex.Complex complex8 = complex1.acos();
        org.apache.commons.math3.complex.Complex complex10 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex11 = complex10.exp();
        double double12 = complex10.getArgument();
        org.apache.commons.math3.complex.Complex complex14 = complex10.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex15 = complex10.sin();
        org.apache.commons.math3.complex.Complex complex16 = complex10.cosh();
        org.apache.commons.math3.complex.Complex complex18 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double19 = complex18.getImaginary();
        boolean boolean20 = complex16.equals((java.lang.Object) double19);
        org.apache.commons.math3.complex.Complex complex21 = complex16.tanh();
        org.apache.commons.math3.complex.Complex complex22 = complex21.tan();
        org.apache.commons.math3.complex.Complex complex23 = complex21.cos();
        org.apache.commons.math3.complex.Complex complex25 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex26 = complex25.exp();
        double double27 = complex25.getArgument();
        org.apache.commons.math3.complex.Complex complex29 = complex25.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex30 = complex25.sin();
        org.apache.commons.math3.complex.Complex complex31 = complex25.cosh();
        org.apache.commons.math3.complex.Complex complex33 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double34 = complex33.getImaginary();
        boolean boolean35 = complex31.equals((java.lang.Object) double34);
        org.apache.commons.math3.complex.Complex complex36 = complex31.tanh();
        org.apache.commons.math3.complex.Complex complex37 = complex31.sqrt();
        org.apache.commons.math3.complex.Complex complex38 = complex31.log();
        org.apache.commons.math3.complex.Complex complex39 = complex21.pow(complex31);
        org.apache.commons.math3.complex.Complex complex40 = complex1.divide(complex39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex7 and complex8", complex7.equals(complex8) ? complex7.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex3.reciprocal();
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.valueOf(1.557407724654902d, 35.0d);
        org.apache.commons.math3.complex.Complex complex8 = complex3.divide(complex7);
        org.apache.commons.math3.complex.Complex complex9 = complex3.log();
        org.apache.commons.math3.complex.Complex complex10 = complex9.tan();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex4", complex3.equals(complex4) ? complex3.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex7 = complex5.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex8 = complex7.exp();
        org.apache.commons.math3.complex.Complex complex10 = complex7.subtract((double) 1);
        org.apache.commons.math3.complex.Complex complex11 = complex7.cos();
        org.apache.commons.math3.complex.Complex complex13 = org.apache.commons.math3.complex.Complex.valueOf((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex14 = complex13.sqrt();
        org.apache.commons.math3.complex.Complex complex15 = complex11.subtract(complex13);
        java.lang.Class<?> wildcardClass16 = complex15.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex11", complex1.equals(complex11) ? complex1.hashCode() == complex11.hashCode() : true);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex3 = complex1.divide((double) (short) 100);
        org.apache.commons.math3.complex.Complex complex5 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex6 = complex5.exp();
        double double7 = complex5.getArgument();
        org.apache.commons.math3.complex.Complex complex9 = complex5.pow((double) '#');
        double double10 = complex5.getReal();
        org.apache.commons.math3.complex.Complex complex11 = complex5.atan();
        org.apache.commons.math3.complex.Complex complex12 = complex5.sqrt1z();
        org.apache.commons.math3.complex.Complex complex13 = complex5.reciprocal();
        org.apache.commons.math3.complex.Complex complex14 = complex13.sqrt();
        org.apache.commons.math3.complex.Complex complex15 = complex1.divide(complex13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex5 and complex14", complex5.equals(complex14) ? complex5.hashCode() == complex14.hashCode() : true);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf(0.8414709848078965d);
        org.apache.commons.math3.complex.Complex complex2 = complex1.sqrt1z();
        org.apache.commons.math3.complex.Complex complex4 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double5 = complex4.getImaginary();
        org.apache.commons.math3.complex.Complex complex6 = complex4.negate();
        org.apache.commons.math3.complex.Complex complex8 = complex6.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex10 = complex6.subtract(complex9);
        org.apache.commons.math3.complex.Complex complex12 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex13 = complex12.exp();
        org.apache.commons.math3.complex.Complex complex14 = complex12.tan();
        org.apache.commons.math3.complex.Complex complex16 = complex12.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex17 = complex12.cos();
        org.apache.commons.math3.complex.Complex complex18 = complex10.subtract(complex17);
        java.lang.String str19 = complex17.toString();
        org.apache.commons.math3.complex.Complex complex20 = complex17.sqrt1z();
        org.apache.commons.math3.complex.Complex complex22 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex23 = complex22.exp();
        double double24 = complex22.getArgument();
        org.apache.commons.math3.complex.Complex complex26 = complex22.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex27 = complex22.sin();
        org.apache.commons.math3.complex.Complex complex28 = complex22.cosh();
        org.apache.commons.math3.complex.Complex complex29 = complex22.tanh();
        org.apache.commons.math3.complex.Complex complex30 = complex22.log();
        org.apache.commons.math3.complex.Complex complex32 = complex22.add((double) 1);
        org.apache.commons.math3.complex.Complex complex33 = complex17.divide(complex32);
        org.apache.commons.math3.complex.Complex complex34 = complex2.multiply(complex33);
        org.apache.commons.math3.complex.Complex complex35 = complex34.exp();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex17", complex2.equals(complex17) ? complex2.hashCode() == complex17.hashCode() : true);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex5.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex9 = complex5.negate();
        boolean boolean10 = complex5.isInfinite();
        org.apache.commons.math3.complex.Complex complex11 = complex5.negate();
        org.apache.commons.math3.complex.Complex complex12 = complex11.negate();
        org.apache.commons.math3.complex.Complex complex13 = complex12.conjugate();
        boolean boolean14 = complex12.isInfinite();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex13", complex1.equals(complex13) ? complex1.hashCode() == complex13.hashCode() : true);
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
        org.apache.commons.math3.complex.Complex complex17 = complex3.multiply((int) '#');
        boolean boolean18 = complex3.isInfinite();
        org.apache.commons.math3.complex.Complex complex19 = complex3.sqrt();
        org.apache.commons.math3.complex.Complex complex20 = complex19.negate();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex4", complex3.equals(complex4) ? complex3.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex3 = complex1.divide((double) (short) 100);
        org.apache.commons.math3.complex.Complex complex4 = complex3.sqrt1z();
        org.apache.commons.math3.complex.Complex complex5 = complex3.tan();
        org.apache.commons.math3.complex.Complex complex8 = org.apache.commons.math3.complex.Complex.valueOf(0.0d, (double) (byte) -1);
        org.apache.commons.math3.complex.Complex complex9 = complex3.multiply(complex8);
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double12 = complex11.getImaginary();
        org.apache.commons.math3.complex.Complex complex13 = complex11.negate();
        org.apache.commons.math3.complex.Complex complex15 = complex13.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex16 = complex15.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList18 = complex15.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex20 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex21 = complex20.exp();
        org.apache.commons.math3.complex.Complex complex22 = complex20.tanh();
        org.apache.commons.math3.complex.Complex complex23 = complex15.subtract(complex20);
        org.apache.commons.math3.complex.Complex complex24 = complex15.cos();
        org.apache.commons.math3.complex.Complex complex25 = complex24.tan();
        org.apache.commons.math3.complex.Complex complex26 = complex24.conjugate();
        org.apache.commons.math3.complex.Complex complex27 = complex8.subtract(complex24);
        org.apache.commons.math3.complex.Complex complex29 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double30 = complex29.getImaginary();
        org.apache.commons.math3.complex.Complex complex31 = complex29.negate();
        org.apache.commons.math3.complex.Complex complex32 = complex31.reciprocal();
        org.apache.commons.math3.complex.Complex complex34 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex35 = complex34.exp();
        double double36 = complex34.getArgument();
        org.apache.commons.math3.complex.Complex complex38 = complex34.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex39 = complex34.sin();
        org.apache.commons.math3.complex.Complex complex40 = complex34.cosh();
        org.apache.commons.math3.complex.Complex complex41 = complex34.tan();
        org.apache.commons.math3.complex.Complex complex42 = complex34.tan();
        org.apache.commons.math3.complex.Complex complex43 = complex31.add(complex42);
        double double44 = complex31.getReal();
        org.apache.commons.math3.complex.Complex complex46 = complex31.multiply(0.9996159447946292d);
        org.apache.commons.math3.complex.Complex complex47 = complex24.pow(complex46);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex13 and complex32", complex13.equals(complex32) ? complex13.hashCode() == complex32.hashCode() : true);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
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
        org.apache.commons.math3.complex.Complex complex13 = complex7.sqrt();
        org.apache.commons.math3.complex.Complex complex14 = complex7.tanh();
        org.apache.commons.math3.complex.Complex complex16 = complex7.divide((double) '4');
        org.apache.commons.math3.complex.Complex complex17 = complex16.exp();
        org.apache.commons.math3.complex.Complex complex18 = complex17.exp();
        org.apache.commons.math3.complex.Complex complex20 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex21 = complex20.exp();
        double double22 = complex20.getArgument();
        org.apache.commons.math3.complex.Complex complex23 = complex20.log();
        org.apache.commons.math3.complex.Complex complex24 = complex20.log();
        org.apache.commons.math3.complex.Complex complex26 = complex24.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex27 = complex26.exp();
        org.apache.commons.math3.complex.Complex complex29 = complex26.subtract((double) 1);
        org.apache.commons.math3.complex.Complex complex30 = complex17.pow(complex29);
        org.apache.commons.math3.complex.Complex complex32 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex33 = complex32.exp();
        org.apache.commons.math3.complex.Complex complex34 = complex32.tan();
        org.apache.commons.math3.complex.Complex complex36 = complex32.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex37 = complex32.cos();
        org.apache.commons.math3.complex.Complex complex38 = complex32.conjugate();
        org.apache.commons.math3.complex.Complex complex39 = complex17.add(complex38);
        org.apache.commons.math3.complex.Complex complex40 = complex17.cos();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex38", complex1.equals(complex38) ? complex1.hashCode() == complex38.hashCode() : true);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex6 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex7 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double10 = complex9.getImaginary();
        org.apache.commons.math3.complex.Complex complex11 = complex9.negate();
        org.apache.commons.math3.complex.Complex complex12 = complex11.reciprocal();
        org.apache.commons.math3.complex.ComplexField complexField13 = complex11.getField();
        org.apache.commons.math3.complex.Complex complex14 = complex11.reciprocal();
        org.apache.commons.math3.complex.Complex complex15 = complex11.log();
        org.apache.commons.math3.complex.Complex complex16 = complex1.pow(complex11);
        boolean boolean17 = complex1.isNaN();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex5 and complex16", complex5.equals(complex16) ? complex5.hashCode() == complex16.hashCode() : true);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tanh();
        org.apache.commons.math3.complex.Complex complex5 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double6 = complex5.getImaginary();
        org.apache.commons.math3.complex.Complex complex7 = complex5.negate();
        org.apache.commons.math3.complex.Complex complex9 = complex7.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex10 = complex9.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList12 = complex9.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex13 = complex9.negate();
        boolean boolean14 = complex1.equals((java.lang.Object) complex13);
        org.apache.commons.math3.complex.Complex complex16 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex17 = complex16.exp();
        org.apache.commons.math3.complex.Complex complex18 = complex16.tanh();
        org.apache.commons.math3.complex.Complex complex19 = complex18.log();
        org.apache.commons.math3.complex.Complex complex20 = complex18.acos();
        org.apache.commons.math3.complex.Complex complex21 = complex20.reciprocal();
        org.apache.commons.math3.complex.Complex complex22 = complex20.exp();
        org.apache.commons.math3.complex.Complex complex23 = complex13.pow(complex20);
        org.apache.commons.math3.complex.Complex complex25 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex26 = complex25.exp();
        double double27 = complex25.getArgument();
        org.apache.commons.math3.complex.Complex complex29 = complex25.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex30 = complex25.exp();
        org.apache.commons.math3.complex.Complex complex32 = complex30.pow((-0.0d));
        double double33 = complex32.abs();
        org.apache.commons.math3.complex.Complex complex34 = complex32.sinh();
        org.apache.commons.math3.complex.Complex complex36 = complex32.divide((double) 0L);
        boolean boolean37 = complex13.equals((java.lang.Object) complex32);
        org.apache.commons.math3.complex.Complex complex38 = complex32.acos();
        org.apache.commons.math3.complex.Complex complex39 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex40 = complex39.exp();
        org.apache.commons.math3.complex.Complex complex41 = complex40.exp();
        org.apache.commons.math3.complex.Complex complex43 = complex41.pow((double) (short) 10);
        org.apache.commons.math3.complex.Complex complex44 = complex41.cosh();
        org.apache.commons.math3.complex.Complex complex46 = complex44.multiply(0.0d);
        org.apache.commons.math3.complex.Complex complex48 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double49 = complex48.getImaginary();
        org.apache.commons.math3.complex.Complex complex50 = complex48.negate();
        org.apache.commons.math3.complex.Complex complex52 = complex50.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex53 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex54 = complex50.subtract(complex53);
        org.apache.commons.math3.complex.Complex complex55 = complex50.asin();
        org.apache.commons.math3.complex.Complex complex56 = complex50.cosh();
        org.apache.commons.math3.complex.Complex complex57 = complex46.pow(complex50);
        org.apache.commons.math3.complex.Complex complex58 = complex46.reciprocal();
        boolean boolean59 = complex32.equals((java.lang.Object) complex58);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex38 and complex53", complex38.equals(complex53) ? complex38.hashCode() == complex53.hashCode() : true);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex3 = complex1.subtract((double) (-1));
        org.apache.commons.math3.complex.Complex complex5 = complex1.multiply((double) 10L);
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex8 = complex7.exp();
        org.apache.commons.math3.complex.Complex complex9 = complex7.tanh();
        org.apache.commons.math3.complex.Complex complex10 = complex9.log();
        org.apache.commons.math3.complex.Complex complex11 = complex9.acos();
        org.apache.commons.math3.complex.Complex complex12 = complex5.pow(complex11);
        org.apache.commons.math3.complex.Complex complex13 = complex11.sqrt();
        org.apache.commons.math3.complex.Complex complex15 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double16 = complex15.getImaginary();
        org.apache.commons.math3.complex.Complex complex17 = complex15.negate();
        org.apache.commons.math3.complex.Complex complex19 = complex17.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex21 = complex17.pow((double) 100L);
        org.apache.commons.math3.complex.Complex complex22 = complex21.sqrt();
        org.apache.commons.math3.complex.Complex complex23 = complex13.add(complex22);
        org.apache.commons.math3.complex.Complex complex25 = new org.apache.commons.math3.complex.Complex((double) (-1L));
        org.apache.commons.math3.complex.Complex complex26 = complex25.sqrt();
        org.apache.commons.math3.complex.Complex complex29 = org.apache.commons.math3.complex.Complex.valueOf((double) 100.0f, (double) (short) 1);
        org.apache.commons.math3.complex.Complex complex30 = complex29.acos();
        org.apache.commons.math3.complex.Complex complex31 = complex30.sin();
        org.apache.commons.math3.complex.Complex complex32 = complex25.pow(complex31);
        org.apache.commons.math3.complex.Complex complex35 = new org.apache.commons.math3.complex.Complex((double) 1, (double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex36 = complex35.tanh();
        org.apache.commons.math3.complex.Complex complex37 = complex35.tanh();
        boolean boolean38 = complex25.equals((java.lang.Object) complex37);
        org.apache.commons.math3.complex.Complex complex39 = complex22.multiply(complex25);
        double double40 = complex39.getReal();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex25", complex17.equals(complex25) ? complex17.hashCode() == complex25.hashCode() : true);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex1.sinh();
        org.apache.commons.math3.complex.Complex complex5 = complex4.conjugate();
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double8 = complex7.getImaginary();
        org.apache.commons.math3.complex.Complex complex9 = complex7.negate();
        org.apache.commons.math3.complex.Complex complex10 = complex9.reciprocal();
        org.apache.commons.math3.complex.Complex complex11 = complex9.cosh();
        org.apache.commons.math3.complex.Complex complex13 = complex9.divide((double) 1);
        org.apache.commons.math3.complex.Complex complex14 = complex5.subtract(complex9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex10", complex3.equals(complex10) ? complex3.hashCode() == complex10.hashCode() : true);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
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
        org.apache.commons.math3.complex.Complex complex13 = complex12.cosh();
        org.apache.commons.math3.complex.Complex complex15 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double16 = complex15.getImaginary();
        org.apache.commons.math3.complex.Complex complex17 = complex15.negate();
        org.apache.commons.math3.complex.Complex complex19 = complex17.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex20 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex21 = complex17.subtract(complex20);
        org.apache.commons.math3.complex.Complex complex23 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double24 = complex23.getImaginary();
        org.apache.commons.math3.complex.Complex complex25 = complex23.negate();
        org.apache.commons.math3.complex.Complex complex27 = complex25.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex28 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex29 = complex25.subtract(complex28);
        org.apache.commons.math3.complex.Complex complex30 = complex25.asin();
        org.apache.commons.math3.complex.Complex complex32 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex33 = complex32.exp();
        double double34 = complex32.getArgument();
        org.apache.commons.math3.complex.Complex complex36 = complex32.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex37 = complex32.tanh();
        org.apache.commons.math3.complex.Complex complex38 = complex30.divide(complex37);
        org.apache.commons.math3.complex.Complex complex39 = complex30.conjugate();
        org.apache.commons.math3.complex.Complex complex40 = complex20.subtract(complex39);
        boolean boolean41 = complex12.equals((java.lang.Object) complex20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex30 and complex39", complex30.equals(complex39) ? complex30.hashCode() == complex39.hashCode() : true);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex5.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex9 = complex5.negate();
        boolean boolean10 = complex5.isInfinite();
        org.apache.commons.math3.complex.Complex complex12 = complex5.subtract((double) 1);
        org.apache.commons.math3.complex.Complex complex14 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex15 = complex14.exp();
        double double16 = complex14.getArgument();
        org.apache.commons.math3.complex.Complex complex18 = complex14.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex19 = complex14.exp();
        org.apache.commons.math3.complex.Complex complex20 = complex14.conjugate();
        org.apache.commons.math3.complex.Complex complex22 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex23 = complex22.exp();
        org.apache.commons.math3.complex.Complex complex24 = complex22.tan();
        org.apache.commons.math3.complex.Complex complex26 = complex22.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex27 = complex22.cos();
        double double28 = complex27.getArgument();
        java.lang.String str29 = complex27.toString();
        org.apache.commons.math3.complex.Complex complex31 = complex27.pow((-1.0d));
        org.apache.commons.math3.complex.Complex complex32 = complex20.multiply(complex27);
        org.apache.commons.math3.complex.Complex complex33 = complex12.subtract(complex20);
        org.apache.commons.math3.complex.Complex complex34 = complex20.asin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex33", complex3.equals(complex33) ? complex3.hashCode() == complex33.hashCode() : true);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
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
        org.apache.commons.math3.complex.Complex complex15 = complex14.cos();
        org.apache.commons.math3.complex.Complex complex17 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex18 = complex17.exp();
        double double19 = complex17.getArgument();
        org.apache.commons.math3.complex.Complex complex20 = complex17.log();
        org.apache.commons.math3.complex.Complex complex21 = complex17.log();
        org.apache.commons.math3.complex.Complex complex23 = complex21.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex24 = complex23.exp();
        org.apache.commons.math3.complex.Complex complex25 = complex24.log();
        org.apache.commons.math3.complex.Complex complex27 = complex24.multiply((int) (byte) 0);
        boolean boolean28 = complex15.equals((java.lang.Object) complex24);
        org.apache.commons.math3.complex.Complex complex30 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex31 = complex30.exp();
        double double32 = complex30.getArgument();
        org.apache.commons.math3.complex.Complex complex34 = complex30.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex35 = complex30.exp();
        org.apache.commons.math3.complex.Complex complex36 = complex30.sqrt1z();
        org.apache.commons.math3.complex.Complex complex37 = complex30.acos();
        org.apache.commons.math3.complex.Complex complex38 = complex37.conjugate();
        boolean boolean39 = complex15.equals((java.lang.Object) complex37);
        org.apache.commons.math3.complex.Complex complex40 = complex15.tan();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex13 and complex37", complex13.equals(complex37) ? complex13.hashCode() == complex37.hashCode() : true);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex3.reciprocal();
        org.apache.commons.math3.complex.ComplexField complexField5 = complex3.getField();
        org.apache.commons.math3.complex.Complex complex6 = complex3.sqrt();
        org.apache.commons.math3.complex.Complex complex7 = complex3.log();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList9 = complex7.nthRoot((int) (short) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex4", complex3.equals(complex4) ? complex3.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
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
        double double16 = complex3.getReal();
        org.apache.commons.math3.complex.Complex complex17 = complex3.tanh();
        org.apache.commons.math3.complex.Complex complex19 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex20 = complex19.exp();
        org.apache.commons.math3.complex.Complex complex21 = complex19.tanh();
        org.apache.commons.math3.complex.Complex complex22 = complex3.pow(complex21);
        org.apache.commons.math3.complex.Complex complex23 = complex22.tan();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex4", complex3.equals(complex4) ? complex3.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex3.reciprocal();
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.valueOf(1.557407724654902d, 35.0d);
        org.apache.commons.math3.complex.Complex complex8 = complex3.divide(complex7);
        org.apache.commons.math3.complex.Complex complex9 = complex3.log();
        boolean boolean10 = complex9.isInfinite();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex4", complex3.equals(complex4) ? complex3.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex5 = complex1.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex6 = complex1.cos();
        org.apache.commons.math3.complex.Complex complex7 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex8 = complex1.acos();
        org.apache.commons.math3.complex.Complex complex9 = complex8.cos();
        org.apache.commons.math3.complex.Complex complex10 = complex9.reciprocal();
        boolean boolean11 = complex9.isNaN();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex10", complex1.equals(complex10) ? complex1.hashCode() == complex10.hashCode() : true);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
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
        org.apache.commons.math3.complex.Complex complex16 = complex15.sinh();
        org.apache.commons.math3.complex.Complex complex18 = complex15.pow(0.0d);
        org.apache.commons.math3.complex.Complex complex20 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex21 = complex20.exp();
        double double22 = complex20.getArgument();
        org.apache.commons.math3.complex.Complex complex23 = complex20.log();
        org.apache.commons.math3.complex.Complex complex24 = complex20.log();
        org.apache.commons.math3.complex.Complex complex25 = complex20.acos();
        org.apache.commons.math3.complex.Complex complex27 = complex25.subtract((double) '#');
        org.apache.commons.math3.complex.Complex complex28 = complex15.subtract(complex25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex18", complex1.equals(complex18) ? complex1.hashCode() == complex18.hashCode() : true);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex4.log();
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double8 = complex7.getImaginary();
        org.apache.commons.math3.complex.Complex complex9 = complex7.negate();
        org.apache.commons.math3.complex.Complex complex10 = complex9.reciprocal();
        org.apache.commons.math3.complex.Complex complex12 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex13 = complex12.exp();
        double double14 = complex12.getArgument();
        org.apache.commons.math3.complex.Complex complex16 = complex12.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex17 = complex12.sin();
        org.apache.commons.math3.complex.Complex complex18 = complex12.cosh();
        org.apache.commons.math3.complex.Complex complex19 = complex12.tan();
        org.apache.commons.math3.complex.Complex complex20 = complex12.tan();
        org.apache.commons.math3.complex.Complex complex21 = complex9.add(complex20);
        org.apache.commons.math3.complex.Complex complex23 = complex9.multiply((int) '#');
        org.apache.commons.math3.complex.Complex complex24 = complex5.subtract(complex9);
        java.lang.String str25 = complex5.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex9 and complex10", complex9.equals(complex10) ? complex9.hashCode() == complex10.hashCode() : true);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tanh();
        org.apache.commons.math3.complex.Complex complex5 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double6 = complex5.getImaginary();
        org.apache.commons.math3.complex.Complex complex7 = complex5.negate();
        org.apache.commons.math3.complex.Complex complex9 = complex7.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex10 = complex9.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList12 = complex9.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex13 = complex9.negate();
        boolean boolean14 = complex1.equals((java.lang.Object) complex13);
        org.apache.commons.math3.complex.Complex complex16 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex17 = complex16.exp();
        org.apache.commons.math3.complex.Complex complex18 = complex16.tanh();
        org.apache.commons.math3.complex.Complex complex19 = complex18.log();
        org.apache.commons.math3.complex.Complex complex20 = complex18.acos();
        org.apache.commons.math3.complex.Complex complex21 = complex20.reciprocal();
        org.apache.commons.math3.complex.Complex complex22 = complex20.exp();
        org.apache.commons.math3.complex.Complex complex23 = complex13.pow(complex20);
        org.apache.commons.math3.complex.Complex complex25 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex26 = complex25.exp();
        double double27 = complex25.getArgument();
        org.apache.commons.math3.complex.Complex complex29 = complex25.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex30 = complex25.exp();
        org.apache.commons.math3.complex.Complex complex32 = complex30.pow((-0.0d));
        double double33 = complex32.abs();
        org.apache.commons.math3.complex.Complex complex34 = complex32.sinh();
        org.apache.commons.math3.complex.Complex complex36 = complex32.divide((double) 0L);
        boolean boolean37 = complex13.equals((java.lang.Object) complex32);
        org.apache.commons.math3.complex.Complex complex38 = complex32.acos();
        org.apache.commons.math3.complex.Complex complex40 = complex38.add(0.9171523356672743d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex32", complex1.equals(complex32) ? complex1.hashCode() == complex32.hashCode() : true);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex3.reciprocal();
        org.apache.commons.math3.complex.ComplexField complexField5 = complex3.getField();
        org.apache.commons.math3.complex.Complex complex6 = complex3.reciprocal();
        double double7 = complex3.abs();
        org.apache.commons.math3.complex.Complex complex8 = complex3.cos();
        org.apache.commons.math3.complex.Complex complex10 = complex8.multiply((double) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex4", complex3.equals(complex4) ? complex3.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
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
        double double16 = complex15.getReal();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex4", complex3.equals(complex4) ? complex3.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tanh();
        org.apache.commons.math3.complex.Complex complex4 = complex3.log();
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double7 = complex6.getImaginary();
        org.apache.commons.math3.complex.Complex complex8 = complex6.negate();
        org.apache.commons.math3.complex.Complex complex10 = complex8.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex11 = complex10.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList13 = complex10.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex15 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex16 = complex15.exp();
        org.apache.commons.math3.complex.Complex complex17 = complex15.tanh();
        org.apache.commons.math3.complex.Complex complex18 = complex10.subtract(complex15);
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
        org.apache.commons.math3.complex.Complex complex44 = complex15.subtract(complex41);
        org.apache.commons.math3.complex.Complex complex45 = complex3.divide(complex44);
        org.apache.commons.math3.complex.Complex complex46 = complex45.sqrt1z();
        org.apache.commons.math3.complex.Complex complex47 = complex45.negate();
        org.apache.commons.math3.complex.Complex complex49 = complex45.divide(4.242117536224665d);
        org.apache.commons.math3.complex.Complex complex50 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.ComplexField complexField51 = complex50.getField();
        org.apache.commons.math3.complex.Complex complex52 = complex50.sinh();
        org.apache.commons.math3.complex.Complex complex53 = complex45.divide(complex50);
        org.apache.commons.math3.complex.Complex complex55 = new org.apache.commons.math3.complex.Complex((double) (-1));
        org.apache.commons.math3.complex.Complex complex56 = complex55.atan();
        org.apache.commons.math3.complex.Complex complex57 = complex50.multiply(complex56);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex8 and complex55", complex8.equals(complex55) ? complex8.hashCode() == complex55.hashCode() : true);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tanh();
        org.apache.commons.math3.complex.Complex complex5 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double6 = complex5.getImaginary();
        org.apache.commons.math3.complex.Complex complex7 = complex5.negate();
        org.apache.commons.math3.complex.Complex complex9 = complex7.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex10 = complex9.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList12 = complex9.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex13 = complex9.negate();
        boolean boolean14 = complex1.equals((java.lang.Object) complex13);
        org.apache.commons.math3.complex.Complex complex16 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex17 = complex16.exp();
        org.apache.commons.math3.complex.Complex complex18 = complex16.tanh();
        org.apache.commons.math3.complex.Complex complex19 = complex18.log();
        org.apache.commons.math3.complex.Complex complex20 = complex18.acos();
        org.apache.commons.math3.complex.Complex complex21 = complex20.reciprocal();
        org.apache.commons.math3.complex.Complex complex22 = complex20.exp();
        org.apache.commons.math3.complex.Complex complex23 = complex13.pow(complex20);
        org.apache.commons.math3.complex.Complex complex25 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex26 = complex25.exp();
        double double27 = complex25.getArgument();
        org.apache.commons.math3.complex.Complex complex29 = complex25.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex30 = complex25.exp();
        org.apache.commons.math3.complex.Complex complex32 = complex30.pow((-0.0d));
        double double33 = complex32.abs();
        org.apache.commons.math3.complex.Complex complex34 = complex32.sinh();
        org.apache.commons.math3.complex.Complex complex36 = complex32.divide((double) 0L);
        boolean boolean37 = complex13.equals((java.lang.Object) complex32);
        org.apache.commons.math3.complex.Complex complex38 = complex32.acos();
        org.apache.commons.math3.complex.Complex complex40 = complex38.divide(0.9126365759632116d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex32", complex1.equals(complex32) ? complex1.hashCode() == complex32.hashCode() : true);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.sin();
        org.apache.commons.math3.complex.Complex complex7 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex8 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex9 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex10 = complex9.reciprocal();
        org.apache.commons.math3.complex.Complex complex12 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double13 = complex12.getImaginary();
        org.apache.commons.math3.complex.Complex complex14 = complex12.negate();
        org.apache.commons.math3.complex.Complex complex16 = complex14.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex17 = complex16.atan();
        org.apache.commons.math3.complex.Complex complex18 = complex16.cosh();
        org.apache.commons.math3.complex.Complex complex19 = complex9.multiply(complex16);
        org.apache.commons.math3.complex.Complex complex21 = complex16.pow(35.0d);
        org.apache.commons.math3.complex.Complex complex23 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex24 = complex23.exp();
        double double25 = complex23.getArgument();
        org.apache.commons.math3.complex.Complex complex27 = complex23.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex28 = complex23.sin();
        org.apache.commons.math3.complex.Complex complex29 = complex23.cosh();
        org.apache.commons.math3.complex.Complex complex31 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double32 = complex31.getImaginary();
        boolean boolean33 = complex29.equals((java.lang.Object) double32);
        org.apache.commons.math3.complex.Complex complex34 = complex29.tanh();
        org.apache.commons.math3.complex.Complex complex35 = complex34.asin();
        org.apache.commons.math3.complex.Complex complex36 = complex34.negate();
        double double37 = complex36.abs();
        org.apache.commons.math3.complex.Complex complex38 = complex16.pow(complex36);
        double double39 = complex36.getArgument();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex38", complex1.equals(complex38) ? complex1.hashCode() == complex38.hashCode() : true);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex5 = complex1.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex6 = complex1.cos();
        boolean boolean7 = complex1.isNaN();
        org.apache.commons.math3.complex.Complex complex8 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex9 = complex1.asin();
        org.apache.commons.math3.complex.Complex complex10 = complex9.sin();
        org.apache.commons.math3.complex.Complex complex12 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex13 = complex12.exp();
        double double14 = complex12.getArgument();
        org.apache.commons.math3.complex.Complex complex16 = complex12.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex17 = complex12.sin();
        org.apache.commons.math3.complex.Complex complex18 = complex12.cosh();
        org.apache.commons.math3.complex.Complex complex20 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double21 = complex20.getImaginary();
        boolean boolean22 = complex18.equals((java.lang.Object) double21);
        org.apache.commons.math3.complex.Complex complex23 = complex18.tanh();
        org.apache.commons.math3.complex.Complex complex24 = complex18.sqrt();
        org.apache.commons.math3.complex.Complex complex25 = complex18.tanh();
        org.apache.commons.math3.complex.Complex complex26 = complex18.tanh();
        org.apache.commons.math3.complex.Complex complex27 = complex26.acos();
        org.apache.commons.math3.complex.Complex complex28 = complex10.add(complex27);
        org.apache.commons.math3.complex.Complex complex29 = complex28.log();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex10", complex1.equals(complex10) ? complex1.hashCode() == complex10.hashCode() : true);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf(0.8414709848078965d);
        org.apache.commons.math3.complex.Complex complex2 = complex1.sqrt1z();
        org.apache.commons.math3.complex.Complex complex4 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double5 = complex4.getImaginary();
        org.apache.commons.math3.complex.Complex complex6 = complex4.negate();
        org.apache.commons.math3.complex.Complex complex8 = complex6.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex10 = complex6.subtract(complex9);
        org.apache.commons.math3.complex.Complex complex12 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex13 = complex12.exp();
        org.apache.commons.math3.complex.Complex complex14 = complex12.tan();
        org.apache.commons.math3.complex.Complex complex16 = complex12.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex17 = complex12.cos();
        org.apache.commons.math3.complex.Complex complex18 = complex10.subtract(complex17);
        java.lang.String str19 = complex17.toString();
        org.apache.commons.math3.complex.Complex complex20 = complex17.sqrt1z();
        org.apache.commons.math3.complex.Complex complex22 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex23 = complex22.exp();
        double double24 = complex22.getArgument();
        org.apache.commons.math3.complex.Complex complex26 = complex22.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex27 = complex22.sin();
        org.apache.commons.math3.complex.Complex complex28 = complex22.cosh();
        org.apache.commons.math3.complex.Complex complex29 = complex22.tanh();
        org.apache.commons.math3.complex.Complex complex30 = complex22.log();
        org.apache.commons.math3.complex.Complex complex32 = complex22.add((double) 1);
        org.apache.commons.math3.complex.Complex complex33 = complex17.divide(complex32);
        org.apache.commons.math3.complex.Complex complex34 = complex2.multiply(complex33);
        org.apache.commons.math3.complex.Complex complex35 = complex34.cosh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex17", complex2.equals(complex17) ? complex2.hashCode() == complex17.hashCode() : true);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex3.reciprocal();
        org.apache.commons.math3.complex.Complex complex6 = complex3.divide(100.0d);
        org.apache.commons.math3.complex.Complex complex7 = complex6.cosh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex4", complex3.equals(complex4) ? complex3.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex7 = complex5.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex8 = complex7.exp();
        org.apache.commons.math3.complex.Complex complex10 = complex7.subtract((double) 1);
        org.apache.commons.math3.complex.Complex complex11 = complex7.cos();
        org.apache.commons.math3.complex.Complex complex13 = org.apache.commons.math3.complex.Complex.valueOf((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex14 = complex13.sqrt();
        org.apache.commons.math3.complex.Complex complex15 = complex11.subtract(complex13);
        org.apache.commons.math3.complex.Complex complex17 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex18 = complex17.exp();
        org.apache.commons.math3.complex.Complex complex19 = complex17.tan();
        org.apache.commons.math3.complex.Complex complex21 = complex17.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex22 = complex17.cos();
        org.apache.commons.math3.complex.Complex complex23 = complex17.conjugate();
        org.apache.commons.math3.complex.Complex complex24 = complex15.subtract(complex23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex11", complex1.equals(complex11) ? complex1.hashCode() == complex11.hashCode() : true);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex6 = complex1.acos();
        org.apache.commons.math3.complex.Complex complex7 = complex1.asin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex6", complex4.equals(complex6) ? complex4.hashCode() == complex6.hashCode() : true);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex4 = complex2.pow((double) (short) 10);
        org.apache.commons.math3.complex.Complex complex5 = complex2.cosh();
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double8 = complex7.getImaginary();
        org.apache.commons.math3.complex.Complex complex9 = complex7.negate();
        org.apache.commons.math3.complex.Complex complex10 = complex9.reciprocal();
        org.apache.commons.math3.complex.ComplexField complexField11 = complex9.getField();
        org.apache.commons.math3.complex.Complex complex12 = complex9.sqrt();
        org.apache.commons.math3.complex.Complex complex13 = complex5.multiply(complex12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex9 and complex10", complex9.equals(complex10) ? complex9.hashCode() == complex10.hashCode() : true);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math3.complex.Complex complex5 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex6 = complex5.exp();
        org.apache.commons.math3.complex.Complex complex7 = complex5.tan();
        org.apache.commons.math3.complex.Complex complex9 = complex5.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex11 = complex9.multiply(100);
        org.apache.commons.math3.complex.Complex complex12 = complex2.pow(complex11);
        org.apache.commons.math3.complex.Complex complex14 = complex12.multiply((double) 10);
        org.apache.commons.math3.complex.Complex complex15 = complex14.sin();
        org.apache.commons.math3.complex.Complex complex17 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double18 = complex17.getImaginary();
        org.apache.commons.math3.complex.Complex complex19 = complex17.negate();
        org.apache.commons.math3.complex.Complex complex21 = complex19.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex22 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex23 = complex19.subtract(complex22);
        org.apache.commons.math3.complex.Complex complex25 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex26 = complex25.exp();
        org.apache.commons.math3.complex.Complex complex27 = complex25.tan();
        org.apache.commons.math3.complex.Complex complex29 = complex25.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex30 = complex25.cos();
        org.apache.commons.math3.complex.Complex complex31 = complex23.subtract(complex30);
        org.apache.commons.math3.complex.Complex complex32 = complex23.conjugate();
        org.apache.commons.math3.complex.Complex complex33 = complex15.subtract(complex23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex19 and complex32", complex19.equals(complex32) ? complex19.hashCode() == complex32.hashCode() : true);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex7 = complex5.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex8 = complex7.exp();
        org.apache.commons.math3.complex.Complex complex9 = complex8.log();
        org.apache.commons.math3.complex.Complex complex11 = complex8.multiply((int) (byte) 0);
        org.apache.commons.math3.complex.Complex complex14 = new org.apache.commons.math3.complex.Complex((-2.0d), 35.0d);
        org.apache.commons.math3.complex.Complex complex15 = complex8.multiply(complex14);
        org.apache.commons.math3.complex.Complex complex16 = complex8.tanh();
        org.apache.commons.math3.complex.Complex complex18 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex19 = complex18.exp();
        double double20 = complex18.getArgument();
        org.apache.commons.math3.complex.Complex complex21 = complex18.log();
        org.apache.commons.math3.complex.Complex complex22 = complex18.log();
        org.apache.commons.math3.complex.Complex complex24 = complex22.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex25 = complex24.exp();
        org.apache.commons.math3.complex.Complex complex26 = complex25.log();
        org.apache.commons.math3.complex.Complex complex28 = complex25.multiply((int) (byte) 0);
        org.apache.commons.math3.complex.Complex complex29 = complex28.asin();
        org.apache.commons.math3.complex.Complex complex30 = complex8.add(complex28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex29", complex4.equals(complex29) ? complex4.hashCode() == complex29.hashCode() : true);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math3.complex.Complex complex5 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex6 = complex5.exp();
        org.apache.commons.math3.complex.Complex complex7 = complex5.tan();
        org.apache.commons.math3.complex.Complex complex9 = complex5.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex11 = complex9.multiply(100);
        org.apache.commons.math3.complex.Complex complex12 = complex2.pow(complex11);
        org.apache.commons.math3.complex.Complex complex13 = complex2.cosh();
        org.apache.commons.math3.complex.Complex complex14 = complex2.conjugate();
        org.apache.commons.math3.complex.Complex complex16 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double17 = complex16.getImaginary();
        org.apache.commons.math3.complex.Complex complex18 = complex16.negate();
        org.apache.commons.math3.complex.Complex complex19 = complex16.sinh();
        org.apache.commons.math3.complex.Complex complex21 = complex19.divide((double) 1L);
        org.apache.commons.math3.complex.Complex complex22 = complex2.divide(complex21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex6 and complex14", complex6.equals(complex14) ? complex6.hashCode() == complex14.hashCode() : true);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex3 = complex2.exp();
        org.apache.commons.math3.complex.Complex complex4 = complex2.tan();
        org.apache.commons.math3.complex.Complex complex6 = complex2.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex8 = complex6.multiply(100);
        org.apache.commons.math3.complex.Complex complex9 = complex8.tanh();
        org.apache.commons.math3.complex.Complex complex10 = complex0.subtract(complex9);
        org.apache.commons.math3.complex.Complex complex11 = complex9.sqrt1z();
        org.apache.commons.math3.complex.Complex complex13 = complex11.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex14 = complex11.asin();
        org.apache.commons.math3.complex.Complex complex16 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex17 = complex16.exp();
        org.apache.commons.math3.complex.Complex complex18 = complex16.tanh();
        org.apache.commons.math3.complex.Complex complex19 = complex18.log();
        org.apache.commons.math3.complex.Complex complex20 = complex18.acos();
        org.apache.commons.math3.complex.Complex complex21 = complex20.reciprocal();
        org.apache.commons.math3.complex.Complex complex22 = complex20.exp();
        org.apache.commons.math3.complex.Complex complex23 = complex22.cosh();
        org.apache.commons.math3.complex.Complex complex24 = complex22.tan();
        org.apache.commons.math3.complex.Complex complex26 = complex22.add(263.6733373605274d);
        org.apache.commons.math3.complex.Complex complex28 = complex22.subtract(0.0d);
        org.apache.commons.math3.complex.Complex complex29 = complex11.add(complex22);
        java.lang.String str30 = complex29.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex11 and complex14", complex11.equals(complex14) ? complex11.hashCode() == complex14.hashCode() : true);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.acos();
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex8 = complex7.exp();
        double double9 = complex7.getArgument();
        org.apache.commons.math3.complex.Complex complex10 = complex7.log();
        org.apache.commons.math3.complex.Complex complex11 = complex7.log();
        org.apache.commons.math3.complex.Complex complex12 = complex5.multiply(complex7);
        boolean boolean13 = complex12.isInfinite();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex5", complex4.equals(complex5) ? complex4.hashCode() == complex5.hashCode() : true);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex8 = complex7.exp();
        double double9 = complex7.getArgument();
        org.apache.commons.math3.complex.Complex complex10 = complex7.log();
        org.apache.commons.math3.complex.Complex complex11 = complex5.subtract(complex10);
        org.apache.commons.math3.complex.Complex complex12 = complex5.negate();
        org.apache.commons.math3.complex.Complex complex14 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex15 = complex14.exp();
        double double16 = complex14.getArgument();
        org.apache.commons.math3.complex.Complex complex18 = complex14.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex19 = complex14.sin();
        org.apache.commons.math3.complex.Complex complex20 = complex14.cosh();
        org.apache.commons.math3.complex.Complex complex22 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double23 = complex22.getImaginary();
        boolean boolean24 = complex20.equals((java.lang.Object) double23);
        org.apache.commons.math3.complex.Complex complex25 = complex20.tanh();
        org.apache.commons.math3.complex.Complex complex26 = complex20.sqrt();
        org.apache.commons.math3.complex.Complex complex28 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double29 = complex28.getImaginary();
        org.apache.commons.math3.complex.Complex complex30 = complex28.negate();
        org.apache.commons.math3.complex.Complex complex32 = complex30.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex33 = complex32.atan();
        org.apache.commons.math3.complex.Complex complex35 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex36 = complex35.exp();
        double double37 = complex35.getArgument();
        org.apache.commons.math3.complex.Complex complex39 = complex35.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex40 = complex35.sin();
        org.apache.commons.math3.complex.Complex complex41 = complex35.cosh();
        org.apache.commons.math3.complex.Complex complex43 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double44 = complex43.getImaginary();
        boolean boolean45 = complex41.equals((java.lang.Object) double44);
        org.apache.commons.math3.complex.Complex complex46 = complex41.tanh();
        org.apache.commons.math3.complex.Complex complex47 = complex32.subtract(complex46);
        org.apache.commons.math3.complex.Complex complex48 = complex26.divide(complex46);
        org.apache.commons.math3.complex.Complex complex49 = complex12.divide(complex48);
        org.apache.commons.math3.complex.Complex complex51 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex52 = complex51.exp();
        double double53 = complex51.getArgument();
        org.apache.commons.math3.complex.Complex complex55 = complex51.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex56 = complex51.exp();
        org.apache.commons.math3.complex.Complex complex57 = complex51.exp();
        double double58 = complex57.getReal();
        org.apache.commons.math3.complex.Complex complex59 = complex57.sinh();
        org.apache.commons.math3.complex.Complex complex61 = complex59.subtract((double) 'a');
        org.apache.commons.math3.complex.Complex complex62 = complex61.cosh();
        org.apache.commons.math3.complex.Complex complex63 = complex12.divide(complex62);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex49", complex4.equals(complex49) ? complex4.hashCode() == complex49.hashCode() : true);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex7 = complex3.subtract(complex6);
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex10 = complex9.exp();
        org.apache.commons.math3.complex.Complex complex11 = complex9.tan();
        org.apache.commons.math3.complex.Complex complex13 = complex9.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex14 = complex9.cos();
        org.apache.commons.math3.complex.Complex complex15 = complex7.subtract(complex14);
        org.apache.commons.math3.complex.Complex complex16 = complex7.conjugate();
        double double17 = complex16.abs();
        org.apache.commons.math3.complex.Complex complex18 = complex16.cosh();
        org.apache.commons.math3.complex.Complex complex19 = complex18.sin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex16", complex3.equals(complex16) ? complex3.hashCode() == complex16.hashCode() : true);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex7 = complex3.subtract(complex6);
        org.apache.commons.math3.complex.Complex complex9 = complex3.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex10 = complex3.sin();
        org.apache.commons.math3.complex.Complex complex11 = complex10.conjugate();
        org.apache.commons.math3.complex.Complex complex13 = complex11.pow((double) 1);
        org.apache.commons.math3.complex.Complex complex14 = complex13.reciprocal();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex10 and complex11", complex10.equals(complex11) ? complex10.hashCode() == complex11.hashCode() : true);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex8 = complex7.exp();
        double double9 = complex7.getArgument();
        org.apache.commons.math3.complex.Complex complex10 = complex7.log();
        org.apache.commons.math3.complex.Complex complex11 = complex5.subtract(complex10);
        org.apache.commons.math3.complex.Complex complex12 = complex5.negate();
        org.apache.commons.math3.complex.Complex complex14 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex15 = complex14.exp();
        double double16 = complex14.getArgument();
        org.apache.commons.math3.complex.Complex complex18 = complex14.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex19 = complex14.sin();
        org.apache.commons.math3.complex.Complex complex20 = complex14.cosh();
        org.apache.commons.math3.complex.Complex complex22 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double23 = complex22.getImaginary();
        boolean boolean24 = complex20.equals((java.lang.Object) double23);
        org.apache.commons.math3.complex.Complex complex25 = complex20.tanh();
        org.apache.commons.math3.complex.Complex complex26 = complex20.sqrt();
        org.apache.commons.math3.complex.Complex complex28 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double29 = complex28.getImaginary();
        org.apache.commons.math3.complex.Complex complex30 = complex28.negate();
        org.apache.commons.math3.complex.Complex complex32 = complex30.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex33 = complex32.atan();
        org.apache.commons.math3.complex.Complex complex35 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex36 = complex35.exp();
        double double37 = complex35.getArgument();
        org.apache.commons.math3.complex.Complex complex39 = complex35.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex40 = complex35.sin();
        org.apache.commons.math3.complex.Complex complex41 = complex35.cosh();
        org.apache.commons.math3.complex.Complex complex43 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double44 = complex43.getImaginary();
        boolean boolean45 = complex41.equals((java.lang.Object) double44);
        org.apache.commons.math3.complex.Complex complex46 = complex41.tanh();
        org.apache.commons.math3.complex.Complex complex47 = complex32.subtract(complex46);
        org.apache.commons.math3.complex.Complex complex48 = complex26.divide(complex46);
        org.apache.commons.math3.complex.Complex complex49 = complex12.divide(complex48);
        org.apache.commons.math3.complex.Complex complex50 = complex48.reciprocal();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex49", complex4.equals(complex49) ? complex4.hashCode() == complex49.hashCode() : true);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math3.complex.Complex complex3 = complex1.sqrt();
        org.apache.commons.math3.complex.Complex complex4 = complex3.cosh();
        org.apache.commons.math3.complex.Complex complex6 = complex3.add((double) ' ');
        org.apache.commons.math3.complex.Complex complex7 = complex3.sinh();
        org.apache.commons.math3.complex.Complex complex8 = complex3.reciprocal();
        org.apache.commons.math3.complex.Complex complex9 = complex8.cosh();
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex12 = complex11.exp();
        double double13 = complex11.getArgument();
        org.apache.commons.math3.complex.Complex complex14 = complex11.log();
        org.apache.commons.math3.complex.Complex complex15 = complex11.log();
        org.apache.commons.math3.complex.Complex complex16 = complex11.sin();
        org.apache.commons.math3.complex.Complex complex17 = complex16.reciprocal();
        org.apache.commons.math3.complex.Complex complex19 = complex16.add((double) 1.0f);
        org.apache.commons.math3.complex.Complex complex21 = complex16.divide((double) 1.0f);
        org.apache.commons.math3.complex.Complex complex22 = complex9.divide(complex21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex8", complex1.equals(complex8) ? complex1.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.ComplexField complexField1 = complex0.getField();
        org.apache.commons.math3.complex.Complex complex2 = complex0.sinh();
        org.apache.commons.math3.complex.Complex complex5 = new org.apache.commons.math3.complex.Complex((double) (short) -1, (double) '4');
        org.apache.commons.math3.complex.Complex complex6 = complex5.sinh();
        org.apache.commons.math3.complex.Complex complex7 = complex6.conjugate();
        org.apache.commons.math3.complex.Complex complex8 = complex2.divide(complex7);
        org.apache.commons.math3.complex.Complex complex10 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex11 = complex10.exp();
        double double12 = complex10.getArgument();
        org.apache.commons.math3.complex.Complex complex14 = complex10.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex16 = complex14.divide((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex17 = complex14.asin();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList19 = complex14.nthRoot((int) 'a');
        org.apache.commons.math3.complex.Complex complex22 = new org.apache.commons.math3.complex.Complex((double) 1, (double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex23 = complex22.tanh();
        double double24 = complex22.getImaginary();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList26 = complex22.nthRoot((int) (byte) 10);
        boolean boolean27 = complex14.equals((java.lang.Object) complexList26);
        org.apache.commons.math3.complex.Complex complex28 = complex14.asin();
        org.apache.commons.math3.complex.Complex complex29 = complex14.reciprocal();
        org.apache.commons.math3.complex.Complex complex30 = complex29.tan();
        org.apache.commons.math3.complex.Complex complex31 = complex8.subtract(complex29);
        org.apache.commons.math3.complex.Complex complex32 = complex31.sqrt();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex10 and complex29", complex10.equals(complex29) ? complex10.hashCode() == complex29.hashCode() : true);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
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
        double double16 = complex3.getReal();
        org.apache.commons.math3.complex.Complex complex17 = complex3.tanh();
        org.apache.commons.math3.complex.Complex complex18 = complex17.tan();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex4", complex3.equals(complex4) ? complex3.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex5 = complex1.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex6 = complex1.cos();
        boolean boolean7 = complex1.isNaN();
        org.apache.commons.math3.complex.Complex complex8 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex9 = complex1.asin();
        org.apache.commons.math3.complex.Complex complex10 = complex9.sin();
        org.apache.commons.math3.complex.Complex complex12 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex13 = complex12.exp();
        double double14 = complex12.getArgument();
        org.apache.commons.math3.complex.Complex complex16 = complex12.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex17 = complex12.sin();
        org.apache.commons.math3.complex.Complex complex18 = complex12.cosh();
        org.apache.commons.math3.complex.Complex complex20 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double21 = complex20.getImaginary();
        boolean boolean22 = complex18.equals((java.lang.Object) double21);
        org.apache.commons.math3.complex.Complex complex23 = complex18.tanh();
        org.apache.commons.math3.complex.Complex complex24 = complex18.sqrt();
        org.apache.commons.math3.complex.Complex complex25 = complex18.tanh();
        org.apache.commons.math3.complex.Complex complex26 = complex18.tanh();
        org.apache.commons.math3.complex.Complex complex27 = complex26.acos();
        org.apache.commons.math3.complex.Complex complex28 = complex10.add(complex27);
        org.apache.commons.math3.complex.Complex complex29 = complex27.atan();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex10", complex1.equals(complex10) ? complex1.hashCode() == complex10.hashCode() : true);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex7 = complex1.acos();
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex10 = complex9.exp();
        double double11 = complex9.getArgument();
        org.apache.commons.math3.complex.Complex complex13 = complex9.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex14 = complex9.sin();
        org.apache.commons.math3.complex.Complex complex15 = complex9.cosh();
        org.apache.commons.math3.complex.Complex complex17 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double18 = complex17.getImaginary();
        boolean boolean19 = complex15.equals((java.lang.Object) double18);
        org.apache.commons.math3.complex.Complex complex20 = complex15.tanh();
        org.apache.commons.math3.complex.Complex complex21 = complex15.sqrt();
        org.apache.commons.math3.complex.Complex complex22 = complex15.tanh();
        org.apache.commons.math3.complex.Complex complex24 = complex15.divide((double) '4');
        org.apache.commons.math3.complex.Complex complex25 = complex24.exp();
        org.apache.commons.math3.complex.Complex complex26 = complex25.exp();
        org.apache.commons.math3.complex.Complex complex28 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex29 = complex28.exp();
        double double30 = complex28.getArgument();
        org.apache.commons.math3.complex.Complex complex31 = complex28.log();
        org.apache.commons.math3.complex.Complex complex32 = complex28.log();
        org.apache.commons.math3.complex.Complex complex34 = complex32.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex35 = complex34.exp();
        org.apache.commons.math3.complex.Complex complex37 = complex34.subtract((double) 1);
        org.apache.commons.math3.complex.Complex complex38 = complex25.pow(complex37);
        org.apache.commons.math3.complex.Complex complex40 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex41 = complex40.exp();
        org.apache.commons.math3.complex.Complex complex42 = complex40.tan();
        org.apache.commons.math3.complex.Complex complex44 = complex40.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex45 = complex40.cos();
        org.apache.commons.math3.complex.Complex complex46 = complex40.conjugate();
        org.apache.commons.math3.complex.Complex complex47 = complex25.add(complex46);
        org.apache.commons.math3.complex.Complex complex48 = complex7.add(complex47);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex46", complex1.equals(complex46) ? complex1.hashCode() == complex46.hashCode() : true);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex7 = complex5.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex8 = complex7.exp();
        java.lang.String str9 = complex7.toString();
        org.apache.commons.math3.complex.Complex complex10 = complex7.cos();
        org.apache.commons.math3.complex.Complex complex11 = complex7.sin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex10", complex1.equals(complex10) ? complex1.hashCode() == complex10.hashCode() : true);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
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
        org.apache.commons.math3.complex.Complex complex16 = complex3.acos();
        org.apache.commons.math3.complex.Complex complex18 = new org.apache.commons.math3.complex.Complex((-1.1752011936438014d));
        org.apache.commons.math3.complex.Complex complex19 = complex3.multiply(complex18);
        org.apache.commons.math3.complex.Complex complex20 = complex18.sqrt();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex4", complex3.equals(complex4) ? complex3.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex6 = complex1.sqrt1z();
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
        org.apache.commons.math3.complex.Complex complex30 = complex29.tanh();
        org.apache.commons.math3.complex.Complex complex31 = complex6.divide(complex29);
        org.apache.commons.math3.complex.Complex complex32 = complex29.exp();
        org.apache.commons.math3.complex.Complex complex34 = complex29.subtract((double) '#');
        org.apache.commons.math3.complex.Complex complex35 = complex34.tanh();
        org.apache.commons.math3.complex.Complex complex36 = complex34.sqrt();
        org.apache.commons.math3.complex.Complex complex39 = new org.apache.commons.math3.complex.Complex((double) ' ', 0.0d);
        org.apache.commons.math3.complex.Complex complex40 = complex39.tan();
        org.apache.commons.math3.complex.Complex complex41 = complex34.subtract(complex40);
        org.apache.commons.math3.complex.Complex complex43 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex44 = complex43.exp();
        double double45 = complex43.getArgument();
        org.apache.commons.math3.complex.Complex complex47 = complex43.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex48 = complex43.sin();
        org.apache.commons.math3.complex.Complex complex49 = complex43.cosh();
        org.apache.commons.math3.complex.Complex complex50 = complex43.tan();
        org.apache.commons.math3.complex.Complex complex51 = complex43.tan();
        org.apache.commons.math3.complex.Complex complex53 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex54 = complex53.exp();
        double double55 = complex53.getArgument();
        org.apache.commons.math3.complex.Complex complex57 = complex53.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex58 = complex53.sin();
        org.apache.commons.math3.complex.Complex complex59 = complex53.cosh();
        org.apache.commons.math3.complex.Complex complex60 = complex53.tan();
        org.apache.commons.math3.complex.Complex complex61 = complex53.tan();
        org.apache.commons.math3.complex.Complex complex63 = complex53.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex64 = complex51.subtract(complex53);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList66 = complex64.nthRoot((int) '4');
        org.apache.commons.math3.complex.Complex complex67 = complex64.cos();
        org.apache.commons.math3.complex.Complex complex68 = complex67.asin();
        org.apache.commons.math3.complex.Complex complex69 = complex68.conjugate();
        org.apache.commons.math3.complex.Complex complex71 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double72 = complex71.getImaginary();
        org.apache.commons.math3.complex.Complex complex73 = complex71.negate();
        org.apache.commons.math3.complex.Complex complex75 = complex73.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex76 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex77 = complex73.subtract(complex76);
        org.apache.commons.math3.complex.Complex complex78 = complex68.multiply(complex77);
        org.apache.commons.math3.complex.Complex complex79 = complex40.pow(complex78);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex35 and complex73", complex35.equals(complex73) ? complex35.hashCode() == complex73.hashCode() : true);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex6 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex8 = complex6.pow((-0.0d));
        org.apache.commons.math3.complex.Complex complex10 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex11 = complex10.exp();
        double double12 = complex10.getArgument();
        org.apache.commons.math3.complex.Complex complex13 = complex10.log();
        org.apache.commons.math3.complex.Complex complex14 = complex10.log();
        org.apache.commons.math3.complex.Complex complex15 = complex10.sqrt1z();
        org.apache.commons.math3.complex.Complex complex17 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex18 = complex17.exp();
        double double19 = complex17.getArgument();
        org.apache.commons.math3.complex.Complex complex21 = complex17.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex22 = complex17.sin();
        org.apache.commons.math3.complex.Complex complex23 = complex17.cosh();
        org.apache.commons.math3.complex.Complex complex24 = complex17.tan();
        org.apache.commons.math3.complex.Complex complex25 = complex17.tan();
        org.apache.commons.math3.complex.Complex complex27 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex28 = complex27.exp();
        double double29 = complex27.getArgument();
        org.apache.commons.math3.complex.Complex complex31 = complex27.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex32 = complex27.sin();
        org.apache.commons.math3.complex.Complex complex33 = complex27.cosh();
        org.apache.commons.math3.complex.Complex complex34 = complex27.tan();
        org.apache.commons.math3.complex.Complex complex35 = complex27.tan();
        org.apache.commons.math3.complex.Complex complex37 = complex27.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex38 = complex25.subtract(complex27);
        org.apache.commons.math3.complex.Complex complex39 = complex38.tanh();
        org.apache.commons.math3.complex.Complex complex40 = complex15.divide(complex38);
        org.apache.commons.math3.complex.Complex complex41 = complex38.exp();
        org.apache.commons.math3.complex.Complex complex43 = complex38.subtract((double) '#');
        org.apache.commons.math3.complex.Complex complex44 = complex43.tanh();
        boolean boolean45 = complex8.equals((java.lang.Object) complex44);
        org.apache.commons.math3.complex.Complex complex46 = complex44.cosh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex8", complex1.equals(complex8) ? complex1.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((double) (-1.0f), (double) '#');
        double double3 = complex2.getImaginary();
        org.apache.commons.math3.complex.Complex complex5 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double6 = complex5.getImaginary();
        org.apache.commons.math3.complex.Complex complex7 = complex5.negate();
        org.apache.commons.math3.complex.Complex complex8 = complex7.reciprocal();
        org.apache.commons.math3.complex.Complex complex10 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex11 = complex10.exp();
        double double12 = complex10.getArgument();
        org.apache.commons.math3.complex.Complex complex14 = complex10.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex15 = complex10.sin();
        org.apache.commons.math3.complex.Complex complex16 = complex10.cosh();
        org.apache.commons.math3.complex.Complex complex17 = complex10.tan();
        org.apache.commons.math3.complex.Complex complex18 = complex10.tan();
        org.apache.commons.math3.complex.Complex complex19 = complex7.add(complex18);
        double double20 = complex7.getReal();
        org.apache.commons.math3.complex.Complex complex21 = complex7.tanh();
        org.apache.commons.math3.complex.Complex complex23 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex24 = complex23.exp();
        org.apache.commons.math3.complex.Complex complex25 = complex23.tanh();
        org.apache.commons.math3.complex.Complex complex26 = complex7.pow(complex25);
        boolean boolean27 = complex2.equals((java.lang.Object) complex7);
        org.apache.commons.math3.complex.Complex complex28 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex29 = complex28.exp();
        org.apache.commons.math3.complex.Complex complex30 = complex29.exp();
        org.apache.commons.math3.complex.Complex complex32 = complex30.pow((double) (short) 10);
        org.apache.commons.math3.complex.Complex complex33 = complex7.add(complex30);
        org.apache.commons.math3.complex.Complex complex34 = complex7.tan();
        org.apache.commons.math3.complex.Complex complex35 = complex34.atan();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex7 and complex8", complex7.equals(complex8) ? complex7.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex7 = complex5.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex8 = complex7.exp();
        org.apache.commons.math3.complex.Complex complex10 = complex7.subtract((double) 1);
        org.apache.commons.math3.complex.Complex complex12 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex13 = complex12.exp();
        org.apache.commons.math3.complex.Complex complex14 = complex12.tan();
        org.apache.commons.math3.complex.Complex complex15 = complex7.multiply(complex12);
        org.apache.commons.math3.complex.Complex complex18 = new org.apache.commons.math3.complex.Complex(35.0d, 2.718281828459045d);
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
        org.apache.commons.math3.complex.Complex complex45 = complex44.asin();
        org.apache.commons.math3.complex.Complex complex46 = complex45.conjugate();
        org.apache.commons.math3.complex.Complex complex48 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double49 = complex48.getImaginary();
        org.apache.commons.math3.complex.Complex complex50 = complex48.negate();
        org.apache.commons.math3.complex.Complex complex52 = complex50.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex53 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex54 = complex50.subtract(complex53);
        org.apache.commons.math3.complex.Complex complex55 = complex45.multiply(complex54);
        org.apache.commons.math3.complex.Complex complex56 = complex18.divide(complex55);
        org.apache.commons.math3.complex.Complex complex57 = complex12.divide(complex18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex10 and complex50", complex10.equals(complex50) ? complex10.hashCode() == complex50.hashCode() : true);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex6 = complex1.acos();
        org.apache.commons.math3.complex.Complex complex8 = complex6.subtract((double) '#');
        org.apache.commons.math3.complex.Complex complex10 = complex8.divide(8.414709848078965d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex6", complex4.equals(complex6) ? complex4.hashCode() == complex6.hashCode() : true);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex5.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex9 = complex5.negate();
        boolean boolean10 = complex5.isInfinite();
        org.apache.commons.math3.complex.Complex complex11 = complex5.negate();
        org.apache.commons.math3.complex.Complex complex12 = complex11.negate();
        org.apache.commons.math3.complex.Complex complex13 = complex12.conjugate();
        org.apache.commons.math3.complex.Complex complex14 = complex12.acos();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex13", complex1.equals(complex13) ? complex1.hashCode() == complex13.hashCode() : true);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex3.reciprocal();
        org.apache.commons.math3.complex.Complex complex6 = complex3.divide(100.0d);
        org.apache.commons.math3.complex.Complex complex7 = complex6.negate();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex4", complex3.equals(complex4) ? complex3.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex3 = complex1.divide((double) (short) 100);
        org.apache.commons.math3.complex.Complex complex4 = complex3.sqrt1z();
        org.apache.commons.math3.complex.Complex complex5 = complex3.tan();
        org.apache.commons.math3.complex.Complex complex8 = org.apache.commons.math3.complex.Complex.valueOf(0.0d, (double) (byte) -1);
        org.apache.commons.math3.complex.Complex complex9 = complex3.multiply(complex8);
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double12 = complex11.getImaginary();
        org.apache.commons.math3.complex.Complex complex13 = complex11.negate();
        org.apache.commons.math3.complex.Complex complex15 = complex13.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex16 = complex15.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList18 = complex15.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex20 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex21 = complex20.exp();
        org.apache.commons.math3.complex.Complex complex22 = complex20.tanh();
        org.apache.commons.math3.complex.Complex complex23 = complex15.subtract(complex20);
        org.apache.commons.math3.complex.Complex complex24 = complex15.cos();
        org.apache.commons.math3.complex.Complex complex25 = complex24.tan();
        org.apache.commons.math3.complex.Complex complex26 = complex24.conjugate();
        org.apache.commons.math3.complex.Complex complex27 = complex8.subtract(complex24);
        org.apache.commons.math3.complex.Complex complex29 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex30 = complex29.exp();
        double double31 = complex29.getArgument();
        org.apache.commons.math3.complex.Complex complex33 = complex29.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex34 = complex29.sin();
        org.apache.commons.math3.complex.Complex complex35 = complex29.cosh();
        org.apache.commons.math3.complex.Complex complex37 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double38 = complex37.getImaginary();
        boolean boolean39 = complex35.equals((java.lang.Object) double38);
        org.apache.commons.math3.complex.Complex complex40 = complex35.tanh();
        org.apache.commons.math3.complex.Complex complex41 = complex35.sqrt();
        org.apache.commons.math3.complex.Complex complex42 = complex35.tanh();
        org.apache.commons.math3.complex.Complex complex44 = complex35.multiply((double) '4');
        org.apache.commons.math3.complex.Complex complex45 = complex35.tan();
        org.apache.commons.math3.complex.Complex complex47 = complex45.divide((double) 100);
        boolean boolean48 = complex8.equals((java.lang.Object) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex24 and complex26", complex24.equals(complex26) ? complex24.hashCode() == complex26.hashCode() : true);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
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
        org.apache.commons.math3.complex.Complex complex13 = complex7.sqrt();
        org.apache.commons.math3.complex.Complex complex14 = complex7.tanh();
        org.apache.commons.math3.complex.Complex complex16 = complex7.divide((double) '4');
        org.apache.commons.math3.complex.Complex complex17 = complex16.exp();
        org.apache.commons.math3.complex.Complex complex18 = complex17.exp();
        org.apache.commons.math3.complex.Complex complex20 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex21 = complex20.exp();
        double double22 = complex20.getArgument();
        org.apache.commons.math3.complex.Complex complex23 = complex20.log();
        org.apache.commons.math3.complex.Complex complex24 = complex20.log();
        org.apache.commons.math3.complex.Complex complex26 = complex24.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex27 = complex26.exp();
        org.apache.commons.math3.complex.Complex complex29 = complex26.subtract((double) 1);
        org.apache.commons.math3.complex.Complex complex30 = complex17.pow(complex29);
        org.apache.commons.math3.complex.Complex complex31 = complex30.reciprocal();
        org.apache.commons.math3.complex.Complex complex32 = complex31.sin();
        double double33 = complex32.abs();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex31", complex17.equals(complex31) ? complex17.hashCode() == complex31.hashCode() : true);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.acos();
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex8 = complex7.exp();
        double double9 = complex7.getArgument();
        org.apache.commons.math3.complex.Complex complex10 = complex7.log();
        org.apache.commons.math3.complex.Complex complex11 = complex7.log();
        org.apache.commons.math3.complex.Complex complex12 = complex5.multiply(complex7);
        org.apache.commons.math3.complex.Complex complex14 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex15 = complex14.exp();
        double double16 = complex14.getArgument();
        org.apache.commons.math3.complex.Complex complex18 = complex14.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex19 = complex14.exp();
        org.apache.commons.math3.complex.Complex complex20 = complex5.pow(complex19);
        boolean boolean21 = complex5.isNaN();
        org.apache.commons.math3.complex.Complex complex22 = complex5.acos();
        org.apache.commons.math3.complex.Complex complex23 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex25 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex26 = complex25.exp();
        org.apache.commons.math3.complex.Complex complex27 = complex25.tan();
        org.apache.commons.math3.complex.Complex complex29 = complex25.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex31 = complex29.multiply(100);
        org.apache.commons.math3.complex.Complex complex32 = complex31.tanh();
        org.apache.commons.math3.complex.Complex complex33 = complex23.subtract(complex32);
        org.apache.commons.math3.complex.Complex complex34 = complex32.sqrt1z();
        org.apache.commons.math3.complex.Complex complex36 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex37 = complex36.exp();
        double double38 = complex36.getArgument();
        org.apache.commons.math3.complex.Complex complex40 = complex36.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex41 = complex36.exp();
        org.apache.commons.math3.complex.Complex complex42 = complex41.cosh();
        org.apache.commons.math3.complex.Complex complex43 = complex32.divide(complex42);
        org.apache.commons.math3.complex.Complex complex44 = complex42.cos();
        org.apache.commons.math3.complex.Complex complex45 = complex42.sinh();
        org.apache.commons.math3.complex.Complex complex46 = complex45.exp();
        org.apache.commons.math3.complex.Complex complex47 = complex22.subtract(complex45);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex5", complex4.equals(complex5) ? complex4.hashCode() == complex5.hashCode() : true);
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
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double10 = complex9.getImaginary();
        boolean boolean11 = complex7.equals((java.lang.Object) double10);
        org.apache.commons.math3.complex.Complex complex12 = complex7.tanh();
        org.apache.commons.math3.complex.Complex complex13 = complex7.sqrt();
        org.apache.commons.math3.complex.Complex complex14 = complex7.tanh();
        org.apache.commons.math3.complex.Complex complex16 = complex7.divide((double) '4');
        org.apache.commons.math3.complex.Complex complex17 = complex16.exp();
        org.apache.commons.math3.complex.Complex complex18 = complex17.exp();
        org.apache.commons.math3.complex.Complex complex20 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex21 = complex20.exp();
        double double22 = complex20.getArgument();
        org.apache.commons.math3.complex.Complex complex23 = complex20.log();
        org.apache.commons.math3.complex.Complex complex24 = complex20.log();
        org.apache.commons.math3.complex.Complex complex26 = complex24.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex27 = complex26.exp();
        org.apache.commons.math3.complex.Complex complex29 = complex26.subtract((double) 1);
        org.apache.commons.math3.complex.Complex complex30 = complex17.pow(complex29);
        org.apache.commons.math3.complex.Complex complex31 = complex30.reciprocal();
        org.apache.commons.math3.complex.Complex complex32 = complex31.log();
        org.apache.commons.math3.complex.Complex complex33 = complex32.tanh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex31", complex17.equals(complex31) ? complex17.hashCode() == complex31.hashCode() : true);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
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
        org.apache.commons.math3.complex.Complex complex22 = complex20.pow(Double.NaN);
        org.apache.commons.math3.complex.Complex complex23 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex25 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex26 = complex25.exp();
        org.apache.commons.math3.complex.Complex complex27 = complex25.tan();
        org.apache.commons.math3.complex.Complex complex29 = complex25.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex31 = complex29.multiply(100);
        org.apache.commons.math3.complex.Complex complex32 = complex31.tanh();
        org.apache.commons.math3.complex.Complex complex33 = complex23.subtract(complex32);
        org.apache.commons.math3.complex.Complex complex34 = complex32.sqrt1z();
        org.apache.commons.math3.complex.Complex complex36 = complex34.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex37 = complex34.asin();
        org.apache.commons.math3.complex.Complex complex39 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex40 = complex39.exp();
        org.apache.commons.math3.complex.Complex complex41 = complex39.tanh();
        org.apache.commons.math3.complex.Complex complex42 = complex41.log();
        org.apache.commons.math3.complex.Complex complex43 = complex41.acos();
        org.apache.commons.math3.complex.Complex complex44 = complex43.reciprocal();
        org.apache.commons.math3.complex.Complex complex45 = complex43.exp();
        org.apache.commons.math3.complex.Complex complex46 = complex45.cosh();
        org.apache.commons.math3.complex.Complex complex47 = complex45.tan();
        org.apache.commons.math3.complex.Complex complex49 = complex45.add(263.6733373605274d);
        org.apache.commons.math3.complex.Complex complex51 = complex45.subtract(0.0d);
        org.apache.commons.math3.complex.Complex complex52 = complex34.add(complex45);
        org.apache.commons.math3.complex.Complex complex53 = complex22.add(complex34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex45 and complex52", complex45.equals(complex52) ? complex45.hashCode() == complex52.hashCode() : true);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex5.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex9 = complex5.negate();
        boolean boolean10 = complex5.isInfinite();
        org.apache.commons.math3.complex.Complex complex12 = complex5.subtract((double) 1);
        org.apache.commons.math3.complex.Complex complex14 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex15 = complex14.exp();
        double double16 = complex14.getArgument();
        org.apache.commons.math3.complex.Complex complex18 = complex14.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex19 = complex14.exp();
        org.apache.commons.math3.complex.Complex complex20 = complex14.conjugate();
        org.apache.commons.math3.complex.Complex complex22 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex23 = complex22.exp();
        org.apache.commons.math3.complex.Complex complex24 = complex22.tan();
        org.apache.commons.math3.complex.Complex complex26 = complex22.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex27 = complex22.cos();
        double double28 = complex27.getArgument();
        java.lang.String str29 = complex27.toString();
        org.apache.commons.math3.complex.Complex complex31 = complex27.pow((-1.0d));
        org.apache.commons.math3.complex.Complex complex32 = complex20.multiply(complex27);
        org.apache.commons.math3.complex.Complex complex33 = complex12.subtract(complex20);
        org.apache.commons.math3.complex.Complex complex35 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double36 = complex35.getImaginary();
        org.apache.commons.math3.complex.Complex complex37 = complex35.negate();
        org.apache.commons.math3.complex.Complex complex39 = complex37.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex40 = complex39.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList42 = complex39.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex44 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex45 = complex44.exp();
        org.apache.commons.math3.complex.Complex complex46 = complex44.tanh();
        org.apache.commons.math3.complex.Complex complex47 = complex39.subtract(complex44);
        org.apache.commons.math3.complex.Complex complex48 = complex39.asin();
        org.apache.commons.math3.complex.Complex complex49 = complex48.cos();
        org.apache.commons.math3.complex.Complex complex50 = complex49.cos();
        org.apache.commons.math3.complex.Complex complex51 = complex20.multiply(complex50);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex33", complex3.equals(complex33) ? complex3.hashCode() == complex33.hashCode() : true);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math3.complex.Complex complex3 = complex1.sqrt();
        org.apache.commons.math3.complex.Complex complex4 = complex3.cosh();
        org.apache.commons.math3.complex.Complex complex5 = complex4.exp();
        double double6 = complex4.getImaginary();
        org.apache.commons.math3.complex.Complex complex7 = complex4.log();
        org.apache.commons.math3.complex.Complex complex9 = complex4.multiply(0.009999666686665238d);
        org.apache.commons.math3.complex.Complex complex11 = complex4.add(2.1310198286702864d);
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
        org.apache.commons.math3.complex.Complex complex25 = complex19.sqrt();
        org.apache.commons.math3.complex.Complex complex26 = complex19.tanh();
        org.apache.commons.math3.complex.Complex complex28 = complex19.divide((double) '4');
        org.apache.commons.math3.complex.Complex complex29 = complex28.exp();
        org.apache.commons.math3.complex.Complex complex30 = complex29.exp();
        org.apache.commons.math3.complex.Complex complex32 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex33 = complex32.exp();
        double double34 = complex32.getArgument();
        org.apache.commons.math3.complex.Complex complex35 = complex32.log();
        org.apache.commons.math3.complex.Complex complex36 = complex32.log();
        org.apache.commons.math3.complex.Complex complex38 = complex36.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex39 = complex38.exp();
        org.apache.commons.math3.complex.Complex complex41 = complex38.subtract((double) 1);
        org.apache.commons.math3.complex.Complex complex42 = complex29.pow(complex41);
        org.apache.commons.math3.complex.Complex complex44 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex45 = complex44.exp();
        org.apache.commons.math3.complex.Complex complex46 = complex44.tan();
        org.apache.commons.math3.complex.Complex complex48 = complex44.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex49 = complex44.cos();
        org.apache.commons.math3.complex.Complex complex50 = complex44.conjugate();
        org.apache.commons.math3.complex.Complex complex51 = complex29.add(complex50);
        org.apache.commons.math3.complex.Complex complex52 = complex11.add(complex29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex50", complex1.equals(complex50) ? complex1.hashCode() == complex50.hashCode() : true);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex4 = complex2.pow((double) (short) 10);
        org.apache.commons.math3.complex.Complex complex5 = complex2.cosh();
        org.apache.commons.math3.complex.Complex complex7 = complex5.multiply(0.0d);
        org.apache.commons.math3.complex.Complex complex9 = complex5.multiply((double) '#');
        org.apache.commons.math3.complex.Complex complex10 = complex5.sinh();
        org.apache.commons.math3.complex.Complex complex11 = complex5.log();
        org.apache.commons.math3.complex.Complex complex13 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex14 = complex13.exp();
        double double15 = complex13.getArgument();
        org.apache.commons.math3.complex.Complex complex16 = complex13.log();
        org.apache.commons.math3.complex.Complex complex17 = complex13.log();
        org.apache.commons.math3.complex.Complex complex18 = complex13.sqrt1z();
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
        org.apache.commons.math3.complex.Complex complex42 = complex41.tanh();
        org.apache.commons.math3.complex.Complex complex43 = complex18.divide(complex41);
        org.apache.commons.math3.complex.Complex complex44 = complex41.exp();
        org.apache.commons.math3.complex.Complex complex46 = complex41.subtract((double) '#');
        org.apache.commons.math3.complex.Complex complex47 = complex46.tanh();
        org.apache.commons.math3.complex.Complex complex49 = complex46.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex50 = complex5.add(complex49);
        org.apache.commons.math3.complex.Complex complex52 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double53 = complex52.getImaginary();
        org.apache.commons.math3.complex.Complex complex54 = complex52.negate();
        org.apache.commons.math3.complex.Complex complex56 = complex54.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex57 = complex56.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList59 = complex56.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex60 = complex56.negate();
        double double61 = complex60.getImaginary();
        boolean boolean62 = complex60.isInfinite();
        org.apache.commons.math3.complex.Complex complex63 = complex49.subtract(complex60);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex47 and complex54", complex47.equals(complex54) ? complex47.hashCode() == complex54.hashCode() : true);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf(0.8414709848078965d);
        org.apache.commons.math3.complex.Complex complex2 = complex1.sqrt1z();
        org.apache.commons.math3.complex.Complex complex3 = complex2.conjugate();
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.valueOf(0.0d, (double) (short) -1);
        org.apache.commons.math3.complex.Complex complex7 = complex2.multiply(complex6);
        org.apache.commons.math3.complex.Complex complex8 = complex7.tan();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex3", complex2.equals(complex3) ? complex2.hashCode() == complex3.hashCode() : true);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.sin();
        org.apache.commons.math3.complex.Complex complex8 = complex1.divide((double) (-1L));
        org.apache.commons.math3.complex.Complex complex9 = complex1.negate();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList11 = complex9.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex12 = complex9.conjugate();
        org.apache.commons.math3.complex.Complex complex13 = complex9.atan();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex8 and complex12", complex8.equals(complex12) ? complex8.hashCode() == complex12.hashCode() : true);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex5.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex9 = complex5.negate();
        boolean boolean10 = complex5.isInfinite();
        org.apache.commons.math3.complex.Complex complex11 = complex5.negate();
        org.apache.commons.math3.complex.Complex complex12 = complex11.negate();
        org.apache.commons.math3.complex.Complex complex13 = complex12.conjugate();
        org.apache.commons.math3.complex.Complex complex14 = complex13.sinh();
        org.apache.commons.math3.complex.Complex complex16 = complex14.divide(1.2823540747483578E-16d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex13", complex1.equals(complex13) ? complex1.hashCode() == complex13.hashCode() : true);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
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
        org.apache.commons.math3.complex.Complex complex14 = complex5.acos();
        org.apache.commons.math3.complex.Complex complex15 = complex5.sinh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex13 and complex14", complex13.equals(complex14) ? complex13.hashCode() == complex14.hashCode() : true);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
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
        boolean boolean15 = complex14.isInfinite();
        org.apache.commons.math3.complex.Complex complex16 = complex14.cos();
        org.apache.commons.math3.complex.Complex complex17 = complex14.conjugate();
        org.apache.commons.math3.complex.Complex complex19 = complex17.divide((double) '4');
        org.apache.commons.math3.complex.Complex complex21 = complex19.multiply(2.428308113150743d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex14 and complex17", complex14.equals(complex17) ? complex14.hashCode() == complex17.hashCode() : true);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
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
        org.apache.commons.math3.complex.Complex complex13 = complex12.tan();
        org.apache.commons.math3.complex.Complex complex14 = complex12.cos();
        org.apache.commons.math3.complex.Complex complex16 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex17 = complex16.exp();
        double double18 = complex16.getArgument();
        org.apache.commons.math3.complex.Complex complex20 = complex16.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex21 = complex16.sin();
        org.apache.commons.math3.complex.Complex complex22 = complex16.cosh();
        org.apache.commons.math3.complex.Complex complex24 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double25 = complex24.getImaginary();
        boolean boolean26 = complex22.equals((java.lang.Object) double25);
        org.apache.commons.math3.complex.Complex complex27 = complex22.tanh();
        org.apache.commons.math3.complex.Complex complex28 = complex22.sqrt();
        org.apache.commons.math3.complex.Complex complex29 = complex22.log();
        org.apache.commons.math3.complex.Complex complex30 = complex12.pow(complex22);
        org.apache.commons.math3.complex.Complex complex32 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex33 = complex32.exp();
        double double34 = complex32.getArgument();
        org.apache.commons.math3.complex.Complex complex36 = complex32.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex37 = complex32.sin();
        org.apache.commons.math3.complex.Complex complex38 = complex32.cosh();
        org.apache.commons.math3.complex.Complex complex39 = complex32.tanh();
        org.apache.commons.math3.complex.Complex complex40 = complex32.log();
        org.apache.commons.math3.complex.Complex complex42 = complex32.add((double) 1);
        boolean boolean43 = complex22.equals((java.lang.Object) complex32);
        org.apache.commons.math3.complex.Complex complex45 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex46 = complex45.exp();
        double double47 = complex45.getArgument();
        org.apache.commons.math3.complex.Complex complex49 = complex45.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex50 = complex45.exp();
        org.apache.commons.math3.complex.Complex complex51 = complex50.cosh();
        org.apache.commons.math3.complex.Complex complex53 = complex51.divide((double) (short) 1);
        org.apache.commons.math3.complex.Complex complex55 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex56 = complex55.exp();
        org.apache.commons.math3.complex.Complex complex57 = complex55.tan();
        org.apache.commons.math3.complex.Complex complex59 = complex55.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex60 = complex55.cos();
        org.apache.commons.math3.complex.Complex complex61 = complex55.tan();
        boolean boolean62 = complex51.equals((java.lang.Object) complex55);
        org.apache.commons.math3.complex.Complex complex63 = complex55.tanh();
        boolean boolean64 = complex32.equals((java.lang.Object) complex63);
        org.apache.commons.math3.complex.Complex complex66 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double67 = complex66.getImaginary();
        org.apache.commons.math3.complex.Complex complex68 = complex66.negate();
        org.apache.commons.math3.complex.Complex complex69 = complex68.reciprocal();
        org.apache.commons.math3.complex.Complex complex71 = complex68.divide(100.0d);
        org.apache.commons.math3.complex.Complex complex72 = complex68.conjugate();
        org.apache.commons.math3.complex.Complex complex73 = complex32.subtract(complex72);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex68 and complex69", complex68.equals(complex69) ? complex68.hashCode() == complex69.hashCode() : true);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex7 = complex1.sqrt1z();
        org.apache.commons.math3.complex.Complex complex8 = complex1.acos();
        org.apache.commons.math3.complex.Complex complex9 = complex8.conjugate();
        java.lang.String str10 = complex9.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex7 and complex8", complex7.equals(complex8) ? complex7.hashCode() == complex8.hashCode() : true);
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
        org.apache.commons.math3.complex.Complex complex7 = complex5.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex8 = complex7.exp();
        org.apache.commons.math3.complex.Complex complex10 = complex7.subtract((double) 1);
        org.apache.commons.math3.complex.Complex complex12 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex13 = complex12.exp();
        org.apache.commons.math3.complex.Complex complex14 = complex12.tan();
        org.apache.commons.math3.complex.Complex complex15 = complex7.multiply(complex12);
        org.apache.commons.math3.complex.Complex complex16 = complex7.sqrt1z();
        org.apache.commons.math3.complex.Complex complex17 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex18 = complex17.exp();
        org.apache.commons.math3.complex.Complex complex19 = complex18.exp();
        org.apache.commons.math3.complex.Complex complex21 = complex19.pow((double) (short) 10);
        org.apache.commons.math3.complex.Complex complex22 = complex19.cosh();
        org.apache.commons.math3.complex.Complex complex24 = complex22.multiply(0.0d);
        org.apache.commons.math3.complex.Complex complex26 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double27 = complex26.getImaginary();
        org.apache.commons.math3.complex.Complex complex28 = complex26.negate();
        org.apache.commons.math3.complex.Complex complex30 = complex28.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex31 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex32 = complex28.subtract(complex31);
        org.apache.commons.math3.complex.Complex complex33 = complex28.asin();
        org.apache.commons.math3.complex.Complex complex34 = complex28.cosh();
        org.apache.commons.math3.complex.Complex complex35 = complex24.pow(complex28);
        org.apache.commons.math3.complex.Complex complex36 = complex24.reciprocal();
        org.apache.commons.math3.complex.Complex complex38 = complex36.subtract((double) (byte) 10);
        org.apache.commons.math3.complex.Complex complex41 = new org.apache.commons.math3.complex.Complex(35.0d, 2.718281828459045d);
        org.apache.commons.math3.complex.Complex complex43 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex44 = complex43.exp();
        double double45 = complex43.getArgument();
        org.apache.commons.math3.complex.Complex complex47 = complex43.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex48 = complex43.sin();
        org.apache.commons.math3.complex.Complex complex49 = complex43.cosh();
        org.apache.commons.math3.complex.Complex complex50 = complex43.tan();
        org.apache.commons.math3.complex.Complex complex51 = complex43.tan();
        org.apache.commons.math3.complex.Complex complex53 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex54 = complex53.exp();
        double double55 = complex53.getArgument();
        org.apache.commons.math3.complex.Complex complex57 = complex53.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex58 = complex53.sin();
        org.apache.commons.math3.complex.Complex complex59 = complex53.cosh();
        org.apache.commons.math3.complex.Complex complex60 = complex53.tan();
        org.apache.commons.math3.complex.Complex complex61 = complex53.tan();
        org.apache.commons.math3.complex.Complex complex63 = complex53.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex64 = complex51.subtract(complex53);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList66 = complex64.nthRoot((int) '4');
        org.apache.commons.math3.complex.Complex complex67 = complex64.cos();
        org.apache.commons.math3.complex.Complex complex68 = complex67.asin();
        org.apache.commons.math3.complex.Complex complex69 = complex68.conjugate();
        org.apache.commons.math3.complex.Complex complex71 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double72 = complex71.getImaginary();
        org.apache.commons.math3.complex.Complex complex73 = complex71.negate();
        org.apache.commons.math3.complex.Complex complex75 = complex73.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex76 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex77 = complex73.subtract(complex76);
        org.apache.commons.math3.complex.Complex complex78 = complex68.multiply(complex77);
        org.apache.commons.math3.complex.Complex complex79 = complex41.divide(complex78);
        org.apache.commons.math3.complex.Complex complex80 = complex38.add(complex79);
        org.apache.commons.math3.complex.Complex complex81 = complex7.multiply(complex80);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex10 and complex28", complex10.equals(complex28) ? complex10.hashCode() == complex28.hashCode() : true);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex8 = complex1.multiply(263.6733373605274d);
        org.apache.commons.math3.complex.Complex complex9 = complex1.reciprocal();
        org.apache.commons.math3.complex.Complex complex10 = complex1.sqrt();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex5 and complex9", complex5.equals(complex9) ? complex5.hashCode() == complex9.hashCode() : true);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
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
        org.apache.commons.math3.complex.Complex complex13 = complex7.sqrt();
        org.apache.commons.math3.complex.Complex complex14 = complex7.tanh();
        org.apache.commons.math3.complex.Complex complex16 = complex7.divide((double) '4');
        org.apache.commons.math3.complex.Complex complex17 = complex16.exp();
        org.apache.commons.math3.complex.Complex complex18 = complex17.exp();
        org.apache.commons.math3.complex.Complex complex20 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex21 = complex20.exp();
        double double22 = complex20.getArgument();
        org.apache.commons.math3.complex.Complex complex23 = complex20.log();
        org.apache.commons.math3.complex.Complex complex24 = complex20.log();
        org.apache.commons.math3.complex.Complex complex26 = complex24.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex27 = complex26.exp();
        org.apache.commons.math3.complex.Complex complex29 = complex26.subtract((double) 1);
        org.apache.commons.math3.complex.Complex complex30 = complex17.pow(complex29);
        org.apache.commons.math3.complex.Complex complex31 = complex30.reciprocal();
        org.apache.commons.math3.complex.Complex complex32 = complex31.reciprocal();
        org.apache.commons.math3.complex.Complex complex33 = complex32.sinh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex31", complex17.equals(complex31) ? complex17.hashCode() == complex31.hashCode() : true);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex3 = complex2.exp();
        org.apache.commons.math3.complex.Complex complex4 = complex2.tan();
        org.apache.commons.math3.complex.Complex complex6 = complex2.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex8 = complex6.multiply(100);
        org.apache.commons.math3.complex.Complex complex9 = complex8.tanh();
        org.apache.commons.math3.complex.Complex complex10 = complex0.subtract(complex9);
        org.apache.commons.math3.complex.Complex complex11 = complex9.sqrt1z();
        org.apache.commons.math3.complex.Complex complex13 = complex11.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex14 = complex11.asin();
        org.apache.commons.math3.complex.Complex complex15 = complex11.acos();
        org.apache.commons.math3.complex.Complex complex17 = complex11.add(0.009999666686665238d);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList19 = complex17.nthRoot((int) (byte) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex11 and complex14", complex11.equals(complex14) ? complex11.hashCode() == complex14.hashCode() : true);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex3.reciprocal();
        org.apache.commons.math3.complex.ComplexField complexField5 = complex3.getField();
        org.apache.commons.math3.complex.Complex complex6 = complex3.reciprocal();
        double double7 = complex3.abs();
        org.apache.commons.math3.complex.Complex complex8 = complex3.cos();
        org.apache.commons.math3.complex.Complex complex10 = complex3.subtract((-2.0d));
        org.apache.commons.math3.complex.Complex complex11 = complex10.conjugate();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex4", complex3.equals(complex4) ? complex3.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
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
        org.apache.commons.math3.complex.Complex complex13 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex14 = complex13.exp();
        org.apache.commons.math3.complex.Complex complex15 = complex14.exp();
        org.apache.commons.math3.complex.Complex complex17 = complex15.pow((double) (short) 10);
        org.apache.commons.math3.complex.Complex complex19 = complex15.divide(2.718281828459045d);
        boolean boolean20 = complex7.equals((java.lang.Object) 2.718281828459045d);
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
        org.apache.commons.math3.complex.Complex complex35 = complex26.cos();
        boolean boolean36 = complex35.isInfinite();
        org.apache.commons.math3.complex.Complex complex37 = complex35.cos();
        org.apache.commons.math3.complex.Complex complex38 = complex35.conjugate();
        org.apache.commons.math3.complex.Complex complex39 = complex7.add(complex38);
        org.apache.commons.math3.complex.Complex complex42 = org.apache.commons.math3.complex.Complex.valueOf((double) 100.0f, (double) (short) 1);
        org.apache.commons.math3.complex.Complex complex43 = complex42.acos();
        org.apache.commons.math3.complex.Complex complex44 = complex7.divide(complex43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex35 and complex38", complex35.equals(complex38) ? complex35.hashCode() == complex38.hashCode() : true);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList6 = complex4.nthRoot((int) 'a');
        org.apache.commons.math3.complex.Complex complex7 = complex4.exp();
        org.apache.commons.math3.complex.Complex complex9 = complex4.pow(Double.NaN);
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
        org.apache.commons.math3.complex.Complex complex23 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex24 = complex23.exp();
        org.apache.commons.math3.complex.Complex complex25 = complex24.exp();
        org.apache.commons.math3.complex.Complex complex27 = complex25.pow((double) (short) 10);
        org.apache.commons.math3.complex.Complex complex29 = complex25.divide(2.718281828459045d);
        boolean boolean30 = complex17.equals((java.lang.Object) 2.718281828459045d);
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
        org.apache.commons.math3.complex.Complex complex45 = complex36.cos();
        boolean boolean46 = complex45.isInfinite();
        org.apache.commons.math3.complex.Complex complex47 = complex45.cos();
        org.apache.commons.math3.complex.Complex complex48 = complex45.conjugate();
        org.apache.commons.math3.complex.Complex complex49 = complex17.add(complex48);
        org.apache.commons.math3.complex.Complex complex50 = complex4.add(complex49);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex45 and complex48", complex45.equals(complex48) ? complex45.hashCode() == complex48.hashCode() : true);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
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
        org.apache.commons.math3.complex.Complex complex13 = complex7.sqrt();
        org.apache.commons.math3.complex.Complex complex14 = complex7.tanh();
        org.apache.commons.math3.complex.Complex complex16 = complex7.divide((double) '4');
        org.apache.commons.math3.complex.Complex complex17 = complex16.exp();
        org.apache.commons.math3.complex.Complex complex18 = complex17.exp();
        org.apache.commons.math3.complex.Complex complex20 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex21 = complex20.exp();
        double double22 = complex20.getArgument();
        org.apache.commons.math3.complex.Complex complex23 = complex20.log();
        org.apache.commons.math3.complex.Complex complex24 = complex20.log();
        org.apache.commons.math3.complex.Complex complex26 = complex24.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex27 = complex26.exp();
        org.apache.commons.math3.complex.Complex complex29 = complex26.subtract((double) 1);
        org.apache.commons.math3.complex.Complex complex30 = complex17.pow(complex29);
        org.apache.commons.math3.complex.Complex complex32 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex33 = complex32.exp();
        org.apache.commons.math3.complex.Complex complex34 = complex32.tan();
        org.apache.commons.math3.complex.Complex complex36 = complex32.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex37 = complex32.cos();
        org.apache.commons.math3.complex.Complex complex38 = complex32.conjugate();
        org.apache.commons.math3.complex.Complex complex39 = complex17.add(complex38);
        java.lang.String str40 = complex17.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex38", complex1.equals(complex38) ? complex1.hashCode() == complex38.hashCode() : true);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
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
        org.apache.commons.math3.complex.Complex complex13 = complex7.sqrt();
        org.apache.commons.math3.complex.Complex complex14 = complex7.tanh();
        org.apache.commons.math3.complex.Complex complex16 = complex7.divide((double) '4');
        org.apache.commons.math3.complex.Complex complex17 = complex16.exp();
        org.apache.commons.math3.complex.Complex complex18 = complex17.exp();
        org.apache.commons.math3.complex.Complex complex20 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex21 = complex20.exp();
        double double22 = complex20.getArgument();
        org.apache.commons.math3.complex.Complex complex23 = complex20.log();
        org.apache.commons.math3.complex.Complex complex24 = complex20.log();
        org.apache.commons.math3.complex.Complex complex26 = complex24.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex27 = complex26.exp();
        org.apache.commons.math3.complex.Complex complex29 = complex26.subtract((double) 1);
        org.apache.commons.math3.complex.Complex complex30 = complex17.pow(complex29);
        org.apache.commons.math3.complex.Complex complex31 = complex30.reciprocal();
        org.apache.commons.math3.complex.Complex complex32 = complex31.reciprocal();
        boolean boolean33 = complex32.isNaN();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex31", complex17.equals(complex31) ? complex17.hashCode() == complex31.hashCode() : true);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.sin();
        org.apache.commons.math3.complex.Complex complex7 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex8 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex9 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex10 = complex9.reciprocal();
        org.apache.commons.math3.complex.Complex complex12 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double13 = complex12.getImaginary();
        org.apache.commons.math3.complex.Complex complex14 = complex12.negate();
        org.apache.commons.math3.complex.Complex complex16 = complex14.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex17 = complex16.atan();
        org.apache.commons.math3.complex.Complex complex18 = complex16.cosh();
        org.apache.commons.math3.complex.Complex complex19 = complex9.multiply(complex16);
        org.apache.commons.math3.complex.Complex complex21 = complex16.pow(35.0d);
        org.apache.commons.math3.complex.Complex complex23 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex24 = complex23.exp();
        double double25 = complex23.getArgument();
        org.apache.commons.math3.complex.Complex complex27 = complex23.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex28 = complex23.sin();
        org.apache.commons.math3.complex.Complex complex29 = complex23.cosh();
        org.apache.commons.math3.complex.Complex complex31 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double32 = complex31.getImaginary();
        boolean boolean33 = complex29.equals((java.lang.Object) double32);
        org.apache.commons.math3.complex.Complex complex34 = complex29.tanh();
        org.apache.commons.math3.complex.Complex complex35 = complex34.asin();
        org.apache.commons.math3.complex.Complex complex36 = complex34.negate();
        double double37 = complex36.abs();
        org.apache.commons.math3.complex.Complex complex38 = complex16.pow(complex36);
        org.apache.commons.math3.complex.Complex complex39 = complex16.sin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex38", complex1.equals(complex38) ? complex1.hashCode() == complex38.hashCode() : true);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
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
        boolean boolean15 = complex14.isInfinite();
        org.apache.commons.math3.complex.Complex complex16 = complex14.cos();
        org.apache.commons.math3.complex.Complex complex17 = complex14.conjugate();
        org.apache.commons.math3.complex.Complex complex18 = complex17.sin();
        double double19 = complex18.abs();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex14 and complex17", complex14.equals(complex17) ? complex14.hashCode() == complex17.hashCode() : true);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex5.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex9 = complex5.negate();
        boolean boolean10 = complex5.isInfinite();
        org.apache.commons.math3.complex.Complex complex12 = complex5.subtract((double) 1);
        org.apache.commons.math3.complex.Complex complex14 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex15 = complex14.exp();
        double double16 = complex14.getArgument();
        org.apache.commons.math3.complex.Complex complex18 = complex14.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex19 = complex14.exp();
        org.apache.commons.math3.complex.Complex complex20 = complex14.conjugate();
        org.apache.commons.math3.complex.Complex complex22 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex23 = complex22.exp();
        org.apache.commons.math3.complex.Complex complex24 = complex22.tan();
        org.apache.commons.math3.complex.Complex complex26 = complex22.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex27 = complex22.cos();
        double double28 = complex27.getArgument();
        java.lang.String str29 = complex27.toString();
        org.apache.commons.math3.complex.Complex complex31 = complex27.pow((-1.0d));
        org.apache.commons.math3.complex.Complex complex32 = complex20.multiply(complex27);
        org.apache.commons.math3.complex.Complex complex33 = complex12.subtract(complex20);
        org.apache.commons.math3.complex.Complex complex35 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex36 = complex35.exp();
        org.apache.commons.math3.complex.Complex complex37 = complex35.tan();
        org.apache.commons.math3.complex.Complex complex39 = complex35.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex40 = complex35.cos();
        boolean boolean41 = complex35.isNaN();
        org.apache.commons.math3.complex.Complex complex42 = complex35.cosh();
        org.apache.commons.math3.complex.Complex complex43 = complex42.conjugate();
        org.apache.commons.math3.complex.Complex complex44 = complex12.multiply(complex43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex20", complex1.equals(complex20) ? complex1.hashCode() == complex20.hashCode() : true);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex3.reciprocal();
        org.apache.commons.math3.complex.ComplexField complexField5 = complex3.getField();
        org.apache.commons.math3.complex.Complex complex6 = complex3.reciprocal();
        double double7 = complex3.abs();
        org.apache.commons.math3.complex.Complex complex8 = complex3.cos();
        org.apache.commons.math3.complex.Complex complex9 = complex3.asin();
        org.apache.commons.math3.complex.Complex complex10 = complex3.conjugate();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList12 = complex10.nthRoot((int) (short) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex4", complex3.equals(complex4) ? complex3.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex3.reciprocal();
        org.apache.commons.math3.complex.ComplexField complexField5 = complex3.getField();
        org.apache.commons.math3.complex.Complex complex6 = complex3.reciprocal();
        double double7 = complex3.abs();
        org.apache.commons.math3.complex.Complex complex8 = complex3.cos();
        org.apache.commons.math3.complex.Complex complex9 = complex3.asin();
        org.apache.commons.math3.complex.Complex complex10 = complex3.conjugate();
        org.apache.commons.math3.complex.Complex complex11 = complex10.sin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex4", complex3.equals(complex4) ? complex3.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
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
        boolean boolean18 = complex3.isInfinite();
        org.apache.commons.math3.complex.Complex complex19 = complex3.sqrt();
        org.apache.commons.math3.complex.ComplexField complexField20 = complex19.getField();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex4", complex3.equals(complex4) ? complex3.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
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
        org.apache.commons.math3.complex.Complex complex15 = complex14.cos();
        org.apache.commons.math3.complex.Complex complex16 = complex15.cos();
        org.apache.commons.math3.complex.Complex complex17 = complex15.exp();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex16", complex1.equals(complex16) ? complex1.hashCode() == complex16.hashCode() : true);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.sin();
        org.apache.commons.math3.complex.Complex complex8 = complex1.divide((double) (-1L));
        org.apache.commons.math3.complex.Complex complex9 = complex1.negate();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList11 = complex9.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex12 = complex9.conjugate();
        org.apache.commons.math3.complex.Complex complex13 = complex9.sqrt1z();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex8 and complex12", complex8.equals(complex12) ? complex8.hashCode() == complex12.hashCode() : true);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
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
        org.apache.commons.math3.complex.Complex complex18 = complex17.exp();
        double double19 = complex17.getArgument();
        org.apache.commons.math3.complex.Complex complex21 = complex17.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex22 = complex17.sin();
        org.apache.commons.math3.complex.Complex complex23 = complex17.cosh();
        org.apache.commons.math3.complex.Complex complex24 = complex17.tan();
        org.apache.commons.math3.complex.Complex complex25 = complex17.tan();
        org.apache.commons.math3.complex.Complex complex26 = complex25.reciprocal();
        org.apache.commons.math3.complex.Complex complex28 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double29 = complex28.getImaginary();
        org.apache.commons.math3.complex.Complex complex30 = complex28.negate();
        org.apache.commons.math3.complex.Complex complex32 = complex30.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex33 = complex32.atan();
        org.apache.commons.math3.complex.Complex complex34 = complex32.cosh();
        org.apache.commons.math3.complex.Complex complex35 = complex25.multiply(complex32);
        org.apache.commons.math3.complex.Complex complex36 = complex32.cos();
        org.apache.commons.math3.complex.Complex complex38 = complex36.multiply((double) 10L);
        org.apache.commons.math3.complex.Complex complex39 = complex15.pow(complex38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex4", complex3.equals(complex4) ? complex3.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.sin();
        org.apache.commons.math3.complex.Complex complex7 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex8 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex9 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex10 = complex9.reciprocal();
        org.apache.commons.math3.complex.Complex complex12 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double13 = complex12.getImaginary();
        org.apache.commons.math3.complex.Complex complex14 = complex12.negate();
        org.apache.commons.math3.complex.Complex complex16 = complex14.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex17 = complex16.atan();
        org.apache.commons.math3.complex.Complex complex18 = complex16.cosh();
        org.apache.commons.math3.complex.Complex complex19 = complex9.multiply(complex16);
        org.apache.commons.math3.complex.Complex complex21 = complex16.pow(35.0d);
        org.apache.commons.math3.complex.Complex complex23 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex24 = complex23.exp();
        double double25 = complex23.getArgument();
        org.apache.commons.math3.complex.Complex complex27 = complex23.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex28 = complex23.sin();
        org.apache.commons.math3.complex.Complex complex29 = complex23.cosh();
        org.apache.commons.math3.complex.Complex complex31 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double32 = complex31.getImaginary();
        boolean boolean33 = complex29.equals((java.lang.Object) double32);
        org.apache.commons.math3.complex.Complex complex34 = complex29.tanh();
        org.apache.commons.math3.complex.Complex complex35 = complex34.asin();
        org.apache.commons.math3.complex.Complex complex36 = complex34.negate();
        double double37 = complex36.abs();
        org.apache.commons.math3.complex.Complex complex38 = complex16.pow(complex36);
        org.apache.commons.math3.complex.Complex complex39 = complex36.tanh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex38", complex1.equals(complex38) ? complex1.hashCode() == complex38.hashCode() : true);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math3.complex.Complex complex8 = complex5.multiply((int) (byte) 10);
        org.apache.commons.math3.complex.Complex complex10 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double11 = complex10.getImaginary();
        org.apache.commons.math3.complex.Complex complex12 = complex10.negate();
        org.apache.commons.math3.complex.Complex complex14 = complex12.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex15 = complex14.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList17 = complex14.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex19 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex20 = complex19.exp();
        org.apache.commons.math3.complex.Complex complex21 = complex19.tanh();
        org.apache.commons.math3.complex.Complex complex22 = complex14.subtract(complex19);
        org.apache.commons.math3.complex.Complex complex24 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex25 = complex24.exp();
        double double26 = complex24.getArgument();
        org.apache.commons.math3.complex.Complex complex28 = complex24.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex29 = complex24.sin();
        org.apache.commons.math3.complex.Complex complex30 = complex24.cosh();
        org.apache.commons.math3.complex.Complex complex31 = complex24.tan();
        org.apache.commons.math3.complex.Complex complex32 = complex24.tan();
        org.apache.commons.math3.complex.Complex complex34 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex35 = complex34.exp();
        double double36 = complex34.getArgument();
        org.apache.commons.math3.complex.Complex complex38 = complex34.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex39 = complex34.sin();
        org.apache.commons.math3.complex.Complex complex40 = complex34.cosh();
        org.apache.commons.math3.complex.Complex complex41 = complex34.tan();
        org.apache.commons.math3.complex.Complex complex42 = complex34.tan();
        org.apache.commons.math3.complex.Complex complex44 = complex34.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex45 = complex32.subtract(complex34);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList47 = complex45.nthRoot((int) '4');
        org.apache.commons.math3.complex.Complex complex48 = complex19.subtract(complex45);
        org.apache.commons.math3.complex.Complex complex49 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex51 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex52 = complex51.exp();
        org.apache.commons.math3.complex.Complex complex53 = complex51.tan();
        org.apache.commons.math3.complex.Complex complex55 = complex51.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex57 = complex55.multiply(100);
        org.apache.commons.math3.complex.Complex complex58 = complex57.tanh();
        org.apache.commons.math3.complex.Complex complex59 = complex49.subtract(complex58);
        boolean boolean60 = complex48.equals((java.lang.Object) complex58);
        org.apache.commons.math3.complex.Complex complex62 = complex48.add(10.0d);
        org.apache.commons.math3.complex.Complex complex63 = complex8.pow(complex62);
        org.apache.commons.math3.complex.Complex complex64 = complex8.exp();
        org.apache.commons.math3.complex.Complex complex66 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double67 = complex66.getImaginary();
        org.apache.commons.math3.complex.Complex complex68 = complex66.negate();
        org.apache.commons.math3.complex.Complex complex70 = complex68.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex71 = complex70.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList73 = complex70.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex75 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex76 = complex75.exp();
        org.apache.commons.math3.complex.Complex complex77 = complex75.tanh();
        org.apache.commons.math3.complex.Complex complex78 = complex70.subtract(complex75);
        org.apache.commons.math3.complex.Complex complex79 = complex70.cos();
        boolean boolean80 = complex79.isInfinite();
        org.apache.commons.math3.complex.Complex complex81 = complex79.cos();
        org.apache.commons.math3.complex.Complex complex82 = complex79.conjugate();
        org.apache.commons.math3.complex.Complex complex83 = complex82.sin();
        org.apache.commons.math3.complex.Complex complex84 = complex8.divide(complex83);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex79 and complex82", complex79.equals(complex82) ? complex79.hashCode() == complex82.hashCode() : true);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex7 = complex3.subtract(complex6);
        org.apache.commons.math3.complex.Complex complex9 = complex3.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex10 = complex3.sin();
        org.apache.commons.math3.complex.Complex complex11 = complex10.conjugate();
        org.apache.commons.math3.complex.Complex complex13 = complex11.pow((double) 1);
        org.apache.commons.math3.complex.Complex complex14 = complex13.cos();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex10 and complex11", complex10.equals(complex11) ? complex10.hashCode() == complex11.hashCode() : true);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
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
        org.apache.commons.math3.complex.Complex complex16 = complex3.acos();
        org.apache.commons.math3.complex.Complex complex18 = new org.apache.commons.math3.complex.Complex((-1.1752011936438014d));
        org.apache.commons.math3.complex.Complex complex19 = complex3.multiply(complex18);
        org.apache.commons.math3.complex.Complex complex20 = complex18.conjugate();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex4", complex3.equals(complex4) ? complex3.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.acos();
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex8 = complex7.exp();
        double double9 = complex7.getArgument();
        org.apache.commons.math3.complex.Complex complex10 = complex7.log();
        org.apache.commons.math3.complex.Complex complex11 = complex7.log();
        org.apache.commons.math3.complex.Complex complex12 = complex5.multiply(complex7);
        org.apache.commons.math3.complex.Complex complex14 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex15 = complex14.exp();
        double double16 = complex14.getArgument();
        org.apache.commons.math3.complex.Complex complex18 = complex14.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex19 = complex14.exp();
        org.apache.commons.math3.complex.Complex complex20 = complex5.pow(complex19);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList22 = complex19.nthRoot((int) (byte) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex5", complex4.equals(complex5) ? complex4.hashCode() == complex5.hashCode() : true);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex5 = complex1.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex6 = complex1.cos();
        boolean boolean7 = complex1.isNaN();
        org.apache.commons.math3.complex.Complex complex8 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex9 = complex1.asin();
        org.apache.commons.math3.complex.Complex complex10 = complex9.sin();
        org.apache.commons.math3.complex.Complex complex12 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex13 = complex12.exp();
        double double14 = complex12.getArgument();
        org.apache.commons.math3.complex.Complex complex16 = complex12.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex17 = complex12.sin();
        org.apache.commons.math3.complex.Complex complex18 = complex12.cosh();
        org.apache.commons.math3.complex.Complex complex20 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double21 = complex20.getImaginary();
        boolean boolean22 = complex18.equals((java.lang.Object) double21);
        org.apache.commons.math3.complex.Complex complex23 = complex18.tanh();
        org.apache.commons.math3.complex.Complex complex24 = complex18.sqrt();
        org.apache.commons.math3.complex.Complex complex25 = complex18.tanh();
        org.apache.commons.math3.complex.Complex complex26 = complex18.tanh();
        org.apache.commons.math3.complex.Complex complex27 = complex26.acos();
        org.apache.commons.math3.complex.Complex complex28 = complex10.add(complex27);
        org.apache.commons.math3.complex.Complex complex30 = complex28.multiply((int) (short) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex10", complex1.equals(complex10) ? complex1.hashCode() == complex10.hashCode() : true);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((double) (-1.0f), (double) '#');
        double double3 = complex2.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex6 = complex5.exp();
        double double7 = complex5.getArgument();
        org.apache.commons.math3.complex.Complex complex9 = complex5.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex10 = complex5.sin();
        org.apache.commons.math3.complex.Complex complex11 = complex5.conjugate();
        boolean boolean12 = complex11.isInfinite();
        double double13 = complex11.getArgument();
        java.lang.String str14 = complex11.toString();
        boolean boolean15 = complex2.equals((java.lang.Object) str14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex5 and complex11", complex5.equals(complex11) ? complex5.hashCode() == complex11.hashCode() : true);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex3.reciprocal();
        org.apache.commons.math3.complex.Complex complex5 = complex3.cosh();
        org.apache.commons.math3.complex.Complex complex7 = complex3.divide((double) 1);
        org.apache.commons.math3.complex.Complex complex8 = complex3.log();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex7", complex4.equals(complex7) ? complex4.hashCode() == complex7.hashCode() : true);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
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
        org.apache.commons.math3.complex.Complex complex15 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double16 = complex15.getImaginary();
        org.apache.commons.math3.complex.Complex complex17 = complex15.negate();
        org.apache.commons.math3.complex.Complex complex19 = complex17.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex20 = complex19.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList22 = complex19.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex23 = complex19.negate();
        boolean boolean24 = complex19.isInfinite();
        org.apache.commons.math3.complex.Complex complex25 = complex19.asin();
        org.apache.commons.math3.complex.Complex complex26 = complex25.atan();
        org.apache.commons.math3.complex.Complex complex27 = complex1.divide(complex26);
        org.apache.commons.math3.complex.Complex complex29 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex30 = complex29.asin();
        org.apache.commons.math3.complex.Complex complex32 = complex30.divide(10.0d);
        org.apache.commons.math3.complex.Complex complex33 = complex1.divide(complex30);
        org.apache.commons.math3.complex.Complex complex34 = complex30.negate();
        org.apache.commons.math3.complex.Complex complex35 = complex30.sin();
        org.apache.commons.math3.complex.Complex complex37 = complex30.multiply((-0.5430806348152437d));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex35", complex1.equals(complex35) ? complex1.hashCode() == complex35.hashCode() : true);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
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
        org.apache.commons.math3.complex.Complex complex16 = complex15.tan();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex4", complex3.equals(complex4) ? complex3.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
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
        double double16 = complex3.getReal();
        org.apache.commons.math3.complex.Complex complex18 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex19 = complex18.exp();
        double double20 = complex18.getArgument();
        org.apache.commons.math3.complex.Complex complex21 = complex18.log();
        org.apache.commons.math3.complex.Complex complex22 = complex3.multiply(complex18);
        org.apache.commons.math3.complex.Complex complex23 = complex18.exp();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex4", complex3.equals(complex4) ? complex3.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex((double) 1L);
        org.apache.commons.math3.complex.Complex complex4 = new org.apache.commons.math3.complex.Complex((double) 1.0f, 0.5403023058681398d);
        org.apache.commons.math3.complex.Complex complex5 = complex4.reciprocal();
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double8 = complex7.getImaginary();
        org.apache.commons.math3.complex.Complex complex9 = complex7.negate();
        org.apache.commons.math3.complex.Complex complex11 = complex9.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex12 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex13 = complex9.subtract(complex12);
        org.apache.commons.math3.complex.Complex complex15 = complex9.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex16 = complex9.sin();
        org.apache.commons.math3.complex.Complex complex19 = org.apache.commons.math3.complex.Complex.valueOf((double) ' ', (double) 1L);
        org.apache.commons.math3.complex.Complex complex20 = complex16.add(complex19);
        boolean boolean21 = complex4.equals((java.lang.Object) complex16);
        org.apache.commons.math3.complex.Complex complex22 = complex1.pow(complex16);
        org.apache.commons.math3.complex.Complex complex23 = complex16.tanh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex22", complex1.equals(complex22) ? complex1.hashCode() == complex22.hashCode() : true);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex6 = complex1.sin();
        org.apache.commons.math3.complex.Complex complex7 = complex6.reciprocal();
        org.apache.commons.math3.complex.Complex complex9 = complex6.add((double) 1.0f);
        org.apache.commons.math3.complex.Complex complex11 = complex9.subtract(263.6733373605274d);
        org.apache.commons.math3.complex.Complex complex13 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex14 = complex13.exp();
        double double15 = complex13.getArgument();
        org.apache.commons.math3.complex.Complex complex17 = complex13.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex18 = complex13.sin();
        org.apache.commons.math3.complex.Complex complex19 = complex13.cosh();
        org.apache.commons.math3.complex.Complex complex20 = complex13.tan();
        org.apache.commons.math3.complex.Complex complex21 = complex13.tan();
        org.apache.commons.math3.complex.Complex complex22 = complex21.reciprocal();
        org.apache.commons.math3.complex.Complex complex24 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double25 = complex24.getImaginary();
        org.apache.commons.math3.complex.Complex complex26 = complex24.negate();
        org.apache.commons.math3.complex.Complex complex28 = complex26.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex29 = complex28.atan();
        org.apache.commons.math3.complex.Complex complex30 = complex28.cosh();
        org.apache.commons.math3.complex.Complex complex31 = complex21.multiply(complex28);
        org.apache.commons.math3.complex.Complex complex32 = complex28.log();
        org.apache.commons.math3.complex.Complex complex34 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex35 = complex34.exp();
        double double36 = complex34.getArgument();
        org.apache.commons.math3.complex.Complex complex38 = complex34.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex39 = complex34.sin();
        org.apache.commons.math3.complex.Complex complex40 = complex34.cosh();
        org.apache.commons.math3.complex.Complex complex42 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double43 = complex42.getImaginary();
        boolean boolean44 = complex40.equals((java.lang.Object) double43);
        org.apache.commons.math3.complex.Complex complex45 = complex40.tanh();
        org.apache.commons.math3.complex.Complex complex46 = complex40.sqrt();
        org.apache.commons.math3.complex.Complex complex47 = complex40.tanh();
        org.apache.commons.math3.complex.Complex complex48 = complex40.sqrt();
        org.apache.commons.math3.complex.Complex complex49 = complex28.multiply(complex40);
        org.apache.commons.math3.complex.Complex complex50 = complex40.tanh();
        org.apache.commons.math3.complex.Complex complex51 = complex9.multiply(complex40);
        org.apache.commons.math3.complex.Complex complex53 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex54 = complex53.exp();
        double double55 = complex53.getArgument();
        org.apache.commons.math3.complex.Complex complex56 = complex53.log();
        org.apache.commons.math3.complex.Complex complex57 = complex53.acos();
        org.apache.commons.math3.complex.Complex complex59 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex60 = complex59.exp();
        double double61 = complex59.getArgument();
        org.apache.commons.math3.complex.Complex complex62 = complex59.log();
        org.apache.commons.math3.complex.Complex complex63 = complex59.log();
        org.apache.commons.math3.complex.Complex complex64 = complex57.multiply(complex59);
        org.apache.commons.math3.complex.Complex complex66 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex67 = complex66.exp();
        double double68 = complex66.getArgument();
        org.apache.commons.math3.complex.Complex complex70 = complex66.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex71 = complex66.exp();
        org.apache.commons.math3.complex.Complex complex72 = complex57.pow(complex71);
        boolean boolean73 = complex57.isNaN();
        org.apache.commons.math3.complex.Complex complex74 = complex57.acos();
        org.apache.commons.math3.complex.Complex complex75 = complex57.sqrt();
        org.apache.commons.math3.complex.Complex complex76 = complex9.multiply(complex57);
        double double77 = complex76.getArgument();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex57", complex4.equals(complex57) ? complex4.hashCode() == complex57.hashCode() : true);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.sqrt1z();
        org.apache.commons.math3.complex.Complex complex7 = complex5.conjugate();
        org.apache.commons.math3.complex.Complex complex9 = complex7.multiply((int) (short) -1);
        boolean boolean10 = complex7.isInfinite();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex9", complex3.equals(complex9) ? complex3.hashCode() == complex9.hashCode() : true);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.sin();
        org.apache.commons.math3.complex.Complex complex7 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex8 = complex1.tanh();
        org.apache.commons.math3.complex.Complex complex9 = complex1.log();
        org.apache.commons.math3.complex.Complex complex11 = complex1.add((double) 1);
        org.apache.commons.math3.complex.Complex complex13 = complex1.divide(0.21460183660255172d);
        org.apache.commons.math3.complex.Complex complex14 = complex1.reciprocal();
        org.apache.commons.math3.complex.Complex complex16 = complex1.multiply(1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex5 and complex14", complex5.equals(complex14) ? complex5.hashCode() == complex14.hashCode() : true);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
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
        org.apache.commons.math3.complex.Complex complex13 = complex7.sqrt();
        org.apache.commons.math3.complex.Complex complex14 = complex7.tanh();
        org.apache.commons.math3.complex.Complex complex16 = complex7.divide((double) '4');
        org.apache.commons.math3.complex.Complex complex17 = complex16.exp();
        org.apache.commons.math3.complex.Complex complex18 = complex17.exp();
        org.apache.commons.math3.complex.Complex complex20 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex21 = complex20.exp();
        double double22 = complex20.getArgument();
        org.apache.commons.math3.complex.Complex complex23 = complex20.log();
        org.apache.commons.math3.complex.Complex complex24 = complex20.log();
        org.apache.commons.math3.complex.Complex complex26 = complex24.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex27 = complex26.exp();
        org.apache.commons.math3.complex.Complex complex29 = complex26.subtract((double) 1);
        org.apache.commons.math3.complex.Complex complex30 = complex17.pow(complex29);
        org.apache.commons.math3.complex.Complex complex32 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex33 = complex32.exp();
        org.apache.commons.math3.complex.Complex complex34 = complex32.tan();
        org.apache.commons.math3.complex.Complex complex36 = complex32.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex37 = complex32.cos();
        org.apache.commons.math3.complex.Complex complex38 = complex32.conjugate();
        org.apache.commons.math3.complex.Complex complex39 = complex17.add(complex38);
        org.apache.commons.math3.complex.Complex complex41 = org.apache.commons.math3.complex.Complex.valueOf(0.8414709848078965d);
        org.apache.commons.math3.complex.Complex complex42 = complex41.sqrt1z();
        org.apache.commons.math3.complex.Complex complex43 = complex42.conjugate();
        org.apache.commons.math3.complex.Complex complex44 = complex17.pow(complex43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex38", complex1.equals(complex38) ? complex1.hashCode() == complex38.hashCode() : true);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
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
        boolean boolean15 = complex14.isInfinite();
        org.apache.commons.math3.complex.Complex complex16 = complex14.cos();
        org.apache.commons.math3.complex.Complex complex18 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex19 = complex18.sqrt();
        org.apache.commons.math3.complex.Complex complex21 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double22 = complex21.getImaginary();
        org.apache.commons.math3.complex.Complex complex24 = complex21.pow((double) 100L);
        org.apache.commons.math3.complex.Complex complex25 = complex19.pow(complex24);
        org.apache.commons.math3.complex.Complex complex26 = complex14.multiply(complex25);
        org.apache.commons.math3.complex.Complex complex27 = complex25.tanh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex14 and complex26", complex14.equals(complex26) ? complex14.hashCode() == complex26.hashCode() : true);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((-0.5403023058681398d), 0.0d);
        org.apache.commons.math3.complex.Complex complex4 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex5 = complex4.exp();
        org.apache.commons.math3.complex.Complex complex6 = complex4.tan();
        org.apache.commons.math3.complex.Complex complex8 = complex4.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex9 = complex4.cos();
        org.apache.commons.math3.complex.Complex complex10 = complex4.tan();
        double double11 = complex4.getImaginary();
        org.apache.commons.math3.complex.Complex complex12 = complex4.reciprocal();
        org.apache.commons.math3.complex.Complex complex13 = complex2.add(complex12);
        org.apache.commons.math3.complex.Complex complex15 = new org.apache.commons.math3.complex.Complex((double) (-1L));
        org.apache.commons.math3.complex.Complex complex16 = complex15.reciprocal();
        org.apache.commons.math3.complex.Complex complex17 = complex13.add(complex16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex12", complex4.equals(complex12) ? complex4.hashCode() == complex12.hashCode() : true);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math3.complex.Complex complex3 = complex1.sqrt();
        org.apache.commons.math3.complex.Complex complex4 = complex3.cosh();
        org.apache.commons.math3.complex.Complex complex6 = complex3.add((double) ' ');
        org.apache.commons.math3.complex.Complex complex7 = complex6.exp();
        org.apache.commons.math3.complex.Complex complex9 = complex7.multiply(0);
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double12 = complex11.getImaginary();
        org.apache.commons.math3.complex.Complex complex13 = complex11.negate();
        org.apache.commons.math3.complex.Complex complex15 = complex13.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex16 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex17 = complex13.subtract(complex16);
        org.apache.commons.math3.complex.Complex complex18 = complex13.acos();
        org.apache.commons.math3.complex.Complex complex19 = complex13.log();
        org.apache.commons.math3.complex.Complex complex20 = complex13.negate();
        org.apache.commons.math3.complex.Complex complex21 = complex13.sinh();
        org.apache.commons.math3.complex.Complex complex22 = complex7.add(complex21);
        org.apache.commons.math3.complex.Complex complex23 = complex21.sqrt();
        org.apache.commons.math3.complex.Complex complex25 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double26 = complex25.getImaginary();
        org.apache.commons.math3.complex.Complex complex27 = complex25.negate();
        org.apache.commons.math3.complex.Complex complex28 = complex27.reciprocal();
        org.apache.commons.math3.complex.Complex complex29 = complex27.cosh();
        org.apache.commons.math3.complex.Complex complex31 = complex27.divide((double) 1);
        org.apache.commons.math3.complex.Complex complex32 = complex23.subtract(complex31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex13 and complex28", complex13.equals(complex28) ? complex13.hashCode() == complex28.hashCode() : true);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex6 = complex1.sin();
        org.apache.commons.math3.complex.Complex complex7 = complex6.reciprocal();
        org.apache.commons.math3.complex.Complex complex9 = complex6.add((double) 1.0f);
        org.apache.commons.math3.complex.Complex complex11 = complex9.subtract(263.6733373605274d);
        org.apache.commons.math3.complex.Complex complex13 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex14 = complex13.exp();
        double double15 = complex13.getArgument();
        org.apache.commons.math3.complex.Complex complex17 = complex13.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex18 = complex13.sin();
        org.apache.commons.math3.complex.Complex complex19 = complex13.cosh();
        org.apache.commons.math3.complex.Complex complex20 = complex13.tan();
        org.apache.commons.math3.complex.Complex complex21 = complex13.tan();
        org.apache.commons.math3.complex.Complex complex22 = complex21.reciprocal();
        org.apache.commons.math3.complex.Complex complex24 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double25 = complex24.getImaginary();
        org.apache.commons.math3.complex.Complex complex26 = complex24.negate();
        org.apache.commons.math3.complex.Complex complex28 = complex26.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex29 = complex28.atan();
        org.apache.commons.math3.complex.Complex complex30 = complex28.cosh();
        org.apache.commons.math3.complex.Complex complex31 = complex21.multiply(complex28);
        org.apache.commons.math3.complex.Complex complex32 = complex28.log();
        org.apache.commons.math3.complex.Complex complex34 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex35 = complex34.exp();
        double double36 = complex34.getArgument();
        org.apache.commons.math3.complex.Complex complex38 = complex34.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex39 = complex34.sin();
        org.apache.commons.math3.complex.Complex complex40 = complex34.cosh();
        org.apache.commons.math3.complex.Complex complex42 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double43 = complex42.getImaginary();
        boolean boolean44 = complex40.equals((java.lang.Object) double43);
        org.apache.commons.math3.complex.Complex complex45 = complex40.tanh();
        org.apache.commons.math3.complex.Complex complex46 = complex40.sqrt();
        org.apache.commons.math3.complex.Complex complex47 = complex40.tanh();
        org.apache.commons.math3.complex.Complex complex48 = complex40.sqrt();
        org.apache.commons.math3.complex.Complex complex49 = complex28.multiply(complex40);
        org.apache.commons.math3.complex.Complex complex50 = complex40.tanh();
        org.apache.commons.math3.complex.Complex complex51 = complex9.multiply(complex40);
        org.apache.commons.math3.complex.Complex complex53 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex54 = complex53.exp();
        double double55 = complex53.getArgument();
        org.apache.commons.math3.complex.Complex complex56 = complex53.log();
        org.apache.commons.math3.complex.Complex complex57 = complex53.acos();
        org.apache.commons.math3.complex.Complex complex59 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex60 = complex59.exp();
        double double61 = complex59.getArgument();
        org.apache.commons.math3.complex.Complex complex62 = complex59.log();
        org.apache.commons.math3.complex.Complex complex63 = complex59.log();
        org.apache.commons.math3.complex.Complex complex64 = complex57.multiply(complex59);
        org.apache.commons.math3.complex.Complex complex66 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex67 = complex66.exp();
        double double68 = complex66.getArgument();
        org.apache.commons.math3.complex.Complex complex70 = complex66.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex71 = complex66.exp();
        org.apache.commons.math3.complex.Complex complex72 = complex57.pow(complex71);
        boolean boolean73 = complex57.isNaN();
        org.apache.commons.math3.complex.Complex complex74 = complex57.acos();
        org.apache.commons.math3.complex.Complex complex75 = complex57.sqrt();
        org.apache.commons.math3.complex.Complex complex76 = complex9.multiply(complex57);
        org.apache.commons.math3.complex.Complex complex78 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex79 = complex78.exp();
        org.apache.commons.math3.complex.Complex complex80 = complex78.tanh();
        org.apache.commons.math3.complex.Complex complex81 = complex80.log();
        double double82 = complex81.getImaginary();
        org.apache.commons.math3.complex.Complex complex84 = complex81.add((double) 1.0f);
        org.apache.commons.math3.complex.Complex complex85 = complex84.tan();
        org.apache.commons.math3.complex.Complex complex87 = complex84.divide((-2.0d));
        org.apache.commons.math3.complex.Complex complex88 = complex87.cos();
        org.apache.commons.math3.complex.Complex complex89 = complex76.pow(complex88);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex57", complex4.equals(complex57) ? complex4.hashCode() == complex57.hashCode() : true);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex6 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex8 = complex6.pow((-0.0d));
        org.apache.commons.math3.complex.Complex complex10 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex11 = complex10.exp();
        double double12 = complex10.getArgument();
        org.apache.commons.math3.complex.Complex complex13 = complex10.log();
        org.apache.commons.math3.complex.Complex complex14 = complex10.log();
        org.apache.commons.math3.complex.Complex complex15 = complex10.sqrt1z();
        org.apache.commons.math3.complex.Complex complex17 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex18 = complex17.exp();
        double double19 = complex17.getArgument();
        org.apache.commons.math3.complex.Complex complex21 = complex17.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex22 = complex17.sin();
        org.apache.commons.math3.complex.Complex complex23 = complex17.cosh();
        org.apache.commons.math3.complex.Complex complex24 = complex17.tan();
        org.apache.commons.math3.complex.Complex complex25 = complex17.tan();
        org.apache.commons.math3.complex.Complex complex27 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex28 = complex27.exp();
        double double29 = complex27.getArgument();
        org.apache.commons.math3.complex.Complex complex31 = complex27.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex32 = complex27.sin();
        org.apache.commons.math3.complex.Complex complex33 = complex27.cosh();
        org.apache.commons.math3.complex.Complex complex34 = complex27.tan();
        org.apache.commons.math3.complex.Complex complex35 = complex27.tan();
        org.apache.commons.math3.complex.Complex complex37 = complex27.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex38 = complex25.subtract(complex27);
        org.apache.commons.math3.complex.Complex complex39 = complex38.tanh();
        org.apache.commons.math3.complex.Complex complex40 = complex15.divide(complex38);
        org.apache.commons.math3.complex.Complex complex41 = complex38.exp();
        org.apache.commons.math3.complex.Complex complex43 = complex38.subtract((double) '#');
        org.apache.commons.math3.complex.Complex complex44 = complex43.tanh();
        boolean boolean45 = complex8.equals((java.lang.Object) complex44);
        org.apache.commons.math3.complex.Complex complex47 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex48 = complex47.exp();
        double double49 = complex47.getArgument();
        org.apache.commons.math3.complex.Complex complex50 = complex47.log();
        org.apache.commons.math3.complex.ComplexField complexField51 = complex47.getField();
        boolean boolean52 = complex47.isNaN();
        boolean boolean53 = complex47.isNaN();
        org.apache.commons.math3.complex.Complex complex54 = complex47.asin();
        org.apache.commons.math3.complex.Complex complex55 = complex44.divide(complex47);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex8", complex1.equals(complex8) ? complex1.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex4.log();
        org.apache.commons.math3.complex.Complex complex7 = complex4.add(1.0d);
        double double8 = complex4.getImaginary();
        org.apache.commons.math3.complex.Complex complex10 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex11 = complex10.exp();
        org.apache.commons.math3.complex.Complex complex12 = complex10.tanh();
        org.apache.commons.math3.complex.Complex complex13 = complex12.log();
        org.apache.commons.math3.complex.Complex complex15 = complex12.multiply(10);
        org.apache.commons.math3.complex.Complex complex16 = complex15.conjugate();
        org.apache.commons.math3.complex.Complex complex17 = complex15.tan();
        org.apache.commons.math3.complex.Complex complex18 = complex4.subtract(complex15);
        org.apache.commons.math3.complex.Complex complex19 = complex4.tan();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex15 and complex16", complex15.equals(complex16) ? complex15.hashCode() == complex16.hashCode() : true);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList6 = complex4.nthRoot((int) 'a');
        org.apache.commons.math3.complex.Complex complex7 = complex4.exp();
        org.apache.commons.math3.complex.Complex complex8 = complex7.acos();
        org.apache.commons.math3.complex.Complex complex9 = complex7.atan();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex8", complex4.equals(complex8) ? complex4.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex7 = complex5.divide((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex8 = complex5.asin();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList10 = complex5.nthRoot((int) 'a');
        org.apache.commons.math3.complex.Complex complex13 = new org.apache.commons.math3.complex.Complex((double) 1, (double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex14 = complex13.tanh();
        double double15 = complex13.getImaginary();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList17 = complex13.nthRoot((int) (byte) 10);
        boolean boolean18 = complex5.equals((java.lang.Object) complexList17);
        org.apache.commons.math3.complex.Complex complex19 = complex5.asin();
        org.apache.commons.math3.complex.Complex complex20 = complex5.reciprocal();
        org.apache.commons.math3.complex.Complex complex22 = complex20.pow(2.718281828459045d);
        org.apache.commons.math3.complex.Complex complex23 = complex20.conjugate();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex22", complex1.equals(complex22) ? complex1.hashCode() == complex22.hashCode() : true);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex7 = complex3.subtract(complex6);
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex10 = complex9.exp();
        org.apache.commons.math3.complex.Complex complex11 = complex9.tan();
        org.apache.commons.math3.complex.Complex complex13 = complex9.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex14 = complex9.cos();
        org.apache.commons.math3.complex.Complex complex15 = complex7.subtract(complex14);
        org.apache.commons.math3.complex.Complex complex16 = complex7.conjugate();
        org.apache.commons.math3.complex.Complex complex18 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex19 = complex18.exp();
        org.apache.commons.math3.complex.Complex complex20 = complex18.tanh();
        org.apache.commons.math3.complex.Complex complex21 = complex20.log();
        org.apache.commons.math3.complex.Complex complex22 = complex16.subtract(complex20);
        org.apache.commons.math3.complex.Complex complex23 = complex20.reciprocal();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex16", complex3.equals(complex16) ? complex3.hashCode() == complex16.hashCode() : true);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test278");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex((double) (-1L));
        org.apache.commons.math3.complex.Complex complex2 = complex1.reciprocal();
        org.apache.commons.math3.complex.Complex complex4 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double5 = complex4.getImaginary();
        org.apache.commons.math3.complex.Complex complex6 = complex4.negate();
        org.apache.commons.math3.complex.Complex complex8 = complex6.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex10 = complex6.subtract(complex9);
        org.apache.commons.math3.complex.Complex complex11 = complex6.acos();
        org.apache.commons.math3.complex.Complex complex12 = complex6.log();
        org.apache.commons.math3.complex.Complex complex13 = complex6.sqrt1z();
        org.apache.commons.math3.complex.Complex complex14 = complex1.divide(complex6);
        org.apache.commons.math3.complex.Complex complex15 = complex1.sin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex14", complex4.equals(complex14) ? complex4.hashCode() == complex14.hashCode() : true);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test279");
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
        org.apache.commons.math3.complex.Complex complex13 = complex7.sqrt();
        org.apache.commons.math3.complex.Complex complex14 = complex7.tanh();
        org.apache.commons.math3.complex.Complex complex16 = complex7.divide((double) '4');
        org.apache.commons.math3.complex.Complex complex17 = complex16.exp();
        org.apache.commons.math3.complex.Complex complex18 = complex17.exp();
        org.apache.commons.math3.complex.Complex complex20 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex21 = complex20.exp();
        double double22 = complex20.getArgument();
        org.apache.commons.math3.complex.Complex complex23 = complex20.log();
        org.apache.commons.math3.complex.Complex complex24 = complex20.log();
        org.apache.commons.math3.complex.Complex complex26 = complex24.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex27 = complex26.exp();
        org.apache.commons.math3.complex.Complex complex29 = complex26.subtract((double) 1);
        org.apache.commons.math3.complex.Complex complex30 = complex17.pow(complex29);
        org.apache.commons.math3.complex.Complex complex32 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex33 = complex32.exp();
        org.apache.commons.math3.complex.Complex complex34 = complex32.tan();
        org.apache.commons.math3.complex.Complex complex36 = complex32.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex37 = complex32.cos();
        org.apache.commons.math3.complex.Complex complex38 = complex32.conjugate();
        org.apache.commons.math3.complex.Complex complex39 = complex17.add(complex38);
        org.apache.commons.math3.complex.Complex complex40 = complex39.conjugate();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex38", complex1.equals(complex38) ? complex1.hashCode() == complex38.hashCode() : true);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test280");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex6 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex7 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex10 = complex9.exp();
        org.apache.commons.math3.complex.Complex complex11 = complex9.tan();
        org.apache.commons.math3.complex.Complex complex13 = complex9.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex15 = complex13.multiply(100);
        org.apache.commons.math3.complex.Complex complex17 = complex13.multiply((int) (short) 0);
        org.apache.commons.math3.complex.Complex complex18 = complex1.add(complex17);
        org.apache.commons.math3.complex.Complex complex19 = complex18.tanh();
        org.apache.commons.math3.complex.Complex complex21 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex22 = complex21.exp();
        double double23 = complex21.getArgument();
        org.apache.commons.math3.complex.Complex complex25 = complex21.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex27 = complex21.pow((double) 100.0f);
        org.apache.commons.math3.complex.Complex complex28 = complex27.sin();
        org.apache.commons.math3.complex.Complex complex30 = complex28.subtract((double) 1);
        org.apache.commons.math3.complex.Complex complex32 = complex30.multiply(0.0d);
        double double33 = complex30.getReal();
        org.apache.commons.math3.complex.Complex complex34 = complex19.subtract(complex30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex32", complex17.equals(complex32) ? complex17.hashCode() == complex32.hashCode() : true);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test281");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf(0.0d, (double) (byte) -1);
        org.apache.commons.math3.complex.Complex complex3 = complex2.sinh();
        double double4 = complex2.getReal();
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double7 = complex6.getImaginary();
        org.apache.commons.math3.complex.Complex complex8 = complex6.negate();
        org.apache.commons.math3.complex.Complex complex9 = complex8.reciprocal();
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex12 = complex11.exp();
        double double13 = complex11.getArgument();
        org.apache.commons.math3.complex.Complex complex15 = complex11.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex16 = complex11.sin();
        org.apache.commons.math3.complex.Complex complex17 = complex11.cosh();
        org.apache.commons.math3.complex.Complex complex18 = complex11.tan();
        org.apache.commons.math3.complex.Complex complex19 = complex11.tan();
        org.apache.commons.math3.complex.Complex complex20 = complex8.add(complex19);
        double double21 = complex8.getReal();
        org.apache.commons.math3.complex.Complex complex23 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex24 = complex23.exp();
        double double25 = complex23.getArgument();
        org.apache.commons.math3.complex.Complex complex26 = complex23.log();
        org.apache.commons.math3.complex.Complex complex27 = complex8.multiply(complex23);
        org.apache.commons.math3.complex.Complex complex28 = complex2.add(complex23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex8 and complex9", complex8.equals(complex9) ? complex8.hashCode() == complex9.hashCode() : true);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test282");
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
        org.apache.commons.math3.complex.Complex complex16 = complex14.conjugate();
        org.apache.commons.math3.complex.Complex complex18 = complex14.subtract((double) ' ');
        org.apache.commons.math3.complex.Complex complex19 = complex18.sqrt1z();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex14 and complex16", complex14.equals(complex16) ? complex14.hashCode() == complex16.hashCode() : true);
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
        org.apache.commons.math3.complex.Complex complex8 = complex1.tanh();
        org.apache.commons.math3.complex.Complex complex9 = complex1.log();
        org.apache.commons.math3.complex.Complex complex11 = complex1.add((double) 1);
        org.apache.commons.math3.complex.Complex complex13 = complex1.divide(0.21460183660255172d);
        org.apache.commons.math3.complex.Complex complex14 = complex1.reciprocal();
        org.apache.commons.math3.complex.Complex complex15 = complex1.cos();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex5 and complex14", complex5.equals(complex14) ? complex5.hashCode() == complex14.hashCode() : true);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test284");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.ComplexField complexField1 = complex0.getField();
        org.apache.commons.math3.complex.Complex complex2 = complex0.sinh();
        org.apache.commons.math3.complex.Complex complex5 = new org.apache.commons.math3.complex.Complex((double) (short) -1, (double) '4');
        org.apache.commons.math3.complex.Complex complex6 = complex5.sinh();
        org.apache.commons.math3.complex.Complex complex7 = complex6.conjugate();
        org.apache.commons.math3.complex.Complex complex8 = complex2.divide(complex7);
        org.apache.commons.math3.complex.Complex complex10 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex11 = complex10.exp();
        double double12 = complex10.getArgument();
        org.apache.commons.math3.complex.Complex complex14 = complex10.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex16 = complex14.divide((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex17 = complex14.asin();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList19 = complex14.nthRoot((int) 'a');
        org.apache.commons.math3.complex.Complex complex22 = new org.apache.commons.math3.complex.Complex((double) 1, (double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex23 = complex22.tanh();
        double double24 = complex22.getImaginary();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList26 = complex22.nthRoot((int) (byte) 10);
        boolean boolean27 = complex14.equals((java.lang.Object) complexList26);
        org.apache.commons.math3.complex.Complex complex28 = complex14.asin();
        org.apache.commons.math3.complex.Complex complex29 = complex14.reciprocal();
        org.apache.commons.math3.complex.Complex complex30 = complex29.tan();
        org.apache.commons.math3.complex.Complex complex31 = complex8.subtract(complex29);
        org.apache.commons.math3.complex.Complex complex33 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double34 = complex33.getImaginary();
        org.apache.commons.math3.complex.Complex complex35 = complex33.negate();
        org.apache.commons.math3.complex.Complex complex37 = complex35.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex38 = complex37.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList40 = complex37.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex41 = complex37.negate();
        boolean boolean42 = complex37.isInfinite();
        org.apache.commons.math3.complex.Complex complex44 = complex37.subtract((double) 1);
        org.apache.commons.math3.complex.Complex complex45 = complex44.sqrt();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList47 = complex44.nthRoot((int) '4');
        org.apache.commons.math3.complex.Complex complex49 = complex44.subtract((double) (byte) -1);
        org.apache.commons.math3.complex.Complex complex51 = complex44.multiply((int) ' ');
        org.apache.commons.math3.complex.Complex complex53 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double54 = complex53.getImaginary();
        org.apache.commons.math3.complex.Complex complex55 = complex53.negate();
        org.apache.commons.math3.complex.Complex complex57 = complex55.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex58 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex59 = complex55.subtract(complex58);
        org.apache.commons.math3.complex.Complex complex61 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex62 = complex61.exp();
        org.apache.commons.math3.complex.Complex complex63 = complex61.tan();
        org.apache.commons.math3.complex.Complex complex65 = complex61.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex66 = complex61.cos();
        org.apache.commons.math3.complex.Complex complex67 = complex59.subtract(complex66);
        java.lang.String str68 = complex66.toString();
        org.apache.commons.math3.complex.Complex complex69 = complex66.sqrt1z();
        org.apache.commons.math3.complex.Complex complex70 = complex69.cosh();
        org.apache.commons.math3.complex.Complex complex71 = complex69.acos();
        boolean boolean72 = complex51.equals((java.lang.Object) complex69);
        org.apache.commons.math3.complex.Complex complex73 = complex31.pow(complex69);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex10 and complex29", complex10.equals(complex29) ? complex10.hashCode() == complex29.hashCode() : true);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test285");
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
        org.apache.commons.math3.complex.Complex complex13 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex14 = complex13.exp();
        org.apache.commons.math3.complex.Complex complex15 = complex14.exp();
        org.apache.commons.math3.complex.Complex complex17 = complex15.pow((double) (short) 10);
        org.apache.commons.math3.complex.Complex complex19 = complex15.divide(2.718281828459045d);
        boolean boolean20 = complex7.equals((java.lang.Object) 2.718281828459045d);
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
        org.apache.commons.math3.complex.Complex complex35 = complex26.cos();
        boolean boolean36 = complex35.isInfinite();
        org.apache.commons.math3.complex.Complex complex37 = complex35.cos();
        org.apache.commons.math3.complex.Complex complex38 = complex35.conjugate();
        org.apache.commons.math3.complex.Complex complex39 = complex7.add(complex38);
        org.apache.commons.math3.complex.Complex complex41 = complex38.multiply((double) (-1L));
        org.apache.commons.math3.complex.Complex complex42 = complex38.conjugate();
        org.apache.commons.math3.complex.Complex complex43 = complex38.cosh();
        org.apache.commons.math3.complex.Complex complex45 = complex43.pow((-0.999999999999999d));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex35 and complex38", complex35.equals(complex38) ? complex35.hashCode() == complex38.hashCode() : true);
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
        org.apache.commons.math3.complex.Complex complex16 = complex3.acos();
        org.apache.commons.math3.complex.Complex complex17 = complex16.sqrt();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex4", complex3.equals(complex4) ? complex3.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test287");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tanh();
        org.apache.commons.math3.complex.Complex complex4 = complex3.log();
        org.apache.commons.math3.complex.Complex complex5 = complex3.acos();
        org.apache.commons.math3.complex.Complex complex6 = complex3.tanh();
        org.apache.commons.math3.complex.Complex complex7 = complex6.asin();
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex10 = complex9.exp();
        org.apache.commons.math3.complex.Complex complex11 = complex9.tan();
        org.apache.commons.math3.complex.Complex complex13 = complex9.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex14 = complex9.cos();
        org.apache.commons.math3.complex.Complex complex15 = complex9.tan();
        double double16 = complex9.getImaginary();
        org.apache.commons.math3.complex.Complex complex17 = complex9.reciprocal();
        org.apache.commons.math3.complex.Complex complex18 = complex6.pow(complex17);
        java.lang.Class<?> wildcardClass19 = complex6.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex17", complex1.equals(complex17) ? complex1.hashCode() == complex17.hashCode() : true);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test288");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.acos();
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex8 = complex7.exp();
        double double9 = complex7.getArgument();
        org.apache.commons.math3.complex.Complex complex10 = complex7.log();
        org.apache.commons.math3.complex.Complex complex11 = complex7.log();
        org.apache.commons.math3.complex.Complex complex12 = complex5.multiply(complex7);
        org.apache.commons.math3.complex.Complex complex14 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex15 = complex14.exp();
        double double16 = complex14.getArgument();
        org.apache.commons.math3.complex.Complex complex18 = complex14.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex19 = complex14.exp();
        org.apache.commons.math3.complex.Complex complex20 = complex5.pow(complex19);
        org.apache.commons.math3.complex.Complex complex22 = complex20.divide(2.0239010128918022d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex5", complex4.equals(complex5) ? complex4.hashCode() == complex5.hashCode() : true);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test289");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex6 = complex1.sqrt1z();
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
        org.apache.commons.math3.complex.Complex complex30 = complex29.tanh();
        org.apache.commons.math3.complex.Complex complex31 = complex6.divide(complex29);
        org.apache.commons.math3.complex.Complex complex32 = complex29.exp();
        org.apache.commons.math3.complex.Complex complex34 = complex29.subtract((double) '#');
        org.apache.commons.math3.complex.Complex complex35 = complex34.tanh();
        org.apache.commons.math3.complex.Complex complex36 = complex34.sqrt();
        org.apache.commons.math3.complex.Complex complex37 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex39 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex40 = complex39.exp();
        org.apache.commons.math3.complex.Complex complex41 = complex39.tan();
        org.apache.commons.math3.complex.Complex complex43 = complex39.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex45 = complex43.multiply(100);
        org.apache.commons.math3.complex.Complex complex46 = complex45.tanh();
        org.apache.commons.math3.complex.Complex complex47 = complex37.subtract(complex46);
        org.apache.commons.math3.complex.Complex complex48 = complex46.sqrt1z();
        org.apache.commons.math3.complex.Complex complex50 = complex46.divide((double) '#');
        org.apache.commons.math3.complex.Complex complex51 = complex46.negate();
        org.apache.commons.math3.complex.Complex complex52 = complex36.divide(complex51);
        org.apache.commons.math3.complex.Complex complex53 = complex52.cosh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex35 and complex51", complex35.equals(complex51) ? complex35.hashCode() == complex51.hashCode() : true);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test290");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex3 = complex1.subtract((double) (-1));
        org.apache.commons.math3.complex.Complex complex5 = complex1.multiply((double) 10L);
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex8 = complex7.exp();
        org.apache.commons.math3.complex.Complex complex9 = complex7.tanh();
        org.apache.commons.math3.complex.Complex complex10 = complex9.log();
        org.apache.commons.math3.complex.Complex complex11 = complex9.acos();
        org.apache.commons.math3.complex.Complex complex12 = complex5.pow(complex11);
        org.apache.commons.math3.complex.Complex complex13 = complex11.sqrt();
        org.apache.commons.math3.complex.Complex complex14 = complex13.acos();
        org.apache.commons.math3.complex.Complex complex15 = complex13.conjugate();
        double double16 = complex15.getImaginary();
        org.apache.commons.math3.complex.Complex complex17 = complex15.reciprocal();
        org.apache.commons.math3.complex.Complex complex19 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex20 = complex19.exp();
        double double21 = complex19.getArgument();
        org.apache.commons.math3.complex.Complex complex23 = complex19.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex24 = complex19.sin();
        org.apache.commons.math3.complex.Complex complex25 = complex19.cosh();
        org.apache.commons.math3.complex.Complex complex27 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double28 = complex27.getImaginary();
        boolean boolean29 = complex25.equals((java.lang.Object) double28);
        org.apache.commons.math3.complex.Complex complex30 = complex25.tanh();
        org.apache.commons.math3.complex.Complex complex31 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex32 = complex31.exp();
        org.apache.commons.math3.complex.Complex complex33 = complex32.exp();
        org.apache.commons.math3.complex.Complex complex35 = complex33.pow((double) (short) 10);
        org.apache.commons.math3.complex.Complex complex37 = complex33.divide(2.718281828459045d);
        boolean boolean38 = complex25.equals((java.lang.Object) 2.718281828459045d);
        org.apache.commons.math3.complex.Complex complex39 = complex17.divide(complex25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex13 and complex15", complex13.equals(complex15) ? complex13.hashCode() == complex15.hashCode() : true);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test291");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex5.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex9 = complex5.negate();
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex12 = complex11.exp();
        double double13 = complex11.getArgument();
        org.apache.commons.math3.complex.Complex complex15 = complex11.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex16 = complex11.sin();
        org.apache.commons.math3.complex.Complex complex17 = complex11.cosh();
        boolean boolean18 = complex9.equals((java.lang.Object) complex11);
        double double19 = complex9.abs();
        org.apache.commons.math3.complex.Complex complex20 = complex9.sqrt1z();
        org.apache.commons.math3.complex.Complex complex21 = complex9.reciprocal();
        org.apache.commons.math3.complex.Complex complex23 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex24 = complex23.exp();
        org.apache.commons.math3.complex.Complex complex25 = complex23.tan();
        org.apache.commons.math3.complex.Complex complex27 = complex23.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex28 = complex23.cos();
        org.apache.commons.math3.complex.Complex complex29 = complex23.tan();
        double double30 = complex23.getImaginary();
        org.apache.commons.math3.complex.Complex complex31 = complex23.reciprocal();
        org.apache.commons.math3.complex.Complex complex32 = complex9.multiply(complex31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex21", complex3.equals(complex21) ? complex3.hashCode() == complex21.hashCode() : true);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test292");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex3.reciprocal();
        org.apache.commons.math3.complex.ComplexField complexField5 = complex3.getField();
        org.apache.commons.math3.complex.Complex complex6 = complex3.reciprocal();
        double double7 = complex3.abs();
        org.apache.commons.math3.complex.Complex complex8 = complex3.cos();
        org.apache.commons.math3.complex.Complex complex9 = complex3.asin();
        org.apache.commons.math3.complex.Complex complex11 = complex9.subtract(7.35006255277802d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex4", complex3.equals(complex4) ? complex3.hashCode() == complex4.hashCode() : true);
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
        org.apache.commons.math3.complex.Complex complex9 = complex5.negate();
        boolean boolean10 = complex5.isInfinite();
        org.apache.commons.math3.complex.Complex complex11 = complex5.negate();
        org.apache.commons.math3.complex.Complex complex12 = complex11.negate();
        org.apache.commons.math3.complex.Complex complex13 = complex11.reciprocal();
        org.apache.commons.math3.complex.Complex complex14 = complex11.atan();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex13", complex3.equals(complex13) ? complex3.hashCode() == complex13.hashCode() : true);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test294");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex((double) (-1L));
        org.apache.commons.math3.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math3.complex.Complex complex5 = org.apache.commons.math3.complex.Complex.valueOf((double) 100.0f, (double) (short) 1);
        org.apache.commons.math3.complex.Complex complex6 = complex5.acos();
        org.apache.commons.math3.complex.Complex complex7 = complex6.sin();
        org.apache.commons.math3.complex.Complex complex8 = complex1.pow(complex7);
        org.apache.commons.math3.complex.Complex complex11 = new org.apache.commons.math3.complex.Complex((double) 1, (double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex12 = complex11.tanh();
        org.apache.commons.math3.complex.Complex complex13 = complex11.tanh();
        boolean boolean14 = complex1.equals((java.lang.Object) complex13);
        org.apache.commons.math3.complex.Complex complex15 = complex13.exp();
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
        org.apache.commons.math3.complex.Complex complex29 = complex23.sqrt();
        org.apache.commons.math3.complex.Complex complex31 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex32 = complex31.exp();
        double double33 = complex31.getArgument();
        org.apache.commons.math3.complex.Complex complex35 = complex31.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex36 = complex31.exp();
        org.apache.commons.math3.complex.Complex complex37 = complex29.divide(complex31);
        org.apache.commons.math3.complex.Complex complex38 = complex31.sinh();
        boolean boolean39 = complex15.equals((java.lang.Object) complex38);
        org.apache.commons.math3.complex.Complex complex41 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double42 = complex41.getImaginary();
        org.apache.commons.math3.complex.Complex complex43 = complex41.negate();
        org.apache.commons.math3.complex.Complex complex45 = complex43.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex46 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex47 = complex43.subtract(complex46);
        org.apache.commons.math3.complex.Complex complex48 = complex43.acos();
        org.apache.commons.math3.complex.Complex complex49 = complex43.log();
        org.apache.commons.math3.complex.Complex complex50 = complex49.sin();
        org.apache.commons.math3.complex.Complex complex52 = complex50.divide(0.009999666686665238d);
        org.apache.commons.math3.complex.Complex complex54 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex55 = complex54.exp();
        double double56 = complex54.getArgument();
        org.apache.commons.math3.complex.Complex complex57 = complex54.log();
        org.apache.commons.math3.complex.Complex complex58 = complex54.log();
        org.apache.commons.math3.complex.Complex complex59 = complex54.sqrt1z();
        boolean boolean60 = complex54.isNaN();
        org.apache.commons.math3.complex.Complex complex62 = complex54.subtract((double) '#');
        org.apache.commons.math3.complex.Complex complex63 = complex62.atan();
        org.apache.commons.math3.complex.Complex complex64 = complex62.log();
        org.apache.commons.math3.complex.Complex complex65 = complex52.add(complex62);
        org.apache.commons.math3.complex.Complex complex66 = complex15.subtract(complex62);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex43", complex1.equals(complex43) ? complex1.hashCode() == complex43.hashCode() : true);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test295");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tanh();
        org.apache.commons.math3.complex.Complex complex5 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double6 = complex5.getImaginary();
        org.apache.commons.math3.complex.Complex complex7 = complex5.negate();
        org.apache.commons.math3.complex.Complex complex9 = complex7.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex10 = complex9.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList12 = complex9.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex13 = complex9.negate();
        boolean boolean14 = complex1.equals((java.lang.Object) complex13);
        org.apache.commons.math3.complex.Complex complex16 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex17 = complex16.exp();
        org.apache.commons.math3.complex.Complex complex18 = complex16.tanh();
        org.apache.commons.math3.complex.Complex complex19 = complex18.log();
        org.apache.commons.math3.complex.Complex complex20 = complex18.acos();
        org.apache.commons.math3.complex.Complex complex21 = complex20.reciprocal();
        org.apache.commons.math3.complex.Complex complex22 = complex20.exp();
        org.apache.commons.math3.complex.Complex complex23 = complex13.pow(complex20);
        org.apache.commons.math3.complex.Complex complex25 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex26 = complex25.exp();
        double double27 = complex25.getArgument();
        org.apache.commons.math3.complex.Complex complex29 = complex25.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex30 = complex25.exp();
        org.apache.commons.math3.complex.Complex complex32 = complex30.pow((-0.0d));
        double double33 = complex32.abs();
        org.apache.commons.math3.complex.Complex complex34 = complex32.sinh();
        org.apache.commons.math3.complex.Complex complex36 = complex32.divide((double) 0L);
        boolean boolean37 = complex13.equals((java.lang.Object) complex32);
        org.apache.commons.math3.complex.Complex complex39 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double40 = complex39.getImaginary();
        org.apache.commons.math3.complex.Complex complex41 = complex39.negate();
        org.apache.commons.math3.complex.Complex complex43 = complex41.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex44 = complex43.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList46 = complex43.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex47 = complex43.log();
        org.apache.commons.math3.complex.Complex complex49 = complex43.multiply((-1.0d));
        boolean boolean50 = complex13.equals((java.lang.Object) complex43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex32", complex1.equals(complex32) ? complex1.hashCode() == complex32.hashCode() : true);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test296");
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
        org.apache.commons.math3.complex.Complex complex13 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex14 = complex13.exp();
        org.apache.commons.math3.complex.Complex complex15 = complex14.exp();
        org.apache.commons.math3.complex.Complex complex17 = complex15.pow((double) (short) 10);
        org.apache.commons.math3.complex.Complex complex19 = complex15.divide(2.718281828459045d);
        boolean boolean20 = complex7.equals((java.lang.Object) 2.718281828459045d);
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
        org.apache.commons.math3.complex.Complex complex35 = complex26.cos();
        boolean boolean36 = complex35.isInfinite();
        org.apache.commons.math3.complex.Complex complex37 = complex35.cos();
        org.apache.commons.math3.complex.Complex complex38 = complex35.conjugate();
        org.apache.commons.math3.complex.Complex complex39 = complex7.add(complex38);
        org.apache.commons.math3.complex.Complex complex41 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex42 = complex41.exp();
        org.apache.commons.math3.complex.Complex complex43 = complex41.tanh();
        org.apache.commons.math3.complex.Complex complex45 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex46 = complex45.exp();
        double double47 = complex45.getArgument();
        org.apache.commons.math3.complex.Complex complex49 = complex45.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex50 = complex45.sin();
        org.apache.commons.math3.complex.Complex complex51 = complex45.cosh();
        org.apache.commons.math3.complex.Complex complex53 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double54 = complex53.getImaginary();
        boolean boolean55 = complex51.equals((java.lang.Object) double54);
        org.apache.commons.math3.complex.Complex complex56 = complex41.subtract(complex51);
        org.apache.commons.math3.complex.Complex complex57 = complex56.cosh();
        org.apache.commons.math3.complex.Complex complex59 = complex57.multiply((double) (short) 1);
        org.apache.commons.math3.complex.Complex complex61 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex62 = complex61.exp();
        double double63 = complex61.getArgument();
        org.apache.commons.math3.complex.Complex complex64 = complex61.log();
        org.apache.commons.math3.complex.Complex complex65 = complex61.log();
        org.apache.commons.math3.complex.Complex complex67 = complex65.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex68 = complex67.exp();
        org.apache.commons.math3.complex.Complex complex69 = complex68.log();
        org.apache.commons.math3.complex.Complex complex71 = complex68.multiply((int) (byte) 0);
        org.apache.commons.math3.complex.Complex complex74 = new org.apache.commons.math3.complex.Complex((-2.0d), 35.0d);
        org.apache.commons.math3.complex.Complex complex75 = complex68.multiply(complex74);
        org.apache.commons.math3.complex.Complex complex77 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex78 = complex77.exp();
        double double79 = complex77.getArgument();
        org.apache.commons.math3.complex.Complex complex80 = complex77.log();
        org.apache.commons.math3.complex.Complex complex81 = complex77.log();
        org.apache.commons.math3.complex.Complex complex83 = complex81.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex84 = complex83.exp();
        org.apache.commons.math3.complex.Complex complex86 = complex83.subtract((double) 1);
        org.apache.commons.math3.complex.Complex complex88 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex89 = complex88.exp();
        org.apache.commons.math3.complex.Complex complex90 = complex88.tan();
        org.apache.commons.math3.complex.Complex complex91 = complex83.multiply(complex88);
        org.apache.commons.math3.complex.Complex complex92 = complex75.add(complex91);
        org.apache.commons.math3.complex.Complex complex93 = complex57.divide(complex91);
        org.apache.commons.math3.complex.Complex complex94 = complex7.pow(complex93);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex24 and complex86", complex24.equals(complex86) ? complex24.hashCode() == complex86.hashCode() : true);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test297");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex7 = complex5.divide((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex8 = complex7.cosh();
        org.apache.commons.math3.complex.Complex complex9 = complex7.tanh();
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
        org.apache.commons.math3.complex.Complex complex23 = complex17.sqrt();
        org.apache.commons.math3.complex.Complex complex24 = complex17.tanh();
        org.apache.commons.math3.complex.Complex complex26 = complex17.divide((double) '4');
        org.apache.commons.math3.complex.Complex complex27 = complex26.exp();
        org.apache.commons.math3.complex.Complex complex28 = complex27.exp();
        org.apache.commons.math3.complex.Complex complex30 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex31 = complex30.exp();
        double double32 = complex30.getArgument();
        org.apache.commons.math3.complex.Complex complex33 = complex30.log();
        org.apache.commons.math3.complex.Complex complex34 = complex30.log();
        org.apache.commons.math3.complex.Complex complex36 = complex34.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex37 = complex36.exp();
        org.apache.commons.math3.complex.Complex complex39 = complex36.subtract((double) 1);
        org.apache.commons.math3.complex.Complex complex40 = complex27.pow(complex39);
        org.apache.commons.math3.complex.Complex complex42 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex43 = complex42.exp();
        org.apache.commons.math3.complex.Complex complex44 = complex42.tan();
        org.apache.commons.math3.complex.Complex complex46 = complex42.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex47 = complex42.cos();
        org.apache.commons.math3.complex.Complex complex48 = complex42.conjugate();
        org.apache.commons.math3.complex.Complex complex49 = complex27.add(complex48);
        org.apache.commons.math3.complex.Complex complex50 = complex9.add(complex27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex48", complex1.equals(complex48) ? complex1.hashCode() == complex48.hashCode() : true);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test298");
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
        org.apache.commons.math3.complex.Complex complex13 = complex7.sqrt();
        org.apache.commons.math3.complex.Complex complex14 = complex7.tanh();
        org.apache.commons.math3.complex.Complex complex16 = complex7.divide((double) '4');
        org.apache.commons.math3.complex.Complex complex17 = complex16.exp();
        org.apache.commons.math3.complex.Complex complex18 = complex17.exp();
        org.apache.commons.math3.complex.Complex complex20 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex21 = complex20.exp();
        double double22 = complex20.getArgument();
        org.apache.commons.math3.complex.Complex complex23 = complex20.log();
        org.apache.commons.math3.complex.Complex complex24 = complex20.log();
        org.apache.commons.math3.complex.Complex complex26 = complex24.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex27 = complex26.exp();
        org.apache.commons.math3.complex.Complex complex29 = complex26.subtract((double) 1);
        org.apache.commons.math3.complex.Complex complex30 = complex17.pow(complex29);
        org.apache.commons.math3.complex.Complex complex31 = complex30.reciprocal();
        org.apache.commons.math3.complex.Complex complex32 = complex31.log();
        org.apache.commons.math3.complex.Complex complex33 = complex32.cos();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex31", complex17.equals(complex31) ? complex17.hashCode() == complex31.hashCode() : true);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test299");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf(0.8414709848078965d);
        org.apache.commons.math3.complex.Complex complex2 = complex1.sqrt1z();
        org.apache.commons.math3.complex.Complex complex4 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double5 = complex4.getImaginary();
        org.apache.commons.math3.complex.Complex complex6 = complex4.negate();
        org.apache.commons.math3.complex.Complex complex8 = complex6.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex10 = complex6.subtract(complex9);
        org.apache.commons.math3.complex.Complex complex12 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex13 = complex12.exp();
        org.apache.commons.math3.complex.Complex complex14 = complex12.tan();
        org.apache.commons.math3.complex.Complex complex16 = complex12.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex17 = complex12.cos();
        org.apache.commons.math3.complex.Complex complex18 = complex10.subtract(complex17);
        java.lang.String str19 = complex17.toString();
        org.apache.commons.math3.complex.Complex complex20 = complex17.sqrt1z();
        org.apache.commons.math3.complex.Complex complex22 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex23 = complex22.exp();
        double double24 = complex22.getArgument();
        org.apache.commons.math3.complex.Complex complex26 = complex22.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex27 = complex22.sin();
        org.apache.commons.math3.complex.Complex complex28 = complex22.cosh();
        org.apache.commons.math3.complex.Complex complex29 = complex22.tanh();
        org.apache.commons.math3.complex.Complex complex30 = complex22.log();
        org.apache.commons.math3.complex.Complex complex32 = complex22.add((double) 1);
        org.apache.commons.math3.complex.Complex complex33 = complex17.divide(complex32);
        org.apache.commons.math3.complex.Complex complex34 = complex2.multiply(complex33);
        org.apache.commons.math3.complex.ComplexField complexField35 = complex34.getField();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex17", complex2.equals(complex17) ? complex2.hashCode() == complex17.hashCode() : true);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test300");
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
        org.apache.commons.math3.complex.Complex complex14 = complex13.conjugate();
        org.apache.commons.math3.complex.Complex complex15 = complex13.log();
        double double16 = complex15.getReal();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex13 and complex14", complex13.equals(complex14) ? complex13.hashCode() == complex14.hashCode() : true);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test301");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex((double) 1L);
        org.apache.commons.math3.complex.Complex complex4 = new org.apache.commons.math3.complex.Complex((double) 1.0f, 0.5403023058681398d);
        org.apache.commons.math3.complex.Complex complex5 = complex4.reciprocal();
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double8 = complex7.getImaginary();
        org.apache.commons.math3.complex.Complex complex9 = complex7.negate();
        org.apache.commons.math3.complex.Complex complex11 = complex9.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex12 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex13 = complex9.subtract(complex12);
        org.apache.commons.math3.complex.Complex complex15 = complex9.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex16 = complex9.sin();
        org.apache.commons.math3.complex.Complex complex19 = org.apache.commons.math3.complex.Complex.valueOf((double) ' ', (double) 1L);
        org.apache.commons.math3.complex.Complex complex20 = complex16.add(complex19);
        boolean boolean21 = complex4.equals((java.lang.Object) complex16);
        org.apache.commons.math3.complex.Complex complex22 = complex1.pow(complex16);
        org.apache.commons.math3.complex.Complex complex23 = complex16.sinh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex22", complex1.equals(complex22) ? complex1.hashCode() == complex22.hashCode() : true);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test302");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex4.log();
        org.apache.commons.math3.complex.Complex complex7 = complex4.add(1.0d);
        double double8 = complex4.getImaginary();
        org.apache.commons.math3.complex.Complex complex10 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex11 = complex10.exp();
        org.apache.commons.math3.complex.Complex complex12 = complex10.tanh();
        org.apache.commons.math3.complex.Complex complex13 = complex12.log();
        org.apache.commons.math3.complex.Complex complex15 = complex12.multiply(10);
        org.apache.commons.math3.complex.Complex complex16 = complex15.conjugate();
        org.apache.commons.math3.complex.Complex complex17 = complex15.tan();
        org.apache.commons.math3.complex.Complex complex18 = complex4.subtract(complex15);
        org.apache.commons.math3.complex.Complex complex20 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex21 = complex20.exp();
        double double22 = complex20.getArgument();
        org.apache.commons.math3.complex.Complex complex24 = complex20.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex25 = complex20.sin();
        org.apache.commons.math3.complex.Complex complex26 = complex20.cosh();
        org.apache.commons.math3.complex.Complex complex28 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double29 = complex28.getImaginary();
        boolean boolean30 = complex26.equals((java.lang.Object) double29);
        org.apache.commons.math3.complex.Complex complex31 = complex26.tanh();
        org.apache.commons.math3.complex.Complex complex32 = complex26.sqrt();
        org.apache.commons.math3.complex.Complex complex33 = complex26.log();
        boolean boolean34 = complex15.equals((java.lang.Object) complex33);
        org.apache.commons.math3.complex.Complex complex35 = complex33.asin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex15 and complex16", complex15.equals(complex16) ? complex15.hashCode() == complex16.hashCode() : true);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test303");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tanh();
        org.apache.commons.math3.complex.Complex complex5 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double6 = complex5.getImaginary();
        org.apache.commons.math3.complex.Complex complex7 = complex5.negate();
        org.apache.commons.math3.complex.Complex complex9 = complex7.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex10 = complex9.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList12 = complex9.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex13 = complex9.negate();
        boolean boolean14 = complex1.equals((java.lang.Object) complex13);
        org.apache.commons.math3.complex.Complex complex16 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex17 = complex16.exp();
        org.apache.commons.math3.complex.Complex complex18 = complex16.tanh();
        org.apache.commons.math3.complex.Complex complex19 = complex18.log();
        org.apache.commons.math3.complex.Complex complex20 = complex18.acos();
        org.apache.commons.math3.complex.Complex complex21 = complex20.reciprocal();
        org.apache.commons.math3.complex.Complex complex22 = complex20.exp();
        org.apache.commons.math3.complex.Complex complex23 = complex13.pow(complex20);
        org.apache.commons.math3.complex.Complex complex24 = complex23.sin();
        boolean boolean25 = complex24.isInfinite();
        org.apache.commons.math3.complex.Complex complex27 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex28 = complex27.exp();
        double double29 = complex27.getArgument();
        org.apache.commons.math3.complex.Complex complex30 = complex27.log();
        org.apache.commons.math3.complex.Complex complex31 = complex30.log();
        org.apache.commons.math3.complex.Complex complex33 = complex30.pow((double) (byte) 100);
        org.apache.commons.math3.complex.Complex complex35 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex36 = complex35.exp();
        double double37 = complex35.getArgument();
        org.apache.commons.math3.complex.Complex complex38 = complex35.log();
        org.apache.commons.math3.complex.Complex complex39 = complex35.log();
        org.apache.commons.math3.complex.Complex complex40 = complex35.sqrt1z();
        org.apache.commons.math3.complex.Complex complex42 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex43 = complex42.exp();
        double double44 = complex42.getArgument();
        org.apache.commons.math3.complex.Complex complex46 = complex42.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex47 = complex42.sin();
        org.apache.commons.math3.complex.Complex complex48 = complex42.cosh();
        org.apache.commons.math3.complex.Complex complex49 = complex42.tan();
        org.apache.commons.math3.complex.Complex complex50 = complex42.tan();
        org.apache.commons.math3.complex.Complex complex52 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex53 = complex52.exp();
        double double54 = complex52.getArgument();
        org.apache.commons.math3.complex.Complex complex56 = complex52.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex57 = complex52.sin();
        org.apache.commons.math3.complex.Complex complex58 = complex52.cosh();
        org.apache.commons.math3.complex.Complex complex59 = complex52.tan();
        org.apache.commons.math3.complex.Complex complex60 = complex52.tan();
        org.apache.commons.math3.complex.Complex complex62 = complex52.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex63 = complex50.subtract(complex52);
        org.apache.commons.math3.complex.Complex complex64 = complex63.tanh();
        org.apache.commons.math3.complex.Complex complex65 = complex40.divide(complex63);
        org.apache.commons.math3.complex.Complex complex66 = complex63.exp();
        org.apache.commons.math3.complex.Complex complex68 = complex63.subtract((double) '#');
        org.apache.commons.math3.complex.Complex complex69 = complex68.tanh();
        org.apache.commons.math3.complex.Complex complex70 = complex68.sqrt();
        org.apache.commons.math3.complex.Complex complex71 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex73 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex74 = complex73.exp();
        org.apache.commons.math3.complex.Complex complex75 = complex73.tan();
        org.apache.commons.math3.complex.Complex complex77 = complex73.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex79 = complex77.multiply(100);
        org.apache.commons.math3.complex.Complex complex80 = complex79.tanh();
        org.apache.commons.math3.complex.Complex complex81 = complex71.subtract(complex80);
        org.apache.commons.math3.complex.Complex complex82 = complex80.sqrt1z();
        org.apache.commons.math3.complex.Complex complex84 = complex80.divide((double) '#');
        org.apache.commons.math3.complex.Complex complex85 = complex80.negate();
        org.apache.commons.math3.complex.Complex complex86 = complex70.divide(complex85);
        org.apache.commons.math3.complex.Complex complex87 = complex30.multiply(complex85);
        org.apache.commons.math3.complex.Complex complex88 = complex24.subtract(complex30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex7 and complex69", complex7.equals(complex69) ? complex7.hashCode() == complex69.hashCode() : true);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test304");
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
        org.apache.commons.math3.complex.Complex complex16 = complex3.sin();
        org.apache.commons.math3.complex.Complex complex18 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex19 = complex18.exp();
        org.apache.commons.math3.complex.Complex complex20 = complex18.tan();
        org.apache.commons.math3.complex.Complex complex22 = complex18.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex23 = complex18.cos();
        boolean boolean24 = complex18.isNaN();
        org.apache.commons.math3.complex.Complex complex26 = new org.apache.commons.math3.complex.Complex((double) (short) 1);
        org.apache.commons.math3.complex.Complex complex27 = complex18.multiply(complex26);
        org.apache.commons.math3.complex.Complex complex29 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex30 = complex29.exp();
        double double31 = complex29.getArgument();
        org.apache.commons.math3.complex.Complex complex33 = complex29.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex34 = complex29.exp();
        org.apache.commons.math3.complex.Complex complex35 = complex34.cosh();
        org.apache.commons.math3.complex.Complex complex37 = complex35.divide((double) (short) 1);
        org.apache.commons.math3.complex.Complex complex39 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex40 = complex39.sqrt();
        org.apache.commons.math3.complex.Complex complex41 = complex39.sqrt();
        org.apache.commons.math3.complex.Complex complex42 = complex41.cosh();
        org.apache.commons.math3.complex.Complex complex44 = complex41.add((double) ' ');
        org.apache.commons.math3.complex.Complex complex45 = complex37.subtract(complex41);
        org.apache.commons.math3.complex.Complex complex46 = complex37.sin();
        org.apache.commons.math3.complex.Complex complex47 = complex46.atan();
        org.apache.commons.math3.complex.Complex complex48 = complex27.pow(complex46);
        org.apache.commons.math3.complex.Complex complex49 = complex16.subtract(complex27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex4", complex3.equals(complex4) ? complex3.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test305");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((-9.0d));
        org.apache.commons.math3.complex.Complex complex2 = complex1.sqrt1z();
        org.apache.commons.math3.complex.Complex complex4 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex5 = complex4.exp();
        double double6 = complex4.getArgument();
        org.apache.commons.math3.complex.Complex complex7 = complex4.log();
        org.apache.commons.math3.complex.Complex complex8 = complex4.log();
        org.apache.commons.math3.complex.Complex complex9 = complex4.sqrt1z();
        double double10 = complex9.abs();
        org.apache.commons.math3.complex.Complex complex12 = complex9.divide(0.21460183660255172d);
        org.apache.commons.math3.complex.Complex complex13 = complex9.cos();
        boolean boolean14 = complex2.equals((java.lang.Object) complex9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex13", complex4.equals(complex13) ? complex4.hashCode() == complex13.hashCode() : true);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test306");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tanh();
        org.apache.commons.math3.complex.Complex complex5 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex6 = complex5.exp();
        double double7 = complex5.getArgument();
        org.apache.commons.math3.complex.Complex complex9 = complex5.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex10 = complex5.sin();
        org.apache.commons.math3.complex.Complex complex11 = complex5.cosh();
        org.apache.commons.math3.complex.Complex complex13 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double14 = complex13.getImaginary();
        boolean boolean15 = complex11.equals((java.lang.Object) double14);
        org.apache.commons.math3.complex.Complex complex16 = complex1.subtract(complex11);
        org.apache.commons.math3.complex.Complex complex18 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double19 = complex18.getImaginary();
        org.apache.commons.math3.complex.Complex complex20 = complex18.negate();
        org.apache.commons.math3.complex.Complex complex22 = complex20.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex23 = complex22.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList25 = complex22.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex27 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex28 = complex27.exp();
        org.apache.commons.math3.complex.Complex complex29 = complex27.tanh();
        org.apache.commons.math3.complex.Complex complex30 = complex22.subtract(complex27);
        org.apache.commons.math3.complex.Complex complex32 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex33 = complex32.exp();
        double double34 = complex32.getArgument();
        org.apache.commons.math3.complex.Complex complex36 = complex32.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex37 = complex32.sin();
        org.apache.commons.math3.complex.Complex complex38 = complex32.cosh();
        org.apache.commons.math3.complex.Complex complex39 = complex32.tan();
        org.apache.commons.math3.complex.Complex complex40 = complex32.tan();
        org.apache.commons.math3.complex.Complex complex42 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex43 = complex42.exp();
        double double44 = complex42.getArgument();
        org.apache.commons.math3.complex.Complex complex46 = complex42.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex47 = complex42.sin();
        org.apache.commons.math3.complex.Complex complex48 = complex42.cosh();
        org.apache.commons.math3.complex.Complex complex49 = complex42.tan();
        org.apache.commons.math3.complex.Complex complex50 = complex42.tan();
        org.apache.commons.math3.complex.Complex complex52 = complex42.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex53 = complex40.subtract(complex42);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList55 = complex53.nthRoot((int) '4');
        org.apache.commons.math3.complex.Complex complex56 = complex27.subtract(complex53);
        org.apache.commons.math3.complex.Complex complex57 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex59 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex60 = complex59.exp();
        org.apache.commons.math3.complex.Complex complex61 = complex59.tan();
        org.apache.commons.math3.complex.Complex complex63 = complex59.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex65 = complex63.multiply(100);
        org.apache.commons.math3.complex.Complex complex66 = complex65.tanh();
        org.apache.commons.math3.complex.Complex complex67 = complex57.subtract(complex66);
        boolean boolean68 = complex56.equals((java.lang.Object) complex66);
        double double69 = complex66.getReal();
        org.apache.commons.math3.complex.Complex complex70 = complex66.reciprocal();
        org.apache.commons.math3.complex.Complex complex71 = complex1.subtract(complex66);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex5 and complex70", complex5.equals(complex70) ? complex5.hashCode() == complex70.hashCode() : true);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test307");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex4.log();
        org.apache.commons.math3.complex.Complex complex7 = complex4.pow((double) (byte) 100);
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex10 = complex9.exp();
        double double11 = complex9.getArgument();
        org.apache.commons.math3.complex.Complex complex12 = complex9.log();
        org.apache.commons.math3.complex.Complex complex13 = complex9.log();
        org.apache.commons.math3.complex.Complex complex14 = complex9.sqrt1z();
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
        org.apache.commons.math3.complex.Complex complex38 = complex37.tanh();
        org.apache.commons.math3.complex.Complex complex39 = complex14.divide(complex37);
        org.apache.commons.math3.complex.Complex complex40 = complex37.exp();
        org.apache.commons.math3.complex.Complex complex42 = complex37.subtract((double) '#');
        org.apache.commons.math3.complex.Complex complex43 = complex42.tanh();
        org.apache.commons.math3.complex.Complex complex44 = complex42.sqrt();
        org.apache.commons.math3.complex.Complex complex45 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex47 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex48 = complex47.exp();
        org.apache.commons.math3.complex.Complex complex49 = complex47.tan();
        org.apache.commons.math3.complex.Complex complex51 = complex47.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex53 = complex51.multiply(100);
        org.apache.commons.math3.complex.Complex complex54 = complex53.tanh();
        org.apache.commons.math3.complex.Complex complex55 = complex45.subtract(complex54);
        org.apache.commons.math3.complex.Complex complex56 = complex54.sqrt1z();
        org.apache.commons.math3.complex.Complex complex58 = complex54.divide((double) '#');
        org.apache.commons.math3.complex.Complex complex59 = complex54.negate();
        org.apache.commons.math3.complex.Complex complex60 = complex44.divide(complex59);
        org.apache.commons.math3.complex.Complex complex61 = complex4.multiply(complex59);
        org.apache.commons.math3.complex.Complex complex62 = complex4.reciprocal();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex12 and complex61", complex12.equals(complex61) ? complex12.hashCode() == complex61.hashCode() : true);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test308");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex5 = complex1.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex6 = complex1.cos();
        boolean boolean7 = complex1.isNaN();
        org.apache.commons.math3.complex.Complex complex8 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex9 = complex8.conjugate();
        org.apache.commons.math3.complex.Complex complex10 = complex8.negate();
        boolean boolean11 = complex8.isInfinite();
        org.apache.commons.math3.complex.Complex complex14 = org.apache.commons.math3.complex.Complex.valueOf(10.0d, (-3.141592653589793d));
        double double15 = complex14.getArgument();
        org.apache.commons.math3.complex.Complex complex17 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex18 = complex17.sqrt();
        org.apache.commons.math3.complex.Complex complex19 = complex17.sqrt();
        org.apache.commons.math3.complex.Complex complex20 = complex19.asin();
        org.apache.commons.math3.complex.Complex complex21 = complex14.pow(complex20);
        org.apache.commons.math3.complex.Complex complex22 = complex8.pow(complex21);
        org.apache.commons.math3.complex.Complex complex23 = complex22.conjugate();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex8 and complex9", complex8.equals(complex9) ? complex8.hashCode() == complex9.hashCode() : true);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test309");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.sin();
        org.apache.commons.math3.complex.Complex complex7 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex8 = complex1.cos();
        org.apache.commons.math3.complex.Complex complex9 = complex8.exp();
        org.apache.commons.math3.complex.Complex complex11 = complex8.subtract((double) 0);
        org.apache.commons.math3.complex.Complex complex12 = complex8.negate();
        java.lang.String str13 = complex12.toString();
        org.apache.commons.math3.complex.Complex complex14 = complex12.sqrt();
        org.apache.commons.math3.complex.Complex complex15 = complex12.conjugate();
        org.apache.commons.math3.complex.Complex complex17 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex18 = complex17.exp();
        double double19 = complex17.getArgument();
        org.apache.commons.math3.complex.Complex complex20 = complex17.log();
        org.apache.commons.math3.complex.Complex complex21 = complex17.log();
        org.apache.commons.math3.complex.Complex complex23 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex24 = complex23.exp();
        double double25 = complex23.getArgument();
        org.apache.commons.math3.complex.Complex complex26 = complex23.log();
        org.apache.commons.math3.complex.Complex complex27 = complex21.subtract(complex26);
        org.apache.commons.math3.complex.Complex complex28 = complex21.asin();
        org.apache.commons.math3.complex.Complex complex29 = complex12.divide(complex28);
        org.apache.commons.math3.complex.Complex complex31 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex32 = complex31.exp();
        double double33 = complex31.getArgument();
        org.apache.commons.math3.complex.Complex complex35 = complex31.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex36 = complex31.sin();
        org.apache.commons.math3.complex.Complex complex37 = complex31.cosh();
        org.apache.commons.math3.complex.Complex complex38 = complex31.cos();
        org.apache.commons.math3.complex.Complex complex39 = complex38.exp();
        org.apache.commons.math3.complex.ComplexField complexField40 = complex39.getField();
        org.apache.commons.math3.complex.Complex complex42 = complex39.multiply(10);
        org.apache.commons.math3.complex.Complex complex43 = complex12.add(complex39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex20 and complex28", complex20.equals(complex28) ? complex20.hashCode() == complex28.hashCode() : true);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test310");
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
        org.apache.commons.math3.complex.Complex complex15 = complex14.cos();
        org.apache.commons.math3.complex.Complex complex16 = complex14.cosh();
        org.apache.commons.math3.complex.Complex complex18 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex19 = complex18.exp();
        double double20 = complex18.getArgument();
        org.apache.commons.math3.complex.Complex complex22 = complex18.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex24 = complex22.divide((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex25 = complex22.asin();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList27 = complex22.nthRoot((int) 'a');
        org.apache.commons.math3.complex.Complex complex30 = new org.apache.commons.math3.complex.Complex((double) 1, (double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex31 = complex30.tanh();
        double double32 = complex30.getImaginary();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList34 = complex30.nthRoot((int) (byte) 10);
        boolean boolean35 = complex22.equals((java.lang.Object) complexList34);
        org.apache.commons.math3.complex.Complex complex36 = complex22.asin();
        org.apache.commons.math3.complex.Complex complex37 = complex22.reciprocal();
        org.apache.commons.math3.complex.Complex complex39 = complex37.pow(4.242117536224665d);
        org.apache.commons.math3.complex.Complex complex40 = complex14.multiply(complex39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex37", complex1.equals(complex37) ? complex1.hashCode() == complex37.hashCode() : true);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test311");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex3.reciprocal();
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.valueOf(1.557407724654902d, 35.0d);
        org.apache.commons.math3.complex.Complex complex8 = complex3.divide(complex7);
        java.lang.Class<?> wildcardClass9 = complex7.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex4", complex3.equals(complex4) ? complex3.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test312");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.sin();
        org.apache.commons.math3.complex.Complex complex7 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex8 = complex7.conjugate();
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
        boolean boolean35 = complex34.isNaN();
        org.apache.commons.math3.complex.Complex complex37 = complex34.subtract(2.718281828459045d);
        org.apache.commons.math3.complex.Complex complex38 = complex8.subtract(complex37);
        org.apache.commons.math3.complex.Complex complex40 = complex37.multiply((-0.1585290151921035d));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex7 and complex8", complex7.equals(complex8) ? complex7.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test313");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex4.log();
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double8 = complex7.getImaginary();
        org.apache.commons.math3.complex.Complex complex9 = complex7.negate();
        org.apache.commons.math3.complex.Complex complex10 = complex9.reciprocal();
        org.apache.commons.math3.complex.Complex complex12 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex13 = complex12.exp();
        double double14 = complex12.getArgument();
        org.apache.commons.math3.complex.Complex complex16 = complex12.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex17 = complex12.sin();
        org.apache.commons.math3.complex.Complex complex18 = complex12.cosh();
        org.apache.commons.math3.complex.Complex complex19 = complex12.tan();
        org.apache.commons.math3.complex.Complex complex20 = complex12.tan();
        org.apache.commons.math3.complex.Complex complex21 = complex9.add(complex20);
        org.apache.commons.math3.complex.Complex complex23 = complex9.multiply((int) '#');
        org.apache.commons.math3.complex.Complex complex24 = complex5.subtract(complex9);
        org.apache.commons.math3.complex.Complex complex25 = complex9.asin();
        org.apache.commons.math3.complex.Complex complex27 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex28 = complex27.exp();
        double double29 = complex27.getArgument();
        org.apache.commons.math3.complex.Complex complex31 = complex27.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex33 = complex27.pow((double) 100.0f);
        org.apache.commons.math3.complex.Complex complex34 = complex33.sin();
        org.apache.commons.math3.complex.Complex complex35 = complex34.negate();
        boolean boolean36 = complex34.isNaN();
        double double37 = complex34.getReal();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList39 = complex34.nthRoot((int) 'a');
        org.apache.commons.math3.complex.Complex complex40 = complex34.exp();
        org.apache.commons.math3.complex.Complex complex41 = complex25.add(complex34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex9 and complex10", complex9.equals(complex10) ? complex9.hashCode() == complex10.hashCode() : true);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test314");
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
        org.apache.commons.math3.complex.Complex complex16 = complex15.sinh();
        double double17 = complex15.getImaginary();
        org.apache.commons.math3.complex.Complex complex18 = complex15.conjugate();
        org.apache.commons.math3.complex.Complex complex19 = complex15.atan();
        org.apache.commons.math3.complex.Complex complex21 = complex19.multiply((int) (short) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex15 and complex18", complex15.equals(complex18) ? complex15.hashCode() == complex18.hashCode() : true);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test315");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tanh();
        org.apache.commons.math3.complex.Complex complex4 = complex3.atan();
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double7 = complex6.getImaginary();
        org.apache.commons.math3.complex.Complex complex8 = complex6.negate();
        org.apache.commons.math3.complex.Complex complex10 = complex8.multiply((-1.0d));
        double double11 = complex10.getArgument();
        org.apache.commons.math3.complex.ComplexField complexField12 = complex10.getField();
        org.apache.commons.math3.complex.Complex complex13 = complex10.reciprocal();
        org.apache.commons.math3.complex.Complex complex14 = complex3.pow(complex10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex13", complex1.equals(complex13) ? complex1.hashCode() == complex13.hashCode() : true);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test316");
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
        org.apache.commons.math3.complex.Complex complex16 = complex15.sinh();
        double double17 = complex15.getImaginary();
        org.apache.commons.math3.complex.Complex complex18 = complex15.conjugate();
        org.apache.commons.math3.complex.Complex complex19 = complex18.tanh();
        org.apache.commons.math3.complex.Complex complex21 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex22 = complex21.exp();
        org.apache.commons.math3.complex.Complex complex23 = complex21.tan();
        org.apache.commons.math3.complex.Complex complex25 = complex21.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex27 = complex25.multiply(100);
        org.apache.commons.math3.complex.Complex complex29 = complex25.multiply((int) (short) 0);
        double double30 = complex25.getImaginary();
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
        org.apache.commons.math3.complex.Complex complex45 = complex36.asin();
        java.lang.String str46 = complex45.toString();
        org.apache.commons.math3.complex.Complex complex47 = complex45.cosh();
        org.apache.commons.math3.complex.Complex complex49 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double50 = complex49.getImaginary();
        org.apache.commons.math3.complex.Complex complex51 = complex49.negate();
        org.apache.commons.math3.complex.Complex complex53 = complex51.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex54 = complex53.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList56 = complex53.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex58 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex59 = complex58.exp();
        org.apache.commons.math3.complex.Complex complex60 = complex58.tanh();
        org.apache.commons.math3.complex.Complex complex61 = complex53.subtract(complex58);
        org.apache.commons.math3.complex.Complex complex62 = complex53.asin();
        org.apache.commons.math3.complex.Complex complex63 = complex47.pow(complex62);
        org.apache.commons.math3.complex.Complex complex64 = complex25.subtract(complex47);
        org.apache.commons.math3.complex.Complex complex65 = complex25.atan();
        org.apache.commons.math3.complex.Complex complex67 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex69 = complex67.subtract((double) (-1));
        org.apache.commons.math3.complex.Complex complex71 = complex67.multiply((double) 10L);
        boolean boolean72 = complex65.equals((java.lang.Object) complex67);
        org.apache.commons.math3.complex.Complex complex73 = complex67.asin();
        org.apache.commons.math3.complex.Complex complex74 = complex18.subtract(complex67);
        org.apache.commons.math3.complex.Complex complex76 = complex67.multiply((int) (short) -1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex15 and complex18", complex15.equals(complex18) ? complex15.hashCode() == complex18.hashCode() : true);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test317");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tanh();
        org.apache.commons.math3.complex.Complex complex4 = complex3.log();
        org.apache.commons.math3.complex.Complex complex5 = complex3.acos();
        org.apache.commons.math3.complex.Complex complex6 = complex3.tanh();
        org.apache.commons.math3.complex.Complex complex7 = complex6.asin();
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex10 = complex9.exp();
        org.apache.commons.math3.complex.Complex complex11 = complex9.tan();
        org.apache.commons.math3.complex.Complex complex13 = complex9.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex14 = complex9.cos();
        org.apache.commons.math3.complex.Complex complex15 = complex9.tan();
        double double16 = complex9.getImaginary();
        org.apache.commons.math3.complex.Complex complex17 = complex9.reciprocal();
        org.apache.commons.math3.complex.Complex complex18 = complex6.pow(complex17);
        org.apache.commons.math3.complex.Complex complex19 = complex17.tan();
        double double20 = complex17.getImaginary();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex11 and complex19", complex11.equals(complex19) ? complex11.hashCode() == complex19.hashCode() : true);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test318");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex(10.0d, 1.5430806348152437d);
        org.apache.commons.math3.complex.Complex complex3 = complex2.cos();
        org.apache.commons.math3.complex.Complex complex4 = complex2.cosh();
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double7 = complex6.getImaginary();
        org.apache.commons.math3.complex.Complex complex8 = complex6.negate();
        org.apache.commons.math3.complex.Complex complex10 = complex8.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex11 = complex10.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList13 = complex10.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex14 = complex10.negate();
        boolean boolean15 = complex10.isInfinite();
        org.apache.commons.math3.complex.Complex complex17 = complex10.pow((double) (-1.0f));
        org.apache.commons.math3.complex.Complex complex18 = complex17.cosh();
        org.apache.commons.math3.complex.Complex complex19 = complex4.multiply(complex18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex6 and complex17", complex6.equals(complex17) ? complex6.hashCode() == complex17.hashCode() : true);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test319");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.sinh();
        double double5 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex7 = complex1.subtract((double) (byte) 1);
        java.lang.String str8 = complex7.toString();
        org.apache.commons.math3.complex.Complex complex9 = complex7.conjugate();
        org.apache.commons.math3.complex.Complex complex11 = complex7.divide((double) 0);
        org.apache.commons.math3.complex.Complex complex12 = complex11.sinh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex7 and complex9", complex7.equals(complex9) ? complex7.hashCode() == complex9.hashCode() : true);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test320");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.sin();
        org.apache.commons.math3.complex.Complex complex8 = complex1.divide((double) (-1L));
        org.apache.commons.math3.complex.Complex complex9 = complex1.negate();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList11 = complex9.nthRoot((int) (short) 100);
        boolean boolean12 = complex9.isInfinite();
        org.apache.commons.math3.complex.Complex complex14 = complex9.add((double) 1);
        boolean boolean16 = complex14.equals((java.lang.Object) 52.0d);
        org.apache.commons.math3.complex.Complex complex18 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double19 = complex18.getImaginary();
        org.apache.commons.math3.complex.Complex complex20 = complex18.negate();
        org.apache.commons.math3.complex.Complex complex21 = complex20.reciprocal();
        org.apache.commons.math3.complex.Complex complex23 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex24 = complex23.exp();
        double double25 = complex23.getArgument();
        org.apache.commons.math3.complex.Complex complex27 = complex23.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex28 = complex23.sin();
        org.apache.commons.math3.complex.Complex complex29 = complex23.cosh();
        org.apache.commons.math3.complex.Complex complex30 = complex23.tan();
        org.apache.commons.math3.complex.Complex complex31 = complex23.tan();
        org.apache.commons.math3.complex.Complex complex32 = complex20.add(complex31);
        double double33 = complex20.getReal();
        org.apache.commons.math3.complex.Complex complex35 = complex20.multiply((double) 100);
        org.apache.commons.math3.complex.Complex complex36 = complex20.cos();
        java.lang.String str37 = complex20.toString();
        org.apache.commons.math3.complex.Complex complex38 = complex20.tanh();
        org.apache.commons.math3.complex.Complex complex39 = complex20.negate();
        org.apache.commons.math3.complex.Complex complex40 = complex14.multiply(complex20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex8 and complex21", complex8.equals(complex21) ? complex8.hashCode() == complex21.hashCode() : true);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test321");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math3.complex.Complex complex3 = complex1.sqrt();
        org.apache.commons.math3.complex.Complex complex4 = complex3.asin();
        org.apache.commons.math3.complex.Complex complex5 = complex3.tanh();
        org.apache.commons.math3.complex.Complex complex6 = complex3.reciprocal();
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
        org.apache.commons.math3.complex.Complex complex21 = complex12.cos();
        org.apache.commons.math3.complex.Complex complex22 = complex12.cosh();
        double double23 = complex12.abs();
        org.apache.commons.math3.complex.Complex complex24 = complex3.divide(complex12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex6", complex1.equals(complex6) ? complex1.hashCode() == complex6.hashCode() : true);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test322");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex3.reciprocal();
        org.apache.commons.math3.complex.ComplexField complexField5 = complex3.getField();
        org.apache.commons.math3.complex.Complex complex6 = complex3.reciprocal();
        double double7 = complex3.abs();
        org.apache.commons.math3.complex.Complex complex8 = complex3.cos();
        org.apache.commons.math3.complex.Complex complex9 = complex3.sinh();
        double double10 = complex9.getArgument();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex4", complex3.equals(complex4) ? complex3.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test323");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex3.reciprocal();
        org.apache.commons.math3.complex.ComplexField complexField5 = complex3.getField();
        org.apache.commons.math3.complex.Complex complex6 = complex3.reciprocal();
        double double7 = complex3.abs();
        org.apache.commons.math3.complex.Complex complex8 = complex3.cos();
        org.apache.commons.math3.complex.Complex complex10 = complex3.subtract((-2.0d));
        org.apache.commons.math3.complex.ComplexField complexField11 = complex10.getField();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex4", complex3.equals(complex4) ? complex3.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test324");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex7 = complex3.subtract(complex6);
        org.apache.commons.math3.complex.Complex complex9 = complex3.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex10 = complex3.sin();
        org.apache.commons.math3.complex.Complex complex11 = complex10.asin();
        org.apache.commons.math3.complex.Complex complex12 = complex10.acos();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex11", complex3.equals(complex11) ? complex3.hashCode() == complex11.hashCode() : true);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test325");
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
        org.apache.commons.math3.complex.Complex complex15 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double16 = complex15.getImaginary();
        org.apache.commons.math3.complex.Complex complex17 = complex15.negate();
        org.apache.commons.math3.complex.Complex complex19 = complex17.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex20 = complex19.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList22 = complex19.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex23 = complex19.negate();
        boolean boolean24 = complex19.isInfinite();
        org.apache.commons.math3.complex.Complex complex25 = complex19.asin();
        org.apache.commons.math3.complex.Complex complex26 = complex25.atan();
        org.apache.commons.math3.complex.Complex complex27 = complex1.divide(complex26);
        org.apache.commons.math3.complex.Complex complex29 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex30 = complex29.exp();
        double double31 = complex29.getArgument();
        org.apache.commons.math3.complex.Complex complex32 = complex29.log();
        org.apache.commons.math3.complex.Complex complex33 = complex29.log();
        org.apache.commons.math3.complex.Complex complex35 = complex33.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex36 = complex35.exp();
        org.apache.commons.math3.complex.Complex complex37 = complex36.log();
        org.apache.commons.math3.complex.Complex complex39 = complex37.subtract((double) (byte) 1);
        org.apache.commons.math3.complex.Complex complex41 = complex39.add(6.610125138662287d);
        org.apache.commons.math3.complex.Complex complex42 = complex26.multiply(complex41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex39", complex17.equals(complex39) ? complex17.hashCode() == complex39.hashCode() : true);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test326");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex7 = complex3.subtract(complex6);
        org.apache.commons.math3.complex.Complex complex8 = complex3.asin();
        org.apache.commons.math3.complex.Complex complex9 = complex3.cosh();
        org.apache.commons.math3.complex.Complex complex10 = complex3.reciprocal();
        org.apache.commons.math3.complex.Complex complex11 = complex3.sqrt1z();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex7 and complex10", complex7.equals(complex10) ? complex7.hashCode() == complex10.hashCode() : true);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test327");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex3.reciprocal();
        org.apache.commons.math3.complex.ComplexField complexField5 = complex3.getField();
        org.apache.commons.math3.complex.Complex complex6 = complex3.reciprocal();
        double double7 = complex3.abs();
        org.apache.commons.math3.complex.Complex complex8 = complex3.acos();
        org.apache.commons.math3.complex.Complex complex10 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex11 = complex10.exp();
        org.apache.commons.math3.complex.Complex complex12 = complex10.tan();
        org.apache.commons.math3.complex.Complex complex14 = complex10.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex15 = complex10.cos();
        boolean boolean16 = complex10.isNaN();
        org.apache.commons.math3.complex.Complex complex17 = complex10.cosh();
        org.apache.commons.math3.complex.Complex complex19 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex20 = complex19.exp();
        double double21 = complex19.getArgument();
        org.apache.commons.math3.complex.Complex complex23 = complex19.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex24 = complex19.exp();
        org.apache.commons.math3.complex.Complex complex25 = complex19.exp();
        org.apache.commons.math3.complex.Complex complex27 = complex25.multiply((int) 'a');
        org.apache.commons.math3.complex.Complex complex29 = complex27.divide((double) (byte) 1);
        org.apache.commons.math3.complex.Complex complex30 = complex10.multiply(complex29);
        org.apache.commons.math3.complex.Complex complex31 = complex30.tanh();
        boolean boolean32 = complex3.equals((java.lang.Object) complex30);
        org.apache.commons.math3.complex.Complex complex33 = complex3.negate();
        org.apache.commons.math3.complex.Complex complex34 = complex33.reciprocal();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex4", complex3.equals(complex4) ? complex3.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test328");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex3 = complex2.exp();
        org.apache.commons.math3.complex.Complex complex4 = complex2.tan();
        org.apache.commons.math3.complex.Complex complex6 = complex2.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex8 = complex6.multiply(100);
        org.apache.commons.math3.complex.Complex complex9 = complex8.tanh();
        org.apache.commons.math3.complex.Complex complex10 = complex0.subtract(complex9);
        org.apache.commons.math3.complex.Complex complex11 = complex9.sqrt1z();
        org.apache.commons.math3.complex.Complex complex13 = complex9.divide((double) '#');
        org.apache.commons.math3.complex.Complex complex14 = complex9.negate();
        org.apache.commons.math3.complex.Complex complex16 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double17 = complex16.getImaginary();
        org.apache.commons.math3.complex.Complex complex18 = complex16.negate();
        org.apache.commons.math3.complex.Complex complex19 = complex18.reciprocal();
        org.apache.commons.math3.complex.ComplexField complexField20 = complex18.getField();
        org.apache.commons.math3.complex.Complex complex21 = complex18.reciprocal();
        double double22 = complex18.abs();
        org.apache.commons.math3.complex.Complex complex23 = complex14.subtract(complex18);
        org.apache.commons.math3.complex.Complex complex25 = complex23.pow((double) 1.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex14 and complex19", complex14.equals(complex19) ? complex14.hashCode() == complex19.hashCode() : true);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test329");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math3.complex.Complex complex3 = complex1.sqrt();
        org.apache.commons.math3.complex.Complex complex4 = complex3.cosh();
        org.apache.commons.math3.complex.Complex complex6 = complex3.add((double) ' ');
        org.apache.commons.math3.complex.Complex complex7 = complex3.tan();
        org.apache.commons.math3.complex.Complex complex10 = new org.apache.commons.math3.complex.Complex((double) ' ', 0.0d);
        org.apache.commons.math3.complex.Complex complex11 = complex10.tan();
        org.apache.commons.math3.complex.Complex complex12 = complex11.exp();
        org.apache.commons.math3.complex.Complex complex13 = complex11.sin();
        org.apache.commons.math3.complex.Complex complex14 = complex13.sqrt1z();
        org.apache.commons.math3.complex.Complex complex15 = complex3.pow(complex14);
        org.apache.commons.math3.complex.Complex complex16 = complex15.conjugate();
        java.lang.Class<?> wildcardClass17 = complex15.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex16", complex1.equals(complex16) ? complex1.hashCode() == complex16.hashCode() : true);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test330");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex6 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex7 = complex1.conjugate();
        org.apache.commons.math3.complex.Complex complex8 = complex1.tanh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex5 and complex7", complex5.equals(complex7) ? complex5.hashCode() == complex7.hashCode() : true);
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
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex5.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex9 = complex5.negate();
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex12 = complex11.exp();
        double double13 = complex11.getArgument();
        org.apache.commons.math3.complex.Complex complex15 = complex11.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex16 = complex11.sin();
        org.apache.commons.math3.complex.Complex complex17 = complex11.cosh();
        boolean boolean18 = complex9.equals((java.lang.Object) complex11);
        double double19 = complex9.abs();
        org.apache.commons.math3.complex.Complex complex20 = complex9.sqrt1z();
        org.apache.commons.math3.complex.Complex complex21 = complex9.reciprocal();
        org.apache.commons.math3.complex.Complex complex22 = complex9.sqrt1z();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex21", complex3.equals(complex21) ? complex3.hashCode() == complex21.hashCode() : true);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test332");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex6 = complex1.acos();
        org.apache.commons.math3.complex.Complex complex8 = complex6.subtract((double) '#');
        org.apache.commons.math3.complex.Complex complex9 = complex6.tanh();
        org.apache.commons.math3.complex.Complex complex10 = complex6.acos();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex9", complex4.equals(complex9) ? complex4.hashCode() == complex9.hashCode() : true);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test333");
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
        boolean boolean15 = complex14.isInfinite();
        org.apache.commons.math3.complex.Complex complex16 = complex14.cos();
        org.apache.commons.math3.complex.Complex complex17 = complex14.conjugate();
        org.apache.commons.math3.complex.Complex complex19 = complex17.divide((double) '4');
        org.apache.commons.math3.complex.Complex complex20 = complex19.log();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex14 and complex17", complex14.equals(complex17) ? complex14.hashCode() == complex17.hashCode() : true);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test334");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex3.reciprocal();
        org.apache.commons.math3.complex.Complex complex5 = complex3.cosh();
        org.apache.commons.math3.complex.Complex complex6 = complex5.negate();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex4", complex3.equals(complex4) ? complex3.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test335");
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
        org.apache.commons.math3.complex.Complex complex13 = complex7.sqrt();
        org.apache.commons.math3.complex.Complex complex14 = complex7.tanh();
        org.apache.commons.math3.complex.Complex complex16 = complex7.divide((double) '4');
        org.apache.commons.math3.complex.Complex complex17 = complex16.exp();
        org.apache.commons.math3.complex.Complex complex18 = complex17.exp();
        org.apache.commons.math3.complex.Complex complex20 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex21 = complex20.exp();
        double double22 = complex20.getArgument();
        org.apache.commons.math3.complex.Complex complex23 = complex20.log();
        org.apache.commons.math3.complex.Complex complex24 = complex20.log();
        org.apache.commons.math3.complex.Complex complex26 = complex24.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex27 = complex26.exp();
        org.apache.commons.math3.complex.Complex complex29 = complex26.subtract((double) 1);
        org.apache.commons.math3.complex.Complex complex30 = complex17.pow(complex29);
        org.apache.commons.math3.complex.Complex complex32 = complex29.add(34.64159668870139d);
        org.apache.commons.math3.complex.Complex complex34 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex35 = complex34.exp();
        double double36 = complex34.getArgument();
        org.apache.commons.math3.complex.Complex complex38 = complex34.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex39 = complex34.sin();
        org.apache.commons.math3.complex.Complex complex41 = complex34.divide((double) (-1L));
        double double42 = complex34.getImaginary();
        org.apache.commons.math3.complex.Complex complex43 = complex32.add(complex34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex29 and complex41", complex29.equals(complex41) ? complex29.hashCode() == complex41.hashCode() : true);
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
        org.apache.commons.math3.complex.Complex complex9 = complex5.negate();
        boolean boolean10 = complex5.isInfinite();
        org.apache.commons.math3.complex.Complex complex11 = complex5.negate();
        org.apache.commons.math3.complex.Complex complex12 = complex11.negate();
        org.apache.commons.math3.complex.Complex complex13 = complex12.conjugate();
        org.apache.commons.math3.complex.Complex complex14 = complex12.cos();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex13", complex1.equals(complex13) ? complex1.hashCode() == complex13.hashCode() : true);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test337");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex((double) 1L);
        org.apache.commons.math3.complex.Complex complex4 = new org.apache.commons.math3.complex.Complex((double) 1.0f, 0.5403023058681398d);
        org.apache.commons.math3.complex.Complex complex5 = complex4.reciprocal();
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double8 = complex7.getImaginary();
        org.apache.commons.math3.complex.Complex complex9 = complex7.negate();
        org.apache.commons.math3.complex.Complex complex11 = complex9.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex12 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex13 = complex9.subtract(complex12);
        org.apache.commons.math3.complex.Complex complex15 = complex9.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex16 = complex9.sin();
        org.apache.commons.math3.complex.Complex complex19 = org.apache.commons.math3.complex.Complex.valueOf((double) ' ', (double) 1L);
        org.apache.commons.math3.complex.Complex complex20 = complex16.add(complex19);
        boolean boolean21 = complex4.equals((java.lang.Object) complex16);
        org.apache.commons.math3.complex.Complex complex22 = complex1.pow(complex16);
        org.apache.commons.math3.complex.Complex complex24 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex25 = complex24.exp();
        double double26 = complex24.getArgument();
        org.apache.commons.math3.complex.Complex complex28 = complex24.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex29 = complex24.sin();
        org.apache.commons.math3.complex.Complex complex31 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex32 = complex31.exp();
        double double33 = complex31.getArgument();
        org.apache.commons.math3.complex.Complex complex35 = complex31.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex36 = complex31.sin();
        org.apache.commons.math3.complex.Complex complex37 = complex31.cosh();
        org.apache.commons.math3.complex.Complex complex39 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double40 = complex39.getImaginary();
        boolean boolean41 = complex37.equals((java.lang.Object) double40);
        org.apache.commons.math3.complex.Complex complex42 = complex37.tanh();
        org.apache.commons.math3.complex.Complex complex43 = complex37.sin();
        boolean boolean44 = complex29.equals((java.lang.Object) complex37);
        org.apache.commons.math3.complex.Complex complex45 = complex29.negate();
        boolean boolean46 = complex29.isInfinite();
        org.apache.commons.math3.complex.Complex complex47 = complex16.subtract(complex29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex22", complex1.equals(complex22) ? complex1.hashCode() == complex22.hashCode() : true);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test338");
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
        double double16 = complex3.getReal();
        org.apache.commons.math3.complex.Complex complex17 = complex3.tanh();
        org.apache.commons.math3.complex.Complex complex19 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex20 = complex19.exp();
        org.apache.commons.math3.complex.Complex complex21 = complex19.tanh();
        org.apache.commons.math3.complex.Complex complex22 = complex3.pow(complex21);
        org.apache.commons.math3.complex.ComplexField complexField23 = complex21.getField();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex4", complex3.equals(complex4) ? complex3.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test339");
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
        org.apache.commons.math3.complex.Complex complex13 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex14 = complex13.exp();
        org.apache.commons.math3.complex.Complex complex15 = complex14.exp();
        org.apache.commons.math3.complex.Complex complex17 = complex15.pow((double) (short) 10);
        org.apache.commons.math3.complex.Complex complex19 = complex15.divide(2.718281828459045d);
        boolean boolean20 = complex7.equals((java.lang.Object) 2.718281828459045d);
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
        org.apache.commons.math3.complex.Complex complex35 = complex26.cos();
        boolean boolean36 = complex35.isInfinite();
        org.apache.commons.math3.complex.Complex complex37 = complex35.cos();
        org.apache.commons.math3.complex.Complex complex38 = complex35.conjugate();
        org.apache.commons.math3.complex.Complex complex39 = complex7.add(complex38);
        org.apache.commons.math3.complex.Complex complex41 = complex38.multiply((double) (-1L));
        org.apache.commons.math3.complex.Complex complex42 = complex38.conjugate();
        org.apache.commons.math3.complex.Complex complex43 = complex42.asin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex35 and complex38", complex35.equals(complex38) ? complex35.hashCode() == complex38.hashCode() : true);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test340");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex7 = complex3.subtract(complex6);
        org.apache.commons.math3.complex.Complex complex8 = complex3.asin();
        double double9 = complex3.abs();
        org.apache.commons.math3.complex.Complex complex11 = complex3.subtract((-2.0d));
        java.lang.String str12 = complex11.toString();
        org.apache.commons.math3.complex.Complex complex14 = complex11.divide(21.09443817929988d);
        org.apache.commons.math3.complex.Complex complex15 = complex14.tanh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex11", complex1.equals(complex11) ? complex1.hashCode() == complex11.hashCode() : true);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test341");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex7 = complex5.divide((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex8 = complex5.asin();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList10 = complex5.nthRoot((int) 'a');
        org.apache.commons.math3.complex.Complex complex13 = new org.apache.commons.math3.complex.Complex((double) 1, (double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex14 = complex13.tanh();
        double double15 = complex13.getImaginary();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList17 = complex13.nthRoot((int) (byte) 10);
        boolean boolean18 = complex5.equals((java.lang.Object) complexList17);
        org.apache.commons.math3.complex.Complex complex19 = complex5.asin();
        org.apache.commons.math3.complex.Complex complex20 = complex5.reciprocal();
        org.apache.commons.math3.complex.Complex complex22 = complex20.pow(2.718281828459045d);
        double double23 = complex22.getArgument();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex20", complex1.equals(complex20) ? complex1.hashCode() == complex20.hashCode() : true);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test342");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.acos();
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex8 = complex7.exp();
        double double9 = complex7.getArgument();
        org.apache.commons.math3.complex.Complex complex10 = complex7.log();
        org.apache.commons.math3.complex.Complex complex11 = complex7.log();
        org.apache.commons.math3.complex.Complex complex12 = complex5.multiply(complex7);
        double double13 = complex7.getArgument();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex5", complex4.equals(complex5) ? complex4.hashCode() == complex5.hashCode() : true);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test343");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex6 = complex1.acos();
        org.apache.commons.math3.complex.Complex complex8 = complex6.subtract((double) '#');
        org.apache.commons.math3.complex.Complex complex9 = complex6.asin();
        org.apache.commons.math3.complex.Complex complex11 = complex6.multiply(5.29829236561098d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex9", complex4.equals(complex9) ? complex4.hashCode() == complex9.hashCode() : true);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test344");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex4 = complex2.pow((double) (short) 10);
        org.apache.commons.math3.complex.Complex complex5 = complex2.cosh();
        org.apache.commons.math3.complex.Complex complex7 = complex5.multiply(0.0d);
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double10 = complex9.getImaginary();
        org.apache.commons.math3.complex.Complex complex11 = complex9.negate();
        org.apache.commons.math3.complex.Complex complex13 = complex11.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex14 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex15 = complex11.subtract(complex14);
        org.apache.commons.math3.complex.Complex complex16 = complex11.asin();
        org.apache.commons.math3.complex.Complex complex17 = complex11.cosh();
        org.apache.commons.math3.complex.Complex complex18 = complex7.pow(complex11);
        org.apache.commons.math3.complex.Complex complex19 = complex7.reciprocal();
        double double20 = complex7.getImaginary();
        org.apache.commons.math3.complex.Complex complex21 = complex7.negate();
        org.apache.commons.math3.complex.Complex complex23 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex24 = complex23.exp();
        double double25 = complex23.getArgument();
        org.apache.commons.math3.complex.Complex complex27 = complex23.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex28 = complex23.tanh();
        org.apache.commons.math3.complex.Complex complex31 = org.apache.commons.math3.complex.Complex.valueOf((double) (-1.0f), (double) '#');
        double double32 = complex31.getImaginary();
        org.apache.commons.math3.complex.Complex complex34 = complex31.pow((double) (short) 1);
        org.apache.commons.math3.complex.Complex complex35 = complex28.divide(complex34);
        org.apache.commons.math3.complex.Complex complex37 = complex34.pow((double) 1.0f);
        org.apache.commons.math3.complex.Complex complex38 = complex34.atan();
        org.apache.commons.math3.complex.Complex complex40 = complex38.multiply((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex41 = complex7.add(complex38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex14 and complex40", complex14.equals(complex40) ? complex14.hashCode() == complex40.hashCode() : true);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test345");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex((double) (short) 10);
        org.apache.commons.math3.complex.Complex complex3 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double4 = complex3.getImaginary();
        org.apache.commons.math3.complex.Complex complex5 = complex3.negate();
        org.apache.commons.math3.complex.Complex complex7 = complex5.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex8 = complex7.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList10 = complex7.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex12 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex13 = complex12.exp();
        org.apache.commons.math3.complex.Complex complex14 = complex12.tanh();
        org.apache.commons.math3.complex.Complex complex15 = complex7.subtract(complex12);
        org.apache.commons.math3.complex.Complex complex16 = complex7.cos();
        boolean boolean17 = complex16.isInfinite();
        org.apache.commons.math3.complex.Complex complex18 = complex16.cos();
        org.apache.commons.math3.complex.Complex complex19 = complex16.conjugate();
        org.apache.commons.math3.complex.Complex complex20 = complex19.sin();
        org.apache.commons.math3.complex.Complex complex22 = complex19.pow((double) 100);
        org.apache.commons.math3.complex.Complex complex23 = complex1.multiply(complex22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex16 and complex19", complex16.equals(complex19) ? complex16.hashCode() == complex19.hashCode() : true);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test346");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex6 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex8 = complex6.pow((-0.0d));
        org.apache.commons.math3.complex.Complex complex10 = complex8.divide(0.0d);
        double double11 = complex10.getImaginary();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex8", complex1.equals(complex8) ? complex1.hashCode() == complex8.hashCode() : true);
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
        org.apache.commons.math3.complex.Complex complex9 = complex5.negate();
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex12 = complex11.exp();
        double double13 = complex11.getArgument();
        org.apache.commons.math3.complex.Complex complex15 = complex11.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex16 = complex11.sin();
        org.apache.commons.math3.complex.Complex complex17 = complex11.cosh();
        boolean boolean18 = complex9.equals((java.lang.Object) complex11);
        double double19 = complex9.abs();
        org.apache.commons.math3.complex.Complex complex20 = complex9.sqrt1z();
        org.apache.commons.math3.complex.Complex complex21 = complex9.reciprocal();
        org.apache.commons.math3.complex.Complex complex23 = complex9.divide((double) 0.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex21", complex3.equals(complex21) ? complex3.hashCode() == complex21.hashCode() : true);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test348");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex3.reciprocal();
        org.apache.commons.math3.complex.ComplexField complexField5 = complex3.getField();
        org.apache.commons.math3.complex.Complex complex6 = complex3.reciprocal();
        double double7 = complex3.abs();
        org.apache.commons.math3.complex.Complex complex8 = complex3.acos();
        org.apache.commons.math3.complex.Complex complex10 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex11 = complex10.exp();
        org.apache.commons.math3.complex.Complex complex12 = complex10.tan();
        org.apache.commons.math3.complex.Complex complex14 = complex10.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex15 = complex10.cos();
        boolean boolean16 = complex10.isNaN();
        org.apache.commons.math3.complex.Complex complex17 = complex10.cosh();
        org.apache.commons.math3.complex.Complex complex19 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex20 = complex19.exp();
        double double21 = complex19.getArgument();
        org.apache.commons.math3.complex.Complex complex23 = complex19.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex24 = complex19.exp();
        org.apache.commons.math3.complex.Complex complex25 = complex19.exp();
        org.apache.commons.math3.complex.Complex complex27 = complex25.multiply((int) 'a');
        org.apache.commons.math3.complex.Complex complex29 = complex27.divide((double) (byte) 1);
        org.apache.commons.math3.complex.Complex complex30 = complex10.multiply(complex29);
        org.apache.commons.math3.complex.Complex complex31 = complex30.tanh();
        boolean boolean32 = complex3.equals((java.lang.Object) complex30);
        boolean boolean33 = complex3.isNaN();
        org.apache.commons.math3.complex.Complex complex34 = complex3.sin();
        java.lang.String str35 = complex34.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex4", complex3.equals(complex4) ? complex3.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test349");
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
        org.apache.commons.math3.complex.Complex complex40 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex42 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex43 = complex42.exp();
        org.apache.commons.math3.complex.Complex complex44 = complex42.tan();
        org.apache.commons.math3.complex.Complex complex46 = complex42.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex48 = complex46.multiply(100);
        org.apache.commons.math3.complex.Complex complex49 = complex48.tanh();
        org.apache.commons.math3.complex.Complex complex50 = complex40.subtract(complex49);
        boolean boolean51 = complex39.equals((java.lang.Object) complex49);
        double double52 = complex49.getReal();
        org.apache.commons.math3.complex.Complex complex54 = complex49.pow((-2.0d));
        org.apache.commons.math3.complex.Complex complex55 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex56 = complex55.sqrt1z();
        double double57 = complex55.abs();
        org.apache.commons.math3.complex.Complex complex59 = complex55.pow(0.5403023058681398d);
        org.apache.commons.math3.complex.Complex complex61 = complex55.add(1.0d);
        org.apache.commons.math3.complex.Complex complex63 = complex61.pow(1.5430806348152437d);
        org.apache.commons.math3.complex.Complex complex64 = complex63.acos();
        org.apache.commons.math3.complex.Complex complex65 = complex54.multiply(complex63);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex13 and complex64", complex13.equals(complex64) ? complex13.hashCode() == complex64.hashCode() : true);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test350");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tanh();
        org.apache.commons.math3.complex.Complex complex4 = complex3.log();
        org.apache.commons.math3.complex.Complex complex5 = complex3.acos();
        org.apache.commons.math3.complex.Complex complex6 = complex3.tanh();
        org.apache.commons.math3.complex.Complex complex7 = complex6.asin();
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex10 = complex9.exp();
        org.apache.commons.math3.complex.Complex complex11 = complex9.tan();
        org.apache.commons.math3.complex.Complex complex13 = complex9.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex14 = complex9.cos();
        org.apache.commons.math3.complex.Complex complex15 = complex9.tan();
        double double16 = complex9.getImaginary();
        org.apache.commons.math3.complex.Complex complex17 = complex9.reciprocal();
        org.apache.commons.math3.complex.Complex complex18 = complex6.pow(complex17);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList20 = complex18.nthRoot((int) (byte) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex17", complex1.equals(complex17) ? complex1.hashCode() == complex17.hashCode() : true);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test351");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex3.reciprocal();
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.valueOf(1.557407724654902d, 35.0d);
        org.apache.commons.math3.complex.Complex complex8 = complex3.divide(complex7);
        org.apache.commons.math3.complex.Complex complex10 = complex8.add(2.718281828459045d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex4", complex3.equals(complex4) ? complex3.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test352");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex3.reciprocal();
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.valueOf(1.557407724654902d, 35.0d);
        org.apache.commons.math3.complex.Complex complex8 = complex3.divide(complex7);
        org.apache.commons.math3.complex.Complex complex9 = complex3.log();
        org.apache.commons.math3.complex.Complex complex10 = complex3.conjugate();
        org.apache.commons.math3.complex.Complex complex11 = complex3.log();
        double double12 = complex11.getImaginary();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex4", complex3.equals(complex4) ? complex3.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test353");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex5 = complex1.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex6 = complex1.cos();
        org.apache.commons.math3.complex.Complex complex7 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex8 = complex1.acos();
        org.apache.commons.math3.complex.Complex complex9 = complex8.cos();
        org.apache.commons.math3.complex.Complex complex10 = complex9.reciprocal();
        org.apache.commons.math3.complex.Complex complex12 = complex9.divide(1.8696525848328958d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex10", complex1.equals(complex10) ? complex1.hashCode() == complex10.hashCode() : true);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test354");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex4.log();
        org.apache.commons.math3.complex.Complex complex7 = complex4.add(1.0d);
        double double8 = complex4.getImaginary();
        org.apache.commons.math3.complex.Complex complex10 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex11 = complex10.exp();
        org.apache.commons.math3.complex.Complex complex12 = complex10.tanh();
        org.apache.commons.math3.complex.Complex complex13 = complex12.log();
        org.apache.commons.math3.complex.Complex complex15 = complex12.multiply(10);
        org.apache.commons.math3.complex.Complex complex16 = complex15.conjugate();
        org.apache.commons.math3.complex.Complex complex17 = complex15.tan();
        org.apache.commons.math3.complex.Complex complex18 = complex4.subtract(complex15);
        org.apache.commons.math3.complex.Complex complex19 = complex15.sqrt();
        double double20 = complex19.abs();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex15 and complex16", complex15.equals(complex16) ? complex15.hashCode() == complex16.hashCode() : true);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test355");
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
        org.apache.commons.math3.complex.Complex complex13 = complex7.sqrt();
        org.apache.commons.math3.complex.Complex complex15 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex16 = complex15.exp();
        double double17 = complex15.getArgument();
        org.apache.commons.math3.complex.Complex complex19 = complex15.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex20 = complex15.exp();
        org.apache.commons.math3.complex.Complex complex21 = complex13.divide(complex15);
        org.apache.commons.math3.complex.Complex complex22 = complex15.reciprocal();
        org.apache.commons.math3.complex.Complex complex23 = complex15.negate();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex22", complex1.equals(complex22) ? complex1.hashCode() == complex22.hashCode() : true);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test356");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex6 = complex1.acos();
        org.apache.commons.math3.complex.Complex complex8 = complex6.subtract((double) '#');
        org.apache.commons.math3.complex.Complex complex9 = complex6.asin();
        org.apache.commons.math3.complex.ComplexField complexField10 = complex9.getField();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex6", complex4.equals(complex6) ? complex4.hashCode() == complex6.hashCode() : true);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test357");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex(35.0d, 2.718281828459045d);
        org.apache.commons.math3.complex.Complex complex4 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex5 = complex4.exp();
        double double6 = complex4.getArgument();
        org.apache.commons.math3.complex.Complex complex8 = complex4.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex9 = complex4.sin();
        org.apache.commons.math3.complex.Complex complex10 = complex4.cosh();
        org.apache.commons.math3.complex.Complex complex11 = complex4.tan();
        org.apache.commons.math3.complex.Complex complex12 = complex4.tan();
        org.apache.commons.math3.complex.Complex complex14 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex15 = complex14.exp();
        double double16 = complex14.getArgument();
        org.apache.commons.math3.complex.Complex complex18 = complex14.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex19 = complex14.sin();
        org.apache.commons.math3.complex.Complex complex20 = complex14.cosh();
        org.apache.commons.math3.complex.Complex complex21 = complex14.tan();
        org.apache.commons.math3.complex.Complex complex22 = complex14.tan();
        org.apache.commons.math3.complex.Complex complex24 = complex14.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex25 = complex12.subtract(complex14);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList27 = complex25.nthRoot((int) '4');
        org.apache.commons.math3.complex.Complex complex28 = complex25.cos();
        org.apache.commons.math3.complex.Complex complex29 = complex28.asin();
        org.apache.commons.math3.complex.Complex complex30 = complex29.conjugate();
        org.apache.commons.math3.complex.Complex complex32 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double33 = complex32.getImaginary();
        org.apache.commons.math3.complex.Complex complex34 = complex32.negate();
        org.apache.commons.math3.complex.Complex complex36 = complex34.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex37 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex38 = complex34.subtract(complex37);
        org.apache.commons.math3.complex.Complex complex39 = complex29.multiply(complex38);
        org.apache.commons.math3.complex.Complex complex40 = complex2.divide(complex39);
        org.apache.commons.math3.complex.Complex complex42 = complex39.subtract((double) (short) 100);
        org.apache.commons.math3.complex.Complex complex43 = complex42.tanh();
        org.apache.commons.math3.complex.Complex complex45 = complex42.pow((double) (-1));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex34 and complex43", complex34.equals(complex43) ? complex34.hashCode() == complex43.hashCode() : true);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test358");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex5 = complex1.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex6 = complex1.cos();
        boolean boolean7 = complex1.isNaN();
        org.apache.commons.math3.complex.Complex complex8 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex9 = complex8.conjugate();
        org.apache.commons.math3.complex.Complex complex10 = complex8.negate();
        org.apache.commons.math3.complex.Complex complex11 = complex10.asin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex8 and complex9", complex8.equals(complex9) ? complex8.hashCode() == complex9.hashCode() : true);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test359");
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
        double double16 = complex3.getReal();
        org.apache.commons.math3.complex.Complex complex18 = complex3.multiply((double) 100);
        org.apache.commons.math3.complex.Complex complex19 = complex3.cos();
        java.lang.String str20 = complex3.toString();
        org.apache.commons.math3.complex.Complex complex21 = complex3.tanh();
        org.apache.commons.math3.complex.Complex complex22 = complex3.sqrt();
        org.apache.commons.math3.complex.Complex complex24 = complex22.divide((-4.2356788854834126E132d));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex4", complex3.equals(complex4) ? complex3.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test360");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex4 = complex2.pow((double) (short) 10);
        org.apache.commons.math3.complex.Complex complex5 = complex2.cosh();
        org.apache.commons.math3.complex.Complex complex7 = complex5.multiply(0.0d);
        org.apache.commons.math3.complex.Complex complex8 = complex5.sqrt1z();
        org.apache.commons.math3.complex.Complex complex9 = complex5.cosh();
        double double10 = complex9.getImaginary();
        org.apache.commons.math3.complex.Complex complex12 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex13 = complex12.exp();
        double double14 = complex12.getArgument();
        org.apache.commons.math3.complex.Complex complex16 = complex12.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex17 = complex12.sin();
        org.apache.commons.math3.complex.Complex complex18 = complex12.cosh();
        org.apache.commons.math3.complex.Complex complex19 = complex12.tan();
        org.apache.commons.math3.complex.Complex complex21 = complex12.multiply(1);
        org.apache.commons.math3.complex.Complex complex22 = complex12.negate();
        boolean boolean23 = complex12.isInfinite();
        org.apache.commons.math3.complex.Complex complex24 = complex9.subtract(complex12);
        org.apache.commons.math3.complex.Complex complex26 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex27 = complex26.exp();
        double double28 = complex26.getArgument();
        org.apache.commons.math3.complex.Complex complex30 = complex26.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex31 = complex26.exp();
        org.apache.commons.math3.complex.Complex complex33 = complex31.pow((-0.0d));
        double double34 = complex33.abs();
        org.apache.commons.math3.complex.Complex complex35 = complex33.sinh();
        boolean boolean36 = complex33.isInfinite();
        org.apache.commons.math3.complex.Complex complex37 = complex24.subtract(complex33);
        boolean boolean38 = complex24.isInfinite();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex12 and complex33", complex12.equals(complex33) ? complex12.hashCode() == complex33.hashCode() : true);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test361");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex((double) (-1L));
        org.apache.commons.math3.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math3.complex.Complex complex5 = org.apache.commons.math3.complex.Complex.valueOf((double) 100.0f, (double) (short) 1);
        org.apache.commons.math3.complex.Complex complex6 = complex5.acos();
        org.apache.commons.math3.complex.Complex complex7 = complex6.sin();
        org.apache.commons.math3.complex.Complex complex8 = complex1.pow(complex7);
        org.apache.commons.math3.complex.Complex complex10 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex11 = complex10.sqrt();
        org.apache.commons.math3.complex.Complex complex13 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double14 = complex13.getImaginary();
        org.apache.commons.math3.complex.Complex complex16 = complex13.pow((double) 100L);
        org.apache.commons.math3.complex.Complex complex17 = complex11.pow(complex16);
        org.apache.commons.math3.complex.Complex complex19 = complex17.subtract(263.6733373605274d);
        org.apache.commons.math3.complex.Complex complex20 = complex8.pow(complex17);
        org.apache.commons.math3.complex.Complex complex22 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex23 = complex22.exp();
        org.apache.commons.math3.complex.Complex complex24 = complex22.tanh();
        org.apache.commons.math3.complex.Complex complex25 = complex24.log();
        org.apache.commons.math3.complex.Complex complex27 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double28 = complex27.getImaginary();
        org.apache.commons.math3.complex.Complex complex29 = complex27.negate();
        org.apache.commons.math3.complex.Complex complex31 = complex29.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex32 = complex31.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList34 = complex31.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex36 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex37 = complex36.exp();
        org.apache.commons.math3.complex.Complex complex38 = complex36.tanh();
        org.apache.commons.math3.complex.Complex complex39 = complex31.subtract(complex36);
        org.apache.commons.math3.complex.Complex complex41 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex42 = complex41.exp();
        double double43 = complex41.getArgument();
        org.apache.commons.math3.complex.Complex complex45 = complex41.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex46 = complex41.sin();
        org.apache.commons.math3.complex.Complex complex47 = complex41.cosh();
        org.apache.commons.math3.complex.Complex complex48 = complex41.tan();
        org.apache.commons.math3.complex.Complex complex49 = complex41.tan();
        org.apache.commons.math3.complex.Complex complex51 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex52 = complex51.exp();
        double double53 = complex51.getArgument();
        org.apache.commons.math3.complex.Complex complex55 = complex51.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex56 = complex51.sin();
        org.apache.commons.math3.complex.Complex complex57 = complex51.cosh();
        org.apache.commons.math3.complex.Complex complex58 = complex51.tan();
        org.apache.commons.math3.complex.Complex complex59 = complex51.tan();
        org.apache.commons.math3.complex.Complex complex61 = complex51.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex62 = complex49.subtract(complex51);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList64 = complex62.nthRoot((int) '4');
        org.apache.commons.math3.complex.Complex complex65 = complex36.subtract(complex62);
        org.apache.commons.math3.complex.Complex complex66 = complex24.divide(complex65);
        org.apache.commons.math3.complex.Complex complex67 = complex66.sinh();
        org.apache.commons.math3.complex.Complex complex69 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex70 = complex69.exp();
        double double71 = complex69.getArgument();
        org.apache.commons.math3.complex.Complex complex73 = complex69.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex74 = complex66.divide(complex73);
        org.apache.commons.math3.complex.Complex complex75 = complex20.pow(complex74);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex29", complex1.equals(complex29) ? complex1.hashCode() == complex29.hashCode() : true);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test362");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 1, (double) 0L);
        org.apache.commons.math3.complex.Complex complex3 = complex2.negate();
        org.apache.commons.math3.complex.Complex complex5 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double6 = complex5.getImaginary();
        org.apache.commons.math3.complex.Complex complex7 = complex5.negate();
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex10 = complex9.exp();
        double double11 = complex9.getArgument();
        org.apache.commons.math3.complex.Complex complex12 = complex9.log();
        org.apache.commons.math3.complex.Complex complex13 = complex9.log();
        org.apache.commons.math3.complex.Complex complex15 = complex13.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex16 = complex7.subtract(complex15);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList18 = complex16.nthRoot(1);
        org.apache.commons.math3.complex.Complex complex19 = complex16.acos();
        org.apache.commons.math3.complex.Complex complex20 = complex2.pow(complex16);
        org.apache.commons.math3.complex.Complex complex21 = complex2.conjugate();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex5 and complex20", complex5.equals(complex20) ? complex5.hashCode() == complex20.hashCode() : true);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test363");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.sin();
        org.apache.commons.math3.complex.Complex complex7 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex8 = complex7.atan();
        boolean boolean9 = complex8.isInfinite();
        org.apache.commons.math3.complex.Complex complex10 = complex8.conjugate();
        org.apache.commons.math3.complex.Complex complex12 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex13 = complex12.exp();
        double double14 = complex12.getArgument();
        org.apache.commons.math3.complex.Complex complex16 = complex12.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex17 = complex12.exp();
        org.apache.commons.math3.complex.Complex complex18 = complex17.cosh();
        org.apache.commons.math3.complex.Complex complex20 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex21 = complex20.exp();
        double double22 = complex20.getArgument();
        org.apache.commons.math3.complex.Complex complex24 = complex20.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex25 = complex20.sin();
        org.apache.commons.math3.complex.Complex complex26 = complex20.cosh();
        org.apache.commons.math3.complex.Complex complex28 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double29 = complex28.getImaginary();
        boolean boolean30 = complex26.equals((java.lang.Object) double29);
        org.apache.commons.math3.complex.Complex complex31 = complex26.tanh();
        org.apache.commons.math3.complex.Complex complex32 = complex26.sin();
        org.apache.commons.math3.complex.Complex complex33 = complex32.log();
        org.apache.commons.math3.complex.Complex complex35 = complex32.multiply(100);
        org.apache.commons.math3.complex.Complex complex37 = complex32.multiply(0.8414709848078965d);
        org.apache.commons.math3.complex.Complex complex38 = complex17.pow(complex32);
        org.apache.commons.math3.complex.Complex complex39 = complex10.subtract(complex38);
        org.apache.commons.math3.complex.Complex complex41 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex42 = complex41.exp();
        double double43 = complex41.getArgument();
        org.apache.commons.math3.complex.Complex complex45 = complex41.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex46 = complex41.exp();
        java.lang.String str47 = complex41.toString();
        org.apache.commons.math3.complex.Complex complex48 = complex41.exp();
        org.apache.commons.math3.complex.Complex complex49 = complex39.subtract(complex48);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex8 and complex10", complex8.equals(complex10) ? complex8.hashCode() == complex10.hashCode() : true);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test364");
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
        boolean boolean15 = complex14.isInfinite();
        org.apache.commons.math3.complex.Complex complex16 = complex14.cos();
        org.apache.commons.math3.complex.Complex complex17 = complex14.conjugate();
        org.apache.commons.math3.complex.Complex complex19 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double20 = complex19.getImaginary();
        org.apache.commons.math3.complex.Complex complex21 = complex19.negate();
        org.apache.commons.math3.complex.Complex complex23 = complex21.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex24 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex25 = complex21.subtract(complex24);
        org.apache.commons.math3.complex.Complex complex26 = complex21.acos();
        org.apache.commons.math3.complex.Complex complex27 = complex21.log();
        org.apache.commons.math3.complex.Complex complex28 = complex27.conjugate();
        org.apache.commons.math3.complex.Complex complex29 = complex28.conjugate();
        org.apache.commons.math3.complex.Complex complex30 = complex28.sqrt();
        boolean boolean31 = complex14.equals((java.lang.Object) complex30);
        double double32 = complex30.abs();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex14 and complex17", complex14.equals(complex17) ? complex14.hashCode() == complex17.hashCode() : true);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test365");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex7 = complex6.cosh();
        org.apache.commons.math3.complex.Complex complex9 = complex7.divide((double) (short) 1);
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex12 = complex11.exp();
        org.apache.commons.math3.complex.Complex complex13 = complex11.tan();
        org.apache.commons.math3.complex.Complex complex15 = complex11.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex16 = complex11.cos();
        org.apache.commons.math3.complex.Complex complex17 = complex11.tan();
        boolean boolean18 = complex7.equals((java.lang.Object) complex11);
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
        org.apache.commons.math3.complex.Complex complex35 = complex34.sinh();
        double double36 = complex34.getImaginary();
        org.apache.commons.math3.complex.Complex complex37 = complex34.conjugate();
        org.apache.commons.math3.complex.Complex complex39 = complex37.multiply((-2.0d));
        org.apache.commons.math3.complex.Complex complex40 = complex11.add(complex37);
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
        org.apache.commons.math3.complex.Complex complex54 = complex48.sqrt();
        org.apache.commons.math3.complex.Complex complex55 = complex48.tanh();
        org.apache.commons.math3.complex.Complex complex56 = complex48.tanh();
        org.apache.commons.math3.complex.Complex complex58 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex59 = complex58.exp();
        double double60 = complex58.getArgument();
        org.apache.commons.math3.complex.Complex complex62 = complex58.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex63 = complex58.sin();
        org.apache.commons.math3.complex.Complex complex64 = complex58.cosh();
        org.apache.commons.math3.complex.Complex complex65 = complex58.tan();
        org.apache.commons.math3.complex.Complex complex66 = complex58.tan();
        org.apache.commons.math3.complex.Complex complex67 = complex66.reciprocal();
        org.apache.commons.math3.complex.Complex complex69 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double70 = complex69.getImaginary();
        org.apache.commons.math3.complex.Complex complex71 = complex69.negate();
        org.apache.commons.math3.complex.Complex complex73 = complex71.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex74 = complex73.atan();
        org.apache.commons.math3.complex.Complex complex75 = complex73.cosh();
        org.apache.commons.math3.complex.Complex complex76 = complex66.multiply(complex73);
        boolean boolean77 = complex56.equals((java.lang.Object) complex76);
        org.apache.commons.math3.complex.Complex complex78 = complex76.sqrt1z();
        org.apache.commons.math3.complex.Complex complex79 = complex11.add(complex76);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex34 and complex37", complex34.equals(complex37) ? complex34.hashCode() == complex37.hashCode() : true);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test366");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.acos();
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex8 = complex7.exp();
        double double9 = complex7.getArgument();
        org.apache.commons.math3.complex.Complex complex10 = complex7.log();
        org.apache.commons.math3.complex.Complex complex11 = complex7.log();
        org.apache.commons.math3.complex.Complex complex12 = complex5.multiply(complex7);
        org.apache.commons.math3.complex.Complex complex14 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex15 = complex14.exp();
        double double16 = complex14.getArgument();
        org.apache.commons.math3.complex.Complex complex18 = complex14.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex19 = complex14.exp();
        org.apache.commons.math3.complex.Complex complex20 = complex5.pow(complex19);
        double double21 = complex19.getImaginary();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex5", complex4.equals(complex5) ? complex4.hashCode() == complex5.hashCode() : true);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test367");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex7 = complex5.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex8 = complex7.cos();
        org.apache.commons.math3.complex.Complex complex9 = complex7.log();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex8", complex1.equals(complex8) ? complex1.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test368");
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
        org.apache.commons.math3.complex.Complex complex15 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double16 = complex15.getImaginary();
        org.apache.commons.math3.complex.Complex complex17 = complex15.negate();
        org.apache.commons.math3.complex.Complex complex19 = complex17.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex20 = complex19.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList22 = complex19.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex23 = complex19.negate();
        boolean boolean24 = complex19.isInfinite();
        org.apache.commons.math3.complex.Complex complex25 = complex19.asin();
        org.apache.commons.math3.complex.Complex complex26 = complex25.atan();
        org.apache.commons.math3.complex.Complex complex27 = complex1.divide(complex26);
        org.apache.commons.math3.complex.Complex complex29 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex30 = complex29.asin();
        org.apache.commons.math3.complex.Complex complex32 = complex30.divide(10.0d);
        org.apache.commons.math3.complex.Complex complex33 = complex1.divide(complex30);
        org.apache.commons.math3.complex.Complex complex34 = complex30.negate();
        org.apache.commons.math3.complex.Complex complex35 = complex30.sin();
        org.apache.commons.math3.complex.Complex complex37 = complex30.divide(4.242117536224665d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex35", complex1.equals(complex35) ? complex1.hashCode() == complex35.hashCode() : true);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test369");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex7 = complex1.sqrt1z();
        org.apache.commons.math3.complex.Complex complex8 = complex1.acos();
        org.apache.commons.math3.complex.Complex complex9 = complex8.acos();
        org.apache.commons.math3.complex.Complex complex10 = complex9.asin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex7 and complex8", complex7.equals(complex8) ? complex7.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test370");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex((double) (-1));
        org.apache.commons.math3.complex.Complex complex2 = complex1.log();
        org.apache.commons.math3.complex.Complex complex4 = complex2.divide(1.557407724654902d);
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex8 = complex6.divide((double) (short) 100);
        org.apache.commons.math3.complex.Complex complex9 = complex4.divide(complex6);
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double12 = complex11.getImaginary();
        org.apache.commons.math3.complex.Complex complex13 = complex11.negate();
        org.apache.commons.math3.complex.Complex complex15 = complex13.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex16 = complex15.atan();
        org.apache.commons.math3.complex.Complex complex18 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex19 = complex18.exp();
        double double20 = complex18.getArgument();
        org.apache.commons.math3.complex.Complex complex22 = complex18.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex23 = complex18.sin();
        org.apache.commons.math3.complex.Complex complex24 = complex18.cosh();
        org.apache.commons.math3.complex.Complex complex26 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double27 = complex26.getImaginary();
        boolean boolean28 = complex24.equals((java.lang.Object) double27);
        org.apache.commons.math3.complex.Complex complex29 = complex24.tanh();
        org.apache.commons.math3.complex.Complex complex30 = complex15.subtract(complex29);
        org.apache.commons.math3.complex.Complex complex32 = complex30.pow(Double.NaN);
        org.apache.commons.math3.complex.Complex complex33 = complex30.sinh();
        org.apache.commons.math3.complex.Complex complex36 = org.apache.commons.math3.complex.Complex.valueOf((double) 100L, 0.0d);
        org.apache.commons.math3.complex.Complex complex37 = complex30.subtract(complex36);
        org.apache.commons.math3.complex.Complex complex39 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double40 = complex39.getImaginary();
        org.apache.commons.math3.complex.Complex complex41 = complex39.negate();
        org.apache.commons.math3.complex.Complex complex43 = complex41.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex44 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex45 = complex41.subtract(complex44);
        org.apache.commons.math3.complex.Complex complex46 = complex41.asin();
        org.apache.commons.math3.complex.Complex complex47 = complex46.asin();
        org.apache.commons.math3.complex.Complex complex48 = complex46.cos();
        org.apache.commons.math3.complex.Complex complex51 = org.apache.commons.math3.complex.Complex.valueOf(0.0d, (double) (byte) -1);
        org.apache.commons.math3.complex.Complex complex52 = complex51.sinh();
        org.apache.commons.math3.complex.Complex complex54 = new org.apache.commons.math3.complex.Complex(10.0d);
        org.apache.commons.math3.complex.Complex complex56 = complex54.divide((double) 'a');
        org.apache.commons.math3.complex.Complex complex57 = complex52.divide(complex54);
        org.apache.commons.math3.complex.Complex complex58 = complex54.sqrt1z();
        org.apache.commons.math3.complex.Complex complex60 = complex58.subtract(76.15941559557649d);
        boolean boolean61 = complex48.equals((java.lang.Object) complex60);
        org.apache.commons.math3.complex.Complex complex62 = complex36.divide(complex48);
        org.apache.commons.math3.complex.Complex complex63 = complex9.divide(complex48);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex13", complex1.equals(complex13) ? complex1.hashCode() == complex13.hashCode() : true);
    }
}

