import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest12 {

    public static boolean debug = false;

    @Test
    public void test6001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6001");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(true, 0, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test6002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6002");
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 1, (java.lang.Integer) 1, (java.lang.Integer) 52);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test6003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6003");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (short) 0, (int) (byte) 100, (-1), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6004");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 0, (java.lang.Integer) 97, (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6005");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean(52, (int) (byte) 10, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6006");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(97, 0, 32, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6007");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("", "on", "", "off");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
    }

    @Test
    public void test6008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6008");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 52, (java.lang.Integer) 32, (java.lang.Integer) 1, (java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6009");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) 'a', 1, (int) (short) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6010");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("off", "yes", "true");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6011");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (short) -1, (int) ' ', (int) (short) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6012");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 1, (java.lang.Integer) 97, (java.lang.Integer) 100, (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6013");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(true, 32, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test6014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6014");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("on", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6015");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, (int) ' ', (int) (byte) 1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test6016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6016");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("false", "hi!", "off", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6017");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (short) 100, (-1), 52, (int) (short) 100);
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test6018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6018");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 52, (java.lang.Integer) 0, (java.lang.Integer) 32, (java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6019");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) 'a', 52, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6020");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (short) 100, 52, 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6021");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, 52, (int) (byte) 1, 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test6022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6022");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 0, (java.lang.Integer) 52, (java.lang.Integer) 35, (java.lang.Integer) 0);
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test6023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6023");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) 32, (java.lang.Integer) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6024");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(true, (int) (byte) 1, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test6025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6025");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("off", "off", "off", "on");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test6026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6026");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 35, (java.lang.Integer) (-1), (java.lang.Integer) 35, (java.lang.Integer) 1);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
    }

    @Test
    public void test6027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6027");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, (int) (byte) 0, (-1), (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test6028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6028");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 0, (java.lang.Integer) 35, (java.lang.Integer) 97, (java.lang.Integer) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6029");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) (short) 1, 35, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6030");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) '4', (int) (byte) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6031");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, 10, 10, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test6032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6032");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) true, "false", "yes", "false");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "false" + "'", str4, "false");
    }

    @Test
    public void test6033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6033");
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
        boolean boolean17 = org.apache.commons.lang.BooleanUtils.xor(booleanArray4);
        boolean boolean18 = org.apache.commons.lang.BooleanUtils.xor(booleanArray4);
        boolean boolean19 = org.apache.commons.lang.BooleanUtils.xor(booleanArray4);
        boolean boolean20 = org.apache.commons.lang.BooleanUtils.xor(booleanArray4);
        boolean boolean21 = org.apache.commons.lang.BooleanUtils.xor(booleanArray4);
        boolean boolean22 = org.apache.commons.lang.BooleanUtils.xor(booleanArray4);
        boolean boolean23 = org.apache.commons.lang.BooleanUtils.xor(booleanArray4);
        boolean boolean24 = org.apache.commons.lang.BooleanUtils.xor(booleanArray4);
        boolean boolean25 = org.apache.commons.lang.BooleanUtils.xor(booleanArray4);
        java.lang.Class<?> wildcardClass26 = booleanArray4.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test6034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6034");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, (int) (byte) 100, 0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test6035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6035");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("", "true", "yes", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6036");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) false, "false", "", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test6037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6037");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(true, 1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test6038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6038");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 100, (java.lang.Integer) 35, (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6039");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) (-1), (java.lang.Integer) 35, (java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6040");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean(100, 32, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6041");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(52, 10, (int) (short) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6042");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) false, "", "true", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "true" + "'", str4, "true");
    }

    @Test
    public void test6043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6043");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) false, "hi!", "off", "off");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "off" + "'", str4, "off");
    }

    @Test
    public void test6044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6044");
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
        java.lang.Boolean boolean19 = org.apache.commons.lang.BooleanUtils.xor(booleanArray2);
        java.lang.Class<?> wildcardClass20 = booleanArray2.getClass();
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
        org.junit.Assert.assertEquals("'" + boolean19 + "' != '" + false + "'", boolean19, false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6045");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) false, "", "", "true");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test6046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6046");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("off", "", "hi!", "false");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6047");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("true", "hi!", "true", "yes");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
    }

    @Test
    public void test6048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6048");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) (byte) -1, (int) ' ', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6049");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(false, 97, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test6050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6050");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) (short) 0, 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6051");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) true, "yes", "no", "yes");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "yes" + "'", str4, "yes");
    }

    @Test
    public void test6052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6052");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 52, (java.lang.Integer) 52, (java.lang.Integer) 32, (java.lang.Integer) (-1));
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test6053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6053");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 97, (java.lang.Integer) 0, (java.lang.Integer) 100, (java.lang.Integer) 97);
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test6054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6054");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 97, (java.lang.Integer) 52, (java.lang.Integer) 97, (java.lang.Integer) 10);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
    }

    @Test
    public void test6055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6055");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean(0, 52, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6056");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(0, 1, (-1), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6057");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) (byte) 1, 32, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6058");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, 100, (int) (short) 0, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test6059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6059");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("on", "off", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6060");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("on", "yes", "false", "off");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6061");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, (int) (byte) -1, 0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test6062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6062");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (short) 100, (int) (byte) 10, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6063");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) true, "off", "no", "no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "off" + "'", str4, "off");
    }

    @Test
    public void test6064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6064");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("", "", "", "no");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test6065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6065");
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
        boolean boolean14 = org.apache.commons.lang.BooleanUtils.xor(booleanArray4);
        boolean boolean15 = org.apache.commons.lang.BooleanUtils.xor(booleanArray4);
        java.lang.Class<?> wildcardClass16 = booleanArray4.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6066");
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
        boolean boolean14 = org.apache.commons.lang.BooleanUtils.xor(booleanArray4);
        boolean boolean15 = org.apache.commons.lang.BooleanUtils.xor(booleanArray4);
        boolean boolean16 = org.apache.commons.lang.BooleanUtils.xor(booleanArray4);
        boolean boolean17 = org.apache.commons.lang.BooleanUtils.xor(booleanArray4);
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test6067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6067");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (short) 0, 52, 52, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6068");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, 0, 52, 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test6069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6069");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 32, (java.lang.Integer) 0, (java.lang.Integer) 1, (java.lang.Integer) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6070");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) (byte) 10, (int) ' ', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6071");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((-1), (int) ' ', 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6072");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6073");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean(97, 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6074");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (short) 10, (int) '#', 52, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6075");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (short) 1, 97, (int) (byte) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6076");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, (int) ' ', 97, 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test6077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6077");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, (-1), (int) (byte) 100, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test6078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6078");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) 52, (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6079");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((-1), (-1), (int) 'a', (int) (short) 10);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test6080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6080");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("false", "", "on");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6081");
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test6082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6082");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, 100, 100, 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test6083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6083");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) (-1), (java.lang.Integer) 0, (java.lang.Integer) 100, (java.lang.Integer) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6084");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (byte) 0, 35, 0, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
    }

    @Test
    public void test6085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6085");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) (-1), (java.lang.Integer) 1, (java.lang.Integer) 35, (java.lang.Integer) (-1));
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test6086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6086");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 32, (java.lang.Integer) 0, (java.lang.Integer) 0, (java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6087");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (byte) -1, (int) (byte) -1, 52, 52);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test6088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6088");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("false", "", "off", "off");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6089");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("true", "true", "on", "");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test6090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6090");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(false, 97, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test6091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6091");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean(35, 52, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6092");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(false, (int) (byte) 0, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test6093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6093");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(52, 97, 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6094");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) (short) 0, (-1), 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6095");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 0, (java.lang.Integer) 1, (java.lang.Integer) 1, (java.lang.Integer) 0);
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test6096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6096");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("false", "true", "", "on");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6097");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) true, "hi!", "false", "off");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test6098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6098");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("true", "off", "no", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6099");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, 97, (int) (short) 100, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test6100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6100");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("yes", "on", "off");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6101");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) (-1), (java.lang.Integer) 32, (java.lang.Integer) 32, (java.lang.Integer) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6102");
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
        java.lang.Boolean boolean19 = org.apache.commons.lang.BooleanUtils.xor(booleanArray2);
        java.lang.Boolean boolean20 = org.apache.commons.lang.BooleanUtils.xor(booleanArray2);
        java.lang.Class<?> wildcardClass21 = booleanArray2.getClass();
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
        org.junit.Assert.assertEquals("'" + boolean19 + "' != '" + false + "'", boolean19, false);
        org.junit.Assert.assertEquals("'" + boolean20 + "' != '" + false + "'", boolean20, false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6103");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (byte) 1, 35, 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test6104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6104");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("yes", "hi!", "hi!", "false");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6105");
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) (byte) -1, (-1), 35);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test6106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6106");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("on", "true", "no", "true");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6107");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) (byte) 100, (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6108");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 10, (java.lang.Integer) 52, (java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6109");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(100, 10, (int) (byte) 0, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6110");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("off", "false", "off", "yes");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
    }

    @Test
    public void test6111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6111");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, 0, (int) (short) -1, (int) 'a');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test6112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6112");
        java.lang.Boolean[] booleanArray5 = new java.lang.Boolean[] { true, true, true, false, false };
        java.lang.Boolean boolean6 = org.apache.commons.lang.BooleanUtils.xor(booleanArray5);
        java.lang.Boolean boolean7 = org.apache.commons.lang.BooleanUtils.xor(booleanArray5);
        java.lang.Boolean boolean8 = org.apache.commons.lang.BooleanUtils.xor(booleanArray5);
        java.lang.Boolean boolean9 = org.apache.commons.lang.BooleanUtils.xor(booleanArray5);
        java.lang.Boolean boolean10 = org.apache.commons.lang.BooleanUtils.xor(booleanArray5);
        java.lang.Boolean boolean11 = org.apache.commons.lang.BooleanUtils.xor(booleanArray5);
        java.lang.Boolean boolean12 = org.apache.commons.lang.BooleanUtils.xor(booleanArray5);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + false + "'", boolean6, false);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + false + "'", boolean7, false);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + false + "'", boolean8, false);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + false + "'", boolean9, false);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + false + "'", boolean10, false);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + false + "'", boolean11, false);
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + false + "'", boolean12, false);
    }

    @Test
    public void test6113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6113");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(100, 0, (int) (byte) 100, 35);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
    }

    @Test
    public void test6114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6114");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(false, (int) (byte) 100, 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test6115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6115");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 0, (java.lang.Integer) 100, (java.lang.Integer) (-1), (java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6116");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (short) -1, (-1), 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test6117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6117");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (byte) 100, (int) (short) 1, (int) '4', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6118");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) (byte) 0, 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6119");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("on", "on", "true", "hi!");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test6120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6120");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean(97, (int) (byte) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6121");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 97, (java.lang.Integer) 32, (java.lang.Integer) 0, (java.lang.Integer) 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6122");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("hi!", "", "hi!", "false");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
    }

    @Test
    public void test6123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6123");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, (int) (byte) 0, (int) '#', 32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test6124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6124");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) true, "on", "true", "no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "on" + "'", str4, "on");
    }

    @Test
    public void test6125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6125");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) false, "false", "", "off");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test6126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6126");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (byte) -1, 32, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test6127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6127");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean(1, (int) (byte) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6128");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean(97, 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6129");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) (byte) -1, (int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6130");
        boolean[] booleanArray5 = new boolean[] { false, false, false, true, false };
        boolean boolean6 = org.apache.commons.lang.BooleanUtils.xor(booleanArray5);
        boolean boolean7 = org.apache.commons.lang.BooleanUtils.xor(booleanArray5);
        boolean boolean8 = org.apache.commons.lang.BooleanUtils.xor(booleanArray5);
        boolean boolean9 = org.apache.commons.lang.BooleanUtils.xor(booleanArray5);
        boolean boolean10 = org.apache.commons.lang.BooleanUtils.xor(booleanArray5);
        boolean boolean11 = org.apache.commons.lang.BooleanUtils.xor(booleanArray5);
        boolean boolean12 = org.apache.commons.lang.BooleanUtils.xor(booleanArray5);
        boolean boolean13 = org.apache.commons.lang.BooleanUtils.xor(booleanArray5);
        boolean boolean14 = org.apache.commons.lang.BooleanUtils.xor(booleanArray5);
        java.lang.Class<?> wildcardClass15 = booleanArray5.getClass();
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, false, true, false]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6131");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (byte) 10, 97, 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test6132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6132");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("no", "no", "hi!", "on");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test6133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6133");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, (int) ' ', (int) (short) -1, (int) 'a');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test6134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6134");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (short) 10, (int) (byte) 1, 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test6135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6135");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(100, (int) (byte) 10, 32, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6136");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(0, 35, (int) 'a', (int) (short) 0);
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test6137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6137");
        boolean[] booleanArray3 = new boolean[] { true, true, false };
        boolean boolean4 = org.apache.commons.lang.BooleanUtils.xor(booleanArray3);
        boolean boolean5 = org.apache.commons.lang.BooleanUtils.xor(booleanArray3);
        boolean boolean6 = org.apache.commons.lang.BooleanUtils.xor(booleanArray3);
        java.lang.Class<?> wildcardClass7 = booleanArray3.getClass();
        org.junit.Assert.assertNotNull(booleanArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray3), "[true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test6138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6138");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("", "off", "", "");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
    }

    @Test
    public void test6139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6139");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("false", "false", "true", "");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test6140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6140");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 1, (java.lang.Integer) 0, (java.lang.Integer) 10, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6141");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) true, "on", "hi!", "no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "on" + "'", str4, "on");
    }

    @Test
    public void test6142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6142");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (byte) 0, (int) (byte) 1, 32, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6143");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) (byte) 0, (int) 'a', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6144");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) false, "off", "true", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "true" + "'", str4, "true");
    }

    @Test
    public void test6145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6145");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(1, (int) '4', 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6146");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, (-1), (int) (byte) -1, (int) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test6147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6147");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(true, 97, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test6148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6148");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean(100, (int) (byte) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6149");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 35, (java.lang.Integer) (-1), (java.lang.Integer) 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6150");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(32, (-1), (int) (short) 100, 32);
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test6151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6151");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) true, "no", "false", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "no" + "'", str4, "no");
    }

    @Test
    public void test6152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6152");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean(100, (int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6153");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (short) 10, (int) ' ', 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test6154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6154");
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
        boolean boolean19 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        boolean boolean20 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        boolean boolean21 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
        boolean boolean22 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test6155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6155");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (short) 1, 0, (int) (short) 1, 52);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
    }

    @Test
    public void test6156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6156");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (short) 0, 35, 10, (int) (byte) 0);
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test6157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6157");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 35, (java.lang.Integer) 0, (java.lang.Integer) (-1), (java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6158");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 32, (java.lang.Integer) 97, (java.lang.Integer) 32, (java.lang.Integer) (-1));
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
    }

    @Test
    public void test6159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6159");
        boolean[] booleanArray6 = new boolean[] { false, false, true, false, false, false };
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[false, false, true, false, false, false]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6160");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) false, "yes", "yes", "yes");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "yes" + "'", str4, "yes");
    }

    @Test
    public void test6161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6161");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(true, 32, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test6162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6162");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("", "", "false", "off");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test6163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6163");
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean(100, 100, 35);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test6164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6164");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("true", "", "no");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6165");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) true, "", "on", "off");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test6166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6166");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(false, (-1), 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test6167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6167");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(false, (int) (short) 10, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test6168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6168");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (byte) 1, 10, 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6169");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 52, (java.lang.Integer) 1, (java.lang.Integer) 32, (java.lang.Integer) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6170");
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean(100, (int) (short) 100, 97);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test6171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6171");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((-1), (int) '4', (int) (byte) 100, (int) (byte) -1);
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test6172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6172");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (short) 0, (int) (byte) 100, 32, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6173");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 52, (java.lang.Integer) 10, (java.lang.Integer) 0, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6174");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) false, "off", "no", "yes");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "no" + "'", str4, "no");
    }

    @Test
    public void test6175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6175");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(true, (int) (short) 100, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test6176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6176");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean(0, (int) '#', 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6177");
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((-1), (-1), (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test6178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6178");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 0, (java.lang.Integer) 35, (java.lang.Integer) 52, (java.lang.Integer) 0);
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test6179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6179");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean(1, (int) (short) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6180");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, 35, (int) (byte) 0, 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test6181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6181");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, (int) (short) 0, 100, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test6182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6182");
        boolean[] booleanArray5 = new boolean[] { false, true, false, true, true };
        boolean boolean6 = org.apache.commons.lang.BooleanUtils.xor(booleanArray5);
        boolean boolean7 = org.apache.commons.lang.BooleanUtils.xor(booleanArray5);
        boolean boolean8 = org.apache.commons.lang.BooleanUtils.xor(booleanArray5);
        java.lang.Class<?> wildcardClass9 = booleanArray5.getClass();
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, true, false, true, true]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test6183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6183");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("hi!", "hi!", "no", "on");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test6184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6184");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, (int) '4', (int) (byte) -1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test6185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6185");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(false, (int) (short) 100, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6186");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) (byte) 100, 97, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6187");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 0, (java.lang.Integer) 32, (java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6188");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(true, (-1), (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6189");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) ' ', (int) (byte) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6190");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (short) 1, 35, 0, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6191");
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
        boolean boolean17 = org.apache.commons.lang.BooleanUtils.xor(booleanArray4);
        boolean boolean18 = org.apache.commons.lang.BooleanUtils.xor(booleanArray4);
        boolean boolean19 = org.apache.commons.lang.BooleanUtils.xor(booleanArray4);
        boolean boolean20 = org.apache.commons.lang.BooleanUtils.xor(booleanArray4);
        boolean boolean21 = org.apache.commons.lang.BooleanUtils.xor(booleanArray4);
        boolean boolean22 = org.apache.commons.lang.BooleanUtils.xor(booleanArray4);
        boolean boolean23 = org.apache.commons.lang.BooleanUtils.xor(booleanArray4);
        boolean boolean24 = org.apache.commons.lang.BooleanUtils.xor(booleanArray4);
        boolean boolean25 = org.apache.commons.lang.BooleanUtils.xor(booleanArray4);
        boolean boolean26 = org.apache.commons.lang.BooleanUtils.xor(booleanArray4);
        java.lang.Class<?> wildcardClass27 = booleanArray4.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test6192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6192");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("true", "yes", "", "yes");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6193");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (short) 10, (int) '4', (int) (short) 10, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
    }

    @Test
    public void test6194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6194");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (short) 100, 52, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test6195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6195");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, 10, 10, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test6196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6196");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) '4', (int) (byte) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6197");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(true, (int) (short) 0, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test6198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6198");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (byte) -1, (int) (short) 10, (int) '#', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6199");
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test6200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6200");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 1, (java.lang.Integer) (-1), (java.lang.Integer) 32, (java.lang.Integer) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6201");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) ' ', 35, 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6202");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("off", "false", "on");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6203");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, 10, 0, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test6204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6204");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) (short) 1, 52, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6205");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean(52, 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6206");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 0, (java.lang.Integer) 97, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6207");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("false", "", "", "true");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6208");
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("", "true", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test6209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6209");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("false", "hi!", "false", "off");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
    }

    @Test
    public void test6210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6210");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(52, (int) (short) 10, 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6211");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean(32, (int) (byte) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6212");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, 1, (int) 'a', 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test6213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6213");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 0, (java.lang.Integer) 97, (java.lang.Integer) 0, (java.lang.Integer) 32);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
    }

    @Test
    public void test6214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6214");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(10, (int) ' ', 32, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6215");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(52, (int) (short) 10, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6216");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) (byte) 100, 35, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6217");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("true", "on", "no");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6218");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(true, (int) (short) -1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6219");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (byte) 0, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6220");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (short) 0, 100, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test6221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6221");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 32, (java.lang.Integer) 35, (java.lang.Integer) 32, (java.lang.Integer) 1);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
    }

    @Test
    public void test6222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6222");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) 'a', (int) (short) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6223");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("yes", "hi!", "false", "no");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6224");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(false, 35, 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test6225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6225");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean(97, (int) (short) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6226");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(0, (int) (short) 10, (int) (byte) 0, 0);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
    }

    @Test
    public void test6227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6227");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 0, (java.lang.Integer) 97, (java.lang.Integer) 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6228");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(true, 10, 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test6229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6229");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("", "hi!", "hi!", "");
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test6230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6230");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (short) 0, 52, (int) 'a', 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6231");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(52, (int) (short) 100, (int) (short) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6232");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, (int) (byte) 0, (int) (byte) 0, (int) ' ');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test6233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6233");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) (short) -1, 32, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6234");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (byte) 10, 100, 52, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6235");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 0, (java.lang.Integer) 35, (java.lang.Integer) 0, (java.lang.Integer) 1);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
    }

    @Test
    public void test6236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6236");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((-1), 1, (int) (short) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6237");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(true, 32, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test6238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6238");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (short) 10, (int) (byte) 0, (int) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test6239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6239");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, 97, 10, 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test6240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6240");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) ' ', (int) (byte) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6241");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(false, (int) (byte) 1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }
}

