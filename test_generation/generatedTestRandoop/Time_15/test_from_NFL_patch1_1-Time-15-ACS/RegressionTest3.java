import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(808, 43, 277584678);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 808 + "'", int3 == 808);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-207039327505961220L), (long) (-1936734162));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-207039325569227058L) + "'", long2 == (-207039325569227058L));
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(7176000, (-166311));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 7176000 * -166311");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-468526481280L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -468526481280");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-3553504), (java.lang.Object) 5823902);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 102059, 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-384786100), (-374783424), 126, (-1936619548));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(5824000, 544072, (-384786135));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 340473032, 46591948, (-166400));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-3200), 5823869);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -3200 * 5823869");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-4122), (-3200), (-109928));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -4122 for hi! must be in the range [-3200,-109928]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-520));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 520 + "'", int1 == 520);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 288342622, (-340473032), 172370);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-363940), 1936617856);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-704812702512640L) + "'", long2 == (-704812702512640L));
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(502079585280000L, 112100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 502079585392100L + "'", long2 == 502079585392100L);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 0, (int) (byte) 10, (-1936619531));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for  must be in the range [10,-1936619531]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(101, (-12));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1212) + "'", int2 == (-1212));
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(0, (int) (short) 100, (-520));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-141059), 340473032, 5822300);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -141059 for hi! must be in the range [340473032,5822300]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(1741, 165796);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 288650836 + "'", int2 == 288650836);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(1820, (-482750), (-97));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-480834) + "'", int3 == (-480834));
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-3553504));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3553504 + "'", int1 == 3553504);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(0, 28291744, 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(1906981791L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-5200), (-2575260), (-520), 1941944331);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1939364392 + "'", int4 == 1939364392);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-2612385), 42, (-43), 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-19) + "'", int4 == (-19));
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 1741);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1741 + "'", int1 == 1741);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 374783424, 46304, 46592000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 374783424 for hi! must be in the range [46304,46592000]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-21687L), (java.lang.Object) (-20L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-848), 0, 1665);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 998820552, 46677556164096620L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 998820552 * 46677556164096620");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(328190018, 138217);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 328190018 * 138217");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-2181L), (long) 1741);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-440L) + "'", long2 == (-440L));
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 2365, (long) (-1653));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3909345) + "'", int2 == (-3909345));
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 9724, 2003383330L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 19480899500920");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 13741, 42, 9697);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-571021860), (long) (-1936734162));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2507756022L) + "'", long2 == (-2507756022L));
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 1939364392, 46590310L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 90355588226241520");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-1953689291), 3295694668968000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3295692715278709L + "'", long2 == 3295692715278709L);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-21700000), 109, 5822300);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1588768 + "'", int3 == 1588768);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 13741, (long) (-1936621249));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -26611112582509");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-11646070), 490580);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-11155490) + "'", int2 == (-11155490));
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-1372790), 1830475L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -2512857775250");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-22058400L), (long) 23);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-22058377L) + "'", long2 == (-22058377L));
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 138217, 291648911400L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 40310837586973800");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-1664L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1664) + "'", int1 == (-1664));
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(2L, 11L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 22 + "'", int2 == 22);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-3030955200000L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -3030955200000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(112100L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 112100 + "'", int1 == 112100);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-35450217234432000L), 460965672000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-35449756268760000L) + "'", long2 == (-35449756268760000L));
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (int) (short) 10, (-166080), (-1936619520));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-1665), (long) 70);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-116550L) + "'", long2 == (-116550L));
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-15252312), 363940);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -15252312 * 363940");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 46590300, (-1653), (-620));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-2575266), 571021860, (-655200));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -2575266 for  must be in the range [571021860,-655200]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(1701, 28458464);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 1701 * 28458464");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-1372790), (-468L));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 642465720 + "'", int2 == 642465720);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-12), 374783424, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        org.joda.time.field.FieldUtils.verifyValueBounds("", 16640000, (-5823869), 1936619533);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-220584L), (java.lang.Object) 198303);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(3395);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-3395) + "'", int1 == (-3395));
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 101, (long) (-276494400));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 276494501L + "'", long2 == 276494501L);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(630L, 51354937);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32353610310L + "'", long2 == 32353610310L);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-2612385), 773440);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2020523054400L) + "'", long2 == (-2020523054400L));
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(13, (-1665));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-21645) + "'", int2 == (-21645));
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(1L, 282219280L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 282219281L + "'", long2 == 282219281L);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(174034L, (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 174035L + "'", long2 == 174035L);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-1608), (long) (-21700000));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 34893600000L + "'", long2 == 34893600000L);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 453031164, (-384786135), (-46592000));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-384786100), (-1658), 16639480);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -384786100 for  must be in the range [-1658,16639480]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-100), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-100) + "'", int2 == (-100));
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(46592042);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-46592042) + "'", int1 == (-46592042));
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(382786);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-382786) + "'", int1 == (-382786));
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(0, (-12572), (-1327011976));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-166080), 1796L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-164284L) + "'", long2 == (-164284L));
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(46590300, (-4122), 97, (-480834));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(166501L, (long) (-7010204));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 7176705L + "'", long2 == 7176705L);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-1380), (long) (-1664));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2296320L + "'", long2 == 2296320L);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        java.lang.Object obj1 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1287004160, obj1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-2996261076L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -2996261076");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-223641600), 382873, (-45934336));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-11616L), (-57855L));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 672043680 + "'", int2 == 672043680);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 282876300, 519680L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 283395980L + "'", long2 == 283395980L);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-223641402L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-223641402) + "'", int1 == (-223641402));
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((int) (short) 0, 0, (-1655));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-165664L), 1688L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-279640832L) + "'", long2 == (-279640832L));
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1155), 571021860);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -1155 * 571021860");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(4986212893200000L, (-8));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-39889703145600000L) + "'", long2 == (-39889703145600000L));
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-39271960), (-1936619531), (-7151));
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-374195L), (-1653L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-375848L) + "'", long2 == (-375848L));
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 277584678, (-100), 182942800);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-2365), 18, (-52));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 5663563, (-1372790), 9600);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(79170L, (long) 16639480);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1317347631600L + "'", long2 == 1317347631600L);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-35147215488L), 911552333220L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 876405117732L + "'", long2 == 876405117732L);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 69888, 46304, (-620));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 69888 for hi! must be in the range [46304,-620]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-92), 43, 166387);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-1098906600L), (-166300));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 182748167580000L + "'", long2 == 182748167580000L);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-56939), 35, 13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -56939 for  must be in the range [35,13]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-4424364), (long) 164580);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-728161827120L) + "'", long2 == (-728161827120L));
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 51354937, (java.lang.Object) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 340482756, (-10955745243177119L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-10955744902694363L) + "'", long2 == (-10955744902694363L));
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 404555769888L, (java.lang.Object) 100.0f);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(3553561L, 51354937);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 182492901280657L + "'", long2 == 182492901280657L);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(1734960, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1734960) + "'", int2 == (-1734960));
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(233L, 1936735031L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1936735264L + "'", long2 == 1936735264L);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-2184L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2184) + "'", int1 == (-2184));
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-1898799L), 56100L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -106522623900");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1588768, 0, (-360860));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-340473000), (-165796), 1665);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -340473000 for hi! must be in the range [-165796,1665]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-4424364), 0, (-13));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -4424364 for  must be in the range [0,-13]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 54945330, (-46425600L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -2550869912448000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1287002560, (int) (byte) 10, 19814190);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-233), 2612385L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2612152L + "'", long2 == 2612152L);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-1326837770L), (-1248875160000L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1247548322230L + "'", long2 == 1247548322230L);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-39271960), 46677556164096620L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 46677556124824660L + "'", long2 == 46677556124824660L);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((int) (short) 1, (-166962), 46304, 288342622);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 288129358 + "'", int4 == 288129358);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-21687L), (long) (-376));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-21311L) + "'", long2 == (-21311L));
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-450092));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 450092 + "'", int1 == 450092);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-2728739960L), (long) (-2612385));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2726127575L) + "'", long2 == (-2726127575L));
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 2355724900L, (java.lang.Object) (-1569));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(1830484L, (-2575224L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -4713906328416");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-682184990), (-139846), 166720);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-73415) + "'", int3 == (-73415));
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(3395, (-1570));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1825 + "'", int2 == 1825);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-166300), 382786);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-63657311800L) + "'", long2 == (-63657311800L));
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-374195L), 58240000000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 58239625805L + "'", long2 == 58239625805L);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-1658));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1658 + "'", int1 == 1658);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-271345704448000L), (long) 363940);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -271345704448000 * 363940");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(0, (-45934336));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(490580);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-490580) + "'", int1 == (-490580));
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1655), 363940, 28291744, 773440);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-3395), 0, 340110799, 288650836);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-22058377L), (long) 1665);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -36727197705");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 51354937, 1939364392, (-17));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-520), (-5822201), (-1664));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-2020523054400L), (long) (-6190));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2020523048210L) + "'", long2 == (-2020523048210L));
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(92, (int) (short) 1, 217000);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 92 + "'", int3 == 92);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-23380), (-100));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2338000L + "'", long2 == 2338000L);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-39468L), 10410L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-49878L) + "'", long2 == (-49878L));
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(46677556164096620L, (-165433968843010560L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-118756412678913940L) + "'", long2 == (-118756412678913940L));
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-166720), (java.lang.Object) 1795200L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1144241020), 182942800, (-19814190));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-23380), (-7151));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 167190380L + "'", long2 == 167190380L);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 46590300, 43, (-1372800));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 46590300 for hi! must be in the range [43,-1372800]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 92, (long) 4784000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 440128000 + "'", int2 == 440128000);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(376);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-376) + "'", int1 == (-376));
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-448503), (-1372790), (-1936619548), (-10));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1821293) + "'", int4 == (-1821293));
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-384786135), (int) (byte) 100, (-1372790));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-71217547905000L), (long) 6);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-71217547904994L) + "'", long2 == (-71217547904994L));
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 363940, (long) 19814190);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 7211176308600");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-146920931), 217000);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-31881842027000L) + "'", long2 == (-31881842027000L));
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(111178);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-111178) + "'", int1 == (-111178));
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 46591216, (-5823902));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-271342676044832L) + "'", long2 == (-271342676044832L));
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(0, (-320));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-320) + "'", int2 == (-320));
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-1820L), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1820L) + "'", long2 == (-1820L));
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-217000), (-1664), 376);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-654) + "'", int3 == (-654));
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-52440));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52440 + "'", int1 == 52440);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(166500L, (-520000L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 686500L + "'", long2 == 686500L);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-69923L), (java.lang.Object) 220108L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-13), 277584678, (-571021860));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 808, 450092);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 363674336L + "'", long2 == 363674336L);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-19814190), (-1907097291));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -19814190 * -1907097291");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(13516776, 198400);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 13516776 * 198400");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(83161984, 382786);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 83161984 * 382786");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(1936735264L, (long) 166720);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 322892503214080L + "'", long2 == 322892503214080L);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-662374000), (-7010204));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-669384204) + "'", int2 == (-669384204));
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (byte) -1, (-272136L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 272135L + "'", long2 == 272135L);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(276494501L, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 276494601L + "'", long2 == 276494601L);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(42, (-13));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-546) + "'", int2 == (-546));
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-166300), 1588768, (-141059));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -166300 for hi! must be in the range [1588768,-141059]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-114631), (long) 549120);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-663751L) + "'", long2 == (-663751L));
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-376), 20);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-7520) + "'", int2 == (-7520));
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-34847965), (-1569), (-1653), (-34848000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-302945102000L), 1828831L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-302946930831L) + "'", long2 == (-302946930831L));
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 544072, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 544072L + "'", long2 == 544072L);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(1665, (-11));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-18315) + "'", int2 == (-18315));
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-433740L), 4986212893200000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4986212892766260L + "'", long2 == 4986212892766260L);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 126, (long) (-487));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-61362) + "'", int2 == (-61362));
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(0L, (long) (-654));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 46590310, 1936619520, (-1953689291));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-126556), (long) 165796);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -20982478576");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-156L), (java.lang.Object) (-19814190));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(1041496L, (-82300608013L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-82299566517L) + "'", long2 == (-82299566517L));
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1031830080), 8, (-233));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-46590310), 1936402650);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -46590310 * 1936402650");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 138217, (long) 87);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 138304L + "'", long2 == 138304L);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-35L), (long) (-340473000));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 11916555000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-1165L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1165) + "'", int1 == (-1165));
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(340482756, (-97), 773440);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 126036 + "'", int3 == 126036);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-21700000));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21700000 + "'", int1 == 21700000);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-46592000), (-39499200), (-217000));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-116550L), (-14560L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-101990L) + "'", long2 == (-101990L));
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-1830387L), 1796L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3287375052L) + "'", long2 == (-3287375052L));
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-46592000), 1031830080);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -46592000 * 1031830080");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-21700000));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-21700000) + "'", int1 == (-21700000));
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 2612385, (-772), 198303);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-61362), (-40), (-139846));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -61362 for  must be in the range [-40,-139846]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 5663563);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5663563 + "'", int1 == 5663563);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(3461468192L, (long) (-97));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -335762414624");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-2365), (-10), (-97));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-166400), (-4122), (-546));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1858) + "'", int3 == (-1858));
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 52440, (-384786100), 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52440 for  must be in the range [-384786100,0]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 166311, (-1701));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-282895011L) + "'", long2 == (-282895011L));
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((int) (short) 1, (-1906981791));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1906981790) + "'", int2 == (-1906981790));
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-275758401L), (-1936734162));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 534070715675194962L + "'", long2 == 534070715675194962L);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-15300L), (long) 1941944331);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1941959631L) + "'", long2 == (-1941959631L));
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(42395057614700L, (long) (-5200));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 42395057619900L + "'", long2 == 42395057619900L);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-2575260), 126036, (-682184990));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1658), 126, 136);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 135 + "'", int3 == 135);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-1665532800));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1665532800) + "'", int1 == (-1665532800));
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(111143, 1031830079, 92);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-986506979));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-986506979) + "'", int1 == (-986506979));
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-662370800), (-19814190));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 13124340881652000L + "'", long2 == 13124340881652000L);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-39271960), 28291744);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -39271960 * 28291744");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-166962), 276494601L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-276661563L) + "'", long2 == (-276661563L));
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 182942901, (-1716), (-34848000));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 182942901 for hi! must be in the range [-1716,-34848000]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 83161984, (-63657311800L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -5293868345394611200");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 46590300, 16640000);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 775262592000000L + "'", long2 == 775262592000000L);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (int) (short) 0, (-52440), 642465720);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 490580, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 490580L + "'", long2 == 490580L);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1653), 35, (-12));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-166962), (-43), 1447, 182942800);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 182774349 + "'", int4 == 182774349);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(28291744, 672043680, (-2575266), (-146920931));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-40), (long) 1588768);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1588808L) + "'", long2 == (-1588808L));
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-167014), (-1386L));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 231481404 + "'", int2 == 231481404);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-166311), (-71587));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 11905705557L + "'", long2 == 11905705557L);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-15300L), (-264L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-15564L) + "'", long2 == (-15564L));
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(0, (-3395));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(1247383545L, (-52440));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-65412793099800L) + "'", long2 == (-65412793099800L));
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-46591216), 0, 5201);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-35449756268760000L), (java.lang.Object) 8344970L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-240), 51354937, (-4122));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 182942800, 21700000, (-146920931));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 18, (-125500));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2259000L) + "'", long2 == (-2259000L));
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(2860465143528000L, (long) (-2184));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2860465143525816L + "'", long2 == 2860465143525816L);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(35046268L, 272135L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 34774133L + "'", long2 == 34774133L);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-46591216), (long) (-476));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-46590740L) + "'", long2 == (-46590740L));
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(126036, (-146920931));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-146794895) + "'", int2 == (-146794895));
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-102059), (-5823869), 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-102059) + "'", int3 == (-102059));
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-125500L), (java.lang.Object) 8331242L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(427401662688000L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 427401662688000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-1416933), (-42L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 59511186L + "'", long2 == 59511186L);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-833), (-1858));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2691) + "'", int2 == (-2691));
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(16640000);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-16640000) + "'", int1 == (-16640000));
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 0, 102059, (-1653));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for hi! must be in the range [102059,-1653]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1372790), 2003383330);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -1372790 * 2003383330");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 1031830079, 549120);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 566598532980480L + "'", long2 == 566598532980480L);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 126, 10, (-1953689291));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 126 for hi! must be in the range [10,-1953689291]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-773760), 9697, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -773760 for  must be in the range [9697,0]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 166311, (-655200), (-102059));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(0, 642465720, 186160, (-1734960));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(0L, (long) 9600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-620), (long) (-448503));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 278071860 + "'", int2 == 278071860);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-223641402), (long) 19814190);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-243455592L) + "'", long2 == (-243455592L));
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-11616L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-11616) + "'", int1 == (-11616));
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-138217), (-52));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 7187284L + "'", long2 == 7187284L);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-20L), (-23270374400L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 465407488000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(363674336L, (long) (-808));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 363673528L + "'", long2 == 363673528L);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(5200, (-662370800), (-110024), 52440);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4205 + "'", int4 == 4205);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-10955745243177119L), (-12));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 131468942918125428L + "'", long2 == 131468942918125428L);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(35977732000L, (long) (-141059));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5074982898188000L) + "'", long2 == (-5074982898188000L));
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-139846));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 139846 + "'", int1 == 139846);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-1155), (-6L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1161L) + "'", long2 == (-1161L));
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 83161984, 330L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 27443454720");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-662370800), 1812096, 382786);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-1380));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1380) + "'", int1 == (-1380));
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        org.joda.time.field.FieldUtils.verifyValueBounds("", 8480, 17, 1031830400);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 112100, (-1), (-1519000));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-382786), (-1212), 1024);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-259) + "'", int3 == (-259));
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-1936619520), 291648911400L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-293585530920L) + "'", long2 == (-293585530920L));
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-31L), (long) (-1716));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 53196L + "'", long2 == 53196L);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-125500), 198);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-24849000) + "'", int2 == (-24849000));
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-52440), 549120, 340473032, (-773440));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(5823869, (-1372790), (-2818532), 111143);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1408273) + "'", int4 == (-1408273));
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-6), (-5200), 42);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-6) + "'", int3 == (-6));
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-166962), 1, 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -166962 for hi! must be in the range [1,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-1086400L), (long) (-12));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1086412L) + "'", long2 == (-1086412L));
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, (-18315));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-21700000), 1941944331, (-1155));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(43, 70);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 113 + "'", int2 == 113);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(3295692715278709L, (long) (-384786100));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3295692330492609L + "'", long2 == 3295692330492609L);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-2575260), (long) (-487));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2574773L) + "'", long2 == (-2574773L));
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 198, 1658, (-32));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 277588800, (java.lang.Object) (-3423621056803668L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-682184990), (long) (-1519000));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1036238999810000L + "'", long2 == 1036238999810000L);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 17, 51354937, (-23247));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1820), 70, (-833));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-272136L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-272136) + "'", int1 == (-272136));
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(198, (-1664));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-329472) + "'", int2 == (-329472));
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(374783424, 113);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 374783424 * 113");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-440L), (-41220));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 18136800L + "'", long2 == 18136800L);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-572120460), 2L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-572120458L) + "'", long2 == (-572120458L));
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-23270374400L), 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-23270374400L) + "'", long2 == (-23270374400L));
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 165796, 9697);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1607723812L + "'", long2 == 1607723812L);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-210424900), 1741, 1665, 340473032);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 130048209 + "'", int4 == 130048209);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 138217, (-19814190), 52);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 138217 for  must be in the range [-19814190,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-166720), (long) 2365);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-169085L) + "'", long2 == (-169085L));
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-166962), (java.lang.Object) (-321540));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-42L), 112000L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4704000) + "'", int2 == (-4704000));
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(282221100, 1943795520, (-360860), (-1858));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-16387) + "'", int4 == (-16387));
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 1716, (-166962), (-165445));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1716 for  must be in the range [-166962,-165445]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(502079585392100L, (-2575636));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 502079585392100 * -2575636");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 382786, 198303, 3553504);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-167014), 0, 9724, (-126556));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (int) (short) 100, (int) (short) 1, (-19814191));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-4145590), (-1372800L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5518390L) + "'", long2 == (-5518390L));
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-405), (long) (-328191424));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 328191019L + "'", long2 == 328191019L);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 0, 233, 2612385);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for hi! must be in the range [233,2612385]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 198400, (-682184990), 51354937);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-2724), (-138217));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-140941) + "'", int2 == (-140941));
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 9697, 4534530L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4544227L + "'", long2 == 4544227L);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-39889703145600000L), (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-39889703145600000L) + "'", long2 == (-39889703145600000L));
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 111143, 182774349, (-2575636));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 111143 for hi! must be in the range [182774349,-2575636]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 183048400, 288650836, (-114631));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-11155490), (-10));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-11155500) + "'", int2 == (-11155500));
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-546), 17, 1134915920);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 165554, (java.lang.Object) (-1820));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 5824000, (-166400));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-969113600000L) + "'", long2 == (-969113600000L));
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 571021860, 182774349, (-328190018));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(2612385, (-986506979));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 2612385 * -986506979");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1608), (-10), (-1031377144), (-1734960));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1029643803) + "'", int4 == (-1029643803));
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-360860));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 360860 + "'", int1 == 360860);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(1658, (-1031377144));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 1658 * -1031377144");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(382873, 5200);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 388073 + "'", int2 == 388073);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-18568282492L), (long) 40769747);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-18527512745L) + "'", long2 == (-18527512745L));
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 1820, (long) (-1212));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2205840) + "'", int2 == (-2205840));
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-23380));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 23380 + "'", int1 == 23380);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-146920931));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 146920931 + "'", int1 == 146920931);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 1936402650, (-118756412678913940L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 1936402650 * -118756412678913940");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-1086400L), (-166720));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 181124608000L + "'", long2 == 181124608000L);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-164631));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 164631 + "'", int1 == 164631);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-21687L), 182748167580000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 182748167558313L + "'", long2 == 182748167558313L);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-328191465), 330, 6916);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -328191465 for  must be in the range [330,6916]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1734960, 4205, 4205);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-1155), (-546), (-2691));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1155 for  must be in the range [-546,-2691]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(1939364392, (-482750));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 1939364392 * -482750");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(1830400L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1830400 + "'", int1 == 1830400);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-21687L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-21687) + "'", int1 == (-21687));
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 0, (-482750), 382873);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 549120, (long) (-2575636));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3124756L + "'", long2 == 3124756L);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 5823902, (long) (-39271960));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -228716046387920");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(198303L, (-166720));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-33061076160L) + "'", long2 == (-33061076160L));
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-1936619548), (-3189327876L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6176514709642920048L + "'", long2 == 6176514709642920048L);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-276494400), (-275783153L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 76252497418843200");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 13516776, (long) 13516776);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 27033552L + "'", long2 == 27033552L);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        org.joda.time.field.FieldUtils.verifyValueBounds("", 198, (-5823902), 13741);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-259), (-1936734162), 388073);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 111143, 10400, (-1906981790));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 111143 for hi! must be in the range [10400,-1906981790]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(0, 382873);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 382873 + "'", int2 == 382873);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-113847), 283395980L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-32263782135060L) + "'", long2 == (-32263782135060L));
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(198400);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-198400) + "'", int1 == (-198400));
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 382873, 340473000);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 130357918929000L + "'", long2 == 130357918929000L);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 182942901, (-1904000), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(1830475L, (-217000));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-397213075000L) + "'", long2 == (-397213075000L));
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (short) 100, (java.lang.Object) (-340473032));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 8, 164631, 1936617856);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 8 for hi! must be in the range [164631,1936617856]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-7176000), (-272136), (-1380));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1941944331, (-73415), (-808));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 217000, (long) (-19814190));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-19597190L) + "'", long2 == (-19597190L));
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-1734960), (-384786135));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 667588552779600L + "'", long2 == 667588552779600L);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-10955745243177119L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -10955745243177119");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(589166720313600L, 47111554L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 589166673202046L + "'", long2 == 589166673202046L);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 1943795520, 102059);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 198381826975680L + "'", long2 == 198381826975680L);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-66365892L), (java.lang.Object) 108496899700L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 183048400, (long) (-4424364));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 187472764L + "'", long2 == 187472764L);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-21645));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21645 + "'", int1 == 21645);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (int) (byte) 0, (-43), 10);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 642465720, (-4704000), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 0, 46591216, 5200);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1686), (-40), 328190018);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 328188373 + "'", int3 == 328188373);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 0, (-16387), 0);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1447, 363940, (-223641402), 4784000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 365387 + "'", int4 == 365387);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(34774133L, (long) 1830400);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32943733L + "'", long2 == 32943733L);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-35), (-167014));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-167049) + "'", int2 == (-167049));
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 9600);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9600 + "'", int1 == 9600);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(23, 83161984);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1912725632 + "'", int2 == 1912725632);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-5822201));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5822201 + "'", int1 == 5822201);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 21645, 2612385L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 56545073325L + "'", long2 == 56545073325L);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 83161984, (-969113600000L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 83161984 * -969113600000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 3553504, (-7010204), (-376));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(138217, 17, 183048400);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 138217 + "'", int3 == 138217);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-808), (long) 288342622);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-288343430L) + "'", long2 == (-288343430L));
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-166962));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 166962 + "'", int1 == 166962);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-375848L), 2612385);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-981859677480L) + "'", long2 == (-981859677480L));
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 0, (-340473000), (-986506979));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for hi! must be in the range [-340473000,-986506979]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(4986212892766260L, (long) 32);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 159558812568520320L + "'", long2 == 159558812568520320L);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-264), (-61362), 46590300, (-572120560));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-216870), 35, 5824000, (-166400));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(14950028412L, (long) (-490580));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -7334184938358960");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(158513520, (-1327011976));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1168498456) + "'", int2 == (-1168498456));
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-728161827120L), (java.lang.Object) false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-106666560000L), (java.lang.Object) (-165445));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-232), (-73415));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-73647) + "'", int2 == (-73647));
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-264), 1936402650, (-240636100));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(1936735031L, (long) (-328190018));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -635617104685120558");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-56939), (-1936619520));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1936676459) + "'", int2 == (-1936676459));
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 3461468192L, (java.lang.Object) (-3780L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(288342622, 198429, 0, (-21687));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-7520), (java.lang.Object) (-2575224L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-166311));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-166311) + "'", int1 == (-166311));
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-1387860305661L), 18936964800L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1368923340861L) + "'", long2 == (-1368923340861L));
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-16387), 1825);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-29906275) + "'", int2 == (-29906275));
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(47111554L, (long) (-167014));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 47278568L + "'", long2 == 47278568L);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-2724), (long) (-166080));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 452401920L + "'", long2 == 452401920L);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-773440), 35046268L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-27106185521920L) + "'", long2 == (-27106185521920L));
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-109), (long) (-259));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 150L + "'", long2 == 150L);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, (-329472));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 1941944331, (long) 83161984);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 161495943383512704");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-61362), 52440, (-1936676459), 46592042);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-8922) + "'", int4 == (-8922));
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 3395, (java.lang.Object) (-23380));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-1056), 282219280L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-298023559680L) + "'", long2 == (-298023559680L));
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 158513520, (-240), (-16387));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-52), 22);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1144) + "'", int2 == (-1144));
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-102059), 6176514709642920048L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -102059 * 6176514709642920048");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1L, (java.lang.Object) (-65412793099800L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-476), (-405), (-490580), 16640000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-881) + "'", int4 == (-881));
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-40));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-40) + "'", int1 == (-40));
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-210424900), (-259));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -210424900 * -259");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(110647680L, (long) 126);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 110647554L + "'", long2 == 110647554L);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 330, 6709248000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-6709247670L) + "'", long2 == (-6709247670L));
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-140941), 35, (-773440), 1658);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-140906) + "'", int4 == (-140906));
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-321540), (-140941), 3553504, (-198400));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 340110799, 42, (-183048400));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-1678L), (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1678L) + "'", long2 == (-1678L));
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1820, 111143, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(1828831L, (long) (-2575260));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -4709715321060");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 1820, (-328188265L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -597302642300");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-405), 5823902);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5823497 + "'", int2 == 5823497);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-21700000), (long) 277584678);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-299284678L) + "'", long2 == (-299284678L));
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-5324800), 79170L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -421564416000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(549120, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 54912000 + "'", int2 == 54912000);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(69888, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 69889 + "'", int2 == 69889);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(18);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-18) + "'", int1 == (-18));
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-4704000), 100248993660L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-100253697660L) + "'", long2 == (-100253697660L));
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-113847), 174070, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(23, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2231 + "'", int2 == 2231);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-4145590), (-164631), 102059, (-1372790));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-46590310));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-46590310) + "'", int1 == (-46590310));
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 70, (-166390L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-11647300L) + "'", long2 == (-11647300L));
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(440128000, (-1168498456));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 440128000 * -1168498456");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-2612385), (long) (-2132));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2610253L) + "'", long2 == (-2610253L));
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        java.lang.Object obj1 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 4544227L, obj1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 3038708400000L, (java.lang.Object) 5824000);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-480834), 288129358, (-232));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-102059), (-65412793099800L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 65412792997741L + "'", long2 == 65412792997741L);
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(229775129L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 229775129 + "'", int1 == 229775129);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 21645, 1653, (-328190018));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(5823869, (-328190018));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-322366149) + "'", int2 == (-322366149));
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-165446L), (long) (-328191424));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 54297958335104L + "'", long2 == 54297958335104L);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 9600, 775262592000000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 775262592009600L + "'", long2 == 775262592009600L);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((int) (byte) -1, 328190018, 278071860, (-1653));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-476), (-848), 172370);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-19814191));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 19814191 + "'", int1 == 19814191);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-109928));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-109928) + "'", int1 == (-109928));
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-39271960));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 39271960 + "'", int1 == 39271960);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-109928), (long) 198303);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-21799052184L) + "'", long2 == (-21799052184L));
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-340473032));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-340473032) + "'", int1 == (-340473032));
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-808), 11905705557L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 11905704749L + "'", long2 == 11905704749L);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (int) '#', 672043680, (-19814191));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for  must be in the range [672043680,-19814191]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, (long) 13741);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 70, (java.lang.Object) (-572120560));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(282876300, 453031164, (-73415), 52440);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 27432 + "'", int4 == 27432);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(1825, 382786);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 698584450 + "'", int2 == 698584450);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(32943733L, 8331242L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 274462212006386");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-38261404970880000L), 2031483509540L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -38261404970880000 * 2031483509540");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 656880, (-1858), 217000);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-6), 9600, (-1936621249), 42);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1936611698) + "'", int4 == (-1936611698));
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(277588800, (-1906981791), 255717);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-202903478) + "'", int3 == (-202903478));
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 1031830080, (long) 21700000);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 22390712736000000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-56939), (-32263782135060L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1837067490988181340L + "'", long2 == 1837067490988181340L);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(288129358, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 288129410 + "'", int2 == 288129410);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(42, (-382786));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-382744) + "'", int2 == (-382744));
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-2205840), (-2052L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 4526383680");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 198303, 100248993660L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-100248795357L) + "'", long2 == (-100248795357L));
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-1655), (long) (-1936676459));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3205199539645L + "'", long2 == 3205199539645L);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-382744), (-655200));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 250773868800L + "'", long2 == 250773868800L);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-448503), 19814520L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -8886871663560");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1034683243939436L, (java.lang.Object) (-165433968843010560L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(1825, (-1734960), 164631);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1825 + "'", int3 == 1825);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-662370800));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 662370800 + "'", int1 == 662370800);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-4122), 0, (-881));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -4122 for  must be in the range [0,-881]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 83161984, (-571021860), 46590300);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-5822201), 198400, (-328190018));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-328191465), (-1416933), (-1608));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 288129410, (int) '#', (-546));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(62000L, (long) (-92));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 61908L + "'", long2 == 61908L);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-286596024L), (java.lang.Object) 58240000000L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-1569));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1569 + "'", int1 == 1569);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(1906981791L, (long) (-5823902));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1901157889L + "'", long2 == 1901157889L);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(283395980L, (-21799052184L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-6177763756755820320L) + "'", long2 == (-6177763756755820320L));
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 656880, (-320), 111143);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 158513520, (java.lang.Object) 282219280L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-969113600000L), 427401662688000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-428370776288000L) + "'", long2 == (-428370776288000L));
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-34848000));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-34848000) + "'", int1 == (-34848000));
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-116550L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-116550) + "'", int1 == (-116550));
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(7176000, (-7176000), (-255717));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-6664568) + "'", int3 == (-6664568));
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-360860), (-10955745243177119L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-10955745243537979L) + "'", long2 == (-10955745243537979L));
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 166720, (-46425600L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-7740076032000L) + "'", long2 == (-7740076032000L));
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-655200), (int) (byte) 10, (-45934336));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -655200 for  must be in the range [10,-45934336]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }
}

