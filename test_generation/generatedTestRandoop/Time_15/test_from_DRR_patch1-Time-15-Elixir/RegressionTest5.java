import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

    public static boolean debug = false;

    @Test
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-773760), 163128730, (-4205));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -773760 for  must be in the range [163128730,-4205]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-46590310), (-277588800L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-324179110L) + "'", long2 == (-324179110L));
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-34848000), 198, 1659032);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-126556), (-21578), (-13728));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -126556 for hi! must be in the range [-21578,-13728]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-35), 89317, (-217000));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-52440), (-1906981790), (-12));
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1941944331), 1664, (-60446));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-476), (long) (-11647300));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 5544114800");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 141344, 139679, 198429);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-5823902), (-5688740));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -5823902 * -5688740");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (byte) 100, (-10955744902694363L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1095574490269436300L) + "'", long2 == (-1095574490269436300L));
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-285L), (-69923));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 19928055L + "'", long2 == 19928055L);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-405));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-405) + "'", int1 == (-405));
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-166400), (-2576517));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2742917) + "'", int2 == (-2742917));
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-1372800));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1372800 + "'", int1 == 1372800);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 283395980, (-10955745243177119L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 283395980 * -10955745243177119");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(51354937, (-158513520), (-23247));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-107135337) + "'", int3 == (-107135337));
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-177051092L), 27432);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4856865555744L) + "'", long2 == (-4856865555744L));
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-2184), (-138217), 115500);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(183048400, 374783424, (-11646070), (-73415));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-9228320) + "'", int4 == (-9228320));
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-3030955200000L), (long) (-572120460));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -3030955200000 * -572120460");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-1665532800));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1665532800 + "'", int1 == 1665532800);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(340473000, 139679);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 340473000 * 139679");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-476), (int) 'a', 7431);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -476 for hi! must be in the range [97,7431]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-5688740), (-46590310), (-15252312));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -5688740 for hi! must be in the range [-46590310,-15252312]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-45767616L), 3483129L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -159414510550464");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 204784, (-2860465143759724L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2860465143964508L + "'", long2 == 2860465143964508L);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-2724), (-2724), (-7176000));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -2724 for hi! must be in the range [-2724,-7176000]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-288078336), 2231);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-288076105) + "'", int2 == (-288076105));
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((int) (byte) 1, 1828967, 54912000, 92);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(61908L, (-1936611698));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-119891756999784L) + "'", long2 == (-119891756999784L));
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-4205), (-5688740), 9724);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 146920931, (long) (-774641));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -113810976910771");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-42), 112000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-112042L) + "'", long2 == (-112042L));
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(1665532800, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1665532832 + "'", int2 == 1665532832);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-45934336), 1701);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-45932635) + "'", int2 == (-45932635));
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1386), 102059, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-112042L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-112042) + "'", int1 == (-112042));
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-100), (long) (-572008425));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-572008525L) + "'", long2 == (-572008525L));
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-374783424), 10955745243177086L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10955744868393662L + "'", long2 == 10955744868393662L);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-11646070), (-102059));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1188586258130L + "'", long2 == 1188586258130L);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 1936619548, (long) 4784000);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1941403548L + "'", long2 == 1941403548L);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-571021860), (-480834), (-669384204));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -571021860 for  must be in the range [-480834,-669384204]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 27432, (long) (-5823869));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5851301L + "'", long2 == 5851301L);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-4704000), 1941944331, (-5822300));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 2231, 0, 13516776);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-2718144L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2718144) + "'", int1 == (-2718144));
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 255717, (long) 328191465);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 83924136855405L + "'", long2 == 83924136855405L);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(182748167558313L, 502656L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 182748167558313 * 502656");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-125500), (java.lang.Object) (-166311));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 165796, 19814191, (-3200));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-2259000L), (-11L));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 24849000 + "'", int2 == 24849000);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(6028880L, 58239625805L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 351119715223248400");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(278071860, 1766785, 87, (-1734960));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(43, (-158513520));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-158513477) + "'", int2 == (-158513477));
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-43), (-223641402), (-3395));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -43 for hi! must be in the range [-223641402,-3395]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(1837067490988181340L, 9906401169L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1837067500894582509L + "'", long2 == 1837067500894582509L);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(15623, 9724, (-1821293), (-11646070));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-340482756), 291647502340L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-291987985096L) + "'", long2 == (-291987985096L));
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-10), 1943795520, 22);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -10 for  must be in the range [1943795520,22]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-1941959631L), 278071860);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-540004326637083660L) + "'", long2 == (-540004326637083660L));
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-146920931), 1607723812L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-236208279249908972L) + "'", long2 == (-236208279249908972L));
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-6), 4784000, 0, 330);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 382786, (-572120560));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-218999740680160L) + "'", long2 == (-218999740680160L));
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(100, (-31), (-233), (-11647300));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 27432, (-374783424), 217000);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 5663563, 1327011976, (-340473042));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-986506979), 1665, 1134915920);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -986506979 for hi! must be in the range [1665,1134915920]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 62000L, (java.lang.Object) 1569);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-487), (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-387) + "'", int2 == (-387));
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-11L), (long) (-1372800));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15100800 + "'", int2 == 15100800);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 198400, (-986506979), 22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1653), 6916, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 1031830168, 47111554L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 48611122678561072L + "'", long2 == 48611122678561072L);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-45934336), 4784000);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -45934336 * 4784000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(46590300, 0, 15623, (-329472));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(11253900, (-9724), (-487));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-7222) + "'", int3 == (-7222));
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-9228320), 672043680, 165786);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, (-39271960));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1031377144), 13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -1031377144 * 13");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(229775129, (-23380), (-45932635));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(320, (-16387), (-3909345));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 46592042, (-1386), 7009920);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 46592042 for  must be in the range [-1386,7009920]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 164631);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 164631 + "'", int1 == 164631);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1936734162), (-1665532800), 182942800);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-32313630), (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-323136300) + "'", int2 == (-323136300));
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-139846), 1664, (-490580));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(2611241, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(1188586258130L, (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1188586258130L + "'", long2 == 1188586258130L);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 1327011840, (-572120560), 46590310);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1327011840 for  must be in the range [-572120560,46590310]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1820), 698584450);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 698582630 + "'", int2 == 698582630);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(146920931);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-146920931) + "'", int1 == (-146920931));
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-2742917), 698584450, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 87, (-2574773L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-224005251L) + "'", long2 == (-224005251L));
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(100248993660L, 2246999040L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 98001994620L + "'", long2 == 98001994620L);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(2612385, (-3395), (int) (byte) -1, 282221100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2608990 + "'", int4 == 2608990);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-546), 0, 102059);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(1327011976, 89317);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 1327011976 * 89317");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-2575636), (long) (-2612385));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6728552851860L + "'", long2 == 6728552851860L);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 164580, 1665532800);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 274113388224000L + "'", long2 == 274113388224000L);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-1248875160000L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -1248875160000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1796L, (java.lang.Object) (-600993384));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-2860465143759724L), 1931698650L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -2860465143759724 * 1931698650");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-111143), 166400, (-166400));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 32, (long) 9600);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9632L + "'", long2 == 9632L);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 16397170, 285397449L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 4679710488819330");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 39999960, (int) (short) 100, 1825);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-69923), (-662370800), 174070, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(2296320L, (-1153L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2647656960L) + "'", long2 == (-2647656960L));
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 10, 186160, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(16640000, (-1519000), 5823902);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1954194 + "'", int3 == 1954194);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-164204L), (-40889420L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 40725216L + "'", long2 == 40725216L);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-9228320));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9228320 + "'", int1 == 9228320);
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-1153L), (-141059));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 162641027L + "'", long2 == 162641027L);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(1665532832);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1665532832) + "'", int1 == (-1665532832));
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 490580, 141344, 659758415);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        java.lang.Object obj0 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals(obj0, (java.lang.Object) (-2600000L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 288129358, (long) 490580);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 141350500447640L + "'", long2 == 141350500447640L);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-111143));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-111143) + "'", int1 == (-111143));
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 282221100, 2860465143964508L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 282221100 * 2860465143964508");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 5657149, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5657149L + "'", long2 == 5657149L);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-106666560000L), 283395980);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -106666560000 * 283395980");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, (-1653));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-360860), (-617L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 222650620L + "'", long2 == 222650620L);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(502079585280000L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 502079585280000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-773760), (long) 1658);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-772102L) + "'", long2 == (-772102L));
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-3930560));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-3930560) + "'", int1 == (-3930560));
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 101, (long) 19814191);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2001233291 + "'", int2 == 2001233291);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 1936619548, (-233), (-1380));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1936619548 for hi! must be in the range [-233,-1380]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-15252312), (-1608), (-5822300));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -15252312 for hi! must be in the range [-1608,-5822300]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(645120L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 645120 + "'", int1 == 645120);
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(1912725632, 46304);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1912771936 + "'", int2 == 1912771936);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-127824), (long) (-1168498456));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1168370632L + "'", long2 == 1168370632L);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(108825600, 2001233291, (-42), 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-140941), (-46590310), 69888, 2611241);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1554475 + "'", int4 == 1554475);
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(1821);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1821) + "'", int1 == (-1821));
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-572120460), 1326901952L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -759147755153137920");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-240), 0, (-2052));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-46590310), (java.lang.Object) 13741);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-320L), (-8867));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2837440L + "'", long2 == 2837440L);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 141344, 9600, 5823497);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(2001233291, (-376));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2001232915 + "'", int2 == 2001232915);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-7222), (-329472), (-2612385));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-35), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-35) + "'", int2 == (-35));
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-465L), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((int) (byte) 1, (-1144));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1143) + "'", int2 == (-1143));
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1936619548), (-405876), (-1056));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-360705) + "'", int3 == (-360705));
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-167049), 277588800, 656880);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(10L, (-620L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 630L + "'", long2 == 630L);
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 255717, 4986212892766260L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 255717 * 4986212892766260");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-2575266), 126, (-20), (-384786135));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 0, 450092, (-139846));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-233), 656880);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 656647 + "'", int2 == 656647);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-848), (-384786135));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -848 * -384786135");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        org.joda.time.field.FieldUtils.verifyValueBounds("", (-223641402), (-1327011976), 1554475);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(0L, 95990294776L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 95990294776L + "'", long2 == 95990294776L);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((int) '4', 5657149);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5657201 + "'", int2 == 5657201);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-167014), 1087985074176000L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -167014 * 1087985074176000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-682010955L), (java.lang.Object) 401600000);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-2574773L), 775262592009600L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 775262589434827L + "'", long2 == 775262589434827L);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-384786135), 15623, (-352165));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(233, 198400, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-166720), (-1056), (-12681));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-116550), (-255717), 5823902, (-1608));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-18568282492L), (long) 401600000);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-18969882492L) + "'", long2 == (-18969882492L));
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(106902556480L, (long) (-1155));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -123472452734400");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-2576517), 35, 340473032);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 337896481 + "'", int3 == 337896481);
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-264), (-340473042), (-1658));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        org.joda.time.field.FieldUtils.verifyValueBounds("", (-405), (-226265106), 1653);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(0, (-46591216));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-32));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-7520), (-32313630));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -7520 * -32313630");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-15623), (-384786100), (-255717));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -15623 for  must be in the range [-384786100,-255717]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-12681), 5200, 237640621, 1287004160);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1049356059 + "'", int4 == 1049356059);
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-276494400), 1L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-276494400) + "'", int2 == (-276494400));
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(19814190, 51);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 19814241 + "'", int2 == 19814241);
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-139846L), 363674336L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 363534490L + "'", long2 == 363534490L);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, (-158513477));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(490580L, (-18289670));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-8972546308600L) + "'", long2 == (-8972546308600L));
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-140906), (-5324800), (-21700000));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -140906 for hi! must be in the range [-5324800,-21700000]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-264), 1936617856);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -264 * 1936617856");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(1287002560);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1287002560) + "'", int1 == (-1287002560));
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        org.joda.time.field.FieldUtils.verifyValueBounds("", (-2365), (-1372790), (-8));
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-202903478), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-139846L), 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 192925, 217000, 52440);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-5823802L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-5823802) + "'", int1 == (-5823802));
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 19814190, (-46591216), (-39271960));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 19814190 for  must be in the range [-46591216,-39271960]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 69888, (long) (-166720));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-96832L) + "'", long2 == (-96832L));
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-158513477), 126036, 520);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-5547853070320L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -5547853070320");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(401600000, 382786, (-612354));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(56545073325L, (long) (-374783424));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 56919856749L + "'", long2 == 56919856749L);
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(19814520L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 19814520 + "'", int1 == 19814520);
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-428370776288000L), (long) (-360705));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-428370776648705L) + "'", long2 == (-428370776648705L));
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-382786), (-8867));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3394163462L + "'", long2 == 3394163462L);
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-482750), (-46592000), (-2132));
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(2860465143748108L, (-490580));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 2860465143748108 * -490580");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(371193030, 69889, (-1906981791));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-226265106), (-2612385), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-277588800), 2610333, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(8620872L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8620872 + "'", int1 == 8620872);
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(16397170);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-16397170) + "'", int1 == (-16397170));
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1895994596), (-18));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -1895994596 * -18");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-10), 46592000, 69889, (-848));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-24752L), (long) 13516776);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -334567239552");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(28604651435280000L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 28604651435280000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 89317, (java.lang.Object) (-520000L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(163128730);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-163128730) + "'", int1 == (-163128730));
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 1741, 0, (-1029643803));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1741 for hi! must be in the range [0,-1029643803]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-1087985074176000L), (long) (-138217));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -1087985074176000 * -138217");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-1372800L), (long) (-13728));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 18845798400");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1608), 1936617856);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1936616248 + "'", int2 == 1936616248);
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-213098453568000L), (java.lang.Object) 58240000000L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-42L), 9724);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-408408L) + "'", long2 == (-408408L));
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-10) + "'", int1 == (-10));
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-100), (java.lang.Object) 4754576L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 283395980, (-328191465), 2001232915);
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 662370800, (-1287002560));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-852472915269248000L) + "'", long2 == (-852472915269248000L));
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-462185352000L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -462185352000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-322366149), (-45932635), 198303);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-45580515) + "'", int3 == (-45580515));
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-329472), (long) (-5822201));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 1918252207872");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 174035);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 174035 + "'", int1 == 174035);
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-387), 363674336, 1766785);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-1326977616L), 519680L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1327497296L) + "'", long2 == (-1327497296L));
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-7010204), (long) 1825);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-7008379L) + "'", long2 == (-7008379L));
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-111143), 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-111043) + "'", int2 == (-111043));
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-24710), 13741);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-10969) + "'", int2 == (-10969));
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-1153L), 2365);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2726845L) + "'", long2 == (-2726845L));
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-110024), (-328191424));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-328301448) + "'", int2 == (-328301448));
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-14931288), (-3909345));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-18840633) + "'", int2 == (-18840633));
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(876405117732L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 876405117732");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 656880);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 656880 + "'", int1 == 656880);
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-5822201), (-42));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 244532442 + "'", int2 == 244532442);
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-5819836), (-1858), 2610333);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -5819836 for hi! must be in the range [-1858,2610333]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-288076105), 102059);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -288076105 * 102059");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(59511186L, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 595111860L + "'", long2 == 595111860L);
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1716), (-1031377144), 0, 520);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 34 + "'", int4 == 34);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(229494000L, (long) (-4704000));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 234198000L + "'", long2 == 234198000L);
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-1898799L), 1554475);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2951635575525L) + "'", long2 == (-2951635575525L));
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-107265L), (-1232294770809405600L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1232294770809298335L + "'", long2 == 1232294770809298335L);
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-102065), (-808), (-1031377144));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -102065 for  must be in the range [-808,-1031377144]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(69888);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-69888) + "'", int1 == (-69888));
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 0, 1031830400, 16639480);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for hi! must be in the range [1031830400,16639480]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(216248769L, (long) (-13));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -2811233997");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-112042));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 112042 + "'", int1 == 112042);
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 0, 1766785, (-198400));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(502079585392100L, (-166772L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 502079585225328L + "'", long2 == 502079585225328L);
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(164472L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 164472 + "'", int1 == 164472);
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-10969), (-328188265L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-328199234L) + "'", long2 == (-328199234L));
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-1653L), (long) 190407252);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 190405599L + "'", long2 == 190405599L);
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(164631, (-158513477));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 164631 * -158513477");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 22, 360860, 23380);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 22 for  must be in the range [360860,23380]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(460965672000L, (long) (-139846));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 460965811846L + "'", long2 == 460965811846L);
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1954194, 2611241, (-163128730), (-7010204));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-151553092) + "'", int4 == (-151553092));
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(0L, 384786083L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 384786083L + "'", long2 == 384786083L);
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 374783424, (-612354), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-360860), 21645, (-1904000), (-45580515));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(5657149, 112100, (-450092), (-5822300));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 28458464, (long) (-2132));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-60673445248L) + "'", long2 == (-60673445248L));
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1953689291), (-682184990), (-172370));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-146794895), 340482756);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -146794895 * 340482756");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 46591948, 47111554L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2195019074167192L + "'", long2 == 2195019074167192L);
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-328191424), (-322366149), (-2742917));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-7520), (-166311));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1250658720 + "'", int2 == 1250658720);
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1785600L), (java.lang.Object) (-223641402));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-33061076160L), (-2647656960L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-30413419200L) + "'", long2 == (-30413419200L));
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-6190), 166720, 374783424);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 374610515 + "'", int3 == 374610515);
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(659758415, (-166962), (-3395));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-74897) + "'", int3 == (-74897));
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(502079585280000L, (-2610253L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 502079582669747L + "'", long2 == 502079582669747L);
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1895994596), (-682184990), 320, 18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 288342622, (java.lang.Object) 775262592000000L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 6916, (-69923), 1287004160);
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-166080), 288129410, 204784);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(0L, 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-1086412L), 66350592L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -72084079355904");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-74897), 69888, (-480834));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -74897 for hi! must be in the range [69888,-480834]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 10, (-773440), (-448503));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-669384204), 1327011976, 166962);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -669384204 for  must be in the range [1327011976,166962]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-379395L), (long) 136);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-51597720) + "'", int2 == (-51597720));
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-1087985074176000L), 2772225L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1087985071403775L) + "'", long2 == (-1087985071403775L));
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(51354937, (-600993384));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-549638447) + "'", int2 == (-549638447));
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-59200440));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 59200440 + "'", int1 == 59200440);
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 0, 1849, (-3395));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 172370, (long) 328191465);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-328019095L) + "'", long2 == (-328019095L));
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(181124608000L, (-165445));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-29966160770560000L) + "'", long2 == (-29966160770560000L));
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-376), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-376L) + "'", long2 == (-376L));
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(1155887200L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1155887200 + "'", int1 == 1155887200);
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-14931288), 998820552, (-11615));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -14931288 for  must be in the range [998820552,-11615]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 1031830079, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(659758415, (-57253680));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 659758415 * -57253680");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(198429, 229775129);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 198429 * 229775129");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-223639738L), 181124608000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-181348247738L) + "'", long2 == (-181348247738L));
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1904000), (-1906981790), 172370);
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(95741014989312L, (long) (-1386));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 95741014987926L + "'", long2 == 95741014987926L);
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-2184), (long) (-5823802));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 12719183568");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-382744), (-223545340L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 223162596L + "'", long2 == 223162596L);
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-19814191), 374783424, (-352165));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-71587));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-71587) + "'", int1 == (-71587));
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-13), (-69888));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-69901) + "'", int2 == (-69901));
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        org.joda.time.field.FieldUtils.verifyValueBounds("", (-2052), (-340473032), (-1858));
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(66350592L, (long) (-1255));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 66351847L + "'", long2 == 66351847L);
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-4122), (-833));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3433626L + "'", long2 == 3433626L);
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 70, 6079586, (-5324800));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 70 for  must be in the range [6079586,-5324800]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-35450217234432000L), (java.lang.Object) 5657201);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-140906), (-232), (-73415));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -140906 for hi! must be in the range [-232,-73415]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-3189327876L), (-1326977616L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 4232166701536823616");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(136, (-71587));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-71451) + "'", int2 == (-71451));
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-17), (-69923));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1188691 + "'", int2 == 1188691);
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-4424364), (-1372800));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -4424364 * -1372800");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-322366149));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 322366149 + "'", int1 == 322366149);
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1700), 69888, (-549638447), 102059);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 68188 + "'", int4 == 68188);
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-10969), (-39046069), (-323136300), (-2742917));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-39057038) + "'", int4 == (-39057038));
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 52, 277588800, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-226265106), (-52), (-1953689291));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1906981790), 54912000);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -1906981790 * 54912000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(8480, 190407252, (-226265106));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-74897), (-97), 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -74897 for  must be in the range [-97,0]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-126556), 14931288, (-57253680));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -126556 for hi! must be in the range [14931288,-57253680]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(52L, (long) (-19814190));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 19814242L + "'", long2 == 19814242L);
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-340473000), (-172370), 1941944331);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -340473000 for hi! must be in the range [-172370,1941944331]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-3930560), 374610515, (-18315));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-420L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-420) + "'", int1 == (-420));
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 1049356059, (long) 21645);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1049377704L + "'", long2 == 1049377704L);
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1653, (java.lang.Object) (-166400));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(232, (-18289670));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-18289438) + "'", int2 == (-18289438));
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-2576517), (-52440));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -2576517 * -52440");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-100248795357L), 9228320);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-925127963168910240L) + "'", long2 == (-925127963168910240L));
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, 363940);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-328191424), (-166962));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-328358386) + "'", int2 == (-328358386));
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(9697, 1155887200, 59200440);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-3395), (-1665), (-328301448));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(7176000, 288650836);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 7176000 * 288650836");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-165194), (-102065));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 16860525610L + "'", long2 == 16860525610L);
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-31L), (-258017760L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-258017791L) + "'", long2 == (-258017791L));
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(166720, (-2205840), (-97), 288129410);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 286090388 + "'", int4 == 286090388);
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 11253900, 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(1238275451844L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 1238275451844");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-2355685215L), (-65412793099800L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-65415148785015L) + "'", long2 == (-65415148785015L));
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(130048209, 6, 0, (-571021860));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(698584450, (-1936619531), (-1665532800), 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1238035081) + "'", int4 == (-1238035081));
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1825, (-12681), 138217, 544072);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 395000 + "'", int4 == 395000);
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-328191465), (-259), 5823497);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3762684 + "'", int3 == 3762684);
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 166311, (long) (-1941944331));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1942110642L + "'", long2 == 1942110642L);
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-276494400));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 276494400 + "'", int1 == 276494400);
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(166400, (-15252312));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-15085912) + "'", int2 == (-15085912));
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-223239L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-223239) + "'", int1 == (-223239));
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(2610333, (int) (byte) 10, (-386032));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(667588552779600L, (long) (-151553092));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 667588552779600 * -151553092");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 371193030, (long) (-223239));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-82864760824170L) + "'", long2 == (-82864760824170L));
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 360557, (long) (-18840633));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -6793122112581");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-7222), (-11155500));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-11162722) + "'", int2 == (-11162722));
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-5823869), 1658, 1031830400);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(4781948, 21700000, (-1941944331));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-12572), 659758415, (-31));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 164472, (long) (-52));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-8552544L) + "'", long2 == (-8552544L));
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(1665532800, 1912771936);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 1665532800 * 1912771936");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 998548417, (-7222));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-7211516667574L) + "'", long2 == (-7211516667574L));
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(277588800, 382786);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 277971586 + "'", int2 == 277971586);
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-163128730), 27432);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-163101298) + "'", int2 == (-163101298));
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-41220), (-255717));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -41220 * -255717");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((int) (short) 0, (-328191465), (-320));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-328191146) + "'", int3 == (-328191146));
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(286090388, 0, 1828967, 1658);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 328190018, (-73100), (-272136));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-833), 0, 199584);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-600430L), (long) 39271960);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -23580062942800");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(371193030, 20, 164472, 363940);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 180710 + "'", int4 == 180710);
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 69889, (-662374000), (-24849000));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 69889 for  must be in the range [-662374000,-24849000]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-2951635575525L), (long) 163128730);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2951472446795L) + "'", long2 == (-2951472446795L));
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1165), 998548417, 1031830079, 231481404);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 46591216, 4205, 16639480);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-139846), (-16427), 204784);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 81366 + "'", int3 == 81366);
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-329472));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-329472) + "'", int1 == (-329472));
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(3762684, (-340473000));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 3762684 * -340473000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
        java.lang.Object obj0 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals(obj0, (java.lang.Object) (-14560L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 23380, (java.lang.Object) 1155);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(2611241);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2611241) + "'", int1 == (-2611241));
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-328301448), 0, (-1327011840));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(106732910592L, (-1086412L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-115955914862075904L) + "'", long2 == (-115955914862075904L));
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-2724), (-1372790), (-109));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-2724) + "'", int3 == (-2724));
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 164472, 3762684, (-5822201));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(166501L, (-12681));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2111399181L) + "'", long2 == (-2111399181L));
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-2724));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2724 + "'", int1 == 2724);
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-139846), 149);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-139697) + "'", int2 == (-139697));
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 46590300, 1031830079);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 48073272929633700L + "'", long2 == 48073272929633700L);
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 42, 42395057619900L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1780592420035800L + "'", long2 == 1780592420035800L);
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-5324800), (-223641600), (-363940), 1031830168);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 803227709 + "'", int4 == 803227709);
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-2593660433175L), (java.lang.Object) 32943733L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(1849, 1766785);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 1849 * 1766785");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-5200), 440128000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 440122800 + "'", int2 == 440122800);
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-617L), 220108L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-135806636L) + "'", long2 == (-135806636L));
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-282895011), (-1956216738L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2239111749L) + "'", long2 == (-2239111749L));
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-5823802), (long) 15623);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-90985258646L) + "'", long2 == (-90985258646L));
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(47036965731730060L, 58241568880L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 47036965731730060 * 58241568880");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-19814190), (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-19814090L) + "'", long2 == (-19814090L));
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 2612385);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2612385 + "'", int1 == 2612385);
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(216767L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 216767L + "'", long2 == 216767L);
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-182866950), (-165445));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -182866950 * -165445");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 2001233291, (java.lang.Object) (-158513477));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(3485856L, (long) (-1665532800));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -5805807504076800");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-21687), 47278568L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-47300255L) + "'", long2 == (-47300255L));
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1165), (-600993384));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -1165 * -600993384");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-138217), (-7222), (-773760));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, (long) 490580);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(21694800L, (long) (-2691));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-58380706800L) + "'", long2 == (-58380706800L));
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 440128000, (long) (-4205));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 440123795L + "'", long2 == 440123795L);
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-376), (-329472));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-329848) + "'", int2 == (-329848));
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 42, 179527L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 179569L + "'", long2 == 179569L);
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-323136300));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 323136300 + "'", int1 == 323136300);
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(166962, 231481404, 659758415);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 428443974 + "'", int3 == 428443974);
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(998548417, 1821, (-288076105), (-31));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-153754062) + "'", int4 == (-153754062));
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-3580697), 5824000, (-1821), (-97134840));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(1031377144L, 468993641895L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 470025019039L + "'", long2 == 470025019039L);
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-654), 395000, (-71451));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(1688L, (-38261404970880000L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-38261404970878312L) + "'", long2 == (-38261404970878312L));
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-329472));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 329472 + "'", int1 == 329472);
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 125500);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 125500 + "'", int1 == 125500);
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1665532832), 27432);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1665505400) + "'", int2 == (-1665505400));
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-984676579), (-43), 1, (-264));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-465L), (long) (-223641600));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 223641135L + "'", long2 == 223641135L);
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-1665505400), (long) (-5823902));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1671329302L) + "'", long2 == (-1671329302L));
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(183048400, (-1906981790), 288342622, 112035);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 277588800, (-21687), (-32));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-163101298), (long) 217000);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-35392981666000L) + "'", long2 == (-35392981666000L));
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-704812702512640L), 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-19814090L), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-19814090L) + "'", long2 == (-19814090L));
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, (-166080));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 198400, (long) 15623);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3099603200L + "'", long2 == 3099603200L);
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 1024, (-271342676044832L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -277854900269907968");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(340482756, 328191465);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 340482756 * 328191465");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 81366, 1828967, 102059);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-164204L), 2724);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-447291696L) + "'", long2 == (-447291696L));
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 658347520, 10400, (-113847));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(428443974, (-12));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 428443962 + "'", int2 == 428443962);
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-1588808L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1588808) + "'", int1 == (-1588808));
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-340473032), (-1665505400));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 567059673350372800L + "'", long2 == 567059673350372800L);
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (short) 0, (long) (-46592042));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-272136), 34);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9252624) + "'", int2 == (-9252624));
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1941944331, 1554475, 1734960);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(288342622, 198303);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 288540925 + "'", int2 == 288540925);
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 5824000, 384786083L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2240994147392000L + "'", long2 == 2240994147392000L);
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-450092), (-1372800L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 617886297600L + "'", long2 == 617886297600L);
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 198303, (-329472));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-65335286016L) + "'", long2 == (-65335286016L));
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(1L, 141344);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 141344L + "'", long2 == 141344L);
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1936621249), 232, 659758415);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-272230358400L), (long) (-2575636));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 701166311387942400L + "'", long2 == 701166311387942400L);
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-328358386), (-11155490), 198429);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1904000), (-600993384));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-602897384) + "'", int2 == (-602897384));
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 182942800, (-2020523048210L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 182942800 * -2020523048210");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 1188691, 92);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 109359572L + "'", long2 == 109359572L);
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-2052));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2052 + "'", int1 == 2052);
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-24710220), 1569, (-984676579));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-490580), (-45580515));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -490580 * -45580515");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-34847965), (-1029643803), (-340473032));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-724018737) + "'", int3 == (-724018737));
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(5200, (-5688740), (-111178), 2003383330);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1997810969 + "'", int4 == 1997810969);
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(5823869, (-5823802), (-158513520));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(141344, 2001232915);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 141344 * 2001232915");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2960");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-73100), 1134915920, (-166720));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-2610253L), (-167517L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 437261751801");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-16387), (long) 282221100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4624757165700L) + "'", long2 == (-4624757165700L));
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2963");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(135, 5200);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5335 + "'", int2 == 5335);
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 330, (-808), 141344);
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2965");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-328019095L), (long) (-986506979));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 323593126462764005");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2966");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1936619531), 9600, 204784);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 201224 + "'", int3 == 201224);
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2967");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1437, 374783424, (-73415));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2968");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-2724), (-1372800), 340473000);
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2969");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(223641135L, (long) (-2184));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 223643319L + "'", long2 == 223643319L);
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2970");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-4205), 8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-33640) + "'", int2 == (-33640));
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-35L), (long) 9724);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9689L + "'", long2 == 9689L);
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2972");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-815394940), 52440, (-1519000));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2973");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(0, 998548417, 276494400);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2974");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-34847965L), (-79252992000L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 79218144035L + "'", long2 == 79218144035L);
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2975");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 164472, 131468942918125428L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 164472 * 131468942918125428");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2976");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-226265106), 111178, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2977");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-271516L), 302686020L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -82184097406320");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2978");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(1849, 19814190, (-9228320));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2979");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-808), (-39500081), (-572008425));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2980");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(0, 382786);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2981");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 172370, (-1327011840), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2982");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(1168370632L, (long) (-126556));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1168497188L + "'", long2 == 1168497188L);
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2983");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (short) 10, 519680L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 519690L + "'", long2 == 519690L);
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2984");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(5823869, 1936619520);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 5823869 * 1936619520");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2985");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(302686020L, 8344970L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2525905756319400L + "'", long2 == 2525905756319400L);
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2986");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1954194, 288129358, 1569);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2987");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-18), (-9724));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9742) + "'", int2 == (-9742));
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2988");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-32));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-32) + "'", int1 == (-32));
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-156722833041255L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -156722833041255");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2990");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(56919856749L, 363674336L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 57283531085L + "'", long2 == 57283531085L);
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2991");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-46592000), (long) (-1031830080));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 985238080L + "'", long2 == 985238080L);
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 3423623060186530L, (java.lang.Object) 374610515);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2993");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 199584, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2994");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(216248769L, (-553170854356848L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-553170638108079L) + "'", long2 == (-553170638108079L));
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2995");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-320), (long) 19814191);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-6340541120L) + "'", long2 == (-6340541120L));
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2996");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-4533506L), (long) (-662370800));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 657837294L + "'", long2 == 657837294L);
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2997");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-302837704L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-302837704) + "'", int1 == (-302837704));
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2998");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1029643803), 7009920, 340473000);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 3553504, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-8867), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }
}

