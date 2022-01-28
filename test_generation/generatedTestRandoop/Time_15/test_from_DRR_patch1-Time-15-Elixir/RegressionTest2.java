import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-32L), (-40));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1280L + "'", long2 == 1280L);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-46592000), (-3200), 198429);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 186160 + "'", int3 == 186160);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(42);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-42) + "'", int1 == (-42));
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(8344970L, (long) 13728);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 8331242L + "'", long2 == 8331242L);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 3395, 1327011976, (-4122));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(18936964800L, 174035);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3295694668968000L + "'", long2 == 3295694668968000L);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-328191424), 1327011976);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 998820552 + "'", int2 == 998820552);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-572120560), (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-572120460) + "'", int2 == (-572120460));
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 17, 46592042, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(132L, (-3423621056803200L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -451917979498022400");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-34847965L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-34847965) + "'", int1 == (-34847965));
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(2860465143528000L, 220108L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2860465143748108L + "'", long2 == 2860465143748108L);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 164580, (-1665), 46592000);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (short) -1, (long) (-35));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 34L + "'", long2 == 34L);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-9L), 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-1387860305670L), 9L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1387860305661L) + "'", long2 == (-1387860305661L));
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        java.lang.Object obj0 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals(obj0, (java.lang.Object) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(2003383330, (-166311), (int) 'a', (-1519000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((int) (byte) -1, (-19814190));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-19814191) + "'", int2 == (-19814191));
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-125500), (-34847965), 6916);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 1664, (-21700000), (-1519000));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1664 for hi! must be in the range [-21700000,-1519000]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (byte) -1, obj1);
        java.lang.Class<?> wildcardClass3 = obj1.getClass();
        boolean boolean5 = org.joda.time.field.FieldUtils.equals((java.lang.Object) wildcardClass3, (java.lang.Object) (-1570));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-2724), (-166311));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 453031164 + "'", int2 == 453031164);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(1447, 376);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 544072 + "'", int2 == 544072);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(33L, (long) (-384786100));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -12697941300");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-166311));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 166311 + "'", int1 == 166311);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-5823869), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (int) 'a', (-41220), 166720);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-1936619548), (-166311), (-520));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1936619548 for  must be in the range [-166311,-520]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-35), 10, (-450092));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(0L, 1087985074176000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1087985074176000L) + "'", long2 == (-1087985074176000L));
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(4L, 10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-6L) + "'", long2 == (-6L));
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(5823902, 8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 46591216 + "'", int2 == 46591216);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 0, (-363940), (-5823869));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for hi! must be in the range [-363940,-5823869]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(46592042, 101);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 46592042 * 101");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-487), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-487L) + "'", long2 == (-487L));
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-12), 164631, (-1664));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -12 for  must be in the range [164631,-1664]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(0, (-166311));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-166311) + "'", int2 == (-166311));
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 571021860, 773440, 186160);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 571021860 for  must be in the range [773440,186160]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(5823902, (-1031830080), (-39499200));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-986506979) + "'", int3 == (-986506979));
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-376), (-2575260));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2575636) + "'", int2 == (-2575636));
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-3200), 453031164, (-572120560));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1716), 165786, (-4424364));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-35147215488L), (long) (-2724));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 95741014989312L + "'", long2 == 95741014989312L);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-22058400L), (long) (-1664));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 36705177600");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(1447, (-166300));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-240636100) + "'", int2 == (-240636100));
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-6190L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-6190) + "'", int1 == (-6190));
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-1L), (-1906981791));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1906981791L + "'", long2 == 1906981791L);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 656880, 112000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 544880L + "'", long2 == 544880L);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-6190), 0, (-487));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(1031830080, 320);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1031830400 + "'", int2 == 1031830400);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(20, (-450092), (-1570));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-448503) + "'", int3 == (-448503));
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(46591216);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-46591216) + "'", int1 == (-46591216));
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(0, 998820552, (-1700), (-1386));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1608) + "'", int4 == (-1608));
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-11616L), 2860465143748108L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2860465143759724L) + "'", long2 == (-2860465143759724L));
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-3780L), (long) (-487));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4267L) + "'", long2 == (-4267L));
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(2610333L, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2610334L + "'", long2 == 2610334L);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (int) (byte) -1, 32, (-34847965));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for  must be in the range [32,-34847965]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 35, (long) (-320));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-285L) + "'", long2 == (-285L));
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-125500), (-1700), (-1569), 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-405) + "'", int4 == (-405));
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-111143));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 111143 + "'", int1 == 111143);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-31));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-31) + "'", int1 == (-31));
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 7L, (java.lang.Object) 115500);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, (-166300L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 172370, 1255, (-13728));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-111143), 7176000);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -111143 * 7176000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 1024, 4534530L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4533506L) + "'", long2 == (-4533506L));
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 32, 1327011840);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 42464378880L + "'", long2 == 42464378880L);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-166400), 1734960, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -166400 for hi! must be in the range [1734960,0]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(13728, (-1820), 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-848) + "'", int3 == (-848));
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(1447, (-328191465));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-328190018) + "'", int2 == (-328190018));
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((int) ' ', 1447);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 46304 + "'", int2 == 46304);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 46592042, (-12), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 5823869, 0, (-13));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(165786, (-166962), (-405));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-772) + "'", int3 == (-772));
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-617L), (-1688L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1041496L + "'", long2 == 1041496L);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(100L, (-6L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 94L + "'", long2 == 94L);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-328191424), (-46592000), (-572120560), (-448503));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-374783424) + "'", int4 == (-374783424));
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-662370800), (-572120460), 233);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-662370800), (-19814190));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-682184990) + "'", int2 == (-682184990));
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(43);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-43) + "'", int1 == (-43));
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (int) (short) -1, 111143, (-1701));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for  must be in the range [111143,-1701]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 10410L, (java.lang.Object) 544880L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(363940, (-3200), (-165445));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(330L, (long) 19814190);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 19814520L + "'", long2 == 19814520L);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-165446L), (long) 5824000);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5989446L) + "'", long2 == (-5989446L));
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-3590394), (-13728));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -3590394 * -13728");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-207039327505920000L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -207039327505920000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 198429, 1031830080);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 204745010944320L + "'", long2 == 204745010944320L);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-52), (long) (-166720));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-166772L) + "'", long2 == (-166772L));
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1327011840, (java.lang.Object) (-660545169L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(100248993660L, 808);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 81001186877280L + "'", long2 == 81001186877280L);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-18084422856192000L), (java.lang.Object) (-36156566400L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-33), (long) (-52));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 19L + "'", long2 == 19L);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-19814190), (-97), 808);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 340473032, (-376), 18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-620L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-620) + "'", int1 == (-620));
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(136, 13);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 149 + "'", int2 == 149);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-35147215488L), 1936619520L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -35147215488 * 1936619520");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(0, 5824000, (-448503));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 69888, 165786, (-167014));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 69888 for  must be in the range [165786,-167014]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(340473032);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-340473032) + "'", int1 == (-340473032));
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(0, (-23247));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(112000L, (long) (-17));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1904000) + "'", int2 == (-1904000));
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-12572), (-1936619520));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -12572 * -1936619520");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(0, 9724, (-328191424));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(182942800L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 182942800 + "'", int1 == 182942800);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(1936619520, 13);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1936619533 + "'", int2 == 1936619533);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-808), 204745010944320L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-165433968843010560L) + "'", long2 == (-165433968843010560L));
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-7176000), (-165445), 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-60446) + "'", int3 == (-60446));
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-682184990));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-682184990) + "'", int1 == (-682184990));
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, (long) (-166300));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(95990294400L, (long) (-376));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 95990294776L + "'", long2 == 95990294776L);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(1664, 773440);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1287004160 + "'", int2 == 1287004160);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-2184L), 69923);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-152711832L) + "'", long2 == (-152711832L));
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-43), (-42), (-39499200));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -43 for  must be in the range [-42,-39499200]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 54945330);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 54945330 + "'", int1 == 54945330);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-272230358400L), (-1570));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 427401662688000L + "'", long2 == 427401662688000L);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-2355724800L), 39585L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2355685215L) + "'", long2 == (-2355685215L));
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-28793394610L), (long) (-46592000));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 1341541841669120000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-520), (java.lang.Object) 165786);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(7L, (long) (-39499200));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-276494400) + "'", int2 == (-276494400));
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-468L), (java.lang.Object) 9906401169L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-5324800), (-1936619548), (-1906981791));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-40322L), (-276494400));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 11148807196800L + "'", long2 == 11148807196800L);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(7L, 5824000);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 40768000L + "'", long2 == 40768000L);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-487), (-100), (-1936619531));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -487 for hi! must be in the range [-100,-1936619531]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 571021860, 5824000, 172370);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1664), (-167014), 109);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-11646070), 32, (-42));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -11646070 for hi! must be in the range [32,-42]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-1), (-682184990), 10);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-109928), (-1327011976), (-166400));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -109928 for hi! must be in the range [-1327011976,-166400]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-21578), (-360860), (-572120560));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-39468L), 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 656880, (-58247176000L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-38261404970880000L) + "'", long2 == (-38261404970880000L));
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(19814520L, (-2355724800L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-46677556164096000L) + "'", long2 == (-46677556164096000L));
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(544072, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 28291744 + "'", int2 == 28291744);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1734960, 1031830400, 544072, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(165786, (-92));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-15252312) + "'", int2 == (-15252312));
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1664), (-166720), 51354937, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 166400, (-139846));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-23270374400L) + "'", long2 == (-23270374400L));
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(656880, (-46591216));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-45934336) + "'", int2 == (-45934336));
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-5200), 46590300, 5823869);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-264), 0, (-100));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-8));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-8) + "'", int1 == (-8));
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(51354937, 182942800, (-240636100));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-52), 46592000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 46591948 + "'", int2 == 46591948);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(101, 182942800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 182942901 + "'", int2 == 182942901);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-107265L), (long) 46592000);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -4997690880000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-166080), (-1820), 0, 109);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 70 + "'", int4 == 70);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 70, 1327011840, 1936619533);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 0, 10400, 101);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1716), (-264), 46591216);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(998820552, 1734960);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 998820552 * 1734960");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(0L, 1830475L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1830475L + "'", long2 == 1830475L);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-328190018));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 328190018 + "'", int1 == 328190018);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(69888, (-4122));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-288078336) + "'", int2 == (-288078336));
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        java.lang.Object obj0 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals(obj0, (java.lang.Object) 1665);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(198400L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 198400 + "'", int1 == 198400);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 502079585280000L, (java.lang.Object) (-152711832L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1380), (-39499200), (-113847), (-1056));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-23380) + "'", int4 == (-23380));
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-1155));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1155) + "'", int1 == (-1155));
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-69923), (java.lang.Object) 23);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(233, 0, 0, 808);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 233 + "'", int4 == 233);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(0, (-166962), (-56939));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-110024) + "'", int3 == (-110024));
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-21578), 9724, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-20L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-20) + "'", int1 == (-20));
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1906981791), 100, (-328191424), (-34847965));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-146920931) + "'", int4 == (-146920931));
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-21578), 490580);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -21578 * 490580");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 13516776, (java.lang.Object) 100.0f);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 490580, (-125500), 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-2575636), (java.lang.Object) (-277588800L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(11148807196800L, 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1114880719680000L + "'", long2 == 1114880719680000L);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-216870), 1936619520);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1936402650 + "'", int2 == 1936402650);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1820), 1936402650);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -1820 * 1936402650");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-772), 126, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(320, (int) (byte) 0, (-1716), (-2612385));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-82300608013L), 106902556480L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -82300608013 * 106902556480");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 198400, 217000, (-100));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1380), 233);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-321540) + "'", int2 == (-321540));
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 255717);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 255717 + "'", int1 == 255717);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-46590310), (-7176000), (-3200));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3553504) + "'", int3 == (-3553504));
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-1372800L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1372800) + "'", int1 == (-1372800));
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 52, (long) (-3590394));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3590342L) + "'", long2 == (-3590342L));
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-384786100), (-35));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-384786135) + "'", int2 == (-384786135));
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 126, (long) (-5200));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-655200) + "'", int2 == (-655200));
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(468993641895L, (long) 656880);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 308072543487987600");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-46590310), 1936619533, 165796, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-138217));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 138217 + "'", int1 == 138217);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 46591216, 13728, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(164631);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-164631) + "'", int1 == (-164631));
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        java.lang.Object obj1 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-450092), obj1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-662370800), (-1519000), (-165445));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 51354937, (-2575636), (-20));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(112035L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 112035 + "'", int1 == 112035);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-1820L), (-166311));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 302686020L + "'", long2 == 302686020L);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-36156566400L), (long) 1255);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -45376490832000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1941944331), 111143, 1820);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(111143, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 111178 + "'", int2 == 111178);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-662370800), (-6190));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -662370800 * -6190");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-3200), (-210424900), 282876300, 9697);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-17), 165796);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2818532) + "'", int2 == (-2818532));
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 51354937, 3047616013L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2996261076L) + "'", long2 == (-2996261076L));
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-6), (java.lang.Object) 46590952L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-3423621056803200L), (-1941944331));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -3423621056803200 * -1941944331");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-10));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-1372800));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1372800) + "'", int1 == (-1372800));
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-34847965), 166400);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -34847965 * 166400");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-321540), 544072, (-21700000));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(39585L, 2L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 79170L + "'", long2 == 79170L);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-1664));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1664 + "'", int1 == 1664);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(45612L, 174034L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 7938038808");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-15252312), (-17), (-5324800));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 166400, (-384786135), 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 166400 for hi! must be in the range [-384786135,0]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1031377144), (-69923), 20, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1701), (-1936619548));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1936621249) + "'", int2 == (-1936621249));
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(166400, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16640000 + "'", int2 == 16640000);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-165445), (java.lang.Object) (-1936619548));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1665), 70, (-620));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(0L, (long) (-1031377144));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1031377144L + "'", long2 == 1031377144L);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-1653));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1653 + "'", int1 == 1653);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-5822201), 46591948, (-1936621249), 51354937);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 40769747 + "'", int4 == 40769747);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-376), (-216870), 363940, (-43));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-363940), (-5324800), (-34847965), 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-5688740) + "'", int4 == (-5688740));
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-166962), 16640000, 186160, (-340473032));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(165796);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-165796) + "'", int1 == (-165796));
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 109, (-3200), (-19814190));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-4533506L), (long) (-42));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 190407252 + "'", int2 == 190407252);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(1820);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1820) + "'", int1 == (-1820));
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 255717, (java.lang.Object) (-833L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-655200), 282876300, (-166300), 1936619520);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 282221100 + "'", int4 == 282221100);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-848), 808, 186160);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(340473000);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-340473000) + "'", int1 == (-340473000));
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(42, 182942901);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 42 * 182942901");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-52), (-5688740), 111178);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1155), 1031830080, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 20, (-1936619520), (-166400));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(4L, (-682184990));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2728739960L) + "'", long2 == (-2728739960L));
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 282221100, (java.lang.Object) (-156L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1155, (-2724), 165786, 42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 46590952L, (java.lang.Object) 198303L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-1904000));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1904000) + "'", int1 == (-1904000));
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-360860), 6, 149);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-40), (long) (-1570));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 62800L + "'", long2 == 62800L);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(18, 19814190, 182942901);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 163128730 + "'", int3 == 163128730);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(2959353600L, (-217000));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-642179731200000L) + "'", long2 == (-642179731200000L));
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(0, (-113847), (-662374000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-374783424));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-374783424) + "'", int1 == (-374783424));
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(571021860, (-4424364), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-4145590) + "'", int3 == (-4145590));
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(58240000000L, (long) (-97));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 58240000097L + "'", long2 == 58240000097L);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-572120460), (-572120560));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1144241020) + "'", int2 == (-1144241020));
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1569), 32, 1287004160);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1287002560 + "'", int3 == 1287002560);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 1031830080, (-1519000), 19814190);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1031830080 for hi! must be in the range [-1519000,19814190]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(35, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 87 + "'", int2 == 87);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, 164631);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-165664L), (long) 158513520);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -26259983777280");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-167014), 111178);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-18568282492L) + "'", long2 == (-18568282492L));
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-3590394), 8344970L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4754576L + "'", long2 == 4754576L);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(35);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-35) + "'", int1 == (-35));
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(340473032, 9724);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 340482756 + "'", int2 == 340482756);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-7176000), 165796);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-7010204) + "'", int2 == (-7010204));
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(52, 1031830400, (-1936621249));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(233);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-233) + "'", int1 == (-233));
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1936619531), (-114631));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1936734162) + "'", int2 == (-1936734162));
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-4267L), (-229779396L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 229775129L + "'", long2 == 229775129L);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(1287002560, 0, 198303);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9600 + "'", int3 == 9600);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 255717, (-662374000), (-3200));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 255717 for hi! must be in the range [-662374000,-3200]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(382786, 87);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 382873 + "'", int2 == 382873);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-13728), (-655200), (-1031830080));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(9600, 23, (-233), 3395);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2365 + "'", int4 == 2365);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-986506979), (-34847965L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1021354944L) + "'", long2 == (-1021354944L));
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 45612L, (java.lang.Object) 198303L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-233), (long) (-217000));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 216767L + "'", long2 == 216767L);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-288078336), (-1056));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -288078336 * -1056");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(174035, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 174070 + "'", int2 == 174070);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(911552333220L, (-35L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-31904331662700L) + "'", long2 == (-31904331662700L));
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((int) (short) 0, 1701, 5824000);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5822300 + "'", int3 == 5822300);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(0, (-5200));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5200) + "'", int2 == (-5200));
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1655), (-31));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1686) + "'", int2 == (-1686));
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 111143, 10400);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1155887200L + "'", long2 == 1155887200L);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(1701);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1701) + "'", int1 == (-1701));
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1155, 1024, (-217000), (-1936619531));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(1327011840);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1327011840) + "'", int1 == (-1327011840));
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-240636100), 656880, (-662374000), (-572120460));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-600993384) + "'", int4 == (-600993384));
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (int) (short) 10, 136, (-109928));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-833L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-833) + "'", int1 == (-833));
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 5822300, 166501L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 969418772300");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-166720), 340482756, 1936619520);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(2355724900L, (long) 9724);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2355734624L + "'", long2 == 2355734624L);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-1665), (long) (-1665));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2772225L + "'", long2 == 2772225L);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-328190018), (-2052L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-328187966L) + "'", long2 == (-328187966L));
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-487L), (-275758400L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 275757913L + "'", long2 == 275757913L);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-13728));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-13728) + "'", int1 == (-13728));
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(182942901, 0, (-69923), (-808));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-7151) + "'", int4 == (-7151));
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-56939L), (-166300L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-223239L) + "'", long2 == (-223239L));
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-20L), 54945330);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1098906600L) + "'", long2 == (-1098906600L));
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (short) 1, (java.lang.Object) 174035L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1372800), 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1372790) + "'", int2 == (-1372790));
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-165796), 0, (-571021860));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-1386L), 186160);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-258017760L) + "'", long2 == (-258017760L));
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 217000, (long) (-328191465));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-71217547905000L) + "'", long2 == (-71217547905000L));
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-21700L), 645120L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 623420L + "'", long2 == 623420L);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(1741, 1665, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(0L, (long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(1795200L, (long) 328190018);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 589166720313600L + "'", long2 == 589166720313600L);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-1906981791), (-1056L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1906982847L) + "'", long2 == (-1906982847L));
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeAdd((-1144241020), (-1936619548));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The calculation caused an overflow: -1144241020 + -1936619548");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 136, 8344970L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1134915920 + "'", int2 == 1134915920);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-111143), (-166080), (-6));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-111143) + "'", int3 == (-111143));
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(2365);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2365) + "'", int1 == (-2365));
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1031830080), (-240636100), (-21700000));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1021354944L), (java.lang.Object) 47111554L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(1820, (-21578));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-39271960) + "'", int2 == (-39271960));
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((int) (byte) 1, 174070);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 174070 + "'", int2 == 174070);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-2365), 233, (-7151), 1716);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2132) + "'", int4 == (-2132));
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 9697, (-34847965), 340482756);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 490580, 571021860, (-5822201));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-2818532), 198, (-46591216));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -2818532 for hi! must be in the range [198,-46591216]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-773760), (-572120560), 69888);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 166720, (-35450217234432000L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35450217234598720L + "'", long2 == 35450217234598720L);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1, 5200, (-166300), 174070);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5201 + "'", int4 == 5201);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-360860));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-360860) + "'", int1 == (-360860));
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-46590310));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 46590310 + "'", int1 == 46590310);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-271516L), (-7176000));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1948398816000L + "'", long2 == 1948398816000L);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-1569), (long) (-1372790));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2153907510L + "'", long2 == 2153907510L);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(5823869, (-166720));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5657149 + "'", int2 == 5657149);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1907097291), (-46592000));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1953689291) + "'", int2 == (-1953689291));
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-240636100), (-17), (-7010204));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-1906982847L), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1906982847L) + "'", long2 == (-1906982847L));
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 5657149, (-1936619531));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-10955745243177119L) + "'", long2 == (-10955745243177119L));
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1), 1031830080);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1031830079 + "'", int2 == 1031830079);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1327011976), (-1936619548));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -1327011976 * -1936619548");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1155), (-240), (-34848000));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-23247), (-223641600));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -23247 * -223641600");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(623420L, 174035);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 108496899700L + "'", long2 == 108496899700L);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1936621249), (java.lang.Object) 58240000L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(9697L, (-572120560));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5547853070320L) + "'", long2 == (-5547853070320L));
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-1904000), (long) 5201);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1898799L) + "'", long2 == (-1898799L));
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(4534530L, 589166720313600L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-589166715779070L) + "'", long2 == (-589166715779070L));
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-465L), 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-1386));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1386) + "'", int1 == (-1386));
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-8), (java.lang.Object) 101L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 9724, (long) (-384786135));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -3741660376740");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-340473032), 911552333220L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -340473032 * 911552333220");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-482750), 376, (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1327011840), (-113847), 1812096);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-1820), 1327011840, (-165445));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1820 for  must be in the range [1327011840,-165445]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(656880, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 656880 + "'", int2 == 656880);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-363940), 1716, (int) (short) 10, 340473032);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 340110799 + "'", int4 == 340110799);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-682184990), (-620), (-363940));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -682184990 for  must be in the range [-620,-363940]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-1327011840));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1327011840 + "'", int1 == 1327011840);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-1655L), 183048400);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-302945102000L) + "'", long2 == (-302945102000L));
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 5200, 1741, 5824000);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 382786, (-40), 9600);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(1830475L, 2610003L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 4777545241425");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(46592000, 1287004160);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 46592000 * 1287004160");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(165786, (-232));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 165554 + "'", int2 == 165554);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(255717);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-255717) + "'", int1 == (-255717));
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-10955745243177119L), 3047616000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-10955748290793119L) + "'", long2 == (-10955748290793119L));
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-1327011840), (long) 174070);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1326837770L) + "'", long2 == (-1326837770L));
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-139846), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((int) (byte) 100, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-1372790), (-34847965), (-2575636));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1372790 for  must be in the range [-34847965,-2575636]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 46304, 1796L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 83161984 + "'", int2 == 83161984);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-1655), (-34848000), 1134915920);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 340110799, 1665);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 566284480335L + "'", long2 == 566284480335L);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-1386), 136, 5657149);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1386 for hi! must be in the range [136,5657149]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(18L, (long) (-384786135));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 384786153L + "'", long2 == 384786153L);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(33L, 453031164);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 14950028412L + "'", long2 == 14950028412L);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-69923L), (-3030955200000L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3030955130077L + "'", long2 == 3030955130077L);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(1936619520L, (-1655));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3205105305600L) + "'", long2 == (-3205105305600L));
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-1653L), (long) 46592000);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-46593653L) + "'", long2 == (-46593653L));
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-1608), (long) (-166080));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 164472L + "'", long2 == 164472L);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(382873, 10, 1812096);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 382873 + "'", int3 == 382873);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(1812096, (-165445), 1287004160);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1812096 + "'", int3 == 1812096);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        java.lang.Object obj1 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 126, obj1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(282221100, 112035, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(70, (-487), 549120, (-7151));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-56939), (-165796), (-138217));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-139679) + "'", int3 == (-139679));
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-166080), 165786);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -166080 * 165786");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-1820L), (long) 282221100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 282219280L + "'", long2 == 282219280L);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (short) 100, 1796L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 179600L + "'", long2 == 179600L);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-139679), (-1380));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-141059) + "'", int2 == (-141059));
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-35), (-11));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 385L + "'", long2 == 385L);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-374783424));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 374783424 + "'", int1 == 374783424);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(183048400);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-183048400) + "'", int1 == (-183048400));
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1700), 42);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1658) + "'", int2 == (-1658));
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-328187966L), (-6190));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2031483509540L + "'", long2 == 2031483509540L);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-92), (-52000L));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4784000 + "'", int2 == 4784000);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(2365, (-277588800), (-571021860));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 16640000, 46304, 549120);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-12));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-12) + "'", int1 == (-12));
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(13728, 174035, 5823869);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5663563 + "'", int3 == 5663563);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-21578), (int) '#', (-1569));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -21578 for  must be in the range [35,-1569]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(198303L, (-106666560000L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -21152298847680000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1247383545L, (java.lang.Object) 62800L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-1941944331));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1941944331 + "'", int1 == 1941944331);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 5823869, (long) (-210424900));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 216248769L + "'", long2 == 216248769L);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-17), (long) (-384786100));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 384786083L + "'", long2 == 384786083L);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(1936619520, 7176000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1943795520 + "'", int2 == 1943795520);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-1688L), (long) (-10));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1678L) + "'", long2 == (-1678L));
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1287004160, 69888, 571021860);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-138217), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-1701), 97, (-1941944331));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1701 for  must be in the range [97,-1941944331]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-2724), 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1716, 186160, (-1327011976));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(46590310L, (-223641402L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-177051092L) + "'", long2 == (-177051092L));
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 808, 1327011840, (-138217));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(2355734624L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2355734624L + "'", long2 == 2355734624L);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-92));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 92 + "'", int1 == 92);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-1327011840), (-384786100), (-139679));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1327011840 for  must be in the range [-384786100,-139679]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 28291744, 2365, (-1155));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(9697, (-3590394));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3580697) + "'", int2 == (-3580697));
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(3047616013L, (long) (-482750));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3048098763L + "'", long2 == 3048098763L);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 9600, (-2612385), (-42));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-165433968843010560L), (java.lang.Object) 340482756);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-3553504), (long) (-113847));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 404555769888L + "'", long2 == 404555769888L);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-1653L), 1087985074176000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1087985074174347L + "'", long2 == 1087985074174347L);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-6L), (long) 277588800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1665532800) + "'", int2 == (-1665532800));
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-5822201), (-3580697));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -5822201 * -3580697");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-79252992000L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -79252992000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-1665), 500L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1165L) + "'", long2 == (-1165L));
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-255717), 106902556480L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -27336801035396160");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-139679), 158513520, 544072);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 13516776, (-328191465), (-166962));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 46591948);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 46591948 + "'", int1 == 46591948);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-125500), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-125500L) + "'", long2 == (-125500L));
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-7151), (-40322L));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 288342622 + "'", int2 == 288342622);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(198, (-773760), (-4122), (-277588800));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(0, 1812096);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1812096 + "'", int2 == 1812096);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-520), (-1820), (-139679));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1031830080), (java.lang.Object) 19814190);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (byte) 0, (long) 111143);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 111143L + "'", long2 == 111143L);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 5657149, (-1936734162), 374783424);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-642179731200000L), (java.lang.Object) (-1664L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-1664), (long) (-1327011976));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 2208147928064");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(0L, 1034683243939436L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1034683243939436L) + "'", long2 == (-1034683243939436L));
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-520), 16640000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16639480 + "'", int2 == 16639480);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(109);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-109) + "'", int1 == (-109));
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-31), (long) (-114631));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3553561L + "'", long2 == 3553561L);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(16640000, (-210424900));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 16640000 * -210424900");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 1734960, (-3590342L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-6229099756320L) + "'", long2 == (-6229099756320L));
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-45934336), 0, (-7176000));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -45934336 for  must be in the range [0,-7176000]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-21700L), (-1953689291));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 42395057614700L + "'", long2 == 42395057614700L);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-40320L), 19814520L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 19774200L + "'", long2 == 19774200L);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-5688740), 46304, (-1327011976));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        org.joda.time.field.FieldUtils.verifyValueBounds("", 8, 0, 277584678);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-589166715779070L), (-1087985074176000L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1677151789955070L) + "'", long2 == (-1677151789955070L));
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-166311), (-1153L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-167464L) + "'", long2 == (-167464L));
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 46591216, (-1665));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-77574374640L) + "'", long2 == (-77574374640L));
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(16640000, 166387);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 16640000 * 166387");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-3200L), (long) 46590310);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -149088992000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 163128730, 587L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 95756564510L + "'", long2 == 95756564510L);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 656880, (-1700), 5823869);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(66350592L, 52);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3450230784L + "'", long2 == 3450230784L);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1024, 773440, (-655200));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1608), (-56939), (-6));
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(1, 1820);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1821 + "'", int2 == 1821);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-11), 32, (-21578));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -11 for  must be in the range [32,-21578]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(620L, (-46677556164096000L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 46677556164096620L + "'", long2 == 46677556164096620L);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-572120460), 97, (-2132));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1904000), (-11646070), 998820552);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-2575636), 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-848));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-848) + "'", int1 == (-848));
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-58247176000L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -58247176000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(19L, 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-39271960));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-39271960) + "'", int1 == (-39271960));
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1664), 1936619520);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1936617856 + "'", int2 == 1936617856);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-2575260), (-6));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2575266) + "'", int2 == (-2575266));
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-164631), 282221100, 40769747, (-1941944331));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-450092), 1134915920, (-2575266));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-106666560000L), 20);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2133331200000L) + "'", long2 == (-2133331200000L));
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-166070L), (long) 1447);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-167517L) + "'", long2 == (-167517L));
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 16640000, (-5822201), (-166400));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 16640000 for  must be in the range [-5822201,-166400]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (byte) 100, (java.lang.Object) (-223239L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-571021860), (java.lang.Object) (-272230358291L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 28291744);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 28291744 + "'", int1 == 28291744);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-45934336), (long) (-166720));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-45767616L) + "'", long2 == (-45767616L));
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-52), 198400, 328190018);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(198400L, (-31));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-6150400L) + "'", long2 == (-6150400L));
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 0, 1701, 1664);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1155), 35, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-264L), 5201);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1373064L) + "'", long2 == (-1373064L));
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-166300), (-56939), (-10));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-52440) + "'", int3 == (-52440));
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        java.lang.Object obj0 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals(obj0, (java.lang.Object) (-5823869));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-2365), (-165445), 43);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(1796L, (long) (-328191465));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 328193261L + "'", long2 == 328193261L);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-19814191), (long) 186160);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -3688609796560");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 13741, 1653, (-110024));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (short) 100, (java.lang.Object) 2772225L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (int) (byte) 100, (-46592000), (-240636100));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 149);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 149 + "'", int1 == 149);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-328191424), 111143, 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -328191424 for  must be in the range [111143,100]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-10), (-848));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8480 + "'", int2 == 8480);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(166720, 28291744);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 28458464 + "'", int2 == 28458464);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-141059), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1936619548), (-288078336), (-111143));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(100, (-217000));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-21700000) + "'", int2 == (-21700000));
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 1701, (-833L));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1416933) + "'", int2 == (-1416933));
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-105600L), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-105600L) + "'", long2 == (-105600L));
    }
}

