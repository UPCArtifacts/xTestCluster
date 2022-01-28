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
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex5 = complex1.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex6 = complex5.log();
        org.apache.commons.math3.complex.Complex complex8 = complex5.subtract((double) 10L);
        boolean boolean9 = complex8.isInfinite();
        boolean boolean10 = complex8.isNaN();
        org.apache.commons.math3.complex.Complex complex11 = complex8.sqrt1z();
        org.apache.commons.math3.complex.Complex complex12 = complex8.tan();
        org.apache.commons.math3.complex.Complex complex15 = org.apache.commons.math3.complex.Complex.valueOf((-1.2613182101454838E-15d), 0.7219067166708869d);
        org.apache.commons.math3.complex.Complex complex16 = complex12.add(complex15);
        double double17 = complex12.getImaginary();
        org.apache.commons.math3.complex.Complex complex18 = complex12.negate();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(complex18);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex((double) (-1L));
        org.apache.commons.math3.complex.Complex complex2 = complex1.tanh();
        org.apache.commons.math3.complex.Complex complex4 = complex1.multiply((int) (short) 1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex1 = complex0.cosh();
        boolean boolean2 = complex0.isInfinite();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math3.complex.Complex complex3 = complex1.sqrt();
        org.apache.commons.math3.complex.Complex complex4 = complex3.tanh();
        org.apache.commons.math3.complex.Complex complex5 = complex4.acos();
        org.apache.commons.math3.complex.Complex complex7 = complex5.multiply((double) '4');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList9 = complex5.nthRoot((int) '4');
        org.apache.commons.math3.complex.Complex complex10 = complex5.cos();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complexList9);
        org.junit.Assert.assertNotNull(complex10);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
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
        org.apache.commons.math3.complex.Complex complex20 = complex17.sin();
        org.apache.commons.math3.complex.Complex complex21 = complex20.exp();
        org.apache.commons.math3.complex.Complex complex22 = complex20.negate();
        boolean boolean23 = complex22.isNaN();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex3.sinh();
        org.apache.commons.math3.complex.Complex complex5 = complex4.acos();
        org.apache.commons.math3.complex.Complex complex7 = complex5.add(2.820679600601607E-23d);
        org.apache.commons.math3.complex.Complex complex8 = complex5.acos();
        org.apache.commons.math3.complex.Complex complex10 = complex8.add((double) 'a');
        org.apache.commons.math3.complex.ComplexField complexField11 = complex10.getField();
        org.apache.commons.math3.complex.Complex complex12 = complex10.negate();
        org.apache.commons.math3.complex.Complex complex13 = complex12.reciprocal();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complexField11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 10, (double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex4 = complex2.add((double) (byte) 10);
        org.apache.commons.math3.complex.Complex complex5 = complex4.exp();
        org.apache.commons.math3.complex.Complex complex6 = complex4.log();
        org.apache.commons.math3.complex.Complex complex7 = complex4.exp();
        org.apache.commons.math3.complex.Complex complex8 = complex4.log();
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
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
        double double21 = complex17.getArgument();
        java.lang.Class<?> wildcardClass22 = complex17.getClass();
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
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-0.0d) + "'", double21 == (-0.0d));
        org.junit.Assert.assertNotNull(wildcardClass22);
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
        java.util.List<org.apache.commons.math3.complex.Complex> complexList24 = complex22.nthRoot((int) '4');
        org.apache.commons.math3.complex.Complex complex25 = complex22.cos();
        org.apache.commons.math3.complex.Complex complex26 = complex22.sin();
        org.apache.commons.math3.complex.Complex complex27 = complex26.cosh();
        org.apache.commons.math3.complex.Complex complex28 = complex27.reciprocal();
        org.apache.commons.math3.complex.Complex complex29 = complex27.cosh();
        org.apache.commons.math3.complex.Complex complex31 = complex27.multiply(1.5430806348152437d);
        org.apache.commons.math3.complex.Complex complex32 = complex31.sqrt();
        org.apache.commons.math3.complex.Complex complex34 = complex32.add(8.509181282393216d);
        org.apache.commons.math3.complex.Complex complex35 = complex34.asin();
        org.apache.commons.math3.complex.Complex complex37 = complex35.add(0.7219067166708869d);
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
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex37);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) (-1.0f), (double) 100.0f);
        org.apache.commons.math3.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math3.complex.Complex complex5 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex6 = complex5.exp();
        double double7 = complex5.getArgument();
        org.apache.commons.math3.complex.Complex complex9 = complex5.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex10 = complex5.exp();
        org.apache.commons.math3.complex.Complex complex11 = complex2.pow(complex10);
        org.apache.commons.math3.complex.Complex complex12 = complex2.sin();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) (byte) 100, 0.0d);
        org.apache.commons.math3.complex.Complex complex3 = complex2.sqrt();
        java.lang.String str4 = complex3.toString();
        org.apache.commons.math3.complex.Complex complex5 = complex3.reciprocal();
        org.apache.commons.math3.complex.Complex complex6 = complex3.sqrt();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(10.0, 0.0)" + "'", str4, "(10.0, 0.0)");
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
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
        org.apache.commons.math3.complex.Complex complex41 = complex39.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList43 = complex39.nthRoot((int) (short) 100);
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
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complexList43);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
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
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex50);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((double) 100.0f, (double) (short) 1);
        org.apache.commons.math3.complex.ComplexField complexField3 = complex2.getField();
        org.apache.commons.math3.complex.Complex complex5 = new org.apache.commons.math3.complex.Complex((double) 100L);
        org.apache.commons.math3.complex.Complex complex7 = complex5.divide((double) (-1));
        org.apache.commons.math3.complex.Complex complex8 = complex2.subtract(complex5);
        org.apache.commons.math3.complex.Complex complex9 = complex2.sqrt1z();
        org.apache.commons.math3.complex.Complex complex10 = complex2.asin();
        org.apache.commons.math3.complex.Complex complex11 = complex10.cos();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complexField3);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex3.sinh();
        org.apache.commons.math3.complex.Complex complex5 = complex4.acos();
        java.lang.Class<?> wildcardClass6 = complex4.getClass();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex1 = complex0.sqrt1z();
        org.apache.commons.math3.complex.Complex complex2 = complex0.tanh();
        org.apache.commons.math3.complex.Complex complex3 = complex0.sinh();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
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
        org.apache.commons.math3.complex.Complex complex28 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double29 = complex28.getImaginary();
        org.apache.commons.math3.complex.Complex complex30 = complex28.negate();
        org.apache.commons.math3.complex.Complex complex32 = complex30.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex33 = complex32.atan();
        org.apache.commons.math3.complex.Complex complex35 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double36 = complex35.getImaginary();
        org.apache.commons.math3.complex.Complex complex37 = complex35.negate();
        org.apache.commons.math3.complex.Complex complex39 = complex37.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex40 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex41 = complex37.subtract(complex40);
        org.apache.commons.math3.complex.Complex complex42 = complex32.divide(complex41);
        org.apache.commons.math3.complex.Complex complex44 = complex32.divide(1.0349512282932293E22d);
        org.apache.commons.math3.complex.Complex complex45 = complex22.divide(complex44);
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
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex45);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex3.tanh();
        org.apache.commons.math3.complex.Complex complex8 = complex3.divide((double) 10L);
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
        org.apache.commons.math3.complex.Complex complex49 = complex48.tanh();
        org.apache.commons.math3.complex.Complex complex50 = complex3.pow(complex49);
        double double51 = complex3.getImaginary();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.math3.complex.Complex> complexList53 = complex3.nthRoot((int) (byte) 0);
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
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + (-0.0d) + "'", double51 == (-0.0d));
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((double) 100.0f, (double) (short) 1);
        org.apache.commons.math3.complex.ComplexField complexField3 = complex2.getField();
        org.apache.commons.math3.complex.Complex complex5 = new org.apache.commons.math3.complex.Complex((double) 100L);
        org.apache.commons.math3.complex.Complex complex7 = complex5.divide((double) (-1));
        org.apache.commons.math3.complex.Complex complex8 = complex2.subtract(complex5);
        org.apache.commons.math3.complex.Complex complex9 = complex8.acos();
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
        org.apache.commons.math3.complex.Complex complex34 = complex8.subtract(complex30);
        boolean boolean35 = complex30.isNaN();
        org.apache.commons.math3.complex.Complex complex36 = complex30.tan();
        org.apache.commons.math3.complex.Complex complex37 = complex36.sinh();
        org.apache.commons.math3.complex.Complex complex38 = complex37.cosh();
        org.apache.commons.math3.complex.Complex complex40 = complex38.add(26.978392951571227d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complexField3);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(complexField32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex40);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math3.complex.Complex complex3 = complex1.sqrt();
        double double4 = complex1.getReal();
        org.apache.commons.math3.complex.Complex complex6 = complex1.add((-0.0d));
        java.lang.String str7 = complex1.toString();
        org.apache.commons.math3.complex.Complex complex8 = complex1.log();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(1.0, 0.0)" + "'", str7, "(1.0, 0.0)");
        org.junit.Assert.assertNotNull(complex8);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex(1.0349512282932293E22d);
        org.apache.commons.math3.complex.Complex complex3 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex3.exp();
        double double5 = complex3.getArgument();
        org.apache.commons.math3.complex.Complex complex7 = complex3.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex8 = complex3.sin();
        org.apache.commons.math3.complex.Complex complex9 = complex3.cosh();
        org.apache.commons.math3.complex.Complex complex10 = complex3.tan();
        org.apache.commons.math3.complex.Complex complex11 = complex3.tan();
        org.apache.commons.math3.complex.Complex complex13 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex14 = complex13.exp();
        double double15 = complex13.getArgument();
        org.apache.commons.math3.complex.Complex complex17 = complex13.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex18 = complex13.sin();
        org.apache.commons.math3.complex.Complex complex19 = complex13.cosh();
        org.apache.commons.math3.complex.Complex complex20 = complex13.tan();
        org.apache.commons.math3.complex.Complex complex21 = complex13.tan();
        org.apache.commons.math3.complex.Complex complex23 = complex13.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex24 = complex11.subtract(complex13);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList26 = complex24.nthRoot((int) '4');
        org.apache.commons.math3.complex.Complex complex27 = complex24.cos();
        org.apache.commons.math3.complex.Complex complex28 = complex24.tanh();
        org.apache.commons.math3.complex.Complex complex29 = complex1.divide(complex28);
        org.apache.commons.math3.complex.Complex complex30 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex31 = complex30.log();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
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
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complexList26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math3.complex.Complex complex4 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double5 = complex4.getImaginary();
        org.apache.commons.math3.complex.Complex complex7 = complex4.pow((double) 100L);
        org.apache.commons.math3.complex.Complex complex8 = complex2.pow(complex7);
        org.apache.commons.math3.complex.Complex complex11 = new org.apache.commons.math3.complex.Complex((double) (short) -1, (double) '4');
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
        org.apache.commons.math3.complex.Complex complex26 = complex17.asin();
        java.lang.String str27 = complex26.toString();
        org.apache.commons.math3.complex.Complex complex28 = complex26.tanh();
        org.apache.commons.math3.complex.Complex complex29 = complex11.pow(complex26);
        org.apache.commons.math3.complex.Complex complex30 = complex29.exp();
        org.apache.commons.math3.complex.Complex complex32 = complex29.divide(3.296908309475615d);
        double double33 = complex29.abs();
        org.apache.commons.math3.complex.Complex complex34 = complex8.multiply(complex29);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complexList20);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "(1.5707963267948966, -0.0)" + "'", str27, "(1.5707963267948966, -0.0)");
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 496.1555684535999d + "'", double33 == 496.1555684535999d);
        org.junit.Assert.assertNotNull(complex34);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex((double) (byte) 10);
        org.apache.commons.math3.complex.Complex complex2 = complex1.sin();
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex3.sinh();
        org.apache.commons.math3.complex.Complex complex5 = complex4.tanh();
        org.apache.commons.math3.complex.Complex complex6 = complex5.sqrt1z();
        org.apache.commons.math3.complex.Complex complex7 = complex5.acos();
        org.apache.commons.math3.complex.Complex complex8 = complex7.cos();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((-32.0d), (double) '4');
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
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
        org.apache.commons.math3.complex.Complex complex54 = complex50.add((-2.0158089984440206E-8d));
        org.apache.commons.math3.complex.Complex complex56 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex57 = complex56.exp();
        double double58 = complex56.getArgument();
        org.apache.commons.math3.complex.Complex complex60 = complex56.pow((double) '#');
        boolean boolean61 = complex50.equals((java.lang.Object) complex60);
        double double62 = complex50.getReal();
        org.apache.commons.math3.complex.Complex complex64 = complex50.add(2.1415926494674857d);
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
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertNotNull(complex54);
        org.junit.Assert.assertNotNull(complex56);
        org.junit.Assert.assertNotNull(complex57);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertNotNull(complex60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.6480542736638855d + "'", double62 == 0.6480542736638855d);
        org.junit.Assert.assertNotNull(complex64);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math3.complex.Complex complex3 = complex2.cos();
        org.apache.commons.math3.complex.Complex complex4 = complex3.asin();
        org.apache.commons.math3.complex.Complex complex5 = complex4.sqrt1z();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) (byte) 100, 0.0d);
        org.apache.commons.math3.complex.Complex complex3 = complex2.sqrt();
        org.apache.commons.math3.complex.Complex complex4 = complex3.atan();
        org.apache.commons.math3.complex.Complex complex5 = complex4.tan();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex7 = complex3.pow((double) 100L);
        org.apache.commons.math3.complex.Complex complex8 = complex3.acos();
        double double9 = complex8.abs();
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex12 = complex11.exp();
        double double13 = complex11.getArgument();
        org.apache.commons.math3.complex.Complex complex14 = complex11.log();
        org.apache.commons.math3.complex.Complex complex15 = complex11.log();
        org.apache.commons.math3.complex.Complex complex16 = complex15.exp();
        boolean boolean17 = complex8.equals((java.lang.Object) complex15);
        org.apache.commons.math3.complex.Complex complex19 = complex15.divide(1.4090092838232064d);
        org.apache.commons.math3.complex.Complex complex20 = complex15.tan();
        org.apache.commons.math3.complex.Complex complex21 = complex15.sin();
        org.apache.commons.math3.complex.Complex complex22 = complex15.sin();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.141592653589793d + "'", double9 == 3.141592653589793d);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((double) 10.0f, 96.0d);
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math3.complex.Complex complex3 = complex1.sqrt();
        org.apache.commons.math3.complex.Complex complex4 = complex1.sinh();
        org.apache.commons.math3.complex.Complex complex5 = complex1.tanh();
        boolean boolean6 = complex1.isInfinite();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
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
        org.apache.commons.math3.complex.Complex complex50 = complex49.asin();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complexList39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complexList46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex50);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
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
        org.apache.commons.math3.complex.Complex complex28 = complex27.sinh();
        org.apache.commons.math3.complex.Complex complex30 = complex27.add((-0.7853981633974483d));
        org.apache.commons.math3.complex.Complex complex31 = complex27.exp();
        boolean boolean32 = complex27.isInfinite();
        org.apache.commons.math3.complex.Complex complex33 = complex27.acos();
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
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(complex33);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex3.sinh();
        org.apache.commons.math3.complex.Complex complex5 = complex4.acos();
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex8 = complex7.exp();
        boolean boolean9 = complex8.isNaN();
        double double10 = complex8.getArgument();
        org.apache.commons.math3.complex.Complex complex11 = complex5.multiply(complex8);
        org.apache.commons.math3.complex.Complex complex12 = complex8.log();
        org.apache.commons.math3.complex.Complex complex13 = complex8.tan();
        double double14 = complex13.abs();
        org.apache.commons.math3.complex.Complex complex16 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex17 = complex16.exp();
        org.apache.commons.math3.complex.Complex complex18 = complex16.tanh();
        org.apache.commons.math3.complex.Complex complex19 = complex18.log();
        org.apache.commons.math3.complex.Complex complex20 = complex18.acos();
        org.apache.commons.math3.complex.Complex complex21 = complex18.log();
        org.apache.commons.math3.complex.Complex complex24 = new org.apache.commons.math3.complex.Complex((double) 10, (double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex26 = complex24.add((double) (byte) 10);
        double double27 = complex26.getImaginary();
        org.apache.commons.math3.complex.Complex complex28 = complex26.tan();
        org.apache.commons.math3.complex.Complex complex29 = complex26.sqrt();
        org.apache.commons.math3.complex.Complex complex30 = complex26.acos();
        org.apache.commons.math3.complex.Complex complex33 = new org.apache.commons.math3.complex.Complex(3.141592653589793d, 0.0d);
        org.apache.commons.math3.complex.Complex complex34 = complex33.acos();
        org.apache.commons.math3.complex.Complex complex35 = complex26.pow(complex34);
        boolean boolean36 = complex21.equals((java.lang.Object) complex35);
        org.apache.commons.math3.complex.Complex complex37 = complex13.pow(complex35);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.45054953406980763d + "'", double14 == 0.45054953406980763d);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(complex37);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 10, (double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex4 = complex2.add((double) (byte) 10);
        double double5 = complex4.getImaginary();
        org.apache.commons.math3.complex.Complex complex6 = complex4.tan();
        double double7 = complex6.getImaginary();
        org.apache.commons.math3.complex.Complex complex8 = complex6.cos();
        boolean boolean9 = complex8.isInfinite();
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
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
        org.apache.commons.math3.complex.Complex complex16 = complex15.atan();
        org.apache.commons.math3.complex.Complex complex17 = complex15.cosh();
        org.apache.commons.math3.complex.Complex complex18 = complex15.reciprocal();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex5.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex9 = complex5.negate();
        boolean boolean10 = complex5.isInfinite();
        org.apache.commons.math3.complex.Complex complex11 = complex5.sqrt1z();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexList8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(complex11);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) (short) -1, (double) '4');
        boolean boolean3 = complex2.isInfinite();
        org.apache.commons.math3.complex.Complex complex4 = complex2.acos();
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex7 = complex6.exp();
        double double8 = complex6.getArgument();
        org.apache.commons.math3.complex.Complex complex10 = complex6.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex11 = complex6.exp();
        org.apache.commons.math3.complex.Complex complex13 = complex11.multiply((int) (short) 0);
        org.apache.commons.math3.complex.Complex complex14 = complex11.tan();
        org.apache.commons.math3.complex.Complex complex16 = complex11.subtract(Double.NEGATIVE_INFINITY);
        org.apache.commons.math3.complex.Complex complex17 = complex4.divide(complex11);
        org.apache.commons.math3.complex.Complex complex19 = complex17.add(0.0d);
        org.apache.commons.math3.complex.Complex complex21 = complex19.multiply((int) (short) 10);
        boolean boolean22 = complex19.isInfinite();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
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
        org.apache.commons.math3.complex.Complex complex21 = complex20.exp();
        org.apache.commons.math3.complex.Complex complex22 = complex20.cosh();
        org.apache.commons.math3.complex.ComplexField complexField23 = complex20.getField();
        org.apache.commons.math3.complex.Complex complex24 = complex20.sqrt1z();
        org.apache.commons.math3.complex.Complex complex26 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex27 = complex26.exp();
        double double28 = complex26.getArgument();
        org.apache.commons.math3.complex.Complex complex29 = complex26.log();
        org.apache.commons.math3.complex.Complex complex30 = complex26.log();
        org.apache.commons.math3.complex.Complex complex31 = complex26.sqrt1z();
        org.apache.commons.math3.complex.Complex complex32 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex33 = complex31.add(complex32);
        org.apache.commons.math3.complex.Complex complex35 = complex33.subtract((double) ' ');
        org.apache.commons.math3.complex.Complex complex36 = complex35.negate();
        org.apache.commons.math3.complex.Complex complex38 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double39 = complex38.getImaginary();
        org.apache.commons.math3.complex.Complex complex40 = complex38.negate();
        org.apache.commons.math3.complex.Complex complex42 = complex40.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex43 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex44 = complex40.subtract(complex43);
        org.apache.commons.math3.complex.Complex complex45 = complex40.acos();
        double double46 = complex45.getImaginary();
        org.apache.commons.math3.complex.Complex complex48 = complex45.multiply((int) (short) -1);
        org.apache.commons.math3.complex.Complex complex49 = complex35.multiply(complex45);
        org.apache.commons.math3.complex.Complex complex50 = complex20.add(complex45);
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
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complexField23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + (-0.0d) + "'", double46 == (-0.0d));
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex50);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.acos();
        org.apache.commons.math3.complex.Complex complex6 = complex5.tanh();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex((-0.0d));
        org.apache.commons.math3.complex.Complex complex3 = complex1.divide((double) (short) 10);
        org.apache.commons.math3.complex.Complex complex4 = complex1.sin();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
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
        java.util.List<org.apache.commons.math3.complex.Complex> complexList27 = complex25.nthRoot(10);
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
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complexList27);
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
        java.util.List<org.apache.commons.math3.complex.Complex> complexList35 = complex29.nthRoot((int) '4');
        double double36 = complex29.getReal();
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
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 1.0d + "'", double33 == 1.0d);
        org.junit.Assert.assertNotNull(complexList35);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 1.0d + "'", double36 == 1.0d);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math3.complex.Complex complex4 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double5 = complex4.getImaginary();
        org.apache.commons.math3.complex.Complex complex7 = complex4.pow((double) 100L);
        org.apache.commons.math3.complex.Complex complex8 = complex2.pow(complex7);
        double double9 = complex7.abs();
        org.apache.commons.math3.complex.Complex complex10 = complex7.negate();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(complex10);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex(1.5430806348152437d);
        org.apache.commons.math3.complex.Complex complex3 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex3.exp();
        org.apache.commons.math3.complex.Complex complex5 = complex3.tanh();
        org.apache.commons.math3.complex.Complex complex6 = complex5.log();
        org.apache.commons.math3.complex.Complex complex7 = complex5.acos();
        double double8 = complex5.getImaginary();
        org.apache.commons.math3.complex.Complex complex9 = complex5.sqrt1z();
        org.apache.commons.math3.complex.Complex complex10 = complex9.conjugate();
        boolean boolean11 = complex1.equals((java.lang.Object) complex9);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((-32.0d), 9.885539019535031E-14d);
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList6 = complex4.nthRoot((int) 'a');
        org.apache.commons.math3.complex.Complex complex8 = complex4.add((double) (-1.0f));
        boolean boolean9 = complex4.isNaN();
        org.apache.commons.math3.complex.Complex complex11 = complex4.multiply((double) 100);
        org.apache.commons.math3.complex.Complex complex12 = complex11.cosh();
        org.apache.commons.math3.complex.Complex complex13 = complex11.log();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complexList6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
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
        org.apache.commons.math3.complex.Complex complex54 = complex50.add((-2.0158089984440206E-8d));
        org.apache.commons.math3.complex.Complex complex55 = complex50.atan();
        org.apache.commons.math3.complex.Complex complex56 = complex55.log();
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
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertNotNull(complex54);
        org.junit.Assert.assertNotNull(complex55);
        org.junit.Assert.assertNotNull(complex56);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
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
        double double17 = complex12.abs();
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(complexField16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
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
        org.apache.commons.math3.complex.Complex complex40 = org.apache.commons.math3.complex.Complex.valueOf((double) 100.0f, (double) (short) 1);
        org.apache.commons.math3.complex.ComplexField complexField41 = complex40.getField();
        org.apache.commons.math3.complex.Complex complex43 = new org.apache.commons.math3.complex.Complex((double) 100L);
        org.apache.commons.math3.complex.Complex complex45 = complex43.divide((double) (-1));
        org.apache.commons.math3.complex.Complex complex46 = complex40.subtract(complex43);
        org.apache.commons.math3.complex.Complex complex47 = complex40.sqrt1z();
        org.apache.commons.math3.complex.Complex complex48 = complex40.asin();
        org.apache.commons.math3.complex.Complex complex49 = complex36.subtract(complex48);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complexField41);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex49);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.sin();
        org.apache.commons.math3.complex.Complex complex7 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex9 = complex1.multiply((double) 1);
        org.apache.commons.math3.complex.Complex complex10 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex11 = complex10.acos();
        org.apache.commons.math3.complex.Complex complex12 = complex11.log();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((-1.1941271262033388E-22d), 0.0d);
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
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
        org.apache.commons.math3.complex.Complex complex29 = complex26.cosh();
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
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
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
        org.apache.commons.math3.complex.Complex complex14 = complex7.sqrt1z();
        org.apache.commons.math3.complex.Complex complex15 = complex14.acos();
        org.apache.commons.math3.complex.Complex complex16 = complex15.tan();
        org.apache.commons.math3.complex.Complex complex18 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex19 = complex18.exp();
        double double20 = complex18.getArgument();
        org.apache.commons.math3.complex.Complex complex22 = complex18.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex23 = complex18.sin();
        org.apache.commons.math3.complex.Complex complex24 = complex18.cosh();
        org.apache.commons.math3.complex.Complex complex25 = complex18.tan();
        org.apache.commons.math3.complex.Complex complex26 = complex18.tan();
        org.apache.commons.math3.complex.Complex complex28 = complex18.subtract((double) (short) -1);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList30 = complex18.nthRoot(100);
        org.apache.commons.math3.complex.Complex complex31 = complex18.sinh();
        org.apache.commons.math3.complex.Complex complex34 = new org.apache.commons.math3.complex.Complex((double) 10, (double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex36 = complex34.add((double) (byte) 10);
        org.apache.commons.math3.complex.Complex complex38 = complex36.pow(1.0d);
        org.apache.commons.math3.complex.Complex complex39 = complex38.sin();
        org.apache.commons.math3.complex.Complex complex41 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex42 = complex41.exp();
        double double43 = complex41.getArgument();
        org.apache.commons.math3.complex.Complex complex44 = complex41.log();
        org.apache.commons.math3.complex.Complex complex45 = complex41.log();
        org.apache.commons.math3.complex.Complex complex47 = complex45.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex48 = complex38.multiply(complex45);
        org.apache.commons.math3.complex.Complex complex50 = complex45.divide(1.0349512282932293E22d);
        org.apache.commons.math3.complex.Complex complex51 = complex45.cosh();
        boolean boolean52 = complex18.equals((java.lang.Object) complex51);
        org.apache.commons.math3.complex.Complex complex54 = complex18.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex56 = complex54.subtract((double) (short) 100);
        org.apache.commons.math3.complex.Complex complex57 = complex15.pow(complex54);
        boolean boolean58 = complex57.isInfinite();
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
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complexList30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(complex54);
        org.junit.Assert.assertNotNull(complex56);
        org.junit.Assert.assertNotNull(complex57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
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
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(NaN, NaN)" + "'", str12, "(NaN, NaN)");
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex6 = complex5.negate();
        org.apache.commons.math3.complex.Complex complex7 = complex6.sqrt();
        org.apache.commons.math3.complex.Complex complex9 = complex6.multiply(2.0d);
        org.apache.commons.math3.complex.ComplexField complexField10 = complex6.getField();
        org.apache.commons.math3.complex.Complex complex11 = complex6.sqrt1z();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complexField10);
        org.junit.Assert.assertNotNull(complex11);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
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
        org.apache.commons.math3.complex.Complex complex40 = complex36.negate();
        org.apache.commons.math3.complex.Complex complex41 = complex40.atan();
        org.apache.commons.math3.complex.Complex complex43 = complex41.add((-1.0d));
        org.apache.commons.math3.complex.Complex complex44 = complex43.sin();
        boolean boolean45 = complex43.isInfinite();
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
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) (-1.0f), (double) 100.0f);
        org.apache.commons.math3.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math3.complex.Complex complex5 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex6 = complex5.exp();
        double double7 = complex5.getArgument();
        org.apache.commons.math3.complex.Complex complex9 = complex5.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex10 = complex5.exp();
        org.apache.commons.math3.complex.Complex complex11 = complex2.pow(complex10);
        org.apache.commons.math3.complex.Complex complex13 = complex2.pow(1.5430806348152437d);
        org.apache.commons.math3.complex.Complex complex15 = complex13.add((-2.995732273553991d));
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex15);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
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
        org.apache.commons.math3.complex.Complex complex17 = complex16.sinh();
        org.apache.commons.math3.complex.Complex complex18 = complex17.sinh();
        org.apache.commons.math3.complex.Complex complex19 = complex17.sinh();
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
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex4.exp();
        double double6 = complex5.getArgument();
        org.apache.commons.math3.complex.Complex complex7 = complex5.atan();
        org.apache.commons.math3.complex.Complex complex9 = complex7.subtract(2.820679600601607E-23d);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf(100.0d, (double) (short) 100);
        org.apache.commons.math3.complex.Complex complex4 = complex2.add(0.0d);
        org.apache.commons.math3.complex.Complex complex5 = complex2.sin();
        org.apache.commons.math3.complex.Complex complex6 = complex5.cos();
        org.apache.commons.math3.complex.Complex complex7 = complex5.conjugate();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tanh();
        org.apache.commons.math3.complex.Complex complex4 = complex3.log();
        org.apache.commons.math3.complex.Complex complex5 = complex3.acos();
        org.apache.commons.math3.complex.Complex complex6 = complex5.acos();
        org.apache.commons.math3.complex.Complex complex7 = complex5.reciprocal();
        org.apache.commons.math3.complex.Complex complex8 = complex5.log();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex2 = complex1.tanh();
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex7 = complex3.subtract(complex6);
        org.apache.commons.math3.complex.Complex complex8 = complex6.sqrt();
        org.apache.commons.math3.complex.Complex complex9 = complex6.exp();
        org.apache.commons.math3.complex.Complex complex10 = complex6.asin();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
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
        org.apache.commons.math3.complex.Complex complex33 = complex31.multiply((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex34 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex35 = complex34.sqrt1z();
        org.apache.commons.math3.complex.Complex complex36 = complex34.sqrt();
        double double37 = complex34.abs();
        org.apache.commons.math3.complex.Complex complex38 = complex34.sqrt();
        org.apache.commons.math3.complex.Complex complex40 = complex38.divide(1.5037960103594437d);
        boolean boolean41 = complex33.equals((java.lang.Object) complex38);
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
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complexList29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
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
        org.apache.commons.math3.complex.Complex complex21 = complex19.reciprocal();
        org.apache.commons.math3.complex.Complex complex22 = complex21.acos();
        org.apache.commons.math3.complex.Complex complex24 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex25 = complex24.exp();
        double double26 = complex24.getArgument();
        org.apache.commons.math3.complex.Complex complex28 = complex24.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex29 = complex24.exp();
        org.apache.commons.math3.complex.Complex complex31 = complex29.multiply((int) (short) 0);
        double double32 = complex29.getArgument();
        org.apache.commons.math3.complex.Complex complex33 = complex22.pow(complex29);
        org.apache.commons.math3.complex.Complex complex34 = complex29.exp();
        org.apache.commons.math3.complex.Complex complex35 = complex29.cosh();
        org.apache.commons.math3.complex.Complex complex36 = complex35.asin();
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
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex6 = complex5.exp();
        double double7 = complex5.getArgument();
        org.apache.commons.math3.complex.Complex complex9 = complex5.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex10 = complex5.sin();
        org.apache.commons.math3.complex.Complex complex11 = complex5.cosh();
        org.apache.commons.math3.complex.Complex complex12 = complex5.tan();
        org.apache.commons.math3.complex.Complex complex14 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex15 = complex14.exp();
        double double16 = complex14.getArgument();
        org.apache.commons.math3.complex.Complex complex18 = complex14.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex19 = complex14.sin();
        org.apache.commons.math3.complex.Complex complex20 = complex14.cosh();
        org.apache.commons.math3.complex.Complex complex21 = complex14.tan();
        org.apache.commons.math3.complex.Complex complex22 = complex14.tan();
        org.apache.commons.math3.complex.Complex complex24 = complex14.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex25 = complex12.pow(complex24);
        org.apache.commons.math3.complex.Complex complex26 = complex1.subtract(complex24);
        org.apache.commons.math3.complex.Complex complex28 = complex1.multiply(100);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
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
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex28);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
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
        org.apache.commons.math3.complex.Complex complex36 = complex34.acos();
        org.apache.commons.math3.complex.Complex complex37 = complex36.tan();
        boolean boolean38 = complex36.isNaN();
        org.apache.commons.math3.complex.Complex complex40 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex41 = complex40.exp();
        double double42 = complex40.getArgument();
        org.apache.commons.math3.complex.Complex complex43 = complex40.log();
        org.apache.commons.math3.complex.Complex complex44 = complex40.log();
        org.apache.commons.math3.complex.Complex complex46 = complex44.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex47 = complex44.sqrt();
        double double48 = complex44.getImaginary();
        org.apache.commons.math3.complex.Complex complex49 = complex44.exp();
        boolean boolean50 = complex36.equals((java.lang.Object) complex49);
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
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex6 = complex5.negate();
        org.apache.commons.math3.complex.Complex complex7 = complex6.sqrt();
        org.apache.commons.math3.complex.Complex complex9 = complex6.multiply(2.0d);
        org.apache.commons.math3.complex.Complex complex10 = complex6.asin();
        org.apache.commons.math3.complex.Complex complex12 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex13 = complex12.exp();
        double double14 = complex12.getArgument();
        org.apache.commons.math3.complex.Complex complex16 = complex12.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex17 = complex12.sin();
        org.apache.commons.math3.complex.Complex complex18 = complex12.cosh();
        boolean boolean20 = complex12.equals((java.lang.Object) 0.0d);
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
        org.apache.commons.math3.complex.Complex complex46 = complex43.cos();
        org.apache.commons.math3.complex.Complex complex47 = complex43.sin();
        org.apache.commons.math3.complex.Complex complex48 = complex47.cosh();
        org.apache.commons.math3.complex.Complex complex49 = complex48.reciprocal();
        org.apache.commons.math3.complex.Complex complex51 = complex49.multiply(10);
        org.apache.commons.math3.complex.Complex complex53 = complex51.divide(0.8414709848078965d);
        org.apache.commons.math3.complex.Complex complex55 = org.apache.commons.math3.complex.Complex.valueOf(1.5430806348152437d);
        org.apache.commons.math3.complex.Complex complex56 = complex53.pow(complex55);
        org.apache.commons.math3.complex.Complex complex57 = complex12.divide(complex55);
        org.apache.commons.math3.complex.Complex complex58 = complex10.divide(complex12);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complexList45);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertNotNull(complex53);
        org.junit.Assert.assertNotNull(complex55);
        org.junit.Assert.assertNotNull(complex56);
        org.junit.Assert.assertNotNull(complex57);
        org.junit.Assert.assertNotNull(complex58);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
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
        org.apache.commons.math3.complex.Complex complex15 = complex13.sqrt1z();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
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
        org.apache.commons.math3.complex.Complex complex22 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double23 = complex22.getImaginary();
        org.apache.commons.math3.complex.Complex complex24 = complex22.negate();
        org.apache.commons.math3.complex.Complex complex26 = complex24.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex27 = complex26.atan();
        org.apache.commons.math3.complex.Complex complex28 = complex14.divide(complex27);
        org.apache.commons.math3.complex.Complex complex31 = new org.apache.commons.math3.complex.Complex((double) (short) -1, (double) '4');
        org.apache.commons.math3.complex.Complex complex32 = complex31.cos();
        org.apache.commons.math3.complex.Complex complex34 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex35 = complex34.sqrt();
        org.apache.commons.math3.complex.Complex complex36 = complex34.sqrt();
        org.apache.commons.math3.complex.Complex complex37 = complex36.tanh();
        org.apache.commons.math3.complex.Complex complex38 = complex31.divide(complex36);
        org.apache.commons.math3.complex.ComplexField complexField39 = complex38.getField();
        org.apache.commons.math3.complex.Complex complex40 = complex28.pow(complex38);
        org.apache.commons.math3.complex.Complex complex41 = complex38.tan();
        java.lang.String str42 = complex38.toString();
        org.apache.commons.math3.complex.ComplexField complexField43 = complex38.getField();
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
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complexField39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "(-1.0, 52.0)" + "'", str42, "(-1.0, 52.0)");
        org.junit.Assert.assertNotNull(complexField43);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 10, (double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex4 = complex2.add((double) (byte) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex4.pow(1.0d);
        org.apache.commons.math3.complex.Complex complex7 = complex6.sin();
        org.apache.commons.math3.complex.Complex complex9 = complex6.divide(1.0349512282932293E22d);
        org.apache.commons.math3.complex.Complex complex10 = complex6.cos();
        org.apache.commons.math3.complex.Complex complex11 = complex6.atan();
        org.apache.commons.math3.complex.Complex complex12 = complex6.sinh();
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 0.0f, (double) 10.0f);
        double double3 = complex2.abs();
        org.apache.commons.math3.complex.Complex complex5 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex6 = complex5.sqrt();
        org.apache.commons.math3.complex.Complex complex7 = complex5.sqrt();
        org.apache.commons.math3.complex.Complex complex8 = complex5.sinh();
        org.apache.commons.math3.complex.ComplexField complexField9 = complex8.getField();
        org.apache.commons.math3.complex.Complex complex10 = complex2.multiply(complex8);
        org.apache.commons.math3.complex.Complex complex11 = complex2.sinh();
        org.apache.commons.math3.complex.Complex complex12 = complex2.sinh();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complexField9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((double) 100.0f, (double) (short) 1);
        org.apache.commons.math3.complex.ComplexField complexField3 = complex2.getField();
        org.apache.commons.math3.complex.Complex complex5 = new org.apache.commons.math3.complex.Complex((double) 100L);
        org.apache.commons.math3.complex.Complex complex7 = complex5.divide((double) (-1));
        org.apache.commons.math3.complex.Complex complex8 = complex2.subtract(complex5);
        org.apache.commons.math3.complex.Complex complex9 = complex8.log();
        double double10 = complex8.getReal();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complexField3);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
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
        double double12 = complex10.getArgument();
        org.apache.commons.math3.complex.Complex complex14 = complex10.pow(0.0d);
        org.apache.commons.math3.complex.Complex complex17 = new org.apache.commons.math3.complex.Complex((double) 'a', 0.0d);
        org.apache.commons.math3.complex.Complex complex18 = complex17.negate();
        org.apache.commons.math3.complex.Complex complex19 = complex14.subtract(complex17);
        org.apache.commons.math3.complex.Complex complex20 = complex19.atan();
        double double21 = complex20.abs();
        org.apache.commons.math3.complex.Complex complex22 = complex20.asin();
        org.apache.commons.math3.complex.Complex complex23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.complex.Complex complex24 = complex20.pow(complex23);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 3.110352820159525d + "'", double12 == 3.110352820159525d);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.560380036863927d + "'", double21 == 1.560380036863927d);
        org.junit.Assert.assertNotNull(complex22);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex3.sinh();
        org.apache.commons.math3.complex.Complex complex5 = complex4.acos();
        org.apache.commons.math3.complex.Complex complex7 = complex5.add(2.820679600601607E-23d);
        org.apache.commons.math3.complex.Complex complex8 = complex5.acos();
        org.apache.commons.math3.complex.Complex complex10 = complex8.add((double) 'a');
        org.apache.commons.math3.complex.ComplexField complexField11 = complex10.getField();
        org.apache.commons.math3.complex.Complex complex12 = complex10.negate();
        org.apache.commons.math3.complex.Complex complex13 = complex10.tanh();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complexField11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex6 = complex5.sin();
        org.apache.commons.math3.complex.Complex complex9 = new org.apache.commons.math3.complex.Complex((double) 10, (double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex11 = complex9.add((double) (byte) 10);
        org.apache.commons.math3.complex.Complex complex13 = complex11.pow(1.0d);
        org.apache.commons.math3.complex.Complex complex14 = complex13.sin();
        org.apache.commons.math3.complex.Complex complex15 = complex6.pow(complex13);
        org.apache.commons.math3.complex.Complex complex17 = complex15.subtract(0.0d);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex17);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex(10.0d);
        org.apache.commons.math3.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex3 = complex1.sinh();
        java.lang.String str4 = complex3.toString();
        org.apache.commons.math3.complex.Complex complex7 = new org.apache.commons.math3.complex.Complex((double) (short) -1, (double) '4');
        boolean boolean8 = complex7.isInfinite();
        org.apache.commons.math3.complex.Complex complex11 = new org.apache.commons.math3.complex.Complex((double) 0L, (double) 100.0f);
        org.apache.commons.math3.complex.Complex complex12 = complex7.multiply(complex11);
        org.apache.commons.math3.complex.Complex complex13 = complex3.subtract(complex11);
        org.apache.commons.math3.complex.Complex complex16 = org.apache.commons.math3.complex.Complex.valueOf(0.0d, (double) (byte) -1);
        org.apache.commons.math3.complex.Complex complex17 = complex16.sinh();
        org.apache.commons.math3.complex.Complex complex18 = complex17.sinh();
        org.apache.commons.math3.complex.Complex complex19 = complex17.asin();
        org.apache.commons.math3.complex.Complex complex20 = complex3.add(complex19);
        org.apache.commons.math3.complex.Complex complex21 = complex20.tan();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(11013.232874703393, 0.0)" + "'", str4, "(11013.232874703393, 0.0)");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf(0.0d, (double) (byte) -1);
        org.apache.commons.math3.complex.Complex complex3 = complex2.sinh();
        org.apache.commons.math3.complex.Complex complex4 = complex2.tan();
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
        org.apache.commons.math3.complex.Complex complex19 = complex10.asin();
        java.lang.String str20 = complex19.toString();
        org.apache.commons.math3.complex.Complex complex22 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex23 = complex22.exp();
        double double24 = complex22.getArgument();
        org.apache.commons.math3.complex.Complex complex26 = complex22.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex27 = complex22.sin();
        org.apache.commons.math3.complex.Complex complex28 = complex22.cosh();
        org.apache.commons.math3.complex.Complex complex29 = complex22.tan();
        org.apache.commons.math3.complex.Complex complex30 = complex22.tan();
        org.apache.commons.math3.complex.Complex complex32 = complex22.subtract((double) (short) -1);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList34 = complex22.nthRoot(100);
        org.apache.commons.math3.complex.Complex complex35 = complex22.sinh();
        org.apache.commons.math3.complex.Complex complex36 = complex19.divide(complex22);
        org.apache.commons.math3.complex.Complex complex37 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex38 = complex37.sqrt1z();
        org.apache.commons.math3.complex.Complex complex39 = complex37.sqrt();
        org.apache.commons.math3.complex.Complex complex40 = complex36.pow(complex37);
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
        java.util.List<org.apache.commons.math3.complex.Complex> complexList65 = complex63.nthRoot((int) '4');
        org.apache.commons.math3.complex.Complex complex66 = complex63.cos();
        org.apache.commons.math3.complex.Complex complex67 = complex63.sin();
        org.apache.commons.math3.complex.Complex complex68 = complex63.atan();
        org.apache.commons.math3.complex.Complex complex69 = complex68.sin();
        org.apache.commons.math3.complex.Complex complex70 = complex36.subtract(complex69);
        org.apache.commons.math3.complex.Complex complex71 = complex2.add(complex36);
        org.apache.commons.math3.complex.Complex complex72 = complex71.sin();
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
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "(1.5707963267948966, -0.0)" + "'", str20, "(1.5707963267948966, -0.0)");
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complexList34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertNotNull(complex53);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertNotNull(complex56);
        org.junit.Assert.assertNotNull(complex57);
        org.junit.Assert.assertNotNull(complex58);
        org.junit.Assert.assertNotNull(complex59);
        org.junit.Assert.assertNotNull(complex60);
        org.junit.Assert.assertNotNull(complex62);
        org.junit.Assert.assertNotNull(complex63);
        org.junit.Assert.assertNotNull(complexList65);
        org.junit.Assert.assertNotNull(complex66);
        org.junit.Assert.assertNotNull(complex67);
        org.junit.Assert.assertNotNull(complex68);
        org.junit.Assert.assertNotNull(complex69);
        org.junit.Assert.assertNotNull(complex70);
        org.junit.Assert.assertNotNull(complex71);
        org.junit.Assert.assertNotNull(complex72);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
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
        org.apache.commons.math3.complex.Complex complex28 = complex22.pow((-96.0d));
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
        org.junit.Assert.assertNotNull(complex28);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math3.complex.Complex complex3 = complex2.cos();
        org.apache.commons.math3.complex.Complex complex4 = complex2.sin();
        org.apache.commons.math3.complex.Complex complex5 = complex2.negate();
        org.apache.commons.math3.complex.Complex complex7 = complex5.add(0.8509181282393216d);
        double double8 = complex7.abs();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.14908187176067844d + "'", double8 == 0.14908187176067844d);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
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
        org.apache.commons.math3.complex.Complex complex14 = complex3.multiply((int) (short) -1);
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
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((double) 1, 10.0d);
        org.apache.commons.math3.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math3.complex.Complex complex4 = complex3.acos();
        org.apache.commons.math3.complex.Complex complex5 = complex4.conjugate();
        org.apache.commons.math3.complex.Complex complex6 = complex4.tan();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf(52.009614495783374d, 100.0d);
        org.apache.commons.math3.complex.Complex complex4 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex5 = complex4.exp();
        org.apache.commons.math3.complex.Complex complex6 = complex4.acos();
        org.apache.commons.math3.complex.Complex complex8 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex9 = complex8.exp();
        boolean boolean10 = complex9.isNaN();
        org.apache.commons.math3.complex.Complex complex12 = complex9.pow((double) 0L);
        org.apache.commons.math3.complex.Complex complex15 = new org.apache.commons.math3.complex.Complex((double) (-1.0f), (double) 100.0f);
        org.apache.commons.math3.complex.Complex complex16 = complex12.pow(complex15);
        org.apache.commons.math3.complex.Complex complex17 = complex15.log();
        org.apache.commons.math3.complex.Complex complex18 = complex6.subtract(complex17);
        org.apache.commons.math3.complex.Complex complex19 = complex17.sin();
        boolean boolean20 = complex2.equals((java.lang.Object) complex19);
        org.apache.commons.math3.complex.Complex complex21 = complex19.log();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(complex21);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
        org.apache.commons.math3.complex.Complex complex3 = complex1.pow(0.0d);
        org.apache.commons.math3.complex.Complex complex6 = new org.apache.commons.math3.complex.Complex((double) (byte) 100, 0.0d);
        org.apache.commons.math3.complex.Complex complex7 = complex6.sqrt();
        org.apache.commons.math3.complex.Complex complex8 = complex7.tanh();
        org.apache.commons.math3.complex.Complex complex9 = complex8.reciprocal();
        org.apache.commons.math3.complex.Complex complex11 = complex9.subtract(3.141592653589793d);
        org.apache.commons.math3.complex.Complex complex12 = complex1.divide(complex11);
        org.apache.commons.math3.complex.Complex complex13 = complex12.asin();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
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
        org.apache.commons.math3.complex.Complex complex40 = complex5.conjugate();
        org.apache.commons.math3.complex.ComplexField complexField41 = complex5.getField();
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complexList14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "(1.5707963267948966, -0.0)" + "'", str21, "(1.5707963267948966, -0.0)");
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complexList35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complexField41);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) (-1.0f), (double) 100.0f);
        org.apache.commons.math3.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math3.complex.Complex complex5 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex6 = complex5.exp();
        double double7 = complex5.getArgument();
        org.apache.commons.math3.complex.Complex complex9 = complex5.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex10 = complex5.exp();
        org.apache.commons.math3.complex.Complex complex11 = complex2.pow(complex10);
        org.apache.commons.math3.complex.Complex complex12 = complex11.cos();
        double double13 = complex12.abs();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + Double.POSITIVE_INFINITY + "'", double13 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math3.complex.Complex complex4 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double5 = complex4.getImaginary();
        org.apache.commons.math3.complex.Complex complex7 = complex4.pow((double) 100L);
        org.apache.commons.math3.complex.Complex complex8 = complex2.pow(complex7);
        org.apache.commons.math3.complex.Complex complex9 = complex7.cosh();
        org.apache.commons.math3.complex.Complex complex12 = new org.apache.commons.math3.complex.Complex((double) (short) -1, (double) '4');
        boolean boolean13 = complex12.isInfinite();
        org.apache.commons.math3.complex.Complex complex16 = new org.apache.commons.math3.complex.Complex((double) 0L, (double) 100.0f);
        org.apache.commons.math3.complex.Complex complex17 = complex12.multiply(complex16);
        org.apache.commons.math3.complex.Complex complex18 = complex9.subtract(complex16);
        boolean boolean19 = complex9.isInfinite();
        org.apache.commons.math3.complex.Complex complex21 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double22 = complex21.getImaginary();
        org.apache.commons.math3.complex.Complex complex23 = complex21.negate();
        org.apache.commons.math3.complex.Complex complex25 = complex23.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex26 = complex25.atan();
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
        org.apache.commons.math3.complex.Complex complex40 = complex25.subtract(complex39);
        org.apache.commons.math3.complex.Complex complex41 = complex39.cosh();
        org.apache.commons.math3.complex.Complex complex43 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double44 = complex43.getImaginary();
        org.apache.commons.math3.complex.Complex complex45 = complex43.negate();
        org.apache.commons.math3.complex.Complex complex47 = complex45.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex48 = complex47.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList50 = complex47.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex52 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex53 = complex52.exp();
        org.apache.commons.math3.complex.Complex complex54 = complex52.tanh();
        org.apache.commons.math3.complex.Complex complex55 = complex47.subtract(complex52);
        org.apache.commons.math3.complex.Complex complex57 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex58 = complex57.exp();
        double double59 = complex57.getArgument();
        org.apache.commons.math3.complex.Complex complex61 = complex57.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex62 = complex57.sin();
        org.apache.commons.math3.complex.Complex complex63 = complex57.cosh();
        org.apache.commons.math3.complex.Complex complex64 = complex57.tan();
        org.apache.commons.math3.complex.Complex complex65 = complex57.tan();
        org.apache.commons.math3.complex.Complex complex67 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex68 = complex67.exp();
        double double69 = complex67.getArgument();
        org.apache.commons.math3.complex.Complex complex71 = complex67.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex72 = complex67.sin();
        org.apache.commons.math3.complex.Complex complex73 = complex67.cosh();
        org.apache.commons.math3.complex.Complex complex74 = complex67.tan();
        org.apache.commons.math3.complex.Complex complex75 = complex67.tan();
        org.apache.commons.math3.complex.Complex complex77 = complex67.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex78 = complex65.subtract(complex67);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList80 = complex78.nthRoot((int) '4');
        org.apache.commons.math3.complex.Complex complex81 = complex52.subtract(complex78);
        org.apache.commons.math3.complex.Complex complex82 = complex39.pow(complex78);
        org.apache.commons.math3.complex.Complex complex83 = complex39.sqrt();
        org.apache.commons.math3.complex.Complex complex84 = complex9.add(complex83);
        org.apache.commons.math3.complex.Complex complex85 = complex83.tanh();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(complex23);
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
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complexList50);
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertNotNull(complex53);
        org.junit.Assert.assertNotNull(complex54);
        org.junit.Assert.assertNotNull(complex55);
        org.junit.Assert.assertNotNull(complex57);
        org.junit.Assert.assertNotNull(complex58);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.0d + "'", double59 == 0.0d);
        org.junit.Assert.assertNotNull(complex61);
        org.junit.Assert.assertNotNull(complex62);
        org.junit.Assert.assertNotNull(complex63);
        org.junit.Assert.assertNotNull(complex64);
        org.junit.Assert.assertNotNull(complex65);
        org.junit.Assert.assertNotNull(complex67);
        org.junit.Assert.assertNotNull(complex68);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 0.0d + "'", double69 == 0.0d);
        org.junit.Assert.assertNotNull(complex71);
        org.junit.Assert.assertNotNull(complex72);
        org.junit.Assert.assertNotNull(complex73);
        org.junit.Assert.assertNotNull(complex74);
        org.junit.Assert.assertNotNull(complex75);
        org.junit.Assert.assertNotNull(complex77);
        org.junit.Assert.assertNotNull(complex78);
        org.junit.Assert.assertNotNull(complexList80);
        org.junit.Assert.assertNotNull(complex81);
        org.junit.Assert.assertNotNull(complex82);
        org.junit.Assert.assertNotNull(complex83);
        org.junit.Assert.assertNotNull(complex84);
        org.junit.Assert.assertNotNull(complex85);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
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
        java.util.List<org.apache.commons.math3.complex.Complex> complexList41 = complex36.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex42 = complex36.asin();
        org.apache.commons.math3.complex.Complex complex43 = complex42.conjugate();
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
        org.junit.Assert.assertNotNull(complexList41);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex43);
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
        org.apache.commons.math3.complex.Complex complex14 = complex5.asin();
        java.lang.String str15 = complex14.toString();
        org.apache.commons.math3.complex.Complex complex16 = complex14.tanh();
        org.apache.commons.math3.complex.Complex complex18 = complex14.multiply((double) (short) 10);
        org.apache.commons.math3.complex.Complex complex20 = complex14.pow((double) (-1));
        org.apache.commons.math3.complex.Complex complex21 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex22 = complex21.negate();
        org.apache.commons.math3.complex.Complex complex23 = complex14.divide(complex22);
        org.apache.commons.math3.complex.Complex complex25 = complex22.divide((double) (short) 10);
        org.apache.commons.math3.complex.Complex complex26 = complex22.atan();
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
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) (byte) 100, 0.0d);
        org.apache.commons.math3.complex.Complex complex3 = complex2.log();
        org.apache.commons.math3.complex.Complex complex4 = complex3.tanh();
        double double5 = complex4.getArgument();
        double double6 = complex4.getArgument();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
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
        org.apache.commons.math3.complex.Complex complex32 = complex31.sqrt();
        boolean boolean33 = complex31.isInfinite();
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
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 10, (double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex4 = complex2.add((double) (byte) 10);
        org.apache.commons.math3.complex.Complex complex5 = complex4.exp();
        org.apache.commons.math3.complex.Complex complex7 = complex4.multiply(100);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList9 = complex7.nthRoot(100);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complexList9);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
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
        org.apache.commons.math3.complex.Complex complex31 = new org.apache.commons.math3.complex.Complex((double) 1.0f);
        boolean boolean32 = complex31.isNaN();
        org.apache.commons.math3.complex.Complex complex33 = complex27.multiply(complex31);
        org.apache.commons.math3.complex.Complex complex34 = complex31.sin();
        org.apache.commons.math3.complex.Complex complex35 = complex31.cos();
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
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
        org.apache.commons.math3.complex.Complex complex18 = org.apache.commons.math3.complex.Complex.valueOf(0.0d, (double) (byte) -1);
        org.apache.commons.math3.complex.Complex complex19 = complex5.pow(complex18);
        org.apache.commons.math3.complex.Complex complex20 = complex18.acos();
        org.apache.commons.math3.complex.Complex complex22 = complex20.multiply((int) (short) -1);
        org.apache.commons.math3.complex.Complex complex24 = complex22.add(8.509181282393216d);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex24);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((-4.392948198753447E-23d), (double) (short) 10);
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) (-1.0f), (double) 100.0f);
        org.apache.commons.math3.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math3.complex.Complex complex4 = complex2.asin();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex((-96.0d));
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex5 = complex1.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex6 = complex5.log();
        org.apache.commons.math3.complex.Complex complex8 = complex5.subtract((double) 10L);
        boolean boolean9 = complex8.isInfinite();
        org.apache.commons.math3.complex.Complex complex10 = complex8.acos();
        org.apache.commons.math3.complex.Complex complex11 = complex10.sinh();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 10, (double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex4 = complex2.add((double) (byte) 10);
        org.apache.commons.math3.complex.Complex complex5 = complex4.exp();
        boolean boolean6 = complex4.isNaN();
        org.apache.commons.math3.complex.Complex complex8 = org.apache.commons.math3.complex.Complex.valueOf((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex10 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double11 = complex10.getImaginary();
        org.apache.commons.math3.complex.Complex complex12 = complex10.negate();
        org.apache.commons.math3.complex.Complex complex14 = complex12.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex15 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex16 = complex12.subtract(complex15);
        org.apache.commons.math3.complex.Complex complex17 = complex15.sqrt();
        boolean boolean18 = complex8.equals((java.lang.Object) complex15);
        boolean boolean19 = complex4.equals((java.lang.Object) boolean18);
        boolean boolean20 = complex4.isNaN();
        java.lang.String str21 = complex4.toString();
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "(20.0, 0.0)" + "'", str21, "(20.0, 0.0)");
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex6 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex9 = new org.apache.commons.math3.complex.Complex((double) (short) -1, (double) '4');
        org.apache.commons.math3.complex.Complex complex10 = complex9.cos();
        org.apache.commons.math3.complex.Complex complex11 = complex6.divide(complex10);
        java.lang.String str12 = complex6.toString();
        org.apache.commons.math3.complex.Complex complex14 = complex6.multiply((int) (byte) 0);
        org.apache.commons.math3.complex.Complex complex15 = complex14.conjugate();
        org.apache.commons.math3.complex.Complex complex17 = complex15.pow(1.4461728085856087d);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(2.718281828459045, 0.0)" + "'", str12, "(2.718281828459045, 0.0)");
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex17);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 10, (double) (byte) 0);
        org.apache.commons.math3.complex.ComplexField complexField3 = complex2.getField();
        org.apache.commons.math3.complex.Complex complex4 = complex2.reciprocal();
        double double5 = complex4.getImaginary();
        org.apache.commons.math3.complex.Complex complex6 = complex4.reciprocal();
        org.junit.Assert.assertNotNull(complexField3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-0.0d) + "'", double5 == (-0.0d));
        org.junit.Assert.assertNotNull(complex6);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply(10);
        org.apache.commons.math3.complex.Complex complex6 = complex5.log();
        org.apache.commons.math3.complex.Complex complex8 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex9 = complex8.exp();
        double double10 = complex8.getArgument();
        org.apache.commons.math3.complex.Complex complex12 = complex8.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex13 = complex8.sin();
        org.apache.commons.math3.complex.Complex complex14 = complex8.sin();
        org.apache.commons.math3.complex.Complex complex15 = complex5.pow(complex8);
        org.apache.commons.math3.complex.ComplexField complexField16 = complex5.getField();
        org.apache.commons.math3.complex.Complex complex17 = complex5.exp();
        java.lang.String str18 = complex17.toString();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
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
        org.junit.Assert.assertNotNull(complexField16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "(1.122932220082353E33, 0.0)" + "'", str18, "(1.122932220082353E33, 0.0)");
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) (short) 10);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex4 = complex1.divide((double) (byte) 10);
        double double5 = complex4.getReal();
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex8 = complex7.exp();
        double double9 = complex7.getArgument();
        org.apache.commons.math3.complex.Complex complex11 = complex7.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex12 = complex7.sin();
        org.apache.commons.math3.complex.Complex complex13 = complex7.cosh();
        org.apache.commons.math3.complex.Complex complex14 = complex7.tan();
        org.apache.commons.math3.complex.Complex complex16 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex17 = complex16.exp();
        double double18 = complex16.getArgument();
        org.apache.commons.math3.complex.Complex complex20 = complex16.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex21 = complex16.sin();
        org.apache.commons.math3.complex.Complex complex22 = complex16.cosh();
        org.apache.commons.math3.complex.Complex complex23 = complex16.tan();
        org.apache.commons.math3.complex.Complex complex24 = complex16.tan();
        org.apache.commons.math3.complex.Complex complex26 = complex16.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex27 = complex14.pow(complex26);
        org.apache.commons.math3.complex.Complex complex28 = complex4.subtract(complex27);
        org.apache.commons.math3.complex.Complex complex30 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex31 = complex30.exp();
        double double32 = complex30.getArgument();
        org.apache.commons.math3.complex.Complex complex33 = complex30.log();
        org.apache.commons.math3.complex.Complex complex34 = complex30.log();
        org.apache.commons.math3.complex.Complex complex35 = complex30.sqrt1z();
        org.apache.commons.math3.complex.Complex complex36 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex37 = complex35.add(complex36);
        org.apache.commons.math3.complex.Complex complex39 = complex37.subtract((double) ' ');
        org.apache.commons.math3.complex.Complex complex40 = complex39.negate();
        double double41 = complex39.getArgument();
        org.apache.commons.math3.complex.Complex complex43 = complex39.pow(0.0d);
        org.apache.commons.math3.complex.Complex complex44 = complex4.subtract(complex39);
        boolean boolean45 = complex39.isNaN();
        org.apache.commons.math3.complex.Complex complex47 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double48 = complex47.getImaginary();
        org.apache.commons.math3.complex.Complex complex49 = complex47.negate();
        org.apache.commons.math3.complex.Complex complex51 = complex49.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex52 = complex51.atan();
        org.apache.commons.math3.complex.Complex complex54 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex55 = complex54.exp();
        double double56 = complex54.getArgument();
        org.apache.commons.math3.complex.Complex complex58 = complex54.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex59 = complex54.sin();
        org.apache.commons.math3.complex.Complex complex60 = complex54.cosh();
        org.apache.commons.math3.complex.Complex complex62 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double63 = complex62.getImaginary();
        boolean boolean64 = complex60.equals((java.lang.Object) double63);
        org.apache.commons.math3.complex.Complex complex65 = complex60.tanh();
        org.apache.commons.math3.complex.Complex complex66 = complex51.subtract(complex65);
        org.apache.commons.math3.complex.Complex complex67 = complex65.cosh();
        org.apache.commons.math3.complex.Complex complex68 = complex65.cos();
        boolean boolean70 = complex68.equals((java.lang.Object) 0.7853981633974483d);
        boolean boolean71 = complex39.equals((java.lang.Object) complex68);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
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
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 3.110352820159525d + "'", double41 == 3.110352820159525d);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertNotNull(complex54);
        org.junit.Assert.assertNotNull(complex55);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
        org.junit.Assert.assertNotNull(complex58);
        org.junit.Assert.assertNotNull(complex59);
        org.junit.Assert.assertNotNull(complex60);
        org.junit.Assert.assertNotNull(complex62);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.0d + "'", double63 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(complex65);
        org.junit.Assert.assertNotNull(complex66);
        org.junit.Assert.assertNotNull(complex67);
        org.junit.Assert.assertNotNull(complex68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math3.complex.Complex complex4 = complex2.add((double) (short) 1);
        org.apache.commons.math3.complex.Complex complex5 = complex2.sqrt1z();
        double double6 = complex5.getReal();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
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
        org.apache.commons.math3.complex.Complex complex8 = complex6.pow((-0.0d));
        double double9 = complex8.getReal();
        org.apache.commons.math3.complex.Complex complex11 = complex8.add(0.7853981633974483d);
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
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
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
        org.apache.commons.math3.complex.Complex complex54 = complex50.add((-2.0158089984440206E-8d));
        org.apache.commons.math3.complex.Complex complex57 = org.apache.commons.math3.complex.Complex.valueOf((double) 1, 10.0d);
        org.apache.commons.math3.complex.Complex complex58 = complex57.cosh();
        org.apache.commons.math3.complex.Complex complex59 = complex58.acos();
        org.apache.commons.math3.complex.Complex complex60 = complex54.add(complex59);
        org.apache.commons.math3.complex.Complex complex61 = complex59.exp();
        org.apache.commons.math3.complex.Complex complex64 = new org.apache.commons.math3.complex.Complex((double) (-1.0f), (double) 100.0f);
        org.apache.commons.math3.complex.Complex complex65 = complex64.sin();
        org.apache.commons.math3.complex.Complex complex66 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex67 = complex66.cosh();
        org.apache.commons.math3.complex.Complex complex68 = complex66.conjugate();
        org.apache.commons.math3.complex.Complex complex71 = new org.apache.commons.math3.complex.Complex((double) (short) -1, (double) '4');
        org.apache.commons.math3.complex.Complex complex72 = complex71.cos();
        org.apache.commons.math3.complex.Complex complex73 = complex66.subtract(complex71);
        org.apache.commons.math3.complex.Complex complex74 = complex65.multiply(complex71);
        org.apache.commons.math3.complex.Complex complex75 = complex74.atan();
        org.apache.commons.math3.complex.Complex complex77 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex78 = complex77.sqrt();
        org.apache.commons.math3.complex.Complex complex79 = complex77.sqrt();
        double double80 = complex77.getReal();
        org.apache.commons.math3.complex.Complex complex82 = complex77.add((-0.0d));
        org.apache.commons.math3.complex.Complex complex85 = new org.apache.commons.math3.complex.Complex((double) (byte) 100, 0.0d);
        org.apache.commons.math3.complex.Complex complex86 = complex85.sqrt();
        org.apache.commons.math3.complex.Complex complex87 = complex85.log();
        org.apache.commons.math3.complex.Complex complex89 = complex87.multiply((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex90 = complex87.tan();
        double double91 = complex90.getImaginary();
        org.apache.commons.math3.complex.Complex complex92 = complex90.sqrt();
        org.apache.commons.math3.complex.Complex complex93 = complex77.multiply(complex92);
        boolean boolean94 = complex75.equals((java.lang.Object) complex77);
        org.apache.commons.math3.complex.Complex complex95 = complex75.sinh();
        org.apache.commons.math3.complex.Complex complex96 = complex59.divide(complex95);
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
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertNotNull(complex54);
        org.junit.Assert.assertNotNull(complex57);
        org.junit.Assert.assertNotNull(complex58);
        org.junit.Assert.assertNotNull(complex59);
        org.junit.Assert.assertNotNull(complex60);
        org.junit.Assert.assertNotNull(complex61);
        org.junit.Assert.assertNotNull(complex65);
        org.junit.Assert.assertNotNull(complex66);
        org.junit.Assert.assertNotNull(complex67);
        org.junit.Assert.assertNotNull(complex68);
        org.junit.Assert.assertNotNull(complex72);
        org.junit.Assert.assertNotNull(complex73);
        org.junit.Assert.assertNotNull(complex74);
        org.junit.Assert.assertNotNull(complex75);
        org.junit.Assert.assertNotNull(complex78);
        org.junit.Assert.assertNotNull(complex79);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 1.0d + "'", double80 == 1.0d);
        org.junit.Assert.assertNotNull(complex82);
        org.junit.Assert.assertNotNull(complex86);
        org.junit.Assert.assertNotNull(complex87);
        org.junit.Assert.assertNotNull(complex89);
        org.junit.Assert.assertNotNull(complex90);
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 0.0d + "'", double91 == 0.0d);
        org.junit.Assert.assertNotNull(complex92);
        org.junit.Assert.assertNotNull(complex93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(complex95);
        org.junit.Assert.assertNotNull(complex96);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
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
        org.apache.commons.math3.complex.Complex complex17 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex18 = complex17.exp();
        org.apache.commons.math3.complex.Complex complex20 = complex18.subtract(2.820679600601607E-23d);
        org.apache.commons.math3.complex.Complex complex21 = complex20.tanh();
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
        org.apache.commons.math3.complex.Complex complex47 = complex44.cos();
        org.apache.commons.math3.complex.Complex complex48 = complex44.sin();
        org.apache.commons.math3.complex.Complex complex49 = complex48.cosh();
        org.apache.commons.math3.complex.Complex complex50 = complex49.sin();
        org.apache.commons.math3.complex.Complex complex51 = complex21.pow(complex50);
        org.apache.commons.math3.complex.Complex complex52 = complex12.multiply(complex51);
        org.apache.commons.math3.complex.Complex complex54 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex55 = complex54.exp();
        double double56 = complex54.getArgument();
        org.apache.commons.math3.complex.Complex complex58 = complex54.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex59 = complex54.exp();
        org.apache.commons.math3.complex.Complex complex60 = complex52.add(complex59);
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
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
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertNotNull(complex54);
        org.junit.Assert.assertNotNull(complex55);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
        org.junit.Assert.assertNotNull(complex58);
        org.junit.Assert.assertNotNull(complex59);
        org.junit.Assert.assertNotNull(complex60);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math3.complex.Complex complex4 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double5 = complex4.getImaginary();
        org.apache.commons.math3.complex.Complex complex7 = complex4.pow((double) 100L);
        org.apache.commons.math3.complex.Complex complex8 = complex2.pow(complex7);
        org.apache.commons.math3.complex.Complex complex9 = complex8.log();
        org.apache.commons.math3.complex.Complex complex10 = complex9.conjugate();
        boolean boolean11 = complex9.isInfinite();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
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
        org.apache.commons.math3.complex.Complex complex23 = complex13.cosh();
        double double24 = complex23.abs();
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
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
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
        org.apache.commons.math3.complex.Complex complex11 = complex1.subtract((double) (short) -1);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList13 = complex1.nthRoot(100);
        org.apache.commons.math3.complex.Complex complex14 = complex1.sinh();
        org.apache.commons.math3.complex.Complex complex16 = complex14.subtract((double) 10L);
        org.apache.commons.math3.complex.Complex complex17 = complex16.sqrt();
        org.apache.commons.math3.complex.Complex complex19 = complex16.add((double) 100.0f);
        org.apache.commons.math3.complex.Complex complex20 = complex16.acos();
        org.apache.commons.math3.complex.Complex complex21 = complex16.sqrt();
        org.apache.commons.math3.complex.Complex complex23 = complex16.subtract(1.5900247258946039d);
        org.apache.commons.math3.complex.Complex complex24 = complex23.tan();
        org.apache.commons.math3.complex.Complex complex25 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex26 = complex25.sqrt1z();
        org.apache.commons.math3.complex.Complex complex28 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double29 = complex28.getImaginary();
        org.apache.commons.math3.complex.Complex complex30 = complex28.negate();
        org.apache.commons.math3.complex.Complex complex31 = complex30.sinh();
        org.apache.commons.math3.complex.Complex complex32 = complex31.acos();
        org.apache.commons.math3.complex.Complex complex33 = complex26.divide(complex31);
        org.apache.commons.math3.complex.Complex complex35 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex36 = complex35.exp();
        double double37 = complex35.getArgument();
        org.apache.commons.math3.complex.Complex complex39 = complex35.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex40 = complex35.exp();
        org.apache.commons.math3.complex.Complex complex42 = complex40.multiply((int) (short) 0);
        org.apache.commons.math3.complex.Complex complex43 = complex40.tan();
        org.apache.commons.math3.complex.Complex complex44 = complex33.divide(complex40);
        org.apache.commons.math3.complex.Complex complex45 = complex44.asin();
        org.apache.commons.math3.complex.Complex complex46 = complex45.cosh();
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
        org.apache.commons.math3.complex.Complex complex73 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex74 = complex73.exp();
        double double75 = complex73.getArgument();
        org.apache.commons.math3.complex.Complex complex77 = complex73.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex78 = complex73.sin();
        org.apache.commons.math3.complex.Complex complex79 = complex73.cosh();
        org.apache.commons.math3.complex.Complex complex80 = complex73.tan();
        org.apache.commons.math3.complex.Complex complex81 = complex73.tan();
        org.apache.commons.math3.complex.Complex complex82 = complex69.pow(complex81);
        org.apache.commons.math3.complex.Complex complex83 = complex81.sinh();
        org.apache.commons.math3.complex.Complex complex84 = complex45.pow(complex83);
        org.apache.commons.math3.complex.Complex complex85 = complex23.divide(complex45);
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
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex42);
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
        org.junit.Assert.assertNotNull(complex73);
        org.junit.Assert.assertNotNull(complex74);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 0.0d + "'", double75 == 0.0d);
        org.junit.Assert.assertNotNull(complex77);
        org.junit.Assert.assertNotNull(complex78);
        org.junit.Assert.assertNotNull(complex79);
        org.junit.Assert.assertNotNull(complex80);
        org.junit.Assert.assertNotNull(complex81);
        org.junit.Assert.assertNotNull(complex82);
        org.junit.Assert.assertNotNull(complex83);
        org.junit.Assert.assertNotNull(complex84);
        org.junit.Assert.assertNotNull(complex85);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex1 = complex0.sqrt1z();
        org.apache.commons.math3.complex.Complex complex2 = complex1.asin();
        org.apache.commons.math3.complex.Complex complex3 = complex2.tanh();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex2.cosh();
        double double4 = complex2.getReal();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.718281828459045d + "'", double4 == 2.718281828459045d);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 10, (double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex4 = complex2.add((double) (byte) 10);
        org.apache.commons.math3.complex.Complex complex5 = complex4.exp();
        org.apache.commons.math3.complex.Complex complex6 = complex4.log();
        boolean boolean7 = complex6.isInfinite();
        org.apache.commons.math3.complex.Complex complex9 = complex6.pow((-0.7853981633974483d));
        org.apache.commons.math3.complex.Complex complex10 = complex6.asin();
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
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
        org.apache.commons.math3.complex.Complex complex24 = new org.apache.commons.math3.complex.Complex((double) 'a', 0.0d);
        org.apache.commons.math3.complex.Complex complex25 = complex24.negate();
        org.apache.commons.math3.complex.Complex complex26 = complex24.sqrt1z();
        org.apache.commons.math3.complex.Complex complex27 = complex24.reciprocal();
        org.apache.commons.math3.complex.Complex complex28 = complex21.subtract(complex24);
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
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
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
        org.apache.commons.math3.complex.Complex complex27 = complex22.sin();
        double double28 = complex27.getArgument();
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
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf(0.03140559722642014d);
        org.apache.commons.math3.complex.Complex complex3 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex4 = complex3.sqrt();
        org.apache.commons.math3.complex.Complex complex5 = complex3.sqrt();
        org.apache.commons.math3.complex.Complex complex6 = complex5.tanh();
        org.apache.commons.math3.complex.Complex complex7 = complex6.acos();
        org.apache.commons.math3.complex.Complex complex9 = complex7.multiply((double) '4');
        org.apache.commons.math3.complex.Complex complex10 = complex9.acos();
        org.apache.commons.math3.complex.Complex complex11 = complex1.subtract(complex10);
        org.apache.commons.math3.complex.ComplexField complexField12 = complex1.getField();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complexField12);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
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
        org.apache.commons.math3.complex.Complex complex54 = complex50.add((-2.0158089984440206E-8d));
        org.apache.commons.math3.complex.Complex complex57 = org.apache.commons.math3.complex.Complex.valueOf((double) 1, 10.0d);
        org.apache.commons.math3.complex.Complex complex58 = complex57.cosh();
        org.apache.commons.math3.complex.Complex complex59 = complex58.acos();
        org.apache.commons.math3.complex.Complex complex60 = complex54.add(complex59);
        org.apache.commons.math3.complex.Complex complex61 = complex59.exp();
        java.lang.Class<?> wildcardClass62 = complex59.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertNotNull(complex54);
        org.junit.Assert.assertNotNull(complex57);
        org.junit.Assert.assertNotNull(complex58);
        org.junit.Assert.assertNotNull(complex59);
        org.junit.Assert.assertNotNull(complex60);
        org.junit.Assert.assertNotNull(complex61);
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 10, (double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex4 = complex2.add((double) (byte) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex4.pow(1.0d);
        org.apache.commons.math3.complex.Complex complex7 = complex6.sin();
        org.apache.commons.math3.complex.Complex complex9 = complex6.divide(1.0349512282932293E22d);
        org.apache.commons.math3.complex.Complex complex10 = complex6.cos();
        org.apache.commons.math3.complex.Complex complex11 = complex6.tan();
        org.apache.commons.math3.complex.Complex complex12 = complex6.sinh();
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
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
        org.apache.commons.math3.complex.ComplexField complexField29 = complex27.getField();
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
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complexField29);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
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
        org.apache.commons.math3.complex.Complex complex40 = complex36.negate();
        org.apache.commons.math3.complex.Complex complex41 = complex40.atan();
        org.apache.commons.math3.complex.Complex complex43 = complex41.add((-1.0d));
        org.apache.commons.math3.complex.Complex complex45 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double46 = complex45.getImaginary();
        org.apache.commons.math3.complex.Complex complex47 = complex45.negate();
        org.apache.commons.math3.complex.Complex complex49 = complex47.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex50 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex51 = complex47.subtract(complex50);
        org.apache.commons.math3.complex.Complex complex52 = complex47.cosh();
        org.apache.commons.math3.complex.Complex complex53 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex54 = complex53.sqrt1z();
        org.apache.commons.math3.complex.Complex complex56 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double57 = complex56.getImaginary();
        org.apache.commons.math3.complex.Complex complex58 = complex56.negate();
        org.apache.commons.math3.complex.Complex complex59 = complex58.sinh();
        org.apache.commons.math3.complex.Complex complex60 = complex59.acos();
        org.apache.commons.math3.complex.Complex complex61 = complex54.divide(complex59);
        org.apache.commons.math3.complex.Complex complex62 = complex61.tan();
        org.apache.commons.math3.complex.Complex complex63 = complex52.subtract(complex61);
        org.apache.commons.math3.complex.Complex complex65 = complex52.add(0.5574077246549021d);
        org.apache.commons.math3.complex.Complex complex66 = complex41.add(complex52);
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
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertNotNull(complex53);
        org.junit.Assert.assertNotNull(complex54);
        org.junit.Assert.assertNotNull(complex56);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertNotNull(complex58);
        org.junit.Assert.assertNotNull(complex59);
        org.junit.Assert.assertNotNull(complex60);
        org.junit.Assert.assertNotNull(complex61);
        org.junit.Assert.assertNotNull(complex62);
        org.junit.Assert.assertNotNull(complex63);
        org.junit.Assert.assertNotNull(complex65);
        org.junit.Assert.assertNotNull(complex66);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex6 = complex1.sqrt1z();
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex8 = complex6.add(complex7);
        boolean boolean9 = complex6.isNaN();
        org.apache.commons.math3.complex.Complex complex10 = complex6.exp();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(complex10);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
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
        org.apache.commons.math3.complex.Complex complex15 = complex12.divide((double) (byte) -1);
        org.apache.commons.math3.complex.Complex complex16 = complex12.conjugate();
        org.apache.commons.math3.complex.Complex complex17 = complex16.conjugate();
        org.apache.commons.math3.complex.Complex complex18 = complex17.exp();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
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
        org.apache.commons.math3.complex.Complex complex66 = complex64.reciprocal();
        org.apache.commons.math3.complex.Complex complex67 = complex66.sinh();
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
        org.junit.Assert.assertNotNull(complex30);
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
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertNotNull(complex54);
        org.junit.Assert.assertNotNull(complex55);
        org.junit.Assert.assertNotNull(complexList57);
        org.junit.Assert.assertNotNull(complex58);
        org.junit.Assert.assertNotNull(complex59);
        org.junit.Assert.assertNotNull(complex60);
        org.junit.Assert.assertNotNull(complex61);
        org.junit.Assert.assertNotNull(complexField62);
        org.junit.Assert.assertNotNull(complex64);
        org.junit.Assert.assertNotNull(complex65);
        org.junit.Assert.assertNotNull(complex66);
        org.junit.Assert.assertNotNull(complex67);
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
        org.apache.commons.math3.complex.Complex complex11 = complex1.subtract((double) (short) -1);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList13 = complex1.nthRoot(100);
        org.apache.commons.math3.complex.Complex complex14 = complex1.sinh();
        org.apache.commons.math3.complex.Complex complex16 = complex14.multiply((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex17 = complex14.acos();
        org.apache.commons.math3.complex.Complex complex18 = complex14.cos();
        double double19 = complex14.getReal();
        boolean boolean20 = complex14.isInfinite();
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
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.1752011936438014d + "'", double19 == 1.1752011936438014d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex((-1.0038848218538872d));
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf(1.1594159340671257d, (-3.141592653589793d));
        double double3 = complex2.getImaginary();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.141592653589793d) + "'", double3 == (-3.141592653589793d));
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
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
        org.apache.commons.math3.complex.Complex complex62 = complex19.pow(complex58);
        org.apache.commons.math3.complex.Complex complex63 = complex62.reciprocal();
        org.apache.commons.math3.complex.Complex complex64 = complex62.exp();
        boolean boolean65 = complex62.isInfinite();
        double double66 = complex62.getImaginary();
        org.apache.commons.math3.complex.Complex complex68 = complex62.divide(0.9630272572571656d);
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
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complexList30);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertNotNull(complex53);
        org.junit.Assert.assertNotNull(complex54);
        org.junit.Assert.assertNotNull(complex55);
        org.junit.Assert.assertNotNull(complex57);
        org.junit.Assert.assertNotNull(complex58);
        org.junit.Assert.assertNotNull(complexList60);
        org.junit.Assert.assertNotNull(complex61);
        org.junit.Assert.assertNotNull(complex62);
        org.junit.Assert.assertNotNull(complex63);
        org.junit.Assert.assertNotNull(complex64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.0d + "'", double66 == 0.0d);
        org.junit.Assert.assertNotNull(complex68);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
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
        org.apache.commons.math3.complex.ComplexField complexField19 = complex13.getField();
        org.apache.commons.math3.complex.Complex complex20 = complex13.sin();
        org.apache.commons.math3.complex.Complex complex21 = complex20.negate();
        org.apache.commons.math3.complex.Complex complex22 = complex21.exp();
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
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complexField19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
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
        org.apache.commons.math3.complex.Complex complex62 = complex19.pow(complex58);
        org.apache.commons.math3.complex.Complex complex63 = complex19.sqrt();
        org.apache.commons.math3.complex.Complex complex66 = org.apache.commons.math3.complex.Complex.valueOf(100.0d, (double) (short) 100);
        org.apache.commons.math3.complex.Complex complex69 = new org.apache.commons.math3.complex.Complex((double) 10, (double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex71 = complex69.add((double) (byte) 10);
        double double72 = complex71.getImaginary();
        org.apache.commons.math3.complex.Complex complex73 = complex71.tan();
        double double74 = complex71.getReal();
        org.apache.commons.math3.complex.Complex complex75 = complex71.cos();
        org.apache.commons.math3.complex.Complex complex76 = complex66.subtract(complex75);
        org.apache.commons.math3.complex.Complex complex78 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double79 = complex78.getImaginary();
        org.apache.commons.math3.complex.Complex complex81 = complex78.pow((double) 100L);
        org.apache.commons.math3.complex.Complex complex82 = complex66.multiply(complex78);
        org.apache.commons.math3.complex.Complex complex83 = complex19.add(complex66);
        org.apache.commons.math3.complex.Complex complex85 = complex66.divide((double) (short) -1);
        double double86 = complex85.getImaginary();
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
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complexList30);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertNotNull(complex53);
        org.junit.Assert.assertNotNull(complex54);
        org.junit.Assert.assertNotNull(complex55);
        org.junit.Assert.assertNotNull(complex57);
        org.junit.Assert.assertNotNull(complex58);
        org.junit.Assert.assertNotNull(complexList60);
        org.junit.Assert.assertNotNull(complex61);
        org.junit.Assert.assertNotNull(complex62);
        org.junit.Assert.assertNotNull(complex63);
        org.junit.Assert.assertNotNull(complex66);
        org.junit.Assert.assertNotNull(complex71);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 0.0d + "'", double72 == 0.0d);
        org.junit.Assert.assertNotNull(complex73);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 20.0d + "'", double74 == 20.0d);
        org.junit.Assert.assertNotNull(complex75);
        org.junit.Assert.assertNotNull(complex76);
        org.junit.Assert.assertNotNull(complex78);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 0.0d + "'", double79 == 0.0d);
        org.junit.Assert.assertNotNull(complex81);
        org.junit.Assert.assertNotNull(complex82);
        org.junit.Assert.assertNotNull(complex83);
        org.junit.Assert.assertNotNull(complex85);
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + (-100.0d) + "'", double86 == (-100.0d));
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) (short) -1, (double) '4');
        org.apache.commons.math3.complex.Complex complex4 = complex2.subtract((-0.0d));
        org.apache.commons.math3.complex.Complex complex5 = complex2.tan();
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
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
        org.apache.commons.math3.complex.Complex complex20 = complex17.sin();
        org.apache.commons.math3.complex.Complex complex21 = complex20.exp();
        org.apache.commons.math3.complex.Complex complex23 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double24 = complex23.getImaginary();
        org.apache.commons.math3.complex.Complex complex25 = complex23.negate();
        org.apache.commons.math3.complex.Complex complex27 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex28 = complex27.exp();
        double double29 = complex27.getArgument();
        org.apache.commons.math3.complex.Complex complex30 = complex27.log();
        org.apache.commons.math3.complex.Complex complex31 = complex27.log();
        org.apache.commons.math3.complex.Complex complex33 = complex31.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex34 = complex25.subtract(complex33);
        org.apache.commons.math3.complex.Complex complex35 = complex34.cos();
        org.apache.commons.math3.complex.Complex complex36 = complex20.multiply(complex34);
        org.apache.commons.math3.complex.Complex complex37 = complex34.tan();
        org.apache.commons.math3.complex.Complex complex38 = complex37.exp();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
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
        org.apache.commons.math3.complex.Complex complex16 = complex14.acos();
        org.apache.commons.math3.complex.Complex complex17 = complex16.tan();
        org.apache.commons.math3.complex.Complex complex19 = complex16.subtract(0.0d);
        org.apache.commons.math3.complex.Complex complex21 = complex19.add(0.0d);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex21);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
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
        org.apache.commons.math3.complex.Complex complex37 = complex34.subtract(10.0d);
        java.lang.String str38 = complex37.toString();
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
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "(-8.442592275345097, 0.0)" + "'", str38, "(-8.442592275345097, 0.0)");
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) (byte) 100, 0.0d);
        org.apache.commons.math3.complex.Complex complex3 = complex2.sqrt();
        org.apache.commons.math3.complex.Complex complex4 = complex2.log();
        org.apache.commons.math3.complex.Complex complex6 = complex4.multiply((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex7 = complex4.tan();
        org.apache.commons.math3.complex.Complex complex9 = complex4.pow((double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex10 = complex4.asin();
        org.apache.commons.math3.complex.Complex complex11 = complex10.sqrt();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
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
        org.apache.commons.math3.complex.Complex complex63 = complex31.sinh();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(complex10);
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
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
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
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertNotNull(complex53);
        org.junit.Assert.assertNotNull(complex54);
        org.junit.Assert.assertNotNull(complexList56);
        org.junit.Assert.assertNotNull(complex58);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.0d + "'", double59 == 0.0d);
        org.junit.Assert.assertNotNull(complex60);
        org.junit.Assert.assertNotNull(complex61);
        org.junit.Assert.assertNotNull(complex62);
        org.junit.Assert.assertNotNull(complex63);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf(1.5037960103594437d, (-1.2613182101454838E-15d));
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
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
        org.apache.commons.math3.complex.Complex complex28 = complex27.sinh();
        org.apache.commons.math3.complex.Complex complex30 = complex27.add((-0.7853981633974483d));
        org.apache.commons.math3.complex.ComplexField complexField31 = complex27.getField();
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
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complexField31);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
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
        org.apache.commons.math3.complex.Complex complex21 = complex20.exp();
        org.apache.commons.math3.complex.Complex complex23 = complex20.divide(3.296908309475615d);
        org.apache.commons.math3.complex.Complex complex24 = complex20.exp();
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
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex7 = complex3.pow((double) 100L);
        org.apache.commons.math3.complex.Complex complex8 = complex7.sin();
        org.apache.commons.math3.complex.Complex complex9 = complex7.cos();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex1 = complex0.sqrt1z();
        org.apache.commons.math3.complex.Complex complex3 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double4 = complex3.getImaginary();
        org.apache.commons.math3.complex.Complex complex5 = complex3.negate();
        org.apache.commons.math3.complex.Complex complex6 = complex5.sinh();
        org.apache.commons.math3.complex.Complex complex7 = complex6.acos();
        org.apache.commons.math3.complex.Complex complex8 = complex1.divide(complex6);
        org.apache.commons.math3.complex.Complex complex10 = complex8.add((double) (-1.0f));
        boolean boolean11 = complex8.isInfinite();
        org.apache.commons.math3.complex.Complex complex13 = complex8.divide(2534.769615493933d);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.math3.complex.Complex> complexList15 = complex8.nthRoot(0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: cannot compute nth root for null or negative n: 0");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(complex13);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
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
        org.apache.commons.math3.complex.Complex complex14 = complex7.sqrt1z();
        org.apache.commons.math3.complex.Complex complex15 = complex7.sin();
        org.apache.commons.math3.complex.Complex complex16 = complex15.cos();
        org.apache.commons.math3.complex.Complex complex17 = complex15.cos();
        org.apache.commons.math3.complex.Complex complex18 = complex17.atan();
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
        org.junit.Assert.assertNotNull(complex18);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((double) ' ', 1.8313009556045574d);
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
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
        org.apache.commons.math3.complex.Complex complex28 = complex26.pow(1.5430806348152437d);
        org.apache.commons.math3.complex.Complex complex30 = complex28.multiply((double) 10L);
        org.apache.commons.math3.complex.Complex complex31 = complex28.reciprocal();
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
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
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex5 = complex1.subtract((double) (short) 0);
        double double6 = complex5.abs();
        org.apache.commons.math3.complex.Complex complex7 = complex5.tan();
        boolean boolean8 = complex7.isInfinite();
        org.apache.commons.math3.complex.Complex complex9 = complex7.cos();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(complex9);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
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
        org.apache.commons.math3.complex.Complex complex14 = complex12.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex15 = complex14.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList17 = complex14.nthRoot((int) ' ');
        double double18 = complex14.getReal();
        org.apache.commons.math3.complex.Complex complex19 = complex14.log();
        org.apache.commons.math3.complex.Complex complex20 = complex19.log();
        org.apache.commons.math3.complex.Complex complex21 = complex8.add(complex20);
        double double22 = complex8.getImaginary();
        org.apache.commons.math3.complex.Complex complex25 = new org.apache.commons.math3.complex.Complex((double) (short) -1, (double) '4');
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
        java.lang.String str41 = complex40.toString();
        org.apache.commons.math3.complex.Complex complex42 = complex40.tanh();
        org.apache.commons.math3.complex.Complex complex43 = complex25.pow(complex40);
        org.apache.commons.math3.complex.Complex complex44 = complex43.exp();
        org.apache.commons.math3.complex.Complex complex46 = complex43.divide(3.296908309475615d);
        org.apache.commons.math3.complex.Complex complex47 = complex8.subtract(complex43);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complexList17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
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
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "(1.5707963267948966, -0.0)" + "'", str41, "(1.5707963267948966, -0.0)");
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex47);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math3.complex.Complex complex4 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double5 = complex4.getImaginary();
        org.apache.commons.math3.complex.Complex complex7 = complex4.pow((double) 100L);
        org.apache.commons.math3.complex.Complex complex8 = complex2.pow(complex7);
        org.apache.commons.math3.complex.Complex complex9 = complex7.cosh();
        org.apache.commons.math3.complex.Complex complex12 = new org.apache.commons.math3.complex.Complex((double) (short) -1, (double) '4');
        boolean boolean13 = complex12.isInfinite();
        org.apache.commons.math3.complex.Complex complex16 = new org.apache.commons.math3.complex.Complex((double) 0L, (double) 100.0f);
        org.apache.commons.math3.complex.Complex complex17 = complex12.multiply(complex16);
        org.apache.commons.math3.complex.Complex complex18 = complex9.subtract(complex16);
        org.apache.commons.math3.complex.Complex complex19 = complex9.sqrt1z();
        org.apache.commons.math3.complex.Complex complex20 = complex19.negate();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex(1.5707963267948966d, 0.03140559722642014d);
        org.apache.commons.math3.complex.Complex complex3 = complex2.exp();
        org.junit.Assert.assertNotNull(complex3);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
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
        java.lang.String str17 = complex15.toString();
        boolean boolean18 = complex15.isNaN();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "(0.0, 0.0)" + "'", str17, "(0.0, 0.0)");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 10, (double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex4 = complex2.add((double) (byte) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex4.pow(1.0d);
        org.apache.commons.math3.complex.Complex complex7 = complex6.sin();
        org.apache.commons.math3.complex.Complex complex9 = complex6.divide(1.0349512282932293E22d);
        org.apache.commons.math3.complex.Complex complex10 = complex6.cosh();
        org.apache.commons.math3.complex.Complex complex12 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex13 = complex12.exp();
        double double14 = complex12.getArgument();
        org.apache.commons.math3.complex.Complex complex16 = complex12.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex17 = complex12.sin();
        org.apache.commons.math3.complex.Complex complex18 = complex12.sin();
        boolean boolean19 = complex10.equals((java.lang.Object) complex18);
        org.apache.commons.math3.complex.Complex complex20 = complex10.atan();
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(complex20);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex7 = complex3.subtract(complex6);
        org.apache.commons.math3.complex.Complex complex8 = complex3.acos();
        double double9 = complex8.getImaginary();
        org.apache.commons.math3.complex.Complex complex10 = complex8.tan();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-0.0d) + "'", double9 == (-0.0d));
        org.junit.Assert.assertNotNull(complex10);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
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
        org.apache.commons.math3.complex.Complex complex15 = complex14.conjugate();
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
        org.junit.Assert.assertNotNull(complex15);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 1, (double) (byte) 0);
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
        org.apache.commons.math3.complex.Complex complex29 = complex25.sin();
        org.apache.commons.math3.complex.Complex complex30 = complex29.cosh();
        org.apache.commons.math3.complex.Complex complex31 = complex30.acos();
        org.apache.commons.math3.complex.Complex complex32 = complex2.multiply(complex31);
        org.apache.commons.math3.complex.Complex complex33 = complex32.asin();
        org.apache.commons.math3.complex.Complex complex34 = complex33.cosh();
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
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) (short) -1, (double) '4');
        boolean boolean3 = complex2.isInfinite();
        org.apache.commons.math3.complex.Complex complex4 = complex2.acos();
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex7 = complex6.exp();
        double double8 = complex6.getArgument();
        org.apache.commons.math3.complex.Complex complex10 = complex6.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex11 = complex6.exp();
        org.apache.commons.math3.complex.Complex complex13 = complex11.multiply((int) (short) 0);
        org.apache.commons.math3.complex.Complex complex14 = complex11.tan();
        org.apache.commons.math3.complex.Complex complex16 = complex11.subtract(Double.NEGATIVE_INFINITY);
        org.apache.commons.math3.complex.Complex complex17 = complex4.divide(complex11);
        org.apache.commons.math3.complex.Complex complex19 = complex17.add(0.0d);
        double double20 = complex19.getReal();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.5849361007660583d + "'", double20 == 0.5849361007660583d);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((-0.0d));
        org.apache.commons.math3.complex.Complex complex7 = complex1.divide((double) (byte) 10);
        org.apache.commons.math3.complex.Complex complex8 = complex1.conjugate();
        org.apache.commons.math3.complex.Complex complex9 = complex1.atan();
        java.lang.String str10 = complex1.toString();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(1.0, 0.0)" + "'", str10, "(1.0, 0.0)");
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
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
        org.apache.commons.math3.complex.Complex complex20 = complex5.subtract(Double.NEGATIVE_INFINITY);
        org.apache.commons.math3.complex.Complex complex21 = complex20.sqrt();
        org.apache.commons.math3.complex.ComplexField complexField22 = complex21.getField();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complexField22);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf(100.0d, (double) (short) 100);
        org.apache.commons.math3.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math3.complex.Complex complex5 = complex2.multiply(1.5707963267948966d);
        org.apache.commons.math3.complex.Complex complex6 = complex5.log();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
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
        org.apache.commons.math3.complex.Complex complex16 = complex5.negate();
        org.apache.commons.math3.complex.Complex complex19 = new org.apache.commons.math3.complex.Complex((double) (byte) 100, 0.0d);
        org.apache.commons.math3.complex.Complex complex20 = complex19.sqrt();
        org.apache.commons.math3.complex.Complex complex21 = complex19.log();
        org.apache.commons.math3.complex.Complex complex23 = complex21.multiply((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex24 = complex21.log();
        org.apache.commons.math3.complex.Complex complex25 = complex21.cos();
        boolean boolean26 = complex25.isNaN();
        org.apache.commons.math3.complex.Complex complex27 = complex16.subtract(complex25);
        boolean boolean28 = complex25.isInfinite();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((double) 100.0f, (double) (short) 1);
        org.apache.commons.math3.complex.ComplexField complexField3 = complex2.getField();
        org.apache.commons.math3.complex.Complex complex5 = new org.apache.commons.math3.complex.Complex((double) 100L);
        org.apache.commons.math3.complex.Complex complex7 = complex5.divide((double) (-1));
        org.apache.commons.math3.complex.Complex complex8 = complex2.subtract(complex5);
        org.apache.commons.math3.complex.Complex complex9 = complex8.log();
        org.apache.commons.math3.complex.Complex complex10 = complex8.sin();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complexField3);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) '4', (double) (short) 100);
        org.apache.commons.math3.complex.Complex complex4 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double5 = complex4.getImaginary();
        org.apache.commons.math3.complex.Complex complex6 = complex4.negate();
        org.apache.commons.math3.complex.Complex complex8 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex9 = complex8.exp();
        double double10 = complex8.getArgument();
        org.apache.commons.math3.complex.Complex complex11 = complex8.log();
        org.apache.commons.math3.complex.Complex complex12 = complex8.log();
        org.apache.commons.math3.complex.Complex complex14 = complex12.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex15 = complex6.subtract(complex14);
        org.apache.commons.math3.complex.Complex complex16 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex17 = complex16.sqrt1z();
        boolean boolean18 = complex15.equals((java.lang.Object) complex17);
        org.apache.commons.math3.complex.Complex complex20 = complex15.multiply(10.0d);
        org.apache.commons.math3.complex.Complex complex21 = complex15.sqrt();
        org.apache.commons.math3.complex.Complex complex22 = complex2.divide(complex21);
        org.apache.commons.math3.complex.Complex complex23 = complex2.atan();
        org.apache.commons.math3.complex.Complex complex25 = complex23.subtract(0.7037703053450407d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex25);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
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
        java.util.List<org.apache.commons.math3.complex.Complex> complexList41 = complex36.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex42 = complex36.asin();
        org.apache.commons.math3.complex.Complex complex43 = complex42.sqrt1z();
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
        org.junit.Assert.assertNotNull(complexList41);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex43);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex3.sinh();
        org.apache.commons.math3.complex.Complex complex5 = complex4.tanh();
        org.apache.commons.math3.complex.Complex complex7 = complex5.subtract((double) 1L);
        double double8 = complex7.getImaginary();
        double double9 = complex7.getImaginary();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-0.0d) + "'", double8 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-0.0d) + "'", double9 == (-0.0d));
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) '4', (double) (short) 100);
        org.apache.commons.math3.complex.Complex complex3 = complex2.acos();
        org.apache.commons.math3.complex.Complex complex4 = complex3.asin();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
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
        org.apache.commons.math3.complex.Complex complex32 = complex31.sqrt();
        org.apache.commons.math3.complex.Complex complex34 = complex32.add(8.509181282393216d);
        double double35 = complex32.getImaginary();
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
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
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
        org.apache.commons.math3.complex.Complex complex22 = org.apache.commons.math3.complex.Complex.valueOf(2.1415926494674857d);
        boolean boolean23 = complex17.equals((java.lang.Object) 2.1415926494674857d);
        org.apache.commons.math3.complex.Complex complex24 = complex17.tanh();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(complex24);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex6 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex8 = complex6.multiply((int) (short) 0);
        org.apache.commons.math3.complex.Complex complex10 = complex6.add((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex12 = complex6.multiply((int) '4');
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
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
        org.apache.commons.math3.complex.Complex complex15 = complex5.cosh();
        org.apache.commons.math3.complex.Complex complex18 = new org.apache.commons.math3.complex.Complex((double) 10, (double) (byte) 0);
        org.apache.commons.math3.complex.ComplexField complexField19 = complex18.getField();
        org.apache.commons.math3.complex.Complex complex20 = complex18.reciprocal();
        boolean boolean21 = complex5.equals((java.lang.Object) complex18);
        org.apache.commons.math3.complex.Complex complex23 = complex18.subtract(3.738039258735582E-23d);
        org.apache.commons.math3.complex.Complex complex25 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex26 = complex25.sqrt();
        org.apache.commons.math3.complex.Complex complex28 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double29 = complex28.getImaginary();
        org.apache.commons.math3.complex.Complex complex31 = complex28.pow((double) 100L);
        org.apache.commons.math3.complex.Complex complex32 = complex26.pow(complex31);
        double double33 = complex26.getArgument();
        org.apache.commons.math3.complex.Complex complex34 = complex18.add(complex26);
        double double35 = complex26.getImaginary();
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
        org.junit.Assert.assertNotNull(complexField19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math3.complex.Complex complex4 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double5 = complex4.getImaginary();
        org.apache.commons.math3.complex.Complex complex6 = complex4.negate();
        org.apache.commons.math3.complex.Complex complex7 = complex6.cosh();
        org.apache.commons.math3.complex.Complex complex8 = complex1.pow(complex7);
        double double9 = complex8.getReal();
        org.apache.commons.math3.complex.Complex complex10 = complex8.log();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(complex10);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf(0.0d, (double) ' ');
        org.apache.commons.math3.complex.Complex complex4 = complex2.pow(1.0349512282932293E22d);
        java.lang.String str5 = complex2.toString();
        org.apache.commons.math3.complex.Complex complex6 = complex2.tanh();
        org.apache.commons.math3.complex.Complex complex8 = complex2.multiply(1.5689416592028116d);
        org.apache.commons.math3.complex.Complex complex10 = complex2.add((double) (byte) 10);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(0.0, 32.0)" + "'", str5, "(0.0, 32.0)");
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) (-1.0f), (double) 100.0f);
        org.apache.commons.math3.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math3.complex.Complex complex4 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex5 = complex4.cosh();
        org.apache.commons.math3.complex.Complex complex6 = complex4.conjugate();
        org.apache.commons.math3.complex.Complex complex9 = new org.apache.commons.math3.complex.Complex((double) (short) -1, (double) '4');
        org.apache.commons.math3.complex.Complex complex10 = complex9.cos();
        org.apache.commons.math3.complex.Complex complex11 = complex4.subtract(complex9);
        org.apache.commons.math3.complex.Complex complex12 = complex3.multiply(complex9);
        java.lang.String str13 = complex9.toString();
        org.apache.commons.math3.complex.Complex complex16 = new org.apache.commons.math3.complex.Complex((double) (short) -1, (double) '4');
        org.apache.commons.math3.complex.Complex complex17 = complex16.log();
        org.apache.commons.math3.complex.Complex complex19 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double20 = complex19.getImaginary();
        org.apache.commons.math3.complex.Complex complex21 = complex19.negate();
        org.apache.commons.math3.complex.Complex complex23 = complex21.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex24 = complex17.add(complex21);
        org.apache.commons.math3.complex.Complex complex25 = complex9.subtract(complex17);
        org.apache.commons.math3.complex.Complex complex28 = org.apache.commons.math3.complex.Complex.valueOf((double) 1, 10.0d);
        org.apache.commons.math3.complex.Complex complex29 = complex28.cosh();
        org.apache.commons.math3.complex.Complex complex30 = complex29.acos();
        org.apache.commons.math3.complex.Complex complex31 = complex30.reciprocal();
        org.apache.commons.math3.complex.Complex complex32 = complex30.tan();
        org.apache.commons.math3.complex.Complex complex33 = complex30.acos();
        org.apache.commons.math3.complex.Complex complex34 = complex25.add(complex33);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(-1.0, 52.0)" + "'", str13, "(-1.0, 52.0)");
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex7 = complex5.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex8 = complex5.sqrt();
        double double9 = complex8.getArgument();
        org.apache.commons.math3.complex.Complex complex10 = complex8.reciprocal();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(complex10);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 10, (double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex4 = complex2.add((double) (byte) 10);
        double double5 = complex4.getImaginary();
        org.apache.commons.math3.complex.Complex complex6 = complex4.cosh();
        org.apache.commons.math3.complex.Complex complex7 = complex4.atan();
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
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
        org.apache.commons.math3.complex.ComplexField complexField31 = complex30.getField();
        org.apache.commons.math3.complex.Complex complex33 = complex30.pow((double) 0.0f);
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
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complexField31);
        org.junit.Assert.assertNotNull(complex33);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf(9.885539019535031E-14d, (double) 0.0f);
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex7 = complex3.pow((double) 100L);
        org.apache.commons.math3.complex.Complex complex8 = complex3.acos();
        org.apache.commons.math3.complex.Complex complex10 = complex8.divide((double) (byte) 100);
        org.apache.commons.math3.complex.Complex complex12 = complex10.divide((-4.392948198753447E-23d));
        org.apache.commons.math3.complex.Complex complex13 = complex12.atan();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 100);
        org.apache.commons.math3.complex.Complex complex4 = org.apache.commons.math3.complex.Complex.valueOf((double) (-1.0f), (double) '#');
        org.apache.commons.math3.complex.Complex complex5 = complex1.subtract(complex4);
        org.apache.commons.math3.complex.Complex complex7 = complex4.multiply((double) 'a');
        org.apache.commons.math3.complex.Complex complex8 = complex4.exp();
        org.apache.commons.math3.complex.Complex complex9 = complex4.tanh();
        java.lang.String str10 = complex4.toString();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(-1.0, 35.0)" + "'", str10, "(-1.0, 35.0)");
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((-1.1941271262033388E-22d), (double) (-1));
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex(4.851651954097903E8d);
        org.apache.commons.math3.complex.Complex complex4 = new org.apache.commons.math3.complex.Complex((double) 10, (double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) (byte) 10);
        org.apache.commons.math3.complex.Complex complex8 = complex6.pow(1.0d);
        org.apache.commons.math3.complex.Complex complex9 = complex8.sin();
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex12 = complex11.exp();
        double double13 = complex11.getArgument();
        org.apache.commons.math3.complex.Complex complex14 = complex11.log();
        org.apache.commons.math3.complex.Complex complex15 = complex11.log();
        org.apache.commons.math3.complex.Complex complex17 = complex15.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex18 = complex8.multiply(complex15);
        org.apache.commons.math3.complex.Complex complex19 = complex18.conjugate();
        org.apache.commons.math3.complex.Complex complex20 = complex1.add(complex19);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
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
        org.apache.commons.math3.complex.Complex complex28 = complex27.sin();
        org.apache.commons.math3.complex.Complex complex29 = complex27.cos();
        org.apache.commons.math3.complex.Complex complex31 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double32 = complex31.getImaginary();
        org.apache.commons.math3.complex.Complex complex33 = complex31.negate();
        org.apache.commons.math3.complex.Complex complex35 = complex33.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex37 = complex33.pow((double) 100L);
        org.apache.commons.math3.complex.Complex complex38 = complex33.reciprocal();
        org.apache.commons.math3.complex.Complex complex39 = complex33.tanh();
        org.apache.commons.math3.complex.ComplexField complexField40 = complex33.getField();
        org.apache.commons.math3.complex.Complex complex42 = complex33.multiply(0.03140559722642014d);
        org.apache.commons.math3.complex.Complex complex43 = complex33.sinh();
        org.apache.commons.math3.complex.Complex complex44 = complex33.tan();
        org.apache.commons.math3.complex.Complex complex45 = complex29.add(complex33);
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
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complexField40);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex45);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
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
        java.lang.String str15 = complex5.toString();
        org.apache.commons.math3.complex.Complex complex18 = org.apache.commons.math3.complex.Complex.valueOf((double) 1, 10.0d);
        org.apache.commons.math3.complex.Complex complex19 = complex18.cosh();
        org.apache.commons.math3.complex.Complex complex20 = complex19.acos();
        org.apache.commons.math3.complex.Complex complex21 = complex20.reciprocal();
        org.apache.commons.math3.complex.Complex complex22 = complex20.tan();
        org.apache.commons.math3.complex.Complex complex24 = org.apache.commons.math3.complex.Complex.valueOf(1.5900247258946039d);
        org.apache.commons.math3.complex.Complex complex25 = complex20.subtract(complex24);
        org.apache.commons.math3.complex.Complex complex26 = complex5.subtract(complex25);
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "(1.0, 0.0)" + "'", str15, "(1.0, 0.0)");
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex(1.5707963267948966d, 0.03140559722642014d);
        org.apache.commons.math3.complex.Complex complex3 = complex2.asin();
        org.apache.commons.math3.complex.Complex complex4 = complex2.cosh();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((double) 1.0f, 1.5037960103594437d);
        org.apache.commons.math3.complex.Complex complex4 = complex2.add(0.0d);
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double7 = complex6.getImaginary();
        org.apache.commons.math3.complex.Complex complex8 = complex6.negate();
        org.apache.commons.math3.complex.Complex complex10 = complex8.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex12 = complex8.subtract(complex11);
        org.apache.commons.math3.complex.Complex complex13 = complex8.cosh();
        org.apache.commons.math3.complex.Complex complex14 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex15 = complex14.sqrt1z();
        org.apache.commons.math3.complex.Complex complex17 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double18 = complex17.getImaginary();
        org.apache.commons.math3.complex.Complex complex19 = complex17.negate();
        org.apache.commons.math3.complex.Complex complex20 = complex19.sinh();
        org.apache.commons.math3.complex.Complex complex21 = complex20.acos();
        org.apache.commons.math3.complex.Complex complex22 = complex15.divide(complex20);
        org.apache.commons.math3.complex.Complex complex23 = complex22.tan();
        org.apache.commons.math3.complex.Complex complex24 = complex13.subtract(complex22);
        org.apache.commons.math3.complex.Complex complex25 = complex22.sin();
        org.apache.commons.math3.complex.Complex complex26 = complex25.exp();
        org.apache.commons.math3.complex.Complex complex28 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double29 = complex28.getImaginary();
        org.apache.commons.math3.complex.Complex complex30 = complex28.negate();
        org.apache.commons.math3.complex.Complex complex32 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex33 = complex32.exp();
        double double34 = complex32.getArgument();
        org.apache.commons.math3.complex.Complex complex35 = complex32.log();
        org.apache.commons.math3.complex.Complex complex36 = complex32.log();
        org.apache.commons.math3.complex.Complex complex38 = complex36.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex39 = complex30.subtract(complex38);
        org.apache.commons.math3.complex.Complex complex40 = complex39.cos();
        org.apache.commons.math3.complex.Complex complex41 = complex25.multiply(complex39);
        org.apache.commons.math3.complex.Complex complex42 = complex39.tan();
        org.apache.commons.math3.complex.Complex complex43 = complex4.add(complex39);
        double double44 = complex39.getReal();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
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
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + (-1.0d) + "'", double44 == (-1.0d));
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) (byte) 100, 0.0d);
        org.apache.commons.math3.complex.Complex complex3 = complex2.sqrt();
        org.apache.commons.math3.complex.Complex complex4 = complex2.log();
        org.apache.commons.math3.complex.Complex complex6 = complex4.multiply((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex7 = complex4.sqrt1z();
        org.apache.commons.math3.complex.Complex complex8 = complex7.tan();
        org.apache.commons.math3.complex.Complex complex9 = complex7.negate();
        double double10 = complex9.abs();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.495285579572625d + "'", double10 == 4.495285579572625d);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((double) (byte) 10, 0.0d);
        org.apache.commons.math3.complex.Complex complex4 = complex2.subtract((double) (-1L));
        org.apache.commons.math3.complex.Complex complex5 = complex2.reciprocal();
        org.apache.commons.math3.complex.Complex complex6 = complex2.exp();
        org.apache.commons.math3.complex.Complex complex7 = complex6.acos();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((-1.0d), (double) 0.0f);
        org.apache.commons.math3.complex.Complex complex3 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex5 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double6 = complex5.getImaginary();
        org.apache.commons.math3.complex.Complex complex7 = complex5.negate();
        org.apache.commons.math3.complex.Complex complex9 = complex7.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex10 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex11 = complex7.subtract(complex10);
        org.apache.commons.math3.complex.Complex complex12 = complex7.acos();
        org.apache.commons.math3.complex.Complex complex13 = complex3.subtract(complex7);
        org.apache.commons.math3.complex.Complex complex14 = complex7.atan();
        org.apache.commons.math3.complex.Complex complex16 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex17 = complex16.exp();
        double double18 = complex16.getArgument();
        org.apache.commons.math3.complex.Complex complex20 = complex16.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex21 = complex16.exp();
        org.apache.commons.math3.complex.Complex complex24 = new org.apache.commons.math3.complex.Complex((double) (short) -1, (double) '4');
        org.apache.commons.math3.complex.Complex complex25 = complex24.cos();
        org.apache.commons.math3.complex.Complex complex26 = complex21.divide(complex25);
        org.apache.commons.math3.complex.Complex complex27 = complex7.subtract(complex26);
        org.apache.commons.math3.complex.Complex complex30 = org.apache.commons.math3.complex.Complex.valueOf(0.0d, (double) ' ');
        org.apache.commons.math3.complex.Complex complex32 = complex30.pow(1.0349512282932293E22d);
        org.apache.commons.math3.complex.Complex complex33 = complex26.add(complex32);
        boolean boolean34 = complex2.equals((java.lang.Object) complex33);
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
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf(2.2835403144819257d);
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
        java.util.List<org.apache.commons.math3.complex.Complex> complexList40 = complex38.nthRoot((int) '4');
        org.apache.commons.math3.complex.Complex complex41 = complex12.subtract(complex38);
        org.apache.commons.math3.complex.Complex complex42 = complex38.negate();
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
        org.apache.commons.math3.complex.Complex complex59 = complex57.sin();
        org.apache.commons.math3.complex.Complex complex60 = complex38.pow(complex59);
        org.apache.commons.math3.complex.Complex complex61 = complex1.subtract(complex38);
        org.apache.commons.math3.complex.Complex complex63 = complex61.divide(0.9913289158005999d);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complexList10);
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
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complexList40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertNotNull(complex53);
        org.junit.Assert.assertNotNull(complex55);
        org.junit.Assert.assertNotNull(complex56);
        org.junit.Assert.assertNotNull(complex57);
        org.junit.Assert.assertNotNull(complex58);
        org.junit.Assert.assertNotNull(complex59);
        org.junit.Assert.assertNotNull(complex60);
        org.junit.Assert.assertNotNull(complex61);
        org.junit.Assert.assertNotNull(complex63);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf(1.143207452899284d, (-1.9643867237284715E-15d));
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex2 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex3 = complex2.sinh();
        org.apache.commons.math3.complex.Complex complex4 = complex2.sinh();
        org.apache.commons.math3.complex.Complex complex5 = complex2.cos();
        org.apache.commons.math3.complex.Complex complex6 = complex2.conjugate();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
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
        org.apache.commons.math3.complex.Complex complex31 = complex27.multiply((double) '#');
        org.apache.commons.math3.complex.Complex complex33 = complex27.add(0.0d);
        double double34 = complex27.getImaginary();
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
        org.junit.Assert.assertNotNull(complexField29);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 0, (double) 100.0f);
        org.apache.commons.math3.complex.Complex complex4 = complex2.pow((double) 100);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) (byte) 100);
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
        org.apache.commons.math3.complex.Complex complex34 = complex29.acos();
        org.apache.commons.math3.complex.Complex complex35 = complex29.cosh();
        org.apache.commons.math3.complex.Complex complex36 = complex6.subtract(complex35);
        boolean boolean37 = complex36.isNaN();
        org.junit.Assert.assertNotNull(complex4);
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
        org.junit.Assert.assertNotNull(complexList31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex5 = complex1.subtract((double) (short) 0);
        double double6 = complex5.abs();
        org.apache.commons.math3.complex.Complex complex7 = complex5.tan();
        org.apache.commons.math3.complex.Complex complex8 = complex7.asin();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
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
        org.apache.commons.math3.complex.Complex complex30 = complex28.multiply(10);
        org.apache.commons.math3.complex.Complex complex32 = complex30.divide(0.8414709848078965d);
        org.apache.commons.math3.complex.Complex complex34 = org.apache.commons.math3.complex.Complex.valueOf(1.5430806348152437d);
        org.apache.commons.math3.complex.Complex complex35 = complex32.pow(complex34);
        org.apache.commons.math3.complex.Complex complex36 = complex32.sin();
        double double37 = complex32.getReal();
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
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 10.39527080377439d + "'", double37 == 10.39527080377439d);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
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
        org.apache.commons.math3.complex.Complex complex67 = complex65.multiply((-1.1941271262033388E-22d));
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
        org.junit.Assert.assertNotNull(complex30);
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
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertNotNull(complex54);
        org.junit.Assert.assertNotNull(complex55);
        org.junit.Assert.assertNotNull(complexList57);
        org.junit.Assert.assertNotNull(complex58);
        org.junit.Assert.assertNotNull(complex59);
        org.junit.Assert.assertNotNull(complex60);
        org.junit.Assert.assertNotNull(complex61);
        org.junit.Assert.assertNotNull(complexField62);
        org.junit.Assert.assertNotNull(complex64);
        org.junit.Assert.assertNotNull(complex65);
        org.junit.Assert.assertNotNull(complex67);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList6 = complex4.nthRoot((int) 'a');
        org.apache.commons.math3.complex.Complex complex8 = complex4.add((double) (-1.0f));
        boolean boolean9 = complex4.isNaN();
        org.apache.commons.math3.complex.Complex complex11 = complex4.multiply((double) 100);
        double double12 = complex4.getArgument();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complexList6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex3.tanh();
        org.apache.commons.math3.complex.Complex complex8 = complex3.divide((double) 10L);
        org.apache.commons.math3.complex.Complex complex10 = complex3.add(0.7615941559557649d);
        org.apache.commons.math3.complex.Complex complex12 = complex10.multiply(0);
        java.lang.String str13 = complex10.toString();
        org.apache.commons.math3.complex.Complex complex15 = complex10.subtract(Double.POSITIVE_INFINITY);
        org.apache.commons.math3.complex.Complex complex17 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex18 = complex17.exp();
        double double19 = complex17.getArgument();
        org.apache.commons.math3.complex.Complex complex21 = complex17.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex22 = complex17.exp();
        org.apache.commons.math3.complex.Complex complex24 = complex22.pow((-0.0d));
        org.apache.commons.math3.complex.Complex complex25 = complex15.add(complex24);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(-0.23840584404423515, -0.0)" + "'", str13, "(-0.23840584404423515, -0.0)");
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex2 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex3 = complex2.sinh();
        org.apache.commons.math3.complex.Complex complex4 = complex2.sinh();
        org.apache.commons.math3.complex.Complex complex7 = new org.apache.commons.math3.complex.Complex((double) (byte) 100, 0.0d);
        org.apache.commons.math3.complex.Complex complex8 = complex7.sqrt();
        org.apache.commons.math3.complex.Complex complex9 = complex7.log();
        org.apache.commons.math3.complex.Complex complex11 = complex9.multiply((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex12 = complex9.tan();
        double double13 = complex12.getImaginary();
        org.apache.commons.math3.complex.Complex complex14 = complex12.sqrt();
        org.apache.commons.math3.complex.Complex complex17 = new org.apache.commons.math3.complex.Complex((double) 1, (double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex19 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex20 = complex19.exp();
        double double21 = complex19.getArgument();
        org.apache.commons.math3.complex.Complex complex23 = complex19.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex24 = complex19.sin();
        org.apache.commons.math3.complex.Complex complex25 = complex19.cosh();
        org.apache.commons.math3.complex.Complex complex26 = complex19.tan();
        org.apache.commons.math3.complex.Complex complex27 = complex19.tan();
        org.apache.commons.math3.complex.Complex complex29 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex30 = complex29.exp();
        double double31 = complex29.getArgument();
        org.apache.commons.math3.complex.Complex complex33 = complex29.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex34 = complex29.sin();
        org.apache.commons.math3.complex.Complex complex35 = complex29.cosh();
        org.apache.commons.math3.complex.Complex complex36 = complex29.tan();
        org.apache.commons.math3.complex.Complex complex37 = complex29.tan();
        org.apache.commons.math3.complex.Complex complex39 = complex29.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex40 = complex27.subtract(complex29);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList42 = complex40.nthRoot((int) '4');
        org.apache.commons.math3.complex.Complex complex43 = complex40.cos();
        org.apache.commons.math3.complex.Complex complex44 = complex40.sin();
        org.apache.commons.math3.complex.Complex complex45 = complex44.cosh();
        org.apache.commons.math3.complex.Complex complex46 = complex45.acos();
        org.apache.commons.math3.complex.Complex complex47 = complex17.multiply(complex46);
        boolean boolean48 = complex14.equals((java.lang.Object) complex47);
        org.apache.commons.math3.complex.Complex complex49 = complex14.asin();
        org.apache.commons.math3.complex.Complex complex50 = complex2.divide(complex14);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList52 = complex2.nthRoot((int) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList54 = complex2.nthRoot((int) 'a');
        org.apache.commons.math3.complex.Complex complex55 = complex2.tan();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(complex14);
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
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complexList42);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertNotNull(complexList52);
        org.junit.Assert.assertNotNull(complexList54);
        org.junit.Assert.assertNotNull(complex55);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((-0.8259324122591327d), 1.143207452899284d);
        org.apache.commons.math3.complex.Complex complex4 = complex2.pow(0.0d);
        org.junit.Assert.assertNotNull(complex4);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList6 = complex4.nthRoot((int) 'a');
        org.apache.commons.math3.complex.Complex complex8 = complex4.add((double) (-1.0f));
        boolean boolean9 = complex4.isNaN();
        org.apache.commons.math3.complex.Complex complex11 = complex4.multiply((double) 100);
        org.apache.commons.math3.complex.Complex complex12 = complex11.cosh();
        org.apache.commons.math3.complex.Complex complex13 = complex12.cosh();
        org.apache.commons.math3.complex.Complex complex15 = complex13.subtract(0.0d);
        boolean boolean16 = complex15.isNaN();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complexList6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex5.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex9 = complex5.negate();
        boolean boolean10 = complex5.isInfinite();
        org.apache.commons.math3.complex.Complex complex11 = complex5.sin();
        org.apache.commons.math3.complex.Complex complex13 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double14 = complex13.getImaginary();
        org.apache.commons.math3.complex.Complex complex15 = complex13.negate();
        org.apache.commons.math3.complex.Complex complex17 = complex15.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex18 = complex17.atan();
        org.apache.commons.math3.complex.Complex complex20 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double21 = complex20.getImaginary();
        org.apache.commons.math3.complex.Complex complex22 = complex20.negate();
        org.apache.commons.math3.complex.Complex complex24 = complex22.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex25 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex26 = complex22.subtract(complex25);
        org.apache.commons.math3.complex.Complex complex27 = complex17.divide(complex26);
        org.apache.commons.math3.complex.Complex complex29 = complex17.divide(1.0349512282932293E22d);
        org.apache.commons.math3.complex.Complex complex30 = complex29.acos();
        org.apache.commons.math3.complex.Complex complex33 = org.apache.commons.math3.complex.Complex.valueOf((double) 100.0f, (double) (short) 1);
        org.apache.commons.math3.complex.ComplexField complexField34 = complex33.getField();
        org.apache.commons.math3.complex.Complex complex36 = new org.apache.commons.math3.complex.Complex((double) 100L);
        org.apache.commons.math3.complex.Complex complex38 = complex36.divide((double) (-1));
        org.apache.commons.math3.complex.Complex complex39 = complex33.subtract(complex36);
        org.apache.commons.math3.complex.Complex complex40 = complex39.log();
        org.apache.commons.math3.complex.Complex complex42 = complex40.pow(1.5037960103594437d);
        org.apache.commons.math3.complex.Complex complex44 = complex40.pow((double) 100L);
        org.apache.commons.math3.complex.Complex complex45 = complex30.multiply(complex40);
        double double46 = complex45.getArgument();
        org.apache.commons.math3.complex.Complex complex47 = complex45.sqrt();
        org.apache.commons.math3.complex.Complex complex49 = complex45.multiply(0.0d);
        org.apache.commons.math3.complex.Complex complex50 = complex5.multiply(complex49);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexList8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complexField34);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 1.5707963267948966d + "'", double46 == 1.5707963267948966d);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex50);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex7 = complex3.subtract(complex6);
        org.apache.commons.math3.complex.Complex complex8 = complex7.acos();
        org.apache.commons.math3.complex.Complex complex9 = complex7.sqrt();
        org.apache.commons.math3.complex.Complex complex11 = complex7.pow(1.6118410375849543E22d);
        org.apache.commons.math3.complex.Complex complex12 = complex7.sqrt();
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
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
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
        org.apache.commons.math3.complex.Complex complex47 = complex40.sin();
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
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex47);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
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
        org.apache.commons.math3.complex.Complex complex45 = complex8.divide(0.8414709848078965d);
        double double46 = complex45.getArgument();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
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
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complexList35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complexList42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 1.5707963267948966d + "'", double46 == 1.5707963267948966d);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) (-1.0f), (double) 100.0f);
        org.apache.commons.math3.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math3.complex.Complex complex5 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex6 = complex5.exp();
        double double7 = complex5.getArgument();
        org.apache.commons.math3.complex.Complex complex9 = complex5.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex10 = complex5.exp();
        org.apache.commons.math3.complex.Complex complex11 = complex2.pow(complex10);
        org.apache.commons.math3.complex.Complex complex14 = new org.apache.commons.math3.complex.Complex((double) (short) -1, (double) '4');
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
        org.apache.commons.math3.complex.Complex complex31 = complex29.tanh();
        org.apache.commons.math3.complex.Complex complex32 = complex14.pow(complex29);
        boolean boolean33 = complex10.equals((java.lang.Object) complex14);
        double double34 = complex10.getArgument();
        org.apache.commons.math3.complex.Complex complex35 = complex10.cosh();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complexList23);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "(1.5707963267948966, -0.0)" + "'", str30, "(1.5707963267948966, -0.0)");
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertNotNull(complex35);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex((double) 'a');
        org.apache.commons.math3.complex.Complex complex2 = complex1.acos();
        org.apache.commons.math3.complex.Complex complex5 = new org.apache.commons.math3.complex.Complex((double) 0, (double) 100.0f);
        org.apache.commons.math3.complex.Complex complex7 = complex5.pow((double) 100);
        org.apache.commons.math3.complex.Complex complex9 = complex7.add((double) (byte) 100);
        org.apache.commons.math3.complex.Complex complex10 = complex7.atan();
        org.apache.commons.math3.complex.Complex complex13 = new org.apache.commons.math3.complex.Complex((double) 10, (double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex15 = complex13.add((double) (byte) 10);
        org.apache.commons.math3.complex.Complex complex17 = complex15.pow(1.0d);
        org.apache.commons.math3.complex.Complex complex18 = complex17.sin();
        org.apache.commons.math3.complex.Complex complex20 = complex17.divide(1.0349512282932293E22d);
        org.apache.commons.math3.complex.Complex complex21 = complex17.cos();
        java.lang.String str22 = complex17.toString();
        org.apache.commons.math3.complex.Complex complex24 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double25 = complex24.getImaginary();
        org.apache.commons.math3.complex.Complex complex26 = complex24.negate();
        org.apache.commons.math3.complex.Complex complex28 = complex26.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex29 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex30 = complex26.subtract(complex29);
        org.apache.commons.math3.complex.Complex complex31 = complex26.acos();
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
        org.apache.commons.math3.complex.Complex complex55 = complex31.pow(complex41);
        org.apache.commons.math3.complex.Complex complex56 = complex17.divide(complex31);
        org.apache.commons.math3.complex.Complex complex57 = complex10.multiply(complex17);
        org.apache.commons.math3.complex.Complex complex58 = complex2.subtract(complex10);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "(19.999999999999996, 0.0)" + "'", str22, "(19.999999999999996, 0.0)");
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertNotNull(complex26);
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
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertNotNull(complex53);
        org.junit.Assert.assertNotNull(complex54);
        org.junit.Assert.assertNotNull(complex55);
        org.junit.Assert.assertNotNull(complex56);
        org.junit.Assert.assertNotNull(complex57);
        org.junit.Assert.assertNotNull(complex58);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex3.cosh();
        org.apache.commons.math3.complex.Complex complex5 = complex4.conjugate();
        org.apache.commons.math3.complex.Complex complex6 = complex4.asin();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
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
        org.apache.commons.math3.complex.Complex complex24 = complex1.sqrt();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(complexField22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math3.complex.Complex complex3 = complex1.sqrt();
        org.apache.commons.math3.complex.Complex complex4 = complex1.sinh();
        org.apache.commons.math3.complex.Complex complex5 = complex4.exp();
        double double6 = complex4.getReal();
        double double7 = complex4.getReal();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.1752011936438014d + "'", double6 == 1.1752011936438014d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.1752011936438014d + "'", double7 == 1.1752011936438014d);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.NaN;
        org.apache.commons.math3.complex.Complex complex2 = complex0.divide(3.141592653589793d);
        org.apache.commons.math3.complex.Complex complex3 = complex2.exp();
        java.lang.Class<?> wildcardClass4 = complex3.getClass();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
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
        org.apache.commons.math3.complex.Complex complex21 = complex20.sinh();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex((double) (-1L));
        org.apache.commons.math3.complex.Complex complex2 = complex1.tanh();
        org.apache.commons.math3.complex.Complex complex3 = complex1.cos();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex7 = complex3.pow((double) (short) 1);
        boolean boolean8 = complex7.isInfinite();
        org.apache.commons.math3.complex.Complex complex9 = complex7.tan();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(complex9);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex((double) (byte) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.log();
        org.apache.commons.math3.complex.Complex complex3 = complex2.tanh();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex1 = complex0.cosh();
        org.apache.commons.math3.complex.Complex complex2 = complex0.conjugate();
        org.apache.commons.math3.complex.Complex complex5 = new org.apache.commons.math3.complex.Complex((double) (short) -1, (double) '4');
        org.apache.commons.math3.complex.Complex complex6 = complex5.cos();
        org.apache.commons.math3.complex.Complex complex7 = complex0.subtract(complex5);
        org.apache.commons.math3.complex.Complex complex8 = complex7.tanh();
        org.apache.commons.math3.complex.Complex complex9 = complex8.acos();
        double double10 = complex8.getImaginary();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.25747491633516334d) + "'", double10 == (-0.25747491633516334d));
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
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
        org.apache.commons.math3.complex.ComplexField complexField13 = complex7.getField();
        org.apache.commons.math3.complex.Complex complex15 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double16 = complex15.getImaginary();
        org.apache.commons.math3.complex.Complex complex17 = complex15.negate();
        org.apache.commons.math3.complex.Complex complex19 = complex17.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex20 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex21 = complex17.subtract(complex20);
        org.apache.commons.math3.complex.Complex complex22 = complex17.cosh();
        org.apache.commons.math3.complex.Complex complex23 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex24 = complex23.sqrt1z();
        org.apache.commons.math3.complex.Complex complex26 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double27 = complex26.getImaginary();
        org.apache.commons.math3.complex.Complex complex28 = complex26.negate();
        org.apache.commons.math3.complex.Complex complex29 = complex28.sinh();
        org.apache.commons.math3.complex.Complex complex30 = complex29.acos();
        org.apache.commons.math3.complex.Complex complex31 = complex24.divide(complex29);
        org.apache.commons.math3.complex.Complex complex32 = complex31.tan();
        org.apache.commons.math3.complex.Complex complex33 = complex22.subtract(complex31);
        org.apache.commons.math3.complex.Complex complex34 = complex31.sin();
        org.apache.commons.math3.complex.Complex complex35 = complex34.exp();
        org.apache.commons.math3.complex.Complex complex37 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double38 = complex37.getImaginary();
        org.apache.commons.math3.complex.Complex complex39 = complex37.negate();
        org.apache.commons.math3.complex.Complex complex41 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex42 = complex41.exp();
        double double43 = complex41.getArgument();
        org.apache.commons.math3.complex.Complex complex44 = complex41.log();
        org.apache.commons.math3.complex.Complex complex45 = complex41.log();
        org.apache.commons.math3.complex.Complex complex47 = complex45.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex48 = complex39.subtract(complex47);
        org.apache.commons.math3.complex.Complex complex49 = complex48.cos();
        org.apache.commons.math3.complex.Complex complex50 = complex34.multiply(complex48);
        org.apache.commons.math3.complex.Complex complex51 = complex7.subtract(complex50);
        org.apache.commons.math3.complex.Complex complex52 = complex50.cosh();
        org.apache.commons.math3.complex.Complex complex53 = complex50.acos();
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
        org.junit.Assert.assertNotNull(complexField13);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertNotNull(complex53);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex3 = complex1.add(0.0d);
        org.apache.commons.math3.complex.Complex complex5 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double6 = complex5.getImaginary();
        org.apache.commons.math3.complex.Complex complex7 = complex5.negate();
        org.apache.commons.math3.complex.Complex complex8 = complex7.sinh();
        org.apache.commons.math3.complex.Complex complex9 = complex8.acos();
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex12 = complex11.exp();
        boolean boolean13 = complex12.isNaN();
        double double14 = complex12.getArgument();
        org.apache.commons.math3.complex.Complex complex15 = complex9.multiply(complex12);
        org.apache.commons.math3.complex.Complex complex16 = complex12.log();
        org.apache.commons.math3.complex.Complex complex17 = complex12.tan();
        org.apache.commons.math3.complex.Complex complex18 = complex1.add(complex17);
        boolean boolean19 = complex1.isNaN();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex6 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex8 = complex6.multiply((int) (short) 0);
        double double9 = complex6.getArgument();
        org.apache.commons.math3.complex.Complex complex10 = complex6.sin();
        org.apache.commons.math3.complex.Complex complex12 = complex6.pow((-0.9942575694137897d));
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
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
        org.apache.commons.math3.complex.Complex complex41 = complex36.multiply(20.0d);
        java.lang.Class<?> wildcardClass42 = complex36.getClass();
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
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math3.complex.Complex complex4 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double5 = complex4.getImaginary();
        org.apache.commons.math3.complex.Complex complex7 = complex4.pow((double) 100L);
        org.apache.commons.math3.complex.Complex complex8 = complex2.pow(complex7);
        org.apache.commons.math3.complex.Complex complex9 = complex7.cosh();
        org.apache.commons.math3.complex.Complex complex12 = new org.apache.commons.math3.complex.Complex((double) (short) -1, (double) '4');
        boolean boolean13 = complex12.isInfinite();
        org.apache.commons.math3.complex.Complex complex16 = new org.apache.commons.math3.complex.Complex((double) 0L, (double) 100.0f);
        org.apache.commons.math3.complex.Complex complex17 = complex12.multiply(complex16);
        org.apache.commons.math3.complex.Complex complex18 = complex9.subtract(complex16);
        org.apache.commons.math3.complex.Complex complex19 = complex16.reciprocal();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
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
        org.apache.commons.math3.complex.Complex complex54 = complex50.add((-2.0158089984440206E-8d));
        org.apache.commons.math3.complex.Complex complex55 = complex54.sinh();
        org.apache.commons.math3.complex.Complex complex56 = complex55.reciprocal();
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
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertNotNull(complex54);
        org.junit.Assert.assertNotNull(complex55);
        org.junit.Assert.assertNotNull(complex56);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf(0.5574077246549021d);
        org.apache.commons.math3.complex.Complex complex2 = complex1.tanh();
        org.apache.commons.math3.complex.Complex complex4 = complex2.subtract((double) (byte) 100);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex6 = complex1.sqrt1z();
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex8 = complex6.add(complex7);
        org.apache.commons.math3.complex.Complex complex9 = complex6.negate();
        org.apache.commons.math3.complex.Complex complex10 = complex9.acos();
        double double11 = complex10.abs();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.5707963267948966d + "'", double11 == 1.5707963267948966d);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
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
        org.apache.commons.math3.complex.Complex complex24 = complex23.sqrt();
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
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
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
        org.apache.commons.math3.complex.Complex complex31 = complex27.multiply((double) ' ');
        org.apache.commons.math3.complex.Complex complex32 = complex27.acos();
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
        org.junit.Assert.assertNotNull(complexList29);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
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
        org.apache.commons.math3.complex.Complex complex39 = complex5.asin();
        org.apache.commons.math3.complex.Complex complex41 = complex5.pow(3.738039258735582E-23d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complexList14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "(1.5707963267948966, -0.0)" + "'", str21, "(1.5707963267948966, -0.0)");
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complexList35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex41);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf(100.0d, (double) (short) 100);
        org.apache.commons.math3.complex.Complex complex5 = new org.apache.commons.math3.complex.Complex((double) 10, (double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex7 = complex5.add((double) (byte) 10);
        double double8 = complex7.getImaginary();
        org.apache.commons.math3.complex.Complex complex9 = complex7.tan();
        double double10 = complex7.getReal();
        org.apache.commons.math3.complex.Complex complex11 = complex7.cos();
        org.apache.commons.math3.complex.Complex complex12 = complex2.subtract(complex11);
        org.apache.commons.math3.complex.Complex complex14 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double15 = complex14.getImaginary();
        org.apache.commons.math3.complex.Complex complex17 = complex14.pow((double) 100L);
        org.apache.commons.math3.complex.Complex complex18 = complex2.multiply(complex14);
        org.apache.commons.math3.complex.Complex complex20 = org.apache.commons.math3.complex.Complex.valueOf(1.557407724654902d);
        boolean boolean21 = complex20.isNaN();
        org.apache.commons.math3.complex.Complex complex22 = complex2.multiply(complex20);
        org.apache.commons.math3.complex.Complex complex23 = complex2.cos();
        org.apache.commons.math3.complex.Complex complex24 = complex2.negate();
        org.apache.commons.math3.complex.Complex complex25 = complex24.asin();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
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
        org.apache.commons.math3.complex.Complex complex54 = complex50.add((-2.0158089984440206E-8d));
        org.apache.commons.math3.complex.Complex complex57 = org.apache.commons.math3.complex.Complex.valueOf((double) 1, 10.0d);
        org.apache.commons.math3.complex.Complex complex58 = complex57.cosh();
        org.apache.commons.math3.complex.Complex complex59 = complex58.acos();
        org.apache.commons.math3.complex.Complex complex60 = complex54.add(complex59);
        org.apache.commons.math3.complex.Complex complex61 = complex59.exp();
        org.apache.commons.math3.complex.Complex complex63 = complex61.multiply(100);
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
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertNotNull(complex54);
        org.junit.Assert.assertNotNull(complex57);
        org.junit.Assert.assertNotNull(complex58);
        org.junit.Assert.assertNotNull(complex59);
        org.junit.Assert.assertNotNull(complex60);
        org.junit.Assert.assertNotNull(complex61);
        org.junit.Assert.assertNotNull(complex63);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
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
        org.apache.commons.math3.complex.Complex complex16 = complex14.sin();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList18 = complex16.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex19 = complex16.negate();
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
        org.junit.Assert.assertNotNull(complexList18);
        org.junit.Assert.assertNotNull(complex19);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
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
        org.apache.commons.math3.complex.Complex complex19 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex20 = complex19.exp();
        double double21 = complex19.getArgument();
        org.apache.commons.math3.complex.Complex complex23 = complex19.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex24 = complex19.sin();
        org.apache.commons.math3.complex.Complex complex25 = complex19.cosh();
        org.apache.commons.math3.complex.Complex complex26 = complex19.tan();
        org.apache.commons.math3.complex.Complex complex27 = complex19.tan();
        org.apache.commons.math3.complex.Complex complex29 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex30 = complex29.exp();
        double double31 = complex29.getArgument();
        org.apache.commons.math3.complex.Complex complex33 = complex29.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex34 = complex29.sin();
        org.apache.commons.math3.complex.Complex complex35 = complex29.cosh();
        org.apache.commons.math3.complex.Complex complex36 = complex29.tan();
        org.apache.commons.math3.complex.Complex complex37 = complex29.tan();
        org.apache.commons.math3.complex.Complex complex39 = complex29.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex40 = complex27.subtract(complex29);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList42 = complex40.nthRoot((int) '4');
        org.apache.commons.math3.complex.Complex complex43 = complex40.cos();
        org.apache.commons.math3.complex.Complex complex44 = complex40.cos();
        org.apache.commons.math3.complex.Complex complex45 = complex44.asin();
        org.apache.commons.math3.complex.Complex complex46 = complex17.add(complex44);
        org.apache.commons.math3.complex.Complex complex47 = complex17.negate();
        double double48 = complex17.getImaginary();
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
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complexList42);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + (-0.0d) + "'", double48 == (-0.0d));
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) (byte) 100, 0.0d);
        org.apache.commons.math3.complex.Complex complex3 = complex2.sqrt();
        org.apache.commons.math3.complex.Complex complex4 = complex3.tanh();
        org.apache.commons.math3.complex.Complex complex5 = complex4.reciprocal();
        double double6 = complex5.getReal();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0000000041223074d + "'", double6 == 1.0000000041223074d);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex5 = complex1.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex6 = complex5.log();
        org.apache.commons.math3.complex.Complex complex8 = complex5.subtract((double) 10L);
        boolean boolean9 = complex8.isInfinite();
        boolean boolean10 = complex8.isNaN();
        org.apache.commons.math3.complex.Complex complex11 = complex8.sqrt1z();
        org.apache.commons.math3.complex.Complex complex12 = complex8.tan();
        org.apache.commons.math3.complex.Complex complex15 = org.apache.commons.math3.complex.Complex.valueOf((-1.2613182101454838E-15d), 0.7219067166708869d);
        org.apache.commons.math3.complex.Complex complex16 = complex12.add(complex15);
        double double17 = complex12.getImaginary();
        org.apache.commons.math3.complex.Complex complex19 = complex12.add((-10.233808090179405d));
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(complex19);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
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
        org.apache.commons.math3.complex.Complex complex62 = complex19.pow(complex58);
        org.apache.commons.math3.complex.Complex complex63 = complex19.sqrt();
        org.apache.commons.math3.complex.Complex complex66 = org.apache.commons.math3.complex.Complex.valueOf(100.0d, (double) (short) 100);
        org.apache.commons.math3.complex.Complex complex69 = new org.apache.commons.math3.complex.Complex((double) 10, (double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex71 = complex69.add((double) (byte) 10);
        double double72 = complex71.getImaginary();
        org.apache.commons.math3.complex.Complex complex73 = complex71.tan();
        double double74 = complex71.getReal();
        org.apache.commons.math3.complex.Complex complex75 = complex71.cos();
        org.apache.commons.math3.complex.Complex complex76 = complex66.subtract(complex75);
        org.apache.commons.math3.complex.Complex complex78 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double79 = complex78.getImaginary();
        org.apache.commons.math3.complex.Complex complex81 = complex78.pow((double) 100L);
        org.apache.commons.math3.complex.Complex complex82 = complex66.multiply(complex78);
        org.apache.commons.math3.complex.Complex complex83 = complex19.add(complex66);
        org.apache.commons.math3.complex.Complex complex84 = complex66.reciprocal();
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
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complexList30);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertNotNull(complex53);
        org.junit.Assert.assertNotNull(complex54);
        org.junit.Assert.assertNotNull(complex55);
        org.junit.Assert.assertNotNull(complex57);
        org.junit.Assert.assertNotNull(complex58);
        org.junit.Assert.assertNotNull(complexList60);
        org.junit.Assert.assertNotNull(complex61);
        org.junit.Assert.assertNotNull(complex62);
        org.junit.Assert.assertNotNull(complex63);
        org.junit.Assert.assertNotNull(complex66);
        org.junit.Assert.assertNotNull(complex71);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 0.0d + "'", double72 == 0.0d);
        org.junit.Assert.assertNotNull(complex73);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 20.0d + "'", double74 == 20.0d);
        org.junit.Assert.assertNotNull(complex75);
        org.junit.Assert.assertNotNull(complex76);
        org.junit.Assert.assertNotNull(complex78);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 0.0d + "'", double79 == 0.0d);
        org.junit.Assert.assertNotNull(complex81);
        org.junit.Assert.assertNotNull(complex82);
        org.junit.Assert.assertNotNull(complex83);
        org.junit.Assert.assertNotNull(complex84);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
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
        org.apache.commons.math3.complex.Complex complex15 = complex5.cosh();
        org.apache.commons.math3.complex.Complex complex18 = new org.apache.commons.math3.complex.Complex((double) 10, (double) (byte) 0);
        org.apache.commons.math3.complex.ComplexField complexField19 = complex18.getField();
        org.apache.commons.math3.complex.Complex complex20 = complex18.reciprocal();
        boolean boolean21 = complex5.equals((java.lang.Object) complex18);
        org.apache.commons.math3.complex.Complex complex23 = complex18.subtract(3.738039258735582E-23d);
        org.apache.commons.math3.complex.Complex complex25 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex26 = complex25.sqrt();
        org.apache.commons.math3.complex.Complex complex28 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double29 = complex28.getImaginary();
        org.apache.commons.math3.complex.Complex complex31 = complex28.pow((double) 100L);
        org.apache.commons.math3.complex.Complex complex32 = complex26.pow(complex31);
        double double33 = complex26.getArgument();
        org.apache.commons.math3.complex.Complex complex34 = complex18.add(complex26);
        org.apache.commons.math3.complex.Complex complex37 = new org.apache.commons.math3.complex.Complex((double) (short) -1, (double) '4');
        boolean boolean38 = complex37.isInfinite();
        org.apache.commons.math3.complex.Complex complex39 = complex37.acos();
        org.apache.commons.math3.complex.Complex complex40 = complex34.divide(complex37);
        org.apache.commons.math3.complex.Complex complex41 = complex34.conjugate();
        org.apache.commons.math3.complex.Complex complex43 = complex41.subtract(20.0d);
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
        org.junit.Assert.assertNotNull(complexField19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex43);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
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
        org.apache.commons.math3.complex.Complex complex20 = complex17.sin();
        org.apache.commons.math3.complex.Complex complex21 = complex20.exp();
        org.apache.commons.math3.complex.Complex complex22 = complex20.log();
        org.apache.commons.math3.complex.Complex complex23 = complex20.negate();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex5 = complex1.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex7 = new org.apache.commons.math3.complex.Complex((double) 100L);
        org.apache.commons.math3.complex.Complex complex9 = complex7.divide((double) (-1));
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex12 = complex11.exp();
        double double13 = complex11.getArgument();
        org.apache.commons.math3.complex.Complex complex15 = complex11.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex16 = complex11.sin();
        org.apache.commons.math3.complex.Complex complex17 = complex11.cosh();
        org.apache.commons.math3.complex.Complex complex18 = complex11.tan();
        org.apache.commons.math3.complex.Complex complex19 = complex7.multiply(complex18);
        org.apache.commons.math3.complex.Complex complex20 = complex5.divide(complex19);
        org.apache.commons.math3.complex.Complex complex21 = complex19.sqrt();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 10, (double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex4 = complex2.add((double) (byte) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex4.pow(1.0d);
        org.apache.commons.math3.complex.Complex complex7 = complex6.sin();
        org.apache.commons.math3.complex.Complex complex9 = complex6.divide(1.0349512282932293E22d);
        org.apache.commons.math3.complex.Complex complex11 = complex6.add((double) 100L);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        double double6 = complex5.getReal();
        org.apache.commons.math3.complex.Complex complex7 = complex5.atan();
        double double8 = complex7.abs();
        org.apache.commons.math3.complex.Complex complex9 = complex7.cosh();
        boolean boolean10 = complex7.isNaN();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.7853981633974483d + "'", double8 == 0.7853981633974483d);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
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
        org.apache.commons.math3.complex.Complex complex20 = complex13.cosh();
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
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tanh();
        org.apache.commons.math3.complex.Complex complex4 = complex3.log();
        org.apache.commons.math3.complex.Complex complex5 = complex3.acos();
        org.apache.commons.math3.complex.Complex complex6 = complex3.log();
        org.apache.commons.math3.complex.Complex complex8 = complex3.add(0.0d);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math3.complex.Complex complex4 = complex3.sqrt();
        org.apache.commons.math3.complex.Complex complex6 = new org.apache.commons.math3.complex.Complex((double) 0.0f);
        boolean boolean7 = complex6.isInfinite();
        org.apache.commons.math3.complex.Complex complex9 = complex6.add((double) (-1.0f));
        org.apache.commons.math3.complex.Complex complex12 = new org.apache.commons.math3.complex.Complex((double) 100, (double) (short) 0);
        org.apache.commons.math3.complex.Complex complex13 = complex9.subtract(complex12);
        org.apache.commons.math3.complex.Complex complex14 = complex3.divide(complex12);
        org.apache.commons.math3.complex.Complex complex15 = complex12.acos();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex((double) 100L);
        org.apache.commons.math3.complex.Complex complex3 = complex1.divide((double) (-1));
        org.apache.commons.math3.complex.Complex complex5 = complex1.multiply((double) ' ');
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double8 = complex7.getImaginary();
        org.apache.commons.math3.complex.Complex complex9 = complex7.negate();
        org.apache.commons.math3.complex.Complex complex11 = complex9.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex12 = complex11.atan();
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
        org.apache.commons.math3.complex.Complex complex26 = complex11.subtract(complex25);
        org.apache.commons.math3.complex.Complex complex27 = complex25.reciprocal();
        org.apache.commons.math3.complex.Complex complex28 = complex25.tanh();
        org.apache.commons.math3.complex.Complex complex29 = complex5.subtract(complex28);
        org.apache.commons.math3.complex.Complex complex31 = complex5.subtract(4.605170185988092d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex31);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 10, (double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex4 = complex2.add((double) (byte) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex4.pow(1.0d);
        org.apache.commons.math3.complex.Complex complex7 = complex6.sin();
        org.apache.commons.math3.complex.Complex complex9 = complex6.divide(1.0349512282932293E22d);
        org.apache.commons.math3.complex.Complex complex10 = complex6.sqrt1z();
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
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
        org.apache.commons.math3.complex.Complex complex21 = complex16.multiply((double) (byte) 0);
        java.lang.Class<?> wildcardClass22 = complex21.getClass();
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
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex3.tanh();
        org.apache.commons.math3.complex.Complex complex8 = complex3.divide((double) 10L);
        org.apache.commons.math3.complex.Complex complex10 = complex8.add(52.009614495783374d);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex1 = complex0.sqrt1z();
        org.apache.commons.math3.complex.Complex complex2 = complex0.tanh();
        org.apache.commons.math3.complex.Complex complex5 = org.apache.commons.math3.complex.Complex.valueOf(100.0d, (double) (short) 100);
        org.apache.commons.math3.complex.Complex complex8 = new org.apache.commons.math3.complex.Complex((double) 10, (double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex10 = complex8.add((double) (byte) 10);
        double double11 = complex10.getImaginary();
        org.apache.commons.math3.complex.Complex complex12 = complex10.tan();
        double double13 = complex10.getReal();
        org.apache.commons.math3.complex.Complex complex14 = complex10.cos();
        org.apache.commons.math3.complex.Complex complex15 = complex5.subtract(complex14);
        org.apache.commons.math3.complex.Complex complex17 = complex5.add(1.0d);
        org.apache.commons.math3.complex.Complex complex18 = complex5.sin();
        org.apache.commons.math3.complex.Complex complex19 = complex2.add(complex18);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex6 = complex1.sqrt1z();
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex8 = complex6.add(complex7);
        double double9 = complex6.getReal();
        org.apache.commons.math3.complex.Complex complex10 = complex6.negate();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(complex10);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
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
        org.apache.commons.math3.complex.Complex complex23 = complex22.exp();
        org.apache.commons.math3.complex.Complex complex26 = new org.apache.commons.math3.complex.Complex((double) (byte) 100, 0.0d);
        org.apache.commons.math3.complex.Complex complex27 = complex26.sqrt();
        org.apache.commons.math3.complex.Complex complex28 = complex27.tanh();
        org.apache.commons.math3.complex.Complex complex29 = complex28.reciprocal();
        org.apache.commons.math3.complex.Complex complex31 = complex29.subtract(3.141592653589793d);
        org.apache.commons.math3.complex.Complex complex32 = complex22.subtract(complex29);
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
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
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
        org.apache.commons.math3.complex.Complex complex71 = complex69.pow((-4.392948198753447E-23d));
        java.lang.String str72 = complex71.toString();
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
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complexList29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertNotNull(complex53);
        org.junit.Assert.assertNotNull(complex54);
        org.junit.Assert.assertNotNull(complex55);
        org.junit.Assert.assertNotNull(complex57);
        org.junit.Assert.assertNotNull(complex58);
        org.junit.Assert.assertNotNull(complexList60);
        org.junit.Assert.assertNotNull(complex61);
        org.junit.Assert.assertNotNull(complex62);
        org.junit.Assert.assertNotNull(complex63);
        org.junit.Assert.assertNotNull(complex64);
        org.junit.Assert.assertNotNull(complex65);
        org.junit.Assert.assertNotNull(complex67);
        org.junit.Assert.assertNotNull(complex69);
        org.junit.Assert.assertNotNull(complex71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "(NaN, NaN)" + "'", str72, "(NaN, NaN)");
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex5 = complex1.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex6 = complex5.log();
        org.apache.commons.math3.complex.Complex complex8 = complex5.subtract((double) 10L);
        boolean boolean9 = complex8.isInfinite();
        boolean boolean10 = complex8.isNaN();
        org.apache.commons.math3.complex.Complex complex11 = complex8.sqrt1z();
        org.apache.commons.math3.complex.Complex complex12 = complex8.tan();
        org.apache.commons.math3.complex.Complex complex14 = complex8.add((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex15 = complex8.sqrt();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
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
        org.apache.commons.math3.complex.Complex complex34 = complex28.multiply((double) 10L);
        org.apache.commons.math3.complex.Complex complex35 = complex34.asin();
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
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex5 = complex1.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex7 = new org.apache.commons.math3.complex.Complex((double) 100L);
        org.apache.commons.math3.complex.Complex complex9 = complex7.divide((double) (-1));
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex12 = complex11.exp();
        double double13 = complex11.getArgument();
        org.apache.commons.math3.complex.Complex complex15 = complex11.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex16 = complex11.sin();
        org.apache.commons.math3.complex.Complex complex17 = complex11.cosh();
        org.apache.commons.math3.complex.Complex complex18 = complex11.tan();
        org.apache.commons.math3.complex.Complex complex19 = complex7.multiply(complex18);
        org.apache.commons.math3.complex.Complex complex20 = complex5.divide(complex19);
        org.apache.commons.math3.complex.Complex complex21 = complex20.asin();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList23 = complex21.nthRoot((int) '4');
        boolean boolean24 = complex21.isInfinite();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complexList23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex6 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex7 = complex6.sinh();
        org.apache.commons.math3.complex.Complex complex8 = complex7.exp();
        org.apache.commons.math3.complex.Complex complex10 = complex7.multiply(0.0d);
        org.apache.commons.math3.complex.Complex complex13 = new org.apache.commons.math3.complex.Complex((double) 100L, 1.5689416592028116d);
        org.apache.commons.math3.complex.Complex complex15 = complex13.subtract(0.8509181282393216d);
        double double16 = complex15.getImaginary();
        org.apache.commons.math3.complex.Complex complex17 = complex10.pow(complex15);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.5689416592028116d + "'", double16 == 1.5689416592028116d);
        org.junit.Assert.assertNotNull(complex17);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math3.complex.Complex complex7 = complex5.atan();
        org.apache.commons.math3.complex.Complex complex9 = complex5.pow(2.2835403144819257d);
        java.lang.Class<?> wildcardClass10 = complex5.getClass();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
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
        org.apache.commons.math3.complex.Complex complex31 = complex30.reciprocal();
        org.apache.commons.math3.complex.Complex complex32 = complex31.sqrt();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
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
        java.lang.String str12 = complex10.toString();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(-32.0, 1.0)" + "'", str12, "(-32.0, 1.0)");
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex7 = complex5.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex8 = complex5.sqrt();
        org.apache.commons.math3.complex.Complex complex10 = complex5.multiply((int) '#');
        org.apache.commons.math3.complex.Complex complex12 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex13 = complex12.exp();
        double double14 = complex12.getArgument();
        org.apache.commons.math3.complex.Complex complex16 = complex12.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex17 = complex12.exp();
        org.apache.commons.math3.complex.Complex complex20 = new org.apache.commons.math3.complex.Complex((double) (short) -1, (double) '4');
        org.apache.commons.math3.complex.Complex complex21 = complex20.cos();
        org.apache.commons.math3.complex.Complex complex22 = complex17.divide(complex21);
        java.lang.String str23 = complex21.toString();
        org.apache.commons.math3.complex.Complex complex25 = complex21.divide(20.0d);
        org.apache.commons.math3.complex.Complex complex26 = complex21.reciprocal();
        org.apache.commons.math3.complex.Complex complex27 = complex10.pow(complex26);
        org.apache.commons.math3.complex.Complex complex29 = complex27.add(52.009614495783374d);
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
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "(1.0349512282932293E22, 1.6118410375849543E22)" + "'", str23, "(1.0349512282932293E22, 1.6118410375849543E22)");
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex29);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
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
        boolean boolean15 = complex12.isNaN();
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
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
        org.apache.commons.math3.complex.Complex complex40 = complex36.negate();
        org.apache.commons.math3.complex.Complex complex42 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double43 = complex42.getImaginary();
        org.apache.commons.math3.complex.Complex complex44 = complex42.negate();
        org.apache.commons.math3.complex.Complex complex46 = complex44.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex47 = complex46.atan();
        org.apache.commons.math3.complex.Complex complex49 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double50 = complex49.getImaginary();
        org.apache.commons.math3.complex.Complex complex51 = complex49.negate();
        org.apache.commons.math3.complex.Complex complex53 = complex51.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex54 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex55 = complex51.subtract(complex54);
        org.apache.commons.math3.complex.Complex complex56 = complex46.divide(complex55);
        org.apache.commons.math3.complex.Complex complex57 = complex55.sin();
        org.apache.commons.math3.complex.Complex complex58 = complex36.pow(complex57);
        org.apache.commons.math3.complex.Complex complex59 = complex36.log();
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
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertNotNull(complex53);
        org.junit.Assert.assertNotNull(complex54);
        org.junit.Assert.assertNotNull(complex55);
        org.junit.Assert.assertNotNull(complex56);
        org.junit.Assert.assertNotNull(complex57);
        org.junit.Assert.assertNotNull(complex58);
        org.junit.Assert.assertNotNull(complex59);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf(32.01562118716424d);
        org.junit.Assert.assertNotNull(complex1);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
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
        org.apache.commons.math3.complex.Complex complex28 = complex27.sin();
        org.apache.commons.math3.complex.Complex complex29 = complex27.cos();
        org.apache.commons.math3.complex.Complex complex30 = complex27.cos();
        double double31 = complex27.getArgument();
        org.apache.commons.math3.complex.Complex complex32 = complex27.sqrt();
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
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNotNull(complex32);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        java.lang.String str3 = complex2.toString();
        org.apache.commons.math3.complex.Complex complex4 = complex2.sqrt1z();
        org.apache.commons.math3.complex.Complex complex5 = complex4.exp();
        org.apache.commons.math3.complex.Complex complex6 = complex5.acos();
        org.apache.commons.math3.complex.Complex complex8 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex9 = complex8.exp();
        org.apache.commons.math3.complex.Complex complex10 = complex8.tanh();
        org.apache.commons.math3.complex.Complex complex11 = complex10.log();
        org.apache.commons.math3.complex.Complex complex12 = complex10.acos();
        org.apache.commons.math3.complex.Complex complex13 = complex10.log();
        org.apache.commons.math3.complex.Complex complex14 = complex13.acos();
        org.apache.commons.math3.complex.Complex complex15 = complex13.tanh();
        org.apache.commons.math3.complex.Complex complex16 = complex5.subtract(complex13);
        org.apache.commons.math3.complex.Complex complex17 = complex13.log();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(2.718281828459045, 0.0)" + "'", str3, "(2.718281828459045, 0.0)");
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
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
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
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
        org.apache.commons.math3.complex.Complex complex52 = complex49.add(0.0d);
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
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertNotNull(complex52);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex((double) (byte) 1);
        org.apache.commons.math3.complex.Complex complex3 = complex1.multiply(0);
        org.junit.Assert.assertNotNull(complex3);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
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
        org.apache.commons.math3.complex.Complex complex13 = new org.apache.commons.math3.complex.Complex(10.0d);
        org.apache.commons.math3.complex.Complex complex14 = complex13.cosh();
        org.apache.commons.math3.complex.Complex complex15 = complex13.conjugate();
        org.apache.commons.math3.complex.Complex complex16 = complex11.pow(complex15);
        org.apache.commons.math3.complex.Complex complex17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.complex.Complex complex18 = complex11.multiply(complex17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
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
        org.apache.commons.math3.complex.Complex complex18 = complex6.divide((-4.392948198753447E-23d));
        org.apache.commons.math3.complex.Complex complex19 = complex18.sinh();
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
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex(0.0d, Double.NaN);
        org.apache.commons.math3.complex.Complex complex3 = complex2.atan();
        org.apache.commons.math3.complex.Complex complex4 = complex3.cos();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
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
        org.apache.commons.math3.complex.Complex complex16 = complex14.acos();
        org.apache.commons.math3.complex.Complex complex18 = complex14.multiply(1.4090092838232064d);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex18);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex7 = complex1.tan();
        double double8 = complex7.abs();
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.valueOf(1.0349512282932293E22d, (double) 0);
        java.lang.String str12 = complex11.toString();
        org.apache.commons.math3.complex.Complex complex13 = complex7.pow(complex11);
        org.apache.commons.math3.complex.Complex complex14 = complex13.sin();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.557407724654902d + "'", double8 == 1.557407724654902d);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(1.0349512282932293E22, 0.0)" + "'", str12, "(1.0349512282932293E22, 0.0)");
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf(52.009614495783374d, 0.7615941559557649d);
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
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
        org.apache.commons.math3.complex.Complex complex14 = complex7.sqrt1z();
        org.apache.commons.math3.complex.Complex complex15 = complex14.acos();
        org.apache.commons.math3.complex.Complex complex16 = complex14.tan();
        org.apache.commons.math3.complex.Complex complex17 = complex16.tanh();
        org.apache.commons.math3.complex.Complex complex18 = complex17.sqrt();
        org.apache.commons.math3.complex.Complex complex20 = complex18.subtract((-35.0d));
        org.apache.commons.math3.complex.Complex complex21 = complex20.tanh();
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
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
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
        org.apache.commons.math3.complex.Complex complex15 = complex14.tanh();
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
        org.junit.Assert.assertNotNull(complex15);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) (byte) 100, 0.0d);
        org.apache.commons.math3.complex.Complex complex3 = complex2.sqrt();
        org.apache.commons.math3.complex.Complex complex4 = complex2.log();
        org.apache.commons.math3.complex.Complex complex6 = complex4.multiply((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex7 = complex4.log();
        double double8 = complex4.abs();
        org.apache.commons.math3.complex.Complex complex9 = complex4.acos();
        org.apache.commons.math3.complex.Complex complex10 = complex9.log();
        org.apache.commons.math3.complex.Complex complex12 = complex9.multiply((int) 'a');
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.605170185988092d + "'", double8 == 4.605170185988092d);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
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
        org.apache.commons.math3.complex.Complex complex21 = complex20.exp();
        org.apache.commons.math3.complex.Complex complex22 = complex20.cosh();
        org.apache.commons.math3.complex.ComplexField complexField23 = complex20.getField();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.math3.complex.Complex> complexList25 = complex20.nthRoot((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: cannot compute nth root for null or negative n: 0");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complexField23);
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
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
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(complexField22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complexList32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 4.605170185988092d + "'", double45 == 4.605170185988092d);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex50);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math3.complex.Complex complex5 = complex2.pow((double) 0L);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList7 = complex5.nthRoot(1);
        org.apache.commons.math3.complex.Complex complex8 = complex5.log();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complexList7);
        org.junit.Assert.assertNotNull(complex8);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex3.sinh();
        org.apache.commons.math3.complex.Complex complex5 = complex4.acos();
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex8 = complex7.exp();
        boolean boolean9 = complex8.isNaN();
        double double10 = complex8.getArgument();
        org.apache.commons.math3.complex.Complex complex11 = complex5.multiply(complex8);
        org.apache.commons.math3.complex.Complex complex12 = complex8.cosh();
        double double13 = complex8.getArgument();
        org.apache.commons.math3.complex.Complex complex14 = complex8.exp();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(complex14);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) '4', (double) (short) 100);
        org.apache.commons.math3.complex.Complex complex4 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double5 = complex4.getImaginary();
        org.apache.commons.math3.complex.Complex complex6 = complex4.negate();
        org.apache.commons.math3.complex.Complex complex8 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex9 = complex8.exp();
        double double10 = complex8.getArgument();
        org.apache.commons.math3.complex.Complex complex11 = complex8.log();
        org.apache.commons.math3.complex.Complex complex12 = complex8.log();
        org.apache.commons.math3.complex.Complex complex14 = complex12.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex15 = complex6.subtract(complex14);
        org.apache.commons.math3.complex.Complex complex16 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex17 = complex16.sqrt1z();
        boolean boolean18 = complex15.equals((java.lang.Object) complex17);
        org.apache.commons.math3.complex.Complex complex20 = complex15.multiply(10.0d);
        org.apache.commons.math3.complex.Complex complex21 = complex15.sqrt();
        org.apache.commons.math3.complex.Complex complex22 = complex2.divide(complex21);
        org.apache.commons.math3.complex.Complex complex23 = complex2.asin();
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex4 = complex2.subtract(2.820679600601607E-23d);
        org.apache.commons.math3.complex.Complex complex5 = complex4.tanh();
        org.apache.commons.math3.complex.Complex complex7 = complex4.subtract(0.7518860375694327d);
        org.apache.commons.math3.complex.Complex complex8 = complex4.sqrt1z();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex((-100.0d));
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex1 = complex0.cosh();
        org.apache.commons.math3.complex.Complex complex2 = complex0.conjugate();
        org.apache.commons.math3.complex.Complex complex5 = new org.apache.commons.math3.complex.Complex((double) (short) -1, (double) '4');
        org.apache.commons.math3.complex.Complex complex6 = complex5.cos();
        org.apache.commons.math3.complex.Complex complex7 = complex0.subtract(complex5);
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double10 = complex9.getImaginary();
        org.apache.commons.math3.complex.Complex complex11 = complex9.negate();
        org.apache.commons.math3.complex.Complex complex13 = complex11.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex14 = complex13.atan();
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
        org.apache.commons.math3.complex.Complex complex28 = complex13.subtract(complex27);
        org.apache.commons.math3.complex.Complex complex29 = complex27.cosh();
        org.apache.commons.math3.complex.Complex complex30 = complex7.add(complex27);
        org.apache.commons.math3.complex.Complex complex31 = complex27.acos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList33 = complex31.nthRoot(10);
        org.apache.commons.math3.complex.Complex complex34 = complex31.cos();
        double double35 = complex31.getArgument();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complexList33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-0.0d) + "'", double35 == (-0.0d));
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
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
        org.apache.commons.math3.complex.Complex complex62 = complex19.pow(complex58);
        org.apache.commons.math3.complex.Complex complex63 = complex19.sqrt();
        org.apache.commons.math3.complex.Complex complex66 = org.apache.commons.math3.complex.Complex.valueOf(100.0d, (double) (short) 100);
        org.apache.commons.math3.complex.Complex complex69 = new org.apache.commons.math3.complex.Complex((double) 10, (double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex71 = complex69.add((double) (byte) 10);
        double double72 = complex71.getImaginary();
        org.apache.commons.math3.complex.Complex complex73 = complex71.tan();
        double double74 = complex71.getReal();
        org.apache.commons.math3.complex.Complex complex75 = complex71.cos();
        org.apache.commons.math3.complex.Complex complex76 = complex66.subtract(complex75);
        org.apache.commons.math3.complex.Complex complex78 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double79 = complex78.getImaginary();
        org.apache.commons.math3.complex.Complex complex81 = complex78.pow((double) 100L);
        org.apache.commons.math3.complex.Complex complex82 = complex66.multiply(complex78);
        org.apache.commons.math3.complex.Complex complex83 = complex19.add(complex66);
        org.apache.commons.math3.complex.Complex complex84 = complex19.negate();
        org.apache.commons.math3.complex.Complex complex86 = complex84.divide(0.9913289158005999d);
        java.lang.Class<?> wildcardClass87 = complex84.getClass();
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
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complexList30);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertNotNull(complex53);
        org.junit.Assert.assertNotNull(complex54);
        org.junit.Assert.assertNotNull(complex55);
        org.junit.Assert.assertNotNull(complex57);
        org.junit.Assert.assertNotNull(complex58);
        org.junit.Assert.assertNotNull(complexList60);
        org.junit.Assert.assertNotNull(complex61);
        org.junit.Assert.assertNotNull(complex62);
        org.junit.Assert.assertNotNull(complex63);
        org.junit.Assert.assertNotNull(complex66);
        org.junit.Assert.assertNotNull(complex71);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 0.0d + "'", double72 == 0.0d);
        org.junit.Assert.assertNotNull(complex73);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 20.0d + "'", double74 == 20.0d);
        org.junit.Assert.assertNotNull(complex75);
        org.junit.Assert.assertNotNull(complex76);
        org.junit.Assert.assertNotNull(complex78);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 0.0d + "'", double79 == 0.0d);
        org.junit.Assert.assertNotNull(complex81);
        org.junit.Assert.assertNotNull(complex82);
        org.junit.Assert.assertNotNull(complex83);
        org.junit.Assert.assertNotNull(complex84);
        org.junit.Assert.assertNotNull(complex86);
        org.junit.Assert.assertNotNull(wildcardClass87);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
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
        org.apache.commons.math3.complex.Complex complex24 = complex20.tanh();
        org.apache.commons.math3.complex.Complex complex25 = complex24.tan();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(complexField22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
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
        org.apache.commons.math3.complex.ComplexField complexField15 = complex5.getField();
        org.apache.commons.math3.complex.Complex complex16 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex17 = complex16.acos();
        org.apache.commons.math3.complex.Complex complex18 = complex5.divide(complex17);
        org.apache.commons.math3.complex.Complex complex19 = complex5.tanh();
        double double20 = complex19.abs();
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
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.7615941559557649d + "'", double20 == 0.7615941559557649d);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex4.asin();
        org.apache.commons.math3.complex.Complex complex6 = complex4.sinh();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList6 = complex4.nthRoot((int) 'a');
        org.apache.commons.math3.complex.Complex complex8 = complex4.add((double) (-1.0f));
        double double9 = complex8.getImaginary();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complexList6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math3.complex.Complex complex3 = complex1.sqrt();
        org.apache.commons.math3.complex.Complex complex4 = complex3.tanh();
        org.apache.commons.math3.complex.Complex complex5 = complex4.acos();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.math3.complex.Complex> complexList7 = complex4.nthRoot((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: cannot compute nth root for null or negative n: 0");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
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
        double double12 = complex10.getArgument();
        org.apache.commons.math3.complex.Complex complex14 = complex10.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex15 = complex10.exp();
        org.apache.commons.math3.complex.Complex complex17 = complex15.multiply((int) (short) 0);
        org.apache.commons.math3.complex.Complex complex18 = complex15.tan();
        org.apache.commons.math3.complex.Complex complex19 = complex8.divide(complex15);
        org.apache.commons.math3.complex.Complex complex20 = complex19.asin();
        org.apache.commons.math3.complex.Complex complex21 = complex19.log();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) (short) -1, (double) '4');
        boolean boolean3 = complex2.isInfinite();
        org.apache.commons.math3.complex.Complex complex4 = complex2.acos();
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex7 = complex6.exp();
        double double8 = complex6.getArgument();
        org.apache.commons.math3.complex.Complex complex10 = complex6.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex11 = complex6.exp();
        org.apache.commons.math3.complex.Complex complex13 = complex11.multiply((int) (short) 0);
        org.apache.commons.math3.complex.Complex complex14 = complex11.tan();
        org.apache.commons.math3.complex.Complex complex16 = complex11.subtract(Double.NEGATIVE_INFINITY);
        org.apache.commons.math3.complex.Complex complex17 = complex4.divide(complex11);
        org.apache.commons.math3.complex.Complex complex19 = complex11.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex21 = complex19.add((-0.0d));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex21);
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex4 = complex2.subtract(2.820679600601607E-23d);
        org.apache.commons.math3.complex.Complex complex5 = complex4.tanh();
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex8 = complex7.exp();
        double double9 = complex7.getArgument();
        org.apache.commons.math3.complex.Complex complex11 = complex7.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex12 = complex7.sin();
        org.apache.commons.math3.complex.Complex complex13 = complex7.cosh();
        org.apache.commons.math3.complex.Complex complex14 = complex7.tan();
        org.apache.commons.math3.complex.Complex complex15 = complex7.tan();
        org.apache.commons.math3.complex.Complex complex17 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex18 = complex17.exp();
        double double19 = complex17.getArgument();
        org.apache.commons.math3.complex.Complex complex21 = complex17.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex22 = complex17.sin();
        org.apache.commons.math3.complex.Complex complex23 = complex17.cosh();
        org.apache.commons.math3.complex.Complex complex24 = complex17.tan();
        org.apache.commons.math3.complex.Complex complex25 = complex17.tan();
        org.apache.commons.math3.complex.Complex complex27 = complex17.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex28 = complex15.subtract(complex17);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList30 = complex28.nthRoot((int) '4');
        org.apache.commons.math3.complex.Complex complex31 = complex28.cos();
        org.apache.commons.math3.complex.Complex complex32 = complex28.sin();
        org.apache.commons.math3.complex.Complex complex33 = complex32.cosh();
        org.apache.commons.math3.complex.Complex complex34 = complex33.sin();
        org.apache.commons.math3.complex.Complex complex35 = complex5.pow(complex34);
        org.apache.commons.math3.complex.Complex complex37 = complex5.pow(2.718281828459045d);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
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
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complexList30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex37);
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex7 = complex3.pow((double) 100L);
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex10 = complex9.exp();
        org.apache.commons.math3.complex.Complex complex11 = complex9.tanh();
        org.apache.commons.math3.complex.Complex complex12 = complex11.log();
        org.apache.commons.math3.complex.Complex complex13 = complex11.acos();
        org.apache.commons.math3.complex.Complex complex15 = complex11.subtract((double) (byte) -1);
        org.apache.commons.math3.complex.Complex complex18 = org.apache.commons.math3.complex.Complex.valueOf(100.0d, (double) (short) 100);
        org.apache.commons.math3.complex.Complex complex21 = new org.apache.commons.math3.complex.Complex((double) 10, (double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex23 = complex21.add((double) (byte) 10);
        double double24 = complex23.getImaginary();
        org.apache.commons.math3.complex.Complex complex25 = complex23.tan();
        double double26 = complex23.getReal();
        org.apache.commons.math3.complex.Complex complex27 = complex23.cos();
        org.apache.commons.math3.complex.Complex complex28 = complex18.subtract(complex27);
        org.apache.commons.math3.complex.Complex complex29 = complex18.reciprocal();
        org.apache.commons.math3.complex.Complex complex30 = complex29.sqrt();
        org.apache.commons.math3.complex.Complex complex31 = complex15.subtract(complex29);
        org.apache.commons.math3.complex.Complex complex32 = complex7.multiply(complex31);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 20.0d + "'", double26 == 20.0d);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) (-1L), (double) 1.0f);
        double double3 = complex2.getReal();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList6 = complex4.nthRoot((int) 'a');
        org.apache.commons.math3.complex.Complex complex8 = complex4.add((double) (-1.0f));
        org.apache.commons.math3.complex.Complex complex9 = complex8.asin();
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex12 = complex11.exp();
        double double13 = complex11.getArgument();
        org.apache.commons.math3.complex.Complex complex14 = complex11.log();
        org.apache.commons.math3.complex.Complex complex16 = new org.apache.commons.math3.complex.Complex((double) (byte) -1);
        boolean boolean17 = complex14.equals((java.lang.Object) (byte) -1);
        java.lang.String str18 = complex14.toString();
        org.apache.commons.math3.complex.Complex complex19 = complex8.subtract(complex14);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complexList6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "(0.0, 0.0)" + "'", str18, "(0.0, 0.0)");
        org.junit.Assert.assertNotNull(complex19);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex3.sinh();
        org.apache.commons.math3.complex.Complex complex5 = complex4.tanh();
        org.apache.commons.math3.complex.Complex complex6 = complex4.tan();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
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
        boolean boolean13 = complex3.isInfinite();
        org.apache.commons.math3.complex.Complex complex15 = complex3.divide((double) (short) 0);
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(complex15);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex6 = complex1.sqrt1z();
        org.apache.commons.math3.complex.Complex complex7 = complex6.atan();
        org.apache.commons.math3.complex.Complex complex9 = complex7.subtract(1.557407724654902d);
        java.lang.Class<?> wildcardClass10 = complex7.getClass();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex3.sqrt1z();
        org.apache.commons.math3.complex.Complex complex5 = complex4.tanh();
        org.apache.commons.math3.complex.Complex complex6 = complex5.sin();
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.valueOf((double) 0.0f, (-0.9230914219683788d));
        boolean boolean10 = complex6.equals((java.lang.Object) (-0.9230914219683788d));
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        double double6 = complex5.getArgument();
        double double7 = complex5.getArgument();
        org.apache.commons.math3.complex.Complex complex9 = complex5.divide(0.7518860375694327d);
        boolean boolean10 = complex5.isInfinite();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
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
        org.apache.commons.math3.complex.Complex complex14 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex15 = complex14.asin();
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
        java.util.List<org.apache.commons.math3.complex.Complex> complexList40 = complex38.nthRoot((int) '4');
        org.apache.commons.math3.complex.Complex complex41 = complex38.cos();
        org.apache.commons.math3.complex.Complex complex42 = complex38.sin();
        org.apache.commons.math3.complex.Complex complex43 = complex42.cosh();
        org.apache.commons.math3.complex.Complex complex44 = complex43.reciprocal();
        org.apache.commons.math3.complex.Complex complex45 = complex43.cosh();
        org.apache.commons.math3.complex.Complex complex46 = complex45.log();
        boolean boolean47 = complex15.equals((java.lang.Object) complex46);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
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
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complexList40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf(Double.NEGATIVE_INFINITY, (-1.0d));
        org.apache.commons.math3.complex.Complex complex4 = complex2.subtract(0.9630272572571656d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
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
        org.apache.commons.math3.complex.Complex complex26 = new org.apache.commons.math3.complex.Complex((double) 10, (double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex28 = complex26.add((double) (byte) 10);
        org.apache.commons.math3.complex.Complex complex30 = complex28.pow(1.0d);
        double double31 = complex30.getArgument();
        org.apache.commons.math3.complex.Complex complex32 = complex19.divide(complex30);
        org.apache.commons.math3.complex.Complex complex34 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex35 = complex34.exp();
        double double36 = complex34.getArgument();
        org.apache.commons.math3.complex.Complex complex37 = complex34.log();
        org.apache.commons.math3.complex.Complex complex38 = complex34.log();
        org.apache.commons.math3.complex.Complex complex39 = complex34.sqrt1z();
        org.apache.commons.math3.complex.Complex complex40 = complex39.atan();
        org.apache.commons.math3.complex.Complex complex41 = complex32.subtract(complex40);
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
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex3.tanh();
        boolean boolean7 = complex3.isNaN();
        org.apache.commons.math3.complex.Complex complex8 = complex3.atan();
        org.apache.commons.math3.complex.Complex complex9 = complex8.acos();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf(0.5574077246549021d);
        boolean boolean2 = complex1.isInfinite();
        org.apache.commons.math3.complex.Complex complex4 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double5 = complex4.getImaginary();
        org.apache.commons.math3.complex.Complex complex6 = complex4.negate();
        org.apache.commons.math3.complex.Complex complex8 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex9 = complex8.exp();
        double double10 = complex8.getArgument();
        org.apache.commons.math3.complex.Complex complex11 = complex8.log();
        org.apache.commons.math3.complex.Complex complex12 = complex8.log();
        org.apache.commons.math3.complex.Complex complex14 = complex12.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex15 = complex6.subtract(complex14);
        org.apache.commons.math3.complex.Complex complex16 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex17 = complex16.sqrt1z();
        boolean boolean18 = complex15.equals((java.lang.Object) complex17);
        org.apache.commons.math3.complex.ComplexField complexField19 = complex17.getField();
        org.apache.commons.math3.complex.Complex complex20 = complex1.multiply(complex17);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(complexField19);
        org.junit.Assert.assertNotNull(complex20);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex3 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double4 = complex3.getImaginary();
        org.apache.commons.math3.complex.Complex complex5 = complex3.negate();
        org.apache.commons.math3.complex.Complex complex7 = complex5.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex8 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex9 = complex5.subtract(complex8);
        org.apache.commons.math3.complex.Complex complex10 = complex8.sqrt();
        boolean boolean11 = complex1.equals((java.lang.Object) complex8);
        org.apache.commons.math3.complex.Complex complex13 = complex1.divide(1.1752011936438014d);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(complex13);
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex((double) 0.0f);
        boolean boolean2 = complex1.isInfinite();
        org.apache.commons.math3.complex.Complex complex3 = complex1.atan();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(complex3);
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((-0.7853981633974483d), (double) '#');
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) (short) -1, (double) '4');
        boolean boolean3 = complex2.isInfinite();
        org.apache.commons.math3.complex.Complex complex6 = new org.apache.commons.math3.complex.Complex((double) 0L, (double) 100.0f);
        org.apache.commons.math3.complex.Complex complex7 = complex2.multiply(complex6);
        boolean boolean8 = complex7.isNaN();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((-1.0d), 2.820679600601607E-23d);
        org.apache.commons.math3.complex.Complex complex4 = complex2.divide(5.1747561414661466E20d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
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
        org.apache.commons.math3.complex.Complex complex36 = complex35.sin();
        org.apache.commons.math3.complex.Complex complex39 = new org.apache.commons.math3.complex.Complex((double) (short) -1, (double) '4');
        org.apache.commons.math3.complex.Complex complex41 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double42 = complex41.getImaginary();
        org.apache.commons.math3.complex.Complex complex43 = complex41.negate();
        org.apache.commons.math3.complex.Complex complex45 = complex43.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex46 = complex45.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList48 = complex45.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex50 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex51 = complex50.exp();
        org.apache.commons.math3.complex.Complex complex52 = complex50.tanh();
        org.apache.commons.math3.complex.Complex complex53 = complex45.subtract(complex50);
        org.apache.commons.math3.complex.Complex complex54 = complex45.asin();
        java.lang.String str55 = complex54.toString();
        org.apache.commons.math3.complex.Complex complex56 = complex54.tanh();
        org.apache.commons.math3.complex.Complex complex57 = complex39.pow(complex54);
        org.apache.commons.math3.complex.Complex complex58 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex59 = complex58.sqrt1z();
        org.apache.commons.math3.complex.Complex complex61 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double62 = complex61.getImaginary();
        org.apache.commons.math3.complex.Complex complex63 = complex61.negate();
        org.apache.commons.math3.complex.Complex complex64 = complex63.sinh();
        org.apache.commons.math3.complex.Complex complex65 = complex64.acos();
        org.apache.commons.math3.complex.Complex complex66 = complex59.divide(complex64);
        org.apache.commons.math3.complex.Complex complex67 = complex66.tan();
        org.apache.commons.math3.complex.Complex complex68 = complex67.tan();
        boolean boolean69 = complex57.equals((java.lang.Object) complex67);
        org.apache.commons.math3.complex.Complex complex70 = complex67.reciprocal();
        boolean boolean71 = complex36.equals((java.lang.Object) complex70);
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
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complexList48);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertNotNull(complex53);
        org.junit.Assert.assertNotNull(complex54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "(1.5707963267948966, -0.0)" + "'", str55, "(1.5707963267948966, -0.0)");
        org.junit.Assert.assertNotNull(complex56);
        org.junit.Assert.assertNotNull(complex57);
        org.junit.Assert.assertNotNull(complex58);
        org.junit.Assert.assertNotNull(complex59);
        org.junit.Assert.assertNotNull(complex61);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.0d + "'", double62 == 0.0d);
        org.junit.Assert.assertNotNull(complex63);
        org.junit.Assert.assertNotNull(complex64);
        org.junit.Assert.assertNotNull(complex65);
        org.junit.Assert.assertNotNull(complex66);
        org.junit.Assert.assertNotNull(complex67);
        org.junit.Assert.assertNotNull(complex68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(complex70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf(32.01562118716424d, 4.605170185988092d);
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
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
        org.apache.commons.math3.complex.Complex complex34 = complex31.conjugate();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(complex9);
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
        org.junit.Assert.assertNotNull(complexList28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(complex34);
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.sin();
        org.apache.commons.math3.complex.Complex complex7 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex10 = org.apache.commons.math3.complex.Complex.valueOf(0.0d, (double) (byte) -1);
        org.apache.commons.math3.complex.Complex complex11 = complex10.sinh();
        org.apache.commons.math3.complex.Complex complex12 = complex11.sinh();
        org.apache.commons.math3.complex.Complex complex13 = complex11.tanh();
        org.apache.commons.math3.complex.Complex complex14 = complex11.sinh();
        org.apache.commons.math3.complex.Complex complex15 = complex1.add(complex11);
        org.apache.commons.math3.complex.Complex complex17 = complex11.multiply((-1));
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex17);
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) (short) -1, (double) '4');
        org.apache.commons.math3.complex.Complex complex3 = complex2.cos();
        org.apache.commons.math3.complex.Complex complex5 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex6 = complex5.sqrt();
        org.apache.commons.math3.complex.Complex complex7 = complex5.sqrt();
        org.apache.commons.math3.complex.Complex complex8 = complex7.tanh();
        org.apache.commons.math3.complex.Complex complex9 = complex2.divide(complex7);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList11 = complex7.nthRoot((int) 'a');
        org.apache.commons.math3.complex.Complex complex13 = complex7.subtract(4.495285579572625d);
        org.apache.commons.math3.complex.Complex complex14 = complex13.cos();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complexList11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply(10);
        org.apache.commons.math3.complex.Complex complex6 = complex5.log();
        org.apache.commons.math3.complex.Complex complex8 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex9 = complex8.exp();
        double double10 = complex8.getArgument();
        org.apache.commons.math3.complex.Complex complex12 = complex8.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex13 = complex8.sin();
        org.apache.commons.math3.complex.Complex complex14 = complex8.cosh();
        org.apache.commons.math3.complex.Complex complex15 = complex8.tan();
        org.apache.commons.math3.complex.Complex complex16 = complex8.tan();
        org.apache.commons.math3.complex.Complex complex18 = complex8.subtract((double) (short) -1);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList20 = complex8.nthRoot(100);
        org.apache.commons.math3.complex.Complex complex21 = complex8.sinh();
        org.apache.commons.math3.complex.Complex complex23 = complex21.subtract((double) 10L);
        org.apache.commons.math3.complex.Complex complex24 = complex23.sqrt();
        org.apache.commons.math3.complex.Complex complex26 = complex23.add((double) 100.0f);
        org.apache.commons.math3.complex.Complex complex27 = complex23.acos();
        org.apache.commons.math3.complex.Complex complex28 = complex6.multiply(complex27);
        double double29 = complex27.getImaginary();
        org.apache.commons.math3.complex.Complex complex31 = complex27.multiply((int) (byte) 0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
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
        org.junit.Assert.assertNotNull(complexList20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-2.8674872284279536d) + "'", double29 == (-2.8674872284279536d));
        org.junit.Assert.assertNotNull(complex31);
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
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
        org.apache.commons.math3.complex.Complex complex28 = complex26.pow(1.5430806348152437d);
        org.apache.commons.math3.complex.Complex complex30 = complex28.multiply((double) 10L);
        org.apache.commons.math3.complex.Complex complex31 = complex28.tan();
        org.apache.commons.math3.complex.Complex complex32 = complex31.asin();
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
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
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex5.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex9 = complex5.log();
        org.apache.commons.math3.complex.Complex complex10 = complex5.reciprocal();
        org.apache.commons.math3.complex.Complex complex12 = complex10.add(1.5900247258946039d);
        org.apache.commons.math3.complex.Complex complex13 = complex10.conjugate();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexList8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 10, (double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex4 = complex2.add((double) (byte) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex2.multiply(1);
        double double7 = complex2.getReal();
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
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
        org.apache.commons.math3.complex.Complex complex27 = complex22.multiply((-32.0d));
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex27);
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex5 = complex1.subtract((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex6 = complex5.log();
        org.apache.commons.math3.complex.Complex complex8 = complex5.subtract((double) 10L);
        boolean boolean9 = complex8.isInfinite();
        org.apache.commons.math3.complex.Complex complex10 = complex8.acos();
        org.apache.commons.math3.complex.Complex complex11 = complex10.log();
        org.apache.commons.math3.complex.Complex complex12 = complex11.asin();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex4 = complex3.sinh();
        org.apache.commons.math3.complex.Complex complex5 = complex4.tanh();
        org.apache.commons.math3.complex.Complex complex7 = complex5.subtract((double) 1L);
        org.apache.commons.math3.complex.Complex complex8 = complex7.sqrt();
        org.apache.commons.math3.complex.Complex complex10 = complex7.add(0.1585290151921035d);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex1 = complex0.sqrt1z();
        org.apache.commons.math3.complex.Complex complex2 = complex0.sqrt();
        double double3 = complex0.abs();
        org.apache.commons.math3.complex.Complex complex4 = complex0.sqrt();
        org.apache.commons.math3.complex.Complex complex5 = complex0.sqrt();
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex6 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex7 = complex6.asin();
        org.apache.commons.math3.complex.Complex complex9 = complex6.pow((-2.5767183366103934d));
        org.apache.commons.math3.complex.Complex complex10 = complex6.sqrt1z();
        org.apache.commons.math3.complex.Complex complex13 = new org.apache.commons.math3.complex.Complex((double) '4', (double) (short) 100);
        org.apache.commons.math3.complex.Complex complex15 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double16 = complex15.getImaginary();
        org.apache.commons.math3.complex.Complex complex17 = complex15.negate();
        org.apache.commons.math3.complex.Complex complex19 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex20 = complex19.exp();
        double double21 = complex19.getArgument();
        org.apache.commons.math3.complex.Complex complex22 = complex19.log();
        org.apache.commons.math3.complex.Complex complex23 = complex19.log();
        org.apache.commons.math3.complex.Complex complex25 = complex23.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex26 = complex17.subtract(complex25);
        org.apache.commons.math3.complex.Complex complex27 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex28 = complex27.sqrt1z();
        boolean boolean29 = complex26.equals((java.lang.Object) complex28);
        org.apache.commons.math3.complex.Complex complex31 = complex26.multiply(10.0d);
        org.apache.commons.math3.complex.Complex complex32 = complex26.sqrt();
        org.apache.commons.math3.complex.Complex complex33 = complex13.divide(complex32);
        org.apache.commons.math3.complex.Complex complex34 = complex13.atan();
        org.apache.commons.math3.complex.Complex complex35 = complex10.subtract(complex34);
        org.apache.commons.math3.complex.Complex complex37 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex38 = complex37.exp();
        boolean boolean39 = complex38.isNaN();
        org.apache.commons.math3.complex.Complex complex41 = complex38.pow((double) 0L);
        org.apache.commons.math3.complex.Complex complex44 = new org.apache.commons.math3.complex.Complex((double) (-1.0f), (double) 100.0f);
        org.apache.commons.math3.complex.Complex complex45 = complex41.pow(complex44);
        double double46 = complex41.getImaginary();
        org.apache.commons.math3.complex.Complex complex47 = complex41.tan();
        boolean boolean48 = complex35.equals((java.lang.Object) complex41);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math3.complex.Complex complex3 = complex1.sqrt();
        org.apache.commons.math3.complex.Complex complex4 = complex1.sinh();
        org.apache.commons.math3.complex.Complex complex5 = complex4.exp();
        org.apache.commons.math3.complex.Complex complex6 = complex4.acos();
        org.apache.commons.math3.complex.Complex complex7 = complex6.asin();
        org.apache.commons.math3.complex.Complex complex8 = complex6.sqrt();
        double double9 = complex8.getImaginary();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5401987508928625d + "'", double9 == 0.5401987508928625d);
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((double) (byte) 10, 0.0d);
        org.apache.commons.math3.complex.Complex complex4 = complex2.subtract((double) (-1L));
        org.apache.commons.math3.complex.Complex complex5 = complex2.reciprocal();
        org.apache.commons.math3.complex.Complex complex6 = complex5.negate();
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.valueOf(0.0d, (double) (byte) -1);
        org.apache.commons.math3.complex.Complex complex10 = complex9.sinh();
        org.apache.commons.math3.complex.Complex complex11 = complex10.sinh();
        org.apache.commons.math3.complex.Complex complex12 = complex10.tanh();
        org.apache.commons.math3.complex.Complex complex13 = complex10.sinh();
        org.apache.commons.math3.complex.Complex complex14 = complex13.atan();
        boolean boolean15 = complex5.equals((java.lang.Object) complex14);
        org.apache.commons.math3.complex.Complex complex16 = complex5.sqrt();
        org.apache.commons.math3.complex.Complex complex17 = complex5.exp();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
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
        org.apache.commons.math3.complex.Complex complex26 = complex22.cosh();
        org.apache.commons.math3.complex.Complex complex29 = new org.apache.commons.math3.complex.Complex((double) 0.0f, (double) 10.0f);
        org.apache.commons.math3.complex.Complex complex30 = complex29.cosh();
        org.apache.commons.math3.complex.Complex complex31 = complex29.sin();
        org.apache.commons.math3.complex.Complex complex32 = complex22.multiply(complex31);
        org.apache.commons.math3.complex.Complex complex34 = complex31.pow(2.718281828459045d);
        org.apache.commons.math3.complex.Complex complex36 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex37 = complex36.exp();
        double double38 = complex36.getArgument();
        org.apache.commons.math3.complex.Complex complex40 = complex36.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex41 = complex36.sin();
        org.apache.commons.math3.complex.Complex complex42 = complex36.cosh();
        org.apache.commons.math3.complex.Complex complex43 = complex36.tan();
        org.apache.commons.math3.complex.Complex complex44 = complex36.tan();
        org.apache.commons.math3.complex.Complex complex46 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex47 = complex46.exp();
        double double48 = complex46.getArgument();
        org.apache.commons.math3.complex.Complex complex50 = complex46.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex51 = complex46.sin();
        org.apache.commons.math3.complex.Complex complex52 = complex46.cosh();
        org.apache.commons.math3.complex.Complex complex53 = complex46.tan();
        org.apache.commons.math3.complex.Complex complex54 = complex46.tan();
        org.apache.commons.math3.complex.Complex complex56 = complex46.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex57 = complex44.subtract(complex46);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList59 = complex57.nthRoot((int) '4');
        org.apache.commons.math3.complex.Complex complex60 = complex57.cos();
        org.apache.commons.math3.complex.Complex complex61 = complex57.tanh();
        boolean boolean62 = complex34.equals((java.lang.Object) complex57);
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
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertNotNull(complex53);
        org.junit.Assert.assertNotNull(complex54);
        org.junit.Assert.assertNotNull(complex56);
        org.junit.Assert.assertNotNull(complex57);
        org.junit.Assert.assertNotNull(complexList59);
        org.junit.Assert.assertNotNull(complex60);
        org.junit.Assert.assertNotNull(complex61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
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
        org.apache.commons.math3.complex.ComplexField complexField28 = complex26.getField();
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
        org.junit.Assert.assertNotNull(complexField28);
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
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
        org.apache.commons.math3.complex.Complex complex62 = complex19.pow(complex58);
        org.apache.commons.math3.complex.Complex complex63 = complex62.reciprocal();
        org.apache.commons.math3.complex.Complex complex64 = complex62.exp();
        org.apache.commons.math3.complex.Complex complex65 = complex62.cosh();
        org.apache.commons.math3.complex.Complex complex66 = complex65.acos();
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
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complexList30);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertNotNull(complex53);
        org.junit.Assert.assertNotNull(complex54);
        org.junit.Assert.assertNotNull(complex55);
        org.junit.Assert.assertNotNull(complex57);
        org.junit.Assert.assertNotNull(complex58);
        org.junit.Assert.assertNotNull(complexList60);
        org.junit.Assert.assertNotNull(complex61);
        org.junit.Assert.assertNotNull(complex62);
        org.junit.Assert.assertNotNull(complex63);
        org.junit.Assert.assertNotNull(complex64);
        org.junit.Assert.assertNotNull(complex65);
        org.junit.Assert.assertNotNull(complex66);
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 0L, (double) 100.0f);
        java.lang.String str3 = complex2.toString();
        org.apache.commons.math3.complex.Complex complex4 = complex2.negate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(0.0, 100.0)" + "'", str3, "(0.0, 100.0)");
        org.junit.Assert.assertNotNull(complex4);
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) (short) 10);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex4 = complex1.divide((double) (byte) 10);
        double double5 = complex4.getReal();
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex8 = complex7.exp();
        double double9 = complex7.getArgument();
        org.apache.commons.math3.complex.Complex complex11 = complex7.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex12 = complex7.sin();
        org.apache.commons.math3.complex.Complex complex13 = complex7.cosh();
        org.apache.commons.math3.complex.Complex complex14 = complex7.tan();
        org.apache.commons.math3.complex.Complex complex16 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex17 = complex16.exp();
        double double18 = complex16.getArgument();
        org.apache.commons.math3.complex.Complex complex20 = complex16.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex21 = complex16.sin();
        org.apache.commons.math3.complex.Complex complex22 = complex16.cosh();
        org.apache.commons.math3.complex.Complex complex23 = complex16.tan();
        org.apache.commons.math3.complex.Complex complex24 = complex16.tan();
        org.apache.commons.math3.complex.Complex complex26 = complex16.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex27 = complex14.pow(complex26);
        org.apache.commons.math3.complex.Complex complex28 = complex4.subtract(complex27);
        org.apache.commons.math3.complex.Complex complex31 = new org.apache.commons.math3.complex.Complex((double) (short) 1, (double) (byte) 10);
        org.apache.commons.math3.complex.Complex complex32 = complex4.divide(complex31);
        double double33 = complex31.abs();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
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
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 10.04987562112089d + "'", double33 == 10.04987562112089d);
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
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
        org.apache.commons.math3.complex.Complex complex21 = complex19.reciprocal();
        org.apache.commons.math3.complex.Complex complex22 = complex19.tanh();
        org.apache.commons.math3.complex.Complex complex23 = complex22.reciprocal();
        org.apache.commons.math3.complex.Complex complex26 = org.apache.commons.math3.complex.Complex.valueOf((double) (short) 1, (-1.2613182101454838E-15d));
        org.apache.commons.math3.complex.Complex complex28 = complex26.multiply(0.1585290151921035d);
        org.apache.commons.math3.complex.Complex complex29 = complex23.divide(complex28);
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
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 10, (double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex4 = complex2.add((double) (byte) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex4.pow(1.0d);
        org.apache.commons.math3.complex.Complex complex7 = complex6.sin();
        org.apache.commons.math3.complex.Complex complex9 = complex6.divide(1.0349512282932293E22d);
        org.apache.commons.math3.complex.Complex complex10 = complex6.cos();
        java.lang.String str11 = complex6.toString();
        org.apache.commons.math3.complex.ComplexField complexField12 = complex6.getField();
        boolean boolean13 = complex6.isNaN();
        org.apache.commons.math3.complex.Complex complex15 = complex6.subtract((-96.0d));
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(19.999999999999996, 0.0)" + "'", str11, "(19.999999999999996, 0.0)");
        org.junit.Assert.assertNotNull(complexField12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(complex15);
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        double double6 = complex5.getReal();
        org.apache.commons.math3.complex.Complex complex7 = complex5.atan();
        double double8 = complex7.abs();
        org.apache.commons.math3.complex.Complex complex9 = complex7.cosh();
        org.apache.commons.math3.complex.Complex complex10 = complex7.sqrt();
        org.apache.commons.math3.complex.Complex complex11 = complex10.sqrt();
        org.apache.commons.math3.complex.Complex complex12 = complex10.asin();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.7853981633974483d + "'", double8 == 0.7853981633974483d);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex6 = complex1.sqrt1z();
        boolean boolean7 = complex1.isNaN();
        org.apache.commons.math3.complex.Complex complex8 = complex1.log();
        org.apache.commons.math3.complex.Complex complex9 = complex8.cos();
        org.apache.commons.math3.complex.Complex complex10 = complex9.atan();
        double double11 = complex9.getArgument();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-0.0d) + "'", double11 == (-0.0d));
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf(100.0d, (double) (short) 100);
        org.apache.commons.math3.complex.Complex complex5 = new org.apache.commons.math3.complex.Complex((double) 10, (double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex7 = complex5.add((double) (byte) 10);
        double double8 = complex7.getImaginary();
        org.apache.commons.math3.complex.Complex complex9 = complex7.tan();
        double double10 = complex7.getReal();
        org.apache.commons.math3.complex.Complex complex11 = complex7.cos();
        org.apache.commons.math3.complex.Complex complex12 = complex2.subtract(complex11);
        org.apache.commons.math3.complex.Complex complex14 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double15 = complex14.getImaginary();
        org.apache.commons.math3.complex.Complex complex17 = complex14.pow((double) 100L);
        org.apache.commons.math3.complex.Complex complex18 = complex2.multiply(complex14);
        org.apache.commons.math3.complex.Complex complex20 = org.apache.commons.math3.complex.Complex.valueOf(1.557407724654902d);
        boolean boolean21 = complex20.isNaN();
        org.apache.commons.math3.complex.Complex complex22 = complex2.multiply(complex20);
        org.apache.commons.math3.complex.Complex complex24 = complex20.subtract(1.5037960103594437d);
        java.lang.Class<?> wildcardClass25 = complex24.getClass();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
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
        org.apache.commons.math3.complex.Complex complex27 = complex22.atan();
        org.apache.commons.math3.complex.Complex complex30 = new org.apache.commons.math3.complex.Complex((double) 10, (double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex32 = complex30.add((double) (byte) 10);
        org.apache.commons.math3.complex.Complex complex34 = complex32.pow(1.0d);
        org.apache.commons.math3.complex.Complex complex35 = complex34.sin();
        org.apache.commons.math3.complex.Complex complex37 = complex34.divide(1.0349512282932293E22d);
        org.apache.commons.math3.complex.Complex complex38 = complex34.cos();
        boolean boolean39 = complex22.equals((java.lang.Object) complex34);
        org.apache.commons.math3.complex.Complex complex41 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double42 = complex41.getImaginary();
        org.apache.commons.math3.complex.Complex complex43 = complex41.negate();
        org.apache.commons.math3.complex.Complex complex45 = complex43.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex46 = complex45.atan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList48 = complex45.nthRoot((int) ' ');
        org.apache.commons.math3.complex.Complex complex50 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex51 = complex50.exp();
        org.apache.commons.math3.complex.Complex complex52 = complex50.tanh();
        org.apache.commons.math3.complex.Complex complex53 = complex45.subtract(complex50);
        org.apache.commons.math3.complex.Complex complex54 = complex50.cosh();
        org.apache.commons.math3.complex.Complex complex55 = complex22.multiply(complex54);
        java.lang.String str56 = complex54.toString();
        double double57 = complex54.abs();
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
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complexList48);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertNotNull(complex53);
        org.junit.Assert.assertNotNull(complex54);
        org.junit.Assert.assertNotNull(complex55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "(1.5430806348152437, 0.0)" + "'", str56, "(1.5430806348152437, 0.0)");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 1.5430806348152437d + "'", double57 == 1.5430806348152437d);
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
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
        boolean boolean24 = complex22.equals((java.lang.Object) 0.7853981633974483d);
        org.apache.commons.math3.complex.Complex complex25 = complex22.sin();
        boolean boolean26 = complex22.isInfinite();
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
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
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
        org.apache.commons.math3.complex.Complex complex16 = complex15.cosh();
        org.apache.commons.math3.complex.Complex complex17 = complex15.atan();
        org.apache.commons.math3.complex.Complex complex19 = complex17.divide((double) 'a');
        java.lang.Class<?> wildcardClass20 = complex17.getClass();
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
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
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
        org.apache.commons.math3.complex.Complex complex28 = complex26.pow(1.5430806348152437d);
        org.apache.commons.math3.complex.Complex complex30 = complex28.multiply((double) 10L);
        org.apache.commons.math3.complex.Complex complex31 = complex28.tan();
        org.apache.commons.math3.complex.Complex complex32 = complex31.acos();
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
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
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex(3.141592653589793d, 0.0d);
        org.apache.commons.math3.complex.Complex complex3 = complex2.acos();
        double double4 = complex2.getImaginary();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf(0.0d, (double) (byte) -1);
        org.apache.commons.math3.complex.Complex complex3 = complex2.sinh();
        org.apache.commons.math3.complex.Complex complex4 = complex3.sqrt();
        org.apache.commons.math3.complex.Complex complex5 = complex3.negate();
        org.apache.commons.math3.complex.Complex complex6 = complex5.reciprocal();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex(8.509181282393216d);
        boolean boolean2 = complex1.isNaN();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tanh();
        org.apache.commons.math3.complex.Complex complex5 = complex1.add(4.851651954097903E8d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
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
        org.apache.commons.math3.complex.Complex complex29 = complex27.acos();
        double double30 = complex29.getReal();
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
        org.apache.commons.math3.complex.Complex complex46 = complex45.tan();
        org.apache.commons.math3.complex.Complex complex48 = complex46.multiply((double) (short) 1);
        org.apache.commons.math3.complex.Complex complex49 = complex29.subtract(complex48);
        org.apache.commons.math3.complex.Complex complex50 = complex29.atan();
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
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complexList39);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex50);
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
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
        double double12 = complex10.getArgument();
        org.apache.commons.math3.complex.Complex complex14 = complex10.pow((double) '#');
        org.apache.commons.math3.complex.Complex complex15 = complex10.exp();
        org.apache.commons.math3.complex.Complex complex17 = complex15.multiply((int) (short) 0);
        org.apache.commons.math3.complex.Complex complex18 = complex15.tan();
        org.apache.commons.math3.complex.Complex complex19 = complex8.divide(complex15);
        org.apache.commons.math3.complex.Complex complex20 = complex15.exp();
        java.lang.Class<?> wildcardClass21 = complex15.getClass();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex(3506.7733852965175d, 0.7615941559557649d);
        boolean boolean3 = complex2.isNaN();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf(0.7853981633974483d, (-32.0d));
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
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
        org.apache.commons.math3.complex.Complex complex16 = complex15.cosh();
        boolean boolean17 = complex15.isNaN();
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
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex1.sin();
        org.apache.commons.math3.complex.Complex complex7 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex8 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex9 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex11 = complex1.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex12 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex13 = complex12.conjugate();
        boolean boolean14 = complex13.isNaN();
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
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex7 = complex3.pow((double) 100L);
        org.apache.commons.math3.complex.Complex complex8 = complex7.sin();
        org.apache.commons.math3.complex.Complex complex9 = complex7.cosh();
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex12 = complex11.exp();
        boolean boolean13 = complex12.isNaN();
        double double14 = complex12.getArgument();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList16 = complex12.nthRoot((int) (short) 1);
        double double17 = complex12.getArgument();
        org.apache.commons.math3.complex.Complex complex18 = complex12.sqrt1z();
        org.apache.commons.math3.complex.Complex complex20 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex21 = complex20.sqrt();
        org.apache.commons.math3.complex.Complex complex23 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double24 = complex23.getImaginary();
        org.apache.commons.math3.complex.Complex complex26 = complex23.pow((double) 100L);
        org.apache.commons.math3.complex.Complex complex27 = complex21.pow(complex26);
        org.apache.commons.math3.complex.Complex complex28 = complex27.log();
        org.apache.commons.math3.complex.Complex complex29 = complex18.divide(complex27);
        org.apache.commons.math3.complex.Complex complex30 = complex18.sin();
        org.apache.commons.math3.complex.Complex complex32 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double33 = complex32.getImaginary();
        org.apache.commons.math3.complex.Complex complex34 = complex32.negate();
        org.apache.commons.math3.complex.Complex complex36 = complex34.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex37 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex38 = complex34.subtract(complex37);
        org.apache.commons.math3.complex.Complex complex39 = complex34.cosh();
        org.apache.commons.math3.complex.Complex complex40 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex41 = complex40.sqrt1z();
        org.apache.commons.math3.complex.Complex complex43 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double44 = complex43.getImaginary();
        org.apache.commons.math3.complex.Complex complex45 = complex43.negate();
        org.apache.commons.math3.complex.Complex complex46 = complex45.sinh();
        org.apache.commons.math3.complex.Complex complex47 = complex46.acos();
        org.apache.commons.math3.complex.Complex complex48 = complex41.divide(complex46);
        org.apache.commons.math3.complex.Complex complex49 = complex48.tan();
        org.apache.commons.math3.complex.Complex complex50 = complex39.subtract(complex48);
        org.apache.commons.math3.complex.Complex complex52 = complex50.add(2.1415926494674857d);
        org.apache.commons.math3.complex.Complex complex53 = complex18.divide(complex50);
        org.apache.commons.math3.complex.Complex complex54 = complex9.multiply(complex53);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(complexList16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
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
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertNotNull(complex53);
        org.junit.Assert.assertNotNull(complex54);
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math3.complex.Complex complex3 = complex1.sqrt();
        org.apache.commons.math3.complex.Complex complex4 = complex3.tanh();
        org.apache.commons.math3.complex.Complex complex5 = complex4.acos();
        org.apache.commons.math3.complex.Complex complex7 = complex5.multiply((double) '4');
        org.apache.commons.math3.complex.Complex complex10 = new org.apache.commons.math3.complex.Complex((double) (byte) 100, 0.0d);
        org.apache.commons.math3.complex.Complex complex11 = complex10.sqrt();
        org.apache.commons.math3.complex.Complex complex12 = complex10.log();
        org.apache.commons.math3.complex.Complex complex14 = complex12.multiply((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex15 = complex12.sqrt1z();
        org.apache.commons.math3.complex.Complex complex16 = complex15.tan();
        org.apache.commons.math3.complex.Complex complex17 = complex16.exp();
        org.apache.commons.math3.complex.Complex complex18 = complex17.negate();
        org.apache.commons.math3.complex.Complex complex19 = complex7.pow(complex17);
        org.apache.commons.math3.complex.Complex complex20 = complex7.exp();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex(10.0d, (double) 100L);
        org.apache.commons.math3.complex.Complex complex4 = new org.apache.commons.math3.complex.Complex(1.0d);
        org.apache.commons.math3.complex.Complex complex5 = complex4.sqrt();
        org.apache.commons.math3.complex.Complex complex6 = complex2.multiply(complex5);
        org.apache.commons.math3.complex.Complex complex7 = complex2.asin();
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex1 = complex0.sqrt1z();
        org.apache.commons.math3.complex.Complex complex3 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double4 = complex3.getImaginary();
        org.apache.commons.math3.complex.Complex complex5 = complex3.negate();
        org.apache.commons.math3.complex.Complex complex6 = complex5.sinh();
        org.apache.commons.math3.complex.Complex complex7 = complex6.acos();
        org.apache.commons.math3.complex.Complex complex8 = complex1.divide(complex6);
        org.apache.commons.math3.complex.Complex complex9 = complex8.tan();
        org.apache.commons.math3.complex.Complex complex10 = complex9.tan();
        org.apache.commons.math3.complex.Complex complex12 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double13 = complex12.getImaginary();
        org.apache.commons.math3.complex.Complex complex14 = complex12.negate();
        org.apache.commons.math3.complex.Complex complex16 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex17 = complex16.exp();
        double double18 = complex16.getArgument();
        org.apache.commons.math3.complex.Complex complex19 = complex16.log();
        org.apache.commons.math3.complex.Complex complex20 = complex16.log();
        org.apache.commons.math3.complex.Complex complex22 = complex20.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex23 = complex14.subtract(complex22);
        org.apache.commons.math3.complex.Complex complex24 = complex23.cos();
        org.apache.commons.math3.complex.Complex complex25 = complex24.sqrt1z();
        org.apache.commons.math3.complex.Complex complex26 = complex10.multiply(complex24);
        org.apache.commons.math3.complex.Complex complex27 = complex10.cos();
        org.apache.commons.math3.complex.Complex complex28 = complex10.sin();
        org.apache.commons.math3.complex.Complex complex29 = complex28.sqrt();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
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
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
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
        org.apache.commons.math3.complex.Complex complex25 = complex23.multiply((int) 'a');
        org.apache.commons.math3.complex.Complex complex26 = complex23.cosh();
        org.apache.commons.math3.complex.ComplexField complexField27 = complex26.getField();
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
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complexField27);
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex1.pow((double) 10);
        double double6 = complex5.getReal();
        org.apache.commons.math3.complex.Complex complex7 = complex5.atan();
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double10 = complex9.getImaginary();
        org.apache.commons.math3.complex.Complex complex11 = complex9.negate();
        org.apache.commons.math3.complex.Complex complex13 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex14 = complex13.exp();
        double double15 = complex13.getArgument();
        org.apache.commons.math3.complex.Complex complex16 = complex13.log();
        org.apache.commons.math3.complex.Complex complex17 = complex13.log();
        org.apache.commons.math3.complex.Complex complex19 = complex17.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex20 = complex11.subtract(complex19);
        org.apache.commons.math3.complex.Complex complex21 = complex20.cos();
        org.apache.commons.math3.complex.Complex complex22 = complex21.sqrt1z();
        org.apache.commons.math3.complex.Complex complex23 = complex7.pow(complex22);
        org.apache.commons.math3.complex.Complex complex24 = complex22.cosh();
        java.lang.String str25 = complex22.toString();
        org.apache.commons.math3.complex.Complex complex26 = complex22.conjugate();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList28 = complex26.nthRoot((int) (short) 100);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "(0.8414709848078964, 0.0)" + "'", str25, "(0.8414709848078964, 0.0)");
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complexList28);
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf(1.3440585709080678E43d, 100.00499987500623d);
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
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
        org.apache.commons.math3.complex.Complex complex16 = complex12.divide((double) 100.0f);
        org.apache.commons.math3.complex.Complex complex17 = complex12.atan();
        org.apache.commons.math3.complex.Complex complex19 = complex12.pow(0.8509181282393216d);
        org.apache.commons.math3.complex.Complex complex21 = complex12.pow(2.97065629219474d);
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
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex21);
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 0.0f, (double) 10.0f);
        org.apache.commons.math3.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math3.complex.Complex complex4 = complex2.sin();
        org.apache.commons.math3.complex.ComplexField complexField5 = complex2.getField();
        org.apache.commons.math3.complex.Complex complex6 = complex2.tanh();
        double double7 = complex6.getImaginary();
        org.apache.commons.math3.complex.Complex complex9 = complex6.pow((-32.0d));
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complexField5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.6483608274590866d + "'", double7 == 0.6483608274590866d);
        org.junit.Assert.assertNotNull(complex9);
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        double double2 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex3 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.multiply((-1.0d));
        org.apache.commons.math3.complex.Complex complex7 = complex3.pow((double) 100L);
        org.apache.commons.math3.complex.Complex complex8 = complex3.reciprocal();
        org.apache.commons.math3.complex.Complex complex10 = complex8.multiply((int) (byte) 0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf(0.0d, (-1.2613182101454838E-15d));
        double double3 = complex2.abs();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.2613182101454838E-15d + "'", double3 == 1.2613182101454838E-15d);
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 10, (double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex4 = complex2.add((double) (byte) 10);
        org.apache.commons.math3.complex.Complex complex5 = complex4.sinh();
        boolean boolean6 = complex5.isNaN();
        org.apache.commons.math3.complex.Complex complex7 = complex5.tan();
        org.apache.commons.math3.complex.Complex complex9 = complex5.divide(10.04987562112089d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) (byte) 100, 0.0d);
        org.apache.commons.math3.complex.Complex complex3 = complex2.sqrt();
        org.apache.commons.math3.complex.Complex complex4 = complex2.log();
        org.apache.commons.math3.complex.Complex complex6 = complex4.multiply((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex7 = complex4.tan();
        double double8 = complex7.getImaginary();
        org.apache.commons.math3.complex.Complex complex9 = complex7.sqrt();
        org.apache.commons.math3.complex.Complex complex12 = new org.apache.commons.math3.complex.Complex((double) 1, (double) (byte) 0);
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
        org.apache.commons.math3.complex.Complex complex41 = complex40.acos();
        org.apache.commons.math3.complex.Complex complex42 = complex12.multiply(complex41);
        boolean boolean43 = complex9.equals((java.lang.Object) complex42);
        org.apache.commons.math3.complex.Complex complex44 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex45 = complex44.cosh();
        org.apache.commons.math3.complex.Complex complex46 = complex44.conjugate();
        org.apache.commons.math3.complex.Complex complex49 = new org.apache.commons.math3.complex.Complex((double) (short) -1, (double) '4');
        org.apache.commons.math3.complex.Complex complex50 = complex49.cos();
        org.apache.commons.math3.complex.Complex complex51 = complex44.subtract(complex49);
        org.apache.commons.math3.complex.Complex complex52 = complex51.atan();
        org.apache.commons.math3.complex.Complex complex53 = complex42.multiply(complex51);
        double double54 = complex53.getReal();
        org.apache.commons.math3.complex.Complex complex55 = complex53.asin();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(complex9);
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
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complexList37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertNotNull(complex53);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 26.978392951571227d + "'", double54 == 26.978392951571227d);
        org.junit.Assert.assertNotNull(complex55);
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex(11013.232874703393d, 2.0d);
        org.apache.commons.math3.complex.Complex complex4 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex5 = complex4.exp();
        double double6 = complex4.getArgument();
        org.apache.commons.math3.complex.Complex complex8 = complex4.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex9 = complex4.sin();
        org.apache.commons.math3.complex.Complex complex10 = complex2.divide(complex9);
        org.apache.commons.math3.complex.Complex complex12 = complex9.multiply((int) (byte) 1);
        org.apache.commons.math3.complex.Complex complex13 = complex12.cosh();
        org.apache.commons.math3.complex.Complex complex14 = complex12.sqrt1z();
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex4 = complex1.log();
        org.apache.commons.math3.complex.Complex complex5 = complex1.log();
        org.apache.commons.math3.complex.Complex complex7 = complex5.subtract((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex8 = complex5.sqrt();
        double double9 = complex5.getImaginary();
        org.apache.commons.math3.complex.Complex complex10 = complex5.exp();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList12 = complex5.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex13 = complex5.sqrt();
        org.apache.commons.math3.complex.Complex complex15 = complex13.multiply((int) '4');
        org.apache.commons.math3.complex.Complex complex16 = complex15.sin();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complexList12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
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
        org.apache.commons.math3.complex.Complex complex15 = complex5.cosh();
        org.apache.commons.math3.complex.Complex complex18 = new org.apache.commons.math3.complex.Complex((double) 10, (double) (byte) 0);
        org.apache.commons.math3.complex.ComplexField complexField19 = complex18.getField();
        org.apache.commons.math3.complex.Complex complex20 = complex18.reciprocal();
        boolean boolean21 = complex5.equals((java.lang.Object) complex18);
        org.apache.commons.math3.complex.Complex complex23 = complex18.subtract(3.738039258735582E-23d);
        org.apache.commons.math3.complex.Complex complex25 = complex18.multiply(1.5430806348152437d);
        org.apache.commons.math3.complex.Complex complex27 = new org.apache.commons.math3.complex.Complex((double) 100L);
        org.apache.commons.math3.complex.Complex complex29 = complex27.divide((double) (-1));
        org.apache.commons.math3.complex.Complex complex31 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex32 = complex31.exp();
        double double33 = complex31.getArgument();
        org.apache.commons.math3.complex.Complex complex35 = complex31.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex36 = complex31.sin();
        org.apache.commons.math3.complex.Complex complex37 = complex31.cosh();
        org.apache.commons.math3.complex.Complex complex38 = complex31.tan();
        org.apache.commons.math3.complex.Complex complex39 = complex27.multiply(complex38);
        org.apache.commons.math3.complex.Complex complex41 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex42 = complex41.exp();
        double double43 = complex41.getArgument();
        org.apache.commons.math3.complex.Complex complex45 = complex41.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex46 = complex41.sin();
        org.apache.commons.math3.complex.Complex complex47 = complex41.sin();
        org.apache.commons.math3.complex.Complex complex48 = complex47.tanh();
        org.apache.commons.math3.complex.Complex complex49 = complex38.pow(complex47);
        org.apache.commons.math3.complex.Complex complex50 = complex38.reciprocal();
        boolean boolean51 = complex25.equals((java.lang.Object) complex38);
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
        org.junit.Assert.assertNotNull(complexField19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
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
        org.apache.commons.math3.complex.Complex complex31 = complex25.tanh();
        org.apache.commons.math3.complex.Complex complex32 = complex16.multiply(complex25);
        boolean boolean33 = complex16.isInfinite();
        org.apache.commons.math3.complex.Complex complex35 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex36 = complex35.exp();
        double double37 = complex35.getArgument();
        org.apache.commons.math3.complex.Complex complex39 = complex35.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex40 = complex35.sin();
        org.apache.commons.math3.complex.Complex complex41 = complex35.cosh();
        org.apache.commons.math3.complex.Complex complex42 = complex35.tan();
        org.apache.commons.math3.complex.Complex complex43 = complex35.tan();
        org.apache.commons.math3.complex.Complex complex45 = org.apache.commons.math3.complex.Complex.valueOf((double) 1);
        org.apache.commons.math3.complex.Complex complex46 = complex45.exp();
        double double47 = complex45.getArgument();
        org.apache.commons.math3.complex.Complex complex49 = complex45.pow((double) 10);
        org.apache.commons.math3.complex.Complex complex50 = complex45.sin();
        org.apache.commons.math3.complex.Complex complex51 = complex45.cosh();
        org.apache.commons.math3.complex.Complex complex52 = complex45.tan();
        org.apache.commons.math3.complex.Complex complex53 = complex45.tan();
        org.apache.commons.math3.complex.Complex complex55 = complex45.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex56 = complex43.subtract(complex45);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList58 = complex56.nthRoot((int) '4');
        org.apache.commons.math3.complex.Complex complex59 = complex56.cos();
        org.apache.commons.math3.complex.Complex complex60 = complex56.sin();
        org.apache.commons.math3.complex.Complex complex61 = complex60.cosh();
        org.apache.commons.math3.complex.Complex complex62 = complex61.sinh();
        double double63 = complex62.abs();
        org.apache.commons.math3.complex.Complex complex64 = complex16.subtract(complex62);
        double double65 = complex16.abs();
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
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
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
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertNotNull(complex53);
        org.junit.Assert.assertNotNull(complex55);
        org.junit.Assert.assertNotNull(complex56);
        org.junit.Assert.assertNotNull(complexList58);
        org.junit.Assert.assertNotNull(complex59);
        org.junit.Assert.assertNotNull(complex60);
        org.junit.Assert.assertNotNull(complex61);
        org.junit.Assert.assertNotNull(complex62);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 1.4090092838232064d + "'", double63 == 1.4090092838232064d);
        org.junit.Assert.assertNotNull(complex64);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 8.824798806356199d + "'", double65 == 8.824798806356199d);
    }
}

