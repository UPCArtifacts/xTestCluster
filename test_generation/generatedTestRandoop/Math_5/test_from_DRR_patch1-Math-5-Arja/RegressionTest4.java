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
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex7 = complex3.subtract(complex6);
        boolean boolean8 = complex3.isNaN();
        org.apache.commons.math3.complex.Complex complex10 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex12 = complex10.subtract((double) (-1));
        org.apache.commons.math3.complex.Complex complex14 = complex10.multiply((double) 10L);
        org.apache.commons.math3.complex.Complex complex16 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex17 = complex16.exp();
        org.apache.commons.math3.complex.Complex complex18 = complex16.tanh();
        org.apache.commons.math3.complex.Complex complex19 = complex18.log();
        org.apache.commons.math3.complex.Complex complex20 = complex18.acos();
        org.apache.commons.math3.complex.Complex complex21 = complex14.pow(complex20);
        boolean boolean22 = complex3.equals((java.lang.Object) complex20);
        boolean boolean23 = complex20.isNaN();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
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
        org.apache.commons.math3.complex.Complex complex42 = complex33.cos();
        org.apache.commons.math3.complex.Complex complex43 = complex42.tan();
        org.apache.commons.math3.complex.Complex complex44 = complex43.sinh();
        org.apache.commons.math3.complex.Complex complex45 = complex27.pow(complex44);
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
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf(0.9126365759632116d, (double) 100L);
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
        org.apache.commons.math3.complex.Complex complex19 = complex17.cosh();
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
        org.apache.commons.math3.complex.Complex complex35 = complex19.pow(complex34);
        org.apache.commons.math3.complex.Complex complex36 = complex19.sqrt1z();
        org.apache.commons.math3.complex.Complex complex37 = complex2.subtract(complex36);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complexList11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "(1.5707963267948966, -0.0)" + "'", str18, "(1.5707963267948966, -0.0)");
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complexList28);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
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
        org.apache.commons.math3.complex.Complex complex38 = complex36.exp();
        org.apache.commons.math3.complex.Complex complex39 = complex36.sqrt1z();
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
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
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
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex6 = complex1.tanh();
        boolean boolean7 = complex1.isInfinite();
        double double8 = complex1.getReal();
        org.apache.commons.math3.complex.Complex complex9 = complex1.sin();
        org.apache.commons.math3.complex.Complex complex11 = complex9.multiply(0.7615941559557649d);
        org.apache.commons.math3.complex.Complex complex13 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex14 = complex13.sqrt();
        org.apache.commons.math3.complex.Complex complex15 = complex13.sqrt();
        org.apache.commons.math3.complex.Complex complex16 = complex15.cosh();
        org.apache.commons.math3.complex.Complex complex18 = complex15.add((double) ' ');
        org.apache.commons.math3.complex.Complex complex19 = complex18.exp();
        org.apache.commons.math3.complex.Complex complex21 = complex19.multiply(0);
        org.apache.commons.math3.complex.Complex complex22 = complex21.reciprocal();
        org.apache.commons.math3.complex.Complex complex23 = complex9.pow(complex22);
        double double24 = complex22.abs();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + Double.POSITIVE_INFINITY + "'", double24 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
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
        org.apache.commons.math3.complex.Complex complex19 = complex17.exp();
        org.apache.commons.math3.complex.Complex complex21 = complex19.subtract(Double.POSITIVE_INFINITY);
        org.apache.commons.math3.complex.Complex complex22 = complex21.atan();
        org.apache.commons.math3.complex.Complex complex23 = complex21.tan();
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
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex(6.610125138662287d);
        org.apache.commons.math3.complex.Complex complex3 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex3.exp();
        double double5 = complex3.getArgument();
        org.apache.commons.math3.complex.Complex complex7 = complex3.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex8 = complex3.sin();
        org.apache.commons.math3.complex.Complex complex9 = complex3.cosh();
        org.apache.commons.math3.complex.Complex complex10 = complex3.tan();
        org.apache.commons.math3.complex.Complex complex11 = complex3.tan();
        org.apache.commons.math3.complex.Complex complex12 = complex11.reciprocal();
        org.apache.commons.math3.complex.Complex complex14 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double15 = complex14.getImaginary();
        org.apache.commons.math3.complex.Complex complex16 = complex14.negate();
        org.apache.commons.math3.complex.Complex complex18 = complex16.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex19 = complex18.atan();
        org.apache.commons.math3.complex.Complex complex20 = complex18.cosh();
        org.apache.commons.math3.complex.Complex complex21 = complex11.multiply(complex18);
        org.apache.commons.math3.complex.Complex complex23 = complex18.pow(35.0d);
        org.apache.commons.math3.complex.Complex complex24 = complex18.tan();
        org.apache.commons.math3.complex.Complex complex25 = complex24.tanh();
        org.apache.commons.math3.complex.Complex complex26 = complex1.add(complex25);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
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
        double double68 = complex11.abs();
        double double69 = complex11.getReal();
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
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 1.0d + "'", double68 == 1.0d);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 1.0d + "'", double69 == 1.0d);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex6 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex7 = complex1.exp();
        double double8 = complex7.getReal();
        org.apache.commons.math3.complex.Complex complex10 = complex7.divide((double) 0);
        org.apache.commons.math3.complex.Complex complex11 = complex10.asin();
        org.apache.commons.math3.complex.Complex complex13 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double14 = complex13.getImaginary();
        org.apache.commons.math3.complex.Complex complex15 = complex13.negate();
        org.apache.commons.math3.complex.Complex complex17 = complex15.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex18 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex19 = complex15.subtract(complex18);
        org.apache.commons.math3.complex.Complex complex20 = complex15.acos();
        org.apache.commons.math3.complex.Complex complex21 = complex15.negate();
        org.apache.commons.math3.complex.Complex complex22 = complex21.atan();
        boolean boolean23 = complex10.equals((java.lang.Object) complex21);
        org.apache.commons.math3.complex.Complex complex25 = complex10.add(1.0000499987495628d);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.718281828459045d + "'", double8 == 2.718281828459045d);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(complex25);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex7 = complex5.divide((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex8 = complex7.cosh();
        org.apache.commons.math3.complex.Complex complex9 = complex7.tanh();
        org.apache.commons.math3.complex.Complex complex11 = complex9.subtract(0.4211080131525584d);
        java.lang.String str12 = complex9.toString();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(NaN, NaN)" + "'", str12, "(NaN, NaN)");
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
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
        java.lang.String str26 = complex25.toString();
        org.apache.commons.math3.complex.Complex complex27 = complex25.reciprocal();
        org.apache.commons.math3.complex.Complex complex29 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex30 = complex29.exp();
        org.apache.commons.math3.complex.Complex complex31 = complex29.tanh();
        org.apache.commons.math3.complex.Complex complex32 = complex31.log();
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
        org.apache.commons.math3.complex.Complex complex48 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex49 = complex48.exp();
        double double50 = complex48.getArgument();
        org.apache.commons.math3.complex.Complex complex52 = complex48.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex53 = complex48.sin();
        org.apache.commons.math3.complex.Complex complex54 = complex48.cosh();
        org.apache.commons.math3.complex.Complex complex55 = complex48.tan();
        org.apache.commons.math3.complex.Complex complex56 = complex48.tan();
        org.apache.commons.math3.complex.Complex complex58 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex59 = complex58.exp();
        double double60 = complex58.getArgument();
        org.apache.commons.math3.complex.Complex complex62 = complex58.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex63 = complex58.sin();
        org.apache.commons.math3.complex.Complex complex64 = complex58.cosh();
        org.apache.commons.math3.complex.Complex complex65 = complex58.tan();
        org.apache.commons.math3.complex.Complex complex66 = complex58.tan();
        org.apache.commons.math3.complex.Complex complex68 = complex58.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex69 = complex56.subtract(complex58);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList71 = complex69.nthRoot((int) '4');
        org.apache.commons.math3.complex.Complex complex72 = complex43.subtract(complex69);
        org.apache.commons.math3.complex.Complex complex73 = complex31.divide(complex72);
        org.apache.commons.math3.complex.Complex complex74 = complex73.sinh();
        org.apache.commons.math3.complex.Complex complex76 = complex73.add(1.5430806348152437d);
        org.apache.commons.math3.complex.Complex complex77 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex78 = complex77.sqrt1z();
        double double79 = complex77.abs();
        boolean boolean80 = complex73.equals((java.lang.Object) double79);
        org.apache.commons.math3.complex.Complex complex81 = complex73.acos();
        org.apache.commons.math3.complex.Complex complex82 = complex27.pow(complex73);
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "(0.8486292436261492, -0.0)" + "'", str26, "(0.8486292436261492, -0.0)");
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complexList41);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertNotNull(complex53);
        org.junit.Assert.assertNotNull(complex54);
        org.junit.Assert.assertNotNull(complex55);
        org.junit.Assert.assertNotNull(complex56);
        org.junit.Assert.assertNotNull(complex58);
        org.junit.Assert.assertNotNull(complex59);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertNotNull(complex62);
        org.junit.Assert.assertNotNull(complex63);
        org.junit.Assert.assertNotNull(complex64);
        org.junit.Assert.assertNotNull(complex65);
        org.junit.Assert.assertNotNull(complex66);
        org.junit.Assert.assertNotNull(complex68);
        org.junit.Assert.assertNotNull(complex69);
        org.junit.Assert.assertNotNull(complexList71);
        org.junit.Assert.assertNotNull(complex72);
        org.junit.Assert.assertNotNull(complex73);
        org.junit.Assert.assertNotNull(complex74);
        org.junit.Assert.assertNotNull(complex76);
        org.junit.Assert.assertNotNull(complex77);
        org.junit.Assert.assertNotNull(complex78);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 0.0d + "'", double79 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(complex81);
        org.junit.Assert.assertNotNull(complex82);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
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
        org.apache.commons.math3.complex.Complex complex33 = complex32.conjugate();
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
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
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
        org.apache.commons.math3.complex.Complex complex20 = complex16.cos();
        org.apache.commons.math3.complex.Complex complex22 = complex16.multiply((int) (byte) 0);
        org.apache.commons.math3.complex.Complex complex24 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex25 = complex24.exp();
        org.apache.commons.math3.complex.Complex complex26 = complex24.tanh();
        org.apache.commons.math3.complex.Complex complex27 = complex26.log();
        org.apache.commons.math3.complex.Complex complex28 = complex26.acos();
        org.apache.commons.math3.complex.Complex complex29 = complex28.reciprocal();
        org.apache.commons.math3.complex.Complex complex30 = complex28.exp();
        org.apache.commons.math3.complex.Complex complex31 = complex22.divide(complex28);
        org.apache.commons.math3.complex.Complex complex32 = complex28.cos();
        org.apache.commons.math3.complex.Complex complex33 = complex32.tanh();
        org.apache.commons.math3.complex.Complex complex34 = complex32.log();
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
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex7 = complex3.subtract(complex6);
        org.apache.commons.math3.complex.Complex complex8 = complex3.acos();
        org.apache.commons.math3.complex.Complex complex9 = complex3.log();
        org.apache.commons.math3.complex.Complex complex10 = complex3.negate();
        org.apache.commons.math3.complex.Complex complex11 = complex10.sinh();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf(0.0d, (double) (byte) -1);
        org.apache.commons.math3.complex.Complex complex3 = complex2.sinh();
        org.apache.commons.math3.complex.Complex complex5 = new org.apache.commons.math3.complex.Complex(10.0d);
        org.apache.commons.math3.complex.Complex complex7 = complex5.divide((double) 'a');
        org.apache.commons.math3.complex.Complex complex8 = complex3.divide(complex5);
        org.apache.commons.math3.complex.Complex complex9 = complex5.sqrt1z();
        org.apache.commons.math3.complex.Complex complex11 = complex9.subtract(76.15941559557649d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex3 = complex1.subtract((double) (-1));
        org.apache.commons.math3.complex.Complex complex4 = complex3.tanh();
        boolean boolean5 = complex4.isNaN();
        org.apache.commons.math3.complex.Complex complex6 = complex4.conjugate();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(complex6);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
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
        org.apache.commons.math3.complex.Complex complex21 = complex8.asin();
        org.apache.commons.math3.complex.Complex complex23 = complex21.divide(33.0d);
        org.apache.commons.math3.complex.Complex complex24 = complex21.log();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex7 = complex1.pow((double) 100.0f);
        org.apache.commons.math3.complex.Complex complex8 = complex7.sin();
        org.apache.commons.math3.complex.Complex complex9 = complex7.conjugate();
        org.apache.commons.math3.complex.Complex complex10 = complex9.tanh();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex7 = complex1.pow((double) 100.0f);
        org.apache.commons.math3.complex.Complex complex8 = complex7.sin();
        org.apache.commons.math3.complex.Complex complex10 = complex8.subtract((double) 1);
        org.apache.commons.math3.complex.Complex complex12 = complex10.multiply(0.0d);
        double double13 = complex10.getReal();
        org.apache.commons.math3.complex.Complex complex15 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex16 = complex15.exp();
        double double17 = complex15.getArgument();
        org.apache.commons.math3.complex.Complex complex19 = complex15.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex21 = complex19.divide((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex22 = complex21.cosh();
        org.apache.commons.math3.complex.Complex complex23 = complex22.asin();
        org.apache.commons.math3.complex.Complex complex24 = complex10.multiply(complex23);
        org.apache.commons.math3.complex.Complex complex26 = new org.apache.commons.math3.complex.Complex((double) (-1));
        org.apache.commons.math3.complex.Complex complex27 = complex26.log();
        org.apache.commons.math3.complex.Complex complex29 = complex27.divide(1.557407724654902d);
        org.apache.commons.math3.complex.Complex complex30 = complex24.subtract(complex27);
        double double31 = complex24.getImaginary();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-0.1585290151921035d) + "'", double13 == (-0.1585290151921035d));
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 10, (double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex3 = complex2.asin();
        org.apache.commons.math3.complex.Complex complex4 = complex2.atan();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex5 = complex1.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex6 = complex1.cos();
        boolean boolean7 = complex1.isNaN();
        boolean boolean8 = complex1.isInfinite();
        org.apache.commons.math3.complex.Complex complex9 = complex1.conjugate();
        org.apache.commons.math3.complex.Complex complex11 = complex9.add(0.9126365759632116d);
        org.apache.commons.math3.complex.Complex complex13 = complex9.subtract((-1.2678765960623164d));
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf(34.0d, (double) (short) -1);
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex4 = complex2.pow((double) (short) 10);
        org.apache.commons.math3.complex.Complex complex5 = complex2.cosh();
        org.apache.commons.math3.complex.Complex complex7 = complex5.multiply(0.0d);
        org.apache.commons.math3.complex.Complex complex9 = complex5.multiply((double) '#');
        org.apache.commons.math3.complex.Complex complex10 = complex5.sinh();
        org.apache.commons.math3.complex.Complex complex11 = complex10.cosh();
        org.apache.commons.math3.complex.Complex complex12 = complex10.sinh();
        org.apache.commons.math3.complex.Complex complex14 = complex10.multiply((int) (short) 100);
        boolean boolean15 = complex14.isNaN();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
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
        org.apache.commons.math3.complex.Complex complex16 = complex14.cosh();
        org.apache.commons.math3.complex.Complex complex17 = complex16.acos();
        double double18 = complex16.getImaginary();
        org.apache.commons.math3.complex.Complex complex21 = org.apache.commons.math3.complex.Complex.valueOf((double) ' ', (double) 1L);
        org.apache.commons.math3.complex.Complex complex22 = complex21.tan();
        org.apache.commons.math3.complex.Complex complex23 = complex21.sqrt1z();
        boolean boolean24 = complex16.equals((java.lang.Object) complex21);
        org.apache.commons.math3.complex.Complex complex25 = complex16.conjugate();
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
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.0d) + "'", double18 == (-0.0d));
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(complex25);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex7 = complex5.divide((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex9 = complex7.multiply(0);
        org.apache.commons.math3.complex.Complex complex12 = org.apache.commons.math3.complex.Complex.valueOf((double) (-1.0f), 1.5707963267948966d);
        org.apache.commons.math3.complex.Complex complex13 = complex9.multiply(complex12);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 0.0f, (double) 10.0f);
        org.apache.commons.math3.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math3.complex.Complex complex5 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex6 = complex5.exp();
        double double7 = complex5.getArgument();
        org.apache.commons.math3.complex.Complex complex8 = complex5.log();
        org.apache.commons.math3.complex.Complex complex9 = complex5.log();
        org.apache.commons.math3.complex.Complex complex11 = complex9.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex13 = complex9.pow((double) 1.0f);
        org.apache.commons.math3.complex.Complex complex14 = complex3.pow(complex9);
        org.apache.commons.math3.complex.Complex complex15 = complex14.tanh();
        org.apache.commons.math3.complex.Complex complex17 = complex14.pow(2.718281828459045d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex17);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
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
        org.apache.commons.math3.complex.Complex complex47 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex49 = complex47.subtract((double) (-1));
        org.apache.commons.math3.complex.Complex complex51 = complex47.multiply((double) 10L);
        boolean boolean52 = complex45.equals((java.lang.Object) complex47);
        org.apache.commons.math3.complex.Complex complex54 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex55 = complex54.exp();
        double double56 = complex54.getArgument();
        org.apache.commons.math3.complex.Complex complex57 = complex54.log();
        org.apache.commons.math3.complex.Complex complex58 = complex57.log();
        org.apache.commons.math3.complex.Complex complex60 = complex57.add(1.0d);
        double double61 = complex57.getImaginary();
        org.apache.commons.math3.complex.Complex complex62 = complex45.multiply(complex57);
        org.apache.commons.math3.complex.Complex complex63 = complex45.reciprocal();
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
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(complex54);
        org.junit.Assert.assertNotNull(complex55);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
        org.junit.Assert.assertNotNull(complex57);
        org.junit.Assert.assertNotNull(complex58);
        org.junit.Assert.assertNotNull(complex60);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
        org.junit.Assert.assertNotNull(complex62);
        org.junit.Assert.assertNotNull(complex63);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex4 = complex2.pow((double) (short) 10);
        org.apache.commons.math3.complex.Complex complex5 = complex2.cosh();
        org.apache.commons.math3.complex.Complex complex6 = complex5.acos();
        java.lang.Class<?> wildcardClass7 = complex6.getClass();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex5.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex9 = complex5.negate();
        boolean boolean10 = complex5.isInfinite();
        org.apache.commons.math3.complex.Complex complex12 = complex5.subtract((double) 1);
        org.apache.commons.math3.complex.Complex complex13 = complex12.sqrt();
        org.apache.commons.math3.complex.Complex complex14 = complex12.negate();
        org.apache.commons.math3.complex.Complex complex15 = complex14.sinh();
        org.apache.commons.math3.complex.Complex complex16 = complex14.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList18 = complex16.nthRoot(10);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexList8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complexList18);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
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
        double double23 = complex22.getImaginary();
        org.apache.commons.math3.complex.Complex complex24 = complex22.negate();
        org.apache.commons.math3.complex.Complex complex26 = complex24.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex27 = complex26.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList29 = complex26.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex30 = complex26.negate();
        boolean boolean31 = complex26.isInfinite();
        org.apache.commons.math3.complex.Complex complex32 = complex19.add(complex26);
        org.apache.commons.math3.complex.Complex complex33 = complex26.exp();
        org.apache.commons.math3.complex.Complex complex35 = complex33.multiply(1);
        org.apache.commons.math3.complex.Complex complex36 = complex33.atan();
        org.apache.commons.math3.complex.Complex complex38 = complex36.pow((double) 10L);
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
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complexList29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex38);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex5.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex9 = complex5.negate();
        boolean boolean10 = complex5.isInfinite();
        org.apache.commons.math3.complex.Complex complex12 = complex5.subtract((double) 1);
        org.apache.commons.math3.complex.Complex complex13 = complex12.sqrt();
        org.apache.commons.math3.complex.Complex complex14 = complex12.negate();
        org.apache.commons.math3.complex.Complex complex15 = complex14.sinh();
        org.apache.commons.math3.complex.Complex complex17 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex18 = complex17.exp();
        double double19 = complex17.getArgument();
        org.apache.commons.math3.complex.Complex complex21 = complex17.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex22 = complex17.tanh();
        org.apache.commons.math3.complex.Complex complex25 = org.apache.commons.math3.complex.Complex.valueOf((double) (-1.0f), (double) '#');
        double double26 = complex25.getImaginary();
        org.apache.commons.math3.complex.Complex complex28 = complex25.pow((double) (short) 1);
        org.apache.commons.math3.complex.Complex complex29 = complex22.divide(complex28);
        org.apache.commons.math3.complex.Complex complex30 = complex15.multiply(complex29);
        org.apache.commons.math3.complex.Complex complex31 = org.apache.commons.math3.complex.Complex.NaN;
        org.apache.commons.math3.complex.Complex complex32 = complex15.subtract(complex31);
        org.apache.commons.math3.complex.Complex complex34 = complex31.multiply(0.010000333346667207d);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexList8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 35.0d + "'", double26 == 35.0d);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex34);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex7 = complex1.pow((double) 100.0f);
        org.apache.commons.math3.complex.Complex complex8 = complex7.sin();
        org.apache.commons.math3.complex.Complex complex10 = complex8.subtract((double) 1);
        org.apache.commons.math3.complex.Complex complex12 = complex10.multiply(0.0d);
        org.apache.commons.math3.complex.Complex complex13 = complex10.sin();
        org.apache.commons.math3.complex.Complex complex14 = complex10.asin();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList16 = complex14.nthRoot((int) (byte) 1);
        org.apache.commons.math3.complex.Complex complex18 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex19 = complex18.exp();
        org.apache.commons.math3.complex.Complex complex20 = complex18.tanh();
        org.apache.commons.math3.complex.Complex complex21 = complex20.log();
        org.apache.commons.math3.complex.Complex complex22 = complex20.acos();
        org.apache.commons.math3.complex.Complex complex23 = complex22.reciprocal();
        org.apache.commons.math3.complex.Complex complex24 = complex22.exp();
        org.apache.commons.math3.complex.Complex complex25 = complex24.cosh();
        org.apache.commons.math3.complex.Complex complex26 = complex14.divide(complex24);
        org.apache.commons.math3.complex.Complex complex28 = complex24.divide((double) 10.0f);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complexList16);
        org.junit.Assert.assertNotNull(complex18);
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
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
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
        boolean boolean14 = complex13.isInfinite();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex5 = complex1.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex7 = complex1.divide((-0.0d));
        org.apache.commons.math3.complex.Complex complex8 = complex1.acos();
        org.apache.commons.math3.complex.Complex complex9 = complex1.cosh();
        double double10 = complex1.getArgument();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex6 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex7 = complex1.conjugate();
        double double8 = complex7.abs();
        org.apache.commons.math3.complex.Complex complex9 = complex7.cos();
        org.apache.commons.math3.complex.Complex complex10 = complex7.asin();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) '4', (double) (short) 100);
        org.apache.commons.math3.complex.Complex complex3 = complex2.sin();
        double double4 = complex3.getReal();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.3260852713764028E43d + "'", double4 == 1.3260852713764028E43d);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
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
        org.apache.commons.math3.complex.Complex complex14 = complex13.log();
        boolean boolean15 = complex13.isInfinite();
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex1 = complex0.exp();
        double double2 = complex0.getImaginary();
        org.apache.commons.math3.complex.Complex complex4 = complex0.multiply(100);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(complex4);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf(52.0d, 52.0d);
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        java.lang.String str3 = complex2.toString();
        org.apache.commons.math3.complex.Complex complex5 = complex2.divide((double) 100L);
        org.apache.commons.math3.complex.Complex complex7 = complex2.multiply((int) (short) 10);
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex10 = complex9.exp();
        double double11 = complex9.getArgument();
        org.apache.commons.math3.complex.Complex complex13 = complex9.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex14 = complex9.exp();
        org.apache.commons.math3.complex.Complex complex15 = complex9.sqrt1z();
        org.apache.commons.math3.complex.Complex complex16 = complex15.sin();
        org.apache.commons.math3.complex.Complex complex17 = complex7.multiply(complex15);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(NaN, NaN)" + "'", str3, "(NaN, NaN)");
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) '4', (double) (short) 100);
        org.apache.commons.math3.complex.Complex complex3 = complex2.sin();
        double double4 = complex3.getArgument();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.16372121576841156d) + "'", double4 == (-0.16372121576841156d));
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
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
        org.apache.commons.math3.complex.Complex complex21 = complex19.multiply(10);
        org.apache.commons.math3.complex.Complex complex23 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex24 = complex23.exp();
        double double25 = complex23.getArgument();
        org.apache.commons.math3.complex.Complex complex27 = complex23.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex28 = complex23.sin();
        org.apache.commons.math3.complex.Complex complex29 = complex23.cosh();
        org.apache.commons.math3.complex.Complex complex30 = complex23.tan();
        org.apache.commons.math3.complex.Complex complex31 = complex23.tan();
        org.apache.commons.math3.complex.Complex complex33 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex34 = complex33.exp();
        double double35 = complex33.getArgument();
        org.apache.commons.math3.complex.Complex complex37 = complex33.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex38 = complex33.sin();
        org.apache.commons.math3.complex.Complex complex39 = complex33.cosh();
        org.apache.commons.math3.complex.Complex complex40 = complex33.tan();
        org.apache.commons.math3.complex.Complex complex41 = complex33.tan();
        org.apache.commons.math3.complex.Complex complex43 = complex33.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex44 = complex31.subtract(complex33);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList46 = complex44.nthRoot((int) '4');
        org.apache.commons.math3.complex.Complex complex47 = complex44.asin();
        org.apache.commons.math3.complex.Complex complex48 = complex21.pow(complex44);
        org.apache.commons.math3.complex.Complex complex49 = complex44.cos();
        org.apache.commons.math3.complex.Complex complex51 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex52 = complex51.exp();
        double double53 = complex51.getArgument();
        org.apache.commons.math3.complex.Complex complex55 = complex51.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex56 = complex51.sin();
        org.apache.commons.math3.complex.Complex complex57 = complex51.cosh();
        org.apache.commons.math3.complex.Complex complex58 = complex51.tan();
        org.apache.commons.math3.complex.Complex complex59 = complex51.tan();
        org.apache.commons.math3.complex.Complex complex60 = complex59.reciprocal();
        org.apache.commons.math3.complex.Complex complex61 = complex59.cos();
        boolean boolean62 = complex44.equals((java.lang.Object) complex59);
        org.apache.commons.math3.complex.Complex complex63 = complex44.atan();
        java.lang.String str64 = complex63.toString();
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
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complexList46);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertNotNull(complex55);
        org.junit.Assert.assertNotNull(complex56);
        org.junit.Assert.assertNotNull(complex57);
        org.junit.Assert.assertNotNull(complex58);
        org.junit.Assert.assertNotNull(complex59);
        org.junit.Assert.assertNotNull(complex60);
        org.junit.Assert.assertNotNull(complex61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(complex63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "(0.5085127282117131, 0.0)" + "'", str64, "(0.5085127282117131, 0.0)");
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.sinh();
        double double5 = complex1.getImaginary();
        double double6 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex7 = complex1.log();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(complex7);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex5 = complex1.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex7 = complex5.multiply(100);
        org.apache.commons.math3.complex.Complex complex9 = complex5.multiply((int) (short) 0);
        org.apache.commons.math3.complex.Complex complex10 = complex5.sin();
        org.apache.commons.math3.complex.Complex complex12 = complex10.add(0.0d);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((double) (-1L), 0.8390715290764524d);
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((double) (byte) 1, (double) 10L);
        org.apache.commons.math3.complex.Complex complex3 = complex2.conjugate();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex3 = complex1.subtract((double) (-1));
        org.apache.commons.math3.complex.Complex complex5 = complex1.multiply((int) (short) 0);
        org.apache.commons.math3.complex.Complex complex6 = complex5.acos();
        org.apache.commons.math3.complex.Complex complex8 = complex6.subtract(100.0d);
        org.apache.commons.math3.complex.Complex complex10 = complex8.pow((-4.7698574469183904E-17d));
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
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
        org.apache.commons.math3.complex.Complex complex43 = complex42.acos();
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
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tanh();
        org.apache.commons.math3.complex.Complex complex4 = complex3.log();
        org.apache.commons.math3.complex.Complex complex5 = complex3.acos();
        org.apache.commons.math3.complex.Complex complex6 = complex3.tanh();
        org.apache.commons.math3.complex.Complex complex7 = complex6.asin();
        org.apache.commons.math3.complex.Complex complex8 = complex7.exp();
        org.apache.commons.math3.complex.Complex complex9 = complex7.log();
        org.apache.commons.math3.complex.Complex complex10 = complex7.sinh();
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
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex7 = complex3.subtract(complex6);
        org.apache.commons.math3.complex.Complex complex8 = complex3.acos();
        org.apache.commons.math3.complex.Complex complex9 = complex3.log();
        org.apache.commons.math3.complex.Complex complex10 = complex3.sqrt1z();
        org.apache.commons.math3.complex.Complex complex11 = complex3.tan();
        org.apache.commons.math3.complex.Complex complex13 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex14 = complex13.exp();
        double double15 = complex13.getArgument();
        org.apache.commons.math3.complex.Complex complex17 = complex13.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex18 = complex13.exp();
        org.apache.commons.math3.complex.Complex complex19 = complex18.cosh();
        org.apache.commons.math3.complex.Complex complex21 = complex19.divide((double) (short) 1);
        org.apache.commons.math3.complex.Complex complex23 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex24 = complex23.exp();
        org.apache.commons.math3.complex.Complex complex25 = complex23.tan();
        org.apache.commons.math3.complex.Complex complex27 = complex23.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex28 = complex23.cos();
        org.apache.commons.math3.complex.Complex complex29 = complex23.tan();
        boolean boolean30 = complex19.equals((java.lang.Object) complex23);
        org.apache.commons.math3.complex.Complex complex31 = complex23.sin();
        boolean boolean32 = complex3.equals((java.lang.Object) complex31);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
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
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf(0.009999666686665238d, 0.009999166724158364d);
        double double3 = complex2.getReal();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.009999666686665238d + "'", double3 == 0.009999666686665238d);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
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
        org.apache.commons.math3.complex.Complex complex45 = complex27.sinh();
        org.apache.commons.math3.complex.Complex complex47 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double48 = complex47.getImaginary();
        org.apache.commons.math3.complex.Complex complex49 = complex47.negate();
        org.apache.commons.math3.complex.Complex complex51 = complex49.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex52 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex53 = complex49.subtract(complex52);
        org.apache.commons.math3.complex.Complex complex55 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex56 = complex55.exp();
        org.apache.commons.math3.complex.Complex complex57 = complex55.tan();
        org.apache.commons.math3.complex.Complex complex59 = complex55.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex60 = complex55.cos();
        org.apache.commons.math3.complex.Complex complex61 = complex53.subtract(complex60);
        java.lang.String str62 = complex60.toString();
        org.apache.commons.math3.complex.Complex complex63 = complex60.sqrt1z();
        org.apache.commons.math3.complex.Complex complex64 = complex63.cosh();
        org.apache.commons.math3.complex.Complex complex65 = complex63.acos();
        org.apache.commons.math3.complex.Complex complex66 = complex27.subtract(complex63);
        org.apache.commons.math3.complex.Complex complex68 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex69 = complex68.exp();
        double double70 = complex68.getArgument();
        org.apache.commons.math3.complex.Complex complex72 = complex68.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex73 = complex68.tanh();
        org.apache.commons.math3.complex.Complex complex75 = complex73.multiply((int) (short) 100);
        java.lang.String str76 = complex73.toString();
        org.apache.commons.math3.complex.Complex complex77 = complex66.divide(complex73);
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
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertNotNull(complex53);
        org.junit.Assert.assertNotNull(complex55);
        org.junit.Assert.assertNotNull(complex56);
        org.junit.Assert.assertNotNull(complex57);
        org.junit.Assert.assertNotNull(complex59);
        org.junit.Assert.assertNotNull(complex60);
        org.junit.Assert.assertNotNull(complex61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "(0.5403023058681398, -0.0)" + "'", str62, "(0.5403023058681398, -0.0)");
        org.junit.Assert.assertNotNull(complex63);
        org.junit.Assert.assertNotNull(complex64);
        org.junit.Assert.assertNotNull(complex65);
        org.junit.Assert.assertNotNull(complex66);
        org.junit.Assert.assertNotNull(complex68);
        org.junit.Assert.assertNotNull(complex69);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 0.0d + "'", double70 == 0.0d);
        org.junit.Assert.assertNotNull(complex72);
        org.junit.Assert.assertNotNull(complex73);
        org.junit.Assert.assertNotNull(complex75);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "(0.7615941559557649, 0.0)" + "'", str76, "(0.7615941559557649, 0.0)");
        org.junit.Assert.assertNotNull(complex77);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        boolean boolean3 = complex1.isInfinite();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tanh();
        org.apache.commons.math3.complex.Complex complex4 = complex3.log();
        org.apache.commons.math3.complex.Complex complex5 = complex3.acos();
        org.apache.commons.math3.complex.Complex complex6 = complex3.tanh();
        boolean boolean7 = complex6.isNaN();
        org.apache.commons.math3.complex.Complex complex9 = complex6.multiply((int) '4');
        org.apache.commons.math3.complex.Complex complex11 = complex9.pow(21.09443817929988d);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
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
        org.apache.commons.math3.complex.Complex complex17 = complex9.multiply((int) '4');
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
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf(0.010000333346667207d, 0.5430806348152437d);
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex7 = complex5.divide((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex8 = complex7.cosh();
        org.apache.commons.math3.complex.Complex complex9 = complex7.tanh();
        org.apache.commons.math3.complex.Complex complex10 = complex7.asin();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex6 = complex1.sqrt1z();
        double double7 = complex6.abs();
        org.apache.commons.math3.complex.Complex complex9 = complex6.divide(0.21460183660255172d);
        org.apache.commons.math3.complex.Complex complex10 = complex9.sinh();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex(263.6733373605274d, 0.9996159447946292d);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math3.complex.Complex complex8 = complex6.subtract((double) 1.0f);
        org.apache.commons.math3.complex.Complex complex9 = complex8.asin();
        org.apache.commons.math3.complex.Complex complex11 = complex9.pow(100.0d);
        org.apache.commons.math3.complex.Complex complex12 = complex11.atan();
        org.apache.commons.math3.complex.Complex complex15 = new org.apache.commons.math3.complex.Complex((double) 0, Double.NaN);
        org.apache.commons.math3.complex.Complex complex16 = complex15.atan();
        org.apache.commons.math3.complex.Complex complex17 = complex16.conjugate();
        org.apache.commons.math3.complex.Complex complex18 = complex11.pow(complex17);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((double) (short) 1, (double) 100L);
        org.apache.commons.math3.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math3.complex.Complex complex4 = complex2.log();
        org.apache.commons.math3.complex.Complex complex6 = complex4.multiply(Double.POSITIVE_INFINITY);
        org.apache.commons.math3.complex.ComplexField complexField7 = complex4.getField();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexField7);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex4 = complex2.pow((double) (short) 10);
        org.apache.commons.math3.complex.Complex complex5 = complex2.cosh();
        org.apache.commons.math3.complex.Complex complex6 = complex5.acos();
        org.apache.commons.math3.complex.Complex complex7 = complex5.cos();
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex10 = complex9.exp();
        double double11 = complex9.getArgument();
        org.apache.commons.math3.complex.Complex complex12 = complex9.log();
        org.apache.commons.math3.complex.Complex complex13 = complex9.log();
        org.apache.commons.math3.complex.Complex complex15 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex16 = complex15.exp();
        double double17 = complex15.getArgument();
        org.apache.commons.math3.complex.Complex complex18 = complex15.log();
        org.apache.commons.math3.complex.Complex complex19 = complex13.subtract(complex18);
        org.apache.commons.math3.complex.Complex complex20 = complex13.sqrt();
        org.apache.commons.math3.complex.Complex complex21 = complex7.pow(complex20);
        boolean boolean22 = complex20.isNaN();
        org.apache.commons.math3.complex.Complex complex23 = complex20.acos();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
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
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(complex23);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
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
        java.util.List<org.apache.commons.math3.complex.Complex> complexList36 = complex29.nthRoot(10);
        org.apache.commons.math3.complex.Complex complex38 = complex29.add(2.718281828459045d);
        boolean boolean39 = complex29.isNaN();
        java.lang.Class<?> wildcardClass40 = complex29.getClass();
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
        org.junit.Assert.assertNotNull(complexList36);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((double) (short) 1, (double) 1L);
        org.apache.commons.math3.complex.Complex complex3 = complex2.sqrt();
        org.apache.commons.math3.complex.Complex complex5 = complex3.divide(10.0d);
        org.apache.commons.math3.complex.Complex complex6 = complex3.asin();
        org.apache.commons.math3.complex.Complex complex7 = complex3.negate();
        org.apache.commons.math3.complex.Complex complex9 = complex3.divide(7.35006255277802d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
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
        double double23 = complex16.getReal();
        org.apache.commons.math3.complex.Complex complex25 = complex16.pow(0.0d);
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
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
        org.junit.Assert.assertNotNull(complex25);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 0.0f, (double) 10.0f);
        org.apache.commons.math3.complex.Complex complex4 = complex2.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex5 = complex2.exp();
        double double6 = complex2.getImaginary();
        org.apache.commons.math3.complex.Complex complex7 = complex2.conjugate();
        org.apache.commons.math3.complex.Complex complex8 = complex2.cosh();
        org.apache.commons.math3.complex.Complex complex9 = complex2.tanh();
        org.apache.commons.math3.complex.Complex complex10 = complex2.sinh();
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex5 = complex1.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex7 = complex5.multiply(100);
        org.apache.commons.math3.complex.Complex complex9 = complex5.multiply((int) (short) 0);
        org.apache.commons.math3.complex.Complex complex11 = complex5.multiply((int) (byte) 0);
        org.apache.commons.math3.complex.Complex complex12 = complex5.cos();
        org.apache.commons.math3.complex.Complex complex14 = complex12.pow(0.7615941559557649d);
        org.apache.commons.math3.complex.Complex complex15 = complex12.reciprocal();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
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
        org.apache.commons.math3.complex.Complex complex38 = complex37.tan();
        org.apache.commons.math3.complex.Complex complex39 = complex37.cosh();
        org.apache.commons.math3.complex.Complex complex40 = complex39.reciprocal();
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
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math3.complex.Complex complex3 = complex1.sqrt();
        org.apache.commons.math3.complex.Complex complex4 = complex3.cosh();
        org.apache.commons.math3.complex.Complex complex6 = complex3.add((double) ' ');
        org.apache.commons.math3.complex.Complex complex7 = complex6.exp();
        org.apache.commons.math3.complex.Complex complex9 = complex7.multiply(0);
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex12 = complex11.exp();
        org.apache.commons.math3.complex.Complex complex13 = complex11.tanh();
        org.apache.commons.math3.complex.Complex complex14 = complex13.log();
        org.apache.commons.math3.complex.Complex complex15 = complex13.acos();
        org.apache.commons.math3.complex.Complex complex16 = complex15.reciprocal();
        org.apache.commons.math3.complex.Complex complex17 = complex15.sqrt1z();
        org.apache.commons.math3.complex.Complex complex19 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double20 = complex19.getImaginary();
        org.apache.commons.math3.complex.Complex complex21 = complex19.negate();
        org.apache.commons.math3.complex.Complex complex23 = complex21.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex25 = complex21.pow((double) 100L);
        org.apache.commons.math3.complex.Complex complex27 = complex25.subtract((double) (byte) -1);
        org.apache.commons.math3.complex.Complex complex29 = complex27.pow((double) (-1L));
        org.apache.commons.math3.complex.Complex complex31 = complex29.multiply((double) 100.0f);
        org.apache.commons.math3.complex.Complex complex32 = complex15.add(complex29);
        org.apache.commons.math3.complex.Complex complex33 = complex32.exp();
        org.apache.commons.math3.complex.Complex complex35 = complex32.add((-9.0d));
        org.apache.commons.math3.complex.Complex complex36 = complex9.subtract(complex35);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf(1.6574544541530762d);
        org.junit.Assert.assertNotNull(complex1);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
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
        org.apache.commons.math3.complex.Complex complex19 = complex17.sinh();
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
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex5.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex9 = complex5.negate();
        boolean boolean10 = complex5.isInfinite();
        org.apache.commons.math3.complex.Complex complex12 = complex5.subtract((double) 1);
        org.apache.commons.math3.complex.Complex complex13 = complex12.sqrt();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList15 = complex12.nthRoot((int) '4');
        double double16 = complex12.getArgument();
        org.apache.commons.math3.complex.Complex complex18 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex19 = complex18.exp();
        double double20 = complex18.getArgument();
        org.apache.commons.math3.complex.Complex complex22 = complex18.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex23 = complex18.sin();
        org.apache.commons.math3.complex.Complex complex24 = complex18.cosh();
        org.apache.commons.math3.complex.Complex complex25 = complex18.tan();
        org.apache.commons.math3.complex.Complex complex26 = complex18.tan();
        org.apache.commons.math3.complex.Complex complex27 = complex26.reciprocal();
        boolean boolean28 = complex26.isInfinite();
        org.apache.commons.math3.complex.Complex complex29 = complex12.subtract(complex26);
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
        org.apache.commons.math3.complex.Complex complex43 = complex37.atan();
        org.apache.commons.math3.complex.Complex complex45 = complex43.pow((-2.0d));
        org.apache.commons.math3.complex.ComplexField complexField46 = complex45.getField();
        org.apache.commons.math3.complex.Complex complex47 = complex29.add(complex45);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexList8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complexList15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complexField46);
        org.junit.Assert.assertNotNull(complex47);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.sin();
        org.apache.commons.math3.complex.Complex complex8 = complex1.divide((double) (-1L));
        org.apache.commons.math3.complex.Complex complex10 = complex8.subtract((-0.5912601907918263d));
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex6 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex7 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex9 = complex7.multiply((int) 'a');
        org.apache.commons.math3.complex.Complex complex10 = complex9.tan();
        double double11 = complex9.getReal();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 263.6733373605274d + "'", double11 == 263.6733373605274d);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.sinh();
        double double5 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex7 = complex1.subtract((double) (byte) 1);
        org.apache.commons.math3.complex.Complex complex8 = complex1.log();
        org.apache.commons.math3.complex.Complex complex10 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex11 = complex10.exp();
        double double12 = complex10.getArgument();
        org.apache.commons.math3.complex.Complex complex14 = complex10.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex15 = complex10.exp();
        org.apache.commons.math3.complex.Complex complex16 = complex15.cosh();
        org.apache.commons.math3.complex.Complex complex18 = complex16.divide((double) (short) 1);
        org.apache.commons.math3.complex.Complex complex20 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex21 = complex20.sqrt();
        org.apache.commons.math3.complex.Complex complex22 = complex20.sqrt();
        org.apache.commons.math3.complex.Complex complex23 = complex22.cosh();
        org.apache.commons.math3.complex.Complex complex25 = complex22.add((double) ' ');
        org.apache.commons.math3.complex.Complex complex26 = complex18.subtract(complex22);
        org.apache.commons.math3.complex.Complex complex27 = complex1.multiply(complex22);
        double double28 = complex1.getImaginary();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf(9.989999833375835d, 0.5403023058681398d);
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex5 = complex1.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex6 = complex1.cos();
        double double7 = complex6.getArgument();
        org.apache.commons.math3.complex.Complex complex8 = complex6.sinh();
        java.lang.String str9 = complex8.toString();
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
        org.apache.commons.math3.complex.Complex complex25 = complex17.tanh();
        org.apache.commons.math3.complex.Complex complex26 = complex25.cosh();
        org.apache.commons.math3.complex.Complex complex27 = complex8.divide(complex25);
        double double28 = complex27.getReal();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-0.0d) + "'", double7 == (-0.0d));
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(0.5669767943827976, -0.0)" + "'", str9, "(0.5669767943827976, -0.0)");
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.6212514480743893d + "'", double28 == 0.6212514480743893d);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((double) (byte) 1, (double) 10L);
        org.apache.commons.math3.complex.Complex complex3 = complex2.sqrt1z();
        org.apache.commons.math3.complex.Complex complex4 = complex3.exp();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
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
        org.apache.commons.math3.complex.Complex complex47 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex49 = complex47.subtract((double) (-1));
        org.apache.commons.math3.complex.Complex complex51 = complex47.multiply((double) 10L);
        boolean boolean52 = complex45.equals((java.lang.Object) complex47);
        org.apache.commons.math3.complex.Complex complex54 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex55 = complex54.exp();
        double double56 = complex54.getArgument();
        org.apache.commons.math3.complex.Complex complex57 = complex54.log();
        org.apache.commons.math3.complex.Complex complex58 = complex57.log();
        org.apache.commons.math3.complex.Complex complex60 = complex57.add(1.0d);
        double double61 = complex57.getImaginary();
        org.apache.commons.math3.complex.Complex complex62 = complex45.multiply(complex57);
        org.apache.commons.math3.complex.Complex complex63 = complex62.reciprocal();
        org.apache.commons.math3.complex.Complex complex65 = complex62.subtract(2.637675926499024d);
        org.apache.commons.math3.complex.Complex complex68 = new org.apache.commons.math3.complex.Complex((double) 0.0f, (double) 10.0f);
        org.apache.commons.math3.complex.Complex complex69 = complex68.sin();
        org.apache.commons.math3.complex.Complex complex71 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex72 = complex71.exp();
        org.apache.commons.math3.complex.Complex complex73 = complex71.tanh();
        org.apache.commons.math3.complex.Complex complex74 = complex73.log();
        org.apache.commons.math3.complex.Complex complex75 = complex73.acos();
        org.apache.commons.math3.complex.Complex complex76 = complex73.tanh();
        org.apache.commons.math3.complex.Complex complex77 = complex76.asin();
        org.apache.commons.math3.complex.Complex complex79 = complex77.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex80 = complex77.exp();
        org.apache.commons.math3.complex.Complex complex82 = new org.apache.commons.math3.complex.Complex(10.0d);
        org.apache.commons.math3.complex.Complex complex84 = complex82.divide((double) 'a');
        boolean boolean85 = complex80.equals((java.lang.Object) 'a');
        org.apache.commons.math3.complex.Complex complex86 = complex80.cosh();
        org.apache.commons.math3.complex.Complex complex87 = complex86.sin();
        org.apache.commons.math3.complex.Complex complex88 = complex68.divide(complex86);
        org.apache.commons.math3.complex.Complex complex90 = complex88.divide((double) (short) 1);
        org.apache.commons.math3.complex.Complex complex91 = complex62.multiply(complex90);
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
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(complex54);
        org.junit.Assert.assertNotNull(complex55);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
        org.junit.Assert.assertNotNull(complex57);
        org.junit.Assert.assertNotNull(complex58);
        org.junit.Assert.assertNotNull(complex60);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
        org.junit.Assert.assertNotNull(complex62);
        org.junit.Assert.assertNotNull(complex63);
        org.junit.Assert.assertNotNull(complex65);
        org.junit.Assert.assertNotNull(complex69);
        org.junit.Assert.assertNotNull(complex71);
        org.junit.Assert.assertNotNull(complex72);
        org.junit.Assert.assertNotNull(complex73);
        org.junit.Assert.assertNotNull(complex74);
        org.junit.Assert.assertNotNull(complex75);
        org.junit.Assert.assertNotNull(complex76);
        org.junit.Assert.assertNotNull(complex77);
        org.junit.Assert.assertNotNull(complex79);
        org.junit.Assert.assertNotNull(complex80);
        org.junit.Assert.assertNotNull(complex84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(complex86);
        org.junit.Assert.assertNotNull(complex87);
        org.junit.Assert.assertNotNull(complex88);
        org.junit.Assert.assertNotNull(complex90);
        org.junit.Assert.assertNotNull(complex91);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
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
        org.apache.commons.math3.complex.Complex complex15 = complex14.sqrt();
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
        org.apache.commons.math3.complex.Complex complex37 = complex35.multiply(10);
        org.apache.commons.math3.complex.Complex complex38 = complex14.divide(complex37);
        org.apache.commons.math3.complex.Complex complex39 = complex38.sqrt1z();
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
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 10, (double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex3 = complex2.asin();
        org.apache.commons.math3.complex.Complex complex4 = complex2.asin();
        org.apache.commons.math3.complex.Complex complex5 = complex2.cosh();
        org.apache.commons.math3.complex.ComplexField complexField6 = complex2.getField();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complexField6);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
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
        org.apache.commons.math3.complex.Complex complex48 = complex45.add(Double.NaN);
        org.apache.commons.math3.complex.Complex complex50 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex51 = complex50.exp();
        org.apache.commons.math3.complex.Complex complex52 = complex50.tan();
        org.apache.commons.math3.complex.Complex complex54 = complex50.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex55 = complex50.cos();
        boolean boolean56 = complex50.isNaN();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList58 = complex50.nthRoot(1);
        org.apache.commons.math3.complex.Complex complex59 = complex50.sinh();
        org.apache.commons.math3.complex.Complex complex60 = complex45.add(complex50);
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
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertNotNull(complex54);
        org.junit.Assert.assertNotNull(complex55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(complexList58);
        org.junit.Assert.assertNotNull(complex59);
        org.junit.Assert.assertNotNull(complex60);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex4 = complex1.subtract((-0.5403023058681398d));
        org.apache.commons.math3.complex.Complex complex5 = complex1.exp();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
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
        org.apache.commons.math3.complex.Complex complex17 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex18 = complex1.sinh();
        org.apache.commons.math3.complex.ComplexField complexField19 = complex18.getField();
        boolean boolean20 = complex18.isInfinite();
        boolean boolean21 = complex18.isInfinite();
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
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complexField19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((-9.0d));
        org.apache.commons.math3.complex.Complex complex2 = complex1.sqrt1z();
        org.apache.commons.math3.complex.Complex complex4 = complex1.pow(1.0d);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex6 = complex1.sqrt1z();
        org.apache.commons.math3.complex.Complex complex8 = complex6.pow((double) 1L);
        org.apache.commons.math3.complex.Complex complex9 = complex8.exp();
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
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex(52.0d, 21.09443817929988d);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tanh();
        org.apache.commons.math3.complex.Complex complex4 = complex3.log();
        org.apache.commons.math3.complex.Complex complex5 = complex3.acos();
        org.apache.commons.math3.complex.Complex complex6 = complex3.tanh();
        org.apache.commons.math3.complex.Complex complex7 = complex6.asin();
        org.apache.commons.math3.complex.Complex complex9 = complex7.multiply((int) (byte) 100);
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
        org.apache.commons.math3.complex.Complex complex25 = complex17.atan();
        org.apache.commons.math3.complex.Complex complex27 = complex25.multiply((double) 100.0f);
        org.apache.commons.math3.complex.Complex complex28 = complex9.divide(complex27);
        org.apache.commons.math3.complex.Complex complex29 = complex28.sinh();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
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
        org.apache.commons.math3.complex.Complex complex54 = complex53.sqrt();
        org.apache.commons.math3.complex.Complex complex56 = complex54.multiply((int) (byte) 0);
        boolean boolean57 = complex56.isInfinite();
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
        org.junit.Assert.assertNotNull(complex54);
        org.junit.Assert.assertNotNull(complex56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex6 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex7 = complex1.exp();
        double double8 = complex7.getReal();
        org.apache.commons.math3.complex.Complex complex9 = complex7.asin();
        org.apache.commons.math3.complex.Complex complex11 = complex7.pow((double) (byte) 1);
        java.lang.Class<?> wildcardClass12 = complex7.getClass();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.718281828459045d + "'", double8 == 2.718281828459045d);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex7 = complex3.pow((double) 100L);
        boolean boolean8 = complex7.isInfinite();
        org.apache.commons.math3.complex.Complex complex9 = complex7.sin();
        double double10 = complex9.getReal();
        double double11 = complex9.abs();
        org.apache.commons.math3.complex.ComplexField complexField12 = complex9.getField();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8414709848078965d + "'", double10 == 0.8414709848078965d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.8414709848078965d + "'", double11 == 0.8414709848078965d);
        org.junit.Assert.assertNotNull(complexField12);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((double) 1, 34.0d);
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex4 = complex1.pow((double) 100L);
        boolean boolean5 = complex4.isInfinite();
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex8 = complex7.exp();
        double double9 = complex7.getArgument();
        org.apache.commons.math3.complex.Complex complex11 = complex7.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex12 = complex7.sin();
        org.apache.commons.math3.complex.Complex complex13 = complex7.cosh();
        org.apache.commons.math3.complex.Complex complex14 = complex7.tan();
        org.apache.commons.math3.complex.Complex complex15 = complex7.tan();
        org.apache.commons.math3.complex.Complex complex16 = complex15.reciprocal();
        org.apache.commons.math3.complex.Complex complex18 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double19 = complex18.getImaginary();
        org.apache.commons.math3.complex.Complex complex20 = complex18.negate();
        org.apache.commons.math3.complex.Complex complex22 = complex20.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex23 = complex22.atan();
        org.apache.commons.math3.complex.Complex complex24 = complex22.cosh();
        org.apache.commons.math3.complex.Complex complex25 = complex15.multiply(complex22);
        org.apache.commons.math3.complex.Complex complex26 = complex22.log();
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
        org.apache.commons.math3.complex.Complex complex42 = complex34.sqrt();
        org.apache.commons.math3.complex.Complex complex43 = complex22.multiply(complex34);
        org.apache.commons.math3.complex.Complex complex44 = complex4.multiply(complex34);
        org.apache.commons.math3.complex.Complex complex46 = complex34.divide(100.0d);
        org.apache.commons.math3.complex.Complex complex48 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double49 = complex48.getImaginary();
        org.apache.commons.math3.complex.Complex complex50 = complex48.negate();
        org.apache.commons.math3.complex.Complex complex52 = complex50.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex53 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex54 = complex50.subtract(complex53);
        org.apache.commons.math3.complex.Complex complex55 = complex50.acos();
        org.apache.commons.math3.complex.Complex complex56 = complex50.negate();
        org.apache.commons.math3.complex.Complex complex57 = complex34.subtract(complex56);
        org.apache.commons.math3.complex.Complex complex59 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex60 = complex59.exp();
        double double61 = complex59.getArgument();
        org.apache.commons.math3.complex.Complex complex63 = complex59.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex64 = complex59.sin();
        org.apache.commons.math3.complex.Complex complex65 = complex59.cosh();
        org.apache.commons.math3.complex.Complex complex66 = complex59.tan();
        org.apache.commons.math3.complex.Complex complex67 = complex59.tan();
        org.apache.commons.math3.complex.Complex complex68 = complex67.reciprocal();
        org.apache.commons.math3.complex.Complex complex70 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double71 = complex70.getImaginary();
        org.apache.commons.math3.complex.Complex complex72 = complex70.negate();
        org.apache.commons.math3.complex.Complex complex74 = complex72.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex75 = complex74.atan();
        org.apache.commons.math3.complex.Complex complex76 = complex74.cosh();
        org.apache.commons.math3.complex.Complex complex77 = complex67.multiply(complex74);
        org.apache.commons.math3.complex.Complex complex79 = complex74.pow(35.0d);
        org.apache.commons.math3.complex.Complex complex80 = complex74.atan();
        org.apache.commons.math3.complex.Complex complex82 = new org.apache.commons.math3.complex.Complex((double) 10.0f);
        org.apache.commons.math3.complex.Complex complex83 = complex74.subtract(complex82);
        org.apache.commons.math3.complex.Complex complex84 = complex57.divide(complex83);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
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
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex22);
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
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertNotNull(complex53);
        org.junit.Assert.assertNotNull(complex54);
        org.junit.Assert.assertNotNull(complex55);
        org.junit.Assert.assertNotNull(complex56);
        org.junit.Assert.assertNotNull(complex57);
        org.junit.Assert.assertNotNull(complex59);
        org.junit.Assert.assertNotNull(complex60);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
        org.junit.Assert.assertNotNull(complex63);
        org.junit.Assert.assertNotNull(complex64);
        org.junit.Assert.assertNotNull(complex65);
        org.junit.Assert.assertNotNull(complex66);
        org.junit.Assert.assertNotNull(complex67);
        org.junit.Assert.assertNotNull(complex68);
        org.junit.Assert.assertNotNull(complex70);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 0.0d + "'", double71 == 0.0d);
        org.junit.Assert.assertNotNull(complex72);
        org.junit.Assert.assertNotNull(complex74);
        org.junit.Assert.assertNotNull(complex75);
        org.junit.Assert.assertNotNull(complex76);
        org.junit.Assert.assertNotNull(complex77);
        org.junit.Assert.assertNotNull(complex79);
        org.junit.Assert.assertNotNull(complex80);
        org.junit.Assert.assertNotNull(complex83);
        org.junit.Assert.assertNotNull(complex84);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
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
        org.apache.commons.math3.complex.Complex complex48 = complex45.add(Double.NaN);
        org.apache.commons.math3.complex.Complex complex49 = complex48.sqrt();
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
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        java.lang.String str3 = complex2.toString();
        org.apache.commons.math3.complex.Complex complex5 = complex2.divide((double) 100L);
        org.apache.commons.math3.complex.Complex complex7 = complex2.multiply((int) (short) 10);
        org.apache.commons.math3.complex.ComplexField complexField8 = complex2.getField();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(NaN, NaN)" + "'", str3, "(NaN, NaN)");
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complexField8);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
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
        org.apache.commons.math3.complex.Complex complex18 = complex15.sqrt();
        org.apache.commons.math3.complex.Complex complex19 = complex18.cosh();
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
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf(0.4211080131525584d, (double) 10);
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex(0.705026843555238d, (-31.984386449665855d));
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex6 = complex1.sqrt1z();
        org.apache.commons.math3.complex.Complex complex8 = complex6.pow((double) 1L);
        org.apache.commons.math3.complex.Complex complex10 = complex8.subtract((double) (-1.0f));
        org.apache.commons.math3.complex.Complex complex11 = complex10.tan();
        org.apache.commons.math3.complex.Complex complex13 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex14 = complex13.exp();
        double double15 = complex13.getArgument();
        org.apache.commons.math3.complex.Complex complex17 = complex13.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex19 = complex13.pow((double) 100.0f);
        org.apache.commons.math3.complex.Complex complex20 = complex19.sin();
        org.apache.commons.math3.complex.Complex complex21 = complex20.negate();
        boolean boolean22 = complex20.isNaN();
        org.apache.commons.math3.complex.Complex complex24 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex25 = complex24.exp();
        double double26 = complex24.getArgument();
        org.apache.commons.math3.complex.Complex complex28 = complex24.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex29 = complex24.exp();
        org.apache.commons.math3.complex.Complex complex30 = complex29.cosh();
        org.apache.commons.math3.complex.Complex complex31 = complex29.sin();
        org.apache.commons.math3.complex.Complex complex32 = complex20.pow(complex31);
        double double33 = complex32.getImaginary();
        org.apache.commons.math3.complex.Complex complex34 = complex10.add(complex32);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNotNull(complex34);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex7 = complex3.pow((double) 100L);
        boolean boolean8 = complex7.isInfinite();
        org.apache.commons.math3.complex.Complex complex9 = complex7.cosh();
        org.apache.commons.math3.complex.Complex complex10 = complex7.sin();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.sin();
        double double7 = complex1.getReal();
        org.apache.commons.math3.complex.Complex complex9 = complex1.multiply((int) (byte) 1);
        org.apache.commons.math3.complex.Complex complex11 = complex9.pow(0.0d);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex7 = complex3.subtract(complex6);
        org.apache.commons.math3.complex.Complex complex9 = complex3.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex10 = complex3.sin();
        org.apache.commons.math3.complex.Complex complex11 = complex3.sqrt();
        org.apache.commons.math3.complex.Complex complex13 = complex3.add(0.4285234515519125d);
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
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tanh();
        org.apache.commons.math3.complex.Complex complex4 = complex3.log();
        org.apache.commons.math3.complex.Complex complex6 = complex3.pow(1.557407724654902d);
        org.apache.commons.math3.complex.Complex complex7 = complex3.cosh();
        org.apache.commons.math3.complex.Complex complex9 = complex3.pow((double) (short) 0);
        boolean boolean10 = complex9.isNaN();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
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
        org.apache.commons.math3.complex.Complex complex15 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double16 = complex15.getImaginary();
        org.apache.commons.math3.complex.Complex complex17 = complex15.negate();
        org.apache.commons.math3.complex.Complex complex19 = complex17.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex20 = complex19.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList22 = complex19.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex23 = complex19.negate();
        boolean boolean24 = complex19.isInfinite();
        org.apache.commons.math3.complex.Complex complex26 = complex19.subtract((double) 1);
        org.apache.commons.math3.complex.Complex complex27 = complex26.sqrt();
        org.apache.commons.math3.complex.Complex complex28 = complex26.negate();
        org.apache.commons.math3.complex.Complex complex29 = complex28.sinh();
        org.apache.commons.math3.complex.Complex complex31 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex32 = complex31.exp();
        double double33 = complex31.getArgument();
        org.apache.commons.math3.complex.Complex complex35 = complex31.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex36 = complex31.tanh();
        org.apache.commons.math3.complex.Complex complex39 = org.apache.commons.math3.complex.Complex.valueOf((double) (-1.0f), (double) '#');
        double double40 = complex39.getImaginary();
        org.apache.commons.math3.complex.Complex complex42 = complex39.pow((double) (short) 1);
        org.apache.commons.math3.complex.Complex complex43 = complex36.divide(complex42);
        org.apache.commons.math3.complex.Complex complex44 = complex29.multiply(complex43);
        boolean boolean45 = complex12.equals((java.lang.Object) complex29);
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
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complexList22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 35.0d + "'", double40 == 35.0d);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex6 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex7 = complex1.sqrt1z();
        org.apache.commons.math3.complex.Complex complex8 = complex7.log();
        org.apache.commons.math3.complex.Complex complex9 = complex7.atan();
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
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
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
        org.apache.commons.math3.complex.Complex complex21 = complex9.tan();
        org.apache.commons.math3.complex.Complex complex23 = complex9.multiply(263.6733373605274d);
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
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex23);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
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
        org.apache.commons.math3.complex.Complex complex15 = complex5.cosh();
        double double16 = complex5.abs();
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
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((double) 100.0f, (double) (short) 1);
        org.apache.commons.math3.complex.Complex complex3 = complex2.acos();
        org.apache.commons.math3.complex.Complex complex4 = complex3.sin();
        org.apache.commons.math3.complex.Complex complex5 = complex3.cosh();
        org.apache.commons.math3.complex.Complex complex6 = complex5.negate();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf(0.0d, 3.8412897345910653E-4d);
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
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
        org.apache.commons.math3.complex.Complex complex29 = complex28.reciprocal();
        org.apache.commons.math3.complex.Complex complex31 = complex28.pow((double) (short) 100);
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
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex31);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "(-1.0, -0.0)" + "'", str20, "(-1.0, -0.0)");
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf(1.557407724654902d, 35.0d);
        org.apache.commons.math3.complex.Complex complex4 = complex2.divide((-0.999999999999999d));
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex5 = complex1.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex6 = complex1.cos();
        double double7 = complex6.getArgument();
        org.apache.commons.math3.complex.Complex complex8 = complex6.sinh();
        org.apache.commons.math3.complex.Complex complex10 = complex6.add((-2.0d));
        org.apache.commons.math3.complex.Complex complex12 = complex10.subtract(1.0133886021399945d);
        double double13 = complex10.abs();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-0.0d) + "'", double7 == (-0.0d));
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.4596976941318602d + "'", double13 == 1.4596976941318602d);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex(2.718281828459045d);
        org.apache.commons.math3.complex.Complex complex2 = complex1.asin();
        java.lang.Class<?> wildcardClass3 = complex2.getClass();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
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
        org.apache.commons.math3.complex.Complex complex17 = complex7.sqrt();
        double double18 = complex7.getReal();
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
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
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
        org.apache.commons.math3.complex.Complex complex54 = complex53.sqrt();
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
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 0.0f, (double) 10.0f);
        org.apache.commons.math3.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math3.complex.Complex complex5 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex6 = complex5.exp();
        double double7 = complex5.getArgument();
        org.apache.commons.math3.complex.Complex complex8 = complex5.log();
        org.apache.commons.math3.complex.Complex complex9 = complex5.log();
        org.apache.commons.math3.complex.Complex complex11 = complex9.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex13 = complex9.pow((double) 1.0f);
        org.apache.commons.math3.complex.Complex complex14 = complex3.pow(complex9);
        org.apache.commons.math3.complex.Complex complex15 = complex9.tan();
        double double16 = complex15.getImaginary();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
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
        org.apache.commons.math3.complex.Complex complex17 = complex1.negate();
        double double18 = complex17.getArgument();
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
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-3.141592653589793d) + "'", double18 == (-3.141592653589793d));
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex5 = complex1.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex6 = complex1.cos();
        double double7 = complex6.getArgument();
        org.apache.commons.math3.complex.Complex complex8 = complex6.sinh();
        org.apache.commons.math3.complex.Complex complex10 = complex6.add((-2.0d));
        org.apache.commons.math3.complex.Complex complex11 = complex6.sinh();
        org.apache.commons.math3.complex.Complex complex14 = org.apache.commons.math3.complex.Complex.valueOf((double) (-1.0f), (double) '#');
        double double15 = complex14.getImaginary();
        org.apache.commons.math3.complex.Complex complex16 = complex6.multiply(complex14);
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
        org.apache.commons.math3.complex.Complex complex34 = complex20.tanh();
        boolean boolean35 = complex16.equals((java.lang.Object) complex20);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-0.0d) + "'", double7 == (-0.0d));
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 35.0d + "'", double15 == 35.0d);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-1.0d) + "'", double33 == (-1.0d));
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex(21.09443817929988d);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
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
        org.apache.commons.math3.complex.Complex complex20 = complex16.cos();
        org.apache.commons.math3.complex.Complex complex22 = complex16.multiply((int) (byte) 0);
        org.apache.commons.math3.complex.Complex complex24 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex25 = complex24.exp();
        org.apache.commons.math3.complex.Complex complex26 = complex24.tanh();
        org.apache.commons.math3.complex.Complex complex27 = complex26.log();
        org.apache.commons.math3.complex.Complex complex28 = complex26.acos();
        org.apache.commons.math3.complex.Complex complex29 = complex28.reciprocal();
        org.apache.commons.math3.complex.Complex complex30 = complex28.exp();
        org.apache.commons.math3.complex.Complex complex31 = complex22.divide(complex28);
        org.apache.commons.math3.complex.Complex complex32 = complex31.atan();
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
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
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
        org.apache.commons.math3.complex.Complex complex12 = complex10.tanh();
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
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex6 = complex1.tanh();
        org.apache.commons.math3.complex.Complex complex8 = complex6.multiply((int) (short) 100);
        java.lang.String str9 = complex6.toString();
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex12 = complex11.exp();
        org.apache.commons.math3.complex.Complex complex13 = complex11.tanh();
        org.apache.commons.math3.complex.Complex complex14 = complex13.log();
        double double15 = complex14.getImaginary();
        org.apache.commons.math3.complex.Complex complex17 = complex14.add((double) 1.0f);
        org.apache.commons.math3.complex.Complex complex18 = complex17.tan();
        org.apache.commons.math3.complex.Complex complex19 = complex6.divide(complex18);
        org.apache.commons.math3.complex.Complex complex20 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex21 = complex20.negate();
        double double22 = complex20.getReal();
        org.apache.commons.math3.complex.Complex complex23 = complex20.log();
        org.apache.commons.math3.complex.Complex complex24 = complex23.sin();
        org.apache.commons.math3.complex.Complex complex25 = complex23.sinh();
        org.apache.commons.math3.complex.Complex complex26 = complex18.subtract(complex25);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(0.7615941559557649, 0.0)" + "'", str9, "(0.7615941559557649, 0.0)");
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + Double.POSITIVE_INFINITY + "'", double22 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
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
        org.apache.commons.math3.complex.Complex complex25 = complex24.acos();
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
        org.junit.Assert.assertNotNull(complex25);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((double) 100.0f, 0.9999499987499375d);
        org.apache.commons.math3.complex.Complex complex3 = complex2.sinh();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList5 = complex3.nthRoot((int) (byte) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex3.sqrt1z();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complexList5);
        org.junit.Assert.assertNotNull(complex6);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
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
        org.apache.commons.math3.complex.Complex complex21 = complex19.multiply(10);
        org.apache.commons.math3.complex.Complex complex23 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex24 = complex23.exp();
        double double25 = complex23.getArgument();
        org.apache.commons.math3.complex.Complex complex27 = complex23.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex28 = complex23.sin();
        org.apache.commons.math3.complex.Complex complex29 = complex23.cosh();
        org.apache.commons.math3.complex.Complex complex30 = complex23.tan();
        org.apache.commons.math3.complex.Complex complex31 = complex23.tan();
        org.apache.commons.math3.complex.Complex complex33 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex34 = complex33.exp();
        double double35 = complex33.getArgument();
        org.apache.commons.math3.complex.Complex complex37 = complex33.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex38 = complex33.sin();
        org.apache.commons.math3.complex.Complex complex39 = complex33.cosh();
        org.apache.commons.math3.complex.Complex complex40 = complex33.tan();
        org.apache.commons.math3.complex.Complex complex41 = complex33.tan();
        org.apache.commons.math3.complex.Complex complex43 = complex33.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex44 = complex31.subtract(complex33);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList46 = complex44.nthRoot((int) '4');
        org.apache.commons.math3.complex.Complex complex47 = complex44.asin();
        org.apache.commons.math3.complex.Complex complex48 = complex21.pow(complex44);
        org.apache.commons.math3.complex.Complex complex49 = complex44.cos();
        org.apache.commons.math3.complex.Complex complex50 = complex44.cosh();
        org.apache.commons.math3.complex.Complex complex52 = complex44.multiply(0.9999499987499375d);
        org.apache.commons.math3.complex.Complex complex53 = complex44.negate();
        boolean boolean54 = complex53.isNaN();
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
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complexList46);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertNotNull(complex53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
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
        org.apache.commons.math3.complex.Complex complex68 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex69 = complex68.exp();
        org.apache.commons.math3.complex.Complex complex70 = complex69.exp();
        java.lang.String str71 = complex70.toString();
        org.apache.commons.math3.complex.Complex complex73 = complex70.divide((double) 100L);
        org.apache.commons.math3.complex.Complex complex74 = complex67.multiply(complex70);
        org.apache.commons.math3.complex.Complex complex75 = complex74.exp();
        org.apache.commons.math3.complex.Complex complex77 = complex74.multiply((int) ' ');
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
        org.junit.Assert.assertNotNull(complex70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "(NaN, NaN)" + "'", str71, "(NaN, NaN)");
        org.junit.Assert.assertNotNull(complex73);
        org.junit.Assert.assertNotNull(complex74);
        org.junit.Assert.assertNotNull(complex75);
        org.junit.Assert.assertNotNull(complex77);
    }
}

