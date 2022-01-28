import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

    public static boolean debug = false;

    @Test
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-329472), (-682184990));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-682514462) + "'", int2 == (-682514462));
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-546), 6920409, (-1407261), 1936619533);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6919863 + "'", int4 == 6919863);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 217000, (-682184990), (-141059));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(0, (-7520), (-1686));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-5835) + "'", int3 == (-5835));
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 2611241, 534070715675194962L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 2611241 * 534070715675194962");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-32313630), (-986506979), (-1653));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-32313630) + "'", int3 == (-32313630));
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-32L), (-100248795357L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-100248795389L) + "'", long2 == (-100248795389L));
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 307455826, (-6664568), 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 307455826 for hi! must be in the range [-6664568,0]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(11905705557L, 40769747);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 485392603415384079L + "'", long2 == 485392603415384079L);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-662374000), 40769747, (-23247));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-100248795357L), (java.lang.Object) 8);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-16640020));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 16640020 + "'", int1 == 16640020);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(95990294776L, (long) 277971586);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 95712323190L + "'", long2 == 95712323190L);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1795200L, (java.lang.Object) (-166080));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(35046268L, (-1161L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35045107L + "'", long2 == 35045107L);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-642179731200000L), (long) (-2575260));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-642179728624740L) + "'", long2 == (-642179728624740L));
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1031830080), 1734960, (-329848), (-1821));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-87200) + "'", int4 == (-87200));
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 21645, (long) (-1936619548));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-41918130116460L) + "'", long2 == (-41918130116460L));
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-549120), 1954194);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1405074 + "'", int2 == 1405074);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 286090388, (-11162722), (-21700000));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-2259000L), 1828967L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -4131636453000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(3047616013L, (-654));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1993140872502L) + "'", long2 == (-1993140872502L));
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 1936402650, 111178, 198);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1936402650 for hi! must be in the range [111178,198]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-482750), (long) (-158513520));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-158996270L) + "'", long2 == (-158996270L));
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(1741, 237640621);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 1741 * 237640621");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(6728552851860L, 612448L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 4120888737015953280");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(5381285448000L, 250773868800L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5130511579200L + "'", long2 == 5130511579200L);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-183048400), 2979, 7009920, 232);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 0, 108350, (-21687));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-73415), 182942800);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -73415 * 182942800");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(0, 126, 231481404);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 231481279 + "'", int3 == 231481279);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-223239), (-328191146), 1568880, (-3590394));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-109928), 22, (-323136300));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-166720), (-5822300));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5989020) + "'", int2 == (-5989020));
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-32313641), (-43));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-32313684) + "'", int2 == (-32313684));
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(2610333);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2610333) + "'", int1 == (-2610333));
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(198429, (-10587), 1936402650, (-57253680));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-23380), 490580, (-139697), (-328191465));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-179252736), (java.lang.Object) 322366149);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(166962, 1659032, (-46592000), 46591948);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1825994 + "'", int4 == 1825994);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-662395510), 109, (-6190));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 658347520, (long) 87);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 658347607L + "'", long2 == 658347607L);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-82300608013L), (long) (-140906));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 11596649472679778");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-18200000L), (long) (-127824));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2326396800000L + "'", long2 == 2326396800000L);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(14931288);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-14931288) + "'", int1 == (-14931288));
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-328301448), (-18315), (-9252624));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) '4', (long) (-320));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-268L) + "'", long2 == (-268L));
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-29906275));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 29906275 + "'", int1 == 29906275);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(548883901700L, 141344L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 548883760356L + "'", long2 == 548883760356L);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-40));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 40 + "'", int1 == 40);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(7431, (-1287002560), 1954194);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7431 + "'", int3 == 7431);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        org.joda.time.field.FieldUtils.verifyValueBounds("", (-549120), (-163128730), (-102065));
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(255, 427963128, 23, (-984676579));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(142422, 360860, (-29922662), (-146794895));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-2610333), 3037, 2132);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -2610333 for hi! must be in the range [3037,2132]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-24849000));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 24849000 + "'", int1 == 24849000);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(596969525L, (-29966160770560000L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-29966160173590475L) + "'", long2 == (-29966160173590475L));
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-16427), (-139697), (-724018737));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 35, 282219281L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 282219316L + "'", long2 == 282219316L);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(15623, (-69923));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-54300) + "'", int2 == (-54300));
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(95741014989312L, 165796);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 95741014989312 * 165796");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-5688740), 365387);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5323353) + "'", int2 == (-5323353));
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-11587643));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11587643 + "'", int1 == 11587643);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(322366149, (-654));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 322366149 * -654");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-165433968843010560L), 8620872L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -165433968843010560 * 8620872");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-86668494), 0, 363674336, (-1858));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-11155490), 8480);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -11155490 * 8480");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-540004326637083660L), (java.lang.Object) (-100));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 1912771936);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1912771936 + "'", int1 == 1912771936);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-97), (long) (-443415178));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 43011272266L + "'", long2 == 43011272266L);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-96832L), (java.lang.Object) (-58247176000L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-387), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-387) + "'", int2 == (-387));
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1904000), 21645, (-179252736));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(2326396800000L, (long) (-116550));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -271141547040000000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(363686);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-363686) + "'", int1 == (-363686));
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(182942901);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-182942901) + "'", int1 == (-182942901));
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-218999740680160L), (long) (-5414543));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-218999735265617L) + "'", long2 == (-218999735265617L));
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-340473000), (long) 1821);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-620001333000L) + "'", long2 == (-620001333000L));
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(182942800, (-1936611698));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 182942800 * -1936611698");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-110024), 198400, (-8867));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-10), (long) 69889);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-698890) + "'", int2 == (-698890));
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(5381285448000L, (long) 255);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 1372227789240000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(572120525L, (long) 388073);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 571732452L + "'", long2 == 571732452L);
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-184775552), 40631530);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -184775552 * 40631530");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-360705), (-984676579), (-8));
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1250658720, 217000, 33640);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-18084422856192000L), (-766901329920L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-18085189757521920L) + "'", long2 == (-18085189757521920L));
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-156722833041255L), 490580);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -156722833041255 * 490580");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((int) (byte) 10, (-19814190), (-21700000), 371193030);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-19814180) + "'", int4 == (-19814180));
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-233), 1250658720);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1250658487 + "'", int2 == 1250658487);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-2354711268033L), (-5688740));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -2354711268033 * -5688740");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1021354944L), (java.lang.Object) 2837440L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-91006517252L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -91006517252");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-282895011), (long) 1941944331);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1659049320L + "'", long2 == 1659049320L);
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-1372748L), (-5819794));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 7989110573912L + "'", long2 == 7989110573912L);
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-169085L), (-1031377144));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 174390404393240L + "'", long2 == 174390404393240L);
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 365387, (-33L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 365354L + "'", long2 == 365354L);
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-40889420L), (long) (-1701));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-40891121L) + "'", long2 == (-40891121L));
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 1895994596, (-403450402037760L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 403452298032356L + "'", long2 == 403452298032356L);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1250658487, 52440, 125500);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-2610333), 1665532800);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -2610333 * 1665532800");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 276573570L, (java.lang.Object) (-19814090L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1954194, (-3930560), (-107785395));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1906981791), (-1144), (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-561) + "'", int3 == (-561));
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1165), (-21578), (-1653));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-21091) + "'", int3 == (-21091));
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-11587643), (-823246617984L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -11587643 * -823246617984");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-1858));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1858 + "'", int1 == 1858);
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-600993384), 2052);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1233238423968L) + "'", long2 == (-1233238423968L));
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 202903478, (-2184), (-182942901));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 202903478 for hi! must be in the range [-2184,-182942901]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-5823869), (-1936621249));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -5823869 * -1936621249");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-7222), (java.lang.Object) (-32384));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-69888), 395000);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-27605760000L) + "'", long2 == (-27605760000L));
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(28291744, 18);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 509251392 + "'", int2 == 509251392);
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-328301448), 7L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2298110136L) + "'", long2 == (-2298110136L));
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 612354, (long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 612257L + "'", long2 == 612257L);
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-202903478), (-589166715779070L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 589166512875592L + "'", long2 == 589166512875592L);
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1155887200, (-2575260), 288129358, (-3200));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-16387), (long) (-223641402));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3664811654574L + "'", long2 == 3664811654574L);
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 374783424, (long) 1405074);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 373378350L + "'", long2 == 373378350L);
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 126036, (java.lang.Object) (-15300L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-6), (long) (-420));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 414L + "'", long2 == 414L);
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-571021860), (java.lang.Object) (-12309807722311L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 288342622, 1941944331, 4781948);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        java.lang.Object obj0 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals(obj0, (java.lang.Object) (-714277L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(183048400, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-10955745013762850L), 3295692715278709L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-14251437729041559L) + "'", long2 == (-14251437729041559L));
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-435L), (long) 1938205016);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-843119181960L) + "'", long2 == (-843119181960L));
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(571021860, 520, 10400);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8751 + "'", int3 == 8751);
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(19814241, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1981424100 + "'", int2 == 1981424100);
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 288129358, (-33), 5657149);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-40), (-1372800L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 54912000L + "'", long2 == 54912000L);
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-11646070), 9600, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-102065));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 102065 + "'", int1 == 102065);
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-5161632023964640L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -5161632023964640");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
        java.lang.Object obj0 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals(obj0, (java.lang.Object) (-235249));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-39468L), (long) 288321044);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 288281576L + "'", long2 == 288281576L);
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-16640000), (java.lang.Object) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 255717, (-654), (-1134915920));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-166400), 182942901, 5823497);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 1568880, 95990294776L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 95991863656L + "'", long2 == 95991863656L);
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-16427), (-1211464800L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1211481227L) + "'", long2 == (-1211481227L));
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((int) (byte) 1, (-111143));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-111142) + "'", int2 == (-111142));
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-5819794), 202903478);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -5819794 * 202903478");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-18084422856192000L), (-106666561665L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-18084529522753665L) + "'", long2 == (-18084529522753665L));
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-275758401L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-275758401) + "'", int1 == (-275758401));
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-546), (int) (short) 1, 17360085);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 164472, 0, 773440);
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(102065, 139679);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 241744 + "'", int2 == 241744);
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-5835), 19814520, (-1238035081));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(19814520L, (long) 1936619520);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1956434040L + "'", long2 == 1956434040L);
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 115500, 338363239200L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-338363123700L) + "'", long2 == (-338363123700L));
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 998548417, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 998548417L + "'", long2 == 998548417L);
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 229775129, (-271516L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -62387623925564");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 23, (-376), (-450092));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
        org.joda.time.field.FieldUtils.verifyValueBounds("", 656880, (-328188373), 4781948);
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-362419200000L), (java.lang.Object) (-14560L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(146920931, 108825600, (-561), 1936616248);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 255746531 + "'", int4 == 255746531);
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-382744), (-602897384));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 230755356341696L + "'", long2 == 230755356341696L);
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-321540));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 321540 + "'", int1 == 321540);
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 363686, (-116550), (-409635100));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(66350592L, (long) (-9724));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-645193156608L) + "'", long2 == (-645193156608L));
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(11253900, 140906, (-210424900));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1327011976), 1941944331);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -1327011976 * 1941944331");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(58240000097L, 1287002560);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 58240000097 * 1287002560");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(672043680);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-672043680) + "'", int1 == (-672043680));
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-8), (long) (-16427));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-16435L) + "'", long2 == (-16435L));
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 1287004160, 0, (-1407261));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1287004160 for  must be in the range [0,-1407261]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(182492901280657L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 182492901280657");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 2610333, 0, 165796);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2610333 for  must be in the range [0,165796]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 340473000, (-111043), (-3590394));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 340473000 for  must be in the range [-111043,-3590394]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-152647769), (-46592000), (-276494400));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(1901157889L, 803227709);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1527062695628746301L + "'", long2 == 1527062695628746301L);
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-151553092), (-39046069), (-2575260));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-5669852) + "'", int3 == (-5669852));
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-587742164), (-655200), 1665532800, (-323136300));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-255717));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-255717) + "'", int1 == (-255717));
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(589166673202046L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 589166673202046");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(1938205016, (-1658), (-111178));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-11616L), 18136800L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -210677068800");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-113847), 544072);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -113847 * 544072");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-167049), 46304, (-328191424));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(220552772, (-32313641));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 220552772 * -32313641");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 109, (long) (-277584678));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -30256729902");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(288129358, (-340482756));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 288129358 * -340482756");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-11616), 255746531);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 255734915 + "'", int2 == 255734915);
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1734960), (-18289670));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -1734960 * -18289670");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-113847), (-1255));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-115102) + "'", int2 == (-115102));
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 8751, 46591216, (-881));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 8751 for  must be in the range [46591216,-881]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-54300));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-54300) + "'", int1 == (-54300));
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(19814242L, (-165433968843010560L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 165433968862824802L + "'", long2 == 165433968862824802L);
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-1155), (-28137543720L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 32498862996600");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 201224, (-1056));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-212492544L) + "'", long2 == (-212492544L));
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(288129358);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-288129358) + "'", int1 == (-288129358));
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-1031377144), (long) (-2612385));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1028764759L) + "'", long2 == (-1028764759L));
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1686), 231481404, 328188373);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 290119224 + "'", int3 == 290119224);
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-34848000), 1821);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -34848000 * 1821");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3696");
        org.joda.time.field.FieldUtils.verifyValueBounds("", (-111142), (-1904000), (-848));
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-29922662), (-100248795389L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100218872727L + "'", long2 == 100218872727L);
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3698");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 288129358, (-2184), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3699");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-4145590), (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4145555) + "'", int2 == (-4145555));
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3700");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(2031483509540L, (-1372748L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2031482136792L + "'", long2 == 2031482136792L);
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3701");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-487));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 487 + "'", int1 == 487);
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3702");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-18), (-3037));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 54666 + "'", int2 == 54666);
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3703");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 166400, 698584450, (-275758401));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3704");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(40768000L, (long) (-328188373));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 368956373L + "'", long2 == 368956373L);
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3705");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 340482756, 166300, (-8867));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3706");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(2031482136792L, 278071860);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 2031482136792 * 278071860");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3707");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 136, 16639480, 87);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 136 for  must be in the range [16639480,87]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3708");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 165796, 656647, (-13));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3709");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(376, (-10), 5824000);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 376 + "'", int3 == 376);
    }

    @Test
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3710");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-455725), (-1327011976), 906847389);
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3711");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-52L), (long) 288321044);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -14992694288");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3712");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-762867700089031680L), (-285573450855744L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -762867700089031680 * -285573450855744");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3713");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1686), 340110799, (-329848));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3714");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-6), 9600, (-1155));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -6 for  must be in the range [9600,-1155]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3715");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-31), (-1671329302L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 51811208362");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3716");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 1287002560, 2365, 803227709);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1287002560 for hi! must be in the range [2365,803227709]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3717");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(102059, (-443415178), (-220584));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-443092536) + "'", int3 == (-443092536));
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3718");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 46304, 0, 645120);
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3719");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(6, (-14931288));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-14931282) + "'", int2 == (-14931282));
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3720");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-38261404970878312L), (java.lang.Object) 40);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3721");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-437758029), (long) (-57253680));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-495011709L) + "'", long2 == (-495011709L));
    }

    @Test
    public void test3722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3722");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(13741);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-13741) + "'", int1 == (-13741));
    }

    @Test
    public void test3723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3723");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-5823497), 139679, (-1936619548), 69889);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-5683818) + "'", int4 == (-5683818));
    }

    @Test
    public void test3724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3724");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 1830400, (long) (-52));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-95180800) + "'", int2 == (-95180800));
    }

    @Test
    public void test3725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3725");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1405074, (-352165), 278071860, (-1907097291));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3726");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-4122), (-7222), (-112042));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3727");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 24849000, (-158513520), 1812096);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3728");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-420), 1734960, (-140941));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -420 for hi! must be in the range [1734960,-140941]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3729");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 237640621, 179569L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 42672888672349L + "'", long2 == 42672888672349L);
    }

    @Test
    public void test3730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3730");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(283395980);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-283395980) + "'", int1 == (-283395980));
    }

    @Test
    public void test3731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3731");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-447291696L), 589166673202046L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-589167120493742L) + "'", long2 == (-589167120493742L));
    }

    @Test
    public void test3732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3732");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-52440), (java.lang.Object) 95991863656L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3733");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(363673528L, (long) (-111043));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -40383399569704");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3734");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-32313684), 371193030);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 338879346 + "'", int2 == 338879346);
    }

    @Test
    public void test3735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3735");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(35045107L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test3736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3736");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-52000L), 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5200000L) + "'", long2 == (-5200000L));
    }

    @Test
    public void test3737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3737");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-299284678L), 328191019L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-98222543443906882L) + "'", long2 == (-98222543443906882L));
    }

    @Test
    public void test3738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3738");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 382786, 1830400, 340110799);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 382786 for hi! must be in the range [1830400,340110799]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3739");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(1168370632L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1168370632 + "'", int1 == 1168370632);
    }

    @Test
    public void test3740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3740");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-24710220), (-1936619531), (int) (short) 0);
    }

    @Test
    public void test3741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3741");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1821293), (-21687), (-39046069));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3742");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(1938205016);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1938205016) + "'", int1 == (-1938205016));
    }

    @Test
    public void test3743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3743");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-52440), (-1407261));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1459701) + "'", int2 == (-1459701));
    }

    @Test
    public void test3744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3744");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-328191465), (java.lang.Object) (-4533506L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3745");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-833), (long) 401600000);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-334532800000L) + "'", long2 == (-334532800000L));
    }

    @Test
    public void test3746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3746");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-2132), (long) (-1701));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3833L) + "'", long2 == (-3833L));
    }

    @Test
    public void test3747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3747");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 108825600, (-340473000), (-2184));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3748");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-39499200), (-4145555), 5200);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -39499200 for  must be in the range [-4145555,5200]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3749");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-35449756268760000L), (long) (-7176000));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-35449756275936000L) + "'", long2 == (-35449756275936000L));
    }

    @Test
    public void test3750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3750");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-35450217234432000L), (int) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35450217234432000L + "'", long2 == 35450217234432000L);
    }

    @Test
    public void test3751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3751");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(5381285448000L, 110647680L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5381396095680L + "'", long2 == 5381396095680L);
    }

    @Test
    public void test3752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3752");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-52440), (-352165), (int) (byte) -1);
    }

    @Test
    public void test3753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3753");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 19814190, (java.lang.Object) 2003383330);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3754");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-1570), (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1570L) + "'", long2 == (-1570L));
    }

    @Test
    public void test3755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3755");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 998548417, (-21687), (-1904000));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3756");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-1655), (-2718144));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4498528320L + "'", long2 == 4498528320L);
    }

    @Test
    public void test3757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3757");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(166300, 323019034, (-11615), 3762684);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2369834 + "'", int4 == 2369834);
    }

    @Test
    public void test3758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3758");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 217000, 4784000, (-549120));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 217000 for hi! must be in the range [4784000,-549120]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3759");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-111142), (long) 320);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-111462L) + "'", long2 == (-111462L));
    }

    @Test
    public void test3760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3760");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 8, (long) (-8922));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-8914L) + "'", long2 == (-8914L));
    }

    @Test
    public void test3761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3761");
        org.joda.time.field.FieldUtils.verifyValueBounds("", 174035, (-1665505400), 1287004160);
    }

    @Test
    public void test3762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3762");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 307455826, 13728, 2610333);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3763");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 26046, (long) (-881));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-22946526L) + "'", long2 == (-22946526L));
    }

    @Test
    public void test3764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3764");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-8552544L), (-1677151789955070L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1677151798507614L) + "'", long2 == (-1677151798507614L));
    }

    @Test
    public void test3765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3765");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-119891756999784L), 1828831L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-119891755170953L) + "'", long2 == (-119891755170953L));
    }

    @Test
    public void test3766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3766");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 337896481, (-10L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 337896471L + "'", long2 == 337896471L);
    }

    @Test
    public void test3767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3767");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-10955744902694363L), (long) (-73647));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -10955744902694363 * -73647");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3768");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 0, 232, (-328191465));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3769");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 115500, (-97), 251100);
    }

    @Test
    public void test3770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3770");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-36156566400L), 130048209);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4702096703909577600L) + "'", long2 == (-4702096703909577600L));
    }

    @Test
    public void test3771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3771");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(46591948, (-10587), (int) (byte) 1, (-1658));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3772");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 589166673202046L, (java.lang.Object) 58241568880L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3773");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(656880, (-384786100));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-384129220) + "'", int2 == (-384129220));
    }

    @Test
    public void test3774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3774");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(47111554L, (-371015300L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-17479107340776200L) + "'", long2 == (-17479107340776200L));
    }

    @Test
    public void test3775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3775");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(11905704749L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 11905704749");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3776");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 3395, (-4267L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-872L) + "'", long2 == (-872L));
    }

    @Test
    public void test3777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3777");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-217000), (-276494400), 320);
    }

    @Test
    public void test3778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3778");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-1933898171));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1933898171 + "'", int1 == 1933898171);
    }

    @Test
    public void test3779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3779");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-1655L), 1282760220758016000L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -1655 * 1282760220758016000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3780");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(172370, (-13741), 125500, (-163101298));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3781");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 8620872);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8620872 + "'", int1 == 8620872);
    }

    @Test
    public void test3782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3782");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-54300), 237640621, 165554, (-138217));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3783");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 108350, 58241568880L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 58241677230L + "'", long2 == 58241677230L);
    }

    @Test
    public void test3784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3784");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(612354);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-612354) + "'", int1 == (-612354));
    }

    @Test
    public void test3785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3785");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-4754576), (-772));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4755348) + "'", int2 == (-4755348));
    }

    @Test
    public void test3786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3786");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(24735138, 220552772, 1250658720);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1054841087 + "'", int3 == 1054841087);
    }

    @Test
    public void test3787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3787");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(6916, 1938205016);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 6916 * 1938205016");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3788");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 1830400, (long) 1941944331);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3554534903462400L + "'", long2 == 3554534903462400L);
    }

    @Test
    public void test3789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3789");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1936676459), 1665532832, 340473032);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3790");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-17), (-1936734162), 42);
    }

    @Test
    public void test3791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3791");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-111143), 237640621, 5824000);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3792");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 440123795L, (java.lang.Object) (-13741));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3793");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-138217), (-5323353), 277588800, 276907815);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3794");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-163101298));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 163101298 + "'", int1 == 163101298);
    }

    @Test
    public void test3795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3795");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(13728, (-328358386), 125500, 96148);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3796");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(232);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-232) + "'", int1 == (-232));
    }

    @Test
    public void test3797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3797");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-1907097291), (-156722833041255L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -1907097291 * -156722833041255");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3798");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-156722833041255L), (java.lang.Object) (-1830387L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3799");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 0, 360860, 182942800);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3800");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 0, (-61362), (-1459701));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3801");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-46590310), 140906, 1168370632);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3802");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-5822300));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5822300 + "'", int1 == 5822300);
    }

    @Test
    public void test3803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3803");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-572124582));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-572124582) + "'", int1 == (-572124582));
    }

    @Test
    public void test3804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3804");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-5324800), 571021860, (-16640020));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3805");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-12681), 14579123, (-1665505400));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3806");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-808), 698582630, 1821);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -808 for  must be in the range [698582630,1821]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3807");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(28604651435280000L, (long) (-546));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 28604651435280000 * -546");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3808");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(172370, 283395980);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 283568350 + "'", int2 == 283568350);
    }

    @Test
    public void test3809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3809");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-62832L), 112035L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -7039383120");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3810");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 46304, 1912771936, (-1936734162));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 46304 for  must be in the range [1912771936,-1936734162]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3811");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-384129220), (-5324800), 20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3812");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-169085L), (-156722833041255L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -169085 * -156722833041255");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3813");
        org.joda.time.field.FieldUtils.verifyValueBounds("", (-115102), (-773440), (-73100));
    }

    @Test
    public void test3814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3814");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-45932635), (-21578));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-45954213) + "'", int2 == (-45954213));
    }

    @Test
    public void test3815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3815");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(5851301L, (long) (-13));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-76066913) + "'", int2 == (-76066913));
    }

    @Test
    public void test3816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3816");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-1081264L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1081264) + "'", int1 == (-1081264));
    }

    @Test
    public void test3817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3817");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(283568350);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-283568350) + "'", int1 == (-283568350));
    }

    @Test
    public void test3818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3818");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(46591874L, (long) 8);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 46591882L + "'", long2 == 46591882L);
    }

    @Test
    public void test3819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3819");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-4205), 5200, 2979);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -4205 for hi! must be in the range [5200,2979]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3820");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 282218704, (-602897384), 1155);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3821");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 112035, (-11587643));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1298221583505L) + "'", long2 == (-1298221583505L));
    }

    @Test
    public void test3822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3822");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 240, (-379395L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-379155L) + "'", long2 == (-379155L));
    }

    @Test
    public void test3823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3823");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(1407805L, (-11615));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-16351655075L) + "'", long2 == (-16351655075L));
    }

    @Test
    public void test3824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3824");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(288650836, (int) 'a', 182942901, 2001233291);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 288650933 + "'", int4 == 288650933);
    }

    @Test
    public void test3825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3825");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(1997810969, 5200, (-152647769));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3826");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-42464378900L), 138304L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-42464240596L) + "'", long2 == (-42464240596L));
    }

    @Test
    public void test3827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3827");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-328191146), 698584450, (-16640000), (-881));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-12306456) + "'", int4 == (-12306456));
    }

    @Test
    public void test3828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3828");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(401600000, (-19), (-2718144));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3829");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-2132), (long) (-138217));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-140349L) + "'", long2 == (-140349L));
    }

    @Test
    public void test3830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3830");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-166400), (-21091), 1155887200, (-8));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3831");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-18840633), (-1658), (-1895994596), (-450092));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-18842291) + "'", int4 == (-18842291));
    }

    @Test
    public void test3832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3832");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1372790), 1825994, (-111143));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3833");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1830400, (java.lang.Object) 686500L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3834");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-21645), 1665532800, 140906, (-13728));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3835");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(6079586);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-6079586) + "'", int1 == (-6079586));
    }

    @Test
    public void test3836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3836");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-12681), (long) (-1933898171));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 24523762706451");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3837");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(35, 51, 2610333);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2610318 + "'", int3 == 2610318);
    }

    @Test
    public void test3838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3838");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-18840633), (-34847965), (-1519000), (-216870));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-301227) + "'", int4 == (-301227));
    }

    @Test
    public void test3839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3839");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-5414543), (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-173265376) + "'", int2 == (-173265376));
    }

    @Test
    public void test3840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3840");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-23380), 2610333, (-455725));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -23380 for hi! must be in the range [2610333,-455725]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3841");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(1087985645081310L, 1741);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1894183008086560710L + "'", long2 == 1894183008086560710L);
    }

    @Test
    public void test3842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3842");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 1588768, (-126556));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-201068123008L) + "'", long2 == (-201068123008L));
    }

    @Test
    public void test3843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3843");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-5823902L), (-1895994596));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 11042086719633592L + "'", long2 == 11042086719633592L);
    }

    @Test
    public void test3844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3844");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(1665532800, (-73100));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 1665532800 * -73100");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3845");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 217000, 241744, (-374783424));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 217000 for  must be in the range [241744,-374783424]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3846");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-1905905201L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1905905201) + "'", int1 == (-1905905201));
    }

    @Test
    public void test3847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3847");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-360860), (-18568282492L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 6700550420063120");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3848");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1665532800), 17, 1981424100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3849");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(0, 361058);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3850");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(46304);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-46304) + "'", int1 == (-46304));
    }

    @Test
    public void test3851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3851");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-1098906600L), 374783424);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-411851978204198400L) + "'", long2 == (-411851978204198400L));
    }

    @Test
    public void test3852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3852");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1238035081), (-51597720), (-17));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3853");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(658347520, (-669384204), (-328358386), 190407252);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-11036684) + "'", int4 == (-11036684));
    }

    @Test
    public void test3854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3854");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-116550), 288342622);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 288226072 + "'", int2 == 288226072);
    }

    @Test
    public void test3855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3855");
        java.lang.Object obj0 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals(obj0, (java.lang.Object) (-572121604L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3856");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(329472, (-158513520));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-158184048) + "'", int2 == (-158184048));
    }

    @Test
    public void test3857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3857");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(5897448, 1828967, (-24849000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3858");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 17, (-1821));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-30957L) + "'", long2 == (-30957L));
    }

    @Test
    public void test3859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3859");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(0, 6916);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3860");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(113, 277584678, 6976661, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3861");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 502079582669747L, (java.lang.Object) (-4122));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3862");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 11587643, 7);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 81113501L + "'", long2 == 81113501L);
    }

    @Test
    public void test3863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3863");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 544072, (-5823497), 487);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3864");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-704812702512640L), (-19814090L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-704812722326730L) + "'", long2 == (-704812722326730L));
    }

    @Test
    public void test3865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3865");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(6976661, 5335, 1250658720, 1327011840);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1304985053 + "'", int4 == 1304985053);
    }

    @Test
    public void test3866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3866");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-76066913), 13, 982982640);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 906915715 + "'", int3 == 906915715);
    }

    @Test
    public void test3867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3867");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-913370515200L), (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 913370515200L + "'", long2 == 913370515200L);
    }

    @Test
    public void test3868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3868");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-7222), (long) (-1519000));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10970218000L + "'", long2 == 10970218000L);
    }

    @Test
    public void test3869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3869");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-1941944331), (long) (-612354));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1942556685L) + "'", long2 == (-1942556685L));
    }

    @Test
    public void test3870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3870");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-374783424), (-92), 363940);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 170566 + "'", int3 == 170566);
    }

    @Test
    public void test3871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3871");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 5201, 11253900);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 58531533900L + "'", long2 == 58531533900L);
    }

    @Test
    public void test3872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3872");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(453031164);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-453031164) + "'", int1 == (-453031164));
    }

    @Test
    public void test3873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3873");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(59200440);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-59200440) + "'", int1 == (-59200440));
    }

    @Test
    public void test3874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3874");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(22110720, (-18289670), 440128000, (-140941));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3875");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-502656L), (long) (-2612385));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2109729L + "'", long2 == 2109729L);
    }

    @Test
    public void test3876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3876");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(595111860L, (long) 4781948);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2845793968703280L + "'", long2 == 2845793968703280L);
    }

    @Test
    public void test3877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3877");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-2610333), (-158513477));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-161123810) + "'", int2 == (-161123810));
    }

    @Test
    public void test3878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3878");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(340473032, (-21700000));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 318773032 + "'", int2 == 318773032);
    }

    @Test
    public void test3879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3879");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 97, (-69923), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3880");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(6916, 549120, 6919863, (-158184048));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3881");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-23380), (-33640), 112042);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-23380) + "'", int3 == (-23380));
    }

    @Test
    public void test3882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3882");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 340473032, 126);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 42899602032L + "'", long2 == 42899602032L);
    }

    @Test
    public void test3883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3883");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-808), 19814191);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 19813383 + "'", int2 == 19813383);
    }

    @Test
    public void test3884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3884");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1031830400, 193499963, 487, 165786);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 126763 + "'", int4 == 126763);
    }

    @Test
    public void test3885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3885");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-1700));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1700 + "'", int1 == 1700);
    }

    @Test
    public void test3886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3886");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(5823902, (-572124582));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-566300680) + "'", int2 == (-566300680));
    }

    @Test
    public void test3887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3887");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 0, 1741, 21700000);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3888");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 1700, 1912771936, 198429);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1700 for  must be in the range [1912771936,198429]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3889");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-110024), (-1658), 6916);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3890");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(42395057614700L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 42395057614700");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3891");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-236208279249908972L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -236208279249908972");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3892");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 14603626, (-2727886), (-288076105));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3893");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-173265376), (java.lang.Object) (-1934790553L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3894");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-39046069), (java.lang.Object) (-10955745013762850L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3895");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-164631), (-179252736));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -164631 * -179252736");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3896");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 165554, (-158513477), 255);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3897");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 340482756, (-1809202293192L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1808861810436L) + "'", long2 == (-1808861810436L));
    }

    @Test
    public void test3898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3898");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(164472, 142422);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 306894 + "'", int2 == 306894);
    }

    @Test
    public void test3899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3899");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(69923, 22, (-1655));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3900");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 69889, 43, (-97134840));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3901");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-1143), (-5823869));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6656682267L + "'", long2 == 6656682267L);
    }

    @Test
    public void test3902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3902");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-2575260), (-18), (-2612385));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3903");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 330, (-73100), 1912771936);
    }

    @Test
    public void test3904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3904");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(186160, (-18), 1936616248);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 186160 + "'", int3 == 186160);
    }

    @Test
    public void test3905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3905");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-852472915269248000L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -852472915269248000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3906");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-340473042));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 340473042 + "'", int1 == 340473042);
    }

    @Test
    public void test3907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3907");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-5823902), (long) 1048);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5824950L) + "'", long2 == (-5824950L));
    }

    @Test
    public void test3908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3908");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-18842291), 1659032, (-612354));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3909");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-146794895), 329472, (-1238035081));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3910");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(46590300, (-161123810));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-114533510) + "'", int2 == (-114533510));
    }

    @Test
    public void test3911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3911");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-272136), (java.lang.Object) (-11616));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3912");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 282221100, (long) (-1144241020));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-322928959329522000L) + "'", long2 == (-322928959329522000L));
    }

    @Test
    public void test3913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3913");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1407261), (-1700), 19814241);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 18408681 + "'", int3 == 18408681);
    }

    @Test
    public void test3914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3914");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(101L, (long) (-51597720));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -5211369720");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3915");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-384129220), (-384129220));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -384129220 * -384129220");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3916");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(2860465143748108L, (long) (-3930560));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2860465147678668L + "'", long2 == 2860465147678668L);
    }

    @Test
    public void test3917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3917");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 440122800);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 440122800 + "'", int1 == 440122800);
    }

    @Test
    public void test3918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3918");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-5669852), (-21645));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5691497) + "'", int2 == (-5691497));
    }

    @Test
    public void test3919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3919");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(97);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-97) + "'", int1 == (-97));
    }

    @Test
    public void test3920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3920");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-8511360L), (java.lang.Object) 46677556165651095L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3921");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-18289438), (-329472));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-18618910) + "'", int2 == (-18618910));
    }

    @Test
    public void test3922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3922");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-329472), (java.lang.Object) (-46425600L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3923");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 112100, (-5823497));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-652814013700L) + "'", long2 == (-652814013700L));
    }

    @Test
    public void test3924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3924");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-2691), 1655, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3925");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-172370));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-172370) + "'", int1 == (-172370));
    }

    @Test
    public void test3926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3926");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-73647));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 73647 + "'", int1 == 73647);
    }

    @Test
    public void test3927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3927");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-40), (-39499200), (-323136300));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -40 for  must be in the range [-39499200,-323136300]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3928");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 174034L, (java.lang.Object) 58240000L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3929");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-301227), (-2355685215L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 709595990258805");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3930");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(39999960, (-572008425), 1024, 251100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 155391 + "'", int4 == 155391);
    }

    @Test
    public void test3931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3931");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1134915920, 51, 174070);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3932");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-302837704L), (long) 1054841087);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -319445652871944248");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3933");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 13741, 453031164);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6225101224524L + "'", long2 == 6225101224524L);
    }

    @Test
    public void test3934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3934");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-38056));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-38056) + "'", int1 == (-38056));
    }

    @Test
    public void test3935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3935");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, 1825994);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test3936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3936");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 42, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test3937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3937");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-334532800000L), (java.lang.Object) 5823869);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3938");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-158184048));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 158184048 + "'", int1 == 158184048);
    }

    @Test
    public void test3939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3939");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 2132, (-321540), (-1936619548));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2132 for hi! must be in the range [-321540,-1936619548]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3940");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-969113600000L), (long) 282220836);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -969113600000 * 282220836");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3941");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-480834), (-33280040), 11587643);
    }

    @Test
    public void test3942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3942");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-19832502560000L), (java.lang.Object) 340482756);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3943");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-3805235L), (long) 115500);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-439504642500L) + "'", long2 == (-439504642500L));
    }

    @Test
    public void test3944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3944");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(26400, (-2576517), 174035);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 26400 + "'", int3 == 26400);
    }

    @Test
    public void test3945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3945");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(1659049320L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1659049320L + "'", long2 == 1659049320L);
    }

    @Test
    public void test3946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3946");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-386032));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-386032) + "'", int1 == (-386032));
    }

    @Test
    public void test3947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3947");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-913370515200L), (long) 165554);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-913370349646L) + "'", long2 == (-913370349646L));
    }

    @Test
    public void test3948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3948");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(251100, (-2575266));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2324166) + "'", int2 == (-2324166));
    }

    @Test
    public void test3949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3949");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(3394163462L, (long) 1250658487);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4244939340015601994L + "'", long2 == 4244939340015601994L);
    }

    @Test
    public void test3950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3950");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(1653, 115500);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 190921500 + "'", int2 == 190921500);
    }

    @Test
    public void test3951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3951");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-848), (-72171));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 61201008 + "'", int2 == 61201008);
    }

    @Test
    public void test3952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3952");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-54300), 1250658720, 282876300);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3953");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1144241020), 440128000, 401600000, (-322366149));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3954");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-572121604L), (-69923L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 40004458916492L + "'", long2 == 40004458916492L);
    }

    @Test
    public void test3955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3955");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(363940, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 363940 + "'", int2 == 363940);
    }

    @Test
    public void test3956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3956");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-301227), (-255717), 395000);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3957");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-2133331200000L), 40769747);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -2133331200000 * 40769747");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3958");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(0, (-45580515), 698584450, 1665532832);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 921367868 + "'", int4 == 921367868);
    }

    @Test
    public void test3959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3959");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1906981791), (-2576517), (-17));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3960");
        org.joda.time.field.FieldUtils.verifyValueBounds("", (-34847965), (-328358386), 165786);
    }

    @Test
    public void test3961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3961");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-2324166));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2324166) + "'", int1 == (-2324166));
    }

    @Test
    public void test3962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3962");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-340482756), (-2612385), (-1327011976));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3963");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-14931282), (-3590394));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-18521676) + "'", int2 == (-18521676));
    }

    @Test
    public void test3964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3964");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 198429);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 198429 + "'", int1 == 198429);
    }

    @Test
    public void test3965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3965");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(112035L, 8620872);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 965839394520L + "'", long2 == 965839394520L);
    }

    @Test
    public void test3966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3966");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 27432, (-166311));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4562243352L) + "'", long2 == (-4562243352L));
    }

    @Test
    public void test3967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3967");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(414L, 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3968");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-223641600), (-152647769), 0, (-153754062));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3969");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(22, (-8922));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-8900) + "'", int2 == (-8900));
    }

    @Test
    public void test3970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3970");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-291987985096L), 174035L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-291987811061L) + "'", long2 == (-291987811061L));
    }

    @Test
    public void test3971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3971");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 8331242L, (java.lang.Object) 3099603200L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3972");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(9632L, (-18969882492L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -182717908162944");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3973");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-240636100), 52440, (-126556));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -240636100 for hi! must be in the range [52440,-126556]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3974");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-572008525L), 109359572L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-681368097L) + "'", long2 == (-681368097L));
    }

    @Test
    public void test3975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3975");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(330, (-255717), 164472, 70);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3976");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-376L), (long) (-173265376));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 65147781376");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3977");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-114533510), (-1858));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -114533510 * -1858");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3978");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-5414543), (-5323353));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-10737896) + "'", int2 == (-10737896));
    }

    @Test
    public void test3979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3979");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 288342622, (java.lang.Object) 1075534894053656224L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3980");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 11253900, 21700000, 92);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3981");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-139679), (-2727886), 0, 9724);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1310 + "'", int4 == 1310);
    }

    @Test
    public void test3982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3982");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-881), (java.lang.Object) (-4267L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3983");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(5657149, (-255717));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 5657149 * -255717");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3984");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 20, (-109928), 46304);
    }

    @Test
    public void test3985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3985");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 282220836, (-46592042), (-32384));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 282220836 for  must be in the range [-46592042,-32384]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3986");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 29906275, 141344, (-1985144));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3987");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 17, 306894, 1734960);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 17 for  must be in the range [306894,1734960]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3988");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 1734960, (-5822201), (-173265376));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1734960 for  must be in the range [-5822201,-173265376]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3989");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-18), 2525905756319400L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -45466303613749200");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3990");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-2576517));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2576517 + "'", int1 == 2576517);
    }

    @Test
    public void test3991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3991");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-223239), (-487), 139679);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -223239 for hi! must be in the range [-487,139679]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3992");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(140906, (-2742917));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 140906 * -2742917");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3993");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-328191146), (-352165), 1447);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3994");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-71217547904994L), (-3200L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-71217547901794L) + "'", long2 == (-71217547901794L));
    }

    @Test
    public void test3995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3995");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(282221100, 52440);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 282273540 + "'", int2 == 282273540);
    }

    @Test
    public void test3996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3996");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(139846L, (long) 1054841087);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 147515306652602");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3997");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 1931698650, (-77574374640L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 79506073290L + "'", long2 == 79506073290L);
    }

    @Test
    public void test3998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3998");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1387860305661L), (java.lang.Object) (-21700L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3999");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-468526481280L), 6656682267L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-475183163547L) + "'", long2 == (-475183163547L));
    }

    @Test
    public void test4000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test4000");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(13741, 654, (-5806080));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }
}

