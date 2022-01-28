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
        java.lang.String str3 = org.apache.commons.lang.BooleanUtils.toString(true, "true", "off");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "true" + "'", str3, "true");
    }

    @Test
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5002");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(true, (int) '#', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5003");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) '4', 52, (int) (byte) 10, (int) 'a');
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5004");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("true", "on", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5005");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) false, "on", "false", "off");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "false" + "'", str4, "false");
    }

    @Test
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5006");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(false, (int) (short) 0, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5007");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (short) 0, (int) ' ', 0, 32);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
    }

    @Test
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5008");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 52, (java.lang.Integer) 10, (java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5009");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) (short) 10, 35, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5010");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("true", "hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5011");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) '4', (int) 'a', 97, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5012");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean(52, (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5013");
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 97, (java.lang.Integer) 97, (java.lang.Integer) 32);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5014");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 100, (java.lang.Integer) 1, (java.lang.Integer) 0, (java.lang.Integer) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5015");
        java.lang.Boolean[] booleanArray6 = new java.lang.Boolean[] { true, false, false, true, false, true };
        java.lang.Boolean boolean7 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        java.lang.Boolean boolean8 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        java.lang.Boolean boolean9 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        java.lang.Boolean boolean10 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        java.lang.Boolean boolean11 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        java.lang.Boolean boolean12 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        java.lang.Boolean boolean13 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        java.lang.Boolean boolean14 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        java.lang.Boolean boolean15 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        java.lang.Boolean boolean16 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        java.lang.Boolean boolean17 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        java.lang.Class<?> wildcardClass18 = booleanArray6.getClass();
        org.junit.Assert.assertNotNull(booleanArray6);
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5016");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) '#', (int) (short) 1, (-1), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5017");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("on", "true", "no", "off");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5018");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) false, "false", "hi!", "yes");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test5019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5019");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) false, "yes", "false", "yes");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "false" + "'", str4, "false");
    }

    @Test
    public void test5020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5020");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 10, (java.lang.Integer) 32, (java.lang.Integer) 32, (java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5021");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("yes", "hi!", "on", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5022");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean(10, 97, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5023");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) (byte) -1, 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5024");
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((-1), (int) (byte) -1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test5025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5025");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(true, (int) (byte) 0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test5026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5026");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean(100, (int) (short) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
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
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("hi!", "", "", "true");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5028");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, 32, (int) (short) -1, 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test5029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5029");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) '#', (int) (short) 1, 35, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
    }

    @Test
    public void test5030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5030");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(100, (int) (short) -1, (int) (short) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5031");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 52, (java.lang.Integer) 1, (java.lang.Integer) 35, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5032");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 32, (java.lang.Integer) 100, (java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5033");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(0, 10, (int) ' ', (int) (short) 0);
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test5034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5034");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, (int) ' ', (int) (short) -1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test5035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5035");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, 100, (int) (byte) 10, (int) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test5036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5036");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) false, "true", "hi!", "true");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test5037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5037");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) '4', (int) (byte) 1, 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5038");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("hi!", "on", "on", "true");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5039");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("off", "", "false", "true");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5040");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) false, "on", "true", "no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "true" + "'", str4, "true");
    }

    @Test
    public void test5041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5041");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("yes", "yes", "false", "yes");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test5042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5042");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 0, (java.lang.Integer) 1, (java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5043");
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("false", "true", "false");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5044");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(10, (int) (short) 100, 1, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5045");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 1, (java.lang.Integer) 100, (java.lang.Integer) (-1), (java.lang.Integer) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5046");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (byte) -1, 97, 35, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5047");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 32, (java.lang.Integer) 1, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5048");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, 10, 52, (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test5049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5049");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(0, 35, (int) (short) 10, 0);
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test5050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5050");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 35, (java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5051");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(false, (int) (byte) 100, 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test5052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5052");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("no", "", "yes", "false");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5053");
        java.lang.Boolean[] booleanArray5 = new java.lang.Boolean[] { true, false, true, true, true };
        java.lang.Boolean boolean6 = org.apache.commons.lang.BooleanUtils.xor(booleanArray5);
        java.lang.Boolean boolean7 = org.apache.commons.lang.BooleanUtils.xor(booleanArray5);
        java.lang.Boolean boolean8 = org.apache.commons.lang.BooleanUtils.xor(booleanArray5);
        java.lang.Boolean boolean9 = org.apache.commons.lang.BooleanUtils.xor(booleanArray5);
        java.lang.Boolean boolean10 = org.apache.commons.lang.BooleanUtils.xor(booleanArray5);
        java.lang.Boolean boolean11 = org.apache.commons.lang.BooleanUtils.xor(booleanArray5);
        java.lang.Boolean boolean12 = org.apache.commons.lang.BooleanUtils.xor(booleanArray5);
        java.lang.Boolean boolean13 = org.apache.commons.lang.BooleanUtils.xor(booleanArray5);
        java.lang.Boolean boolean14 = org.apache.commons.lang.BooleanUtils.xor(booleanArray5);
        java.lang.Boolean boolean15 = org.apache.commons.lang.BooleanUtils.xor(booleanArray5);
        java.lang.Class<?> wildcardClass16 = booleanArray5.getClass();
        org.junit.Assert.assertNotNull(booleanArray5);
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5054");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, 97, 52, 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test5055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5055");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, 97, (int) (short) 0, 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5056");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) false, "true", "on", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "on" + "'", str4, "on");
    }

    @Test
    public void test5057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5057");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, 32, (int) (byte) 1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test5058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5058");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, 10, (int) (short) 10, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test5059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5059");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(32, (int) ' ', 1, (-1));
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test5060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5060");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("yes", "false", "no");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5061");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(52, (int) '#', (int) (short) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5062");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 1, (java.lang.Integer) 10, (java.lang.Integer) 32, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5063");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("on", "no", "no", "on");
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test5064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5064");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 35, (java.lang.Integer) 32, (java.lang.Integer) 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5065");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(false, (int) (byte) 10, 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test5066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5066");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 1, (java.lang.Integer) 32);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test5067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5067");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(false, 0, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5068");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(false, (int) (byte) 1, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test5069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5069");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 97, (java.lang.Integer) 10, (java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5070");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean(52, (int) (short) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5071");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 100, (java.lang.Integer) (-1), (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5072");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) (byte) -1, (int) (byte) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5073");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((-1), 0, (int) (short) 0, (-1));
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test5074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5074");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 97, (java.lang.Integer) 1, (java.lang.Integer) 10, (java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5075");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(10, (int) '4', (int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5076");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 10, (java.lang.Integer) 97, (java.lang.Integer) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5077");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, 1, 35, (int) ' ');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test5078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5078");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(true, (int) (short) 10, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test5079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5079");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean(100, 32, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5080");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(true, 10, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test5081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5081");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (byte) 100, 0, 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5082");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("", "hi!", "on", "no");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5083");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) 'a', (int) (short) 10, 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5084");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 32, (java.lang.Integer) 1, (java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5085");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 52, (java.lang.Integer) 0, (java.lang.Integer) (-1), (java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5086");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("no", "true", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5087");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("on", "true", "off", "no");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5088");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) false, "no", "yes", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "yes" + "'", str4, "yes");
    }

    @Test
    public void test5089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5089");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("no", "", "no", "on");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
    }

    @Test
    public void test5090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5090");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) (short) 0, 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5091");
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("off", "off", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test5092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5092");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("", "hi!", "", "yes");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
    }

    @Test
    public void test5093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5093");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(1, 97, (int) (byte) 1, (int) 'a');
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
    }

    @Test
    public void test5094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5094");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 0, (java.lang.Integer) 0, (java.lang.Integer) 1, (java.lang.Integer) (-1));
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test5095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5095");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 52, (java.lang.Integer) 35, (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5096");
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
        java.lang.Boolean boolean19 = org.apache.commons.lang.BooleanUtils.xor(booleanArray4);
        java.lang.Boolean boolean20 = org.apache.commons.lang.BooleanUtils.xor(booleanArray4);
        java.lang.Boolean boolean21 = org.apache.commons.lang.BooleanUtils.xor(booleanArray4);
        java.lang.Boolean boolean22 = org.apache.commons.lang.BooleanUtils.xor(booleanArray4);
        java.lang.Class<?> wildcardClass23 = booleanArray4.getClass();
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
        org.junit.Assert.assertEquals("'" + boolean19 + "' != '" + false + "'", boolean19, false);
        org.junit.Assert.assertEquals("'" + boolean20 + "' != '" + false + "'", boolean20, false);
        org.junit.Assert.assertEquals("'" + boolean21 + "' != '" + false + "'", boolean21, false);
        org.junit.Assert.assertEquals("'" + boolean22 + "' != '" + false + "'", boolean22, false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5097");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(false, (int) (byte) 100, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test5098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5098");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, 97, 35, 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test5099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5099");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("off", "on", "on", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5100");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, 1, (int) (byte) -1, (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test5101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5101");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(false, 52, 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test5102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5102");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 1, (java.lang.Integer) 0, (java.lang.Integer) 100, (java.lang.Integer) 1);
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test5103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5103");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) ' ', (int) (byte) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5104");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) false, "on", "hi!", "yes");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test5105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5105");
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) (short) 100, 52, 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5106");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) (byte) 10, 0, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5107");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (short) 100, 52, (int) 'a', (int) (short) 100);
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test5108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5108");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) (byte) 100, 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5109");
        boolean[] booleanArray6 = new boolean[] { true, true, false, true, false, false };
        boolean boolean7 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        boolean boolean8 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        boolean boolean9 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        boolean boolean10 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        boolean boolean11 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        boolean boolean12 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        boolean boolean13 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        boolean boolean14 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        boolean boolean15 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        boolean boolean16 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        boolean boolean17 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        boolean boolean18 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        boolean boolean19 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        boolean boolean20 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        boolean boolean21 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        boolean boolean22 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        boolean boolean23 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        java.lang.Class<?> wildcardClass24 = booleanArray6.getClass();
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[true, true, false, true, false, false]");
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test5110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5110");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, (int) (short) 10, (int) (short) 10, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test5111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5111");
        boolean[] booleanArray2 = new boolean[] { true, false };
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.xor(booleanArray2);
        boolean boolean4 = org.apache.commons.lang.BooleanUtils.xor(booleanArray2);
        boolean boolean5 = org.apache.commons.lang.BooleanUtils.xor(booleanArray2);
        boolean boolean6 = org.apache.commons.lang.BooleanUtils.xor(booleanArray2);
        java.lang.Class<?> wildcardClass7 = booleanArray2.getClass();
        org.junit.Assert.assertNotNull(booleanArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray2), "[true, false]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test5112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5112");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("", "no", "off");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
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
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) '4', (int) (short) 0, (int) (short) 10, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5114");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (byte) 10, 0, 0, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5115");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("true", "on", "", "true");
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test5116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5116");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (byte) 0, 1, 0, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
    }

    @Test
    public void test5117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5117");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 32, (java.lang.Integer) 52, (java.lang.Integer) 52, (java.lang.Integer) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
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
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("true", "off", "false", "false");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5119");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean(0, 10, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5120");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 100, (java.lang.Integer) 52, (java.lang.Integer) 1, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5121");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("", "", "true", "off");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test5122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5122");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 35, (java.lang.Integer) 10, (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5123");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 0, (java.lang.Integer) 32, (java.lang.Integer) 52, (java.lang.Integer) 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5124");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("", "yes", "", "on");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
    }

    @Test
    public void test5125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5125");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(false, (int) 'a', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test5126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5126");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, (int) '#', (int) (byte) 1, (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test5127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5127");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, 52, (int) (byte) 0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test5128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5128");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(false, (int) ' ', (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test5129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5129");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, 0, 100, 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5130");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, 32, (int) (byte) 0, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5131");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("", "false", "off", "on");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5132");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) 97, (java.lang.Integer) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5133");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) 'a', 0, (int) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5134");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("on", "true", "", "true");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5135");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("off", "no", "", "false");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5136");
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
        java.lang.Boolean boolean19 = org.apache.commons.lang.BooleanUtils.xor(booleanArray4);
        java.lang.Boolean boolean20 = org.apache.commons.lang.BooleanUtils.xor(booleanArray4);
        java.lang.Boolean boolean21 = org.apache.commons.lang.BooleanUtils.xor(booleanArray4);
        java.lang.Class<?> wildcardClass22 = booleanArray4.getClass();
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
        org.junit.Assert.assertEquals("'" + boolean19 + "' != '" + false + "'", boolean19, false);
        org.junit.Assert.assertEquals("'" + boolean20 + "' != '" + false + "'", boolean20, false);
        org.junit.Assert.assertEquals("'" + boolean21 + "' != '" + false + "'", boolean21, false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test5137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5137");
        java.lang.Boolean[] booleanArray6 = new java.lang.Boolean[] { false, false, true, true, false, false };
        java.lang.Boolean boolean7 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + false + "'", boolean7, false);
    }

    @Test
    public void test5138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5138");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) '4', 100, (int) (short) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5139");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 52, (java.lang.Integer) 97, (java.lang.Integer) 35, (java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5140");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("off", "off", "no", "false");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test5141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5141");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, (int) '4', (-1), (int) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test5142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5142");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(false, (int) (byte) 10, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test5143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5143");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) (-1), (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5144");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(97, 0, 35, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5145");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean(100, (int) '#', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5146");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (short) 1, 97, (int) 'a');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test5147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5147");
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) (short) -1, 52, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5148");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("on", "off", "yes", "true");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5149");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("false", "true", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5150");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("true", "no", "on", "no");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5151");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 10, (java.lang.Integer) 35, (java.lang.Integer) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5152");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 35, (java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) 35);
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test5153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5153");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) false, "", "hi!", "off");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test5154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5154");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((-1), (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5155");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(0, (int) '4', (int) (short) 0, 35);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
    }

    @Test
    public void test5156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5156");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, (int) 'a', 10, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test5157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5157");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, 35, (int) (short) -1, 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test5158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5158");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean(97, 1, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5159");
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("on", "hi!", "on");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5160");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (short) 10, (-1), (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test5161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5161");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 1, (java.lang.Integer) 10, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5162");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 52, (java.lang.Integer) 32, (java.lang.Integer) 97, (java.lang.Integer) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5163");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) true, "", "", "true");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test5164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5164");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(false, (int) (short) 100, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5165");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("true", "yes", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5166");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(true, (int) (short) 10, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test5167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5167");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("false", "yes", "yes");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5168");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (byte) 1, (int) (byte) 10, 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5169");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (short) -1, 0, (int) (short) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5170");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) (short) 1, (int) '4', 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5171");
        boolean[] booleanArray2 = new boolean[] { true, true };
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.xor(booleanArray2);
        boolean boolean4 = org.apache.commons.lang.BooleanUtils.xor(booleanArray2);
        boolean boolean5 = org.apache.commons.lang.BooleanUtils.xor(booleanArray2);
        java.lang.Class<?> wildcardClass6 = booleanArray2.getClass();
        org.junit.Assert.assertNotNull(booleanArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray2), "[true, true]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test5172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5172");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) 'a', 100, (int) '4', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5173");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(false, (int) (short) 100, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test5174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5174");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (short) -1, 35, 0, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5175");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) false, "hi!", "false", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "false" + "'", str4, "false");
    }

    @Test
    public void test5176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5176");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, 100, 32, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test5177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5177");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("true", "hi!", "yes", "on");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5178");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("off", "no", "on");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5179");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean(97, (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5180");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("", "no", "yes", "true");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5181");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, (int) (byte) 1, (int) (byte) -1, 32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test5182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5182");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("yes", "yes", "no", "yes");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test5183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5183");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(100, 100, (int) (short) -1, 10);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test5184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5184");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) false, "hi!", "yes", "off");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "yes" + "'", str4, "yes");
    }

    @Test
    public void test5185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5185");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) '#', 1, (int) (short) 10, (int) '#');
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test5186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5186");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(true, (int) (short) 100, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test5187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5187");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = org.apache.commons.lang.BooleanUtils.xor(booleanArray1);
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.xor(booleanArray1);
        java.lang.Class<?> wildcardClass4 = booleanArray1.getClass();
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray1), "[false]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5188");
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 52, (java.lang.Integer) 52, (java.lang.Integer) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test5189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5189");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(false, 100, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5190");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 100, (java.lang.Integer) 52, (java.lang.Integer) 97, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5191");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean(100, (int) '4', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5192");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("hi!", "", "hi!", "yes");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
    }

    @Test
    public void test5193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5193");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, 0, (int) (byte) 1, (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5194");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 32, (java.lang.Integer) 10, (java.lang.Integer) 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5195");
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) ' ', (int) ' ', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test5196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5196");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) true, "yes", "", "no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "yes" + "'", str4, "yes");
    }

    @Test
    public void test5197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5197");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 97, (java.lang.Integer) 0, (java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5198");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 100, (java.lang.Integer) 97, (java.lang.Integer) 10, (java.lang.Integer) 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5199");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(false, (-1), 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test5200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5200");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(0, (-1), 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5201");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) 100, (java.lang.Integer) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5202");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean(35, (int) (byte) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5203");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (short) 10, (int) (byte) 10, 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test5204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5204");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("hi!", "", "off", "hi!");
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test5205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5205");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (byte) 1, (int) (short) 100, 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5206");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 97, (java.lang.Integer) 10, (java.lang.Integer) 0, (java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5207");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("off", "on", "on", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5208");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("true", "off", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5209");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) true, "hi!", "no", "no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test5210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5210");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("no", "off", "no", "on");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
    }

    @Test
    public void test5211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5211");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) (byte) -1, (int) (byte) 0, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5212");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("", "no", "", "false");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
    }

    @Test
    public void test5213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5213");
        boolean[] booleanArray6 = new boolean[] { true, false, true, true, false, false };
        boolean boolean7 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        boolean boolean8 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        boolean boolean9 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        boolean boolean10 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        boolean boolean11 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        boolean boolean12 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        boolean boolean13 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        boolean boolean14 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        boolean boolean15 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        boolean boolean16 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        boolean boolean17 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        boolean boolean18 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        java.lang.Class<?> wildcardClass19 = booleanArray6.getClass();
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[true, false, true, true, false, false]");
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5214");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (short) 10, (int) 'a', 32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test5215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5215");
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
        java.lang.Boolean boolean14 = org.apache.commons.lang.BooleanUtils.xor(booleanArray2);
        java.lang.Boolean boolean15 = org.apache.commons.lang.BooleanUtils.xor(booleanArray2);
        java.lang.Boolean boolean16 = org.apache.commons.lang.BooleanUtils.xor(booleanArray2);
        java.lang.Boolean boolean17 = org.apache.commons.lang.BooleanUtils.xor(booleanArray2);
        java.lang.Boolean boolean18 = org.apache.commons.lang.BooleanUtils.xor(booleanArray2);
        java.lang.Class<?> wildcardClass19 = booleanArray2.getClass();
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
        org.junit.Assert.assertEquals("'" + boolean14 + "' != '" + false + "'", boolean14, false);
        org.junit.Assert.assertEquals("'" + boolean15 + "' != '" + false + "'", boolean15, false);
        org.junit.Assert.assertEquals("'" + boolean16 + "' != '" + false + "'", boolean16, false);
        org.junit.Assert.assertEquals("'" + boolean17 + "' != '" + false + "'", boolean17, false);
        org.junit.Assert.assertEquals("'" + boolean18 + "' != '" + false + "'", boolean18, false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5216");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean(100, 97, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5217");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) (-1), (java.lang.Integer) 100, (java.lang.Integer) 97, (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5218");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("", "", "no", "off");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test5219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5219");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, 10, (int) (short) -1, 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test5220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5220");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, (int) (byte) 1, (int) (byte) -1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test5221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5221");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, (-1), (int) (short) 0, 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test5222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5222");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) (short) 100, 32, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5223");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 32, (java.lang.Integer) 0, (java.lang.Integer) 35, (java.lang.Integer) 32);
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test5224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5224");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(false, (int) (byte) 0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test5225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5225");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) (-1), (java.lang.Integer) 0, (java.lang.Integer) 97, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5226");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) false, "hi!", "off", "false");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "off" + "'", str4, "off");
    }

    @Test
    public void test5227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5227");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) (short) 10, (-1), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5228");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 100, (java.lang.Integer) 32, (java.lang.Integer) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5229");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (short) 0, (int) (byte) -1, 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test5230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5230");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 0, (java.lang.Integer) 97, (java.lang.Integer) 32, (java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5231");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) false, "false", "on", "on");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "on" + "'", str4, "on");
    }

    @Test
    public void test5232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5232");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(true, (int) (short) 1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test5233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5233");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 100, (java.lang.Integer) 1, (java.lang.Integer) 35, (java.lang.Integer) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5234");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean(97, (int) (byte) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5235");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 97, (java.lang.Integer) 35, (java.lang.Integer) 0, (java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5236");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(100, 97, (int) (byte) -1, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5237");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 10, (java.lang.Integer) 32, (java.lang.Integer) 0, (java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5238");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean(1, 97, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5239");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("", "false", "off", "no");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5240");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, 1, (int) (byte) 1, 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test5241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5241");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(true, (int) ' ', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test5242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5242");
        java.lang.Boolean[] booleanArray3 = new java.lang.Boolean[] { false, false, true };
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.xor(booleanArray3);
        java.lang.Boolean boolean5 = org.apache.commons.lang.BooleanUtils.xor(booleanArray3);
        java.lang.Boolean boolean6 = org.apache.commons.lang.BooleanUtils.xor(booleanArray3);
        java.lang.Boolean boolean7 = org.apache.commons.lang.BooleanUtils.xor(booleanArray3);
        java.lang.Boolean boolean8 = org.apache.commons.lang.BooleanUtils.xor(booleanArray3);
        java.lang.Boolean boolean9 = org.apache.commons.lang.BooleanUtils.xor(booleanArray3);
        java.lang.Boolean boolean10 = org.apache.commons.lang.BooleanUtils.xor(booleanArray3);
        java.lang.Class<?> wildcardClass11 = booleanArray3.getClass();
        org.junit.Assert.assertNotNull(booleanArray3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5243");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("false", "yes", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5244");
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("off", "true", "off");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5245");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) false, "on", "yes", "no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "yes" + "'", str4, "yes");
    }

    @Test
    public void test5246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5246");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("false", "false", "", "false");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test5247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5247");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (byte) 10, (int) (short) 100, (int) (byte) -1, (int) (short) 10);
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test5248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5248");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(1, (int) '#', 97, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5249");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("no", "", "no", "hi!");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
    }

    @Test
    public void test5250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5250");
        java.lang.Boolean[] booleanArray3 = new java.lang.Boolean[] { false, false, true };
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.xor(booleanArray3);
        java.lang.Boolean boolean5 = org.apache.commons.lang.BooleanUtils.xor(booleanArray3);
        java.lang.Boolean boolean6 = org.apache.commons.lang.BooleanUtils.xor(booleanArray3);
        java.lang.Boolean boolean7 = org.apache.commons.lang.BooleanUtils.xor(booleanArray3);
        java.lang.Boolean boolean8 = org.apache.commons.lang.BooleanUtils.xor(booleanArray3);
        java.lang.Boolean boolean9 = org.apache.commons.lang.BooleanUtils.xor(booleanArray3);
        java.lang.Class<?> wildcardClass10 = booleanArray3.getClass();
        org.junit.Assert.assertNotNull(booleanArray3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5251");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(true, 10, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test5252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5252");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("no", "off", "yes", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5253");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) false, "true", "false", "no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "false" + "'", str4, "false");
    }

    @Test
    public void test5254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5254");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) '#', 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5255");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("", "", "", "off");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test5256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5256");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((-1), (int) (short) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5257");
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("on", "on", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test5258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5258");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("yes", "hi!", "false", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5259");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(false, 35, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test5260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5260");
        boolean[] booleanArray6 = new boolean[] { true, true, false, true, false, false };
        boolean boolean7 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        boolean boolean8 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        boolean boolean9 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        boolean boolean10 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        boolean boolean11 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        boolean boolean12 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        boolean boolean13 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        boolean boolean14 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        boolean boolean15 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        boolean boolean16 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        boolean boolean17 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        boolean boolean18 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        boolean boolean19 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        boolean boolean20 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        java.lang.Class<?> wildcardClass21 = booleanArray6.getClass();
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[true, true, false, true, false, false]");
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5261");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(10, 97, (int) (short) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5262");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, (int) (byte) 0, (int) '4', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5263");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 32, (java.lang.Integer) 1, (java.lang.Integer) 97, (java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5264");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) false, "true", "false", "off");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "false" + "'", str4, "false");
    }

    @Test
    public void test5265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5265");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) (-1), (java.lang.Integer) 35, (java.lang.Integer) 35, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5266");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, 100, (int) (byte) 100, (int) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test5267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5267");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) 52, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5268");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 10, (java.lang.Integer) 52, (java.lang.Integer) 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5269");
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean(10, (int) (byte) 10, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test5270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5270");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("hi!", "on", "on", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5271");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) (byte) 100, (int) (short) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5272");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 97, (java.lang.Integer) 35, (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5273");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) (byte) 1, (int) (short) 10, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5274");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, (int) (short) 1, (int) (short) 0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test5275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5275");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 35, (java.lang.Integer) 10, (java.lang.Integer) 35, (java.lang.Integer) 10);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
    }

    @Test
    public void test5276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5276");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("true", "hi!", "on", "no");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5277");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (byte) -1, (int) (short) 100, (int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5278");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 52, (java.lang.Integer) 32, (java.lang.Integer) 52, (java.lang.Integer) 32);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
    }

    @Test
    public void test5279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5279");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("no", "yes", "yes", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5280");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("false", "on", "off");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5281");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (short) -1, (int) (byte) 10, 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5282");
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean(32, (int) ' ', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test5283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5283");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, (int) (short) 100, (int) (short) 1, 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test5284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5284");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("no", "true", "no", "false");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
    }

    @Test
    public void test5285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5285");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (byte) -1, (int) (byte) 0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5286");
        boolean[] booleanArray5 = new boolean[] { false, true, false, true, true };
        boolean boolean6 = org.apache.commons.lang.BooleanUtils.xor(booleanArray5);
        java.lang.Class<?> wildcardClass7 = booleanArray5.getClass();
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, true, false, true, true]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test5287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5287");
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) (short) 10, 10, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test5288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5288");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("on", "yes", "off", "on");
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test5289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5289");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (byte) -1, (int) 'a', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test5290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5290");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean(0, (int) (short) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5291");
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean(100, (int) (short) 10, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5292");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (byte) 1, 35, 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5293");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(0, (int) (short) 10, (int) ' ', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5294");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean(100, (int) 'a', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5295");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 1, (java.lang.Integer) 10, (java.lang.Integer) 35, (java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5296");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("no", "on", "false", "yes");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5297");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 100, (java.lang.Integer) 35, (java.lang.Integer) 100, (java.lang.Integer) 10);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
    }

    @Test
    public void test5298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5298");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (byte) 0, 52, (int) (byte) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5299");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 35, (java.lang.Integer) 0, (java.lang.Integer) 35, (java.lang.Integer) 52);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
    }

    @Test
    public void test5300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5300");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(100, 97, 32, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5301");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, 100, (int) '4', (int) '4');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test5302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5302");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (short) 1, 52, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test5303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5303");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("true", "false", "yes");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5304");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) true, "yes", "hi!", "off");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "yes" + "'", str4, "yes");
    }

    @Test
    public void test5305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5305");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) (byte) 100, (int) 'a', 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5306");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, 100, 0, (int) ' ');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5307");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(true, (int) ' ', 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test5308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5308");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("", "", "on", "false");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test5309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5309");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("yes", "", "", "true");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5310");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(true, 100, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test5311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5311");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("false", "off", "off");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5312");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) '4', (int) (short) 0, 35, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5313");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (byte) -1, (int) (short) 100, (int) (byte) 10, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5314");
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 97);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test5315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5315");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) 'a', (int) (short) 10, (int) 'a', (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
    }

    @Test
    public void test5316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5316");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("hi!", "off", "yes", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5317");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, (int) '#', (int) (short) 100, (int) '4');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test5318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5318");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, (int) (byte) 10, (int) (byte) 0, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test5319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5319");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) (byte) 0, (int) '4', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5320");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 52, (java.lang.Integer) (-1), (java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5321");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) false, "off", "off", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "off" + "'", str4, "off");
    }

    @Test
    public void test5322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5322");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (byte) 0, (int) (byte) -1, (int) '#', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5323");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (short) 0, (int) (short) -1, 35, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5324");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, (int) ' ', (int) (short) 100, (int) 'a');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test5325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5325");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean(32, (int) (byte) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5326");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (short) 0, (-1), 32, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5327");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, 0, 100, 32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test5328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5328");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, 1, (int) (short) 10, 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test5329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5329");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 35, (java.lang.Integer) 35, (java.lang.Integer) 52, (java.lang.Integer) (-1));
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test5330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5330");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, 0, 35, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test5331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5331");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 52, (java.lang.Integer) (-1), (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5332");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(52, (int) (byte) 1, 52, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
    }

    @Test
    public void test5333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5333");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) false, "no", "on", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "on" + "'", str4, "on");
    }

    @Test
    public void test5334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5334");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(false, (int) (byte) 0, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5335");
        boolean[] booleanArray6 = new boolean[] { true, true, false, true, false, false };
        boolean boolean7 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        boolean boolean8 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        boolean boolean9 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        boolean boolean10 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        boolean boolean11 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        boolean boolean12 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        boolean boolean13 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        boolean boolean14 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        boolean boolean15 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        boolean boolean16 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        boolean boolean17 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        boolean boolean18 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        boolean boolean19 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        boolean boolean20 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        boolean boolean21 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        java.lang.Class<?> wildcardClass22 = booleanArray6.getClass();
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[true, true, false, true, false, false]");
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test5336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5336");
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 100, (java.lang.Integer) 52, (java.lang.Integer) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5337");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("true", "true", "on", "hi!");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test5338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5338");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("", "on", "yes");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5339");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(0, (int) ' ', (int) (byte) -1, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5340");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("", "", "", "true");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test5341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5341");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(true, (int) (short) -1, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5342");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("", "", "true", "hi!");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test5343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5343");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("yes", "off", "off", "on");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5344");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 35, (java.lang.Integer) 32, (java.lang.Integer) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5345");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(true, (int) (byte) 0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test5346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5346");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 97, (java.lang.Integer) 0, (java.lang.Integer) 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5347");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 100, (java.lang.Integer) 1, (java.lang.Integer) 35, (java.lang.Integer) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5348");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("off", "", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5349");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) '#', (int) (byte) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5350");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) false, "", "no", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "no" + "'", str4, "no");
    }

    @Test
    public void test5351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5351");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) (-1), (java.lang.Integer) 52, (java.lang.Integer) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5352");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(true, 10, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test5353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5353");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("hi!", "false", "false", "on");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5354");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 52, (java.lang.Integer) 32, (java.lang.Integer) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5355");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, (-1), 0, (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test5356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5356");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, 1, 0, 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test5357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5357");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 1, (java.lang.Integer) 1, (java.lang.Integer) 0, (java.lang.Integer) 52);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test5358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5358");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) false, "on", "true", "true");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "true" + "'", str4, "true");
    }

    @Test
    public void test5359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5359");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) false, "hi!", "hi!", "on");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test5360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5360");
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean(1, 1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test5361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5361");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 52, (java.lang.Integer) 35, (java.lang.Integer) 10, (java.lang.Integer) 52);
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test5362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5362");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, 32, 52, (int) 'a');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test5363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5363");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) true, "no", "true", "on");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "no" + "'", str4, "no");
    }

    @Test
    public void test5364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5364");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) '4', (int) (short) 100, 35, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5365");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 52, (java.lang.Integer) 100, (java.lang.Integer) 35, (java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5366");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(35, (int) (byte) 100, 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5367");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, 10, (-1), (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test5368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5368");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 0, (java.lang.Integer) (-1), (java.lang.Integer) (-1), (java.lang.Integer) 0);
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test5369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5369");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 0, (java.lang.Integer) 32, (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5370");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) (byte) 100, 52, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5371");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 0, (java.lang.Integer) 1, (java.lang.Integer) 97, (java.lang.Integer) 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5372");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, 100, 97, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test5373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5373");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 1, (java.lang.Integer) 0, (java.lang.Integer) 97, (java.lang.Integer) 1);
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test5374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5374");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, (int) '#', (int) (byte) 1, 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test5375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5375");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (short) -1, 10, (int) 'a', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5376");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 35, (java.lang.Integer) 35, (java.lang.Integer) 35, (java.lang.Integer) (-1));
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test5377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5377");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) 'a', 0, 0, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5378");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, (int) (byte) 100, (-1), (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test5379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5379");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("off", "on", "false");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5380");
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
        java.lang.Boolean boolean14 = org.apache.commons.lang.BooleanUtils.xor(booleanArray2);
        java.lang.Boolean boolean15 = org.apache.commons.lang.BooleanUtils.xor(booleanArray2);
        java.lang.Class<?> wildcardClass16 = booleanArray2.getClass();
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
        org.junit.Assert.assertEquals("'" + boolean14 + "' != '" + false + "'", boolean14, false);
        org.junit.Assert.assertEquals("'" + boolean15 + "' != '" + false + "'", boolean15, false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5381");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) (-1), (java.lang.Integer) 35, (java.lang.Integer) 0, (java.lang.Integer) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5382");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) false, "no", "true", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "true" + "'", str4, "true");
    }

    @Test
    public void test5383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5383");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (byte) -1, (int) (short) 0, (int) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5384");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 52, (java.lang.Integer) 35, (java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5385");
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean(0, 100, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5386");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(false, 32, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5387");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("hi!", "", "", "hi!");
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test5388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5388");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 1, (java.lang.Integer) 35, (java.lang.Integer) (-1), (java.lang.Integer) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5389");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean(0, 97, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5390");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) true, "off", "", "true");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "off" + "'", str4, "off");
    }

    @Test
    public void test5391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5391");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) true, "false", "hi!", "false");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "false" + "'", str4, "false");
    }

    @Test
    public void test5392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5392");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) (-1), (java.lang.Integer) 35, (java.lang.Integer) (-1), (java.lang.Integer) 35);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
    }

    @Test
    public void test5393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5393");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, 0, (int) (short) -1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test5394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5394");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(true, (int) (byte) 10, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test5395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5395");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("on", "false", "false", "true");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5396");
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) (byte) 0, (int) (short) 0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test5397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5397");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("no", "yes", "false", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5398");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(false, (int) (short) 0, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test5399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5399");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 0, (java.lang.Integer) 52, (java.lang.Integer) 10, (java.lang.Integer) 0);
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test5400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5400");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(true, (int) (short) -1, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5401");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) 'a', (int) (short) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5402");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (byte) -1, (int) (short) 100, (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test5403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5403");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(false, 100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test5404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5404");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) (short) -1, (int) '4', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5405");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, (-1), 0, (int) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5406");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(35, (int) ' ', (int) (short) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5407");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("true", "off", "on", "true");
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test5408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5408");
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 32, (java.lang.Integer) 1, (java.lang.Integer) 32);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5409");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("off", "no", "true", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5410");
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("false", "false", "on");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test5411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5411");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) (short) 0, 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5412");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) ' ', 10, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5413");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 97, (java.lang.Integer) (-1), (java.lang.Integer) 35, (java.lang.Integer) 97);
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test5414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5414");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, (int) ' ', 10, 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test5415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5415");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("yes", "yes", "off", "hi!");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test5416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5416");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 35, (java.lang.Integer) 0, (java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5417");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("true", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5418");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) true, "off", "", "false");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "off" + "'", str4, "off");
    }

    @Test
    public void test5419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5419");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 52, (java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5420");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(true, 52, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test5421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5421");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (byte) 0, (int) (short) 1, 97, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5422");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, 10, 0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5423");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(100, 10, 35, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5424");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("", "yes", "off");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5425");
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5426");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { true };
        java.lang.Boolean boolean2 = org.apache.commons.lang.BooleanUtils.xor(booleanArray1);
        java.lang.Boolean boolean3 = org.apache.commons.lang.BooleanUtils.xor(booleanArray1);
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.xor(booleanArray1);
        java.lang.Boolean boolean5 = org.apache.commons.lang.BooleanUtils.xor(booleanArray1);
        java.lang.Boolean boolean6 = org.apache.commons.lang.BooleanUtils.xor(booleanArray1);
        java.lang.Boolean boolean7 = org.apache.commons.lang.BooleanUtils.xor(booleanArray1);
        java.lang.Boolean boolean8 = org.apache.commons.lang.BooleanUtils.xor(booleanArray1);
        java.lang.Boolean boolean9 = org.apache.commons.lang.BooleanUtils.xor(booleanArray1);
        java.lang.Boolean boolean10 = org.apache.commons.lang.BooleanUtils.xor(booleanArray1);
        java.lang.Boolean boolean11 = org.apache.commons.lang.BooleanUtils.xor(booleanArray1);
        java.lang.Class<?> wildcardClass12 = booleanArray1.getClass();
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5427");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (short) -1, (int) '#', 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5428");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, (int) ' ', 100, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test5429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5429");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, 52, (int) (short) -1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test5430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5430");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("on", "", "true", "off");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5431");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, (int) ' ', (-1), (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test5432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5432");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (byte) 0, 52, (int) (short) 0, (int) 'a');
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
    }

    @Test
    public void test5433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5433");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("off", "hi!", "true", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5434");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("false", "", "hi!", "true");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5435");
        java.lang.Boolean[] booleanArray2 = new java.lang.Boolean[] { false, false };
        java.lang.Boolean boolean3 = org.apache.commons.lang.BooleanUtils.xor(booleanArray2);
        org.junit.Assert.assertNotNull(booleanArray2);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test5436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5436");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("on", "no", "false", "true");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5437");
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) (byte) 10, (int) (byte) 10, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test5438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5438");
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean(52, (int) (short) 1, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5439");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) 'a', 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5440");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("yes", "true", "no");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5441");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("", "yes", "yes");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5442");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("true", "false", "hi!", "yes");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5443");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) (byte) 1, (int) (byte) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5444");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) (byte) -1, 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5445");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) false, "yes", "no", "on");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "no" + "'", str4, "no");
    }

    @Test
    public void test5446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5446");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(1, (int) (short) 100, (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5447");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, (int) '4', (int) ' ', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test5448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5448");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) '4', (int) (byte) 1, (int) (short) 0, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5449");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (byte) 100, 97, 32, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5450");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 10, (java.lang.Integer) 97, (java.lang.Integer) 100, (java.lang.Integer) 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5451");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(false, (int) (short) 100, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test5452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5452");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("", "", "no", "true");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test5453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5453");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("", "on", "yes", "yes");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5454");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 97, (java.lang.Integer) 1, (java.lang.Integer) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5455");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, (int) '4', 0, 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test5456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5456");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 52, (java.lang.Integer) 32, (java.lang.Integer) 97, (java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5457");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, 32, (int) (byte) 1, 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test5458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5458");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(100, (int) (short) 1, 32, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5459");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) false, "off", "", "yes");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test5460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5460");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) (short) 100, (int) ' ', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5461");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 32, (java.lang.Integer) 0, (java.lang.Integer) 0, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5462");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, (int) '4', (int) (short) 10, 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test5463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5463");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 100, (java.lang.Integer) 52, (java.lang.Integer) 0, (java.lang.Integer) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5464");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, 35, 1, 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test5465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5465");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, 97, (int) (byte) 100, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test5466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5466");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 97, (java.lang.Integer) 1, (java.lang.Integer) 35, (java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5467");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (short) 0, (int) (short) 100, 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test5468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5468");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) false, "false", "true", "false");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "true" + "'", str4, "true");
    }

    @Test
    public void test5469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5469");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) false, "hi!", "no", "yes");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "no" + "'", str4, "no");
    }

    @Test
    public void test5470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5470");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) true, "true", "no", "no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "true" + "'", str4, "true");
    }

    @Test
    public void test5471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5471");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("true", "on", "true", "");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
    }

    @Test
    public void test5472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5472");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 0, (java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5473");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(32, 0, 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5474");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, (int) (byte) 100, (int) (byte) 1, 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test5475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5475");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("", "", "true", "no");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test5476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5476");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(true, (int) '4', (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test5477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5477");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("false", "hi!", "hi!", "no");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5478");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(true, 32, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test5479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5479");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (byte) 100, (int) (short) 10, (int) (byte) 100, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
    }

    @Test
    public void test5480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5480");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(false, (int) (byte) -1, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5481");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5482");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(true, 97, 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test5483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5483");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (byte) -1, 0, 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5484");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(52, (int) (short) 10, (int) (short) -1, (int) '4');
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test5485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5485");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) true, "no", "no", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "no" + "'", str4, "no");
    }

    @Test
    public void test5486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5486");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (byte) 100, (int) (byte) 10, (int) 'a', 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5487");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(10, (int) (short) -1, (int) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5488");
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean(1, (int) (byte) 1, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test5489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5489");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, (int) (byte) 0, (int) (byte) 1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5490");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean(32, 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5491");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) true, "on", "yes", "false");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "on" + "'", str4, "on");
    }

    @Test
    public void test5492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5492");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("on", "hi!", "no", "off");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5493");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) (byte) 1, 52, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5494");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) 'a', 52, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5495");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(true, (int) (short) 0, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test5496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5496");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 0, (java.lang.Integer) 52, (java.lang.Integer) (-1), (java.lang.Integer) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5497");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(true, 1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test5498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5498");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(32, (int) (short) -1, 35, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5499");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) true, "", "hi!", "yes");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test5500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5500");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("on", "yes", "off");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }
}

