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
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(0, 126036, (-12));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(108496899700L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 108496899700L + "'", long2 == 108496899700L);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(0L, (long) (-210424900));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-210424900L) + "'", long2 == (-210424900L));
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-981859677480L), (long) (-113847));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-981859791327L) + "'", long2 == (-981859791327L));
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 328188373, (-1408273), (-1906981790));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 328188373 for hi! must be in the range [-1408273,-1906981790]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1327011976, 16640000, 1658);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-682184990), 174035L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-682010955L) + "'", long2 == (-682010955L));
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-23247), (long) (-223641402));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 223618155L + "'", long2 == 223618155L);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(365387, (-183048400));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 365387 * -183048400");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-36156566400L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -36156566400");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-11155500), 662370800, 360860);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-146920931), (-5822201), (-2818532));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1031830400, (-1416933), 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-376), (-2860465143759724L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1075534894053656224L + "'", long2 == 1075534894053656224L);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-6), (-2184), 388073);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-6) + "'", int3 == (-6));
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-39499200), (-881));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-39500081) + "'", int2 == (-39500081));
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-2691), (-487));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1310517L + "'", long2 == 1310517L);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(4754576L, (long) (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4754576) + "'", int2 == (-4754576));
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-232), (-7151));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1659032 + "'", int2 == 1659032);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-405), (-620L));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 251100 + "'", int2 == 251100);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-662370800), (-669384204));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -662370800 * -669384204");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 23380, (-13728), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1941944331), (java.lang.Object) (-293585530920L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-106666561665L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -106666561665");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-111143), (-848), 198429);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -111143 for  must be in the range [-848,198429]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (int) (byte) 100, 288650836, (-328191424));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for  must be in the range [288650836,-328191424]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-600430L), (long) (-480834));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1081264L) + "'", long2 == (-1081264L));
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 112100, 288129358, 5822201);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 112100 for hi! must be in the range [288129358,5822201]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(1280L, (-2084L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-804L) + "'", long2 == (-804L));
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(365387, (-11), (-164631), (-232));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-127824) + "'", int4 == (-127824));
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-16640000), 4205);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-69971200000L) + "'", long2 == (-69971200000L));
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-13));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-13) + "'", int1 == (-13));
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(182942901, (-18315), (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-15623) + "'", int3 == (-15623));
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-6664568), 0, 288129358, 340482756);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 307455826 + "'", int4 == 307455826);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-10), (long) (-140906));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1409060L + "'", long2 == 1409060L);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-376), (-2205840), (-1716));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-18315), (long) (-2184));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 39999960 + "'", int2 == 39999960);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(1820, 39271960, (-1821293));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(698584450, 46304, (-480834), (-320));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-38056) + "'", int4 == (-38056));
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(3553504, (-23380));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 3553504 * -23380");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-2507756022L), (java.lang.Object) (-166962));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(166311);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-166311) + "'", int1 == (-166311));
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-340473000), 5823902, (-2724));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1087985074174347L, (java.lang.Object) 1282760220758016000L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-165445), (-8922));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1476100290 + "'", int2 == 1476100290);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-2724), 149);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-405876) + "'", int2 == (-405876));
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-39468L), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-39468L) + "'", long2 == (-39468L));
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-21578), 166387, 40769747, 1936619533);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1895994596 + "'", int4 == 1895994596);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(2610334L, (-2020523054400L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -5274240026684169600");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 5824000, 288129410, 277588800);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 5824000 for hi! must be in the range [288129410,277588800]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) '4', (long) (-139679));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-139627L) + "'", long2 == (-139627L));
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1), 46592042, 1734960);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-34847965), 0, (-264), (-16387));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(2610003L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2610003L + "'", long2 == 2610003L);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(2610003L, (-4704000));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-12277454112000L) + "'", long2 == (-12277454112000L));
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 278071860, 14950028412L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 4157182207577686320");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(427401662688000L, (-1168498456));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 427401662688000 * -1168498456");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-881), (-773760));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-774641) + "'", int2 == (-774641));
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-2365), (-223641600), (-320));
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-450092), 165796, (-520));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1936619533, 172370, 9697);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-33L), (-10955745243177119L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10955745243177086L + "'", long2 == 10955745243177086L);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-109), (-654), 1895994596);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-5688740), 163128730, (-600993384), (-138217));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-443415178) + "'", int4 == (-443415178));
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 307455826, (-22058377L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 285397449L + "'", long2 == 285397449L);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(998820552, (-340473032));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 658347520 + "'", int2 == 658347520);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 8480, (-16387), (-111178));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-15623), (long) 5822201);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-90960246223L) + "'", long2 == (-90960246223L));
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, (-1248875160000L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-29906275), 1825);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -29906275 * 1825");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(1031830400, (-232));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1031830168 + "'", int2 == 1031830168);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 5822300, 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1821, (-166311), 1943795520);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-139679));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 139679 + "'", int1 == 139679);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(65412792997741L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 65412792997741");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 13728, (-1858), (-21687));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-271342676044832L), 775262592000000L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -271342676044832 * 775262592000000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-11647300L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-11647300) + "'", int1 == (-11647300));
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1327011976), (-328191424), 20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(139679, 1665);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 141344 + "'", int2 == 141344);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 3395, 1943795520, 1327011840);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 3395 for  must be in the range [1943795520,1327011840]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(0, (-109928));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-109928) + "'", int2 == (-109928));
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(7L, 3047616000L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 21333312000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(7176000, (-166080));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7009920 + "'", int2 == 7009920);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-1936619548));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1936619548 + "'", int1 == 1936619548);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 278071860);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 278071860 + "'", int1 == 278071860);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(220584L, (-2507756022L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-553170854356848L) + "'", long2 == (-553170854356848L));
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(40769747, (-138217));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 40631530 + "'", int2 == 40631530);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(1588768, 773440);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 1588768 * 773440");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1821293), 165786);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -1821293 * 165786");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(9724);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-9724) + "'", int1 == (-9724));
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-1372790), 18L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-24710220) + "'", int2 == (-24710220));
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(46592000, 130048209, 0, 544072);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 360557 + "'", int4 == 360557);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(198429, 1155);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 199584 + "'", int2 == 199584);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(520, (-113847));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-59200440) + "'", int2 == (-59200440));
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-102065L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-102065) + "'", int1 == (-102065));
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(1569, (-116550));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-182866950) + "'", int2 == (-182866950));
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-654));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 654 + "'", int1 == 654);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-2354711268033L), (long) (-808));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 1902606704570664");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 36L, (java.lang.Object) 21700000);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(2610334L, (long) (-111178));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-290211713452L) + "'", long2 == (-290211713452L));
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-384786135), 1716, (-8), 388073);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 192925 + "'", int4 == 192925);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(16639480, (-7010204));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 16639480 * -7010204");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 28291744, 0, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 28291744 for  must be in the range [0,0]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-1936734162), 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 549120);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 549120 + "'", int1 == 549120);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(199584, (-10), 182942800);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 199584 + "'", int3 == 199584);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(5822300);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-5822300) + "'", int1 == (-5822300));
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(288342622, (-21578));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 288321044 + "'", int2 == 288321044);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-31), (-443415178), 0, (-328191465));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 22, (-13728), 7009920);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1936619548, (-1144), 54912000, 520);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-1327011840), (-10955745243537979L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -1327011840 * -10955745243537979");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(773440, (-4704000), (-384786100), 7009920);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-3930560) + "'", int4 == (-3930560));
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(662370800, (-2612385));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 659758415 + "'", int2 == 659758415);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-59200440), 92, (-1144241020));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -59200440 for  must be in the range [92,-1144241020]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-166300), 2231);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-371015300L) + "'", long2 == (-371015300L));
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(302686020L, (-18));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5448348360L) + "'", long2 == (-5448348360L));
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-3030955200000L), (long) 382786);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -1160207217187200000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 198, 1741, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(198381826975680L, (-1664));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-330107360087531520L) + "'", long2 == (-330107360087531520L));
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(876405117732L, (long) (-18));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-15775292119176L) + "'", long2 == (-15775292119176L));
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-110024));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-110024) + "'", int1 == (-110024));
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(58240000000L, (long) (-12572));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-732193280000000L) + "'", long2 == (-732193280000000L));
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(277588800, 374783424, (-138217));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(192925, (-8), (-1655));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-216870), 149);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-32313630) + "'", int2 == (-32313630));
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-15623));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15623 + "'", int1 == 15623);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 46591874L, (java.lang.Object) 3733329600000L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-3423621056803668L), (-5448348360L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3423615608455308L) + "'", long2 == (-3423615608455308L));
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(396L, (-1936619520));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-766901329920L) + "'", long2 == (-766901329920L));
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1155), 1653, 1939364392, 19814190);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1416933), 1812096);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -1416933 * 1812096");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 190407252, (-808), (-166400));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-2132), (-448503), (-46590310));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(42395057619900L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 42395057619900");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 51354937, 1820, (-21645));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(500L, 54912000);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 27456000000L + "'", long2 == 27456000000L);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 571021860, (-1087985074176000L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1087985645197860L + "'", long2 == 1087985645197860L);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(19814520L, (long) (-986506979));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-966692459L) + "'", long2 == (-966692459L));
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1701), (-1658), 1939364392);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-264), 282221100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 282220836 + "'", int2 == 282220836);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 288650836, 8, (-111178));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 288650836 for  must be in the range [8,-111178]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-220584L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-220584) + "'", int1 == (-220584));
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(216767L, (-2205840));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-478153319280L) + "'", long2 == (-478153319280L));
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-329472), 190407252, 282221100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -329472 for hi! must be in the range [190407252,282221100]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-232));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 232 + "'", int1 == 232);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-166400), 255717);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 89317 + "'", int2 == 89317);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-2259000L), (java.lang.Object) (-1653));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-2052L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2052) + "'", int1 == (-2052));
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-3423621056803200L), (java.lang.Object) 9697L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 282876300, (-111143), (-114631));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-8));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-986506979), 1830400);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-984676579) + "'", int2 == (-984676579));
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-3590394), (long) 1031830168);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1028239774L + "'", long2 == 1028239774L);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 277588800, 135);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 37474488000L + "'", long2 == 37474488000L);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 163128730, (-480834), (-288078336));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-3580697), (-202903478), 23);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3580697) + "'", int3 == (-3580697));
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(388073);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-388073) + "'", int1 == (-388073));
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-282895011L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-282895011) + "'", int1 == (-282895011));
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(3553504, (-45934336));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 3553504 * -45934336");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-286596024L), (long) 23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -6591708552");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 656880, 1031830079);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 677788542293520L + "'", long2 == 677788542293520L);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-7151), (-1716), (-21700000), (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-8867) + "'", int4 == (-8867));
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(672043680, 164580);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 672043680 * 164580");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 136, (-11647300), (-46590310));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(108496899700L, (long) 198303);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 21515260701209100L + "'", long2 == 21515260701209100L);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(654);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-654) + "'", int1 == (-654));
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(198429, (-1716), (-4145590));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-110024), (long) 1327011976);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1326901952L + "'", long2 == 1326901952L);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(101L, (-23380));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2361380L) + "'", long2 == (-2361380L));
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-384786135), 182942901, (-59200440));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -384786135 for  must be in the range [182942901,-59200440]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(198400L, (-9L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1785600L) + "'", long2 == (-1785600L));
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-165445), 23);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3805235L) + "'", long2 == (-3805235L));
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1655), (-4122), (-216870));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-2184L), (-2575636));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5625189024L + "'", long2 == 5625189024L);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 288342622, 163128730);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 47036965731730060L + "'", long2 == 47036965731730060L);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 13741, (-5547853070320L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5547853084061L + "'", long2 == 5547853084061L);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1031377144), (-320), 2612385);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(94L, 3030955130077L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 284909782227238L + "'", long2 == 284909782227238L);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(46677556124824660L, 3030955130077L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 46677556124824660 * 3030955130077");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-340473000), 9724, 8480);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 182942901, 1476100290, (-7520));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(328191019L, (long) 182774349);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 59984899845371631L + "'", long2 == 59984899845371631L);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-19814190), (-2365), (-7010204));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 288342622, 28458464, (-1686));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-107265L), (long) (-3590394));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3483129L + "'", long2 == 3483129L);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 2231, 1734960, (-405876));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-321540), (-2184), 111143);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-41220), (-165796));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6834111120L + "'", long2 == 6834111120L);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(549120, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 549120 + "'", int2 == 549120);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-19597190L), (long) (-1936619548));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1956216738L) + "'", long2 == (-1956216738L));
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 453031164, (-1034683243939436L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1034683696970600L + "'", long2 == 1034683696970600L);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 46591948, (long) (-405));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-18869738940L) + "'", long2 == (-18869738940L));
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-2574773L), (-113847));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 293130181731L + "'", long2 == 293130181731L);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 5824000, 0, (-109928));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-29906275), (-16387));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-29922662) + "'", int2 == (-29922662));
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(0, (-388073), 340482756, (-1906981790));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-152711832L), 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1, 0, 70);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        org.joda.time.field.FieldUtils.verifyValueBounds("", (-405), (-450092), 97);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(0, (-1144241020), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-165445), 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-2575266), (-480834));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1238275451844L + "'", long2 == 1238275451844L);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-32) + "'", int1 == (-32));
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-8867), 46304, (-546));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-38056), 110647680L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -4210808110080");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1700), 43);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-73100) + "'", int2 == (-73100));
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(108496899700L, (long) (-139846));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-15172857435446200L) + "'", long2 == (-15172857435446200L));
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(1056L, (-1386L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2442L + "'", long2 == 2442L);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1476100290, 109, (-340473000), (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-226265106) + "'", int4 == (-226265106));
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1858), 138217, (-97));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-299284678L), (-1248875160000L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -299284678 * -1248875160000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-328191465));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 328191465 + "'", int1 == 328191465);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (int) '#', (-6190), 1287004160);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(186160, (-328190018), 70, 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 70 + "'", int4 == 70);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 115500, 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-125500));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 125500 + "'", int1 == 125500);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-13), (java.lang.Object) 39999960);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-322366149), (-40), (-376));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -322366149 for hi! must be in the range [-40,-376]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-340473000), (-42));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-340473042) + "'", int2 == (-340473042));
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (short) -1, (java.lang.Object) 1830400L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 54912000, (java.lang.Object) 22);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 165786, (-774641));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-128424632826L) + "'", long2 == (-128424632826L));
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((int) (short) 0, 2003383330, 138217, (-655200));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-42), (-1821293), 773440);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-5688740), (-11647300), (-1608));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-5688740) + "'", int3 == (-5688740));
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-329472), 340482756, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 233, (-654), 17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 1659032, (-9L));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-14931288) + "'", int2 == (-14931288));
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-240));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 240 + "'", int1 == 240);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 0, (-1608), (-662374000));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for  must be in the range [-1608,-662374000]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 1936402650, (long) (-4704000));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1931698650L + "'", long2 == 1931698650L);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(1828967L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1828967 + "'", int1 == 1828967);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(34893600000L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 34893600000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-374783424), (-7176000), (-102065), (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-24710) + "'", int4 == (-24710));
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-9724), 1734960, 320);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-1368923340861L), (-23270374400L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -1368923340861 * -23270374400");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 100, (-3553504), 69923);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-3200), 672043680, (-165796), (-141059));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-165194) + "'", int4 == (-165194));
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1.0d), (java.lang.Object) (-654));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-24849000));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-24849000) + "'", int1 == (-24849000));
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-984676579), 520, (-23247));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -984676579 for hi! must be in the range [520,-23247]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1372800L), (java.lang.Object) (-127824));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 328190018, (-662374000), (-56939));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 328190018 for  must be in the range [-662374000,-56939]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-2818532), (-1), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 2612385, 135, 166962);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 0, (-34847965), (-7010204));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 808, (-28793394610L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -23265062844880");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(11905704749L, (long) 28291744);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 11933996493L + "'", long2 == 11933996493L);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 186160, 4754576L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4940736L + "'", long2 == 4940736L);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-102065));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-102065) + "'", int1 == (-102065));
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        java.lang.Object obj1 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-90960246223L), obj1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-13728), (-21687), 165796);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-13728) + "'", int3 == (-13728));
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-2507756022L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -2507756022");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-4424364), 382873, (-654), 27432);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3037 + "'", int4 == 3037);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-45934336), 59984899845371631L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 59984899799437295L + "'", long2 == 59984899799437295L);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-19), (long) (-5822300));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5822319L) + "'", long2 == (-5822319L));
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-18), (-3590394), (-45934336));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -18 for hi! must be in the range [-3590394,-45934336]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-11155500));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-11155500) + "'", int1 == (-11155500));
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-109), (-12572));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-12681) + "'", int2 == (-12681));
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-264L), (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-265L) + "'", long2 == (-265L));
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-167014), 113, (-1031377144));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -167014 for hi! must be in the range [113,-1031377144]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-6));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, 5824000);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-2052), 4784000, (-808), 1031830400);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4781948 + "'", int4 == 4781948);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-110024), (-405876));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -110024 * -405876");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-986506979), (-21578), (-39500081), (-21645));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-39046069) + "'", int4 == (-39046069));
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1700), 0, 158513520, (-1936619531));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-56939), (-107265L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-164204L) + "'", long2 == (-164204L));
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 13728, 376, (-1144));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(2231, 5200);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7431 + "'", int2 == 7431);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(141344, 659758415, (-60446), (-60446));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-1665532800), (-18568282492L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -1665532800 * -18568282492");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-808));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 808 + "'", int1 == 808);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-10), (-71587), (-480834), (-166400));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-386032) + "'", int4 == (-386032));
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 520, (java.lang.Object) 42395057619900L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(9697, 139846, (-240), (-19814190));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 10, 125500, (-1716));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10 for hi! must be in the range [125500,-1716]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-3590394), (-1569), (-363940));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(589166720313600L, 452401920L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 589166720313600 * 452401920");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(7176000, 182942901);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 7176000 * 182942901");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(2003383330L, (-3423621056803200L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3423623060186530L + "'", long2 == 3423623060186530L);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(0, (-340473042), (-384786135));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 1828967, (-10L));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-18289670) + "'", int2 == (-18289670));
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-16387), 233, 288650836);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -16387 for  must be in the range [233,288650836]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-282895011));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-282895011) + "'", int1 == (-282895011));
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-5324800), 328190018, (-7520));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-1144241020), 605L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -692265817100");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-16387), (-40));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-16427) + "'", int2 == (-16427));
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 28458464);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 28458464 + "'", int1 == 28458464);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(1734960, (-33));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-57253680) + "'", int2 == (-57253680));
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, (-321540));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-34847965), (-1936619531));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -34847965 * -1936619531");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(340482756);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-340482756) + "'", int1 == (-340482756));
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-480834), (-382744), 9697, (-6190));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(158513520);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-158513520) + "'", int1 == (-158513520));
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1144), 2612385);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2611241 + "'", int2 == 2611241);
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(112035, (-572120460));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-572008425) + "'", int2 == (-572008425));
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-45934336), (-1936676459), (-43));
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-773440), (-5823869));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -773440 * -5823869");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-33L), (java.lang.Object) 255717);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(198303L, (long) (-11155490));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-10957187L) + "'", long2 == (-10957187L));
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(186160, (-232), (-340473000), (-384786135));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 108496899700L, (java.lang.Object) 46677556124824660L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-125500), (-3200));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 401600000 + "'", int2 == 401600000);
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-1212));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1212) + "'", int1 == (-1212));
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 149, 1155, 192925);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-255717), 0, (-4145590));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(199584, 5200);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 204784 + "'", int2 == 204784);
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(388073, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 388073 + "'", int2 == 388073);
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 164631, (-3553504), (-1936734162));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 164631 for  must be in the range [-3553504,-1936734162]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(1409060L, (long) 1255);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1407805L + "'", long2 == 1407805L);
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-14931288));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 14931288 + "'", int1 == 14931288);
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 1659032);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1659032 + "'", int1 == 1659032);
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 1825, 20);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 36500L + "'", long2 == 36500L);
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 23, (-166962), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-384786100), (-2575636));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -384786100 * -2575636");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-127824), (-5822300), (-848));
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(654, 166400);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 108825600 + "'", int2 == 108825600);
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(0, 20, (-232));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-32313630), (-11));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-32313641) + "'", int2 == (-32313641));
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-223641600), (-46590310), (-340473032));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -223641600 for  must be in the range [-46590310,-340473032]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 149, (-320), 42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-97), 1327011976, 549120, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-5822201), 2365);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5819836) + "'", int2 == (-5819836));
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(11148807196800L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 11148807196800L + "'", long2 == 11148807196800L);
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 662370800, 272135L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 180254277658000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(58239625805L, (long) (-2691));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-156722833041255L) + "'", long2 == (-156722833041255L));
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(0, (-5819836));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-166962), 5823869, 240);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-1386), 1716, (-1936621249));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1386 for  must be in the range [1716,-1936621249]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(141344, (-38056));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 141344 * -38056");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-12277454112000L), 1028239774L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -12277454112000 * 1028239774");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-772), 1820);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1048 + "'", int2 == 1048);
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 364408L, (java.lang.Object) (-2612385));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-12277454112000L), (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-12277454112001L) + "'", long2 == (-12277454112001L));
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-32313641), (-73100), 328188373, (-476));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-11616), (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-11615) + "'", int2 == (-11615));
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(363940, 1825, (-100), (-833));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-21687), (-17), 1658);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -21687 for hi! must be in the range [-17,1658]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-374195L), (-402494413728L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 150611397144948960L + "'", long2 == 150611397144948960L);
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (short) -1, (java.lang.Object) 18936964800L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (short) 1, (-572120458L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-572120458L) + "'", long2 == (-572120458L));
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-384786135), 23380, (-4145590));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-34848000), 1936617856, (-24710220));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-1326837770L), (-139846L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1326977616L) + "'", long2 == (-1326977616L));
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        org.joda.time.field.FieldUtils.verifyValueBounds("", 10, (-100), 1936619533);
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-1936619531), (-2355724800L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 419105269L + "'", long2 == 419105269L);
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1659032, (-166311), (-15252312));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(172370);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-172370) + "'", int1 == (-172370));
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-46591216), (-11), (-18289670));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-61362), 1028239774L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1028178412L + "'", long2 == 1028178412L);
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(1056L, (long) 3553504);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3554560L + "'", long2 == 3554560L);
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(70, 35, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-382744), 1912725632, 138217);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -382744 for hi! must be in the range [1912725632,138217]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(340482756, 5824000);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 340482756 * 5824000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(220584L, (long) (-12572));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 208012L + "'", long2 == 208012L);
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-1904000), (long) (-14931288));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-16835288L) + "'", long2 == (-16835288L));
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 46590310, (long) (-321540));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 46911850L + "'", long2 == 46911850L);
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 288342622);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 288342622 + "'", int1 == 288342622);
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(233L, 2355724900L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 548883901700L + "'", long2 == 548883901700L);
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 46591216, (-384786100), (-1936619531));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 282221100, 1155, (-166311));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(672043680, 126036, 1255, (-97));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-328191465), (-321540), (-682184990));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-288078336));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-288078336) + "'", int1 == (-288078336));
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, (-11647300L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-226265106), (-20));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -226265106 * -20");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-881), (-2575636));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2576517) + "'", int2 == (-2576517));
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 39999960, (-328190018), 1327011976);
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-774641), (-52), 138217);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(363674336L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 363674336 + "'", int1 == 363674336);
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(0, (-328190018));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-328190018) + "'", int2 == (-328190018));
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(5823869, 255717, 0, 19814190);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6079586 + "'", int4 == 6079586);
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-5823902L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-5823902) + "'", int1 == (-5823902));
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(382873, 0, (-984676579));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(328191465, 231481404, 382873);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-243455592L), 3295694668968000L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -243455592 * 3295694668968000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
        org.joda.time.field.FieldUtils.verifyValueBounds("", 52, (-17), 490580);
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(328190018);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-328190018) + "'", int1 == (-328190018));
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(43, 43);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1849 + "'", int2 == 1849);
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((int) '4', 1849);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 96148 + "'", int2 == 96148);
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-3909345), 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 440128000, (-293585530920L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 440128000 * -293585530920");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1943795520, 240, 288129358);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-240), (-19814191));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4755405840L + "'", long2 == 4755405840L);
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 182942901, 138304L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 182804597L + "'", long2 == 182804597L);
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(2610003L, (-2020523048210L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5273571217397244630L) + "'", long2 == (-5273571217397244630L));
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-384786135), (-46592000), (-276494400));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-1031377144), (-169085L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 174390404393240L + "'", long2 == 174390404393240L);
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(0, (-272136), 0, 998820552);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 998548417 + "'", int4 == 998548417);
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(95990294776L, (long) 69923);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 6711929381622248");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 1716);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1716 + "'", int1 == 1716);
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 662370800, (long) (-288078336));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -190814677878988800");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(1895994596);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1895994596) + "'", int1 == (-1895994596));
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-363940), (-223641600), (-1701));
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(9797L, 1936402650);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 18970936762050L + "'", long2 == 18970936762050L);
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-620L), 360557);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-223545340L) + "'", long2 == (-223545340L));
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(7431, 363674336, (-1906981791));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 240);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 240 + "'", int1 == 240);
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 3037, 272135L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-269098L) + "'", long2 == (-269098L));
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-4754576), 112035, 1327011840);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-207039325569227058L), 62000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-207039325569165058L) + "'", long2 == (-207039325569165058L));
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-111178), (-277588800), 0);
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-10), 1447, (-39046069), 52440);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1437 + "'", int4 == 1437);
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1476100290, (java.lang.Object) (-114631));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(283395980L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 283395980 + "'", int1 == 283395980);
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(4205);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-4205) + "'", int1 == (-4205));
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-166080), 1734960);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1568880 + "'", int2 == 1568880);
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 101, (long) (-73100));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 73201L + "'", long2 == 73201L);
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 231481404);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 231481404 + "'", int1 == 231481404);
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1936617856, (-546), 0, 165796);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 108350 + "'", int4 == 108350);
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-32313630));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-32313630) + "'", int1 == (-32313630));
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(0, (-20), 5201, (-833));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 115500, (-2184), 70);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-3590394), 374783424, (-21700000), 998548417);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 371193030 + "'", int4 == 371193030);
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(1665, 374783424);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 1665 * 374783424");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(1031830168, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 1031830168 * 97");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 656880, (long) 4205);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 2762180400");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-156L), (-3287375052L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3287375208L) + "'", long2 == (-3287375208L));
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(1255);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1255) + "'", int1 == (-1255));
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-43), 96148, 7009920);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -43 for hi! must be in the range [96148,7009920]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(2610333L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2610333 + "'", int1 == 2610333);
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-2600000L), (java.lang.Object) (-1936676459));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-23270374400L), 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((int) (short) -1, 13, 233, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(58240000000L, (long) 1568880);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 58241568880L + "'", long2 == 58241568880L);
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(388073, 4781948);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 388073 * 4781948");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1255), (-21645), 5201);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1255) + "'", int3 == (-1255));
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 0, 0, 1327011840);
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1031830168, (java.lang.Object) 363673528L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-487), 6916, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(86528000000L, (long) (-1168498456));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 85359501544L + "'", long2 == 85359501544L);
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(11905704749L, (-14931288));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-177767506450286712L) + "'", long2 == (-177767506450286712L));
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-166300L), 13124340881652000L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -166300 * 13124340881652000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-18315));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-18315) + "'", int1 == (-18315));
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-100), (-264));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 26400 + "'", int2 == 26400);
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-288078336), (int) '#', (-21578), (-126556));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-21645), (long) 4781948);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-103505264460L) + "'", long2 == (-103505264460L));
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 9724, (-4205));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-40889420L) + "'", long2 == (-40889420L));
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 87, 1828967, 186160);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-402494413728L), 6834111120L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -402494413728 * 6834111120");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-69923L), 3047616000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-213098453568000L) + "'", long2 == (-213098453568000L));
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 183048400, 59984899845371631L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 59984900028420031L + "'", long2 == 59984900028420031L);
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 102059, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(102059, (-6));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-612354) + "'", int2 == (-612354));
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(1830475L, (-1416933));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2593660433175L) + "'", long2 == (-2593660433175L));
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-405), (-166311), (-1906981791));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 672043680);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 672043680 + "'", int1 == 672043680);
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-340473000), 1828967);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -340473000 * 1828967");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(138217, 4205);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 142422 + "'", int2 == 142422);
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(198, (-490580));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-97134840) + "'", int2 == (-97134840));
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 182942800, (-6189L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 182936611L + "'", long2 == 182936611L);
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1144241020), (-264));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1144241284) + "'", int2 == (-1144241284));
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-11615), 0, 21645, 7009920);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6976661 + "'", int4 == 6976661);
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-20), 40769747);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-815394940) + "'", int2 == (-815394940));
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(9724, (-363940), (-2052));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-352165) + "'", int3 == (-352165));
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1665), (-166311));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 276907815 + "'", int2 == 276907815);
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-167014), (-24710220), (-39271960), (-1936621249));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-116550), 19814191, 7009920);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -116550 for hi! must be in the range [19814191,7009920]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 340473032, (long) 182942800);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 62287089798569600L + "'", long2 == 62287089798569600L);
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-282895011), 0, 16640000, 276907815);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 237640621 + "'", int4 == 237640621);
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-5200), (long) 21700000);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 21694800L + "'", long2 == 21694800L);
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(1407805L, 276494601L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 389250481760805");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-11616), 1568880, (-240636100));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 18970936762050L, (java.lang.Object) (-433740L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(182748167558313L, (long) (-1519000));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 182748167558313 * -1519000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 69889, (-226265106), 1664);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-126556));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 126556 + "'", int1 == 126556);
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(9724, (-125500), 659758415);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9724 + "'", int3 == 9724);
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 108825600, 0, (-146920931));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 108825600 for hi! must be in the range [0,-146920931]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-1608), (-210424900));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 338363239200L + "'", long2 == 338363239200L);
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 138217, 8480, 102059);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 138217 for hi! must be in the range [8480,102059]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(182804597L, (-128424632826L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 182804597 * -128424632826");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 163128730, 186160, (-276494400));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 163128730 for  must be in the range [186160,-276494400]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-2361380L), 182774349);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-431599692241620L) + "'", long2 == (-431599692241620L));
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1056), (-166400), (-1936619520));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-198400), (long) 1155);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-229152000L) + "'", long2 == (-229152000L));
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(2153907510L, (-572120560));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1232294770809405600L) + "'", long2 == (-1232294770809405600L));
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-1144241020), (-100), 1659032);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1144241020 for  must be in the range [-100,1659032]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-35), (-321540));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11253900 + "'", int2 == 11253900);
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 166720);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 166720 + "'", int1 == 166720);
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(291648911400L, 1409060L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 291647502340L + "'", long2 == 291647502340L);
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(2612385L, (-22058377L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 24670762L + "'", long2 == 24670762L);
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(998548417, 32, 5663563);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1766785 + "'", int3 == 1766785);
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-19814191), (-3200), (-216870));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-490580), 255717, (-12681));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(223618155L, (long) (-232));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -51879411960");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-172370), (-69923), 18, 16639480);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 16397170 + "'", int4 == 16397170);
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 42, (-571021860), (-3553504));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 658347520, 4784000, 251100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 658347520 for  must be in the range [4784000,251100]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-6), (long) 1287002560);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -7722015360");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(198429, 307455826, (-18315));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(534070715675194962L, (-77574374640L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 534070715675194962 * -77574374640");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-40889420L), 7176705L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -293451304961100");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(28458464, 1031830400);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 28458464 * 1031830400");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(58241568880L, (long) (-1858));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -108212834979040");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-12277454112001L), 32353610310L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-12309807722311L) + "'", long2 == (-12309807722311L));
    }
}

