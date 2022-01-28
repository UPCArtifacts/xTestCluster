import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest9 {

    public static boolean debug = false;

    @Test
    public void test4501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4501");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-1942556685L), (-41220));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 80072186555700L + "'", long2 == 80072186555700L);
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(1931698650, 163128730, 70);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(4544227L, (long) 289979344);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 294523571L + "'", long2 == 294523571L);
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4504");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-16171840), (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-16171805) + "'", int2 == (-16171805));
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1659032, 81366, (-115102));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-14579123), 1031377144);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1016798021 + "'", int2 == 1016798021);
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4507");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-5823497), 46304);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5777193) + "'", int2 == (-5777193));
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(22110720);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-22110720) + "'", int1 == (-22110720));
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, (long) 172370);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-328358386), 1830400, (-405));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-45767616L), (java.lang.Object) (-2647656960L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-520), (-3930560), (-16640020), (-1459701));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-3931080) + "'", int4 == (-3931080));
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-815394940), (-2575260), (-283568350), (-11587643));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-274008784) + "'", int4 == (-274008784));
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-165445), 28479086);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 28313641 + "'", int2 == 28313641);
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(12681, 1031830400, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1155), 286090388);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -1155 * 286090388");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-502656));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-502656) + "'", int1 == (-502656));
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(290119224, 39046069, 201224, 40769747);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4617101 + "'", int4 == 4617101);
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-2020523054400L), (long) 14579123);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -2020523054400 * 14579123");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(329472, (-384129220));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-383799748) + "'", int2 == (-383799748));
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4521");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(69888, 34, 440122800, 231481404);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4522");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(589166673202046L, (long) 39046069);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 589166712248115L + "'", long2 == 589166712248115L);
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-18200000L), (long) (-301227));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 5482331400000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4524");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(2610333L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2610333L + "'", long2 == 2610333L);
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4525");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-340482756), 1831, 382873, 1031377144);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 690513347 + "'", int4 == 690513347);
    }

    @Test
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4526");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-338879346), (-46591216));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -338879346 * -46591216");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4527");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-272136), (-1155));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 314317080 + "'", int2 == 314317080);
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4528");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(0, (-1386));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4529");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-184775552), 803227709, (-31), (-87200));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4530");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 183048400, 283568350);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 51906732758140000L + "'", long2 == 51906732758140000L);
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4531");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-6177763756755820320L), (-1753132647675498386L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-7930896404431318706L) + "'", long2 == (-7930896404431318706L));
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4532");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(149, (-139697), (-32));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-139517) + "'", int3 == (-139517));
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4533");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(1041496L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4534");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 165796, 220108L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 385904L + "'", long2 == 385904L);
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4535");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-2324263), 232, (-22110720), 13728);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2324031) + "'", int4 == (-2324031));
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4536");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1442828), (-1701), 251100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 73984 + "'", int3 == 73984);
    }

    @Test
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4537");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 5335, 88750812, (-158184048));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4538");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-1168498456));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1168498456 + "'", int1 == 1168498456);
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4539");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(0L, 502079582669747L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 502079582669747L + "'", long2 == 502079582669747L);
    }

    @Test
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4540");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-4267L), (long) 126);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4141L) + "'", long2 == (-4141L));
    }

    @Test
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4541");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-1688L), (-46616752));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 78689077376L + "'", long2 == 78689077376L);
    }

    @Test
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4542");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-201068123008L), 564763100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -201068123008 * 564763100");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4543");
        java.lang.Object obj0 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals(obj0, (java.lang.Object) 1041496L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4544");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-340473000), (long) (-1003875531));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 341792513666163000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4545");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(490580L, (long) 13728);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 476852L + "'", long2 == 476852L);
    }

    @Test
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4546");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-382744), 2205840);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1823096 + "'", int2 == 1823096);
    }

    @Test
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4547");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(30413413011L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 30413413011");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4548");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 113, (long) 328191465);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 328191578L + "'", long2 == 328191578L);
    }

    @Test
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4549");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-223641402), 328190018);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 104548616 + "'", int2 == 104548616);
    }

    @Test
    public void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4550");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-459821653), (-151553092), 1372800);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4551");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-386032), 330);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-385702) + "'", int2 == (-385702));
    }

    @Test
    public void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4552");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-5691497), 32, 242559100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4553");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-61362), 733);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-44978346) + "'", int2 == (-44978346));
    }

    @Test
    public void test4554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4554");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-161123810), 126763, 282218704);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -161123810 for hi! must be in the range [126763,282218704]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4555");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(14579123, 1304985053);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 14579123 * 1304985053");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4556");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-223641402), 288129410, 509251392);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -223641402 for hi! must be in the range [288129410,509251392]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4557");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(897523126, 16254);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 897539380 + "'", int2 == 897539380);
    }

    @Test
    public void test4558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4558");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-32384), 39999960);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -32384 * 39999960");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4559");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-620), 2860465143748108L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2860465143747488L + "'", long2 == 2860465143747488L);
    }

    @Test
    public void test4560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4560");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(502079585392100L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 502079585392100");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4561");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-5691497));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5691497 + "'", int1 == 5691497);
    }

    @Test
    public void test4562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4562");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-275783153L), (-402494400000L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -275783153 * -402494400000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4563");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 998820552, (-1144241284), (-275758401));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4564");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 575356732, 1568880, 427963128);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4565");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-2132), 255734915, 139679);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4566");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(56100L, (-18969882492L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-18969826392L) + "'", long2 == (-18969826392L));
    }

    @Test
    public void test4567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4567");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-5324202), (-843119181960L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 843113857758L + "'", long2 == 843113857758L);
    }

    @Test
    public void test4568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4568");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-382744), (-1821293), (-140906));
    }

    @Test
    public void test4569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4569");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 440122800, (long) (-141059));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 440263859L + "'", long2 == 440263859L);
    }

    @Test
    public void test4570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4570");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(97, (-1867), 231481404, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4571");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-112042L), 328191424);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-36771223527808L) + "'", long2 == (-36771223527808L));
    }

    @Test
    public void test4572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4572");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-32384));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32384 + "'", int1 == 32384);
    }

    @Test
    public void test4573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4573");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-728161827120L), (long) (-251100));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-728161576020L) + "'", long2 == (-728161576020L));
    }

    @Test
    public void test4574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4574");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-36476179437632L), (java.lang.Object) 131468942918125428L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4575");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-298023559680L), 3047616013L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -298023559680 * 3047616013");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4576");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-19648395), (-1936619531), 0, (-1936611698));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4577");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(440263859L, (long) 174035);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 76621320701065L + "'", long2 == 76621320701065L);
    }

    @Test
    public void test4578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4578");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-2413217), (-141344), 42771, 220552772);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 217955441 + "'", int4 == 217955441);
    }

    @Test
    public void test4579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4579");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 58531533900L, (java.lang.Object) (-4122));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4580");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 278071860, (long) 1997810969);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2275882829L + "'", long2 == 2275882829L);
    }

    @Test
    public void test4581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4581");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 487, 21645, (-1906981790));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4582");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-35449756268760000L), 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4583");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-774641));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 774641 + "'", int1 == 774641);
    }

    @Test
    public void test4584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4584");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(187472764L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test4585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4585");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(656647, 0, 1936676459);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 656647 + "'", int3 == 656647);
    }

    @Test
    public void test4586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4586");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1144241284), 2205840, (-382786));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4587");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1665505400), (-166300));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -1665505400 * -166300");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4588");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-158184048), 198429, (-151553092));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -158184048 for  must be in the range [198429,-151553092]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4589");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-24849000), 276907815);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -24849000 * 276907815");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4590");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 98052712, (long) 1939364392);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2037417104L + "'", long2 == 2037417104L);
    }

    @Test
    public void test4591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4591");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 15100800, 1956434040L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1971534840L + "'", long2 == 1971534840L);
    }

    @Test
    public void test4592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4592");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 1954194, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1954194L) + "'", long2 == (-1954194L));
    }

    @Test
    public void test4593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4593");
        java.lang.Object obj1 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 570849583, obj1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4594");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-103628));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 103628 + "'", int1 == 103628);
    }

    @Test
    public void test4595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4595");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1233238423968L), (java.lang.Object) (-388073));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4596");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(62287089798569600L, (long) (-328191146));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 62287090126760746L + "'", long2 == 62287090126760746L);
    }

    @Test
    public void test4597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4597");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(40769747, 642465720);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 40769747 * 642465720");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4598");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(70, (-773760), 186160, (-437758029));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4599");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(566284480335L, (-762867700089025490L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-762867133804545155L) + "'", long2 == (-762867133804545155L));
    }

    @Test
    public void test4600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4600");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-682514462), 1569, 2611241);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -682514462 for  must be in the range [1569,2611241]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4601");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(21700000, (-233), 998548417, (-1165));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4602");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-2610333), (-106666561665L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 278435245910684445");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4603");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(289979344, 733, 125500);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 18512 + "'", int3 == 18512);
    }

    @Test
    public void test4604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4604");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-110024), (long) 8751);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-962820024L) + "'", long2 == (-962820024L));
    }

    @Test
    public void test4605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4605");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-18521676), 277588800, (-20));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4606");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 5823802, (-46616752), 34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4607");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(5807180L, (-1028764759L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -5974222133169620");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4608");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 288650836, 11253900, (-1204293925));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4609");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-46677556164096000L), (long) (-363686));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -46677556164096000 * -363686");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4610");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-571021860), (-5323353));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-576345213) + "'", int2 == (-576345213));
    }

    @Test
    public void test4611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4611");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-374783424), 276907815, 2321807);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4612");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 1255, (-18200000L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-18198745L) + "'", long2 == (-18198745L));
    }

    @Test
    public void test4613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4613");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 1936619533);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1936619533 + "'", int1 == 1936619533);
    }

    @Test
    public void test4614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4614");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-7740076032000L), (long) 5691497);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -7740076032000 * 5691497");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4615");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1655891183), 255717, 232);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4616");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-101990L), (long) 1134915920);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1134813930L + "'", long2 == 1134813930L);
    }

    @Test
    public void test4617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4617");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(69888, (-102059), (-20));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-32152) + "'", int3 == (-32152));
    }

    @Test
    public void test4618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4618");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-4704000), 5663563, (-1168498456));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4619");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1686), (-600993384), (-216870));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4620");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 395000, 182942800L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 183337800L + "'", long2 == 183337800L);
    }

    @Test
    public void test4621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4621");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-5777193));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5777193 + "'", int1 == 5777193);
    }

    @Test
    public void test4622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4622");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(0L, (long) 110647554);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4623");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(11646070, (-7222), 490580);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 196601 + "'", int3 == 196601);
    }

    @Test
    public void test4624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4624");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 278071860, (-387), 69889);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 278071860 for hi! must be in the range [-387,69889]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4625");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 0, 180710, (-420));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4626");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-52), 276494400, 1741);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4627");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(5777193, 5691497, 23380, (-45594243));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4628");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(290119224, 6976661);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 297095885 + "'", int2 == 297095885);
    }

    @Test
    public void test4629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4629");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1867), 1741, 34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4630");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-3200L), 1304985053);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4175952169600L) + "'", long2 == (-4175952169600L));
    }

    @Test
    public void test4631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4631");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 3553504, 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test4632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4632");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-698890), (long) 8751);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-707641L) + "'", long2 == (-707641L));
    }

    @Test
    public void test4633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4633");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, 5691497);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test4634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4634");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-158513520), (-571021860));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -158513520 * -571021860");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4635");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(89317, 13741, 1250658720);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 89317 + "'", int3 == 89317);
    }

    @Test
    public void test4636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4636");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(46590310L, (long) (-46590310));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test4637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4637");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(1837067490988181340L, (-453031164));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 1837067490988181340 * -453031164");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4638");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-46592000), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4639");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(10969);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-10969) + "'", int1 == (-10969));
    }

    @Test
    public void test4640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4640");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-41220));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-41220) + "'", int1 == (-41220));
    }

    @Test
    public void test4641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4641");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-11162722), (-1938205016));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1949367738) + "'", int2 == (-1949367738));
    }

    @Test
    public void test4642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4642");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-151553092), 1012, 10400, (-1688));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4643");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-334369698702L), (long) (-682184990));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -334369698702 * -682184990");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4644");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-9742), 28479086, (-1906981790));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4645");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 26400, (long) (-19814180));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-19787780L) + "'", long2 == (-19787780L));
    }

    @Test
    public void test4646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4646");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(1921725259090L, 1134987507L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 1921725259090 * 1134987507");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4647");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-54300), 35, 5663563);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4648");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-455725), (-17505096832665L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-17505097288390L) + "'", long2 == (-17505097288390L));
    }

    @Test
    public void test4649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4649");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-6150400L), 112000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-6262400L) + "'", long2 == (-6262400L));
    }

    @Test
    public void test4650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4650");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-11029990));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-11029990) + "'", int1 == (-11029990));
    }

    @Test
    public void test4651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4651");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-100), (-662370800), (-1031830081));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -100 for  must be in the range [-662370800,-1031830081]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4652");
        java.lang.Object obj0 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals(obj0, (java.lang.Object) (-320));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4653");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-2727886), (-1372800), 374610515);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4654");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-881), 6920409, (-376), (-1386));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4655");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(2001233291);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2001233291) + "'", int1 == (-2001233291));
    }

    @Test
    public void test4656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4656");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(59984899799437295L, 589166712248115L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 59395733087189180L + "'", long2 == 59395733087189180L);
    }

    @Test
    public void test4657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4657");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1936980077), 1943795520);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6815443 + "'", int2 == 6815443);
    }

    @Test
    public void test4658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4658");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-288343430L), (-35147215488L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-35435558918L) + "'", long2 == (-35435558918L));
    }

    @Test
    public void test4659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4659");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(126, 89317, (-21687));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4660");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1997810969, (-288076105), 22, (-61362));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4661");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-49878L), (java.lang.Object) (-328301448));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4662");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1734960, 1825, 6, (-22110720));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4663");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 0, (-1144241284), 282218704);
    }

    @Test
    public void test4664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4664");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(101, 11587643, (-87200));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4665");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(223643319L, (-302837704L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-79194385L) + "'", long2 == (-79194385L));
    }

    @Test
    public void test4666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4666");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(179527L, 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4667");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1405074, 61201008, (-384786135));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4668");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(10969, (-1665), (-259967), 1716);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-252380) + "'", int4 == (-252380));
    }

    @Test
    public void test4669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4669");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(182774349, (-102065));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 182672284 + "'", int2 == 182672284);
    }

    @Test
    public void test4670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4670");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-1785600L), 19928055L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 18142455L + "'", long2 == 18142455L);
    }

    @Test
    public void test4671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4671");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-182942901), (-288142039), 571021860);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-182942901) + "'", int3 == (-182942901));
    }

    @Test
    public void test4672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4672");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(0L, (long) 46593806);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 46593806L + "'", long2 == 46593806L);
    }

    @Test
    public void test4673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4673");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(282876300);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-282876300) + "'", int1 == (-282876300));
    }

    @Test
    public void test4674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4674");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(5822201, (-112042), (-13728));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-76699) + "'", int3 == (-76699));
    }

    @Test
    public void test4675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4675");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-151553092), 255717, 204784, (-1936611698));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4676");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-669384204), 16640020);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -669384204 * 16640020");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4677");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 21694800L, (java.lang.Object) (-852472915269248000L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4678");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1941944331), 6920409);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -1941944331 * 6920409");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4679");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-40320L), (-11705905411200L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 11705905370880L + "'", long2 == 11705905370880L);
    }

    @Test
    public void test4680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4680");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(19814191);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-19814191) + "'", int1 == (-19814191));
    }

    @Test
    public void test4681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4681");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-376), (-146920931));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 55242270056L + "'", long2 == 55242270056L);
    }

    @Test
    public void test4682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4682");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 34, 98052712, (-14931282));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 34 for hi! must be in the range [98052712,-14931282]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4683");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(46593806, 46590310);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 46593806 * 46590310");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4684");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-714277L), (-450092));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 321490363484L + "'", long2 == 321490363484L);
    }

    @Test
    public void test4685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4685");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(14603626, (-16640020), 12681);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-2049076) + "'", int3 == (-2049076));
    }

    @Test
    public void test4686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4686");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(4617101, 0, 2610333, (-61362));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4687");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(1766785, (-9228320));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 1766785 * -9228320");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4688");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-6664568), (-158184048), 182942901);
    }

    @Test
    public void test4689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4689");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-141344));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-141344) + "'", int1 == (-141344));
    }

    @Test
    public void test4690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4690");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-18568282492L), 328191578L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-18896474070L) + "'", long2 == (-18896474070L));
    }

    @Test
    public void test4691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4691");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-773440), (-12306456), (-45594243));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4692");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-6229099756320L), (long) 4763852);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -6229099756320 * 4763852");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4693");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-389231700), (-487L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 189555837900");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4694");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 9600, (-1372790), (-602897384));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 9600 for  must be in the range [-1372790,-602897384]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4695");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(360557);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-360557) + "'", int1 == (-360557));
    }

    @Test
    public void test4696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4696");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-363940), (-546));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 198711240L + "'", long2 == 198711240L);
    }

    @Test
    public void test4697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4697");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 54945330, (-146920931), 283568350);
    }

    @Test
    public void test4698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4698");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-7151), 1134915920, (-669384204));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4699");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(328191578L, (long) (-600993384));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-272801806L) + "'", long2 == (-272801806L));
    }

    @Test
    public void test4700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4700");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-459821653), (-126556));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -459821653 * -126556");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4701");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-3931080));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-3931080) + "'", int1 == (-3931080));
    }

    @Test
    public void test4702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4702");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-46590310), 179600L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-46769910L) + "'", long2 == (-46769910L));
    }

    @Test
    public void test4703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4703");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-4856865721189L), (long) 6815443);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4856858905746L) + "'", long2 == (-4856858905746L));
    }

    @Test
    public void test4704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4704");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-73415), 39271960, 198400, 10969);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4705");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-18568282492L), 1943795520);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -18568282492 * 1943795520");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4706");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-1898799L), (-1255));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2382992745L + "'", long2 == 2382992745L);
    }

    @Test
    public void test4707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4707");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(320, (-282895011), 2052, (-111143));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4708");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(400193578);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-400193578) + "'", int1 == (-400193578));
    }

    @Test
    public void test4709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4709");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-59200440), (-92), 0, 5823902);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4862401 + "'", int4 == 4862401);
    }

    @Test
    public void test4710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4710");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-11155490));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11155490 + "'", int1 == 11155490);
    }

    @Test
    public void test4711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4711");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-4238L), (long) 103628);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 99390L + "'", long2 == 99390L);
    }

    @Test
    public void test4712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4712");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(1049377704L, 165554);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 173728676408016L + "'", long2 == 173728676408016L);
    }

    @Test
    public void test4713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4713");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-1588808), (-2181L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1586627L) + "'", long2 == (-1586627L));
    }

    @Test
    public void test4714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4714");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(285287521L, 40769747);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 11631100053427187L + "'", long2 == 11631100053427187L);
    }

    @Test
    public void test4715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4715");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-56939), (long) 1189319931);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -67718687551209");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4716");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1912725632, 2132, (-340473000));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4717");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-1655891183));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1655891183 + "'", int1 == 1655891183);
    }

    @Test
    public void test4718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4718");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-141059), 19814190, (-323136300), 340482756);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 19673131 + "'", int4 == 19673131);
    }

    @Test
    public void test4719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4719");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-62832L), (long) 111178);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-174010L) + "'", long2 == (-174010L));
    }

    @Test
    public void test4720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4720");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-773440), (-46592042), (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-773440) + "'", int3 == (-773440));
    }

    @Test
    public void test4721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4721");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 2132, (-2611241), 803227709);
    }

    @Test
    public void test4722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4722");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 288321044, 1828967, 2979);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4723");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1255), (-4122), (-33640), 158513520);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-5377) + "'", int4 == (-5377));
    }

    @Test
    public void test4724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4724");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-29966160770560000L), (-1655891183));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -29966160770560000 * -1655891183");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4725");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-772), (-45934336), 330);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-772) + "'", int3 == (-772));
    }

    @Test
    public void test4726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4726");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-1031830080), 921367868, 2610333);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1031830080 for  must be in the range [921367868,2610333]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4727");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-672043680), (java.lang.Object) 222650620L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4728");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1168498456), (-21091), (-19814180));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4729");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1820, 0, (-103628), (-21687));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-80122) + "'", int4 == (-80122));
    }

    @Test
    public void test4730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4730");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(112000L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 112000 + "'", int1 == 112000);
    }

    @Test
    public void test4731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4731");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(179569L, (long) 69888);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 12549718272");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4732");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1659081147, (-117717870), (-9252624));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4733");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(1655891183, 126);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 1655891183 * 126");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4734");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-24710220), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-24710220L) + "'", long2 == (-24710220L));
    }

    @Test
    public void test4735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4735");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-15252312), 163128730, 1655);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -15252312 for  must be in the range [163128730,1655]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4736");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 112042, (int) 'a', 7176000);
    }

    @Test
    public void test4737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4737");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-69971198857L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -69971198857");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4738");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(112035, (-363940), 288540925);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 112035 + "'", int3 == 112035);
    }

    @Test
    public void test4739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4739");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(340473042);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-340473042) + "'", int1 == (-340473042));
    }

    @Test
    public void test4740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4740");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-400193578), (-510392354), (-450092));
    }

    @Test
    public void test4741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4741");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(382786, (-2575636));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2192850) + "'", int2 == (-2192850));
    }

    @Test
    public void test4742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4742");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-925127963168910240L), 14603626);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -925127963168910240 * 14603626");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4743");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-33640), (-388073));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -33640 * -388073");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4744");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 906847389, 11646070, (-453031164));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4745");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, 3762684);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test4746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4746");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1225958), 0, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4747");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((int) (short) 10, 184);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 194 + "'", int2 == 194);
    }

    @Test
    public void test4748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4748");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-1809202293192L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -1809202293192");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4749");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-566300680), 5823869, 6079586);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5996204 + "'", int3 == 5996204);
    }

    @Test
    public void test4750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4750");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-589166715779070L), 14750905979072L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -589166715779070 * 14750905979072");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4751");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-22070));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 22070 + "'", int1 == 22070);
    }

    @Test
    public void test4752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4752");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-5823497), (java.lang.Object) 95991863656L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4753");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(163101298, 88750812, 642465720, 1828967);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4754");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-31881842027000L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -31881842027000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4755");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(1659081147, (-126556));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 1659081147 * -126556");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4756");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 164580, (-4562243352L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4562407932L + "'", long2 == 4562407932L);
    }

    @Test
    public void test4757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4757");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(48021955958247472L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 48021955958247472L + "'", long2 == 48021955958247472L);
    }

    @Test
    public void test4758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4758");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-288142039), (-18));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -288142039 * -18");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4759");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-73100));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 73100 + "'", int1 == 73100);
    }

    @Test
    public void test4760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4760");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 12681, 4244939340015601994L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4244939340015614675L + "'", long2 == 4244939340015614675L);
    }

    @Test
    public void test4761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4761");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-3580697), (java.lang.Object) 223641135L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4762");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 290119224, (-18289438), (-2575636));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4763");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-255717), (long) (-774641));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 198088872597L + "'", long2 == 198088872597L);
    }

    @Test
    public void test4764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4764");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-11646070), (-44978346));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -11646070 * -44978346");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4765");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 549120, (java.lang.Object) 217000);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4766");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-321540), (-46425600L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 14927687424000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4767");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(1812096, (-1821293));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 1812096 * -1821293");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4768");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-2361380L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2361380) + "'", int1 == (-2361380));
    }

    @Test
    public void test4769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4769");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-2576517), 0, 340473000, (-1029643803));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4770");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 179252736, (long) 244532442);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 43833109269261312");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4771");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-328199234L), (long) 15326810);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -5030247301663540");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4772");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1912725632, 0, 428443962, (-5823902));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4773");
        org.joda.time.field.FieldUtils.verifyValueBounds("", (-328188373), (-328188373), 571021860);
    }

    @Test
    public void test4774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4774");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(0L, 485392603415384079L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 485392603415384079L + "'", long2 == 485392603415384079L);
    }

    @Test
    public void test4775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4775");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-4145555), (long) (-11155500));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 46245738802500L + "'", long2 == 46245738802500L);
    }

    @Test
    public void test4776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4776");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(1997810969, 140906);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1997951875 + "'", int2 == 1997951875);
    }

    @Test
    public void test4777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4777");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-32152), (-662374000));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 21296648848000L + "'", long2 == 21296648848000L);
    }

    @Test
    public void test4778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4778");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-274), 487);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 213 + "'", int2 == 213);
    }

    @Test
    public void test4779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4779");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-271345416318642L), (-379395L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -271345416318642 * -379395");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4780");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(111143, 659758415, 1821);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4781");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(698584450, (-482750));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 698584450 * -482750");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4782");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 7, (-1664), (-166311));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4783");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 774641, (java.lang.Object) (-772));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4784");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-5819836), (-5323353), (-7010204));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4785");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 320, (-72171));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-23094720L) + "'", long2 == (-23094720L));
    }

    @Test
    public void test4786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4786");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 190405599L, (java.lang.Object) (-5200000L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4787");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(282221644L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 282221644 + "'", int1 == 282221644);
    }

    @Test
    public void test4788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4788");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-986506979), (long) (-881));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 869112648499");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4789");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(4617101, 401600000);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 4617101 * 401600000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4790");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-86668494), 104548616);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 17880122 + "'", int2 == 17880122);
    }

    @Test
    public void test4791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4791");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-45931299L), (long) (-1327011976));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1281080677L + "'", long2 == 1281080677L);
    }

    @Test
    public void test4792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4792");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-428370776288000L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -428370776288000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4793");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(1916797507L, 54297958335104L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 54299875132611L + "'", long2 == 54299875132611L);
    }

    @Test
    public void test4794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4794");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-297795628L), 109359572L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-188436056L) + "'", long2 == (-188436056L));
    }

    @Test
    public void test4795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4795");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-2049076), (long) (-671682622));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 1376328740357272");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4796");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(328190018, (-437758029), 1858, (-15623));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4797");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(1327011840, (-3200), (-111143));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4798");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-17), (-360557), (-22110720));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4799");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 166400, 1409060L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 234467584000L + "'", long2 == 234467584000L);
    }

    @Test
    public void test4800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4800");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(2837440L, (long) 109);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2837549L + "'", long2 == 2837549L);
    }

    @Test
    public void test4801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4801");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-18315), 677788542293520L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-677788542311835L) + "'", long2 == (-677788542311835L));
    }

    @Test
    public void test4802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4802");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 2979, (-382744), (-80122));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4803");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(288342622, (-6916));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 288342622 * -6916");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4804");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(985238080L, 11L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 985238091L + "'", long2 == 985238091L);
    }

    @Test
    public void test4805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4805");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-520000L), (-252380));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 131237600000L + "'", long2 == 131237600000L);
    }

    @Test
    public void test4806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4806");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-389231700), (-591591038), (-8));
    }

    @Test
    public void test4807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4807");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 651622016L, (java.lang.Object) (-243455592L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4808");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-6190), 11705906056320L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 11705906050130L + "'", long2 == 11705906050130L);
    }

    @Test
    public void test4809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4809");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-100), (-2612385), 0);
    }

    @Test
    public void test4810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4810");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-140906), (long) 87);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-140819L) + "'", long2 == (-140819L));
    }

    @Test
    public void test4811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4811");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(906847389, (-23049), (-126556), 2610318);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 918715 + "'", int4 == 918715);
    }

    @Test
    public void test4812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4812");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-386032), (-5819836), 5777193);
    }

    @Test
    public void test4813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4813");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 102065, (-379395L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -38722950675");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4814");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1665532832), 46590310, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4815");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(2845793968703280L, (-10955745243537979L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 2845793968703280 * -10955745243537979");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4816");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1936734162), 255746531, (-15623), 19814190);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4546559 + "'", int4 == 4546559);
    }

    @Test
    public void test4817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4817");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-5823497), 278071860, 982982640);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 699087284 + "'", int3 == 699087284);
    }

    @Test
    public void test4818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4818");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(6664568, 2001233291);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2007897859 + "'", int2 == 2007897859);
    }

    @Test
    public void test4819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4819");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 0, 0, (-384786135));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4820");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-111143), 340473000);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -111143 * 340473000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4821");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(139846, (-1416933));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 139846 * -1416933");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4822");
        java.lang.Object obj0 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals(obj0, (java.lang.Object) 141350500447640L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4823");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-11616), 24735132);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -11616 * 24735132");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4824");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(98052712);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-98052712) + "'", int1 == (-98052712));
    }

    @Test
    public void test4825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4825");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 130048209, (java.lang.Object) 11148807196800L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4826");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(104548616, (-389231700));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 104548616 * -389231700");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4827");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-29906275), (long) 2052);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-61367676300L) + "'", long2 == (-61367676300L));
    }

    @Test
    public void test4828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4828");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-572120460), (-24710), 110647554);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4829");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(46593806);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-46593806) + "'", int1 == (-46593806));
    }

    @Test
    public void test4830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4830");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(58782L, (long) (-2132));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-125323224) + "'", int2 == (-125323224));
    }

    @Test
    public void test4831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4831");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(142556562, 22110720, (-164631));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4832");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(70);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-70) + "'", int1 == (-70));
    }

    @Test
    public void test4833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4833");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1936611698), (-39500081), (-24849000));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4834");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 0, 23, 401600000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for  must be in the range [23,401600000]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4835");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1821), (-23247));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 42332787 + "'", int2 == 42332787);
    }

    @Test
    public void test4836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4836");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 179569L, (java.lang.Object) (-1153L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4837");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-34848000), (-236208279249908972L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 236208279215060972L + "'", long2 == 236208279215060972L);
    }

    @Test
    public void test4838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4838");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1134915920), (java.lang.Object) 183048400);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4839");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-2575260), (-301227));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -2575260 * -301227");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4840");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-459821653));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 459821653 + "'", int1 == 459821653);
    }

    @Test
    public void test4841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4841");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-2365), (-698890));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1652874850 + "'", int2 == 1652874850);
    }

    @Test
    public void test4842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4842");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-271345416318642L), (java.lang.Object) (-274));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4843");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-490580));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 490580 + "'", int1 == 490580);
    }

    @Test
    public void test4844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4844");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, (long) 450092);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test4845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4845");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-282895011), (-166080), (-13728), 5822201);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2899479 + "'", int4 == 2899479);
    }

    @Test
    public void test4846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4846");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-3909345), 1676710L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-6554837854950L) + "'", long2 == (-6554837854950L));
    }

    @Test
    public void test4847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4847");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-111143), (-15564));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1729829652 + "'", int2 == 1729829652);
    }

    @Test
    public void test4848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4848");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(282220836, (-328358386), 1031830080);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 282220836 + "'", int3 == 282220836);
    }

    @Test
    public void test4849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4849");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-141344), (long) (-3930560));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 555561072640");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4850");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-7222), (long) 2001232915);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2001225693L + "'", long2 == 2001225693L);
    }

    @Test
    public void test4851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4851");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-808), 149, (-202903478));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4852");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(255717, 1327011840, 40769747, (-5989020));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4853");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(0, (-328190018));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4854");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(2382992745L, 22110720);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52689685346726400L + "'", long2 == 52689685346726400L);
    }

    @Test
    public void test4855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4855");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-549120), (java.lang.Object) 775262589434827L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4856");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1716), 26400, 360860, (-482750));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4857");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-51597720), 487, 1570);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 680 + "'", int3 == 680);
    }

    @Test
    public void test4858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4858");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-1225958), 361058, (-1386));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1225958 for hi! must be in the range [361058,-1386]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4859");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1155, 1984541039, (-1953689291), 4781948);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-351953862) + "'", int4 == (-351953862));
    }

    @Test
    public void test4860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4860");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-376), (-322366149), 0);
    }

    @Test
    public void test4861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4861");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 340482756, (-19814191), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4862");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-61367676300L), (-277588800L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-61090087500L) + "'", long2 == (-61090087500L));
    }

    @Test
    public void test4863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4863");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1608), (java.lang.Object) (-346830510312000L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4864");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-5324202), 1665532800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1660208598 + "'", int2 == 1660208598);
    }

    @Test
    public void test4865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4865");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(54912000);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-54912000) + "'", int1 == (-54912000));
    }

    @Test
    public void test4866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4866");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-2205840), 658780406L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1453164170771040L) + "'", long2 == (-1453164170771040L));
    }

    @Test
    public void test4867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4867");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 198429, 1828967, 70);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 198429 for hi! must be in the range [1828967,70]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4868");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-32313684), 4986212893200000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4986212925513684L) + "'", long2 == (-4986212925513684L));
    }

    @Test
    public void test4869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4869");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(678776518202937600L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 678776518202937600");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4870");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 1831, (-2600000));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4760600000L) + "'", long2 == (-4760600000L));
    }

    @Test
    public void test4871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4871");
        org.joda.time.field.FieldUtils.verifyValueBounds("", (-13728), (-29906275), 340482756);
    }

    @Test
    public void test4872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4872");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(1588808);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1588808) + "'", int1 == (-1588808));
    }

    @Test
    public void test4873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4873");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-24710), (-107135337), (-11162722));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-95997326) + "'", int3 == (-95997326));
    }

    @Test
    public void test4874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4874");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-107135337), (int) (byte) -1, 5691497, (-5200));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4875");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 16397170, (long) (-32152));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 16365018L + "'", long2 == 16365018L);
    }

    @Test
    public void test4876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4876");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-272136), 14931288, 158513520);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4877");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-376L), (long) 365387);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 365011L + "'", long2 == 365011L);
    }

    @Test
    public void test4878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4878");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1906981791), 46592000, (-384129220));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4879");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-109), (-340473000), (-153754062));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4880");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(612257L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 612257 + "'", int1 == 612257);
    }

    @Test
    public void test4881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4881");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(70, 656880, (-549120), 365387);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-257558) + "'", int4 == (-257558));
    }

    @Test
    public void test4882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4882");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-9724), (java.lang.Object) (-23270374400L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4883");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(0L, (-42464240596L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-42464240596L) + "'", long2 == (-42464240596L));
    }

    @Test
    public void test4884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4884");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(45612L, (long) 328191424);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-328145812L) + "'", long2 == (-328145812L));
    }

    @Test
    public void test4885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4885");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-1416933), (long) 112042);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1528975L) + "'", long2 == (-1528975L));
    }

    @Test
    public void test4886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4886");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-6177763756755820320L), (-1677151789955070L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-6179440908545775390L) + "'", long2 == (-6179440908545775390L));
    }

    @Test
    public void test4887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4887");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 88750812, (java.lang.Object) 58240000000L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4888");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1933898171), (-3930560), (-18923432));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4889");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(0, (-2324263));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4890");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-35));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-35) + "'", int1 == (-35));
    }

    @Test
    public void test4891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4891");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-259), (-1165));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 301735 + "'", int2 == 301735);
    }

    @Test
    public void test4892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4892");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-18840633), (-600430L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-18240203L) + "'", long2 == (-18240203L));
    }

    @Test
    public void test4893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4893");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-16351655075L), (long) 130048209);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-16481703284L) + "'", long2 == (-16481703284L));
    }

    @Test
    public void test4894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4894");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-455022L), 544880L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -247932387360");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4895");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-652814013700L), (long) (-166720));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 108837152364064000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4896");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 288540925, (java.lang.Object) (-1905905201));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4897");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 1155887200, 80072186555700L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-80071030668500L) + "'", long2 == (-80071030668500L));
    }

    @Test
    public void test4898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4898");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(2610334L, (-5823802L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3213468L) + "'", long2 == (-3213468L));
    }

    @Test
    public void test4899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4899");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(3047616013L, (-1519000));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4629328723747000L) + "'", long2 == (-4629328723747000L));
    }

    @Test
    public void test4900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4900");
        org.joda.time.field.FieldUtils.verifyValueBounds("", (-328190018), (-340473032), 40631530);
    }

    @Test
    public void test4901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4901");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 571732452L, (java.lang.Object) 80L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4902");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-220584), 360557, (-102059));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4903");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 16254, 340110799, (-1416933));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4904");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 198429, (java.lang.Object) (-288343430));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4905");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(46590310, (-572124582));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 46590310 * -572124582");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4906");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(1134915920L, 328408465L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 372715995191262800L + "'", long2 == 372715995191262800L);
    }

    @Test
    public void test4907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4907");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-174010L), (long) 726);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-126331260L) + "'", long2 == (-126331260L));
    }

    @Test
    public void test4908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4908");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1828967, (-31), 1936616248, (-16171840));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4909");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-40), 216047235, (-18842291), 15326810);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11032583 + "'", int4 == 11032583);
    }

    @Test
    public void test4910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4910");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-2052L), 113);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-231876L) + "'", long2 == (-231876L));
    }

    @Test
    public void test4911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4911");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1569), (-32384), (-69923));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4912");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-420), 1849, 87);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4913");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(0L, (long) (-33640));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4914");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(564763100L, (-379395L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-214268296324500L) + "'", long2 == (-214268296324500L));
    }

    @Test
    public void test4915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4915");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-6177763756755820320L), 100248993660L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-6177763656506826660L) + "'", long2 == (-6177763656506826660L));
    }

    @Test
    public void test4916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4916");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-1953689291), (-4856865721189L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -1953689291 * -4856865721189");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4917");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-1519000));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1519000 + "'", int1 == 1519000);
    }

    @Test
    public void test4918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4918");
        java.lang.Object obj0 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals(obj0, (java.lang.Object) (-7211516667574L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4919");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(4244939340015601994L, 52689685346726400L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4297629025362328394L + "'", long2 == 4297629025362328394L);
    }

    @Test
    public void test4920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4920");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-1936619520), 288342622);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-558409950213181440L) + "'", long2 == (-558409950213181440L));
    }

    @Test
    public void test4921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4921");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-22151117415L), (-141344));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3130927539905760L + "'", long2 == 3130927539905760L);
    }

    @Test
    public void test4922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4922");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-602897384), (-33640), (-166080));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -602897384 for  must be in the range [-33640,-166080]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4923");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(385L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 385 + "'", int1 == 385);
    }

    @Test
    public void test4924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4924");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-14931282), 427963128, (-561));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4925");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-140349L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-140349) + "'", int1 == (-140349));
    }

    @Test
    public void test4926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4926");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(170566);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-170566) + "'", int1 == (-170566));
    }

    @Test
    public void test4927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4927");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(46591948, (-140349), 1250658720);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 46591948 + "'", int3 == 46591948);
    }

    @Test
    public void test4928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4928");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-153754062), 1938205016);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1784450954 + "'", int2 == 1784450954);
    }

    @Test
    public void test4929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4929");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(428453708, (-282876300));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 145577408 + "'", int2 == 145577408);
    }

    @Test
    public void test4930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4930");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(544072L, (long) (-165445));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-90013992040L) + "'", long2 == (-90013992040L));
    }

    @Test
    public void test4931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4931");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-165433958936609391L), (-1820L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-165433958936611211L) + "'", long2 == (-165433958936611211L));
    }

    @Test
    public void test4932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4932");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-329848));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 329848 + "'", int1 == 329848);
    }

    @Test
    public void test4933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4933");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(620L, (long) 1665532800);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1032630336000L + "'", long2 == 1032630336000L);
    }

    @Test
    public void test4934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4934");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 165786, 1701, 387);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 165786 for  must be in the range [1701,387]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4935");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-732193280000000L), (long) 1741);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -1274748500480000000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4936");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(459821653);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-459821653) + "'", int1 == (-459821653));
    }

    @Test
    public void test4937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4937");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-18840633));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-18840633) + "'", int1 == (-18840633));
    }

    @Test
    public void test4938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4938");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-259967), (long) (-7520));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-252447L) + "'", long2 == (-252447L));
    }

    @Test
    public void test4939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4939");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(1372800, 282221644);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 1372800 * 282221644");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4940");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(24670762L, (-1327016280));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-32738502814005360L) + "'", long2 == (-32738502814005360L));
    }

    @Test
    public void test4941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4941");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(59511186L, 3733329600000L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 59511186 * 3733329600000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4942");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-671682622), 906847389, (-459821653));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -671682622 for  must be in the range [906847389,-459821653]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4943");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1416933), (-45932635), 1912725632);
    }

    @Test
    public void test4944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4944");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 1250658487, 51906732758140000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 51906734008798487L + "'", long2 == 51906734008798487L);
    }

    @Test
    public void test4945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4945");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 1821, 1188691);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2164606311L + "'", long2 == 2164606311L);
    }

    @Test
    public void test4946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4946");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(46591874L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 46591874 + "'", int1 == 46591874);
    }

    @Test
    public void test4947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4947");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-164284L), (-169085L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 27777960140L + "'", long2 == 27777960140L);
    }

    @Test
    public void test4948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4948");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(5601384);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-5601384) + "'", int1 == (-5601384));
    }

    @Test
    public void test4949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4949");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-1808861810436L), (long) (-321540));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1808862131976L) + "'", long2 == (-1808862131976L));
    }

    @Test
    public void test4950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4950");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1830400), (-482750), (-1519000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4951");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(0L, 236208279215060972L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-236208279215060972L) + "'", long2 == (-236208279215060972L));
    }

    @Test
    public void test4952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4952");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 1665, 2525905756319400L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4205633084271801000L + "'", long2 == 4205633084271801000L);
    }

    @Test
    public void test4953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4953");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-22110720), (-6189L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 136843246080L + "'", long2 == 136843246080L);
    }

    @Test
    public void test4954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4954");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-54300), 1134915920);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -54300 * 1134915920");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4955");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 125500, 0, 1437);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4956");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(288650933, 1660208598, 1895994596, 5823802);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4957");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-1528975L), (-6189L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9462826275L + "'", long2 == 9462826275L);
    }

    @Test
    public void test4958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4958");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-5806080), (-7176000), 1912725632);
    }

    @Test
    public void test4959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4959");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-23049));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-23049) + "'", int1 == (-23049));
    }

    @Test
    public void test4960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4960");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1734960, 13, 2205840);
    }

    @Test
    public void test4961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4961");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1036238999810000L, (java.lang.Object) (-5200));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4962");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 897523126, (long) 39999960);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 35900889139074960");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4963");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-18840633), 509251392, 10400, 28479086);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6443080 + "'", int4 == 6443080);
    }

    @Test
    public void test4964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4964");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(196601, (-22139), (-2324263));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4965");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(485392603415384079L, 1554475);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 485392603415384079 * 1554475");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4966");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 246533802, 112100, 23380);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 246533802 for hi! must be in the range [112100,23380]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4967");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-11029990), (-12572));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -11029990 * -12572");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4968");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-19814180), 5657201);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-112092798910180L) + "'", long2 == (-112092798910180L));
    }

    @Test
    public void test4969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4969");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(1282760220758016000L, (-166080));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 1282760220758016000 * -166080");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4970");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-60446));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-60446) + "'", int1 == (-60446));
    }

    @Test
    public void test4971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4971");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-3037), (-1665532800), 282876300);
    }

    @Test
    public void test4972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4972");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-8867), (-82300608013L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 729759491251271L + "'", long2 == 729759491251271L);
    }

    @Test
    public void test4973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4973");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-220584), (-1867), 101, 202903478);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 202680927 + "'", int4 == 202680927);
    }

    @Test
    public void test4974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4974");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(21694800L, (long) 172370);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 21522430L + "'", long2 == 21522430L);
    }

    @Test
    public void test4975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4975");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-5777193), 283395980, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4976");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(699087284, (-1588808));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 697498476 + "'", int2 == 697498476);
    }

    @Test
    public void test4977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4977");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(102065);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-102065) + "'", int1 == (-102065));
    }

    @Test
    public void test4978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4978");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-41918130116460L), 1049377704L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -41918130116460 * 1049377704");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4979");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(274113388224000L, (long) 255717);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 274113388224000 * 255717");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4980");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-698890), 198400, (-1255));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4981");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1031830080, (java.lang.Object) (-33960350946155100L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4982");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(363940, 1821);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 365761 + "'", int2 == 365761);
    }

    @Test
    public void test4983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4983");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-5819836), 0, (-12681), (-139517));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4984");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(2109729L, 106772129970220L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 2109729 * 106772129970220");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4985");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1997951875, 453031164, (-340473000));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4986");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-728161827120L), (java.lang.Object) (-453031164));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4987");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-2718144L), (java.lang.Object) 66350592L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4988");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(289979344);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-289979344) + "'", int1 == (-289979344));
    }

    @Test
    public void test4989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4989");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-376), (-681368097L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 256194404472");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4990");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-141059));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 141059 + "'", int1 == 141059);
    }

    @Test
    public void test4991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4991");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-71451), 998548417, (-29906275), 1895994596);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 998476966 + "'", int4 == 998476966);
    }

    @Test
    public void test4992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4992");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-1956216738L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1956216738) + "'", int1 == (-1956216738));
    }

    @Test
    public void test4993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4993");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-4704000), 4785716);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 81716 + "'", int2 == 81716);
    }

    @Test
    public void test4994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4994");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1734960, (java.lang.Object) (-1155));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4995");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-66365892L), (-1081264));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 71759049847488L + "'", long2 == 71759049847488L);
    }

    @Test
    public void test4996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4996");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1588808, (-5822300), 17360085);
    }

    @Test
    public void test4997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4997");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(0L, 519690L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-519690L) + "'", long2 == (-519690L));
    }

    @Test
    public void test4998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4998");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-11029990), 73100, (-18618910), (-1416933));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-10956890) + "'", int4 == (-10956890));
    }

    @Test
    public void test4999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4999");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(0, (-1029643803), 112100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test5000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test5000");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-15954850), (long) 24849000);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-396462067650000L) + "'", long2 == (-396462067650000L));
    }
}

