import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1701), (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1701 + "'", int2 == 1701);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-1820L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1820) + "'", int1 == (-1820));
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-1655), (long) (-33));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1688L) + "'", long2 == (-1688L));
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 198, (long) (-223641600));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-223641402L) + "'", long2 == (-223641402L));
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(174035L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 174035 + "'", int1 == 174035);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1655), (-1700), 5824000);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-9L), 1830484L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1830475L + "'", long2 == 1830475L);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(0L, (long) (-2612385));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2612385L + "'", long2 == 2612385L);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(0, 69888);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 69888 + "'", int2 == 69888);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(4986212893200000L, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 4986212893200000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-166300), (-1380));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 229494000L + "'", long2 == 229494000L);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 1, (-5823902));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5823902L) + "'", long2 == (-5823902L));
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-2052L), 2612385L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2610333L + "'", long2 == 2610333L);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-264), 13728, (-32));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -264 for  must be in the range [13728,-32]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 0, 1, 115500);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-320L), 3395);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1086400L) + "'", long2 == (-1086400L));
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(166400, (-1820));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 164580 + "'", int2 == 164580);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((int) (short) 1, (-1941944331), (-5200), (-7176000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(0, 46590310);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-166390L), (-8511360L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 8344970L + "'", long2 == 8344970L);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(13728, (-1701), (-13), (-166720));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-139846));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-139846) + "'", int1 == (-139846));
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-17));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-17) + "'", int1 == (-17));
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-402494400000L), (java.lang.Object) (-3301L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 18L, (java.lang.Object) 1716);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 100, 112000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 112100L + "'", long2 == 112100L);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-7176000), (-5823869), 320);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -7176000 for  must be in the range [-5823869,320]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-3301L), 166536L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 163235L + "'", long2 == 163235L);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-5200), 500L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2600000L) + "'", long2 == (-2600000L));
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(1716, 5200);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6916 + "'", int2 == 6916);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(9797L, 6);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 58782L + "'", long2 == 58782L);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1701), (int) (byte) 100, 1664);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 1716, (-1372800L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2355724800L) + "'", long2 == (-2355724800L));
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-2718144L), (long) (-1700));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 4620844800");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 166720, 58782L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 9800135040");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1380), (-476));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 656880 + "'", int2 == 656880);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(126, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 136 + "'", int2 == 136);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(1056L, (long) 166720);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-165664L) + "'", long2 == (-165664L));
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-420L), (java.lang.Object) (-1665));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-33), 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-33) + "'", int2 == (-33));
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 165786, (long) 13741);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 179527L + "'", long2 == 179527L);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 808);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 808 + "'", int1 == 808);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(0, (-1380), (-166311));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(1936735031L, 18L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 34861230558");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 46590300);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 46590300 + "'", int1 == 46590300);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-13), (-604L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-617L) + "'", long2 == (-617L));
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-5823902), 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5823802L) + "'", long2 == (-5823802L));
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((int) (short) -1, (-1569));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1570) + "'", int2 == (-1570));
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1665), 174035);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 172370 + "'", int2 == 172370);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(163235L, (long) 340473000);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 55577110155000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-17));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 17 + "'", int1 == 17);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-166300), 46592000);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -166300 * 46592000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 52, (-520), (-166311));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(217000);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-217000) + "'", int1 == (-217000));
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-2718144L), 172370);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-468526481280L) + "'", long2 == (-468526481280L));
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 320, (int) '4', (-217000));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-5823869), (-1701));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9906401169L + "'", long2 == 9906401169L);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 198);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 198 + "'", int1 == 198);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-773760), 320, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-52), (-166311), (-476));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -52 for hi! must be in the range [-166311,-476]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(2612385L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2612385 + "'", int1 == 2612385);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(13, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 23 + "'", int2 == 23);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 5824000, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 58240000L + "'", long2 == 58240000L);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(0L, (long) (-5823902));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5823902L) + "'", long2 == (-5823902L));
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(198303L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 198303 + "'", int1 == 198303);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-5324800));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-5324800) + "'", int1 == (-5324800));
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(52, (-264), 1701, (-32));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1), 656880, (-1664));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1155), (-5324800), 808);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (byte) 0, (-220584L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 220584L + "'", long2 == 220584L);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 1812096, 198, (-1664));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1812096 for  must be in the range [198,-1664]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((int) '4', 1, (-166720));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(8344970L, (long) (-166311));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1387860305670L) + "'", long2 == (-1387860305670L));
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((int) (byte) -1, (-13728), 198303);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(52, (-167014));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-166962) + "'", int2 == (-166962));
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(1087985074176000L, 2610333L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 1087985074176000 * 2610333");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-1700));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1700) + "'", int1 == (-1700));
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-5200), (int) 'a', (-166311));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-5823902), 1701);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5822201) + "'", int2 == (-5822201));
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(0, 42);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 100, 1665);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 166500L + "'", long2 == 166500L);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 571021860, (-320), (-1056));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(165786, 101, (-139846), 20);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-113847) + "'", int4 == (-113847));
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, (long) (-4122));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1664, (int) ' ', 17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-220584L), 166400000L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -36705177600000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-1372800L), 198303);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-272230358400L) + "'", long2 == (-272230358400L));
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-31L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-31) + "'", int1 == (-31));
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(0, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 340473000, 6916);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2354711268000L + "'", long2 == 2354711268000L);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-5823869), 97, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -5823869 for  must be in the range [97,10]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-17), 5200, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -17 for hi! must be in the range [5200,-1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 115500, (long) 69888);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 45612L + "'", long2 == 45612L);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-18200000L), (-166962));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3038708400000L + "'", long2 == 3038708400000L);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (int) (short) 100, 174035, 17);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for  must be in the range [174035,17]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(66350592L, (-106666560000L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 106732910592L + "'", long2 == 106732910592L);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (byte) -1, (long) (-5823902));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5823902 + "'", int2 == 5823902);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(165786, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 165796 + "'", int2 == 165796);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(9797L, (long) (-1936619531));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-18973061545207L) + "'", long2 == (-18973061545207L));
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(1087985074176000L, (-1941944331));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 1087985074176000 * -1941944331");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-5823802L), (int) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-302837704L) + "'", long2 == (-302837704L));
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-520000L), (-166400));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 86528000000L + "'", long2 == 86528000000L);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-5823902), (-113847), (-1655));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-102059) + "'", int3 == (-102059));
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(46590310);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-46590310) + "'", int1 == (-46590310));
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-11), (-3200), 115500);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(340473000, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 340473032 + "'", int2 == 340473032);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-600430L), (-33L));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 19814190 + "'", int2 == 19814190);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(0L, 9697L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9697L + "'", long2 == 9697L);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(198, (-113847), (-34848000), (-34848000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-34848000), 6916);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -34848000 * 6916");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 620L, (java.lang.Object) (-40320L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 217000, 165796);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35977732000L + "'", long2 == 35977732000L);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (byte) 1, (-1056L));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1056) + "'", int2 == (-1056));
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 20, 66350592L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1327011840 + "'", int2 == 1327011840);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((int) (short) 1, (-46590310), 46590310, (-7176000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(136, 1327011840);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1327011976 + "'", int2 == 1327011976);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((int) ' ', 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1024 + "'", int2 == 1024);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(808, (-476), 808);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 808 + "'", int3 == 808);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(2L, (long) 5200);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10400 + "'", int2 == 10400);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 340473000, 1936619520L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 659366657832960000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(132L, (-1664L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1796L + "'", long2 == 1796L);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(97, (-1056), (-1941944331), (-34848000));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1907097291) + "'", int4 == (-1907097291));
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1327011976, 52, (-166311), (-166962));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 166720, (-6189L));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1031830080) + "'", int2 == (-1031830080));
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 10400, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10410L + "'", long2 == 10410L);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 198, 7176000, (-35));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 18, 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        org.joda.time.field.FieldUtils.verifyValueBounds("", (int) ' ', 0, (int) ' ');
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-102059), (-1664), 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -102059 for  must be in the range [-1664,0]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(166500L, 166400L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 27705600000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-100), 1255);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-125500) + "'", int2 == (-125500));
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(217000, 165786);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 382786 + "'", int2 == 382786);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        java.lang.Object obj1 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-6), obj1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-4122), 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-41220) + "'", int2 == (-41220));
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 808, 320, (-1716));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-69923), 45612L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3189327876L) + "'", long2 == (-3189327876L));
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(1327011976);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1327011976) + "'", int1 == (-1327011976));
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-1653L), 1830484L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1828831L + "'", long2 == 1828831L);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 100.0d, (java.lang.Object) 166400000L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 97, (-1386), (-1716));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for hi! must be in the range [-1386,-1716]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-97));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 97 + "'", int1 == 97);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1664), 1664, (-166400));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        org.joda.time.field.FieldUtils.verifyValueBounds("", 1701, (int) '4', 115500);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 13728, (java.lang.Object) 126);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(0, (-35), (-139846), (-1665));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-138217) + "'", int4 == (-138217));
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-5200));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-5200) + "'", int1 == (-5200));
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((int) (byte) 100, (-476));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-376) + "'", int2 == (-376));
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-10), (int) '4', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 198303, (long) (-1655));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-328191465) + "'", int2 == (-328191465));
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-97), 587L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-56939L) + "'", long2 == (-56939L));
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 1701, (long) (-13));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1688L + "'", long2 == 1688L);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(8, 19814190);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 158513520 + "'", int2 == 158513520);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-277588800L), (java.lang.Object) (-21700L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-1820));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1820 + "'", int1 == 1820);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(320, (-773760), (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-773440) + "'", int3 == (-773440));
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(0, (-1936619520), 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        java.lang.Object obj0 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals(obj0, (java.lang.Object) 229494000L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-5324800), (-5822201), 46590310, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-277588800L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-277588800) + "'", int1 == (-277588800));
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-15300L), 66350592L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-66365892L) + "'", long2 == (-66365892L));
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 13741, 52, (-1701));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 13741 for hi! must be in the range [52,-1701]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1255, 1024, (-166400));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-102059), (long) (-6));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-102065L) + "'", long2 == (-102065L));
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(66350592L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 66350592L + "'", long2 == 66350592L);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(5200);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-5200) + "'", int1 == (-5200));
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-2612385));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2612385 + "'", int1 == 2612385);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 19814190, 126);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2496587940L + "'", long2 == 2496587940L);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 808, (-328191465), 382786);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-462185352000L), (-6189L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2860465143528000L + "'", long2 == 2860465143528000L);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (int) (byte) -1, 46590300, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hi! must be in the range [46590300,0]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(54945330, (-102059), (-1569));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-23247) + "'", int3 == (-23247));
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(8);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-8) + "'", int1 == (-8));
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-166300), (int) (byte) 1, 3395);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-56939L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-56939) + "'", int1 == (-56939));
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(0, (-32), (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-4122), (int) (short) 0, 18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (int) (short) 10, (-21700000), (-167014));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-7176000), (-97), (-6));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-92) + "'", int3 == (-92));
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 101, (-5324800), 8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 101 for  must be in the range [-5324800,8]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(363940);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-363940) + "'", int1 == (-363940));
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-1653L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1653) + "'", int1 == (-1653));
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-1820L), (long) 363940);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-662370800) + "'", int2 == (-662370800));
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(9697L, (-21700L));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-210424900) + "'", int2 == (-210424900));
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-476), (java.lang.Object) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(330L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 330 + "'", int1 == 330);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 1716, (-167014));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-286596024L) + "'", long2 == (-286596024L));
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(165786, (-1155));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 164631 + "'", int2 == 164631);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-773440));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 773440 + "'", int1 == 773440);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 165786, (-5823902), (-1701));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 165786 for  must be in the range [-5823902,-1701]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-363940), (java.lang.Object) (-1056));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-166400));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-166400) + "'", int1 == (-166400));
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-8), 1820);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-14560L) + "'", long2 == (-14560L));
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 0, (-1), (-520));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(43, (-328191465), 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-328191424) + "'", int3 == (-328191424));
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(58782L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 58782L + "'", long2 == 58782L);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-476), 52);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-24752L) + "'", long2 == (-24752L));
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-502656L), 35977732000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-18084422856192000L) + "'", long2 == (-18084422856192000L));
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-223641402L), (long) (-1664));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-223639738L) + "'", long2 == (-223639738L));
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(2610333L, (long) 330);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2610003L + "'", long2 == 2610003L);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-138217), (java.lang.Object) (-1664));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 174035, (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 174034L + "'", long2 == 174034L);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(10400, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(2612385, 340473032, 2612385);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-105600L), (java.lang.Object) (-328191465));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-5823869), (int) (short) -1, (-662370800));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((int) (short) 0, (-328191424));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-328191424) + "'", int2 == (-328191424));
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-402494400000L), (long) (-13728));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-402494413728L) + "'", long2 == (-402494413728L));
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(630L, (long) (-6));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3780L) + "'", long2 == (-3780L));
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) '#', (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 36L + "'", long2 == 36L);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 5823902, (-773760), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 5823902 for  must be in the range [-773760,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-41220), 1665, (-1327011976));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -41220 for  must be in the range [1665,-1327011976]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1701, (java.lang.Object) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(2860465143528000L, 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 28604651435280000L + "'", long2 == 28604651435280000L);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-18973061545207L), (long) 164580);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -3122586469110168060");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-33L), (java.lang.Object) (-617L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(620L, (-272136L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-271516L) + "'", long2 == (-271516L));
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, (long) 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-33), 1664, 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -33 for  must be in the range [1664,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, (-35L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1031830080), (-223641600), (-5200));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 172370, 66350592L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 11436851543040");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        org.joda.time.field.FieldUtils.verifyValueBounds("", (-166400), (-217000), (-11));
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-102059), (-272136L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-374195L) + "'", long2 == (-374195L));
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-5200), (-1655), (-5823869));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-41220), (java.lang.Object) (-166731L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(18L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 18 + "'", int1 == 18);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(8344970L, 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-277588800));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 277588800 + "'", int1 == 277588800);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-18084422856192000L), 166500L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -18084422856192000 * 166500");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-52), 13728, 13741);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-41220), (-571021860), 23);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-41220) + "'", int3 == (-41220));
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-5823869), 165796, 18);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -5823869 for  must be in the range [165796,18]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(5823869);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-5823869) + "'", int1 == (-5823869));
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-32), 166720, 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -32 for hi! must be in the range [166720,10]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-11), 166400, 340473032);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1), (-11));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-12) + "'", int2 == (-12));
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(198303L, (-34847965L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35046268L + "'", long2 == 35046268L);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-275758400L), (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-275758401L) + "'", long2 == (-275758401L));
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-13));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 13 + "'", int1 == 13);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (short) 1, (-604L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 605L + "'", long2 == 605L);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 13, (-1716), (-46592000));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 13 for  must be in the range [-1716,-46592000]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 1812096, (-1386), (-166962));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1812096 for  must be in the range [-1386,-166962]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 5824000);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5824000 + "'", int1 == 5824000);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-1830387L), (-52000L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 95180124000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-3200));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-3200) + "'", int1 == (-3200));
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-5823869), (-1665), (-6));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(166400L, (long) (-46592000));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-46425600L) + "'", long2 == (-46425600L));
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1155, 0, (-4122));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 3395, (-46592000), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        org.joda.time.field.FieldUtils.verifyValueBounds("", 101, (-10), 69888);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-1664), (-420L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2084L) + "'", long2 == (-2084L));
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, 9797L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 174035, 42, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 10400, (-1700), (-125500));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(630L, 1024);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 645120L + "'", long2 == 645120L);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 340473032, 1255, (-217000));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-773760), (-166311), (-69923));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (int) '#', 571021860, 1936619520);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(174034L, 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-1153L), (long) 320);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-833L) + "'", long2 == (-833L));
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(165786, 6916, (-1655), (-5822201));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-46592000), (-113847), 18, (-166311));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-113847), (-600430L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-714277L) + "'", long2 == (-714277L));
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-125500), (-1056));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-126556) + "'", int2 == (-126556));
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 6);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(6, 3395, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(136, (-376));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-240) + "'", int2 == (-240));
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(13741, (-8));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-109928) + "'", int2 == (-109928));
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-166400), 164631, (-476), (-1716));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-10), (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-20L) + "'", long2 == (-20L));
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-46592000), 1327011840, (-1386));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -46592000 for hi! must be in the range [1327011840,-1386]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-69923), 502656L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-35147215488L) + "'", long2 == (-35147215488L));
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1716, (java.lang.Object) (-1688L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-79252992000L), 2612385L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-207039327505920000L) + "'", long2 == (-207039327505920000L));
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-3200), (-662370800));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-662374000) + "'", int2 == (-662374000));
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-139846), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-139846L) + "'", long2 == (-139846L));
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 165786, 363940, 10400);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 165786 for hi! must be in the range [363940,10400]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-376), 10, (-5823869));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(158513520, (-571021860));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 158513520 * -571021860");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-23247), 1716, (-223641600));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(1820, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 549120, (int) (byte) -1, (-210424900));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-23247), (-62832L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 39585L + "'", long2 == 39585L);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-106666560000L), (-35L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3733329600000L + "'", long2 == 3733329600000L);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(7176000, (-2612385), (-363940), (-166962));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-360860) + "'", int4 == (-360860));
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-360860), (-8), 217000);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-662370800));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-662370800) + "'", int1 == (-662370800));
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-476), 220584L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 220108L + "'", long2 == 220108L);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-1936619520), (-662370800));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1282760220758016000L + "'", long2 == 1282760220758016000L);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 43, 165796, (-46590310));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(42L, (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-42L) + "'", long2 == (-42L));
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((int) (byte) 1, 1701, (-23247), (int) ' ');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-21578) + "'", int4 == (-21578));
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-5823869), (-1655), 54945330);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(0L, (-302837704L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-302837704L) + "'", long2 == (-302837704L));
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(1820, (-23247), 10400);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1820 + "'", int3 == 1820);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 69888, 808, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(45612L, (long) (-97));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4424364) + "'", int2 == (-4424364));
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(46590310, 43);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2003383330 + "'", int2 == 2003383330);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(46590310, 1701, (-264));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(198, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-166300), 656880);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 490580 + "'", int2 == 490580);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-4122), 277588800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 277584678 + "'", int2 == 277584678);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-23247), 1820, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-6), (java.lang.Object) 112000L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-2184L), (-6189L));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13516776 + "'", int2 == 13516776);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(1828831L, (long) (-662374000));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-660545169L) + "'", long2 == (-660545169L));
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-660545169L), (-1380));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 911552333220L + "'", long2 == 911552333220L);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(19814190);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-19814190) + "'", int1 == (-19814190));
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(100L, (-2355724800L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2355724900L + "'", long2 == 2355724900L);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(277584678, 23, (-662370800), 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-384786100) + "'", int4 == (-384786100));
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-2052L), (long) 1255);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2575260) + "'", int2 == (-2575260));
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-46590310), (-56939), (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-12572) + "'", int3 == (-12572));
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-8511360L), (-264));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2246999040L + "'", long2 == 2246999040L);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 330, 0, (-520));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-139846), 0, (-23247));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(126, (-17));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 109 + "'", int2 == 109);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-166400), 320, (-384786100), 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-166080) + "'", int4 == (-166080));
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-82300608013L), (-12572));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1034683243939436L + "'", long2 == 1034683243939436L);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(1795200L, (-1907097291));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3423621056803200L) + "'", long2 == (-3423621056803200L));
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-4424364));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-4424364) + "'", int1 == (-4424364));
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        org.joda.time.field.FieldUtils.verifyValueBounds("", 166720, 136, 363940);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-1380), 0, (-1031830080));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1380 for  must be in the range [0,-1031830080]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 1327011840, (-167014), 1820);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1327011840 for  must be in the range [-167014,1820]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        org.joda.time.field.FieldUtils.verifyValueBounds("", 0, (-1386), (int) (short) 0);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-5823869), (-166720), (-46592000));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 46590310, 43);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2003383330L + "'", long2 == 2003383330L);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 3038708400000L, (java.lang.Object) 357740L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-3200), (-18200000L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 58240000000L + "'", long2 == 58240000000L);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 58782L, (java.lang.Object) 100L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-40320L), (-166400));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6709248000L + "'", long2 == 6709248000L);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-207039327505920000L), (long) (-41220));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-207039327505961220L) + "'", long2 == (-207039327505961220L));
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 10, (-21687L));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-216870) + "'", int2 == (-216870));
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(1664, (-571021860));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 1664 * -571021860");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(330L, 13741);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4534530L + "'", long2 == 4534530L);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(10, (-8), (-5324800), (-1936619520));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 136, 1828831L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1828967L + "'", long2 == 1828967L);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1155, (-1569), 1327011976);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 10400, (-34848000));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-362419200000L) + "'", long2 == (-362419200000L));
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1.0f, (java.lang.Object) (-1941944331));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1380), (java.lang.Object) (-42L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-102059));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 102059 + "'", int1 == 102059);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 23, 42, (-13));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1569), (-1155));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2724) + "'", int2 == (-2724));
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-33L), 2354711268000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2354711268033L) + "'", long2 == (-2354711268033L));
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((int) ' ', (-264));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-232) + "'", int2 == (-232));
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(46592000, 42);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 46592042 + "'", int2 == 46592042);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, (-12));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 136, (-166300), (-126556));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 136 for  must be in the range [-166300,-126556]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-5822201), (-5823869));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-11646070) + "'", int2 == (-11646070));
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-1219680000L), (-462185352000L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 460965672000L + "'", long2 == 460965672000L);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((int) '#', 340473032, (-5324800), 656880);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-482750) + "'", int4 == (-482750));
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-126556), 101, 13728);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9724 + "'", int3 == 9724);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, (-5823902));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 164631, (-3200), (-328191465));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 164631 for hi! must be in the range [-3200,-328191465]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        java.lang.Object obj0 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals(obj0, (java.lang.Object) (-223639738L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((int) (short) 1, (-92), 490580);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 490580, (java.lang.Object) (-166731L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(164580, (-240));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-39499200) + "'", int2 == (-39499200));
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-166080), 10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-166070L) + "'", long2 == (-166070L));
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-210424900), (-1386));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 291648911400L + "'", long2 == 291648911400L);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1820), (java.lang.Object) (-1380));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1, 0, 330);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-102059), (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-1820), (long) (-1664));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-156L) + "'", long2 == (-156L));
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(0, 166400, (-3200), 382786);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 166400 + "'", int4 == 166400);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 136, 46590300, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 7176000);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7176000 + "'", int1 == 7176000);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-34848000), (-662370800), 1255);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-34848000) + "'", int3 == (-34848000));
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-6), (-69923), 1664);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 100.0d, (java.lang.Object) (-604L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(198, (-476), 5823902, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-41220), 0, 3395);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -41220 for hi! must be in the range [0,3395]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-216870), (long) (-216870));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-433740L) + "'", long2 == (-433740L));
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 340473000);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 340473000 + "'", int1 == 340473000);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-328191424), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(330, 1255, 42, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(1034683243939436L, (long) (-46590310));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 1034683243939436 * -46590310");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 23, (int) (byte) 10, (-773440));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-11), (-476));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-487) + "'", int2 == (-487));
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (byte) 100, 1830484L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 183048400 + "'", int2 == 183048400);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-24752L), (-275758401L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-275783153L) + "'", long2 == (-275783153L));
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 277584678, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-376));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 376 + "'", int1 == 376);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(126, 198303, (-1031830080), 277588800);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 198429 + "'", int4 == 198429);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-328191465), (long) (-3200));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-328188265L) + "'", long2 == (-328188265L));
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-1570), 364408L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-572120560) + "'", int2 == (-572120560));
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-1941944331), (-3189327876L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1247383545L + "'", long2 == 1247383545L);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(5824000, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-773440), (-328191465), (-46592000), (-109928));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-3590394) + "'", int4 == (-3590394));
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-1386), (-1056), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1386 for  must be in the range [-1056,10]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(1936619520);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1936619520) + "'", int1 == (-1936619520));
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(0L, (long) (-139846));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 139846L + "'", long2 == 139846L);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-1327011976), 54945330, 43);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1327011976 for hi! must be in the range [54945330,43]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-46590310), 166720, 549120);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -46590310 for  must be in the range [166720,549120]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-113847), (-1570), 1820);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1447 + "'", int3 == 1447);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-1031830080));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1031830080 + "'", int1 == 1031830080);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 172370, 198429, 2003383330);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(46592000, 52, 0, 46590310);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1741 + "'", int4 == 1741);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-17), (-1936619531));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1936619548) + "'", int2 == (-1936619548));
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-33), (-5822201), (-10));
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-33), 8);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-264L) + "'", long2 == (-264L));
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-34848000), 19814190);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -34848000 * 19814190");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 23, (-1716));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-39468L) + "'", long2 == (-39468L));
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-19814190), (-1665), 1701);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-11616L), 1796L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-20862336L) + "'", long2 == (-20862336L));
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1664, 165796, (-1820));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-7176000), (long) 174035);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1248875160000L) + "'", long2 == (-1248875160000L));
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-773440), (-138217));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 106902556480L + "'", long2 == 106902556480L);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-216870), 166720);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-36156566400L) + "'", long2 == (-36156566400L));
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-272230358400L), 43);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-11705905411200L) + "'", long2 == (-11705905411200L));
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 1447);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1447 + "'", int1 == 1447);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-210424900), (-217000), (-13));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 126, (java.lang.Object) 1830400L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-166300L), (long) (-1701));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 282876300 + "'", int2 == 282876300);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(1031830080, 166720, (-1327011976));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 198, (-166311), (-35));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 198 for hi! must be in the range [-166311,-35]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(46591874L, 519680L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 47111554L + "'", long2 == 47111554L);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 277584678, (java.lang.Object) 320);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1155), (java.lang.Object) 100.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 136, (long) 97);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 233L + "'", long2 == 233L);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 2003383330, (java.lang.Object) (-571021860));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-223641600), 158513520);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-35450217234432000L) + "'", long2 == (-35450217234432000L));
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-23247), (-11));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 255717 + "'", int2 == 255717);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(166400, (-13));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 166387 + "'", int2 == 166387);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(7L, (long) (-217000));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1519000) + "'", int2 == (-1519000));
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-41220), (-12572));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 518217840L + "'", long2 == 518217840L);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1665), (-223641600), (-232), (-1936619531));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-773440));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-773440) + "'", int1 == (-773440));
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1812096, (-376), (-1569));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((int) (byte) 0, (-11646070));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-210424900));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-210424900) + "'", int1 == (-210424900));
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 101, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 101L + "'", long2 == 101L);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-1380), (-12572), 1155);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-1820L), (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1820L + "'", long2 == 1820L);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-223641600), (int) '#', (-5823902));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1327011840, 0, (-1936619531), (-41220));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1031377144) + "'", int4 == (-1031377144));
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        java.lang.Object obj1 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 233L, obj1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 126, 165786, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(0L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1907097291), 115500);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1906981791) + "'", int2 == (-1906981791));
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-1936619531), (-36156566400L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -1936619531 * -36156566400");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-8), (-216870));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1734960 + "'", int2 == 1734960);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-232), (long) (-5324800));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5324568L + "'", long2 == 5324568L);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-8), (-166720), 164631);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-8) + "'", int3 == (-8));
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(0, (-69923));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-571021860), (-102065L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-570919795L) + "'", long2 == (-570919795L));
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 136, 54945330, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(9697L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9697 + "'", int1 == 9697);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(136, 1734960, (-52), (-1936619531));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 183048400, (-105600L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 182942800L + "'", long2 == 182942800L);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(2860465143528000L, (long) (-2575260));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 2860465143528000 * -2575260");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(808);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-808) + "'", int1 == (-808));
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(1, (-21578));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-21578) + "'", int2 == (-21578));
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1665, (-167014), (-1655));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-374195L), (long) (-5200));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-379395L) + "'", long2 == (-379395L));
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-79252992000L), (java.lang.Object) 112100L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-2724), (-1086400L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2959353600L + "'", long2 == 2959353600L);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(1936619520, (-240));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 1936619520 * -240");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 9724, (int) (byte) -1, (-100));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 9724 for  must be in the range [-1,-100]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(46590300, (-1519000), (-1569));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-450092) + "'", int3 == (-450092));
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 109, (-272230358400L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-272230358291L) + "'", long2 == (-272230358291L));
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-52), 282876300, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-12572), (-102059));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-114631) + "'", int2 == (-114631));
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1664), (-69923));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-71587) + "'", int2 == (-71587));
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(95990294400L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 95990294400");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 166720, (-11), (-1941944331));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 166720 for  must be in the range [-11,-1941944331]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 32, (-1906981791), 102059);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-69923));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 69923 + "'", int1 == 69923);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-24752L), (long) (-139846));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3461468192L + "'", long2 == 3461468192L);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(0L, (long) 46590310);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 46590310L + "'", long2 == 46590310L);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1519000), 0, (-39499200));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 9724, 620L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6028880L + "'", long2 == 6028880L);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-7176000), 58240000000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-58247176000L) + "'", long2 == (-58247176000L));
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-32), (-8));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-40) + "'", int2 == (-40));
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-113847), 166400);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-18944140800L) + "'", long2 == (-18944140800L));
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(58240000L, 8620872L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 502079585280000L + "'", long2 == 502079585280000L);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 5823869, 1327011840);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 7728343117608960L + "'", long2 == 7728343117608960L);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-7176000), (-18944140800L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 18936964800L + "'", long2 == 18936964800L);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(0L, (-2052L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2052L) + "'", long2 == (-2052L));
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(233L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 233 + "'", int1 == 233);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-3590394), 0, 54945330);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 51354937 + "'", int3 == 51354937);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 5200, (long) (-264));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1372800L) + "'", long2 == (-1372800L));
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 0, (-1031377144), 46592042);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 13741, (-487), 165796);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-620L), (java.lang.Object) 255717);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-600430L), (-166962));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100248993660L + "'", long2 == 100248993660L);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-2724), 51354937, (-138217));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -2724 for  must be in the range [51354937,-138217]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        org.joda.time.field.FieldUtils.verifyValueBounds("", (-11), (-328191465), 0);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 340473032, 32, (-1570));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (byte) 10, (java.lang.Object) (-1380));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(179527L, 2612385L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 468993641895L + "'", long2 == 468993641895L);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-2575260), 36L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2575224L) + "'", long2 == (-2575224L));
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-468L), (-3423621056803200L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3423621056803668L) + "'", long2 == (-3423621056803668L));
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(549120, 46592000, 1812096, (-1936619548));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(2L, 2L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-69923), (-41220));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-111143) + "'", int2 == (-111143));
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1327011840, 549120, (-166962));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 20, (long) 376);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 396L + "'", long2 == 396L);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(69923, 46590310);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 69923 * 46590310");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }
}

