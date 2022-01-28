import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.complex.Complex complex7 = complex1.add(complex6);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.sin();
        org.apache.commons.math3.complex.Complex complex7 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double10 = complex9.getImaginary();
        boolean boolean11 = complex7.equals((java.lang.Object) double10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.math3.complex.Complex> complexList13 = complex7.nthRoot(0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: cannot compute nth root for null or negative n: 0");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex3.reciprocal();
        java.lang.Class<?> wildcardClass5 = complex3.getClass();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 100);
        org.junit.Assert.assertNotNull(complex1);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
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
        java.lang.Class<?> wildcardClass25 = complexList24.getClass();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complexList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.acos();
        org.apache.commons.math3.complex.Complex complex7 = complex5.add((double) 0L);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex6 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex7 = complex1.conjugate();
        org.apache.commons.math3.complex.Complex complex8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.complex.Complex complex9 = complex1.subtract(complex8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex6 = complex1.acos();
        org.apache.commons.math3.complex.Complex complex8 = complex6.subtract((double) '#');
        org.apache.commons.math3.complex.Complex complex9 = complex6.asin();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
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
        java.lang.Class<?> wildcardClass40 = complex36.getClass();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexList8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complexList38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math3.complex.Complex complex4 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double5 = complex4.getImaginary();
        org.apache.commons.math3.complex.Complex complex7 = complex4.pow((double) 100L);
        org.apache.commons.math3.complex.Complex complex8 = complex2.pow(complex7);
        java.lang.Class<?> wildcardClass9 = complex7.getClass();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
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
        java.lang.Class<?> wildcardClass21 = complex20.getClass();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex6 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex7 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex9 = complex7.multiply((int) 'a');
        double double10 = complex9.getReal();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 263.6733373605274d + "'", double10 == 263.6733373605274d);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) (short) 10, (double) ' ');
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex7 = complex5.divide((double) (short) 0);
        java.lang.Class<?> wildcardClass8 = complex5.getClass();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex3.reciprocal();
        org.apache.commons.math3.complex.ComplexField complexField5 = complex3.getField();
        org.apache.commons.math3.complex.Complex complex6 = complex3.reciprocal();
        double double7 = complex3.abs();
        org.apache.commons.math3.complex.Complex complex8 = complex3.acos();
        org.apache.commons.math3.complex.Complex complex10 = complex3.subtract((double) 0.0f);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complexField5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex4.log();
        boolean boolean6 = complex4.isNaN();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
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
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complexField13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex7 = complex1.pow((double) 100.0f);
        org.apache.commons.math3.complex.Complex complex8 = complex7.sin();
        org.apache.commons.math3.complex.Complex complex9 = complex8.negate();
        org.apache.commons.math3.complex.Complex complex10 = complex9.sin();
        double double11 = complex10.getArgument();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-3.141592653589793d) + "'", double11 == (-3.141592653589793d));
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex1 = complex0.exp();
        java.lang.String str2 = complex0.toString();
        boolean boolean3 = complex0.isNaN();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(Infinity, Infinity)" + "'", str2, "(Infinity, Infinity)");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math3.complex.Complex complex7 = complex5.cosh();
        java.lang.String str8 = complex5.toString();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(1.0, 0.0)" + "'", str8, "(1.0, 0.0)");
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((double) 100.0f, (-3.141592653589793d));
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) (-1));
        org.junit.Assert.assertNotNull(complex1);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 1, (double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex3 = complex2.tanh();
        double double4 = complex2.getImaginary();
        boolean boolean5 = complex2.isInfinite();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) (short) 10);
        org.apache.commons.math3.complex.Complex complex2 = complex1.log();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex6 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex8 = complex6.pow((-0.0d));
        double double9 = complex8.abs();
        org.apache.commons.math3.complex.Complex complex11 = complex8.subtract((double) (-1));
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(complex11);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((double) (-1.0f), (double) '#');
        double double3 = complex2.getImaginary();
        org.apache.commons.math3.complex.Complex complex5 = complex2.pow((double) (short) 1);
        java.lang.Class<?> wildcardClass6 = complex2.getClass();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((double) 0L, (double) 10.0f);
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex7 = complex3.pow((double) 100L);
        org.apache.commons.math3.complex.Complex complex9 = complex3.subtract((double) (byte) 1);
        java.lang.Class<?> wildcardClass10 = complex9.getClass();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
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
        org.apache.commons.math3.complex.Complex complex21 = complex19.cos();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex6 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex8 = complex6.pow((-0.0d));
        org.apache.commons.math3.complex.Complex complex9 = complex8.negate();
        org.apache.commons.math3.complex.Complex complex10 = complex8.sinh();
        org.apache.commons.math3.complex.Complex complex11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.complex.Complex complex12 = complex8.add(complex11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) '#');
        double double6 = complex1.getReal();
        org.apache.commons.math3.complex.Complex complex7 = complex1.atan();
        java.lang.Class<?> wildcardClass8 = complex1.getClass();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.math3.complex.Complex> complexList18 = complex16.nthRoot((-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: cannot compute nth root for null or negative n: -1");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexList8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math3.complex.Complex complex8 = complex6.subtract((double) 1.0f);
        org.apache.commons.math3.complex.Complex complex9 = complex8.conjugate();
        double double10 = complex9.abs();
        org.apache.commons.math3.complex.Complex complex11 = complex9.cos();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.21460183660255172d + "'", double10 == 0.21460183660255172d);
        org.junit.Assert.assertNotNull(complex11);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.sqrt1z();
        org.apache.commons.math3.complex.Complex complex8 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex9 = complex8.sqrt();
        org.apache.commons.math3.complex.Complex complex10 = complex9.conjugate();
        org.apache.commons.math3.complex.Complex complex11 = complex5.subtract(complex10);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex(0.21460183660255172d);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
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
        boolean boolean18 = complex3.isNaN();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
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
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((double) 100.0f, (double) (short) 1);
        java.lang.Class<?> wildcardClass3 = complex2.getClass();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex7 = complex1.pow((double) 100.0f);
        java.lang.Class<?> wildcardClass8 = complex7.getClass();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex3 = complex1.subtract((double) (-1));
        double double4 = complex1.getArgument();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf(263.6733373605274d);
        org.junit.Assert.assertNotNull(complex1);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.ComplexField complexField5 = complex1.getField();
        java.lang.String str6 = complex1.toString();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complexField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(1.0, 0.0)" + "'", str6, "(1.0, 0.0)");
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 10.0f, (double) 1L);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex7 = complex1.pow((double) 100.0f);
        org.apache.commons.math3.complex.Complex complex8 = complex7.sin();
        org.apache.commons.math3.complex.Complex complex10 = complex8.subtract((double) 1);
        org.apache.commons.math3.complex.Complex complex12 = complex10.multiply(0.0d);
        java.lang.Class<?> wildcardClass13 = complex10.getClass();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.math3.complex.Complex> complexList19 = complex16.nthRoot((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: cannot compute nth root for null or negative n: -1");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
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
        org.apache.commons.math3.complex.Complex complex15 = complex5.asin();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexList8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex5.nthRoot((int) ' ');
        java.lang.Class<?> wildcardClass9 = complex5.getClass();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex5 = complex1.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex6 = complex1.cos();
        org.apache.commons.math3.complex.Complex complex7 = complex1.conjugate();
        org.apache.commons.math3.complex.ComplexField complexField8 = complex7.getField();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complexField8);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) '#');
        double double6 = complex1.getReal();
        org.apache.commons.math3.complex.Complex complex7 = complex1.atan();
        org.apache.commons.math3.complex.Complex complex8 = complex1.sqrt1z();
        org.apache.commons.math3.complex.Complex complex9 = complex1.reciprocal();
        org.apache.commons.math3.complex.Complex complex10 = complex9.sqrt();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex5 = complex1.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex7 = complex5.multiply(100);
        org.apache.commons.math3.complex.Complex complex9 = complex5.multiply((int) (short) 0);
        java.lang.Class<?> wildcardClass10 = complex5.getClass();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
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
        org.apache.commons.math3.complex.Complex complex15 = complex14.cosh();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexList8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
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
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math3.complex.Complex complex3 = complex2.conjugate();
        java.lang.String str4 = complex3.toString();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(1.0, -0.0)" + "'", str4, "(1.0, -0.0)");
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex5.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex9 = complex5.negate();
        boolean boolean10 = complex5.isInfinite();
        org.apache.commons.math3.complex.Complex complex11 = complex5.negate();
        double double12 = complex5.getReal();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexList8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.math3.complex.Complex> complexList7 = complex1.nthRoot((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: cannot compute nth root for null or negative n: 0");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((-2.0d), (double) 100L);
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex6 = complex1.acos();
        org.apache.commons.math3.complex.Complex complex7 = complex6.log();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex((double) 1);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.math3.complex.Complex> complexList24 = complex21.nthRoot((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: cannot compute nth root for null or negative n: 0");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex5 = complex1.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex7 = complex5.multiply(100);
        java.lang.Class<?> wildcardClass8 = complex5.getClass();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.exp();
        boolean boolean7 = complex1.isNaN();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
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
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexList8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
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
        double double18 = complex3.getImaginary();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.0d) + "'", double18 == (-0.0d));
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
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
        org.apache.commons.math3.complex.Complex complex15 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex16 = complex15.exp();
        org.apache.commons.math3.complex.Complex complex17 = complex15.tanh();
        org.apache.commons.math3.complex.Complex complex18 = complex17.log();
        org.apache.commons.math3.complex.Complex complex19 = complex17.acos();
        org.apache.commons.math3.complex.Complex complex20 = complex19.reciprocal();
        org.apache.commons.math3.complex.Complex complex21 = complex2.add(complex19);
        org.apache.commons.math3.complex.Complex complex22 = complex21.cos();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.math3.complex.Complex> complexList24 = complex22.nthRoot((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: cannot compute nth root for null or negative n: 0");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.sin();
        org.apache.commons.math3.complex.Complex complex7 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex8 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex10 = complex1.multiply(1);
        org.apache.commons.math3.complex.Complex complex11 = complex1.negate();
        double double12 = complex11.getReal();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf(263.6733373605274d, (double) (-1));
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math3.complex.Complex complex3 = complex1.sqrt();
        org.apache.commons.math3.complex.Complex complex4 = complex3.cosh();
        org.apache.commons.math3.complex.Complex complex6 = complex3.add((double) ' ');
        org.apache.commons.math3.complex.Complex complex7 = complex3.tan();
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex10 = complex9.exp();
        double double11 = complex9.getArgument();
        org.apache.commons.math3.complex.Complex complex12 = complex9.log();
        org.apache.commons.math3.complex.Complex complex13 = complex12.log();
        org.apache.commons.math3.complex.Complex complex15 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex16 = complex15.exp();
        double double17 = complex15.getArgument();
        org.apache.commons.math3.complex.Complex complex19 = complex15.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex20 = complex15.sin();
        org.apache.commons.math3.complex.Complex complex21 = complex15.cosh();
        org.apache.commons.math3.complex.Complex complex22 = complex15.tanh();
        org.apache.commons.math3.complex.Complex complex23 = complex15.log();
        org.apache.commons.math3.complex.Complex complex24 = complex13.multiply(complex15);
        org.apache.commons.math3.complex.Complex complex25 = complex24.negate();
        org.apache.commons.math3.complex.Complex complex26 = complex7.divide(complex25);
        org.apache.commons.math3.complex.Complex complex28 = complex25.subtract(1.0d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex28);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex7 = complex3.pow((double) 100L);
        boolean boolean8 = complex7.isInfinite();
        org.apache.commons.math3.complex.Complex complex9 = complex7.sin();
        org.apache.commons.math3.complex.ComplexField complexField10 = complex7.getField();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complexField10);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
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
        org.apache.commons.math3.complex.Complex complex21 = complex5.cosh();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((double) (-1.0f), (double) '#');
        double double3 = complex2.getImaginary();
        org.apache.commons.math3.complex.Complex complex5 = complex2.pow((double) (short) 1);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList7 = complex5.nthRoot((int) (short) 100);
        java.lang.Class<?> wildcardClass8 = complex5.getClass();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complexList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex7 = complex3.pow((double) 100L);
        org.apache.commons.math3.complex.Complex complex8 = complex7.sqrt();
        java.lang.Class<?> wildcardClass9 = complex8.getClass();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 'a');
        org.junit.Assert.assertNotNull(complex1);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex(Double.NaN, (double) 0);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex((-2.0d));
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
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
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(complex29);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) '#');
        double double6 = complex1.getReal();
        org.apache.commons.math3.complex.Complex complex7 = complex1.atan();
        org.apache.commons.math3.complex.Complex complex8 = complex1.sqrt1z();
        double double9 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex10 = complex1.tanh();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(complex10);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 0.0f, (double) 10.0f);
        org.apache.commons.math3.complex.Complex complex3 = complex2.sin();
        double double4 = complex3.getReal();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.sin();
        org.apache.commons.math3.complex.Complex complex7 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex8 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex9 = complex1.tan();
        java.lang.Class<?> wildcardClass10 = complex1.getClass();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex(0.0d);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((double) 100.0f, (double) (short) 1);
        org.apache.commons.math3.complex.Complex complex3 = complex2.sqrt();
        org.apache.commons.math3.complex.ComplexField complexField4 = complex2.getField();
        double double5 = complex2.getImaginary();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complexField4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
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
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex15);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex3 = complex1.divide((double) (short) 100);
        org.apache.commons.math3.complex.Complex complex4 = complex3.sqrt1z();
        boolean boolean5 = complex3.isInfinite();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex6 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex8 = complex6.pow((-0.0d));
        org.apache.commons.math3.complex.Complex complex10 = complex8.divide(0.0d);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
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
        java.lang.String str22 = complex16.toString();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "(1.0, 0.0)" + "'", str22, "(1.0, 0.0)");
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex4 = complex2.pow((double) (short) 10);
        double double5 = complex2.abs();
        org.apache.commons.math3.complex.Complex complex7 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex8 = complex7.sqrt();
        org.apache.commons.math3.complex.Complex complex9 = complex7.sqrt();
        org.apache.commons.math3.complex.Complex complex10 = complex9.cosh();
        org.apache.commons.math3.complex.Complex complex12 = complex9.add((double) ' ');
        org.apache.commons.math3.complex.Complex complex13 = complex2.divide(complex9);
        org.apache.commons.math3.complex.Complex complex14 = complex9.atan();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math3.complex.Complex complex3 = complex1.sqrt();
        org.apache.commons.math3.complex.Complex complex4 = complex3.cosh();
        double double5 = complex4.getImaginary();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex4 = complex2.pow((double) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.math3.complex.Complex> complexList6 = complex4.nthRoot((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: cannot compute nth root for null or negative n: 0");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
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
        org.apache.commons.math3.complex.Complex complex13 = complex7.sin();
        org.apache.commons.math3.complex.Complex complex14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.complex.Complex complex15 = complex7.multiply(complex14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
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
        double double32 = complex6.abs();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex5 = complex1.subtract((double) (short) 0);
        double double6 = complex1.getImaginary();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList6 = complex4.nthRoot((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex4.nthRoot((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: cannot compute nth root for null or negative n: -1");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complexList6);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
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
        org.apache.commons.math3.complex.ComplexField complexField13 = complex11.getField();
        double double14 = complex11.getReal();
        boolean boolean15 = complex11.isNaN();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complexField13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.NaN;
        org.apache.commons.math3.complex.Complex complex1 = complex0.tanh();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex(0.8414709848078965d);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 0);
        org.junit.Assert.assertNotNull(complex1);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.sinh();
        double double5 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex7 = complex1.subtract((double) (byte) 1);
        java.lang.Class<?> wildcardClass8 = complex7.getClass();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.sin();
        org.apache.commons.math3.complex.Complex complex7 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double10 = complex9.getImaginary();
        boolean boolean11 = complex7.equals((java.lang.Object) double10);
        double double12 = complex7.abs();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.5430806348152437d + "'", double12 == 1.5430806348152437d);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
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
        boolean boolean20 = complex9.isInfinite();
        boolean boolean22 = complex9.equals((java.lang.Object) 35.0d);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex6 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex7 = complex1.exp();
        double double8 = complex7.getReal();
        org.apache.commons.math3.complex.Complex complex9 = complex7.sinh();
        org.apache.commons.math3.complex.Complex complex11 = complex9.subtract((double) 'a');
        org.apache.commons.math3.complex.Complex complex12 = complex11.reciprocal();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.718281828459045d + "'", double8 == 2.718281828459045d);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex6 = complex1.sqrt1z();
        org.apache.commons.math3.complex.Complex complex8 = complex6.pow((double) 1L);
        double double9 = complex8.getArgument();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math3.complex.Complex complex3 = complex1.sqrt();
        org.apache.commons.math3.complex.Complex complex4 = complex3.cosh();
        org.apache.commons.math3.complex.Complex complex6 = complex3.add((double) ' ');
        org.apache.commons.math3.complex.Complex complex7 = complex3.tan();
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex10 = complex9.exp();
        double double11 = complex9.getArgument();
        org.apache.commons.math3.complex.Complex complex12 = complex9.log();
        org.apache.commons.math3.complex.Complex complex13 = complex9.log();
        org.apache.commons.math3.complex.Complex complex14 = complex9.sqrt1z();
        org.apache.commons.math3.complex.Complex complex16 = complex14.pow((double) 1L);
        org.apache.commons.math3.complex.Complex complex17 = complex7.add(complex14);
        double double18 = complex17.getImaginary();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex((double) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.math3.complex.Complex> complexList3 = complex1.nthRoot((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: cannot compute nth root for null or negative n: 0");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((double) (-1.0f), (double) '#');
        double double3 = complex2.getImaginary();
        org.apache.commons.math3.complex.Complex complex5 = complex2.pow((double) (short) 1);
        double double6 = complex5.getImaginary();
        java.lang.Class<?> wildcardClass7 = complex5.getClass();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.0d + "'", double6 == 35.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex2.abs();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
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
        org.apache.commons.math3.complex.ComplexField complexField14 = complex13.getField();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complexField14);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) (-1.0f), (double) '#');
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf(4.242117536224665d);
        org.junit.Assert.assertNotNull(complex1);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
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
        org.apache.commons.math3.complex.Complex complex16 = complex14.negate();
        double double17 = complex14.getReal();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexList8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "(1.5707963267948966, -0.0)" + "'", str15, "(1.5707963267948966, -0.0)");
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.5707963267948966d + "'", double17 == 1.5707963267948966d);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex7 = complex5.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex8 = complex7.exp();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.math3.complex.Complex> complexList10 = complex8.nthRoot((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: cannot compute nth root for null or negative n: -1");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex7 = complex1.sqrt1z();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.math3.complex.Complex> complexList9 = complex7.nthRoot(0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: cannot compute nth root for null or negative n: 0");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex1 = complex0.negate();
        boolean boolean2 = complex1.isNaN();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100, (double) 10.0f);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex7 = complex5.divide((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex9 = complex7.multiply((int) (byte) 1);
        boolean boolean10 = complex9.isInfinite();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.math3.complex.Complex> complexList12 = complex9.nthRoot(0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: cannot compute nth root for null or negative n: 0");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
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
        org.apache.commons.math3.complex.Complex complex19 = complex11.tan();
        org.apache.commons.math3.complex.ComplexField complexField20 = complex19.getField();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexList8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complexField20);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math3.complex.Complex complex7 = complex5.cosh();
        boolean boolean8 = complex7.isNaN();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
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
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(complex20);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1L);
        org.junit.Assert.assertNotNull(complex1);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex7 = complex3.subtract(complex6);
        org.apache.commons.math3.complex.Complex complex8 = complex3.asin();
        org.apache.commons.math3.complex.Complex complex10 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex11 = complex10.exp();
        double double12 = complex10.getArgument();
        org.apache.commons.math3.complex.Complex complex14 = complex10.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex15 = complex10.tanh();
        org.apache.commons.math3.complex.Complex complex16 = complex8.divide(complex15);
        org.apache.commons.math3.complex.Complex complex18 = complex8.divide(52.0d);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex18);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex4.log();
        double double6 = complex5.abs();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex5 = complex1.subtract((double) (short) 0);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList7 = complex5.nthRoot((int) (short) 1);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complexList7);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf(1.5707963267948966d, (double) (byte) -1);
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex5.sinh();
        java.lang.Class<?> wildcardClass7 = complex6.getClass();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex5 = complex1.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex7 = complex5.multiply(100);
        org.apache.commons.math3.complex.Complex complex9 = complex5.multiply((int) (short) 0);
        org.apache.commons.math3.complex.Complex complex11 = complex5.multiply((int) (byte) 0);
        org.apache.commons.math3.complex.Complex complex12 = complex5.cos();
        org.apache.commons.math3.complex.Complex complex14 = complex12.multiply((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.complex.Complex complex16 = complex12.divide(complex15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex5 = complex1.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex6 = complex1.cos();
        double double7 = complex6.getArgument();
        java.lang.String str8 = complex6.toString();
        org.apache.commons.math3.complex.Complex complex10 = complex6.pow((-1.0d));
        boolean boolean11 = complex6.isNaN();
        org.apache.commons.math3.complex.Complex complex13 = complex6.add((double) 1);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-0.0d) + "'", double7 == (-0.0d));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(0.5403023058681398, -0.0)" + "'", str8, "(0.5403023058681398, -0.0)");
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(complex13);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
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
        org.apache.commons.math3.complex.Complex complex25 = complex22.asin();
        org.apache.commons.math3.complex.Complex complex27 = complex25.multiply((int) 'a');
        org.apache.commons.math3.complex.Complex complex28 = complex27.sqrt1z();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complexList24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
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
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complexList19);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "(1.5707963267948966, -0.0)" + "'", str26, "(1.5707963267948966, -0.0)");
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complexList36);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex46);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex3 = complex1.subtract((double) (-1));
        org.apache.commons.math3.complex.Complex complex5 = complex1.multiply((int) (short) 0);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList7 = complex5.nthRoot((int) (short) 100);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complexList7);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 10.0f, (double) (short) -1);
        org.apache.commons.math3.complex.Complex complex3 = complex2.tan();
        org.junit.Assert.assertNotNull(complex3);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tanh();
        org.apache.commons.math3.complex.Complex complex4 = complex3.log();
        org.apache.commons.math3.complex.Complex complex5 = complex3.acos();
        org.apache.commons.math3.complex.Complex complex6 = complex5.reciprocal();
        org.apache.commons.math3.complex.Complex complex7 = complex5.exp();
        org.apache.commons.math3.complex.Complex complex8 = complex7.cosh();
        org.apache.commons.math3.complex.Complex complex9 = complex7.tan();
        org.apache.commons.math3.complex.Complex complex10 = complex7.sqrt1z();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex(52.0d, (double) '4');
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex5 = complex1.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex6 = complex1.cos();
        boolean boolean7 = complex1.isNaN();
        org.apache.commons.math3.complex.Complex complex8 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex9 = complex1.asin();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.math3.complex.Complex> complexList11 = complex1.nthRoot((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: cannot compute nth root for null or negative n: 0");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) (short) -1, (double) '4');
        org.apache.commons.math3.complex.Complex complex3 = complex2.sinh();
        java.lang.Class<?> wildcardClass4 = complex2.getClass();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
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
        org.apache.commons.math3.complex.Complex complex14 = complex7.log();
        org.apache.commons.math3.complex.Complex complex16 = complex7.divide((double) 100);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) '4');
        double double2 = complex1.getReal();
        double double3 = complex1.getImaginary();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
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
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex4 = complex1.pow((double) 100L);
        org.apache.commons.math3.complex.Complex complex6 = complex4.pow((double) (short) 100);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex3 = complex2.exp();
        org.apache.commons.math3.complex.Complex complex4 = complex2.tan();
        org.apache.commons.math3.complex.Complex complex6 = complex2.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex8 = complex6.multiply(100);
        org.apache.commons.math3.complex.Complex complex9 = complex8.tanh();
        org.apache.commons.math3.complex.Complex complex10 = complex0.subtract(complex9);
        org.apache.commons.math3.complex.Complex complex11 = complex9.sqrt1z();
        org.apache.commons.math3.complex.Complex complex12 = complex9.conjugate();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf(100.0d, Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
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
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) (short) 100);
        org.junit.Assert.assertNotNull(complex1);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
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
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complexField20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertNotNull(complex23);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex4.log();
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex8 = complex7.exp();
        double double9 = complex7.getArgument();
        org.apache.commons.math3.complex.Complex complex11 = complex7.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex12 = complex7.sin();
        org.apache.commons.math3.complex.Complex complex13 = complex7.cosh();
        org.apache.commons.math3.complex.Complex complex14 = complex7.tanh();
        org.apache.commons.math3.complex.Complex complex15 = complex7.log();
        org.apache.commons.math3.complex.Complex complex16 = complex5.multiply(complex7);
        org.apache.commons.math3.complex.Complex complex17 = complex16.negate();
        double double18 = complex16.getImaginary();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + Double.POSITIVE_INFINITY + "'", double18 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
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
        org.apache.commons.math3.complex.Complex complex15 = complex5.log();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexList8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex4.log();
        org.apache.commons.math3.complex.Complex complex7 = complex4.add(1.0d);
        double double8 = complex4.getReal();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
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
        org.apache.commons.math3.complex.Complex complex35 = complex29.sinh();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
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
        org.apache.commons.math3.complex.Complex complex25 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex26 = complex25.exp();
        double double27 = complex25.getArgument();
        org.apache.commons.math3.complex.Complex complex29 = complex25.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex30 = complex25.sin();
        org.apache.commons.math3.complex.Complex complex31 = complex25.cosh();
        org.apache.commons.math3.complex.Complex complex32 = complex25.tan();
        org.apache.commons.math3.complex.Complex complex33 = complex25.tan();
        org.apache.commons.math3.complex.Complex complex35 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex36 = complex35.exp();
        double double37 = complex35.getArgument();
        org.apache.commons.math3.complex.Complex complex39 = complex35.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex40 = complex35.sin();
        org.apache.commons.math3.complex.Complex complex41 = complex35.cosh();
        org.apache.commons.math3.complex.Complex complex42 = complex35.tan();
        org.apache.commons.math3.complex.Complex complex43 = complex35.tan();
        org.apache.commons.math3.complex.Complex complex45 = complex35.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex46 = complex33.subtract(complex35);
        org.apache.commons.math3.complex.Complex complex47 = complex46.tanh();
        org.apache.commons.math3.complex.Complex complex48 = complex46.asin();
        org.apache.commons.math3.complex.Complex complex49 = complex15.subtract(complex48);
        boolean boolean50 = complex15.isInfinite();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexList8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
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
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexList8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex5.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex9 = complex5.negate();
        double double10 = complex9.getImaginary();
        boolean boolean11 = complex9.isInfinite();
        org.apache.commons.math3.complex.Complex complex13 = complex9.add(Double.NaN);
        org.apache.commons.math3.complex.Complex complex14 = complex9.atan();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexList8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.0d) + "'", double10 == (-0.0d));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
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
        org.apache.commons.math3.complex.Complex complex17 = complex15.log();
        org.apache.commons.math3.complex.Complex complex18 = complex17.reciprocal();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
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
        java.lang.Class<?> wildcardClass15 = complex7.getClass();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex7 = complex5.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex8 = complex7.exp();
        org.apache.commons.math3.complex.Complex complex9 = complex8.log();
        org.apache.commons.math3.complex.Complex complex11 = complex8.multiply((int) (byte) 0);
        double double12 = complex11.getArgument();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex(10.0d);
        org.apache.commons.math3.complex.Complex complex3 = complex1.divide((double) 'a');
        org.apache.commons.math3.complex.Complex complex5 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex6 = complex5.exp();
        double double7 = complex5.getArgument();
        org.apache.commons.math3.complex.Complex complex9 = complex5.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex10 = complex5.tanh();
        org.apache.commons.math3.complex.Complex complex12 = complex10.multiply((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex13 = complex3.pow(complex12);
        org.apache.commons.math3.complex.Complex complex14 = complex3.log();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex(0.009999666686665238d);
        org.apache.commons.math3.complex.Complex complex2 = complex1.sinh();
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.sin();
        org.apache.commons.math3.complex.Complex complex7 = complex1.conjugate();
        boolean boolean8 = complex7.isInfinite();
        double double9 = complex7.getReal();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex7 = complex3.subtract(complex6);
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double10 = complex9.getImaginary();
        org.apache.commons.math3.complex.Complex complex11 = complex9.negate();
        org.apache.commons.math3.complex.Complex complex13 = complex11.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex14 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex15 = complex11.subtract(complex14);
        org.apache.commons.math3.complex.Complex complex16 = complex11.asin();
        org.apache.commons.math3.complex.Complex complex18 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex19 = complex18.exp();
        double double20 = complex18.getArgument();
        org.apache.commons.math3.complex.Complex complex22 = complex18.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex23 = complex18.tanh();
        org.apache.commons.math3.complex.Complex complex24 = complex16.divide(complex23);
        org.apache.commons.math3.complex.Complex complex25 = complex16.conjugate();
        org.apache.commons.math3.complex.Complex complex26 = complex6.subtract(complex25);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex7 = complex3.subtract(complex6);
        org.apache.commons.math3.complex.Complex complex9 = complex3.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex10 = complex3.sin();
        org.apache.commons.math3.complex.Complex complex11 = complex3.sqrt();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.math3.complex.Complex> complexList13 = complex11.nthRoot((-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: cannot compute nth root for null or negative n: -1");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) ' ', 0.0d);
        org.apache.commons.math3.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math3.complex.Complex complex4 = complex3.exp();
        org.apache.commons.math3.complex.Complex complex5 = complex3.sin();
        org.apache.commons.math3.complex.Complex complex6 = complex3.tan();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex6 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex8 = complex6.pow((-0.0d));
        org.apache.commons.math3.complex.Complex complex9 = complex8.negate();
        org.apache.commons.math3.complex.Complex complex10 = complex8.sinh();
        boolean boolean11 = complex8.isNaN();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tanh();
        org.apache.commons.math3.complex.Complex complex4 = complex3.log();
        org.apache.commons.math3.complex.Complex complex5 = complex3.acos();
        org.apache.commons.math3.complex.Complex complex6 = complex3.tanh();
        org.apache.commons.math3.complex.Complex complex7 = complex6.asin();
        org.apache.commons.math3.complex.Complex complex8 = complex6.cosh();
        org.apache.commons.math3.complex.Complex complex9 = complex6.tan();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
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
        org.apache.commons.math3.complex.Complex complex17 = complex16.cosh();
        org.apache.commons.math3.complex.Complex complex19 = complex17.multiply((double) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.math3.complex.Complex> complexList21 = complex17.nthRoot(0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: cannot compute nth root for null or negative n: 0");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex19);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
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
        org.apache.commons.math3.complex.Complex complex22 = complex16.atan();
        org.apache.commons.math3.complex.Complex complex24 = complex16.subtract(3.8412897345910653E-4d);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex24);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
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
        java.lang.String str16 = complex14.toString();
        org.apache.commons.math3.complex.Complex complex17 = complex14.sqrt1z();
        org.apache.commons.math3.complex.Complex complex19 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex20 = complex19.exp();
        double double21 = complex19.getArgument();
        org.apache.commons.math3.complex.Complex complex23 = complex19.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex24 = complex19.sin();
        org.apache.commons.math3.complex.Complex complex25 = complex19.cosh();
        org.apache.commons.math3.complex.Complex complex26 = complex19.tanh();
        org.apache.commons.math3.complex.Complex complex27 = complex19.log();
        org.apache.commons.math3.complex.Complex complex29 = complex19.add((double) 1);
        org.apache.commons.math3.complex.Complex complex30 = complex14.divide(complex29);
        org.apache.commons.math3.complex.Complex complex31 = complex14.tanh();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "(0.5403023058681398, -0.0)" + "'", str16, "(0.5403023058681398, -0.0)");
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex6 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex8 = complex6.pow((-0.0d));
        double double9 = complex8.abs();
        org.apache.commons.math3.complex.Complex complex10 = complex8.sinh();
        org.apache.commons.math3.complex.Complex complex12 = complex8.divide((double) 0L);
        org.apache.commons.math3.complex.Complex complex14 = complex8.add((double) 1.0f);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
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
        org.apache.commons.math3.complex.Complex complex25 = complex22.asin();
        java.lang.Class<?> wildcardClass26 = complex25.getClass();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complexList24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        double double6 = complex5.getArgument();
        org.apache.commons.math3.complex.ComplexField complexField7 = complex5.getField();
        org.apache.commons.math3.complex.Complex complex8 = complex5.reciprocal();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(complexField7);
        org.junit.Assert.assertNotNull(complex8);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf(0.9999499987499375d);
        org.junit.Assert.assertNotNull(complex1);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        double double6 = complex5.abs();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
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
        org.apache.commons.math3.complex.Complex complex19 = complex11.tan();
        java.lang.Class<?> wildcardClass20 = complex11.getClass();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexList8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex3 = complex2.exp();
        org.apache.commons.math3.complex.Complex complex4 = complex2.tan();
        org.apache.commons.math3.complex.Complex complex6 = complex2.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex8 = complex6.multiply(100);
        org.apache.commons.math3.complex.Complex complex9 = complex8.tanh();
        org.apache.commons.math3.complex.Complex complex10 = complex0.subtract(complex9);
        org.apache.commons.math3.complex.Complex complex11 = complex9.sqrt1z();
        boolean boolean12 = complex11.isNaN();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf(0.9999499987499375d, (double) '4');
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex6 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex7 = complex1.conjugate();
        double double8 = complex7.abs();
        org.apache.commons.math3.complex.Complex complex9 = complex7.cos();
        org.apache.commons.math3.complex.Complex complex11 = complex7.pow(1.5430806348152437d);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex7 = complex3.subtract(complex6);
        org.apache.commons.math3.complex.Complex complex8 = complex3.acos();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.math3.complex.Complex> complexList10 = complex8.nthRoot(0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: cannot compute nth root for null or negative n: 0");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
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
        org.apache.commons.math3.complex.Complex complex17 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex18 = complex17.exp();
        double double19 = complex17.getArgument();
        org.apache.commons.math3.complex.Complex complex20 = complex17.log();
        org.apache.commons.math3.complex.Complex complex21 = complex17.log();
        org.apache.commons.math3.complex.Complex complex23 = complex21.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex24 = complex23.exp();
        org.apache.commons.math3.complex.Complex complex26 = complex23.subtract((double) 1);
        org.apache.commons.math3.complex.Complex complex28 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex29 = complex28.exp();
        org.apache.commons.math3.complex.Complex complex30 = complex28.tan();
        org.apache.commons.math3.complex.Complex complex31 = complex23.multiply(complex28);
        org.apache.commons.math3.complex.Complex complex32 = complex15.add(complex31);
        double double33 = complex32.getImaginary();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 35.0d + "'", double33 == 35.0d);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((double) (short) 1, (double) 100L);
        org.apache.commons.math3.complex.ComplexField complexField3 = complex2.getField();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complexField3);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((double) 0L, (-1.0d));
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
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
        org.apache.commons.math3.complex.Complex complex14 = complex12.add(4.242117536224665d);
        org.apache.commons.math3.complex.Complex complex16 = complex12.add(3.8412897345910653E-4d);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
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
        org.apache.commons.math3.complex.Complex complex16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.complex.Complex complex17 = complex14.subtract(complex16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexList8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex3.reciprocal();
        org.apache.commons.math3.complex.ComplexField complexField5 = complex3.getField();
        org.apache.commons.math3.complex.Complex complex6 = complex3.reciprocal();
        double double7 = complex3.abs();
        org.apache.commons.math3.complex.Complex complex8 = complex3.reciprocal();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complexField5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(complex8);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
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
        org.apache.commons.math3.complex.Complex complex16 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double17 = complex16.getImaginary();
        org.apache.commons.math3.complex.Complex complex18 = complex16.negate();
        org.apache.commons.math3.complex.Complex complex20 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex21 = complex20.exp();
        double double22 = complex20.getArgument();
        org.apache.commons.math3.complex.Complex complex23 = complex20.log();
        org.apache.commons.math3.complex.Complex complex24 = complex20.log();
        org.apache.commons.math3.complex.Complex complex26 = complex24.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex27 = complex18.subtract(complex26);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList29 = complex27.nthRoot(1);
        org.apache.commons.math3.complex.Complex complex30 = complex27.acos();
        boolean boolean31 = complex14.equals((java.lang.Object) complex27);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexList8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complexList29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
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
        org.apache.commons.math3.complex.Complex complex19 = complex11.sin();
        org.apache.commons.math3.complex.Complex complex20 = complex19.conjugate();
        org.apache.commons.math3.complex.Complex complex21 = complex19.negate();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex(Double.POSITIVE_INFINITY, 1.557407724654902d);
        double double3 = complex2.getReal();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex4 = complex2.pow((double) (short) 10);
        org.apache.commons.math3.complex.Complex complex5 = complex2.cosh();
        org.apache.commons.math3.complex.Complex complex7 = complex5.multiply(0.0d);
        org.apache.commons.math3.complex.Complex complex8 = complex7.tan();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) (byte) -1, (double) '#');
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
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
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complexList27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex43);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((double) (short) 0, (double) (byte) 1);
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex5.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex9 = complex5.negate();
        double double10 = complex9.getImaginary();
        boolean boolean11 = complex9.isInfinite();
        org.apache.commons.math3.complex.Complex complex13 = complex9.add(Double.NaN);
        org.apache.commons.math3.complex.Complex complex14 = complex13.tan();
        java.lang.Class<?> wildcardClass15 = complex13.getClass();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexList8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.0d) + "'", double10 == (-0.0d));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex(0.9999499987499375d);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf(0.5403023058681398d);
        org.junit.Assert.assertNotNull(complex1);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
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
        org.apache.commons.math3.complex.Complex complex26 = complex25.asin();
        org.apache.commons.math3.complex.Complex complex27 = complex26.conjugate();
        org.apache.commons.math3.complex.Complex complex29 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double30 = complex29.getImaginary();
        org.apache.commons.math3.complex.Complex complex31 = complex29.negate();
        org.apache.commons.math3.complex.Complex complex33 = complex31.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex34 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex35 = complex31.subtract(complex34);
        org.apache.commons.math3.complex.Complex complex36 = complex26.multiply(complex35);
        boolean boolean37 = complex36.isNaN();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complexList24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
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
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complexField5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-3.141592653589793d) + "'", double9 == (-3.141592653589793d));
        org.junit.Assert.assertNotNull(complex11);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
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
        org.apache.commons.math3.complex.Complex complex16 = complex14.negate();
        double double17 = complex14.getImaginary();
        org.apache.commons.math3.complex.Complex complex18 = complex14.sqrt();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexList8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "(1.5707963267948966, -0.0)" + "'", str15, "(1.5707963267948966, -0.0)");
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-0.0d) + "'", double17 == (-0.0d));
        org.junit.Assert.assertNotNull(complex18);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex4 = complex2.pow((double) (short) 10);
        double double5 = complex2.abs();
        org.apache.commons.math3.complex.Complex complex7 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex8 = complex7.sqrt();
        org.apache.commons.math3.complex.Complex complex9 = complex7.sqrt();
        org.apache.commons.math3.complex.Complex complex10 = complex9.cosh();
        org.apache.commons.math3.complex.Complex complex12 = complex9.add((double) ' ');
        org.apache.commons.math3.complex.Complex complex13 = complex2.divide(complex9);
        org.apache.commons.math3.complex.ComplexField complexField14 = complex13.getField();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complexField14);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
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
        org.apache.commons.math3.complex.Complex complex22 = org.apache.commons.math3.complex.Complex.valueOf((double) (byte) 0);
        boolean boolean23 = complex5.equals((java.lang.Object) (byte) 0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex(0.9126365759632116d);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
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
        org.apache.commons.math3.complex.Complex complex15 = complex7.tanh();
        org.apache.commons.math3.complex.Complex complex16 = complex15.negate();
        java.lang.Class<?> wildcardClass17 = complex16.getClass();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
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
        java.lang.Class<?> wildcardClass48 = complex47.getClass();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complexList13);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complexList43);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
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
        org.apache.commons.math3.complex.Complex complex75 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex76 = complex75.exp();
        double double77 = complex75.getArgument();
        org.apache.commons.math3.complex.Complex complex79 = complex75.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex80 = complex75.sin();
        org.apache.commons.math3.complex.Complex complex81 = complex75.cosh();
        org.apache.commons.math3.complex.Complex complex82 = complex75.tan();
        org.apache.commons.math3.complex.Complex complex83 = complex75.tan();
        org.apache.commons.math3.complex.Complex complex85 = complex75.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex86 = complex73.subtract(complex75);
        boolean boolean87 = complex8.equals((java.lang.Object) complex86);
        org.apache.commons.math3.complex.Complex complex88 = complex8.cosh();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complexList17);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complexList47);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertNotNull(complex53);
        org.junit.Assert.assertNotNull(complex55);
        org.junit.Assert.assertNotNull(complex57);
        org.junit.Assert.assertNotNull(complex58);
        org.junit.Assert.assertNotNull(complex59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(complex62);
        org.junit.Assert.assertNotNull(complex63);
        org.junit.Assert.assertNotNull(complex65);
        org.junit.Assert.assertNotNull(complex66);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 0.0d + "'", double67 == 0.0d);
        org.junit.Assert.assertNotNull(complex69);
        org.junit.Assert.assertNotNull(complex70);
        org.junit.Assert.assertNotNull(complex71);
        org.junit.Assert.assertNotNull(complex72);
        org.junit.Assert.assertNotNull(complex73);
        org.junit.Assert.assertNotNull(complex75);
        org.junit.Assert.assertNotNull(complex76);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 0.0d + "'", double77 == 0.0d);
        org.junit.Assert.assertNotNull(complex79);
        org.junit.Assert.assertNotNull(complex80);
        org.junit.Assert.assertNotNull(complex81);
        org.junit.Assert.assertNotNull(complex82);
        org.junit.Assert.assertNotNull(complex83);
        org.junit.Assert.assertNotNull(complex85);
        org.junit.Assert.assertNotNull(complex86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(complex88);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
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
        java.lang.Class<?> wildcardClass18 = complex3.getClass();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex7 = complex5.divide((double) (short) 0);
        double double8 = complex5.abs();
        org.apache.commons.math3.complex.Complex complex9 = complex5.sqrt1z();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertNotNull(complex9);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math3.complex.Complex complex7 = complex5.cosh();
        java.lang.Class<?> wildcardClass8 = complex7.getClass();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math3.complex.Complex complex8 = complex6.subtract((double) 1.0f);
        org.apache.commons.math3.complex.Complex complex10 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex11 = complex10.exp();
        double double12 = complex10.getArgument();
        org.apache.commons.math3.complex.Complex complex13 = complex10.log();
        org.apache.commons.math3.complex.Complex complex14 = complex10.log();
        org.apache.commons.math3.complex.Complex complex15 = complex14.atan();
        org.apache.commons.math3.complex.Complex complex16 = complex8.pow(complex15);
        org.apache.commons.math3.complex.Complex complex17 = complex8.reciprocal();
        org.apache.commons.math3.complex.Complex complex19 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex20 = complex19.sqrt();
        org.apache.commons.math3.complex.Complex complex21 = complex19.sqrt();
        org.apache.commons.math3.complex.Complex complex22 = complex21.asin();
        org.apache.commons.math3.complex.Complex complex23 = complex21.tanh();
        org.apache.commons.math3.complex.Complex complex24 = complex8.subtract(complex21);
        org.apache.commons.math3.complex.Complex complex25 = complex24.cos();
        org.apache.commons.math3.complex.Complex complex26 = complex25.asin();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.math3.complex.Complex> complexList28 = complex25.nthRoot(0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: cannot compute nth root for null or negative n: 0");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.math3.complex.Complex> complexList22 = complex17.nthRoot((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: cannot compute nth root for null or negative n: -1");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex7 = complex6.cosh();
        org.apache.commons.math3.complex.Complex complex8 = complex6.asin();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) (byte) -1);
        org.junit.Assert.assertNotNull(complex1);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex3.reciprocal();
        org.apache.commons.math3.complex.ComplexField complexField5 = complex3.getField();
        org.apache.commons.math3.complex.Complex complex6 = complex3.reciprocal();
        double double7 = complex3.abs();
        org.apache.commons.math3.complex.Complex complex8 = complex3.cos();
        org.apache.commons.math3.complex.Complex complex10 = complex3.subtract((-2.0d));
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complexField5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 1, (double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex3 = complex2.tanh();
        org.apache.commons.math3.complex.Complex complex4 = complex2.tanh();
        org.apache.commons.math3.complex.Complex complex6 = complex2.multiply(2.8014000414552136d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
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
        double double16 = complex15.getImaginary();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex5 = complex1.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex7 = complex5.multiply(100);
        org.apache.commons.math3.complex.Complex complex9 = complex5.multiply((int) (short) 0);
        org.apache.commons.math3.complex.Complex complex11 = complex5.multiply((int) (byte) 0);
        org.apache.commons.math3.complex.Complex complex12 = complex5.cos();
        java.lang.Class<?> wildcardClass13 = complex5.getClass();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
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
        org.apache.commons.math3.complex.Complex complex46 = complex45.cosh();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complexList13);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complexList43);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex46);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
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
        org.apache.commons.math3.complex.Complex complex47 = complex45.conjugate();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complexList13);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complexList43);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex47);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((-0.5430806348152437d), (double) 'a');
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
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
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexList8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complexList38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 1.0d + "'", double52 == 1.0d);
        org.junit.Assert.assertNotNull(complex54);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex3.reciprocal();
        org.apache.commons.math3.complex.ComplexField complexField5 = complex3.getField();
        org.apache.commons.math3.complex.Complex complex6 = complex3.reciprocal();
        double double7 = complex3.abs();
        org.apache.commons.math3.complex.Complex complex8 = complex3.cos();
        org.apache.commons.math3.complex.Complex complex9 = complex3.sinh();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complexField5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) (short) 1, 0.5430806348152437d);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
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
        org.apache.commons.math3.complex.Complex complex15 = complex7.sqrt();
        org.apache.commons.math3.complex.Complex complex16 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex18 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex19 = complex18.exp();
        org.apache.commons.math3.complex.Complex complex20 = complex18.tan();
        org.apache.commons.math3.complex.Complex complex22 = complex18.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex24 = complex22.multiply(100);
        org.apache.commons.math3.complex.Complex complex25 = complex24.tanh();
        org.apache.commons.math3.complex.Complex complex26 = complex16.subtract(complex25);
        java.lang.String str27 = complex26.toString();
        org.apache.commons.math3.complex.Complex complex28 = complex15.multiply(complex26);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "(Infinity, Infinity)" + "'", str27, "(Infinity, Infinity)");
        org.junit.Assert.assertNotNull(complex28);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
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
        org.apache.commons.math3.complex.Complex complex47 = complex45.reciprocal();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complexList13);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complexList43);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex47);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
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
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexList8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex7 = complex3.subtract(complex6);
        org.apache.commons.math3.complex.Complex complex8 = complex3.acos();
        org.apache.commons.math3.complex.Complex complex9 = complex3.log();
        org.apache.commons.math3.complex.Complex complex10 = complex3.negate();
        org.apache.commons.math3.complex.ComplexField complexField11 = complex3.getField();
        org.apache.commons.math3.complex.Complex complex12 = complex3.reciprocal();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complexField11);
        org.junit.Assert.assertNotNull(complex12);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex4 = complex2.pow((double) (short) 10);
        double double5 = complex2.abs();
        org.apache.commons.math3.complex.Complex complex7 = complex2.pow(1.557407724654902d);
        org.apache.commons.math3.complex.Complex complex8 = complex2.negate();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex7 = complex1.pow((double) 100.0f);
        org.apache.commons.math3.complex.Complex complex8 = complex7.sin();
        org.apache.commons.math3.complex.Complex complex10 = complex8.subtract((double) 1);
        org.apache.commons.math3.complex.Complex complex12 = complex10.multiply(0.0d);
        org.apache.commons.math3.complex.Complex complex13 = complex10.cosh();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
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
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexList8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(complex24);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.sin();
        org.apache.commons.math3.complex.Complex complex7 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex8 = complex7.reciprocal();
        org.apache.commons.math3.complex.Complex complex10 = complex8.multiply(0);
        java.lang.Class<?> wildcardClass11 = complex10.getClass();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
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
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexList8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-0.0d) + "'", double28 == (-0.0d));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "(0.5403023058681398, -0.0)" + "'", str29, "(0.5403023058681398, -0.0)");
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex7 = complex3.subtract(complex6);
        org.apache.commons.math3.complex.Complex complex8 = complex3.acos();
        org.apache.commons.math3.complex.Complex complex9 = complex3.negate();
        org.apache.commons.math3.complex.Complex complex10 = complex9.atan();
        org.apache.commons.math3.complex.ComplexField complexField11 = complex9.getField();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complexField11);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex7 = complex3.pow((double) 100L);
        org.apache.commons.math3.complex.Complex complex9 = complex3.subtract((double) (byte) 1);
        double double10 = complex9.getReal();
        org.apache.commons.math3.complex.Complex complex12 = new org.apache.commons.math3.complex.Complex(Double.NaN);
        org.apache.commons.math3.complex.Complex complex13 = complex9.add(complex12);
        org.apache.commons.math3.complex.ComplexField complexField14 = complex12.getField();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-2.0d) + "'", double10 == (-2.0d));
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complexField14);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 1, (double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex3 = complex2.tanh();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.math3.complex.Complex> complexList5 = complex3.nthRoot((-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: cannot compute nth root for null or negative n: -1");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex3);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
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
        org.apache.commons.math3.complex.Complex complex14 = complex1.acos();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.math3.complex.Complex> complexList16 = complex14.nthRoot((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: cannot compute nth root for null or negative n: -1");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complexList13);
        org.junit.Assert.assertNotNull(complex14);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
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
        java.lang.String str16 = complex14.toString();
        org.apache.commons.math3.complex.Complex complex17 = complex14.sqrt1z();
        org.apache.commons.math3.complex.Complex complex18 = complex17.cosh();
        org.apache.commons.math3.complex.Complex complex19 = complex17.acos();
        java.lang.Class<?> wildcardClass20 = complex19.getClass();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "(0.5403023058681398, -0.0)" + "'", str16, "(0.5403023058681398, -0.0)");
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex1 = complex0.negate();
        double double2 = complex0.getReal();
        org.apache.commons.math3.complex.Complex complex3 = complex0.log();
        org.apache.commons.math3.complex.Complex complex4 = complex0.asin();
        double double5 = complex4.abs();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex3.reciprocal();
        org.apache.commons.math3.complex.Complex complex6 = complex3.divide(100.0d);
        org.apache.commons.math3.complex.Complex complex7 = complex3.conjugate();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
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
        org.apache.commons.math3.complex.Complex complex66 = complex64.divide(0.0d);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complexList17);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complexList47);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertNotNull(complex53);
        org.junit.Assert.assertNotNull(complex55);
        org.junit.Assert.assertNotNull(complex57);
        org.junit.Assert.assertNotNull(complex58);
        org.junit.Assert.assertNotNull(complex59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(complex62);
        org.junit.Assert.assertNotNull(complex63);
        org.junit.Assert.assertNotNull(complex64);
        org.junit.Assert.assertNotNull(complex66);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 1, (double) (byte) 0);
        double double3 = complex2.getArgument();
        double double4 = complex2.getReal();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 10.0f, (double) (short) -1);
        org.apache.commons.math3.complex.Complex complex3 = complex2.sinh();
        java.lang.String str4 = complex3.toString();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(5950.475117265045, -9267.315951198088)" + "'", str4, "(5950.475117265045, -9267.315951198088)");
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex((double) (-1L));
        org.apache.commons.math3.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math3.complex.Complex complex5 = org.apache.commons.math3.complex.Complex.valueOf((double) 100.0f, (double) (short) 1);
        org.apache.commons.math3.complex.Complex complex6 = complex5.acos();
        org.apache.commons.math3.complex.Complex complex7 = complex6.sin();
        org.apache.commons.math3.complex.Complex complex8 = complex1.pow(complex7);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList10 = complex1.nthRoot((int) ' ');
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complexList10);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex4 = complex2.pow((double) (short) 10);
        org.apache.commons.math3.complex.Complex complex5 = complex2.cosh();
        org.apache.commons.math3.complex.Complex complex7 = complex5.multiply(0.0d);
        org.apache.commons.math3.complex.Complex complex8 = complex5.sqrt1z();
        double double9 = complex8.getReal();
        org.apache.commons.math3.complex.Complex complex11 = complex8.divide(100.0d);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(complex11);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
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
        org.apache.commons.math3.complex.Complex complex75 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex76 = complex75.exp();
        double double77 = complex75.getArgument();
        org.apache.commons.math3.complex.Complex complex79 = complex75.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex80 = complex75.sin();
        org.apache.commons.math3.complex.Complex complex81 = complex75.cosh();
        org.apache.commons.math3.complex.Complex complex82 = complex75.tan();
        org.apache.commons.math3.complex.Complex complex83 = complex75.tan();
        org.apache.commons.math3.complex.Complex complex85 = complex75.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex86 = complex73.subtract(complex75);
        boolean boolean87 = complex8.equals((java.lang.Object) complex86);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.math3.complex.Complex> complexList89 = complex86.nthRoot(0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: cannot compute nth root for null or negative n: 0");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complexList17);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complexList47);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertNotNull(complex53);
        org.junit.Assert.assertNotNull(complex55);
        org.junit.Assert.assertNotNull(complex57);
        org.junit.Assert.assertNotNull(complex58);
        org.junit.Assert.assertNotNull(complex59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(complex62);
        org.junit.Assert.assertNotNull(complex63);
        org.junit.Assert.assertNotNull(complex65);
        org.junit.Assert.assertNotNull(complex66);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 0.0d + "'", double67 == 0.0d);
        org.junit.Assert.assertNotNull(complex69);
        org.junit.Assert.assertNotNull(complex70);
        org.junit.Assert.assertNotNull(complex71);
        org.junit.Assert.assertNotNull(complex72);
        org.junit.Assert.assertNotNull(complex73);
        org.junit.Assert.assertNotNull(complex75);
        org.junit.Assert.assertNotNull(complex76);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 0.0d + "'", double77 == 0.0d);
        org.junit.Assert.assertNotNull(complex79);
        org.junit.Assert.assertNotNull(complex80);
        org.junit.Assert.assertNotNull(complex81);
        org.junit.Assert.assertNotNull(complex82);
        org.junit.Assert.assertNotNull(complex83);
        org.junit.Assert.assertNotNull(complex85);
        org.junit.Assert.assertNotNull(complex86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex7 = complex1.sqrt1z();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.math3.complex.Complex> complexList9 = complex1.nthRoot((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: cannot compute nth root for null or negative n: 0");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
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
        double double23 = complex21.getReal();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.1752011936438014d) + "'", double23 == (-1.1752011936438014d));
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100, (double) 1);
        java.lang.Class<?> wildcardClass3 = complex2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
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
        org.apache.commons.math3.complex.Complex complex25 = complex5.subtract(complex21);
        org.apache.commons.math3.complex.Complex complex26 = complex5.tan();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.math3.complex.Complex> complexList28 = complex5.nthRoot((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: cannot compute nth root for null or negative n: 0");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complexList19);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
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
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex6 = complex1.sin();
        boolean boolean7 = complex6.isInfinite();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex7 = complex1.pow((double) 100.0f);
        org.apache.commons.math3.complex.Complex complex8 = complex7.sin();
        boolean boolean9 = complex8.isNaN();
        org.apache.commons.math3.complex.Complex complex10 = complex8.tanh();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(complex10);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.sinh();
        org.apache.commons.math3.complex.Complex complex5 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex8 = complex7.exp();
        org.apache.commons.math3.complex.Complex complex9 = complex7.tan();
        org.apache.commons.math3.complex.Complex complex11 = complex7.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex13 = complex11.multiply(100);
        org.apache.commons.math3.complex.Complex complex15 = complex11.multiply((int) (short) 0);
        double double16 = complex11.getImaginary();
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
        org.apache.commons.math3.complex.Complex complex31 = complex22.asin();
        java.lang.String str32 = complex31.toString();
        org.apache.commons.math3.complex.Complex complex33 = complex31.cosh();
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
        org.apache.commons.math3.complex.Complex complex49 = complex33.pow(complex48);
        org.apache.commons.math3.complex.Complex complex50 = complex11.subtract(complex33);
        org.apache.commons.math3.complex.Complex complex51 = complex11.atan();
        org.apache.commons.math3.complex.Complex complex52 = complex51.sinh();
        org.apache.commons.math3.complex.Complex complex53 = complex1.divide(complex52);
        org.apache.commons.math3.complex.Complex complex54 = complex1.tanh();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complexList25);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "(1.5707963267948966, -0.0)" + "'", str32, "(1.5707963267948966, -0.0)");
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complexList42);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertNotNull(complex53);
        org.junit.Assert.assertNotNull(complex54);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.sinh();
        double double5 = complex4.getArgument();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex5 = complex1.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex6 = complex1.cos();
        org.apache.commons.math3.complex.Complex complex7 = complex1.conjugate();
        org.apache.commons.math3.complex.Complex complex9 = complex7.multiply((int) (short) -1);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) (byte) 10);
        org.junit.Assert.assertNotNull(complex1);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
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
        double double23 = complex9.abs();
        org.apache.commons.math3.complex.Complex complex24 = complex9.cos();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.557407724654902d + "'", double23 == 1.557407724654902d);
        org.junit.Assert.assertNotNull(complex24);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
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
        org.apache.commons.math3.complex.Complex complex16 = complex11.tanh();
        org.apache.commons.math3.complex.Complex complex17 = complex11.sqrt();
        org.apache.commons.math3.complex.Complex complex19 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex20 = complex19.exp();
        double double21 = complex19.getArgument();
        org.apache.commons.math3.complex.Complex complex23 = complex19.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex24 = complex19.exp();
        org.apache.commons.math3.complex.Complex complex25 = complex17.divide(complex19);
        boolean boolean26 = complex3.equals((java.lang.Object) complex19);
        double double27 = complex3.getImaginary();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
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
        org.apache.commons.math3.complex.Complex complex15 = complex7.subtract((double) (byte) 10);
        org.apache.commons.math3.complex.Complex complex18 = org.apache.commons.math3.complex.Complex.valueOf((double) 100.0f, (double) (short) 1);
        org.apache.commons.math3.complex.Complex complex19 = complex18.acos();
        org.apache.commons.math3.complex.Complex complex21 = complex19.subtract((-3.141592653589793d));
        org.apache.commons.math3.complex.Complex complex22 = complex19.acos();
        org.apache.commons.math3.complex.Complex complex23 = complex7.divide(complex22);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex5 = complex1.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex7 = complex5.multiply(100);
        org.apache.commons.math3.complex.Complex complex8 = complex7.tanh();
        java.lang.Class<?> wildcardClass9 = complex7.getClass();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex6 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex7 = complex1.exp();
        double double8 = complex7.getReal();
        org.apache.commons.math3.complex.Complex complex9 = complex7.sinh();
        org.apache.commons.math3.complex.Complex complex11 = complex7.multiply(0.0d);
        org.apache.commons.math3.complex.Complex complex12 = complex7.sin();
        java.lang.String str13 = complex12.toString();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.718281828459045d + "'", double8 == 2.718281828459045d);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(0.41078129050290885, -0.0)" + "'", str13, "(0.41078129050290885, -0.0)");
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex7 = complex5.divide((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex8 = complex5.asin();
        org.apache.commons.math3.complex.Complex complex9 = complex5.tan();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
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
        org.apache.commons.math3.complex.Complex complex14 = complex7.log();
        double double15 = complex7.getArgument();
        boolean boolean16 = complex7.isInfinite();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex6 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex7 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex9 = complex7.multiply((int) 'a');
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex12 = complex11.exp();
        double double13 = complex11.getArgument();
        org.apache.commons.math3.complex.Complex complex14 = complex11.log();
        org.apache.commons.math3.complex.Complex complex15 = complex14.log();
        org.apache.commons.math3.complex.Complex complex17 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex18 = complex17.exp();
        double double19 = complex17.getArgument();
        org.apache.commons.math3.complex.Complex complex21 = complex17.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex22 = complex17.sin();
        org.apache.commons.math3.complex.Complex complex23 = complex17.cosh();
        org.apache.commons.math3.complex.Complex complex24 = complex17.tanh();
        org.apache.commons.math3.complex.Complex complex25 = complex17.log();
        org.apache.commons.math3.complex.Complex complex26 = complex15.multiply(complex17);
        org.apache.commons.math3.complex.Complex complex27 = complex15.sin();
        org.apache.commons.math3.complex.Complex complex28 = complex9.divide(complex15);
        double double29 = complex15.getArgument();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 3.141592653589793d + "'", double29 == 3.141592653589793d);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex4 = complex2.pow((double) (short) 10);
        boolean boolean5 = complex4.isNaN();
        double double6 = complex4.abs();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
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
        org.apache.commons.math3.complex.Complex complex20 = complex16.log();
        org.apache.commons.math3.complex.Complex complex22 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex23 = complex22.exp();
        double double24 = complex22.getArgument();
        org.apache.commons.math3.complex.Complex complex26 = complex22.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex27 = complex22.sin();
        org.apache.commons.math3.complex.Complex complex28 = complex22.cosh();
        org.apache.commons.math3.complex.Complex complex30 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double31 = complex30.getImaginary();
        boolean boolean32 = complex28.equals((java.lang.Object) double31);
        org.apache.commons.math3.complex.Complex complex33 = complex28.tanh();
        org.apache.commons.math3.complex.Complex complex34 = complex28.sqrt();
        org.apache.commons.math3.complex.Complex complex35 = complex28.tanh();
        org.apache.commons.math3.complex.Complex complex36 = complex28.sqrt();
        org.apache.commons.math3.complex.Complex complex37 = complex16.multiply(complex28);
        org.apache.commons.math3.complex.Complex complex38 = complex28.tanh();
        org.apache.commons.math3.complex.Complex complex40 = complex28.multiply((double) (short) 100);
        java.lang.String str41 = complex40.toString();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "(154.30806348152436, 0.0)" + "'", str41, "(154.30806348152436, 0.0)");
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex1 = complex0.sqrt1z();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex((double) (-1));
        org.apache.commons.math3.complex.Complex complex2 = complex1.log();
        org.apache.commons.math3.complex.Complex complex4 = complex2.divide(1.557407724654902d);
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex8 = complex6.divide((double) (short) 100);
        org.apache.commons.math3.complex.Complex complex9 = complex4.divide(complex6);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
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
        double double24 = complex15.getArgument();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexList8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        boolean boolean6 = complex5.isNaN();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex7 = complex3.subtract(complex6);
        org.apache.commons.math3.complex.Complex complex8 = complex3.asin();
        org.apache.commons.math3.complex.Complex complex10 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex11 = complex10.exp();
        double double12 = complex10.getArgument();
        org.apache.commons.math3.complex.Complex complex14 = complex10.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex15 = complex10.tanh();
        org.apache.commons.math3.complex.Complex complex16 = complex8.divide(complex15);
        org.apache.commons.math3.complex.Complex complex17 = complex8.conjugate();
        org.apache.commons.math3.complex.Complex complex18 = complex17.sinh();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
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
        org.apache.commons.math3.complex.Complex complex25 = complex22.asin();
        java.lang.String str26 = complex22.toString();
        org.apache.commons.math3.complex.Complex complex27 = complex22.atan();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complexList24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "(0.5574077246549021, 0.0)" + "'", str26, "(0.5574077246549021, 0.0)");
        org.junit.Assert.assertNotNull(complex27);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex6 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex7 = complex1.exp();
        double double8 = complex7.getReal();
        org.apache.commons.math3.complex.Complex complex10 = complex7.divide((double) 0);
        org.apache.commons.math3.complex.Complex complex11 = complex10.asin();
        java.lang.Class<?> wildcardClass12 = complex10.getClass();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.718281828459045d + "'", double8 == 2.718281828459045d);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex3 = complex1.subtract((double) (-1));
        org.apache.commons.math3.complex.Complex complex5 = complex1.multiply((double) 10L);
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex8 = complex7.exp();
        org.apache.commons.math3.complex.Complex complex9 = complex7.tanh();
        org.apache.commons.math3.complex.Complex complex10 = complex9.log();
        org.apache.commons.math3.complex.Complex complex11 = complex9.acos();
        org.apache.commons.math3.complex.Complex complex12 = complex5.pow(complex11);
        org.apache.commons.math3.complex.Complex complex14 = complex5.subtract((double) '4');
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex7 = complex3.subtract(complex6);
        org.apache.commons.math3.complex.Complex complex8 = complex3.asin();
        double double9 = complex3.abs();
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double12 = complex11.getImaginary();
        org.apache.commons.math3.complex.Complex complex13 = complex11.negate();
        org.apache.commons.math3.complex.Complex complex15 = complex13.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex16 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex17 = complex13.subtract(complex16);
        org.apache.commons.math3.complex.Complex complex19 = complex13.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex20 = complex13.sin();
        java.lang.String str21 = complex20.toString();
        org.apache.commons.math3.complex.Complex complex22 = complex20.tanh();
        org.apache.commons.math3.complex.Complex complex23 = complex3.pow(complex20);
        org.apache.commons.math3.complex.Complex complex24 = complex20.sinh();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "(-0.8414709848078965, -0.0)" + "'", str21, "(-0.8414709848078965, -0.0)");
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.sin();
        org.apache.commons.math3.complex.Complex complex7 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex8 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex9 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex10 = complex9.reciprocal();
        org.apache.commons.math3.complex.Complex complex11 = complex10.tan();
        org.apache.commons.math3.complex.Complex complex13 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex14 = complex13.exp();
        org.apache.commons.math3.complex.Complex complex15 = complex13.tan();
        org.apache.commons.math3.complex.Complex complex17 = complex13.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex18 = complex13.cos();
        org.apache.commons.math3.complex.Complex complex19 = complex13.tan();
        org.apache.commons.math3.complex.Complex complex20 = complex10.subtract(complex13);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
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
        org.apache.commons.math3.complex.Complex complex14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.complex.Complex complex15 = complex11.divide(complex14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex4.log();
        org.apache.commons.math3.complex.Complex complex7 = complex4.add(1.0d);
        double double8 = complex4.getImaginary();
        double double9 = complex4.abs();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex((double) '4');
        double double2 = complex1.getReal();
        org.apache.commons.math3.complex.Complex complex4 = complex1.add((-0.1585290151921035d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertNotNull(complex4);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex6 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex7 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex9 = complex7.multiply((int) 'a');
        org.apache.commons.math3.complex.Complex complex11 = complex9.divide((double) (byte) 1);
        org.apache.commons.math3.complex.ComplexField complexField12 = complex11.getField();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complexField12);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
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
        java.lang.String str16 = complex14.toString();
        org.apache.commons.math3.complex.Complex complex17 = complex14.sqrt1z();
        org.apache.commons.math3.complex.Complex complex18 = complex17.cosh();
        org.apache.commons.math3.complex.Complex complex19 = complex17.cosh();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "(0.5403023058681398, -0.0)" + "'", str16, "(0.5403023058681398, -0.0)");
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math3.complex.Complex complex3 = complex1.sqrt();
        org.apache.commons.math3.complex.Complex complex4 = complex3.cosh();
        org.apache.commons.math3.complex.Complex complex6 = complex3.add((double) ' ');
        org.apache.commons.math3.complex.Complex complex7 = complex6.exp();
        org.apache.commons.math3.complex.Complex complex8 = complex6.sinh();
        java.lang.String str9 = complex6.toString();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(33.0, 0.0)" + "'", str9, "(33.0, 0.0)");
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex4 = complex2.pow((double) (short) 10);
        org.apache.commons.math3.complex.Complex complex5 = complex2.cosh();
        org.apache.commons.math3.complex.Complex complex7 = complex5.multiply(0.0d);
        org.apache.commons.math3.complex.Complex complex8 = complex5.sqrt1z();
        java.lang.String str9 = complex8.toString();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(NaN, NaN)" + "'", str9, "(NaN, NaN)");
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
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
        java.lang.String str16 = complex14.toString();
        org.apache.commons.math3.complex.Complex complex17 = complex14.sqrt1z();
        org.apache.commons.math3.complex.Complex complex19 = complex14.multiply(0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "(0.5403023058681398, -0.0)" + "'", str16, "(0.5403023058681398, -0.0)");
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex19);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) (byte) 1, (-1.0d));
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((double) ' ', (double) 1L);
        org.apache.commons.math3.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math3.complex.Complex complex4 = complex2.sqrt1z();
        org.apache.commons.math3.complex.Complex complex5 = complex4.atan();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.sqrt1z();
        org.apache.commons.math3.complex.Complex complex7 = complex5.conjugate();
        org.apache.commons.math3.complex.Complex complex9 = complex7.multiply((int) (short) -1);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
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
        org.apache.commons.math3.complex.Complex complex15 = complex7.atan();
        org.apache.commons.math3.complex.Complex complex17 = complex15.multiply((double) 100.0f);
        org.apache.commons.math3.complex.Complex complex18 = complex15.sqrt();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList20 = complex15.nthRoot((int) ' ');
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complexList20);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 10.0f, (double) (short) -1);
        org.apache.commons.math3.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((double) (short) 1);
        org.apache.commons.math3.complex.Complex complex6 = complex3.exp();
        org.apache.commons.math3.complex.Complex complex8 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex9 = complex8.exp();
        double double10 = complex8.getArgument();
        org.apache.commons.math3.complex.Complex complex12 = complex8.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex13 = complex8.exp();
        org.apache.commons.math3.complex.Complex complex14 = complex13.cosh();
        org.apache.commons.math3.complex.Complex complex15 = complex13.sin();
        org.apache.commons.math3.complex.Complex complex16 = complex6.pow(complex13);
        org.apache.commons.math3.complex.Complex complex18 = complex16.pow(0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex18);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex((double) (-1L));
        org.apache.commons.math3.complex.Complex complex3 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex3.exp();
        double double5 = complex3.getArgument();
        org.apache.commons.math3.complex.Complex complex7 = complex3.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex8 = complex3.sin();
        org.apache.commons.math3.complex.Complex complex9 = complex3.cosh();
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double12 = complex11.getImaginary();
        boolean boolean13 = complex9.equals((java.lang.Object) double12);
        org.apache.commons.math3.complex.Complex complex14 = complex9.tanh();
        org.apache.commons.math3.complex.Complex complex15 = complex9.sin();
        org.apache.commons.math3.complex.Complex complex16 = complex1.multiply(complex9);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
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
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 0L, (double) (short) 1);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex3.reciprocal();
        org.apache.commons.math3.complex.ComplexField complexField5 = complex3.getField();
        org.apache.commons.math3.complex.Complex complex6 = complex3.sqrt();
        org.apache.commons.math3.complex.Complex complex7 = complex3.log();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complexField5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
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
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexList8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
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
        org.apache.commons.math3.complex.Complex complex53 = complex39.add(10.0d);
        org.apache.commons.math3.complex.Complex complex55 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex56 = complex55.exp();
        double double57 = complex55.getArgument();
        org.apache.commons.math3.complex.Complex complex59 = complex55.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex60 = complex55.sin();
        org.apache.commons.math3.complex.Complex complex61 = complex55.cosh();
        org.apache.commons.math3.complex.Complex complex62 = complex55.tan();
        org.apache.commons.math3.complex.Complex complex63 = complex55.tan();
        org.apache.commons.math3.complex.Complex complex65 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex66 = complex65.exp();
        double double67 = complex65.getArgument();
        org.apache.commons.math3.complex.Complex complex69 = complex65.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex70 = complex65.sin();
        org.apache.commons.math3.complex.Complex complex71 = complex65.cosh();
        org.apache.commons.math3.complex.Complex complex72 = complex65.tan();
        org.apache.commons.math3.complex.Complex complex73 = complex65.tan();
        org.apache.commons.math3.complex.Complex complex75 = complex65.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex76 = complex63.subtract(complex65);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList78 = complex76.nthRoot((int) '4');
        org.apache.commons.math3.complex.Complex complex79 = complex76.cos();
        org.apache.commons.math3.complex.Complex complex80 = complex79.asin();
        org.apache.commons.math3.complex.Complex complex81 = complex53.add(complex80);
        boolean boolean82 = complex81.isNaN();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexList8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complexList38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(complex53);
        org.junit.Assert.assertNotNull(complex55);
        org.junit.Assert.assertNotNull(complex56);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertNotNull(complex59);
        org.junit.Assert.assertNotNull(complex60);
        org.junit.Assert.assertNotNull(complex61);
        org.junit.Assert.assertNotNull(complex62);
        org.junit.Assert.assertNotNull(complex63);
        org.junit.Assert.assertNotNull(complex65);
        org.junit.Assert.assertNotNull(complex66);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 0.0d + "'", double67 == 0.0d);
        org.junit.Assert.assertNotNull(complex69);
        org.junit.Assert.assertNotNull(complex70);
        org.junit.Assert.assertNotNull(complex71);
        org.junit.Assert.assertNotNull(complex72);
        org.junit.Assert.assertNotNull(complex73);
        org.junit.Assert.assertNotNull(complex75);
        org.junit.Assert.assertNotNull(complex76);
        org.junit.Assert.assertNotNull(complexList78);
        org.junit.Assert.assertNotNull(complex79);
        org.junit.Assert.assertNotNull(complex80);
        org.junit.Assert.assertNotNull(complex81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((double) (byte) 1, (double) (-1L));
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
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
        org.apache.commons.math3.complex.Complex complex15 = complex9.negate();
        org.apache.commons.math3.complex.Complex complex16 = complex9.tan();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) '#');
        double double6 = complex1.getReal();
        org.apache.commons.math3.complex.Complex complex7 = complex1.atan();
        org.apache.commons.math3.complex.Complex complex9 = complex7.divide(52.0d);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
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
        org.apache.commons.math3.complex.Complex complex13 = complex12.asin();
        org.apache.commons.math3.complex.Complex complex14 = complex12.cosh();
        org.apache.commons.math3.complex.Complex complex15 = complex12.sqrt();
        org.apache.commons.math3.complex.Complex complex16 = complex12.acos();
        org.apache.commons.math3.complex.Complex complex17 = complex16.sin();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex3.reciprocal();
        org.apache.commons.math3.complex.ComplexField complexField5 = complex3.getField();
        org.apache.commons.math3.complex.Complex complex6 = complex3.reciprocal();
        double double7 = complex3.abs();
        org.apache.commons.math3.complex.Complex complex8 = complex3.acos();
        org.apache.commons.math3.complex.Complex complex9 = complex3.tanh();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complexField5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex7 = complex3.subtract(complex6);
        org.apache.commons.math3.complex.Complex complex8 = complex3.acos();
        boolean boolean9 = complex8.isInfinite();
        org.apache.commons.math3.complex.Complex complex10 = complex8.cos();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(complex10);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf(6.610125138662287d, 0.7615941559557649d);
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex3 = complex1.divide((double) (short) 100);
        org.apache.commons.math3.complex.Complex complex4 = complex3.sqrt1z();
        double double5 = complex4.getArgument();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
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
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(complex39);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf(0.0d, (double) (byte) -1);
        org.apache.commons.math3.complex.Complex complex3 = complex2.sinh();
        org.apache.commons.math3.complex.Complex complex5 = new org.apache.commons.math3.complex.Complex(10.0d);
        org.apache.commons.math3.complex.Complex complex7 = complex5.divide((double) 'a');
        org.apache.commons.math3.complex.Complex complex8 = complex3.divide(complex5);
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
        org.apache.commons.math3.complex.Complex complex34 = complex31.asin();
        org.apache.commons.math3.complex.Complex complex36 = complex34.multiply((int) 'a');
        boolean boolean37 = complex3.equals((java.lang.Object) complex34);
        org.apache.commons.math3.complex.Complex complex38 = complex3.negate();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complexList33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(complex38);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex4.log();
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex8 = complex7.exp();
        double double9 = complex7.getArgument();
        org.apache.commons.math3.complex.Complex complex11 = complex7.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex12 = complex7.sin();
        org.apache.commons.math3.complex.Complex complex13 = complex7.cosh();
        org.apache.commons.math3.complex.Complex complex14 = complex7.tanh();
        org.apache.commons.math3.complex.Complex complex15 = complex7.log();
        org.apache.commons.math3.complex.Complex complex16 = complex5.multiply(complex7);
        org.apache.commons.math3.complex.Complex complex18 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex19 = complex18.sqrt();
        org.apache.commons.math3.complex.Complex complex20 = complex18.sqrt();
        org.apache.commons.math3.complex.Complex complex21 = complex20.cosh();
        org.apache.commons.math3.complex.Complex complex23 = complex20.add((double) ' ');
        org.apache.commons.math3.complex.Complex complex24 = complex20.tan();
        org.apache.commons.math3.complex.Complex complex25 = complex5.divide(complex24);
        java.lang.Class<?> wildcardClass26 = complex24.getClass();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex5.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex9 = complex5.negate();
        boolean boolean10 = complex5.isInfinite();
        org.apache.commons.math3.complex.Complex complex12 = complex5.subtract((double) 1);
        double double13 = complex5.abs();
        org.apache.commons.math3.complex.Complex complex14 = complex5.atan();
        org.apache.commons.math3.complex.Complex complex16 = complex14.divide((double) (byte) 10);
        org.apache.commons.math3.complex.Complex complex18 = complex14.add(0.9996159447946292d);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexList8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex18);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex6 = complex1.tanh();
        org.apache.commons.math3.complex.Complex complex8 = complex6.multiply((int) (short) 100);
        double double9 = complex8.abs();
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex12 = complex11.exp();
        double double13 = complex11.getArgument();
        org.apache.commons.math3.complex.Complex complex14 = complex11.log();
        org.apache.commons.math3.complex.Complex complex15 = complex11.log();
        org.apache.commons.math3.complex.Complex complex17 = complex15.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex18 = complex17.exp();
        org.apache.commons.math3.complex.Complex complex19 = complex18.log();
        org.apache.commons.math3.complex.Complex complex21 = complex19.multiply((-1));
        org.apache.commons.math3.complex.Complex complex23 = complex21.multiply((int) (short) 0);
        org.apache.commons.math3.complex.Complex complex24 = complex8.add(complex23);
        org.apache.commons.math3.complex.Complex complex25 = complex8.sinh();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 76.15941559557649d + "'", double9 == 76.15941559557649d);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
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
        org.apache.commons.math3.complex.Complex complex13 = complex12.asin();
        org.apache.commons.math3.complex.Complex complex14 = complex12.cosh();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList16 = complex14.nthRoot((int) (byte) 1);
        double double17 = complex14.getReal();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complexList16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.4461728085856087d + "'", double17 == 1.4461728085856087d);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
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
        org.apache.commons.math3.complex.Complex complex15 = complex11.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex16 = complex11.exp();
        org.apache.commons.math3.complex.Complex complex17 = complex11.exp();
        org.apache.commons.math3.complex.Complex complex19 = complex17.multiply((int) 'a');
        org.apache.commons.math3.complex.Complex complex21 = complex19.divide((double) (byte) 1);
        org.apache.commons.math3.complex.Complex complex22 = complex9.multiply(complex21);
        org.apache.commons.math3.complex.Complex complex23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.complex.Complex complex24 = complex9.pow(complex23);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexList8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
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
        double double17 = complex1.getImaginary();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex7 = complex3.subtract(complex6);
        org.apache.commons.math3.complex.Complex complex9 = complex3.pow((double) '#');
        double double10 = complex9.getImaginary();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-7.838977475816237E-15d) + "'", double10 == (-7.838977475816237E-15d));
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
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
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complexList18);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 10.0f, (double) (short) -1);
        org.apache.commons.math3.complex.Complex complex3 = complex2.sinh();
        org.apache.commons.math3.complex.Complex complex4 = complex2.acos();
        org.apache.commons.math3.complex.Complex complex6 = complex4.subtract((double) (-1.0f));
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf(0.705026843555238d);
        org.junit.Assert.assertNotNull(complex1);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
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
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexList8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex18);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tanh();
        org.apache.commons.math3.complex.Complex complex4 = complex3.log();
        org.apache.commons.math3.complex.Complex complex5 = complex3.acos();
        org.apache.commons.math3.complex.Complex complex6 = complex3.tanh();
        org.apache.commons.math3.complex.Complex complex7 = complex6.asin();
        org.apache.commons.math3.complex.Complex complex9 = complex7.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex10 = complex7.exp();
        org.apache.commons.math3.complex.Complex complex12 = new org.apache.commons.math3.complex.Complex(10.0d);
        org.apache.commons.math3.complex.Complex complex14 = complex12.divide((double) 'a');
        boolean boolean15 = complex10.equals((java.lang.Object) 'a');
        org.apache.commons.math3.complex.Complex complex16 = complex10.cosh();
        org.apache.commons.math3.complex.Complex complex17 = complex16.sin();
        org.apache.commons.math3.complex.Complex complex18 = complex16.exp();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
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
        org.apache.commons.math3.complex.Complex complex42 = complex39.add((double) 1);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complexList27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex42);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
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
        org.apache.commons.math3.complex.Complex complex17 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex18 = complex17.exp();
        org.apache.commons.math3.complex.Complex complex19 = complex17.tan();
        org.apache.commons.math3.complex.Complex complex21 = complex17.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex22 = complex17.cos();
        boolean boolean23 = complex17.isNaN();
        org.apache.commons.math3.complex.Complex complex24 = complex17.cosh();
        org.apache.commons.math3.complex.Complex complex25 = complex17.asin();
        boolean boolean26 = complex11.equals((java.lang.Object) complex25);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) (short) -1);
        double double2 = complex1.getReal();
        org.apache.commons.math3.complex.Complex complex3 = complex1.asin();
        org.apache.commons.math3.complex.Complex complex4 = complex3.cosh();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
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
        org.apache.commons.math3.complex.Complex complex15 = complex11.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex16 = complex11.exp();
        org.apache.commons.math3.complex.Complex complex17 = complex11.exp();
        org.apache.commons.math3.complex.Complex complex19 = complex17.multiply((int) 'a');
        org.apache.commons.math3.complex.Complex complex21 = complex19.divide((double) (byte) 1);
        org.apache.commons.math3.complex.Complex complex22 = complex9.multiply(complex21);
        org.apache.commons.math3.complex.Complex complex23 = complex22.sinh();
        org.apache.commons.math3.complex.Complex complex24 = complex23.acos();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexList8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
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
        org.apache.commons.math3.complex.Complex complex25 = complex5.subtract(complex21);
        org.apache.commons.math3.complex.Complex complex26 = complex5.tan();
        org.apache.commons.math3.complex.Complex complex27 = complex5.negate();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complexList19);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tanh();
        org.apache.commons.math3.complex.Complex complex4 = complex3.log();
        org.apache.commons.math3.complex.Complex complex5 = complex3.acos();
        org.apache.commons.math3.complex.Complex complex6 = complex3.tanh();
        org.apache.commons.math3.complex.Complex complex7 = complex6.asin();
        org.apache.commons.math3.complex.Complex complex9 = complex7.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex10 = complex7.exp();
        org.apache.commons.math3.complex.Complex complex12 = new org.apache.commons.math3.complex.Complex(10.0d);
        org.apache.commons.math3.complex.Complex complex14 = complex12.divide((double) 'a');
        boolean boolean15 = complex10.equals((java.lang.Object) 'a');
        org.apache.commons.math3.complex.Complex complex16 = complex10.cosh();
        org.apache.commons.math3.complex.Complex complex17 = complex16.sin();
        org.apache.commons.math3.complex.Complex complex19 = complex17.divide(0.5403023058681398d);
        boolean boolean20 = complex17.isInfinite();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex7 = complex1.pow((double) 100.0f);
        org.apache.commons.math3.complex.Complex complex8 = complex7.sin();
        org.apache.commons.math3.complex.Complex complex10 = complex8.subtract((double) 1);
        org.apache.commons.math3.complex.Complex complex12 = complex10.multiply(0.0d);
        org.apache.commons.math3.complex.Complex complex14 = complex10.divide((double) 10);
        org.apache.commons.math3.complex.Complex complex16 = complex10.divide(4.242117536224665d);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) (byte) 1, (double) (-1));
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex3.reciprocal();
        org.apache.commons.math3.complex.Complex complex5 = complex3.cosh();
        org.apache.commons.math3.complex.Complex complex7 = complex3.divide((double) 1);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf(1.557407724654902d, (-0.0d));
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf(0.9996159447946292d, (double) 0);
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 10L, (double) 0);
        org.apache.commons.math3.complex.ComplexField complexField3 = complex2.getField();
        org.apache.commons.math3.complex.Complex complex4 = complex2.acos();
        org.junit.Assert.assertNotNull(complexField3);
        org.junit.Assert.assertNotNull(complex4);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex7 = complex1.acos();
        org.apache.commons.math3.complex.Complex complex9 = complex1.pow((double) 100L);
        java.lang.String str10 = complex9.toString();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(1.0, 0.0)" + "'", str10, "(1.0, 0.0)");
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex6 = complex1.sqrt1z();
        org.apache.commons.math3.complex.Complex complex8 = complex1.multiply(1.0d);
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
        org.apache.commons.math3.complex.Complex complex23 = complex14.asin();
        org.apache.commons.math3.complex.Complex complex24 = complex23.cos();
        org.apache.commons.math3.complex.Complex complex25 = complex24.tan();
        org.apache.commons.math3.complex.Complex complex26 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex27 = complex26.exp();
        org.apache.commons.math3.complex.Complex complex28 = complex27.exp();
        org.apache.commons.math3.complex.Complex complex30 = complex28.pow((double) (short) 10);
        double double31 = complex28.abs();
        boolean boolean32 = complex24.equals((java.lang.Object) double31);
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
        org.apache.commons.math3.complex.Complex complex56 = complex55.tanh();
        org.apache.commons.math3.complex.Complex complex57 = complex55.asin();
        org.apache.commons.math3.complex.Complex complex58 = complex24.subtract(complex57);
        boolean boolean59 = complex1.equals((java.lang.Object) complex57);
        org.apache.commons.math3.complex.Complex complex61 = complex57.multiply(3.141592653589793d);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complexList17);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertNotNull(complex54);
        org.junit.Assert.assertNotNull(complex55);
        org.junit.Assert.assertNotNull(complex56);
        org.junit.Assert.assertNotNull(complex57);
        org.junit.Assert.assertNotNull(complex58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(complex61);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex7 = complex3.subtract(complex6);
        boolean boolean8 = complex3.isNaN();
        org.apache.commons.math3.complex.Complex complex9 = complex3.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList11 = complex9.nthRoot((int) '4');
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complexList11);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) '#');
        double double6 = complex1.getReal();
        org.apache.commons.math3.complex.Complex complex7 = complex1.atan();
        org.apache.commons.math3.complex.Complex complex8 = complex1.sqrt1z();
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
        org.apache.commons.math3.complex.Complex complex23 = complex14.asin();
        java.lang.String str24 = complex23.toString();
        org.apache.commons.math3.complex.Complex complex25 = complex23.cosh();
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
        org.apache.commons.math3.complex.Complex complex40 = complex31.asin();
        org.apache.commons.math3.complex.Complex complex41 = complex25.pow(complex40);
        org.apache.commons.math3.complex.Complex complex42 = complex8.pow(complex25);
        org.apache.commons.math3.complex.Complex complex43 = complex25.tanh();
        org.apache.commons.math3.complex.Complex complex44 = complex43.cosh();
        double double45 = complex44.abs();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complexList17);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "(1.5707963267948966, -0.0)" + "'", str24, "(1.5707963267948966, -0.0)");
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complexList34);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 1.5277668470686598d + "'", double45 == 1.5277668470686598d);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex7 = complex5.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex8 = complex7.exp();
        org.apache.commons.math3.complex.Complex complex10 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex11 = complex10.exp();
        org.apache.commons.math3.complex.Complex complex12 = complex10.tanh();
        org.apache.commons.math3.complex.Complex complex13 = complex12.log();
        org.apache.commons.math3.complex.Complex complex14 = complex12.acos();
        org.apache.commons.math3.complex.Complex complex15 = complex12.tanh();
        org.apache.commons.math3.complex.Complex complex16 = complex15.asin();
        org.apache.commons.math3.complex.Complex complex17 = complex7.multiply(complex16);
        org.apache.commons.math3.complex.Complex complex19 = complex7.pow(0.21460183660255172d);
        org.apache.commons.math3.complex.Complex complex20 = complex19.reciprocal();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex2.exp();
        org.apache.commons.math3.complex.Complex complex5 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double6 = complex5.getImaginary();
        org.apache.commons.math3.complex.Complex complex7 = complex5.negate();
        org.apache.commons.math3.complex.Complex complex9 = complex7.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex10 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex11 = complex7.subtract(complex10);
        org.apache.commons.math3.complex.Complex complex12 = complex7.acos();
        org.apache.commons.math3.complex.Complex complex13 = complex7.negate();
        org.apache.commons.math3.complex.Complex complex15 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex17 = complex15.subtract((double) (-1));
        org.apache.commons.math3.complex.Complex complex19 = complex15.multiply((double) 10L);
        boolean boolean20 = complex13.equals((java.lang.Object) complex19);
        org.apache.commons.math3.complex.Complex complex21 = complex3.subtract(complex13);
        org.apache.commons.math3.complex.Complex complex22 = complex13.sqrt1z();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
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
        org.apache.commons.math3.complex.Complex complex25 = complex5.subtract(complex21);
        org.apache.commons.math3.complex.Complex complex26 = complex21.cos();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complexList19);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
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
        org.apache.commons.math3.complex.Complex complex18 = complex3.multiply(0.9996159447946292d);
        java.lang.Class<?> wildcardClass19 = complex3.getClass();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
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
        org.apache.commons.math3.complex.Complex complex24 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex25 = complex24.exp();
        double double26 = complex24.getArgument();
        org.apache.commons.math3.complex.Complex complex28 = complex24.pow((double) '#');
        double double29 = complex24.getReal();
        org.apache.commons.math3.complex.Complex complex30 = complex24.atan();
        org.apache.commons.math3.complex.Complex complex31 = complex24.sqrt1z();
        org.apache.commons.math3.complex.Complex complex33 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double34 = complex33.getImaginary();
        org.apache.commons.math3.complex.Complex complex35 = complex33.negate();
        org.apache.commons.math3.complex.Complex complex37 = complex35.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex38 = complex37.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList40 = complex37.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex42 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex43 = complex42.exp();
        org.apache.commons.math3.complex.Complex complex44 = complex42.tanh();
        org.apache.commons.math3.complex.Complex complex45 = complex37.subtract(complex42);
        org.apache.commons.math3.complex.Complex complex46 = complex37.asin();
        java.lang.String str47 = complex46.toString();
        org.apache.commons.math3.complex.Complex complex48 = complex46.cosh();
        org.apache.commons.math3.complex.Complex complex50 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double51 = complex50.getImaginary();
        org.apache.commons.math3.complex.Complex complex52 = complex50.negate();
        org.apache.commons.math3.complex.Complex complex54 = complex52.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex55 = complex54.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList57 = complex54.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex59 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex60 = complex59.exp();
        org.apache.commons.math3.complex.Complex complex61 = complex59.tanh();
        org.apache.commons.math3.complex.Complex complex62 = complex54.subtract(complex59);
        org.apache.commons.math3.complex.Complex complex63 = complex54.asin();
        org.apache.commons.math3.complex.Complex complex64 = complex48.pow(complex63);
        org.apache.commons.math3.complex.Complex complex65 = complex31.pow(complex48);
        org.apache.commons.math3.complex.Complex complex66 = complex48.tanh();
        org.apache.commons.math3.complex.Complex complex67 = complex11.divide(complex48);
        double double68 = complex67.getArgument();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 1.0d + "'", double29 == 1.0d);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complexList40);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "(1.5707963267948966, -0.0)" + "'", str47, "(1.5707963267948966, -0.0)");
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertNotNull(complex54);
        org.junit.Assert.assertNotNull(complex55);
        org.junit.Assert.assertNotNull(complexList57);
        org.junit.Assert.assertNotNull(complex59);
        org.junit.Assert.assertNotNull(complex60);
        org.junit.Assert.assertNotNull(complex61);
        org.junit.Assert.assertNotNull(complex62);
        org.junit.Assert.assertNotNull(complex63);
        org.junit.Assert.assertNotNull(complex64);
        org.junit.Assert.assertNotNull(complex65);
        org.junit.Assert.assertNotNull(complex66);
        org.junit.Assert.assertNotNull(complex67);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 0.0d + "'", double68 == 0.0d);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
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
        double double16 = complex15.getArgument();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
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
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexList8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complexField15);
        org.junit.Assert.assertNotNull(complex16);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
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
        org.apache.commons.math3.complex.Complex complex15 = complex7.subtract((double) (byte) 10);
        org.apache.commons.math3.complex.Complex complex17 = complex7.pow((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex19 = complex17.divide(3.8412897345910653E-4d);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex19);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((-3.141592653589793d), 2.718281828459045d);
        double double3 = complex2.getArgument();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.428308113150743d + "'", double3 == 2.428308113150743d);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
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
        org.apache.commons.math3.complex.Complex complex15 = complex14.tanh();
        org.apache.commons.math3.complex.ComplexField complexField16 = complex15.getField();
        org.apache.commons.math3.complex.Complex complex17 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex18 = complex17.exp();
        org.apache.commons.math3.complex.Complex complex19 = complex18.exp();
        java.lang.String str20 = complex19.toString();
        org.apache.commons.math3.complex.Complex complex21 = complex19.sqrt();
        org.apache.commons.math3.complex.Complex complex22 = complex15.multiply(complex21);
        org.apache.commons.math3.complex.Complex complex23 = complex21.exp();
        org.apache.commons.math3.complex.ComplexField complexField24 = complex23.getField();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complexField16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "(NaN, NaN)" + "'", str20, "(NaN, NaN)");
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complexField24);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.sin();
        org.apache.commons.math3.complex.Complex complex7 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex8 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex9 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex10 = complex9.reciprocal();
        org.apache.commons.math3.complex.Complex complex11 = complex10.tan();
        org.apache.commons.math3.complex.Complex complex13 = complex11.pow((double) 'a');
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((double) 100L, (double) (short) 0);
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex7 = complex3.subtract(complex6);
        org.apache.commons.math3.complex.Complex complex8 = complex3.acos();
        org.apache.commons.math3.complex.Complex complex9 = complex3.log();
        org.apache.commons.math3.complex.Complex complex10 = complex3.negate();
        org.apache.commons.math3.complex.ComplexField complexField11 = complex3.getField();
        double double12 = complex3.getImaginary();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complexField11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.0d) + "'", double12 == (-0.0d));
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex7 = complex5.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex8 = complex7.exp();
        boolean boolean9 = complex7.isNaN();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) (short) -1);
        double double2 = complex1.getReal();
        org.apache.commons.math3.complex.Complex complex3 = complex1.log();
        boolean boolean4 = complex1.isInfinite();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex5 = complex1.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex6 = complex1.cos();
        boolean boolean7 = complex1.isNaN();
        org.apache.commons.math3.complex.Complex complex8 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex9 = complex8.conjugate();
        org.apache.commons.math3.complex.Complex complex10 = complex8.negate();
        boolean boolean11 = complex8.isNaN();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
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
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) '4', (-0.5430806348152437d));
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) ' ');
        org.apache.commons.math3.complex.Complex complex2 = complex1.sin();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math3.complex.Complex complex8 = complex6.subtract((double) 1.0f);
        org.apache.commons.math3.complex.Complex complex10 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex11 = complex10.exp();
        double double12 = complex10.getArgument();
        org.apache.commons.math3.complex.Complex complex13 = complex10.log();
        org.apache.commons.math3.complex.Complex complex14 = complex10.log();
        org.apache.commons.math3.complex.Complex complex15 = complex14.atan();
        org.apache.commons.math3.complex.Complex complex16 = complex8.pow(complex15);
        org.apache.commons.math3.complex.Complex complex17 = complex8.reciprocal();
        boolean boolean18 = complex8.isNaN();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
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
        org.apache.commons.math3.complex.Complex complex38 = complex34.subtract(100.0d);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex38);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex3 = complex1.subtract((double) (-1));
        org.apache.commons.math3.complex.Complex complex5 = complex1.multiply((int) (short) 0);
        org.apache.commons.math3.complex.Complex complex7 = complex1.subtract((double) 10L);
        double double8 = complex7.getReal();
        org.apache.commons.math3.complex.Complex complex9 = complex7.reciprocal();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-9.0d) + "'", double8 == (-9.0d));
        org.junit.Assert.assertNotNull(complex9);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 1, (double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex3 = complex2.tanh();
        double double4 = complex2.getReal();
        org.apache.commons.math3.complex.Complex complex6 = complex2.add((double) 10);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(complex6);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math3.complex.Complex complex3 = complex1.sqrt();
        org.apache.commons.math3.complex.Complex complex4 = complex3.asin();
        org.apache.commons.math3.complex.Complex complex5 = complex3.tanh();
        org.apache.commons.math3.complex.Complex complex6 = complex3.reciprocal();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex6.nthRoot((int) (byte) 10);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexList8);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex5 = complex1.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex6 = complex1.cos();
        org.apache.commons.math3.complex.Complex complex7 = complex1.tan();
        boolean boolean8 = complex7.isNaN();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
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
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
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
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex7 = complex3.subtract(complex6);
        org.apache.commons.math3.complex.Complex complex8 = complex3.acos();
        org.apache.commons.math3.complex.Complex complex9 = complex3.log();
        org.apache.commons.math3.complex.Complex complex10 = complex3.negate();
        org.apache.commons.math3.complex.ComplexField complexField11 = complex3.getField();
        org.apache.commons.math3.complex.Complex complex13 = complex3.multiply((double) (byte) 1);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complexField11);
        org.junit.Assert.assertNotNull(complex13);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math3.complex.Complex complex3 = complex1.sqrt();
        org.apache.commons.math3.complex.Complex complex5 = complex1.add(4.242117536224665d);
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double8 = complex7.getImaginary();
        org.apache.commons.math3.complex.Complex complex9 = complex7.negate();
        org.apache.commons.math3.complex.Complex complex11 = complex9.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex12 = complex11.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList14 = complex11.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex15 = complex11.negate();
        boolean boolean16 = complex11.isInfinite();
        org.apache.commons.math3.complex.Complex complex17 = complex11.negate();
        org.apache.commons.math3.complex.Complex complex18 = complex17.negate();
        org.apache.commons.math3.complex.ComplexField complexField19 = complex17.getField();
        org.apache.commons.math3.complex.Complex complex20 = complex5.add(complex17);
        org.apache.commons.math3.complex.Complex complex21 = complex20.acos();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complexList14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complexField19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
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
        boolean boolean19 = complex18.isInfinite();
        double double20 = complex18.abs();
        java.lang.String str21 = complex18.toString();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 2.8014000414552136d + "'", double20 == 2.8014000414552136d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "(2.8014000414552136, 0.0)" + "'", str21, "(2.8014000414552136, 0.0)");
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
        org.junit.Assert.assertNotNull(complex1);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((double) (-1.0f), 1.0d);
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
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
        org.apache.commons.math3.complex.Complex complex17 = complex3.tan();
        double double18 = complex3.getImaginary();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.0d) + "'", double18 == (-0.0d));
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
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
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complexField1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complexList19);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(complexList26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((-7.838977475816237E-15d), 1.4461728085856087d);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.sin();
        org.apache.commons.math3.complex.Complex complex7 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex8 = complex1.cos();
        org.apache.commons.math3.complex.Complex complex9 = complex8.exp();
        org.apache.commons.math3.complex.Complex complex10 = complex9.acos();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex1 = complex0.sqrt1z();
        double double2 = complex0.abs();
        org.apache.commons.math3.complex.Complex complex4 = complex0.pow(0.5403023058681398d);
        org.apache.commons.math3.complex.Complex complex5 = complex0.asin();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList7 = complex0.nthRoot((int) (byte) 10);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complexList7);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex5 = complex1.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex6 = complex1.cos();
        double double7 = complex6.getArgument();
        java.lang.String str8 = complex6.toString();
        org.apache.commons.math3.complex.Complex complex10 = complex6.pow((-1.0d));
        java.lang.Class<?> wildcardClass11 = complex10.getClass();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-0.0d) + "'", double7 == (-0.0d));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(0.5403023058681398, -0.0)" + "'", str8, "(0.5403023058681398, -0.0)");
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
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
        org.apache.commons.math3.complex.Complex complex13 = complex3.tanh();
        org.apache.commons.math3.complex.Complex complex14 = complex13.conjugate();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList6 = complex4.nthRoot((int) 'a');
        org.apache.commons.math3.complex.Complex complex7 = complex4.exp();
        org.apache.commons.math3.complex.Complex complex9 = complex4.pow(35.0d);
        org.apache.commons.math3.complex.Complex complex10 = complex9.reciprocal();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complexList6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((double) (short) 0, (double) 10.0f);
        org.apache.commons.math3.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math3.complex.Complex complex4 = complex2.reciprocal();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
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
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexList8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-0.0d) + "'", double17 == (-0.0d));
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
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
        org.apache.commons.math3.complex.Complex complex16 = complex11.tanh();
        org.apache.commons.math3.complex.Complex complex17 = complex11.sqrt();
        org.apache.commons.math3.complex.Complex complex19 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex20 = complex19.exp();
        double double21 = complex19.getArgument();
        org.apache.commons.math3.complex.Complex complex23 = complex19.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex24 = complex19.exp();
        org.apache.commons.math3.complex.Complex complex25 = complex17.divide(complex19);
        boolean boolean26 = complex3.equals((java.lang.Object) complex19);
        org.apache.commons.math3.complex.Complex complex27 = complex3.acos();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(complex27);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
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
        org.apache.commons.math3.complex.Complex complex14 = complex13.log();
        org.apache.commons.math3.complex.Complex complex16 = complex14.multiply(0);
        java.lang.Class<?> wildcardClass17 = complex14.getClass();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math3.complex.Complex complex8 = complex6.subtract((double) 1.0f);
        org.apache.commons.math3.complex.Complex complex10 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex11 = complex10.exp();
        double double12 = complex10.getArgument();
        org.apache.commons.math3.complex.Complex complex13 = complex10.log();
        org.apache.commons.math3.complex.Complex complex14 = complex10.log();
        org.apache.commons.math3.complex.Complex complex15 = complex14.atan();
        org.apache.commons.math3.complex.Complex complex16 = complex8.pow(complex15);
        org.apache.commons.math3.complex.Complex complex17 = complex8.reciprocal();
        org.apache.commons.math3.complex.Complex complex19 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex20 = complex19.sqrt();
        org.apache.commons.math3.complex.Complex complex21 = complex19.sqrt();
        org.apache.commons.math3.complex.Complex complex22 = complex21.asin();
        org.apache.commons.math3.complex.Complex complex23 = complex21.tanh();
        org.apache.commons.math3.complex.Complex complex24 = complex8.subtract(complex21);
        org.apache.commons.math3.complex.Complex complex25 = complex24.cos();
        org.apache.commons.math3.complex.Complex complex26 = complex25.asin();
        org.apache.commons.math3.complex.Complex complex29 = new org.apache.commons.math3.complex.Complex((double) 10.0f, (double) (short) -1);
        org.apache.commons.math3.complex.Complex complex30 = complex29.cosh();
        org.apache.commons.math3.complex.Complex complex32 = complex30.multiply((double) (short) 1);
        org.apache.commons.math3.complex.Complex complex33 = complex26.divide(complex30);
        org.apache.commons.math3.complex.Complex complex34 = complex33.acos();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
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
        org.apache.commons.math3.complex.Complex complex15 = complex7.tanh();
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
        boolean boolean36 = complex15.equals((java.lang.Object) complex35);
        org.apache.commons.math3.complex.Complex complex37 = complex35.sqrt1z();
        org.apache.commons.math3.complex.Complex complex38 = complex37.sqrt();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex(1.557407724654902d);
        org.apache.commons.math3.complex.Complex complex3 = complex1.add((double) 0);
        org.apache.commons.math3.complex.Complex complex4 = complex3.tan();
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.valueOf((double) (short) 10, (-0.5430806348152437d));
        org.apache.commons.math3.complex.Complex complex8 = complex7.atan();
        org.apache.commons.math3.complex.Complex complex9 = complex8.exp();
        org.apache.commons.math3.complex.Complex complex10 = complex4.pow(complex8);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.sinh();
        double double5 = complex1.getImaginary();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList7 = complex1.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex8 = complex1.sqrt();
        org.apache.commons.math3.complex.Complex complex9 = complex8.cosh();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(complexList7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex6 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex7 = complex1.exp();
        double double8 = complex7.getReal();
        org.apache.commons.math3.complex.Complex complex9 = complex7.sinh();
        org.apache.commons.math3.complex.Complex complex11 = complex7.multiply(0.0d);
        org.apache.commons.math3.complex.Complex complex12 = complex7.sin();
        org.apache.commons.math3.complex.Complex complex14 = complex7.multiply((double) ' ');
        org.apache.commons.math3.complex.Complex complex15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.complex.Complex complex16 = complex7.pow(complex15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.718281828459045d + "'", double8 == 2.718281828459045d);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex(1.557407724654902d);
        org.apache.commons.math3.complex.Complex complex3 = complex1.add((double) 0);
        org.apache.commons.math3.complex.Complex complex4 = complex3.tan();
        java.lang.Class<?> wildcardClass5 = complex3.getClass();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex7 = complex3.subtract(complex6);
        org.apache.commons.math3.complex.Complex complex8 = complex3.acos();
        org.apache.commons.math3.complex.Complex complex9 = complex3.negate();
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex12 = complex11.exp();
        double double13 = complex11.getArgument();
        org.apache.commons.math3.complex.Complex complex14 = complex11.log();
        org.apache.commons.math3.complex.Complex complex15 = complex11.log();
        org.apache.commons.math3.complex.Complex complex16 = complex11.sqrt1z();
        org.apache.commons.math3.complex.Complex complex18 = complex11.multiply(1.0d);
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
        org.apache.commons.math3.complex.Complex complex33 = complex24.asin();
        org.apache.commons.math3.complex.Complex complex34 = complex33.cos();
        org.apache.commons.math3.complex.Complex complex35 = complex34.tan();
        org.apache.commons.math3.complex.Complex complex36 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex37 = complex36.exp();
        org.apache.commons.math3.complex.Complex complex38 = complex37.exp();
        org.apache.commons.math3.complex.Complex complex40 = complex38.pow((double) (short) 10);
        double double41 = complex38.abs();
        boolean boolean42 = complex34.equals((java.lang.Object) double41);
        org.apache.commons.math3.complex.Complex complex44 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex45 = complex44.exp();
        double double46 = complex44.getArgument();
        org.apache.commons.math3.complex.Complex complex48 = complex44.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex49 = complex44.sin();
        org.apache.commons.math3.complex.Complex complex50 = complex44.cosh();
        org.apache.commons.math3.complex.Complex complex51 = complex44.tan();
        org.apache.commons.math3.complex.Complex complex52 = complex44.tan();
        org.apache.commons.math3.complex.Complex complex54 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex55 = complex54.exp();
        double double56 = complex54.getArgument();
        org.apache.commons.math3.complex.Complex complex58 = complex54.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex59 = complex54.sin();
        org.apache.commons.math3.complex.Complex complex60 = complex54.cosh();
        org.apache.commons.math3.complex.Complex complex61 = complex54.tan();
        org.apache.commons.math3.complex.Complex complex62 = complex54.tan();
        org.apache.commons.math3.complex.Complex complex64 = complex54.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex65 = complex52.subtract(complex54);
        org.apache.commons.math3.complex.Complex complex66 = complex65.tanh();
        org.apache.commons.math3.complex.Complex complex67 = complex65.asin();
        org.apache.commons.math3.complex.Complex complex68 = complex34.subtract(complex67);
        boolean boolean69 = complex11.equals((java.lang.Object) complex67);
        org.apache.commons.math3.complex.Complex complex70 = complex3.subtract(complex67);
        org.apache.commons.math3.complex.Complex complex73 = new org.apache.commons.math3.complex.Complex((double) (short) -1, (double) '4');
        org.apache.commons.math3.complex.Complex complex74 = complex73.sinh();
        org.apache.commons.math3.complex.Complex complex76 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex77 = complex76.exp();
        double double78 = complex76.getArgument();
        org.apache.commons.math3.complex.Complex complex80 = complex76.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex81 = complex76.sin();
        org.apache.commons.math3.complex.Complex complex82 = complex76.cosh();
        org.apache.commons.math3.complex.Complex complex83 = complex76.sinh();
        boolean boolean84 = complex83.isInfinite();
        boolean boolean85 = complex73.equals((java.lang.Object) complex83);
        org.apache.commons.math3.complex.Complex complex86 = complex73.tanh();
        org.apache.commons.math3.complex.Complex complex87 = complex3.pow(complex73);
        org.apache.commons.math3.complex.Complex complex89 = complex3.add(0.9996159447946292d);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complexList27);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertNotNull(complex54);
        org.junit.Assert.assertNotNull(complex55);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
        org.junit.Assert.assertNotNull(complex58);
        org.junit.Assert.assertNotNull(complex59);
        org.junit.Assert.assertNotNull(complex60);
        org.junit.Assert.assertNotNull(complex61);
        org.junit.Assert.assertNotNull(complex62);
        org.junit.Assert.assertNotNull(complex64);
        org.junit.Assert.assertNotNull(complex65);
        org.junit.Assert.assertNotNull(complex66);
        org.junit.Assert.assertNotNull(complex67);
        org.junit.Assert.assertNotNull(complex68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(complex70);
        org.junit.Assert.assertNotNull(complex74);
        org.junit.Assert.assertNotNull(complex76);
        org.junit.Assert.assertNotNull(complex77);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 0.0d + "'", double78 == 0.0d);
        org.junit.Assert.assertNotNull(complex80);
        org.junit.Assert.assertNotNull(complex81);
        org.junit.Assert.assertNotNull(complex82);
        org.junit.Assert.assertNotNull(complex83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(complex86);
        org.junit.Assert.assertNotNull(complex87);
        org.junit.Assert.assertNotNull(complex89);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
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
        org.apache.commons.math3.complex.Complex complex29 = complex10.negate();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex7 = complex1.sqrt1z();
        org.apache.commons.math3.complex.Complex complex8 = complex1.acos();
        org.apache.commons.math3.complex.Complex complex9 = complex8.acos();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
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
        java.lang.String str19 = complex17.toString();
        org.apache.commons.math3.complex.Complex complex20 = complex17.atan();
        org.apache.commons.math3.complex.Complex complex22 = complex17.multiply((int) (byte) -1);
        boolean boolean23 = complex22.isInfinite();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "(1.0301193070208436, 0.0)" + "'", str19, "(1.0301193070208436, 0.0)");
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
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
        boolean boolean20 = complex9.isInfinite();
        org.apache.commons.math3.complex.Complex complex22 = complex9.subtract((double) 0L);
        double double23 = complex9.getArgument();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
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
        org.apache.commons.math3.complex.Complex complex17 = complex11.sqrt1z();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((-1.1752011936438014d), (double) ' ');
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex(0.9126365759632116d, Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
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
        org.apache.commons.math3.complex.Complex complex21 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex23 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex24 = complex23.exp();
        org.apache.commons.math3.complex.Complex complex25 = complex23.tan();
        org.apache.commons.math3.complex.Complex complex27 = complex23.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex29 = complex27.multiply(100);
        org.apache.commons.math3.complex.Complex complex30 = complex29.tanh();
        org.apache.commons.math3.complex.Complex complex31 = complex21.subtract(complex30);
        org.apache.commons.math3.complex.Complex complex32 = complex30.sin();
        org.apache.commons.math3.complex.Complex complex33 = complex32.negate();
        boolean boolean34 = complex13.equals((java.lang.Object) complex33);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complexList6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) (byte) 100, 0.0d);
        org.apache.commons.math3.complex.Complex complex4 = complex2.pow((double) (byte) 0);
        boolean boolean5 = complex2.isNaN();
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
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
        org.apache.commons.math3.complex.Complex complex26 = complex25.asin();
        org.apache.commons.math3.complex.Complex complex27 = complex26.conjugate();
        org.apache.commons.math3.complex.Complex complex29 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double30 = complex29.getImaginary();
        org.apache.commons.math3.complex.Complex complex31 = complex29.negate();
        org.apache.commons.math3.complex.Complex complex33 = complex31.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex34 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex35 = complex31.subtract(complex34);
        org.apache.commons.math3.complex.Complex complex36 = complex26.multiply(complex35);
        org.apache.commons.math3.complex.Complex complex37 = complex36.sinh();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.math3.complex.Complex> complexList39 = complex37.nthRoot((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: cannot compute nth root for null or negative n: -1");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complexList24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex7 = complex3.subtract(complex6);
        org.apache.commons.math3.complex.Complex complex8 = complex3.acos();
        org.apache.commons.math3.complex.Complex complex9 = complex3.log();
        org.apache.commons.math3.complex.Complex complex10 = complex9.conjugate();
        boolean boolean11 = complex10.isNaN();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
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
        org.apache.commons.math3.complex.Complex complex49 = complex45.subtract((double) 0.0f);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complexList13);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complexList43);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex49);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.sin();
        org.apache.commons.math3.complex.Complex complex8 = complex1.divide((double) (-1L));
        org.apache.commons.math3.complex.Complex complex9 = complex1.negate();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList11 = complex9.nthRoot((int) (short) 100);
        boolean boolean12 = complex9.isNaN();
        org.apache.commons.math3.complex.Complex complex13 = complex9.log();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complexList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(complex13);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math3.complex.Complex complex3 = complex1.sqrt();
        org.apache.commons.math3.complex.Complex complex4 = complex3.cosh();
        org.apache.commons.math3.complex.Complex complex6 = complex3.add((double) ' ');
        org.apache.commons.math3.complex.Complex complex7 = complex3.tan();
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex10 = complex9.exp();
        double double11 = complex9.getArgument();
        org.apache.commons.math3.complex.Complex complex12 = complex9.log();
        org.apache.commons.math3.complex.Complex complex13 = complex12.log();
        org.apache.commons.math3.complex.Complex complex15 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex16 = complex15.exp();
        double double17 = complex15.getArgument();
        org.apache.commons.math3.complex.Complex complex19 = complex15.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex20 = complex15.sin();
        org.apache.commons.math3.complex.Complex complex21 = complex15.cosh();
        org.apache.commons.math3.complex.Complex complex22 = complex15.tanh();
        org.apache.commons.math3.complex.Complex complex23 = complex15.log();
        org.apache.commons.math3.complex.Complex complex24 = complex13.multiply(complex15);
        org.apache.commons.math3.complex.Complex complex25 = complex24.negate();
        org.apache.commons.math3.complex.Complex complex26 = complex7.divide(complex25);
        org.apache.commons.math3.complex.Complex complex27 = complex25.reciprocal();
        org.apache.commons.math3.complex.Complex complex28 = complex27.conjugate();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex6 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex7 = complex1.exp();
        double double8 = complex7.getReal();
        org.apache.commons.math3.complex.Complex complex9 = complex7.sinh();
        org.apache.commons.math3.complex.Complex complex11 = complex9.subtract((double) 'a');
        org.apache.commons.math3.complex.Complex complex12 = complex11.cosh();
        org.apache.commons.math3.complex.Complex complex13 = complex12.sin();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.718281828459045d + "'", double8 == 2.718281828459045d);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex7 = complex1.pow((double) 100.0f);
        org.apache.commons.math3.complex.Complex complex8 = complex7.sin();
        org.apache.commons.math3.complex.Complex complex9 = complex7.log();
        double double10 = complex7.abs();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex5 = complex1.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex6 = complex1.cos();
        double double7 = complex6.getReal();
        org.apache.commons.math3.complex.Complex complex8 = complex6.sin();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList10 = complex8.nthRoot(10);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5403023058681398d + "'", double7 == 0.5403023058681398d);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complexList10);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf(Double.NaN, (double) (short) -1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 0);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) '4', 35.0d);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math3.complex.Complex complex3 = complex1.sqrt();
        org.apache.commons.math3.complex.Complex complex4 = complex3.cosh();
        org.apache.commons.math3.complex.Complex complex6 = complex3.add((double) ' ');
        org.apache.commons.math3.complex.Complex complex7 = complex3.tan();
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex10 = complex9.exp();
        double double11 = complex9.getArgument();
        org.apache.commons.math3.complex.Complex complex12 = complex9.log();
        org.apache.commons.math3.complex.Complex complex13 = complex12.log();
        org.apache.commons.math3.complex.Complex complex15 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex16 = complex15.exp();
        double double17 = complex15.getArgument();
        org.apache.commons.math3.complex.Complex complex19 = complex15.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex20 = complex15.sin();
        org.apache.commons.math3.complex.Complex complex21 = complex15.cosh();
        org.apache.commons.math3.complex.Complex complex22 = complex15.tanh();
        org.apache.commons.math3.complex.Complex complex23 = complex15.log();
        org.apache.commons.math3.complex.Complex complex24 = complex13.multiply(complex15);
        org.apache.commons.math3.complex.Complex complex25 = complex24.negate();
        org.apache.commons.math3.complex.Complex complex26 = complex7.divide(complex25);
        org.apache.commons.math3.complex.Complex complex29 = org.apache.commons.math3.complex.Complex.valueOf((double) (short) 1, (double) 100L);
        org.apache.commons.math3.complex.Complex complex30 = complex29.tan();
        org.apache.commons.math3.complex.Complex complex31 = complex7.multiply(complex29);
        double double32 = complex29.getReal();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 1.0d + "'", double32 == 1.0d);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) (-1.0f), 52.0d);
        org.apache.commons.math3.complex.Complex complex4 = complex2.divide(0.0d);
        org.junit.Assert.assertNotNull(complex4);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((double) 100.0f, 0.9999499987499375d);
        org.apache.commons.math3.complex.Complex complex3 = complex2.sinh();
        double double4 = complex2.getArgument();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.009999166724158364d + "'", double4 == 0.009999166724158364d);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        boolean boolean1 = complex0.isInfinite();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
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
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex4.log();
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex8 = complex7.exp();
        double double9 = complex7.getArgument();
        org.apache.commons.math3.complex.Complex complex11 = complex7.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex12 = complex7.sin();
        org.apache.commons.math3.complex.Complex complex13 = complex7.cosh();
        org.apache.commons.math3.complex.Complex complex14 = complex7.tanh();
        org.apache.commons.math3.complex.Complex complex15 = complex7.log();
        org.apache.commons.math3.complex.Complex complex16 = complex5.multiply(complex7);
        org.apache.commons.math3.complex.Complex complex18 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex19 = complex18.exp();
        double double20 = complex18.getArgument();
        org.apache.commons.math3.complex.Complex complex21 = complex18.sinh();
        org.apache.commons.math3.complex.Complex complex22 = complex18.cosh();
        org.apache.commons.math3.complex.Complex complex24 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex25 = complex24.exp();
        org.apache.commons.math3.complex.Complex complex26 = complex24.tan();
        org.apache.commons.math3.complex.Complex complex28 = complex24.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex30 = complex28.multiply(100);
        org.apache.commons.math3.complex.Complex complex32 = complex28.multiply((int) (short) 0);
        double double33 = complex28.getImaginary();
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
        java.lang.String str49 = complex48.toString();
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
        org.apache.commons.math3.complex.Complex complex65 = complex56.asin();
        org.apache.commons.math3.complex.Complex complex66 = complex50.pow(complex65);
        org.apache.commons.math3.complex.Complex complex67 = complex28.subtract(complex50);
        org.apache.commons.math3.complex.Complex complex68 = complex28.atan();
        org.apache.commons.math3.complex.Complex complex69 = complex68.sinh();
        org.apache.commons.math3.complex.Complex complex70 = complex18.divide(complex69);
        org.apache.commons.math3.complex.Complex complex71 = complex5.divide(complex18);
        org.apache.commons.math3.complex.ComplexField complexField72 = complex5.getField();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complexList42);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "(1.5707963267948966, -0.0)" + "'", str49, "(1.5707963267948966, -0.0)");
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertNotNull(complex54);
        org.junit.Assert.assertNotNull(complex56);
        org.junit.Assert.assertNotNull(complex57);
        org.junit.Assert.assertNotNull(complexList59);
        org.junit.Assert.assertNotNull(complex61);
        org.junit.Assert.assertNotNull(complex62);
        org.junit.Assert.assertNotNull(complex63);
        org.junit.Assert.assertNotNull(complex64);
        org.junit.Assert.assertNotNull(complex65);
        org.junit.Assert.assertNotNull(complex66);
        org.junit.Assert.assertNotNull(complex67);
        org.junit.Assert.assertNotNull(complex68);
        org.junit.Assert.assertNotNull(complex69);
        org.junit.Assert.assertNotNull(complex70);
        org.junit.Assert.assertNotNull(complex71);
        org.junit.Assert.assertNotNull(complexField72);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
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
        org.apache.commons.math3.complex.Complex complex46 = complex45.sinh();
        double double47 = complex45.getImaginary();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complexList13);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complexList43);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex7 = complex1.pow((double) 100.0f);
        org.apache.commons.math3.complex.Complex complex8 = complex7.sin();
        org.apache.commons.math3.complex.Complex complex9 = complex8.negate();
        org.apache.commons.math3.complex.Complex complex10 = complex9.negate();
        double double11 = complex9.getReal();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-0.8414709848078965d) + "'", double11 == (-0.8414709848078965d));
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math3.complex.Complex complex3 = complex1.sqrt();
        org.apache.commons.math3.complex.Complex complex4 = complex3.cosh();
        org.apache.commons.math3.complex.Complex complex6 = complex3.add((double) ' ');
        org.apache.commons.math3.complex.Complex complex7 = complex3.tan();
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex10 = complex9.exp();
        double double11 = complex9.getArgument();
        org.apache.commons.math3.complex.Complex complex12 = complex9.log();
        org.apache.commons.math3.complex.Complex complex13 = complex12.log();
        org.apache.commons.math3.complex.Complex complex15 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex16 = complex15.exp();
        double double17 = complex15.getArgument();
        org.apache.commons.math3.complex.Complex complex19 = complex15.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex20 = complex15.sin();
        org.apache.commons.math3.complex.Complex complex21 = complex15.cosh();
        org.apache.commons.math3.complex.Complex complex22 = complex15.tanh();
        org.apache.commons.math3.complex.Complex complex23 = complex15.log();
        org.apache.commons.math3.complex.Complex complex24 = complex13.multiply(complex15);
        org.apache.commons.math3.complex.Complex complex25 = complex24.negate();
        org.apache.commons.math3.complex.Complex complex26 = complex7.divide(complex25);
        org.apache.commons.math3.complex.Complex complex29 = org.apache.commons.math3.complex.Complex.valueOf((double) (short) 1, (double) 100L);
        org.apache.commons.math3.complex.Complex complex30 = complex29.tan();
        org.apache.commons.math3.complex.Complex complex31 = complex7.multiply(complex29);
        boolean boolean32 = complex29.isNaN();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((-3.141592653589793d), 3.8412897345910653E-4d);
        org.apache.commons.math3.complex.Complex complex4 = complex2.add(0.5430806348152437d);
        org.junit.Assert.assertNotNull(complex4);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
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
        org.apache.commons.math3.complex.Complex complex16 = complex13.multiply((int) '#');
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexList8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf(1.0133886021399945d);
        org.junit.Assert.assertNotNull(complex1);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf(2.8014000414552136d, 35.0d);
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
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
        org.apache.commons.math3.complex.Complex complex24 = complex22.sqrt1z();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex5 = complex1.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex7 = complex5.multiply(100);
        org.apache.commons.math3.complex.Complex complex8 = complex7.tanh();
        double double9 = complex8.getArgument();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math3.complex.Complex complex3 = complex1.sqrt();
        org.apache.commons.math3.complex.Complex complex4 = complex3.cosh();
        org.apache.commons.math3.complex.Complex complex6 = complex3.add((double) ' ');
        org.apache.commons.math3.complex.Complex complex7 = complex3.sinh();
        org.apache.commons.math3.complex.Complex complex8 = complex3.reciprocal();
        org.apache.commons.math3.complex.Complex complex9 = complex8.cosh();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tanh();
        org.apache.commons.math3.complex.Complex complex4 = complex3.log();
        org.apache.commons.math3.complex.Complex complex5 = complex3.acos();
        org.apache.commons.math3.complex.Complex complex6 = complex3.tanh();
        boolean boolean7 = complex6.isNaN();
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex10 = complex9.exp();
        double double11 = complex9.getArgument();
        org.apache.commons.math3.complex.Complex complex13 = complex9.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex14 = complex9.tanh();
        org.apache.commons.math3.complex.Complex complex17 = org.apache.commons.math3.complex.Complex.valueOf((double) (-1.0f), (double) '#');
        double double18 = complex17.getImaginary();
        org.apache.commons.math3.complex.Complex complex20 = complex17.pow((double) (short) 1);
        org.apache.commons.math3.complex.Complex complex21 = complex14.divide(complex20);
        org.apache.commons.math3.complex.Complex complex22 = complex6.subtract(complex21);
        org.apache.commons.math3.complex.Complex complex23 = complex22.cosh();
        double double24 = complex22.getReal();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 35.0d + "'", double18 == 35.0d);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.6426361944230566d + "'", double24 == 0.6426361944230566d);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
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
        org.apache.commons.math3.complex.ComplexField complexField11 = complex3.getField();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complexField5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complexField11);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
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
        org.apache.commons.math3.complex.Complex complex16 = complex7.multiply((double) '4');
        org.apache.commons.math3.complex.ComplexField complexField17 = complex7.getField();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complexField17);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tanh();
        org.apache.commons.math3.complex.Complex complex4 = complex3.log();
        org.apache.commons.math3.complex.Complex complex6 = complex3.multiply(10);
        double double7 = complex3.abs();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.7615941559557649d + "'", double7 == 0.7615941559557649d);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math3.complex.Complex complex4 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double5 = complex4.getImaginary();
        org.apache.commons.math3.complex.Complex complex7 = complex4.pow((double) 100L);
        org.apache.commons.math3.complex.Complex complex8 = complex2.pow(complex7);
        org.apache.commons.math3.complex.Complex complex9 = complex8.cosh();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex(1.557407724654902d);
        org.apache.commons.math3.complex.Complex complex2 = complex1.sqrt1z();
        org.apache.commons.math3.complex.ComplexField complexField3 = complex2.getField();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complexField3);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex6 = complex1.sqrt1z();
        org.apache.commons.math3.complex.Complex complex8 = complex6.pow((double) 1L);
        java.lang.String str9 = complex6.toString();
        double double10 = complex6.getImaginary();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(0.0, 0.0)" + "'", str9, "(0.0, 0.0)");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math3.complex.Complex complex3 = complex1.sqrt();
        double double4 = complex1.getReal();
        org.apache.commons.math3.complex.Complex complex5 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.valueOf(Double.NaN);
        org.apache.commons.math3.complex.Complex complex8 = complex7.reciprocal();
        org.apache.commons.math3.complex.Complex complex9 = complex5.add(complex7);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
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
        org.apache.commons.math3.complex.Complex complex23 = complex3.tan();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
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
        java.lang.String str19 = complex17.toString();
        org.apache.commons.math3.complex.Complex complex20 = complex17.atan();
        org.apache.commons.math3.complex.Complex complex21 = complex20.exp();
        boolean boolean22 = complex20.isNaN();
        org.apache.commons.math3.complex.Complex complex23 = complex20.cos();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "(1.0301193070208436, 0.0)" + "'", str19, "(1.0301193070208436, 0.0)");
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(complex23);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
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
        org.apache.commons.math3.complex.Complex complex22 = complex16.negate();
        org.apache.commons.math3.complex.Complex complex24 = complex16.subtract((-0.5430806348152437d));
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex24);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
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
        java.util.List<org.apache.commons.math3.complex.Complex> complexList20 = complex17.nthRoot((int) ' ');
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexList8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complexList20);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex4 = complex2.pow((double) (short) 10);
        org.apache.commons.math3.complex.Complex complex5 = complex2.cosh();
        org.apache.commons.math3.complex.Complex complex7 = complex5.multiply(0.0d);
        org.apache.commons.math3.complex.Complex complex8 = complex5.sqrt1z();
        double double9 = complex8.getReal();
        java.lang.Class<?> wildcardClass10 = complex8.getClass();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
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
        org.apache.commons.math3.complex.ComplexField complexField13 = complex11.getField();
        org.apache.commons.math3.complex.Complex complex15 = org.apache.commons.math3.complex.Complex.valueOf((double) '4');
        org.apache.commons.math3.complex.Complex complex16 = complex11.multiply(complex15);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList18 = complex16.nthRoot((int) (byte) 1);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexList8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complexField13);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complexList18);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex3.reciprocal();
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.valueOf(1.557407724654902d, 35.0d);
        org.apache.commons.math3.complex.Complex complex8 = complex3.divide(complex7);
        double double9 = complex3.getArgument();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-3.141592653589793d) + "'", double9 == (-3.141592653589793d));
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
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
        org.apache.commons.math3.complex.Complex complex17 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex18 = complex17.exp();
        double double19 = complex17.getArgument();
        org.apache.commons.math3.complex.Complex complex20 = complex17.log();
        org.apache.commons.math3.complex.Complex complex21 = complex17.log();
        org.apache.commons.math3.complex.Complex complex23 = complex21.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex24 = complex23.exp();
        org.apache.commons.math3.complex.Complex complex26 = complex23.subtract((double) 1);
        org.apache.commons.math3.complex.Complex complex28 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex29 = complex28.exp();
        org.apache.commons.math3.complex.Complex complex30 = complex28.tan();
        org.apache.commons.math3.complex.Complex complex31 = complex23.multiply(complex28);
        org.apache.commons.math3.complex.Complex complex32 = complex15.add(complex31);
        double double33 = complex32.getReal();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-2.0d) + "'", double33 == (-2.0d));
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
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
        org.apache.commons.math3.complex.Complex complex13 = complex12.asin();
        org.apache.commons.math3.complex.Complex complex14 = complex12.cosh();
        org.apache.commons.math3.complex.Complex complex15 = complex12.negate();
        org.apache.commons.math3.complex.Complex complex17 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex18 = complex17.sqrt();
        org.apache.commons.math3.complex.Complex complex19 = complex15.add(complex18);
        org.apache.commons.math3.complex.Complex complex21 = complex18.multiply(1.5430806348152437d);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex21);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.sinh();
        double double5 = complex1.getImaginary();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList7 = complex1.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex8 = complex1.sqrt();
        org.apache.commons.math3.complex.Complex complex9 = complex8.sinh();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(complexList7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((double) ' ', (double) 1L);
        org.apache.commons.math3.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math3.complex.Complex complex4 = complex2.sqrt1z();
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex7 = complex6.exp();
        double double8 = complex6.getArgument();
        org.apache.commons.math3.complex.Complex complex9 = complex6.log();
        org.apache.commons.math3.complex.Complex complex10 = complex6.log();
        org.apache.commons.math3.complex.Complex complex11 = complex6.sin();
        org.apache.commons.math3.complex.Complex complex12 = complex11.reciprocal();
        boolean boolean13 = complex4.equals((java.lang.Object) complex12);
        org.apache.commons.math3.complex.Complex complex14 = complex12.conjugate();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(complex14);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
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
        org.apache.commons.math3.complex.Complex complex13 = complex7.sin();
        org.apache.commons.math3.complex.Complex complex14 = complex13.log();
        org.apache.commons.math3.complex.Complex complex15 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex17 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex18 = complex17.exp();
        org.apache.commons.math3.complex.Complex complex19 = complex17.tan();
        org.apache.commons.math3.complex.Complex complex21 = complex17.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex23 = complex21.multiply(100);
        org.apache.commons.math3.complex.Complex complex24 = complex23.tanh();
        org.apache.commons.math3.complex.Complex complex25 = complex15.subtract(complex24);
        org.apache.commons.math3.complex.Complex complex26 = complex24.sqrt1z();
        org.apache.commons.math3.complex.Complex complex28 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex29 = complex28.exp();
        double double30 = complex28.getArgument();
        org.apache.commons.math3.complex.Complex complex32 = complex28.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex33 = complex28.exp();
        org.apache.commons.math3.complex.Complex complex34 = complex33.cosh();
        org.apache.commons.math3.complex.Complex complex35 = complex24.divide(complex34);
        org.apache.commons.math3.complex.Complex complex37 = complex35.add((double) (byte) 1);
        org.apache.commons.math3.complex.Complex complex38 = complex13.add(complex37);
        double double39 = complex38.getReal();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 2.1310198286702864d + "'", double39 == 2.1310198286702864d);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex(1.0133886021399945d);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
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
        double double26 = complex22.getImaginary();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complexList24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
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
        org.apache.commons.math3.complex.Complex complex14 = complex1.acos();
        org.apache.commons.math3.complex.Complex complex16 = complex1.multiply((double) (byte) 10);
        boolean boolean17 = complex16.isInfinite();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complexList13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex4.log();
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex8 = complex7.exp();
        double double9 = complex7.getArgument();
        org.apache.commons.math3.complex.Complex complex11 = complex7.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex12 = complex7.sin();
        org.apache.commons.math3.complex.Complex complex13 = complex7.cosh();
        org.apache.commons.math3.complex.Complex complex14 = complex7.tanh();
        org.apache.commons.math3.complex.Complex complex15 = complex7.log();
        org.apache.commons.math3.complex.Complex complex16 = complex5.multiply(complex7);
        org.apache.commons.math3.complex.Complex complex17 = complex16.sqrt();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex7 = complex3.subtract(complex6);
        org.apache.commons.math3.complex.Complex complex8 = complex3.asin();
        double double9 = complex3.abs();
        org.apache.commons.math3.complex.Complex complex10 = complex3.asin();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(complex10);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math3.complex.Complex complex3 = complex1.sqrt();
        org.apache.commons.math3.complex.Complex complex4 = complex3.cosh();
        org.apache.commons.math3.complex.Complex complex6 = complex3.add((double) ' ');
        org.apache.commons.math3.complex.Complex complex7 = complex6.exp();
        org.apache.commons.math3.complex.Complex complex8 = complex6.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList10 = complex8.nthRoot((int) (byte) 100);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complexList10);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf(3.141592653589793d);
        org.junit.Assert.assertNotNull(complex1);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) (short) -1, (double) '4');
        org.apache.commons.math3.complex.Complex complex3 = complex2.sinh();
        org.apache.commons.math3.complex.Complex complex5 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex6 = complex5.exp();
        double double7 = complex5.getArgument();
        org.apache.commons.math3.complex.Complex complex9 = complex5.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex10 = complex5.sin();
        org.apache.commons.math3.complex.Complex complex11 = complex5.cosh();
        org.apache.commons.math3.complex.Complex complex12 = complex5.sinh();
        boolean boolean13 = complex12.isInfinite();
        boolean boolean14 = complex2.equals((java.lang.Object) complex12);
        org.apache.commons.math3.complex.Complex complex16 = complex12.multiply((-3.141592653589793d));
        org.apache.commons.math3.complex.Complex complex18 = complex16.divide((-7.838977475816237E-15d));
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex18);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
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
        org.apache.commons.math3.complex.Complex complex33 = complex6.subtract((double) (-1L));
        org.apache.commons.math3.complex.Complex complex34 = complex33.exp();
        org.apache.commons.math3.complex.Complex complex35 = complex33.cos();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex6 = complex1.sqrt1z();
        boolean boolean7 = complex1.isNaN();
        org.apache.commons.math3.complex.Complex complex9 = complex1.subtract((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList11 = complex1.nthRoot((int) ' ');
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complexList11);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
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
        boolean boolean26 = complex25.isNaN();
        org.apache.commons.math3.complex.Complex complex28 = complex25.subtract(2.718281828459045d);
        double double29 = complex28.abs();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complexList24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 1.8696525848328958d + "'", double29 == 1.8696525848328958d);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex(0.0d, (double) (short) 100);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
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
        org.apache.commons.math3.complex.Complex complex26 = complex25.asin();
        org.apache.commons.math3.complex.Complex complex27 = complex26.conjugate();
        org.apache.commons.math3.complex.Complex complex28 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex29 = complex28.exp();
        org.apache.commons.math3.complex.Complex complex30 = complex29.exp();
        org.apache.commons.math3.complex.Complex complex32 = complex30.pow((double) (short) 10);
        double double33 = complex30.abs();
        org.apache.commons.math3.complex.Complex complex35 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex36 = complex35.sqrt();
        org.apache.commons.math3.complex.Complex complex37 = complex35.sqrt();
        org.apache.commons.math3.complex.Complex complex38 = complex37.cosh();
        org.apache.commons.math3.complex.Complex complex40 = complex37.add((double) ' ');
        org.apache.commons.math3.complex.Complex complex41 = complex30.divide(complex37);
        org.apache.commons.math3.complex.Complex complex42 = complex27.add(complex41);
        org.apache.commons.math3.complex.Complex complex43 = complex41.tanh();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complexList24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex43);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex6 = complex1.tanh();
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.valueOf((double) (-1.0f), (double) '#');
        double double10 = complex9.getImaginary();
        org.apache.commons.math3.complex.Complex complex12 = complex9.pow((double) (short) 1);
        org.apache.commons.math3.complex.Complex complex13 = complex6.divide(complex12);
        org.apache.commons.math3.complex.Complex complex15 = complex12.pow((double) 1.0f);
        double double16 = complex15.getReal();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.999999999999999d) + "'", double16 == (-0.999999999999999d));
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
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
        org.apache.commons.math3.complex.Complex complex22 = complex16.atan();
        org.apache.commons.math3.complex.Complex complex24 = complex22.multiply((int) (short) -1);
        org.apache.commons.math3.complex.Complex complex26 = complex24.multiply(0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex26);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf(0.5430806348152437d, 0.009999166724158364d);
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex3 = complex1.subtract((double) (-1));
        org.apache.commons.math3.complex.Complex complex5 = complex1.multiply((double) 10L);
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex8 = complex7.exp();
        org.apache.commons.math3.complex.Complex complex9 = complex7.tanh();
        org.apache.commons.math3.complex.Complex complex10 = complex9.log();
        org.apache.commons.math3.complex.Complex complex11 = complex9.acos();
        org.apache.commons.math3.complex.Complex complex12 = complex5.pow(complex11);
        org.apache.commons.math3.complex.Complex complex13 = complex12.exp();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
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
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexList8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex(0.6426361944230566d);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.sin();
        org.apache.commons.math3.complex.Complex complex8 = complex1.divide((double) (-1L));
        org.apache.commons.math3.complex.Complex complex9 = complex1.negate();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList11 = complex9.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex12 = complex9.conjugate();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complexList11);
        org.junit.Assert.assertNotNull(complex12);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.sin();
        org.apache.commons.math3.complex.Complex complex7 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex8 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex9 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex10 = complex9.reciprocal();
        org.apache.commons.math3.complex.Complex complex11 = complex10.tan();
        org.apache.commons.math3.complex.Complex complex12 = complex11.sin();
        double double13 = complex11.getImaginary();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-0.0d) + "'", double13 == (-0.0d));
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex7 = complex1.pow((double) 100.0f);
        org.apache.commons.math3.complex.Complex complex8 = complex7.sin();
        org.apache.commons.math3.complex.Complex complex9 = complex8.negate();
        org.apache.commons.math3.complex.Complex complex10 = complex9.sin();
        org.apache.commons.math3.complex.Complex complex11 = complex9.tanh();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.sinh();
        double double5 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex7 = complex1.subtract((double) (byte) 1);
        org.apache.commons.math3.complex.Complex complex8 = complex1.log();
        org.apache.commons.math3.complex.Complex complex10 = complex1.pow((double) (byte) 100);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
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
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertNotNull(complex53);
        org.junit.Assert.assertNotNull(complex54);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertNotNull(complex56);
        org.junit.Assert.assertNotNull(complex57);
        org.junit.Assert.assertNotNull(complex59);
        org.junit.Assert.assertNotNull(complex60);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
        org.junit.Assert.assertNotNull(complex62);
        org.junit.Assert.assertNotNull(complex63);
        org.junit.Assert.assertNotNull(complex64);
        org.junit.Assert.assertNotNull(complex66);
        org.junit.Assert.assertNotNull(complex67);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 0.0d + "'", double68 == 0.0d);
        org.junit.Assert.assertNotNull(complex70);
        org.junit.Assert.assertNotNull(complex71);
        org.junit.Assert.assertNotNull(complex72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(complex74);
        org.junit.Assert.assertNotNull(complex75);
        org.junit.Assert.assertNotNull(complex76);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex7 = complex3.subtract(complex6);
        org.apache.commons.math3.complex.Complex complex9 = complex3.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex10 = complex3.sin();
        org.apache.commons.math3.complex.Complex complex13 = org.apache.commons.math3.complex.Complex.valueOf((double) ' ', (double) 1L);
        org.apache.commons.math3.complex.Complex complex14 = complex10.add(complex13);
        org.apache.commons.math3.complex.Complex complex15 = complex10.asin();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
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
        org.apache.commons.math3.complex.Complex complex13 = complex7.sin();
        org.apache.commons.math3.complex.Complex complex14 = complex7.tan();
        boolean boolean15 = complex14.isNaN();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex1 = complex0.sqrt1z();
        double double2 = complex0.abs();
        org.apache.commons.math3.complex.Complex complex4 = complex0.pow(0.5403023058681398d);
        org.apache.commons.math3.complex.Complex complex6 = complex0.add(1.0d);
        org.apache.commons.math3.complex.Complex complex8 = complex0.subtract(Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
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
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
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
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexList8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
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
        org.apache.commons.math3.complex.Complex complex19 = complex18.tanh();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
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
        boolean boolean18 = complex16.isNaN();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.sin();
        org.apache.commons.math3.complex.Complex complex7 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex8 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex10 = complex1.multiply(1);
        boolean boolean11 = complex1.isNaN();
        org.apache.commons.math3.complex.Complex complex12 = complex1.cosh();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(complex12);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
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
        org.apache.commons.math3.complex.Complex complex24 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex25 = complex24.exp();
        double double26 = complex24.getArgument();
        org.apache.commons.math3.complex.Complex complex28 = complex24.pow((double) '#');
        double double29 = complex24.getReal();
        org.apache.commons.math3.complex.Complex complex30 = complex24.atan();
        org.apache.commons.math3.complex.Complex complex31 = complex24.sqrt1z();
        org.apache.commons.math3.complex.Complex complex33 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double34 = complex33.getImaginary();
        org.apache.commons.math3.complex.Complex complex35 = complex33.negate();
        org.apache.commons.math3.complex.Complex complex37 = complex35.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex38 = complex37.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList40 = complex37.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex42 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex43 = complex42.exp();
        org.apache.commons.math3.complex.Complex complex44 = complex42.tanh();
        org.apache.commons.math3.complex.Complex complex45 = complex37.subtract(complex42);
        org.apache.commons.math3.complex.Complex complex46 = complex37.asin();
        java.lang.String str47 = complex46.toString();
        org.apache.commons.math3.complex.Complex complex48 = complex46.cosh();
        org.apache.commons.math3.complex.Complex complex50 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double51 = complex50.getImaginary();
        org.apache.commons.math3.complex.Complex complex52 = complex50.negate();
        org.apache.commons.math3.complex.Complex complex54 = complex52.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex55 = complex54.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList57 = complex54.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex59 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex60 = complex59.exp();
        org.apache.commons.math3.complex.Complex complex61 = complex59.tanh();
        org.apache.commons.math3.complex.Complex complex62 = complex54.subtract(complex59);
        org.apache.commons.math3.complex.Complex complex63 = complex54.asin();
        org.apache.commons.math3.complex.Complex complex64 = complex48.pow(complex63);
        org.apache.commons.math3.complex.Complex complex65 = complex31.pow(complex48);
        org.apache.commons.math3.complex.Complex complex66 = complex48.tanh();
        org.apache.commons.math3.complex.Complex complex67 = complex11.divide(complex48);
        org.apache.commons.math3.complex.Complex complex68 = complex67.acos();
        org.apache.commons.math3.complex.Complex complex69 = complex68.cosh();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 1.0d + "'", double29 == 1.0d);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complexList40);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "(1.5707963267948966, -0.0)" + "'", str47, "(1.5707963267948966, -0.0)");
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertNotNull(complex54);
        org.junit.Assert.assertNotNull(complex55);
        org.junit.Assert.assertNotNull(complexList57);
        org.junit.Assert.assertNotNull(complex59);
        org.junit.Assert.assertNotNull(complex60);
        org.junit.Assert.assertNotNull(complex61);
        org.junit.Assert.assertNotNull(complex62);
        org.junit.Assert.assertNotNull(complex63);
        org.junit.Assert.assertNotNull(complex64);
        org.junit.Assert.assertNotNull(complex65);
        org.junit.Assert.assertNotNull(complex66);
        org.junit.Assert.assertNotNull(complex67);
        org.junit.Assert.assertNotNull(complex68);
        org.junit.Assert.assertNotNull(complex69);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((double) (short) 0, 1.5707963267948966d);
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex7 = complex1.acos();
        org.apache.commons.math3.complex.Complex complex9 = complex1.pow((double) 100L);
        org.apache.commons.math3.complex.Complex complex11 = complex1.multiply((double) (-1.0f));
        org.apache.commons.math3.complex.Complex complex12 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex14 = complex1.multiply((double) ' ');
        double double15 = complex1.abs();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 10.0f, (double) (short) -1);
        org.apache.commons.math3.complex.Complex complex3 = complex2.sinh();
        org.apache.commons.math3.complex.Complex complex4 = complex2.negate();
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double7 = complex6.getImaginary();
        org.apache.commons.math3.complex.Complex complex8 = complex6.negate();
        org.apache.commons.math3.complex.Complex complex10 = complex8.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex11 = complex10.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList13 = complex10.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex14 = complex10.negate();
        double double15 = complex14.getImaginary();
        boolean boolean16 = complex14.isInfinite();
        org.apache.commons.math3.complex.Complex complex18 = complex14.add(Double.NaN);
        org.apache.commons.math3.complex.Complex complex19 = complex4.divide(complex18);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complexList13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-0.0d) + "'", double15 == (-0.0d));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math3.complex.Complex complex3 = complex1.sqrt();
        double double4 = complex1.getImaginary();
        double double5 = complex1.getArgument();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
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
        java.lang.String str19 = complex17.toString();
        org.apache.commons.math3.complex.Complex complex20 = complex17.atan();
        org.apache.commons.math3.complex.Complex complex22 = complex17.multiply((int) (byte) -1);
        org.apache.commons.math3.complex.Complex complex23 = complex22.atan();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "(1.0301193070208436, 0.0)" + "'", str19, "(1.0301193070208436, 0.0)");
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
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
        java.lang.String str14 = complex5.toString();
        org.apache.commons.math3.complex.Complex complex16 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double17 = complex16.getImaginary();
        org.apache.commons.math3.complex.Complex complex18 = complex16.negate();
        org.apache.commons.math3.complex.Complex complex20 = complex18.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex21 = complex20.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList23 = complex20.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex24 = complex20.negate();
        boolean boolean25 = complex20.isInfinite();
        org.apache.commons.math3.complex.Complex complex26 = complex20.asin();
        org.apache.commons.math3.complex.Complex complex27 = complex26.atan();
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
        org.apache.commons.math3.complex.Complex complex41 = complex35.atan();
        org.apache.commons.math3.complex.Complex complex42 = complex26.subtract(complex35);
        org.apache.commons.math3.complex.Complex complex43 = complex26.tanh();
        org.apache.commons.math3.complex.Complex complex44 = complex5.subtract(complex43);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexList8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "(1.0, 0.0)" + "'", str14, "(1.0, 0.0)");
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complexList23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex44);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math3.complex.Complex complex3 = complex1.sqrt();
        org.apache.commons.math3.complex.Complex complex4 = complex3.cosh();
        org.apache.commons.math3.complex.Complex complex6 = complex3.add((double) ' ');
        org.apache.commons.math3.complex.Complex complex7 = complex3.tan();
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex10 = complex9.exp();
        double double11 = complex9.getArgument();
        org.apache.commons.math3.complex.Complex complex12 = complex9.log();
        org.apache.commons.math3.complex.Complex complex13 = complex12.log();
        org.apache.commons.math3.complex.Complex complex15 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex16 = complex15.exp();
        double double17 = complex15.getArgument();
        org.apache.commons.math3.complex.Complex complex19 = complex15.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex20 = complex15.sin();
        org.apache.commons.math3.complex.Complex complex21 = complex15.cosh();
        org.apache.commons.math3.complex.Complex complex22 = complex15.tanh();
        org.apache.commons.math3.complex.Complex complex23 = complex15.log();
        org.apache.commons.math3.complex.Complex complex24 = complex13.multiply(complex15);
        org.apache.commons.math3.complex.Complex complex25 = complex24.negate();
        org.apache.commons.math3.complex.Complex complex26 = complex7.divide(complex25);
        boolean boolean27 = complex7.isInfinite();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
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
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complexList13);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complexList43);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertNotNull(complexField51);
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertNotNull(complex53);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex(1.2422079676186446d, (double) (short) -1);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex7 = complex6.cosh();
        org.apache.commons.math3.complex.Complex complex8 = complex7.exp();
        org.apache.commons.math3.complex.Complex complex10 = complex7.multiply(0.6426361944230566d);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math3.complex.Complex complex4 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double5 = complex4.getImaginary();
        org.apache.commons.math3.complex.Complex complex7 = complex4.pow((double) 100L);
        org.apache.commons.math3.complex.Complex complex8 = complex2.pow(complex7);
        org.apache.commons.math3.complex.Complex complex9 = complex8.cos();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex(0.705026843555238d);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex(52.0d, 2.8014000414552136d);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf(35.0d, (double) 'a');
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex7 = complex3.subtract(complex6);
        org.apache.commons.math3.complex.Complex complex8 = complex3.acos();
        org.apache.commons.math3.complex.Complex complex9 = complex3.log();
        org.apache.commons.math3.complex.Complex complex10 = complex3.sqrt1z();
        double double11 = complex10.getArgument();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.sin();
        org.apache.commons.math3.complex.Complex complex7 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex8 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex9 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex11 = complex1.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex12 = complex1.reciprocal();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
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
        boolean boolean33 = complex32.isNaN();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
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
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
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
        java.lang.String str16 = complex14.toString();
        org.apache.commons.math3.complex.Complex complex17 = complex14.sqrt1z();
        org.apache.commons.math3.complex.Complex complex18 = complex17.cosh();
        org.apache.commons.math3.complex.Complex complex20 = complex18.subtract(1.8696525848328958d);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "(0.5403023058681398, -0.0)" + "'", str16, "(0.5403023058681398, -0.0)");
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex20);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex3 = complex2.exp();
        org.apache.commons.math3.complex.Complex complex4 = complex2.tan();
        org.apache.commons.math3.complex.Complex complex6 = complex2.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex8 = complex6.multiply(100);
        org.apache.commons.math3.complex.Complex complex9 = complex8.tanh();
        org.apache.commons.math3.complex.Complex complex10 = complex0.subtract(complex9);
        org.apache.commons.math3.complex.Complex complex11 = complex9.sqrt1z();
        org.apache.commons.math3.complex.Complex complex13 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex14 = complex13.exp();
        double double15 = complex13.getArgument();
        org.apache.commons.math3.complex.Complex complex17 = complex13.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex18 = complex13.exp();
        org.apache.commons.math3.complex.Complex complex19 = complex18.cosh();
        org.apache.commons.math3.complex.Complex complex20 = complex9.divide(complex19);
        org.apache.commons.math3.complex.Complex complex21 = complex19.cos();
        org.apache.commons.math3.complex.Complex complex22 = complex19.sinh();
        org.apache.commons.math3.complex.Complex complex23 = complex22.exp();
        java.lang.Class<?> wildcardClass24 = complex22.getClass();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
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
        org.apache.commons.math3.complex.Complex complex46 = complex45.sinh();
        org.apache.commons.math3.complex.Complex complex48 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex49 = complex48.exp();
        double double50 = complex48.getArgument();
        org.apache.commons.math3.complex.Complex complex52 = complex48.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex53 = complex45.divide(complex52);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complexList13);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complexList43);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertNotNull(complex53);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
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
        org.apache.commons.math3.complex.ComplexField complexField14 = complex5.getField();
        org.apache.commons.math3.complex.Complex complex16 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex17 = complex16.exp();
        double double18 = complex16.getArgument();
        org.apache.commons.math3.complex.Complex complex20 = complex16.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex21 = complex16.sin();
        org.apache.commons.math3.complex.Complex complex22 = complex16.cosh();
        org.apache.commons.math3.complex.Complex complex23 = complex16.tan();
        org.apache.commons.math3.complex.Complex complex25 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex26 = complex25.exp();
        double double27 = complex25.getArgument();
        org.apache.commons.math3.complex.Complex complex29 = complex25.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex30 = complex25.tanh();
        org.apache.commons.math3.complex.Complex complex32 = complex30.multiply((int) (short) 100);
        java.lang.String str33 = complex30.toString();
        org.apache.commons.math3.complex.Complex complex34 = complex16.add(complex30);
        org.apache.commons.math3.complex.Complex complex35 = complex5.divide(complex16);
        org.apache.commons.math3.complex.Complex complex37 = complex35.subtract((double) (byte) 1);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexList8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complexField14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "(0.7615941559557649, 0.0)" + "'", str33, "(0.7615941559557649, 0.0)");
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex37);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
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
        org.apache.commons.math3.complex.Complex complex19 = complex15.acos();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexList8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-0.0d) + "'", double17 == (-0.0d));
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex5 = complex1.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex6 = complex1.cos();
        org.apache.commons.math3.complex.Complex complex7 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex9 = complex1.pow(0.0d);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.sin();
        org.apache.commons.math3.complex.Complex complex7 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex8 = complex1.tanh();
        org.apache.commons.math3.complex.Complex complex10 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex11 = complex10.exp();
        double double12 = complex10.getArgument();
        org.apache.commons.math3.complex.Complex complex13 = complex10.log();
        org.apache.commons.math3.complex.Complex complex14 = complex13.log();
        org.apache.commons.math3.complex.Complex complex16 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex17 = complex16.exp();
        double double18 = complex16.getArgument();
        org.apache.commons.math3.complex.Complex complex20 = complex16.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex21 = complex16.sin();
        org.apache.commons.math3.complex.Complex complex22 = complex16.cosh();
        org.apache.commons.math3.complex.Complex complex23 = complex16.tanh();
        org.apache.commons.math3.complex.Complex complex24 = complex16.log();
        org.apache.commons.math3.complex.Complex complex25 = complex14.multiply(complex16);
        boolean boolean26 = complex1.equals((java.lang.Object) complex25);
        org.apache.commons.math3.complex.Complex complex28 = complex25.subtract((-0.8414709848078965d));
        org.apache.commons.math3.complex.Complex complex29 = complex28.exp();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
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
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertNotNull(complex18);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex7 = complex3.subtract(complex6);
        org.apache.commons.math3.complex.Complex complex8 = complex3.asin();
        org.apache.commons.math3.complex.Complex complex10 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex11 = complex10.exp();
        double double12 = complex10.getArgument();
        org.apache.commons.math3.complex.Complex complex14 = complex10.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex15 = complex10.tanh();
        org.apache.commons.math3.complex.Complex complex16 = complex8.divide(complex15);
        org.apache.commons.math3.complex.Complex complex17 = complex8.sqrt();
        org.apache.commons.math3.complex.Complex complex18 = complex17.sinh();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math3.complex.Complex complex3 = complex1.sqrt();
        org.apache.commons.math3.complex.Complex complex4 = complex3.cosh();
        org.apache.commons.math3.complex.Complex complex5 = complex4.exp();
        double double6 = complex4.getImaginary();
        org.apache.commons.math3.complex.Complex complex7 = complex4.exp();
        boolean boolean8 = complex4.isInfinite();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((double) 0, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.subtract(34.64159668870139d);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList6 = complex4.nthRoot(1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complexList6);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tanh();
        org.apache.commons.math3.complex.Complex complex4 = complex3.log();
        org.apache.commons.math3.complex.Complex complex5 = complex3.acos();
        org.apache.commons.math3.complex.Complex complex6 = complex3.tanh();
        boolean boolean7 = complex6.isNaN();
        org.apache.commons.math3.complex.Complex complex8 = complex6.log();
        org.apache.commons.math3.complex.Complex complex9 = complex6.sin();
        org.apache.commons.math3.complex.Complex complex10 = complex9.log();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex2.conjugate();
        org.apache.commons.math3.complex.Complex complex6 = new org.apache.commons.math3.complex.Complex((double) 10.0f, (double) (short) -1);
        org.apache.commons.math3.complex.Complex complex7 = complex6.cosh();
        org.apache.commons.math3.complex.Complex complex8 = complex3.pow(complex7);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
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
        org.apache.commons.math3.complex.Complex complex16 = complex14.negate();
        org.apache.commons.math3.complex.Complex complex18 = complex16.multiply((int) (short) 0);
        org.apache.commons.math3.complex.Complex complex19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.complex.Complex complex20 = complex18.pow(complex19);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexList8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "(1.5707963267948966, -0.0)" + "'", str15, "(1.5707963267948966, -0.0)");
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex18);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
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
        org.apache.commons.math3.complex.Complex complex16 = complex7.multiply((double) '4');
        org.apache.commons.math3.complex.Complex complex17 = complex7.tan();
        org.apache.commons.math3.complex.Complex complex18 = complex7.log();
        org.apache.commons.math3.complex.Complex complex19 = complex7.atan();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf(0.0d, (double) (byte) -1);
        org.apache.commons.math3.complex.Complex complex3 = complex2.sinh();
        double double4 = complex2.getReal();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex5 = complex1.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex6 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex8 = complex6.multiply(1);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
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
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexList8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex19);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
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
        boolean boolean23 = complex7.isInfinite();
        org.apache.commons.math3.complex.Complex complex25 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex27 = complex25.subtract((double) (-1));
        org.apache.commons.math3.complex.Complex complex29 = complex25.multiply((double) 10L);
        org.apache.commons.math3.complex.Complex complex31 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex32 = complex31.exp();
        org.apache.commons.math3.complex.Complex complex33 = complex31.tanh();
        org.apache.commons.math3.complex.Complex complex34 = complex33.log();
        org.apache.commons.math3.complex.Complex complex35 = complex33.acos();
        org.apache.commons.math3.complex.Complex complex36 = complex29.pow(complex35);
        org.apache.commons.math3.complex.Complex complex37 = complex35.sqrt();
        org.apache.commons.math3.complex.Complex complex39 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double40 = complex39.getImaginary();
        org.apache.commons.math3.complex.Complex complex41 = complex39.negate();
        org.apache.commons.math3.complex.Complex complex43 = complex41.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex45 = complex41.pow((double) 100L);
        org.apache.commons.math3.complex.Complex complex46 = complex45.sqrt();
        org.apache.commons.math3.complex.Complex complex47 = complex37.add(complex46);
        org.apache.commons.math3.complex.Complex complex48 = complex7.subtract(complex37);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex48);
    }
}

