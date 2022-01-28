import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest10 {

    public static boolean debug = false;

    @Test
    public void test5001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5001");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-655200), (long) 3433626);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2249711755200L) + "'", long2 == (-2249711755200L));
    }

    @Test
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5002");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-36248), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-36248L) + "'", long2 == (-36248L));
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5003");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-984676579), 1570);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-984675009) + "'", int2 == (-984675009));
    }

    @Test
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5004");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((int) '#', (-97), (-612354));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5005");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1588808), 166962);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -1588808 * 166962");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5006");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-23094720L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-23094720) + "'", int1 == (-23094720));
    }

    @Test
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5007");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-101990), (-45932635));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-46034625) + "'", int2 == (-46034625));
    }

    @Test
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5008");
        org.joda.time.field.FieldUtils.verifyValueBounds("", (-1081264), (-226265106), (-18315));
    }

    @Test
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5009");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1936619520, 0, (-167049), 2612385);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2132760 + "'", int4 == 2132760);
    }

    @Test
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5010");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 320, 126036, (-443092536));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 320 for hi! must be in the range [126036,-443092536]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5011");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-268L), (-19814180));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5310200240L + "'", long2 == 5310200240L);
    }

    @Test
    public void test5012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5012");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-16171840), (long) (-139517));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-16311357L) + "'", long2 == (-16311357L));
    }

    @Test
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5013");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1660208598, (-1212), 340473032);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5014");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1366941395), 202680927);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -1366941395 * 202680927");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5015");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-566300680), (-32), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5016");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1936619531), 165786, (-5823497));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5017");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(2355724900L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 2355724900");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5018");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-400193578), (long) (-363940));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 145646450777320L + "'", long2 == 145646450777320L);
    }

    @Test
    public void test5019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5019");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-1408273), (long) (-18842291));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-20250564L) + "'", long2 == (-20250564L));
    }

    @Test
    public void test5020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5020");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1939364392, (java.lang.Object) (-52440));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5021");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-18289670), (-18618910));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -18289670 * -18618910");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5022");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(183048400, 16640000);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 183048400 * 16640000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5023");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(1087985074174347L, (-156722833041255L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 1087985074174347 * -156722833041255");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5024");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(384786083L, (-39499200));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-15198742449633600L) + "'", long2 == (-15198742449633600L));
    }

    @Test
    public void test5025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5025");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 70, 612257L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 42857990L + "'", long2 == 42857990L);
    }

    @Test
    public void test5026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5026");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1155), 6815443, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5027");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-384786100), 21645, 19814190);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -384786100 for hi! must be in the range [21645,19814190]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5028");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-443415178), (long) 182942901);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-626358079L) + "'", long2 == (-626358079L));
    }

    @Test
    public void test5029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5029");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-671682622), 1568880);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1053789432003360L) + "'", long2 == (-1053789432003360L));
    }

    @Test
    public void test5030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5030");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 1936619533, (long) 808);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1936620341L + "'", long2 == 1936620341L);
    }

    @Test
    public void test5031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5031");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-107785395), (java.lang.Object) (-12309807722311L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5032");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(170566, 288650836);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 170566 * 288650836");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5033");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 14579123, (java.lang.Object) (-115955914862075904L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5034");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(1261657L, (long) (-97134840));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-122550850829880L) + "'", long2 == (-122550850829880L));
    }

    @Test
    public void test5035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5035");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 1660208598, (-1665505400), 92);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1660208598 for  must be in the range [-1665505400,92]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5036");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(0L, 322892503214080L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5037");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-443415178));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-443415178) + "'", int1 == (-443415178));
    }

    @Test
    public void test5038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5038");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(75915844231968480L, (-276494400));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 75915844231968480 * -276494400");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5039");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-482750), (long) 1830400);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-883625600000L) + "'", long2 == (-883625600000L));
    }

    @Test
    public void test5040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5040");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-1588808L), (long) (-282895011));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-284483819L) + "'", long2 == (-284483819L));
    }

    @Test
    public void test5041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5041");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-334369698702L), (long) 14579123);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-334384277825L) + "'", long2 == (-334384277825L));
    }

    @Test
    public void test5042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5042");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-1734960));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1734960 + "'", int1 == 1734960);
    }

    @Test
    public void test5043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5043");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(141059, 654, (-15085912));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5044");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 217955441, 1936619548, 1012);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 217955441 for hi! must be in the range [1936619548,1012]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5045");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(229775129L, (long) 1741);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 229776870L + "'", long2 == 229776870L);
    }

    @Test
    public void test5046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5046");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-2742917));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2742917) + "'", int1 == (-2742917));
    }

    @Test
    public void test5047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5047");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-216870));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-216870) + "'", int1 == (-216870));
    }

    @Test
    public void test5048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5048");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-9377373), (-1820));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9379193) + "'", int2 == (-9379193));
    }

    @Test
    public void test5049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5049");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(0, 182774349);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5050");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 277588800, 282218704, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 277588800 for  must be in the range [282218704,0]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5051");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1936619531), (-15097688));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -1936619531 * -15097688");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5052");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-15198742449633600L), (java.lang.Object) 328191424);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5053");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-382786), 0, 32313684);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5054");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-282876300), 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5055");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(1049356059, 1031830400, 1031377144);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5056");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-6), 16639480, (-986506979), (-9252624));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-960614882) + "'", int4 == (-960614882));
    }

    @Test
    public void test5057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5057");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-669384204), (-182942901), 42);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-120555372) + "'", int3 == (-120555372));
    }

    @Test
    public void test5058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5058");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(112042, (-1716));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 110326 + "'", int2 == 110326);
    }

    @Test
    public void test5059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5059");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-16387), (long) (-2132));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 34937084L + "'", long2 == 34937084L);
    }

    @Test
    public void test5060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5060");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1823096, (-32384), (-24710220), 440128000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1790712 + "'", int4 == 1790712);
    }

    @Test
    public void test5061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5061");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-2742917), (long) 6443080);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -17672833664360");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5062");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(19814190, 46590310, (-4440), (-328358386));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5063");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-39057038), (-299284678L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 11689173041463764");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5064");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-662370800), (-11155500), 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -662370800 for hi! must be in the range [-11155500,0]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5065");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(571732452L, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test5066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5066");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-216870), 0, (-183048400), (-125500));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-216870) + "'", int4 == (-216870));
    }

    @Test
    public void test5067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5067");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(1655, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1654 + "'", int2 == 1654);
    }

    @Test
    public void test5068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5068");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (short) -1, 337896471L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-337896471) + "'", int2 == (-337896471));
    }

    @Test
    public void test5069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5069");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-340473000), (-71587), (-1985144));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5070");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-116550L), (java.lang.Object) 589166673202046L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5071");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(216047235, (-10969), (-11587643), (-7151));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-3993101) + "'", int4 == (-3993101));
    }

    @Test
    public void test5072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5072");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(775262589434827L, 8392413685540500L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 775262589434827 * 8392413685540500");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5073");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 240, 0, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5074");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-272230358291L), (-4755052913744L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -272230358291 * -4755052913744");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5075");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(5335, (-1327011976), (-459821653), 1831);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-407359671) + "'", int4 == (-407359671));
    }

    @Test
    public void test5076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5076");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 371193030, 5822201, 255734915);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5077");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-284483819L), 2164606311L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -615795469984781709");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5078");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1327011840), 108825600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1218186240) + "'", int2 == (-1218186240));
    }

    @Test
    public void test5079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5079");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(697498476, (-450092), (-182942901), (-450092));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-32922856) + "'", int4 == (-32922856));
    }

    @Test
    public void test5080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5080");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-283568350), 92, 612257);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 476674 + "'", int3 == 476674);
    }

    @Test
    public void test5081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5081");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-153754062), (-3423621056803200L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3423621210557262L) + "'", long2 == (-3423621210557262L));
    }

    @Test
    public void test5082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5082");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-289979344), (-18840633));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-308819977) + "'", int2 == (-308819977));
    }

    @Test
    public void test5083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5083");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(244532442, (-2724));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 244529718 + "'", int2 == 244529718);
    }

    @Test
    public void test5084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5084");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-4175952169600L), (-35449756268760000L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -4175952169600 * -35449756268760000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5085");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 773440, 487, 28458464);
    }

    @Test
    public void test5086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5086");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-69901), (-183048400), (-71587), (-240));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-39333) + "'", int4 == (-39333));
    }

    @Test
    public void test5087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5087");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-22110720), 0, 184);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 110 + "'", int3 == 110);
    }

    @Test
    public void test5088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5088");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(1820, 165554, 726);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5089");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(0, (-1938205016));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5090");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-4424364), 1568880, 110326);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -4424364 for  must be in the range [1568880,110326]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5091");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-165194), (java.lang.Object) (-285573450855744L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5092");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-220584), 0, (-1366941395));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5093");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(2610318, 276494400);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 2610318 * 276494400");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5094");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(7431);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-7431) + "'", int1 == (-7431));
    }

    @Test
    public void test5095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5095");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-405876));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 405876 + "'", int1 == 405876);
    }

    @Test
    public void test5096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5096");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-2241633), (-233), 28458464);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5097");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(58240000L, 314317080);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 18305826739200000L + "'", long2 == 18305826739200000L);
    }

    @Test
    public void test5098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5098");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(7009920, (-1327016280), (-41220), 490580);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 455523 + "'", int4 == 455523);
    }

    @Test
    public void test5099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5099");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(288226072);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-288226072) + "'", int1 == (-288226072));
    }

    @Test
    public void test5100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5100");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(173728676408016L, (long) 69923);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 173728676338093L + "'", long2 == 173728676338093L);
    }

    @Test
    public void test5101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5101");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(0, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5102");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-1255), (-2184), (-5601384));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1255 for hi! must be in the range [-2184,-5601384]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5103");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-8867), (long) 1936402650);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-17170082297550L) + "'", long2 == (-17170082297550L));
    }

    @Test
    public void test5104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5104");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1569), 10400);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8831 + "'", int2 == 8831);
    }

    @Test
    public void test5105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5105");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1939364392, (-19814180), 6976661, (-45934336));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5106");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 20889036, (java.lang.Object) (-29149375));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5107");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-34847965L), (-984675009));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 34313920250006685L + "'", long2 == 34313920250006685L);
    }

    @Test
    public void test5108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5108");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-140349L), (long) 571021860);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-80142347029140L) + "'", long2 == (-80142347029140L));
    }

    @Test
    public void test5109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5109");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 897539380, (long) (-46590310));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-41816637951407800L) + "'", long2 == (-41816637951407800L));
    }

    @Test
    public void test5110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5110");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(4986212893744880L, (-64436534L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 4986212893744880 * -64436534");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5111");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(372715995191262800L, (long) (-80122));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 372715995191182678L + "'", long2 == 372715995191182678L);
    }

    @Test
    public void test5112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5112");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-24710), 3553504, 2052);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5113");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(282218704, (-102059), 1825, (-172370));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5114");
        java.lang.Object obj0 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals(obj0, (java.lang.Object) (-2354711268033L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5115");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 52, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test5116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5116");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(42771, 163101298, 32384);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5117");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(0, 288650933, (-448503));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5118");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 0, 54945330, 32313684);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for hi! must be in the range [54945330,32313684]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5119");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1031830080), (-698890), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5120");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 520, (-39844), 7431);
    }

    @Test
    public void test5121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5121");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1701), 0, 39571312, 365387);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5122");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1447, (-572120460), (-1218186240));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5123");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1459701, 130048209, 2611241, 84716459);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 49402691 + "'", int4 == 49402691);
    }

    @Test
    public void test5124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5124");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, (-163128730));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test5125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5125");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(544880L, (-140819L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-76729456720L) + "'", long2 == (-76729456720L));
    }

    @Test
    public void test5126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5126");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(1658);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1658) + "'", int1 == (-1658));
    }

    @Test
    public void test5127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5127");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(12681);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-12681) + "'", int1 == (-12681));
    }

    @Test
    public void test5128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5128");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 2195019074167192L, (java.lang.Object) 59821825463190L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5129");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-1407261));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1407261 + "'", int1 == 1407261);
    }

    @Test
    public void test5130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5130");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(5823802, 38756);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5862558 + "'", int2 == 5862558);
    }

    @Test
    public void test5131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5131");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-553170638108079L), (-76066913));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -553170638108079 * -76066913");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5132");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (int) (byte) 100, 40, (-2132));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5133");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-4440), (long) (-360557));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 356117L + "'", long2 == 356117L);
    }

    @Test
    public void test5134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5134");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 549120, 255, (-21645));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 549120 for  must be in the range [255,-21645]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5135");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 190921500, (-140819L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 191062319L + "'", long2 == 191062319L);
    }

    @Test
    public void test5136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5136");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-10587), (long) (-1459701));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 15453854487L + "'", long2 == 15453854487L);
    }

    @Test
    public void test5137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5137");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1029643803), (-698890), 328191465);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5138");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(111143, (-18315));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2035584045) + "'", int2 == (-2035584045));
    }

    @Test
    public void test5139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5139");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 8480, 2052, (-114631));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5140");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-4145555), (-1168498456));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1172644011) + "'", int2 == (-1172644011));
    }

    @Test
    public void test5141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5141");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 193499963, (long) 1936980077);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1743480114L) + "'", long2 == (-1743480114L));
    }

    @Test
    public void test5142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5142");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-101990), (-86668494), 0);
    }

    @Test
    public void test5143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5143");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 142422, (java.lang.Object) 400194589);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5144");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-5324800), (-163101298), (-23380));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-5324800) + "'", int3 == (-5324800));
    }

    @Test
    public void test5145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5145");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-722), 277584678);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-200416137516L) + "'", long2 == (-200416137516L));
    }

    @Test
    public void test5146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5146");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 283395980, (-32));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-9068671360L) + "'", long2 == (-9068671360L));
    }

    @Test
    public void test5147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5147");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1665), (-384129220), (-2612385));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5148");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-2020523054400L), (-415603448L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2020938657848L) + "'", long2 == (-2020938657848L));
    }

    @Test
    public void test5149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5149");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 54666, 0, (-808));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54666 for hi! must be in the range [0,-808]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5150");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 193499963, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 193499963L + "'", long2 == 193499963L);
    }

    @Test
    public void test5151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5151");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(5996204, (-400193578));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-394197374) + "'", int2 == (-394197374));
    }

    @Test
    public void test5152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5152");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 155391);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 155391 + "'", int1 == 155391);
    }

    @Test
    public void test5153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5153");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 202903478, (long) 6976661);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 1415588781726958");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5154");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(729759491251271L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 729759491251271");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5155");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-387), (-9377373), (-45934336));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5156");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(179600L, (long) (-384786135));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-69107589846000L) + "'", long2 == (-69107589846000L));
    }

    @Test
    public void test5157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5157");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1459701), 186160);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1273541) + "'", int2 == (-1273541));
    }

    @Test
    public void test5158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5158");
        java.lang.Object obj0 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals(obj0, (java.lang.Object) 1827581L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5159");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 340473000, 192925);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 65685753525000L + "'", long2 == 65685753525000L);
    }

    @Test
    public void test5160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5160");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-5822319L), (-3590342L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2231977L) + "'", long2 == (-2231977L));
    }

    @Test
    public void test5161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5161");
        org.joda.time.field.FieldUtils.verifyValueBounds("", (-15623), (-46592000), (-6916));
    }

    @Test
    public void test5162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5162");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1204293925), (-120555372), 20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-119295388) + "'", int3 == (-119295388));
    }

    @Test
    public void test5163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5163");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(690513347, 276494400, 56939, 288650836);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101226053 + "'", int4 == 101226053);
    }

    @Test
    public void test5164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5164");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-139517), (-662370800), (-23380));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-139517) + "'", int3 == (-139517));
    }

    @Test
    public void test5165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5165");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 183048400, (-549120), 49402691);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 183048400 for  must be in the range [-549120,49402691]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5166");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(190407252, 363940);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 190407252 * 363940");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5167");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-54300), 1588768, (-510392354));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5168");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(502079585392100L, 1936619520L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 502079585392100 * 1936619520");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5169");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1218186240), (-328190018), 69923);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5170");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(2132, 17360085, (-288076105), (-1031377144));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5171");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 42, (long) (-549215));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-549173L) + "'", long2 == (-549173L));
    }

    @Test
    public void test5172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5172");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(182492901280657L, (long) 28313641);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 182492929594298L + "'", long2 == 182492929594298L);
    }

    @Test
    public void test5173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5173");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 2001232915, (-24710220L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -49450905600891300");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5174");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(1546990, (-46593806));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-45046816) + "'", int2 == (-45046816));
    }

    @Test
    public void test5175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5175");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 163128730, 2365, 46591948);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5176");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-32152), (-111178), (-2575260));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -32152 for  must be in the range [-111178,-2575260]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5177");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-4145555), (-2133331200000L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2133327054445L + "'", long2 == 2133327054445L);
    }

    @Test
    public void test5178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5178");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(1049377704L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1049377704 + "'", int1 == 1049377704);
    }

    @Test
    public void test5179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5179");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(172370, 642465720);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 642638090 + "'", int2 == 642638090);
    }

    @Test
    public void test5180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5180");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-329472), (-114533510), (-2742917));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5181");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-73647), 328191465, (-587742164));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -73647 for hi! must be in the range [328191465,-587742164]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5182");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1936676459, (-70), (-223641402));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5183");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(1931698650L, (long) 1031830079);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1993184770633693350L + "'", long2 == 1993184770633693350L);
    }

    @Test
    public void test5184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5184");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-1701), (long) (-140906));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 139205L + "'", long2 == 139205L);
    }

    @Test
    public void test5185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5185");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(5212268840011310L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 5212268840011310");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5186");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 363673528L, (java.lang.Object) 101);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5187");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, 323019034);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test5188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5188");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(81716);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-81716) + "'", int1 == (-81716));
    }

    @Test
    public void test5189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5189");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-21578), (-340473000));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-340494578) + "'", int2 == (-340494578));
    }

    @Test
    public void test5190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5190");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 2610333, (-1904000));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4970074032000L) + "'", long2 == (-4970074032000L));
    }

    @Test
    public void test5191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5191");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(255734915, (-9252624), 4784000);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3075665 + "'", int3 == 3075665);
    }

    @Test
    public void test5192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5192");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 570849583);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 570849583 + "'", int1 == 570849583);
    }

    @Test
    public void test5193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5193");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-5819836));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-5819836) + "'", int1 == (-5819836));
    }

    @Test
    public void test5194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5194");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-1031377144), 3205199539645L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -1031377144 * 3205199539645");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5195");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1936619531), (-23380));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -1936619531 * -23380");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5196");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-18577816607922L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -18577816607922");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5197");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 242559100, (-1653), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5198");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-872L), (java.lang.Object) (-165796));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5199");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(1936402650, (-455725));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1935946925 + "'", int2 == 1935946925);
    }

    @Test
    public void test5200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5200");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(4763852, (-255717), 1437);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-122093) + "'", int3 == (-122093));
    }

    @Test
    public void test5201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5201");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-654), 278071860, (-328188373));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -654 for hi! must be in the range [278071860,-328188373]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5202");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-4424364), 0, 194);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -4424364 for hi! must be in the range [0,194]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5203");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1997951875, 808, (-340473042));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5204");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 1189319931, 1984541039, (-1569));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1189319931 for  must be in the range [1984541039,-1569]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5205");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1225958), (-103628), 184);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-84015) + "'", int3 == (-84015));
    }

    @Test
    public void test5206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5206");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(3433626, 382873);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 3433626 * 382873");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5207");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(0L, 502656L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 502656L + "'", long2 == 502656L);
    }

    @Test
    public void test5208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5208");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(283395980, 680);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 283395980 * 680");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5209");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-490580), (-52440), (-774641));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5210");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(166300, 198429, (-3553504), 288129358);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 364729 + "'", int4 == 364729);
    }

    @Test
    public void test5211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5211");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 318773032, (-1407261), (-1906981791));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5212");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 5996204, 19673131);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 117964106794724L + "'", long2 == 117964106794724L);
    }

    @Test
    public void test5213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5213");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-669384204), (-125323224));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -669384204 * -125323224");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5214");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-571021860), (-1031830080), (-19));
    }

    @Test
    public void test5215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5215");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-31904331662700L), 276494601L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -31904331662700 * 276494601");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5216");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-561), 1936616248, (-5669852));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5217");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(0, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5218");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-2084L), (long) 476674);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-478758L) + "'", long2 == (-478758L));
    }

    @Test
    public void test5219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5219");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-2361380), (-572120460));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-574481840) + "'", int2 == (-574481840));
    }

    @Test
    public void test5220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5220");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(112100, 23, 0, 42);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 22 + "'", int4 == 22);
    }

    @Test
    public void test5221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5221");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-672043680), 1255, (-490580), 1933898171);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1262346327 + "'", int4 == 1262346327);
    }

    @Test
    public void test5222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5222");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-576345213), (-87200), (-120555372));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5223");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(1568880, (-184775552));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-183206672) + "'", int2 == (-183206672));
    }

    @Test
    public void test5224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5224");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-46590740L), (long) 2610333);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-49201073L) + "'", long2 == (-49201073L));
    }

    @Test
    public void test5225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5225");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(7187284L, (-382744));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2750889827296L) + "'", long2 == (-2750889827296L));
    }

    @Test
    public void test5226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5226");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 297095885, (-274008784), (-340482756));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5227");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(5862558, (-18840633));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-12978075) + "'", int2 == (-12978075));
    }

    @Test
    public void test5228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5228");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-19814191), (-2742917));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -19814191 * -2742917");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5229");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-272136));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 272136 + "'", int1 == 272136);
    }

    @Test
    public void test5230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5230");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-2576517), (long) (-16640000));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 14063483L + "'", long2 == 14063483L);
    }

    @Test
    public void test5231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5231");
        java.lang.Object obj0 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals(obj0, (java.lang.Object) (-291987985096L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5232");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-5683818), 1936616248, (-15564));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5233");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(998548417L, (-207039325569227058L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-207039324570678641L) + "'", long2 == (-207039324570678641L));
    }

    @Test
    public void test5234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5234");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 642638090, 4244939340015614675L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4244939340658252765L + "'", long2 == 4244939340658252765L);
    }

    @Test
    public void test5235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5235");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-24710), 340473000, 283395980);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5236");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-18315), 20889036);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-382582694340L) + "'", long2 == (-382582694340L));
    }

    @Test
    public void test5237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5237");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-167049), 328191019L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 328023970L + "'", long2 == 328023970L);
    }

    @Test
    public void test5238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5238");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 376, (java.lang.Object) 322892503214080L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5239");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-158184048), 466944L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -73863092109312");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5240");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 1476100290, (-5683818), 612257);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1476100290 for  must be in the range [-5683818,612257]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5241");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(6815443, (-10), 288342622, 1459701);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5242");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(16365018L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 16365018 + "'", int1 == 16365018);
    }

    @Test
    public void test5243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5243");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-114533510), 363686, 0, (-18842291));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5244");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-127824), (-2600000));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 332342400000L + "'", long2 == 332342400000L);
    }

    @Test
    public void test5245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5245");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-394197374), (-1087985071403775L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -394197374 * -1087985071403775");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5246");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-46591216), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-46591216L) + "'", long2 == (-46591216L));
    }

    @Test
    public void test5247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5247");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1907097291), 81716);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -1907097291 * 81716");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5248");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-7008379L), (-112042));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 785232799918L + "'", long2 == 785232799918L);
    }

    @Test
    public void test5249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5249");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(328408465L, (-324179110L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-106463163900166150L) + "'", long2 == (-106463163900166150L));
    }

    @Test
    public void test5250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5250");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-1155), 4244939340015601994L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -1155 * 4244939340015601994");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5251");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-84056109), (-5823902), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-2521467) + "'", int3 == (-2521467));
    }

    @Test
    public void test5252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5252");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-986506979), (-2612385));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2577136034334915L + "'", long2 == 2577136034334915L);
    }

    @Test
    public void test5253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5253");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(1827581L, (-18869738940L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-18867911359L) + "'", long2 == (-18867911359L));
    }

    @Test
    public void test5254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5254");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-259967), 24849000);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -259967 * 24849000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5255");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 1405074);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1405074 + "'", int1 == 1405074);
    }

    @Test
    public void test5256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5256");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(906915715);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-906915715) + "'", int1 == (-906915715));
    }

    @Test
    public void test5257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5257");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-69888));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-69888) + "'", int1 == (-69888));
    }

    @Test
    public void test5258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5258");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-40889420L), (java.lang.Object) 58782L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5259");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-4267L), 2153907510L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2153903243L + "'", long2 == 2153903243L);
    }

    @Test
    public void test5260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5260");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(277971586);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-277971586) + "'", int1 == (-277971586));
    }

    @Test
    public void test5261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5261");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(193499963, (-722));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 193499963 * -722");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5262");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-158996270L), (-872L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-158997142L) + "'", long2 == (-158997142L));
    }

    @Test
    public void test5263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5263");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-14931282), 229775129);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 214843847 + "'", int2 == 214843847);
    }

    @Test
    public void test5264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5264");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-2575266), 0, (-151553092));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5265");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-5688740), 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5266");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, 329472);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test5267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5267");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1956216738), (-1459701), 6, (-288142039));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5268");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-5601384));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-5601384) + "'", int1 == (-5601384));
    }

    @Test
    public void test5269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5269");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-13516776), (-5823869));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-19340645) + "'", int2 == (-19340645));
    }

    @Test
    public void test5270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5270");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1949367738), (-84056109));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2033423847) + "'", int2 == (-2033423847));
    }

    @Test
    public void test5271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5271");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-164284L), 5381396095680L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5381395931396L + "'", long2 == 5381395931396L);
    }

    @Test
    public void test5272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5272");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-682010955L), 2920995748335L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2921677759290L) + "'", long2 == (-2921677759290L));
    }

    @Test
    public void test5273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5273");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 2001233291);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2001233291 + "'", int1 == 2001233291);
    }

    @Test
    public void test5274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5274");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 5862558, (-125500));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-735751029000L) + "'", long2 == (-735751029000L));
    }

    @Test
    public void test5275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5275");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 276907815, (java.lang.Object) 2612385);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5276");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-2742917), 3037);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -2742917 * 3037");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5277");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(0, 1588808, (-51597720));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5278");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-23380), (-170566), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-23380) + "'", int3 == (-23380));
    }

    @Test
    public void test5279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5279");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-33L), 384786153L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -12697943049");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5280");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-1688));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1688 + "'", int1 == 1688);
    }

    @Test
    public void test5281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5281");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-1191590400000000L), 158513520);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -1191590400000000 * 158513520");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5282");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 321540, (-139846), 198400);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5283");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 2296320L, (java.lang.Object) (-376));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5284");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-11647300), (long) (-1408273));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-10239027L) + "'", long2 == (-10239027L));
    }

    @Test
    public void test5285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5285");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-275758400L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-275758400) + "'", int1 == (-275758400));
    }

    @Test
    public void test5286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5286");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 112035);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 112035 + "'", int1 == 112035);
    }

    @Test
    public void test5287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5287");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 0, (-302837704), (-19814190));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for  must be in the range [-302837704,-19814190]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5288");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1134915920, 0, 255746531);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5289");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 28479086, (-5822201));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-165810962988286L) + "'", long2 == (-165810962988286L));
    }

    @Test
    public void test5290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5290");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(21296648848000L, (-16435L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -350010423816880000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5291");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 141344, (-19));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2685536L) + "'", long2 == (-2685536L));
    }

    @Test
    public void test5292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5292");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(20, 237640621, (-698890), 172370);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-213612) + "'", int4 == (-213612));
    }

    @Test
    public void test5293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5293");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-1608), 59984899799437295L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -1608 * 59984899799437295");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5294");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-448503), 108825600, (-1658));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5295");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-284483819L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-284483819) + "'", int1 == (-284483819));
    }

    @Test
    public void test5296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5296");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-116550), (-240636100), 22, 1659081147);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1418328476 + "'", int4 == 1418328476);
    }

    @Test
    public void test5297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5297");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-141344), 306894, 290119224, 16397170);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5298");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-487L), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-487L) + "'", long2 == (-487L));
    }

    @Test
    public void test5299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5299");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(165554, (-97134840));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 165554 * -97134840");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5300");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-288078336), 405876, (-1081264));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -288078336 for  must be in the range [405876,-1081264]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5301");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-352165));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 352165 + "'", int1 == 352165);
    }

    @Test
    public void test5302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5302");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 0, (-1688), (-2413217));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for  must be in the range [-1688,-2413217]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5303");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 277584678, (-574481840), 297095885);
    }

    @Test
    public void test5304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5304");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 642465720, (java.lang.Object) (-10955744902694363L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5305");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-12681), (long) 112000);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 99319L + "'", long2 == 99319L);
    }

    @Test
    public void test5306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5306");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-2355724800L), 876405117732L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-878760842532L) + "'", long2 == (-878760842532L));
    }

    @Test
    public void test5307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5307");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1407261), 1250658487);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -1407261 * 1250658487");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5308");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-17), (-288076105));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -17 * -288076105");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5309");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(1921725259090L, (long) (-5691497));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 1921725259090 * -5691497");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5310");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 906847389, 24735138, (-29149375));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5311");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-405), 681704, (-54912000));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -405 for  must be in the range [681704,-54912000]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5312");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(4781948, (-52));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-248661296) + "'", int2 == (-248661296));
    }

    @Test
    public void test5313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5313");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-17505097288390L), (long) 1943795520);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -17505097288390 * 1943795520");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5314");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-207039324570678641L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -207039324570678641");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5315");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 329472, 34774165L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35103637L + "'", long2 == 35103637L);
    }

    @Test
    public void test5316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5316");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 1655891183, (-15564), 126763);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1655891183 for hi! must be in the range [-15564,126763]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5317");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(229775129, 998548417, 654);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5318");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 29906275, (java.lang.Object) 880966860800L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5319");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 808, 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5320");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-1021354944L), (long) (-32));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 32683358208");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5321");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-62092833L), 149);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-9251832117L) + "'", long2 == (-9251832117L));
    }

    @Test
    public void test5322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5322");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-29149375), (-682184990));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -29149375 * -682184990");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5323");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-654), (-1936980077));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1936980731) + "'", int2 == (-1936980731));
    }

    @Test
    public void test5324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5324");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-46592042), 1820L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-46593862L) + "'", long2 == (-46593862L));
    }

    @Test
    public void test5325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5325");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(2031482136792L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2031482136792L + "'", long2 == 2031482136792L);
    }

    @Test
    public void test5326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5326");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-823246617984L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -823246617984");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5327");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-351953862), (java.lang.Object) 58531533900L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5328");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-114631), 89317, 5822201);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5329");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 6815443, (-487));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3319120741L) + "'", long2 == (-3319120741L));
    }

    @Test
    public void test5330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5330");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 1459701, 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test5331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5331");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(42395057614700L, 1087985645081310L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1045590587466610L) + "'", long2 == (-1045590587466610L));
    }

    @Test
    public void test5332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5332");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-57855L), (long) (-41220));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-99075L) + "'", long2 == (-99075L));
    }

    @Test
    public void test5333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5333");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1821), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5334");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(166500L, (-51597720));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-8591020380000L) + "'", long2 == (-8591020380000L));
    }

    @Test
    public void test5335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5335");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(374783424);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-374783424) + "'", int1 == (-374783424));
    }

    @Test
    public void test5336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5336");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, (-1665505400));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test5337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5337");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-1098906600L), (long) (-109928));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1098796672L) + "'", long2 == (-1098796672L));
    }

    @Test
    public void test5338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5338");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 2979, 98001994620L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 291947941972980L + "'", long2 == 291947941972980L);
    }

    @Test
    public void test5339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5339");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 158184048, 16254, 440122800);
    }

    @Test
    public void test5340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5340");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-17321541120000L), (long) (-139517));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-17321541259517L) + "'", long2 == (-17321541259517L));
    }

    @Test
    public void test5341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5341");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-19648395), (long) 364729);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-20013124L) + "'", long2 == (-20013124L));
    }

    @Test
    public void test5342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5342");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(733);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-733) + "'", int1 == (-733));
    }

    @Test
    public void test5343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5343");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1734960), (-773440));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -1734960 * -773440");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5344");
        java.lang.Object obj0 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals(obj0, (java.lang.Object) 11148807196800L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5345");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(0, 15623);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5346");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 244529718, (-420), 459821653);
    }

    @Test
    public void test5347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5347");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-549638447), 16365018, (-12306456));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5348");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(3295692330492609L, (long) 51343322);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 3295692330492609 * 51343322");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5349");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(0L, (-600430L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-600430L) + "'", long2 == (-600430L));
    }

    @Test
    public void test5350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5350");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(405876, 5200, (-12306456), (-15623));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-11879758) + "'", int4 == (-11879758));
    }

    @Test
    public void test5351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5351");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(166311, (-152647769));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 166311 * -152647769");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5352");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(216047235, 166311, (-111143), 17);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-105760) + "'", int4 == (-105760));
    }

    @Test
    public void test5353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5353");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-255717), (-18842291), 364729);
    }

    @Test
    public void test5354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5354");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(4763852, 1189319931);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1194083783 + "'", int2 == 1194083783);
    }

    @Test
    public void test5355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5355");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 20889036);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 20889036 + "'", int1 == 20889036);
    }

    @Test
    public void test5356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5356");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 340473042, (-371015300L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-30542258L) + "'", long2 == (-30542258L));
    }

    @Test
    public void test5357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5357");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-46592000), (-167049));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-46759049) + "'", int2 == (-46759049));
    }

    @Test
    public void test5358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5358");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-73467698669282628L), (java.lang.Object) 100L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5359");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(1247383545L, (-1879044484));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2343889169664615780L) + "'", long2 == (-2343889169664615780L));
    }

    @Test
    public void test5360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5360");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-9724), 179252736, 277588800);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -9724 for  must be in the range [179252736,277588800]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5361");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 182672284, 0, 140906);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 182672284 for  must be in the range [0,140906]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5362");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-15097688), (-960614882));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -15097688 * -960614882");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5363");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-662368976), (long) 385);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-662368591L) + "'", long2 == (-662368591L));
    }

    @Test
    public void test5364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5364");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-217000), (int) (short) 100, 282221644);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5365");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(0, (-119295388));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5366");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 0, 193499963, (-69923));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5367");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 163128730, (long) 1766785);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 161361945L + "'", long2 == 161361945L);
    }

    @Test
    public void test5368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5368");
        org.joda.time.field.FieldUtils.verifyValueBounds("", (-34848000), (-1327016280), 108825600);
    }

    @Test
    public void test5369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5369");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-18084422856192000L), (long) 376);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-18084422856191624L) + "'", long2 == (-18084422856191624L));
    }

    @Test
    public void test5370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5370");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 329848, (-5822300), (-39057038));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 329848 for  must be in the range [-5822300,-39057038]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5371");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-13516776));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 13516776 + "'", int1 == 13516776);
    }

    @Test
    public void test5372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5372");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-439504642500L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -439504642500");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5373");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(282876300, (-5823802), 1250658487);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 282876300 + "'", int3 == 282876300);
    }

    @Test
    public void test5374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5374");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-7010204), (-166080), (-14579123));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5375");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(361058, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5376");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-6340541120L), (java.lang.Object) (-714277L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5377");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(15623, 1262346327, (-29906275), (-5822300));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-14088778) + "'", int4 == (-14088778));
    }

    @Test
    public void test5378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5378");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-91195796727946800L), (long) 28479086);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -91195796727946800 * 28479086");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5379");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(4244939340015601994L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4244939340015601994L + "'", long2 == 4244939340015601994L);
    }

    @Test
    public void test5380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5380");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 33280040, 322366149);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10728358333365960L + "'", long2 == 10728358333365960L);
    }

    @Test
    public void test5381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5381");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-80071030668500L), (long) 1659032);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -80071030668500 * 1659032");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5382");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(246533802, 1741, 283395980);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 246533802 + "'", int3 == 246533802);
    }

    @Test
    public void test5383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5383");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(364408L, (-21578));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-7863195824L) + "'", long2 == (-7863195824L));
    }

    @Test
    public void test5384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5384");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-5819794), 0, 4763852);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5385");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 20, (long) 1407261);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1407281L + "'", long2 == 1407281L);
    }

    @Test
    public void test5386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5386");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(1935946925);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1935946925) + "'", int1 == (-1935946925));
    }

    @Test
    public void test5387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5387");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-374783424), 9724);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -374783424 * 9724");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5388");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-5823802L), (-1953689291));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 11377899600304382L + "'", long2 == 11377899600304382L);
    }

    @Test
    public void test5389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5389");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(0L, (long) (-16171805));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5390");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-233), (java.lang.Object) (-272136));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5391");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-276494400), 54945330, (-7431));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -276494400 for  must be in the range [54945330,-7431]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5392");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-19814190), (-92));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1822905480 + "'", int2 == 1822905480);
    }

    @Test
    public void test5393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5393");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-18923432), (java.lang.Object) (-396462067650000L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5394");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1598145362), 20889036, 46593806, 2611241);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5395");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-46590310), (-61090087500L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2846206114552125000L + "'", long2 == 2846206114552125000L);
    }

    @Test
    public void test5396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5396");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-340482756), 328193261L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-668676017L) + "'", long2 == (-668676017L));
    }

    @Test
    public void test5397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5397");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-402494413728L), (java.lang.Object) (-100));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5398");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(190921500);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-190921500) + "'", int1 == (-190921500));
    }

    @Test
    public void test5399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5399");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-1003875531), 322366149, (-11647300));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1003875531 for  must be in the range [322366149,-11647300]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5400");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-4755348), 35450217234598720L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -4755348 * 35450217234598720");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5401");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 1936676459, (long) (-11155490));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-21604574871609910L) + "'", long2 == (-21604574871609910L));
    }

    @Test
    public void test5402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5402");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-8867), 126556, 59200440);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5403");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-39500081), (long) (-255717));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-39244364L) + "'", long2 == (-39244364L));
    }

    @Test
    public void test5404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5404");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1327016280), 0, (-5601384));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5405");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 322366149, 5996204, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5406");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-223239), 28458464, 29906275, (-274));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5407");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(1828967L, (-139697L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-255501202999L) + "'", long2 == (-255501202999L));
    }

    @Test
    public void test5408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5408");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(0, 1327011976);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5409");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1273541), 166300, 1943795520);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5410");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 46593806, (-669384204), 388073);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5411");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-4702096703909577600L), (long) 1659032);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -4702096703909577600 * 1659032");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5412");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 10, 0, (-161123810));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5413");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(285287521L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 285287521 + "'", int1 == 285287521);
    }

    @Test
    public void test5414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5414");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 3395, 217955441, (-5669852));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 3395 for  must be in the range [217955441,-5669852]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5415");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(2037417104L, 6916);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 14090776691264L + "'", long2 == 14090776691264L);
    }

    @Test
    public void test5416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5416");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(651622016L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test5417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5417");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 192925, (-654), (-1287002560));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5418");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1984541039, 1262346327, 110);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5419");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 2576517, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2576517L + "'", long2 == 2576517L);
    }

    @Test
    public void test5420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5420");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(11646070);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-11646070) + "'", int1 == (-11646070));
    }

    @Test
    public void test5421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5421");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1081264), 612354);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -1081264 * 612354");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5422");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-2049076), (java.lang.Object) 502079585225328L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5423");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-363686), (java.lang.Object) (-6340541120L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5424");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-2324031), 17360085, (-490580));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5425");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-15252312), 1997951875, 46591216);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5426");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 897523126, (-1056), (-32152));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5427");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-140349), 2231, 130048209);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5428");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-54912000), (-183206672), 0);
    }

    @Test
    public void test5429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5429");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 39271960, 95741014987926L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 95741054259886L + "'", long2 == 95741054259886L);
    }

    @Test
    public void test5430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5430");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 658347520, (java.lang.Object) (-193499963));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5431");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(19774200L, 27432);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 542445854400L + "'", long2 == 542445854400L);
    }

    @Test
    public void test5432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5432");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-5324202), 1822905480, 998476966);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5433");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-12978075), (-15623), 0, (-52440));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5434");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-662368591L), 6028880L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3993340750908080L) + "'", long2 == (-3993340750908080L));
    }

    @Test
    public void test5435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5435");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 54666, (-1569), 6815443);
    }

    @Test
    public void test5436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5436");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-2192850), (-14931288), (-352165));
    }

    @Test
    public void test5437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5437");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(1936735264L, (long) (-232));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -449322581248");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5438");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-2742917));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2742917 + "'", int1 == 2742917);
    }

    @Test
    public void test5439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5439");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-202903478), 1784450954, 13516776);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -202903478 for  must be in the range [1784450954,13516776]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5440");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-394197374), (java.lang.Object) (-18288012L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5441");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 42771, 365354L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-322583L) + "'", long2 == (-322583L));
    }

    @Test
    public void test5442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5442");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(86528000000L, (long) (-111142));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -9616894976000000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5443");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 166400, 698582630, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5444");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(250773868800L, (long) (-152647769));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 250926516569L + "'", long2 == 250926516569L);
    }

    @Test
    public void test5445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5445");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-374195L), 1663041516782L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1663041142587L + "'", long2 == 1663041142587L);
    }

    @Test
    public void test5446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5446");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-10L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-10) + "'", int1 == (-10));
    }

    @Test
    public void test5447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5447");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(0, 202680927, (-363686));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5448");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, 5074982898187613L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test5449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5449");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-655200));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 655200 + "'", int1 == 655200);
    }

    @Test
    public void test5450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5450");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-299284678L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-299284678) + "'", int1 == (-299284678));
    }

    @Test
    public void test5451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5451");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(617886297600L, 549120);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 339293723738112000L + "'", long2 == 339293723738112000L);
    }

    @Test
    public void test5452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5452");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-100253697660L), 678776518202937600L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -100253697660 * 678776518202937600");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5453");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-21700L), (long) 1372800);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1351100L + "'", long2 == 1351100L);
    }

    @Test
    public void test5454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5454");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 544072);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 544072 + "'", int1 == 544072);
    }

    @Test
    public void test5455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5455");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 774641, 0, (-363940));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 774641 for  must be in the range [0,-363940]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5456");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 0, (-18618910), (-1941959631));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5457");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 0, 81882, 237640621);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for hi! must be in the range [81882,237640621]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5458");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-220584), 166720, (-101990));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -220584 for hi! must be in the range [166720,-101990]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5459");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-24849000), 328188373);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 303339373 + "'", int2 == 303339373);
    }

    @Test
    public void test5460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5460");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 2979, (-70), (-5823902));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2979 for  must be in the range [-70,-5823902]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5461");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 338879346, (-566300680), 1659032);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5462");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(164472L, (-183048400));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-30106336444800L) + "'", long2 == (-30106336444800L));
    }

    @Test
    public void test5463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5463");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-126556), 142422, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5464");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 520);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 520 + "'", int1 == 520);
    }

    @Test
    public void test5465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5465");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 111178, (-18618910), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5466");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-1204293925));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1204293925 + "'", int1 == 1204293925);
    }

    @Test
    public void test5467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5467");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1031830079), 321540, (-18521676));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5468");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(214843847, 2608990);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 214843847 * 2608990");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5469");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-602897384), 110);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-602897274) + "'", int2 == (-602897274));
    }

    @Test
    public void test5470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5470");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 1823096, (long) (-29906275));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-54522010327400L) + "'", long2 == (-54522010327400L));
    }

    @Test
    public void test5471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5471");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(1941403548L, 95712323190L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 1941403548 * 95712323190");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5472");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-27902164), (-80122), (-308819977));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5473");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 400193578, (-334369698702L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 400193578 * -334369698702");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5474");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(244529718, (-1372800));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 244529718 * -1372800");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5475");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-49878L), (long) 28313641);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -1412227785798");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5476");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(0, 1943795520, 184);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5477");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 27432, (java.lang.Object) 167190380L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5478");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 396L, (java.lang.Object) (-2184L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5479");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-2593660433175L), (-2020938657848L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4614599091023L) + "'", long2 == (-4614599091023L));
    }

    @Test
    public void test5480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5480");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-166731L), 1041496L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 874765L + "'", long2 == 874765L);
    }

    @Test
    public void test5481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5481");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-45580515), 11705906050130L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -45580515 * 11705906050130");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5482");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-272230358400L), 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test5483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5483");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-19814191), (-1143), 19673131);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5484");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(288650933, (-1134915920));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-846264987) + "'", int2 == (-846264987));
    }

    @Test
    public void test5485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5485");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(97, (-443415178));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-443415081) + "'", int2 == (-443415081));
    }

    @Test
    public void test5486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5486");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-733), (-1671329302L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1671328569L + "'", long2 == 1671328569L);
    }

    @Test
    public void test5487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5487");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(11705905370880L, 73984);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 866049702959185920L + "'", long2 == 866049702959185920L);
    }

    @Test
    public void test5488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5488");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(2742917, 1820);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 2742917 * 1820");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5489");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-2575260));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2575260 + "'", int1 == 2575260);
    }

    @Test
    public void test5490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5490");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-382786));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-382786) + "'", int1 == (-382786));
    }

    @Test
    public void test5491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5491");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-6191L), (-35L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-6156L) + "'", long2 == (-6156L));
    }

    @Test
    public void test5492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5492");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-111043), (-166720));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-277763) + "'", int2 == (-277763));
    }

    @Test
    public void test5493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5493");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(698584450, (-73100), 365387, (-4424364));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5494");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-146794895), 589166512875592L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-589166659670487L) + "'", long2 == (-589166659670487L));
    }

    @Test
    public void test5495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5495");
        java.lang.Object obj0 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals(obj0, (java.lang.Object) 1701);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5496");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-276494400));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-276494400) + "'", int1 == (-276494400));
    }

    @Test
    public void test5497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5497");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(1409060L, (long) (-394197374));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 395606434L + "'", long2 == 395606434L);
    }

    @Test
    public void test5498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5498");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(38756, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-38756) + "'", int2 == (-38756));
    }

    @Test
    public void test5499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5499");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-10), 0, (-328191146));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5500");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 32313684, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

