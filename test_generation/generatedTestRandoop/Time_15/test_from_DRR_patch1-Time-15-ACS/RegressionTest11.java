import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest11 {

    public static boolean debug = false;

    @Test
    public void test5501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5501");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 6920409, (-1569), (-141059));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5502");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(11646070, (-549215), 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-437166) + "'", int3 == (-437166));
    }

    @Test
    public void test5503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5503");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 19673131, 166311, 174070);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 19673131 for  must be in the range [166311,174070]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5504");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-36248L), (-1327011976));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 48101530106048L + "'", long2 == 48101530106048L);
    }

    @Test
    public void test5505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5505");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(6664568, (-382786));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6281782 + "'", int2 == 6281782);
    }

    @Test
    public void test5506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5506");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-1273541), (long) 216990);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1490531L) + "'", long2 == (-1490531L));
    }

    @Test
    public void test5507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5507");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(36500L, 2742917);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100116470500L + "'", long2 == 100116470500L);
    }

    @Test
    public void test5508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5508");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-5819836), 3075665, 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5509");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(0, 6467420);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5510");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-572124582), 229776870L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -131460995702018340");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5511");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-35822));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-35822) + "'", int1 == (-35822));
    }

    @Test
    public void test5512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5512");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-16171840));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 16171840 + "'", int1 == 16171840);
    }

    @Test
    public void test5513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5513");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(23380, (-1655), (-7520));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5514");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-2691), 16397170);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -2691 * 16397170");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5515");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 2365, (-69107589846000L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -163439449985790000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5516");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(667588552779600L, 1588808);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 667588552779600 * 1588808");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5517");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-17505096832665L), (-21700L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 379860601268830500L + "'", long2 == 379860601268830500L);
    }

    @Test
    public void test5518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5518");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 130357918929000L, (java.lang.Object) 277584678);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5519");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-4145590), (-1459701), 17360085, 1936619533);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1913654158 + "'", int4 == 1913654158);
    }

    @Test
    public void test5520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5520");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((int) (byte) 0, 46591948);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 46591948 + "'", int2 == 46591948);
    }

    @Test
    public void test5521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5521");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(2109729L, (long) 1049356059);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1047246330L) + "'", long2 == (-1047246330L));
    }

    @Test
    public void test5522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5522");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 4205, 95990294400L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 95990298605L + "'", long2 == 95990298605L);
    }

    @Test
    public void test5523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5523");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(775262592000000L, (long) 330);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 255836655360000000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5524");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(62287089798569600L, (-334369698702L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 62287424168268302L + "'", long2 == 62287424168268302L);
    }

    @Test
    public void test5525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5525");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1700), (int) (byte) 10, 1938205016);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5526");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(340473042, (-18), 241744);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 70738 + "'", int3 == 70738);
    }

    @Test
    public void test5527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5527");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 59200440);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 59200440 + "'", int1 == 59200440);
    }

    @Test
    public void test5528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5528");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 2575260, 575356732, (-400193578));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5529");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(0L, 5310200240L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5310200240L + "'", long2 == 5310200240L);
    }

    @Test
    public void test5530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5530");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-3909345));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-3909345) + "'", int1 == (-3909345));
    }

    @Test
    public void test5531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5531");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(612448L, (long) 186160);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 426288L + "'", long2 == 426288L);
    }

    @Test
    public void test5532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5532");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-443092536), (java.lang.Object) 28313641);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5533");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(285287521L, (-19814180));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5652738292847780L) + "'", long2 == (-5652738292847780L));
    }

    @Test
    public void test5534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5534");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-302946930831L), (-54109169395200L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 53806222464369L + "'", long2 == 53806222464369L);
    }

    @Test
    public void test5535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5535");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(1828831L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1828831 + "'", int1 == 1828831);
    }

    @Test
    public void test5536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5536");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-9379193), 1655891183, (-21091));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5537");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1936619520), 240);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1936619280) + "'", int2 == (-1936619280));
    }

    @Test
    public void test5538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5538");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1659032, 5691497, 42332787);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5539");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 2205840, 283395980, 808);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5540");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(229775129);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-229775129) + "'", int1 == (-229775129));
    }

    @Test
    public void test5541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5541");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1416933), 8751, 4763852, (-6916));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5542");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-18288012L), (long) (-340473032));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6226574894892384L + "'", long2 == 6226574894892384L);
    }

    @Test
    public void test5543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5543");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(229775129, 196601, 808);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5544");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 233, (java.lang.Object) 1956434040L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5545");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(81001186877280L, 283395980);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 81001186877280 * 283395980");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5546");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-549120), (-102065));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-651185) + "'", int2 == (-651185));
    }

    @Test
    public void test5547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5547");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 2132760, (-12277454112000L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 2132760 * -12277454112000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5548");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-106463163900166150L), (long) (-1700));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -106463163900166150 * -1700");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5549");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-510392354));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 510392354 + "'", int1 == 510392354);
    }

    @Test
    public void test5550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5550");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 520, 255734915, (-772));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5551");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-5835), (-5822300));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -5835 * -5822300");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5552");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(374610515, 363940, 166311, 125500);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5553");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-439504642500L), 379860601268830500L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -439504642500 * 379860601268830500");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5554");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-1653), (-363686), (-14088778));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1653 for hi! must be in the range [-363686,-14088778]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5555");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(509251392);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-509251392) + "'", int1 == (-509251392));
    }

    @Test
    public void test5556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5556");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-1664), (-158513520), (-1953689291));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1664 for hi! must be in the range [-158513520,-1953689291]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5557");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-86668494), 166962, (-1172644011), 13);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-86501532) + "'", int4 == (-86501532));
    }

    @Test
    public void test5558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5558");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 172370, 2369834, 126036);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 172370 for hi! must be in the range [2369834,126036]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5559");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(73100, 5822300);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5895400 + "'", int2 == 5895400);
    }

    @Test
    public void test5560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5560");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(28291744);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-28291744) + "'", int1 == (-28291744));
    }

    @Test
    public void test5561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5561");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(1158740L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1158740 + "'", int1 == 1158740);
    }

    @Test
    public void test5562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5562");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-42L), (-36476179437632L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1531999536380544L + "'", long2 == 1531999536380544L);
    }

    @Test
    public void test5563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5563");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-11616L), 5335);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-61971360L) + "'", long2 == (-61971360L));
    }

    @Test
    public void test5564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5564");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-18869738940L), (-152647769));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2880423550803424860L + "'", long2 == 2880423550803424860L);
    }

    @Test
    public void test5565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5565");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 0, 897523126, (-576345213));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for  must be in the range [897523126,-576345213]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5566");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-389231435L), (java.lang.Object) 0L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5567");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(136);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-136) + "'", int1 == (-136));
    }

    @Test
    public void test5568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5568");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-11615), (-602897274));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-602908889) + "'", int2 == (-602908889));
    }

    @Test
    public void test5569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5569");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(0, 4440, (-5414543), (-183048400));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5570");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(167190380L, (long) 244529718);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 411720098L + "'", long2 == 411720098L);
    }

    @Test
    public void test5571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5571");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-23247), (-259967), 241744, (-4755348));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5572");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 570849583, (-101990), (-1941959631));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5573");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-329848), (int) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-32984800L) + "'", long2 == (-32984800L));
    }

    @Test
    public void test5574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5574");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-651185), (java.lang.Object) 1168498456);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5575");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1665505400), (-960614882), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5576");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(6664568);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-6664568) + "'", int1 == (-6664568));
    }

    @Test
    public void test5577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5577");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-6191L), (-766901329920L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 766901323729L + "'", long2 == 766901323729L);
    }

    @Test
    public void test5578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5578");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(1546990, (-1821));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1545169 + "'", int2 == 1545169);
    }

    @Test
    public void test5579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5579");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(1075534894053656224L, (-654));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 1075534894053656224 * -654");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5580");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 490580, (-2611241), (-5377));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5581");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-600993384), (-7151));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-601000535) + "'", int2 == (-601000535));
    }

    @Test
    public void test5582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5582");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-100253697660L), (long) (-46591216));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 4670941682475754560");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5583");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-19));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 19 + "'", int1 == 19);
    }

    @Test
    public void test5584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5584");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 998548417, (long) 2321807);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2318436704429519L + "'", long2 == 2318436704429519L);
    }

    @Test
    public void test5585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5585");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(244532442, (-9742), (-252380));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5586");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 5823802, (-56939), (-20));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 5823802 for hi! must be in the range [-56939,-20]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5587");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 164631, (-360860), (-16171805));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5588");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 39045261, 59984899845371631L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 39045261 * 59984899845371631");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5589");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-272230358291L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -272230358291");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5590");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(19L, 51906734008798487L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 51906734008798506L + "'", long2 == 51906734008798506L);
    }

    @Test
    public void test5591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5591");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-257558));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-257558) + "'", int1 == (-257558));
    }

    @Test
    public void test5592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5592");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 182672284, (java.lang.Object) (-1664));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5593");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-4267L), (-4624757165700L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4624757169967L) + "'", long2 == (-4624757169967L));
    }

    @Test
    public void test5594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5594");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, (-4624757165700L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test5595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5595");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(126763, 282221644, (-32384));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5596");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-2576517), 2742917, 1701);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5597");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-386032), 690513347);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -386032 * 690513347");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5598");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-384786135), 2231);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-384783904) + "'", int2 == (-384783904));
    }

    @Test
    public void test5599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5599");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-382744), 5823497, (-394197374));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5600");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-111178), (long) 2608990);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-290062290220L) + "'", long2 == (-290062290220L));
    }

    @Test
    public void test5601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5601");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-19340645), 111143);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -19340645 * 111143");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5602");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(1158740, (-363686), 5823902);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1158740 + "'", int3 == 1158740);
    }

    @Test
    public void test5603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5603");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 681704, (long) 89317);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 771021L + "'", long2 == 771021L);
    }

    @Test
    public void test5604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5604");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(176859943, (-166400));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 176859943 * -166400");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5605");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(282221100, (-5601384), (-2600000));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-2910475) + "'", int3 == (-2910475));
    }

    @Test
    public void test5606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5606");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-289979344), 387, 112000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -289979344 for hi! must be in the range [387,112000]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5607");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(453031164, 1828831, 328188373, (-376));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5608");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-5547853070320L), (-962820024L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5546890250296L) + "'", long2 == (-5546890250296L));
    }

    @Test
    public void test5609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5609");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 282221100, (long) (-71587));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 282292687L + "'", long2 == 282292687L);
    }

    @Test
    public void test5610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5610");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 405876, (long) (-6));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 405882L + "'", long2 == 405882L);
    }

    @Test
    public void test5611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5611");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-232), 19814241);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -232 * 19814241");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5612");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 1997810969, (-59200440), (-24849000));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1997810969 for hi! must be in the range [-59200440,-24849000]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5613");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(99319L, (long) (-5823497));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5922816L + "'", long2 == 5922816L);
    }

    @Test
    public void test5614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5614");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 182672284, 329472);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 60185402754048L + "'", long2 == 60185402754048L);
    }

    @Test
    public void test5615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5615");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-602897274));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-602897274) + "'", int1 == (-602897274));
    }

    @Test
    public void test5616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5616");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1273541), (-1655), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5617");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-98052712), (-9742));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -98052712 * -9742");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5618");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(1906981791L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1906981791 + "'", int1 == 1906981791);
    }

    @Test
    public void test5619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5619");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(3395, (-6131328));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 3395 * -6131328");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5620");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-39844), (-2241633));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -39844 * -2241633");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5621");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 510392354, 14603626, 1048);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5622");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1408273), 108350, 190407252);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5623");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-41816637951407800L), 7431);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -41816637951407800 * 7431");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5624");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-662368976));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 662368976 + "'", int1 == 662368976);
    }

    @Test
    public void test5625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5625");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 255734915, (long) 1418328476);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 362716112251939540L + "'", long2 == 362716112251939540L);
    }

    @Test
    public void test5626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5626");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 38152128, (-12978075), (-2049076));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 38152128 for hi! must be in the range [-12978075,-2049076]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5627");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (int) '4', 1830400, 102065);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5628");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 510392354, (-5273571217397244630L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 510392354 * -5273571217397244630");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5629");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(3099603200L, (long) 5657149);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 17534917143276800L + "'", long2 == 17534917143276800L);
    }

    @Test
    public void test5630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5630");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 81882, 466944L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-385062L) + "'", long2 == (-385062L));
    }

    @Test
    public void test5631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5631");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(0L, (-553170638108079L));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5632");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(1407261);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1407261) + "'", int1 == (-1407261));
    }

    @Test
    public void test5633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5633");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-7740076032000L), 612257);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4738915731124224000L) + "'", long2 == (-4738915731124224000L));
    }

    @Test
    public void test5634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5634");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 33280040, (-288142039), 29906275);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 33280040 for  must be in the range [-288142039,29906275]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5635");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1081264), (-13741), (-114533510), (-28291744));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-87336772) + "'", int4 == (-87336772));
    }

    @Test
    public void test5636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5636");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-272136), 11032583, 1155);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -272136 for  must be in the range [11032583,1155]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5637");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(3433626L, (long) (-15623));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-53643538998L) + "'", long2 == (-53643538998L));
    }

    @Test
    public void test5638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5638");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(672043680, (-1688));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 672041992 + "'", int2 == 672041992);
    }

    @Test
    public void test5639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5639");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 32313684, (-170566), 8751);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32313684 for hi! must be in the range [-170566,8751]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5640");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 38756, (-166300L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 205056L + "'", long2 == 205056L);
    }

    @Test
    public void test5641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5641");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(79170L, 1317347631600L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1317347710770L + "'", long2 == 1317347710770L);
    }

    @Test
    public void test5642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5642");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(33597060L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 33597060L + "'", long2 == 33597060L);
    }

    @Test
    public void test5643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5643");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(0, (-1204293925), 490580, 8620872);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7119732 + "'", int4 == 7119732);
    }

    @Test
    public void test5644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5644");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(5212268840011310L, 182942800);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 5212268840011310 * 182942800");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5645");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-120555372), (-387), 17880122);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5646");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(460965811846L, (long) 22);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10141247860612L + "'", long2 == 10141247860612L);
    }

    @Test
    public void test5647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5647");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(1935946925, (-163128730));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1772818195 + "'", int2 == 1772818195);
    }

    @Test
    public void test5648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5648");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-10L), (-420));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4200L + "'", long2 == 4200L);
    }

    @Test
    public void test5649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5649");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-4986212925513684L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -4986212925513684");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5650");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-30542258L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-30542258) + "'", int1 == (-30542258));
    }

    @Test
    public void test5651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5651");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 656647, (-14931288), 5691497);
    }

    @Test
    public void test5652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5652");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(520);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-520) + "'", int1 == (-520));
    }

    @Test
    public void test5653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5653");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-46759049), (-95180800), 282221644);
    }

    @Test
    public void test5654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5654");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-2951472446795L), (java.lang.Object) 23380);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5655");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-72171));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 72171 + "'", int1 == 72171);
    }

    @Test
    public void test5656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5656");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-139517), 40769747, 182942901);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5657");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(605L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 605 + "'", int1 == 605);
    }

    @Test
    public void test5658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5658");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-2413217), (-509251392));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1228934116448064L + "'", long2 == 1228934116448064L);
    }

    @Test
    public void test5659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5659");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-602897384), 297095885, 73100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -602897384 for  must be in the range [297095885,73100]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5660");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 1664, 1262346327, (-546));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1664 for  must be in the range [1262346327,-546]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5661");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(1407805L, 11631100053427187L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 11631100054834992L + "'", long2 == 11631100054834992L);
    }

    @Test
    public void test5662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5662");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-5683818), (long) (-329472));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1872658884096L + "'", long2 == 1872658884096L);
    }

    @Test
    public void test5663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5663");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-18944141068L), (java.lang.Object) (-285L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5664");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1907097291), 698582630, (-233));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5665");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, (-360705));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test5666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5666");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-35L), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-35L) + "'", long2 == (-35L));
    }

    @Test
    public void test5667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5667");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, (long) 216047235);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test5668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5668");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1936980731), (-71451), 1447, (-35));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5669");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(282219280L, (long) (-136));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 282219416L + "'", long2 == 282219416L);
    }

    @Test
    public void test5670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5670");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-328190018), 13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -328190018 * 13");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5671");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-549120), (-71451));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -549120 * -71451");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5672");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(51906734008798506L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 51906734008798506");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5673");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-301227), 0, (-2035584045));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5674");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 1849, 142556562);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 263587083138L + "'", long2 == 263587083138L);
    }

    @Test
    public void test5675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5675");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-2324166), 5381395931396L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5381398255562L) + "'", long2 == (-5381398255562L));
    }

    @Test
    public void test5676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5676");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-282895011L), (long) (-52));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 14710540572L + "'", long2 == 14710540572L);
    }

    @Test
    public void test5677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5677");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1447, 1250658487, (-74897), (-15097688));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5678");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(1653, (-18923432), (-61362));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-18860418) + "'", int3 == (-18860418));
    }

    @Test
    public void test5679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5679");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-30542258), (-229775129), 0);
    }

    @Test
    public void test5680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5680");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(11631100054834992L, (-156L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -1814451608554258752");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5681");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(14603626, 278071860);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 292675486 + "'", int2 == 292675486);
    }

    @Test
    public void test5682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5682");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(202903478, (-9228320));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 202903478 * -9228320");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5683");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-107135337), 231481279, (-409635100));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -107135337 for  must be in the range [231481279,-409635100]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5684");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 297095885, 2724, 255734915);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5685");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(5381396095680L, (int) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 188348863348800L + "'", long2 == 188348863348800L);
    }

    @Test
    public void test5686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5686");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 5691497, (-122093), (-566300680));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5687");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(33280040, 1981424100, (-3590394), (-16171805));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5688");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(201224, (-38056), (-328191465));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5689");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-2132), (-69888));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-72020) + "'", int2 == (-72020));
    }

    @Test
    public void test5690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5690");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-172370), 14931288, (-223641600));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5691");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 42, (-846264987), 46304);
    }

    @Test
    public void test5692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5692");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-7520), (-21700000), (-16171805));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -7520 for hi! must be in the range [-21700000,-16171805]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5693");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1003875531), 490580, (-1165), 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1141) + "'", int4 == (-1141));
    }

    @Test
    public void test5694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5694");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(2575260, (-73100));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 2575260 * -73100");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5695");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(428453708, (-277588800));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 150864908 + "'", int2 == 150864908);
    }

    @Test
    public void test5696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5696");
        org.joda.time.field.FieldUtils.verifyValueBounds("", 42, (-45580515), 9697);
    }

    @Test
    public void test5697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5697");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 138217, (-18869738940L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -2608118707069980");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5698");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-1936734162));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1936734162 + "'", int1 == 1936734162);
    }

    @Test
    public void test5699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5699");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1820), (-5777193), (-2521467), (-182942901));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5700");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(549120, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5701");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 1700, (long) 400193578);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 400195278L + "'", long2 == 400195278L);
    }

    @Test
    public void test5702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5702");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-6131328));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6131328 + "'", int1 == 6131328);
    }

    @Test
    public void test5703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5703");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 283395980, 234467584000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-234184188020L) + "'", long2 == (-234184188020L));
    }

    @Test
    public void test5704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5704");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-264), 1418328476, 1825994);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -264 for  must be in the range [1418328476,1825994]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5705");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 1912771936, (-18521676));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-35427742060484736L) + "'", long2 == (-35427742060484736L));
    }

    @Test
    public void test5706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5706");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-2910475), (-2742917), (-340482756));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5707");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-51354937), (-46593862L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2392824847596694L + "'", long2 == 2392824847596694L);
    }

    @Test
    public void test5708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5708");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-184775552), (int) (short) 10, 233);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5709");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(28604651435280000L, (long) (-36248));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 28604651435316248L + "'", long2 == 28604651435316248L);
    }

    @Test
    public void test5710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5710");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(1247383545L, (long) (-54300));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1247329245L + "'", long2 == 1247329245L);
    }

    @Test
    public void test5711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5711");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-38261404970880000L), 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test5712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5712");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1936619520), (-233), 43, (-1407261));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5713");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-166400), 292675486);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 292509086 + "'", int2 == 292509086);
    }

    @Test
    public void test5714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5714");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-2521467), 182774349);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-460859489449983L) + "'", long2 == (-460859489449983L));
    }

    @Test
    public void test5715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5715");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-141344), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-141344) + "'", int2 == (-141344));
    }

    @Test
    public void test5716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5716");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-32984800L), (-402494400000L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-402527384800L) + "'", long2 == (-402527384800L));
    }

    @Test
    public void test5717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5717");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(1659081147, 5822300);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1664903447 + "'", int2 == 1664903447);
    }

    @Test
    public void test5718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5718");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-258017760L), (-19832502560000L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 19832244542240L + "'", long2 == 19832244542240L);
    }

    @Test
    public void test5719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5719");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-114631), 6815443);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6700812 + "'", int2 == 6700812);
    }

    @Test
    public void test5720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5720");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-1225958), 166300, (-18842291));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1225958 for  must be in the range [166300,-18842291]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5721");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1031830081), 0, 672043680);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 312257281 + "'", int3 == 312257281);
    }

    @Test
    public void test5722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5722");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(3553504);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-3553504) + "'", int1 == (-3553504));
    }

    @Test
    public void test5723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5723");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 1688, (-111043), (-1665532832));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1688 for  must be in the range [-111043,-1665532832]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5724");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 136, (-2297893136L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-312513466496L) + "'", long2 == (-312513466496L));
    }

    @Test
    public void test5725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5725");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(372715995191182678L, (long) (-21700000));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 372715995212882678L + "'", long2 == 372715995212882678L);
    }

    @Test
    public void test5726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5726");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 1729829652, (-20013124L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1749842776L + "'", long2 == 1749842776L);
    }

    @Test
    public void test5727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5727");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1828967, 233, (-1144));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5728");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-2728739960L), (long) (-1734960));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2730474920L) + "'", long2 == (-2730474920L));
    }

    @Test
    public void test5729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5729");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1327011976), 1155, (-13), (-97));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5730");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-9379193), (-7010204), (-13741));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -9379193 for  must be in the range [-7010204,-13741]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5731");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-363940), 0, 165796, (-328191424));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5732");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 282221644, (long) 216990);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 61239274531560");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5733");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-259), (long) 2369834);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-613787006) + "'", int2 == (-613787006));
    }

    @Test
    public void test5734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5734");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 112000, (java.lang.Object) (-1942556685L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5735");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-213612), (-10587), (-166080));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -213612 for hi! must be in the range [-10587,-166080]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5736");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(51354937, 1031830168, (-22070));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5737");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-571021860), (long) (-2691));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-571019169L) + "'", long2 == (-571019169L));
    }

    @Test
    public void test5738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5738");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-328358386), (-382786), (-11), 1031830168);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 703089008 + "'", int4 == 703089008);
    }

    @Test
    public void test5739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5739");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(998548417, 363940);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 998912357 + "'", int2 == 998912357);
    }

    @Test
    public void test5740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5740");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(450092, 726, 16171840, 83161984);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 67440963 + "'", int4 == 67440963);
    }

    @Test
    public void test5741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5741");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(7176000, (-1031830081), (-5823497), (-8));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-5543331) + "'", int4 == (-5543331));
    }

    @Test
    public void test5742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5742");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(5823902);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-5823902) + "'", int1 == (-5823902));
    }

    @Test
    public void test5743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5743");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-8), (-487), (-76699));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5744");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1031830081), 112042, 1660208598);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5745");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (int) (byte) 0, 487, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for hi! must be in the range [487,0]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5746");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-21687), 1913654158, 102059);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5747");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 320, 24735138, 4785716);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5748");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-386032), (long) 5657149);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5271117L + "'", long2 == 5271117L);
    }

    @Test
    public void test5749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5749");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 28313641, 0, 182672284);
    }

    @Test
    public void test5750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5750");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 323019034, 450092, 193499963);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 323019034 for  must be in the range [450092,193499963]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5751");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-167014), 1, (-101990), 39045261);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 38980239 + "'", int4 == 38980239);
    }

    @Test
    public void test5752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5752");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 292675486, (long) 288321044);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 84384501676727384L + "'", long2 == 84384501676727384L);
    }

    @Test
    public void test5753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5753");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(502079582669747L, 4986212893744880L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 502079582669747 * 4986212893744880");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5754");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(372715995212882678L, (-207039327503308759L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 165676667709573919L + "'", long2 == 165676667709573919L);
    }

    @Test
    public void test5755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5755");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-17505097288390L), (long) (-1031830079));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-17504065458311L) + "'", long2 == (-17504065458311L));
    }

    @Test
    public void test5756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5756");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(1327011840, (-46593806));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 1327011840 * -46593806");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5757");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-36248), 164472, (-328188373), (-2576517));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-325483633) + "'", int4 == (-325483633));
    }

    @Test
    public void test5758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5758");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-40), (-6664568), (-277584678));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5759");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-95180800), 906915715);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -95180800 * 906915715");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5760");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-1809202293192L), (long) 6916);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1809202286276L) + "'", long2 == (-1809202286276L));
    }

    @Test
    public void test5761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5761");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-293585530920L), (-17505096832665L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -293585530920 * -17505096832665");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5762");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-86501532), 1997810969, (-183206672));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -86501532 for hi! must be in the range [1997810969,-183206672]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5763");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-223641402), 518217840L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-741859242L) + "'", long2 == (-741859242L));
    }

    @Test
    public void test5764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5764");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-1906982847L), 617886297600L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -1906982847 * 617886297600");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5765");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-117717870), (long) 81366);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -9578232210420");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5766");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1049377704, (-1936980731), 1570);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5767");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 97, (-223641600), 612257);
    }

    @Test
    public void test5768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5768");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-4145555));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4145555 + "'", int1 == 4145555);
    }

    @Test
    public void test5769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5769");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 202680927, 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test5770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5770");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-386032), 672043680, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5771");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-5989020));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5989020 + "'", int1 == 5989020);
    }

    @Test
    public void test5772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5772");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(1158740, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1158792 + "'", int2 == 1158792);
    }

    @Test
    public void test5773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5773");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(662370800, 278071860);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 662370800 * 278071860");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5774");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-166400), (-1858), (-76066913));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5775");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(409635100, (-2241633));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 407393467 + "'", int2 == 407393467);
    }

    @Test
    public void test5776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5776");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(176859943);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-176859943) + "'", int1 == (-176859943));
    }

    @Test
    public void test5777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5777");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(6916, (-111178), 40769747);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6916 + "'", int3 == 6916);
    }

    @Test
    public void test5778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5778");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-61362), 11587643);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -61362 * 11587643");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5779");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(137756300, 288129358, (-240636100));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5780");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-164631), 1812096);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1647465 + "'", int2 == 1647465);
    }

    @Test
    public void test5781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5781");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(373378350L, (long) 54912000);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 428290350L + "'", long2 == 428290350L);
    }

    @Test
    public void test5782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5782");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-428370776648705L), (long) 112000);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-428370776760705L) + "'", long2 == (-428370776760705L));
    }

    @Test
    public void test5783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5783");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-111043), (java.lang.Object) 4544227L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5784");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-1588808));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1588808) + "'", int1 == (-1588808));
    }

    @Test
    public void test5785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5785");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1743480114L), (java.lang.Object) (-5835));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5786");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-4145590), 201224, (-340482756), 113);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-3944366) + "'", int4 == (-3944366));
    }

    @Test
    public void test5787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5787");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(282219316L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 282219316 + "'", int1 == 282219316);
    }

    @Test
    public void test5788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5788");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1287004160, (-7431), 110);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5789");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 26046, (-662395510), (-102065));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26046 for hi! must be in the range [-662395510,-102065]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5790");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 303339373, 81366, 14603626);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 303339373 for hi! must be in the range [81366,14603626]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5791");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 1158740, (long) 101);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1158639L + "'", long2 == 1158639L);
    }

    @Test
    public void test5792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5792");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 440122800, 1741, 906915715);
    }

    @Test
    public void test5793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5793");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 16397170, (-19814190), 1327011840);
    }

    @Test
    public void test5794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5794");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(150611397144948960L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 150611397144948960");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5795");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, (long) 774641);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test5796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5796");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(17, 88750812, 166962);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5797");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-443415178), 9697, 328188373, (-12978075));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5798");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(2205840, (-698890));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1506950 + "'", int2 == 1506950);
    }

    @Test
    public void test5799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5799");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(149, 0, 288321044);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 149 + "'", int3 == 149);
    }

    @Test
    public void test5800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5800");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-40891121L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-40891121) + "'", int1 == (-40891121));
    }

    @Test
    public void test5801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5801");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-257558), (-1372790), 1372800);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-257558) + "'", int3 == (-257558));
    }

    @Test
    public void test5802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5802");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 0, 4785716, 2899479);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5803");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-5543331));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5543331 + "'", int1 == 5543331);
    }

    @Test
    public void test5804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5804");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-384783904), (-46593806));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 17928546574898624L + "'", long2 == 17928546574898624L);
    }

    @Test
    public void test5805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5805");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-363686), 1310, 164580);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -363686 for  must be in the range [1310,164580]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5806");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-76699), (-141059), (-240));
    }

    @Test
    public void test5807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5807");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-5823902), (-482750));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -5823902 * -482750");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5808");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(6916, 18, 112035);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6916 + "'", int3 == 6916);
    }

    @Test
    public void test5809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5809");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(0, (-662395510), (-1665505400));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5810");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(965839394520L, (long) (-3944366));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -3809624069205274320");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5811");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 115500, (-216870), 283395980);
    }

    @Test
    public void test5812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5812");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-16387), 662368976, 320, 440128000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 222224908 + "'", int4 == 222224908);
    }

    @Test
    public void test5813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5813");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(276494601L, 1554475);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 429803944889475L + "'", long2 == 429803944889475L);
    }

    @Test
    public void test5814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5814");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(4145555, (-654), (-97134840));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5815");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 1287002560, 3099603200L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3989197253384192000L + "'", long2 == 3989197253384192000L);
    }

    @Test
    public void test5816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5816");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-340482756), 2231);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-340480525) + "'", int2 == (-340480525));
    }

    @Test
    public void test5817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5817");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-29922662), 24670762L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5251900L) + "'", long2 == (-5251900L));
    }

    @Test
    public void test5818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5818");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (int) (short) 10, (int) (byte) -1, 2608990);
    }

    @Test
    public void test5819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5819");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-18923432));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 18923432 + "'", int1 == 18923432);
    }

    @Test
    public void test5820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5820");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(1294946750400L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 1294946750400");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5821");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(164472L, (-5074982898188000L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5074982898023528L) + "'", long2 == (-5074982898023528L));
    }

    @Test
    public void test5822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5822");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(38756, (-288129358), (-2575266));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-285515337) + "'", int3 == (-285515337));
    }

    @Test
    public void test5823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5823");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-23049), 1568880);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -23049 * 1568880");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5824");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1519000, 1895994596, (-158184048));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5825");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-13), 7431, (-71587));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -13 for  must be in the range [7431,-71587]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5826");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(2001232915, (-288078336), (-2033423847));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5827");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 10955744868393662L, (java.lang.Object) 3295694668968000L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5828");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-2818532), (-3423621210557262L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -2818532 * -3423621210557262");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5829");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(39046069, (-172370));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 39046069 * -172370");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5830");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-773440), (long) 198400);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-575040L) + "'", long2 == (-575040L));
    }

    @Test
    public void test5831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5831");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(3483129L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3483129 + "'", int1 == 3483129);
    }

    @Test
    public void test5832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5832");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(0, 46591948, (-264), 1554475);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1504488 + "'", int4 == 1504488);
    }

    @Test
    public void test5833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5833");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1172644011), 0, 47260903);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5834");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-163101298), (-2192850), 921367868);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 760459421 + "'", int3 == 760459421);
    }

    @Test
    public void test5835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5835");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 1168498456, (long) 1504488);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1166993968L + "'", long2 == 1166993968L);
    }

    @Test
    public void test5836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5836");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-22110720), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-22110720) + "'", int2 == (-22110720));
    }

    @Test
    public void test5837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5837");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-45046816), (-11587643), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5838");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(1418328476, 1828967);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1420157443 + "'", int2 == 1420157443);
    }
}

