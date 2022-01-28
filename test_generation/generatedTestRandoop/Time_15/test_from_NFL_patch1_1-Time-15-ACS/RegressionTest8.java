import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8 {

    public static boolean debug = false;

    @Test
    public void test4001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4001");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (int) (byte) 0, (-217000), (-42));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(323019034, 164631, (-166720));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1665), (-1287002560), 374783424);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1665) + "'", int3 == (-1665));
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-268L), (-18944140800L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-18944141068L) + "'", long2 == (-18944141068L));
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-546), (-773760));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 422472960 + "'", int2 == 422472960);
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1165), (-5669852));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -1165 * -5669852");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 164580, 288650933, (-158184048));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1588808), 172370, (-126556));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 1588808, (-1372790), 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1588808 for  must be in the range [-1372790,0]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-10957187L), 164472);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1802150460264L) + "'", long2 == (-1802150460264L));
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(251100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-251100) + "'", int1 == (-251100));
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(0, 1588768, (-1407261), 101);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1225958) + "'", int4 == (-1225958));
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1701, 0, (-167014));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1936619520, (-277588800), 8480);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 40769747, (int) 'a', (-409635100));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-5835), (java.lang.Object) 81113501L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(35450217234598720L, (int) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3438671071756075840L + "'", long2 == 3438671071756075840L);
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-2184));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2184) + "'", int1 == (-2184));
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(166962, (-5806080));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 166962 * -5806080");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(112100, (-13516776), (-11162722), 320);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2241633) + "'", int4 == (-2241633));
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 174035, (java.lang.Object) (-435L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 450092, (long) 1327011840);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1326561748L) + "'", long2 == (-1326561748L));
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 42, (-141059), 998820552);
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-1941944331), (long) 46590310);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -90475788384032610");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(42395057619900L, (-2354711268033L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 42395057619900 * -2354711268033");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(485392603415384079L, (-1387860305661L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 485392603415384079 * -1387860305661");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(1741, 81882);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 142556562 + "'", int2 == 142556562);
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 101, (-571021860), 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 101 for hi! must be in the range [-571021860,0]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 5824000, 46590310, (-654));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 7187284L, (java.lang.Object) 4784000);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-572120560), (java.lang.Object) 89317);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-2612385), 198429);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -2612385 * 198429");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-19814191), (long) (-1936611698));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1916797507L + "'", long2 == 1916797507L);
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-6), 1437, (-476));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -6 for hi! must be in the range [1437,-476]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(1031377144L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1031377144 + "'", int1 == 1031377144);
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(112100L, (-302946930831L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-33960350946155100L) + "'", long2 == (-33960350946155100L));
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(659758415, 662370800);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 659758415 * 662370800");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-8867), (long) 190921500);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1692900940500L) + "'", long2 == (-1692900940500L));
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 40631530, 1936619520, 190921500);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(2031483509540L, (-12309807722311L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-10278324212771L) + "'", long2 == (-10278324212771L));
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-18315), 4781948, 142556562);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 137756300 + "'", int3 == 137756300);
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-272230358291L), (long) (-5823869));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-272236182160L) + "'", long2 == (-272236182160L));
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-302837704), (-20), 1310);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 733 + "'", int3 == 733);
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 22110720, (-1165L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -25758988800");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(34774165L, 95756564510L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3329854574103884150L + "'", long2 == 3329854574103884150L);
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-833L), (-32L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-801L) + "'", long2 == (-801L));
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-986506979), (-669384204));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1655891183) + "'", int2 == (-1655891183));
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-32), 283568350);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -32 * 283568350");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-487), (-52440), (-662395510));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -487 for  must be in the range [-52440,-662395510]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-158184048));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-158184048) + "'", int1 == (-158184048));
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 46590310, 2052, (-19814180));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 46590310 for hi! must be in the range [2052,-19814180]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 2608990, 1997810969);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5212268840011310L + "'", long2 == 5212268840011310L);
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1143), 81882, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-360705), 81882, (-2727886));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1734960, (-2324166), (-1569), (-166300));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1255), 138217, (-1906981791));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-984676579), 2612385, (-1380));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1408273), (-32313684), (-5819794));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-27902164) + "'", int3 == (-27902164));
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1655L), (java.lang.Object) 502079582669747L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
        java.lang.Object obj1 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-804L), obj1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1936980077, (-5414543), (-669384204), (-437758029));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-510392354) + "'", int4 == (-510392354));
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-165796), 1031830400, 166387);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-672043680), 361058);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-671682622) + "'", int2 == (-671682622));
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1031830080, 427963128, (-251100));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(490580, 427963128);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 428453708 + "'", int2 == 428453708);
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-3553504), 1936619548);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -3553504 * 1936619548");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(657837294L, 32353610310L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 657837294 * 32353610310");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 338879346, (java.lang.Object) (-18521676));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 363534490L, (java.lang.Object) 18136800L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(113, (-18315), 0, 2365);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 726 + "'", int4 == 726);
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-5547853070320L), (-165433958936609391L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 165428411083539071L + "'", long2 == 165428411083539071L);
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(2612385, (-86668494));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-84056109) + "'", int2 == (-84056109));
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(2959353600L, (-6709247670L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3749894070L) + "'", long2 == (-3749894070L));
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-21578), (-11), 11253900, (-384786135));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-18842291), 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 23380, 1437);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 33597060L + "'", long2 == 33597060L);
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 101, 337896481, 328188373);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 101 for  must be in the range [337896481,328188373]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-166720), 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-16171840) + "'", int2 == (-16171840));
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(18936964800L, (long) (-18315));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-346830510312000L) + "'", long2 == (-346830510312000L));
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 337896481, 4498528320L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 1520036889006841920");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4081");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 440122800, (-16640020));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-7323652194456000L) + "'", long2 == (-7323652194456000L));
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4082");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 0, (-382786), 1936617856);
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4083");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-2576517), (-113847), 198400);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4084");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-374783424), (long) 374610515);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-172909L) + "'", long2 == (-172909L));
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4085");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 166300);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 166300 + "'", int1 == 166300);
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4086");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 5824000, (-35), (-2241633));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4087");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(198429, 1665532800, (-255717));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4088");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-49878L), (long) (-1936611698));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1936561820L + "'", long2 == 1936561820L);
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4089");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-18521676), (java.lang.Object) 109359572L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4090");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-18969882492L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -18969882492");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4091");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 23, 81366, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 23 for  must be in the range [81366,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4092");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-18842291), (long) (-45594243));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-64436534L) + "'", long2 == (-64436534L));
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4093");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 1936619533, (long) (-386032));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-747597111563056L) + "'", long2 == (-747597111563056L));
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4094");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(1665532800, 1954194, 5823497);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5601384 + "'", int3 == 5601384);
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4095");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-6664568));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6664568 + "'", int1 == 6664568);
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4096");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-334532800000L), (long) (-163101298));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-334369698702L) + "'", long2 == (-334369698702L));
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4097");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(34L, (long) (-166400));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 166434L + "'", long2 == 166434L);
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4098");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-141059), (-14931288));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -141059 * -14931288");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4099");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(201224, 0, (-1895994596), 1031830080);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1366941395) + "'", int4 == (-1366941395));
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4100");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1936619531), 288342622, (-12));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4101");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(6, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4102");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1906981791), (-40), 1653);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4103");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-46590740L), (java.lang.Object) (-15564L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4104");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-223239), 139679);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -223239 * 139679");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4105");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-167076000), 409635100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 242559100 + "'", int2 == 242559100);
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4106");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-6190), (-163128730), 20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-6190) + "'", int3 == (-6190));
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4107");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 1134915920, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1134915920L + "'", long2 == 1134915920L);
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4108");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1327011976, 46590310, 277584678);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4109");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-11616), 14603626, (-1701));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4110");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(1837067500894582509L, (long) (-1165));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 1837067500894582509 * -1165");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4111");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-116550), (int) '#', 28458464);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -116550 for hi! must be in the range [35,28458464]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4112");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-207039327505920000L), (long) 2611241);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-207039327503308759L) + "'", long2 == (-207039327503308759L));
    }

    @Test
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4113");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(338879346);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-338879346) + "'", int1 == (-338879346));
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4114");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(1936980077);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1936980077) + "'", int1 == (-1936980077));
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4115");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1936676459), 69889);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -1936676459 * 69889");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4116");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-11036684), 6656682267L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-73467698669282628L) + "'", long2 == (-73467698669282628L));
    }

    @Test
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4117");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 487, (-815394940), (-2241633));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4118");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-10), (java.lang.Object) (-69971200000L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4119");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(4784000, 1716);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4785716 + "'", int2 == 4785716);
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4120");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-39046069));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 39046069 + "'", int1 == 39046069);
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4121");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-7740076032000L), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-7740076032000L) + "'", long2 == (-7740076032000L));
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4122");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 1310);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1310 + "'", int1 == 1310);
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4123");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-52440), (-235249), 374783424);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-52440) + "'", int3 == (-52440));
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4124");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((int) (byte) 10, (-1327011840), (-323136300));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1003875531) + "'", int3 == (-1003875531));
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4125");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-1086400L), (-63657311800L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 69157303539520000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4126");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(419105269L, 16640020);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6973920058265380L + "'", long2 == 6973920058265380L);
    }

    @Test
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4127");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-5822319L), 357740L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-6180059L) + "'", long2 == (-6180059L));
    }

    @Test
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4128");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-19814191), 182774349);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -19814191 * 182774349");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4129");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 288129358, 18408681, 363940);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4130");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-1459701));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1459701 + "'", int1 == 1459701);
    }

    @Test
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4131");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(7009920, (-163128730), (-1658), 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-274) + "'", int4 == (-274));
    }

    @Test
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4132");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1225958), (-216870));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1442828) + "'", int2 == (-1442828));
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4133");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-18084422856192000L), (java.lang.Object) (-15564L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4134");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-251100), (-8867));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-259967) + "'", int2 == (-259967));
    }

    @Test
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4135");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-255717), 106732910592L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 106732654875L + "'", long2 == 106732654875L);
    }

    @Test
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4136");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(7009920, (-1938205016), 242559100, 549120);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4137");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-6229099756320L), 46591948);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -6229099756320 * 46591948");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4138");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-732193280000000L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -732193280000000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4139");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(54912000, (-328301448), (-724018737));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4140");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-2205840));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2205840 + "'", int1 == 2205840);
    }

    @Test
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4141");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-428370776648705L), (-275783153L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -428370776648705 * -275783153");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4142");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 409635100, 115500, 612354);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 409635100 for hi! must be in the range [115500,612354]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4143");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-6664568), 662370800);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4414415237814400L) + "'", long2 == (-4414415237814400L));
    }

    @Test
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4144");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 13);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 13 + "'", int1 == 13);
    }

    @Test
    public void test4145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4145");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-5823869), (-3553504));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9377373) + "'", int2 == (-9377373));
    }

    @Test
    public void test4146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4146");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-11), (-223641402), (-97134840), 111178);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-29149375) + "'", int4 == (-29149375));
    }

    @Test
    public void test4147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4147");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 109, 140906);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 15358754L + "'", long2 == 15358754L);
    }

    @Test
    public void test4148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4148");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-2298110136L), (long) 108350);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-249000233235600L) + "'", long2 == (-249000233235600L));
    }

    @Test
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4149");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, (long) 288129410);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test4150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4150");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-11155490), (-1287002560), (-546));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-11155490) + "'", int3 == (-11155490));
    }

    @Test
    public void test4151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4151");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-39046069), (java.lang.Object) (-58247176000L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4152");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1716), (-2724), (-2818532), 5657201);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-4440) + "'", int4 == (-4440));
    }

    @Test
    public void test4153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4153");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-103505264460L), 1188691);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-123035776316221860L) + "'", long2 == (-123035776316221860L));
    }

    @Test
    public void test4154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4154");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 166400, (-1238035081), 5897448);
    }

    @Test
    public void test4155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4155");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-74897), (-31));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2321807 + "'", int2 == 2321807);
    }

    @Test
    public void test4156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4156");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-19), (-510392354), 199584);
    }

    @Test
    public void test4157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4157");
        java.lang.Object obj1 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-18944140800L), obj1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4158");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(138217);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-138217) + "'", int1 == (-138217));
    }

    @Test
    public void test4159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4159");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(110647554L, 18L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 110647572L + "'", long2 == 110647572L);
    }

    @Test
    public void test4160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4160");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(998548417, (-1665505400));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 998548417 * -1665505400");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4161");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1588808, (-73647), (-13));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4162");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-11646070), 2321807, (int) (byte) 1, 906847389);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 897523126 + "'", int4 == 897523126);
    }

    @Test
    public void test4163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4163");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-46590740L), (java.lang.Object) 69888);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4164");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, (-1936611698));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test4165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4165");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(1665532800, 363674336, (-141059));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4166");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-43));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 43 + "'", int1 == 43);
    }

    @Test
    public void test4167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4167");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-15085912), (-5414543), (-92));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4168");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(876405117732L, (long) (-2727886));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -2390733250989474552");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4169");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(4L, 9689L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 38756 + "'", int2 == 38756);
    }

    @Test
    public void test4170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4170");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-612354), (-2726127575L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 1669355125061550");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4171");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-572124582), (-966692459L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1538817041L) + "'", long2 == (-1538817041L));
    }

    @Test
    public void test4172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4172");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 40, 365387, 2611241);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4173");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-269098L), (-6180059L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1663041516782L + "'", long2 == 1663041516782L);
    }

    @Test
    public void test4174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4174");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 22110720, 274113388224000L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 22110720 * 274113388224000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4175");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(43, 16640020, (-881));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4176");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(19814242L, (long) 3762684);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 23576926L + "'", long2 == 23576926L);
    }

    @Test
    public void test4177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4177");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-14931288), (-166400));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-15097688) + "'", int2 == (-15097688));
    }

    @Test
    public void test4178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4178");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 428443962, (-15252312), (-1716));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4179");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(1825, (-662370800), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-662368976) + "'", int3 == (-662368976));
    }

    @Test
    public void test4180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4180");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1659081147, (-19), (-84056109));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4181");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(51354937);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-51354937) + "'", int1 == (-51354937));
    }

    @Test
    public void test4182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4182");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-21700000), (-2052L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-21702052L) + "'", long2 == (-21702052L));
    }

    @Test
    public void test4183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4183");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1906981791), (-10), 276494400);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 28479086 + "'", int3 == 28479086);
    }

    @Test
    public void test4184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4184");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-2575266), (java.lang.Object) 338879346);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4185");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-10969));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10969 + "'", int1 == 10969);
    }

    @Test
    public void test4186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4186");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-2600000L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2600000) + "'", int1 == (-2600000));
    }

    @Test
    public void test4187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4187");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-11155490), (-1936734162), 288540925);
    }

    @Test
    public void test4188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4188");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-384786100), (long) 17);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-384786117L) + "'", long2 == (-384786117L));
    }

    @Test
    public void test4189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4189");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 1569, (-1830400), (-1701));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1569 for  must be in the range [-1830400,-1701]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4190");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-207039327505920000L), 233L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -207039327505920000 * 233");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4191");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-480834), 3762684, (-8));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4192");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-40891121L), 46590952L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -1905156255737192");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4193");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-302837704), 998820552, (-3580697));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4194");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-59199851), 1664, (-437758029));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4195");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 409635100, (-167049), (-288078336));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 409635100 for hi! must be in the range [-167049,-288078336]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4196");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(33640, (-69888));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-36248) + "'", int2 == (-36248));
    }

    @Test
    public void test4197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4197");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(240, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-240) + "'", int2 == (-240));
    }

    @Test
    public void test4198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4198");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 5897448);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5897448 + "'", int1 == 5897448);
    }

    @Test
    public void test4199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4199");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 502079585280000L, (java.lang.Object) (-16387));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4200");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(6, (-384786100), 4763852, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4201");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(182492901280657L, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 9489630866594164");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4202");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(1310, (-23380));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-22070) + "'", int2 == (-22070));
    }

    @Test
    public void test4203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4203");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-3553504), (-5669852));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9223356) + "'", int2 == (-9223356));
    }

    @Test
    public void test4204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4204");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(0L, (long) 190407252);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4205");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-223641402), 6976661, 2608990);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4206");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 2369834);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2369834 + "'", int1 == 2369834);
    }

    @Test
    public void test4207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4207");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(48611122678561072L, 589166720313600L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 48021955958247472L + "'", long2 == 48021955958247472L);
    }

    @Test
    public void test4208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4208");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-328188373), 5823497, 2369834, 5200);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4209");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-166390L), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-166390L) + "'", long2 == (-166390L));
    }

    @Test
    public void test4210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4210");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(106732654875L, (-31881842027000L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 106732654875 * -31881842027000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4211");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(110647554L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 110647554 + "'", int1 == 110647554);
    }

    @Test
    public void test4212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4212");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, 440128000);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test4213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4213");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(46592000, (-338879346), (-662374000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4214");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-17321541120000L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -17321541120000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4215");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-111178), 165786, (-2718144));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4216");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-56939));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 56939 + "'", int1 == 56939);
    }

    @Test
    public void test4217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4217");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-109928), 371193030, 982982640, (-71587));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4218");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) ' ', 460965811846L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 14750905979072L + "'", long2 == 14750905979072L);
    }

    @Test
    public void test4219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4219");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-179252736));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 179252736 + "'", int1 == 179252736);
    }

    @Test
    public void test4220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4220");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-2324166), (-97));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2324263) + "'", int2 == (-2324263));
    }

    @Test
    public void test4221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4221");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 192925, 2612385, (-166962));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4222");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-62832L), (long) (-255717));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-318549L) + "'", long2 == (-318549L));
    }

    @Test
    public void test4223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4223");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-56939L), 282219281L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -16069283640859");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4224");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(4781948, 5823902);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 4781948 * 5823902");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4225");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-29149375), (-107785395), (-2818532));
    }

    @Test
    public void test4226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4226");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-139697), 184, 290119224);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 289979344 + "'", int3 == 289979344);
    }

    @Test
    public void test4227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4227");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 16640000, 23576926L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-6936926L) + "'", long2 == (-6936926L));
    }

    @Test
    public void test4228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4228");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1031830080), (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1031830081) + "'", int2 == (-1031830081));
    }

    @Test
    public void test4229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4229");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(1858, 46591948);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 46593806 + "'", int2 == 46593806);
    }

    @Test
    public void test4230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4230");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-475183163547L), (java.lang.Object) (-47300255L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4231");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1327011840), (-1936621249), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1327011840) + "'", int3 == (-1327011840));
    }

    @Test
    public void test4232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4232");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 251100, (-264L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 250836L + "'", long2 == 250836L);
    }

    @Test
    public void test4233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4233");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-2298110136L), (long) (-217000));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2297893136L) + "'", long2 == (-2297893136L));
    }

    @Test
    public void test4234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4234");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(564763100L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 564763100 + "'", int1 == 564763100);
    }

    @Test
    public void test4235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4235");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(2979, (-283568350), 125500, 12681);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4236");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 5657201, (java.lang.Object) (-9252624));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4237");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1459701), (-11), (-54300), 401600000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 400194589 + "'", int4 == 400194589);
    }

    @Test
    public void test4238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4238");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 164472, 29906275, (-1225958));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 164472 for  must be in the range [29906275,-1225958]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4239");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1906981791), 0, (-2718144));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4240");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-5823497), (java.lang.Object) (-10955745243177119L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4241");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(2610318, 34);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 88750812 + "'", int2 == 88750812);
    }

    @Test
    public void test4242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4242");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-139679), (long) 9724);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1358238596L) + "'", long2 == (-1358238596L));
    }

    @Test
    public void test4243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4243");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-12681), (-288129358));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-288142039) + "'", int2 == (-288142039));
    }

    @Test
    public void test4244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4244");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-8552544L), (java.lang.Object) 1936617856);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4245");
        java.lang.Object obj1 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 2205840, obj1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4246");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(1162521082, (-5823869), 388073);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-5324202) + "'", int3 == (-5324202));
    }

    @Test
    public void test4247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4247");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(51354937, (-11615));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 51343322 + "'", int2 == 51343322);
    }

    @Test
    public void test4248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4248");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-6), 24735138);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 24735132 + "'", int2 == 24735132);
    }

    @Test
    public void test4249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4249");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-9742), (-1905905201), (-662374000), (-1519000));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-584204941) + "'", int4 == (-584204941));
    }

    @Test
    public void test4250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4250");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(40769747, 220552772, (-21578));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4251");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-101990), 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test4252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4252");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-2507756022L), 101L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -253283358222");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4253");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(382786, (-165796), (-32313630), 130048209);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 216990 + "'", int4 == 216990);
    }

    @Test
    public void test4254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4254");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-167076000), 1933898171, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4255");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1031830168, 255746531, (-138217));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4256");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1665505400), 1304985053);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-360520347) + "'", int2 == (-360520347));
    }

    @Test
    public void test4257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4257");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-5823802), (-240636100), 921367868);
    }

    @Test
    public void test4258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4258");
        org.joda.time.field.FieldUtils.verifyValueBounds("", (-10), (-9742), 277971586);
    }

    @Test
    public void test4259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4259");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-21091), 1588768, (-282895011));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4260");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 5663563, 182942901, (-546));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 5663563 for hi! must be in the range [182942901,-546]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4261");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 337896481, (-283568350), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4262");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(21694800L, (long) (-59199851));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1284328927474800L) + "'", long2 == (-1284328927474800L));
    }

    @Test
    public void test4263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4263");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-14584943363112L), (java.lang.Object) 34893600000L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4264");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-1956216738L), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1956216738L) + "'", long2 == (-1956216738L));
    }

    @Test
    public void test4265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4265");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 1820, (-146920931));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-267396094420L) + "'", long2 == (-267396094420L));
    }

    @Test
    public void test4266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4266");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-217000), (-5324800));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -217000 * -5324800");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4267");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 8620872, 204784, (-60446));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4268");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-91006517252L), 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4269");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-4440));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4440 + "'", int1 == 4440);
    }

    @Test
    public void test4270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4270");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-19814191), 165796);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-19648395) + "'", int2 == (-19648395));
    }

    @Test
    public void test4271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4271");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-140941), (-1372800L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1231859L + "'", long2 == 1231859L);
    }

    @Test
    public void test4272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4272");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-33280040));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 33280040 + "'", int1 == 33280040);
    }

    @Test
    public void test4273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4273");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(110647554, 2610318, (-125500), 2321807);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 681704 + "'", int4 == 681704);
    }

    @Test
    public void test4274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4274");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 166311, (-363686), 1024);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4275");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 149, (-9377373), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4276");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(329472);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-329472) + "'", int1 == (-329472));
    }

    @Test
    public void test4277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4277");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-86668494), 5335, (-166720));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -86668494 for hi! must be in the range [5335,-166720]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4278");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-376), (-321540), (-1953689291));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4279");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-27605760000L), (long) 2576517);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-71126709937920000L) + "'", long2 == (-71126709937920000L));
    }

    @Test
    public void test4280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4280");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(502656L, (-107785395));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-54178975509120L) + "'", long2 == (-54178975509120L));
    }

    @Test
    public void test4281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4281");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-84056109), (long) 428443962);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-36013332370263858L) + "'", long2 == (-36013332370263858L));
    }

    @Test
    public void test4282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4282");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 6976661, (-259), (-95180800));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4283");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-272230358291L), (-69971200000L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -272230358291 * -69971200000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4284");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 26046, (-1658), 198);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26046 for  must be in the range [-1658,198]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4285");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-11646070));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11646070 + "'", int1 == 11646070);
    }

    @Test
    public void test4286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4286");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-182942901));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 182942901 + "'", int1 == 182942901);
    }

    @Test
    public void test4287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4287");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1327011840), (-4440));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1327016280) + "'", int2 == (-1327016280));
    }

    @Test
    public void test4288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4288");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(165786, 126);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20889036 + "'", int2 == 20889036);
    }

    @Test
    public void test4289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4289");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-1570));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1570 + "'", int1 == 1570);
    }

    @Test
    public void test4290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4290");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-5323353), (long) 255734915);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -1361367226969995");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4291");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-19648395), 662370800, (-11155500));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -19648395 for  must be in the range [662370800,-11155500]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4292");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-16640020), 193499963);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 176859943 + "'", int2 == 176859943);
    }

    @Test
    public void test4293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4293");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(66351847L, 656880);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 43585201257360L + "'", long2 == 43585201257360L);
    }

    @Test
    public void test4294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4294");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 775262592009600L, (java.lang.Object) (-302837704));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4295");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(328190018, 1437);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 328190018 * 1437");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4296");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-24710220), (long) (-138217));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-24848437L) + "'", long2 == (-24848437L));
    }

    @Test
    public void test4297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4297");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-1407261), 126036, 21645);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1407261 for hi! must be in the range [126036,21645]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4298");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 278071860, 54945330, 283568350);
    }

    @Test
    public void test4299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4299");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-41220), (java.lang.Object) (-3909345));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4300");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-1327497296L), (-20));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 26549945920L + "'", long2 == 26549945920L);
    }

    @Test
    public void test4301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4301");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(141344);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-141344) + "'", int1 == (-141344));
    }

    @Test
    public void test4302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4302");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-36248), (-24849000));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 900726552000L + "'", long2 == 900726552000L);
    }

    @Test
    public void test4303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4303");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(111143, (-13728), 14931288, (-16171840));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4304");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-1688L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1688) + "'", int1 == (-1688));
    }

    @Test
    public void test4305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4305");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(34893600000L, (-258017760L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -9003168510336000000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4306");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-2727886), (-69923));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -2727886 * -69923");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4307");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-386032), (long) (-102065));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 39400356080");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4308");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-6190L), (long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-6191L) + "'", long2 == (-6191L));
    }

    @Test
    public void test4309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4309");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(282876300, 1912725632, 288650933, (-1905905201));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4310");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-71126709937920000L), (-10955745243537979L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -71126709937920000 * -10955745243537979");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4311");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 1997810969, (long) (-1143));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1997809826L + "'", long2 == 1997809826L);
    }

    @Test
    public void test4312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4312");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 179252736, (-38261404970880000L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 179252736 * -38261404970880000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4313");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-409635100), (-1936676459));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -409635100 * -1936676459");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4314");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 4784000, (-90960246223L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-90955462223L) + "'", long2 == (-90955462223L));
    }

    @Test
    public void test4315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4315");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-1936676459));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1936676459 + "'", int1 == 1936676459);
    }

    @Test
    public void test4316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4316");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-167464L), (long) 113);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-18923432) + "'", int2 == (-18923432));
    }

    @Test
    public void test4317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4317");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-42L), (long) (-387));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16254 + "'", int2 == 16254);
    }

    @Test
    public void test4318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4318");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(328191465, (-54300));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 328191465 * -54300");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4319");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(285287521L, 906915715);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 258731736088292515L + "'", long2 == 258731736088292515L);
    }

    @Test
    public void test4320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4320");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 158513520);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 158513520 + "'", int1 == 158513520);
    }

    @Test
    public void test4321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4321");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(1858, (-151553092));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 1858 * -151553092");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4322");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(83161984, 1554475);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 84716459 + "'", int2 == 84716459);
    }

    @Test
    public void test4323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4323");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(596969525L, 1830400L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 598799925L + "'", long2 == 598799925L);
    }

    @Test
    public void test4324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4324");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 46592000, (java.lang.Object) (-1907278001L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4325");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(3205199539645L, (long) (-1734960));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3205201274605L + "'", long2 == 3205201274605L);
    }

    @Test
    public void test4326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4326");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 237640621, 1825994, (-2052));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 237640621 for  must be in the range [1825994,-2052]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4327");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(288342622, 656647, (-405876));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4328");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 3205199539645L, (java.lang.Object) 174035L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4329");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(14603626, 9600);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 14603626 * 9600");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4330");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1204293925), 15100800);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -1204293925 * 15100800");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4331");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1588808), 1936619520);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -1588808 * 1936619520");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4332");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(3433626L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3433626 + "'", int1 == 3433626);
    }

    @Test
    public void test4333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4333");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(0, 363940);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4334");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1366941395), 5663563, (-18315), 1936616248);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 575356732 + "'", int4 == 575356732);
    }

    @Test
    public void test4335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4335");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-328191465), (long) (-1821293));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 597732817864245");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4336");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-167076000), (-19814191), 7009920);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-6131328) + "'", int3 == (-6131328));
    }

    @Test
    public void test4337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4337");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-15564L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-15564) + "'", int1 == (-15564));
    }

    @Test
    public void test4338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4338");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-18842291), 2003383330);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1984541039 + "'", int2 == 1984541039);
    }

    @Test
    public void test4339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4339");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-4145590), (-69888), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22139) + "'", int3 == (-22139));
    }

    @Test
    public void test4340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4340");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1155), (java.lang.Object) (-9223356));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4341");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (int) (short) 1, (-102059), 1250658720);
    }

    @Test
    public void test4342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4342");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(5822300, 645120);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6467420 + "'", int2 == 6467420);
    }

    @Test
    public void test4343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4343");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-140941), 32, (-110024));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4344");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(1048, (-1287002560));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 1048 * -1287002560");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4345");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-5823802));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5823802 + "'", int1 == 5823802);
    }

    @Test
    public void test4346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4346");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(38756, (-74897), (-320));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-35822) + "'", int3 == (-35822));
    }

    @Test
    public void test4347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4347");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-662368976), (-682514462), (-46304), 288540925);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 98052712 + "'", int4 == 98052712);
    }

    @Test
    public void test4348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4348");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(8751, (-167049), (-5669852), (-1936619520));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4349");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(623420L, (long) 102059);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 725479L + "'", long2 == 725479L);
    }

    @Test
    public void test4350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4350");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-589166715779070L), (-966692459L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-589165749086611L) + "'", long2 == (-589165749086611L));
    }

    @Test
    public void test4351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4351");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-29149375), (-10587), 1664);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1867) + "'", int3 == (-1867));
    }

    @Test
    public void test4352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4352");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 46590310, (java.lang.Object) 59200440);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4353");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1665532800, 2724, (-183048400));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4354");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-158513520), 59984900028420031L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -158513520 * 59984900028420031");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4355");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-323136300), 282220836);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-91195796727946800L) + "'", long2 == (-91195796727946800L));
    }

    @Test
    public void test4356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4356");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(70, (-139846), 1659032);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 70 + "'", int3 == 70);
    }

    @Test
    public void test4357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4357");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-107785395), (-240), 29906275, 1327011840);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1189319931 + "'", int4 == 1189319931);
    }

    @Test
    public void test4358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4358");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(0, 1012, 400194589);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 400193578 + "'", int3 == 400193578);
    }

    @Test
    public void test4359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4359");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 307455826, 0, (-167076000));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4360");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-328191146), (-808));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -328191146 * -808");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4361");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-11705905411200L), 18L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -210706297401600");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4362");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 0, 0, 97);
    }

    @Test
    public void test4363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4363");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(0, 520);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4364");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-2355724800L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -2355724800");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4365");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(100218872727L, (-7010204L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-702554742466306308L) + "'", long2 == (-702554742466306308L));
    }

    @Test
    public void test4366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4366");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 170566, (-302837704), 166962);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4367");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1569), (-34848000), (-1));
    }

    @Test
    public void test4368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4368");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-1692900940500L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -1692900940500");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4369");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1821, (java.lang.Object) (-73647));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4370");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 5823869, (-39271960), (-510392354));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4371");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-21645), 2860465143528000L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -21645 * 2860465143528000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4372");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(0, 22110720, (-1953689291), 440122800);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1879044484) + "'", int4 == (-1879044484));
    }

    @Test
    public void test4373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4373");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(193499963);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-193499963) + "'", int1 == (-193499963));
    }

    @Test
    public void test4374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4374");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 113, (long) (-33));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 80L + "'", long2 == 80L);
    }

    @Test
    public void test4375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4375");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-288343430L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-288343430) + "'", int1 == (-288343430));
    }

    @Test
    public void test4376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4376");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(17360085, 46590300);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 17360085 * 46590300");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4377");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 906847389, (-52440), 290119224);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4378");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 2920995748335L, (java.lang.Object) 34774165L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4379");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-32313684));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32313684 + "'", int1 == 32313684);
    }

    @Test
    public void test4380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4380");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(166311, 32, 46590310);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 166311 + "'", int3 == 166311);
    }

    @Test
    public void test4381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4381");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-39844), (-72171), (-288129358));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -39844 for  must be in the range [-72171,-288129358]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4382");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-69971200000L), (long) (-1143));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-69971198857L) + "'", long2 == (-69971198857L));
    }

    @Test
    public void test4383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4383");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-762867700089025490L), (-233));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -762867700089025490 * -233");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4384");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(86528000000L, (long) (-283568350));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 86528000000 * -283568350");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4385");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(14579123);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-14579123) + "'", int1 == (-14579123));
    }

    @Test
    public void test4386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4386");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 138217, (-1630758667L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1630620450L) + "'", long2 == (-1630620450L));
    }

    @Test
    public void test4387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4387");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1372790), (java.lang.Object) 534070715675194962L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4388");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 645120, (-5414543), 340473032);
    }

    @Test
    public void test4389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4389");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-3037), (java.lang.Object) 678776518202937600L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4390");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 288129410, (-21645), (-39499200));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 288129410 for  must be in the range [-21645,-39499200]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4391");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-4754576), 198400, (-52));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4392");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 1188691, 2610333L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3799024L + "'", long2 == 3799024L);
    }

    @Test
    public void test4393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4393");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(1437, 575356732);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 1437 * 575356732");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4394");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(92, 172370, 571021860);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 570849583 + "'", int3 == 570849583);
    }

    @Test
    public void test4395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4395");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1570, 2001232915, 28291744);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4396");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-24710), (-46592042));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-46616752) + "'", int2 == (-46616752));
    }

    @Test
    public void test4397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4397");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-328358386), 5807180L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1906836252011480L) + "'", long2 == (-1906836252011480L));
    }

    @Test
    public void test4398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4398");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(125500, (-459821653), 6976661);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 125500 + "'", int3 == 125500);
    }

    @Test
    public void test4399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4399");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(428443962, 19814241, (-141344));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4400");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-165445), (-4856865555744L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4856865721189L) + "'", long2 == (-4856865721189L));
    }

    @Test
    public void test4401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4401");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(10400);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-10400) + "'", int1 == (-10400));
    }

    @Test
    public void test4402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4402");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 1700);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1700 + "'", int1 == 1700);
    }

    @Test
    public void test4403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4403");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-65335286016L), 59200440);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3867877679673047040L) + "'", long2 == (-3867877679673047040L));
    }

    @Test
    public void test4404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4404");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-210424900), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test4405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4405");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1416933), (-223641402), (-12), 220552772);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 216047235 + "'", int4 == 216047235);
    }

    @Test
    public void test4406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4406");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-24710), (-662374000));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -24710 * -662374000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4407");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 32313684, (-382786), 229775129);
    }

    @Test
    public void test4408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4408");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 906847389, (-340473032), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4409");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-40889420L), (-2611241));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 106772129970220L + "'", long2 == 106772129970220L);
    }

    @Test
    public void test4410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4410");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(288281576L, 440123795L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-151842219L) + "'", long2 == (-151842219L));
    }

    @Test
    public void test4411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4411");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(27432, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 27432 + "'", int2 == 27432);
    }

    @Test
    public void test4412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4412");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(0, 11587643);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4413");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-1829376L), (-1898799L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 3473617319424");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4414");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-360860), (-12572), (-283395980));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -360860 for  must be in the range [-12572,-283395980]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4415");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-139679), (-986506979), (-1653));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-139679) + "'", int3 == (-139679));
    }

    @Test
    public void test4416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4416");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-1), (-403450402037760L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 403450402037760");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4417");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-46590310), (-2860465143759724L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2860465097169414L + "'", long2 == 2860465097169414L);
    }

    @Test
    public void test4418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4418");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-2575636), 229494000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-591093008184000L) + "'", long2 == (-591093008184000L));
    }

    @Test
    public void test4419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4419");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-7740076032000L), (java.lang.Object) 2611241);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4420");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 18, (-95180800), 186160);
    }

    @Test
    public void test4421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4421");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-591591038));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-591591038) + "'", int1 == (-591591038));
    }

    @Test
    public void test4422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4422");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-46592042), (-71587), (-232), 112042);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 42771 + "'", int4 == 42771);
    }

    @Test
    public void test4423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4423");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(323019034, 2979);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 323019034 * 2979");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4424");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(384786153L, (long) (-1665505400));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1280719247L) + "'", long2 == (-1280719247L));
    }

    @Test
    public void test4425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4425");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-9724), (-379395L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 3689236980");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4426");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(46677556124824660L, (long) 1936402650);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 46677558061227310L + "'", long2 == 46677558061227310L);
    }

    @Test
    public void test4427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4427");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-217000), (-1442828), 340110799);
    }

    @Test
    public void test4428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4428");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-15097688), 6467420, (-1165), 15623);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-722) + "'", int4 == (-722));
    }

    @Test
    public void test4429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4429");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-86668494), (-202903478), (-198400));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-86668494) + "'", int3 == (-86668494));
    }

    @Test
    public void test4430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4430");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-10278324212771L), 170566);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1753132647675498386L) + "'", long2 == (-1753132647675498386L));
    }

    @Test
    public void test4431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4431");
        org.joda.time.field.FieldUtils.verifyValueBounds("", 1447, (-21700000), 361058);
    }

    @Test
    public void test4432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4432");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 5822300, 62287089798569600L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 5822300 * 62287089798569600");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4433");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1936734162), (-31), (-5823902), 2365);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2413217) + "'", int4 == (-2413217));
    }

    @Test
    public void test4434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4434");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 3433626, 26400, (-15623));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4435");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1134915920), 320, (-5835));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4436");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 170566, (long) 232);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 39571312 + "'", int2 == 39571312);
    }

    @Test
    public void test4437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4437");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-18842291), (long) (-101990));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1921725259090L + "'", long2 == 1921725259090L);
    }

    @Test
    public void test4438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4438");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-38261404970878312L), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-38261404970878312L) + "'", long2 == (-38261404970878312L));
    }

    @Test
    public void test4439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4439");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(163128730, (-12306456));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 150822274 + "'", int2 == 150822274);
    }

    @Test
    public void test4440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4440");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(0L, (-46425600L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-46425600L) + "'", long2 == (-46425600L));
    }

    @Test
    public void test4441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4441");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(1827581L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1827581L + "'", long2 == 1827581L);
    }

    @Test
    public void test4442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4442");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-2259000L), (long) 1588768);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -3589026912000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4443");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(216990, (-16171840));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-15954850) + "'", int2 == (-15954850));
    }

    @Test
    public void test4444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4444");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 282218704, (int) '#', 2205840);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4445");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-46677556169919902L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -46677556169919902");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4446");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 19814190, 3438671071756075840L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 19814190 * 3438671071756075840");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4447");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-386032), (-1688L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 651622016L + "'", long2 == 651622016L);
    }

    @Test
    public void test4448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4448");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(384786153L, (-56939));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-21909338765667L) + "'", long2 == (-21909338765667L));
    }

    @Test
    public void test4449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4449");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-9252624), (-384786100));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -9252624 * -384786100");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4450");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1569), (-102059));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-103628) + "'", int2 == (-103628));
    }

    @Test
    public void test4451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4451");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1906981791), (-7010204), (-1372800));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4452");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 9724);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9724 + "'", int1 == 9724);
    }

    @Test
    public void test4453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4453");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1941959631L), (java.lang.Object) 1659032);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4454");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 1981424100, (long) 16254);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1981407846L + "'", long2 == 1981407846L);
    }

    @Test
    public void test4455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4455");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-51354937), (long) (-10737896));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-62092833L) + "'", long2 == (-62092833L));
    }

    @Test
    public void test4456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4456");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 9600, 388073, 9228320);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 9600 for hi! must be in the range [388073,9228320]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4457");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-5324202), 1936616248, 318773032);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4458");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-4754576), 40769747, 81366);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -4754576 for  must be in the range [40769747,81366]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4459");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-8900), 1012, 142556562, (-10400));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4460");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(6916);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-6916) + "'", int1 == (-6916));
    }

    @Test
    public void test4461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4461");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-40), (long) 1954194);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-78167760L) + "'", long2 == (-78167760L));
    }

    @Test
    public void test4462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4462");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-111178), (-4440), (-39500081));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4463");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-502656L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-502656) + "'", int1 == (-502656));
    }

    @Test
    public void test4464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4464");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 9697, 0, (-235249));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4465");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-46590310), 8620872, 1024);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4466");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-172370), 244532442, 28458464);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -172370 for  must be in the range [244532442,28458464]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4467");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-389231700), (-265L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-389231435L) + "'", long2 == (-389231435L));
    }

    @Test
    public void test4468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4468");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-173265376), 2003383330);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -173265376 * 2003383330");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4469");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(328190018, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4470");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(46591882L, (long) (-46591216));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 666L + "'", long2 == 666L);
    }

    @Test
    public void test4471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4471");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-589167120493742L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -589167120493742");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4472");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 146920931, 11042086719633592L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 11042086866554523L + "'", long2 == 11042086866554523L);
    }

    @Test
    public void test4473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4473");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 1031830080);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1031830080 + "'", int1 == 1031830080);
    }

    @Test
    public void test4474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4474");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-5161632023964640L), (java.lang.Object) (-374783424));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4475");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-462185352000L), (long) (-182942901));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-462002409099L) + "'", long2 == (-462002409099L));
    }

    @Test
    public void test4476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4476");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-5819794), 5823869, 16397170);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15326810 + "'", int3 == 15326810);
    }

    @Test
    public void test4477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4477");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(14950028412L, 19L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 284050539828L + "'", long2 == 284050539828L);
    }

    @Test
    public void test4478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4478");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(1936619548);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1936619548) + "'", int1 == (-1936619548));
    }

    @Test
    public void test4479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4479");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 1155887200, 2001232915, (-437758029));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1155887200 for hi! must be in the range [2001232915,-437758029]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4480");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(409635100, (-163101298));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 246533802 + "'", int2 == 246533802);
    }

    @Test
    public void test4481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4481");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(422472960, (-1867));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 422472960 * -1867");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4482");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 137756300, (-848), 427963128);
    }

    @Test
    public void test4483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4483");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1327011840), (-561), (-146794895), (-107785395));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-117717870) + "'", int4 == (-117717870));
    }

    @Test
    public void test4484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4484");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1024, 19814191, 1665532832);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4485");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((int) (byte) 10, 1821, (-5324202), 656647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1831 + "'", int4 == 1831);
    }

    @Test
    public void test4486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4486");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 0, 232, (-46592000));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for hi! must be in the range [232,-46592000]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4487");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-74897), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-74897) + "'", int2 == (-74897));
    }

    @Test
    public void test4488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4488");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(4781948, (-14931288), 8620872, (-21091));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4489");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(115500, 18, 8620872);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115500 + "'", int3 == 115500);
    }

    @Test
    public void test4490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4490");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-808), 39046069);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 39045261 + "'", int2 == 39045261);
    }

    @Test
    public void test4491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4491");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(125500, (-11155490));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-11029990) + "'", int2 == (-11029990));
    }

    @Test
    public void test4492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4492");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(5601384, (-4205));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 5601384 * -4205");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4493");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-271345704448000L), (long) (-288129358));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-271345416318642L) + "'", long2 == (-271345416318642L));
    }

    @Test
    public void test4494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4494");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(502079585212647L, (-140906));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 502079585212647 * -140906");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4495");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 101, (-437758029), 1701);
    }

    @Test
    public void test4496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4496");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 5822300, 75915844231968480L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 75915844237790780L + "'", long2 == 75915844237790780L);
    }

    @Test
    public void test4497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4497");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-328191146), 1766785);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-326424361) + "'", int2 == (-326424361));
    }

    @Test
    public void test4498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4498");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(1734960, (-12572));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 1734960 * -12572");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4499");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-8922), 51);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-455022L) + "'", long2 == (-455022L));
    }

    @Test
    public void test4500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4500");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-1081264), (-65412793099800L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -1081264 * -65412793099800");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }
}

