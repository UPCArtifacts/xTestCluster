import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

    public static boolean debug = false;

    @Test
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) true, "no", "", "off");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "no" + "'", str4, "no");
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("yes", "hi!", "off", "true");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) (short) 10, (int) ' ', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("yes", "off", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 32, (java.lang.Integer) 0, (java.lang.Integer) 32, (java.lang.Integer) 1);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 1, (java.lang.Integer) 52, (java.lang.Integer) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("no", "", "on", "false");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(0, (int) (byte) 1, (int) (short) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(true, 1, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 35, (java.lang.Integer) 52, (java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 0, (java.lang.Integer) 0, (java.lang.Integer) (-1), (java.lang.Integer) 100);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (byte) 0, 52, (int) ' ');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("true", "no", "false");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) true, "yes", "false", "yes");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "yes" + "'", str4, "yes");
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 0, (java.lang.Integer) 100, (java.lang.Integer) 52, (java.lang.Integer) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(0, (int) (short) 0, (int) ' ', 52);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 10, (java.lang.Integer) 52, (java.lang.Integer) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("no", "", "on");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(0, (int) (short) 100, (int) (byte) 100, (int) (byte) 0);
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean(35, 52, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 1, (java.lang.Integer) 100, (java.lang.Integer) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(false, 97, 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, (-1), (int) '#', 32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("no", "", "on", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) (short) -1, 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, (int) '4', (int) (byte) 1, 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        java.lang.Boolean[] booleanArray6 = new java.lang.Boolean[] { true, true, true, true, false, false };
        java.lang.Boolean boolean7 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        java.lang.Boolean boolean8 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        java.lang.Boolean boolean9 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        java.lang.Boolean boolean10 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        java.lang.Class<?> wildcardClass11 = booleanArray6.getClass();
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + false + "'", boolean7, false);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + false + "'", boolean8, false);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + false + "'", boolean9, false);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + false + "'", boolean10, false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("true", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 32, (java.lang.Integer) 32, (java.lang.Integer) 35, (java.lang.Integer) 97);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("true", "false", "on", "yes");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) false, "off", "false", "false");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "false" + "'", str4, "false");
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(0, 97, 0, (int) 'a');
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 0, (java.lang.Integer) 97, (java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, 1, 0, (int) '4');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) '4', (int) 'a', (int) (short) 100, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) 97, (java.lang.Integer) 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((-1), 100, (int) (short) 100, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) false, "no", "no", "off");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "no" + "'", str4, "no");
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("false", "no", "off");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) true, "on", "", "false");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "on" + "'", str4, "on");
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(1, 52, (int) (byte) 10, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("hi!", "yes", "off", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("true", "off", "no", "yes");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) false, "false", "", "true");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 1, (java.lang.Integer) 0, (java.lang.Integer) 0, (java.lang.Integer) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) (short) 10, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, 1, (int) (byte) -1, 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean(52, (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, (int) (short) 1, (int) (short) -1, 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 0, (java.lang.Integer) 35, (java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("off", "yes", "off");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("", "off", "", "true");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 1, (java.lang.Integer) (-1), (java.lang.Integer) 1, (java.lang.Integer) 97);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, 32, (int) (byte) 0, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 97, (java.lang.Integer) (-1), (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, 10, (int) (byte) 0, 32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(0, 52, 100, 0);
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) 'a', 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (short) 0, (int) (short) -1, 35, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, 0, (int) (short) 100, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) ' ', (int) (byte) 10, 52, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(true, (int) (byte) -1, 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("true", "off", "false", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) 'a', 52, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 32, (java.lang.Integer) 32, (java.lang.Integer) 52);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("off", "hi!", "yes");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 10, (java.lang.Integer) 1, (java.lang.Integer) 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("on", "false", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("no", "off", "", "no");
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, (int) 'a', 32, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (short) -1, (int) (byte) 10, 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("", "hi!", "", "false");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, 1, 0, 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        java.lang.Boolean[] booleanArray4 = new java.lang.Boolean[] { false, true, true, true };
        java.lang.Boolean boolean5 = org.apache.commons.lang.BooleanUtils.xor(booleanArray4);
        java.lang.Boolean boolean6 = org.apache.commons.lang.BooleanUtils.xor(booleanArray4);
        java.lang.Boolean boolean7 = org.apache.commons.lang.BooleanUtils.xor(booleanArray4);
        java.lang.Boolean boolean8 = org.apache.commons.lang.BooleanUtils.xor(booleanArray4);
        java.lang.Boolean boolean9 = org.apache.commons.lang.BooleanUtils.xor(booleanArray4);
        java.lang.Boolean boolean10 = org.apache.commons.lang.BooleanUtils.xor(booleanArray4);
        java.lang.Boolean boolean11 = org.apache.commons.lang.BooleanUtils.xor(booleanArray4);
        java.lang.Boolean boolean12 = org.apache.commons.lang.BooleanUtils.xor(booleanArray4);
        java.lang.Boolean boolean13 = org.apache.commons.lang.BooleanUtils.xor(booleanArray4);
        java.lang.Boolean boolean14 = org.apache.commons.lang.BooleanUtils.xor(booleanArray4);
        java.lang.Boolean boolean15 = org.apache.commons.lang.BooleanUtils.xor(booleanArray4);
        java.lang.Boolean boolean16 = org.apache.commons.lang.BooleanUtils.xor(booleanArray4);
        java.lang.Boolean boolean17 = org.apache.commons.lang.BooleanUtils.xor(booleanArray4);
        java.lang.Boolean boolean18 = org.apache.commons.lang.BooleanUtils.xor(booleanArray4);
        java.lang.Class<?> wildcardClass19 = booleanArray4.getClass();
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + false + "'", boolean5, false);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + false + "'", boolean6, false);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + false + "'", boolean7, false);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + false + "'", boolean8, false);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + false + "'", boolean9, false);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + false + "'", boolean10, false);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + false + "'", boolean11, false);
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + false + "'", boolean12, false);
        org.junit.Assert.assertEquals("'" + boolean13 + "' != '" + false + "'", boolean13, false);
        org.junit.Assert.assertEquals("'" + boolean14 + "' != '" + false + "'", boolean14, false);
        org.junit.Assert.assertEquals("'" + boolean15 + "' != '" + false + "'", boolean15, false);
        org.junit.Assert.assertEquals("'" + boolean16 + "' != '" + false + "'", boolean16, false);
        org.junit.Assert.assertEquals("'" + boolean17 + "' != '" + false + "'", boolean17, false);
        org.junit.Assert.assertEquals("'" + boolean18 + "' != '" + false + "'", boolean18, false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("", "off", "yes");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) (byte) -1, 10, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("", "no", "yes", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) true, "true", "false", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "true" + "'", str4, "true");
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) true, "on", "yes", "yes");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "on" + "'", str4, "on");
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) true, "", "false", "off");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(97, (int) 'a', (int) (byte) 100, (int) ' ');
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(true, (int) (byte) 10, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) true, "on", "", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "on" + "'", str4, "on");
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (byte) 10, (int) (short) -1, 0, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("", "hi!", "false", "");
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("yes", "no", "on");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) (-1), (java.lang.Integer) 35, (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 0, (java.lang.Integer) 1, (java.lang.Integer) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (byte) 1, (int) '4', (int) (short) 100, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(32, (int) '#', (int) (byte) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) (byte) -1, (int) (short) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("false", "false", "no", "");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        boolean[] booleanArray4 = new boolean[] { false, true, false, false };
        boolean boolean5 = org.apache.commons.lang.BooleanUtils.xor(booleanArray4);
        boolean boolean6 = org.apache.commons.lang.BooleanUtils.xor(booleanArray4);
        boolean boolean7 = org.apache.commons.lang.BooleanUtils.xor(booleanArray4);
        boolean boolean8 = org.apache.commons.lang.BooleanUtils.xor(booleanArray4);
        boolean boolean9 = org.apache.commons.lang.BooleanUtils.xor(booleanArray4);
        boolean boolean10 = org.apache.commons.lang.BooleanUtils.xor(booleanArray4);
        boolean boolean11 = org.apache.commons.lang.BooleanUtils.xor(booleanArray4);
        boolean boolean12 = org.apache.commons.lang.BooleanUtils.xor(booleanArray4);
        java.lang.Class<?> wildcardClass13 = booleanArray4.getClass();
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[false, true, false, false]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) '#', 97, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean(1, (int) (short) 1, 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) (short) -1, (int) (byte) -1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) false, "hi!", "hi!", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 32, (java.lang.Integer) 97, (java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) false, "", "on", "off");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "on" + "'", str4, "on");
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        java.lang.String str3 = org.apache.commons.lang.BooleanUtils.toString(false, "hi!", "no");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "no" + "'", str3, "no");
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, (int) (short) 0, (int) (byte) -1, 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (short) 10, (int) 'a', (-1), 10);
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) 'a', 1, 0, (int) 'a');
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 0, (java.lang.Integer) 0, (java.lang.Integer) (-1), (java.lang.Integer) 1);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(97, (int) '#', (int) (byte) -1, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, (int) (short) 1, 100, (int) 'a');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) 'a', (int) (short) 0, 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("", "on", "hi!", "on");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, 0, (int) (short) -1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean(0, (int) '#', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 32, (java.lang.Integer) 32, (java.lang.Integer) 52, (java.lang.Integer) 35);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) 'a', (int) (short) 100, 97);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(false, 52, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(true, (int) (byte) 100, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) true, "yes", "off", "off");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "yes" + "'", str4, "yes");
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) true, "true", "yes", "true");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "true" + "'", str4, "true");
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("off", "false", "hi!", "true");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(false, 52, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(false, (int) (byte) 1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(10, 100, (int) '4', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, (int) (short) 10, (int) 'a', 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        java.lang.Boolean[] booleanArray6 = new java.lang.Boolean[] { true, true, true, true, false, false };
        java.lang.Boolean boolean7 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        java.lang.Boolean boolean8 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        java.lang.Boolean boolean9 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        java.lang.Boolean boolean10 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        java.lang.Boolean boolean11 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        java.lang.Class<?> wildcardClass12 = booleanArray6.getClass();
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + false + "'", boolean7, false);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + false + "'", boolean8, false);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + false + "'", boolean9, false);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + false + "'", boolean10, false);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + false + "'", boolean11, false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) false, "no", "no", "yes");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "no" + "'", str4, "no");
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("on", "hi!", "yes");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(true, (int) ' ', 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) false, "off", "on", "yes");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "on" + "'", str4, "on");
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("no", "false", "on", "on");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (byte) 10, (int) (short) 10, 35, (int) ' ');
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) '#', (int) '#', 97);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("yes", "off", "on", "on");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 0, (java.lang.Integer) 0, (java.lang.Integer) (-1), (java.lang.Integer) 97);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) '4', 97, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(100, (int) '#', (int) (short) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) false, "no", "hi!", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 52, (java.lang.Integer) 52, (java.lang.Integer) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("off", "off", "true");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("", "on", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, (int) ' ', 10, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("on", "off", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 97, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) (byte) 1, 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean(32, 97, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(10, (-1), (int) (short) 1, 10);
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 32, (java.lang.Integer) 100, (java.lang.Integer) 1, (java.lang.Integer) 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) false, "", "off", "off");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "off" + "'", str4, "off");
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(false, 0, 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("off", "", "true", "false");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(0, (int) '#', 0, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(32, (int) (short) -1, (int) ' ', 35);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (short) 10, 35, (int) (short) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("off", "on", "on", "off");
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (short) 1, 32, 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) (short) 10, 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("no", "on", "on");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) true, "hi!", "no", "on");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(false, (int) '4', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, (int) (byte) -1, 100, (int) '4');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 35, (java.lang.Integer) 0, (java.lang.Integer) 10, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("on", "hi!", "on", "hi!");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(false, (int) (byte) 1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("false", "no", "no");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(false, (int) '4', 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(0, (int) (byte) 1, (int) ' ', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((-1), (int) (short) 0, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) false, "false", "no", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "no" + "'", str4, "no");
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 0, (java.lang.Integer) 0, (java.lang.Integer) 52, (java.lang.Integer) 0);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) 'a', (int) (byte) 10, (int) (byte) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(true, (int) (byte) -1, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(true, (int) (short) -1, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 32, (java.lang.Integer) 0, (java.lang.Integer) 10, (java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("true", "no", "true", "off");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, 32, (int) (byte) 0, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("false", "hi!", "true", "true");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (byte) 100, (int) (byte) 1, 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) (short) 1, (int) (byte) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(true, (int) (short) -1, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        java.lang.String str3 = org.apache.commons.lang.BooleanUtils.toString(true, "yes", "true");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "yes" + "'", str3, "yes");
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) '#', 97, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (short) -1, 35, (int) (short) -1, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(true, (int) (short) 0, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) (short) 10, (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("no", "", "off", "on");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 97, (java.lang.Integer) 10, (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        java.lang.Boolean[] booleanArray3 = new java.lang.Boolean[] { false, false, true };
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.xor(booleanArray3);
        java.lang.Boolean boolean5 = org.apache.commons.lang.BooleanUtils.xor(booleanArray3);
        java.lang.Boolean boolean6 = org.apache.commons.lang.BooleanUtils.xor(booleanArray3);
        java.lang.Boolean boolean7 = org.apache.commons.lang.BooleanUtils.xor(booleanArray3);
        java.lang.Class<?> wildcardClass8 = booleanArray3.getClass();
        org.junit.Assert.assertNotNull(booleanArray3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, (-1), (int) ' ', 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) false, "no", "", "off");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, (int) '#', 35, 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (byte) 10, (int) '4', (int) (byte) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(false, (int) ' ', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("", "yes", "yes", "true");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, 97, (int) (short) 1, 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("true", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean(97, (int) (short) 1, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) 'a', (int) (byte) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) false, "no", "", "on");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 32, (java.lang.Integer) 32);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 35, (java.lang.Integer) 1, (java.lang.Integer) (-1), (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("on", "false", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("off", "hi!", "false", "on");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("false", "false", "yes", "no");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) false, "yes", "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) true, "hi!", "hi!", "on");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (byte) 1, (int) 'a', (int) 'a', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 0, (java.lang.Integer) 35, (java.lang.Integer) 10, (java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) false, "hi!", "", "off");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((-1), (int) (short) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(false, (int) 'a', (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("hi!", "false", "off", "yes");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (byte) 0, 100, 52, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(0, 10, (int) (short) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(true, 1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 0, (java.lang.Integer) 1, (java.lang.Integer) 35, (java.lang.Integer) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 10, (java.lang.Integer) 100, (java.lang.Integer) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, 35, (int) 'a', (int) '4');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean(0, (int) (short) 0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, 0, 32, 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 35, (java.lang.Integer) 100, (java.lang.Integer) 1, (java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, 32, 0, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("on", "false", "off", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 0, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("false", "yes", "no", "off");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("off", "on", "", "on");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 35, (java.lang.Integer) 35, (java.lang.Integer) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(false, (int) ' ', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("hi!", "", "", "on");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(false, 52, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("", "hi!", "off", "off");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("false", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) 'a', (int) (short) 1, (-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) true, "on", "false", "off");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "on" + "'", str4, "on");
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 35, (java.lang.Integer) 1, (java.lang.Integer) 100, (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, 1, 0, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 32, (java.lang.Integer) 10, (java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, 0, 97, 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 35, (java.lang.Integer) 1, (java.lang.Integer) 52, (java.lang.Integer) 35);
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(0, (int) (byte) 10, (int) (short) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((-1), 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 1, (java.lang.Integer) (-1), (java.lang.Integer) 0, (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) 'a', (-1), (int) (short) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(true, 97, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean(32, (int) (byte) 0, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("", "yes", "off", "off");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) false, "false", "false", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "false" + "'", str4, "false");
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 0, (java.lang.Integer) 97, (java.lang.Integer) (-1), (java.lang.Integer) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (byte) 1, (int) (short) -1, (int) (short) 0, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) (-1), (java.lang.Integer) 35, (java.lang.Integer) 100, (java.lang.Integer) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (short) 100, 97, (int) ' ');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean(100, (int) '4', 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(10, (int) (short) 1, 97, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 32, (java.lang.Integer) 35, (java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (byte) -1, 100, 52, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean(0, (int) (byte) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, 10, (int) (short) 10, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
        boolean[] booleanArray4 = new boolean[] { false, true, false, false };
        boolean boolean5 = org.apache.commons.lang.BooleanUtils.xor(booleanArray4);
        boolean boolean6 = org.apache.commons.lang.BooleanUtils.xor(booleanArray4);
        boolean boolean7 = org.apache.commons.lang.BooleanUtils.xor(booleanArray4);
        boolean boolean8 = org.apache.commons.lang.BooleanUtils.xor(booleanArray4);
        boolean boolean9 = org.apache.commons.lang.BooleanUtils.xor(booleanArray4);
        boolean boolean10 = org.apache.commons.lang.BooleanUtils.xor(booleanArray4);
        boolean boolean11 = org.apache.commons.lang.BooleanUtils.xor(booleanArray4);
        boolean boolean12 = org.apache.commons.lang.BooleanUtils.xor(booleanArray4);
        boolean boolean13 = org.apache.commons.lang.BooleanUtils.xor(booleanArray4);
        java.lang.Class<?> wildcardClass14 = booleanArray4.getClass();
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[false, true, false, false]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 0, (java.lang.Integer) 32, (java.lang.Integer) 1, (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (short) -1, (-1), (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 32, (java.lang.Integer) 97, (java.lang.Integer) 0, (java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
        boolean[] booleanArray4 = new boolean[] { false, false, false, false };
        boolean boolean5 = org.apache.commons.lang.BooleanUtils.xor(booleanArray4);
        boolean boolean6 = org.apache.commons.lang.BooleanUtils.xor(booleanArray4);
        boolean boolean7 = org.apache.commons.lang.BooleanUtils.xor(booleanArray4);
        boolean boolean8 = org.apache.commons.lang.BooleanUtils.xor(booleanArray4);
        boolean boolean9 = org.apache.commons.lang.BooleanUtils.xor(booleanArray4);
        boolean boolean10 = org.apache.commons.lang.BooleanUtils.xor(booleanArray4);
        boolean boolean11 = org.apache.commons.lang.BooleanUtils.xor(booleanArray4);
        java.lang.Class<?> wildcardClass12 = booleanArray4.getClass();
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[false, false, false, false]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (byte) -1, (-1), 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 0, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 10);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(52, (int) (short) -1, (int) (short) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) true, "", "no", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean(97, (int) (short) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(0, 32, 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, (int) (byte) 100, (int) (short) -1, 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (byte) 1, 1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("", "yes", "", "hi!");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("on", "", "", "yes");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(1, (int) (byte) 0, (int) ' ', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(false, (int) (byte) 100, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3272");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean(10, 97, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 0, (java.lang.Integer) 97, (java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean(0, (int) 'a', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("hi!", "no", "yes");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(0, 97, 1, (int) (byte) 0);
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) '#', (int) (byte) 0, (int) (byte) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("", "yes", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3279");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, (int) (short) 1, 10, (int) 'a');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3280");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(false, 100, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(true, (int) '#', (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3282");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 0, (java.lang.Integer) 1, (java.lang.Integer) (-1), (java.lang.Integer) 0);
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(52, (int) (byte) 0, 52, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3284");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 35, (java.lang.Integer) 97, (java.lang.Integer) 97, (java.lang.Integer) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3285");
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("yes", "off", "yes");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3286");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, 0, (int) ' ', (int) ' ');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3287");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(1, 1, (int) (byte) 1, (int) 'a');
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3288");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) true, "false", "yes", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "false" + "'", str4, "false");
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3289");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(false, (int) (short) 0, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3290");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("off", "no", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3291");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("off", "false", "no", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3292");
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean(0, (int) 'a', 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3293");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("false", "", "off", "on");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3294");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3295");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) ' ', (int) 'a', 52, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3296");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 52, (java.lang.Integer) 35, (java.lang.Integer) 100, (java.lang.Integer) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3297");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 0, (java.lang.Integer) 52, (java.lang.Integer) 32, (java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3298");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, 1, 97, 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3299");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, (int) (byte) 100, (int) ' ', 32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3300");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(0, (int) (short) 10, 32, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3301");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((-1), 35, 32, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3302");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) (byte) 0, (int) (byte) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3303");
        boolean[] booleanArray2 = new boolean[] { true, false };
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.xor(booleanArray2);
        java.lang.Class<?> wildcardClass4 = booleanArray2.getClass();
        org.junit.Assert.assertNotNull(booleanArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray2), "[true, false]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3304");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) (-1), (java.lang.Integer) 52, (java.lang.Integer) 52, (java.lang.Integer) (-1));
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3305");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) false, "true", "no", "on");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "no" + "'", str4, "no");
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3306");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, 35, 97, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3307");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(0, (int) '4', (int) (byte) 1, (int) (short) 0);
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3308");
        java.lang.String str3 = org.apache.commons.lang.BooleanUtils.toString(false, "on", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3309");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("no", "true", "on");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3310");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, (int) 'a', (int) (byte) 1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3311");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 100, (java.lang.Integer) 1, (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3312");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("false", "off", "true", "no");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3313");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 35, (java.lang.Integer) 35, (java.lang.Integer) 97, (java.lang.Integer) 100);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3314");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (short) 100, (int) '4', (int) 'a', 100);
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3315");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) '4', (int) (short) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3316");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("hi!", "", "no");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3317");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) false, "hi!", "off", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "off" + "'", str4, "off");
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3318");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(false, 32, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3319");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 35, (java.lang.Integer) 10, (java.lang.Integer) 0, (java.lang.Integer) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3320");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("false", "on", "yes", "on");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3321");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(100, (int) (short) 0, 35, (int) (byte) 100);
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3322");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(false, 97, 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3323");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) (short) -1, 52, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3324");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) false, "", "", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3325");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) false, "false", "off", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "off" + "'", str4, "off");
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3326");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) true, "", "yes", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3327");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) false, "on", "on", "on");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "on" + "'", str4, "on");
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3328");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (byte) 10, (int) 'a', 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3329");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 1, (java.lang.Integer) 97, (java.lang.Integer) 0, (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3330");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(true, (int) (short) 1, 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3331");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) false, "yes", "on", "no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "on" + "'", str4, "on");
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3332");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, 32, (int) '#', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3333");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(32, (int) (short) -1, 0, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3334");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, (int) '4', 32, 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3335");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 35, (java.lang.Integer) 0, (java.lang.Integer) 32, (java.lang.Integer) 35);
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3336");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, 0, 52, (int) '4');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3337");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(0, 100, (int) (byte) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3338");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) false, "false", "on", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "on" + "'", str4, "on");
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3339");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (short) 1, (int) (short) 0, 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3340");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) true, "true", "hi!", "yes");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "true" + "'", str4, "true");
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3341");
        boolean[] booleanArray4 = new boolean[] { false, false, false, false };
        boolean boolean5 = org.apache.commons.lang.BooleanUtils.xor(booleanArray4);
        boolean boolean6 = org.apache.commons.lang.BooleanUtils.xor(booleanArray4);
        boolean boolean7 = org.apache.commons.lang.BooleanUtils.xor(booleanArray4);
        boolean boolean8 = org.apache.commons.lang.BooleanUtils.xor(booleanArray4);
        boolean boolean9 = org.apache.commons.lang.BooleanUtils.xor(booleanArray4);
        boolean boolean10 = org.apache.commons.lang.BooleanUtils.xor(booleanArray4);
        boolean boolean11 = org.apache.commons.lang.BooleanUtils.xor(booleanArray4);
        boolean boolean12 = org.apache.commons.lang.BooleanUtils.xor(booleanArray4);
        boolean boolean13 = org.apache.commons.lang.BooleanUtils.xor(booleanArray4);
        boolean boolean14 = org.apache.commons.lang.BooleanUtils.xor(booleanArray4);
        boolean boolean15 = org.apache.commons.lang.BooleanUtils.xor(booleanArray4);
        boolean boolean16 = org.apache.commons.lang.BooleanUtils.xor(booleanArray4);
        java.lang.Class<?> wildcardClass17 = booleanArray4.getClass();
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[false, false, false, false]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3342");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (byte) 10, 0, 10, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3343");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 97, (java.lang.Integer) 0, (java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3344");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, 0, 35, 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3345");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 100, (java.lang.Integer) 52, (java.lang.Integer) 0, (java.lang.Integer) 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3346");
        java.lang.Boolean[] booleanArray5 = new java.lang.Boolean[] { false, true, true, true, false };
        java.lang.Boolean boolean6 = org.apache.commons.lang.BooleanUtils.xor(booleanArray5);
        java.lang.Boolean boolean7 = org.apache.commons.lang.BooleanUtils.xor(booleanArray5);
        java.lang.Boolean boolean8 = org.apache.commons.lang.BooleanUtils.xor(booleanArray5);
        java.lang.Boolean boolean9 = org.apache.commons.lang.BooleanUtils.xor(booleanArray5);
        java.lang.Class<?> wildcardClass10 = booleanArray5.getClass();
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + false + "'", boolean6, false);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + false + "'", boolean7, false);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + false + "'", boolean8, false);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + false + "'", boolean9, false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3347");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean(32, (-1), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3348");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) (byte) 10, (int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3349");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(100, (int) (byte) 100, 0, 97);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3350");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) 'a', (int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3351");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, (-1), (int) '#', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3352");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(false, 100, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3353");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) 97, (java.lang.Integer) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3354");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 97, (java.lang.Integer) 0, (java.lang.Integer) 97, (java.lang.Integer) 97);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3355");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (short) 10, (int) (byte) 0, 0, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3356");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 100, (java.lang.Integer) 52, (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3357");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) (-1), (java.lang.Integer) 35, (java.lang.Integer) 97, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3358");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 35, (java.lang.Integer) 100, (java.lang.Integer) 35, (java.lang.Integer) 10);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3359");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) '4', (int) (short) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3360");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, (int) '#', 1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3361");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("true", "off", "off", "yes");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3362");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("yes", "true", "on");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3363");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (byte) 0, (int) (short) 0, 10, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3364");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) false, "on", "", "false");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3365");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (short) 1, (int) (byte) 1, (int) (byte) 1, 1);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3366");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, (int) 'a', (int) 'a', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3367");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(false, 10, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3368");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(true, (int) (byte) 1, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3369");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(false, 1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3370");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, (int) '4', 0, 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3371");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(0, 35, (int) (short) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3372");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 0, (java.lang.Integer) 97, (java.lang.Integer) 0, (java.lang.Integer) 97);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3373");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) false, "yes", "hi!", "no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3374");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, 52, 100, (int) 'a');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3375");
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("off", "no", "off");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3376");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, 0, 1, (int) 'a');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3377");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 0, (java.lang.Integer) 32, (java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3378");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("no", "", "false", "false");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3379");
        java.lang.String str3 = org.apache.commons.lang.BooleanUtils.toString(true, "off", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "off" + "'", str3, "off");
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3380");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 10, (java.lang.Integer) 0, (java.lang.Integer) 32, (java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3381");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("off", "on", "yes", "on");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3382");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(10, (int) (byte) 1, (int) 'a', (int) (byte) 10);
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3383");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(100, 10, 32, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3384");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) '#', 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3385");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (byte) 100, (int) '#', (int) (byte) 10, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3386");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("no", "false", "yes", "true");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3387");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 32, (java.lang.Integer) 10, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3388");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) (short) 1, 32, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3389");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) false, "no", "off", "yes");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "off" + "'", str4, "off");
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3390");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, (int) '#', 97, 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3391");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) false, "", "on", "on");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "on" + "'", str4, "on");
    }

    @Test
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3392");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("", "", "on", "hi!");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3393");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3394");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 1, (java.lang.Integer) 35, (java.lang.Integer) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3395");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("false", "on", "no");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3396");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(false, 100, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3397");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(35, (int) (byte) 0, (int) (short) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3398");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 35, (java.lang.Integer) 1, (java.lang.Integer) 10, (java.lang.Integer) 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3399");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) false, "yes", "on", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "on" + "'", str4, "on");
    }

    @Test
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3400");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("off", "true", "true");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3401");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(true, (-1), (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3402");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) 10);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
    }

    @Test
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3403");
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) (short) 0, 0, 97);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3404");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(false, 35, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3405");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(32, (int) '4', (int) (short) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3406");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, (-1), (int) (byte) -1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test3407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3407");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean(97, (int) (short) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3408");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) 'a', 35, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3409");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) false, "on", "off", "false");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "off" + "'", str4, "off");
    }

    @Test
    public void test3410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3410");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) true, "on", "", "no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "on" + "'", str4, "on");
    }

    @Test
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3411");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (byte) 100, (int) (short) 10, (int) (byte) 100, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
    }

    @Test
    public void test3412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3412");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("hi!", "false", "false", "no");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3413");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("false", "", "yes", "no");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3414");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) true, "on", "no", "on");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "on" + "'", str4, "on");
    }

    @Test
    public void test3415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3415");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 52, (java.lang.Integer) 100, (java.lang.Integer) 97, (java.lang.Integer) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3416");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) (byte) -1, 0, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3417");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) false, "false", "false", "off");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "false" + "'", str4, "false");
    }

    @Test
    public void test3418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3418");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(0, 32, (int) '4', (int) (short) 0);
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test3419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3419");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(32, 0, (int) (byte) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3420");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("", "yes", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3421");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, (int) '4', (int) (short) -1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test3422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3422");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("on", "", "yes", "no");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3423");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) (short) 0, (int) (byte) 10, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3424");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("on", "yes", "false", "true");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3425");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) (byte) 1, 97, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3426");
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("yes", "yes", "false");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test3427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3427");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(true, (int) 'a', (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test3428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3428");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, 10, (-1), (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test3429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3429");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("off", "yes", "yes", "false");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3430");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) (-1), (java.lang.Integer) (-1), (java.lang.Integer) 1, (java.lang.Integer) 10);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test3431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3431");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 10, (java.lang.Integer) 1, (java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3432");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(true, 97, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test3433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3433");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (byte) 10, (int) (byte) 100, 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test3434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3434");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) (-1), (java.lang.Integer) 52, (java.lang.Integer) 0, (java.lang.Integer) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3435");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) '4', 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3436");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(1, 0, 32, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3437");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3438");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(false, 35, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test3439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3439");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("yes", "true", "off");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3440");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("false", "no", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3441");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 52, (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3442");
        java.lang.Boolean[] booleanArray3 = new java.lang.Boolean[] { false, false, true };
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.xor(booleanArray3);
        java.lang.Class<?> wildcardClass5 = booleanArray3.getClass();
        org.junit.Assert.assertNotNull(booleanArray3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3443");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("on", "off", "false", "yes");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3444");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("false", "false", "false", "");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test3445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3445");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((-1), (int) '#', 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3446");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) true, "yes", "hi!", "no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "yes" + "'", str4, "yes");
    }

    @Test
    public void test3447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3447");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 0, (java.lang.Integer) 32, (java.lang.Integer) 97, (java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3448");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, (int) 'a', (int) '4', 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test3449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3449");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) (-1), (java.lang.Integer) 52, (java.lang.Integer) 0, (java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3450");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, 52, 32, 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test3451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3451");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 32, (java.lang.Integer) 32, (java.lang.Integer) 1, (java.lang.Integer) 1);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test3452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3452");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, (int) (byte) 0, (int) (short) -1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3453");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(0, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3454");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("off", "false", "no", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3455");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (byte) 0, 52, (int) 'a', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3456");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) true, "true", "off", "off");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "true" + "'", str4, "true");
    }

    @Test
    public void test3457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3457");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean(35, (int) (byte) 0, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3458");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, 100, 0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3459");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (byte) 10, (int) (byte) -1, 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test3460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3460");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 1, (java.lang.Integer) 52, (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3461");
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean(35, (int) (byte) 100, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3462");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, (int) (byte) 1, (int) ' ', (int) 'a');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test3463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3463");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 97, (java.lang.Integer) 52, (java.lang.Integer) 52, (java.lang.Integer) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3464");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(true, (int) (byte) 1, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test3465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3465");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 32, (java.lang.Integer) 0, (java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3466");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("hi!", "yes", "hi!", "false");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
    }

    @Test
    public void test3467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3467");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 0, (java.lang.Integer) 1, (java.lang.Integer) (-1), (java.lang.Integer) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3468");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((-1), (int) (byte) 1, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3469");
        java.lang.Boolean[] booleanArray5 = new java.lang.Boolean[] { true, true, true, false, false };
        java.lang.Boolean boolean6 = org.apache.commons.lang.BooleanUtils.xor(booleanArray5);
        java.lang.Boolean boolean7 = org.apache.commons.lang.BooleanUtils.xor(booleanArray5);
        java.lang.Class<?> wildcardClass8 = booleanArray5.getClass();
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + false + "'", boolean6, false);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + false + "'", boolean7, false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3470");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) (short) 100, 97, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3471");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 100, (java.lang.Integer) 100, (java.lang.Integer) 97, (java.lang.Integer) 52);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test3472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3472");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (short) 10, 97, (int) (byte) 10, 52);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
    }

    @Test
    public void test3473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3473");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) false, "", "true", "no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "true" + "'", str4, "true");
    }

    @Test
    public void test3474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3474");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) true, "yes", "true", "on");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "yes" + "'", str4, "yes");
    }

    @Test
    public void test3475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3475");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("", "off", "false");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3476");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) false, "off", "", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test3477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3477");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("yes", "false", "off", "no");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3478");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(true, 32, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test3479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3479");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("", "hi!", "on");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3480");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 0, (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 0);
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test3481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3481");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (short) 1, (int) 'a', (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test3482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3482");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) '#', (-1), 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3483");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) '4', (int) ' ', (int) (byte) 10, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3484");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (byte) 0, 0, (int) '#', (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test3485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3485");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(0, 0, (int) 'a', (int) '4');
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test3486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3486");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(52, (int) (short) 10, 35, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3487");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) true, "on", "hi!", "yes");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "on" + "'", str4, "on");
    }

    @Test
    public void test3488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3488");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("no", "off", "no", "false");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
    }

    @Test
    public void test3489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3489");
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) (-1), (java.lang.Integer) 97, (java.lang.Integer) (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3490");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean(10, 52, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3491");
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("hi!", "hi!", "off");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test3492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3492");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean(32, (int) (short) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3493");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 100, (java.lang.Integer) 97, (java.lang.Integer) 35, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3494");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("no", "no", "on", "");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test3495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3495");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean(0, 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3496");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (byte) 100, 35, (int) (short) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3497");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) false, "yes", "yes", "on");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "yes" + "'", str4, "yes");
    }

    @Test
    public void test3498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3498");
        java.lang.Boolean[] booleanArray2 = new java.lang.Boolean[] { true, true };
        java.lang.Boolean boolean3 = org.apache.commons.lang.BooleanUtils.xor(booleanArray2);
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.xor(booleanArray2);
        java.lang.Boolean boolean5 = org.apache.commons.lang.BooleanUtils.xor(booleanArray2);
        java.lang.Boolean boolean6 = org.apache.commons.lang.BooleanUtils.xor(booleanArray2);
        java.lang.Boolean boolean7 = org.apache.commons.lang.BooleanUtils.xor(booleanArray2);
        java.lang.Boolean boolean8 = org.apache.commons.lang.BooleanUtils.xor(booleanArray2);
        java.lang.Boolean boolean9 = org.apache.commons.lang.BooleanUtils.xor(booleanArray2);
        java.lang.Boolean boolean10 = org.apache.commons.lang.BooleanUtils.xor(booleanArray2);
        java.lang.Boolean boolean11 = org.apache.commons.lang.BooleanUtils.xor(booleanArray2);
        java.lang.Boolean boolean12 = org.apache.commons.lang.BooleanUtils.xor(booleanArray2);
        java.lang.Boolean boolean13 = org.apache.commons.lang.BooleanUtils.xor(booleanArray2);
        java.lang.Class<?> wildcardClass14 = booleanArray2.getClass();
        org.junit.Assert.assertNotNull(booleanArray2);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + false + "'", boolean5, false);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + false + "'", boolean6, false);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + false + "'", boolean7, false);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + false + "'", boolean8, false);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + false + "'", boolean9, false);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + false + "'", boolean10, false);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + false + "'", boolean11, false);
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + false + "'", boolean12, false);
        org.junit.Assert.assertEquals("'" + boolean13 + "' != '" + false + "'", boolean13, false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3499");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("false", "yes", "yes", "false");
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test3500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3500");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, (-1), 97, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }
}

